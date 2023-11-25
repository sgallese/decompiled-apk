package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.auth.api.credentials.CredentialsApi;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaaf {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {2002, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, RecyclerView.m.FLAG_MOVED};

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0094, code lost:
    
        if (r12 != 11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0099, code lost:
    
        if (r12 != 11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009e, code lost:
    
        if (r12 != 8) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzaae zza(com.google.android.gms.internal.ads.zzfa r12) {
        /*
            r0 = 16
            int r1 = r12.zzd(r0)
            int r0 = r12.zzd(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r12.zzd(r0)
            r2 = 7
            goto L19
        L18:
            r2 = 4
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r8 = r0
            r0 = 2
            int r1 = r12.zzd(r0)
            r2 = 0
            r4 = 3
            if (r1 != r4) goto L3d
            r1 = 0
        L2c:
            int r5 = r12.zzd(r0)
            int r1 = r1 + r5
            boolean r5 = r12.zzn()
            if (r5 != 0) goto L39
            int r1 = r1 + r4
            goto L3d
        L39:
            int r1 = r1 + 1
            int r1 = r1 << r0
            goto L2c
        L3d:
            r5 = r1
            r1 = 10
            int r1 = r12.zzd(r1)
            boolean r6 = r12.zzn()
            if (r6 == 0) goto L53
            int r6 = r12.zzd(r4)
            if (r6 <= 0) goto L53
            r12.zzl(r0)
        L53:
            boolean r6 = r12.zzn()
            r7 = 44100(0xac44, float:6.1797E-41)
            r9 = 48000(0xbb80, float:6.7262E-41)
            r10 = 1
            if (r10 == r6) goto L64
            r11 = 44100(0xac44, float:6.1797E-41)
            goto L67
        L64:
            r11 = 48000(0xbb80, float:6.7262E-41)
        L67:
            int r12 = r12.zzd(r3)
            if (r11 != r7) goto L77
            r6 = 13
            if (r12 != r6) goto L77
            int[] r12 = com.google.android.gms.internal.ads.zzaaf.zzb
            r12 = r12[r6]
            r9 = r12
            goto La7
        L77:
            if (r11 != r9) goto La6
            r6 = 14
            if (r12 >= r6) goto La6
            int[] r2 = com.google.android.gms.internal.ads.zzaaf.zzb
            r2 = r2[r12]
            int r1 = r1 % 5
            r6 = 8
            if (r1 == r10) goto L9c
            r7 = 11
            if (r1 == r0) goto L97
            if (r1 == r4) goto L9c
            if (r1 == r3) goto L90
            goto La1
        L90:
            if (r12 == r4) goto La3
            if (r12 == r6) goto La3
            if (r12 != r7) goto La1
            goto La3
        L97:
            if (r12 == r6) goto La3
            if (r12 != r7) goto La1
            goto La3
        L9c:
            if (r12 == r4) goto La3
            if (r12 != r6) goto La1
            goto La3
        La1:
            r9 = r2
            goto La7
        La3:
            int r2 = r2 + 1
            goto La1
        La6:
            r9 = 0
        La7:
            com.google.android.gms.internal.ads.zzaae r12 = new com.google.android.gms.internal.ads.zzaae
            r6 = 2
            r10 = 0
            r4 = r12
            r7 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaaf.zza(com.google.android.gms.internal.ads.zzfa):com.google.android.gms.internal.ads.zzaae");
    }

    public static void zzb(int i10, zzfb zzfbVar) {
        zzfbVar.zzD(7);
        byte[] zzI = zzfbVar.zzI();
        zzI[0] = -84;
        zzI[1] = 64;
        zzI[2] = -1;
        zzI[3] = -1;
        zzI[4] = (byte) ((i10 >> 16) & 255);
        zzI[5] = (byte) ((i10 >> 8) & 255);
        zzI[6] = (byte) (i10 & 255);
    }
}
