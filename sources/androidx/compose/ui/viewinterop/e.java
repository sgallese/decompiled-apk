package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import dc.w;
import j0.g2;
import j0.l3;
import j0.z1;
import kotlin.NoWhenBranchMatchedException;
import p1.g;
import p1.j0;
import qc.q;
import qc.r;

/* compiled from: AndroidView.android.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final pc.l<View, w> f3074a = j.f3094f;

    /* compiled from: Composables.kt */
    /* loaded from: classes.dex */
    public static final class a extends r implements pc.a<j0> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.a f3075f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pc.a aVar) {
            super(0);
            this.f3075f = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [p1.j0, java.lang.Object] */
        @Override // pc.a
        public final j0 invoke() {
            return this.f3075f.invoke();
        }
    }

    /* compiled from: Composables.kt */
    /* loaded from: classes.dex */
    public static final class b extends r implements pc.a<j0> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.a f3076f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(pc.a aVar) {
            super(0);
            this.f3076f = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [p1.j0, java.lang.Object] */
        @Override // pc.a
        public final j0 invoke() {
            return this.f3076f.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidView.android.kt */
    /* loaded from: classes.dex */
    public static final class c extends r implements pc.p<j0.l, Integer, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.l<Context, T> f3077f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f3078m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ pc.l<T, w> f3079p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f3080q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f3081r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(pc.l<? super Context, ? extends T> lVar, androidx.compose.ui.e eVar, pc.l<? super T, w> lVar2, int i10, int i11) {
            super(2);
            this.f3077f = lVar;
            this.f3078m = eVar;
            this.f3079p = lVar2;
            this.f3080q = i10;
            this.f3081r = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            e.a(this.f3077f, this.f3078m, this.f3079p, lVar, z1.a(this.f3080q | 1), this.f3081r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AndroidView.android.kt */
    /* loaded from: classes.dex */
    public static final class d<T> extends r implements pc.p<j0, pc.l<? super T, ? extends w>, w> {

        /* renamed from: f  reason: collision with root package name */
        public static final d f3082f = new d();

        d() {
            super(2);
        }

        public final void a(j0 j0Var, pc.l<? super T, w> lVar) {
            q.i(j0Var, "$this$set");
            q.i(lVar, "it");
            e.f(j0Var).setResetBlock(lVar);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(j0 j0Var, Object obj) {
            a(j0Var, (pc.l) obj);
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AndroidView.android.kt */
    /* renamed from: androidx.compose.ui.viewinterop.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0050e<T> extends r implements pc.p<j0, pc.l<? super T, ? extends w>, w> {

        /* renamed from: f  reason: collision with root package name */
        public static final C0050e f3083f = new C0050e();

        C0050e() {
            super(2);
        }

        public final void a(j0 j0Var, pc.l<? super T, w> lVar) {
            q.i(j0Var, "$this$set");
            q.i(lVar, "it");
            e.f(j0Var).setUpdateBlock(lVar);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(j0 j0Var, Object obj) {
            a(j0Var, (pc.l) obj);
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AndroidView.android.kt */
    /* loaded from: classes.dex */
    public static final class f<T> extends r implements pc.p<j0, pc.l<? super T, ? extends w>, w> {

        /* renamed from: f  reason: collision with root package name */
        public static final f f3084f = new f();

        f() {
            super(2);
        }

        public final void a(j0 j0Var, pc.l<? super T, w> lVar) {
            q.i(j0Var, "$this$set");
            q.i(lVar, "it");
            e.f(j0Var).setReleaseBlock(lVar);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(j0 j0Var, Object obj) {
            a(j0Var, (pc.l) obj);
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AndroidView.android.kt */
    /* loaded from: classes.dex */
    public static final class g<T> extends r implements pc.p<j0, pc.l<? super T, ? extends w>, w> {

        /* renamed from: f  reason: collision with root package name */
        public static final g f3085f = new g();

        g() {
            super(2);
        }

        public final void a(j0 j0Var, pc.l<? super T, w> lVar) {
            q.i(j0Var, "$this$set");
            q.i(lVar, "it");
            e.f(j0Var).setUpdateBlock(lVar);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(j0 j0Var, Object obj) {
            a(j0Var, (pc.l) obj);
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AndroidView.android.kt */
    /* loaded from: classes.dex */
    public static final class h<T> extends r implements pc.p<j0, pc.l<? super T, ? extends w>, w> {

        /* renamed from: f  reason: collision with root package name */
        public static final h f3086f = new h();

        h() {
            super(2);
        }

        public final void a(j0 j0Var, pc.l<? super T, w> lVar) {
            q.i(j0Var, "$this$set");
            q.i(lVar, "it");
            e.f(j0Var).setReleaseBlock(lVar);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(j0 j0Var, Object obj) {
            a(j0Var, (pc.l) obj);
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidView.android.kt */
    /* loaded from: classes.dex */
    public static final class i extends r implements pc.p<j0.l, Integer, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.l<Context, T> f3087f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f3088m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ pc.l<T, w> f3089p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ pc.l<T, w> f3090q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ pc.l<T, w> f3091r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ int f3092s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ int f3093t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(pc.l<? super Context, ? extends T> lVar, androidx.compose.ui.e eVar, pc.l<? super T, w> lVar2, pc.l<? super T, w> lVar3, pc.l<? super T, w> lVar4, int i10, int i11) {
            super(2);
            this.f3087f = lVar;
            this.f3088m = eVar;
            this.f3089p = lVar2;
            this.f3090q = lVar3;
            this.f3091r = lVar4;
            this.f3092s = i10;
            this.f3093t = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            e.b(this.f3087f, this.f3088m, this.f3089p, this.f3090q, this.f3091r, lVar, z1.a(this.f3092s | 1), this.f3093t);
        }
    }

    /* compiled from: AndroidView.android.kt */
    /* loaded from: classes.dex */
    static final class j extends r implements pc.l<View, w> {

        /* renamed from: f  reason: collision with root package name */
        public static final j f3094f = new j();

        j() {
            super(1);
        }

        public final void a(View view) {
            q.i(view, "$this$null");
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(View view) {
            a(view);
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidView.android.kt */
    /* loaded from: classes.dex */
    public static final class k extends r implements pc.a<j0> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Context f3095f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.l<Context, T> f3096m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ j0.p f3097p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ s0.f f3098q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f3099r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(Context context, pc.l<? super Context, ? extends T> lVar, j0.p pVar, s0.f fVar, int i10) {
            super(0);
            this.f3095f = context;
            this.f3096m = lVar;
            this.f3097p = pVar;
            this.f3098q = fVar;
            this.f3099r = i10;
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final j0 invoke() {
            return new androidx.compose.ui.viewinterop.f(this.f3095f, this.f3096m, this.f3097p, this.f3098q, this.f3099r).getLayoutNode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidView.android.kt */
    /* loaded from: classes.dex */
    public static final class l extends r implements pc.p<j0, androidx.compose.ui.e, w> {

        /* renamed from: f  reason: collision with root package name */
        public static final l f3100f = new l();

        l() {
            super(2);
        }

        public final void a(j0 j0Var, androidx.compose.ui.e eVar) {
            q.i(j0Var, "$this$set");
            q.i(eVar, "it");
            e.f(j0Var).setModifier(eVar);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(j0 j0Var, androidx.compose.ui.e eVar) {
            a(j0Var, eVar);
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidView.android.kt */
    /* loaded from: classes.dex */
    public static final class m extends r implements pc.p<j0, j2.e, w> {

        /* renamed from: f  reason: collision with root package name */
        public static final m f3101f = new m();

        m() {
            super(2);
        }

        public final void a(j0 j0Var, j2.e eVar) {
            q.i(j0Var, "$this$set");
            q.i(eVar, "it");
            e.f(j0Var).setDensity(eVar);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(j0 j0Var, j2.e eVar) {
            a(j0Var, eVar);
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidView.android.kt */
    /* loaded from: classes.dex */
    public static final class n extends r implements pc.p<j0, v, w> {

        /* renamed from: f  reason: collision with root package name */
        public static final n f3102f = new n();

        n() {
            super(2);
        }

        public final void a(j0 j0Var, v vVar) {
            q.i(j0Var, "$this$set");
            q.i(vVar, "it");
            e.f(j0Var).setLifecycleOwner(vVar);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(j0 j0Var, v vVar) {
            a(j0Var, vVar);
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidView.android.kt */
    /* loaded from: classes.dex */
    public static final class o extends r implements pc.p<j0, w3.d, w> {

        /* renamed from: f  reason: collision with root package name */
        public static final o f3103f = new o();

        o() {
            super(2);
        }

        public final void a(j0 j0Var, w3.d dVar) {
            q.i(j0Var, "$this$set");
            q.i(dVar, "it");
            e.f(j0Var).setSavedStateRegistryOwner(dVar);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(j0 j0Var, w3.d dVar) {
            a(j0Var, dVar);
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidView.android.kt */
    /* loaded from: classes.dex */
    public static final class p extends r implements pc.p<j0, j2.r, w> {

        /* renamed from: f  reason: collision with root package name */
        public static final p f3104f = new p();

        /* compiled from: AndroidView.android.kt */
        /* loaded from: classes.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f3105a;

            static {
                int[] iArr = new int[j2.r.values().length];
                try {
                    iArr[j2.r.Ltr.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[j2.r.Rtl.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f3105a = iArr;
            }
        }

        p() {
            super(2);
        }

        public final void a(j0 j0Var, j2.r rVar) {
            q.i(j0Var, "$this$set");
            q.i(rVar, "it");
            androidx.compose.ui.viewinterop.f f10 = e.f(j0Var);
            int i10 = a.f3105a[rVar.ordinal()];
            int i11 = 1;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i11 = 0;
            }
            f10.setLayoutDirection(i11);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(j0 j0Var, j2.r rVar) {
            a(j0Var, rVar);
            return w.f13270a;
        }
    }

    public static final <T extends View> void a(pc.l<? super Context, ? extends T> lVar, androidx.compose.ui.e eVar, pc.l<? super T, w> lVar2, j0.l lVar3, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        q.i(lVar, "factory");
        j0.l q10 = lVar3.q(-1783766393);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (q10.l(lVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (q10.Q(eVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i17 = i11 & 4;
        if (i17 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (q10.l(lVar2)) {
                i15 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 731) == 146 && q10.t()) {
            q10.z();
        } else {
            if (i16 != 0) {
                eVar = androidx.compose.ui.e.f2335a;
            }
            if (i17 != 0) {
                lVar2 = f3074a;
            }
            if (j0.n.K()) {
                j0.n.V(-1783766393, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:100)");
            }
            androidx.compose.ui.e eVar2 = eVar;
            b(lVar, eVar2, null, f3074a, lVar2, q10, (i12 & 14) | 3072 | (i12 & 112) | ((i12 << 6) & 57344), 4);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
        androidx.compose.ui.e eVar3 = eVar;
        pc.l<? super T, w> lVar4 = lVar2;
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new c(lVar, eVar3, lVar4, i10, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends android.view.View> void b(pc.l<? super android.content.Context, ? extends T> r21, androidx.compose.ui.e r22, pc.l<? super T, dc.w> r23, pc.l<? super T, dc.w> r24, pc.l<? super T, dc.w> r25, j0.l r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.e.b(pc.l, androidx.compose.ui.e, pc.l, pc.l, pc.l, j0.l, int, int):void");
    }

    private static final <T extends View> pc.a<j0> d(pc.l<? super Context, ? extends T> lVar, j0.l lVar2, int i10) {
        lVar2.e(2030558801);
        if (j0.n.K()) {
            j0.n.V(2030558801, i10, -1, "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:261)");
        }
        k kVar = new k((Context) lVar2.C(androidx.compose.ui.platform.j0.g()), lVar, j0.j.d(lVar2, 0), (s0.f) lVar2.C(s0.h.b()), j0.j.a(lVar2, 0));
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar2.N();
        return kVar;
    }

    public static final pc.l<View, w> e() {
        return f3074a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends View> androidx.compose.ui.viewinterop.f<T> f(j0 j0Var) {
        androidx.compose.ui.viewinterop.a Q = j0Var.Q();
        if (Q != null) {
            q.g(Q, "null cannot be cast to non-null type androidx.compose.ui.viewinterop.ViewFactoryHolder<T of androidx.compose.ui.viewinterop.AndroidView_androidKt.requireViewFactoryHolder>");
            return (androidx.compose.ui.viewinterop.f) Q;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    private static final <T extends View> void g(j0.l lVar, androidx.compose.ui.e eVar, int i10, j2.e eVar2, v vVar, w3.d dVar, j2.r rVar, j0.v vVar2) {
        g.a aVar = p1.g.f20790l;
        l3.b(lVar, vVar2, aVar.g());
        l3.b(lVar, eVar, l.f3100f);
        l3.b(lVar, eVar2, m.f3101f);
        l3.b(lVar, vVar, n.f3102f);
        l3.b(lVar, dVar, o.f3103f);
        l3.b(lVar, rVar, p.f3104f);
        pc.p<p1.g, Integer, w> b10 = aVar.b();
        if (lVar.n() || !q.d(lVar.f(), Integer.valueOf(i10))) {
            lVar.J(Integer.valueOf(i10));
            lVar.I(Integer.valueOf(i10), b10);
        }
    }
}
