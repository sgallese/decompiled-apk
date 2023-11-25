package v1;

import a1.e1;
import a1.o4;
import a1.p1;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;
import okhttp3.internal.http2.Http2;

/* compiled from: SpanStyle.kt */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    private final g2.o f24393a;

    /* renamed from: b  reason: collision with root package name */
    private final long f24394b;

    /* renamed from: c  reason: collision with root package name */
    private final a2.c0 f24395c;

    /* renamed from: d  reason: collision with root package name */
    private final a2.x f24396d;

    /* renamed from: e  reason: collision with root package name */
    private final a2.y f24397e;

    /* renamed from: f  reason: collision with root package name */
    private final a2.l f24398f;

    /* renamed from: g  reason: collision with root package name */
    private final String f24399g;

    /* renamed from: h  reason: collision with root package name */
    private final long f24400h;

    /* renamed from: i  reason: collision with root package name */
    private final g2.a f24401i;

    /* renamed from: j  reason: collision with root package name */
    private final g2.p f24402j;

    /* renamed from: k  reason: collision with root package name */
    private final c2.i f24403k;

    /* renamed from: l  reason: collision with root package name */
    private final long f24404l;

    /* renamed from: m  reason: collision with root package name */
    private final g2.k f24405m;

    /* renamed from: n  reason: collision with root package name */
    private final o4 f24406n;

    /* renamed from: o  reason: collision with root package name */
    private final x f24407o;

    /* renamed from: p  reason: collision with root package name */
    private final c1.g f24408p;

    public /* synthetic */ b0(long j10, long j11, a2.c0 c0Var, a2.x xVar, a2.y yVar, a2.l lVar, String str, long j12, g2.a aVar, g2.p pVar, c2.i iVar, long j13, g2.k kVar, o4 o4Var, x xVar2, c1.g gVar, qc.h hVar) {
        this(j10, j11, c0Var, xVar, yVar, lVar, str, j12, aVar, pVar, iVar, j13, kVar, o4Var, xVar2, gVar);
    }

    public final b0 a(long j10, long j11, a2.c0 c0Var, a2.x xVar, a2.y yVar, a2.l lVar, String str, long j12, g2.a aVar, g2.p pVar, c2.i iVar, long j13, g2.k kVar, o4 o4Var, x xVar2, c1.g gVar) {
        g2.o b10;
        if (p1.q(j10, g())) {
            b10 = this.f24393a;
        } else {
            b10 = g2.o.f16079a.b(j10);
        }
        return new b0(b10, j11, c0Var, xVar, yVar, lVar, str, j12, aVar, pVar, iVar, j13, kVar, o4Var, xVar2, gVar, (qc.h) null);
    }

    public final float c() {
        return this.f24393a.d();
    }

    public final long d() {
        return this.f24404l;
    }

    public final g2.a e() {
        return this.f24401i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (v(b0Var) && w(b0Var)) {
            return true;
        }
        return false;
    }

    public final e1 f() {
        return this.f24393a.b();
    }

    public final long g() {
        return this.f24393a.e();
    }

    public final c1.g h() {
        return this.f24408p;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int w10 = p1.w(g()) * 31;
        e1 f10 = f();
        int i22 = 0;
        if (f10 != null) {
            i10 = f10.hashCode();
        } else {
            i10 = 0;
        }
        int floatToIntBits = (((((w10 + i10) * 31) + Float.floatToIntBits(c())) * 31) + j2.s.i(this.f24394b)) * 31;
        a2.c0 c0Var = this.f24395c;
        if (c0Var != null) {
            i11 = c0Var.hashCode();
        } else {
            i11 = 0;
        }
        int i23 = (floatToIntBits + i11) * 31;
        a2.x xVar = this.f24396d;
        if (xVar != null) {
            i12 = a2.x.g(xVar.i());
        } else {
            i12 = 0;
        }
        int i24 = (i23 + i12) * 31;
        a2.y yVar = this.f24397e;
        if (yVar != null) {
            i13 = a2.y.i(yVar.m());
        } else {
            i13 = 0;
        }
        int i25 = (i24 + i13) * 31;
        a2.l lVar = this.f24398f;
        if (lVar != null) {
            i14 = lVar.hashCode();
        } else {
            i14 = 0;
        }
        int i26 = (i25 + i14) * 31;
        String str = this.f24399g;
        if (str != null) {
            i15 = str.hashCode();
        } else {
            i15 = 0;
        }
        int i27 = (((i26 + i15) * 31) + j2.s.i(this.f24400h)) * 31;
        g2.a aVar = this.f24401i;
        if (aVar != null) {
            i16 = g2.a.f(aVar.h());
        } else {
            i16 = 0;
        }
        int i28 = (i27 + i16) * 31;
        g2.p pVar = this.f24402j;
        if (pVar != null) {
            i17 = pVar.hashCode();
        } else {
            i17 = 0;
        }
        int i29 = (i28 + i17) * 31;
        c2.i iVar = this.f24403k;
        if (iVar != null) {
            i18 = iVar.hashCode();
        } else {
            i18 = 0;
        }
        int w11 = (((i29 + i18) * 31) + p1.w(this.f24404l)) * 31;
        g2.k kVar = this.f24405m;
        if (kVar != null) {
            i19 = kVar.hashCode();
        } else {
            i19 = 0;
        }
        int i30 = (w11 + i19) * 31;
        o4 o4Var = this.f24406n;
        if (o4Var != null) {
            i20 = o4Var.hashCode();
        } else {
            i20 = 0;
        }
        int i31 = (i30 + i20) * 31;
        x xVar2 = this.f24407o;
        if (xVar2 != null) {
            i21 = xVar2.hashCode();
        } else {
            i21 = 0;
        }
        int i32 = (i31 + i21) * 31;
        c1.g gVar = this.f24408p;
        if (gVar != null) {
            i22 = gVar.hashCode();
        }
        return i32 + i22;
    }

    public final a2.l i() {
        return this.f24398f;
    }

    public final String j() {
        return this.f24399g;
    }

    public final long k() {
        return this.f24394b;
    }

    public final a2.x l() {
        return this.f24396d;
    }

    public final a2.y m() {
        return this.f24397e;
    }

    public final a2.c0 n() {
        return this.f24395c;
    }

    public final long o() {
        return this.f24400h;
    }

    public final c2.i p() {
        return this.f24403k;
    }

    public final x q() {
        return this.f24407o;
    }

    public final o4 r() {
        return this.f24406n;
    }

    public final g2.k s() {
        return this.f24405m;
    }

    public final g2.o t() {
        return this.f24393a;
    }

    public String toString() {
        return "SpanStyle(color=" + ((Object) p1.x(g())) + ", brush=" + f() + ", alpha=" + c() + ", fontSize=" + ((Object) j2.s.j(this.f24394b)) + ", fontWeight=" + this.f24395c + ", fontStyle=" + this.f24396d + ", fontSynthesis=" + this.f24397e + ", fontFamily=" + this.f24398f + ", fontFeatureSettings=" + this.f24399g + ", letterSpacing=" + ((Object) j2.s.j(this.f24400h)) + ", baselineShift=" + this.f24401i + ", textGeometricTransform=" + this.f24402j + ", localeList=" + this.f24403k + ", background=" + ((Object) p1.x(this.f24404l)) + ", textDecoration=" + this.f24405m + ", shadow=" + this.f24406n + ", platformStyle=" + this.f24407o + ", drawStyle=" + this.f24408p + ')';
    }

    public final g2.p u() {
        return this.f24402j;
    }

    public final boolean v(b0 b0Var) {
        qc.q.i(b0Var, TaskSetupFragment.TYPE_OTHER);
        if (this == b0Var) {
            return true;
        }
        if (j2.s.e(this.f24394b, b0Var.f24394b) && qc.q.d(this.f24395c, b0Var.f24395c) && qc.q.d(this.f24396d, b0Var.f24396d) && qc.q.d(this.f24397e, b0Var.f24397e) && qc.q.d(this.f24398f, b0Var.f24398f) && qc.q.d(this.f24399g, b0Var.f24399g) && j2.s.e(this.f24400h, b0Var.f24400h) && qc.q.d(this.f24401i, b0Var.f24401i) && qc.q.d(this.f24402j, b0Var.f24402j) && qc.q.d(this.f24403k, b0Var.f24403k) && p1.q(this.f24404l, b0Var.f24404l) && qc.q.d(this.f24407o, b0Var.f24407o)) {
            return true;
        }
        return false;
    }

    public final boolean w(b0 b0Var) {
        qc.q.i(b0Var, TaskSetupFragment.TYPE_OTHER);
        if (!qc.q.d(this.f24393a, b0Var.f24393a) || !qc.q.d(this.f24405m, b0Var.f24405m) || !qc.q.d(this.f24406n, b0Var.f24406n) || !qc.q.d(this.f24408p, b0Var.f24408p)) {
            return false;
        }
        return true;
    }

    public final b0 x(b0 b0Var) {
        if (b0Var == null) {
            return this;
        }
        return c0.b(this, b0Var.f24393a.e(), b0Var.f24393a.b(), b0Var.f24393a.d(), b0Var.f24394b, b0Var.f24395c, b0Var.f24396d, b0Var.f24397e, b0Var.f24398f, b0Var.f24399g, b0Var.f24400h, b0Var.f24401i, b0Var.f24402j, b0Var.f24403k, b0Var.f24404l, b0Var.f24405m, b0Var.f24406n, b0Var.f24407o, b0Var.f24408p);
    }

    public /* synthetic */ b0(g2.o oVar, long j10, a2.c0 c0Var, a2.x xVar, a2.y yVar, a2.l lVar, String str, long j11, g2.a aVar, g2.p pVar, c2.i iVar, long j12, g2.k kVar, o4 o4Var, x xVar2, c1.g gVar, qc.h hVar) {
        this(oVar, j10, c0Var, xVar, yVar, lVar, str, j11, aVar, pVar, iVar, j12, kVar, o4Var, xVar2, gVar);
    }

    private b0(g2.o oVar, long j10, a2.c0 c0Var, a2.x xVar, a2.y yVar, a2.l lVar, String str, long j11, g2.a aVar, g2.p pVar, c2.i iVar, long j12, g2.k kVar, o4 o4Var, x xVar2, c1.g gVar) {
        qc.q.i(oVar, "textForegroundStyle");
        this.f24393a = oVar;
        this.f24394b = j10;
        this.f24395c = c0Var;
        this.f24396d = xVar;
        this.f24397e = yVar;
        this.f24398f = lVar;
        this.f24399g = str;
        this.f24400h = j11;
        this.f24401i = aVar;
        this.f24402j = pVar;
        this.f24403k = iVar;
        this.f24404l = j12;
        this.f24405m = kVar;
        this.f24406n = o4Var;
        this.f24407o = xVar2;
        this.f24408p = gVar;
    }

    public /* synthetic */ b0(long j10, long j11, a2.c0 c0Var, a2.x xVar, a2.y yVar, a2.l lVar, String str, long j12, g2.a aVar, g2.p pVar, c2.i iVar, long j13, g2.k kVar, o4 o4Var, x xVar2, c1.g gVar, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? p1.f146b.e() : j10, (i10 & 2) != 0 ? j2.s.f19004b.a() : j11, (i10 & 4) != 0 ? null : c0Var, (i10 & 8) != 0 ? null : xVar, (i10 & 16) != 0 ? null : yVar, (i10 & 32) != 0 ? null : lVar, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? j2.s.f19004b.a() : j12, (i10 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : aVar, (i10 & 512) != 0 ? null : pVar, (i10 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : iVar, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? p1.f146b.e() : j13, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : kVar, (i10 & 8192) != 0 ? null : o4Var, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : xVar2, (i10 & 32768) != 0 ? null : gVar, (qc.h) null);
    }

    private b0(long j10, long j11, a2.c0 c0Var, a2.x xVar, a2.y yVar, a2.l lVar, String str, long j12, g2.a aVar, g2.p pVar, c2.i iVar, long j13, g2.k kVar, o4 o4Var, x xVar2, c1.g gVar) {
        this(g2.o.f16079a.b(j10), j11, c0Var, xVar, yVar, lVar, str, j12, aVar, pVar, iVar, j13, kVar, o4Var, xVar2, gVar, (qc.h) null);
    }
}
