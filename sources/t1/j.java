package t1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: SemanticsProperties.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final pc.a<Float> f23434a;

    /* renamed from: b  reason: collision with root package name */
    private final pc.a<Float> f23435b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f23436c;

    public j(pc.a<Float> aVar, pc.a<Float> aVar2, boolean z10) {
        qc.q.i(aVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        qc.q.i(aVar2, "maxValue");
        this.f23434a = aVar;
        this.f23435b = aVar2;
        this.f23436c = z10;
    }

    public final pc.a<Float> a() {
        return this.f23435b;
    }

    public final boolean b() {
        return this.f23436c;
    }

    public final pc.a<Float> c() {
        return this.f23434a;
    }

    public String toString() {
        return "ScrollAxisRange(value=" + this.f23434a.invoke().floatValue() + ", maxValue=" + this.f23435b.invoke().floatValue() + ", reverseScrolling=" + this.f23436c + ')';
    }
}
