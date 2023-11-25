package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.d;
import com.google.android.gms.internal.play_billing.zzb;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
public final class v {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static u a(Bundle bundle, String str, String str2) {
        d dVar = l.f9219j;
        if (bundle == null) {
            zzb.zzj("BillingClient", String.format("%s got null owned items list", str2));
            return new u(dVar, 54);
        }
        int zzb = zzb.zzb(bundle, "BillingClient");
        String zzf = zzb.zzf(bundle, "BillingClient");
        d.a c10 = d.c();
        c10.c(zzb);
        c10.b(zzf);
        d a10 = c10.a();
        if (zzb != 0) {
            zzb.zzj("BillingClient", String.format("%s failed. Response code: %s", str2, Integer.valueOf(zzb)));
            return new u(a10, 23);
        } else if (bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundle.containsKey("INAPP_PURCHASE_DATA_LIST") && bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            if (stringArrayList == null) {
                zzb.zzj("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", str2));
                return new u(dVar, 56);
            } else if (stringArrayList2 == null) {
                zzb.zzj("BillingClient", String.format("Bundle returned from %s contains null purchases list.", str2));
                return new u(dVar, 57);
            } else if (stringArrayList3 == null) {
                zzb.zzj("BillingClient", String.format("Bundle returned from %s contains null signatures list.", str2));
                return new u(dVar, 58);
            } else {
                return new u(l.f9221l, 1);
            }
        } else {
            zzb.zzj("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", str2));
            return new u(dVar, 55);
        }
    }
}
