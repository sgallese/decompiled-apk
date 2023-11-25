package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public class zzgsg {
    private static final zzgrc zzb = zzgrc.zza;
    protected volatile zzgta zza;
    private volatile zzgqi zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgsg)) {
            return false;
        }
        zzgsg zzgsgVar = (zzgsg) obj;
        zzgta zzgtaVar = this.zza;
        zzgta zzgtaVar2 = zzgsgVar.zza;
        if (zzgtaVar == null && zzgtaVar2 == null) {
            return zzb().equals(zzgsgVar.zzb());
        }
        if (zzgtaVar != null && zzgtaVar2 != null) {
            return zzgtaVar.equals(zzgtaVar2);
        }
        if (zzgtaVar != null) {
            zzgsgVar.zzc(zzgtaVar.zzbf());
            return zzgtaVar.equals(zzgsgVar.zza);
        }
        zzc(zzgtaVar2.zzbf());
        return this.zza.equals(zzgtaVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzgqe) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzaz();
        }
        return 0;
    }

    public final zzgqi zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                return this.zzc;
            }
            if (this.zza == null) {
                this.zzc = zzgqi.zzb;
            } else {
                this.zzc = this.zza.zzau();
            }
            return this.zzc;
        }
    }

    protected final void zzc(zzgta zzgtaVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza == null) {
                try {
                    this.zza = zzgtaVar;
                    this.zzc = zzgqi.zzb;
                } catch (zzgsc unused) {
                    this.zza = zzgtaVar;
                    this.zzc = zzgqi.zzb;
                }
            }
        }
    }
}
