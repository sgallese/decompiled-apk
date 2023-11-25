package androidx.compose.ui.graphics;

import a1.l4;
import a1.p1;
import a1.q4;
import p1.u0;
import qc.h;
import qc.q;

/* compiled from: GraphicsLayerModifier.kt */
/* loaded from: classes.dex */
final class GraphicsLayerElement extends u0<f> {

    /* renamed from: c  reason: collision with root package name */
    private final float f2420c;

    /* renamed from: d  reason: collision with root package name */
    private final float f2421d;

    /* renamed from: e  reason: collision with root package name */
    private final float f2422e;

    /* renamed from: f  reason: collision with root package name */
    private final float f2423f;

    /* renamed from: g  reason: collision with root package name */
    private final float f2424g;

    /* renamed from: h  reason: collision with root package name */
    private final float f2425h;

    /* renamed from: i  reason: collision with root package name */
    private final float f2426i;

    /* renamed from: j  reason: collision with root package name */
    private final float f2427j;

    /* renamed from: k  reason: collision with root package name */
    private final float f2428k;

    /* renamed from: l  reason: collision with root package name */
    private final float f2429l;

    /* renamed from: m  reason: collision with root package name */
    private final long f2430m;

    /* renamed from: n  reason: collision with root package name */
    private final q4 f2431n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f2432o;

    /* renamed from: p  reason: collision with root package name */
    private final long f2433p;

    /* renamed from: q  reason: collision with root package name */
    private final long f2434q;

    /* renamed from: r  reason: collision with root package name */
    private final int f2435r;

    public /* synthetic */ GraphicsLayerElement(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, q4 q4Var, boolean z10, l4 l4Var, long j11, long j12, int i10, h hVar) {
        this(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, q4Var, z10, l4Var, j11, j12, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        if (Float.compare(this.f2420c, graphicsLayerElement.f2420c) == 0 && Float.compare(this.f2421d, graphicsLayerElement.f2421d) == 0 && Float.compare(this.f2422e, graphicsLayerElement.f2422e) == 0 && Float.compare(this.f2423f, graphicsLayerElement.f2423f) == 0 && Float.compare(this.f2424g, graphicsLayerElement.f2424g) == 0 && Float.compare(this.f2425h, graphicsLayerElement.f2425h) == 0 && Float.compare(this.f2426i, graphicsLayerElement.f2426i) == 0 && Float.compare(this.f2427j, graphicsLayerElement.f2427j) == 0 && Float.compare(this.f2428k, graphicsLayerElement.f2428k) == 0 && Float.compare(this.f2429l, graphicsLayerElement.f2429l) == 0 && g.e(this.f2430m, graphicsLayerElement.f2430m) && q.d(this.f2431n, graphicsLayerElement.f2431n) && this.f2432o == graphicsLayerElement.f2432o && q.d(null, null) && p1.q(this.f2433p, graphicsLayerElement.f2433p) && p1.q(this.f2434q, graphicsLayerElement.f2434q) && b.e(this.f2435r, graphicsLayerElement.f2435r)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p1.u0
    public int hashCode() {
        int floatToIntBits = ((((((((((((((((((((((Float.floatToIntBits(this.f2420c) * 31) + Float.floatToIntBits(this.f2421d)) * 31) + Float.floatToIntBits(this.f2422e)) * 31) + Float.floatToIntBits(this.f2423f)) * 31) + Float.floatToIntBits(this.f2424g)) * 31) + Float.floatToIntBits(this.f2425h)) * 31) + Float.floatToIntBits(this.f2426i)) * 31) + Float.floatToIntBits(this.f2427j)) * 31) + Float.floatToIntBits(this.f2428k)) * 31) + Float.floatToIntBits(this.f2429l)) * 31) + g.h(this.f2430m)) * 31) + this.f2431n.hashCode()) * 31;
        boolean z10 = this.f2432o;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((((((((floatToIntBits + i10) * 31) + 0) * 31) + p1.w(this.f2433p)) * 31) + p1.w(this.f2434q)) * 31) + b.f(this.f2435r);
    }

    public String toString() {
        return "GraphicsLayerElement(scaleX=" + this.f2420c + ", scaleY=" + this.f2421d + ", alpha=" + this.f2422e + ", translationX=" + this.f2423f + ", translationY=" + this.f2424g + ", shadowElevation=" + this.f2425h + ", rotationX=" + this.f2426i + ", rotationY=" + this.f2427j + ", rotationZ=" + this.f2428k + ", cameraDistance=" + this.f2429l + ", transformOrigin=" + ((Object) g.i(this.f2430m)) + ", shape=" + this.f2431n + ", clip=" + this.f2432o + ", renderEffect=" + ((Object) null) + ", ambientShadowColor=" + ((Object) p1.x(this.f2433p)) + ", spotShadowColor=" + ((Object) p1.x(this.f2434q)) + ", compositingStrategy=" + ((Object) b.g(this.f2435r)) + ')';
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public f e() {
        return new f(this.f2420c, this.f2421d, this.f2422e, this.f2423f, this.f2424g, this.f2425h, this.f2426i, this.f2427j, this.f2428k, this.f2429l, this.f2430m, this.f2431n, this.f2432o, null, this.f2433p, this.f2434q, this.f2435r, null);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(f fVar) {
        q.i(fVar, "node");
        fVar.q(this.f2420c);
        fVar.k(this.f2421d);
        fVar.c(this.f2422e);
        fVar.u(this.f2423f);
        fVar.i(this.f2424g);
        fVar.C(this.f2425h);
        fVar.x(this.f2426i);
        fVar.e(this.f2427j);
        fVar.h(this.f2428k);
        fVar.v(this.f2429l);
        fVar.L0(this.f2430m);
        fVar.z0(this.f2431n);
        fVar.G0(this.f2432o);
        fVar.l(null);
        fVar.x0(this.f2433p);
        fVar.N0(this.f2434q);
        fVar.m(this.f2435r);
        fVar.R1();
    }

    private GraphicsLayerElement(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, q4 q4Var, boolean z10, l4 l4Var, long j11, long j12, int i10) {
        q.i(q4Var, "shape");
        this.f2420c = f10;
        this.f2421d = f11;
        this.f2422e = f12;
        this.f2423f = f13;
        this.f2424g = f14;
        this.f2425h = f15;
        this.f2426i = f16;
        this.f2427j = f17;
        this.f2428k = f18;
        this.f2429l = f19;
        this.f2430m = j10;
        this.f2431n = q4Var;
        this.f2432o = z10;
        this.f2433p = j11;
        this.f2434q = j12;
        this.f2435r = i10;
    }
}
