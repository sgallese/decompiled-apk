package z0;

import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;
import qc.q;

/* compiled from: Rect.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: e  reason: collision with root package name */
    public static final a f26359e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private static final h f26360f = new h(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a  reason: collision with root package name */
    private final float f26361a;

    /* renamed from: b  reason: collision with root package name */
    private final float f26362b;

    /* renamed from: c  reason: collision with root package name */
    private final float f26363c;

    /* renamed from: d  reason: collision with root package name */
    private final float f26364d;

    /* compiled from: Rect.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final h a() {
            return h.f26360f;
        }
    }

    public h(float f10, float f11, float f12, float f13) {
        this.f26361a = f10;
        this.f26362b = f11;
        this.f26363c = f12;
        this.f26364d = f13;
    }

    public static /* synthetic */ h d(h hVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = hVar.f26361a;
        }
        if ((i10 & 2) != 0) {
            f11 = hVar.f26362b;
        }
        if ((i10 & 4) != 0) {
            f12 = hVar.f26363c;
        }
        if ((i10 & 8) != 0) {
            f13 = hVar.f26364d;
        }
        return hVar.c(f10, f11, f12, f13);
    }

    public final boolean b(long j10) {
        if (f.o(j10) >= this.f26361a && f.o(j10) < this.f26363c && f.p(j10) >= this.f26362b && f.p(j10) < this.f26364d) {
            return true;
        }
        return false;
    }

    public final h c(float f10, float f11, float f12, float f13) {
        return new h(f10, f11, f12, f13);
    }

    public final float e() {
        return this.f26364d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (Float.compare(this.f26361a, hVar.f26361a) == 0 && Float.compare(this.f26362b, hVar.f26362b) == 0 && Float.compare(this.f26363c, hVar.f26363c) == 0 && Float.compare(this.f26364d, hVar.f26364d) == 0) {
            return true;
        }
        return false;
    }

    public final long f() {
        return g.a(this.f26363c, this.f26364d);
    }

    public final long g() {
        return g.a(this.f26361a + (n() / 2.0f), this.f26362b + (h() / 2.0f));
    }

    public final float h() {
        return this.f26364d - this.f26362b;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.f26361a) * 31) + Float.floatToIntBits(this.f26362b)) * 31) + Float.floatToIntBits(this.f26363c)) * 31) + Float.floatToIntBits(this.f26364d);
    }

    public final float i() {
        return this.f26361a;
    }

    public final float j() {
        return this.f26363c;
    }

    public final long k() {
        return m.a(n(), h());
    }

    public final float l() {
        return this.f26362b;
    }

    public final long m() {
        return g.a(this.f26361a, this.f26362b);
    }

    public final float n() {
        return this.f26363c - this.f26361a;
    }

    public final h o(h hVar) {
        q.i(hVar, TaskSetupFragment.TYPE_OTHER);
        return new h(Math.max(this.f26361a, hVar.f26361a), Math.max(this.f26362b, hVar.f26362b), Math.min(this.f26363c, hVar.f26363c), Math.min(this.f26364d, hVar.f26364d));
    }

    public final boolean p(h hVar) {
        q.i(hVar, TaskSetupFragment.TYPE_OTHER);
        if (this.f26363c <= hVar.f26361a || hVar.f26363c <= this.f26361a || this.f26364d <= hVar.f26362b || hVar.f26364d <= this.f26362b) {
            return false;
        }
        return true;
    }

    public final h q(float f10, float f11) {
        return new h(this.f26361a + f10, this.f26362b + f11, this.f26363c + f10, this.f26364d + f11);
    }

    public final h r(long j10) {
        return new h(this.f26361a + f.o(j10), this.f26362b + f.p(j10), this.f26363c + f.o(j10), this.f26364d + f.p(j10));
    }

    public String toString() {
        return "Rect.fromLTRB(" + c.a(this.f26361a, 1) + ", " + c.a(this.f26362b, 1) + ", " + c.a(this.f26363c, 1) + ", " + c.a(this.f26364d, 1) + ')';
    }
}
