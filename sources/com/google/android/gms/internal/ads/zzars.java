package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzars implements zzfnb {
    private final zzfle zza;
    private final zzflv zzb;
    private final zzasf zzc;
    private final zzarr zzd;
    private final zzarb zze;
    private final zzash zzf;
    private final zzarz zzg;
    private final zzarq zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzars(zzfle zzfleVar, zzflv zzflvVar, zzasf zzasfVar, zzarr zzarrVar, zzarb zzarbVar, zzash zzashVar, zzarz zzarzVar, zzarq zzarqVar) {
        this.zza = zzfleVar;
        this.zzb = zzflvVar;
        this.zzc = zzasfVar;
        this.zzd = zzarrVar;
        this.zze = zzarbVar;
        this.zzf = zzashVar;
        this.zzg = zzarzVar;
        this.zzh = zzarqVar;
    }

    private final Map zze() {
        HashMap hashMap = new HashMap();
        zzaos zzb = this.zzb.zzb();
        hashMap.put("v", this.zza.zzb());
        hashMap.put("gms", Boolean.valueOf(this.zza.zzc()));
        hashMap.put("int", zzb.zzh());
        hashMap.put("up", Boolean.valueOf(this.zzd.zza()));
        hashMap.put("t", new Throwable());
        zzarz zzarzVar = this.zzg;
        if (zzarzVar != null) {
            hashMap.put("tcq", Long.valueOf(zzarzVar.zzc()));
            hashMap.put("tpq", Long.valueOf(this.zzg.zzg()));
            hashMap.put("tcv", Long.valueOf(this.zzg.zzd()));
            hashMap.put("tpv", Long.valueOf(this.zzg.zzh()));
            hashMap.put("tchv", Long.valueOf(this.zzg.zzb()));
            hashMap.put("tphv", Long.valueOf(this.zzg.zzf()));
            hashMap.put("tcc", Long.valueOf(this.zzg.zza()));
            hashMap.put("tpc", Long.valueOf(this.zzg.zze()));
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzfnb
    public final Map zza() {
        Map zze = zze();
        zze.put("lts", Long.valueOf(this.zzc.zza()));
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfnb
    public final Map zzb() {
        Map zze = zze();
        zzaos zza = this.zzb.zza();
        zze.put("gai", Boolean.valueOf(this.zza.zzd()));
        zze.put("did", zza.zzg());
        zze.put("dst", Integer.valueOf(zza.zzal() - 1));
        zze.put("doo", Boolean.valueOf(zza.zzai()));
        zzarb zzarbVar = this.zze;
        if (zzarbVar != null) {
            zze.put("nt", Long.valueOf(zzarbVar.zza()));
        }
        zzash zzashVar = this.zzf;
        if (zzashVar != null) {
            zze.put("vs", Long.valueOf(zzashVar.zzc()));
            zze.put("vf", Long.valueOf(this.zzf.zzb()));
        }
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfnb
    public final Map zzc() {
        Map zze = zze();
        zzarq zzarqVar = this.zzh;
        if (zzarqVar != null) {
            zze.put("vst", zzarqVar.zza());
        }
        return zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(View view) {
        this.zzc.zzd(view);
    }
}
