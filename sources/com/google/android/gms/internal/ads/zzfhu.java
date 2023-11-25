package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfhu implements Runnable {
    public static Boolean zzb;
    private final Context zze;
    private final zzcag zzf;
    private int zzi;
    private final zzdoz zzj;
    private final List zzk;
    private final zzead zzm;
    private final zzbuz zzn;
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();
    private final zzfhz zzg = zzfic.zzc();
    private String zzh = "";
    private boolean zzl = false;

    public zzfhu(Context context, zzcag zzcagVar, zzdoz zzdozVar, zzead zzeadVar, zzbuz zzbuzVar) {
        this.zze = context;
        this.zzf = zzcagVar;
        this.zzj = zzdozVar;
        this.zzm = zzeadVar;
        this.zzn = zzbuzVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziv)).booleanValue()) {
            this.zzk = com.google.android.gms.ads.internal.util.zzs.zzd();
        } else {
            this.zzk = zzfud.zzl();
        }
    }

    public static boolean zza() {
        boolean booleanValue;
        boolean z10;
        synchronized (zza) {
            if (zzb == null) {
                if (!((Boolean) zzbdd.zzb.zze()).booleanValue()) {
                    zzb = Boolean.FALSE;
                } else {
                    if (Math.random() < ((Double) zzbdd.zza.zze()).doubleValue()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zzb = Boolean.valueOf(z10);
                }
            }
            booleanValue = zzb.booleanValue();
        }
        return booleanValue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] zzax;
        if (!zza()) {
            return;
        }
        Object obj = zzc;
        synchronized (obj) {
            if (this.zzg.zza() == 0) {
                return;
            }
            try {
                synchronized (obj) {
                    zzax = ((zzfic) this.zzg.zzal()).zzax();
                    this.zzg.zzc();
                }
                new zzeac(this.zze, this.zzf.zza, this.zzn, Binder.getCallingUid()).zza(new zzeaa((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzip), 60000, new HashMap(), zzax, "application/x-protobuf", false));
            } catch (Exception e10) {
                if ((e10 instanceof zzdve) && ((zzdve) e10).zza() == 3) {
                    return;
                }
                com.google.android.gms.ads.internal.zzt.zzo().zzt(e10, "CuiMonitor.sendCuiPing");
            }
        }
    }

    public final void zzb(final zzfhk zzfhkVar) {
        zzcan.zza.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfht
            @Override // java.lang.Runnable
            public final void run() {
                zzfhu.this.zzc(zzfhkVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzfhk zzfhkVar) {
        synchronized (zzd) {
            if (!this.zzl) {
                this.zzl = true;
                if (zza()) {
                    com.google.android.gms.ads.internal.zzt.zzp();
                    this.zzh = com.google.android.gms.ads.internal.util.zzs.zzn(this.zze);
                    this.zzi = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze);
                    long intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziq)).intValue();
                    zzcan.zzd.scheduleAtFixedRate(this, intValue, intValue, TimeUnit.MILLISECONDS);
                }
            }
        }
        if (!zza() || zzfhkVar == null) {
            return;
        }
        synchronized (zzc) {
            if (this.zzg.zza() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzir)).intValue()) {
                return;
            }
            zzfhw zza2 = zzfhx.zza();
            zza2.zzt(zzfhkVar.zzl());
            zza2.zzp(zzfhkVar.zzk());
            zza2.zzg(zzfhkVar.zzb());
            zza2.zzv(3);
            zza2.zzm(this.zzf.zza);
            zza2.zzb(this.zzh);
            zza2.zzk(Build.VERSION.RELEASE);
            zza2.zzq(Build.VERSION.SDK_INT);
            zza2.zzu(zzfhkVar.zzn());
            zza2.zzj(zzfhkVar.zza());
            zza2.zze(this.zzi);
            zza2.zzs(zzfhkVar.zzm());
            zza2.zzc(zzfhkVar.zzd());
            zza2.zzf(zzfhkVar.zzf());
            zza2.zzh(zzfhkVar.zzg());
            zza2.zzi(this.zzj.zzc(zzfhkVar.zzg()));
            zza2.zzl(zzfhkVar.zzh());
            zza2.zzd(zzfhkVar.zze());
            zza2.zzr(zzfhkVar.zzj());
            zza2.zzn(zzfhkVar.zzi());
            zza2.zzo(zzfhkVar.zzc());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziv)).booleanValue()) {
                zza2.zza(this.zzk);
            }
            zzfhz zzfhzVar = this.zzg;
            zzfia zza3 = zzfib.zza();
            zza3.zza(zza2);
            zzfhzVar.zzb(zza3);
        }
    }
}
