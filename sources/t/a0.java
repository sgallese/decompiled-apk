package t;

import android.os.Build;

/* compiled from: Magnifier.kt */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: g  reason: collision with root package name */
    public static final a f23106g = new a(null);

    /* renamed from: h  reason: collision with root package name */
    private static final a0 f23107h;

    /* renamed from: i  reason: collision with root package name */
    private static final a0 f23108i;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f23109a;

    /* renamed from: b  reason: collision with root package name */
    private final long f23110b;

    /* renamed from: c  reason: collision with root package name */
    private final float f23111c;

    /* renamed from: d  reason: collision with root package name */
    private final float f23112d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f23113e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f23114f;

    /* compiled from: Magnifier.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public static /* synthetic */ boolean d(a aVar, a0 a0Var, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = Build.VERSION.SDK_INT;
            }
            return aVar.c(a0Var, i10);
        }

        public final a0 a() {
            return a0.f23107h;
        }

        public final a0 b() {
            return a0.f23108i;
        }

        public final boolean c(a0 a0Var, int i10) {
            qc.q.i(a0Var, "style");
            if (!z.b(i10) || a0Var.f()) {
                return false;
            }
            if (!a0Var.h() && !qc.q.d(a0Var, a()) && i10 < 29) {
                return false;
            }
            return true;
        }
    }

    static {
        a0 a0Var = new a0(0L, 0.0f, 0.0f, false, false, 31, (qc.h) null);
        f23107h = a0Var;
        f23108i = new a0(true, a0Var.f23110b, a0Var.f23111c, a0Var.f23112d, a0Var.f23113e, a0Var.f23114f, (qc.h) null);
    }

    public /* synthetic */ a0(long j10, float f10, float f11, boolean z10, boolean z11, qc.h hVar) {
        this(j10, f10, f11, z10, z11);
    }

    public final boolean c() {
        return this.f23113e;
    }

    public final float d() {
        return this.f23111c;
    }

    public final float e() {
        return this.f23112d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f23109a == a0Var.f23109a && j2.k.f(this.f23110b, a0Var.f23110b) && j2.h.l(this.f23111c, a0Var.f23111c) && j2.h.l(this.f23112d, a0Var.f23112d) && this.f23113e == a0Var.f23113e && this.f23114f == a0Var.f23114f) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f23114f;
    }

    public final long g() {
        return this.f23110b;
    }

    public final boolean h() {
        return this.f23109a;
    }

    public int hashCode() {
        return (((((((((k.a(this.f23109a) * 31) + j2.k.i(this.f23110b)) * 31) + j2.h.m(this.f23111c)) * 31) + j2.h.m(this.f23112d)) * 31) + k.a(this.f23113e)) * 31) + k.a(this.f23114f);
    }

    public final boolean i() {
        return a.d(f23106g, this, 0, 2, null);
    }

    public String toString() {
        if (this.f23109a) {
            return "MagnifierStyle.TextDefault";
        }
        return "MagnifierStyle(size=" + ((Object) j2.k.j(this.f23110b)) + ", cornerRadius=" + ((Object) j2.h.n(this.f23111c)) + ", elevation=" + ((Object) j2.h.n(this.f23112d)) + ", clippingEnabled=" + this.f23113e + ", fishEyeEnabled=" + this.f23114f + ')';
    }

    public /* synthetic */ a0(boolean z10, long j10, float f10, float f11, boolean z11, boolean z12, qc.h hVar) {
        this(z10, j10, f10, f11, z11, z12);
    }

    private a0(boolean z10, long j10, float f10, float f11, boolean z11, boolean z12) {
        this.f23109a = z10;
        this.f23110b = j10;
        this.f23111c = f10;
        this.f23112d = f11;
        this.f23113e = z11;
        this.f23114f = z12;
    }

    public /* synthetic */ a0(long j10, float f10, float f11, boolean z10, boolean z11, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? j2.k.f18988b.a() : j10, (i10 & 2) != 0 ? j2.h.f18979m.b() : f10, (i10 & 4) != 0 ? j2.h.f18979m.b() : f11, (i10 & 8) != 0 ? true : z10, (i10 & 16) != 0 ? false : z11, (qc.h) null);
    }

    private a0(long j10, float f10, float f11, boolean z10, boolean z11) {
        this(false, j10, f10, f11, z10, z11, (qc.h) null);
    }
}
