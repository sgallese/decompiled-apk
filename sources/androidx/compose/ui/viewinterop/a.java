package androidx.compose.ui.viewinterop;

import a1.h1;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.compose.ui.platform.u1;
import androidx.compose.ui.viewinterop.a;
import androidx.compose.ui.viewinterop.d;
import androidx.core.view.f0;
import androidx.core.view.g0;
import androidx.lifecycle.d1;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import dc.w;
import java.util.List;
import k1.n0;
import kotlin.coroutines.Continuation;
import n1.i0;
import n1.k0;
import n1.l0;
import n1.s;
import n1.y0;
import p1.i1;
import p1.j0;
import qc.q;
import qc.r;
import t0.v;
import t1.x;

/* compiled from: AndroidViewHolder.android.kt */
/* loaded from: classes.dex */
public class a extends ViewGroup implements f0, j0.k {
    private final v A;
    private final pc.l<a, w> B;
    private final pc.a<w> C;
    private pc.l<? super Boolean, w> D;
    private final int[] E;
    private int F;
    private int G;
    private final g0 H;
    private final j0 I;

    /* renamed from: f  reason: collision with root package name */
    private final int f3029f;

    /* renamed from: m  reason: collision with root package name */
    private final j1.c f3030m;

    /* renamed from: p  reason: collision with root package name */
    private final View f3031p;

    /* renamed from: q  reason: collision with root package name */
    private pc.a<w> f3032q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f3033r;

    /* renamed from: s  reason: collision with root package name */
    private pc.a<w> f3034s;

    /* renamed from: t  reason: collision with root package name */
    private pc.a<w> f3035t;

    /* renamed from: u  reason: collision with root package name */
    private androidx.compose.ui.e f3036u;

    /* renamed from: v  reason: collision with root package name */
    private pc.l<? super androidx.compose.ui.e, w> f3037v;

    /* renamed from: w  reason: collision with root package name */
    private j2.e f3038w;

    /* renamed from: x  reason: collision with root package name */
    private pc.l<? super j2.e, w> f3039x;

    /* renamed from: y  reason: collision with root package name */
    private androidx.lifecycle.v f3040y;

    /* renamed from: z  reason: collision with root package name */
    private w3.d f3041z;

    /* compiled from: AndroidViewHolder.android.kt */
    /* renamed from: androidx.compose.ui.viewinterop.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0048a extends r implements pc.l<androidx.compose.ui.e, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j0 f3042f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f3043m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0048a(j0 j0Var, androidx.compose.ui.e eVar) {
            super(1);
            this.f3042f = j0Var;
            this.f3043m = eVar;
        }

        public final void a(androidx.compose.ui.e eVar) {
            q.i(eVar, "it");
            this.f3042f.e(eVar.a(this.f3043m));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(androidx.compose.ui.e eVar) {
            a(eVar);
            return w.f13270a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    /* loaded from: classes.dex */
    static final class b extends r implements pc.l<j2.e, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j0 f3044f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j0 j0Var) {
            super(1);
            this.f3044f = j0Var;
        }

        public final void a(j2.e eVar) {
            q.i(eVar, "it");
            this.f3044f.m(eVar);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(j2.e eVar) {
            a(eVar);
            return w.f13270a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    /* loaded from: classes.dex */
    static final class c extends r implements pc.l<i1, w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ j0 f3046m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(j0 j0Var) {
            super(1);
            this.f3046m = j0Var;
        }

        public final void a(i1 i1Var) {
            AndroidComposeView androidComposeView;
            q.i(i1Var, "owner");
            if (i1Var instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) i1Var;
            } else {
                androidComposeView = null;
            }
            if (androidComposeView != null) {
                androidComposeView.L(a.this, this.f3046m);
            }
            ViewParent parent = a.this.getView().getParent();
            a aVar = a.this;
            if (parent != aVar) {
                aVar.addView(aVar.getView());
            }
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(i1 i1Var) {
            a(i1Var);
            return w.f13270a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    /* loaded from: classes.dex */
    static final class d extends r implements pc.l<i1, w> {
        d() {
            super(1);
        }

        public final void a(i1 i1Var) {
            AndroidComposeView androidComposeView;
            q.i(i1Var, "owner");
            if (i1Var instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) i1Var;
            } else {
                androidComposeView = null;
            }
            if (androidComposeView != null) {
                androidComposeView.n0(a.this);
            }
            a.this.removeAllViewsInLayout();
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(i1 i1Var) {
            a(i1Var);
            return w.f13270a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    /* loaded from: classes.dex */
    public static final class e implements i0 {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j0 f3049b;

        /* compiled from: AndroidViewHolder.android.kt */
        /* renamed from: androidx.compose.ui.viewinterop.a$e$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0049a extends r implements pc.l<y0.a, w> {

            /* renamed from: f  reason: collision with root package name */
            public static final C0049a f3050f = new C0049a();

            C0049a() {
                super(1);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(y0.a aVar) {
                q.i(aVar, "$this$layout");
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ w invoke(y0.a aVar) {
                invoke2(aVar);
                return w.f13270a;
            }
        }

        /* compiled from: AndroidViewHolder.android.kt */
        /* loaded from: classes.dex */
        static final class b extends r implements pc.l<y0.a, w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ a f3051f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ j0 f3052m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(a aVar, j0 j0Var) {
                super(1);
                this.f3051f = aVar;
                this.f3052m = j0Var;
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ w invoke(y0.a aVar) {
                invoke2(aVar);
                return w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(y0.a aVar) {
                q.i(aVar, "$this$layout");
                androidx.compose.ui.viewinterop.d.f(this.f3051f, this.f3052m);
            }
        }

        e(j0 j0Var) {
            this.f3049b = j0Var;
        }

        private final int a(int i10) {
            a aVar = a.this;
            ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
            q.f(layoutParams);
            aVar.measure(aVar.h(0, i10, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return a.this.getMeasuredHeight();
        }

        private final int b(int i10) {
            a aVar = a.this;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            a aVar2 = a.this;
            ViewGroup.LayoutParams layoutParams = aVar2.getLayoutParams();
            q.f(layoutParams);
            aVar.measure(makeMeasureSpec, aVar2.h(0, i10, layoutParams.height));
            return a.this.getMeasuredWidth();
        }

        @Override // n1.i0
        public int maxIntrinsicHeight(n1.n nVar, List<? extends n1.m> list, int i10) {
            q.i(nVar, "<this>");
            q.i(list, "measurables");
            return a(i10);
        }

        @Override // n1.i0
        public int maxIntrinsicWidth(n1.n nVar, List<? extends n1.m> list, int i10) {
            q.i(nVar, "<this>");
            q.i(list, "measurables");
            return b(i10);
        }

        @Override // n1.i0
        /* renamed from: measure-3p2s80s */
        public n1.j0 mo0measure3p2s80s(l0 l0Var, List<? extends n1.g0> list, long j10) {
            q.i(l0Var, "$this$measure");
            q.i(list, "measurables");
            if (a.this.getChildCount() == 0) {
                return k0.b(l0Var, j2.b.p(j10), j2.b.o(j10), null, C0049a.f3050f, 4, null);
            }
            if (j2.b.p(j10) != 0) {
                a.this.getChildAt(0).setMinimumWidth(j2.b.p(j10));
            }
            if (j2.b.o(j10) != 0) {
                a.this.getChildAt(0).setMinimumHeight(j2.b.o(j10));
            }
            a aVar = a.this;
            int p10 = j2.b.p(j10);
            int n10 = j2.b.n(j10);
            ViewGroup.LayoutParams layoutParams = a.this.getLayoutParams();
            q.f(layoutParams);
            int h10 = aVar.h(p10, n10, layoutParams.width);
            a aVar2 = a.this;
            int o10 = j2.b.o(j10);
            int m10 = j2.b.m(j10);
            ViewGroup.LayoutParams layoutParams2 = a.this.getLayoutParams();
            q.f(layoutParams2);
            aVar.measure(h10, aVar2.h(o10, m10, layoutParams2.height));
            return k0.b(l0Var, a.this.getMeasuredWidth(), a.this.getMeasuredHeight(), null, new b(a.this, this.f3049b), 4, null);
        }

        @Override // n1.i0
        public int minIntrinsicHeight(n1.n nVar, List<? extends n1.m> list, int i10) {
            q.i(nVar, "<this>");
            q.i(list, "measurables");
            return a(i10);
        }

        @Override // n1.i0
        public int minIntrinsicWidth(n1.n nVar, List<? extends n1.m> list, int i10) {
            q.i(nVar, "<this>");
            q.i(list, "measurables");
            return b(i10);
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    /* loaded from: classes.dex */
    static final class f extends r implements pc.l<x, w> {

        /* renamed from: f  reason: collision with root package name */
        public static final f f3053f = new f();

        f() {
            super(1);
        }

        public final void a(x xVar) {
            q.i(xVar, "$this$semantics");
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(x xVar) {
            a(xVar);
            return w.f13270a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    /* loaded from: classes.dex */
    static final class g extends r implements pc.l<c1.f, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j0 f3054f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ a f3055m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(j0 j0Var, a aVar) {
            super(1);
            this.f3054f = j0Var;
            this.f3055m = aVar;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(c1.f fVar) {
            invoke2(fVar);
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(c1.f fVar) {
            q.i(fVar, "$this$drawBehind");
            j0 j0Var = this.f3054f;
            a aVar = this.f3055m;
            h1 d10 = fVar.y0().d();
            i1 k02 = j0Var.k0();
            AndroidComposeView androidComposeView = k02 instanceof AndroidComposeView ? (AndroidComposeView) k02 : null;
            if (androidComposeView != null) {
                androidComposeView.S(aVar, a1.f0.c(d10));
            }
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    /* loaded from: classes.dex */
    static final class h extends r implements pc.l<s, w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ j0 f3057m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(j0 j0Var) {
            super(1);
            this.f3057m = j0Var;
        }

        public final void a(s sVar) {
            q.i(sVar, "it");
            androidx.compose.ui.viewinterop.d.f(a.this, this.f3057m);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(s sVar) {
            a(sVar);
            return w.f13270a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    /* loaded from: classes.dex */
    static final class i extends r implements pc.l<a, w> {
        i() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(pc.a aVar) {
            q.i(aVar, "$tmp0");
            aVar.invoke();
        }

        public final void b(a aVar) {
            q.i(aVar, "it");
            Handler handler = a.this.getHandler();
            final pc.a aVar2 = a.this.C;
            handler.post(new Runnable() { // from class: androidx.compose.ui.viewinterop.b
                @Override // java.lang.Runnable
                public final void run() {
                    a.i.c(pc.a.this);
                }
            });
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(a aVar) {
            b(aVar);
            return w.f13270a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", l = {522, 527}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class j extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f3059f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f3060m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ a f3061p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ long f3062q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(boolean z10, a aVar, long j10, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f3060m = z10;
            this.f3061p = aVar;
            this.f3062q = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new j(this.f3060m, this.f3061p, this.f3062q, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super w> continuation) {
            return ((j) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f3059f;
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dc.n.b(obj);
            } else {
                dc.n.b(obj);
                if (!this.f3060m) {
                    j1.c cVar = this.f3061p.f3030m;
                    long a10 = j2.v.f19013b.a();
                    long j10 = this.f3062q;
                    this.f3059f = 1;
                    if (cVar.a(a10, j10, this) == d10) {
                        return d10;
                    }
                } else {
                    j1.c cVar2 = this.f3061p.f3030m;
                    long j11 = this.f3062q;
                    long a11 = j2.v.f19013b.a();
                    this.f3059f = 2;
                    if (cVar2.a(j11, a11, this) == d10) {
                        return d10;
                    }
                }
            }
            return w.f13270a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", l = {540}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class k extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f3063f;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ long f3065p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(long j10, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f3065p = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new k(this.f3065p, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super w> continuation) {
            return ((k) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f3063f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                j1.c cVar = a.this.f3030m;
                long j10 = this.f3065p;
                this.f3063f = 1;
                if (cVar.c(j10, this) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    /* loaded from: classes.dex */
    static final class l extends r implements pc.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public static final l f3066f = new l();

        l() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f13270a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    /* loaded from: classes.dex */
    static final class m extends r implements pc.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public static final m f3067f = new m();

        m() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f13270a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    /* loaded from: classes.dex */
    static final class n extends r implements pc.a<w> {
        n() {
            super(0);
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (a.this.f3033r) {
                v vVar = a.this.A;
                a aVar = a.this;
                vVar.n(aVar, aVar.B, a.this.getUpdate());
            }
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    /* loaded from: classes.dex */
    static final class o extends r implements pc.l<pc.a<? extends w>, w> {
        o() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(pc.a aVar) {
            q.i(aVar, "$tmp0");
            aVar.invoke();
        }

        public final void b(final pc.a<w> aVar) {
            q.i(aVar, "command");
            if (a.this.getHandler().getLooper() == Looper.myLooper()) {
                aVar.invoke();
            } else {
                a.this.getHandler().post(new Runnable() { // from class: androidx.compose.ui.viewinterop.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.o.c(pc.a.this);
                    }
                });
            }
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(pc.a<? extends w> aVar) {
            b(aVar);
            return w.f13270a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    /* loaded from: classes.dex */
    static final class p extends r implements pc.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public static final p f3070f = new p();

        p() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f13270a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, j0.p pVar, int i10, j1.c cVar, View view) {
        super(context);
        d.a aVar;
        q.i(context, "context");
        q.i(cVar, "dispatcher");
        q.i(view, "view");
        this.f3029f = i10;
        this.f3030m = cVar;
        this.f3031p = view;
        if (pVar != null) {
            WindowRecomposer_androidKt.i(this, pVar);
        }
        boolean z10 = false;
        setSaveFromParentEnabled(false);
        addView(view);
        this.f3032q = p.f3070f;
        this.f3034s = m.f3067f;
        this.f3035t = l.f3066f;
        e.a aVar2 = androidx.compose.ui.e.f2335a;
        this.f3036u = aVar2;
        this.f3038w = j2.g.b(1.0f, 0.0f, 2, null);
        this.A = new v(new o());
        this.B = new i();
        this.C = new n();
        this.E = new int[2];
        this.F = RecyclerView.UNDEFINED_DURATION;
        this.G = RecyclerView.UNDEFINED_DURATION;
        this.H = new g0(this);
        int i11 = z10 ? 1 : 0;
        j0 j0Var = new j0(z10, i11, 3, null);
        j0Var.p1(this);
        aVar = androidx.compose.ui.viewinterop.d.f3073a;
        androidx.compose.ui.e a10 = androidx.compose.ui.layout.c.a(androidx.compose.ui.draw.b.b(n0.a(t1.o.b(androidx.compose.ui.input.nestedscroll.a.a(aVar2, aVar, cVar), true, f.f3053f), this), new g(j0Var, this)), new h(j0Var));
        j0Var.d(i10);
        j0Var.e(this.f3036u.a(a10));
        this.f3037v = new C0048a(j0Var, a10);
        j0Var.m(this.f3038w);
        this.f3039x = new b(j0Var);
        j0Var.t1(new c(j0Var));
        j0Var.u1(new d());
        j0Var.n(new e(j0Var));
        this.I = j0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int h(int i10, int i11, int i12) {
        int l10;
        if (i12 >= 0 || i10 == i11) {
            l10 = vc.l.l(i12, i10, i11);
            return View.MeasureSpec.makeMeasureSpec(l10, 1073741824);
        } else if (i12 == -2 && i11 != Integer.MAX_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(i11, RecyclerView.UNDEFINED_DURATION);
        } else {
            if (i12 == -1 && i11 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            }
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
    }

    @Override // j0.k
    public void b() {
        this.f3035t.invoke();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.E);
        int[] iArr = this.E;
        int i10 = iArr[0];
        region.op(i10, iArr[1], i10 + getWidth(), this.E[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    public final j2.e getDensity() {
        return this.f3038w;
    }

    public final View getInteropView() {
        return this.f3031p;
    }

    public final j0 getLayoutNode() {
        return this.I;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f3031p.getLayoutParams();
        if (layoutParams == null) {
            return new ViewGroup.LayoutParams(-1, -1);
        }
        return layoutParams;
    }

    public final androidx.lifecycle.v getLifecycleOwner() {
        return this.f3040y;
    }

    public final androidx.compose.ui.e getModifier() {
        return this.f3036u;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.H.a();
    }

    public final pc.l<j2.e, w> getOnDensityChanged$ui_release() {
        return this.f3039x;
    }

    public final pc.l<androidx.compose.ui.e, w> getOnModifierChanged$ui_release() {
        return this.f3037v;
    }

    public final pc.l<Boolean, w> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.D;
    }

    public final pc.a<w> getRelease() {
        return this.f3035t;
    }

    public final pc.a<w> getReset() {
        return this.f3034s;
    }

    public final w3.d getSavedStateRegistryOwner() {
        return this.f3041z;
    }

    public final pc.a<w> getUpdate() {
        return this.f3032q;
    }

    public final View getView() {
        return this.f3031p;
    }

    @Override // j0.k
    public void i() {
        this.f3034s.invoke();
        removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        this.I.B0();
        return null;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f3031p.isNestedScrollingEnabled();
    }

    public final void j() {
        int i10;
        int i11 = this.F;
        if (i11 != Integer.MIN_VALUE && (i10 = this.G) != Integer.MIN_VALUE) {
            measure(i11, i10);
        }
    }

    @Override // j0.k
    public void l() {
        if (this.f3031p.getParent() != this) {
            addView(this.f3031p);
        } else {
            this.f3034s.invoke();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A.r();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        q.i(view, "child");
        q.i(view2, "target");
        super.onDescendantInvalidated(view, view2);
        this.I.B0();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A.s();
        this.A.j();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f3031p.layout(0, 0, i12 - i10, i13 - i11);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f3031p.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
            return;
        }
        this.f3031p.measure(i10, i11);
        setMeasuredDimension(this.f3031p.getMeasuredWidth(), this.f3031p.getMeasuredHeight());
        this.F = i10;
        this.G = i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        float h10;
        float h11;
        q.i(view, "target");
        if (isNestedScrollingEnabled()) {
            h10 = androidx.compose.ui.viewinterop.d.h(f10);
            h11 = androidx.compose.ui.viewinterop.d.h(f11);
            ad.i.d(this.f3030m.e(), null, null, new j(z10, this, j2.w.a(h10, h11), null), 3, null);
            return false;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        float h10;
        float h11;
        q.i(view, "target");
        if (isNestedScrollingEnabled()) {
            h10 = androidx.compose.ui.viewinterop.d.h(f10);
            h11 = androidx.compose.ui.viewinterop.d.h(f11);
            ad.i.d(this.f3030m.e(), null, null, new k(j2.w.a(h10, h11), null), 3, null);
            return false;
        }
        return false;
    }

    @Override // androidx.core.view.e0
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        float g10;
        float g11;
        int i13;
        q.i(view, "target");
        q.i(iArr, "consumed");
        if (!isNestedScrollingEnabled()) {
            return;
        }
        j1.c cVar = this.f3030m;
        g10 = androidx.compose.ui.viewinterop.d.g(i10);
        g11 = androidx.compose.ui.viewinterop.d.g(i11);
        long a10 = z0.g.a(g10, g11);
        i13 = androidx.compose.ui.viewinterop.d.i(i12);
        long d10 = cVar.d(a10, i13);
        iArr[0] = u1.b(z0.f.o(d10));
        iArr[1] = u1.b(z0.f.p(d10));
    }

    @Override // androidx.core.view.f0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        float g10;
        float g11;
        float g12;
        float g13;
        int i15;
        q.i(view, "target");
        q.i(iArr, "consumed");
        if (isNestedScrollingEnabled()) {
            j1.c cVar = this.f3030m;
            g10 = androidx.compose.ui.viewinterop.d.g(i10);
            g11 = androidx.compose.ui.viewinterop.d.g(i11);
            long a10 = z0.g.a(g10, g11);
            g12 = androidx.compose.ui.viewinterop.d.g(i12);
            g13 = androidx.compose.ui.viewinterop.d.g(i13);
            long a11 = z0.g.a(g12, g13);
            i15 = androidx.compose.ui.viewinterop.d.i(i14);
            long b10 = cVar.b(a10, a11, i15);
            iArr[0] = u1.b(z0.f.o(b10));
            iArr[1] = u1.b(z0.f.p(b10));
        }
    }

    @Override // androidx.core.view.e0
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        q.i(view, "child");
        q.i(view2, "target");
        this.H.c(view, view2, i10, i11);
    }

    @Override // androidx.core.view.e0
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        q.i(view, "child");
        q.i(view2, "target");
        if ((i10 & 2) != 0 || (i10 & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.core.view.e0
    public void onStopNestedScroll(View view, int i10) {
        q.i(view, "target");
        this.H.e(view, i10);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (Build.VERSION.SDK_INT < 23 && i10 == 0) {
            this.I.B0();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        pc.l<? super Boolean, w> lVar = this.D;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z10));
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void setDensity(j2.e eVar) {
        q.i(eVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (eVar != this.f3038w) {
            this.f3038w = eVar;
            pc.l<? super j2.e, w> lVar = this.f3039x;
            if (lVar != null) {
                lVar.invoke(eVar);
            }
        }
    }

    public final void setLifecycleOwner(androidx.lifecycle.v vVar) {
        if (vVar != this.f3040y) {
            this.f3040y = vVar;
            d1.b(this, vVar);
        }
    }

    public final void setModifier(androidx.compose.ui.e eVar) {
        q.i(eVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (eVar != this.f3036u) {
            this.f3036u = eVar;
            pc.l<? super androidx.compose.ui.e, w> lVar = this.f3037v;
            if (lVar != null) {
                lVar.invoke(eVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(pc.l<? super j2.e, w> lVar) {
        this.f3039x = lVar;
    }

    public final void setOnModifierChanged$ui_release(pc.l<? super androidx.compose.ui.e, w> lVar) {
        this.f3037v = lVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(pc.l<? super Boolean, w> lVar) {
        this.D = lVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setRelease(pc.a<w> aVar) {
        q.i(aVar, "<set-?>");
        this.f3035t = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setReset(pc.a<w> aVar) {
        q.i(aVar, "<set-?>");
        this.f3034s = aVar;
    }

    public final void setSavedStateRegistryOwner(w3.d dVar) {
        if (dVar != this.f3041z) {
            this.f3041z = dVar;
            w3.e.b(this, dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setUpdate(pc.a<w> aVar) {
        q.i(aVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f3032q = aVar;
        this.f3033r = true;
        this.C.invoke();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // androidx.core.view.e0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        float g10;
        float g11;
        float g12;
        float g13;
        int i15;
        q.i(view, "target");
        if (isNestedScrollingEnabled()) {
            j1.c cVar = this.f3030m;
            g10 = androidx.compose.ui.viewinterop.d.g(i10);
            g11 = androidx.compose.ui.viewinterop.d.g(i11);
            long a10 = z0.g.a(g10, g11);
            g12 = androidx.compose.ui.viewinterop.d.g(i12);
            g13 = androidx.compose.ui.viewinterop.d.g(i13);
            long a11 = z0.g.a(g12, g13);
            i15 = androidx.compose.ui.viewinterop.d.i(i14);
            cVar.b(a10, a11, i15);
        }
    }
}
