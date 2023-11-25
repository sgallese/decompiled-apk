package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdep extends zzcse {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdde zze;
    private final zzdfy zzf;
    private final zzcsy zzg;
    private final zzfln zzh;
    private final zzcwv zzi;
    private final zzbzn zzj;
    private boolean zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdep(zzcsd zzcsdVar, Context context, zzcfi zzcfiVar, zzdde zzddeVar, zzdfy zzdfyVar, zzcsy zzcsyVar, zzfln zzflnVar, zzcwv zzcwvVar, zzbzn zzbznVar) {
        super(zzcsdVar);
        this.zzk = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzcfiVar);
        this.zze = zzddeVar;
        this.zzf = zzdfyVar;
        this.zzg = zzcsyVar;
        this.zzh = zzflnVar;
        this.zzi = zzcwvVar;
        this.zzj = zzbznVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcfi zzcfiVar = (zzcfi) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgD)).booleanValue()) {
                if (!this.zzk && zzcfiVar != null) {
                    zzcan.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdeo
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcfi.this.destroy();
                        }
                    });
                }
            } else if (zzcfiVar != null) {
                zzcfiVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final boolean zza() {
        return this.zzg.zzg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean zzc(boolean z10, Activity activity) {
        zzfbe zzD;
        this.zze.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzaB)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzs.zzD(this.zzc)) {
                zzcaa.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzi.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzaC)).booleanValue()) {
                    this.zzh.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        zzcfi zzcfiVar = (zzcfi) this.zzd.get();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzkC)).booleanValue() && zzcfiVar != null && (zzD = zzcfiVar.zzD()) != null && zzD.zzar && zzD.zzas != this.zzj.zzb()) {
            zzcaa.zzj("The interstitial consent form has been shown.");
            this.zzi.zza(zzfdb.zzd(12, "The consent form has already been shown.", null));
        } else {
            if (this.zzk) {
                zzcaa.zzj("The interstitial ad has been shown.");
                this.zzi.zza(zzfdb.zzd(10, null, null));
            }
            Activity activity2 = activity;
            if (!this.zzk) {
                if (activity == null) {
                    activity2 = this.zzc;
                }
                try {
                    this.zzf.zza(z10, activity2, this.zzi);
                    this.zze.zza();
                    this.zzk = true;
                    return true;
                } catch (zzdfx e10) {
                    this.zzi.zzc(e10);
                }
            }
        }
        return false;
    }
}
