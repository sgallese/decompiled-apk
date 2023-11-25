package x5;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.List;

/* compiled from: com.android.billingclient:billing-ktx@@6.0.1 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final com.android.billingclient.api.d f25823a;

    /* renamed from: b  reason: collision with root package name */
    private final List f25824b;

    public k(@RecentlyNonNull com.android.billingclient.api.d dVar, List<com.android.billingclient.api.e> list) {
        qc.q.i(dVar, "billingResult");
        this.f25823a = dVar;
        this.f25824b = list;
    }

    @RecentlyNullable
    public final List<com.android.billingclient.api.e> a() {
        return this.f25824b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (qc.q.d(this.f25823a, kVar.f25823a) && qc.q.d(this.f25824b, kVar.f25824b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f25823a.hashCode() * 31;
        List list = this.f25824b;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "ProductDetailsResult(billingResult=" + this.f25823a + ", productDetailsList=" + this.f25824b + ")";
    }
}
