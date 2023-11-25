package a2;

/* compiled from: FontFamilyResolver.kt */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a  reason: collision with root package name */
    private final l f343a;

    /* renamed from: b  reason: collision with root package name */
    private final c0 f344b;

    /* renamed from: c  reason: collision with root package name */
    private final int f345c;

    /* renamed from: d  reason: collision with root package name */
    private final int f346d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f347e;

    public /* synthetic */ x0(l lVar, c0 c0Var, int i10, int i11, Object obj, qc.h hVar) {
        this(lVar, c0Var, i10, i11, obj);
    }

    public static /* synthetic */ x0 b(x0 x0Var, l lVar, c0 c0Var, int i10, int i11, Object obj, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            lVar = x0Var.f343a;
        }
        if ((i12 & 2) != 0) {
            c0Var = x0Var.f344b;
        }
        c0 c0Var2 = c0Var;
        if ((i12 & 4) != 0) {
            i10 = x0Var.f345c;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = x0Var.f346d;
        }
        int i14 = i11;
        if ((i12 & 16) != 0) {
            obj = x0Var.f347e;
        }
        return x0Var.a(lVar, c0Var2, i13, i14, obj);
    }

    public final x0 a(l lVar, c0 c0Var, int i10, int i11, Object obj) {
        qc.q.i(c0Var, "fontWeight");
        return new x0(lVar, c0Var, i10, i11, obj, null);
    }

    public final l c() {
        return this.f343a;
    }

    public final int d() {
        return this.f345c;
    }

    public final int e() {
        return this.f346d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        if (qc.q.d(this.f343a, x0Var.f343a) && qc.q.d(this.f344b, x0Var.f344b) && x.f(this.f345c, x0Var.f345c) && y.h(this.f346d, x0Var.f346d) && qc.q.d(this.f347e, x0Var.f347e)) {
            return true;
        }
        return false;
    }

    public final c0 f() {
        return this.f344b;
    }

    public int hashCode() {
        int hashCode;
        l lVar = this.f343a;
        int i10 = 0;
        if (lVar == null) {
            hashCode = 0;
        } else {
            hashCode = lVar.hashCode();
        }
        int hashCode2 = ((((((hashCode * 31) + this.f344b.hashCode()) * 31) + x.g(this.f345c)) * 31) + y.i(this.f346d)) * 31;
        Object obj = this.f347e;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.f343a + ", fontWeight=" + this.f344b + ", fontStyle=" + ((Object) x.h(this.f345c)) + ", fontSynthesis=" + ((Object) y.l(this.f346d)) + ", resourceLoaderCacheKey=" + this.f347e + ')';
    }

    private x0(l lVar, c0 c0Var, int i10, int i11, Object obj) {
        qc.q.i(c0Var, "fontWeight");
        this.f343a = lVar;
        this.f344b = c0Var;
        this.f345c = i10;
        this.f346d = i11;
        this.f347e = obj;
    }
}
