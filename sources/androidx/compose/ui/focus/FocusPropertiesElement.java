package androidx.compose.ui.focus;

import dc.w;
import p1.u0;

/* compiled from: FocusProperties.kt */
/* loaded from: classes.dex */
final class FocusPropertiesElement extends u0<j> {

    /* renamed from: c  reason: collision with root package name */
    private final pc.l<g, w> f2362c;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusPropertiesElement(pc.l<? super g, w> lVar) {
        qc.q.i(lVar, "scope");
        this.f2362c = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FocusPropertiesElement) && qc.q.d(this.f2362c, ((FocusPropertiesElement) obj).f2362c)) {
            return true;
        }
        return false;
    }

    @Override // p1.u0
    public int hashCode() {
        return this.f2362c.hashCode();
    }

    public String toString() {
        return "FocusPropertiesElement(scope=" + this.f2362c + ')';
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public j e() {
        return new j(this.f2362c);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(j jVar) {
        qc.q.i(jVar, "node");
        jVar.I1(this.f2362c);
    }
}
