package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzabf {
    public static int zza(zzabc zzabcVar, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int zzb = zzabcVar.zzb(bArr, i10 + i12, i11 - i12);
            if (zzb == -1) {
                break;
            }
            i12 += zzb;
        }
        return i12;
    }

    public static void zzb(boolean z10, String str) throws zzcd {
        if (z10) {
            return;
        }
        throw zzcd.zza(str, null);
    }

    public static boolean zzc(zzabc zzabcVar, byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        try {
            return zzabcVar.zzm(bArr, 0, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static boolean zzd(zzabc zzabcVar, byte[] bArr, int i10, int i11) throws IOException {
        try {
            ((zzaar) zzabcVar).zzn(bArr, i10, i11, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzabc zzabcVar, int i10) throws IOException {
        try {
            ((zzaar) zzabcVar).zzo(i10, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
