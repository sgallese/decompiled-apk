package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzlj {
    static final Charset zza = Charset.forName("US-ASCII");
    static final Charset zzb = Charset.forName("UTF-8");
    static final Charset zzc = Charset.forName("ISO-8859-1");
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzke zzf;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        int i10 = zzke.zza;
        zzkc zzkcVar = new zzkc(bArr, 0, 0, false, null);
        try {
            zzkcVar.zza(0);
            zzf = zzkcVar;
        } catch (zzll e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int zza(boolean z10) {
        if (z10) {
            return 1231;
        }
        return 1237;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzc(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static String zzd(byte[] bArr) {
        return new String(bArr, zzb);
    }
}
