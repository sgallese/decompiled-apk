package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdnq extends zzcse {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdfy zze;
    private final zzdde zzf;
    private final zzcwv zzg;
    private final zzcyc zzh;
    private final zzcsy zzi;
    private final zzbvt zzj;
    private final zzfln zzk;
    private final zzfbt zzl;
    private boolean zzm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdnq(zzcsd zzcsdVar, Context context, zzcfi zzcfiVar, zzdfy zzdfyVar, zzdde zzddeVar, zzcwv zzcwvVar, zzcyc zzcycVar, zzcsy zzcsyVar, zzfbe zzfbeVar, zzfln zzflnVar, zzfbt zzfbtVar) {
        super(zzcsdVar);
        String str;
        int i10;
        this.zzm = false;
        this.zzc = context;
        this.zze = zzdfyVar;
        this.zzd = new WeakReference(zzcfiVar);
        this.zzf = zzddeVar;
        this.zzg = zzcwvVar;
        this.zzh = zzcycVar;
        this.zzi = zzcsyVar;
        this.zzk = zzflnVar;
        zzbvp zzbvpVar = zzfbeVar.zzm;
        if (zzbvpVar != null) {
            str = zzbvpVar.zza;
        } else {
            str = "";
        }
        if (zzbvpVar != null) {
            i10 = zzbvpVar.zzb;
        } else {
            i10 = 1;
        }
        this.zzj = new zzbwn(str, i10);
        this.zzl = zzfbtVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcfi zzcfiVar = (zzcfi) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgD)).booleanValue()) {
                if (!this.zzm && zzcfiVar != null) {
                    zzcan.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdnp
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

    public final Bundle zza() {
        return this.zzh.zzb();
    }

    public final zzbvt zzc() {
        return this.zzj;
    }

    public final zzfbt zzd() {
        return this.zzl;
    }

    public final boolean zze() {
        return this.zzi.zzg();
    }

    public final boolean zzf() {
        return this.zzm;
    }

    public final boolean zzg() {
        zzcfi zzcfiVar = (zzcfi) this.zzd.get();
        if (zzcfiVar != null && !zzcfiVar.zzaB()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean zzh(boolean z10, Activity activity) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzaB)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzs.zzD(this.zzc)) {
                zzcaa.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzg.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzaC)).booleanValue()) {
                    this.zzk.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (this.zzm) {
            zzcaa.zzj("The rewarded ad have been showed.");
            this.zzg.zza(zzfdb.zzd(10, null, null));
            return false;
        }
        this.zzm = true;
        this.zzf.zzb();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.zzc;
        }
        try {
            this.zze.zza(z10, activity2, this.zzg);
            this.zzf.zza();
            return true;
        } catch (zzdfx e10) {
            this.zzg.zzc(e10);
            return false;
        }
    }
}
