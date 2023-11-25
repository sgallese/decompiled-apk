package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdlk {
    private final Executor zza;
    private final zzdlf zzb;

    public zzdlk(Executor executor, zzdlf zzdlfVar) {
        this.zza = executor;
        this.zzb = zzdlfVar;
    }

    public final com.google.common.util.concurrent.a zza(JSONObject jSONObject, String str) {
        com.google.common.util.concurrent.a zzh;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzfye.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
            if (optJSONObject == null) {
                zzh = zzfye.zzh(null);
            } else {
                final String optString = optJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                if (optString == null) {
                    zzh = zzfye.zzh(null);
                } else {
                    String optString2 = optJSONObject.optString(TaskFormActivity.TASK_TYPE_KEY);
                    if ("string".equals(optString2)) {
                        zzh = zzfye.zzh(new zzdlj(optString, optJSONObject.optString("string_value")));
                    } else if ("image".equals(optString2)) {
                        zzh = zzfye.zzm(this.zzb.zze(optJSONObject, "image_value"), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzdlh
                            @Override // com.google.android.gms.internal.ads.zzfqw
                            public final Object apply(Object obj) {
                                return new zzdlj(optString, (zzbei) obj);
                            }
                        }, this.zza);
                    } else {
                        zzh = zzfye.zzh(null);
                    }
                }
            }
            arrayList.add(zzh);
        }
        return zzfye.zzm(zzfye.zzd(arrayList), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzdli
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzdlj zzdljVar : (List) obj) {
                    if (zzdljVar != null) {
                        arrayList2.add(zzdljVar);
                    }
                }
                return arrayList2;
            }
        }, this.zza);
    }
}
