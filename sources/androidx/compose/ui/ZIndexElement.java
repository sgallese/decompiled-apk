package androidx.compose.ui;

import p1.u0;
import qc.q;

/* compiled from: ZIndexModifier.kt */
/* loaded from: classes.dex */
public final class ZIndexElement extends u0<g> {

    /* renamed from: c  reason: collision with root package name */
    private final float f2316c;

    public ZIndexElement(float f10) {
        this.f2316c = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ZIndexElement) && Float.compare(this.f2316c, ((ZIndexElement) obj).f2316c) == 0) {
            return true;
        }
        return false;
    }

    @Override // p1.u0
    public int hashCode() {
        return Float.floatToIntBits(this.f2316c);
    }

    public String toString() {
        return "ZIndexElement(zIndex=" + this.f2316c + ')';
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public g e() {
        return new g(this.f2316c);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(g gVar) {
        q.i(gVar, "node");
        gVar.J1(this.f2316c);
    }
}
