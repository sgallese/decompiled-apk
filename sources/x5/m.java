package x5;

import androidx.annotation.RecentlyNonNull;
import com.android.billingclient.api.Purchase;
import java.util.List;

/* compiled from: com.android.billingclient:billing-ktx@@6.0.1 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final com.android.billingclient.api.d f25825a;

    /* renamed from: b  reason: collision with root package name */
    private final List f25826b;

    public m(@RecentlyNonNull com.android.billingclient.api.d dVar, @RecentlyNonNull List<? extends Purchase> list) {
        qc.q.i(dVar, "billingResult");
        qc.q.i(list, "purchasesList");
        this.f25825a = dVar;
        this.f25826b = list;
    }

    public final com.android.billingclient.api.d a() {
        return this.f25825a;
    }

    public final List<Purchase> b() {
        return this.f25826b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (qc.q.d(this.f25825a, mVar.f25825a) && qc.q.d(this.f25826b, mVar.f25826b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f25825a.hashCode() * 31) + this.f25826b.hashCode();
    }

    public String toString() {
        return "PurchasesResult(billingResult=" + this.f25825a + ", purchasesList=" + this.f25826b + ")";
    }
}
