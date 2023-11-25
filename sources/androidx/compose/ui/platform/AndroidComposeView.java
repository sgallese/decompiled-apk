package androidx.compose.ui.platform;

import a2.k;
import a2.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.h4;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import b2.a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import h1.a;
import i1.a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import p1.i1;
import p1.j0;
import z0.f;

/* compiled from: AndroidComposeView.android.kt */
@SuppressLint({"ViewConstructor", "VisibleForTests"})
/* loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements p1.i1, r4, k1.r0, androidx.lifecycle.i {
    public static final a H0 = new a(null);
    private static Class<?> I0;
    private static Method J0;
    private final x A;
    private final l A0;
    private final w0.d0 B;
    private final Runnable B0;
    private final List<p1.g1> C;
    private boolean C0;
    private List<p1.g1> D;
    private final pc.a<dc.w> D0;
    private boolean E;
    private final t0 E0;
    private final k1.k F;
    private boolean F0;
    private final k1.g0 G;
    private final k1.z G0;
    private pc.l<? super Configuration, dc.w> H;
    private final w0.e I;
    private boolean J;
    private final androidx.compose.ui.platform.m K;
    private final androidx.compose.ui.platform.l L;
    private final p1.k1 M;
    private boolean N;
    private r0 O;
    private e1 P;
    private j2.b Q;
    private boolean R;
    private final p1.t0 S;
    private final g4 T;
    private long U;
    private final int[] V;
    private final float[] W;

    /* renamed from: a0  reason: collision with root package name */
    private final float[] f2491a0;

    /* renamed from: b0  reason: collision with root package name */
    private long f2492b0;

    /* renamed from: c0  reason: collision with root package name */
    private boolean f2493c0;

    /* renamed from: d0  reason: collision with root package name */
    private long f2494d0;

    /* renamed from: e0  reason: collision with root package name */
    private boolean f2495e0;

    /* renamed from: f  reason: collision with root package name */
    private long f2496f;

    /* renamed from: f0  reason: collision with root package name */
    private final j0.j1 f2497f0;

    /* renamed from: g0  reason: collision with root package name */
    private final j0.g3 f2498g0;

    /* renamed from: h0  reason: collision with root package name */
    private pc.l<? super b, dc.w> f2499h0;

    /* renamed from: i0  reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f2500i0;

    /* renamed from: j0  reason: collision with root package name */
    private final ViewTreeObserver.OnScrollChangedListener f2501j0;

    /* renamed from: k0  reason: collision with root package name */
    private final ViewTreeObserver.OnTouchModeChangeListener f2502k0;

    /* renamed from: l0  reason: collision with root package name */
    private final b2.d0 f2503l0;

    /* renamed from: m  reason: collision with root package name */
    private boolean f2504m;

    /* renamed from: m0  reason: collision with root package name */
    private final b2.l0 f2505m0;

    /* renamed from: n0  reason: collision with root package name */
    private final k.a f2506n0;

    /* renamed from: o0  reason: collision with root package name */
    private final j0.j1 f2507o0;

    /* renamed from: p  reason: collision with root package name */
    private final p1.l0 f2508p;

    /* renamed from: p0  reason: collision with root package name */
    private int f2509p0;

    /* renamed from: q  reason: collision with root package name */
    private j2.e f2510q;

    /* renamed from: q0  reason: collision with root package name */
    private final j0.j1 f2511q0;

    /* renamed from: r  reason: collision with root package name */
    private final EmptySemanticsElement f2512r;

    /* renamed from: r0  reason: collision with root package name */
    private final g1.a f2513r0;

    /* renamed from: s  reason: collision with root package name */
    private final y0.j f2514s;

    /* renamed from: s0  reason: collision with root package name */
    private final h1.c f2515s0;

    /* renamed from: t  reason: collision with root package name */
    private final u4 f2516t;

    /* renamed from: t0  reason: collision with root package name */
    private final o1.f f2517t0;

    /* renamed from: u  reason: collision with root package name */
    private final androidx.compose.ui.e f2518u;

    /* renamed from: u0  reason: collision with root package name */
    private final w3 f2519u0;

    /* renamed from: v  reason: collision with root package name */
    private final androidx.compose.ui.e f2520v;

    /* renamed from: v0  reason: collision with root package name */
    private final hc.f f2521v0;

    /* renamed from: w  reason: collision with root package name */
    private final a1.i1 f2522w;

    /* renamed from: w0  reason: collision with root package name */
    private MotionEvent f2523w0;

    /* renamed from: x  reason: collision with root package name */
    private final p1.j0 f2524x;

    /* renamed from: x0  reason: collision with root package name */
    private long f2525x0;

    /* renamed from: y  reason: collision with root package name */
    private final p1.q1 f2526y;

    /* renamed from: y0  reason: collision with root package name */
    private final s4<p1.g1> f2527y0;

    /* renamed from: z  reason: collision with root package name */
    private final t1.r f2528z;

    /* renamed from: z0  reason: collision with root package name */
    private final k0.f<pc.a<dc.w>> f2529z0;

    /* compiled from: AndroidComposeView.android.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @SuppressLint({"PrivateApi", "BanUncheckedReflection"})
        public final boolean b() {
            Object obj;
            Method method;
            try {
                Boolean bool = null;
                if (AndroidComposeView.I0 == null) {
                    AndroidComposeView.I0 = Class.forName("android.os.SystemProperties");
                    Class cls = AndroidComposeView.I0;
                    if (cls != null) {
                        method = cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                    } else {
                        method = null;
                    }
                    AndroidComposeView.J0 = method;
                }
                Method method2 = AndroidComposeView.J0;
                if (method2 != null) {
                    obj = method2.invoke(null, "debug.layout", Boolean.FALSE);
                } else {
                    obj = null;
                }
                if (obj instanceof Boolean) {
                    bool = obj;
                }
                if (bool == null) {
                    return false;
                }
                return bool.booleanValue();
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.lifecycle.v f2530a;

        /* renamed from: b  reason: collision with root package name */
        private final w3.d f2531b;

        public b(androidx.lifecycle.v vVar, w3.d dVar) {
            qc.q.i(vVar, "lifecycleOwner");
            qc.q.i(dVar, "savedStateRegistryOwner");
            this.f2530a = vVar;
            this.f2531b = dVar;
        }

        public final androidx.lifecycle.v a() {
            return this.f2530a;
        }

        public final w3.d b() {
            return this.f2531b;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.l<h1.a, Boolean> {
        c() {
            super(1);
        }

        public final Boolean a(int i10) {
            boolean z10;
            a.C0387a c0387a = h1.a.f16438b;
            if (h1.a.f(i10, c0387a.b())) {
                z10 = AndroidComposeView.this.isInTouchMode();
            } else if (h1.a.f(i10, c0387a.a())) {
                if (AndroidComposeView.this.isInTouchMode()) {
                    z10 = AndroidComposeView.this.requestFocusFromTouch();
                } else {
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Boolean invoke(h1.a aVar) {
            return a(aVar.i());
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    /* loaded from: classes.dex */
    public static final class d extends androidx.core.view.a {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p1.j0 f2533d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f2534e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f2535f;

        /* compiled from: AndroidComposeView.android.kt */
        /* loaded from: classes.dex */
        static final class a extends qc.r implements pc.l<p1.j0, Boolean> {

            /* renamed from: f  reason: collision with root package name */
            public static final a f2536f = new a();

            a() {
                super(1);
            }

            @Override // pc.l
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(p1.j0 j0Var) {
                qc.q.i(j0Var, "it");
                return Boolean.valueOf(j0Var.i0().q(p1.z0.a(8)));
            }
        }

        d(p1.j0 j0Var, AndroidComposeView androidComposeView, AndroidComposeView androidComposeView2) {
            this.f2533d = j0Var;
            this.f2534e = androidComposeView;
            this.f2535f = androidComposeView2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
        
            if (r7.intValue() == r6.f2534e.getSemanticsOwner().a().m()) goto L9;
         */
        @Override // androidx.core.view.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void g(android.view.View r7, androidx.core.view.accessibility.n0 r8) {
            /*
                r6 = this;
                java.lang.String r0 = "host"
                qc.q.i(r7, r0)
                java.lang.String r0 = "info"
                qc.q.i(r8, r0)
                super.g(r7, r8)
                p1.j0 r7 = r6.f2533d
                androidx.compose.ui.platform.AndroidComposeView$d$a r0 = androidx.compose.ui.platform.AndroidComposeView.d.a.f2536f
                p1.j0 r7 = t1.q.f(r7, r0)
                if (r7 == 0) goto L20
                int r7 = r7.n0()
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                goto L21
            L20:
                r7 = 0
            L21:
                if (r7 == 0) goto L37
                androidx.compose.ui.platform.AndroidComposeView r0 = r6.f2534e
                t1.r r0 = r0.getSemanticsOwner()
                t1.p r0 = r0.a()
                int r0 = r0.m()
                int r1 = r7.intValue()
                if (r1 != r0) goto L3c
            L37:
                r7 = -1
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            L3c:
                androidx.compose.ui.platform.AndroidComposeView r0 = r6.f2535f
                int r7 = r7.intValue()
                r8.K0(r0, r7)
                p1.j0 r7 = r6.f2533d
                int r7 = r7.n0()
                androidx.compose.ui.platform.AndroidComposeView r0 = r6.f2534e
                androidx.compose.ui.platform.x r0 = androidx.compose.ui.platform.AndroidComposeView.A(r0)
                java.util.HashMap r0 = r0.V()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
                java.lang.Object r0 = r0.get(r1)
                java.lang.Integer r0 = (java.lang.Integer) r0
                java.lang.String r1 = "info.unwrap()"
                if (r0 == 0) goto L92
                androidx.compose.ui.platform.AndroidComposeView r2 = r6.f2534e
                androidx.compose.ui.platform.AndroidComposeView r3 = r6.f2535f
                int r4 = r0.intValue()
                androidx.compose.ui.platform.r0 r5 = r2.getAndroidViewsHandler$ui_release()
                int r0 = r0.intValue()
                android.view.View r0 = androidx.compose.ui.platform.y.H(r5, r0)
                if (r0 == 0) goto L7d
                r8.Z0(r0)
                goto L80
            L7d:
                r8.a1(r3, r4)
            L80:
                android.view.accessibility.AccessibilityNodeInfo r0 = r8.d1()
                qc.q.h(r0, r1)
                androidx.compose.ui.platform.x r3 = androidx.compose.ui.platform.AndroidComposeView.A(r2)
                java.lang.String r3 = r3.S()
                androidx.compose.ui.platform.AndroidComposeView.z(r2, r7, r0, r3)
            L92:
                androidx.compose.ui.platform.AndroidComposeView r0 = r6.f2534e
                androidx.compose.ui.platform.x r0 = androidx.compose.ui.platform.AndroidComposeView.A(r0)
                java.util.HashMap r0 = r0.U()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
                java.lang.Object r0 = r0.get(r2)
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 == 0) goto Ld7
                androidx.compose.ui.platform.AndroidComposeView r2 = r6.f2534e
                androidx.compose.ui.platform.AndroidComposeView r3 = r6.f2535f
                int r4 = r0.intValue()
                androidx.compose.ui.platform.r0 r5 = r2.getAndroidViewsHandler$ui_release()
                int r0 = r0.intValue()
                android.view.View r0 = androidx.compose.ui.platform.y.H(r5, r0)
                if (r0 == 0) goto Lc2
                r8.X0(r0)
                goto Lc5
            Lc2:
                r8.Y0(r3, r4)
            Lc5:
                android.view.accessibility.AccessibilityNodeInfo r8 = r8.d1()
                qc.q.h(r8, r1)
                androidx.compose.ui.platform.x r0 = androidx.compose.ui.platform.AndroidComposeView.A(r2)
                java.lang.String r0 = r0.R()
                androidx.compose.ui.platform.AndroidComposeView.z(r2, r7, r8, r0)
            Ld7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.d.g(android.view.View, androidx.core.view.accessibility.n0):void");
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    /* loaded from: classes.dex */
    static final class e extends qc.r implements pc.l<Configuration, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final e f2537f = new e();

        e() {
            super(1);
        }

        public final void a(Configuration configuration) {
            qc.q.i(configuration, "it");
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(Configuration configuration) {
            a(configuration);
            return dc.w.f13270a;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    /* loaded from: classes.dex */
    static final class f extends qc.r implements pc.l<pc.a<? extends dc.w>, dc.w> {
        f() {
            super(1);
        }

        public final void a(pc.a<dc.w> aVar) {
            qc.q.i(aVar, "it");
            AndroidComposeView.this.t(aVar);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(pc.a<? extends dc.w> aVar) {
            a(aVar);
            return dc.w.f13270a;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    /* loaded from: classes.dex */
    static final class g extends qc.r implements pc.l<i1.b, Boolean> {
        g() {
            super(1);
        }

        public final Boolean a(KeyEvent keyEvent) {
            qc.q.i(keyEvent, "it");
            androidx.compose.ui.focus.d U = AndroidComposeView.this.U(keyEvent);
            if (U != null && i1.c.e(i1.d.b(keyEvent), i1.c.f16951a.a())) {
                return Boolean.valueOf(AndroidComposeView.this.getFocusOwner().j(U.o()));
            }
            return Boolean.FALSE;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Boolean invoke(i1.b bVar) {
            return a(bVar.f());
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    /* loaded from: classes.dex */
    static final class h extends qc.r implements pc.p<b2.b0<?>, b2.z, b2.a0> {
        h() {
            super(2);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [b2.a0] */
        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final b2.a0 invoke(b2.b0<?> b0Var, b2.z zVar) {
            qc.q.i(b0Var, "factory");
            qc.q.i(zVar, "platformTextInput");
            return b0Var.a(zVar, AndroidComposeView.this);
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    /* loaded from: classes.dex */
    public static final class i implements k1.z {

        /* renamed from: a  reason: collision with root package name */
        private k1.w f2541a = k1.w.f19247b.a();

        i() {
        }

        @Override // k1.z
        public void a(k1.w wVar) {
            if (wVar == null) {
                wVar = k1.w.f19247b.a();
            }
            this.f2541a = wVar;
            if (Build.VERSION.SDK_INT >= 24) {
                e0.f2655a.a(AndroidComposeView.this, wVar);
            }
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    /* loaded from: classes.dex */
    static final class j extends qc.r implements pc.a<dc.w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.viewinterop.a f2544m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(androidx.compose.ui.viewinterop.a aVar) {
            super(0);
            this.f2544m = aVar;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AndroidComposeView.this.getAndroidViewsHandler$ui_release().removeViewInLayout(this.f2544m);
            HashMap<p1.j0, androidx.compose.ui.viewinterop.a> layoutNodeToHolder = AndroidComposeView.this.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
            qc.k0.d(layoutNodeToHolder).remove(AndroidComposeView.this.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(this.f2544m));
            androidx.core.view.p0.F0(this.f2544m, 0);
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    /* loaded from: classes.dex */
    static final class k extends qc.r implements pc.a<dc.w> {
        k() {
            super(0);
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MotionEvent motionEvent = AndroidComposeView.this.f2523w0;
            if (motionEvent != null) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 7 || actionMasked == 9) {
                    AndroidComposeView.this.f2525x0 = SystemClock.uptimeMillis();
                    AndroidComposeView androidComposeView = AndroidComposeView.this;
                    androidComposeView.post(androidComposeView.A0);
                }
            }
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    /* loaded from: classes.dex */
    public static final class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            int i10;
            AndroidComposeView.this.removeCallbacks(this);
            MotionEvent motionEvent = AndroidComposeView.this.f2523w0;
            if (motionEvent != null) {
                boolean z11 = false;
                if (motionEvent.getToolType(0) == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int actionMasked = motionEvent.getActionMasked();
                if (!z10 ? actionMasked != 1 : !(actionMasked == 10 || actionMasked == 1)) {
                    z11 = true;
                }
                if (z11) {
                    if (actionMasked != 7 && actionMasked != 9) {
                        i10 = 2;
                    } else {
                        i10 = 7;
                    }
                    AndroidComposeView androidComposeView = AndroidComposeView.this;
                    androidComposeView.u0(motionEvent, i10, androidComposeView.f2525x0, false);
                }
            }
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    /* loaded from: classes.dex */
    static final class m extends qc.r implements pc.l<m1.b, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        public static final m f2547f = new m();

        m() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(m1.b bVar) {
            qc.q.i(bVar, "it");
            return Boolean.FALSE;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    /* loaded from: classes.dex */
    static final class n extends qc.r implements pc.l<pc.a<? extends dc.w>, dc.w> {
        n() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(pc.a aVar) {
            qc.q.i(aVar, "$tmp0");
            aVar.invoke();
        }

        public final void b(final pc.a<dc.w> aVar) {
            Looper looper;
            qc.q.i(aVar, "command");
            Handler handler = AndroidComposeView.this.getHandler();
            if (handler != null) {
                looper = handler.getLooper();
            } else {
                looper = null;
            }
            if (looper == Looper.myLooper()) {
                aVar.invoke();
                return;
            }
            Handler handler2 = AndroidComposeView.this.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: androidx.compose.ui.platform.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidComposeView.n.c(pc.a.this);
                    }
                });
            }
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(pc.a<? extends dc.w> aVar) {
            b(aVar);
            return dc.w.f13270a;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    /* loaded from: classes.dex */
    static final class o extends qc.r implements pc.a<b> {
        o() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final b invoke() {
            return AndroidComposeView.this.get_viewTreeOwners();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v0, types: [qc.h, c1.a] */
    public AndroidComposeView(Context context, hc.f fVar) {
        super(context);
        w0.e eVar;
        j0.j1 e10;
        j0.j1 e11;
        int a10;
        t0 u0Var;
        qc.q.i(context, "context");
        qc.q.i(fVar, "coroutineContext");
        f.a aVar = z0.f.f26354b;
        this.f2496f = aVar.b();
        this.f2504m = true;
        ?? r32 = 0;
        this.f2508p = new p1.l0(r32, 1, r32);
        this.f2510q = j2.a.a(context);
        EmptySemanticsElement emptySemanticsElement = EmptySemanticsElement.f3011c;
        this.f2512r = emptySemanticsElement;
        this.f2514s = new FocusOwnerImpl(new f());
        this.f2516t = new u4();
        e.a aVar2 = androidx.compose.ui.e.f2335a;
        androidx.compose.ui.e a11 = androidx.compose.ui.input.key.a.a(aVar2, new g());
        this.f2518u = a11;
        androidx.compose.ui.e a12 = androidx.compose.ui.input.rotary.a.a(aVar2, m.f2547f);
        this.f2520v = a12;
        this.f2522w = new a1.i1();
        boolean z10 = false;
        p1.j0 j0Var = new p1.j0(z10, z10 ? 1 : 0, 3, r32);
        j0Var.n(n1.c1.f19953b);
        j0Var.m(getDensity());
        j0Var.e(aVar2.a(emptySemanticsElement).a(a12).a(getFocusOwner().c()).a(a11));
        this.f2524x = j0Var;
        this.f2526y = this;
        this.f2528z = new t1.r(getRoot());
        x xVar = new x(this);
        this.A = xVar;
        this.B = new w0.d0();
        this.C = new ArrayList();
        this.F = new k1.k();
        this.G = new k1.g0(getRoot());
        this.H = e.f2537f;
        if (N()) {
            eVar = new w0.e(this, getAutofillTree());
        } else {
            eVar = null;
        }
        this.I = eVar;
        this.K = new androidx.compose.ui.platform.m(context);
        this.L = new androidx.compose.ui.platform.l(context);
        this.M = new p1.k1(new n());
        this.S = new p1.t0(getRoot());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        qc.q.h(viewConfiguration, "get(context)");
        this.T = new q0(viewConfiguration);
        this.U = j2.m.a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.V = new int[]{0, 0};
        this.W = a1.x3.c(null, 1, null);
        this.f2491a0 = a1.x3.c(null, 1, null);
        this.f2492b0 = -1L;
        this.f2494d0 = aVar.a();
        this.f2495e0 = true;
        e10 = j0.d3.e(null, null, 2, null);
        this.f2497f0 = e10;
        this.f2498g0 = j0.y2.d(new o());
        this.f2500i0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.platform.p
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AndroidComposeView.W(AndroidComposeView.this);
            }
        };
        this.f2501j0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.compose.ui.platform.q
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AndroidComposeView.r0(AndroidComposeView.this);
            }
        };
        this.f2502k0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.r
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z11) {
                AndroidComposeView.w0(AndroidComposeView.this, z11);
            }
        };
        this.f2503l0 = new b2.d0(new h());
        this.f2505m0 = ((a.C0177a) getPlatformTextInputPluginRegistry().e(b2.a.f7736a).a()).b();
        this.f2506n0 = new k0(context);
        this.f2507o0 = j0.y2.h(a2.q.a(context), j0.y2.l());
        Configuration configuration = context.getResources().getConfiguration();
        qc.q.h(configuration, "context.resources.configuration");
        this.f2509p0 = V(configuration);
        Configuration configuration2 = context.getResources().getConfiguration();
        qc.q.h(configuration2, "context.resources.configuration");
        e11 = j0.d3.e(i0.d(configuration2), null, 2, null);
        this.f2511q0 = e11;
        this.f2513r0 = new g1.c(this);
        if (isInTouchMode()) {
            a10 = h1.a.f16438b.b();
        } else {
            a10 = h1.a.f16438b.a();
        }
        this.f2515s0 = new h1.c(a10, new c(), r32);
        this.f2517t0 = new o1.f(this);
        this.f2519u0 = new l0(this);
        this.f2521v0 = fVar;
        this.f2527y0 = new s4<>();
        this.f2529z0 = new k0.f<>(new pc.a[16], 0);
        this.A0 = new l();
        this.B0 = new Runnable() { // from class: androidx.compose.ui.platform.s
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView.s0(AndroidComposeView.this);
            }
        };
        this.D0 = new k();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            u0Var = new w0();
        } else {
            u0Var = new u0();
        }
        this.E0 = u0Var;
        setWillNotDraw(false);
        setFocusable(true);
        if (i10 >= 26) {
            h0.f2685a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        androidx.core.view.p0.u0(this, xVar);
        pc.l<r4, dc.w> a13 = r4.f2816d.a();
        if (a13 != null) {
            a13.invoke(this);
        }
        getRoot().t(this);
        if (i10 >= 29) {
            a0.f2609a.a(this);
        }
        this.G0 = new i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        Integer num;
        if (qc.q.d(str, this.A.S())) {
            Integer num2 = this.A.V().get(Integer.valueOf(i10));
            if (num2 != null) {
                accessibilityNodeInfo.getExtras().putInt(str, num2.intValue());
            }
        } else if (qc.q.d(str, this.A.R()) && (num = this.A.U().get(Integer.valueOf(i10))) != null) {
            accessibilityNodeInfo.getExtras().putInt(str, num.intValue());
        }
    }

    private final boolean N() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    private final boolean P(p1.j0 j0Var) {
        boolean z10;
        if (this.R) {
            return true;
        }
        p1.j0 l02 = j0Var.l0();
        if (l02 != null && !l02.L()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return false;
    }

    private final void Q(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).o();
            } else if (childAt instanceof ViewGroup) {
                Q((ViewGroup) childAt);
            }
        }
    }

    private final long R(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return i0(size, size);
                }
                throw new IllegalStateException();
            }
            return i0(0, Integer.MAX_VALUE);
        }
        return i0(0, size);
    }

    private final View T(int i10, View view) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
            declaredMethod.setAccessible(true);
            if (qc.q.d(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i10))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    qc.q.h(childAt, "currentView.getChildAt(i)");
                    View T = T(i10, childAt);
                    if (T != null) {
                        return T;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    private final int V(Configuration configuration) {
        int i10;
        if (Build.VERSION.SDK_INT >= 31) {
            i10 = configuration.fontWeightAdjustment;
            return i10;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(AndroidComposeView androidComposeView) {
        qc.q.i(androidComposeView, "this$0");
        androidComposeView.x0();
    }

    private final int X(MotionEvent motionEvent) {
        boolean z10;
        removeCallbacks(this.A0);
        try {
            k0(motionEvent);
            boolean z11 = true;
            this.f2493c0 = true;
            a(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.f2523w0;
                if (motionEvent2 != null && motionEvent2.getToolType(0) == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (motionEvent2 != null && Z(motionEvent, motionEvent2)) {
                    if (e0(motionEvent2)) {
                        this.G.b();
                    } else if (motionEvent2.getActionMasked() != 10 && z10) {
                        v0(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, null);
                    }
                }
                if (motionEvent.getToolType(0) != 3) {
                    z11 = false;
                }
                if (!z10 && z11 && actionMasked != 3 && actionMasked != 9 && f0(motionEvent)) {
                    v0(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.f2523w0 = MotionEvent.obtainNoHistory(motionEvent);
                return t0(motionEvent);
            } finally {
                Trace.endSection();
            }
        } finally {
            this.f2493c0 = false;
        }
    }

    private final boolean Y(MotionEvent motionEvent) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f10 = -motionEvent.getAxisValue(26);
        return getFocusOwner().h(new m1.b(androidx.core.view.r0.e(viewConfiguration, getContext()) * f10, f10 * androidx.core.view.r0.c(viewConfiguration, getContext()), motionEvent.getEventTime()));
    }

    private final boolean Z(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
            return false;
        }
        return true;
    }

    private final void b0(p1.j0 j0Var) {
        j0Var.C0();
        k0.f<p1.j0> t02 = j0Var.t0();
        int o10 = t02.o();
        if (o10 > 0) {
            p1.j0[] n10 = t02.n();
            int i10 = 0;
            do {
                b0(n10[i10]);
                i10++;
            } while (i10 < o10);
        }
    }

    private final void c0(p1.j0 j0Var) {
        int i10 = 0;
        p1.t0.F(this.S, j0Var, false, 2, null);
        k0.f<p1.j0> t02 = j0Var.t0();
        int o10 = t02.o();
        if (o10 > 0) {
            p1.j0[] n10 = t02.n();
            do {
                c0(n10[i10]);
                i10++;
            } while (i10 < o10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6 A[LOOP:0: B:35:0x0061->B:61:0x00a6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a9 A[EDGE_INSN: B:64:0x00a9->B:62:0x00a9 BREAK  A[LOOP:0: B:35:0x0061->B:61:0x00a6], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean d0(android.view.MotionEvent r7) {
        /*
            r6 = this;
            float r0 = r7.getX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L14
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L59
            float r0 = r7.getY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L29
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L29
            r0 = 1
            goto L2a
        L29:
            r0 = 0
        L2a:
            if (r0 == 0) goto L59
            float r0 = r7.getRawX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L3e
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L3e
            r0 = 1
            goto L3f
        L3e:
            r0 = 0
        L3f:
            if (r0 == 0) goto L59
            float r0 = r7.getRawY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L53
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L53
            r0 = 1
            goto L54
        L53:
            r0 = 0
        L54:
            if (r0 != 0) goto L57
            goto L59
        L57:
            r0 = 0
            goto L5a
        L59:
            r0 = 1
        L5a:
            if (r0 != 0) goto La9
            int r1 = r7.getPointerCount()
            r4 = 1
        L61:
            if (r4 >= r1) goto La9
            float r0 = r7.getX(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L75
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L75
            r0 = 1
            goto L76
        L75:
            r0 = 0
        L76:
            if (r0 == 0) goto La3
            float r0 = r7.getY(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L8a
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L8a
            r0 = 1
            goto L8b
        L8a:
            r0 = 0
        L8b:
            if (r0 == 0) goto La3
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r0 < r5) goto L9d
            androidx.compose.ui.platform.s1 r0 = androidx.compose.ui.platform.s1.f2821a
            boolean r0 = r0.a(r7, r4)
            if (r0 != 0) goto L9d
            r0 = 1
            goto L9e
        L9d:
            r0 = 0
        L9e:
            if (r0 == 0) goto La1
            goto La3
        La1:
            r0 = 0
            goto La4
        La3:
            r0 = 1
        La4:
            if (r0 != 0) goto La9
            int r4 = r4 + 1
            goto L61
        La9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.d0(android.view.MotionEvent):boolean");
    }

    private final boolean e0(MotionEvent motionEvent) {
        int actionMasked;
        if (motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
            return true;
        }
        return false;
    }

    private final boolean f0(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (0.0f <= x10 && x10 <= getWidth()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (0.0f <= y10 && y10 <= getHeight()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }

    private final boolean g0(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        boolean z10;
        boolean z11;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.f2523w0) == null || motionEvent2.getPointerCount() != motionEvent.getPointerCount()) {
            return true;
        }
        if (motionEvent.getRawX() == motionEvent2.getRawX()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return true;
        }
        if (motionEvent.getRawY() == motionEvent2.getRawY()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b get_viewTreeOwners() {
        return (b) this.f2497f0.getValue();
    }

    private final long i0(int i10, int i11) {
        return dc.t.d(dc.t.d(i11) | dc.t.d(dc.t.d(i10) << 32));
    }

    private final void j0() {
        if (!this.f2493c0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != this.f2492b0) {
                this.f2492b0 = currentAnimationTimeMillis;
                l0();
                ViewParent parent = getParent();
                View view = this;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = ((ViewGroup) view).getParent();
                }
                view.getLocationOnScreen(this.V);
                int[] iArr = this.V;
                float f10 = iArr[0];
                float f11 = iArr[1];
                view.getLocationInWindow(iArr);
                int[] iArr2 = this.V;
                this.f2494d0 = z0.g.a(f10 - iArr2[0], f11 - iArr2[1]);
            }
        }
    }

    private final void k0(MotionEvent motionEvent) {
        this.f2492b0 = AnimationUtils.currentAnimationTimeMillis();
        l0();
        long f10 = a1.x3.f(this.W, z0.g.a(motionEvent.getX(), motionEvent.getY()));
        this.f2494d0 = z0.g.a(motionEvent.getRawX() - z0.f.o(f10), motionEvent.getRawY() - z0.f.p(f10));
    }

    private final void l0() {
        this.E0.a(this, this.W);
        o1.a(this.W, this.f2491a0);
    }

    private final void p0(p1.j0 j0Var) {
        if (!isLayoutRequested() && isAttachedToWindow()) {
            if (j0Var != null) {
                while (j0Var != null && j0Var.e0() == j0.g.InMeasureBlock && P(j0Var)) {
                    j0Var = j0Var.l0();
                }
                if (j0Var == getRoot()) {
                    requestLayout();
                    return;
                }
            }
            if (getWidth() != 0 && getHeight() != 0) {
                invalidate();
            } else {
                requestLayout();
            }
        }
    }

    static /* synthetic */ void q0(AndroidComposeView androidComposeView, p1.j0 j0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j0Var = null;
        }
        androidComposeView.p0(j0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(AndroidComposeView androidComposeView) {
        qc.q.i(androidComposeView, "this$0");
        androidComposeView.x0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(AndroidComposeView androidComposeView) {
        qc.q.i(androidComposeView, "this$0");
        boolean z10 = false;
        androidComposeView.C0 = false;
        MotionEvent motionEvent = androidComposeView.f2523w0;
        qc.q.f(motionEvent);
        if (motionEvent.getActionMasked() == 10) {
            z10 = true;
        }
        if (z10) {
            androidComposeView.t0(motionEvent);
            return;
        }
        throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
    }

    private void setFontFamilyResolver(l.b bVar) {
        this.f2507o0.setValue(bVar);
    }

    private void setLayoutDirection(j2.r rVar) {
        this.f2511q0.setValue(rVar);
    }

    private final void set_viewTreeOwners(b bVar) {
        this.f2497f0.setValue(bVar);
    }

    private final int t0(MotionEvent motionEvent) {
        k1.f0 f0Var;
        if (this.F0) {
            this.F0 = false;
            this.f2516t.a(k1.p0.b(motionEvent.getMetaState()));
        }
        k1.e0 c10 = this.F.c(motionEvent, this);
        if (c10 != null) {
            List<k1.f0> b10 = c10.b();
            int size = b10.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i10 = size - 1;
                    f0Var = b10.get(size);
                    if (f0Var.a()) {
                        break;
                    } else if (i10 < 0) {
                        break;
                    } else {
                        size = i10;
                    }
                }
            }
            f0Var = null;
            k1.f0 f0Var2 = f0Var;
            if (f0Var2 != null) {
                this.f2496f = f0Var2.e();
            }
            int a10 = this.G.a(c10, this, f0(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 0 || actionMasked == 5) && !k1.s0.c(a10)) {
                this.F.e(motionEvent.getPointerId(motionEvent.getActionIndex()));
                return a10;
            }
            return a10;
        }
        this.G.b();
        return k1.h0.a(false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u0(MotionEvent motionEvent, int i10, long j10, boolean z10) {
        int i11;
        int buttonState;
        long downTime;
        int i12;
        int actionMasked = motionEvent.getActionMasked();
        int i13 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i13 = motionEvent.getActionIndex();
            }
        } else if (i10 != 9 && i10 != 10) {
            i13 = 0;
        }
        int pointerCount = motionEvent.getPointerCount();
        if (i13 >= 0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i14 = pointerCount - i11;
        if (i14 == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            pointerPropertiesArr[i15] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[i14];
        for (int i16 = 0; i16 < i14; i16++) {
            pointerCoordsArr[i16] = new MotionEvent.PointerCoords();
        }
        for (int i17 = 0; i17 < i14; i17++) {
            if (i13 >= 0 && i17 >= i13) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            int i18 = i12 + i17;
            motionEvent.getPointerProperties(i18, pointerPropertiesArr[i17]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i17];
            motionEvent.getPointerCoords(i18, pointerCoords);
            long l10 = l(z0.g.a(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = z0.f.o(l10);
            pointerCoords.y = z0.f.p(l10);
        }
        if (z10) {
            buttonState = 0;
        } else {
            buttonState = motionEvent.getButtonState();
        }
        if (motionEvent.getDownTime() == motionEvent.getEventTime()) {
            downTime = j10;
        } else {
            downTime = motionEvent.getDownTime();
        }
        MotionEvent obtain = MotionEvent.obtain(downTime, j10, i10, i14, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), buttonState, motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        k1.k kVar = this.F;
        qc.q.h(obtain, "event");
        k1.e0 c10 = kVar.c(obtain, this);
        qc.q.f(c10);
        this.G.a(c10, this, true);
        obtain.recycle();
    }

    static /* synthetic */ void v0(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i10, long j10, boolean z10, int i11, Object obj) {
        boolean z11;
        if ((i11 & 8) != 0) {
            z11 = true;
        } else {
            z11 = z10;
        }
        androidComposeView.u0(motionEvent, i10, j10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(AndroidComposeView androidComposeView, boolean z10) {
        int a10;
        qc.q.i(androidComposeView, "this$0");
        h1.c cVar = androidComposeView.f2515s0;
        if (z10) {
            a10 = h1.a.f16438b.b();
        } else {
            a10 = h1.a.f16438b.a();
        }
        cVar.b(a10);
    }

    private final void x0() {
        getLocationOnScreen(this.V);
        long j10 = this.U;
        int c10 = j2.l.c(j10);
        int d10 = j2.l.d(j10);
        int[] iArr = this.V;
        boolean z10 = false;
        int i10 = iArr[0];
        if (c10 != i10 || d10 != iArr[1]) {
            this.U = j2.m.a(i10, iArr[1]);
            if (c10 != Integer.MAX_VALUE && d10 != Integer.MAX_VALUE) {
                getRoot().T().D().p1();
                z10 = true;
            }
        }
        this.S.d(z10);
    }

    public final void L(androidx.compose.ui.viewinterop.a aVar, p1.j0 j0Var) {
        qc.q.i(aVar, "view");
        qc.q.i(j0Var, "layoutNode");
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(aVar, j0Var);
        getAndroidViewsHandler$ui_release().addView(aVar);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(j0Var, aVar);
        androidx.core.view.p0.F0(aVar, 1);
        androidx.core.view.p0.u0(aVar, new d(j0Var, this, this));
    }

    public final Object O(Continuation<? super dc.w> continuation) {
        Object d10;
        Object A = this.A.A(continuation);
        d10 = ic.d.d();
        if (A == d10) {
            return A;
        }
        return dc.w.f13270a;
    }

    public final void S(androidx.compose.ui.viewinterop.a aVar, Canvas canvas) {
        qc.q.i(aVar, "view");
        qc.q.i(canvas, "canvas");
        getAndroidViewsHandler$ui_release().a(aVar, canvas);
    }

    public androidx.compose.ui.focus.d U(KeyEvent keyEvent) {
        boolean n10;
        boolean n11;
        int e10;
        qc.q.i(keyEvent, "keyEvent");
        long a10 = i1.d.a(keyEvent);
        a.C0397a c0397a = i1.a.f16799b;
        if (i1.a.n(a10, c0397a.j())) {
            if (i1.d.f(keyEvent)) {
                e10 = androidx.compose.ui.focus.d.f2368b.f();
            } else {
                e10 = androidx.compose.ui.focus.d.f2368b.e();
            }
            return androidx.compose.ui.focus.d.i(e10);
        } else if (i1.a.n(a10, c0397a.e())) {
            return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.f2368b.g());
        } else {
            if (i1.a.n(a10, c0397a.d())) {
                return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.f2368b.d());
            }
            if (i1.a.n(a10, c0397a.f())) {
                return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.f2368b.h());
            }
            if (i1.a.n(a10, c0397a.c())) {
                return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.f2368b.a());
            }
            boolean z10 = true;
            if (i1.a.n(a10, c0397a.b())) {
                n10 = true;
            } else {
                n10 = i1.a.n(a10, c0397a.g());
            }
            if (n10) {
                n11 = true;
            } else {
                n11 = i1.a.n(a10, c0397a.i());
            }
            if (n11) {
                return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.f2368b.b());
            }
            if (!i1.a.n(a10, c0397a.a())) {
                z10 = i1.a.n(a10, c0397a.h());
            }
            if (z10) {
                return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.f2368b.c());
            }
            return null;
        }
    }

    @Override // p1.i1
    public void a(boolean z10) {
        pc.a<dc.w> aVar;
        if (this.S.k() || this.S.l()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z10) {
                try {
                    aVar = this.D0;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                aVar = null;
            }
            if (this.S.o(aVar)) {
                requestLayout();
            }
            p1.t0.e(this.S, false, 1, null);
            dc.w wVar = dc.w.f13270a;
            Trace.endSection();
        }
    }

    public void a0() {
        b0(getRoot());
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> sparseArray) {
        w0.e eVar;
        qc.q.i(sparseArray, "values");
        if (N() && (eVar = this.I) != null) {
            w0.h.a(eVar, sparseArray);
        }
    }

    @Override // p1.i1
    public void b(p1.j0 j0Var, boolean z10) {
        qc.q.i(j0Var, "layoutNode");
        this.S.h(j0Var, z10);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        return this.A.D(false, i10, this.f2496f);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i10) {
        return this.A.D(true, i10, this.f2496f);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        qc.q.i(canvas, "canvas");
        if (!isAttachedToWindow()) {
            b0(getRoot());
        }
        p1.h1.b(this, false, 1, null);
        this.E = true;
        a1.i1 i1Var = this.f2522w;
        Canvas v10 = i1Var.a().v();
        i1Var.a().w(canvas);
        getRoot().A(i1Var.a());
        i1Var.a().w(v10);
        if ((!this.C.isEmpty()) != false) {
            int size = this.C.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.C.get(i10).i();
            }
        }
        if (h4.B.b()) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.C.clear();
        this.E = false;
        List<p1.g1> list = this.D;
        if (list != null) {
            qc.q.f(list);
            this.C.addAll(list);
            list.clear();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        qc.q.i(motionEvent, "event");
        if (motionEvent.getActionMasked() == 8) {
            if (motionEvent.isFromSource(4194304)) {
                return Y(motionEvent);
            }
            if (!d0(motionEvent) && isAttachedToWindow()) {
                return k1.s0.c(X(motionEvent));
            }
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        qc.q.i(motionEvent, "event");
        if (this.C0) {
            removeCallbacks(this.B0);
            this.B0.run();
        }
        if (d0(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        this.A.K(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && f0(motionEvent)) {
                if (motionEvent.getToolType(0) != 3) {
                    MotionEvent motionEvent2 = this.f2523w0;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    this.f2523w0 = MotionEvent.obtainNoHistory(motionEvent);
                    this.C0 = true;
                    post(this.B0);
                    return false;
                } else if (motionEvent.getButtonState() != 0) {
                    return false;
                }
            }
        } else if (!g0(motionEvent)) {
            return false;
        }
        return k1.s0.c(X(motionEvent));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        qc.q.i(keyEvent, "event");
        if (isFocused()) {
            this.f2516t.a(k1.p0.b(keyEvent.getMetaState()));
            if (!getFocusOwner().n(i1.b.b(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        qc.q.i(keyEvent, "event");
        if ((isFocused() && getFocusOwner().k(i1.b.b(keyEvent))) || super.dispatchKeyEventPreIme(keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        qc.q.i(motionEvent, "motionEvent");
        if (this.C0) {
            removeCallbacks(this.B0);
            MotionEvent motionEvent2 = this.f2523w0;
            qc.q.f(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && !Z(motionEvent, motionEvent2)) {
                this.C0 = false;
            } else {
                this.B0.run();
            }
        }
        if (d0(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !g0(motionEvent)) {
            return false;
        }
        int X = X(motionEvent);
        if (k1.s0.b(X)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return k1.s0.c(X);
    }

    @Override // p1.i1
    public long e(long j10) {
        j0();
        return a1.x3.f(this.W, j10);
    }

    @Override // p1.i1
    public long f(long j10) {
        j0();
        return a1.x3.f(this.f2491a0, j10);
    }

    public final View findViewByAccessibilityIdTraversal(int i10) {
        View view = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(this, Integer.valueOf(i10));
                if (invoke instanceof View) {
                    view = (View) invoke;
                }
            } else {
                view = T(i10, this);
            }
        } catch (NoSuchMethodException unused) {
        }
        return view;
    }

    @Override // p1.i1
    public void g(p1.j0 j0Var, boolean z10, boolean z11) {
        qc.q.i(j0Var, "layoutNode");
        if (z10) {
            if (this.S.x(j0Var, z11)) {
                q0(this, null, 1, null);
            }
        } else if (this.S.C(j0Var, z11)) {
            q0(this, null, 1, null);
        }
    }

    public final r0 getAndroidViewsHandler$ui_release() {
        if (this.O == null) {
            Context context = getContext();
            qc.q.h(context, "context");
            r0 r0Var = new r0(context);
            this.O = r0Var;
            addView(r0Var);
        }
        r0 r0Var2 = this.O;
        qc.q.f(r0Var2);
        return r0Var2;
    }

    @Override // p1.i1
    public w0.i getAutofill() {
        return this.I;
    }

    @Override // p1.i1
    public w0.d0 getAutofillTree() {
        return this.B;
    }

    public final pc.l<Configuration, dc.w> getConfigurationChangeObserver() {
        return this.H;
    }

    @Override // p1.i1
    public hc.f getCoroutineContext() {
        return this.f2521v0;
    }

    @Override // p1.i1
    public j2.e getDensity() {
        return this.f2510q;
    }

    @Override // p1.i1
    public y0.j getFocusOwner() {
        return this.f2514s;
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        dc.w wVar;
        int d10;
        int d11;
        int d12;
        int d13;
        qc.q.i(rect, "rect");
        z0.h i10 = getFocusOwner().i();
        if (i10 != null) {
            d10 = sc.c.d(i10.i());
            rect.left = d10;
            d11 = sc.c.d(i10.l());
            rect.top = d11;
            d12 = sc.c.d(i10.j());
            rect.right = d12;
            d13 = sc.c.d(i10.e());
            rect.bottom = d13;
            wVar = dc.w.f13270a;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // p1.i1
    public l.b getFontFamilyResolver() {
        return (l.b) this.f2507o0.getValue();
    }

    @Override // p1.i1
    public k.a getFontLoader() {
        return this.f2506n0;
    }

    @Override // p1.i1
    public g1.a getHapticFeedBack() {
        return this.f2513r0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.S.k();
    }

    @Override // p1.i1
    public h1.b getInputModeManager() {
        return this.f2515s0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f2492b0;
    }

    @Override // android.view.View, android.view.ViewParent, p1.i1
    public j2.r getLayoutDirection() {
        return (j2.r) this.f2511q0.getValue();
    }

    public long getMeasureIteration() {
        return this.S.n();
    }

    @Override // p1.i1
    public o1.f getModifierLocalManager() {
        return this.f2517t0;
    }

    @Override // p1.i1
    public k1.z getPointerIconService() {
        return this.G0;
    }

    public p1.j0 getRoot() {
        return this.f2524x;
    }

    public p1.q1 getRootForTest() {
        return this.f2526y;
    }

    public t1.r getSemanticsOwner() {
        return this.f2528z;
    }

    @Override // p1.i1
    public p1.l0 getSharedDrawScope() {
        return this.f2508p;
    }

    @Override // p1.i1
    public boolean getShowLayoutBounds() {
        return this.N;
    }

    @Override // p1.i1
    public p1.k1 getSnapshotObserver() {
        return this.M;
    }

    @Override // p1.i1
    public b2.l0 getTextInputService() {
        return this.f2505m0;
    }

    @Override // p1.i1
    public w3 getTextToolbar() {
        return this.f2519u0;
    }

    @Override // p1.i1
    public g4 getViewConfiguration() {
        return this.T;
    }

    public final b getViewTreeOwners() {
        return (b) this.f2498g0.getValue();
    }

    @Override // p1.i1
    public t4 getWindowInfo() {
        return this.f2516t;
    }

    @Override // p1.i1
    public void h(p1.j0 j0Var) {
        qc.q.i(j0Var, "node");
    }

    public final void h0(p1.g1 g1Var, boolean z10) {
        qc.q.i(g1Var, "layer");
        if (!z10) {
            if (!this.E) {
                this.C.remove(g1Var);
                List<p1.g1> list = this.D;
                if (list != null) {
                    list.remove(g1Var);
                }
            }
        } else if (!this.E) {
            this.C.add(g1Var);
        } else {
            List list2 = this.D;
            if (list2 == null) {
                list2 = new ArrayList();
                this.D = list2;
            }
            list2.add(g1Var);
        }
    }

    @Override // p1.i1
    public void i(p1.j0 j0Var) {
        qc.q.i(j0Var, "node");
        this.S.r(j0Var);
        o0();
    }

    @Override // p1.i1
    public void j(p1.j0 j0Var, long j10) {
        qc.q.i(j0Var, "layoutNode");
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.S.p(j0Var, j10);
            if (!this.S.k()) {
                p1.t0.e(this.S, false, 1, null);
            }
            dc.w wVar = dc.w.f13270a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // p1.i1
    public void k(p1.j0 j0Var) {
        qc.q.i(j0Var, "layoutNode");
        this.S.B(j0Var);
        q0(this, null, 1, null);
    }

    @Override // k1.r0
    public long l(long j10) {
        j0();
        long f10 = a1.x3.f(this.W, j10);
        return z0.g.a(z0.f.o(f10) + z0.f.o(this.f2494d0), z0.f.p(f10) + z0.f.p(this.f2494d0));
    }

    @Override // p1.i1
    public void m(p1.j0 j0Var, boolean z10, boolean z11, boolean z12) {
        qc.q.i(j0Var, "layoutNode");
        if (z10) {
            if (this.S.z(j0Var, z11) && z12) {
                p0(j0Var);
            }
        } else if (this.S.E(j0Var, z11) && z12) {
            p0(j0Var);
        }
    }

    public final boolean m0(p1.g1 g1Var) {
        boolean z10;
        qc.q.i(g1Var, "layer");
        if (this.P != null && !h4.B.b() && Build.VERSION.SDK_INT < 23 && this.f2527y0.b() >= 10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            this.f2527y0.d(g1Var);
        }
        return z10;
    }

    @Override // p1.i1
    public void n(i1.b bVar) {
        qc.q.i(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.S.t(bVar);
        q0(this, null, 1, null);
    }

    public final void n0(androidx.compose.ui.viewinterop.a aVar) {
        qc.q.i(aVar, "view");
        t(new j(aVar));
    }

    @Override // p1.i1
    public void o() {
        if (this.J) {
            getSnapshotObserver().a();
            this.J = false;
        }
        r0 r0Var = this.O;
        if (r0Var != null) {
            Q(r0Var);
        }
        while (this.f2529z0.s()) {
            int o10 = this.f2529z0.o();
            for (int i10 = 0; i10 < o10; i10++) {
                pc.a<dc.w> aVar = this.f2529z0.n()[i10];
                this.f2529z0.A(i10, null);
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            this.f2529z0.y(0, o10);
        }
    }

    public final void o0() {
        this.J = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        boolean z10;
        int a10;
        androidx.lifecycle.v a11;
        androidx.lifecycle.p lifecycle;
        w0.e eVar;
        super.onAttachedToWindow();
        c0(getRoot());
        b0(getRoot());
        getSnapshotObserver().j();
        if (N() && (eVar = this.I) != null) {
            w0.b0.f25251a.a(eVar);
        }
        androidx.lifecycle.v a12 = androidx.lifecycle.d1.a(this);
        w3.d a13 = w3.e.a(this);
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (a12 == null || a13 == null || (a12 == viewTreeOwners.a() && a13 == viewTreeOwners.a()))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (a12 != null) {
                if (a13 != null) {
                    if (viewTreeOwners != null && (a11 = viewTreeOwners.a()) != null && (lifecycle = a11.getLifecycle()) != null) {
                        lifecycle.d(this);
                    }
                    a12.getLifecycle().a(this);
                    b bVar = new b(a12, a13);
                    set_viewTreeOwners(bVar);
                    pc.l<? super b, dc.w> lVar = this.f2499h0;
                    if (lVar != null) {
                        lVar.invoke(bVar);
                    }
                    this.f2499h0 = null;
                } else {
                    throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
                }
            } else {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
        }
        h1.c cVar = this.f2515s0;
        if (isInTouchMode()) {
            a10 = h1.a.f16438b.b();
        } else {
            a10 = h1.a.f16438b.a();
        }
        cVar.b(a10);
        b viewTreeOwners2 = getViewTreeOwners();
        qc.q.f(viewTreeOwners2);
        viewTreeOwners2.a().getLifecycle().a(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f2500i0);
        getViewTreeObserver().addOnScrollChangedListener(this.f2501j0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f2502k0);
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        if (getPlatformTextInputPluginRegistry().d() != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        qc.q.i(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        qc.q.h(context, "context");
        this.f2510q = j2.a.a(context);
        if (V(configuration) != this.f2509p0) {
            this.f2509p0 = V(configuration);
            Context context2 = getContext();
            qc.q.h(context2, "context");
            setFontFamilyResolver(a2.q.a(context2));
        }
        this.H.invoke(configuration);
    }

    @Override // androidx.lifecycle.i
    public /* synthetic */ void onCreate(androidx.lifecycle.v vVar) {
        androidx.lifecycle.h.a(this, vVar);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        qc.q.i(editorInfo, "outAttrs");
        b2.a0 d10 = getPlatformTextInputPluginRegistry().d();
        if (d10 != null) {
            return d10.a(editorInfo);
        }
        return null;
    }

    @Override // androidx.lifecycle.i
    public /* synthetic */ void onDestroy(androidx.lifecycle.v vVar) {
        androidx.lifecycle.h.b(this, vVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        w0.e eVar;
        androidx.lifecycle.v a10;
        androidx.lifecycle.p lifecycle;
        super.onDetachedFromWindow();
        getSnapshotObserver().k();
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (a10 = viewTreeOwners.a()) != null && (lifecycle = a10.getLifecycle()) != null) {
            lifecycle.d(this);
        }
        if (N() && (eVar = this.I) != null) {
            w0.b0.f25251a.b(eVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f2500i0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f2501j0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f2502k0);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        qc.q.i(canvas, "canvas");
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        Log.d("Compose Focus", "Owner FocusChanged(" + z10 + ')');
        if (z10) {
            getFocusOwner().e();
        } else {
            getFocusOwner().l();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.S.o(this.D0);
        this.Q = null;
        x0();
        if (this.O != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                c0(getRoot());
            }
            long R = R(i10);
            int d10 = (int) dc.t.d(R >>> 32);
            int d11 = (int) dc.t.d(R & 4294967295L);
            long R2 = R(i11);
            long a10 = j2.c.a(d10, d11, (int) dc.t.d(R2 >>> 32), (int) dc.t.d(4294967295L & R2));
            j2.b bVar = this.Q;
            boolean z10 = false;
            if (bVar == null) {
                this.Q = j2.b.b(a10);
                this.R = false;
            } else {
                if (bVar != null) {
                    z10 = j2.b.g(bVar.t(), a10);
                }
                if (!z10) {
                    this.R = true;
                }
            }
            this.S.G(a10);
            this.S.q();
            setMeasuredDimension(getRoot().q0(), getRoot().N());
            if (this.O != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().q0(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().N(), 1073741824));
            }
            dc.w wVar = dc.w.f13270a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.lifecycle.i
    public /* synthetic */ void onPause(androidx.lifecycle.v vVar) {
        androidx.lifecycle.h.c(this, vVar);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i10) {
        w0.e eVar;
        if (N() && viewStructure != null && (eVar = this.I) != null) {
            w0.h.b(eVar, viewStructure);
        }
    }

    @Override // androidx.lifecycle.i
    public void onResume(androidx.lifecycle.v vVar) {
        qc.q.i(vVar, "owner");
        setShowLayoutBounds(H0.b());
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        j2.r e10;
        if (this.f2504m) {
            e10 = i0.e(i10);
            setLayoutDirection(e10);
            getFocusOwner().a(e10);
        }
    }

    @Override // androidx.lifecycle.i
    public /* synthetic */ void onStart(androidx.lifecycle.v vVar) {
        androidx.lifecycle.h.e(this, vVar);
    }

    @Override // androidx.lifecycle.i
    public /* synthetic */ void onStop(androidx.lifecycle.v vVar) {
        androidx.lifecycle.h.f(this, vVar);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        boolean b10;
        this.f2516t.b(z10);
        this.F0 = true;
        super.onWindowFocusChanged(z10);
        if (z10 && getShowLayoutBounds() != (b10 = H0.b())) {
            setShowLayoutBounds(b10);
            a0();
        }
    }

    @Override // p1.i1
    public void q() {
        this.A.p0();
    }

    @Override // p1.i1
    public void r(p1.j0 j0Var) {
        qc.q.i(j0Var, "layoutNode");
        this.A.o0(j0Var);
    }

    @Override // k1.r0
    public long s(long j10) {
        j0();
        return a1.x3.f(this.f2491a0, z0.g.a(z0.f.o(j10) - z0.f.o(this.f2494d0), z0.f.p(j10) - z0.f.p(this.f2494d0)));
    }

    public final void setConfigurationChangeObserver(pc.l<? super Configuration, dc.w> lVar) {
        qc.q.i(lVar, "<set-?>");
        this.H = lVar;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j10) {
        this.f2492b0 = j10;
    }

    public final void setOnViewTreeOwnersAvailable(pc.l<? super b, dc.w> lVar) {
        qc.q.i(lVar, "callback");
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            lVar.invoke(viewTreeOwners);
        }
        if (!isAttachedToWindow()) {
            this.f2499h0 = lVar;
        }
    }

    @Override // p1.i1
    public void setShowLayoutBounds(boolean z10) {
        this.N = z10;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // p1.i1
    public void t(pc.a<dc.w> aVar) {
        qc.q.i(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (!this.f2529z0.j(aVar)) {
            this.f2529z0.d(aVar);
        }
    }

    @Override // p1.i1
    public p1.g1 u(pc.l<? super a1.h1, dc.w> lVar, pc.a<dc.w> aVar) {
        e1 j4Var;
        qc.q.i(lVar, "drawBlock");
        qc.q.i(aVar, "invalidateParentLayer");
        p1.g1 c10 = this.f2527y0.c();
        if (c10 != null) {
            c10.b(lVar, aVar);
            return c10;
        }
        if (isHardwareAccelerated() && Build.VERSION.SDK_INT >= 23 && this.f2495e0) {
            try {
                return new p3(this, lVar, aVar);
            } catch (Throwable unused) {
                this.f2495e0 = false;
            }
        }
        if (this.P == null) {
            h4.c cVar = h4.B;
            if (!cVar.a()) {
                cVar.d(new View(getContext()));
            }
            if (cVar.b()) {
                Context context = getContext();
                qc.q.h(context, "context");
                j4Var = new e1(context);
            } else {
                Context context2 = getContext();
                qc.q.h(context2, "context");
                j4Var = new j4(context2);
            }
            this.P = j4Var;
            addView(j4Var);
        }
        e1 e1Var = this.P;
        qc.q.f(e1Var);
        return new h4(this, e1Var, lVar, aVar);
    }

    @Override // p1.i1
    public androidx.compose.ui.platform.l getAccessibilityManager() {
        return this.L;
    }

    @Override // p1.i1
    public androidx.compose.ui.platform.m getClipboardManager() {
        return this.K;
    }

    @Override // p1.i1
    public b2.d0 getPlatformTextInputPluginRegistry() {
        return this.f2503l0;
    }

    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public View getView() {
        return this;
    }
}
