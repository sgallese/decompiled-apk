package b1;

import a1.r1;
import b1.b;
import b1.m;
import java.util.Arrays;

/* compiled from: Connector.kt */
/* loaded from: classes.dex */
public class h {

    /* renamed from: g  reason: collision with root package name */
    public static final a f7665g;

    /* renamed from: h  reason: collision with root package name */
    private static final h f7666h;

    /* renamed from: i  reason: collision with root package name */
    private static final h f7667i;

    /* renamed from: j  reason: collision with root package name */
    private static final h f7668j;

    /* renamed from: a  reason: collision with root package name */
    private final c f7669a;

    /* renamed from: b  reason: collision with root package name */
    private final c f7670b;

    /* renamed from: c  reason: collision with root package name */
    private final c f7671c;

    /* renamed from: d  reason: collision with root package name */
    private final c f7672d;

    /* renamed from: e  reason: collision with root package name */
    private final int f7673e;

    /* renamed from: f  reason: collision with root package name */
    private final float[] f7674f;

    /* compiled from: Connector.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* compiled from: Connector.kt */
        /* renamed from: b1.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0176a extends h {
            C0176a(c cVar, int i10) {
                super(cVar, cVar, i10, null);
            }

            @Override // b1.h
            public long e(float f10, float f11, float f12, float f13) {
                return r1.a(f10, f11, f12, f13, d());
            }
        }

        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] b(c cVar, c cVar2, int i10) {
            float[] c10;
            float[] c11;
            if (!m.e(i10, m.f7695a.a())) {
                return null;
            }
            long g10 = cVar.g();
            b.a aVar = b1.b.f7632a;
            boolean e10 = b1.b.e(g10, aVar.b());
            boolean e11 = b1.b.e(cVar2.g(), aVar.b());
            if (e10 && e11) {
                return null;
            }
            if (!e10 && !e11) {
                return null;
            }
            if (!e10) {
                cVar = cVar2;
            }
            qc.q.g(cVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            w wVar = (w) cVar;
            if (e10) {
                c10 = wVar.R().c();
            } else {
                c10 = j.f7678a.c();
            }
            if (e11) {
                c11 = wVar.R().c();
            } else {
                c11 = j.f7678a.c();
            }
            return new float[]{c10[0] / c11[0], c10[1] / c11[1], c10[2] / c11[2]};
        }

        public final h c() {
            return h.f7668j;
        }

        public final h d() {
            return h.f7666h;
        }

        public final h e() {
            return h.f7667i;
        }

        public final h f(c cVar) {
            qc.q.i(cVar, "source");
            return new C0176a(cVar, m.f7695a.c());
        }
    }

    /* compiled from: Connector.kt */
    /* loaded from: classes.dex */
    public static final class b extends h {

        /* renamed from: k  reason: collision with root package name */
        private final w f7675k;

        /* renamed from: l  reason: collision with root package name */
        private final w f7676l;

        /* renamed from: m  reason: collision with root package name */
        private final float[] f7677m;

        public /* synthetic */ b(w wVar, w wVar2, int i10, qc.h hVar) {
            this(wVar, wVar2, i10);
        }

        private final float[] f(w wVar, w wVar2, int i10) {
            if (d.f(wVar.R(), wVar2.R())) {
                return d.k(wVar2.K(), wVar.Q());
            }
            float[] Q = wVar.Q();
            float[] K = wVar2.K();
            float[] c10 = wVar.R().c();
            float[] c11 = wVar2.R().c();
            y R = wVar.R();
            j jVar = j.f7678a;
            if (!d.f(R, jVar.b())) {
                float[] b10 = b1.a.f7627b.a().b();
                float[] c12 = jVar.c();
                float[] copyOf = Arrays.copyOf(c12, c12.length);
                qc.q.h(copyOf, "copyOf(this, size)");
                Q = d.k(d.e(b10, c10, copyOf), wVar.Q());
            }
            if (!d.f(wVar2.R(), jVar.b())) {
                float[] b11 = b1.a.f7627b.a().b();
                float[] c13 = jVar.c();
                float[] copyOf2 = Arrays.copyOf(c13, c13.length);
                qc.q.h(copyOf2, "copyOf(this, size)");
                K = d.j(d.k(d.e(b11, c11, copyOf2), wVar2.Q()));
            }
            if (m.e(i10, m.f7695a.a())) {
                Q = d.l(new float[]{c10[0] / c11[0], c10[1] / c11[1], c10[2] / c11[2]}, Q);
            }
            return d.k(K, Q);
        }

        @Override // b1.h
        public long e(float f10, float f11, float f12, float f13) {
            float a10 = (float) this.f7675k.I().a(f10);
            float a11 = (float) this.f7675k.I().a(f11);
            float a12 = (float) this.f7675k.I().a(f12);
            return r1.a((float) this.f7676l.M().a(d.n(this.f7677m, a10, a11, a12)), (float) this.f7676l.M().a(d.o(this.f7677m, a10, a11, a12)), (float) this.f7676l.M().a(d.p(this.f7677m, a10, a11, a12)), f13, this.f7676l);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private b(w wVar, w wVar2, int i10) {
            super(wVar, wVar2, wVar, wVar2, i10, null, null);
            qc.q.i(wVar, "mSource");
            qc.q.i(wVar2, "mDestination");
            this.f7675k = wVar;
            this.f7676l = wVar2;
            this.f7677m = f(wVar, wVar2, i10);
        }
    }

    static {
        qc.h hVar = null;
        a aVar = new a(hVar);
        f7665g = aVar;
        g gVar = g.f7641a;
        f7666h = aVar.f(gVar.w());
        w w10 = gVar.w();
        c t10 = gVar.t();
        m.a aVar2 = m.f7695a;
        f7667i = new h(w10, t10, aVar2.b(), hVar);
        f7668j = new h(gVar.t(), gVar.w(), aVar2.b(), hVar);
    }

    public /* synthetic */ h(c cVar, c cVar2, int i10, qc.h hVar) {
        this(cVar, cVar2, i10);
    }

    public final c d() {
        return this.f7670b;
    }

    public long e(float f10, float f11, float f12, float f13) {
        long j10 = this.f7671c.j(f10, f11, f12);
        qc.j jVar = qc.j.f21682a;
        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        float m10 = this.f7671c.m(f10, f11, f12);
        float[] fArr = this.f7674f;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            m10 *= fArr[2];
        }
        float f14 = intBitsToFloat2;
        float f15 = intBitsToFloat;
        return this.f7672d.n(f15, f14, m10, f13, this.f7670b);
    }

    public /* synthetic */ h(c cVar, c cVar2, c cVar3, c cVar4, int i10, float[] fArr, qc.h hVar) {
        this(cVar, cVar2, cVar3, cVar4, i10, fArr);
    }

    private h(c cVar, c cVar2, c cVar3, c cVar4, int i10, float[] fArr) {
        qc.q.i(cVar, "source");
        qc.q.i(cVar2, "destination");
        qc.q.i(cVar3, "transformSource");
        qc.q.i(cVar4, "transformDestination");
        this.f7669a = cVar;
        this.f7670b = cVar2;
        this.f7671c = cVar3;
        this.f7672d = cVar4;
        this.f7673e = i10;
        this.f7674f = fArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private h(b1.c r13, b1.c r14, int r15) {
        /*
            r12 = this;
            java.lang.String r0 = "source"
            qc.q.i(r13, r0)
            java.lang.String r0 = "destination"
            qc.q.i(r14, r0)
            long r0 = r13.g()
            b1.b$a r2 = b1.b.f7632a
            long r3 = r2.b()
            boolean r0 = b1.b.e(r0, r3)
            r1 = 2
            r3 = 0
            if (r0 == 0) goto L28
            b1.j r0 = b1.j.f7678a
            b1.y r0 = r0.b()
            b1.c r0 = b1.d.d(r13, r0, r3, r1, r3)
            r7 = r0
            goto L29
        L28:
            r7 = r13
        L29:
            long r4 = r14.g()
            long r8 = r2.b()
            boolean r0 = b1.b.e(r4, r8)
            if (r0 == 0) goto L43
            b1.j r0 = b1.j.f7678a
            b1.y r0 = r0.b()
            b1.c r0 = b1.d.d(r14, r0, r3, r1, r3)
            r8 = r0
            goto L44
        L43:
            r8 = r14
        L44:
            b1.h$a r0 = b1.h.f7665g
            float[] r10 = b1.h.a.a(r0, r13, r14, r15)
            r11 = 0
            r4 = r12
            r5 = r13
            r6 = r14
            r9 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.h.<init>(b1.c, b1.c, int):void");
    }
}
