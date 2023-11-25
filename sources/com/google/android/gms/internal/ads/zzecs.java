package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import androidx.core.app.m;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzecs extends zzbru {
    private final Context zza;
    private final zzdrh zzb;
    private final zzcaf zzc;
    private final zzech zzd;
    private final zzfgo zze;
    private String zzf;
    private String zzg;

    public zzecs(Context context, zzech zzechVar, zzcaf zzcafVar, zzdrh zzdrhVar, zzfgo zzfgoVar) {
        this.zza = context;
        this.zzb = zzdrhVar;
        this.zzc = zzcafVar;
        this.zzd = zzechVar;
        this.zze = zzfgoVar;
    }

    public static void zzc(Context context, zzdrh zzdrhVar, zzfgo zzfgoVar, zzech zzechVar, String str, String str2, Map map) {
        String str3;
        String zza;
        if (true != com.google.android.gms.ads.internal.zzt.zzo().zzx(context)) {
            str3 = "offline";
        } else {
            str3 = "online";
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzil)).booleanValue() && zzdrhVar != null) {
            zzdrg zza2 = zzdrhVar.zza();
            zza2.zzb("gqi", str);
            zza2.zzb("action", str2);
            zza2.zzb("device_connectivity", str3);
            zza2.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zza2.zzb((String) entry.getKey(), (String) entry.getValue());
            }
            zza = zza2.zzf();
        } else {
            zzfgn zzb = zzfgn.zzb(str2);
            zzb.zza("gqi", str);
            zzb.zza("device_connectivity", str3);
            zzb.zza("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            for (Map.Entry entry2 : map.entrySet()) {
                zzb.zza((String) entry2.getKey(), (String) entry2.getValue());
            }
            zza = zzfgoVar.zza(zzb);
        }
        zzechVar.zzd(new zzecj(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), str, zza, 2));
    }

    private static String zzo(int i10, String str) {
        Resources zzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
        if (zzd == null) {
            return str;
        }
        return zzd.getString(i10);
    }

    private final void zzp(String str, String str2, Map map) {
        zzc(this.zza, this.zzb, this.zze, this.zzd, str, str2, map);
    }

    private final void zzq() {
        try {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzs.zzw(this.zza).zzf(ObjectWrapper.wrap(this.zza), this.zzg, this.zzf)) {
                return;
            }
        } catch (RemoteException e10) {
            zzcaa.zzh("Failed to schedule offline notification poster.", e10);
        }
        this.zzd.zzc(this.zzf);
        zzp(this.zzf, "offline_notification_worker_not_scheduled", zzfug.zzd());
    }

    private final void zzr(final Activity activity, final com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        com.google.android.gms.ads.internal.zzt.zzp();
        if (!androidx.core.app.r.d(activity).a()) {
            if (Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                zzp(this.zzf, "asnpdi", zzfug.zzd());
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            AlertDialog.Builder zzH = com.google.android.gms.ads.internal.util.zzs.zzH(activity);
            zzH.setTitle(zzo(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzo(R.string.notifications_permission_confirm, "Allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeck
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    zzecs.this.zzd(activity, zzlVar, dialogInterface, i10);
                }
            }).setNegativeButton(zzo(R.string.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzecl
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    zzecs.this.zzj(zzlVar, dialogInterface, i10);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzecm
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    zzecs.this.zzk(zzlVar, dialogInterface);
                }
            });
            zzH.create().show();
            zzp(this.zzf, "rtsdi", zzfug.zzd());
            return;
        }
        zzq();
        zzs(activity, zzlVar);
    }

    private final void zzs(Activity activity, final com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        String zzo = zzo(R.string.offline_opt_in_confirmation, "You'll get a notification with the link when you're back online");
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder zzH = com.google.android.gms.ads.internal.util.zzs.zzH(activity);
        zzH.setMessage(zzo).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzecn
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                com.google.android.gms.ads.internal.overlay.zzl zzlVar2 = com.google.android.gms.ads.internal.overlay.zzl.this;
                if (zzlVar2 != null) {
                    zzlVar2.zzb();
                }
            }
        });
        AlertDialog create = zzH.create();
        create.show();
        Timer timer = new Timer();
        timer.schedule(new zzecr(this, create, timer, zzlVar), 3000L);
    }

    private static final PendingIntent zzt(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setClassName(context, AdService.CLASS_NAME);
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        return zzfon.zza(context, 0, intent, zzfon.zza | 1073741824, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(Activity activity, com.google.android.gms.ads.internal.overlay.zzl zzlVar, DialogInterface dialogInterface, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzp(this.zzf, "rtsdc", hashMap);
        activity.startActivity(com.google.android.gms.ads.internal.zzt.zzq().zzg(activity));
        zzq();
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (!stringExtra.equals("offline_notification_clicked") && !stringExtra.equals("offline_notification_dismissed")) {
            return;
        }
        String stringExtra2 = intent.getStringExtra("gws_query_id");
        String stringExtra3 = intent.getStringExtra("uri");
        boolean zzx = com.google.android.gms.ads.internal.zzt.zzo().zzx(this.zza);
        HashMap hashMap = new HashMap();
        char c10 = 2;
        if (stringExtra.equals("offline_notification_clicked")) {
            hashMap.put("offline_notification_action", "offline_notification_clicked");
            if (true == zzx) {
                c10 = 1;
            }
            hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
            hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
            try {
                Intent launchIntentForPackage = this.zza.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                if (launchIntentForPackage == null) {
                    launchIntentForPackage = new Intent("android.intent.action.VIEW");
                    launchIntentForPackage.setData(Uri.parse(stringExtra3));
                }
                launchIntentForPackage.addFlags(268435456);
                this.zza.startActivity(launchIntentForPackage);
                hashMap.put("olaa", "olas");
            } catch (ActivityNotFoundException unused) {
                hashMap.put("olaa", "olaf");
            }
        } else {
            hashMap.put("offline_notification_action", "offline_notification_dismissed");
        }
        zzp(stringExtra2, "offline_notification_action", hashMap);
        try {
            SQLiteDatabase writableDatabase = this.zzd.getWritableDatabase();
            if (c10 == 1) {
                this.zzd.zzg(writableDatabase, this.zzc, stringExtra2);
            } else {
                zzech.zzi(writableDatabase, stringExtra2);
            }
        } catch (SQLiteException e10) {
            zzcaa.zzg("Failed to get writable offline buffering database: ".concat(e10.toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzf(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (strArr[i10].equals("android.permission.POST_NOTIFICATIONS")) {
                zzecu zzecuVar = (zzecu) ObjectWrapper.unwrap(iObjectWrapper);
                Activity zza = zzecuVar.zza();
                com.google.android.gms.ads.internal.overlay.zzl zzb = zzecuVar.zzb();
                HashMap hashMap = new HashMap();
                if (iArr[i10] == 0) {
                    hashMap.put("dialog_action", "confirm");
                    zzq();
                    zzs(zza, zzb);
                } else {
                    hashMap.put("dialog_action", "dismiss");
                    if (zzb != null) {
                        zzb.zzb();
                    }
                }
                zzp(this.zzf, "asnpdc", hashMap);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzg(IObjectWrapper iObjectWrapper) {
        zzecu zzecuVar = (zzecu) ObjectWrapper.unwrap(iObjectWrapper);
        final Activity zza = zzecuVar.zza();
        final com.google.android.gms.ads.internal.overlay.zzl zzb = zzecuVar.zzb();
        this.zzf = zzecuVar.zzc();
        this.zzg = zzecuVar.zzd();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzie)).booleanValue()) {
            zzp(this.zzf, "dialog_impression", zzfug.zzd());
            com.google.android.gms.ads.internal.zzt.zzp();
            AlertDialog.Builder zzH = com.google.android.gms.ads.internal.util.zzs.zzH(zza);
            zzH.setTitle(zzo(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzo(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzo(R.string.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeco
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    zzecs.this.zzl(zza, zzb, dialogInterface, i10);
                }
            }).setNegativeButton(zzo(R.string.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzecp
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    zzecs.this.zzm(zzb, dialogInterface, i10);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzecq
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    zzecs.this.zzn(zzb, dialogInterface);
                }
            });
            zzH.create().show();
            return;
        }
        zzr(zza, zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzh() {
        zzech zzechVar = this.zzd;
        final zzcaf zzcafVar = this.zzc;
        zzechVar.zze(new zzffh() { // from class: com.google.android.gms.internal.ads.zzecd
            @Override // com.google.android.gms.internal.ads.zzffh
            public final Object zza(Object obj) {
                zzech.zzb(zzcaf.this, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzi(IObjectWrapper iObjectWrapper, String str, String str2) {
        String str3;
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        com.google.android.gms.ads.internal.zzt.zzq().zzh(context, "offline_notification_channel", "AdMob Offline Notifications");
        m.e x10 = new m.e(context, "offline_notification_channel").m(zzo(R.string.offline_notification_title, "View the ad you saved when you were offline")).l(zzo(R.string.offline_notification_text, "Tap to open ad")).g(true).o(zzt(context, "offline_notification_dismissed", str2, str)).k(zzt(context, "offline_notification_clicked", str2, str)).x(context.getApplicationInfo().icon);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap hashMap = new HashMap();
        try {
            notificationManager.notify(str2, 54321, x10.c());
            str3 = "offline_notification_impression";
        } catch (IllegalArgumentException e10) {
            hashMap.put("notification_not_shown_reason", e10.getMessage());
            str3 = "offline_notification_failed";
        }
        zzp(str2, str3, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(com.google.android.gms.ads.internal.overlay.zzl zzlVar, DialogInterface dialogInterface, int i10) {
        this.zzd.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzp(this.zzf, "rtsdc", hashMap);
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(com.google.android.gms.ads.internal.overlay.zzl zzlVar, DialogInterface dialogInterface) {
        this.zzd.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzp(this.zzf, "rtsdc", hashMap);
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzl(Activity activity, com.google.android.gms.ads.internal.overlay.zzl zzlVar, DialogInterface dialogInterface, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzp(this.zzf, "dialog_click", hashMap);
        zzr(activity, zzlVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(com.google.android.gms.ads.internal.overlay.zzl zzlVar, DialogInterface dialogInterface, int i10) {
        this.zzd.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzp(this.zzf, "dialog_click", hashMap);
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(com.google.android.gms.ads.internal.overlay.zzl zzlVar, DialogInterface dialogInterface) {
        this.zzd.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzp(this.zzf, "dialog_click", hashMap);
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }
}
