package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzoj {
    public static final zzoj zza = new zzoj(new int[]{2}, 10);
    private static final zzfud zzb = zzfud.zzo(2, 5, 6);
    private static final zzfug zzc;
    private final int[] zzd;
    private final int zze;

    static {
        zzfuf zzfufVar = new zzfuf();
        zzfufVar.zza(5, 6);
        zzfufVar.zza(17, 6);
        zzfufVar.zza(7, 6);
        zzfufVar.zza(30, 10);
        zzfufVar.zza(18, 6);
        zzfufVar.zza(6, 8);
        zzfufVar.zza(8, 8);
        zzfufVar.zza(14, 8);
        zzc = zzfufVar.zzc();
    }

    public zzoj(int[] iArr, int i10) {
        int[] copyOf = Arrays.copyOf(iArr, 1);
        this.zzd = copyOf;
        Arrays.sort(copyOf);
        this.zze = 10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zzoj) && Arrays.equals(this.zzd, ((zzoj) obj).zzd)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zzd) * 31) + 10;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=10, supportedEncodings=" + Arrays.toString(this.zzd) + "]";
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (zzc(30) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009e, code lost:
    
        if (r7 != 5) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair zza(com.google.android.gms.internal.ads.zzam r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.zzm
            r0.getClass()
            java.lang.String r1 = r10.zzj
            int r0 = com.google.android.gms.internal.ads.zzcc.zza(r0, r1)
            com.google.android.gms.internal.ads.zzfug r1 = com.google.android.gms.internal.ads.zzoj.zzc
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r2 = r1.containsKey(r2)
            r3 = 0
            if (r2 != 0) goto L19
            return r3
        L19:
            r2 = 7
            r4 = 6
            r5 = 8
            r6 = 18
            if (r0 != r6) goto L2b
            boolean r0 = r9.zzc(r6)
            if (r0 != 0) goto L29
            r0 = 6
            goto L43
        L29:
            r0 = 18
        L2b:
            if (r0 != r5) goto L38
            boolean r0 = r9.zzc(r5)
            if (r0 == 0) goto L36
            r0 = 8
            goto L38
        L36:
            r0 = 7
            goto L43
        L38:
            r7 = 30
            if (r0 != r7) goto L43
            boolean r7 = r9.zzc(r7)
            if (r7 != 0) goto L43
            goto L36
        L43:
            boolean r7 = r9.zzc(r0)
            if (r7 != 0) goto L4a
            return r3
        L4a:
            int r7 = r10.zzz
            r8 = -1
            if (r7 == r8) goto L64
            if (r0 != r6) goto L52
            goto L64
        L52:
            java.lang.String r10 = r10.zzm
            java.lang.String r1 = "audio/vnd.dts.uhd;profile=p2"
            boolean r10 = r10.equals(r1)
            r1 = 10
            if (r10 == 0) goto L61
            if (r7 <= r1) goto L8c
            return r3
        L61:
            if (r7 <= r1) goto L8c
            return r3
        L64:
            int r10 = r10.zzA
            if (r10 != r8) goto L6b
            r10 = 48000(0xbb80, float:6.7262E-41)
        L6b:
            int r6 = com.google.android.gms.internal.ads.zzfk.zza
            r7 = 29
            if (r6 < r7) goto L76
            int r7 = com.google.android.gms.internal.ads.zzoi.zza(r0, r10)
            goto L8c
        L76:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r10 = r1.getOrDefault(r10, r6)
            java.lang.Integer r10 = (java.lang.Integer) r10
            r10.getClass()
            int r7 = r10.intValue()
        L8c:
            int r10 = com.google.android.gms.internal.ads.zzfk.zza
            r1 = 28
            if (r10 > r1) goto La1
            if (r7 != r2) goto L97
            r4 = 8
            goto La2
        L97:
            r1 = 3
            if (r7 == r1) goto La2
            r1 = 4
            if (r7 == r1) goto La2
            r1 = 5
            if (r7 != r1) goto La1
            goto La2
        La1:
            r4 = r7
        La2:
            r1 = 26
            if (r10 > r1) goto Lb4
            java.lang.String r10 = "fugu"
            java.lang.String r1 = com.google.android.gms.internal.ads.zzfk.zzb
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto Lb4
            r10 = 1
            if (r4 != r10) goto Lb4
            r4 = 2
        Lb4:
            int r10 = com.google.android.gms.internal.ads.zzfk.zzg(r4)
            if (r10 != 0) goto Lbb
            return r3
        Lbb:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            android.util.Pair r10 = android.util.Pair.create(r0, r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzoj.zza(com.google.android.gms.internal.ads.zzam):android.util.Pair");
    }

    public final boolean zzc(int i10) {
        if (Arrays.binarySearch(this.zzd, i10) >= 0) {
            return true;
        }
        return false;
    }
}
