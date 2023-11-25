package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.m1;
import dc.w;
import p1.u0;
import qc.q;

/* compiled from: Box.kt */
/* loaded from: classes.dex */
final class BoxChildDataElement extends u0<c> {

    /* renamed from: c  reason: collision with root package name */
    private final v0.b f2009c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f2010d;

    /* renamed from: e  reason: collision with root package name */
    private final pc.l<m1, w> f2011e;

    /* JADX WARN: Multi-variable type inference failed */
    public BoxChildDataElement(v0.b bVar, boolean z10, pc.l<? super m1, w> lVar) {
        q.i(bVar, "alignment");
        q.i(lVar, "inspectorInfo");
        this.f2009c = bVar;
        this.f2010d = z10;
        this.f2011e = lVar;
    }

    public boolean equals(Object obj) {
        BoxChildDataElement boxChildDataElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof BoxChildDataElement) {
            boxChildDataElement = (BoxChildDataElement) obj;
        } else {
            boxChildDataElement = null;
        }
        if (boxChildDataElement != null && q.d(this.f2009c, boxChildDataElement.f2009c) && this.f2010d == boxChildDataElement.f2010d) {
            return true;
        }
        return false;
    }

    @Override // p1.u0
    public int hashCode() {
        return (this.f2009c.hashCode() * 31) + t.k.a(this.f2010d);
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public c e() {
        return new c(this.f2009c, this.f2010d);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(c cVar) {
        q.i(cVar, "node");
        cVar.L1(this.f2009c);
        cVar.M1(this.f2010d);
    }
}
