package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcwe implements zzgyt {
    private final zzcwd zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;

    public zzcwe(zzcwd zzcwdVar, zzgzg zzgzgVar, zzgzg zzgzgVar2, zzgzg zzgzgVar3, zzgzg zzgzgVar4) {
        this.zza = zzcwdVar;
        this.zzb = zzgzgVar;
        this.zzc = zzgzgVar2;
        this.zzd = zzgzgVar3;
        this.zze = zzgzgVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* synthetic */ Object zzb() {
        String str;
        Context context = (Context) this.zzb.zzb();
        zzcag zza = ((zzchv) this.zzc).zza();
        zzfbe zza2 = ((zzcsu) this.zzd).zza();
        zzbwx zzbwxVar = new zzbwx();
        if (zza2.zzB == null) {
            return null;
        }
        zzfbk zzfbkVar = zza2.zzt;
        if (zzfbkVar == null) {
            str = null;
        } else {
            str = zzfbkVar.zzb;
        }
        return new zzbww(context, zza, zza2.zzB, str, zzbwxVar);
    }
}
