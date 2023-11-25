package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaid implements zzabb {
    public static final zzabi zza = new zzabi() { // from class: com.google.android.gms.internal.ads.zzaic
        @Override // com.google.android.gms.internal.ads.zzabi
        public final /* synthetic */ zzabb[] zza(Uri uri, Map map) {
            int i10 = zzabh.zza;
            return new zzabb[]{new zzaid()};
        }
    };
    private final zzaie zzb = new zzaie(null);
    private final zzfb zzc = new zzfb(2786);
    private boolean zzd;

    @Override // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabcVar, zzabx zzabxVar) throws IOException {
        int zza2 = zzabcVar.zza(this.zzc.zzI(), 0, 2786);
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
    
        if ((r5 - r3) >= 8192) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        r9.zzj();
        r5 = r5 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzabb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzd(com.google.android.gms.internal.ads.zzabc r9) throws java.io.IOException {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzfb r0 = new com.google.android.gms.internal.ads.zzfb
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.zzI()
            r5 = r9
            com.google.android.gms.internal.ads.zzaar r5 = (com.google.android.gms.internal.ads.zzaar) r5
            r5.zzm(r4, r2, r1, r2)
            r0.zzG(r2)
            int r4 = r0.zzn()
            r6 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r6) goto L65
            r9.zzj()
            r4 = r9
            com.google.android.gms.internal.ads.zzaar r4 = (com.google.android.gms.internal.ads.zzaar) r4
            r4.zzl(r3, r2)
            r5 = r3
        L29:
            r1 = 0
        L2a:
            byte[] r6 = r0.zzI()
            r7 = 6
            r4.zzm(r6, r2, r7, r2)
            r0.zzG(r2)
            int r6 = r0.zzp()
            r7 = 2935(0xb77, float:4.113E-42)
            if (r6 == r7) goto L4d
            r9.zzj()
            int r5 = r5 + 1
            int r1 = r5 - r3
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r6) goto L4c
            r4.zzl(r5, r2)
            goto L29
        L4c:
            return r2
        L4d:
            r6 = 1
            int r1 = r1 + r6
            r7 = 4
            if (r1 < r7) goto L53
            return r6
        L53:
            byte[] r6 = r0.zzI()
            int r6 = com.google.android.gms.internal.ads.zzaac.zzb(r6)
            r7 = -1
            if (r6 != r7) goto L5f
            return r2
        L5f:
            int r6 = r6 + (-6)
            r4.zzl(r6, r2)
            goto L2a
        L65:
            r4 = 3
            r0.zzH(r4)
            int r4 = r0.zzk()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.zzl(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaid.zzd(com.google.android.gms.internal.ads.zzabc):boolean");
    }
}
