package t;

import a1.h1;
import a1.r1;
import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.k1;
import androidx.compose.ui.platform.m1;
import androidx.recyclerview.widget.RecyclerView;
import j0.j1;
import j0.y2;
import java.util.List;
import k1.u0;
import kotlin.coroutines.Continuation;
import n1.t0;

/* compiled from: AndroidOverscroll.kt */
/* loaded from: classes.dex */
public final class a implements i0 {

    /* renamed from: a  reason: collision with root package name */
    private final g0 f23075a;

    /* renamed from: b  reason: collision with root package name */
    private z0.f f23076b;

    /* renamed from: c  reason: collision with root package name */
    private final EdgeEffect f23077c;

    /* renamed from: d  reason: collision with root package name */
    private final EdgeEffect f23078d;

    /* renamed from: e  reason: collision with root package name */
    private final EdgeEffect f23079e;

    /* renamed from: f  reason: collision with root package name */
    private final EdgeEffect f23080f;

    /* renamed from: g  reason: collision with root package name */
    private final List<EdgeEffect> f23081g;

    /* renamed from: h  reason: collision with root package name */
    private final EdgeEffect f23082h;

    /* renamed from: i  reason: collision with root package name */
    private final EdgeEffect f23083i;

    /* renamed from: j  reason: collision with root package name */
    private final EdgeEffect f23084j;

    /* renamed from: k  reason: collision with root package name */
    private final EdgeEffect f23085k;

    /* renamed from: l  reason: collision with root package name */
    private final j1<dc.w> f23086l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f23087m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f23088n;

    /* renamed from: o  reason: collision with root package name */
    private long f23089o;

    /* renamed from: p  reason: collision with root package name */
    private final pc.l<j2.p, dc.w> f23090p;

    /* renamed from: q  reason: collision with root package name */
    private k1.b0 f23091q;

    /* renamed from: r  reason: collision with root package name */
    private final androidx.compose.ui.e f23092r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidOverscroll.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect", f = "AndroidOverscroll.kt", l = {219, 244}, m = "applyToFling-BMRW4eQ")
    /* renamed from: t.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0541a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f23093f;

        /* renamed from: m  reason: collision with root package name */
        long f23094m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f23095p;

        /* renamed from: r  reason: collision with root package name */
        int f23097r;

        C0541a(Continuation<? super C0541a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23095p = obj;
            this.f23097r |= RecyclerView.UNDEFINED_DURATION;
            return a.this.d(0L, null, this);
        }
    }

    /* compiled from: AndroidOverscroll.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1", f = "AndroidOverscroll.kt", l = {316}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<k1.l0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f23098f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f23099m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AndroidOverscroll.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1", f = "AndroidOverscroll.kt", l = {317, 321}, m = "invokeSuspend")
        /* renamed from: t.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0542a extends kotlin.coroutines.jvm.internal.k implements pc.p<k1.e, Continuation<? super dc.w>, Object> {

            /* renamed from: m  reason: collision with root package name */
            int f23101m;

            /* renamed from: p  reason: collision with root package name */
            private /* synthetic */ Object f23102p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ a f23103q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0542a(a aVar, Continuation<? super C0542a> continuation) {
                super(2, continuation);
                this.f23103q = aVar;
            }

            @Override // pc.p
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final Object invoke(k1.e eVar, Continuation<? super dc.w> continuation) {
                return ((C0542a) create(eVar, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                C0542a c0542a = new C0542a(this.f23103q, continuation);
                c0542a.f23102p = obj;
                return c0542a;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x006a A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00ea  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00bb A[SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006b -> B:18:0x0070). Please submit an issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    Method dump skipped, instructions count: 247
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: t.a.b.C0542a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(k1.l0 l0Var, Continuation<? super dc.w> continuation) {
            return ((b) create(l0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(continuation);
            bVar.f23099m = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f23098f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                k1.l0 l0Var = (k1.l0) this.f23099m;
                C0542a c0542a = new C0542a(a.this, null);
                this.f23098f = 1;
                if (u.n.c(l0Var, c0542a, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    /* compiled from: AndroidOverscroll.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.l<j2.p, dc.w> {
        c() {
            super(1);
        }

        public final void a(long j10) {
            boolean z10 = !z0.l.f(j2.q.c(j10), a.this.f23089o);
            a.this.f23089o = j2.q.c(j10);
            if (z10) {
                a.this.f23077c.setSize(j2.p.g(j10), j2.p.f(j10));
                a.this.f23078d.setSize(j2.p.g(j10), j2.p.f(j10));
                a.this.f23079e.setSize(j2.p.f(j10), j2.p.g(j10));
                a.this.f23080f.setSize(j2.p.f(j10), j2.p.g(j10));
                a.this.f23082h.setSize(j2.p.g(j10), j2.p.f(j10));
                a.this.f23083i.setSize(j2.p.g(j10), j2.p.f(j10));
                a.this.f23084j.setSize(j2.p.f(j10), j2.p.g(j10));
                a.this.f23085k.setSize(j2.p.f(j10), j2.p.g(j10));
            }
            if (z10) {
                a.this.z();
                a.this.t();
            }
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(j2.p pVar) {
            a(pVar.j());
            return dc.w.f13270a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class d extends qc.r implements pc.l<m1, dc.w> {
        public d() {
            super(1);
        }

        public final void a(m1 m1Var) {
            qc.q.i(m1Var, "$this$null");
            m1Var.b("overscroll");
            m1Var.c(a.this);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(m1 m1Var) {
            a(m1Var);
            return dc.w.f13270a;
        }
    }

    public a(Context context, g0 g0Var) {
        List<EdgeEffect> l10;
        androidx.compose.ui.e eVar;
        pc.l a10;
        qc.q.i(context, "context");
        qc.q.i(g0Var, "overscrollConfig");
        this.f23075a = g0Var;
        r rVar = r.f23203a;
        EdgeEffect a11 = rVar.a(context, null);
        this.f23077c = a11;
        EdgeEffect a12 = rVar.a(context, null);
        this.f23078d = a12;
        EdgeEffect a13 = rVar.a(context, null);
        this.f23079e = a13;
        EdgeEffect a14 = rVar.a(context, null);
        this.f23080f = a14;
        l10 = ec.t.l(a13, a11, a14, a12);
        this.f23081g = l10;
        this.f23082h = rVar.a(context, null);
        this.f23083i = rVar.a(context, null);
        this.f23084j = rVar.a(context, null);
        this.f23085k = rVar.a(context, null);
        int size = l10.size();
        for (int i10 = 0; i10 < size; i10++) {
            l10.get(i10).setColor(r1.k(this.f23075a.b()));
        }
        dc.w wVar = dc.w.f13270a;
        this.f23086l = y2.h(wVar, y2.j());
        this.f23087m = true;
        this.f23089o = z0.l.f26375b.b();
        c cVar = new c();
        this.f23090p = cVar;
        e.a aVar = androidx.compose.ui.e.f2335a;
        eVar = t.b.f23115a;
        androidx.compose.ui.e a15 = t0.a(u0.c(aVar.a(eVar), wVar, new b(null)), cVar);
        if (k1.c()) {
            a10 = new d();
        } else {
            a10 = k1.a();
        }
        this.f23092r = a15.a(new q(this, a10));
    }

    private final float A(long j10, long j11) {
        float o10 = z0.f.o(j11) / z0.l.i(this.f23089o);
        float p10 = z0.f.p(j10) / z0.l.g(this.f23089o);
        r rVar = r.f23203a;
        boolean z10 = true;
        float g10 = (-rVar.d(this.f23078d, -p10, 1 - o10)) * z0.l.g(this.f23089o);
        if (rVar.b(this.f23078d) != 0.0f) {
            z10 = false;
        }
        if (!z10) {
            return z0.f.p(j10);
        }
        return g10;
    }

    private final float B(long j10, long j11) {
        float p10 = z0.f.p(j11) / z0.l.g(this.f23089o);
        float o10 = z0.f.o(j10) / z0.l.i(this.f23089o);
        r rVar = r.f23203a;
        boolean z10 = true;
        float d10 = rVar.d(this.f23079e, o10, 1 - p10) * z0.l.i(this.f23089o);
        if (rVar.b(this.f23079e) != 0.0f) {
            z10 = false;
        }
        if (!z10) {
            return z0.f.o(j10);
        }
        return d10;
    }

    private final float C(long j10, long j11) {
        boolean z10;
        float p10 = z0.f.p(j11) / z0.l.g(this.f23089o);
        float o10 = z0.f.o(j10) / z0.l.i(this.f23089o);
        r rVar = r.f23203a;
        float i10 = (-rVar.d(this.f23080f, -o10, p10)) * z0.l.i(this.f23089o);
        if (rVar.b(this.f23080f) == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return z0.f.o(j10);
        }
        return i10;
    }

    private final float D(long j10, long j11) {
        boolean z10;
        float o10 = z0.f.o(j11) / z0.l.i(this.f23089o);
        float p10 = z0.f.p(j10) / z0.l.g(this.f23089o);
        r rVar = r.f23203a;
        float d10 = rVar.d(this.f23077c, p10, o10) * z0.l.g(this.f23089o);
        if (rVar.b(this.f23077c) == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return z0.f.p(j10);
        }
        return d10;
    }

    private final boolean E(long j10) {
        boolean z10;
        boolean z11 = false;
        if (!this.f23079e.isFinished() && z0.f.o(j10) < 0.0f) {
            r.f23203a.e(this.f23079e, z0.f.o(j10));
            z10 = this.f23079e.isFinished();
        } else {
            z10 = false;
        }
        if (!this.f23080f.isFinished() && z0.f.o(j10) > 0.0f) {
            r.f23203a.e(this.f23080f, z0.f.o(j10));
            if (!z10 && !this.f23080f.isFinished()) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        if (!this.f23077c.isFinished() && z0.f.p(j10) < 0.0f) {
            r.f23203a.e(this.f23077c, z0.f.p(j10));
            if (!z10 && !this.f23077c.isFinished()) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        if (!this.f23078d.isFinished() && z0.f.p(j10) > 0.0f) {
            r.f23203a.e(this.f23078d, z0.f.p(j10));
            if (z10 || this.f23078d.isFinished()) {
                z11 = true;
            }
            return z11;
        }
        return z10;
    }

    private final boolean F() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        long b10 = z0.m.b(this.f23089o);
        r rVar = r.f23203a;
        boolean z14 = false;
        if (rVar.b(this.f23079e) == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            B(z0.f.f26354b.c(), b10);
            z11 = true;
        } else {
            z11 = false;
        }
        if (rVar.b(this.f23080f) == 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12) {
            C(z0.f.f26354b.c(), b10);
            z11 = true;
        }
        if (rVar.b(this.f23077c) == 0.0f) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13) {
            D(z0.f.f26354b.c(), b10);
            z11 = true;
        }
        if (rVar.b(this.f23078d) == 0.0f) {
            z14 = true;
        }
        if (!z14) {
            A(z0.f.f26354b.c(), b10);
            return true;
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        List<EdgeEffect> list = this.f23081g;
        int size = list.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            EdgeEffect edgeEffect = list.get(i10);
            edgeEffect.onRelease();
            if (!edgeEffect.isFinished() && !z10) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        if (z10) {
            z();
        }
    }

    private final boolean u(c1.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-z0.l.i(this.f23089o), (-z0.l.g(this.f23089o)) + fVar.v0(this.f23075a.a().a()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean v(c1.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-z0.l.g(this.f23089o), fVar.v0(this.f23075a.a().c(fVar.getLayoutDirection())));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean x(c1.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        int d10;
        int save = canvas.save();
        d10 = sc.c.d(z0.l.i(this.f23089o));
        float b10 = this.f23075a.a().b(fVar.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, (-d10) + fVar.v0(b10));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean y(c1.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.translate(0.0f, fVar.v0(this.f23075a.a().d()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        if (this.f23087m) {
            this.f23086l.setValue(dc.w.f13270a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017a A[ADDED_TO_REGION] */
    @Override // t.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long a(long r18, int r20, pc.l<? super z0.f, z0.f> r21) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t.a.a(long, int, pc.l):long");
    }

    @Override // t.i0
    public androidx.compose.ui.e b() {
        return this.f23092r;
    }

    @Override // t.i0
    public boolean c() {
        boolean z10;
        List<EdgeEffect> list = this.f23081g;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (r.f23203a.b(list.get(i10)) == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((!z10) != false) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0132 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ac  */
    @Override // t.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(long r12, pc.p<? super j2.v, ? super kotlin.coroutines.Continuation<? super j2.v>, ? extends java.lang.Object> r14, kotlin.coroutines.Continuation<? super dc.w> r15) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t.a.d(long, pc.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void w(c1.f fVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        qc.q.i(fVar, "<this>");
        if (z0.l.k(this.f23089o)) {
            return;
        }
        h1 d10 = fVar.y0().d();
        this.f23086l.getValue();
        Canvas c10 = a1.f0.c(d10);
        r rVar = r.f23203a;
        boolean z15 = true;
        if (rVar.b(this.f23084j) == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            x(fVar, this.f23084j, c10);
            this.f23084j.finish();
        }
        if (!this.f23079e.isFinished()) {
            z11 = v(fVar, this.f23079e, c10);
            rVar.d(this.f23084j, rVar.b(this.f23079e), 0.0f);
        } else {
            z11 = false;
        }
        if (rVar.b(this.f23082h) == 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12) {
            u(fVar, this.f23082h, c10);
            this.f23082h.finish();
        }
        if (!this.f23077c.isFinished()) {
            if (!y(fVar, this.f23077c, c10) && !z11) {
                z11 = false;
            } else {
                z11 = true;
            }
            rVar.d(this.f23082h, rVar.b(this.f23077c), 0.0f);
        }
        if (rVar.b(this.f23085k) == 0.0f) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13) {
            v(fVar, this.f23085k, c10);
            this.f23085k.finish();
        }
        if (!this.f23080f.isFinished()) {
            if (!x(fVar, this.f23080f, c10) && !z11) {
                z11 = false;
            } else {
                z11 = true;
            }
            rVar.d(this.f23085k, rVar.b(this.f23080f), 0.0f);
        }
        if (rVar.b(this.f23083i) == 0.0f) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (!z14) {
            y(fVar, this.f23083i, c10);
            this.f23083i.finish();
        }
        if (!this.f23078d.isFinished()) {
            if (!u(fVar, this.f23078d, c10) && !z11) {
                z15 = false;
            }
            rVar.d(this.f23083i, rVar.b(this.f23078d), 0.0f);
            z11 = z15;
        }
        if (z11) {
            z();
        }
    }
}
