package androidx.compose.ui.layout;

import n1.u;
import p1.u0;
import qc.q;

/* compiled from: LayoutId.kt */
/* loaded from: classes.dex */
final class LayoutIdElement extends u0<u> {

    /* renamed from: c  reason: collision with root package name */
    private final Object f2472c;

    public LayoutIdElement(Object obj) {
        q.i(obj, "layoutId");
        this.f2472c = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof LayoutIdElement) && q.d(this.f2472c, ((LayoutIdElement) obj).f2472c)) {
            return true;
        }
        return false;
    }

    @Override // p1.u0
    public int hashCode() {
        return this.f2472c.hashCode();
    }

    public String toString() {
        return "LayoutIdElement(layoutId=" + this.f2472c + ')';
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public u e() {
        return new u(this.f2472c);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(u uVar) {
        q.i(uVar, "node");
        uVar.I1(this.f2472c);
    }
}
