package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzajw implements zzabb {
    public static final zzabi zza = new zzabi() { // from class: com.google.android.gms.internal.ads.zzajt
        @Override // com.google.android.gms.internal.ads.zzabi
        public final /* synthetic */ zzabb[] zza(Uri uri, Map map) {
            int i10 = zzabh.zza;
            return new zzabb[]{new zzajw(0)};
        }
    };
    private final List zzb;
    private final zzfb zzc;
    private final SparseIntArray zzd;
    private final zzajz zze;
    private final SparseArray zzf;
    private final SparseBooleanArray zzg;
    private final SparseBooleanArray zzh;
    private final zzajs zzi;
    private zzajr zzj;
    private zzabe zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzp;
    private int zzq;

    public zzajw() {
        this(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b5, code lost:
    
        if (r1 == false) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.zzabb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(com.google.android.gms.internal.ads.zzabc r19, com.google.android.gms.internal.ads.zzabx r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajw.zza(com.google.android.gms.internal.ads.zzabc, com.google.android.gms.internal.ads.zzabx):int");
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabeVar) {
        this.zzk = zzabeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long j10, long j11) {
        zzajr zzajrVar;
        int size = this.zzb.size();
        for (int i10 = 0; i10 < size; i10++) {
            zzfi zzfiVar = (zzfi) this.zzb.get(i10);
            if (zzfiVar.zze() != -9223372036854775807L) {
                long zzc = zzfiVar.zzc();
                if (zzc != -9223372036854775807L) {
                    if (zzc != 0) {
                        if (zzc == j11) {
                        }
                    }
                }
            }
            zzfiVar.zzf(j11);
        }
        if (j11 != 0 && (zzajrVar = this.zzj) != null) {
            zzajrVar.zzd(j11);
        }
        this.zzc.zzD(0);
        this.zzd.clear();
        for (int i11 = 0; i11 < this.zzf.size(); i11++) {
            ((zzakb) this.zzf.valueAt(i11)).zzc();
        }
        this.zzp = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzabb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzd(com.google.android.gms.internal.ads.zzabc r7) throws java.io.IOException {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzfb r0 = r6.zzc
            byte[] r0 = r0.zzI()
            com.google.android.gms.internal.ads.zzaar r7 = (com.google.android.gms.internal.ads.zzaar) r7
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.zzm(r0, r2, r1, r2)
            r1 = 0
        Lf:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L2b
            r3 = 0
        L14:
            r4 = 5
            if (r3 >= r4) goto L26
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L23
            int r1 = r1 + 1
            goto Lf
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            r7.zzo(r1, r2)
            r7 = 1
            return r7
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajw.zzd(com.google.android.gms.internal.ads.zzabc):boolean");
    }

    public zzajw(int i10) {
        this(1, new zzfi(0L), new zzail(0), 112800);
    }

    public zzajw(int i10, zzfi zzfiVar, zzajz zzajzVar, int i11) {
        this.zze = zzajzVar;
        this.zzb = Collections.singletonList(zzfiVar);
        this.zzc = new zzfb(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzg = sparseBooleanArray;
        this.zzh = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzf = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzi = new zzajs(112800);
        this.zzk = zzabe.zza;
        this.zzq = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.zzf.put(sparseArray2.keyAt(i12), (zzakb) sparseArray2.valueAt(i12));
        }
        this.zzf.put(0, new zzajo(new zzaju(this)));
    }
}
