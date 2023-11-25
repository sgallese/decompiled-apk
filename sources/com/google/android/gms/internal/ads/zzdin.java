package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdin {
    public static final zzdin zza = new zzdin(new zzdil());
    private final zzbfx zzb;
    private final zzbfu zzc;
    private final zzbgk zzd;
    private final zzbgh zze;
    private final zzblj zzf;
    private final androidx.collection.g zzg;
    private final androidx.collection.g zzh;

    public final zzbfu zza() {
        return this.zzc;
    }

    public final zzbfx zzb() {
        return this.zzb;
    }

    public final zzbga zzc(String str) {
        return (zzbga) this.zzh.get(str);
    }

    public final zzbgd zzd(String str) {
        return (zzbgd) this.zzg.get(str);
    }

    public final zzbgh zze() {
        return this.zze;
    }

    public final zzbgk zzf() {
        return this.zzd;
    }

    public final zzblj zzg() {
        return this.zzf;
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList(this.zzg.size());
        for (int i10 = 0; i10 < this.zzg.size(); i10++) {
            arrayList.add((String) this.zzg.j(i10));
        }
        return arrayList;
    }

    public final ArrayList zzi() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    private zzdin(zzdil zzdilVar) {
        this.zzb = zzdilVar.zza;
        this.zzc = zzdilVar.zzb;
        this.zzd = zzdilVar.zzc;
        this.zzg = new androidx.collection.g(zzdilVar.zzf);
        this.zzh = new androidx.collection.g(zzdilVar.zzg);
        this.zze = zzdilVar.zzd;
        this.zzf = zzdilVar.zze;
    }
}
