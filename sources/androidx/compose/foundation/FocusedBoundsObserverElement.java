package androidx.compose.foundation;

import dc.w;
import p1.u0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FocusedBounds.kt */
/* loaded from: classes.dex */
public final class FocusedBoundsObserverElement extends u0<o> {

    /* renamed from: c  reason: collision with root package name */
    private final pc.l<n1.s, w> f1841c;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusedBoundsObserverElement(pc.l<? super n1.s, w> lVar) {
        qc.q.i(lVar, "onPositioned");
        this.f1841c = lVar;
    }

    public boolean equals(Object obj) {
        FocusedBoundsObserverElement focusedBoundsObserverElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusedBoundsObserverElement) {
            focusedBoundsObserverElement = (FocusedBoundsObserverElement) obj;
        } else {
            focusedBoundsObserverElement = null;
        }
        if (focusedBoundsObserverElement == null) {
            return false;
        }
        return qc.q.d(this.f1841c, focusedBoundsObserverElement.f1841c);
    }

    @Override // p1.u0
    public int hashCode() {
        return this.f1841c.hashCode();
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public o e() {
        return new o(this.f1841c);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(o oVar) {
        qc.q.i(oVar, "node");
        oVar.K1(this.f1841c);
    }
}
