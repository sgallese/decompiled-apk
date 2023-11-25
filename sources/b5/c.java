package b5;

import ad.g0;
import android.graphics.Bitmap;
import f5.c;

/* compiled from: DefinedRequestOptions.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.lifecycle.p f7940a;

    /* renamed from: b  reason: collision with root package name */
    private final c5.j f7941b;

    /* renamed from: c  reason: collision with root package name */
    private final c5.h f7942c;

    /* renamed from: d  reason: collision with root package name */
    private final g0 f7943d;

    /* renamed from: e  reason: collision with root package name */
    private final g0 f7944e;

    /* renamed from: f  reason: collision with root package name */
    private final g0 f7945f;

    /* renamed from: g  reason: collision with root package name */
    private final g0 f7946g;

    /* renamed from: h  reason: collision with root package name */
    private final c.a f7947h;

    /* renamed from: i  reason: collision with root package name */
    private final c5.e f7948i;

    /* renamed from: j  reason: collision with root package name */
    private final Bitmap.Config f7949j;

    /* renamed from: k  reason: collision with root package name */
    private final Boolean f7950k;

    /* renamed from: l  reason: collision with root package name */
    private final Boolean f7951l;

    /* renamed from: m  reason: collision with root package name */
    private final a f7952m;

    /* renamed from: n  reason: collision with root package name */
    private final a f7953n;

    /* renamed from: o  reason: collision with root package name */
    private final a f7954o;

    public c(androidx.lifecycle.p pVar, c5.j jVar, c5.h hVar, g0 g0Var, g0 g0Var2, g0 g0Var3, g0 g0Var4, c.a aVar, c5.e eVar, Bitmap.Config config, Boolean bool, Boolean bool2, a aVar2, a aVar3, a aVar4) {
        this.f7940a = pVar;
        this.f7941b = jVar;
        this.f7942c = hVar;
        this.f7943d = g0Var;
        this.f7944e = g0Var2;
        this.f7945f = g0Var3;
        this.f7946g = g0Var4;
        this.f7947h = aVar;
        this.f7948i = eVar;
        this.f7949j = config;
        this.f7950k = bool;
        this.f7951l = bool2;
        this.f7952m = aVar2;
        this.f7953n = aVar3;
        this.f7954o = aVar4;
    }

    public final Boolean a() {
        return this.f7950k;
    }

    public final Boolean b() {
        return this.f7951l;
    }

    public final Bitmap.Config c() {
        return this.f7949j;
    }

    public final g0 d() {
        return this.f7945f;
    }

    public final a e() {
        return this.f7953n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (qc.q.d(this.f7940a, cVar.f7940a) && qc.q.d(this.f7941b, cVar.f7941b) && this.f7942c == cVar.f7942c && qc.q.d(this.f7943d, cVar.f7943d) && qc.q.d(this.f7944e, cVar.f7944e) && qc.q.d(this.f7945f, cVar.f7945f) && qc.q.d(this.f7946g, cVar.f7946g) && qc.q.d(this.f7947h, cVar.f7947h) && this.f7948i == cVar.f7948i && this.f7949j == cVar.f7949j && qc.q.d(this.f7950k, cVar.f7950k) && qc.q.d(this.f7951l, cVar.f7951l) && this.f7952m == cVar.f7952m && this.f7953n == cVar.f7953n && this.f7954o == cVar.f7954o) {
                return true;
            }
        }
        return false;
    }

    public final g0 f() {
        return this.f7944e;
    }

    public final g0 g() {
        return this.f7943d;
    }

    public final androidx.lifecycle.p h() {
        return this.f7940a;
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
        int i22;
        int i23;
        androidx.lifecycle.p pVar = this.f7940a;
        int i24 = 0;
        if (pVar != null) {
            i10 = pVar.hashCode();
        } else {
            i10 = 0;
        }
        int i25 = i10 * 31;
        c5.j jVar = this.f7941b;
        if (jVar != null) {
            i11 = jVar.hashCode();
        } else {
            i11 = 0;
        }
        int i26 = (i25 + i11) * 31;
        c5.h hVar = this.f7942c;
        if (hVar != null) {
            i12 = hVar.hashCode();
        } else {
            i12 = 0;
        }
        int i27 = (i26 + i12) * 31;
        g0 g0Var = this.f7943d;
        if (g0Var != null) {
            i13 = g0Var.hashCode();
        } else {
            i13 = 0;
        }
        int i28 = (i27 + i13) * 31;
        g0 g0Var2 = this.f7944e;
        if (g0Var2 != null) {
            i14 = g0Var2.hashCode();
        } else {
            i14 = 0;
        }
        int i29 = (i28 + i14) * 31;
        g0 g0Var3 = this.f7945f;
        if (g0Var3 != null) {
            i15 = g0Var3.hashCode();
        } else {
            i15 = 0;
        }
        int i30 = (i29 + i15) * 31;
        g0 g0Var4 = this.f7946g;
        if (g0Var4 != null) {
            i16 = g0Var4.hashCode();
        } else {
            i16 = 0;
        }
        int i31 = (i30 + i16) * 31;
        c.a aVar = this.f7947h;
        if (aVar != null) {
            i17 = aVar.hashCode();
        } else {
            i17 = 0;
        }
        int i32 = (i31 + i17) * 31;
        c5.e eVar = this.f7948i;
        if (eVar != null) {
            i18 = eVar.hashCode();
        } else {
            i18 = 0;
        }
        int i33 = (i32 + i18) * 31;
        Bitmap.Config config = this.f7949j;
        if (config != null) {
            i19 = config.hashCode();
        } else {
            i19 = 0;
        }
        int i34 = (i33 + i19) * 31;
        Boolean bool = this.f7950k;
        if (bool != null) {
            i20 = bool.hashCode();
        } else {
            i20 = 0;
        }
        int i35 = (i34 + i20) * 31;
        Boolean bool2 = this.f7951l;
        if (bool2 != null) {
            i21 = bool2.hashCode();
        } else {
            i21 = 0;
        }
        int i36 = (i35 + i21) * 31;
        a aVar2 = this.f7952m;
        if (aVar2 != null) {
            i22 = aVar2.hashCode();
        } else {
            i22 = 0;
        }
        int i37 = (i36 + i22) * 31;
        a aVar3 = this.f7953n;
        if (aVar3 != null) {
            i23 = aVar3.hashCode();
        } else {
            i23 = 0;
        }
        int i38 = (i37 + i23) * 31;
        a aVar4 = this.f7954o;
        if (aVar4 != null) {
            i24 = aVar4.hashCode();
        }
        return i38 + i24;
    }

    public final a i() {
        return this.f7952m;
    }

    public final a j() {
        return this.f7954o;
    }

    public final c5.e k() {
        return this.f7948i;
    }

    public final c5.h l() {
        return this.f7942c;
    }

    public final c5.j m() {
        return this.f7941b;
    }

    public final g0 n() {
        return this.f7946g;
    }

    public final c.a o() {
        return this.f7947h;
    }
}
