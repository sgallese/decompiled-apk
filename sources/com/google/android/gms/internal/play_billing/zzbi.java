package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes3.dex */
public abstract class zzbi extends zzaq {
    public static final /* synthetic */ int zzb = 0;
    private static final Logger zzc = Logger.getLogger(zzbi.class.getName());
    private static final boolean zzd = zzeq.zzx();
    zzbj zza;

    private zzbi() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbi(zzbh zzbhVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int zzt(int i10, zzdf zzdfVar, zzdp zzdpVar) {
        int zza = ((zzak) zzdfVar).zza(zzdpVar);
        int zzx = zzx(i10 << 3);
        return zzx + zzx + zza;
    }

    public static int zzu(int i10) {
        if (i10 >= 0) {
            return zzx(i10);
        }
        return 10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzv(zzdf zzdfVar, zzdp zzdpVar) {
        int zza = ((zzak) zzdfVar).zza(zzdpVar);
        return zzx(zza) + zza;
    }

    public static int zzw(String str) {
        int length;
        try {
            length = zzev.zzc(str);
        } catch (zzeu unused) {
            length = str.getBytes(zzcg.zzb).length;
        }
        return zzx(length) + length;
    }

    public static int zzx(int i10) {
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

    public static int zzy(long j10) {
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

    public static zzbi zzz(byte[] bArr, int i10, int i11) {
        return new zzbf(bArr, 0, i11);
    }

    public final void zzA() {
        if (zza() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzB(String str, zzeu zzeuVar) throws IOException {
        zzc.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzeuVar);
        byte[] bytes = str.getBytes(zzcg.zzb);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzbg(e10);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b10) throws IOException;

    public abstract void zzd(int i10, boolean z10) throws IOException;

    public abstract void zze(int i10, zzba zzbaVar) throws IOException;

    public abstract void zzf(int i10, int i11) throws IOException;

    public abstract void zzg(int i10) throws IOException;

    public abstract void zzh(int i10, long j10) throws IOException;

    public abstract void zzi(long j10) throws IOException;

    public abstract void zzj(int i10, int i11) throws IOException;

    public abstract void zzk(int i10) throws IOException;

    public abstract void zzl(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void zzm(int i10, String str) throws IOException;

    public abstract void zzo(int i10, int i11) throws IOException;

    public abstract void zzp(int i10, int i11) throws IOException;

    public abstract void zzq(int i10) throws IOException;

    public abstract void zzr(int i10, long j10) throws IOException;

    public abstract void zzs(long j10) throws IOException;
}
