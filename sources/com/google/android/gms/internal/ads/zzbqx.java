package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.R;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbqx extends zzbrf {
    private final Map zza;
    private final Context zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;
    private final String zzf;
    private final String zzg;

    public zzbqx(zzcfi zzcfiVar, Map map) {
        super(zzcfiVar, "createCalendarEvent");
        this.zza = map;
        this.zzb = zzcfiVar.zzi();
        this.zzc = zze("description");
        this.zzf = zze("summary");
        this.zzd = zzd("start_ticks");
        this.zze = zzd("end_ticks");
        this.zzg = zze("location");
    }

    private final long zzd(String str) {
        String str2 = (String) this.zza.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private final String zze(String str) {
        if (TextUtils.isEmpty((CharSequence) this.zza.get(str))) {
            return "";
        }
        return (String) this.zza.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Intent zzb() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.zzc);
        data.putExtra("eventLocation", this.zzg);
        data.putExtra("description", this.zzf);
        long j10 = this.zzd;
        if (j10 > -1) {
            data.putExtra("beginTime", j10);
        }
        long j11 = this.zze;
        if (j11 > -1) {
            data.putExtra("endTime", j11);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void zzc() {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.zzb == null) {
            zzg("Activity context is not available.");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        if (!new zzbbb(this.zzb).zzb()) {
            zzg("This feature is not available on the device.");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder zzH = com.google.android.gms.ads.internal.util.zzs.zzH(this.zzb);
        Resources zzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
        if (zzd != null) {
            str = zzd.getString(R.string.f9406s5);
        } else {
            str = "Create calendar event";
        }
        zzH.setTitle(str);
        if (zzd != null) {
            str2 = zzd.getString(R.string.f9407s6);
        } else {
            str2 = "Allow Ad to create a calendar event?";
        }
        zzH.setMessage(str2);
        if (zzd != null) {
            str3 = zzd.getString(R.string.f9404s3);
        } else {
            str3 = "Accept";
        }
        zzH.setPositiveButton(str3, new zzbqv(this));
        if (zzd != null) {
            str4 = zzd.getString(R.string.f9405s4);
        } else {
            str4 = "Decline";
        }
        zzH.setNegativeButton(str4, new zzbqw(this));
        zzH.create().show();
    }
}
