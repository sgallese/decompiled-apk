package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzacm implements zzabb {
    public static final zzabi zza = new zzabi() { // from class: com.google.android.gms.internal.ads.zzacl
        @Override // com.google.android.gms.internal.ads.zzabi
        public final /* synthetic */ zzabb[] zza(Uri uri, Map map) {
            int i10 = zzabh.zza;
            return new zzabb[]{new zzacm(0)};
        }
    };
    private static final int[] zzb = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final int zzf;
    private final byte[] zzg;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private zzabe zzp;
    private zzace zzq;
    private zzaca zzr;
    private boolean zzs;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        zzc = iArr;
        int i10 = zzfk.zza;
        Charset charset = zzfqu.zzc;
        zzd = "#!AMR\n".getBytes(charset);
        zze = "#!AMR-WB\n".getBytes(charset);
        zzf = iArr[8];
    }

    public zzacm(int i10) {
        this.zzg = new byte[1];
        this.zzm = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a A[Catch: EOFException -> 0x00b5, TryCatch #0 {EOFException -> 0x00b5, blocks: (B:5:0x0008, B:7:0x001c, B:21:0x003a, B:23:0x0043, B:22:0x003f, B:40:0x0081, B:41:0x009e, B:42:0x009f, B:43:0x00b4), top: B:45:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f A[Catch: EOFException -> 0x00b5, TryCatch #0 {EOFException -> 0x00b5, blocks: (B:5:0x0008, B:7:0x001c, B:21:0x003a, B:23:0x0043, B:22:0x003f, B:40:0x0081, B:41:0x009e, B:42:0x009f, B:43:0x00b4), top: B:45:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zze(com.google.android.gms.internal.ads.zzabc r12) throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.zzk
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L8
            goto L55
        L8:
            r12.zzj()     // Catch: java.io.EOFException -> Lb5
            byte[] r0 = r11.zzg     // Catch: java.io.EOFException -> Lb5
            r4 = r12
            com.google.android.gms.internal.ads.zzaar r4 = (com.google.android.gms.internal.ads.zzaar) r4     // Catch: java.io.EOFException -> Lb5
            r4.zzm(r0, r3, r2, r3)     // Catch: java.io.EOFException -> Lb5
            byte[] r0 = r11.zzg     // Catch: java.io.EOFException -> Lb5
            r0 = r0[r3]     // Catch: java.io.EOFException -> Lb5
            r4 = r0 & 131(0x83, float:1.84E-43)
            r5 = 0
            if (r4 > 0) goto L9f
            int r0 = r0 >> 3
            boolean r4 = r11.zzh     // Catch: java.io.EOFException -> Lb5
            r0 = r0 & 15
            if (r4 == 0) goto L2d
            r6 = 10
            if (r0 < r6) goto L38
            r6 = 13
            if (r0 <= r6) goto L2d
            goto L38
        L2d:
            if (r4 != 0) goto L7a
            r6 = 12
            if (r0 < r6) goto L38
            r6 = 14
            if (r0 > r6) goto L38
            goto L7a
        L38:
            if (r4 == 0) goto L3f
            int[] r4 = com.google.android.gms.internal.ads.zzacm.zzc     // Catch: java.io.EOFException -> Lb5
            r0 = r4[r0]     // Catch: java.io.EOFException -> Lb5
            goto L43
        L3f:
            int[] r4 = com.google.android.gms.internal.ads.zzacm.zzb     // Catch: java.io.EOFException -> Lb5
            r0 = r4[r0]     // Catch: java.io.EOFException -> Lb5
        L43:
            r11.zzj = r0     // Catch: java.io.EOFException -> Lb5
            r11.zzk = r0
            int r4 = r11.zzm
            if (r4 != r1) goto L4e
            r11.zzm = r0
            r4 = r0
        L4e:
            if (r4 != r0) goto L55
            int r4 = r11.zzn
            int r4 = r4 + r2
            r11.zzn = r4
        L55:
            com.google.android.gms.internal.ads.zzace r4 = r11.zzq
            int r12 = com.google.android.gms.internal.ads.zzacc.zza(r4, r12, r0, r2)
            if (r12 != r1) goto L5e
            return r1
        L5e:
            int r0 = r11.zzk
            int r0 = r0 - r12
            r11.zzk = r0
            if (r0 <= 0) goto L66
            return r3
        L66:
            com.google.android.gms.internal.ads.zzace r4 = r11.zzq
            long r5 = r11.zzi
            r7 = 1
            int r8 = r11.zzj
            r9 = 0
            r10 = 0
            r4.zzs(r5, r7, r8, r9, r10)
            long r0 = r11.zzi
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r4
            r11.zzi = r0
            return r3
        L7a:
            java.lang.String r12 = "WB"
            java.lang.String r3 = "NB"
            if (r2 == r4) goto L81
            r12 = r3
        L81:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> Lb5
            r2.<init>()     // Catch: java.io.EOFException -> Lb5
            java.lang.String r3 = "Illegal AMR "
            r2.append(r3)     // Catch: java.io.EOFException -> Lb5
            r2.append(r12)     // Catch: java.io.EOFException -> Lb5
            java.lang.String r12 = " frame type "
            r2.append(r12)     // Catch: java.io.EOFException -> Lb5
            r2.append(r0)     // Catch: java.io.EOFException -> Lb5
            java.lang.String r12 = r2.toString()     // Catch: java.io.EOFException -> Lb5
            com.google.android.gms.internal.ads.zzcd r12 = com.google.android.gms.internal.ads.zzcd.zza(r12, r5)     // Catch: java.io.EOFException -> Lb5
            throw r12     // Catch: java.io.EOFException -> Lb5
        L9f:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> Lb5
            r12.<init>()     // Catch: java.io.EOFException -> Lb5
            java.lang.String r2 = "Invalid padding bits for frame header "
            r12.append(r2)     // Catch: java.io.EOFException -> Lb5
            r12.append(r0)     // Catch: java.io.EOFException -> Lb5
            java.lang.String r12 = r12.toString()     // Catch: java.io.EOFException -> Lb5
            com.google.android.gms.internal.ads.zzcd r12 = com.google.android.gms.internal.ads.zzcd.zza(r12, r5)     // Catch: java.io.EOFException -> Lb5
            throw r12     // Catch: java.io.EOFException -> Lb5
        Lb5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacm.zze(com.google.android.gms.internal.ads.zzabc):int");
    }

    private static boolean zzf(zzabc zzabcVar, byte[] bArr) throws IOException {
        zzabcVar.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((zzaar) zzabcVar).zzm(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean zzg(zzabc zzabcVar) throws IOException {
        byte[] bArr = zzd;
        if (zzf(zzabcVar, bArr)) {
            this.zzh = false;
            ((zzaar) zzabcVar).zzo(bArr.length, false);
            return true;
        }
        byte[] bArr2 = zze;
        if (!zzf(zzabcVar, bArr2)) {
            return false;
        }
        this.zzh = true;
        ((zzaar) zzabcVar).zzo(bArr2.length, false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabcVar, zzabx zzabxVar) throws IOException {
        String str;
        int i10;
        zzdy.zzb(this.zzq);
        int i11 = zzfk.zza;
        if (zzabcVar.zzf() == 0 && !zzg(zzabcVar)) {
            throw zzcd.zza("Could not find AMR header.", null);
        }
        if (!this.zzs) {
            this.zzs = true;
            boolean z10 = this.zzh;
            if (true != z10) {
                str = "audio/3gpp";
            } else {
                str = "audio/amr-wb";
            }
            if (true != z10) {
                i10 = 8000;
            } else {
                i10 = 16000;
            }
            zzace zzaceVar = this.zzq;
            zzak zzakVar = new zzak();
            zzakVar.zzS(str);
            zzakVar.zzL(zzf);
            zzakVar.zzw(1);
            zzakVar.zzT(i10);
            zzaceVar.zzk(zzakVar.zzY());
        }
        int zze2 = zze(zzabcVar);
        if (this.zzl) {
            return zze2;
        }
        zzabz zzabzVar = new zzabz(-9223372036854775807L, 0L);
        this.zzr = zzabzVar;
        this.zzp.zzN(zzabzVar);
        this.zzl = true;
        return zze2;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabeVar) {
        this.zzp = zzabeVar;
        this.zzq = zzabeVar.zzv(0, 1);
        zzabeVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long j10, long j11) {
        this.zzi = 0L;
        this.zzj = 0;
        this.zzk = 0;
        this.zzo = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabcVar) throws IOException {
        return zzg(zzabcVar);
    }

    public zzacm() {
        this(0);
    }
}
