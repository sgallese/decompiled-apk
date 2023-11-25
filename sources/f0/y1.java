package f0;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j0.g3;
import okhttp3.internal.http2.Http2;

/* compiled from: TextFieldDefaults.kt */
/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: a */
    public static final y1 f15302a = new y1();

    /* renamed from: b */
    private static final float f15303b = j2.h.j(56);

    /* renamed from: c */
    private static final float f15304c = j2.h.j(280);

    /* renamed from: d */
    private static final float f15305d = j2.h.j(1);

    /* renamed from: e */
    private static final float f15306e = j2.h.j(2);

    /* compiled from: TextFieldDefaults.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.p<j0.l, Integer, dc.w> {
        final /* synthetic */ w.s A;
        final /* synthetic */ int B;
        final /* synthetic */ int C;
        final /* synthetic */ int D;

        /* renamed from: m */
        final /* synthetic */ String f15308m;

        /* renamed from: p */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f15309p;

        /* renamed from: q */
        final /* synthetic */ boolean f15310q;

        /* renamed from: r */
        final /* synthetic */ boolean f15311r;

        /* renamed from: s */
        final /* synthetic */ b2.t0 f15312s;

        /* renamed from: t */
        final /* synthetic */ v.k f15313t;

        /* renamed from: u */
        final /* synthetic */ boolean f15314u;

        /* renamed from: v */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f15315v;

        /* renamed from: w */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f15316w;

        /* renamed from: x */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f15317x;

        /* renamed from: y */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f15318y;

        /* renamed from: z */
        final /* synthetic */ w1 f15319z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(String str, pc.p<? super j0.l, ? super Integer, dc.w> pVar, boolean z10, boolean z11, b2.t0 t0Var, v.k kVar, boolean z12, pc.p<? super j0.l, ? super Integer, dc.w> pVar2, pc.p<? super j0.l, ? super Integer, dc.w> pVar3, pc.p<? super j0.l, ? super Integer, dc.w> pVar4, pc.p<? super j0.l, ? super Integer, dc.w> pVar5, w1 w1Var, w.s sVar, int i10, int i11, int i12) {
            super(2);
            y1.this = r3;
            this.f15308m = str;
            this.f15309p = pVar;
            this.f15310q = z10;
            this.f15311r = z11;
            this.f15312s = t0Var;
            this.f15313t = kVar;
            this.f15314u = z12;
            this.f15315v = pVar2;
            this.f15316w = pVar3;
            this.f15317x = pVar4;
            this.f15318y = pVar5;
            this.f15319z = w1Var;
            this.A = sVar;
            this.B = i10;
            this.C = i11;
            this.D = i12;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            y1.this.a(this.f15308m, this.f15309p, this.f15310q, this.f15311r, this.f15312s, this.f15313t, this.f15314u, this.f15315v, this.f15316w, this.f15317x, this.f15318y, this.f15319z, this.A, lVar, j0.z1.a(this.B | 1), j0.z1.a(this.C), this.D);
        }
    }

    /* compiled from: TextFieldDefaults.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.q<androidx.compose.ui.e, j0.l, Integer, androidx.compose.ui.e> {

        /* renamed from: f */
        final /* synthetic */ boolean f15320f;

        /* renamed from: m */
        final /* synthetic */ boolean f15321m;

        /* renamed from: p */
        final /* synthetic */ v.k f15322p;

        /* renamed from: q */
        final /* synthetic */ w1 f15323q;

        /* renamed from: r */
        final /* synthetic */ float f15324r;

        /* renamed from: s */
        final /* synthetic */ float f15325s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, boolean z11, v.k kVar, w1 w1Var, float f10, float f11) {
            super(3);
            this.f15320f = z10;
            this.f15321m = z11;
            this.f15322p = kVar;
            this.f15323q = w1Var;
            this.f15324r = f10;
            this.f15325s = f11;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, j0.l lVar, int i10) {
            g3 b10;
            qc.q.i(eVar, "$this$composed");
            lVar.e(1398930845);
            if (j0.n.K()) {
                j0.n.V(1398930845, i10, -1, "androidx.compose.material.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:280)");
            }
            b10 = z1.b(this.f15320f, this.f15321m, this.f15322p, this.f15323q, this.f15324r, this.f15325s, lVar, 0);
            androidx.compose.ui.e i11 = b2.i(androidx.compose.ui.e.f2335a, (t.g) b10.getValue());
            if (j0.n.K()) {
                j0.n.U();
            }
            lVar.N();
            return i11;
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, j0.l lVar, Integer num) {
            return a(eVar, lVar, num.intValue());
        }
    }

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.l<androidx.compose.ui.platform.m1, dc.w> {

        /* renamed from: f */
        final /* synthetic */ boolean f15326f;

        /* renamed from: m */
        final /* synthetic */ boolean f15327m;

        /* renamed from: p */
        final /* synthetic */ v.k f15328p;

        /* renamed from: q */
        final /* synthetic */ w1 f15329q;

        /* renamed from: r */
        final /* synthetic */ float f15330r;

        /* renamed from: s */
        final /* synthetic */ float f15331s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10, boolean z11, v.k kVar, w1 w1Var, float f10, float f11) {
            super(1);
            this.f15326f = z10;
            this.f15327m = z11;
            this.f15328p = kVar;
            this.f15329q = w1Var;
            this.f15330r = f10;
            this.f15331s = f11;
        }

        public final void a(androidx.compose.ui.platform.m1 m1Var) {
            qc.q.i(m1Var, "$this$null");
            m1Var.b("indicatorLine");
            m1Var.a().c("enabled", Boolean.valueOf(this.f15326f));
            m1Var.a().c("isError", Boolean.valueOf(this.f15327m));
            m1Var.a().c("interactionSource", this.f15328p);
            m1Var.a().c("colors", this.f15329q);
            m1Var.a().c("focusedIndicatorLineThickness", j2.h.f(this.f15330r));
            m1Var.a().c("unfocusedIndicatorLineThickness", j2.h.f(this.f15331s));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(androidx.compose.ui.platform.m1 m1Var) {
            a(m1Var);
            return dc.w.f13270a;
        }
    }

    private y1() {
    }

    public static /* synthetic */ androidx.compose.ui.e e(y1 y1Var, androidx.compose.ui.e eVar, boolean z10, boolean z11, v.k kVar, w1 w1Var, float f10, float f11, int i10, Object obj) {
        float f12;
        float f13;
        if ((i10 & 16) != 0) {
            f12 = f15306e;
        } else {
            f12 = f10;
        }
        if ((i10 & 32) != 0) {
            f13 = f15305d;
        } else {
            f13 = f11;
        }
        return y1Var.d(eVar, z10, z11, kVar, w1Var, f12, f13);
    }

    public static /* synthetic */ w.s h(y1 y1Var, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = a2.f();
        }
        if ((i10 & 2) != 0) {
            f11 = a2.f();
        }
        if ((i10 & 4) != 0) {
            f12 = b2.j();
        }
        if ((i10 & 8) != 0) {
            f13 = b2.k();
        }
        return y1Var.g(f10, f11, f12, f13);
    }

    public static /* synthetic */ w.s j(y1 y1Var, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = a2.f();
        }
        if ((i10 & 2) != 0) {
            f11 = a2.f();
        }
        if ((i10 & 4) != 0) {
            f12 = a2.f();
        }
        if ((i10 & 8) != 0) {
            f13 = a2.f();
        }
        return y1Var.i(f10, f11, f12, f13);
    }

    /* JADX WARN: Removed duplicated region for block: B:244:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:415:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r70, pc.p<? super j0.l, ? super java.lang.Integer, dc.w> r71, boolean r72, boolean r73, b2.t0 r74, v.k r75, boolean r76, pc.p<? super j0.l, ? super java.lang.Integer, dc.w> r77, pc.p<? super j0.l, ? super java.lang.Integer, dc.w> r78, pc.p<? super j0.l, ? super java.lang.Integer, dc.w> r79, pc.p<? super j0.l, ? super java.lang.Integer, dc.w> r80, f0.w1 r81, w.s r82, j0.l r83, int r84, int r85, int r86) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.y1.a(java.lang.String, pc.p, boolean, boolean, b2.t0, v.k, boolean, pc.p, pc.p, pc.p, pc.p, f0.w1, w.s, j0.l, int, int, int):void");
    }

    public final float b() {
        return f15303b;
    }

    public final float c() {
        return f15304c;
    }

    public final androidx.compose.ui.e d(androidx.compose.ui.e eVar, boolean z10, boolean z11, v.k kVar, w1 w1Var, float f10, float f11) {
        pc.l a10;
        qc.q.i(eVar, "$this$indicatorLine");
        qc.q.i(kVar, "interactionSource");
        qc.q.i(w1Var, "colors");
        if (androidx.compose.ui.platform.k1.c()) {
            a10 = new c(z10, z11, kVar, w1Var, f10, f11);
        } else {
            a10 = androidx.compose.ui.platform.k1.a();
        }
        return androidx.compose.ui.c.a(eVar, a10, new b(z10, z11, kVar, w1Var, f10, f11));
    }

    public final w1 f(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, j0.l lVar, int i10, int i11, int i12, int i13) {
        lVar.e(231892599);
        long o10 = (i13 & 1) != 0 ? a1.p1.o(((a1.p1) lVar.C(p.a())).y(), ((Number) lVar.C(o.a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long o11 = (i13 & 2) != 0 ? a1.p1.o(o10, n.f14905a.b(lVar, 6), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long o12 = (i13 & 4) != 0 ? a1.p1.o(s0.f15068a.a(lVar, 6).i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long j31 = (i13 & 8) != 0 ? s0.f15068a.a(lVar, 6).j() : j13;
        long d10 = (i13 & 16) != 0 ? s0.f15068a.a(lVar, 6).d() : j14;
        long o13 = (i13 & 32) != 0 ? a1.p1.o(s0.f15068a.a(lVar, 6).j(), n.f14905a.c(lVar, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long o14 = (i13 & 64) != 0 ? a1.p1.o(s0.f15068a.a(lVar, 6).i(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long o15 = (i13 & 128) != 0 ? a1.p1.o(o14, n.f14905a.b(lVar, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long d11 = (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? s0.f15068a.a(lVar, 6).d() : j18;
        long o16 = (i13 & 512) != 0 ? a1.p1.o(s0.f15068a.a(lVar, 6).i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long o17 = (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? a1.p1.o(o16, n.f14905a.b(lVar, 6), 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long j32 = (i13 & RecyclerView.m.FLAG_MOVED) != 0 ? o16 : j21;
        long o18 = (i13 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? a1.p1.o(s0.f15068a.a(lVar, 6).i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j22;
        long o19 = (i13 & 8192) != 0 ? a1.p1.o(o18, n.f14905a.b(lVar, 6), 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long d12 = (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? s0.f15068a.a(lVar, 6).d() : j24;
        long o20 = (32768 & i13) != 0 ? a1.p1.o(s0.f15068a.a(lVar, 6).j(), n.f14905a.c(lVar, 6), 0.0f, 0.0f, 0.0f, 14, null) : j25;
        long o21 = (65536 & i13) != 0 ? a1.p1.o(s0.f15068a.a(lVar, 6).i(), n.f14905a.d(lVar, 6), 0.0f, 0.0f, 0.0f, 14, null) : j26;
        long o22 = (131072 & i13) != 0 ? a1.p1.o(o21, n.f14905a.b(lVar, 6), 0.0f, 0.0f, 0.0f, 14, null) : j27;
        long d13 = (262144 & i13) != 0 ? s0.f15068a.a(lVar, 6).d() : j28;
        long o23 = (524288 & i13) != 0 ? a1.p1.o(s0.f15068a.a(lVar, 6).i(), n.f14905a.d(lVar, 6), 0.0f, 0.0f, 0.0f, 14, null) : j29;
        long o24 = (i13 & 1048576) != 0 ? a1.p1.o(o23, n.f14905a.b(lVar, 6), 0.0f, 0.0f, 0.0f, 14, null) : j30;
        if (j0.n.K()) {
            j0.n.V(231892599, i10, i11, "androidx.compose.material.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:376)");
        }
        w wVar = new w(o10, o11, j31, d10, o13, o14, d11, o15, o16, o17, j32, o18, o19, d12, o12, o20, o21, o22, d13, o23, o24, null);
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return wVar;
    }

    public final w.s g(float f10, float f11, float f12, float f13) {
        return androidx.compose.foundation.layout.j.d(f10, f12, f11, f13);
    }

    public final w.s i(float f10, float f11, float f12, float f13) {
        return androidx.compose.foundation.layout.j.d(f10, f11, f12, f13);
    }
}
