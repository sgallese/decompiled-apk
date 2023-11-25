package androidx.compose.foundation.layout;

import p1.u0;
import qc.q;
import v0.b;

/* compiled from: RowColumnImpl.kt */
/* loaded from: classes.dex */
public final class HorizontalAlignElement extends u0<w.n> {

    /* renamed from: c  reason: collision with root package name */
    private final b.InterfaceC0571b f2016c;

    public HorizontalAlignElement(b.InterfaceC0571b interfaceC0571b) {
        q.i(interfaceC0571b, "horizontal");
        this.f2016c = interfaceC0571b;
    }

    public boolean equals(Object obj) {
        HorizontalAlignElement horizontalAlignElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof HorizontalAlignElement) {
            horizontalAlignElement = (HorizontalAlignElement) obj;
        } else {
            horizontalAlignElement = null;
        }
        if (horizontalAlignElement == null) {
            return false;
        }
        return q.d(this.f2016c, horizontalAlignElement.f2016c);
    }

    @Override // p1.u0
    public int hashCode() {
        return this.f2016c.hashCode();
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public w.n e() {
        return new w.n(this.f2016c);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(w.n nVar) {
        q.i(nVar, "node");
        nVar.J1(this.f2016c);
    }
}
