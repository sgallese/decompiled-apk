package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzu;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f9144a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f9145b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9146c;

    /* renamed from: d  reason: collision with root package name */
    private final String f9147d;

    /* renamed from: e  reason: collision with root package name */
    private final String f9148e;

    /* renamed from: f  reason: collision with root package name */
    private final String f9149f;

    /* renamed from: g  reason: collision with root package name */
    private final String f9150g;

    /* renamed from: h  reason: collision with root package name */
    private final String f9151h;

    /* renamed from: i  reason: collision with root package name */
    private final String f9152i;

    /* renamed from: j  reason: collision with root package name */
    private final String f9153j;

    /* renamed from: k  reason: collision with root package name */
    private final String f9154k;

    /* renamed from: l  reason: collision with root package name */
    private final List f9155l;

    /* renamed from: m  reason: collision with root package name */
    private final List f9156m;

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f9157a;

        /* renamed from: b  reason: collision with root package name */
        private final long f9158b;

        /* renamed from: c  reason: collision with root package name */
        private final String f9159c;

        /* renamed from: d  reason: collision with root package name */
        private final String f9160d;

        /* renamed from: e  reason: collision with root package name */
        private final String f9161e;

        /* renamed from: f  reason: collision with root package name */
        private final zzu f9162f;

        /* renamed from: g  reason: collision with root package name */
        private final Long f9163g;

        /* renamed from: h  reason: collision with root package name */
        private final r f9164h;

        /* renamed from: i  reason: collision with root package name */
        private final t f9165i;

        /* renamed from: j  reason: collision with root package name */
        private final s f9166j;

        a(JSONObject jSONObject) throws JSONException {
            Long l10;
            r rVar;
            t tVar;
            this.f9157a = jSONObject.optString("formattedPrice");
            this.f9158b = jSONObject.optLong("priceAmountMicros");
            this.f9159c = jSONObject.optString("priceCurrencyCode");
            this.f9160d = jSONObject.optString("offerIdToken");
            this.f9161e = jSONObject.optString("offerId");
            jSONObject.optInt("offerType");
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    arrayList.add(optJSONArray.getString(i10));
                }
            }
            this.f9162f = zzu.zzj(arrayList);
            if (jSONObject.has("fullPriceMicros")) {
                l10 = Long.valueOf(jSONObject.optLong("fullPriceMicros"));
            } else {
                l10 = null;
            }
            this.f9163g = l10;
            JSONObject optJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            if (optJSONObject == null) {
                rVar = null;
            } else {
                rVar = new r(optJSONObject);
            }
            this.f9164h = rVar;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            if (optJSONObject2 == null) {
                tVar = null;
            } else {
                tVar = new t(optJSONObject2);
            }
            this.f9165i = tVar;
            JSONObject optJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            this.f9166j = optJSONObject3 != null ? new s(optJSONObject3) : null;
        }

        public String a() {
            return this.f9157a;
        }

        public long b() {
            return this.f9158b;
        }

        public final String c() {
            return this.f9160d;
        }
    }

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f9167a;

        /* renamed from: b  reason: collision with root package name */
        private final long f9168b;

        /* renamed from: c  reason: collision with root package name */
        private final String f9169c;

        /* renamed from: d  reason: collision with root package name */
        private final String f9170d;

        /* renamed from: e  reason: collision with root package name */
        private final int f9171e;

        /* renamed from: f  reason: collision with root package name */
        private final int f9172f;

        b(JSONObject jSONObject) {
            this.f9170d = jSONObject.optString("billingPeriod");
            this.f9169c = jSONObject.optString("priceCurrencyCode");
            this.f9167a = jSONObject.optString("formattedPrice");
            this.f9168b = jSONObject.optLong("priceAmountMicros");
            this.f9172f = jSONObject.optInt("recurrenceMode");
            this.f9171e = jSONObject.optInt("billingCycleCount");
        }

        public String a() {
            return this.f9167a;
        }

        public long b() {
            return this.f9168b;
        }
    }

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final List f9173a;

        c(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                    if (optJSONObject != null) {
                        arrayList.add(new b(optJSONObject));
                    }
                }
            }
            this.f9173a = arrayList;
        }

        public List<b> a() {
            return this.f9173a;
        }
    }

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f9174a;

        /* renamed from: b  reason: collision with root package name */
        private final String f9175b;

        /* renamed from: c  reason: collision with root package name */
        private final String f9176c;

        /* renamed from: d  reason: collision with root package name */
        private final c f9177d;

        /* renamed from: e  reason: collision with root package name */
        private final List f9178e;

        /* renamed from: f  reason: collision with root package name */
        private final q f9179f;

        d(JSONObject jSONObject) throws JSONException {
            this.f9174a = jSONObject.optString("basePlanId");
            String optString = jSONObject.optString("offerId");
            this.f9175b = true == optString.isEmpty() ? null : optString;
            this.f9176c = jSONObject.getString("offerIdToken");
            this.f9177d = new c(jSONObject.getJSONArray("pricingPhases"));
            JSONObject optJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f9179f = optJSONObject != null ? new q(optJSONObject) : null;
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    arrayList.add(optJSONArray.getString(i10));
                }
            }
            this.f9178e = arrayList;
        }

        public String a() {
            return this.f9176c;
        }

        public c b() {
            return this.f9177d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(String str) throws JSONException {
        ArrayList arrayList;
        this.f9144a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f9145b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f9146c = optString;
        String optString2 = jSONObject.optString(TaskFormActivity.TASK_TYPE_KEY);
        this.f9147d = optString2;
        if (!TextUtils.isEmpty(optString)) {
            if (!TextUtils.isEmpty(optString2)) {
                this.f9148e = jSONObject.optString("title");
                this.f9149f = jSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                this.f9150g = jSONObject.optString("description");
                this.f9152i = jSONObject.optString("packageDisplayName");
                this.f9153j = jSONObject.optString("iconUrl");
                this.f9151h = jSONObject.optString("skuDetailsToken");
                this.f9154k = jSONObject.optString("serializedDocid");
                JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                        arrayList2.add(new d(optJSONArray.getJSONObject(i10)));
                    }
                    this.f9155l = arrayList2;
                } else {
                    if (!optString2.equals("subs") && !optString2.equals("play_pass_subs")) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                    }
                    this.f9155l = arrayList;
                }
                JSONObject optJSONObject = this.f9145b.optJSONObject("oneTimePurchaseOfferDetails");
                JSONArray optJSONArray2 = this.f9145b.optJSONArray("oneTimePurchaseOfferDetailsList");
                ArrayList arrayList3 = new ArrayList();
                if (optJSONArray2 != null) {
                    for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                        arrayList3.add(new a(optJSONArray2.getJSONObject(i11)));
                    }
                    this.f9156m = arrayList3;
                    return;
                } else if (optJSONObject != null) {
                    arrayList3.add(new a(optJSONObject));
                    this.f9156m = arrayList3;
                    return;
                } else {
                    this.f9156m = null;
                    return;
                }
            }
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        throw new IllegalArgumentException("Product id cannot be empty.");
    }

    public a a() {
        List list = this.f9156m;
        if (list != null && !list.isEmpty()) {
            return (a) this.f9156m.get(0);
        }
        return null;
    }

    public String b() {
        return this.f9146c;
    }

    public String c() {
        return this.f9147d;
    }

    public List<d> d() {
        return this.f9155l;
    }

    public final String e() {
        return this.f9145b.optString("packageName");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return TextUtils.equals(this.f9144a, ((e) obj).f9144a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String f() {
        return this.f9151h;
    }

    public String g() {
        return this.f9154k;
    }

    public int hashCode() {
        return this.f9144a.hashCode();
    }

    public String toString() {
        return "ProductDetails{jsonString='" + this.f9144a + "', parsedJson=" + this.f9145b.toString() + ", productId='" + this.f9146c + "', productType='" + this.f9147d + "', title='" + this.f9148e + "', productDetailsToken='" + this.f9151h + "', subscriptionOfferDetails=" + String.valueOf(this.f9155l) + "}";
    }
}
