package com.android.billingclient.api;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
public final class s {
    /* JADX INFO: Access modifiers changed from: package-private */
    public s(JSONObject jSONObject) throws JSONException {
        jSONObject.getInt("maximumQuantity");
        jSONObject.getInt("remainingQuantity");
    }
}
