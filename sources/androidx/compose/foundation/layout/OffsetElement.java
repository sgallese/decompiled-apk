package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.m1;
import dc.w;
import p1.u0;
import qc.q;

/* compiled from: Offset.kt */
/* loaded from: classes.dex */
final class OffsetElement extends u0<h> {

    /* renamed from: c  reason: collision with root package name */
    private final float f2019c;

    /* renamed from: d  reason: collision with root package name */
    private final float f2020d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f2021e;

    /* renamed from: f  reason: collision with root package name */
    private final pc.l<m1, w> f2022f;

    public /* synthetic */ OffsetElement(float f10, float f11, boolean z10, pc.l lVar, qc.h hVar) {
        this(f10, f11, z10, lVar);
    }

    public boolean equals(Object obj) {
        OffsetElement offsetElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetElement) {
            offsetElement = (OffsetElement) obj;
        } else {
            offsetElement = null;
        }
        if (offsetElement != null && j2.h.l(this.f2019c, offsetElement.f2019c) && j2.h.l(this.f2020d, offsetElement.f2020d) && this.f2021e == offsetElement.f2021e) {
            return true;
        }
        return false;
    }

    @Override // p1.u0
    public int hashCode() {
        return (((j2.h.m(this.f2019c) * 31) + j2.h.m(this.f2020d)) * 31) + t.k.a(this.f2021e);
    }

    public String toString() {
        return "OffsetModifierElement(x=" + ((Object) j2.h.n(this.f2019c)) + ", y=" + ((Object) j2.h.n(this.f2020d)) + ", rtlAware=" + this.f2021e + ')';
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public h e() {
        return new h(this.f2019c, this.f2020d, this.f2021e, null);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(h hVar) {
        q.i(hVar, "node");
        hVar.M1(this.f2019c);
        hVar.N1(this.f2020d);
        hVar.L1(this.f2021e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private OffsetElement(float f10, float f11, boolean z10, pc.l<? super m1, w> lVar) {
        q.i(lVar, "inspectorInfo");
        this.f2019c = f10;
        this.f2020d = f11;
        this.f2021e = z10;
        this.f2022f = lVar;
    }
}
