package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbnf {
    private static final Charset zzc = Charset.forName("UTF-8");
    public static final zzbnc zza = new zzbne();
    public static final zzbna zzb = new zzbna() { // from class: com.google.android.gms.internal.ads.zzbnd
        @Override // com.google.android.gms.internal.ads.zzbna
        public final Object zza(JSONObject jSONObject) {
            return zzbnf.zza(jSONObject);
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ InputStream zza(JSONObject jSONObject) throws JSONException {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(zzc));
    }
}
