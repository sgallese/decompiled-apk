package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.wearable.WearableStatusCodes;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbzz {
    public static final /* synthetic */ int zza = 0;
    private static boolean zzc = false;
    private static boolean zzd = false;
    private final List zzg;
    private static final Object zzb = new Object();
    private static final Clock zze = DefaultClock.getInstance();
    private static final Set zzf = new HashSet(Arrays.asList(new String[0]));

    public zzbzz() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zza(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        zzr(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64Utils.encode(bArr));
        }
        jsonWriter.endObject();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzb(int i10, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i10);
        jsonWriter.endObject();
        zzr(jsonWriter, map);
        jsonWriter.endObject();
    }

    public static void zzi() {
        synchronized (zzb) {
            zzc = false;
            zzd = false;
            zzcaa.zzj("Ad debug logging enablement is out of date.");
        }
    }

    public static void zzj(boolean z10) {
        synchronized (zzb) {
            zzc = true;
            zzd = z10;
        }
    }

    public static boolean zzk() {
        boolean z10;
        synchronized (zzb) {
            z10 = false;
            if (zzc && zzd) {
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean zzl() {
        boolean z10;
        synchronized (zzb) {
            z10 = zzc;
        }
        return z10;
    }

    private static synchronized void zzm(String str) {
        synchronized (zzbzz.class) {
            zzcaa.zzi("GMA Debug BEGIN");
            int i10 = 0;
            while (i10 < str.length()) {
                int i11 = i10 + WearableStatusCodes.TARGET_NODE_NOT_CONNECTED;
                zzcaa.zzi("GMA Debug CONTENT ".concat(String.valueOf(str.substring(i10, Math.min(i11, str.length())))));
                i10 = i11;
            }
            zzcaa.zzi("GMA Debug FINISH");
        }
    }

    private final void zzn(String str, zzbzy zzbzyVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(zze.currentTimeMillis());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            zzbzyVar.zza(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e10) {
            zzcaa.zzh("unable to log", e10);
        }
        zzm(stringWriter.toString());
    }

    private final void zzo(final String str) {
        zzn("onNetworkRequestError", new zzbzy() { // from class: com.google.android.gms.internal.ads.zzbzv
            @Override // com.google.android.gms.internal.ads.zzbzy
            public final void zza(JsonWriter jsonWriter) {
                String str2 = str;
                int i10 = zzbzz.zza;
                jsonWriter.name("params").beginObject();
                if (str2 != null) {
                    jsonWriter.name("error_description").value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    private final void zzp(final String str, final String str2, final Map map, final byte[] bArr) {
        zzn("onNetworkRequest", new zzbzy() { // from class: com.google.android.gms.internal.ads.zzbzw
            @Override // com.google.android.gms.internal.ads.zzbzy
            public final void zza(JsonWriter jsonWriter) {
                zzbzz.zza(str, str2, map, bArr, jsonWriter);
            }
        });
    }

    private final void zzq(final Map map, final int i10) {
        zzn("onNetworkResponse", new zzbzy() { // from class: com.google.android.gms.internal.ads.zzbzu
            @Override // com.google.android.gms.internal.ads.zzbzy
            public final void zza(JsonWriter jsonWriter) {
                zzbzz.zzb(i10, map, jsonWriter);
            }
        });
    }

    private static void zzr(JsonWriter jsonWriter, Map map) throws IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!zzf.contains(str)) {
                if (entry.getValue() instanceof List) {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.NAME).value(str);
                        jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.VALUE).value(str2);
                        jsonWriter.endObject();
                    }
                } else if (entry.getValue() instanceof String) {
                    jsonWriter.beginObject();
                    jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.NAME).value(str);
                    jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.VALUE).value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    zzcaa.zzg("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                    break;
                }
            }
        }
        jsonWriter.endArray();
    }

    public final void zzc(HttpURLConnection httpURLConnection, byte[] bArr) {
        HashMap hashMap;
        if (!zzk()) {
            return;
        }
        if (httpURLConnection.getRequestProperties() == null) {
            hashMap = null;
        } else {
            hashMap = new HashMap(httpURLConnection.getRequestProperties());
        }
        zzp(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), hashMap, bArr);
    }

    public final void zzd(String str, String str2, Map map, byte[] bArr) {
        if (!zzk()) {
            return;
        }
        zzp(str, "GET", map, bArr);
    }

    public final void zze(HttpURLConnection httpURLConnection, int i10) {
        HashMap hashMap;
        if (!zzk()) {
            return;
        }
        String str = null;
        if (httpURLConnection.getHeaderFields() == null) {
            hashMap = null;
        } else {
            hashMap = new HashMap(httpURLConnection.getHeaderFields());
        }
        zzq(hashMap, i10);
        if (i10 >= 200 && i10 < 300) {
            return;
        }
        try {
            str = httpURLConnection.getResponseMessage();
        } catch (IOException e10) {
            zzcaa.zzj("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e10.getMessage())));
        }
        zzo(str);
    }

    public final void zzf(Map map, int i10) {
        if (!zzk()) {
            return;
        }
        zzq(map, i10);
        if (i10 >= 200 && i10 < 300) {
            return;
        }
        zzo(null);
    }

    public final void zzg(String str) {
        if (!zzk() || str == null) {
            return;
        }
        zzh(str.getBytes());
    }

    public final void zzh(final byte[] bArr) {
        zzn("onNetworkResponseBody", new zzbzy() { // from class: com.google.android.gms.internal.ads.zzbzx
            @Override // com.google.android.gms.internal.ads.zzbzy
            public final void zza(JsonWriter jsonWriter) {
                byte[] bArr2 = bArr;
                int i10 = zzbzz.zza;
                jsonWriter.name("params").beginObject();
                int length = bArr2.length;
                String encode = Base64Utils.encode(bArr2);
                if (length < 10000) {
                    jsonWriter.name("body").value(encode);
                } else {
                    String zze2 = zzbzt.zze(encode);
                    if (zze2 != null) {
                        jsonWriter.name("bodydigest").value(zze2);
                    }
                }
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }

    public zzbzz(String str) {
        List asList;
        if (!zzk()) {
            asList = new ArrayList();
        } else {
            asList = Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
        }
        this.zzg = asList;
    }
}
