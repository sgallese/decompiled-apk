package f0;

import a1.q4;
import j0.i2;
import j0.l3;
import kotlin.coroutines.Continuation;
import p1.g;

/* compiled from: Surface.kt */
/* loaded from: classes.dex */
public final class r1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Surface.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f15025f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ q4 f15026m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ long f15027p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ float f15028q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f15029r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ t.g f15030s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ float f15031t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f15032u;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Surface.kt */
        /* renamed from: f0.r1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0357a extends qc.r implements pc.l<t1.x, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            public static final C0357a f15033f = new C0357a();

            C0357a() {
                super(1);
            }

            public final void a(t1.x xVar) {
                qc.q.i(xVar, "$this$semantics");
                t1.v.I(xVar, true);
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(t1.x xVar) {
                a(xVar);
                return dc.w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Surface.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<k1.l0, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f15034f;

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
                return new b(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ic.d.d();
                if (this.f15034f == 0) {
                    dc.n.b(obj);
                    return dc.w.f13270a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.e eVar, q4 q4Var, long j10, float f10, int i10, t.g gVar, float f11, pc.p<? super j0.l, ? super Integer, dc.w> pVar) {
            super(2);
            this.f15025f = eVar;
            this.f15026m = q4Var;
            this.f15027p = j10;
            this.f15028q = f10;
            this.f15029r = i10;
            this.f15030s = gVar;
            this.f15031t = f11;
            this.f15032u = pVar;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.t()) {
                lVar.z();
                return;
            }
            if (j0.n.K()) {
                j0.n.V(-1822160838, i10, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:117)");
            }
            androidx.compose.ui.e c10 = k1.u0.c(t1.o.b(r1.e(this.f15025f, this.f15026m, r1.f(this.f15027p, (e0) lVar.C(f0.d()), this.f15028q, lVar, (this.f15029r >> 6) & 14), this.f15030s, this.f15031t), false, C0357a.f15033f), dc.w.f13270a, new b(null));
            pc.p<j0.l, Integer, dc.w> pVar = this.f15032u;
            int i11 = this.f15029r;
            lVar.e(733328855);
            n1.i0 h10 = androidx.compose.foundation.layout.d.h(v0.b.f24258a.n(), true, lVar, 48);
            lVar.e(-1323940314);
            int a10 = j0.j.a(lVar, 0);
            j0.v F = lVar.F();
            g.a aVar = p1.g.f20790l;
            pc.a<p1.g> a11 = aVar.a();
            pc.q<i2<p1.g>, j0.l, Integer, dc.w> a12 = n1.x.a(c10);
            if (!(lVar.u() instanceof j0.f)) {
                j0.j.c();
            }
            lVar.s();
            if (lVar.n()) {
                lVar.B(a11);
            } else {
                lVar.H();
            }
            j0.l a13 = l3.a(lVar);
            l3.b(a13, h10, aVar.e());
            l3.b(a13, F, aVar.g());
            pc.p<p1.g, Integer, dc.w> b10 = aVar.b();
            if (a13.n() || !qc.q.d(a13.f(), Integer.valueOf(a10))) {
                a13.J(Integer.valueOf(a10));
                a13.I(Integer.valueOf(a10), b10);
            }
            a12.invoke(i2.a(i2.b(lVar)), lVar, 0);
            lVar.e(2058660585);
            androidx.compose.foundation.layout.e eVar = androidx.compose.foundation.layout.e.f2083a;
            pVar.invoke(lVar, Integer.valueOf((i11 >> 18) & 14));
            lVar.N();
            lVar.O();
            lVar.N();
            lVar.N();
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Surface.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f15035f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ q4 f15036m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ long f15037p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ long f15038q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ t.g f15039r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ float f15040s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f15041t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ int f15042u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ int f15043v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.e eVar, q4 q4Var, long j10, long j11, t.g gVar, float f10, pc.p<? super j0.l, ? super Integer, dc.w> pVar, int i10, int i11) {
            super(2);
            this.f15035f = eVar;
            this.f15036m = q4Var;
            this.f15037p = j10;
            this.f15038q = j11;
            this.f15039r = gVar;
            this.f15040s = f10;
            this.f15041t = pVar;
            this.f15042u = i10;
            this.f15043v = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            r1.a(this.f15035f, this.f15036m, this.f15037p, this.f15038q, this.f15039r, this.f15040s, this.f15041t, lVar, j0.z1.a(this.f15042u | 1), this.f15043v);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Surface.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f15044f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ q4 f15045m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ long f15046p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ float f15047q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f15048r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ t.g f15049s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ float f15050t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ v.m f15051u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ boolean f15052v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ pc.a<dc.w> f15053w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f15054x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(androidx.compose.ui.e eVar, q4 q4Var, long j10, float f10, int i10, t.g gVar, float f11, v.m mVar, boolean z10, pc.a<dc.w> aVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar) {
            super(2);
            this.f15044f = eVar;
            this.f15045m = q4Var;
            this.f15046p = j10;
            this.f15047q = f10;
            this.f15048r = i10;
            this.f15049s = gVar;
            this.f15050t = f11;
            this.f15051u = mVar;
            this.f15052v = z10;
            this.f15053w = aVar;
            this.f15054x = pVar;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.t()) {
                lVar.z();
                return;
            }
            if (j0.n.K()) {
                j0.n.V(2031491085, i10, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:227)");
            }
            androidx.compose.ui.e c10 = androidx.compose.foundation.e.c(r1.e(o0.c(this.f15044f), this.f15045m, r1.f(this.f15046p, (e0) lVar.C(f0.d()), this.f15047q, lVar, (this.f15048r >> 12) & 14), this.f15049s, this.f15050t), this.f15051u, h0.n.e(false, 0.0f, 0L, lVar, 0, 7), this.f15052v, null, null, this.f15053w, 24, null);
            pc.p<j0.l, Integer, dc.w> pVar = this.f15054x;
            int i11 = this.f15048r;
            lVar.e(733328855);
            n1.i0 h10 = androidx.compose.foundation.layout.d.h(v0.b.f24258a.n(), true, lVar, 48);
            lVar.e(-1323940314);
            int a10 = j0.j.a(lVar, 0);
            j0.v F = lVar.F();
            g.a aVar = p1.g.f20790l;
            pc.a<p1.g> a11 = aVar.a();
            pc.q<i2<p1.g>, j0.l, Integer, dc.w> a12 = n1.x.a(c10);
            if (!(lVar.u() instanceof j0.f)) {
                j0.j.c();
            }
            lVar.s();
            if (lVar.n()) {
                lVar.B(a11);
            } else {
                lVar.H();
            }
            j0.l a13 = l3.a(lVar);
            l3.b(a13, h10, aVar.e());
            l3.b(a13, F, aVar.g());
            pc.p<p1.g, Integer, dc.w> b10 = aVar.b();
            if (a13.n() || !qc.q.d(a13.f(), Integer.valueOf(a10))) {
                a13.J(Integer.valueOf(a10));
                a13.I(Integer.valueOf(a10), b10);
            }
            a12.invoke(i2.a(i2.b(lVar)), lVar, 0);
            lVar.e(2058660585);
            androidx.compose.foundation.layout.e eVar = androidx.compose.foundation.layout.e.f2083a;
            pVar.invoke(lVar, Integer.valueOf((i11 >> 27) & 14));
            lVar.N();
            lVar.O();
            lVar.N();
            lVar.N();
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Surface.kt */
    /* loaded from: classes.dex */
    public static final class d extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.a<dc.w> f15055f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f15056m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ boolean f15057p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ q4 f15058q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ long f15059r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ long f15060s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ t.g f15061t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ float f15062u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ v.m f15063v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f15064w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ int f15065x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ int f15066y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(pc.a<dc.w> aVar, androidx.compose.ui.e eVar, boolean z10, q4 q4Var, long j10, long j11, t.g gVar, float f10, v.m mVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar, int i10, int i11) {
            super(2);
            this.f15055f = aVar;
            this.f15056m = eVar;
            this.f15057p = z10;
            this.f15058q = q4Var;
            this.f15059r = j10;
            this.f15060s = j11;
            this.f15061t = gVar;
            this.f15062u = f10;
            this.f15063v = mVar;
            this.f15064w = pVar;
            this.f15065x = i10;
            this.f15066y = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            r1.b(this.f15055f, this.f15056m, this.f15057p, this.f15058q, this.f15059r, this.f15060s, this.f15061t, this.f15062u, this.f15063v, this.f15064w, lVar, j0.z1.a(this.f15065x | 1), this.f15066y);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.e r22, a1.q4 r23, long r24, long r26, t.g r28, float r29, pc.p<? super j0.l, ? super java.lang.Integer, dc.w> r30, j0.l r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.r1.a(androidx.compose.ui.e, a1.q4, long, long, t.g, float, pc.p, j0.l, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(pc.a<dc.w> r30, androidx.compose.ui.e r31, boolean r32, a1.q4 r33, long r34, long r36, t.g r38, float r39, v.m r40, pc.p<? super j0.l, ? super java.lang.Integer, dc.w> r41, j0.l r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 723
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.r1.b(pc.a, androidx.compose.ui.e, boolean, a1.q4, long, long, t.g, float, v.m, pc.p, j0.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, q4 q4Var, long j10, t.g gVar, float f10) {
        androidx.compose.ui.e eVar2;
        androidx.compose.ui.e b10 = x0.m.b(eVar, f10, q4Var, false, 0L, 0L, 24, null);
        if (gVar != null) {
            eVar2 = t.e.e(androidx.compose.ui.e.f2335a, gVar, q4Var);
        } else {
            eVar2 = androidx.compose.ui.e.f2335a;
        }
        return x0.e.a(androidx.compose.foundation.c.c(b10.a(eVar2), j10, q4Var), q4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long f(long j10, e0 e0Var, float f10, j0.l lVar, int i10) {
        lVar.e(1561611256);
        if (j0.n.K()) {
            j0.n.V(1561611256, i10, -1, "androidx.compose.material.surfaceColorAtElevation (Surface.kt:630)");
        }
        if (a1.p1.q(j10, s0.f15068a.a(lVar, 6).n()) && e0Var != null) {
            j10 = e0Var.a(j10, f10, lVar, (i10 & 14) | ((i10 >> 3) & 112) | ((i10 << 3) & 896));
        }
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return j10;
    }
}
