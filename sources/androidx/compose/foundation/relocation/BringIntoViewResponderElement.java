package androidx.compose.foundation.relocation;

import p1.u0;
import qc.q;

/* compiled from: BringIntoViewResponder.kt */
/* loaded from: classes.dex */
final class BringIntoViewResponderElement extends u0<f> {

    /* renamed from: c  reason: collision with root package name */
    private final z.e f2195c;

    public BringIntoViewResponderElement(z.e eVar) {
        q.i(eVar, "responder");
        this.f2195c = eVar;
    }

    public boolean equals(Object obj) {
        if (this != obj && (!(obj instanceof BringIntoViewResponderElement) || !q.d(this.f2195c, ((BringIntoViewResponderElement) obj).f2195c))) {
            return false;
        }
        return true;
    }

    @Override // p1.u0
    public int hashCode() {
        return this.f2195c.hashCode();
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public f e() {
        return new f(this.f2195c);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(f fVar) {
        q.i(fVar, "node");
        fVar.O1(this.f2195c);
    }
}
