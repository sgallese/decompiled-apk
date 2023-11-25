package b2;

/* compiled from: ImeOptions.kt */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: f  reason: collision with root package name */
    public static final a f7828f = new a(null);

    /* renamed from: g  reason: collision with root package name */
    private static final p f7829g = new p(false, 0, false, 0, 0, 31, null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f7830a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7831b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f7832c;

    /* renamed from: d  reason: collision with root package name */
    private final int f7833d;

    /* renamed from: e  reason: collision with root package name */
    private final int f7834e;

    /* compiled from: ImeOptions.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final p a() {
            return p.f7829g;
        }
    }

    public /* synthetic */ p(boolean z10, int i10, boolean z11, int i11, int i12, qc.h hVar) {
        this(z10, i10, z11, i11, i12);
    }

    public final boolean b() {
        return this.f7832c;
    }

    public final int c() {
        return this.f7831b;
    }

    public final int d() {
        return this.f7834e;
    }

    public final int e() {
        return this.f7833d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f7830a == pVar.f7830a && u.f(this.f7831b, pVar.f7831b) && this.f7832c == pVar.f7832c && v.k(this.f7833d, pVar.f7833d) && o.l(this.f7834e, pVar.f7834e)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f7830a;
    }

    public int hashCode() {
        return (((((((t.k.a(this.f7830a) * 31) + u.g(this.f7831b)) * 31) + t.k.a(this.f7832c)) * 31) + v.l(this.f7833d)) * 31) + o.m(this.f7834e);
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.f7830a + ", capitalization=" + ((Object) u.h(this.f7831b)) + ", autoCorrect=" + this.f7832c + ", keyboardType=" + ((Object) v.m(this.f7833d)) + ", imeAction=" + ((Object) o.n(this.f7834e)) + ')';
    }

    private p(boolean z10, int i10, boolean z11, int i11, int i12) {
        this.f7830a = z10;
        this.f7831b = i10;
        this.f7832c = z11;
        this.f7833d = i11;
        this.f7834e = i12;
    }

    public /* synthetic */ p(boolean z10, int i10, boolean z11, int i11, int i12, int i13, qc.h hVar) {
        this((i13 & 1) != 0 ? false : z10, (i13 & 2) != 0 ? u.f7848a.b() : i10, (i13 & 4) != 0 ? true : z11, (i13 & 8) != 0 ? v.f7853a.h() : i11, (i13 & 16) != 0 ? o.f7817b.a() : i12, null);
    }
}
