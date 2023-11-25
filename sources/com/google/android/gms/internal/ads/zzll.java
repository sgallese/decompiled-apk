package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzll extends zzhu {
    public static final /* synthetic */ int zzc = 0;
    private final int zzd;
    private final int zze;
    private final int[] zzf;
    private final int[] zzg;
    private final zzcw[] zzh;
    private final Object[] zzi;
    private final HashMap zzj;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzll(java.util.Collection r7, com.google.android.gms.internal.ads.zzvm r8) {
        /*
            r6 = this;
            int r0 = r7.size()
            com.google.android.gms.internal.ads.zzcw[] r0 = new com.google.android.gms.internal.ads.zzcw[r0]
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
            r3 = 0
        Lc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L22
            java.lang.Object r4 = r1.next()
            com.google.android.gms.internal.ads.zzku r4 = (com.google.android.gms.internal.ads.zzku) r4
            int r5 = r3 + 1
            com.google.android.gms.internal.ads.zzcw r4 = r4.zza()
            r0[r3] = r4
            r3 = r5
            goto Lc
        L22:
            int r1 = r7.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.Iterator r7 = r7.iterator()
        L2c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r7.next()
            com.google.android.gms.internal.ads.zzku r3 = (com.google.android.gms.internal.ads.zzku) r3
            int r4 = r2 + 1
            java.lang.Object r3 = r3.zzb()
            r1[r2] = r3
            r2 = r4
            goto L2c
        L42:
            r6.<init>(r0, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzll.<init>(java.util.Collection, com.google.android.gms.internal.ads.zzvm):void");
    }

    @Override // com.google.android.gms.internal.ads.zzcw
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcw
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhu
    protected final int zzp(Object obj) {
        Integer num = (Integer) this.zzj.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzhu
    protected final int zzq(int i10) {
        return zzfk.zzb(this.zzf, i10 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhu
    protected final int zzr(int i10) {
        return zzfk.zzb(this.zzg, i10 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhu
    protected final int zzs(int i10) {
        return this.zzf[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzhu
    protected final int zzt(int i10) {
        return this.zzg[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzhu
    protected final zzcw zzu(int i10) {
        return this.zzh[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzhu
    protected final Object zzv(int i10) {
        return this.zzi[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List zzw() {
        return Arrays.asList(this.zzh);
    }

    public final zzll zzx(zzvm zzvmVar) {
        zzcw[] zzcwVarArr = new zzcw[this.zzh.length];
        int i10 = 0;
        while (true) {
            zzcw[] zzcwVarArr2 = this.zzh;
            if (i10 < zzcwVarArr2.length) {
                zzcwVarArr[i10] = new zzlk(this, zzcwVarArr2[i10]);
                i10++;
            } else {
                return new zzll(zzcwVarArr, this.zzi, zzvmVar);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzll(zzcw[] zzcwVarArr, Object[] objArr, zzvm zzvmVar) {
        super(false, zzvmVar);
        int i10 = 0;
        this.zzh = zzcwVarArr;
        int length = zzcwVarArr.length;
        this.zzf = new int[length];
        this.zzg = new int[length];
        this.zzi = objArr;
        this.zzj = new HashMap();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < zzcwVarArr.length) {
            zzcw zzcwVar = zzcwVarArr[i10];
            this.zzh[i13] = zzcwVar;
            this.zzg[i13] = i11;
            this.zzf[i13] = i12;
            i11 += zzcwVar.zzc();
            i12 += this.zzh[i13].zzb();
            this.zzj.put(objArr[i13], Integer.valueOf(i13));
            i10++;
            i13++;
        }
        this.zzd = i11;
        this.zze = i12;
    }
}
