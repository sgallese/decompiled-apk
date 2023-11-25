package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzei extends zzlb implements zzmj {
    private static final zzei zza;
    private int zzd;
    private int zze;
    private zzli zzf = zzlb.zzbH();
    private zzli zzg = zzlb.zzbH();
    private boolean zzh;
    private boolean zzi;

    static {
        zzei zzeiVar = new zzei();
        zza = zzeiVar;
        zzlb.zzbO(zzei.class, zzeiVar);
    }

    private zzei() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzei zzeiVar, int i10, zzet zzetVar) {
        zzetVar.getClass();
        zzli zzliVar = zzeiVar.zzf;
        if (!zzliVar.zzc()) {
            zzeiVar.zzf = zzlb.zzbI(zzliVar);
        }
        zzeiVar.zzf.set(i10, zzetVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzei zzeiVar, int i10, zzek zzekVar) {
        zzekVar.getClass();
        zzli zzliVar = zzeiVar.zzg;
        if (!zzliVar.zzc()) {
            zzeiVar.zzg = zzlb.zzbI(zzliVar);
        }
        zzeiVar.zzg.set(i10, zzekVar);
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzg.size();
    }

    public final int zzc() {
        return this.zzf.size();
    }

    public final zzek zze(int i10) {
        return (zzek) this.zzg.get(i10);
    }

    public final zzet zzf(int i10) {
        return (zzet) this.zzf.get(i10);
    }

    public final List zzg() {
        return this.zzg;
    }

    public final List zzh() {
        return this.zzf;
    }

    public final boolean zzk() {
        if ((this.zzd & 1) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzeg zzegVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzeh(zzegVar);
                }
                return new zzei();
            }
            return zzlb.zzbL(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzd", "zze", "zzf", zzet.class, "zzg", zzek.class, "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
