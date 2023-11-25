package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfbi {
    public final List zza;
    public final String zzb;
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final long zzf;
    public final boolean zzg;
    public final String zzh;
    public final zzfbg zzi;
    public final Bundle zzj;
    public final String zzk;
    public final String zzl;
    public final String zzm;
    public final JSONObject zzn;
    public final String zzo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfbi(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List emptyList = Collections.emptyList();
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        String str = "";
        String str2 = "";
        String str3 = str2;
        String str4 = str3;
        zzfbg zzfbgVar = null;
        long j10 = 0;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        while (jsonReader.hasNext()) {
            String str8 = str3;
            String nextName = jsonReader.nextName();
            JSONObject jSONObject2 = jSONObject;
            if ("nofill_urls".equals(nextName)) {
                emptyList = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i10 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str2 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z10 = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i11 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j10 = jsonReader.nextLong();
            } else {
                String str9 = str7;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhV)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    zzfbgVar = new zzfbg(jsonReader);
                } else if ("bidding_data".equals(nextName)) {
                    str5 = jsonReader.nextString();
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjw)).booleanValue() && zzfbh.zza(nextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(nextName)) {
                        str4 = jsonReader.nextString();
                    } else if ("response_info_extras".equals(nextName)) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgI)).booleanValue()) {
                            try {
                                Bundle zza = com.google.android.gms.ads.internal.util.zzbu.zza(com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader));
                                if (zza != null) {
                                    bundle = zza;
                                }
                            } catch (IOException | JSONException unused) {
                            } catch (IllegalStateException unused2) {
                                jsonReader.skipValue();
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestPostBody".equals(nextName)) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziS)).booleanValue()) {
                            str7 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestUrl".equals(nextName)) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziS)).booleanValue()) {
                            str6 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else {
                        zzbbj zzbbjVar = zzbbr.zziT;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbjVar)).booleanValue() && zzfbh.zza(nextName, "adResponseBody")) {
                            str3 = jsonReader.nextString();
                            jSONObject = jSONObject2;
                            str7 = str9;
                        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbjVar)).booleanValue() && zzfbh.zza(nextName, "adResponseHeaders")) {
                            jSONObject = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                            str3 = str8;
                            str7 = str9;
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                }
                str3 = str8;
                jSONObject = jSONObject2;
                str7 = str9;
            }
            str3 = str8;
            jSONObject = jSONObject2;
        }
        jsonReader.endObject();
        this.zza = emptyList;
        this.zzc = i10;
        this.zzb = str;
        this.zzd = str2;
        this.zze = i11;
        this.zzf = j10;
        this.zzi = zzfbgVar;
        this.zzg = z10;
        this.zzh = str5;
        this.zzj = bundle;
        this.zzk = str6;
        this.zzl = str7;
        this.zzm = str3;
        this.zzn = jSONObject;
        this.zzo = str4;
    }
}
