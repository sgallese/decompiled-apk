package x5;

import androidx.annotation.RecentlyNonNull;

/* compiled from: com.android.billingclient:billing-ktx@@6.0.1 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final com.android.billingclient.api.d f25819a;

    /* renamed from: b  reason: collision with root package name */
    private final String f25820b;

    public h(@RecentlyNonNull com.android.billingclient.api.d dVar, String str) {
        qc.q.i(dVar, "billingResult");
        this.f25819a = dVar;
        this.f25820b = str;
    }

    public final com.android.billingclient.api.d a() {
        return this.f25819a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (qc.q.d(this.f25819a, hVar.f25819a) && qc.q.d(this.f25820b, hVar.f25820b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f25819a.hashCode() * 31;
        String str = this.f25820b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "ConsumeResult(billingResult=" + this.f25819a + ", purchaseToken=" + this.f25820b + ")";
    }
}
