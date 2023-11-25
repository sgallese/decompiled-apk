package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzhd;
import com.google.android.gms.measurement.internal.zzhe;
import com.google.android.gms.measurement.internal.zzij;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
final class zzb extends zzd {
    private final zzij zza;

    public zzb(zzij zzijVar) {
        super(null);
        Preconditions.checkNotNull(zzijVar);
        this.zza = zzijVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final int zza(String str) {
        return this.zza.zza(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final long zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Boolean zzc() {
        return (Boolean) this.zza.zzg(4);
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Double zzd() {
        return (Double) this.zza.zzg(2);
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Integer zze() {
        return (Integer) this.zza.zzg(3);
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Long zzf() {
        return (Long) this.zza.zzg(1);
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final Object zzg(int i10) {
        return this.zza.zzg(i10);
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final String zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final String zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final String zzj() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final String zzk() {
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.measurement.zzd
    public final String zzl() {
        return (String) this.zza.zzg(0);
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final List zzm(String str, String str2) {
        return this.zza.zzm(str, str2);
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Map zzn(boolean z10) {
        return this.zza.zzo(null, null, z10);
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final Map zzo(String str, String str2, boolean z10) {
        return this.zza.zzo(str, str2, z10);
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final void zzp(String str) {
        this.zza.zzp(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final void zzq(String str, String str2, Bundle bundle) {
        this.zza.zzq(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final void zzr(String str) {
        this.zza.zzr(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final void zzs(String str, String str2, Bundle bundle) {
        this.zza.zzs(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final void zzt(String str, String str2, Bundle bundle, long j10) {
        this.zza.zzt(str, str2, bundle, j10);
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final void zzu(zzhe zzheVar) {
        this.zza.zzu(zzheVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final void zzv(Bundle bundle) {
        this.zza.zzv(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final void zzw(zzhd zzhdVar) {
        this.zza.zzw(zzhdVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final void zzx(zzhe zzheVar) {
        this.zza.zzx(zzheVar);
    }
}
