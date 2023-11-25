package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzqt implements zzqs {
    public static final zzib zza;
    public static final zzib zzb;
    public static final zzib zzc;

    static {
        zzhy zza2 = new zzhy(zzhq.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zzf("measurement.collection.enable_session_stitching_token.client.dev", true);
        zzb = zza2.zzf("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        zzc = zza2.zzf("measurement.session_stitching_token_enabled", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzqs
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzqs
    public final boolean zzb() {
        return ((Boolean) zza.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqs
    public final boolean zzc() {
        return ((Boolean) zzb.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqs
    public final boolean zzd() {
        return ((Boolean) zzc.zzb()).booleanValue();
    }
}
