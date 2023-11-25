package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zznx {
    private final zzct zza;
    private zzfud zzb = zzfud.zzl();
    private zzfug zzc = zzfug.zzd();
    private zzts zzd;
    private zzts zze;
    private zzts zzf;

    public zznx(zzct zzctVar) {
        this.zza = zzctVar;
    }

    private static zzts zzj(zzcp zzcpVar, zzfud zzfudVar, zzts zztsVar, zzct zzctVar) {
        Object zzf;
        int i10;
        zzcw zzn = zzcpVar.zzn();
        int zze = zzcpVar.zze();
        if (zzn.zzo()) {
            zzf = null;
        } else {
            zzf = zzn.zzf(zze);
        }
        if (!zzcpVar.zzx() && !zzn.zzo()) {
            i10 = zzn.zzd(zze, zzctVar, false).zzc(zzfk.zzp(zzcpVar.zzk()));
        } else {
            i10 = -1;
        }
        for (int i11 = 0; i11 < zzfudVar.size(); i11++) {
            zzts zztsVar2 = (zzts) zzfudVar.get(i11);
            if (zzm(zztsVar2, zzf, zzcpVar.zzx(), zzcpVar.zzb(), zzcpVar.zzc(), i10)) {
                return zztsVar2;
            }
        }
        if (zzfudVar.isEmpty() && zztsVar != null) {
            if (zzm(zztsVar, zzf, zzcpVar.zzx(), zzcpVar.zzb(), zzcpVar.zzc(), i10)) {
                return zztsVar;
            }
        }
        return null;
    }

    private final void zzk(zzfuf zzfufVar, zzts zztsVar, zzcw zzcwVar) {
        if (zztsVar == null) {
            return;
        }
        if (zzcwVar.zza(zztsVar.zza) != -1) {
            zzfufVar.zza(zztsVar, zzcwVar);
            return;
        }
        zzcw zzcwVar2 = (zzcw) this.zzc.get(zztsVar);
        if (zzcwVar2 != null) {
            zzfufVar.zza(zztsVar, zzcwVar2);
        }
    }

    private final void zzl(zzcw zzcwVar) {
        zzfuf zzfufVar = new zzfuf();
        if (this.zzb.isEmpty()) {
            zzk(zzfufVar, this.zze, zzcwVar);
            if (!zzfrd.zza(this.zzf, this.zze)) {
                zzk(zzfufVar, this.zzf, zzcwVar);
            }
            if (!zzfrd.zza(this.zzd, this.zze) && !zzfrd.zza(this.zzd, this.zzf)) {
                zzk(zzfufVar, this.zzd, zzcwVar);
            }
        } else {
            for (int i10 = 0; i10 < this.zzb.size(); i10++) {
                zzk(zzfufVar, (zzts) this.zzb.get(i10), zzcwVar);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzfufVar, this.zzd, zzcwVar);
            }
        }
        this.zzc = zzfufVar.zzc();
    }

    private static boolean zzm(zzts zztsVar, Object obj, boolean z10, int i10, int i11, int i12) {
        if (!zztsVar.zza.equals(obj)) {
            return false;
        }
        if (z10) {
            if (zztsVar.zzb != i10 || zztsVar.zzc != i11) {
                return false;
            }
        } else if (zztsVar.zzb != -1 || zztsVar.zze != i12) {
            return false;
        }
        return true;
    }

    public final zzcw zza(zzts zztsVar) {
        return (zzcw) this.zzc.get(zztsVar);
    }

    public final zzts zzb() {
        return this.zzd;
    }

    public final zzts zzc() {
        Object next;
        Object obj;
        if (this.zzb.isEmpty()) {
            return null;
        }
        zzfud zzfudVar = this.zzb;
        if (zzfudVar instanceof List) {
            if (!zzfudVar.isEmpty()) {
                obj = zzfudVar.get(zzfudVar.size() - 1);
            } else {
                throw new NoSuchElementException();
            }
        } else {
            Iterator<E> it = zzfudVar.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        }
        return (zzts) obj;
    }

    public final zzts zzd() {
        return this.zze;
    }

    public final zzts zze() {
        return this.zzf;
    }

    public final void zzg(zzcp zzcpVar) {
        this.zzd = zzj(zzcpVar, this.zzb, this.zze, this.zza);
    }

    public final void zzh(List list, zzts zztsVar, zzcp zzcpVar) {
        this.zzb = zzfud.zzj(list);
        if (!list.isEmpty()) {
            this.zze = (zzts) list.get(0);
            zztsVar.getClass();
            this.zzf = zztsVar;
        }
        if (this.zzd == null) {
            this.zzd = zzj(zzcpVar, this.zzb, this.zze, this.zza);
        }
        zzl(zzcpVar.zzn());
    }

    public final void zzi(zzcp zzcpVar) {
        this.zzd = zzj(zzcpVar, this.zzb, this.zze, this.zza);
        zzl(zzcpVar.zzn());
    }
}
