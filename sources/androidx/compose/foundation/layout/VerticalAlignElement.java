package androidx.compose.foundation.layout;

import p1.u0;
import qc.q;
import v0.b;
import w.f0;

/* compiled from: RowColumnImpl.kt */
/* loaded from: classes.dex */
public final class VerticalAlignElement extends u0<f0> {

    /* renamed from: c  reason: collision with root package name */
    private final b.c f2042c;

    public VerticalAlignElement(b.c cVar) {
        q.i(cVar, "alignment");
        this.f2042c = cVar;
    }

    public boolean equals(Object obj) {
        VerticalAlignElement verticalAlignElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof VerticalAlignElement) {
            verticalAlignElement = (VerticalAlignElement) obj;
        } else {
            verticalAlignElement = null;
        }
        if (verticalAlignElement == null) {
            return false;
        }
        return q.d(this.f2042c, verticalAlignElement.f2042c);
    }

    @Override // p1.u0
    public int hashCode() {
        return this.f2042c.hashCode();
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public f0 e() {
        return new f0(this.f2042c);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(f0 f0Var) {
        q.i(f0Var, "node");
        f0Var.J1(this.f2042c);
    }
}
