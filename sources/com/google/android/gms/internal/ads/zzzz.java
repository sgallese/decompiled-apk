package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzzz {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static zzzy zza(byte[] bArr) throws zzcd {
        return zzb(new zzfa(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b5, code lost:
    
        if (r11 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzzy zzb(com.google.android.gms.internal.ads.zzfa r11, boolean r12) throws com.google.android.gms.internal.ads.zzcd {
        /*
            int r0 = zzc(r11)
            int r1 = zzd(r11)
            r2 = 4
            int r3 = r11.zzd(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "mp4a.40."
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r5 = 5
            r6 = 22
            if (r0 == r5) goto L27
            r5 = 29
            if (r0 != r5) goto L35
        L27:
            int r1 = zzd(r11)
            int r0 = zzc(r11)
            if (r0 != r6) goto L35
            int r3 = r11.zzd(r2)
        L35:
            if (r12 == 0) goto Ld5
            r12 = 17
            r5 = 6
            r7 = 1
            r8 = 2
            r9 = 3
            if (r0 == r7) goto L65
            if (r0 == r8) goto L65
            if (r0 == r9) goto L65
            if (r0 == r2) goto L65
            if (r0 == r5) goto L65
            r2 = 7
            if (r0 == r2) goto L65
            if (r0 == r12) goto L65
            switch(r0) {
                case 19: goto L65;
                case 20: goto L65;
                case 21: goto L65;
                case 22: goto L65;
                case 23: goto L65;
                default: goto L4f;
            }
        L4f:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Unsupported audio object type: "
            r11.append(r12)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            com.google.android.gms.internal.ads.zzcd r11 = com.google.android.gms.internal.ads.zzcd.zzc(r11)
            throw r11
        L65:
            boolean r2 = r11.zzn()
            if (r2 == 0) goto L72
            java.lang.String r2 = "AacUtil"
            java.lang.String r10 = "Unexpected frameLengthFlag = 1"
            com.google.android.gms.internal.ads.zzes.zzf(r2, r10)
        L72:
            boolean r2 = r11.zzn()
            if (r2 == 0) goto L7d
            r2 = 14
            r11.zzl(r2)
        L7d:
            boolean r2 = r11.zzn()
            if (r3 == 0) goto Lcf
            r10 = 20
            if (r0 == r5) goto L8b
            if (r0 != r10) goto L8e
            r0 = 20
        L8b:
            r11.zzl(r9)
        L8e:
            if (r2 == 0) goto Lab
            if (r0 != r6) goto L98
            r2 = 16
            r11.zzl(r2)
            goto L99
        L98:
            r6 = r0
        L99:
            if (r6 == r12) goto La5
            r12 = 19
            if (r6 == r12) goto La5
            if (r6 == r10) goto La5
            r12 = 23
            if (r6 != r12) goto La8
        La5:
            r11.zzl(r9)
        La8:
            r11.zzl(r7)
        Lab:
            switch(r0) {
                case 17: goto Laf;
                case 18: goto Lae;
                case 19: goto Laf;
                case 20: goto Laf;
                case 21: goto Laf;
                case 22: goto Laf;
                case 23: goto Laf;
                default: goto Lae;
            }
        Lae:
            goto Ld5
        Laf:
            int r11 = r11.zzd(r8)
            if (r11 == r8) goto Lb8
            if (r11 == r9) goto Lb9
            goto Ld5
        Lb8:
            r9 = r11
        Lb9:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Unsupported epConfig: "
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            com.google.android.gms.internal.ads.zzcd r11 = com.google.android.gms.internal.ads.zzcd.zzc(r11)
            throw r11
        Lcf:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            r11.<init>()
            throw r11
        Ld5:
            int[] r11 = com.google.android.gms.internal.ads.zzzz.zzc
            r11 = r11[r3]
            r12 = -1
            r0 = 0
            if (r11 == r12) goto Le3
            com.google.android.gms.internal.ads.zzzy r12 = new com.google.android.gms.internal.ads.zzzy
            r12.<init>(r1, r11, r4, r0)
            return r12
        Le3:
            com.google.android.gms.internal.ads.zzcd r11 = com.google.android.gms.internal.ads.zzcd.zza(r0, r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzz.zzb(com.google.android.gms.internal.ads.zzfa, boolean):com.google.android.gms.internal.ads.zzzy");
    }

    private static int zzc(zzfa zzfaVar) {
        int zzd = zzfaVar.zzd(5);
        if (zzd == 31) {
            return zzfaVar.zzd(6) + 32;
        }
        return zzd;
    }

    private static int zzd(zzfa zzfaVar) throws zzcd {
        int zzd = zzfaVar.zzd(4);
        if (zzd == 15) {
            if (zzfaVar.zza() >= 24) {
                return zzfaVar.zzd(24);
            }
            throw zzcd.zza("AAC header insufficient data", null);
        } else if (zzd < 13) {
            return zzb[zzd];
        } else {
            throw zzcd.zza("AAC header wrong Sampling Frequency Index", null);
        }
    }
}
