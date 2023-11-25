package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgys implements zzgzg, zzgyn {
    private static final Object zza = new Object();
    private volatile zzgzg zzb;
    private volatile Object zzc = zza;

    private zzgys(zzgzg zzgzgVar) {
        this.zzb = zzgzgVar;
    }

    public static zzgyn zza(zzgzg zzgzgVar) {
        if (zzgzgVar instanceof zzgyn) {
            return (zzgyn) zzgzgVar;
        }
        zzgzgVar.getClass();
        return new zzgys(zzgzgVar);
    }

    public static zzgzg zzc(zzgzg zzgzgVar) {
        if (zzgzgVar instanceof zzgys) {
            return zzgzgVar;
        }
        return new zzgys(zzgzgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        Object obj = this.zzc;
        Object obj2 = zza;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.zzc;
                if (obj == obj2) {
                    obj = this.zzb.zzb();
                    Object obj3 = this.zzc;
                    if (obj3 != obj2 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.zzc = obj;
                    this.zzb = null;
                }
            }
        }
        return obj;
    }
}
