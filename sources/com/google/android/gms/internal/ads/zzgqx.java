package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzgqx extends zzgpx {
    private static final Logger zza = Logger.getLogger(zzgqx.class.getName());
    private static final boolean zzb = zzguu.zzA();
    public static final /* synthetic */ int zzf = 0;
    zzgqy zze;

    private zzgqx() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgqx(zzgqw zzgqwVar) {
    }

    public static int zzA(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        if ((i10 & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    public static int zzB(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            j10 >>>= 14;
            i10 += 2;
        }
        if ((j10 & (-16384)) != 0) {
            return i10 + 1;
        }
        return i10;
    }

    public static zzgqx zzC(byte[] bArr, int i10, int i11) {
        return new zzgqt(bArr, 0, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int zzw(int i10, zzgta zzgtaVar, zzgtt zzgttVar) {
        int zzat = ((zzgpr) zzgtaVar).zzat(zzgttVar);
        int zzA = zzA(i10 << 3);
        return zzA + zzA + zzat;
    }

    public static int zzx(int i10) {
        if (i10 >= 0) {
            return zzA(i10);
        }
        return 10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzy(zzgta zzgtaVar, zzgtt zzgttVar) {
        int zzat = ((zzgpr) zzgtaVar).zzat(zzgttVar);
        return zzA(zzat) + zzat;
    }

    public static int zzz(String str) {
        int length;
        try {
            length = zzguz.zze(str);
        } catch (zzguy unused) {
            length = str.getBytes(zzgsa.zzb).length;
        }
        return zzA(length) + length;
    }

    public final void zzD() {
        if (zzb() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzE(String str, zzguy zzguyVar) throws IOException {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzguyVar);
        byte[] bytes = str.getBytes(zzgsa.zzb);
        try {
            int length = bytes.length;
            zzs(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgqu(e10);
        }
    }

    public abstract void zzI() throws IOException;

    public abstract void zzJ(byte b10) throws IOException;

    public abstract void zzK(int i10, boolean z10) throws IOException;

    public abstract void zzL(int i10, zzgqi zzgqiVar) throws IOException;

    @Override // com.google.android.gms.internal.ads.zzgpx
    public abstract void zza(byte[] bArr, int i10, int i11) throws IOException;

    public abstract int zzb();

    public abstract void zzh(int i10, int i11) throws IOException;

    public abstract void zzi(int i10) throws IOException;

    public abstract void zzj(int i10, long j10) throws IOException;

    public abstract void zzk(long j10) throws IOException;

    public abstract void zzl(int i10, int i11) throws IOException;

    public abstract void zzm(int i10) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzn(int i10, zzgta zzgtaVar, zzgtt zzgttVar) throws IOException;

    public abstract void zzo(int i10, String str) throws IOException;

    public abstract void zzq(int i10, int i11) throws IOException;

    public abstract void zzr(int i10, int i11) throws IOException;

    public abstract void zzs(int i10) throws IOException;

    public abstract void zzt(int i10, long j10) throws IOException;

    public abstract void zzu(long j10) throws IOException;
}
