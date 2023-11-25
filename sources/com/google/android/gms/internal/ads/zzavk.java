package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.MurmurHash3;
import java.io.UnsupportedEncodingException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzavk {
    public static int zza(String str) {
        byte[] bytes;
        try {
            bytes = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        return MurmurHash3.murmurhash3_x86_32(bytes, 0, bytes.length, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ee, code lost:
    
        if (true != r4) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00fe, code lost:
    
        if (true != r4) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0100, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0101, code lost:
    
        r4 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] zzb(java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavk.zzb(java.lang.String, boolean):java.lang.String[]");
    }
}
