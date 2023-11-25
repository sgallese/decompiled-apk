package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.core.view.a;
import androidx.core.view.accessibility.n0;
import androidx.core.view.c1;
import androidx.core.view.p0;
import androidx.core.view.p1;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ViewCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class p0 {

    /* renamed from: c  reason: collision with root package name */
    private static Field f4187c;

    /* renamed from: e  reason: collision with root package name */
    private static ThreadLocal<Rect> f4189e;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f4185a = new AtomicInteger(1);

    /* renamed from: b  reason: collision with root package name */
    private static WeakHashMap<View, x0> f4186b = null;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f4188d = false;

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f4190f = {r2.e.f22081b, r2.e.f22082c, r2.e.f22093n, r2.e.f22104y, r2.e.B, r2.e.C, r2.e.D, r2.e.E, r2.e.F, r2.e.G, r2.e.f22083d, r2.e.f22084e, r2.e.f22085f, r2.e.f22086g, r2.e.f22087h, r2.e.f22088i, r2.e.f22089j, r2.e.f22090k, r2.e.f22091l, r2.e.f22092m, r2.e.f22094o, r2.e.f22095p, r2.e.f22096q, r2.e.f22097r, r2.e.f22098s, r2.e.f22099t, r2.e.f22100u, r2.e.f22101v, r2.e.f22102w, r2.e.f22103x, r2.e.f22105z, r2.e.A};

    /* renamed from: g  reason: collision with root package name */
    private static final j0 f4191g = new j0() { // from class: androidx.core.view.o0
        @Override // androidx.core.view.j0
        public final d a(d dVar) {
            d c02;
            c02 = p0.c0(dVar);
            return c02;
        }
    };

    /* renamed from: h  reason: collision with root package name */
    private static final e f4192h = new e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public class a extends f<Boolean> {
        a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.p0.f
        /* renamed from: i  reason: merged with bridge method [inline-methods] */
        public Boolean d(View view) {
            return Boolean.valueOf(q.d(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.p0.f
        /* renamed from: j  reason: merged with bridge method [inline-methods] */
        public void e(View view, Boolean bool) {
            q.j(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.p0.f
        /* renamed from: k  reason: merged with bridge method [inline-methods] */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public class b extends f<CharSequence> {
        b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.p0.f
        /* renamed from: i  reason: merged with bridge method [inline-methods] */
        public CharSequence d(View view) {
            return q.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.p0.f
        /* renamed from: j  reason: merged with bridge method [inline-methods] */
        public void e(View view, CharSequence charSequence) {
            q.h(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.p0.f
        /* renamed from: k  reason: merged with bridge method [inline-methods] */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public class c extends f<CharSequence> {
        c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.p0.f
        /* renamed from: i  reason: merged with bridge method [inline-methods] */
        public CharSequence d(View view) {
            return s.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.p0.f
        /* renamed from: j  reason: merged with bridge method [inline-methods] */
        public void e(View view, CharSequence charSequence) {
            s.f(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.p0.f
        /* renamed from: k  reason: merged with bridge method [inline-methods] */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public class d extends f<Boolean> {
        d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.p0.f
        /* renamed from: i  reason: merged with bridge method [inline-methods] */
        public Boolean d(View view) {
            return Boolean.valueOf(q.c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.p0.f
        /* renamed from: j  reason: merged with bridge method [inline-methods] */
        public void e(View view, Boolean bool) {
            q.g(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.p0.f
        /* renamed from: k  reason: merged with bridge method [inline-methods] */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static abstract class f<T> {

        /* renamed from: a  reason: collision with root package name */
        private final int f4194a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<T> f4195b;

        /* renamed from: c  reason: collision with root package name */
        private final int f4196c;

        /* renamed from: d  reason: collision with root package name */
        private final int f4197d;

        f(int i10, Class<T> cls, int i11) {
            this(i10, cls, 0, i11);
        }

        private boolean b() {
            return true;
        }

        private boolean c() {
            if (Build.VERSION.SDK_INT >= this.f4196c) {
                return true;
            }
            return false;
        }

        boolean a(Boolean bool, Boolean bool2) {
            boolean z10;
            boolean z11;
            if (bool != null && bool.booleanValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (bool2 != null && bool2.booleanValue()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 == z11) {
                return true;
            }
            return false;
        }

        abstract T d(View view);

        abstract void e(View view, T t10);

        T f(View view) {
            if (c()) {
                return d(view);
            }
            if (b()) {
                T t10 = (T) view.getTag(this.f4194a);
                if (this.f4195b.isInstance(t10)) {
                    return t10;
                }
                return null;
            }
            return null;
        }

        void g(View view, T t10) {
            if (c()) {
                e(view, t10);
            } else if (b() && h(f(view), t10)) {
                p0.l(view);
                view.setTag(this.f4194a, t10);
                p0.d0(view, this.f4197d);
            }
        }

        abstract boolean h(T t10, T t11);

        f(int i10, Class<T> cls, int i11, int i12) {
            this.f4194a = i10;
            this.f4195b = cls;
            this.f4197d = i11;
            this.f4196c = i12;
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    static class g {
        static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class h {
        static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        static int c(View view) {
            return view.getImportantForAccessibility();
        }

        static int d(View view) {
            return view.getMinimumHeight();
        }

        static int e(View view) {
            return view.getMinimumWidth();
        }

        static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        static boolean i(View view) {
            return view.hasTransientState();
        }

        static boolean j(View view, int i10, Bundle bundle) {
            return view.performAccessibilityAction(i10, bundle);
        }

        static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        static void l(View view, int i10, int i11, int i12, int i13) {
            view.postInvalidateOnAnimation(i10, i11, i12, i13);
        }

        static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        static void n(View view, Runnable runnable, long j10) {
            view.postOnAnimationDelayed(runnable, j10);
        }

        static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        static void p(View view) {
            view.requestFitSystemWindows();
        }

        static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        static void r(View view, boolean z10) {
            view.setHasTransientState(z10);
        }

        static void s(View view, int i10) {
            view.setImportantForAccessibility(i10);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    static class i {
        static int a() {
            return View.generateViewId();
        }

        static Display b(View view) {
            return view.getDisplay();
        }

        static int c(View view) {
            return view.getLabelFor();
        }

        static int d(View view) {
            return view.getLayoutDirection();
        }

        static int e(View view) {
            return view.getPaddingEnd();
        }

        static int f(View view) {
            return view.getPaddingStart();
        }

        static boolean g(View view) {
            return view.isPaddingRelative();
        }

        static void h(View view, int i10) {
            view.setLabelFor(i10);
        }

        static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        static void j(View view, int i10) {
            view.setLayoutDirection(i10);
        }

        static void k(View view, int i10, int i11, int i12, int i13) {
            view.setPaddingRelative(i10, i11, i12, i13);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    static class j {
        static Rect a(View view) {
            return view.getClipBounds();
        }

        static boolean b(View view) {
            return view.isInLayout();
        }

        static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class k {
        static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        static boolean c(View view) {
            return view.isLaidOut();
        }

        static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        static void e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
        }

        static void f(View view, int i10) {
            view.setAccessibilityLiveRegion(i10);
        }

        static void g(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class l {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    private static class m {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ViewCompat.java */
        /* loaded from: classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            p1 f4198a = null;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ View f4199b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ h0 f4200c;

            a(View view, h0 h0Var) {
                this.f4199b = view;
                this.f4200c = h0Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                p1 w10 = p1.w(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    m.a(windowInsets, this.f4199b);
                    if (w10.equals(this.f4198a)) {
                        return this.f4200c.a(view, w10).u();
                    }
                }
                this.f4198a = w10;
                p1 a10 = this.f4200c.a(view, w10);
                if (i10 >= 30) {
                    return a10.u();
                }
                p0.r0(view);
                return a10.u();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(r2.e.S);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static p1 b(View view, p1 p1Var, Rect rect) {
            WindowInsets u10 = p1Var.u();
            if (u10 != null) {
                return p1.w(view.computeSystemWindowInsets(u10, rect), view);
            }
            rect.setEmpty();
            return p1Var;
        }

        static boolean c(View view, float f10, float f11, boolean z10) {
            return view.dispatchNestedFling(f10, f11, z10);
        }

        static boolean d(View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        static float i(View view) {
            return view.getElevation();
        }

        public static p1 j(View view) {
            return p1.a.a(view);
        }

        static String k(View view) {
            return view.getTransitionName();
        }

        static float l(View view) {
            return view.getTranslationZ();
        }

        static float m(View view) {
            return view.getZ();
        }

        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void s(View view, float f10) {
            view.setElevation(f10);
        }

        static void t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        static void u(View view, h0 h0Var) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(r2.e.L, h0Var);
            }
            if (h0Var == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(r2.e.S));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, h0Var));
            }
        }

        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        static void w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        static void x(View view, float f10) {
            view.setZ(f10);
        }

        static boolean y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    private static class n {
        public static p1 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            p1 v10 = p1.v(rootWindowInsets);
            v10.s(v10);
            v10.d(view.getRootView());
            return v10;
        }

        static int b(View view) {
            return view.getScrollIndicators();
        }

        static void c(View view, int i10) {
            view.setScrollIndicators(i10);
        }

        static void d(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    static class o {
        static void a(View view) {
            view.cancelDragAndDrop();
        }

        static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        static void d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        static boolean e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i10) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i10);
        }

        static void f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    static class p {
        static void a(View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        public static AutofillId b(View view) {
            return view.getAutofillId();
        }

        static int c(View view) {
            return view.getImportantForAutofill();
        }

        static int d(View view) {
            return view.getNextClusterForwardId();
        }

        static boolean e(View view) {
            return view.hasExplicitFocusable();
        }

        static boolean f(View view) {
            return view.isFocusedByDefault();
        }

        static boolean g(View view) {
            return view.isImportantForAutofill();
        }

        static boolean h(View view) {
            return view.isKeyboardNavigationCluster();
        }

        static View i(View view, View view2, int i10) {
            return view.keyboardNavigationClusterSearch(view2, i10);
        }

        static boolean j(View view) {
            return view.restoreDefaultFocus();
        }

        static void k(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        static void l(View view, boolean z10) {
            view.setFocusedByDefault(z10);
        }

        static void m(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        static void n(View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        static void o(View view, int i10) {
            view.setNextClusterForwardId(i10);
        }

        static void p(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class q {
        static void a(View view, final v vVar) {
            int i10 = r2.e.R;
            androidx.collection.g gVar = (androidx.collection.g) view.getTag(i10);
            if (gVar == null) {
                gVar = new androidx.collection.g();
                view.setTag(i10, gVar);
            }
            Objects.requireNonNull(vVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.q0
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return p0.v.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            gVar.put(vVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        static void e(View view, v vVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            androidx.collection.g gVar = (androidx.collection.g) view.getTag(r2.e.R);
            if (gVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) gVar.get(vVar)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        static <T> T f(View view, int i10) {
            return (T) view.requireViewById(i10);
        }

        static void g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, AutofillId autofillId) {
            view.setAutofillId(autofillId);
        }

        static void j(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class r {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static ContentCaptureSession b(View view) {
            return view.getContentCaptureSession();
        }

        static List<Rect> c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        static void d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        static void e(View view, ContentCaptureSession contentCaptureSession) {
            view.setContentCaptureSession(contentCaptureSession);
        }

        static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class s {
        static int a(View view) {
            return view.getImportantForContentCapture();
        }

        static CharSequence b(View view) {
            return view.getStateDescription();
        }

        public static o2 c(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return o2.e(windowInsetsController);
            }
            return null;
        }

        static boolean d(View view) {
            return view.isImportantForContentCapture();
        }

        static void e(View view, int i10) {
            view.setImportantForContentCapture(i10);
        }

        static void f(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    private static final class t {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static androidx.core.view.d b(View view, androidx.core.view.d dVar) {
            ContentInfo f10 = dVar.f();
            ContentInfo performReceiveContent = view.performReceiveContent(f10);
            if (performReceiveContent == null) {
                return null;
            }
            if (performReceiveContent == f10) {
                return dVar;
            }
            return androidx.core.view.d.g(performReceiveContent);
        }

        public static void c(View view, String[] strArr, i0 i0Var) {
            if (i0Var == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new u(i0Var));
            }
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    private static final class u implements OnReceiveContentListener {

        /* renamed from: a  reason: collision with root package name */
        private final i0 f4201a;

        u(i0 i0Var) {
            this.f4201a = i0Var;
        }

        @Override // android.view.OnReceiveContentListener
        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            androidx.core.view.d g10 = androidx.core.view.d.g(contentInfo);
            androidx.core.view.d a10 = this.f4201a.a(view, g10);
            if (a10 == null) {
                return null;
            }
            if (a10 == g10) {
                return contentInfo;
            }
            return a10.f();
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public interface v {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    static class w {

        /* renamed from: d  reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f4202d = new ArrayList<>();

        /* renamed from: a  reason: collision with root package name */
        private WeakHashMap<View, Boolean> f4203a = null;

        /* renamed from: b  reason: collision with root package name */
        private SparseArray<WeakReference<View>> f4204b = null;

        /* renamed from: c  reason: collision with root package name */
        private WeakReference<KeyEvent> f4205c = null;

        w() {
        }

        static w a(View view) {
            int i10 = r2.e.Q;
            w wVar = (w) view.getTag(i10);
            if (wVar == null) {
                w wVar2 = new w();
                view.setTag(i10, wVar2);
                return wVar2;
            }
            return wVar;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f4203a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c10 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c10 != null) {
                            return c10;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f4204b == null) {
                this.f4204b = new SparseArray<>();
            }
            return this.f4204b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(r2.e.R);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((v) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f4203a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f4202d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f4203a == null) {
                    this.f4203a = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = f4202d;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f4203a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f4203a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c10 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c10 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(c10));
                }
            }
            if (c10 != null) {
                return true;
            }
            return false;
        }

        boolean f(KeyEvent keyEvent) {
            WeakReference<View> weakReference;
            int indexOfKey;
            WeakReference<KeyEvent> weakReference2 = this.f4205c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f4205c = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> d10 = d();
            if (keyEvent.getAction() == 1 && (indexOfKey = d10.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference = d10.valueAt(indexOfKey);
                d10.removeAt(indexOfKey);
            } else {
                weakReference = null;
            }
            if (weakReference == null) {
                weakReference = d10.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = weakReference.get();
            if (view != null && p0.X(view)) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    private static j0 A(View view) {
        if (view instanceof j0) {
            return (j0) view;
        }
        return f4191g;
    }

    public static void A0(View view, PorterDuff.Mode mode) {
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        m.r(view, mode);
        if (i10 == 21) {
            Drawable background = view.getBackground();
            if (m.g(view) == null && m.h(view) == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (background != null && z10) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                h.q(view, background);
            }
        }
    }

    public static boolean B(View view) {
        return h.b(view);
    }

    public static void B0(View view, Rect rect) {
        j.c(view, rect);
    }

    public static int C(View view) {
        return h.c(view);
    }

    public static void C0(View view, float f10) {
        m.s(view, f10);
    }

    @SuppressLint({"InlinedApi"})
    public static int D(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.c(view);
        }
        return 0;
    }

    @Deprecated
    public static void D0(View view, boolean z10) {
        view.setFitsSystemWindows(z10);
    }

    public static int E(View view) {
        return i.d(view);
    }

    public static void E0(View view, boolean z10) {
        h.r(view, z10);
    }

    public static int F(View view) {
        return h.d(view);
    }

    public static void F0(View view, int i10) {
        h.s(view, i10);
    }

    public static int G(View view) {
        return h.e(view);
    }

    private static void G0(View view) {
        if (C(view) == 0) {
            F0(view, 1);
        }
    }

    public static String[] H(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return t.a(view);
        }
        return (String[]) view.getTag(r2.e.N);
    }

    public static void H0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.m(view, i10);
        }
    }

    public static int I(View view) {
        return i.e(view);
    }

    public static void I0(View view, int i10) {
        i.h(view, i10);
    }

    public static int J(View view) {
        return i.f(view);
    }

    public static void J0(View view, h0 h0Var) {
        m.u(view, h0Var);
    }

    public static ViewParent K(View view) {
        return h.f(view);
    }

    public static void K0(View view, int i10, int i11, int i12, int i13) {
        i.k(view, i10, i11, i12, i13);
    }

    public static p1 L(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return n.a(view);
        }
        return m.j(view);
    }

    public static void L0(View view, l0 l0Var) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 24) {
            if (l0Var != null) {
                obj = l0Var.a();
            } else {
                obj = null;
            }
            o.d(view, n0.a(obj));
        }
    }

    public static CharSequence M(View view) {
        return T0().f(view);
    }

    public static void M0(View view, boolean z10) {
        t0().g(view, Boolean.valueOf(z10));
    }

    public static String N(View view) {
        return m.k(view);
    }

    public static void N0(View view, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 23) {
            n.d(view, i10, i11);
        }
    }

    public static float O(View view) {
        return m.l(view);
    }

    public static void O0(View view, CharSequence charSequence) {
        T0().g(view, charSequence);
    }

    @Deprecated
    public static o2 P(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return s.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window == null) {
                    return null;
                }
                return b1.a(window, view);
            }
        }
        return null;
    }

    public static void P0(View view, String str) {
        m.v(view, str);
    }

    @Deprecated
    public static int Q(View view) {
        return h.g(view);
    }

    public static void Q0(View view, float f10) {
        m.w(view, f10);
    }

    public static float R(View view) {
        return m.m(view);
    }

    public static void R0(View view, c1.b bVar) {
        c1.d(view, bVar);
    }

    public static boolean S(View view) {
        if (o(view) != null) {
            return true;
        }
        return false;
    }

    public static void S0(View view, float f10) {
        m.x(view, f10);
    }

    public static boolean T(View view) {
        return g.a(view);
    }

    private static f<CharSequence> T0() {
        return new c(r2.e.P, CharSequence.class, 64, 30);
    }

    public static boolean U(View view) {
        return h.h(view);
    }

    public static void U0(View view) {
        m.z(view);
    }

    public static boolean V(View view) {
        return h.i(view);
    }

    private static void V0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static boolean W(View view) {
        Boolean f10 = b().f(view);
        if (f10 != null && f10.booleanValue()) {
            return true;
        }
        return false;
    }

    public static boolean X(View view) {
        return k.b(view);
    }

    public static boolean Y(View view) {
        return k.c(view);
    }

    public static boolean Z(View view) {
        return m.p(view);
    }

    public static boolean a0(View view) {
        return i.g(view);
    }

    private static f<Boolean> b() {
        return new d(r2.e.J, Boolean.class, 28);
    }

    public static boolean b0(View view) {
        Boolean f10 = t0().f(view);
        if (f10 != null && f10.booleanValue()) {
            return true;
        }
        return false;
    }

    public static int c(View view, CharSequence charSequence, androidx.core.view.accessibility.s0 s0Var) {
        int t10 = t(view, charSequence);
        if (t10 != -1) {
            d(view, new n0.a(t10, charSequence, s0Var));
        }
        return t10;
    }

    private static void d(View view, n0.a aVar) {
        l(view);
        p0(aVar.b(), view);
        s(view).add(aVar);
        d0(view, 0);
    }

    static void d0(View view, int i10) {
        boolean z10;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        if (r(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = 32;
        if (q(view) == 0 && !z10) {
            if (i10 == 32) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain);
                obtain.setEventType(32);
                k.g(obtain, i10);
                obtain.setSource(view);
                view.onPopulateAccessibilityEvent(obtain);
                obtain.getText().add(r(view));
                accessibilityManager.sendAccessibilityEvent(obtain);
                return;
            } else if (view.getParent() != null) {
                try {
                    k.e(view.getParent(), view, view, i10);
                    return;
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                    return;
                }
            } else {
                return;
            }
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
        if (!z10) {
            i11 = RecyclerView.m.FLAG_MOVED;
        }
        obtain2.setEventType(i11);
        k.g(obtain2, i10);
        if (z10) {
            obtain2.getText().add(r(view));
            G0(view);
        }
        view.sendAccessibilityEventUnchecked(obtain2);
    }

    public static x0 e(View view) {
        if (f4186b == null) {
            f4186b = new WeakHashMap<>();
        }
        x0 x0Var = f4186b.get(view);
        if (x0Var == null) {
            x0 x0Var2 = new x0(view);
            f4186b.put(view, x0Var2);
            return x0Var2;
        }
        return x0Var;
    }

    public static void e0(View view, int i10) {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i10);
            return;
        }
        Rect z11 = z();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            z11.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z10 = !z11.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z10 = false;
        }
        f(view, i10);
        if (z10 && z11.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(z11);
        }
    }

    private static void f(View view, int i10) {
        view.offsetLeftAndRight(i10);
        if (view.getVisibility() == 0) {
            V0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                V0((View) parent);
            }
        }
    }

    public static void f0(View view, int i10) {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i10);
            return;
        }
        Rect z11 = z();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            z11.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z10 = !z11.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z10 = false;
        }
        g(view, i10);
        if (z10 && z11.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(z11);
        }
    }

    private static void g(View view, int i10) {
        view.offsetTopAndBottom(i10);
        if (view.getVisibility() == 0) {
            V0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                V0((View) parent);
            }
        }
    }

    public static p1 g0(View view, p1 p1Var) {
        WindowInsets u10 = p1Var.u();
        if (u10 != null) {
            WindowInsets b10 = l.b(view, u10);
            if (!b10.equals(u10)) {
                return p1.w(b10, view);
            }
        }
        return p1Var;
    }

    public static p1 h(View view, p1 p1Var, Rect rect) {
        return m.b(view, p1Var, rect);
    }

    public static void h0(View view, androidx.core.view.accessibility.n0 n0Var) {
        view.onInitializeAccessibilityNodeInfo(n0Var.d1());
    }

    public static p1 i(View view, p1 p1Var) {
        WindowInsets u10 = p1Var.u();
        if (u10 != null) {
            WindowInsets a10 = l.a(view, u10);
            if (!a10.equals(u10)) {
                return p1.w(a10, view);
            }
        }
        return p1Var;
    }

    private static f<CharSequence> i0() {
        return new b(r2.e.K, CharSequence.class, 8, 28);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean j(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return w.a(view).b(view, keyEvent);
    }

    public static boolean j0(View view, int i10, Bundle bundle) {
        return h.j(view, i10, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean k(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return w.a(view).f(keyEvent);
    }

    public static androidx.core.view.d k0(View view, androidx.core.view.d dVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + dVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return t.b(view, dVar);
        }
        i0 i0Var = (i0) view.getTag(r2.e.M);
        if (i0Var != null) {
            androidx.core.view.d a10 = i0Var.a(view, dVar);
            if (a10 == null) {
                return null;
            }
            return A(view).a(a10);
        }
        return A(view).a(dVar);
    }

    static void l(View view) {
        androidx.core.view.a n10 = n(view);
        if (n10 == null) {
            n10 = new androidx.core.view.a();
        }
        u0(view, n10);
    }

    public static void l0(View view) {
        h.k(view);
    }

    public static int m() {
        return i.a();
    }

    public static void m0(View view, Runnable runnable) {
        h.m(view, runnable);
    }

    public static androidx.core.view.a n(View view) {
        View.AccessibilityDelegate o10 = o(view);
        if (o10 == null) {
            return null;
        }
        if (o10 instanceof a.C0077a) {
            return ((a.C0077a) o10).f4068a;
        }
        return new androidx.core.view.a(o10);
    }

    @SuppressLint({"LambdaLast"})
    public static void n0(View view, Runnable runnable, long j10) {
        h.n(view, runnable, j10);
    }

    private static View.AccessibilityDelegate o(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return r.a(view);
        }
        return p(view);
    }

    public static void o0(View view, int i10) {
        p0(i10, view);
        d0(view, 0);
    }

    private static View.AccessibilityDelegate p(View view) {
        if (f4188d) {
            return null;
        }
        if (f4187c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f4187c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f4188d = true;
                return null;
            }
        }
        try {
            Object obj = f4187c.get(view);
            if (!(obj instanceof View.AccessibilityDelegate)) {
                return null;
            }
            return (View.AccessibilityDelegate) obj;
        } catch (Throwable unused2) {
            f4188d = true;
            return null;
        }
    }

    private static void p0(int i10, View view) {
        List<n0.a> s10 = s(view);
        for (int i11 = 0; i11 < s10.size(); i11++) {
            if (s10.get(i11).b() == i10) {
                s10.remove(i11);
                return;
            }
        }
    }

    public static int q(View view) {
        return k.a(view);
    }

    public static void q0(View view, n0.a aVar, CharSequence charSequence, androidx.core.view.accessibility.s0 s0Var) {
        if (s0Var == null && charSequence == null) {
            o0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, s0Var));
        }
    }

    public static CharSequence r(View view) {
        return i0().f(view);
    }

    public static void r0(View view) {
        l.c(view);
    }

    private static List<n0.a> s(View view) {
        int i10 = r2.e.H;
        ArrayList arrayList = (ArrayList) view.getTag(i10);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(i10, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static void s0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            r.d(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    private static int t(View view, CharSequence charSequence) {
        boolean z10;
        List<n0.a> s10 = s(view);
        for (int i10 = 0; i10 < s10.size(); i10++) {
            if (TextUtils.equals(charSequence, s10.get(i10).c())) {
                return s10.get(i10).b();
            }
        }
        int i11 = 0;
        int i12 = -1;
        while (true) {
            int[] iArr = f4190f;
            if (i11 >= iArr.length || i12 != -1) {
                break;
            }
            int i13 = iArr[i11];
            boolean z11 = true;
            for (int i14 = 0; i14 < s10.size(); i14++) {
                if (s10.get(i14).b() != i13) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 &= z10;
            }
            if (z11) {
                i12 = i13;
            }
            i11++;
        }
        return i12;
    }

    private static f<Boolean> t0() {
        return new a(r2.e.O, Boolean.class, 28);
    }

    public static ColorStateList u(View view) {
        return m.g(view);
    }

    public static void u0(View view, androidx.core.view.a aVar) {
        View.AccessibilityDelegate d10;
        if (aVar == null && (o(view) instanceof a.C0077a)) {
            aVar = new androidx.core.view.a();
        }
        G0(view);
        if (aVar == null) {
            d10 = null;
        } else {
            d10 = aVar.d();
        }
        view.setAccessibilityDelegate(d10);
    }

    public static PorterDuff.Mode v(View view) {
        return m.h(view);
    }

    public static void v0(View view, boolean z10) {
        b().g(view, Boolean.valueOf(z10));
    }

    public static Rect w(View view) {
        return j.a(view);
    }

    public static void w0(View view, int i10) {
        k.f(view, i10);
    }

    public static Display x(View view) {
        return i.b(view);
    }

    public static void x0(View view, CharSequence charSequence) {
        i0().g(view, charSequence);
        if (charSequence != null) {
            f4192h.a(view);
        } else {
            f4192h.d(view);
        }
    }

    public static float y(View view) {
        return m.i(view);
    }

    public static void y0(View view, Drawable drawable) {
        h.q(view, drawable);
    }

    private static Rect z() {
        if (f4189e == null) {
            f4189e = new ThreadLocal<>();
        }
        Rect rect = f4189e.get();
        if (rect == null) {
            rect = new Rect();
            f4189e.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static void z0(View view, ColorStateList colorStateList) {
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        m.q(view, colorStateList);
        if (i10 == 21) {
            Drawable background = view.getBackground();
            if (m.g(view) == null && m.h(view) == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (background != null && z10) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                h.q(view, background);
            }
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: f  reason: collision with root package name */
        private final WeakHashMap<View, Boolean> f4193f = new WeakHashMap<>();

        e() {
        }

        private void b(View view, boolean z10) {
            boolean z11;
            int i10;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                if (z11) {
                    i10 = 16;
                } else {
                    i10 = 32;
                }
                p0.d0(view, i10);
                this.f4193f.put(view, Boolean.valueOf(z11));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            h.o(view.getViewTreeObserver(), this);
        }

        void a(View view) {
            boolean z10;
            WeakHashMap<View, Boolean> weakHashMap = this.f4193f;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z10));
            view.addOnAttachStateChangeListener(this);
            if (k.b(view)) {
                c(view);
            }
        }

        void d(View view) {
            this.f4193f.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f4193f.entrySet()) {
                    b(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ androidx.core.view.d c0(androidx.core.view.d dVar) {
        return dVar;
    }
}
