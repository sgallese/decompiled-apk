package k1;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.List;

/* compiled from: PointerInteropFilter.android.kt */
/* loaded from: classes.dex */
public final class m0 implements j0 {

    /* renamed from: c  reason: collision with root package name */
    public pc.l<? super MotionEvent, Boolean> f19204c;

    /* renamed from: d  reason: collision with root package name */
    private t0 f19205d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f19206e;

    /* renamed from: f  reason: collision with root package name */
    private final i0 f19207f = new b();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PointerInteropFilter.android.kt */
    /* loaded from: classes.dex */
    public enum a {
        Unknown,
        Dispatching,
        NotDispatching
    }

    /* compiled from: PointerInteropFilter.android.kt */
    /* loaded from: classes.dex */
    public static final class b extends i0 {

        /* renamed from: b  reason: collision with root package name */
        private a f19208b = a.Unknown;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PointerInteropFilter.android.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.l<MotionEvent, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ m0 f19210f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m0 m0Var) {
                super(1);
                this.f19210f = m0Var;
            }

            public final void a(MotionEvent motionEvent) {
                qc.q.i(motionEvent, "motionEvent");
                this.f19210f.m().invoke(motionEvent);
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(MotionEvent motionEvent) {
                a(motionEvent);
                return dc.w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PointerInteropFilter.android.kt */
        /* renamed from: k1.m0$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0431b extends qc.r implements pc.l<MotionEvent, dc.w> {

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ m0 f19212m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0431b(m0 m0Var) {
                super(1);
                this.f19212m = m0Var;
            }

            public final void a(MotionEvent motionEvent) {
                a aVar;
                qc.q.i(motionEvent, "motionEvent");
                if (motionEvent.getActionMasked() == 0) {
                    b bVar = b.this;
                    if (this.f19212m.m().invoke(motionEvent).booleanValue()) {
                        aVar = a.Dispatching;
                    } else {
                        aVar = a.NotDispatching;
                    }
                    bVar.f19208b = aVar;
                    return;
                }
                this.f19212m.m().invoke(motionEvent);
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(MotionEvent motionEvent) {
                a(motionEvent);
                return dc.w.f13270a;
            }
        }

        /* compiled from: PointerInteropFilter.android.kt */
        /* loaded from: classes.dex */
        static final class c extends qc.r implements pc.l<MotionEvent, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ m0 f19213f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(m0 m0Var) {
                super(1);
                this.f19213f = m0Var;
            }

            public final void a(MotionEvent motionEvent) {
                qc.q.i(motionEvent, "motionEvent");
                this.f19213f.m().invoke(motionEvent);
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(MotionEvent motionEvent) {
                a(motionEvent);
                return dc.w.f13270a;
            }
        }

        b() {
        }

        private final void h(r rVar) {
            boolean z10;
            List<c0> c10 = rVar.c();
            int size = c10.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (c10.get(i10).o()) {
                        z10 = true;
                        break;
                    }
                    i10++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                if (this.f19208b == a.Dispatching) {
                    n1.s b10 = b();
                    if (b10 != null) {
                        o0.b(rVar, b10.U(z0.f.f26354b.c()), new a(m0.this));
                    } else {
                        throw new IllegalStateException("layoutCoordinates not set".toString());
                    }
                }
                this.f19208b = a.NotDispatching;
                return;
            }
            n1.s b11 = b();
            if (b11 != null) {
                o0.c(rVar, b11.U(z0.f.f26354b.c()), new C0431b(m0.this));
                if (this.f19208b == a.Dispatching) {
                    int size2 = c10.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        c10.get(i11).a();
                    }
                    j d10 = rVar.d();
                    if (d10 != null) {
                        d10.e(!m0.this.e());
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("layoutCoordinates not set".toString());
        }

        private final void i() {
            this.f19208b = a.Unknown;
            m0.this.v(false);
        }

        @Override // k1.i0
        public boolean c() {
            return true;
        }

        @Override // k1.i0
        public void d() {
            if (this.f19208b == a.Dispatching) {
                o0.a(SystemClock.uptimeMillis(), new c(m0.this));
                i();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
        @Override // k1.i0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void e(k1.r r6, k1.t r7, long r8) {
            /*
                r5 = this;
                java.lang.String r8 = "pointerEvent"
                qc.q.i(r6, r8)
                java.lang.String r8 = "pass"
                qc.q.i(r7, r8)
                java.util.List r8 = r6.c()
                k1.m0 r9 = k1.m0.this
                boolean r9 = r9.e()
                r0 = 0
                r1 = 1
                if (r9 != 0) goto L42
                int r9 = r8.size()
                r2 = 0
            L1d:
                if (r2 >= r9) goto L3c
                java.lang.Object r3 = r8.get(r2)
                k1.c0 r3 = (k1.c0) r3
                boolean r4 = k1.s.b(r3)
                if (r4 != 0) goto L34
                boolean r3 = k1.s.d(r3)
                if (r3 == 0) goto L32
                goto L34
            L32:
                r3 = 0
                goto L35
            L34:
                r3 = 1
            L35:
                if (r3 == 0) goto L39
                r9 = 1
                goto L3d
            L39:
                int r2 = r2 + 1
                goto L1d
            L3c:
                r9 = 0
            L3d:
                if (r9 == 0) goto L40
                goto L42
            L40:
                r9 = 0
                goto L43
            L42:
                r9 = 1
            L43:
                k1.m0$a r2 = r5.f19208b
                k1.m0$a r3 = k1.m0.a.NotDispatching
                if (r2 == r3) goto L5b
                k1.t r2 = k1.t.Initial
                if (r7 != r2) goto L52
                if (r9 == 0) goto L52
                r5.h(r6)
            L52:
                k1.t r2 = k1.t.Final
                if (r7 != r2) goto L5b
                if (r9 != 0) goto L5b
                r5.h(r6)
            L5b:
                k1.t r6 = k1.t.Final
                if (r7 != r6) goto L7c
                int r6 = r8.size()
                r7 = 0
            L64:
                if (r7 >= r6) goto L76
                java.lang.Object r9 = r8.get(r7)
                k1.c0 r9 = (k1.c0) r9
                boolean r9 = k1.s.d(r9)
                if (r9 != 0) goto L73
                goto L77
            L73:
                int r7 = r7 + 1
                goto L64
            L76:
                r0 = 1
            L77:
                if (r0 == 0) goto L7c
                r5.i()
            L7c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: k1.m0.b.e(k1.r, k1.t, long):void");
        }
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ androidx.compose.ui.e a(androidx.compose.ui.e eVar) {
        return v0.d.a(this, eVar);
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ Object b(Object obj, pc.p pVar) {
        return v0.e.b(this, obj, pVar);
    }

    public final boolean e() {
        return this.f19206e;
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ boolean h(pc.l lVar) {
        return v0.e.a(this, lVar);
    }

    @Override // k1.j0
    public i0 k() {
        return this.f19207f;
    }

    public final pc.l<MotionEvent, Boolean> m() {
        pc.l lVar = this.f19204c;
        if (lVar != null) {
            return lVar;
        }
        qc.q.z("onTouchEvent");
        return null;
    }

    public final void v(boolean z10) {
        this.f19206e = z10;
    }

    public final void x(pc.l<? super MotionEvent, Boolean> lVar) {
        qc.q.i(lVar, "<set-?>");
        this.f19204c = lVar;
    }

    public final void z(t0 t0Var) {
        t0 t0Var2 = this.f19205d;
        if (t0Var2 != null) {
            t0Var2.b(null);
        }
        this.f19205d = t0Var;
        if (t0Var != null) {
            t0Var.b(this);
        }
    }
}
