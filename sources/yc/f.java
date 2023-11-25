package yc;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: Regex.kt */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final String f26321a;

    /* renamed from: b  reason: collision with root package name */
    private final vc.f f26322b;

    public f(String str, vc.f fVar) {
        qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        qc.q.i(fVar, "range");
        this.f26321a = str;
        this.f26322b = fVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (qc.q.d(this.f26321a, fVar.f26321a) && qc.q.d(this.f26322b, fVar.f26322b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f26321a.hashCode() * 31) + this.f26322b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f26321a + ", range=" + this.f26322b + ')';
    }
}
