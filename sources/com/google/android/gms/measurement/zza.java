package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.collection.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zzhd;
import com.google.android.gms.measurement.internal.zzhe;
import com.google.android.gms.measurement.internal.zzii;
import com.google.android.gms.measurement.internal.zzli;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
final class zza extends zzd {
    private final zzgd zza;
    private final zzii zzb;

    public zza(zzgd zzgdVar) {
        super(null);
        Preconditions.checkNotNull(zzgdVar);
        this.zza = zzgdVar;
        this.zzb = zzgdVar.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final int zza(String str) {
        this.zzb.zzh(str);
        return 25;
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final long zzb() {
        return this.zza.zzv().zzq();
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Boolean zzc() {
        return this.zzb.zzi();
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Double zzd() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Integer zze() {
        return this.zzb.zzl();
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Long zzf() {
        return this.zzb.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final Object zzg(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return this.zzb.zzi();
                    }
                    return this.zzb.zzl();
                }
                return this.zzb.zzj();
            }
            return this.zzb.zzm();
        }
        return this.zzb.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final String zzh() {
        return this.zzb.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final String zzi() {
        return this.zzb.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final String zzj() {
        return this.zzb.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final String zzk() {
        return this.zzb.zzo();
    }

    @Override // com.google.android.gms.measurement.zzd
    public final String zzl() {
        return this.zzb.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final List zzm(String str, String str2) {
        return this.zzb.zzs(str, str2);
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Map zzn(boolean z10) {
        List<zzli> zzt = this.zzb.zzt(z10);
        a aVar = new a(zzt.size());
        for (zzli zzliVar : zzt) {
            Object zza = zzliVar.zza();
            if (zza != null) {
                aVar.put(zzliVar.zzb, zza);
            }
        }
        return aVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final Map zzo(String str, String str2, boolean z10) {
        return this.zzb.zzu(str, str2, z10);
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final void zzp(String str) {
        this.zza.zzd().zzd(str, this.zza.zzax().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final void zzq(String str, String str2, Bundle bundle) {
        this.zza.zzq().zzA(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final void zzr(String str) {
        this.zza.zzd().zze(str, this.zza.zzax().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final void zzs(String str, String str2, Bundle bundle) {
        this.zzb.zzD(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final void zzt(String str, String str2, Bundle bundle, long j10) {
        this.zzb.zzE(str, str2, bundle, true, false, j10);
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final void zzu(zzhe zzheVar) {
        this.zzb.zzJ(zzheVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final void zzv(Bundle bundle) {
        this.zzb.zzP(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final void zzw(zzhd zzhdVar) {
        this.zzb.zzT(zzhdVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final void zzx(zzhe zzheVar) {
        this.zzb.zzZ(zzheVar);
    }
}
