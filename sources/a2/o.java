package a2;

import a2.l;
import j0.g3;

/* compiled from: FontFamilyResolver.kt */
/* loaded from: classes.dex */
public final class o implements l.b {

    /* renamed from: a  reason: collision with root package name */
    private final h0 f305a;

    /* renamed from: b  reason: collision with root package name */
    private final j0 f306b;

    /* renamed from: c  reason: collision with root package name */
    private final y0 f307c;

    /* renamed from: d  reason: collision with root package name */
    private final t f308d;

    /* renamed from: e  reason: collision with root package name */
    private final g0 f309e;

    /* renamed from: f  reason: collision with root package name */
    private final pc.l<x0, Object> f310f;

    /* compiled from: FontFamilyResolver.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<x0, Object> {
        a() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(x0 x0Var) {
            qc.q.i(x0Var, "it");
            return o.this.g(x0.b(x0Var, null, null, 0, 0, null, 30, null)).getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontFamilyResolver.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.l<pc.l<? super z0, ? extends dc.w>, z0> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ x0 f313m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(x0 x0Var) {
            super(1);
            this.f313m = x0Var;
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final z0 invoke(pc.l<? super z0, dc.w> lVar) {
            qc.q.i(lVar, "onAsyncCompletion");
            z0 a10 = o.this.f308d.a(this.f313m, o.this.f(), lVar, o.this.f310f);
            if (a10 == null && (a10 = o.this.f309e.a(this.f313m, o.this.f(), lVar, o.this.f310f)) == null) {
                throw new IllegalStateException("Could not load font");
            }
            return a10;
        }
    }

    public o(h0 h0Var, j0 j0Var, y0 y0Var, t tVar, g0 g0Var) {
        qc.q.i(h0Var, "platformFontLoader");
        qc.q.i(j0Var, "platformResolveInterceptor");
        qc.q.i(y0Var, "typefaceRequestCache");
        qc.q.i(tVar, "fontListFontFamilyTypefaceAdapter");
        qc.q.i(g0Var, "platformFamilyTypefaceAdapter");
        this.f305a = h0Var;
        this.f306b = j0Var;
        this.f307c = y0Var;
        this.f308d = tVar;
        this.f309e = g0Var;
        this.f310f = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g3<Object> g(x0 x0Var) {
        return this.f307c.c(x0Var, new b(x0Var));
    }

    @Override // a2.l.b
    public g3<Object> a(l lVar, c0 c0Var, int i10, int i11) {
        qc.q.i(c0Var, "fontWeight");
        return g(new x0(this.f306b.d(lVar), this.f306b.c(c0Var), this.f306b.a(i10), this.f306b.b(i11), this.f305a.a(), null));
    }

    public final h0 f() {
        return this.f305a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r9v2, types: [hc.f, qc.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ o(a2.h0 r7, a2.j0 r8, a2.y0 r9, a2.t r10, a2.g0 r11, int r12, qc.h r13) {
        /*
            r6 = this;
            r13 = r12 & 2
            if (r13 == 0) goto La
            a2.j0$a r8 = a2.j0.f295a
            a2.j0 r8 = r8.a()
        La:
            r2 = r8
            r8 = r12 & 4
            if (r8 == 0) goto L13
            a2.y0 r9 = a2.p.b()
        L13:
            r3 = r9
            r8 = r12 & 8
            if (r8 == 0) goto L23
            a2.t r10 = new a2.t
            a2.h r8 = a2.p.a()
            r9 = 0
            r13 = 2
            r10.<init>(r8, r9, r13, r9)
        L23:
            r4 = r10
            r8 = r12 & 16
            if (r8 == 0) goto L2d
            a2.g0 r11 = new a2.g0
            r11.<init>()
        L2d:
            r5 = r11
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.o.<init>(a2.h0, a2.j0, a2.y0, a2.t, a2.g0, int, qc.h):void");
    }
}
