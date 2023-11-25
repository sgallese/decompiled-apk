package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgnd extends zzgrq implements zzgtb {
    private static final zzgnd zzb;
    private int zzd;
    private zzgrz zze = zzgrq.zzaN();

    static {
        zzgnd zzgndVar = new zzgnd();
        zzb = zzgndVar;
        zzgrq.zzaU(zzgnd.class, zzgndVar);
    }

    private zzgnd() {
    }

    public static zzgna zzd() {
        return (zzgna) zzb.zzaA();
    }

    public static zzgnd zzg(InputStream inputStream, zzgrc zzgrcVar) throws IOException {
        return (zzgnd) zzgrq.zzaH(zzb, inputStream, zzgrcVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzgnd zzgndVar, zzgnc zzgncVar) {
        zzgncVar.getClass();
        zzgrz zzgrzVar = zzgndVar.zze;
        if (!zzgrzVar.zzc()) {
            zzgndVar.zze = zzgrq.zzaO(zzgrzVar);
        }
        zzgndVar.zze.add(zzgncVar);
    }

    public final int zza() {
        return this.zze.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    zzgmz zzgmzVar = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgna(zzgmzVar);
                }
                return new zzgnd();
            }
            return zzgrq.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", zzgnc.class});
        }
        return (byte) 1;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzgnc zze(int i10) {
        return (zzgnc) this.zze.get(i10);
    }

    public final List zzh() {
        return this.zze;
    }
}
