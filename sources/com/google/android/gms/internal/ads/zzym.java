package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzym {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzyi
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((zzyl) obj).zza - ((zzyl) obj2).zza;
        }
    };
    private static final Comparator zzb = new Comparator() { // from class: com.google.android.gms.internal.ads.zzyj
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((zzyl) obj).zzc, ((zzyl) obj2).zzc);
        }
    };
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzyl[] zzd = new zzyl[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzym(int i10) {
    }

    public final float zza(float f10) {
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f11 = this.zzg;
        int i10 = 0;
        for (int i11 = 0; i11 < this.zzc.size(); i11++) {
            float f12 = 0.5f * f11;
            zzyl zzylVar = (zzyl) this.zzc.get(i11);
            i10 += zzylVar.zzb;
            if (i10 >= f12) {
                return zzylVar.zzc;
            }
        }
        if (this.zzc.isEmpty()) {
            return Float.NaN;
        }
        return ((zzyl) this.zzc.get(r6.size() - 1)).zzc;
    }

    public final void zzb(int i10, float f10) {
        zzyl zzylVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i11 = this.zzh;
        if (i11 > 0) {
            zzyl[] zzylVarArr = this.zzd;
            int i12 = i11 - 1;
            this.zzh = i12;
            zzylVar = zzylVarArr[i12];
        } else {
            zzylVar = new zzyl(null);
        }
        int i13 = this.zzf;
        this.zzf = i13 + 1;
        zzylVar.zza = i13;
        zzylVar.zzb = i10;
        zzylVar.zzc = f10;
        this.zzc.add(zzylVar);
        this.zzg += i10;
        while (true) {
            int i14 = this.zzg;
            if (i14 > 2000) {
                int i15 = i14 - 2000;
                zzyl zzylVar2 = (zzyl) this.zzc.get(0);
                int i16 = zzylVar2.zzb;
                if (i16 <= i15) {
                    this.zzg -= i16;
                    this.zzc.remove(0);
                    int i17 = this.zzh;
                    if (i17 < 5) {
                        zzyl[] zzylVarArr2 = this.zzd;
                        this.zzh = i17 + 1;
                        zzylVarArr2[i17] = zzylVar2;
                    }
                } else {
                    zzylVar2.zzb = i16 - i15;
                    this.zzg -= i15;
                }
            } else {
                return;
            }
        }
    }

    public final void zzc() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }
}
