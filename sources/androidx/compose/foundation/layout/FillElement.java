package androidx.compose.foundation.layout;

import p1.u0;
import qc.q;

/* compiled from: Size.kt */
/* loaded from: classes.dex */
final class FillElement extends u0<f> {

    /* renamed from: f  reason: collision with root package name */
    public static final a f2012f = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private final w.m f2013c;

    /* renamed from: d  reason: collision with root package name */
    private final float f2014d;

    /* renamed from: e  reason: collision with root package name */
    private final String f2015e;

    /* compiled from: Size.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final FillElement a(float f10) {
            return new FillElement(w.m.Vertical, f10, "fillMaxHeight");
        }

        public final FillElement b(float f10) {
            return new FillElement(w.m.Both, f10, "fillMaxSize");
        }

        public final FillElement c(float f10) {
            return new FillElement(w.m.Horizontal, f10, "fillMaxWidth");
        }
    }

    public FillElement(w.m mVar, float f10, String str) {
        q.i(mVar, "direction");
        q.i(str, "inspectorName");
        this.f2013c = mVar;
        this.f2014d = f10;
        this.f2015e = str;
    }

    public boolean equals(Object obj) {
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        if (this.f2013c != fillElement.f2013c) {
            return false;
        }
        if (this.f2014d == fillElement.f2014d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return false;
    }

    @Override // p1.u0
    public int hashCode() {
        return (this.f2013c.hashCode() * 31) + Float.floatToIntBits(this.f2014d);
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public f e() {
        return new f(this.f2013c, this.f2014d);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(f fVar) {
        q.i(fVar, "node");
        fVar.I1(this.f2013c);
        fVar.J1(this.f2014d);
    }
}
