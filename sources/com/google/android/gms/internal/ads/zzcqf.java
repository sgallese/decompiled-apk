package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcqf extends zzcqc {
    private final Context zzc;
    private final View zzd;
    private final zzcfi zze;
    private final zzfbf zzf;
    private final zzcsc zzg;
    private final zzdin zzh;
    private final zzddy zzi;
    private final zzgyn zzj;
    private final Executor zzk;
    private com.google.android.gms.ads.internal.client.zzq zzl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcqf(zzcsd zzcsdVar, Context context, zzfbf zzfbfVar, View view, zzcfi zzcfiVar, zzcsc zzcscVar, zzdin zzdinVar, zzddy zzddyVar, zzgyn zzgynVar, Executor executor) {
        super(zzcsdVar);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzcfiVar;
        this.zzf = zzfbfVar;
        this.zzg = zzcscVar;
        this.zzh = zzdinVar;
        this.zzi = zzddyVar;
        this.zzj = zzgynVar;
        this.zzk = executor;
    }

    public static /* synthetic */ void zzi(zzcqf zzcqfVar) {
        zzdin zzdinVar = zzcqfVar.zzh;
        if (zzdinVar.zze() == null) {
            return;
        }
        try {
            zzdinVar.zze().zze((com.google.android.gms.ads.internal.client.zzbu) zzcqfVar.zzj.zzb(), ObjectWrapper.wrap(zzcqfVar.zzc));
        } catch (RemoteException e10) {
            zzcaa.zzh("RemoteException when notifyAdLoad is called", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcqc
    public final int zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhx)).booleanValue() && this.zzb.zzah) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhy)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcqc
    public final View zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcqc
    public final com.google.android.gms.ads.internal.client.zzdq zzd() {
        try {
            return this.zzg.zza();
        } catch (zzfcf unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcqc
    public final zzfbf zze() {
        com.google.android.gms.ads.internal.client.zzq zzqVar = this.zzl;
        if (zzqVar != null) {
            return zzfce.zzb(zzqVar);
        }
        zzfbe zzfbeVar = this.zzb;
        if (zzfbeVar.zzad) {
            for (String str : zzfbeVar.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            return new zzfbf(this.zzd.getWidth(), this.zzd.getHeight(), false);
        }
        return (zzfbf) this.zzb.zzs.get(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcqc
    public final zzfbf zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcqc
    public final void zzg() {
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcqc
    public final void zzh(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar) {
        zzcfi zzcfiVar;
        if (viewGroup != null && (zzcfiVar = this.zze) != null) {
            zzcfiVar.zzag(zzcgx.zzc(zzqVar));
            viewGroup.setMinimumHeight(zzqVar.zzc);
            viewGroup.setMinimumWidth(zzqVar.zzf);
            this.zzl = zzqVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcse
    public final void zzj() {
        this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqe
            @Override // java.lang.Runnable
            public final void run() {
                zzcqf.zzi(zzcqf.this);
            }
        });
        super.zzj();
    }
}
