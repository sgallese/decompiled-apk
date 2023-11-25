package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzps implements zzpr {
    public static final zzib zza;
    public static final zzib zzb;
    public static final zzib zzc;
    public static final zzib zzd;

    static {
        zzhy zza2 = new zzhy(zzhq.zza("com.google.android.gms.measurement")).zza();
        zza = zza2.zzf("measurement.sdk.collection.enable_extend_user_property_size", true);
        zzb = zza2.zzf("measurement.sdk.collection.last_deep_link_referrer2", true);
        zzc = zza2.zzf("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        zzd = zza2.zzd("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzpr
    public final boolean zza() {
        return ((Boolean) zzc.zzb()).booleanValue();
    }
}
