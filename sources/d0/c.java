package d0;

import a2.l;
import j2.r;
import qc.q;
import v1.k0;
import v1.l0;

/* compiled from: MinLinesConstrainer.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: h  reason: collision with root package name */
    public static final a f12971h = new a(null);

    /* renamed from: i  reason: collision with root package name */
    private static c f12972i;

    /* renamed from: a  reason: collision with root package name */
    private final r f12973a;

    /* renamed from: b  reason: collision with root package name */
    private final k0 f12974b;

    /* renamed from: c  reason: collision with root package name */
    private final j2.e f12975c;

    /* renamed from: d  reason: collision with root package name */
    private final l.b f12976d;

    /* renamed from: e  reason: collision with root package name */
    private final k0 f12977e;

    /* renamed from: f  reason: collision with root package name */
    private float f12978f;

    /* renamed from: g  reason: collision with root package name */
    private float f12979g;

    /* compiled from: MinLinesConstrainer.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final c a(c cVar, r rVar, k0 k0Var, j2.e eVar, l.b bVar) {
            boolean z10;
            q.i(rVar, "layoutDirection");
            q.i(k0Var, "paramStyle");
            q.i(eVar, "density");
            q.i(bVar, "fontFamilyResolver");
            boolean z11 = true;
            if (cVar != null && rVar == cVar.g() && q.d(k0Var, cVar.f())) {
                if (eVar.getDensity() == cVar.d().getDensity()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && bVar == cVar.e()) {
                    return cVar;
                }
            }
            c cVar2 = c.f12972i;
            if (cVar2 != null && rVar == cVar2.g() && q.d(k0Var, cVar2.f())) {
                if (eVar.getDensity() != cVar2.d().getDensity()) {
                    z11 = false;
                }
                if (z11 && bVar == cVar2.e()) {
                    return cVar2;
                }
            }
            c cVar3 = new c(rVar, l0.d(k0Var, rVar), eVar, bVar, null);
            c.f12972i = cVar3;
            return cVar3;
        }
    }

    public /* synthetic */ c(r rVar, k0 k0Var, j2.e eVar, l.b bVar, qc.h hVar) {
        this(rVar, k0Var, eVar, bVar);
    }

    public final long c(long j10, int i10) {
        String str;
        String str2;
        int o10;
        int d10;
        int d11;
        float f10 = this.f12979g;
        float f11 = this.f12978f;
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            str = d.f12980a;
            f10 = v1.r.b(str, this.f12977e, j2.c.b(0, 0, 0, 0, 15, null), this.f12975c, this.f12976d, null, null, 1, false, 96, null).getHeight();
            str2 = d.f12981b;
            f11 = v1.r.b(str2, this.f12977e, j2.c.b(0, 0, 0, 0, 15, null), this.f12975c, this.f12976d, null, null, 2, false, 96, null).getHeight() - f10;
            this.f12979g = f10;
            this.f12978f = f11;
        }
        if (i10 != 1) {
            d10 = sc.c.d(f10 + (f11 * (i10 - 1)));
            d11 = vc.l.d(d10, 0);
            o10 = vc.l.h(d11, j2.b.m(j10));
        } else {
            o10 = j2.b.o(j10);
        }
        return j2.c.a(j2.b.p(j10), j2.b.n(j10), o10, j2.b.m(j10));
    }

    public final j2.e d() {
        return this.f12975c;
    }

    public final l.b e() {
        return this.f12976d;
    }

    public final k0 f() {
        return this.f12974b;
    }

    public final r g() {
        return this.f12973a;
    }

    private c(r rVar, k0 k0Var, j2.e eVar, l.b bVar) {
        this.f12973a = rVar;
        this.f12974b = k0Var;
        this.f12975c = eVar;
        this.f12976d = bVar;
        this.f12977e = l0.d(k0Var, rVar);
        this.f12978f = Float.NaN;
        this.f12979g = Float.NaN;
    }
}
