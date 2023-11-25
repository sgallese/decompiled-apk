package androidx.compose.foundation.layout;

import p1.u0;
import qc.q;

/* compiled from: Size.kt */
/* loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends u0<o> {

    /* renamed from: c  reason: collision with root package name */
    private final float f2040c;

    /* renamed from: d  reason: collision with root package name */
    private final float f2041d;

    public /* synthetic */ UnspecifiedConstraintsElement(float f10, float f11, qc.h hVar) {
        this(f10, f11);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        if (!j2.h.l(this.f2040c, unspecifiedConstraintsElement.f2040c) || !j2.h.l(this.f2041d, unspecifiedConstraintsElement.f2041d)) {
            return false;
        }
        return true;
    }

    @Override // p1.u0
    public int hashCode() {
        return (j2.h.m(this.f2040c) * 31) + j2.h.m(this.f2041d);
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public o e() {
        return new o(this.f2040c, this.f2041d, null);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(o oVar) {
        q.i(oVar, "node");
        oVar.J1(this.f2040c);
        oVar.I1(this.f2041d);
    }

    private UnspecifiedConstraintsElement(float f10, float f11) {
        this.f2040c = f10;
        this.f2041d = f11;
    }
}
