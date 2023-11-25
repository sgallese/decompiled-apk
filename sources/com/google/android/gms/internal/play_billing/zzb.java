package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.d;
import com.google.android.gms.wearable.WearableStatusCodes;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import x5.i;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes3.dex */
public final class zzb {
    public static final int zza = Runtime.getRuntime().availableProcessors();

    public static int zza(Intent intent, String str) {
        if (intent == null) {
            zzj("ProxyBillingActivity", "Got null intent!");
            return 0;
        }
        return zzl(intent.getExtras(), "ProxyBillingActivity");
    }

    public static int zzb(Bundle bundle, String str) {
        if (bundle == null) {
            zzj(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            zzi(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            zzj(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
            return 6;
        }
    }

    public static Bundle zzc(boolean z10, boolean z11, boolean z12, boolean z13, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z10) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    public static d zzd(Intent intent, String str) {
        if (intent == null) {
            zzj("BillingHelper", "Got null intent!");
            d.a c10 = d.c();
            c10.c(6);
            c10.b("An internal error occurred.");
            return c10.a();
        }
        d.a c11 = d.c();
        c11.c(zzb(intent.getExtras(), str));
        c11.b(zzf(intent.getExtras(), str));
        return c11.a();
    }

    public static i zze(Bundle bundle, String str) {
        if (bundle == null) {
            return new i(0, null);
        }
        return new i(zzl(bundle, "BillingClient"), bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN"));
    }

    public static String zzf(Bundle bundle, String str) {
        if (bundle == null) {
            zzj(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            zzi(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            zzj(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
            return "";
        }
    }

    public static String zzg(int i10) {
        return zza.zza(i10).toString();
    }

    public static List zzh(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList != null && stringArrayList2 != null) {
            zzi("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
            for (int i10 = 0; i10 < stringArrayList.size() && i10 < stringArrayList2.size(); i10++) {
                Purchase zzm = zzm(stringArrayList.get(i10), stringArrayList2.get(i10));
                if (zzm != null) {
                    arrayList.add(zzm);
                }
            }
        } else {
            Purchase zzm2 = zzm(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (zzm2 == null) {
                zzi("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(zzm2);
        }
        return arrayList;
    }

    public static void zzi(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (!str2.isEmpty()) {
                int i10 = 40000;
                while (!str2.isEmpty() && i10 > 0) {
                    int min = Math.min(str2.length(), Math.min((int) WearableStatusCodes.TARGET_NODE_NOT_CONNECTED, i10));
                    Log.v(str, str2.substring(0, min));
                    str2 = str2.substring(min);
                    i10 -= min;
                }
                return;
            }
            Log.v(str, str2);
        }
    }

    public static void zzj(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void zzk(String str, String str2, Throwable th) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    private static int zzl(Bundle bundle, String str) {
        if (bundle == null) {
            zzj(str, "Unexpected null bundle received!");
            return 0;
        }
        return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
    }

    private static Purchase zzm(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                return new Purchase(str, str2);
            } catch (JSONException e10) {
                zzj("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e10.toString()));
                return null;
            }
        }
        zzi("BillingHelper", "Received a null purchase data.");
        return null;
    }
}
