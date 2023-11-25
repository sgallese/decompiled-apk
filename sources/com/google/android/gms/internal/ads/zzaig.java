package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.Map;
import okhttp3.internal.http2.Http2;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaig implements zzabb {
    public static final zzabi zza = new zzabi() { // from class: com.google.android.gms.internal.ads.zzaif
        @Override // com.google.android.gms.internal.ads.zzabi
        public final /* synthetic */ zzabb[] zza(Uri uri, Map map) {
            int i10 = zzabh.zza;
            return new zzabb[]{new zzaig()};
        }
    };
    private final zzaih zzb = new zzaih(null);
    private final zzfb zzc = new zzfb((int) Http2.INITIAL_MAX_FRAME_SIZE);
    private boolean zzd;

    @Override // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabcVar, zzabx zzabxVar) throws IOException {
        int zza2 = zzabcVar.zza(this.zzc.zzI(), 0, Http2.INITIAL_MAX_FRAME_SIZE);
        if (zza2 == -1) {
            return -1;
        }
        this.zzc.zzG(0);
        this.zzc.zzF(zza2);
        if (!this.zzd) {
            this.zzb.zzd(0L, 4);
            this.zzd = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabeVar) {
        this.zzb.zzb(zzabeVar, new zzaka(RecyclerView.UNDEFINED_DURATION, 0, 1));
        zzabeVar.zzC();
        zzabeVar.zzN(new zzabz(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long j10, long j11) {
        this.zzd = false;
        this.zzb.zze();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        r16.zzj();
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
    
        if ((r5 - r3) >= 8192) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        return false;
     */
    @Override // com.google.android.gms.internal.ads.zzabb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzd(com.google.android.gms.internal.ads.zzabc r16) throws java.io.IOException {
        /*
            r15 = this;
            com.google.android.gms.internal.ads.zzfb r0 = new com.google.android.gms.internal.ads.zzfb
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.zzI()
            r5 = r16
            com.google.android.gms.internal.ads.zzaar r5 = (com.google.android.gms.internal.ads.zzaar) r5
            r5.zzm(r4, r2, r1, r2)
            r0.zzG(r2)
            int r4 = r0.zzn()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L9e
            r16.zzj()
            r4 = r16
            com.google.android.gms.internal.ads.zzaar r4 = (com.google.android.gms.internal.ads.zzaar) r4
            r4.zzl(r3, r2)
            r5 = r3
        L2c:
            r1 = 0
        L2d:
            byte[] r6 = r0.zzI()
            r8 = 7
            r4.zzm(r6, r2, r8, r2)
            r0.zzG(r2)
            int r6 = r0.zzp()
            r9 = 44096(0xac40, float:6.1792E-41)
            r10 = 44097(0xac41, float:6.1793E-41)
            if (r6 == r9) goto L56
            if (r6 == r10) goto L56
            r16.zzj()
            int r5 = r5 + 1
            int r1 = r5 - r3
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r6) goto L55
            r4.zzl(r5, r2)
            goto L2c
        L55:
            return r2
        L56:
            r9 = 1
            int r1 = r1 + r9
            r11 = 4
            if (r1 < r11) goto L5c
            return r9
        L5c:
            byte[] r9 = r0.zzI()
            int r12 = com.google.android.gms.internal.ads.zzaaf.zza
            int r12 = r9.length
            r13 = -1
            if (r12 >= r8) goto L68
            r12 = -1
            goto L95
        L68:
            r12 = 2
            r12 = r9[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r14 = r9[r7]
            int r12 = r12 << 8
            r14 = r14 & 255(0xff, float:3.57E-43)
            r12 = r12 | r14
            r14 = 65535(0xffff, float:9.1834E-41)
            if (r12 != r14) goto L8f
            r11 = r9[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r12 = 5
            r12 = r9[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 16
            int r12 = r12 << 8
            r14 = 6
            r9 = r9[r14]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r11 = r11 | r12
            r12 = r11 | r9
            goto L90
        L8f:
            r8 = 4
        L90:
            if (r6 != r10) goto L94
            int r8 = r8 + 2
        L94:
            int r12 = r12 + r8
        L95:
            if (r12 != r13) goto L98
            return r2
        L98:
            int r12 = r12 + (-7)
            r4.zzl(r12, r2)
            goto L2d
        L9e:
            r0.zzH(r7)
            int r4 = r0.zzk()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.zzl(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaig.zzd(com.google.android.gms.internal.ads.zzabc):boolean");
    }
}