package androidx.compose.foundation.relocation;

import p1.u0;
import qc.q;

/* compiled from: BringIntoViewRequester.kt */
/* loaded from: classes.dex */
final class BringIntoViewRequesterElement extends u0<d> {

    /* renamed from: c  reason: collision with root package name */
    private final z.d f2194c;

    public BringIntoViewRequesterElement(z.d dVar) {
        q.i(dVar, "requester");
        this.f2194c = dVar;
    }

    public boolean equals(Object obj) {
        if (this != obj && (!(obj instanceof BringIntoViewRequesterElement) || !q.d(this.f2194c, ((BringIntoViewRequesterElement) obj).f2194c))) {
            return false;
        }
        return true;
    }

    @Override // p1.u0
    public int hashCode() {
        return this.f2194c.hashCode();
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public d e() {
        return new d(this.f2194c);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(d dVar) {
        q.i(dVar, "node");
        dVar.N1(this.f2194c);
    }
}
