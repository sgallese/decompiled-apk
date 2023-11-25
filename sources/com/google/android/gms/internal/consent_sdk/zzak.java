package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes3.dex */
public final class zzak implements zzg {
    private final Application zza;
    private final zzam zzb;
    private final Executor zzc;

    public zzak(Application application, zzam zzamVar, Executor executor) {
        this.zza = application;
        this.zzb = zzamVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzg
    public final Executor zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzg
    public final boolean zzb(String str, JSONObject jSONObject) {
        char c10;
        String str2;
        String str3;
        int hashCode = str.hashCode();
        if (hashCode != 94746189) {
            if (hashCode == 113399775 && str.equals("write")) {
                c10 = 0;
            }
            c10 = 65535;
        } else {
            if (str.equals("clear")) {
                c10 = 1;
            }
            c10 = 65535;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                return false;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("keys");
            if (optJSONArray != null && optJSONArray.length() != 0) {
                HashSet hashSet = new HashSet();
                int length = optJSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    String optString = optJSONArray.optString(i10);
                    if (TextUtils.isEmpty(optString)) {
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append("Action[clear]: empty key at index: ");
                        sb2.append(i10);
                        Log.d("UserMessagingPlatform", sb2.toString());
                    } else {
                        hashSet.add(optString);
                    }
                }
                zzca.zzb(this.zza, hashSet);
            } else {
                String valueOf = String.valueOf(jSONObject.toString());
                if (valueOf.length() != 0) {
                    str3 = "Action[clear]: wrong args.".concat(valueOf);
                } else {
                    str3 = new String("Action[clear]: wrong args.");
                }
                Log.d("UserMessagingPlatform", str3);
            }
            return true;
        }
        zzbz zzbzVar = new zzbz(this.zza);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            String valueOf2 = String.valueOf(opt);
            StringBuilder sb3 = new StringBuilder(String.valueOf(next).length() + 23 + valueOf2.length());
            sb3.append("Writing to storage: [");
            sb3.append(next);
            sb3.append("] ");
            sb3.append(valueOf2);
            Log.d("UserMessagingPlatform", sb3.toString());
            if (zzbzVar.zzc(next, opt)) {
                this.zzb.zzc().add(next);
            } else {
                String valueOf3 = String.valueOf(next);
                if (valueOf3.length() != 0) {
                    str2 = "Failed writing key: ".concat(valueOf3);
                } else {
                    str2 = new String("Failed writing key: ");
                }
                Log.d("UserMessagingPlatform", str2);
            }
        }
        this.zzb.zze();
        zzbzVar.zzb();
        return true;
    }
}
