package com.android.billingclient.api;

import android.text.TextUtils;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
@Deprecated
/* loaded from: classes.dex */
public class SkuDetails {

    /* renamed from: a  reason: collision with root package name */
    private final String f9072a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f9073b;

    public String a() {
        return this.f9073b.optString("productId");
    }

    public String b() {
        return this.f9073b.optString(TaskFormActivity.TASK_TYPE_KEY);
    }

    public int c() {
        return this.f9073b.optInt("offer_type");
    }

    public String d() {
        return this.f9073b.optString("offer_id");
    }

    public String e() {
        String optString = this.f9073b.optString("offerIdToken");
        if (optString.isEmpty()) {
            return this.f9073b.optString("offer_id_token");
        }
        return optString;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuDetails)) {
            return false;
        }
        return TextUtils.equals(this.f9072a, ((SkuDetails) obj).f9072a);
    }

    public final String f() {
        return this.f9073b.optString("packageName");
    }

    public String g() {
        return this.f9073b.optString("serializedDocid");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String h() {
        return this.f9073b.optString("skuDetailsToken");
    }

    public int hashCode() {
        return this.f9072a.hashCode();
    }

    public String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.f9072a));
    }
}
