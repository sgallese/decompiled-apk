package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzlb implements zzuc, zzqu {
    final /* synthetic */ zzlf zza;
    private final zzld zzb;

    public zzlb(zzlf zzlfVar, zzld zzldVar) {
        this.zza = zzlfVar;
        this.zzb = zzldVar;
    }

    private final Pair zzf(int i10, zzts zztsVar) {
        zzts zztsVar2;
        zzts zztsVar3 = null;
        if (zztsVar != null) {
            zzld zzldVar = this.zzb;
            int i11 = 0;
            while (true) {
                if (i11 < zzldVar.zzc.size()) {
                    if (((zzts) zzldVar.zzc.get(i11)).zzd == zztsVar.zzd) {
                        zztsVar2 = zztsVar.zzc(Pair.create(zzldVar.zzb, zztsVar.zza));
                        break;
                    }
                    i11++;
                } else {
                    zztsVar2 = null;
                    break;
                }
            }
            if (zztsVar2 == null) {
                return null;
            }
            zztsVar3 = zztsVar2;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zztsVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzuc
    public final void zzac(int i10, zzts zztsVar, final zzto zztoVar) {
        zzej zzejVar;
        final Pair zzf = zzf(0, zztsVar);
        if (zzf != null) {
            zzejVar = this.zza.zzi;
            zzejVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkz
                @Override // java.lang.Runnable
                public final void run() {
                    zzlx zzlxVar;
                    zzlb zzlbVar = zzlb.this;
                    Pair pair = zzf;
                    zzto zztoVar2 = zztoVar;
                    zzlxVar = zzlbVar.zza.zzh;
                    zzlxVar.zzac(((Integer) pair.first).intValue(), (zzts) pair.second, zztoVar2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuc
    public final void zzad(int i10, zzts zztsVar, final zztj zztjVar, final zzto zztoVar) {
        zzej zzejVar;
        final Pair zzf = zzf(0, zztsVar);
        if (zzf != null) {
            zzejVar = this.zza.zzi;
            zzejVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzky
                @Override // java.lang.Runnable
                public final void run() {
                    zzlx zzlxVar;
                    zzlb zzlbVar = zzlb.this;
                    Pair pair = zzf;
                    zztj zztjVar2 = zztjVar;
                    zzto zztoVar2 = zztoVar;
                    zzlxVar = zzlbVar.zza.zzh;
                    zzlxVar.zzad(((Integer) pair.first).intValue(), (zzts) pair.second, zztjVar2, zztoVar2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuc
    public final void zzae(int i10, zzts zztsVar, final zztj zztjVar, final zzto zztoVar) {
        zzej zzejVar;
        final Pair zzf = zzf(0, zztsVar);
        if (zzf != null) {
            zzejVar = this.zza.zzi;
            zzejVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkx
                @Override // java.lang.Runnable
                public final void run() {
                    zzlx zzlxVar;
                    zzlb zzlbVar = zzlb.this;
                    Pair pair = zzf;
                    zztj zztjVar2 = zztjVar;
                    zzto zztoVar2 = zztoVar;
                    zzlxVar = zzlbVar.zza.zzh;
                    zzlxVar.zzae(((Integer) pair.first).intValue(), (zzts) pair.second, zztjVar2, zztoVar2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuc
    public final void zzaf(int i10, zzts zztsVar, final zztj zztjVar, final zzto zztoVar, final IOException iOException, final boolean z10) {
        zzej zzejVar;
        final Pair zzf = zzf(0, zztsVar);
        if (zzf != null) {
            zzejVar = this.zza.zzi;
            zzejVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkw
                @Override // java.lang.Runnable
                public final void run() {
                    zzlx zzlxVar;
                    zzlb zzlbVar = zzlb.this;
                    Pair pair = zzf;
                    zztj zztjVar2 = zztjVar;
                    zzto zztoVar2 = zztoVar;
                    IOException iOException2 = iOException;
                    boolean z11 = z10;
                    zzlxVar = zzlbVar.zza.zzh;
                    zzlxVar.zzaf(((Integer) pair.first).intValue(), (zzts) pair.second, zztjVar2, zztoVar2, iOException2, z11);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuc
    public final void zzag(int i10, zzts zztsVar, final zztj zztjVar, final zzto zztoVar) {
        zzej zzejVar;
        final Pair zzf = zzf(0, zztsVar);
        if (zzf != null) {
            zzejVar = this.zza.zzi;
            zzejVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzla
                @Override // java.lang.Runnable
                public final void run() {
                    zzlx zzlxVar;
                    zzlb zzlbVar = zzlb.this;
                    Pair pair = zzf;
                    zztj zztjVar2 = zztjVar;
                    zzto zztoVar2 = zztoVar;
                    zzlxVar = zzlbVar.zza.zzh;
                    zzlxVar.zzag(((Integer) pair.first).intValue(), (zzts) pair.second, zztjVar2, zztoVar2);
                }
            });
        }
    }
}
