package androidx.compose.ui.focus;

import p1.u0;

/* compiled from: FocusRequesterModifier.kt */
/* loaded from: classes.dex */
final class FocusRequesterElement extends u0<n> {

    /* renamed from: c  reason: collision with root package name */
    private final k f2363c;

    public FocusRequesterElement(k kVar) {
        qc.q.i(kVar, "focusRequester");
        this.f2363c = kVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FocusRequesterElement) && qc.q.d(this.f2363c, ((FocusRequesterElement) obj).f2363c)) {
            return true;
        }
        return false;
    }

    @Override // p1.u0
    public int hashCode() {
        return this.f2363c.hashCode();
    }

    public String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f2363c + ')';
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public n e() {
        return new n(this.f2363c);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(n nVar) {
        qc.q.i(nVar, "node");
        nVar.I1().d().v(nVar);
        nVar.J1(this.f2363c);
        nVar.I1().d().d(nVar);
    }
}
