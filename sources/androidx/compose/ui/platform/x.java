package androidx.compose.ui.platform;

import a2.l;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.c;
import androidx.compose.ui.platform.h;
import androidx.core.view.accessibility.n0;
import androidx.lifecycle.p;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import okhttp3.internal.http2.Http2;
import t1.g;
import t1.i;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* loaded from: classes.dex */
public final class x extends androidx.core.view.a {
    public static final e M = new e(null);
    private static final int[] N = {v0.h.f24281a, v0.h.f24282b, v0.h.f24293m, v0.h.f24304x, v0.h.A, v0.h.B, v0.h.C, v0.h.D, v0.h.E, v0.h.F, v0.h.f24283c, v0.h.f24284d, v0.h.f24285e, v0.h.f24286f, v0.h.f24287g, v0.h.f24288h, v0.h.f24289i, v0.h.f24290j, v0.h.f24291k, v0.h.f24292l, v0.h.f24294n, v0.h.f24295o, v0.h.f24296p, v0.h.f24297q, v0.h.f24298r, v0.h.f24299s, v0.h.f24300t, v0.h.f24301u, v0.h.f24302v, v0.h.f24303w, v0.h.f24305y, v0.h.f24306z};
    private androidx.collection.b<Integer> A;
    private HashMap<Integer, Integer> B;
    private HashMap<Integer, Integer> C;
    private final String D;
    private final String E;
    private final d2.u F;
    private Map<Integer, h> G;
    private h H;
    private boolean I;
    private final Runnable J;
    private final List<t3> K;
    private final pc.l<t3, dc.w> L;

    /* renamed from: d  reason: collision with root package name */
    private final AndroidComposeView f2871d;

    /* renamed from: e  reason: collision with root package name */
    private int f2872e;

    /* renamed from: f  reason: collision with root package name */
    private final AccessibilityManager f2873f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2874g;

    /* renamed from: h  reason: collision with root package name */
    private final AccessibilityManager.AccessibilityStateChangeListener f2875h;

    /* renamed from: i  reason: collision with root package name */
    private final AccessibilityManager.TouchExplorationStateChangeListener f2876i;

    /* renamed from: j  reason: collision with root package name */
    private List<AccessibilityServiceInfo> f2877j;

    /* renamed from: k  reason: collision with root package name */
    private final Handler f2878k;

    /* renamed from: l  reason: collision with root package name */
    private androidx.core.view.accessibility.q0 f2879l;

    /* renamed from: m  reason: collision with root package name */
    private int f2880m;

    /* renamed from: n  reason: collision with root package name */
    private androidx.collection.h<androidx.collection.h<CharSequence>> f2881n;

    /* renamed from: o  reason: collision with root package name */
    private androidx.collection.h<Map<CharSequence, Integer>> f2882o;

    /* renamed from: p  reason: collision with root package name */
    private int f2883p;

    /* renamed from: q  reason: collision with root package name */
    private Integer f2884q;

    /* renamed from: r  reason: collision with root package name */
    private final androidx.collection.b<p1.j0> f2885r;

    /* renamed from: s  reason: collision with root package name */
    private final cd.d<dc.w> f2886s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f2887t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f2888u;

    /* renamed from: v  reason: collision with root package name */
    private androidx.compose.ui.platform.coreshims.e f2889v;

    /* renamed from: w  reason: collision with root package name */
    private final androidx.collection.a<Integer, androidx.compose.ui.platform.coreshims.p> f2890w;

    /* renamed from: x  reason: collision with root package name */
    private final androidx.collection.b<Integer> f2891x;

    /* renamed from: y  reason: collision with root package name */
    private g f2892y;

    /* renamed from: z  reason: collision with root package name */
    private Map<Integer, u3> f2893z;

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* loaded from: classes.dex */
    public static final class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            qc.q.i(view, "view");
            x.this.M().addAccessibilityStateChangeListener(x.this.T());
            x.this.M().addTouchExplorationStateChangeListener(x.this.c0());
            x xVar = x.this;
            xVar.N0(xVar.P(view));
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            qc.q.i(view, "view");
            x.this.f2878k.removeCallbacks(x.this.J);
            x.this.M().removeAccessibilityStateChangeListener(x.this.T());
            x.this.M().removeTouchExplorationStateChangeListener(x.this.c0());
            x.this.N0(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* loaded from: classes.dex */
    public static final class a0 extends qc.r implements pc.l<dc.l<? extends z0.h, ? extends List<t1.p>>, Comparable<?>> {

        /* renamed from: f  reason: collision with root package name */
        public static final a0 f2895f = new a0();

        a0() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Comparable<?> invoke(dc.l<z0.h, ? extends List<t1.p>> lVar) {
            qc.q.i(lVar, "it");
            return Float.valueOf(lVar.c().e());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f2896a = new b();

        private b() {
        }

        public static final void a(androidx.core.view.accessibility.n0 n0Var, t1.p pVar) {
            t1.a aVar;
            qc.q.i(n0Var, "info");
            qc.q.i(pVar, "semanticsNode");
            if (androidx.compose.ui.platform.y.b(pVar) && (aVar = (t1.a) t1.m.a(pVar.u(), t1.k.f23437a.t())) != null) {
                n0Var.b(new n0.a(16908349, aVar.b()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final c f2897a = new c();

        private c() {
        }

        public static final void a(AccessibilityEvent accessibilityEvent, int i10, int i11) {
            qc.q.i(accessibilityEvent, "event");
            accessibilityEvent.setScrollDeltaX(i10);
            accessibilityEvent.setScrollDeltaY(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public static final d f2898a = new d();

        private d() {
        }

        public static final void a(androidx.core.view.accessibility.n0 n0Var, t1.p pVar) {
            qc.q.i(n0Var, "info");
            qc.q.i(pVar, "semanticsNode");
            if (androidx.compose.ui.platform.y.b(pVar)) {
                t1.l u10 = pVar.u();
                t1.k kVar = t1.k.f23437a;
                t1.a aVar = (t1.a) t1.m.a(u10, kVar.n());
                if (aVar != null) {
                    n0Var.b(new n0.a(16908358, aVar.b()));
                }
                t1.a aVar2 = (t1.a) t1.m.a(pVar.u(), kVar.k());
                if (aVar2 != null) {
                    n0Var.b(new n0.a(16908359, aVar2.b()));
                }
                t1.a aVar3 = (t1.a) t1.m.a(pVar.u(), kVar.l());
                if (aVar3 != null) {
                    n0Var.b(new n0.a(16908360, aVar3.b()));
                }
                t1.a aVar4 = (t1.a) t1.m.a(pVar.u(), kVar.m());
                if (aVar4 != null) {
                    n0Var.b(new n0.a(16908361, aVar4.b()));
                }
            }
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* loaded from: classes.dex */
    public static final class e {
        private e() {
        }

        public /* synthetic */ e(qc.h hVar) {
            this();
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* loaded from: classes.dex */
    public final class f extends AccessibilityNodeProvider {
        public f() {
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            qc.q.i(accessibilityNodeInfo, "info");
            qc.q.i(str, "extraDataKey");
            x.this.z(i10, accessibilityNodeInfo, str, bundle);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            return x.this.I(i10);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i10, int i11, Bundle bundle) {
            return x.this.q0(i10, i11, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        private final t1.p f2900a;

        /* renamed from: b  reason: collision with root package name */
        private final int f2901b;

        /* renamed from: c  reason: collision with root package name */
        private final int f2902c;

        /* renamed from: d  reason: collision with root package name */
        private final int f2903d;

        /* renamed from: e  reason: collision with root package name */
        private final int f2904e;

        /* renamed from: f  reason: collision with root package name */
        private final long f2905f;

        public g(t1.p pVar, int i10, int i11, int i12, int i13, long j10) {
            qc.q.i(pVar, "node");
            this.f2900a = pVar;
            this.f2901b = i10;
            this.f2902c = i11;
            this.f2903d = i12;
            this.f2904e = i13;
            this.f2905f = j10;
        }

        public final int a() {
            return this.f2901b;
        }

        public final int b() {
            return this.f2903d;
        }

        public final int c() {
            return this.f2902c;
        }

        public final t1.p d() {
            return this.f2900a;
        }

        public final int e() {
            return this.f2904e;
        }

        public final long f() {
            return this.f2905f;
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* loaded from: classes.dex */
    public static final class h {

        /* renamed from: a  reason: collision with root package name */
        private final t1.p f2906a;

        /* renamed from: b  reason: collision with root package name */
        private final t1.l f2907b;

        /* renamed from: c  reason: collision with root package name */
        private final Set<Integer> f2908c;

        public h(t1.p pVar, Map<Integer, u3> map) {
            qc.q.i(pVar, "semanticsNode");
            qc.q.i(map, "currentSemanticsNodes");
            this.f2906a = pVar;
            this.f2907b = pVar.u();
            this.f2908c = new LinkedHashSet();
            List<t1.p> r10 = pVar.r();
            int size = r10.size();
            for (int i10 = 0; i10 < size; i10++) {
                t1.p pVar2 = r10.get(i10);
                if (map.containsKey(Integer.valueOf(pVar2.m()))) {
                    this.f2908c.add(Integer.valueOf(pVar2.m()));
                }
            }
        }

        public final Set<Integer> a() {
            return this.f2908c;
        }

        public final t1.p b() {
            return this.f2906a;
        }

        public final t1.l c() {
            return this.f2907b;
        }

        public final boolean d() {
            return this.f2907b.f(t1.s.f23478a.p());
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class i {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2909a;

        static {
            int[] iArr = new int[u1.a.values().length];
            try {
                iArr[u1.a.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u1.a.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u1.a.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f2909a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", l = {2195, 2228}, m = "boundsUpdatesEventLoop")
    /* loaded from: classes.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f2910f;

        /* renamed from: m  reason: collision with root package name */
        Object f2911m;

        /* renamed from: p  reason: collision with root package name */
        Object f2912p;

        /* renamed from: q  reason: collision with root package name */
        /* synthetic */ Object f2913q;

        /* renamed from: s  reason: collision with root package name */
        int f2915s;

        j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f2913q = obj;
            this.f2915s |= RecyclerView.UNDEFINED_DURATION;
            return x.this.A(this);
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes.dex */
    public static final class k<T> implements Comparator {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Comparator f2916f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Comparator f2917m;

        public k(Comparator comparator, Comparator comparator2) {
            this.f2916f = comparator;
            this.f2917m = comparator2;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int compare = this.f2916f.compare(t10, t11);
            if (compare == 0) {
                return this.f2917m.compare(((t1.p) t10).o(), ((t1.p) t11).o());
            }
            return compare;
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes.dex */
    public static final class l<T> implements Comparator {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Comparator f2918f;

        public l(Comparator comparator) {
            this.f2918f = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int d10;
            int compare = this.f2918f.compare(t10, t11);
            if (compare == 0) {
                d10 = gc.c.d(Integer.valueOf(((t1.p) t10).m()), Integer.valueOf(((t1.p) t11).m()));
                return d10;
            }
            return compare;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* loaded from: classes.dex */
    public static final class m extends qc.r implements pc.l<t1.p, Comparable<?>> {

        /* renamed from: f  reason: collision with root package name */
        public static final m f2919f = new m();

        m() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Comparable<?> invoke(t1.p pVar) {
            qc.q.i(pVar, "it");
            return Float.valueOf(pVar.i().j());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* loaded from: classes.dex */
    public static final class n extends qc.r implements pc.l<t1.p, Comparable<?>> {

        /* renamed from: f  reason: collision with root package name */
        public static final n f2920f = new n();

        n() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Comparable<?> invoke(t1.p pVar) {
            qc.q.i(pVar, "it");
            return Float.valueOf(pVar.i().l());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* loaded from: classes.dex */
    public static final class o extends qc.r implements pc.l<t1.p, Comparable<?>> {

        /* renamed from: f  reason: collision with root package name */
        public static final o f2921f = new o();

        o() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Comparable<?> invoke(t1.p pVar) {
            qc.q.i(pVar, "it");
            return Float.valueOf(pVar.i().e());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* loaded from: classes.dex */
    public static final class p extends qc.r implements pc.l<t1.p, Comparable<?>> {

        /* renamed from: f  reason: collision with root package name */
        public static final p f2922f = new p();

        p() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Comparable<?> invoke(t1.p pVar) {
            qc.q.i(pVar, "it");
            return Float.valueOf(pVar.i().i());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* loaded from: classes.dex */
    public static final class q extends qc.r implements pc.l<t1.p, Comparable<?>> {

        /* renamed from: f  reason: collision with root package name */
        public static final q f2923f = new q();

        q() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Comparable<?> invoke(t1.p pVar) {
            qc.q.i(pVar, "it");
            return Float.valueOf(pVar.i().i());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* loaded from: classes.dex */
    public static final class r extends qc.r implements pc.l<t1.p, Comparable<?>> {

        /* renamed from: f  reason: collision with root package name */
        public static final r f2924f = new r();

        r() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Comparable<?> invoke(t1.p pVar) {
            qc.q.i(pVar, "it");
            return Float.valueOf(pVar.i().l());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* loaded from: classes.dex */
    public static final class s extends qc.r implements pc.l<t1.p, Comparable<?>> {

        /* renamed from: f  reason: collision with root package name */
        public static final s f2925f = new s();

        s() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Comparable<?> invoke(t1.p pVar) {
            qc.q.i(pVar, "it");
            return Float.valueOf(pVar.i().e());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* loaded from: classes.dex */
    public static final class t extends qc.r implements pc.l<t1.p, Comparable<?>> {

        /* renamed from: f  reason: collision with root package name */
        public static final t f2926f = new t();

        t() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Comparable<?> invoke(t1.p pVar) {
            qc.q.i(pVar, "it");
            return Float.valueOf(pVar.i().j());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* loaded from: classes.dex */
    public static final class u extends qc.r implements pc.a<dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ t3 f2927f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ x f2928m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(t3 t3Var, x xVar) {
            super(0);
            this.f2927f = t3Var;
            this.f2928m = xVar;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
        
            if ((r2 == 0.0f) == false) goto L20;
         */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke2() {
            /*
                Method dump skipped, instructions count: 256
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.x.u.invoke2():void");
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* loaded from: classes.dex */
    static final class v extends qc.r implements pc.l<t3, dc.w> {
        v() {
            super(1);
        }

        public final void a(t3 t3Var) {
            qc.q.i(t3Var, "it");
            x.this.J0(t3Var);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(t3 t3Var) {
            a(t3Var);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* loaded from: classes.dex */
    public static final class w extends qc.r implements pc.l<p1.j0, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        public static final w f2930f = new w();

        w() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(p1.j0 j0Var) {
            qc.q.i(j0Var, "it");
            t1.l G = j0Var.G();
            boolean z10 = false;
            if (G != null && G.m()) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* renamed from: androidx.compose.ui.platform.x$x  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0045x extends qc.r implements pc.l<p1.j0, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        public static final C0045x f2931f = new C0045x();

        C0045x() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(p1.j0 j0Var) {
            qc.q.i(j0Var, "it");
            return Boolean.valueOf(j0Var.i0().q(p1.z0.a(8)));
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes.dex */
    public static final class y<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int d10;
            d10 = gc.c.d(Float.valueOf(androidx.compose.ui.platform.y.e((t1.p) t10)), Float.valueOf(androidx.compose.ui.platform.y.e((t1.p) t11)));
            return d10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* loaded from: classes.dex */
    public static final class z extends qc.r implements pc.l<dc.l<? extends z0.h, ? extends List<t1.p>>, Comparable<?>> {

        /* renamed from: f  reason: collision with root package name */
        public static final z f2932f = new z();

        z() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Comparable<?> invoke(dc.l<z0.h, ? extends List<t1.p>> lVar) {
            qc.q.i(lVar, "it");
            return Float.valueOf(lVar.c().l());
        }
    }

    public x(AndroidComposeView androidComposeView) {
        Map<Integer, u3> h10;
        Map h11;
        qc.q.i(androidComposeView, "view");
        this.f2871d = androidComposeView;
        this.f2872e = RecyclerView.UNDEFINED_DURATION;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        qc.q.g(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f2873f = accessibilityManager;
        this.f2875h = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: androidx.compose.ui.platform.u
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z10) {
                x.L(x.this, z10);
            }
        };
        this.f2876i = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: androidx.compose.ui.platform.v
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                x.Z0(x.this, z10);
            }
        };
        this.f2877j = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f2878k = new Handler(Looper.getMainLooper());
        this.f2879l = new androidx.core.view.accessibility.q0(new f());
        this.f2880m = RecyclerView.UNDEFINED_DURATION;
        this.f2881n = new androidx.collection.h<>();
        this.f2882o = new androidx.collection.h<>();
        this.f2883p = -1;
        this.f2885r = new androidx.collection.b<>();
        this.f2886s = cd.g.b(-1, null, null, 6, null);
        this.f2887t = true;
        this.f2890w = new androidx.collection.a<>();
        this.f2891x = new androidx.collection.b<>();
        h10 = ec.n0.h();
        this.f2893z = h10;
        this.A = new androidx.collection.b<>();
        this.B = new HashMap<>();
        this.C = new HashMap<>();
        this.D = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.E = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.F = new d2.u();
        this.G = new LinkedHashMap();
        t1.p a10 = androidComposeView.getSemanticsOwner().a();
        h11 = ec.n0.h();
        this.H = new h(a10, h11);
        androidComposeView.addOnAttachStateChangeListener(new a());
        this.J = new Runnable() { // from class: androidx.compose.ui.platform.w
            @Override // java.lang.Runnable
            public final void run() {
                x.z0(x.this);
            }
        };
        this.K = new ArrayList();
        this.L = new v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int A0(int i10) {
        if (i10 == this.f2871d.getSemanticsOwner().a().m()) {
            return -1;
        }
        return i10;
    }

    private final void B(int i10, androidx.compose.ui.platform.coreshims.p pVar) {
        if (pVar == null) {
            return;
        }
        if (this.f2891x.contains(Integer.valueOf(i10))) {
            this.f2891x.remove(Integer.valueOf(i10));
            return;
        }
        this.f2890w.put(Integer.valueOf(i10), pVar);
    }

    private final void B0(t1.p pVar, h hVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<t1.p> r10 = pVar.r();
        int size = r10.size();
        for (int i10 = 0; i10 < size; i10++) {
            t1.p pVar2 = r10.get(i10);
            if (Q().containsKey(Integer.valueOf(pVar2.m()))) {
                if (!hVar.a().contains(Integer.valueOf(pVar2.m()))) {
                    m0(pVar.o());
                    return;
                }
                linkedHashSet.add(Integer.valueOf(pVar2.m()));
            }
        }
        Iterator<Integer> it = hVar.a().iterator();
        while (it.hasNext()) {
            if (!linkedHashSet.contains(Integer.valueOf(it.next().intValue()))) {
                m0(pVar.o());
                return;
            }
        }
        List<t1.p> r11 = pVar.r();
        int size2 = r11.size();
        for (int i11 = 0; i11 < size2; i11++) {
            t1.p pVar3 = r11.get(i11);
            if (Q().containsKey(Integer.valueOf(pVar3.m()))) {
                h hVar2 = this.G.get(Integer.valueOf(pVar3.m()));
                qc.q.f(hVar2);
                B0(pVar3, hVar2);
            }
        }
    }

    private final void C(int i10) {
        if (this.f2890w.containsKey(Integer.valueOf(i10))) {
            this.f2890w.remove(Integer.valueOf(i10));
        } else {
            this.f2891x.add(Integer.valueOf(i10));
        }
    }

    private final void D0(int i10, String str) {
        androidx.compose.ui.platform.coreshims.e eVar = this.f2889v;
        if (eVar == null || Build.VERSION.SDK_INT < 29) {
            return;
        }
        AutofillId a10 = eVar.a(i10);
        if (a10 != null) {
            eVar.c(a10, str);
            return;
        }
        throw new IllegalStateException("Invalid content capture ID".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean E0(AccessibilityEvent accessibilityEvent) {
        if (!h0()) {
            return false;
        }
        return this.f2871d.getParent().requestSendAccessibilityEvent(this.f2871d, accessibilityEvent);
    }

    private final void F() {
        B0(this.f2871d.getSemanticsOwner().a(), this.H);
        C0(this.f2871d.getSemanticsOwner().a(), this.H);
        K0(Q());
        d1();
    }

    private final boolean F0(int i10, int i11, Integer num, List<String> list) {
        if (i10 != Integer.MIN_VALUE && g0()) {
            AccessibilityEvent H = H(i10, i11);
            if (num != null) {
                H.setContentChangeTypes(num.intValue());
            }
            if (list != null) {
                H.setContentDescription(v0.j.d(list, ",", null, null, 0, null, null, 62, null));
            }
            return E0(H);
        }
        return false;
    }

    private final boolean G(int i10) {
        if (e0(i10)) {
            this.f2880m = RecyclerView.UNDEFINED_DURATION;
            this.f2871d.invalidate();
            G0(this, i10, 65536, null, null, 12, null);
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean G0(x xVar, int i10, int i11, Integer num, List list, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        if ((i12 & 8) != 0) {
            list = null;
        }
        return xVar.F0(i10, i11, num, list);
    }

    private final void H0(int i10, int i11, String str) {
        AccessibilityEvent H = H(A0(i10), 32);
        H.setContentChangeTypes(i11);
        if (str != null) {
            H.getText().add(str);
        }
        E0(H);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccessibilityNodeInfo I(int i10) {
        p.b bVar;
        androidx.lifecycle.v a10;
        androidx.lifecycle.p lifecycle;
        AndroidComposeView.b viewTreeOwners = this.f2871d.getViewTreeOwners();
        View view = null;
        if (viewTreeOwners != null && (a10 = viewTreeOwners.a()) != null && (lifecycle = a10.getLifecycle()) != null) {
            bVar = lifecycle.b();
        } else {
            bVar = null;
        }
        if (bVar == p.b.DESTROYED) {
            return null;
        }
        androidx.core.view.accessibility.n0 a02 = androidx.core.view.accessibility.n0.a0();
        qc.q.h(a02, "obtain()");
        u3 u3Var = Q().get(Integer.valueOf(i10));
        if (u3Var == null) {
            return null;
        }
        t1.p b10 = u3Var.b();
        int i11 = -1;
        if (i10 == -1) {
            ViewParent K = androidx.core.view.p0.K(this.f2871d);
            if (K instanceof View) {
                view = (View) K;
            }
            a02.J0(view);
        } else if (b10.p() != null) {
            t1.p p10 = b10.p();
            qc.q.f(p10);
            int m10 = p10.m();
            if (m10 != this.f2871d.getSemanticsOwner().a().m()) {
                i11 = m10;
            }
            a02.K0(this.f2871d, i11);
        } else {
            throw new IllegalStateException("semanticsNode " + i10 + " has null parent");
        }
        a02.T0(this.f2871d, i10);
        Rect a11 = u3Var.a();
        long l10 = this.f2871d.l(z0.g.a(a11.left, a11.top));
        long l11 = this.f2871d.l(z0.g.a(a11.right, a11.bottom));
        a02.k0(new Rect((int) Math.floor(z0.f.o(l10)), (int) Math.floor(z0.f.p(l10)), (int) Math.ceil(z0.f.o(l11)), (int) Math.ceil(z0.f.p(l11))));
        t0(i10, a02, b10);
        return a02.d1();
    }

    private final void I0(int i10) {
        g gVar = this.f2892y;
        if (gVar != null) {
            if (i10 != gVar.d().m()) {
                return;
            }
            if (SystemClock.uptimeMillis() - gVar.f() <= 1000) {
                AccessibilityEvent H = H(A0(gVar.d().m()), 131072);
                H.setFromIndex(gVar.b());
                H.setToIndex(gVar.e());
                H.setAction(gVar.a());
                H.setMovementGranularity(gVar.c());
                H.getText().add(Z(gVar.d()));
                E0(H);
            }
        }
        this.f2892y = null;
    }

    private final AccessibilityEvent J(int i10, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent H = H(i10, 8192);
        if (num != null) {
            H.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            H.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            H.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            H.getText().add(charSequence);
        }
        return H;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J0(t3 t3Var) {
        if (!t3Var.M()) {
            return;
        }
        this.f2871d.getSnapshotObserver().h(t3Var, this.L, new u(t3Var, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(x xVar, boolean z10) {
        List<AccessibilityServiceInfo> i10;
        qc.q.i(xVar, "this$0");
        if (!z10) {
            i10 = ec.t.i();
        } else {
            i10 = xVar.f2873f.getEnabledAccessibilityServiceList(-1);
        }
        xVar.f2877j = i10;
    }

    private final void L0(p1.j0 j0Var, androidx.collection.b<Integer> bVar) {
        t1.l G;
        p1.j0 d10;
        if (!j0Var.H0() || this.f2871d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(j0Var)) {
            return;
        }
        if (!j0Var.i0().q(p1.z0.a(8))) {
            j0Var = androidx.compose.ui.platform.y.d(j0Var, C0045x.f2931f);
        }
        if (j0Var != null && (G = j0Var.G()) != null) {
            if (!G.m() && (d10 = androidx.compose.ui.platform.y.d(j0Var, w.f2930f)) != null) {
                j0Var = d10;
            }
            int n02 = j0Var.n0();
            if (!bVar.add(Integer.valueOf(n02))) {
                return;
            }
            G0(this, A0(n02), RecyclerView.m.FLAG_MOVED, 1, null, 8, null);
        }
    }

    private final boolean M0(t1.p pVar, int i10, int i11, boolean z10) {
        String Z;
        Integer num;
        Integer num2;
        t1.l u10 = pVar.u();
        t1.k kVar = t1.k.f23437a;
        boolean z11 = false;
        if (u10.f(kVar.u()) && androidx.compose.ui.platform.y.b(pVar)) {
            pc.q qVar = (pc.q) ((t1.a) pVar.u().i(kVar.u())).a();
            if (qVar == null) {
                return false;
            }
            return ((Boolean) qVar.invoke(Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } else if ((i10 == i11 && i11 == this.f2883p) || (Z = Z(pVar)) == null) {
            return false;
        } else {
            if (i10 < 0 || i10 != i11 || i11 > Z.length()) {
                i10 = -1;
            }
            this.f2883p = i10;
            if (Z.length() > 0) {
                z11 = true;
            }
            int A0 = A0(pVar.m());
            Integer num3 = null;
            if (z11) {
                num = Integer.valueOf(this.f2883p);
            } else {
                num = null;
            }
            if (z11) {
                num2 = Integer.valueOf(this.f2883p);
            } else {
                num2 = null;
            }
            if (z11) {
                num3 = Integer.valueOf(Z.length());
            }
            E0(J(A0, num, num2, num3, Z));
            I0(pVar.m());
            return true;
        }
    }

    private final int N(t1.p pVar) {
        t1.l u10 = pVar.u();
        t1.s sVar = t1.s.f23478a;
        if (!u10.f(sVar.c()) && pVar.u().f(sVar.y())) {
            return v1.i0.i(((v1.i0) pVar.u().i(sVar.y())).r());
        }
        return this.f2883p;
    }

    private final int O(t1.p pVar) {
        t1.l u10 = pVar.u();
        t1.s sVar = t1.s.f23478a;
        if (!u10.f(sVar.c()) && pVar.u().f(sVar.y())) {
            return v1.i0.n(((v1.i0) pVar.u().i(sVar.y())).r());
        }
        return this.f2883p;
    }

    private final void O0(t1.p pVar, androidx.core.view.accessibility.n0 n0Var) {
        t1.l u10 = pVar.u();
        t1.s sVar = t1.s.f23478a;
        if (u10.f(sVar.f())) {
            n0Var.s0(true);
            n0Var.w0((CharSequence) t1.m.a(pVar.u(), sVar.f()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.platform.coreshims.e P(View view) {
        androidx.compose.ui.platform.coreshims.o.c(view, 1);
        return androidx.compose.ui.platform.coreshims.o.b(view);
    }

    private final void P0(t1.p pVar, androidx.core.view.accessibility.n0 n0Var) {
        n0Var.l0(W(pVar));
    }

    private final void Q0(t1.p pVar, androidx.core.view.accessibility.n0 n0Var) {
        n0Var.U0(X(pVar));
    }

    private final void R0(t1.p pVar, androidx.core.view.accessibility.n0 n0Var) {
        n0Var.V0(Y(pVar));
    }

    private final void S0() {
        t1.p pVar;
        List<t1.p> n10;
        int k10;
        this.B.clear();
        this.C.clear();
        u3 u3Var = Q().get(-1);
        if (u3Var != null) {
            pVar = u3Var.b();
        } else {
            pVar = null;
        }
        qc.q.f(pVar);
        boolean i10 = androidx.compose.ui.platform.y.i(pVar);
        int i11 = 1;
        n10 = ec.t.n(pVar);
        List<t1.p> V0 = V0(i10, n10);
        k10 = ec.t.k(V0);
        if (1 > k10) {
            return;
        }
        while (true) {
            int m10 = V0.get(i11 - 1).m();
            int m11 = V0.get(i11).m();
            this.B.put(Integer.valueOf(m10), Integer.valueOf(m11));
            this.C.put(Integer.valueOf(m11), Integer.valueOf(m10));
            if (i11 != k10) {
                i11++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:17:0x007e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<t1.p> T0(boolean r10, java.util.List<t1.p> r11, java.util.Map<java.lang.Integer, java.util.List<t1.p>> r12) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = ec.r.k(r11)
            r2 = 1
            r3 = 0
            if (r1 < 0) goto L35
            r4 = 0
        Le:
            java.lang.Object r5 = r11.get(r4)
            t1.p r5 = (t1.p) r5
            if (r4 == 0) goto L1c
            boolean r6 = U0(r0, r5)
            if (r6 != 0) goto L30
        L1c:
            z0.h r6 = r5.i()
            dc.l r7 = new dc.l
            t1.p[] r8 = new t1.p[r2]
            r8[r3] = r5
            java.util.List r5 = ec.r.n(r8)
            r7.<init>(r6, r5)
            r0.add(r7)
        L30:
            if (r4 == r1) goto L35
            int r4 = r4 + 1
            goto Le
        L35:
            r11 = 2
            pc.l[] r11 = new pc.l[r11]
            androidx.compose.ui.platform.x$z r1 = androidx.compose.ui.platform.x.z.f2932f
            r11[r3] = r1
            androidx.compose.ui.platform.x$a0 r1 = androidx.compose.ui.platform.x.a0.f2895f
            r11[r2] = r1
            java.util.Comparator r11 = gc.a.b(r11)
            ec.r.v(r0, r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r1 = r0.size()
            r2 = 0
        L51:
            if (r2 >= r1) goto L72
            java.lang.Object r4 = r0.get(r2)
            dc.l r4 = (dc.l) r4
            java.lang.Object r5 = r4.d()
            java.util.List r5 = (java.util.List) r5
            java.util.Comparator r6 = r9.y0(r10)
            ec.r.v(r5, r6)
            java.lang.Object r4 = r4.d()
            java.util.Collection r4 = (java.util.Collection) r4
            r11.addAll(r4)
            int r2 = r2 + 1
            goto L51
        L72:
            androidx.compose.ui.platform.x$y r10 = new androidx.compose.ui.platform.x$y
            r10.<init>()
            ec.r.v(r11, r10)
        L7a:
            int r10 = ec.r.k(r11)
            if (r3 > r10) goto Lb7
            java.lang.Object r10 = r11.get(r3)
            t1.p r10 = (t1.p) r10
            int r10 = r10.m()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object r10 = r12.get(r10)
            java.util.List r10 = (java.util.List) r10
            if (r10 == 0) goto Lb4
            java.lang.Object r0 = r11.get(r3)
            t1.p r0 = (t1.p) r0
            boolean r0 = r9.j0(r0)
            if (r0 != 0) goto La6
            r11.remove(r3)
            goto La8
        La6:
            int r3 = r3 + 1
        La8:
            r0 = r10
            java.util.Collection r0 = (java.util.Collection) r0
            r11.addAll(r3, r0)
            int r10 = r10.size()
            int r3 = r3 + r10
            goto L7a
        Lb4:
            int r3 = r3 + 1
            goto L7a
        Lb7:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.x.T0(boolean, java.util.List, java.util.Map):java.util.List");
    }

    private static final boolean U0(List<dc.l<z0.h, List<t1.p>>> list, t1.p pVar) {
        int k10;
        float l10 = pVar.i().l();
        float e10 = pVar.i().e();
        w1<Float> G = androidx.compose.ui.platform.y.G(l10, e10);
        k10 = ec.t.k(list);
        if (k10 >= 0) {
            int i10 = 0;
            while (true) {
                z0.h c10 = list.get(i10).c();
                if (androidx.compose.ui.platform.y.m(androidx.compose.ui.platform.y.G(c10.l(), c10.e()), G)) {
                    list.set(i10, new dc.l<>(c10.o(new z0.h(0.0f, l10, Float.POSITIVE_INFINITY, e10)), list.get(i10).d()));
                    list.get(i10).d().add(pVar);
                    return true;
                } else if (i10 == k10) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        return false;
    }

    private final List<t1.p> V0(boolean z10, List<t1.p> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            W0(this, arrayList, linkedHashMap, z10, list.get(i10));
        }
        return T0(z10, arrayList, linkedHashMap);
    }

    private final boolean W(t1.p pVar) {
        boolean z10;
        t1.l u10 = pVar.u();
        t1.s sVar = t1.s.f23478a;
        u1.a aVar = (u1.a) t1.m.a(u10, sVar.z());
        t1.i iVar = (t1.i) t1.m.a(pVar.u(), sVar.s());
        boolean z11 = true;
        boolean z12 = false;
        if (aVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = (Boolean) t1.m.a(pVar.u(), sVar.u());
        if (bool != null) {
            bool.booleanValue();
            int g10 = t1.i.f23425b.g();
            if (iVar != null) {
                z12 = t1.i.k(iVar.n(), g10);
            }
            if (z12) {
                z11 = z10;
            }
            return z11;
        }
        return z10;
    }

    private static final void W0(x xVar, List<t1.p> list, Map<Integer, List<t1.p>> map, boolean z10, t1.p pVar) {
        List<t1.p> F0;
        Boolean k10 = androidx.compose.ui.platform.y.k(pVar);
        Boolean bool = Boolean.TRUE;
        if ((qc.q.d(k10, bool) || xVar.j0(pVar)) && xVar.Q().keySet().contains(Integer.valueOf(pVar.m()))) {
            list.add(pVar);
        }
        if (qc.q.d(androidx.compose.ui.platform.y.k(pVar), bool)) {
            Integer valueOf = Integer.valueOf(pVar.m());
            F0 = ec.b0.F0(pVar.j());
            map.put(valueOf, xVar.V0(z10, F0));
            return;
        }
        List<t1.p> j10 = pVar.j();
        int size = j10.size();
        for (int i10 = 0; i10 < size; i10++) {
            W0(xVar, list, map, z10, j10.get(i10));
        }
    }

    private final String X(t1.p pVar) {
        Object string;
        boolean z10;
        float b10;
        float k10;
        boolean z11;
        boolean z12;
        int i10;
        int d10;
        boolean k11;
        boolean k12;
        boolean k13;
        t1.l u10 = pVar.u();
        t1.s sVar = t1.s.f23478a;
        Object a10 = t1.m.a(u10, sVar.v());
        u1.a aVar = (u1.a) t1.m.a(pVar.u(), sVar.z());
        t1.i iVar = (t1.i) t1.m.a(pVar.u(), sVar.s());
        if (aVar != null) {
            int i11 = i.f2909a[aVar.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3 && a10 == null) {
                        a10 = this.f2871d.getContext().getResources().getString(v0.i.f24313g);
                    }
                } else {
                    int f10 = t1.i.f23425b.f();
                    if (iVar == null) {
                        k13 = false;
                    } else {
                        k13 = t1.i.k(iVar.n(), f10);
                    }
                    if (k13 && a10 == null) {
                        a10 = this.f2871d.getContext().getResources().getString(v0.i.f24316j);
                    }
                }
            } else {
                int f11 = t1.i.f23425b.f();
                if (iVar == null) {
                    k12 = false;
                } else {
                    k12 = t1.i.k(iVar.n(), f11);
                }
                if (k12 && a10 == null) {
                    a10 = this.f2871d.getContext().getResources().getString(v0.i.f24317k);
                }
            }
        }
        Boolean bool = (Boolean) t1.m.a(pVar.u(), sVar.u());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            int g10 = t1.i.f23425b.g();
            if (iVar == null) {
                k11 = false;
            } else {
                k11 = t1.i.k(iVar.n(), g10);
            }
            if (!k11 && a10 == null) {
                if (booleanValue) {
                    a10 = this.f2871d.getContext().getResources().getString(v0.i.f24320n);
                } else {
                    a10 = this.f2871d.getContext().getResources().getString(v0.i.f24315i);
                }
            }
        }
        t1.h hVar = (t1.h) t1.m.a(pVar.u(), sVar.r());
        if (hVar != null) {
            if (hVar != t1.h.f23420d.a()) {
                if (a10 == null) {
                    vc.b<Float> c10 = hVar.c();
                    if (c10.f().floatValue() - c10.a().floatValue() == 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        b10 = 0.0f;
                    } else {
                        b10 = (hVar.b() - c10.a().floatValue()) / (c10.f().floatValue() - c10.a().floatValue());
                    }
                    k10 = vc.l.k(b10, 0.0f, 1.0f);
                    if (k10 == 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        i10 = 0;
                    } else {
                        if (k10 == 1.0f) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        i10 = 100;
                        if (!z12) {
                            d10 = sc.c.d(k10 * 100);
                            i10 = vc.l.l(d10, 1, 99);
                        }
                    }
                    string = this.f2871d.getContext().getResources().getString(v0.i.f24323q, Integer.valueOf(i10));
                    a10 = string;
                }
            } else if (a10 == null) {
                string = this.f2871d.getContext().getResources().getString(v0.i.f24312f);
                a10 = string;
            }
        }
        return (String) a10;
    }

    private final RectF X0(t1.p pVar, z0.h hVar) {
        z0.h hVar2;
        if (pVar == null) {
            return null;
        }
        z0.h r10 = hVar.r(pVar.q());
        z0.h h10 = pVar.h();
        if (r10.p(h10)) {
            hVar2 = r10.o(h10);
        } else {
            hVar2 = null;
        }
        if (hVar2 == null) {
            return null;
        }
        long l10 = this.f2871d.l(z0.g.a(hVar2.i(), hVar2.l()));
        long l11 = this.f2871d.l(z0.g.a(hVar2.j(), hVar2.e()));
        return new RectF(z0.f.o(l10), z0.f.p(l10), z0.f.o(l11), z0.f.p(l11));
    }

    private final SpannableString Y(t1.p pVar) {
        SpannableString spannableString;
        Object c02;
        l.b fontFamilyResolver = this.f2871d.getFontFamilyResolver();
        v1.d b02 = b0(pVar.u());
        SpannableString spannableString2 = null;
        if (b02 != null) {
            spannableString = d2.a.b(b02, this.f2871d.getDensity(), fontFamilyResolver, this.F);
        } else {
            spannableString = null;
        }
        SpannableString spannableString3 = (SpannableString) b1(spannableString, 100000);
        List list = (List) t1.m.a(pVar.u(), t1.s.f23478a.x());
        if (list != null) {
            c02 = ec.b0.c0(list);
            v1.d dVar = (v1.d) c02;
            if (dVar != null) {
                spannableString2 = d2.a.b(dVar, this.f2871d.getDensity(), fontFamilyResolver, this.F);
            }
        }
        SpannableString spannableString4 = (SpannableString) b1(spannableString2, 100000);
        if (spannableString3 == null) {
            return spannableString4;
        }
        return spannableString3;
    }

    private final androidx.compose.ui.platform.coreshims.p Y0(t1.p pVar) {
        androidx.compose.ui.platform.coreshims.b a10;
        AutofillId a11;
        String o10;
        androidx.compose.ui.platform.coreshims.e eVar = this.f2889v;
        if (eVar == null || Build.VERSION.SDK_INT < 29 || (a10 = androidx.compose.ui.platform.coreshims.o.a(this.f2871d)) == null) {
            return null;
        }
        if (pVar.p() != null) {
            a11 = eVar.a(r3.m());
            if (a11 == null) {
                return null;
            }
        } else {
            a11 = a10.a();
        }
        qc.q.h(a11, "if (parentNode != null) ….toAutofillId()\n        }");
        androidx.compose.ui.platform.coreshims.p b10 = eVar.b(a11, pVar.m());
        if (b10 == null) {
            return null;
        }
        t1.l u10 = pVar.u();
        t1.s sVar = t1.s.f23478a;
        if (u10.f(sVar.q())) {
            return null;
        }
        List list = (List) t1.m.a(u10, sVar.x());
        if (list != null) {
            b10.a("android.widget.TextView");
            b10.d(v0.j.d(list, "\n", null, null, 0, null, null, 62, null));
        }
        v1.d dVar = (v1.d) t1.m.a(u10, sVar.e());
        if (dVar != null) {
            b10.a("android.widget.EditText");
            b10.d(dVar);
        }
        List list2 = (List) t1.m.a(u10, sVar.c());
        if (list2 != null) {
            b10.b(v0.j.d(list2, "\n", null, null, 0, null, null, 62, null));
        }
        t1.i iVar = (t1.i) t1.m.a(u10, sVar.s());
        if (iVar != null && (o10 = androidx.compose.ui.platform.y.o(iVar.n())) != null) {
            b10.a(o10);
        }
        z0.h i10 = pVar.i();
        b10.c((int) i10.i(), (int) i10.l(), 0, 0, (int) i10.n(), (int) i10.h());
        return b10;
    }

    private final String Z(t1.p pVar) {
        Object c02;
        if (pVar == null) {
            return null;
        }
        t1.l u10 = pVar.u();
        t1.s sVar = t1.s.f23478a;
        if (u10.f(sVar.c())) {
            return v0.j.d((List) pVar.u().i(sVar.c()), ",", null, null, 0, null, null, 62, null);
        }
        if (androidx.compose.ui.platform.y.j(pVar)) {
            v1.d b02 = b0(pVar.u());
            if (b02 == null) {
                return null;
            }
            return b02.i();
        }
        List list = (List) t1.m.a(pVar.u(), sVar.x());
        if (list != null) {
            c02 = ec.b0.c0(list);
            v1.d dVar = (v1.d) c02;
            if (dVar == null) {
                return null;
            }
            return dVar.i();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z0(x xVar, boolean z10) {
        qc.q.i(xVar, "this$0");
        xVar.f2877j = xVar.f2873f.getEnabledAccessibilityServiceList(-1);
    }

    private final androidx.compose.ui.platform.g a0(t1.p pVar, int i10) {
        boolean z10;
        Boolean bool;
        if (pVar == null) {
            return null;
        }
        String Z = Z(pVar);
        if (Z != null && Z.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return null;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 != 8) {
                        if (i10 != 16) {
                            return null;
                        }
                    } else {
                        androidx.compose.ui.platform.f a10 = androidx.compose.ui.platform.f.f2671c.a();
                        a10.e(Z);
                        return a10;
                    }
                }
                t1.l u10 = pVar.u();
                t1.k kVar = t1.k.f23437a;
                if (!u10.f(kVar.g())) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                pc.l lVar = (pc.l) ((t1.a) pVar.u().i(kVar.g())).a();
                if (lVar != null) {
                    bool = (Boolean) lVar.invoke(arrayList);
                } else {
                    bool = null;
                }
                if (!qc.q.d(bool, Boolean.TRUE)) {
                    return null;
                }
                v1.g0 g0Var = (v1.g0) arrayList.get(0);
                if (i10 == 4) {
                    androidx.compose.ui.platform.d a11 = androidx.compose.ui.platform.d.f2634d.a();
                    a11.j(Z, g0Var);
                    return a11;
                }
                androidx.compose.ui.platform.e a12 = androidx.compose.ui.platform.e.f2647f.a();
                a12.j(Z, g0Var, pVar);
                return a12;
            }
            h.a aVar = androidx.compose.ui.platform.h.f2681d;
            Locale locale = this.f2871d.getContext().getResources().getConfiguration().locale;
            qc.q.h(locale, "view.context.resources.configuration.locale");
            androidx.compose.ui.platform.h a13 = aVar.a(locale);
            a13.e(Z);
            return a13;
        }
        c.a aVar2 = androidx.compose.ui.platform.c.f2616d;
        Locale locale2 = this.f2871d.getContext().getResources().getConfiguration().locale;
        qc.q.h(locale2, "view.context.resources.configuration.locale");
        androidx.compose.ui.platform.c a14 = aVar2.a(locale2);
        a14.e(Z);
        return a14;
    }

    private final boolean a1(t1.p pVar, int i10, boolean z10, boolean z11) {
        boolean z12;
        androidx.compose.ui.platform.g a02;
        int[] b10;
        int i11;
        int i12;
        int i13;
        int m10 = pVar.m();
        Integer num = this.f2884q;
        if (num == null || m10 != num.intValue()) {
            this.f2883p = -1;
            this.f2884q = Integer.valueOf(pVar.m());
        }
        String Z = Z(pVar);
        if (Z != null && Z.length() != 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12 || (a02 = a0(pVar, i10)) == null) {
            return false;
        }
        int N2 = N(pVar);
        if (N2 == -1) {
            if (z10) {
                N2 = 0;
            } else {
                N2 = Z.length();
            }
        }
        if (z10) {
            b10 = a02.a(N2);
        } else {
            b10 = a02.b(N2);
        }
        if (b10 == null) {
            return false;
        }
        int i14 = b10[0];
        int i15 = b10[1];
        if (z11 && f0(pVar)) {
            i11 = O(pVar);
            if (i11 == -1) {
                if (z10) {
                    i11 = i14;
                } else {
                    i11 = i15;
                }
            }
            if (z10) {
                i12 = i15;
            } else {
                i12 = i14;
            }
        } else {
            if (z10) {
                i11 = i15;
            } else {
                i11 = i14;
            }
            i12 = i11;
        }
        if (z10) {
            i13 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
        } else {
            i13 = 512;
        }
        this.f2892y = new g(pVar, i13, i10, i14, i15, SystemClock.uptimeMillis());
        M0(pVar, i11, i12, true);
        return true;
    }

    private final v1.d b0(t1.l lVar) {
        return (v1.d) t1.m.a(lVar, t1.s.f23478a.e());
    }

    private final <T extends CharSequence> T b1(T t10, int i10) {
        boolean z10;
        boolean z11 = true;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (t10 != null && t10.length() != 0) {
                z11 = false;
            }
            if (!z11 && t10.length() > i10) {
                int i11 = i10 - 1;
                if (Character.isHighSurrogate(t10.charAt(i11)) && Character.isLowSurrogate(t10.charAt(i10))) {
                    i10 = i11;
                }
                T t11 = (T) t10.subSequence(0, i10);
                qc.q.g(t11, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return t11;
            }
            return t10;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private final void c1(int i10) {
        int i11 = this.f2872e;
        if (i11 == i10) {
            return;
        }
        this.f2872e = i10;
        G0(this, i10, 128, null, null, 12, null);
        G0(this, i11, UserVerificationMethods.USER_VERIFY_HANDPRINT, null, null, 12, null);
    }

    private final void d1() {
        t1.p pVar;
        t1.l c10;
        androidx.collection.b<? extends Integer> bVar = new androidx.collection.b<>();
        Iterator<Integer> it = this.A.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            u3 u3Var = Q().get(next);
            String str = null;
            if (u3Var != null) {
                pVar = u3Var.b();
            } else {
                pVar = null;
            }
            if (pVar == null || !androidx.compose.ui.platform.y.g(pVar)) {
                bVar.add(next);
                qc.q.h(next, "id");
                int intValue = next.intValue();
                h hVar = this.G.get(next);
                if (hVar != null && (c10 = hVar.c()) != null) {
                    str = (String) t1.m.a(c10, t1.s.f23478a.p());
                }
                H0(intValue, 32, str);
            }
        }
        this.A.j(bVar);
        this.G.clear();
        for (Map.Entry<Integer, u3> entry : Q().entrySet()) {
            if (androidx.compose.ui.platform.y.g(entry.getValue().b()) && this.A.add(entry.getKey())) {
                H0(entry.getKey().intValue(), 16, (String) entry.getValue().b().u().i(t1.s.f23478a.p()));
            }
            this.G.put(entry.getKey(), new h(entry.getValue().b(), Q()));
        }
        this.H = new h(this.f2871d.getSemanticsOwner().a(), Q());
    }

    private final boolean e0(int i10) {
        if (this.f2880m == i10) {
            return true;
        }
        return false;
    }

    private final boolean f0(t1.p pVar) {
        t1.l u10 = pVar.u();
        t1.s sVar = t1.s.f23478a;
        if (!u10.f(sVar.c()) && pVar.u().f(sVar.e())) {
            return true;
        }
        return false;
    }

    private final boolean h0() {
        if (this.f2874g) {
            return true;
        }
        if (this.f2873f.isEnabled()) {
            qc.q.h(this.f2877j, "enabledServices");
            if ((!r0.isEmpty()) != false) {
                return true;
            }
        }
        return false;
    }

    private final boolean i0() {
        return this.f2888u;
    }

    private final boolean j0(t1.p pVar) {
        boolean z10;
        if (androidx.compose.ui.platform.y.f(pVar) == null && Y(pVar) == null && X(pVar) == null && !W(pVar)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!pVar.u().m() && (!pVar.y() || !z10)) {
            return false;
        }
        return true;
    }

    private final boolean k0() {
        if (!this.f2874g && (!this.f2873f.isEnabled() || !this.f2873f.isTouchExplorationEnabled())) {
            return false;
        }
        return true;
    }

    private final void l0() {
        List C0;
        long[] D0;
        List C02;
        androidx.compose.ui.platform.coreshims.e eVar = this.f2889v;
        if (eVar == null || Build.VERSION.SDK_INT < 29) {
            return;
        }
        if ((!this.f2890w.isEmpty()) != false) {
            Collection<androidx.compose.ui.platform.coreshims.p> values = this.f2890w.values();
            qc.q.h(values, "bufferedContentCaptureAppearedNodes.values");
            C02 = ec.b0.C0(values);
            ArrayList arrayList = new ArrayList(C02.size());
            int size = C02.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(((androidx.compose.ui.platform.coreshims.p) C02.get(i10)).e());
            }
            eVar.d(arrayList);
            this.f2890w.clear();
        }
        if ((!this.f2891x.isEmpty()) != false) {
            C0 = ec.b0.C0(this.f2891x);
            ArrayList arrayList2 = new ArrayList(C0.size());
            int size2 = C0.size();
            for (int i11 = 0; i11 < size2; i11++) {
                arrayList2.add(Long.valueOf(((Integer) C0.get(i11)).intValue()));
            }
            D0 = ec.b0.D0(arrayList2);
            eVar.e(D0);
            this.f2891x.clear();
        }
    }

    private final void m0(p1.j0 j0Var) {
        if (this.f2885r.add(j0Var)) {
            this.f2886s.p(dc.w.f13270a);
        }
    }

    private final void n0(t1.p pVar) {
        B(pVar.m(), Y0(pVar));
        List<t1.p> r10 = pVar.r();
        int size = r10.size();
        for (int i10 = 0; i10 < size; i10++) {
            n0(r10.get(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c3 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x01a2 -> B:90:0x01a3). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q0(int r13, int r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 1648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.x.q0(int, int, android.os.Bundle):boolean");
    }

    private static final boolean r0(t1.j jVar, float f10) {
        if ((f10 < 0.0f && jVar.c().invoke().floatValue() > 0.0f) || (f10 > 0.0f && jVar.c().invoke().floatValue() < jVar.a().invoke().floatValue())) {
            return true;
        }
        return false;
    }

    private static final float s0(float f10, float f11) {
        boolean z10;
        if (Math.signum(f10) == Math.signum(f11)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (Math.abs(f10) >= Math.abs(f11)) {
                return f11;
            }
            return f10;
        }
        return 0.0f;
    }

    private static final boolean u0(t1.j jVar) {
        if ((jVar.c().invoke().floatValue() > 0.0f && !jVar.b()) || (jVar.c().invoke().floatValue() < jVar.a().invoke().floatValue() && jVar.b())) {
            return true;
        }
        return false;
    }

    private static final boolean v0(t1.j jVar) {
        if ((jVar.c().invoke().floatValue() < jVar.a().invoke().floatValue() && !jVar.b()) || (jVar.c().invoke().floatValue() > 0.0f && jVar.b())) {
            return true;
        }
        return false;
    }

    private final boolean w0(int i10, List<t3> list) {
        boolean z10;
        t3 s10 = androidx.compose.ui.platform.y.s(list, i10);
        if (s10 != null) {
            z10 = false;
        } else {
            s10 = new t3(i10, this.K, null, null, null, null);
            z10 = true;
        }
        this.K.add(s10);
        return z10;
    }

    private final boolean x0(int i10) {
        if (!k0() || e0(i10)) {
            return false;
        }
        int i11 = this.f2880m;
        if (i11 != Integer.MIN_VALUE) {
            G0(this, i11, 65536, null, null, 12, null);
        }
        this.f2880m = i10;
        this.f2871d.invalidate();
        G0(this, i10, 32768, null, null, 12, null);
        return true;
    }

    private final Comparator<t1.p> y0(boolean z10) {
        Comparator b10;
        b10 = gc.c.b(q.f2923f, r.f2924f, s.f2925f, t.f2926f);
        if (z10) {
            b10 = gc.c.b(m.f2919f, n.f2920f, o.f2921f, p.f2922f);
        }
        return new l(new k(b10, p1.j0.X.b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        t1.p b10;
        int i11;
        Boolean bool;
        u3 u3Var = Q().get(Integer.valueOf(i10));
        if (u3Var != null && (b10 = u3Var.b()) != null) {
            String Z = Z(b10);
            if (qc.q.d(str, this.D)) {
                Integer num = this.B.get(Integer.valueOf(i10));
                if (num != null) {
                    accessibilityNodeInfo.getExtras().putInt(str, num.intValue());
                }
            } else if (qc.q.d(str, this.E)) {
                Integer num2 = this.C.get(Integer.valueOf(i10));
                if (num2 != null) {
                    accessibilityNodeInfo.getExtras().putInt(str, num2.intValue());
                }
            } else {
                t1.l u10 = b10.u();
                t1.k kVar = t1.k.f23437a;
                if (u10.f(kVar.g()) && bundle != null && qc.q.d(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                    int i12 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                    int i13 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                    if (i13 > 0 && i12 >= 0) {
                        if (Z != null) {
                            i11 = Z.length();
                        } else {
                            i11 = Integer.MAX_VALUE;
                        }
                        if (i12 < i11) {
                            ArrayList arrayList = new ArrayList();
                            pc.l lVar = (pc.l) ((t1.a) b10.u().i(kVar.g())).a();
                            if (lVar != null) {
                                bool = (Boolean) lVar.invoke(arrayList);
                            } else {
                                bool = null;
                            }
                            if (qc.q.d(bool, Boolean.TRUE)) {
                                v1.g0 g0Var = (v1.g0) arrayList.get(0);
                                ArrayList arrayList2 = new ArrayList();
                                for (int i14 = 0; i14 < i13; i14++) {
                                    int i15 = i12 + i14;
                                    if (i15 >= g0Var.k().j().length()) {
                                        arrayList2.add(null);
                                    } else {
                                        arrayList2.add(X0(b10, g0Var.c(i15)));
                                    }
                                }
                                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new RectF[0]));
                                return;
                            }
                            return;
                        }
                    }
                    Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
                    return;
                }
                t1.l u11 = b10.u();
                t1.s sVar = t1.s.f23478a;
                if (u11.f(sVar.w()) && bundle != null && qc.q.d(str, "androidx.compose.ui.semantics.testTag")) {
                    String str2 = (String) t1.m.a(b10.u(), sVar.w());
                    if (str2 != null) {
                        accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    }
                } else if (qc.q.d(str, "androidx.compose.ui.semantics.id")) {
                    accessibilityNodeInfo.getExtras().putInt(str, b10.m());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z0(x xVar) {
        qc.q.i(xVar, "this$0");
        p1.h1.b(xVar.f2871d, false, 1, null);
        xVar.F();
        xVar.I = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:13:0x0034, B:25:0x0063, B:29:0x0075, B:31:0x007d, B:33:0x0086, B:34:0x0089, B:36:0x008f, B:38:0x0098, B:39:0x00a9, B:41:0x00b0, B:42:0x00b9, B:18:0x004d), top: B:51:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00cc -> B:14:0x0037). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(kotlin.coroutines.Continuation<? super dc.w> r11) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.x.A(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void C0(t1.p pVar, h hVar) {
        qc.q.i(pVar, "newNode");
        qc.q.i(hVar, "oldNode");
        List<t1.p> r10 = pVar.r();
        int size = r10.size();
        for (int i10 = 0; i10 < size; i10++) {
            t1.p pVar2 = r10.get(i10);
            if (Q().containsKey(Integer.valueOf(pVar2.m())) && !hVar.a().contains(Integer.valueOf(pVar2.m()))) {
                n0(pVar2);
            }
        }
        for (Map.Entry<Integer, h> entry : this.G.entrySet()) {
            if (!Q().containsKey(entry.getKey())) {
                C(entry.getKey().intValue());
            }
        }
        List<t1.p> r11 = pVar.r();
        int size2 = r11.size();
        for (int i11 = 0; i11 < size2; i11++) {
            t1.p pVar3 = r11.get(i11);
            if (Q().containsKey(Integer.valueOf(pVar3.m())) && this.G.containsKey(Integer.valueOf(pVar3.m()))) {
                h hVar2 = this.G.get(Integer.valueOf(pVar3.m()));
                qc.q.f(hVar2);
                C0(pVar3, hVar2);
            }
        }
    }

    public final boolean D(boolean z10, int i10, long j10) {
        if (!qc.q.d(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        return E(Q().values(), z10, i10, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[LOOP:0: B:16:0x003d->B:49:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E(java.util.Collection<androidx.compose.ui.platform.u3> r6, boolean r7, int r8, long r9) {
        /*
            r5 = this;
            java.lang.String r0 = "currentSemanticsNodes"
            qc.q.i(r6, r0)
            z0.f$a r0 = z0.f.f26354b
            long r0 = r0.b()
            boolean r0 = z0.f.l(r9, r0)
            r1 = 0
            if (r0 != 0) goto Lbd
            boolean r0 = z0.f.r(r9)
            if (r0 != 0) goto L1a
            goto Lbd
        L1a:
            r0 = 1
            if (r7 != r0) goto L24
            t1.s r7 = t1.s.f23478a
            t1.w r7 = r7.B()
            goto L2c
        L24:
            if (r7 != 0) goto Lb7
            t1.s r7 = t1.s.f23478a
            t1.w r7 = r7.i()
        L2c:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r2 = r6
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L39
            goto Lb6
        L39:
            java.util.Iterator r6 = r6.iterator()
        L3d:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto Lb6
            java.lang.Object r2 = r6.next()
            androidx.compose.ui.platform.u3 r2 = (androidx.compose.ui.platform.u3) r2
            android.graphics.Rect r3 = r2.a()
            z0.h r3 = a1.j4.a(r3)
            boolean r3 = r3.b(r9)
            if (r3 != 0) goto L59
        L57:
            r2 = 0
            goto Lb3
        L59:
            t1.p r2 = r2.b()
            t1.l r2 = r2.l()
            java.lang.Object r2 = t1.m.a(r2, r7)
            t1.j r2 = (t1.j) r2
            if (r2 != 0) goto L6a
            goto L57
        L6a:
            boolean r3 = r2.b()
            if (r3 == 0) goto L72
            int r3 = -r8
            goto L73
        L72:
            r3 = r8
        L73:
            if (r8 != 0) goto L7c
            boolean r4 = r2.b()
            if (r4 == 0) goto L7c
            r3 = -1
        L7c:
            if (r3 >= 0) goto L92
            pc.a r2 = r2.c()
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L57
            goto Lb2
        L92:
            pc.a r3 = r2.c()
            java.lang.Object r3 = r3.invoke()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            pc.a r2 = r2.a()
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto L57
        Lb2:
            r2 = 1
        Lb3:
            if (r2 == 0) goto L3d
            r1 = 1
        Lb6:
            return r1
        Lb7:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        Lbd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.x.E(java.util.Collection, boolean, int, long):boolean");
    }

    public final AccessibilityEvent H(int i10, int i11) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
        qc.q.h(obtain, "obtain(eventType)");
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        obtain.setPackageName(this.f2871d.getContext().getPackageName());
        obtain.setSource(this.f2871d, i10);
        u3 u3Var = Q().get(Integer.valueOf(i10));
        if (u3Var != null) {
            obtain.setPassword(androidx.compose.ui.platform.y.h(u3Var.b()));
        }
        return obtain;
    }

    public final boolean K(MotionEvent motionEvent) {
        qc.q.i(motionEvent, "event");
        if (!k0()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7 && action != 9) {
            if (action != 10) {
                return false;
            }
            if (this.f2872e != Integer.MIN_VALUE) {
                c1(RecyclerView.UNDEFINED_DURATION);
                return true;
            }
            return this.f2871d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
        }
        int d02 = d0(motionEvent.getX(), motionEvent.getY());
        boolean dispatchGenericMotionEvent = this.f2871d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
        c1(d02);
        if (d02 != Integer.MIN_VALUE) {
            return true;
        }
        return dispatchGenericMotionEvent;
    }

    public final void K0(Map<Integer, u3> map) {
        v1.d dVar;
        v1.d dVar2;
        Object c02;
        Object c03;
        String str;
        int h10;
        AccessibilityEvent J;
        String i10;
        Map<Integer, u3> map2 = map;
        qc.q.i(map2, "newSemanticsNodes");
        ArrayList arrayList = new ArrayList(this.K);
        this.K.clear();
        Iterator<Integer> it = map.keySet().iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            h hVar = this.G.get(Integer.valueOf(intValue));
            if (hVar != null) {
                u3 u3Var = map2.get(Integer.valueOf(intValue));
                t1.p b10 = u3Var != null ? u3Var.b() : null;
                qc.q.f(b10);
                Iterator<Map.Entry<? extends t1.w<?>, ? extends Object>> it2 = b10.u().iterator();
                boolean z10 = false;
                while (it2.hasNext()) {
                    Map.Entry<? extends t1.w<?>, ? extends Object> next = it2.next();
                    t1.w<?> key = next.getKey();
                    t1.s sVar = t1.s.f23478a;
                    if (((qc.q.d(key, sVar.i()) || qc.q.d(next.getKey(), sVar.B())) ? w0(intValue, arrayList) : false) || !qc.q.d(next.getValue(), t1.m.a(hVar.c(), next.getKey()))) {
                        t1.w<?> key2 = next.getKey();
                        if (qc.q.d(key2, sVar.x())) {
                            List list = (List) t1.m.a(hVar.c(), sVar.x());
                            if (list != null) {
                                c03 = ec.b0.c0(list);
                                dVar = (v1.d) c03;
                            } else {
                                dVar = null;
                            }
                            List list2 = (List) t1.m.a(b10.u(), sVar.x());
                            if (list2 != null) {
                                c02 = ec.b0.c0(list2);
                                dVar2 = (v1.d) c02;
                            } else {
                                dVar2 = null;
                            }
                            if (!qc.q.d(dVar, dVar2)) {
                                D0(b10.m(), String.valueOf(dVar2));
                            }
                        } else if (qc.q.d(key2, sVar.p())) {
                            Object value = next.getValue();
                            qc.q.g(value, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) value;
                            if (hVar.d()) {
                                H0(intValue, 8, str2);
                            }
                        } else if (qc.q.d(key2, sVar.v()) ? true : qc.q.d(key2, sVar.z())) {
                            G0(this, A0(intValue), RecyclerView.m.FLAG_MOVED, 64, null, 8, null);
                            G0(this, A0(intValue), RecyclerView.m.FLAG_MOVED, 0, null, 8, null);
                        } else if (qc.q.d(key2, sVar.r())) {
                            G0(this, A0(intValue), RecyclerView.m.FLAG_MOVED, 64, null, 8, null);
                            G0(this, A0(intValue), RecyclerView.m.FLAG_MOVED, 0, null, 8, null);
                        } else if (qc.q.d(key2, sVar.u())) {
                            t1.i iVar = (t1.i) t1.m.a(b10.l(), sVar.s());
                            if (iVar == null ? false : t1.i.k(iVar.n(), t1.i.f23425b.g())) {
                                if (qc.q.d(t1.m.a(b10.l(), sVar.u()), Boolean.TRUE)) {
                                    AccessibilityEvent H = H(A0(intValue), 4);
                                    t1.p a10 = b10.a();
                                    List list3 = (List) t1.m.a(a10.l(), sVar.c());
                                    String d10 = list3 != null ? v0.j.d(list3, ",", null, null, 0, null, null, 62, null) : null;
                                    List list4 = (List) t1.m.a(a10.l(), sVar.x());
                                    String d11 = list4 != null ? v0.j.d(list4, ",", null, null, 0, null, null, 62, null) : null;
                                    if (d10 != null) {
                                        H.setContentDescription(d10);
                                    }
                                    if (d11 != null) {
                                        H.getText().add(d11);
                                    }
                                    E0(H);
                                } else {
                                    G0(this, A0(intValue), RecyclerView.m.FLAG_MOVED, 0, null, 8, null);
                                }
                            } else {
                                G0(this, A0(intValue), RecyclerView.m.FLAG_MOVED, 64, null, 8, null);
                                G0(this, A0(intValue), RecyclerView.m.FLAG_MOVED, 0, null, 8, null);
                            }
                        } else if (qc.q.d(key2, sVar.c())) {
                            int A0 = A0(intValue);
                            Object value2 = next.getValue();
                            qc.q.g(value2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            F0(A0, RecyclerView.m.FLAG_MOVED, 4, (List) value2);
                        } else {
                            str = "";
                            if (qc.q.d(key2, sVar.e())) {
                                if (androidx.compose.ui.platform.y.j(b10)) {
                                    v1.d b02 = b0(hVar.c());
                                    if (b02 == null) {
                                        b02 = "";
                                    }
                                    v1.d b03 = b0(b10.u());
                                    str = b03 != null ? b03 : "";
                                    CharSequence b12 = b1(str, 100000);
                                    int length = b02.length();
                                    int length2 = str.length();
                                    h10 = vc.l.h(length, length2);
                                    int i11 = 0;
                                    while (i11 < h10 && b02.charAt(i11) == str.charAt(i11)) {
                                        i11++;
                                    }
                                    int i12 = 0;
                                    while (i12 < h10 - i11) {
                                        int i13 = h10;
                                        if (b02.charAt((length - 1) - i12) != str.charAt((length2 - 1) - i12)) {
                                            break;
                                        }
                                        i12++;
                                        h10 = i13;
                                    }
                                    int i14 = (length - i12) - i11;
                                    int i15 = (length2 - i12) - i11;
                                    boolean z11 = androidx.compose.ui.platform.y.j(hVar.b()) && !androidx.compose.ui.platform.y.h(hVar.b()) && androidx.compose.ui.platform.y.h(b10);
                                    boolean z12 = androidx.compose.ui.platform.y.j(hVar.b()) && androidx.compose.ui.platform.y.h(hVar.b()) && !androidx.compose.ui.platform.y.h(b10);
                                    if (!z11 && !z12) {
                                        J = H(A0(intValue), 16);
                                        J.setFromIndex(i11);
                                        J.setRemovedCount(i14);
                                        J.setAddedCount(i15);
                                        J.setBeforeText(b02);
                                        J.getText().add(b12);
                                    } else {
                                        J = J(A0(intValue), 0, 0, Integer.valueOf(length2), b12);
                                    }
                                    J.setClassName("android.widget.EditText");
                                    E0(J);
                                    if (z11 || z12) {
                                        long r10 = ((v1.i0) b10.u().i(t1.s.f23478a.y())).r();
                                        J.setFromIndex(v1.i0.n(r10));
                                        J.setToIndex(v1.i0.i(r10));
                                        E0(J);
                                    }
                                } else {
                                    G0(this, A0(intValue), RecyclerView.m.FLAG_MOVED, 2, null, 8, null);
                                }
                            } else if (qc.q.d(key2, sVar.y())) {
                                v1.d b04 = b0(b10.u());
                                if (b04 != null && (i10 = b04.i()) != null) {
                                    str = i10;
                                }
                                long r11 = ((v1.i0) b10.u().i(sVar.y())).r();
                                E0(J(A0(intValue), Integer.valueOf(v1.i0.n(r11)), Integer.valueOf(v1.i0.i(r11)), Integer.valueOf(str.length()), b1(str, 100000)));
                                I0(b10.m());
                            } else if (qc.q.d(key2, sVar.i()) ? true : qc.q.d(key2, sVar.B())) {
                                m0(b10.o());
                                t3 s10 = androidx.compose.ui.platform.y.s(this.K, intValue);
                                qc.q.f(s10);
                                s10.f((t1.j) t1.m.a(b10.u(), sVar.i()));
                                s10.i((t1.j) t1.m.a(b10.u(), sVar.B()));
                                J0(s10);
                            } else if (qc.q.d(key2, sVar.g())) {
                                Object value3 = next.getValue();
                                qc.q.g(value3, "null cannot be cast to non-null type kotlin.Boolean");
                                if (((Boolean) value3).booleanValue()) {
                                    E0(H(A0(b10.m()), 8));
                                }
                                G0(this, A0(b10.m()), RecyclerView.m.FLAG_MOVED, 0, null, 8, null);
                            } else {
                                t1.k kVar = t1.k.f23437a;
                                if (qc.q.d(key2, kVar.c())) {
                                    List list5 = (List) b10.u().i(kVar.c());
                                    List list6 = (List) t1.m.a(hVar.c(), kVar.c());
                                    if (list6 != null) {
                                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                                        int size = list5.size();
                                        for (int i16 = 0; i16 < size; i16++) {
                                            linkedHashSet.add(((t1.e) list5.get(i16)).b());
                                        }
                                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                        int size2 = list6.size();
                                        for (int i17 = 0; i17 < size2; i17++) {
                                            linkedHashSet2.add(((t1.e) list6.get(i17)).b());
                                        }
                                        if (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) {
                                            z10 = false;
                                        }
                                        z10 = true;
                                    } else if ((!list5.isEmpty()) != false) {
                                        z10 = true;
                                    }
                                } else {
                                    if (next.getValue() instanceof t1.a) {
                                        Object value4 = next.getValue();
                                        qc.q.g(value4, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                        z10 = !androidx.compose.ui.platform.y.a((t1.a) value4, t1.m.a(hVar.c(), next.getKey()));
                                    }
                                    z10 = true;
                                }
                            }
                        }
                    }
                }
                if (!z10) {
                    z10 = androidx.compose.ui.platform.y.n(b10, hVar);
                }
                if (z10) {
                    G0(this, A0(intValue), RecyclerView.m.FLAG_MOVED, 0, null, 8, null);
                }
                map2 = map;
            }
        }
    }

    public final AccessibilityManager M() {
        return this.f2873f;
    }

    public final void N0(androidx.compose.ui.platform.coreshims.e eVar) {
        this.f2889v = eVar;
    }

    public final Map<Integer, u3> Q() {
        if (this.f2887t) {
            this.f2887t = false;
            this.f2893z = androidx.compose.ui.platform.y.u(this.f2871d.getSemanticsOwner());
            S0();
        }
        return this.f2893z;
    }

    public final String R() {
        return this.E;
    }

    public final String S() {
        return this.D;
    }

    public final AccessibilityManager.AccessibilityStateChangeListener T() {
        return this.f2875h;
    }

    public final HashMap<Integer, Integer> U() {
        return this.C;
    }

    public final HashMap<Integer, Integer> V() {
        return this.B;
    }

    @Override // androidx.core.view.a
    public androidx.core.view.accessibility.q0 b(View view) {
        qc.q.i(view, "host");
        return this.f2879l;
    }

    public final AccessibilityManager.TouchExplorationStateChangeListener c0() {
        return this.f2876i;
    }

    public final int d0(float f10, float f11) {
        Object n02;
        androidx.compose.ui.node.a i02;
        boolean z10 = true;
        p1.j0 j0Var = null;
        p1.h1.b(this.f2871d, false, 1, null);
        p1.v vVar = new p1.v();
        p1.j0.x0(this.f2871d.getRoot(), z0.g.a(f10, f11), vVar, false, false, 12, null);
        n02 = ec.b0.n0(vVar);
        e.c cVar = (e.c) n02;
        if (cVar != null) {
            j0Var = p1.k.k(cVar);
        }
        if (j0Var == null || (i02 = j0Var.i0()) == null || !i02.q(p1.z0.a(8))) {
            z10 = false;
        }
        if (z10 && androidx.compose.ui.platform.y.l(t1.q.a(j0Var, false)) && this.f2871d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(j0Var) == null) {
            return A0(j0Var.n0());
        }
        return RecyclerView.UNDEFINED_DURATION;
    }

    public final boolean g0() {
        if (!h0() && !i0()) {
            return false;
        }
        return true;
    }

    public final void o0(p1.j0 j0Var) {
        qc.q.i(j0Var, "layoutNode");
        this.f2887t = true;
        if (!g0()) {
            return;
        }
        m0(j0Var);
    }

    public final void p0() {
        this.f2887t = true;
        if (g0() && !this.I) {
            this.I = true;
            this.f2878k.post(this.J);
        }
    }

    public final void t0(int i10, androidx.core.view.accessibility.n0 n0Var, t1.p pVar) {
        List c02;
        Map<CharSequence, Integer> map;
        n0.a aVar;
        n0.a aVar2;
        float c10;
        float g10;
        boolean z10;
        qc.q.i(n0Var, "info");
        qc.q.i(pVar, "semanticsNode");
        n0Var.n0("android.view.View");
        t1.l u10 = pVar.u();
        t1.s sVar = t1.s.f23478a;
        t1.i iVar = (t1.i) t1.m.a(u10, sVar.s());
        if (iVar != null) {
            iVar.n();
            if (pVar.v() || pVar.r().isEmpty()) {
                i.a aVar3 = t1.i.f23425b;
                if (t1.i.k(iVar.n(), aVar3.g())) {
                    n0Var.N0(this.f2871d.getContext().getResources().getString(v0.i.f24322p));
                } else if (t1.i.k(iVar.n(), aVar3.f())) {
                    n0Var.N0(this.f2871d.getContext().getResources().getString(v0.i.f24321o));
                } else {
                    String o10 = androidx.compose.ui.platform.y.o(iVar.n());
                    if (!t1.i.k(iVar.n(), aVar3.d()) || pVar.y() || pVar.u().m()) {
                        n0Var.n0(o10);
                    }
                }
            }
            dc.w wVar = dc.w.f13270a;
        }
        if (androidx.compose.ui.platform.y.j(pVar)) {
            n0Var.n0("android.widget.EditText");
        }
        if (pVar.l().f(sVar.x())) {
            n0Var.n0("android.widget.TextView");
        }
        n0Var.H0(this.f2871d.getContext().getPackageName());
        n0Var.B0(true);
        List<t1.p> r10 = pVar.r();
        int size = r10.size();
        for (int i11 = 0; i11 < size; i11++) {
            t1.p pVar2 = r10.get(i11);
            if (Q().containsKey(Integer.valueOf(pVar2.m()))) {
                androidx.compose.ui.viewinterop.a aVar4 = this.f2871d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(pVar2.o());
                if (aVar4 != null) {
                    n0Var.c(aVar4);
                } else {
                    n0Var.d(this.f2871d, pVar2.m());
                }
            }
        }
        if (this.f2880m == i10) {
            n0Var.h0(true);
            n0Var.b(n0.a.f4084l);
        } else {
            n0Var.h0(false);
            n0Var.b(n0.a.f4083k);
        }
        R0(pVar, n0Var);
        O0(pVar, n0Var);
        Q0(pVar, n0Var);
        P0(pVar, n0Var);
        t1.l u11 = pVar.u();
        t1.s sVar2 = t1.s.f23478a;
        u1.a aVar5 = (u1.a) t1.m.a(u11, sVar2.z());
        if (aVar5 != null) {
            if (aVar5 == u1.a.On) {
                n0Var.m0(true);
            } else if (aVar5 == u1.a.Off) {
                n0Var.m0(false);
            }
            dc.w wVar2 = dc.w.f13270a;
        }
        Boolean bool = (Boolean) t1.m.a(pVar.u(), sVar2.u());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (iVar == null ? false : t1.i.k(iVar.n(), t1.i.f23425b.g())) {
                n0Var.Q0(booleanValue);
            } else {
                n0Var.m0(booleanValue);
            }
            dc.w wVar3 = dc.w.f13270a;
        }
        if (!pVar.u().m() || pVar.r().isEmpty()) {
            n0Var.r0(androidx.compose.ui.platform.y.f(pVar));
        }
        String str = (String) t1.m.a(pVar.u(), sVar2.w());
        if (str != null) {
            t1.p pVar3 = pVar;
            while (true) {
                if (pVar3 == null) {
                    z10 = false;
                    break;
                }
                t1.l u12 = pVar3.u();
                t1.t tVar = t1.t.f23513a;
                if (u12.f(tVar.a())) {
                    z10 = ((Boolean) pVar3.u().i(tVar.a())).booleanValue();
                    break;
                }
                pVar3 = pVar3.p();
            }
            if (z10) {
                n0Var.b1(str);
            }
        }
        t1.l u13 = pVar.u();
        t1.s sVar3 = t1.s.f23478a;
        if (((dc.w) t1.m.a(u13, sVar3.h())) != null) {
            n0Var.z0(true);
            dc.w wVar4 = dc.w.f13270a;
        }
        n0Var.L0(androidx.compose.ui.platform.y.h(pVar));
        n0Var.u0(androidx.compose.ui.platform.y.j(pVar));
        n0Var.v0(androidx.compose.ui.platform.y.b(pVar));
        n0Var.x0(pVar.u().f(sVar3.g()));
        if (n0Var.P()) {
            n0Var.y0(((Boolean) pVar.u().i(sVar3.g())).booleanValue());
            if (n0Var.Q()) {
                n0Var.a(2);
            } else {
                n0Var.a(1);
            }
        }
        n0Var.c1(androidx.compose.ui.platform.y.l(pVar));
        t1.g gVar = (t1.g) t1.m.a(pVar.u(), sVar3.o());
        if (gVar != null) {
            int i12 = gVar.i();
            g.a aVar6 = t1.g.f23416b;
            n0Var.D0((t1.g.f(i12, aVar6.b()) || !t1.g.f(i12, aVar6.a())) ? 1 : 2);
            dc.w wVar5 = dc.w.f13270a;
        }
        n0Var.o0(false);
        t1.l u14 = pVar.u();
        t1.k kVar = t1.k.f23437a;
        t1.a aVar7 = (t1.a) t1.m.a(u14, kVar.i());
        if (aVar7 != null) {
            boolean d10 = qc.q.d(t1.m.a(pVar.u(), sVar3.u()), Boolean.TRUE);
            n0Var.o0(!d10);
            if (androidx.compose.ui.platform.y.b(pVar) && !d10) {
                n0Var.b(new n0.a(16, aVar7.b()));
            }
            dc.w wVar6 = dc.w.f13270a;
        }
        n0Var.E0(false);
        t1.a aVar8 = (t1.a) t1.m.a(pVar.u(), kVar.j());
        if (aVar8 != null) {
            n0Var.E0(true);
            if (androidx.compose.ui.platform.y.b(pVar)) {
                n0Var.b(new n0.a(32, aVar8.b()));
            }
            dc.w wVar7 = dc.w.f13270a;
        }
        t1.a aVar9 = (t1.a) t1.m.a(pVar.u(), kVar.b());
        if (aVar9 != null) {
            n0Var.b(new n0.a(Http2.INITIAL_MAX_FRAME_SIZE, aVar9.b()));
            dc.w wVar8 = dc.w.f13270a;
        }
        if (androidx.compose.ui.platform.y.b(pVar)) {
            t1.a aVar10 = (t1.a) t1.m.a(pVar.u(), kVar.v());
            if (aVar10 != null) {
                n0Var.b(new n0.a(2097152, aVar10.b()));
                dc.w wVar9 = dc.w.f13270a;
            }
            t1.a aVar11 = (t1.a) t1.m.a(pVar.u(), kVar.p());
            if (aVar11 != null) {
                n0Var.b(new n0.a(16908372, aVar11.b()));
                dc.w wVar10 = dc.w.f13270a;
            }
            t1.a aVar12 = (t1.a) t1.m.a(pVar.u(), kVar.d());
            if (aVar12 != null) {
                n0Var.b(new n0.a(65536, aVar12.b()));
                dc.w wVar11 = dc.w.f13270a;
            }
            t1.a aVar13 = (t1.a) t1.m.a(pVar.u(), kVar.o());
            if (aVar13 != null) {
                if (n0Var.Q() && this.f2871d.getClipboardManager().a()) {
                    n0Var.b(new n0.a(32768, aVar13.b()));
                }
                dc.w wVar12 = dc.w.f13270a;
            }
        }
        String Z = Z(pVar);
        if (!(Z == null || Z.length() == 0)) {
            n0Var.W0(O(pVar), N(pVar));
            t1.a aVar14 = (t1.a) t1.m.a(pVar.u(), kVar.u());
            n0Var.b(new n0.a(131072, aVar14 != null ? aVar14.b() : null));
            n0Var.a(UserVerificationMethods.USER_VERIFY_HANDPRINT);
            n0Var.a(512);
            n0Var.G0(11);
            List list = (List) t1.m.a(pVar.u(), sVar3.c());
            if ((list == null || list.isEmpty()) && pVar.u().f(kVar.g()) && !androidx.compose.ui.platform.y.c(pVar)) {
                n0Var.G0(n0Var.x() | 4 | 16);
            }
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("androidx.compose.ui.semantics.id");
            CharSequence C = n0Var.C();
            if (!(C == null || C.length() == 0) && pVar.u().f(kVar.g())) {
                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            }
            if (pVar.u().f(sVar3.w())) {
                arrayList.add("androidx.compose.ui.semantics.testTag");
            }
            androidx.compose.ui.platform.k kVar2 = androidx.compose.ui.platform.k.f2735a;
            AccessibilityNodeInfo d12 = n0Var.d1();
            qc.q.h(d12, "info.unwrap()");
            kVar2.a(d12, arrayList);
        }
        t1.h hVar = (t1.h) t1.m.a(pVar.u(), sVar3.r());
        if (hVar != null) {
            if (pVar.u().f(kVar.t())) {
                n0Var.n0("android.widget.SeekBar");
            } else {
                n0Var.n0("android.widget.ProgressBar");
            }
            if (hVar != t1.h.f23420d.a()) {
                n0Var.M0(n0.h.a(1, hVar.c().a().floatValue(), hVar.c().f().floatValue(), hVar.b()));
            }
            if (pVar.u().f(kVar.t()) && androidx.compose.ui.platform.y.b(pVar)) {
                float b10 = hVar.b();
                c10 = vc.l.c(hVar.c().f().floatValue(), hVar.c().a().floatValue());
                if (b10 < c10) {
                    n0Var.b(n0.a.f4089q);
                }
                float b11 = hVar.b();
                g10 = vc.l.g(hVar.c().a().floatValue(), hVar.c().f().floatValue());
                if (b11 > g10) {
                    n0Var.b(n0.a.f4090r);
                }
            }
        }
        if (i13 >= 24) {
            b.a(n0Var, pVar);
        }
        q1.a.d(pVar, n0Var);
        q1.a.e(pVar, n0Var);
        t1.j jVar = (t1.j) t1.m.a(pVar.u(), sVar3.i());
        t1.a aVar15 = (t1.a) t1.m.a(pVar.u(), kVar.r());
        if (jVar != null && aVar15 != null) {
            if (!q1.a.b(pVar)) {
                n0Var.n0("android.widget.HorizontalScrollView");
            }
            if (jVar.a().invoke().floatValue() > 0.0f) {
                n0Var.P0(true);
            }
            if (androidx.compose.ui.platform.y.b(pVar)) {
                if (v0(jVar)) {
                    n0Var.b(n0.a.f4089q);
                    if (!androidx.compose.ui.platform.y.i(pVar)) {
                        aVar2 = n0.a.F;
                    } else {
                        aVar2 = n0.a.D;
                    }
                    n0Var.b(aVar2);
                }
                if (u0(jVar)) {
                    n0Var.b(n0.a.f4090r);
                    if (!androidx.compose.ui.platform.y.i(pVar)) {
                        aVar = n0.a.D;
                    } else {
                        aVar = n0.a.F;
                    }
                    n0Var.b(aVar);
                }
            }
        }
        t1.j jVar2 = (t1.j) t1.m.a(pVar.u(), sVar3.B());
        if (jVar2 != null && aVar15 != null) {
            if (!q1.a.b(pVar)) {
                n0Var.n0("android.widget.ScrollView");
            }
            if (jVar2.a().invoke().floatValue() > 0.0f) {
                n0Var.P0(true);
            }
            if (androidx.compose.ui.platform.y.b(pVar)) {
                if (v0(jVar2)) {
                    n0Var.b(n0.a.f4089q);
                    n0Var.b(n0.a.E);
                }
                if (u0(jVar2)) {
                    n0Var.b(n0.a.f4090r);
                    n0Var.b(n0.a.C);
                }
            }
        }
        if (i13 >= 29) {
            d.a(n0Var, pVar);
        }
        n0Var.I0((CharSequence) t1.m.a(pVar.u(), sVar3.p()));
        if (androidx.compose.ui.platform.y.b(pVar)) {
            t1.a aVar16 = (t1.a) t1.m.a(pVar.u(), kVar.f());
            if (aVar16 != null) {
                n0Var.b(new n0.a(262144, aVar16.b()));
                dc.w wVar13 = dc.w.f13270a;
            }
            t1.a aVar17 = (t1.a) t1.m.a(pVar.u(), kVar.a());
            if (aVar17 != null) {
                n0Var.b(new n0.a(524288, aVar17.b()));
                dc.w wVar14 = dc.w.f13270a;
            }
            t1.a aVar18 = (t1.a) t1.m.a(pVar.u(), kVar.e());
            if (aVar18 != null) {
                n0Var.b(new n0.a(1048576, aVar18.b()));
                dc.w wVar15 = dc.w.f13270a;
            }
            if (pVar.u().f(kVar.c())) {
                List list2 = (List) pVar.u().i(kVar.c());
                int size2 = list2.size();
                int[] iArr = N;
                if (size2 < iArr.length) {
                    androidx.collection.h<CharSequence> hVar2 = new androidx.collection.h<>();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (this.f2882o.d(i10)) {
                        Map<CharSequence, Integer> g11 = this.f2882o.g(i10);
                        c02 = ec.p.c0(iArr);
                        ArrayList arrayList2 = new ArrayList();
                        int size3 = list2.size();
                        int i14 = 0;
                        while (i14 < size3) {
                            t1.e eVar = (t1.e) list2.get(i14);
                            qc.q.f(g11);
                            if (g11.containsKey(eVar.b())) {
                                Integer num = g11.get(eVar.b());
                                qc.q.f(num);
                                map = g11;
                                hVar2.n(num.intValue(), eVar.b());
                                linkedHashMap.put(eVar.b(), num);
                                c02.remove(num);
                                n0Var.b(new n0.a(num.intValue(), eVar.b()));
                            } else {
                                map = g11;
                                arrayList2.add(eVar);
                            }
                            i14++;
                            g11 = map;
                        }
                        int size4 = arrayList2.size();
                        for (int i15 = 0; i15 < size4; i15++) {
                            t1.e eVar2 = (t1.e) arrayList2.get(i15);
                            int intValue = ((Number) c02.get(i15)).intValue();
                            hVar2.n(intValue, eVar2.b());
                            linkedHashMap.put(eVar2.b(), Integer.valueOf(intValue));
                            n0Var.b(new n0.a(intValue, eVar2.b()));
                        }
                    } else {
                        int size5 = list2.size();
                        for (int i16 = 0; i16 < size5; i16++) {
                            t1.e eVar3 = (t1.e) list2.get(i16);
                            int i17 = N[i16];
                            hVar2.n(i17, eVar3.b());
                            linkedHashMap.put(eVar3.b(), Integer.valueOf(i17));
                            n0Var.b(new n0.a(i17, eVar3.b()));
                        }
                    }
                    this.f2881n.n(i10, hVar2);
                    this.f2882o.n(i10, linkedHashMap);
                } else {
                    throw new IllegalStateException("Can't have more than " + iArr.length + " custom actions for one widget");
                }
            }
        }
        n0Var.O0(j0(pVar));
        Integer num2 = this.B.get(Integer.valueOf(i10));
        if (num2 != null) {
            num2.intValue();
            View H = androidx.compose.ui.platform.y.H(this.f2871d.getAndroidViewsHandler$ui_release(), num2.intValue());
            if (H != null) {
                n0Var.Z0(H);
            } else {
                n0Var.a1(this.f2871d, num2.intValue());
            }
            AccessibilityNodeInfo d13 = n0Var.d1();
            qc.q.h(d13, "info.unwrap()");
            z(i10, d13, this.D, null);
            dc.w wVar16 = dc.w.f13270a;
        }
        Integer num3 = this.C.get(Integer.valueOf(i10));
        if (num3 != null) {
            num3.intValue();
            View H2 = androidx.compose.ui.platform.y.H(this.f2871d.getAndroidViewsHandler$ui_release(), num3.intValue());
            if (H2 != null) {
                n0Var.X0(H2);
                AccessibilityNodeInfo d14 = n0Var.d1();
                qc.q.h(d14, "info.unwrap()");
                z(i10, d14, this.E, null);
            }
            dc.w wVar17 = dc.w.f13270a;
        }
    }
}
