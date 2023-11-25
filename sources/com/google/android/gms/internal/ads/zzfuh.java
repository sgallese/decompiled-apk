package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfuh extends zzftw {
    Object[] zzd;
    private int zze;

    public zzfuh() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzftw, com.google.android.gms.internal.ads.zzftx
    public final /* bridge */ /* synthetic */ zzftx zzb(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzfuh zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int zzh = zzfui.zzh(this.zzb);
            int length = this.zzd.length;
            if (zzh <= length) {
                int hashCode = obj.hashCode();
                int zza = zzftv.zza(hashCode);
                while (true) {
                    Object[] objArr = this.zzd;
                    int i10 = zza & (length - 1);
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        objArr[i10] = obj;
                        this.zze += hashCode;
                        super.zza(obj);
                        break;
                    } else if (obj2.equals(obj)) {
                        break;
                    } else {
                        zza = i10 + 1;
                    }
                }
                return this;
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }

    public final zzfuh zzg(Iterable iterable) {
        if (this.zzd != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                zzf(it.next());
            }
        } else {
            super.zzc(iterable);
        }
        return this;
    }

    public final zzfui zzh() {
        zzfui zzs;
        boolean zzt;
        int i10 = this.zzb;
        if (i10 != 0) {
            if (i10 != 1) {
                if (this.zzd == null || zzfui.zzh(i10) != this.zzd.length) {
                    zzs = zzfui.zzs(this.zzb, this.zza);
                    this.zzb = zzs.size();
                } else {
                    int i11 = this.zzb;
                    Object[] objArr = this.zza;
                    zzt = zzfui.zzt(i11, objArr.length);
                    if (zzt) {
                        objArr = Arrays.copyOf(objArr, i11);
                    }
                    zzs = new zzfvt(objArr, this.zze, this.zzd, r6.length - 1, this.zzb);
                }
                this.zzc = true;
                this.zzd = null;
                return zzs;
            }
            Object obj = this.zza[0];
            obj.getClass();
            return new zzfwa(obj);
        }
        return zzfvt.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfuh(int i10) {
        super(i10);
        this.zzd = new Object[zzfui.zzh(i10)];
    }
}
