package androidx.compose.foundation.layout;

import p1.u0;
import w.q;

/* compiled from: RowColumnImpl.kt */
/* loaded from: classes.dex */
public final class LayoutWeightElement extends u0<q> {

    /* renamed from: c  reason: collision with root package name */
    private final float f2017c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f2018d;

    public LayoutWeightElement(float f10, boolean z10) {
        this.f2017c = f10;
        this.f2018d = z10;
    }

    public boolean equals(Object obj) {
        LayoutWeightElement layoutWeightElement;
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (obj instanceof LayoutWeightElement) {
            layoutWeightElement = (LayoutWeightElement) obj;
        } else {
            layoutWeightElement = null;
        }
        if (layoutWeightElement == null) {
            return false;
        }
        if (this.f2017c == layoutWeightElement.f2017c) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && this.f2018d == layoutWeightElement.f2018d) {
            return true;
        }
        return false;
    }

    @Override // p1.u0
    public int hashCode() {
        return (Float.floatToIntBits(this.f2017c) * 31) + t.k.a(this.f2018d);
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public q e() {
        return new q(this.f2017c, this.f2018d);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(q qVar) {
        qc.q.i(qVar, "node");
        qVar.K1(this.f2017c);
        qVar.J1(this.f2018d);
    }
}
