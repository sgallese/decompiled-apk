package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzqz implements zzqy {
    public static final zzib zza;
    public static final zzib zzb;
    public static final zzib zzc;

    static {
        zzhy zza2 = new zzhy(zzhq.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zzf("measurement.sfmc.client", false);
        zzb = zza2.zzf("measurement.sfmc.service", false);
        zzc = zza2.zzd("measurement.id.sfmc.client", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzqy
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzqy
    public final boolean zzb() {
        return ((Boolean) zza.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqy
    public final boolean zzc() {
        return ((Boolean) zzb.zzb()).booleanValue();
    }
}
