package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.m1;
import dc.w;
import p1.u0;
import qc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Size.kt */
/* loaded from: classes.dex */
public final class SizeElement extends u0<n> {

    /* renamed from: c  reason: collision with root package name */
    private final float f2034c;

    /* renamed from: d  reason: collision with root package name */
    private final float f2035d;

    /* renamed from: e  reason: collision with root package name */
    private final float f2036e;

    /* renamed from: f  reason: collision with root package name */
    private final float f2037f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f2038g;

    /* renamed from: h  reason: collision with root package name */
    private final pc.l<m1, w> f2039h;

    public /* synthetic */ SizeElement(float f10, float f11, float f12, float f13, boolean z10, pc.l lVar, qc.h hVar) {
        this(f10, f11, f12, f13, z10, lVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        if (j2.h.l(this.f2034c, sizeElement.f2034c) && j2.h.l(this.f2035d, sizeElement.f2035d) && j2.h.l(this.f2036e, sizeElement.f2036e) && j2.h.l(this.f2037f, sizeElement.f2037f) && this.f2038g == sizeElement.f2038g) {
            return true;
        }
        return false;
    }

    @Override // p1.u0
    public int hashCode() {
        return (((((((j2.h.m(this.f2034c) * 31) + j2.h.m(this.f2035d)) * 31) + j2.h.m(this.f2036e)) * 31) + j2.h.m(this.f2037f)) * 31) + t.k.a(this.f2038g);
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public n e() {
        return new n(this.f2034c, this.f2035d, this.f2036e, this.f2037f, this.f2038g, null);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(n nVar) {
        q.i(nVar, "node");
        nVar.N1(this.f2034c);
        nVar.M1(this.f2035d);
        nVar.L1(this.f2036e);
        nVar.K1(this.f2037f);
        nVar.J1(this.f2038g);
    }

    public /* synthetic */ SizeElement(float f10, float f11, float f12, float f13, boolean z10, pc.l lVar, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? j2.h.f18979m.b() : f10, (i10 & 2) != 0 ? j2.h.f18979m.b() : f11, (i10 & 4) != 0 ? j2.h.f18979m.b() : f12, (i10 & 8) != 0 ? j2.h.f18979m.b() : f13, z10, lVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SizeElement(float f10, float f11, float f12, float f13, boolean z10, pc.l<? super m1, w> lVar) {
        q.i(lVar, "inspectorInfo");
        this.f2034c = f10;
        this.f2035d = f11;
        this.f2036e = f12;
        this.f2037f = f13;
        this.f2038g = z10;
        this.f2039h = lVar;
    }
}
