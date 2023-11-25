package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzahr {
    private final zzahs zza = new zzahs();
    private final zzfb zzb = new zzfb(new byte[65025], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    private final int zzf(int i10) {
        int i11;
        int i12 = 0;
        this.zzd = 0;
        do {
            int i13 = this.zzd;
            int i14 = i10 + i13;
            zzahs zzahsVar = this.zza;
            if (i14 >= zzahsVar.zzc) {
                break;
            }
            int[] iArr = zzahsVar.zzf;
            this.zzd = i13 + 1;
            i11 = iArr[i14];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public final zzfb zza() {
        return this.zzb;
    }

    public final zzahs zzb() {
        return this.zza;
    }

    public final void zzc() {
        this.zza.zza();
        this.zzb.zzD(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final void zzd() {
        zzfb zzfbVar = this.zzb;
        if (zzfbVar.zzI().length == 65025) {
            return;
        }
        zzfbVar.zzE(Arrays.copyOf(zzfbVar.zzI(), Math.max(65025, zzfbVar.zzd())), this.zzb.zzd());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zze(com.google.android.gms.internal.ads.zzabc r7) throws java.io.IOException {
        /*
            r6 = this;
            boolean r0 = r6.zze
            r1 = 0
            if (r0 != 0) goto L6
            goto Ld
        L6:
            r6.zze = r1
            com.google.android.gms.internal.ads.zzfb r0 = r6.zzb
            r0.zzD(r1)
        Ld:
            boolean r0 = r6.zze
            r2 = 1
            if (r0 != 0) goto L99
            int r0 = r6.zzc
            if (r0 >= 0) goto L4e
            com.google.android.gms.internal.ads.zzahs r0 = r6.zza
            r3 = -1
            boolean r0 = r0.zzc(r7, r3)
            if (r0 == 0) goto L4d
            com.google.android.gms.internal.ads.zzahs r0 = r6.zza
            boolean r0 = r0.zzb(r7, r2)
            if (r0 != 0) goto L29
            goto L4d
        L29:
            com.google.android.gms.internal.ads.zzahs r0 = r6.zza
            int r3 = r0.zzd
            int r0 = r0.zza
            r0 = r0 & r2
            if (r0 != r2) goto L42
            com.google.android.gms.internal.ads.zzfb r0 = r6.zzb
            int r0 = r0.zzd()
            if (r0 != 0) goto L42
            int r0 = r6.zzf(r1)
            int r3 = r3 + r0
            int r0 = r6.zzd
            goto L43
        L42:
            r0 = 0
        L43:
            boolean r3 = com.google.android.gms.internal.ads.zzabf.zze(r7, r3)
            if (r3 != 0) goto L4a
            return r1
        L4a:
            r6.zzc = r0
            goto L4e
        L4d:
            return r1
        L4e:
            int r0 = r6.zzf(r0)
            int r3 = r6.zzc
            int r4 = r6.zzd
            int r3 = r3 + r4
            if (r0 <= 0) goto L8e
            com.google.android.gms.internal.ads.zzfb r4 = r6.zzb
            int r5 = r4.zzd()
            int r5 = r5 + r0
            r4.zzA(r5)
            com.google.android.gms.internal.ads.zzfb r4 = r6.zzb
            byte[] r5 = r4.zzI()
            int r4 = r4.zzd()
            boolean r4 = com.google.android.gms.internal.ads.zzabf.zzd(r7, r5, r4, r0)
            if (r4 != 0) goto L74
            return r1
        L74:
            com.google.android.gms.internal.ads.zzfb r4 = r6.zzb
            int r5 = r4.zzd()
            int r5 = r5 + r0
            r4.zzF(r5)
            com.google.android.gms.internal.ads.zzahs r0 = r6.zza
            int[] r0 = r0.zzf
            int r4 = r3 + (-1)
            r0 = r0[r4]
            r4 = 255(0xff, float:3.57E-43)
            if (r0 == r4) goto L8b
            goto L8c
        L8b:
            r2 = 0
        L8c:
            r6.zze = r2
        L8e:
            com.google.android.gms.internal.ads.zzahs r0 = r6.zza
            int r0 = r0.zzc
            if (r3 != r0) goto L95
            r3 = -1
        L95:
            r6.zzc = r3
            goto Ld
        L99:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahr.zze(com.google.android.gms.internal.ads.zzabc):boolean");
    }
}
