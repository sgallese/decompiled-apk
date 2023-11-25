package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzuk extends zztb {
    private static final zzbp zza;
    private final zztu[] zzb;
    private final zzcw[] zzc;
    private final ArrayList zzd;
    private final Map zze;
    private final zzfuz zzf;
    private int zzg;
    private long[][] zzh;
    private zzuj zzi;
    private final zztd zzj;

    static {
        zzar zzarVar = new zzar();
        zzarVar.zza("MergingMediaSource");
        zza = zzarVar.zzc();
    }

    public zzuk(boolean z10, boolean z11, zztu... zztuVarArr) {
        zztd zztdVar = new zztd();
        this.zzb = zztuVarArr;
        this.zzj = zztdVar;
        this.zzd = new ArrayList(Arrays.asList(zztuVarArr));
        this.zzg = -1;
        this.zzc = new zzcw[zztuVarArr.length];
        this.zzh = new long[0];
        this.zze = new HashMap();
        this.zzf = zzfvh.zzb(8).zzb(2).zza();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zztb
    public final /* bridge */ /* synthetic */ void zzA(Object obj, zztu zztuVar, zzcw zzcwVar) {
        int i10;
        if (this.zzi == null) {
            if (this.zzg == -1) {
                i10 = zzcwVar.zzb();
                this.zzg = i10;
            } else {
                int zzb = zzcwVar.zzb();
                int i11 = this.zzg;
                if (zzb != i11) {
                    this.zzi = new zzuj(0);
                    return;
                }
                i10 = i11;
            }
            if (this.zzh.length == 0) {
                this.zzh = (long[][]) Array.newInstance(Long.TYPE, i10, this.zzc.length);
            }
            this.zzd.remove(zztuVar);
            this.zzc[((Integer) obj).intValue()] = zzcwVar;
            if (this.zzd.isEmpty()) {
                zzo(this.zzc[0]);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final void zzG(zztq zztqVar) {
        zzui zzuiVar = (zzui) zztqVar;
        int i10 = 0;
        while (true) {
            zztu[] zztuVarArr = this.zzb;
            if (i10 < zztuVarArr.length) {
                zztuVarArr[i10].zzG(zzuiVar.zzn(i10));
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final zztq zzI(zzts zztsVar, zzxu zzxuVar, long j10) {
        int length = this.zzb.length;
        zztq[] zztqVarArr = new zztq[length];
        int zza2 = this.zzc[0].zza(zztsVar.zza);
        for (int i10 = 0; i10 < length; i10++) {
            zztqVarArr[i10] = this.zzb[i10].zzI(zztsVar.zzc(this.zzc[i10].zzf(zza2)), zzxuVar, j10 - this.zzh[zza2][i10]);
        }
        return new zzui(this.zzj, this.zzh[zza2], zztqVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final zzbp zzJ() {
        zztu[] zztuVarArr = this.zzb;
        if (zztuVarArr.length > 0) {
            return zztuVarArr[0].zzJ();
        }
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zztb, com.google.android.gms.internal.ads.zzst
    public final void zzn(zzhk zzhkVar) {
        super.zzn(zzhkVar);
        for (int i10 = 0; i10 < this.zzb.length; i10++) {
            zzB(Integer.valueOf(i10), this.zzb[i10]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zztb, com.google.android.gms.internal.ads.zzst
    public final void zzq() {
        super.zzq();
        Arrays.fill(this.zzc, (Object) null);
        this.zzg = -1;
        this.zzi = null;
        this.zzd.clear();
        Collections.addAll(this.zzd, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzst, com.google.android.gms.internal.ads.zztu
    public final void zzt(zzbp zzbpVar) {
        this.zzb[0].zzt(zzbpVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zztb
    public final /* bridge */ /* synthetic */ zzts zzy(Object obj, zzts zztsVar) {
        if (((Integer) obj).intValue() == 0) {
            return zztsVar;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zztb, com.google.android.gms.internal.ads.zztu
    public final void zzz() throws IOException {
        zzuj zzujVar = this.zzi;
        if (zzujVar == null) {
            super.zzz();
            return;
        }
        throw zzujVar;
    }
}
