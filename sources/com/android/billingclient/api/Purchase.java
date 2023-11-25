package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
public class Purchase {

    /* renamed from: a  reason: collision with root package name */
    private final String f9069a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9070b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f9071c;

    public Purchase(String str, String str2) throws JSONException {
        this.f9069a = str;
        this.f9070b = str2;
        this.f9071c = new JSONObject(str);
    }

    private final ArrayList j() {
        ArrayList arrayList = new ArrayList();
        if (this.f9071c.has("productIds")) {
            JSONArray optJSONArray = this.f9071c.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    arrayList.add(optJSONArray.optString(i10));
                }
            }
        } else if (this.f9071c.has("productId")) {
            arrayList.add(this.f9071c.optString("productId"));
        }
        return arrayList;
    }

    public String a() {
        String optString = this.f9071c.optString("orderId");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        return optString;
    }

    public String b() {
        return this.f9069a;
    }

    public List<String> c() {
        return j();
    }

    public int d() {
        if (this.f9071c.optInt("purchaseState", 1) != 4) {
            return 1;
        }
        return 2;
    }

    public long e() {
        return this.f9071c.optLong("purchaseTime");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        if (TextUtils.equals(this.f9069a, purchase.b()) && TextUtils.equals(this.f9070b, purchase.g())) {
            return true;
        }
        return false;
    }

    public String f() {
        JSONObject jSONObject = this.f9071c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public String g() {
        return this.f9070b;
    }

    public boolean h() {
        return this.f9071c.optBoolean("acknowledged", true);
    }

    public int hashCode() {
        return this.f9069a.hashCode();
    }

    public boolean i() {
        return this.f9071c.optBoolean("autoRenewing");
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f9069a));
    }
}
