package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcci {
    public final boolean zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final String zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final boolean zzj;
    public final boolean zzk;
    public final boolean zzl;
    public final boolean zzm;
    public final long zzn;
    public final long zzo;

    public zzcci(String str) {
        String string;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.zza = zza(jSONObject, "aggressive_media_codec_release", zzbbr.zzJ);
        this.zzb = zzb(jSONObject, "byte_buffer_precache_limit", zzbbr.zzl);
        this.zzc = zzb(jSONObject, "exo_cache_buffer_size", zzbbr.zzw);
        this.zzd = zzb(jSONObject, "exo_connect_timeout_millis", zzbbr.zzh);
        zzbbj zzbbjVar = zzbbr.zzg;
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
            this.zze = string;
            this.zzf = zzb(jSONObject, "exo_read_timeout_millis", zzbbr.zzi);
            this.zzg = zzb(jSONObject, "load_check_interval_bytes", zzbbr.zzj);
            this.zzh = zzb(jSONObject, "player_precache_limit", zzbbr.zzk);
            this.zzi = zzb(jSONObject, "socket_receive_buffer_size", zzbbr.zzm);
            this.zzj = zza(jSONObject, "use_cache_data_source", zzbbr.zzed);
            zzb(jSONObject, "min_retry_count", zzbbr.zzn);
            this.zzk = zza(jSONObject, "treat_load_exception_as_non_fatal", zzbbr.zzq);
            this.zzl = zza(jSONObject, "enable_multiple_video_playback", zzbbr.zzbO);
            this.zzm = zza(jSONObject, "use_range_http_data_source", zzbbr.zzbQ);
            this.zzn = zzc(jSONObject, "range_http_data_source_high_water_mark", zzbbr.zzbR);
            this.zzo = zzc(jSONObject, "range_http_data_source_low_water_mark", zzbbr.zzbS);
        }
        string = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbjVar);
        this.zze = string;
        this.zzf = zzb(jSONObject, "exo_read_timeout_millis", zzbbr.zzi);
        this.zzg = zzb(jSONObject, "load_check_interval_bytes", zzbbr.zzj);
        this.zzh = zzb(jSONObject, "player_precache_limit", zzbbr.zzk);
        this.zzi = zzb(jSONObject, "socket_receive_buffer_size", zzbbr.zzm);
        this.zzj = zza(jSONObject, "use_cache_data_source", zzbbr.zzed);
        zzb(jSONObject, "min_retry_count", zzbbr.zzn);
        this.zzk = zza(jSONObject, "treat_load_exception_as_non_fatal", zzbbr.zzq);
        this.zzl = zza(jSONObject, "enable_multiple_video_playback", zzbbr.zzbO);
        this.zzm = zza(jSONObject, "use_range_http_data_source", zzbbr.zzbQ);
        this.zzn = zzc(jSONObject, "range_http_data_source_high_water_mark", zzbbr.zzbR);
        this.zzo = zzc(jSONObject, "range_http_data_source_low_water_mark", zzbbr.zzbS);
    }

    private static final boolean zza(JSONObject jSONObject, String str, zzbbj zzbbjVar) {
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbjVar)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
                return booleanValue;
            }
        }
        return booleanValue;
    }

    private static final int zzb(JSONObject jSONObject, String str, zzbbj zzbbjVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbjVar)).intValue();
    }

    private static final long zzc(JSONObject jSONObject, String str, zzbbj zzbbjVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getLong(str);
            } catch (JSONException unused) {
            }
        }
        return ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbjVar)).longValue();
    }
}
