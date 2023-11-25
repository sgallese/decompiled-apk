package c0;

import j0.j1;
import j0.q1;
import j0.y2;
import java.util.List;

/* compiled from: TextFieldScroll.kt */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: f  reason: collision with root package name */
    public static final c f8550f = new c(null);

    /* renamed from: g  reason: collision with root package name */
    private static final s0.i<q0, Object> f8551g = s0.a.a(a.f8557f, b.f8558f);

    /* renamed from: a  reason: collision with root package name */
    private final j0.e1 f8552a;

    /* renamed from: b  reason: collision with root package name */
    private final j0.e1 f8553b;

    /* renamed from: c  reason: collision with root package name */
    private z0.h f8554c;

    /* renamed from: d  reason: collision with root package name */
    private long f8555d;

    /* renamed from: e  reason: collision with root package name */
    private final j1 f8556e;

    /* compiled from: TextFieldScroll.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.p<s0.k, q0, List<? extends Object>> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f8557f = new a();

        a() {
            super(2);
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final List<Object> invoke(s0.k kVar, q0 q0Var) {
            List<Object> l10;
            qc.q.i(kVar, "$this$listSaver");
            qc.q.i(q0Var, "it");
            Object[] objArr = new Object[2];
            boolean z10 = false;
            objArr[0] = Float.valueOf(q0Var.d());
            if (q0Var.f() == u.o.Vertical) {
                z10 = true;
            }
            objArr[1] = Boolean.valueOf(z10);
            l10 = ec.t.l(objArr);
            return l10;
        }
    }

    /* compiled from: TextFieldScroll.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.l<List<? extends Object>, q0> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f8558f = new b();

        b() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final q0 invoke(List<? extends Object> list) {
            u.o oVar;
            qc.q.i(list, "restored");
            Object obj = list.get(1);
            qc.q.g(obj, "null cannot be cast to non-null type kotlin.Boolean");
            if (((Boolean) obj).booleanValue()) {
                oVar = u.o.Vertical;
            } else {
                oVar = u.o.Horizontal;
            }
            Object obj2 = list.get(0);
            qc.q.g(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new q0(oVar, ((Float) obj2).floatValue());
        }
    }

    /* compiled from: TextFieldScroll.kt */
    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(qc.h hVar) {
            this();
        }

        public final s0.i<q0, Object> a() {
            return q0.f8551g;
        }
    }

    public q0(u.o oVar, float f10) {
        qc.q.i(oVar, "initialOrientation");
        this.f8552a = q1.a(f10);
        this.f8553b = q1.a(0.0f);
        this.f8554c = z0.h.f26359e.a();
        this.f8555d = v1.i0.f24470b.a();
        this.f8556e = y2.h(oVar, y2.o());
    }

    private final void g(float f10) {
        this.f8553b.h(f10);
    }

    public final void b(float f10, float f11, int i10) {
        float f12;
        float d10 = d();
        float f13 = i10;
        float f14 = d10 + f13;
        if (f11 > f14 || (f10 < d10 && f11 - f10 > f13)) {
            f12 = f11 - f14;
        } else if (f10 < d10 && f11 - f10 <= f13) {
            f12 = f10 - d10;
        } else {
            f12 = 0.0f;
        }
        h(d() + f12);
    }

    public final float c() {
        return this.f8553b.b();
    }

    public final float d() {
        return this.f8552a.b();
    }

    public final int e(long j10) {
        if (v1.i0.n(j10) != v1.i0.n(this.f8555d)) {
            return v1.i0.n(j10);
        }
        if (v1.i0.i(j10) != v1.i0.i(this.f8555d)) {
            return v1.i0.i(j10);
        }
        return v1.i0.l(j10);
    }

    public final u.o f() {
        return (u.o) this.f8556e.getValue();
    }

    public final void h(float f10) {
        this.f8552a.h(f10);
    }

    public final void i(long j10) {
        this.f8555d = j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r0 == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(u.o r5, z0.h r6, int r7, int r8) {
        /*
            r4 = this;
            java.lang.String r0 = "orientation"
            qc.q.i(r5, r0)
            java.lang.String r0 = "cursorRect"
            qc.q.i(r6, r0)
            int r8 = r8 - r7
            float r8 = (float) r8
            r4.g(r8)
            float r0 = r6.i()
            z0.h r1 = r4.f8554c
            float r1 = r1.i()
            r2 = 1
            r3 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L21
            r0 = 1
            goto L22
        L21:
            r0 = 0
        L22:
            if (r0 == 0) goto L37
            float r0 = r6.l()
            z0.h r1 = r4.f8554c
            float r1 = r1.l()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L34
            r0 = 1
            goto L35
        L34:
            r0 = 0
        L35:
            if (r0 != 0) goto L58
        L37:
            u.o r0 = u.o.Vertical
            if (r5 != r0) goto L3c
            goto L3d
        L3c:
            r2 = 0
        L3d:
            if (r2 == 0) goto L44
            float r5 = r6.l()
            goto L48
        L44:
            float r5 = r6.i()
        L48:
            if (r2 == 0) goto L4f
            float r0 = r6.e()
            goto L53
        L4f:
            float r0 = r6.j()
        L53:
            r4.b(r5, r0, r7)
            r4.f8554c = r6
        L58:
            float r5 = r4.d()
            r6 = 0
            float r5 = vc.j.k(r5, r6, r8)
            r4.h(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.q0.j(u.o, z0.h, int, int):void");
    }

    public /* synthetic */ q0(u.o oVar, float f10, int i10, qc.h hVar) {
        this(oVar, (i10 & 2) != 0 ? 0.0f : f10);
    }

    public q0() {
        this(u.o.Vertical, 0.0f, 2, null);
    }
}
