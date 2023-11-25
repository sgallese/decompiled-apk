package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzbbj {
    private final int zza;
    private final String zzb;
    private final Object zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbbj(int i10, String str, Object obj, zzbbi zzbbiVar) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = obj;
        com.google.android.gms.ads.internal.client.zzba.zza().zzd(this);
    }

    public static zzbbj zzf(int i10, String str, float f10) {
        return new zzbbg(1, str, Float.valueOf(f10));
    }

    public static zzbbj zzg(int i10, String str, int i11) {
        return new zzbbe(1, str, Integer.valueOf(i11));
    }

    public static zzbbj zzh(int i10, String str, long j10) {
        return new zzbbf(1, str, Long.valueOf(j10));
    }

    public static zzbbj zzi(int i10, String str, Boolean bool) {
        return new zzbbd(i10, str, bool);
    }

    public static zzbbj zzj(int i10, String str, String str2) {
        return new zzbbh(1, str, str2);
    }

    public static zzbbj zzk(int i10, String str) {
        zzbbj zzj = zzj(1, "gads:sdk_core_constants:experiment_id", null);
        com.google.android.gms.ads.internal.client.zzba.zza().zzc(zzj);
        return zzj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zza(JSONObject jSONObject);

    public abstract Object zzb(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zzc(SharedPreferences sharedPreferences);

    public abstract void zzd(SharedPreferences.Editor editor, Object obj);

    public final int zze() {
        return this.zza;
    }

    public final Object zzl() {
        return com.google.android.gms.ads.internal.client.zzba.zzc().zzb(this);
    }

    public final Object zzm() {
        return this.zzc;
    }

    public final String zzn() {
        return this.zzb;
    }
}
