package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.view.e0;
import androidx.core.view.f0;
import androidx.core.view.g0;
import androidx.core.view.h0;
import androidx.core.view.p;
import androidx.core.view.p0;
import androidx.core.view.p1;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements e0, f0 {
    static final String H;
    static final Class<?>[] I;
    static final ThreadLocal<Map<String, Constructor<c>>> J;
    static final Comparator<View> K;
    private static final androidx.core.util.f<Rect> L;
    private boolean A;
    private p1 B;
    private boolean C;
    private Drawable D;
    ViewGroup.OnHierarchyChangeListener E;
    private h0 F;
    private final g0 G;

    /* renamed from: f  reason: collision with root package name */
    private final List<View> f3576f;

    /* renamed from: m  reason: collision with root package name */
    private final androidx.coordinatorlayout.widget.b<View> f3577m;

    /* renamed from: p  reason: collision with root package name */
    private final List<View> f3578p;

    /* renamed from: q  reason: collision with root package name */
    private final List<View> f3579q;

    /* renamed from: r  reason: collision with root package name */
    private Paint f3580r;

    /* renamed from: s  reason: collision with root package name */
    private final int[] f3581s;

    /* renamed from: t  reason: collision with root package name */
    private final int[] f3582t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f3583u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f3584v;

    /* renamed from: w  reason: collision with root package name */
    private int[] f3585w;

    /* renamed from: x  reason: collision with root package name */
    private View f3586x;

    /* renamed from: y  reason: collision with root package name */
    private View f3587y;

    /* renamed from: z  reason: collision with root package name */
    private g f3588z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements h0 {
        a() {
        }

        @Override // androidx.core.view.h0
        public p1 a(View view, p1 p1Var) {
            return CoordinatorLayout.this.Q(p1Var);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        c getBehavior();
    }

    /* loaded from: classes.dex */
    public static abstract class c<V extends View> {
        public c() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
            if (i11 == 0) {
                return z(coordinatorLayout, v10, view, view2, i10);
            }
            return false;
        }

        public void C(CoordinatorLayout coordinatorLayout, V v10, View view, int i10) {
            if (i10 == 0) {
                B(coordinatorLayout, v10, view);
            }
        }

        public boolean D(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v10) {
            if (d(coordinatorLayout, v10) > 0.0f) {
                return true;
            }
            return false;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v10, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, V v10) {
            return -16777216;
        }

        public float d(CoordinatorLayout coordinatorLayout, V v10) {
            return 0.0f;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, V v10, View view) {
            return false;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v10, View view) {
            return false;
        }

        public boolean k(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12, int i13) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11, boolean z10) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11) {
            return false;
        }

        public void q(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
            if (i12 == 0) {
                p(coordinatorLayout, v10, view, i10, i11, iArr);
            }
        }

        @Deprecated
        public void s(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                r(coordinatorLayout, v10, view, i10, i11, i12, i13);
            }
        }

        public void t(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
            s(coordinatorLayout, v10, view, i10, i11, i12, i13, i14);
        }

        public void v(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
            if (i11 == 0) {
                u(coordinatorLayout, v10, view, view2, i10);
            }
        }

        public boolean w(CoordinatorLayout coordinatorLayout, V v10, Rect rect, boolean z10) {
            return false;
        }

        public Parcelable y(CoordinatorLayout coordinatorLayout, V v10) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean z(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public void j() {
        }

        public void g(f fVar) {
        }

        @Deprecated
        public void B(CoordinatorLayout coordinatorLayout, V v10, View view) {
        }

        public p1 f(CoordinatorLayout coordinatorLayout, V v10, p1 p1Var) {
            return p1Var;
        }

        public void i(CoordinatorLayout coordinatorLayout, V v10, View view) {
        }

        public void x(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        }

        @Deprecated
        public void u(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10) {
        }

        @Deprecated
        public void p(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr) {
        }

        @Deprecated
        public void r(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* loaded from: classes.dex */
    public @interface d {
        Class<? extends c> value();
    }

    /* loaded from: classes.dex */
    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.E;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.B(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.E;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.B(0);
            return true;
        }
    }

    /* loaded from: classes.dex */
    static class h implements Comparator<View> {
        h() {
        }

        @Override // java.util.Comparator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float R = p0.R(view);
            float R2 = p0.R(view2);
            if (R > R2) {
                return -1;
            }
            if (R < R2) {
                return 1;
            }
            return 0;
        }
    }

    static {
        String str;
        Package r02 = CoordinatorLayout.class.getPackage();
        if (r02 != null) {
            str = r02.getName();
        } else {
            str = null;
        }
        H = str;
        K = new h();
        I = new Class[]{Context.class, AttributeSet.class};
        J = new ThreadLocal<>();
        L = new androidx.core.util.h(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, q2.a.f21341a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static c E(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = H;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = J;
            Map<String, Constructor<c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(I);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e10) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e10);
        }
    }

    private boolean F(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f3578p;
        t(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = list.get(i11);
            f fVar = (f) view.getLayoutParams();
            c f10 = fVar.f();
            if ((z10 || z11) && actionMasked != 0) {
                if (f10 != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i10 != 0) {
                        if (i10 == 1) {
                            f10.D(this, view, motionEvent2);
                        }
                    } else {
                        f10.k(this, view, motionEvent2);
                    }
                }
            } else {
                if (!z10 && f10 != null) {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            z10 = f10.D(this, view, motionEvent);
                        }
                    } else {
                        z10 = f10.k(this, view, motionEvent);
                    }
                    if (z10) {
                        this.f3586x = view;
                    }
                }
                boolean c10 = fVar.c();
                boolean i12 = fVar.i(this, view);
                if (i12 && !c10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i12 && !z11) {
                    break;
                }
            }
        }
        list.clear();
        return z10;
    }

    private void G() {
        this.f3576f.clear();
        this.f3577m.c();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f s10 = s(childAt);
            s10.d(this, childAt);
            this.f3577m.b(childAt);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (i11 != i10) {
                    View childAt2 = getChildAt(i11);
                    if (s10.b(this, childAt, childAt2)) {
                        if (!this.f3577m.d(childAt2)) {
                            this.f3577m.b(childAt2);
                        }
                        this.f3577m.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f3576f.addAll(this.f3577m.i());
        Collections.reverse(this.f3576f);
    }

    private static void I(Rect rect) {
        rect.setEmpty();
        L.a(rect);
    }

    private void K(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c f10 = ((f) childAt.getLayoutParams()).f();
            if (f10 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    f10.k(this, childAt, obtain);
                } else {
                    f10.D(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((f) getChildAt(i11).getLayoutParams()).m();
        }
        this.f3586x = null;
        this.f3583u = false;
    }

    private static int L(int i10) {
        if (i10 == 0) {
            return 17;
        }
        return i10;
    }

    private static int M(int i10) {
        if ((i10 & 7) == 0) {
            i10 |= 8388611;
        }
        if ((i10 & 112) == 0) {
            return i10 | 48;
        }
        return i10;
    }

    private static int N(int i10) {
        if (i10 == 0) {
            return 8388661;
        }
        return i10;
    }

    private void O(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f3600i;
        if (i11 != i10) {
            p0.e0(view, i10 - i11);
            fVar.f3600i = i10;
        }
    }

    private void P(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f3601j;
        if (i11 != i10) {
            p0.f0(view, i10 - i11);
            fVar.f3601j = i10;
        }
    }

    private void R() {
        if (p0.B(this)) {
            if (this.F == null) {
                this.F = new a();
            }
            p0.J0(this, this.F);
            setSystemUiVisibility(1280);
            return;
        }
        p0.J0(this, null);
    }

    private static Rect a() {
        Rect b10 = L.b();
        if (b10 == null) {
            return new Rect();
        }
        return b10;
    }

    private static int c(int i10, int i11, int i12) {
        if (i10 < i11) {
            return i11;
        }
        if (i10 > i12) {
            return i12;
        }
        return i10;
    }

    private void d(f fVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i10 + max, i11 + max2);
    }

    private p1 e(p1 p1Var) {
        c f10;
        if (p1Var.o()) {
            return p1Var;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (p0.B(childAt) && (f10 = ((f) childAt.getLayoutParams()).f()) != null) {
                p1Var = f10.f(this, childAt, p1Var);
                if (p1Var.o()) {
                    break;
                }
            }
        }
        return p1Var;
    }

    private void p(View view, int i10, Rect rect, Rect rect2, f fVar, int i11, int i12) {
        int width;
        int height;
        int b10 = p.b(L(fVar.f3594c), i10);
        int b11 = p.b(M(fVar.f3595d), i10);
        int i13 = b10 & 7;
        int i14 = b10 & 112;
        int i15 = b11 & 7;
        int i16 = b11 & 112;
        if (i15 != 1) {
            if (i15 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i16 != 16) {
            if (i16 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i13 != 1) {
            if (i13 != 5) {
                width -= i11;
            }
        } else {
            width -= i11 / 2;
        }
        if (i14 != 16) {
            if (i14 != 80) {
                height -= i12;
            }
        } else {
            height -= i12 / 2;
        }
        rect2.set(width, height, i11 + width, i12 + height);
    }

    private int q(int i10) {
        int[] iArr = this.f3585w;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        } else if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
            return 0;
        }
    }

    private void t(List<View> list) {
        int i10;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            if (isChildrenDrawingOrderEnabled) {
                i10 = getChildDrawingOrder(childCount, i11);
            } else {
                i10 = i11;
            }
            list.add(getChildAt(i10));
        }
        Comparator<View> comparator = K;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean u(View view) {
        return this.f3577m.j(view);
    }

    private void w(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        Rect a10 = a();
        a10.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.B != null && p0.B(this) && !p0.B(view)) {
            a10.left += this.B.j();
            a10.top += this.B.l();
            a10.right -= this.B.k();
            a10.bottom -= this.B.i();
        }
        Rect a11 = a();
        p.a(M(fVar.f3594c), view.getMeasuredWidth(), view.getMeasuredHeight(), a10, a11, i10);
        view.layout(a11.left, a11.top, a11.right, a11.bottom);
        I(a10);
        I(a11);
    }

    private void x(View view, View view2, int i10) {
        Rect a10 = a();
        Rect a11 = a();
        try {
            n(view2, a10);
            o(view, i10, a10, a11);
            view.layout(a11.left, a11.top, a11.right, a11.bottom);
        } finally {
            I(a10);
            I(a11);
        }
    }

    private void y(View view, int i10, int i11) {
        f fVar = (f) view.getLayoutParams();
        int b10 = p.b(N(fVar.f3594c), i11);
        int i12 = b10 & 7;
        int i13 = b10 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i11 == 1) {
            i10 = width - i10;
        }
        int q10 = q(i10) - measuredWidth;
        if (i12 != 1) {
            if (i12 == 5) {
                q10 += measuredWidth;
            }
        } else {
            q10 += measuredWidth / 2;
        }
        int i14 = 0;
        if (i13 != 16) {
            if (i13 == 80) {
                i14 = measuredHeight + 0;
            }
        } else {
            i14 = 0 + (measuredHeight / 2);
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(q10, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i14, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private void z(View view, Rect rect, int i10) {
        boolean z10;
        boolean z11;
        int width;
        int i11;
        int i12;
        int i13;
        int height;
        int i14;
        int i15;
        int i16;
        if (p0.Y(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c f10 = fVar.f();
            Rect a10 = a();
            Rect a11 = a();
            a11.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f10 != null && f10.b(this, view, a10)) {
                if (!a11.contains(a10)) {
                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a10.toShortString() + " | Bounds:" + a11.toShortString());
                }
            } else {
                a10.set(a11);
            }
            I(a11);
            if (a10.isEmpty()) {
                I(a10);
                return;
            }
            int b10 = p.b(fVar.f3599h, i10);
            boolean z12 = true;
            if ((b10 & 48) == 48 && (i15 = (a10.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f3601j) < (i16 = rect.top)) {
                P(view, i16 - i15);
                z10 = true;
            } else {
                z10 = false;
            }
            if ((b10 & 80) == 80 && (height = ((getHeight() - a10.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f3601j) < (i14 = rect.bottom)) {
                P(view, height - i14);
                z10 = true;
            }
            if (!z10) {
                P(view, 0);
            }
            if ((b10 & 3) == 3 && (i12 = (a10.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f3600i) < (i13 = rect.left)) {
                O(view, i13 - i12);
                z11 = true;
            } else {
                z11 = false;
            }
            if ((b10 & 5) == 5 && (width = ((getWidth() - a10.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f3600i) < (i11 = rect.right)) {
                O(view, width - i11);
            } else {
                z12 = z11;
            }
            if (!z12) {
                O(view, 0);
            }
            I(a10);
        }
    }

    void A(View view, int i10) {
        c f10;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f3602k != null) {
            Rect a10 = a();
            Rect a11 = a();
            Rect a12 = a();
            n(fVar.f3602k, a10);
            boolean z10 = false;
            k(view, false, a11);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            p(view, i10, a10, a12, fVar, measuredWidth, measuredHeight);
            if (a12.left != a11.left || a12.top != a11.top) {
                z10 = true;
            }
            d(fVar, a12, measuredWidth, measuredHeight);
            int i11 = a12.left - a11.left;
            int i12 = a12.top - a11.top;
            if (i11 != 0) {
                p0.e0(view, i11);
            }
            if (i12 != 0) {
                p0.f0(view, i12);
            }
            if (z10 && (f10 = fVar.f()) != null) {
                f10.h(this, view, fVar.f3602k);
            }
            I(a10);
            I(a11);
            I(a12);
        }
    }

    final void B(int i10) {
        boolean z10;
        int E = p0.E(this);
        int size = this.f3576f.size();
        Rect a10 = a();
        Rect a11 = a();
        Rect a12 = a();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.f3576f.get(i11);
            f fVar = (f) view.getLayoutParams();
            if (i10 != 0 || view.getVisibility() != 8) {
                for (int i12 = 0; i12 < i11; i12++) {
                    if (fVar.f3603l == this.f3576f.get(i12)) {
                        A(view, E);
                    }
                }
                k(view, true, a11);
                if (fVar.f3598g != 0 && !a11.isEmpty()) {
                    int b10 = p.b(fVar.f3598g, E);
                    int i13 = b10 & 112;
                    if (i13 != 48) {
                        if (i13 == 80) {
                            a10.bottom = Math.max(a10.bottom, getHeight() - a11.top);
                        }
                    } else {
                        a10.top = Math.max(a10.top, a11.bottom);
                    }
                    int i14 = b10 & 7;
                    if (i14 != 3) {
                        if (i14 == 5) {
                            a10.right = Math.max(a10.right, getWidth() - a11.left);
                        }
                    } else {
                        a10.left = Math.max(a10.left, a11.right);
                    }
                }
                if (fVar.f3599h != 0 && view.getVisibility() == 0) {
                    z(view, a10, E);
                }
                if (i10 != 2) {
                    r(view, a12);
                    if (!a12.equals(a11)) {
                        H(view, a11);
                    }
                }
                for (int i15 = i11 + 1; i15 < size; i15++) {
                    View view2 = this.f3576f.get(i15);
                    f fVar2 = (f) view2.getLayoutParams();
                    c f10 = fVar2.f();
                    if (f10 != null && f10.e(this, view2, view)) {
                        if (i10 == 0 && fVar2.g()) {
                            fVar2.k();
                        } else {
                            if (i10 != 2) {
                                z10 = f10.h(this, view2, view);
                            } else {
                                f10.i(this, view2, view);
                                z10 = true;
                            }
                            if (i10 == 1) {
                                fVar2.p(z10);
                            }
                        }
                    }
                }
            }
        }
        I(a10);
        I(a11);
        I(a12);
    }

    public void C(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.a()) {
            View view2 = fVar.f3602k;
            if (view2 != null) {
                x(view, view2, i10);
                return;
            }
            int i11 = fVar.f3596e;
            if (i11 >= 0) {
                y(view, i11, i10);
                return;
            } else {
                w(view, i10);
                return;
            }
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    public void D(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    void H(View view, Rect rect) {
        ((f) view.getLayoutParams()).q(rect);
    }

    void J() {
        if (this.f3584v && this.f3588z != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f3588z);
        }
        this.A = false;
    }

    final p1 Q(p1 p1Var) {
        boolean z10;
        if (!androidx.core.util.c.a(this.B, p1Var)) {
            this.B = p1Var;
            boolean z11 = true;
            if (p1Var != null && p1Var.l() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.C = z10;
            if (z10 || getBackground() != null) {
                z11 = false;
            }
            setWillNotDraw(z11);
            p1 e10 = e(p1Var);
            requestLayout();
            return e10;
        }
        return p1Var;
    }

    void b() {
        if (this.f3584v) {
            if (this.f3588z == null) {
                this.f3588z = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f3588z);
        }
        this.A = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof f) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f3592a;
        if (cVar != null) {
            float d10 = cVar.d(this, view);
            if (d10 > 0.0f) {
                if (this.f3580r == null) {
                    this.f3580r = new Paint();
                }
                this.f3580r.setColor(fVar.f3592a.c(this, view));
                this.f3580r.setAlpha(c(Math.round(d10 * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f3580r);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.D;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    public void f(View view) {
        List g10 = this.f3577m.g(view);
        if (g10 != null && !g10.isEmpty()) {
            for (int i10 = 0; i10 < g10.size(); i10++) {
                View view2 = (View) g10.get(i10);
                c f10 = ((f) view2.getLayoutParams()).f();
                if (f10 != null) {
                    f10.h(this, view2, view);
                }
            }
        }
    }

    void g() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            } else if (u(getChildAt(i10))) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        if (z10 != this.A) {
            if (z10) {
                b();
            } else {
                J();
            }
        }
    }

    final List<View> getDependencySortedChildren() {
        G();
        return Collections.unmodifiableList(this.f3576f);
    }

    public final p1 getLastWindowInsets() {
        return this.B;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.G.a();
    }

    public Drawable getStatusBarBackground() {
        return this.D;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: h  reason: merged with bridge method [inline-methods] */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: i  reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: j  reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    void k(View view, boolean z10, Rect rect) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z10) {
                n(view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    public List<View> l(View view) {
        List<View> h10 = this.f3577m.h(view);
        this.f3579q.clear();
        if (h10 != null) {
            this.f3579q.addAll(h10);
        }
        return this.f3579q;
    }

    public List<View> m(View view) {
        List g10 = this.f3577m.g(view);
        this.f3579q.clear();
        if (g10 != null) {
            this.f3579q.addAll(g10);
        }
        return this.f3579q;
    }

    void n(View view, Rect rect) {
        androidx.coordinatorlayout.widget.c.a(this, view, rect);
    }

    void o(View view, int i10, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        p(view, i10, rect, rect2, fVar, measuredWidth, measuredHeight);
        d(fVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        K(false);
        if (this.A) {
            if (this.f3588z == null) {
                this.f3588z = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f3588z);
        }
        if (this.B == null && p0.B(this)) {
            p0.r0(this);
        }
        this.f3584v = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        K(false);
        if (this.A && this.f3588z != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f3588z);
        }
        View view = this.f3587y;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f3584v = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i10;
        super.onDraw(canvas);
        if (this.C && this.D != null) {
            p1 p1Var = this.B;
            if (p1Var != null) {
                i10 = p1Var.l();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                this.D.setBounds(0, 0, getWidth(), i10);
                this.D.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            K(true);
        }
        boolean F = F(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            K(true);
        }
        return F;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c f10;
        int E = p0.E(this);
        int size = this.f3576f.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = this.f3576f.get(i14);
            if (view.getVisibility() != 8 && ((f10 = ((f) view.getLayoutParams()).f()) == null || !f10.l(this, view, E))) {
                C(view, E);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x011a, code lost:
    
        if (r0.m(r30, r20, r11, r21, r23, 0) == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        c f12;
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f12 = fVar.f()) != null) {
                    z11 |= f12.n(this, childAt, view, f10, f11, z10);
                }
            }
        }
        if (z11) {
            B(1);
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        c f12;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f12 = fVar.f()) != null) {
                    z10 |= f12.o(this, childAt, view, f10, f11);
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        onNestedPreScroll(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        onNestedScroll(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        onNestedScrollAccepted(view, view2, i10, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        SparseArray<Parcelable> sparseArray = savedState.f3589p;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c f10 = s(childAt).f();
            if (id2 != -1 && f10 != null && (parcelable2 = sparseArray.get(id2)) != null) {
                f10.x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable y10;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c f10 = ((f) childAt.getLayoutParams()).f();
            if (id2 != -1 && f10 != null && (y10 = f10.y(this, childAt)) != null) {
                sparseArray.append(id2, y10);
            }
        }
        savedState.f3589p = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return onStartNestedScroll(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r3 != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f3586x
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.F(r1, r4)
            if (r3 == 0) goto L2b
            goto L16
        L15:
            r3 = 0
        L16:
            android.view.View r6 = r0.f3586x
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f()
            if (r6 == 0) goto L2b
            android.view.View r7 = r0.f3586x
            boolean r6 = r6.D(r0, r7, r1)
            goto L2c
        L2b:
            r6 = 0
        L2c:
            android.view.View r7 = r0.f3586x
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L57
        L54:
            r0.K(r5)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    void r(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).h());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        c f10 = ((f) view.getLayoutParams()).f();
        if (f10 != null && f10.w(this, view, rect, z10)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10 && !this.f3583u) {
            K(false);
            this.f3583u = true;
        }
    }

    f s(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f3593b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.o(behavior);
                fVar.f3593b = true;
            } else {
                d dVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.o(dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e10) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                    }
                }
                fVar.f3593b = true;
            }
        }
        return fVar;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        R();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.E = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z10;
        Drawable drawable2 = this.D;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.D = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.D.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.m(this.D, p0.E(this));
                Drawable drawable4 = this.D;
                if (getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawable4.setVisible(z10, false);
                this.D.setCallback(this);
            }
            p0.l0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = androidx.core.content.a.e(getContext(), i10);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.D;
        if (drawable != null && drawable.isVisible() != z10) {
            this.D.setVisible(z10, false);
        }
    }

    public boolean v(View view, int i10, int i11) {
        Rect a10 = a();
        n(view, a10);
        try {
            return a10.contains(i10, i11);
        } finally {
            I(a10);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.D) {
            return false;
        }
        return true;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray obtainStyledAttributes;
        this.f3576f = new ArrayList();
        this.f3577m = new androidx.coordinatorlayout.widget.b<>();
        this.f3578p = new ArrayList();
        this.f3579q = new ArrayList();
        this.f3581s = new int[2];
        this.f3582t = new int[2];
        this.G = new g0(this);
        if (i10 == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q2.c.f21344b, 0, q2.b.f21342a);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q2.c.f21344b, i10, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i10 == 0) {
                saveAttributeDataForStyleable(context, q2.c.f21344b, attributeSet, obtainStyledAttributes, 0, q2.b.f21342a);
            } else {
                saveAttributeDataForStyleable(context, q2.c.f21344b, attributeSet, obtainStyledAttributes, i10, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(q2.c.f21345c, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f3585w = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = this.f3585w.length;
            for (int i11 = 0; i11 < length; i11++) {
                this.f3585w[i11] = (int) (r12[i11] * f10);
            }
        }
        this.D = obtainStyledAttributes.getDrawable(q2.c.f21346d);
        obtainStyledAttributes.recycle();
        R();
        super.setOnHierarchyChangeListener(new e());
        if (p0.C(this) == 0) {
            p0.F0(this, 1);
        }
    }

    @Override // androidx.core.view.e0
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        c f10;
        int childCount = getChildCount();
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i12) && (f10 = fVar.f()) != null) {
                    int[] iArr2 = this.f3581s;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f10.q(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f3581s;
                    i13 = i10 > 0 ? Math.max(i13, iArr3[0]) : Math.min(i13, iArr3[0]);
                    int[] iArr4 = this.f3581s;
                    i14 = i11 > 0 ? Math.max(i14, iArr4[1]) : Math.min(i14, iArr4[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = i13;
        iArr[1] = i14;
        if (z10) {
            B(1);
        }
    }

    @Override // androidx.core.view.e0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        onNestedScroll(view, i10, i11, i12, i13, 0, this.f3582t);
    }

    @Override // androidx.core.view.e0
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        c f10;
        this.G.c(view, view2, i10, i11);
        this.f3587y = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i11) && (f10 = fVar.f()) != null) {
                f10.v(this, childAt, view, view2, i10, i11);
            }
        }
    }

    @Override // androidx.core.view.e0
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c f10 = fVar.f();
                if (f10 != null) {
                    boolean A = f10.A(this, childAt, view, view2, i10, i11);
                    z10 |= A;
                    fVar.r(i11, A);
                } else {
                    fVar.r(i11, false);
                }
            }
        }
        return z10;
    }

    @Override // androidx.core.view.e0
    public void onStopNestedScroll(View view, int i10) {
        this.G.e(view, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i10)) {
                c f10 = fVar.f();
                if (f10 != null) {
                    f10.C(this, childAt, view, i10);
                }
                fVar.l(i10);
                fVar.k();
            }
        }
        this.f3587y = null;
    }

    @Override // androidx.core.view.f0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c f10;
        int min;
        int childCount = getChildCount();
        boolean z10 = false;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i14) && (f10 = fVar.f()) != null) {
                    int[] iArr2 = this.f3581s;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f10.t(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                    int[] iArr3 = this.f3581s;
                    i15 = i12 > 0 ? Math.max(i15, iArr3[0]) : Math.min(i15, iArr3[0]);
                    if (i13 > 0) {
                        min = Math.max(i16, this.f3581s[1]);
                    } else {
                        min = Math.min(i16, this.f3581s[1]);
                    }
                    i16 = min;
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i15;
        iArr[1] = iArr[1] + i16;
        if (z10) {
            B(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: p  reason: collision with root package name */
        SparseArray<Parcelable> f3589p;

        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c  reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f3589p = new SparseArray<>(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                this.f3589p.append(iArr[i10], readParcelableArray[i10]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int i11;
            super.writeToParcel(parcel, i10);
            SparseArray<Parcelable> sparseArray = this.f3589p;
            if (sparseArray != null) {
                i11 = sparseArray.size();
            } else {
                i11 = 0;
            }
            parcel.writeInt(i11);
            int[] iArr = new int[i11];
            Parcelable[] parcelableArr = new Parcelable[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                iArr[i12] = this.f3589p.keyAt(i12);
                parcelableArr[i12] = this.f3589p.valueAt(i12);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes.dex */
    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        c f3592a;

        /* renamed from: b  reason: collision with root package name */
        boolean f3593b;

        /* renamed from: c  reason: collision with root package name */
        public int f3594c;

        /* renamed from: d  reason: collision with root package name */
        public int f3595d;

        /* renamed from: e  reason: collision with root package name */
        public int f3596e;

        /* renamed from: f  reason: collision with root package name */
        int f3597f;

        /* renamed from: g  reason: collision with root package name */
        public int f3598g;

        /* renamed from: h  reason: collision with root package name */
        public int f3599h;

        /* renamed from: i  reason: collision with root package name */
        int f3600i;

        /* renamed from: j  reason: collision with root package name */
        int f3601j;

        /* renamed from: k  reason: collision with root package name */
        View f3602k;

        /* renamed from: l  reason: collision with root package name */
        View f3603l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f3604m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f3605n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f3606o;

        /* renamed from: p  reason: collision with root package name */
        private boolean f3607p;

        /* renamed from: q  reason: collision with root package name */
        final Rect f3608q;

        /* renamed from: r  reason: collision with root package name */
        Object f3609r;

        public f(int i10, int i11) {
            super(i10, i11);
            this.f3593b = false;
            this.f3594c = 0;
            this.f3595d = 0;
            this.f3596e = -1;
            this.f3597f = -1;
            this.f3598g = 0;
            this.f3599h = 0;
            this.f3608q = new Rect();
        }

        private void n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f3597f);
            this.f3602k = findViewById;
            if (findViewById != null) {
                if (findViewById == coordinatorLayout) {
                    if (coordinatorLayout.isInEditMode()) {
                        this.f3603l = null;
                        this.f3602k = null;
                        return;
                    }
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                    if (parent == view) {
                        if (coordinatorLayout.isInEditMode()) {
                            this.f3603l = null;
                            this.f3602k = null;
                            return;
                        }
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    if (parent instanceof View) {
                        findViewById = (View) parent;
                    }
                }
                this.f3603l = findViewById;
            } else if (coordinatorLayout.isInEditMode()) {
                this.f3603l = null;
                this.f3602k = null;
            } else {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f3597f) + " to anchor view " + view);
            }
        }

        private boolean s(View view, int i10) {
            int b10 = p.b(((f) view.getLayoutParams()).f3598g, i10);
            if (b10 != 0 && (p.b(this.f3599h, i10) & b10) == b10) {
                return true;
            }
            return false;
        }

        private boolean t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f3602k.getId() != this.f3597f) {
                return false;
            }
            View view2 = this.f3602k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent != null && parent != view) {
                    if (parent instanceof View) {
                        view2 = (View) parent;
                    }
                } else {
                    this.f3603l = null;
                    this.f3602k = null;
                    return false;
                }
            }
            this.f3603l = view2;
            return true;
        }

        boolean a() {
            if (this.f3602k == null && this.f3597f != -1) {
                return true;
            }
            return false;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            c cVar;
            if (view2 != this.f3603l && !s(view2, p0.E(coordinatorLayout)) && ((cVar = this.f3592a) == null || !cVar.e(coordinatorLayout, view, view2))) {
                return false;
            }
            return true;
        }

        boolean c() {
            if (this.f3592a == null) {
                this.f3604m = false;
            }
            return this.f3604m;
        }

        View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f3597f == -1) {
                this.f3603l = null;
                this.f3602k = null;
                return null;
            }
            if (this.f3602k == null || !t(view, coordinatorLayout)) {
                n(view, coordinatorLayout);
            }
            return this.f3602k;
        }

        public int e() {
            return this.f3597f;
        }

        public c f() {
            return this.f3592a;
        }

        boolean g() {
            return this.f3607p;
        }

        Rect h() {
            return this.f3608q;
        }

        boolean i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z10;
            boolean z11 = this.f3604m;
            if (z11) {
                return true;
            }
            c cVar = this.f3592a;
            if (cVar != null) {
                z10 = cVar.a(coordinatorLayout, view);
            } else {
                z10 = false;
            }
            boolean z12 = z10 | z11;
            this.f3604m = z12;
            return z12;
        }

        boolean j(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    return false;
                }
                return this.f3606o;
            }
            return this.f3605n;
        }

        void k() {
            this.f3607p = false;
        }

        void l(int i10) {
            r(i10, false);
        }

        void m() {
            this.f3604m = false;
        }

        public void o(c cVar) {
            c cVar2 = this.f3592a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.j();
                }
                this.f3592a = cVar;
                this.f3609r = null;
                this.f3593b = true;
                if (cVar != null) {
                    cVar.g(this);
                }
            }
        }

        void p(boolean z10) {
            this.f3607p = z10;
        }

        void q(Rect rect) {
            this.f3608q.set(rect);
        }

        void r(int i10, boolean z10) {
            if (i10 != 0) {
                if (i10 == 1) {
                    this.f3606o = z10;
                    return;
                }
                return;
            }
            this.f3605n = z10;
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3593b = false;
            this.f3594c = 0;
            this.f3595d = 0;
            this.f3596e = -1;
            this.f3597f = -1;
            this.f3598g = 0;
            this.f3599h = 0;
            this.f3608q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q2.c.f21347e);
            this.f3594c = obtainStyledAttributes.getInteger(q2.c.f21348f, 0);
            this.f3597f = obtainStyledAttributes.getResourceId(q2.c.f21349g, -1);
            this.f3595d = obtainStyledAttributes.getInteger(q2.c.f21350h, 0);
            this.f3596e = obtainStyledAttributes.getInteger(q2.c.f21354l, -1);
            this.f3598g = obtainStyledAttributes.getInt(q2.c.f21353k, 0);
            this.f3599h = obtainStyledAttributes.getInt(q2.c.f21352j, 0);
            int i10 = q2.c.f21351i;
            boolean hasValue = obtainStyledAttributes.hasValue(i10);
            this.f3593b = hasValue;
            if (hasValue) {
                this.f3592a = CoordinatorLayout.E(context, attributeSet, obtainStyledAttributes.getString(i10));
            }
            obtainStyledAttributes.recycle();
            c cVar = this.f3592a;
            if (cVar != null) {
                cVar.g(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f3593b = false;
            this.f3594c = 0;
            this.f3595d = 0;
            this.f3596e = -1;
            this.f3597f = -1;
            this.f3598g = 0;
            this.f3599h = 0;
            this.f3608q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3593b = false;
            this.f3594c = 0;
            this.f3595d = 0;
            this.f3596e = -1;
            this.f3597f = -1;
            this.f3598g = 0;
            this.f3599h = 0;
            this.f3608q = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3593b = false;
            this.f3594c = 0;
            this.f3595d = 0;
            this.f3596e = -1;
            this.f3597f = -1;
            this.f3598g = 0;
            this.f3599h = 0;
            this.f3608q = new Rect();
        }
    }
}
