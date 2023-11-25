package v1;

import a1.e1;
import a1.o4;
import a1.p1;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;
import okhttp3.internal.http2.Http2;

/* compiled from: TextStyle.kt */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: d  reason: collision with root package name */
    public static final a f24473d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    private static final k0 f24474e = new k0(0, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, null, null, 0, null, null, null, null, null, null, 16777215, null);

    /* renamed from: a  reason: collision with root package name */
    private final b0 f24475a;

    /* renamed from: b  reason: collision with root package name */
    private final s f24476b;

    /* renamed from: c  reason: collision with root package name */
    private final z f24477c;

    /* compiled from: TextStyle.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final k0 a() {
            return k0.f24474e;
        }
    }

    public /* synthetic */ k0(long j10, long j11, a2.c0 c0Var, a2.x xVar, a2.y yVar, a2.l lVar, String str, long j12, g2.a aVar, g2.p pVar, c2.i iVar, long j13, g2.k kVar, o4 o4Var, c1.g gVar, g2.j jVar, g2.l lVar2, long j14, g2.r rVar, z zVar, g2.h hVar, g2.f fVar, g2.e eVar, g2.t tVar, qc.h hVar2) {
        this(j10, j11, c0Var, xVar, yVar, lVar, str, j12, aVar, pVar, iVar, j13, kVar, o4Var, gVar, jVar, lVar2, j14, rVar, zVar, hVar, fVar, eVar, tVar);
    }

    public final g2.k A() {
        return this.f24475a.s();
    }

    public final g2.l B() {
        return this.f24476b.l();
    }

    public final g2.p C() {
        return this.f24475a.u();
    }

    public final g2.r D() {
        return this.f24476b.m();
    }

    public final g2.t E() {
        return this.f24476b.n();
    }

    public final boolean F(k0 k0Var) {
        qc.q.i(k0Var, TaskSetupFragment.TYPE_OTHER);
        if (this != k0Var && !this.f24475a.w(k0Var.f24475a)) {
            return false;
        }
        return true;
    }

    public final boolean G(k0 k0Var) {
        qc.q.i(k0Var, TaskSetupFragment.TYPE_OTHER);
        if (this != k0Var && (!qc.q.d(this.f24476b, k0Var.f24476b) || !this.f24475a.v(k0Var.f24475a))) {
            return false;
        }
        return true;
    }

    public final k0 H(s sVar) {
        qc.q.i(sVar, TaskSetupFragment.TYPE_OTHER);
        return new k0(M(), L().o(sVar));
    }

    public final k0 I(k0 k0Var) {
        if (k0Var != null && !qc.q.d(k0Var, f24474e)) {
            return new k0(M().x(k0Var.M()), L().o(k0Var.L()));
        }
        return this;
    }

    public final k0 J(long j10, long j11, a2.c0 c0Var, a2.x xVar, a2.y yVar, a2.l lVar, String str, long j12, g2.a aVar, g2.p pVar, c2.i iVar, long j13, g2.k kVar, o4 o4Var, c1.g gVar, g2.j jVar, g2.l lVar2, long j14, g2.r rVar, g2.h hVar, g2.f fVar, g2.e eVar, z zVar, g2.t tVar) {
        b0 b10 = c0.b(this.f24475a, j10, null, Float.NaN, j11, c0Var, xVar, yVar, lVar, str, j12, aVar, pVar, iVar, j13, kVar, o4Var, zVar != null ? zVar.b() : null, gVar);
        s a10 = t.a(this.f24476b, jVar, lVar2, j14, rVar, zVar != null ? zVar.a() : null, hVar, fVar, eVar, tVar);
        return (this.f24475a == b10 && this.f24476b == a10) ? this : new k0(b10, a10);
    }

    public final s L() {
        return this.f24476b;
    }

    public final b0 M() {
        return this.f24475a;
    }

    public final k0 b(long j10, long j11, a2.c0 c0Var, a2.x xVar, a2.y yVar, a2.l lVar, String str, long j12, g2.a aVar, g2.p pVar, c2.i iVar, long j13, g2.k kVar, o4 o4Var, c1.g gVar, g2.j jVar, g2.l lVar2, long j14, g2.r rVar, z zVar, g2.h hVar, g2.f fVar, g2.e eVar, g2.t tVar) {
        g2.o b10;
        if (p1.q(j10, this.f24475a.g())) {
            b10 = this.f24475a.t();
        } else {
            b10 = g2.o.f16079a.b(j10);
        }
        return new k0(new b0(b10, j11, c0Var, xVar, yVar, lVar, str, j12, aVar, pVar, iVar, j13, kVar, o4Var, zVar != null ? zVar.b() : null, gVar, (qc.h) null), new s(jVar, lVar2, j14, rVar, zVar != null ? zVar.a() : null, hVar, fVar, eVar, tVar, null), zVar);
    }

    public final float d() {
        return this.f24475a.c();
    }

    public final long e() {
        return this.f24475a.d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (qc.q.d(this.f24475a, k0Var.f24475a) && qc.q.d(this.f24476b, k0Var.f24476b) && qc.q.d(this.f24477c, k0Var.f24477c)) {
            return true;
        }
        return false;
    }

    public final g2.a f() {
        return this.f24475a.e();
    }

    public final e1 g() {
        return this.f24475a.f();
    }

    public final long h() {
        return this.f24475a.g();
    }

    public int hashCode() {
        int i10;
        int hashCode = ((this.f24475a.hashCode() * 31) + this.f24476b.hashCode()) * 31;
        z zVar = this.f24477c;
        if (zVar != null) {
            i10 = zVar.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public final c1.g i() {
        return this.f24475a.h();
    }

    public final a2.l j() {
        return this.f24475a.i();
    }

    public final String k() {
        return this.f24475a.j();
    }

    public final long l() {
        return this.f24475a.k();
    }

    public final a2.x m() {
        return this.f24475a.l();
    }

    public final a2.y n() {
        return this.f24475a.m();
    }

    public final a2.c0 o() {
        return this.f24475a.n();
    }

    public final g2.e p() {
        return this.f24476b.c();
    }

    public final long q() {
        return this.f24475a.o();
    }

    public final g2.f r() {
        return this.f24476b.e();
    }

    public final long s() {
        return this.f24476b.g();
    }

    public final g2.h t() {
        return this.f24476b.h();
    }

    public String toString() {
        return "TextStyle(color=" + ((Object) p1.x(h())) + ", brush=" + g() + ", alpha=" + d() + ", fontSize=" + ((Object) j2.s.j(l())) + ", fontWeight=" + o() + ", fontStyle=" + m() + ", fontSynthesis=" + n() + ", fontFamily=" + j() + ", fontFeatureSettings=" + k() + ", letterSpacing=" + ((Object) j2.s.j(q())) + ", baselineShift=" + f() + ", textGeometricTransform=" + C() + ", localeList=" + u() + ", background=" + ((Object) p1.x(e())) + ", textDecoration=" + A() + ", shadow=" + x() + ", drawStyle=" + i() + ", textAlign=" + z() + ", textDirection=" + B() + ", lineHeight=" + ((Object) j2.s.j(s())) + ", textIndent=" + D() + ", platformStyle=" + this.f24477c + ", lineHeightStyle=" + t() + ", lineBreak=" + r() + ", hyphens=" + p() + ", textMotion=" + E() + ')';
    }

    public final c2.i u() {
        return this.f24475a.p();
    }

    public final s v() {
        return this.f24476b;
    }

    public final z w() {
        return this.f24477c;
    }

    public final o4 x() {
        return this.f24475a.r();
    }

    public final b0 y() {
        return this.f24475a;
    }

    public final g2.j z() {
        return this.f24476b.j();
    }

    public /* synthetic */ k0(long j10, long j11, a2.c0 c0Var, a2.x xVar, a2.y yVar, a2.l lVar, String str, long j12, g2.a aVar, g2.p pVar, c2.i iVar, long j13, g2.k kVar, o4 o4Var, g2.j jVar, g2.l lVar2, long j14, g2.r rVar, qc.h hVar) {
        this(j10, j11, c0Var, xVar, yVar, lVar, str, j12, aVar, pVar, iVar, j13, kVar, o4Var, jVar, lVar2, j14, rVar);
    }

    public k0(b0 b0Var, s sVar, z zVar) {
        qc.q.i(b0Var, "spanStyle");
        qc.q.i(sVar, "paragraphStyle");
        this.f24475a = b0Var;
        this.f24476b = sVar;
        this.f24477c = zVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k0(b0 b0Var, s sVar) {
        this(b0Var, sVar, l0.a(b0Var.q(), sVar.i()));
        qc.q.i(b0Var, "spanStyle");
        qc.q.i(sVar, "paragraphStyle");
    }

    public /* synthetic */ k0(long j10, long j11, a2.c0 c0Var, a2.x xVar, a2.y yVar, a2.l lVar, String str, long j12, g2.a aVar, g2.p pVar, c2.i iVar, long j13, g2.k kVar, o4 o4Var, g2.j jVar, g2.l lVar2, long j14, g2.r rVar, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? p1.f146b.e() : j10, (i10 & 2) != 0 ? j2.s.f19004b.a() : j11, (i10 & 4) != 0 ? null : c0Var, (i10 & 8) != 0 ? null : xVar, (i10 & 16) != 0 ? null : yVar, (i10 & 32) != 0 ? null : lVar, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? j2.s.f19004b.a() : j12, (i10 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : aVar, (i10 & 512) != 0 ? null : pVar, (i10 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : iVar, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? p1.f146b.e() : j13, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : kVar, (i10 & 8192) != 0 ? null : o4Var, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : jVar, (i10 & 32768) != 0 ? null : lVar2, (i10 & 65536) != 0 ? j2.s.f19004b.a() : j14, (i10 & 131072) != 0 ? null : rVar, null);
    }

    private k0(long j10, long j11, a2.c0 c0Var, a2.x xVar, a2.y yVar, a2.l lVar, String str, long j12, g2.a aVar, g2.p pVar, c2.i iVar, long j13, g2.k kVar, o4 o4Var, g2.j jVar, g2.l lVar2, long j14, g2.r rVar) {
        this(new b0(j10, j11, c0Var, xVar, yVar, lVar, str, j12, aVar, pVar, iVar, j13, kVar, o4Var, (x) null, (c1.g) null, (qc.h) null), new s(jVar, lVar2, j14, rVar, null, null, null, null, null, null), null);
    }

    public /* synthetic */ k0(long j10, long j11, a2.c0 c0Var, a2.x xVar, a2.y yVar, a2.l lVar, String str, long j12, g2.a aVar, g2.p pVar, c2.i iVar, long j13, g2.k kVar, o4 o4Var, c1.g gVar, g2.j jVar, g2.l lVar2, long j14, g2.r rVar, z zVar, g2.h hVar, g2.f fVar, g2.e eVar, g2.t tVar, int i10, qc.h hVar2) {
        this((i10 & 1) != 0 ? p1.f146b.e() : j10, (i10 & 2) != 0 ? j2.s.f19004b.a() : j11, (i10 & 4) != 0 ? null : c0Var, (i10 & 8) != 0 ? null : xVar, (i10 & 16) != 0 ? null : yVar, (i10 & 32) != 0 ? null : lVar, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? j2.s.f19004b.a() : j12, (i10 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : aVar, (i10 & 512) != 0 ? null : pVar, (i10 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : iVar, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? p1.f146b.e() : j13, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : kVar, (i10 & 8192) != 0 ? null : o4Var, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : gVar, (i10 & 32768) != 0 ? null : jVar, (i10 & 65536) != 0 ? null : lVar2, (i10 & 131072) != 0 ? j2.s.f19004b.a() : j14, (i10 & 262144) != 0 ? null : rVar, (i10 & 524288) != 0 ? null : zVar, (i10 & 1048576) != 0 ? null : hVar, (i10 & 2097152) != 0 ? null : fVar, (i10 & 4194304) != 0 ? null : eVar, (i10 & 8388608) != 0 ? null : tVar, null);
    }

    private k0(long j10, long j11, a2.c0 c0Var, a2.x xVar, a2.y yVar, a2.l lVar, String str, long j12, g2.a aVar, g2.p pVar, c2.i iVar, long j13, g2.k kVar, o4 o4Var, c1.g gVar, g2.j jVar, g2.l lVar2, long j14, g2.r rVar, z zVar, g2.h hVar, g2.f fVar, g2.e eVar, g2.t tVar) {
        this(new b0(j10, j11, c0Var, xVar, yVar, lVar, str, j12, aVar, pVar, iVar, j13, kVar, o4Var, zVar != null ? zVar.b() : null, gVar, (qc.h) null), new s(jVar, lVar2, j14, rVar, zVar != null ? zVar.a() : null, hVar, fVar, eVar, tVar, null), zVar);
    }
}
