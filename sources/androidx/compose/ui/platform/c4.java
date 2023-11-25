package androidx.compose.ui.platform;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: InspectableValue.kt */
/* loaded from: classes.dex */
public final class c4 {

    /* renamed from: a  reason: collision with root package name */
    private final String f2622a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f2623b;

    public c4(String str, Object obj) {
        qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f2622a = str;
        this.f2623b = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4)) {
            return false;
        }
        c4 c4Var = (c4) obj;
        if (qc.q.d(this.f2622a, c4Var.f2622a) && qc.q.d(this.f2623b, c4Var.f2623b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f2622a.hashCode() * 31;
        Object obj = this.f2623b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "ValueElement(name=" + this.f2622a + ", value=" + this.f2623b + ')';
    }
}
