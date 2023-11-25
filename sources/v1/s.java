package v1;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* compiled from: ParagraphStyle.kt */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private final g2.j f24491a;

    /* renamed from: b  reason: collision with root package name */
    private final g2.l f24492b;

    /* renamed from: c  reason: collision with root package name */
    private final long f24493c;

    /* renamed from: d  reason: collision with root package name */
    private final g2.r f24494d;

    /* renamed from: e  reason: collision with root package name */
    private final w f24495e;

    /* renamed from: f  reason: collision with root package name */
    private final g2.h f24496f;

    /* renamed from: g  reason: collision with root package name */
    private final g2.f f24497g;

    /* renamed from: h  reason: collision with root package name */
    private final g2.e f24498h;

    /* renamed from: i  reason: collision with root package name */
    private final g2.t f24499i;

    /* renamed from: j  reason: collision with root package name */
    private final int f24500j;

    /* renamed from: k  reason: collision with root package name */
    private final int f24501k;

    /* renamed from: l  reason: collision with root package name */
    private final int f24502l;

    public /* synthetic */ s(g2.j jVar, g2.l lVar, long j10, g2.r rVar, w wVar, g2.h hVar, g2.f fVar, g2.e eVar, g2.t tVar, qc.h hVar2) {
        this(jVar, lVar, j10, rVar, wVar, hVar, fVar, eVar, tVar);
    }

    public static /* synthetic */ s b(s sVar, g2.j jVar, g2.l lVar, long j10, g2.r rVar, w wVar, g2.h hVar, g2.f fVar, g2.e eVar, g2.t tVar, int i10, Object obj) {
        g2.j jVar2;
        g2.l lVar2;
        long j11;
        g2.r rVar2;
        w wVar2;
        g2.h hVar2;
        g2.f fVar2;
        g2.e eVar2;
        g2.t tVar2;
        if ((i10 & 1) != 0) {
            jVar2 = sVar.f24491a;
        } else {
            jVar2 = jVar;
        }
        if ((i10 & 2) != 0) {
            lVar2 = sVar.f24492b;
        } else {
            lVar2 = lVar;
        }
        if ((i10 & 4) != 0) {
            j11 = sVar.f24493c;
        } else {
            j11 = j10;
        }
        if ((i10 & 8) != 0) {
            rVar2 = sVar.f24494d;
        } else {
            rVar2 = rVar;
        }
        if ((i10 & 16) != 0) {
            wVar2 = sVar.f24495e;
        } else {
            wVar2 = wVar;
        }
        if ((i10 & 32) != 0) {
            hVar2 = sVar.f24496f;
        } else {
            hVar2 = hVar;
        }
        if ((i10 & 64) != 0) {
            fVar2 = sVar.f24497g;
        } else {
            fVar2 = fVar;
        }
        if ((i10 & 128) != 0) {
            eVar2 = sVar.f24498h;
        } else {
            eVar2 = eVar;
        }
        if ((i10 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
            tVar2 = sVar.f24499i;
        } else {
            tVar2 = tVar;
        }
        return sVar.a(jVar2, lVar2, j11, rVar2, wVar2, hVar2, fVar2, eVar2, tVar2);
    }

    public final s a(g2.j jVar, g2.l lVar, long j10, g2.r rVar, w wVar, g2.h hVar, g2.f fVar, g2.e eVar, g2.t tVar) {
        return new s(jVar, lVar, j10, rVar, wVar, hVar, fVar, eVar, tVar, null);
    }

    public final g2.e c() {
        return this.f24498h;
    }

    public final int d() {
        return this.f24502l;
    }

    public final g2.f e() {
        return this.f24497g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (qc.q.d(this.f24491a, sVar.f24491a) && qc.q.d(this.f24492b, sVar.f24492b) && j2.s.e(this.f24493c, sVar.f24493c) && qc.q.d(this.f24494d, sVar.f24494d) && qc.q.d(this.f24495e, sVar.f24495e) && qc.q.d(this.f24496f, sVar.f24496f) && qc.q.d(this.f24497g, sVar.f24497g) && qc.q.d(this.f24498h, sVar.f24498h) && qc.q.d(this.f24499i, sVar.f24499i)) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f24501k;
    }

    public final long g() {
        return this.f24493c;
    }

    public final g2.h h() {
        return this.f24496f;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        g2.j jVar = this.f24491a;
        int i17 = 0;
        if (jVar != null) {
            i10 = g2.j.k(jVar.m());
        } else {
            i10 = 0;
        }
        int i18 = i10 * 31;
        g2.l lVar = this.f24492b;
        if (lVar != null) {
            i11 = g2.l.j(lVar.l());
        } else {
            i11 = 0;
        }
        int i19 = (((i18 + i11) * 31) + j2.s.i(this.f24493c)) * 31;
        g2.r rVar = this.f24494d;
        if (rVar != null) {
            i12 = rVar.hashCode();
        } else {
            i12 = 0;
        }
        int i20 = (i19 + i12) * 31;
        w wVar = this.f24495e;
        if (wVar != null) {
            i13 = wVar.hashCode();
        } else {
            i13 = 0;
        }
        int i21 = (i20 + i13) * 31;
        g2.h hVar = this.f24496f;
        if (hVar != null) {
            i14 = hVar.hashCode();
        } else {
            i14 = 0;
        }
        int i22 = (i21 + i14) * 31;
        g2.f fVar = this.f24497g;
        if (fVar != null) {
            i15 = g2.f.i(fVar.k());
        } else {
            i15 = 0;
        }
        int i23 = (i22 + i15) * 31;
        g2.e eVar = this.f24498h;
        if (eVar != null) {
            i16 = g2.e.g(eVar.i());
        } else {
            i16 = 0;
        }
        int i24 = (i23 + i16) * 31;
        g2.t tVar = this.f24499i;
        if (tVar != null) {
            i17 = tVar.hashCode();
        }
        return i24 + i17;
    }

    public final w i() {
        return this.f24495e;
    }

    public final g2.j j() {
        return this.f24491a;
    }

    public final int k() {
        return this.f24500j;
    }

    public final g2.l l() {
        return this.f24492b;
    }

    public final g2.r m() {
        return this.f24494d;
    }

    public final g2.t n() {
        return this.f24499i;
    }

    public final s o(s sVar) {
        if (sVar == null) {
            return this;
        }
        return t.a(this, sVar.f24491a, sVar.f24492b, sVar.f24493c, sVar.f24494d, sVar.f24495e, sVar.f24496f, sVar.f24497g, sVar.f24498h, sVar.f24499i);
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + this.f24491a + ", textDirection=" + this.f24492b + ", lineHeight=" + ((Object) j2.s.j(this.f24493c)) + ", textIndent=" + this.f24494d + ", platformStyle=" + this.f24495e + ", lineHeightStyle=" + this.f24496f + ", lineBreak=" + this.f24497g + ", hyphens=" + this.f24498h + ", textMotion=" + this.f24499i + ')';
    }

    private s(g2.j jVar, g2.l lVar, long j10, g2.r rVar, w wVar, g2.h hVar, g2.f fVar, g2.e eVar, g2.t tVar) {
        this.f24491a = jVar;
        this.f24492b = lVar;
        this.f24493c = j10;
        this.f24494d = rVar;
        this.f24495e = wVar;
        this.f24496f = hVar;
        this.f24497g = fVar;
        this.f24498h = eVar;
        this.f24499i = tVar;
        this.f24500j = jVar != null ? jVar.m() : g2.j.f16057b.f();
        this.f24501k = fVar != null ? fVar.k() : g2.f.f16023b.a();
        this.f24502l = eVar != null ? eVar.i() : g2.e.f16019b.b();
        if (j2.s.e(j10, j2.s.f19004b.a())) {
            return;
        }
        if (j2.s.h(j10) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + j2.s.h(j10) + ')').toString());
    }

    public /* synthetic */ s(g2.j jVar, g2.l lVar, long j10, g2.r rVar, w wVar, g2.h hVar, g2.f fVar, g2.e eVar, g2.t tVar, int i10, qc.h hVar2) {
        this((i10 & 1) != 0 ? null : jVar, (i10 & 2) != 0 ? null : lVar, (i10 & 4) != 0 ? j2.s.f19004b.a() : j10, (i10 & 8) != 0 ? null : rVar, (i10 & 16) != 0 ? null : wVar, (i10 & 32) != 0 ? null : hVar, (i10 & 64) != 0 ? null : fVar, (i10 & 128) != 0 ? null : eVar, (i10 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0 ? tVar : null, null);
    }
}
