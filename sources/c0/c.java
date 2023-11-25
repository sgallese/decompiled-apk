package c0;

import j0.j1;
import j0.z1;

/* compiled from: BasicTextField.kt */
/* loaded from: classes.dex */
public final class c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BasicTextField.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.l<v1.g0, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f8186f = new a();

        a() {
            super(1);
        }

        public final void a(v1.g0 g0Var) {
            qc.q.i(g0Var, "it");
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(v1.g0 g0Var) {
            a(g0Var);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BasicTextField.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.a<dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b2.j0 f8187f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ j1<b2.j0> f8188m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(b2.j0 j0Var, j1<b2.j0> j1Var) {
            super(0);
            this.f8187f = j0Var;
            this.f8188m = j1Var;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (v1.i0.g(this.f8187f.g(), c.b(this.f8188m).g()) && qc.q.d(this.f8187f.f(), c.b(this.f8188m).f())) {
                return;
            }
            c.c(this.f8188m, this.f8187f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BasicTextField.kt */
    /* renamed from: c0.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0197c extends qc.r implements pc.l<b2.j0, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.l<String, dc.w> f8189f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ j1<b2.j0> f8190m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ j1<String> f8191p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0197c(pc.l<? super String, dc.w> lVar, j1<b2.j0> j1Var, j1<String> j1Var2) {
            super(1);
            this.f8189f = lVar;
            this.f8190m = j1Var;
            this.f8191p = j1Var2;
        }

        public final void a(b2.j0 j0Var) {
            qc.q.i(j0Var, "newTextFieldValueState");
            c.c(this.f8190m, j0Var);
            boolean z10 = !qc.q.d(c.d(this.f8191p), j0Var.h());
            c.e(this.f8191p, j0Var.h());
            if (z10) {
                this.f8189f.invoke(j0Var.h());
            }
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(b2.j0 j0Var) {
            a(j0Var);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BasicTextField.kt */
    /* loaded from: classes.dex */
    public static final class d extends qc.r implements pc.p<j0.l, Integer, dc.w> {
        final /* synthetic */ v.m A;
        final /* synthetic */ a1.e1 B;
        final /* synthetic */ pc.q<pc.p<? super j0.l, ? super Integer, dc.w>, j0.l, Integer, dc.w> C;
        final /* synthetic */ int D;
        final /* synthetic */ int E;
        final /* synthetic */ int F;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f8192f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.l<String, dc.w> f8193m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f8194p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ boolean f8195q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ boolean f8196r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ v1.k0 f8197s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ x f8198t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ w f8199u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ boolean f8200v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ int f8201w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ int f8202x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ b2.t0 f8203y;

        /* renamed from: z  reason: collision with root package name */
        final /* synthetic */ pc.l<v1.g0, dc.w> f8204z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(String str, pc.l<? super String, dc.w> lVar, androidx.compose.ui.e eVar, boolean z10, boolean z11, v1.k0 k0Var, x xVar, w wVar, boolean z12, int i10, int i11, b2.t0 t0Var, pc.l<? super v1.g0, dc.w> lVar2, v.m mVar, a1.e1 e1Var, pc.q<? super pc.p<? super j0.l, ? super Integer, dc.w>, ? super j0.l, ? super Integer, dc.w> qVar, int i12, int i13, int i14) {
            super(2);
            this.f8192f = str;
            this.f8193m = lVar;
            this.f8194p = eVar;
            this.f8195q = z10;
            this.f8196r = z11;
            this.f8197s = k0Var;
            this.f8198t = xVar;
            this.f8199u = wVar;
            this.f8200v = z12;
            this.f8201w = i10;
            this.f8202x = i11;
            this.f8203y = t0Var;
            this.f8204z = lVar2;
            this.A = mVar;
            this.B = e1Var;
            this.C = qVar;
            this.D = i12;
            this.E = i13;
            this.F = i14;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            c.a(this.f8192f, this.f8193m, this.f8194p, this.f8195q, this.f8196r, this.f8197s, this.f8198t, this.f8199u, this.f8200v, this.f8201w, this.f8202x, this.f8203y, this.f8204z, this.A, this.B, this.C, lVar, z1.a(this.D | 1), z1.a(this.E), this.F);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:275:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r41, pc.l<? super java.lang.String, dc.w> r42, androidx.compose.ui.e r43, boolean r44, boolean r45, v1.k0 r46, c0.x r47, c0.w r48, boolean r49, int r50, int r51, b2.t0 r52, pc.l<? super v1.g0, dc.w> r53, v.m r54, a1.e1 r55, pc.q<? super pc.p<? super j0.l, ? super java.lang.Integer, dc.w>, ? super j0.l, ? super java.lang.Integer, dc.w> r56, j0.l r57, int r58, int r59, int r60) {
        /*
            Method dump skipped, instructions count: 1250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.c.a(java.lang.String, pc.l, androidx.compose.ui.e, boolean, boolean, v1.k0, c0.x, c0.w, boolean, int, int, b2.t0, pc.l, v.m, a1.e1, pc.q, j0.l, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b2.j0 b(j1<b2.j0> j1Var) {
        return j1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(j1<b2.j0> j1Var, b2.j0 j0Var) {
        j1Var.setValue(j0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(j1<String> j1Var) {
        return j1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(j1<String> j1Var, String str) {
        j1Var.setValue(str);
    }
}
