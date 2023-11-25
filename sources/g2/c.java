package g2;

import a1.e1;
import a1.m4;
import a1.p1;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextForegroundStyle.kt */
/* loaded from: classes.dex */
public final class c implements o {

    /* renamed from: b  reason: collision with root package name */
    private final m4 f16016b;

    /* renamed from: c  reason: collision with root package name */
    private final float f16017c;

    public c(m4 m4Var, float f10) {
        qc.q.i(m4Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f16016b = m4Var;
        this.f16017c = f10;
    }

    @Override // g2.o
    public /* synthetic */ o a(pc.a aVar) {
        return n.b(this, aVar);
    }

    @Override // g2.o
    public e1 b() {
        return this.f16016b;
    }

    @Override // g2.o
    public /* synthetic */ o c(o oVar) {
        return n.a(this, oVar);
    }

    @Override // g2.o
    public float d() {
        return this.f16017c;
    }

    @Override // g2.o
    public long e() {
        return p1.f146b.e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (qc.q.d(this.f16016b, cVar.f16016b) && Float.compare(this.f16017c, cVar.f16017c) == 0) {
            return true;
        }
        return false;
    }

    public final m4 f() {
        return this.f16016b;
    }

    public int hashCode() {
        return (this.f16016b.hashCode() * 31) + Float.floatToIntBits(this.f16017c);
    }

    public String toString() {
        return "BrushStyle(value=" + this.f16016b + ", alpha=" + this.f16017c + ')';
    }
}
