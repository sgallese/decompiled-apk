package t0;

/* compiled from: Snapshot.kt */
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: s  reason: collision with root package name */
    private final b f23281s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f23282t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i10, j jVar, pc.l<Object, dc.w> lVar, pc.l<Object, dc.w> lVar2, b bVar) {
        super(i10, jVar, lVar, lVar2);
        qc.q.i(jVar, "invalid");
        qc.q.i(bVar, "parent");
        this.f23281s = bVar;
        bVar.m(this);
    }

    private final void S() {
        if (!this.f23282t) {
            this.f23282t = true;
            this.f23281s.n(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0074 A[Catch: all -> 0x00bb, TryCatch #0 {, blocks: (B:13:0x002e, B:15:0x0033, B:18:0x003a, B:22:0x0054, B:24:0x005c, B:27:0x006c, B:29:0x0074, B:30:0x0079, B:25:0x0060, B:26:0x0069), top: B:39:0x002e }] */
    @Override // t0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t0.h C() {
        /*
            r7 = this;
            t0.b r0 = r7.f23281s
            boolean r0 = r0.D()
            if (r0 != 0) goto Lbe
            t0.b r0 = r7.f23281s
            boolean r0 = r0.e()
            if (r0 == 0) goto L12
            goto Lbe
        L12:
            k0.c r0 = r7.E()
            int r1 = r7.f()
            r2 = 0
            if (r0 == 0) goto L28
            t0.b r3 = r7.f23281s
            t0.j r4 = r3.g()
            java.util.Map r3 = t0.l.n(r3, r7, r4)
            goto L29
        L28:
            r3 = r2
        L29:
            java.lang.Object r4 = t0.l.G()
            monitor-enter(r4)
            t0.l.w(r7)     // Catch: java.lang.Throwable -> Lbb
            if (r0 == 0) goto L69
            int r5 = r0.size()     // Catch: java.lang.Throwable -> Lbb
            if (r5 != 0) goto L3a
            goto L69
        L3a:
            t0.b r5 = r7.f23281s     // Catch: java.lang.Throwable -> Lbb
            int r5 = r5.f()     // Catch: java.lang.Throwable -> Lbb
            t0.b r6 = r7.f23281s     // Catch: java.lang.Throwable -> Lbb
            t0.j r6 = r6.g()     // Catch: java.lang.Throwable -> Lbb
            t0.h r3 = r7.H(r5, r3, r6)     // Catch: java.lang.Throwable -> Lbb
            t0.h$b r5 = t0.h.b.f23309a     // Catch: java.lang.Throwable -> Lbb
            boolean r5 = qc.q.d(r3, r5)     // Catch: java.lang.Throwable -> Lbb
            if (r5 != 0) goto L54
            monitor-exit(r4)
            return r3
        L54:
            t0.b r3 = r7.f23281s     // Catch: java.lang.Throwable -> Lbb
            k0.c r3 = r3.E()     // Catch: java.lang.Throwable -> Lbb
            if (r3 == 0) goto L60
            r3.e(r0)     // Catch: java.lang.Throwable -> Lbb
            goto L6c
        L60:
            t0.b r3 = r7.f23281s     // Catch: java.lang.Throwable -> Lbb
            r3.O(r0)     // Catch: java.lang.Throwable -> Lbb
            r7.O(r2)     // Catch: java.lang.Throwable -> Lbb
            goto L6c
        L69:
            r7.b()     // Catch: java.lang.Throwable -> Lbb
        L6c:
            t0.b r0 = r7.f23281s     // Catch: java.lang.Throwable -> Lbb
            int r0 = r0.f()     // Catch: java.lang.Throwable -> Lbb
            if (r0 >= r1) goto L79
            t0.b r0 = r7.f23281s     // Catch: java.lang.Throwable -> Lbb
            r0.B()     // Catch: java.lang.Throwable -> Lbb
        L79:
            t0.b r0 = r7.f23281s     // Catch: java.lang.Throwable -> Lbb
            t0.j r2 = r0.g()     // Catch: java.lang.Throwable -> Lbb
            t0.j r2 = r2.k(r1)     // Catch: java.lang.Throwable -> Lbb
            t0.j r3 = r7.F()     // Catch: java.lang.Throwable -> Lbb
            t0.j r2 = r2.j(r3)     // Catch: java.lang.Throwable -> Lbb
            r0.v(r2)     // Catch: java.lang.Throwable -> Lbb
            t0.b r0 = r7.f23281s     // Catch: java.lang.Throwable -> Lbb
            r0.I(r1)     // Catch: java.lang.Throwable -> Lbb
            t0.b r0 = r7.f23281s     // Catch: java.lang.Throwable -> Lbb
            int r1 = r7.y()     // Catch: java.lang.Throwable -> Lbb
            r0.K(r1)     // Catch: java.lang.Throwable -> Lbb
            t0.b r0 = r7.f23281s     // Catch: java.lang.Throwable -> Lbb
            t0.j r1 = r7.F()     // Catch: java.lang.Throwable -> Lbb
            r0.J(r1)     // Catch: java.lang.Throwable -> Lbb
            t0.b r0 = r7.f23281s     // Catch: java.lang.Throwable -> Lbb
            int[] r1 = r7.G()     // Catch: java.lang.Throwable -> Lbb
            r0.L(r1)     // Catch: java.lang.Throwable -> Lbb
            dc.w r0 = dc.w.f13270a     // Catch: java.lang.Throwable -> Lbb
            monitor-exit(r4)
            r0 = 1
            r7.N(r0)
            r7.S()
            t0.h$b r0 = t0.h.b.f23309a
            return r0
        Lbb:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        Lbe:
            t0.h$a r0 = new t0.h$a
            r0.<init>(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.c.C():t0.h");
    }

    @Override // t0.b, t0.g
    public void d() {
        if (!e()) {
            super.d();
            S();
        }
    }
}
