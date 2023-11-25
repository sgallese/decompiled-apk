package androidx.compose.foundation;

import p1.u0;

/* compiled from: Focusable.kt */
/* loaded from: classes.dex */
final class FocusableElement extends u0<k> {

    /* renamed from: c  reason: collision with root package name */
    private final v.m f1835c;

    public FocusableElement(v.m mVar) {
        this.f1835c = mVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FocusableElement) && qc.q.d(this.f1835c, ((FocusableElement) obj).f1835c)) {
            return true;
        }
        return false;
    }

    @Override // p1.u0
    public int hashCode() {
        v.m mVar = this.f1835c;
        if (mVar != null) {
            return mVar.hashCode();
        }
        return 0;
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public k e() {
        return new k(this.f1835c);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(k kVar) {
        qc.q.i(kVar, "node");
        kVar.O1(this.f1835c);
    }
}
