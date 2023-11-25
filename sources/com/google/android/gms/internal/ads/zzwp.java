package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzwp extends zzdc {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;

    @Deprecated
    public zzwp() {
        this.zzg = new SparseArray();
        this.zzh = new SparseBooleanArray();
        zzv();
    }

    private final void zzv() {
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final /* synthetic */ zzdc zze(int i10, int i11, boolean z10) {
        super.zze(i10, i11, true);
        return this;
    }

    public final zzwp zzo(int i10, boolean z10) {
        if (this.zzh.get(i10) == z10) {
            return this;
        }
        if (z10) {
            this.zzh.put(i10, true);
        } else {
            this.zzh.delete(i10);
        }
        return this;
    }

    public zzwp(Context context) {
        super.zzd(context);
        Point zzs = zzfk.zzs(context);
        zze(zzs.x, zzs.y, true);
        this.zzg = new SparseArray();
        this.zzh = new SparseBooleanArray();
        zzv();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzwp(zzwr zzwrVar, zzwo zzwoVar) {
        super(zzwrVar);
        this.zza = zzwrVar.zzH;
        this.zzb = zzwrVar.zzJ;
        this.zzc = zzwrVar.zzL;
        this.zzd = zzwrVar.zzQ;
        this.zze = zzwrVar.zzR;
        this.zzf = zzwrVar.zzT;
        SparseArray zza = zzwr.zza(zzwrVar);
        SparseArray sparseArray = new SparseArray();
        for (int i10 = 0; i10 < zza.size(); i10++) {
            sparseArray.put(zza.keyAt(i10), new HashMap((Map) zza.valueAt(i10)));
        }
        this.zzg = sparseArray;
        this.zzh = zzwr.zzb(zzwrVar).clone();
    }
}
