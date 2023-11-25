package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzdgf implements zzcsh {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzgzg zzd;
    private final zzdin zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdgf(Map map, Map map2, Map map3, zzgzg zzgzgVar, zzdin zzdinVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzgzgVar;
        this.zze = zzdinVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsh
    public final zzedn zza(int i10, String str) {
        zzedn zza;
        zzedn zzednVar = (zzedn) this.zza.get(str);
        if (zzednVar != null) {
            return zzednVar;
        }
        if (i10 != 1) {
            if (i10 != 4) {
                return null;
            }
            zzegb zzegbVar = (zzegb) this.zzc.get(str);
            if (zzegbVar != null) {
                return new zzedo(zzegbVar, new zzfqw() { // from class: com.google.android.gms.internal.ads.zzcsj
                    @Override // com.google.android.gms.internal.ads.zzfqw
                    public final Object apply(Object obj) {
                        return new zzcsl((List) obj);
                    }
                });
            }
            zzedn zzednVar2 = (zzedn) this.zzb.get(str);
            if (zzednVar2 == null) {
                return null;
            }
            return zzcsl.zza(zzednVar2);
        } else if (this.zze.zze() == null || (zza = ((zzcsh) this.zzd.zzb()).zza(i10, str)) == null) {
            return null;
        } else {
            return zzcsl.zza(zza);
        }
    }
}
