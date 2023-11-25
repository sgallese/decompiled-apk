package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.m1;
import dc.w;
import p1.u0;
import qc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AlignmentLine.kt */
/* loaded from: classes.dex */
public final class AlignmentLineOffsetDpElement extends u0<b> {

    /* renamed from: c  reason: collision with root package name */
    private final n1.a f2005c;

    /* renamed from: d  reason: collision with root package name */
    private final float f2006d;

    /* renamed from: e  reason: collision with root package name */
    private final float f2007e;

    /* renamed from: f  reason: collision with root package name */
    private final pc.l<m1, w> f2008f;

    public /* synthetic */ AlignmentLineOffsetDpElement(n1.a aVar, float f10, float f11, pc.l lVar, qc.h hVar) {
        this(aVar, f10, f11, lVar);
    }

    public boolean equals(Object obj) {
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AlignmentLineOffsetDpElement) {
            alignmentLineOffsetDpElement = (AlignmentLineOffsetDpElement) obj;
        } else {
            alignmentLineOffsetDpElement = null;
        }
        if (alignmentLineOffsetDpElement != null && q.d(this.f2005c, alignmentLineOffsetDpElement.f2005c) && j2.h.l(this.f2006d, alignmentLineOffsetDpElement.f2006d) && j2.h.l(this.f2007e, alignmentLineOffsetDpElement.f2007e)) {
            return true;
        }
        return false;
    }

    @Override // p1.u0
    public int hashCode() {
        return (((this.f2005c.hashCode() * 31) + j2.h.m(this.f2006d)) * 31) + j2.h.m(this.f2007e);
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public b e() {
        return new b(this.f2005c, this.f2006d, this.f2007e, null);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(b bVar) {
        q.i(bVar, "node");
        bVar.J1(this.f2005c);
        bVar.K1(this.f2006d);
        bVar.I1(this.f2007e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AlignmentLineOffsetDpElement(n1.a aVar, float f10, float f11, pc.l<? super m1, w> lVar) {
        q.i(aVar, "alignmentLine");
        q.i(lVar, "inspectorInfo");
        this.f2005c = aVar;
        this.f2006d = f10;
        this.f2007e = f11;
        this.f2008f = lVar;
        if (!((f10 >= 0.0f || j2.h.l(f10, j2.h.f18979m.b())) && (f11 >= 0.0f || j2.h.l(f11, j2.h.f18979m.b())))) {
            throw new IllegalArgumentException("Padding from alignment line must be a non-negative number".toString());
        }
    }
}
