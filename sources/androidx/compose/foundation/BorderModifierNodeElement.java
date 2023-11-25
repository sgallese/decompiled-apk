package androidx.compose.foundation;

import a1.e1;
import a1.q4;
import p1.u0;

/* compiled from: Border.kt */
/* loaded from: classes.dex */
public final class BorderModifierNodeElement extends u0<t.f> {

    /* renamed from: c  reason: collision with root package name */
    private final float f1827c;

    /* renamed from: d  reason: collision with root package name */
    private final e1 f1828d;

    /* renamed from: e  reason: collision with root package name */
    private final q4 f1829e;

    public /* synthetic */ BorderModifierNodeElement(float f10, e1 e1Var, q4 q4Var, qc.h hVar) {
        this(f10, e1Var, q4Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        if (j2.h.l(this.f1827c, borderModifierNodeElement.f1827c) && qc.q.d(this.f1828d, borderModifierNodeElement.f1828d) && qc.q.d(this.f1829e, borderModifierNodeElement.f1829e)) {
            return true;
        }
        return false;
    }

    @Override // p1.u0
    public int hashCode() {
        return (((j2.h.m(this.f1827c) * 31) + this.f1828d.hashCode()) * 31) + this.f1829e.hashCode();
    }

    public String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) j2.h.n(this.f1827c)) + ", brush=" + this.f1828d + ", shape=" + this.f1829e + ')';
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public t.f e() {
        return new t.f(this.f1827c, this.f1828d, this.f1829e, null);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(t.f fVar) {
        qc.q.i(fVar, "node");
        fVar.V1(this.f1827c);
        fVar.U1(this.f1828d);
        fVar.z0(this.f1829e);
    }

    private BorderModifierNodeElement(float f10, e1 e1Var, q4 q4Var) {
        qc.q.i(e1Var, "brush");
        qc.q.i(q4Var, "shape");
        this.f1827c = f10;
        this.f1828d = e1Var;
        this.f1829e = q4Var;
    }
}
