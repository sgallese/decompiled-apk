package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbmg implements zzbir {
    final /* synthetic */ zzblp zza;
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzca zzb;
    final /* synthetic */ zzbmu zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbmg(zzbmu zzbmuVar, zzaqx zzaqxVar, zzblp zzblpVar, com.google.android.gms.ads.internal.util.zzca zzcaVar) {
        this.zzc = zzbmuVar;
        this.zza = zzblpVar;
        this.zzb = zzcaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, com.google.android.gms.internal.ads.zzbir] */
    @Override // com.google.android.gms.internal.ads.zzbir
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        Object obj2;
        int i10;
        zzbmv zzbmvVar = (zzbmv) obj;
        obj2 = this.zzc.zza;
        synchronized (obj2) {
            zzcaa.zzi("JS Engine is requesting an update");
            i10 = this.zzc.zzi;
            if (i10 == 0) {
                zzcaa.zzi("Starting reload.");
                this.zzc.zzi = 2;
                this.zzc.zzd(null);
            }
            this.zza.zzr("/requestReload", this.zzb.zza());
        }
    }
}
