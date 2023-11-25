package k1;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;

/* compiled from: PointerEvent.kt */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    private final long f19152a;

    /* renamed from: b  reason: collision with root package name */
    private final long f19153b;

    /* renamed from: c  reason: collision with root package name */
    private final long f19154c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f19155d;

    /* renamed from: e  reason: collision with root package name */
    private final float f19156e;

    /* renamed from: f  reason: collision with root package name */
    private final long f19157f;

    /* renamed from: g  reason: collision with root package name */
    private final long f19158g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f19159h;

    /* renamed from: i  reason: collision with root package name */
    private final int f19160i;

    /* renamed from: j  reason: collision with root package name */
    private final long f19161j;

    /* renamed from: k  reason: collision with root package name */
    private List<h> f19162k;

    /* renamed from: l  reason: collision with root package name */
    private g f19163l;

    public /* synthetic */ c0(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, qc.h hVar) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, j15);
    }

    public static /* synthetic */ c0 c(c0 c0Var, long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, int i10, List list, long j15, int i11, Object obj) {
        long j16;
        long j17;
        long j18;
        boolean z12;
        long j19;
        long j20;
        boolean z13;
        int i12;
        long j21;
        if ((i11 & 1) != 0) {
            j16 = c0Var.f19152a;
        } else {
            j16 = j10;
        }
        if ((i11 & 2) != 0) {
            j17 = c0Var.f19153b;
        } else {
            j17 = j11;
        }
        if ((i11 & 4) != 0) {
            j18 = c0Var.f19154c;
        } else {
            j18 = j12;
        }
        if ((i11 & 8) != 0) {
            z12 = c0Var.f19155d;
        } else {
            z12 = z10;
        }
        if ((i11 & 16) != 0) {
            j19 = c0Var.f19157f;
        } else {
            j19 = j13;
        }
        if ((i11 & 32) != 0) {
            j20 = c0Var.f19158g;
        } else {
            j20 = j14;
        }
        if ((i11 & 64) != 0) {
            z13 = c0Var.f19159h;
        } else {
            z13 = z11;
        }
        if ((i11 & 128) != 0) {
            i12 = c0Var.f19160i;
        } else {
            i12 = i10;
        }
        int i13 = i12;
        if ((i11 & 512) != 0) {
            j21 = c0Var.f19161j;
        } else {
            j21 = j15;
        }
        return c0Var.b(j16, j17, j18, z12, j19, j20, z13, i13, list, j21);
    }

    public final void a() {
        this.f19163l.c(true);
        this.f19163l.d(true);
    }

    public final c0 b(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, int i10, List<h> list, long j15) {
        qc.q.i(list, "historical");
        return d(j10, j11, j12, z10, this.f19156e, j13, j14, z11, i10, list, j15);
    }

    public final c0 d(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, int i10, List<h> list, long j15) {
        qc.q.i(list, "historical");
        c0 c0Var = new c0(j10, j11, j12, z10, f10, j13, j14, z11, false, i10, (List) list, j15, (qc.h) null);
        c0Var.f19163l = this.f19163l;
        return c0Var;
    }

    public final List<h> e() {
        List<h> i10;
        List<h> list = this.f19162k;
        if (list == null) {
            i10 = ec.t.i();
            return i10;
        }
        return list;
    }

    public final long f() {
        return this.f19152a;
    }

    public final long g() {
        return this.f19154c;
    }

    public final boolean h() {
        return this.f19155d;
    }

    public final float i() {
        return this.f19156e;
    }

    public final long j() {
        return this.f19158g;
    }

    public final boolean k() {
        return this.f19159h;
    }

    public final long l() {
        return this.f19161j;
    }

    public final int m() {
        return this.f19160i;
    }

    public final long n() {
        return this.f19153b;
    }

    public final boolean o() {
        if (!this.f19163l.a() && !this.f19163l.b()) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "PointerInputChange(id=" + ((Object) b0.f(this.f19152a)) + ", uptimeMillis=" + this.f19153b + ", position=" + ((Object) z0.f.v(this.f19154c)) + ", pressed=" + this.f19155d + ", pressure=" + this.f19156e + ", previousUptimeMillis=" + this.f19157f + ", previousPosition=" + ((Object) z0.f.v(this.f19158g)) + ", previousPressed=" + this.f19159h + ", isConsumed=" + o() + ", type=" + ((Object) q0.i(this.f19160i)) + ", historical=" + e() + ",scrollDelta=" + ((Object) z0.f.v(this.f19161j)) + ')';
    }

    public /* synthetic */ c0(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, List list, long j15, qc.h hVar) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, list, j15);
    }

    private c0(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15) {
        this.f19152a = j10;
        this.f19153b = j11;
        this.f19154c = j12;
        this.f19155d = z10;
        this.f19156e = f10;
        this.f19157f = j13;
        this.f19158g = j14;
        this.f19159h = z11;
        this.f19160i = i10;
        this.f19161j = j15;
        this.f19163l = new g(z12, z12);
    }

    public /* synthetic */ c0(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, int i11, qc.h hVar) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, (i11 & 512) != 0 ? q0.f19226a.d() : i10, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? z0.f.f26354b.c() : j15, (qc.h) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private c0(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, List<h> list, long j15) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, j15, (qc.h) null);
        qc.q.i(list, "historical");
        this.f19162k = list;
    }
}
