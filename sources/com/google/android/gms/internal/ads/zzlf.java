package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzlf {
    private final zzoh zza;
    private final zzle zze;
    private final zzlx zzh;
    private final zzej zzi;
    private boolean zzj;
    private zzhk zzk;
    private zzvm zzl = new zzvm(0);
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final List zzb = new ArrayList();
    private final HashMap zzf = new HashMap();
    private final Set zzg = new HashSet();

    public zzlf(zzle zzleVar, zzlx zzlxVar, zzej zzejVar, zzoh zzohVar) {
        this.zza = zzohVar;
        this.zze = zzleVar;
        this.zzh = zzlxVar;
        this.zzi = zzejVar;
    }

    private final void zzr(int i10, int i11) {
        while (i10 < this.zzb.size()) {
            ((zzld) this.zzb.get(i10)).zzd += i11;
            i10++;
        }
    }

    private final void zzs(zzld zzldVar) {
        zzlc zzlcVar = (zzlc) this.zzf.get(zzldVar);
        if (zzlcVar != null) {
            zzlcVar.zza.zzi(zzlcVar.zzb);
        }
    }

    private final void zzt() {
        Iterator it = this.zzg.iterator();
        while (it.hasNext()) {
            zzld zzldVar = (zzld) it.next();
            if (zzldVar.zzc.isEmpty()) {
                zzs(zzldVar);
                it.remove();
            }
        }
    }

    private final void zzu(zzld zzldVar) {
        if (zzldVar.zze && zzldVar.zzc.isEmpty()) {
            zzlc zzlcVar = (zzlc) this.zzf.remove(zzldVar);
            zzlcVar.getClass();
            zzlcVar.zza.zzp(zzlcVar.zzb);
            zzlcVar.zza.zzs(zzlcVar.zzc);
            zzlcVar.zza.zzr(zzlcVar.zzc);
            this.zzg.remove(zzldVar);
        }
    }

    private final void zzv(zzld zzldVar) {
        zztn zztnVar = zzldVar.zza;
        zztt zzttVar = new zztt() { // from class: com.google.android.gms.internal.ads.zzkv
            @Override // com.google.android.gms.internal.ads.zztt
            public final void zza(zztu zztuVar, zzcw zzcwVar) {
                zzlf.this.zzf(zztuVar, zzcwVar);
            }
        };
        zzlb zzlbVar = new zzlb(this, zzldVar);
        this.zzf.put(zzldVar, new zzlc(zztnVar, zzttVar, zzlbVar));
        zztnVar.zzh(new Handler(zzfk.zzv(), null), zzlbVar);
        zztnVar.zzg(new Handler(zzfk.zzv(), null), zzlbVar);
        zztnVar.zzm(zzttVar, this.zzk, this.zza);
    }

    private final void zzw(int i10, int i11) {
        while (true) {
            i11--;
            if (i11 >= i10) {
                zzld zzldVar = (zzld) this.zzb.remove(i11);
                this.zzd.remove(zzldVar.zzb);
                zzr(i11, -zzldVar.zza.zzC().zzc());
                zzldVar.zze = true;
                if (this.zzj) {
                    zzu(zzldVar);
                }
            } else {
                return;
            }
        }
    }

    public final int zza() {
        return this.zzb.size();
    }

    public final zzcw zzb() {
        if (!this.zzb.isEmpty()) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.zzb.size(); i11++) {
                zzld zzldVar = (zzld) this.zzb.get(i11);
                zzldVar.zzd = i10;
                i10 += zzldVar.zza.zzC().zzc();
            }
            return new zzll(this.zzb, this.zzl);
        }
        return zzcw.zza;
    }

    public final zzcw zzc(int i10, int i11, List list) {
        boolean z10;
        boolean z11 = true;
        if (i10 >= 0 && i10 <= i11 && i11 <= zza()) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdy.zzd(z10);
        if (list.size() != i11 - i10) {
            z11 = false;
        }
        zzdy.zzd(z11);
        for (int i12 = i10; i12 < i11; i12++) {
            ((zzld) this.zzb.get(i12)).zza.zzt((zzbp) list.get(i12 - i10));
        }
        return zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zztu zztuVar, zzcw zzcwVar) {
        this.zze.zzh();
    }

    public final void zzg(zzhk zzhkVar) {
        zzdy.zzf(!this.zzj);
        this.zzk = zzhkVar;
        for (int i10 = 0; i10 < this.zzb.size(); i10++) {
            zzld zzldVar = (zzld) this.zzb.get(i10);
            zzv(zzldVar);
            this.zzg.add(zzldVar);
        }
        this.zzj = true;
    }

    public final void zzh() {
        for (zzlc zzlcVar : this.zzf.values()) {
            try {
                zzlcVar.zza.zzp(zzlcVar.zzb);
            } catch (RuntimeException e10) {
                zzes.zzd("MediaSourceList", "Failed to release child source.", e10);
            }
            zzlcVar.zza.zzs(zzlcVar.zzc);
            zzlcVar.zza.zzr(zzlcVar.zzc);
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
    }

    public final void zzi(zztq zztqVar) {
        zzld zzldVar = (zzld) this.zzc.remove(zztqVar);
        zzldVar.getClass();
        zzldVar.zza.zzG(zztqVar);
        zzldVar.zzc.remove(((zztk) zztqVar).zza);
        if (!this.zzc.isEmpty()) {
            zzt();
        }
        zzu(zzldVar);
    }

    public final boolean zzj() {
        return this.zzj;
    }

    public final zzcw zzk(int i10, List list, zzvm zzvmVar) {
        if (!list.isEmpty()) {
            this.zzl = zzvmVar;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                zzld zzldVar = (zzld) list.get(i11 - i10);
                if (i11 > 0) {
                    zzld zzldVar2 = (zzld) this.zzb.get(i11 - 1);
                    zzldVar.zzc(zzldVar2.zzd + zzldVar2.zza.zzC().zzc());
                } else {
                    zzldVar.zzc(0);
                }
                zzr(i11, zzldVar.zza.zzC().zzc());
                this.zzb.add(i11, zzldVar);
                this.zzd.put(zzldVar.zzb, zzldVar);
                if (this.zzj) {
                    zzv(zzldVar);
                    if (this.zzc.isEmpty()) {
                        this.zzg.add(zzldVar);
                    } else {
                        zzs(zzldVar);
                    }
                }
            }
        }
        return zzb();
    }

    public final zzcw zzl(int i10, int i11, int i12, zzvm zzvmVar) {
        boolean z10;
        if (zza() >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdy.zzd(z10);
        this.zzl = null;
        return zzb();
    }

    public final zzcw zzm(int i10, int i11, zzvm zzvmVar) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= i11 && i11 <= zza()) {
            z10 = true;
        }
        zzdy.zzd(z10);
        this.zzl = zzvmVar;
        zzw(i10, i11);
        return zzb();
    }

    public final zzcw zzn(List list, zzvm zzvmVar) {
        zzw(0, this.zzb.size());
        return zzk(this.zzb.size(), list, zzvmVar);
    }

    public final zzcw zzo(zzvm zzvmVar) {
        int zza = zza();
        if (zzvmVar.zzc() != zza) {
            zzvmVar = zzvmVar.zzf().zzg(0, zza);
        }
        this.zzl = zzvmVar;
        return zzb();
    }

    public final zztq zzp(zzts zztsVar, zzxu zzxuVar, long j10) {
        Object obj = zztsVar.zza;
        int i10 = zzll.zzc;
        Object obj2 = ((Pair) obj).first;
        zzts zzc = zztsVar.zzc(((Pair) obj).second);
        zzld zzldVar = (zzld) this.zzd.get(obj2);
        zzldVar.getClass();
        this.zzg.add(zzldVar);
        zzlc zzlcVar = (zzlc) this.zzf.get(zzldVar);
        if (zzlcVar != null) {
            zzlcVar.zza.zzk(zzlcVar.zzb);
        }
        zzldVar.zzc.add(zzc);
        zztk zzI = zzldVar.zza.zzI(zzc, zzxuVar, j10);
        this.zzc.put(zzI, zzldVar);
        zzt();
        return zzI;
    }

    public final zzvm zzq() {
        return this.zzl;
    }
}
