package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzesg implements zzesj {
    private final zzfyo zza;
    private final Context zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzesg(zzfyo zzfyoVar, Context context) {
        this.zza = zzfyoVar;
        this.zzb = context;
    }

    public static Bundle zzc(Context context, JSONArray jSONArray) {
        int i10;
        SharedPreferences sharedPreferences;
        String str;
        Bundle bundle = new Bundle();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i11);
            String optString = optJSONObject.optString("bk");
            String optString2 = optJSONObject.optString("sk");
            int optInt = optJSONObject.optInt(TaskFormActivity.TASK_TYPE_KEY, -1);
            if (optInt != 0) {
                if (optInt != 1) {
                    if (optInt != 2) {
                        i10 = 0;
                    } else {
                        i10 = 3;
                    }
                } else {
                    i10 = 2;
                }
            } else {
                i10 = 1;
            }
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && i10 != 0) {
                String[] split = optString2.split("/");
                int length = split.length;
                Object obj = null;
                if (length <= 2 && length != 0) {
                    if (length == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str = split[0];
                    } else {
                        sharedPreferences = context.getSharedPreferences(split[0], 0);
                        str = split[1];
                    }
                    obj = sharedPreferences.getAll().get(str);
                }
                if (obj != null) {
                    int i12 = i10 - 1;
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(optString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(optString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(optString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(optString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(optString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 37;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzese
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzesg.this.zzd();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzesi zzd() throws Exception {
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfX);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            final Bundle zzc = zzc(this.zzb, new JSONArray(str));
            return new zzesi() { // from class: com.google.android.gms.internal.ads.zzesf
                @Override // com.google.android.gms.internal.ads.zzesi
                public final void zzj(Object obj) {
                    ((Bundle) obj).putBundle("shared_pref", zzc);
                }
            };
        } catch (JSONException e10) {
            zzcaa.zzf("JSON parsing error", e10);
            return null;
        }
    }
}
