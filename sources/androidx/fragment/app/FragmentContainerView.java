package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.p1;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: FragmentContainerView.kt */
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: f  reason: collision with root package name */
    private final List<View> f4583f;

    /* renamed from: m  reason: collision with root package name */
    private final List<View> f4584m;

    /* renamed from: p  reason: collision with root package name */
    private View.OnApplyWindowInsetsListener f4585p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f4586q;

    /* compiled from: FragmentContainerView.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f4587a = new a();

        private a() {
        }

        public final WindowInsets a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
            qc.q.i(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            qc.q.i(view, "v");
            qc.q.i(windowInsets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            qc.q.h(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return onApplyWindowInsets;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        qc.q.i(context, "context");
    }

    private final void a(View view) {
        if (this.f4584m.contains(view)) {
            this.f4583f.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        qc.q.i(view, "child");
        if (FragmentManager.G0(view) != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        p1 g02;
        qc.q.i(windowInsets, "insets");
        p1 v10 = p1.v(windowInsets);
        qc.q.h(v10, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f4585p;
        if (onApplyWindowInsetsListener != null) {
            a aVar = a.f4587a;
            qc.q.f(onApplyWindowInsetsListener);
            g02 = p1.v(aVar.a(onApplyWindowInsetsListener, this, windowInsets));
        } else {
            g02 = androidx.core.view.p0.g0(this, v10);
        }
        qc.q.h(g02, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!g02.o()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                androidx.core.view.p0.i(getChildAt(i10), g02);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        qc.q.i(canvas, "canvas");
        if (this.f4586q) {
            Iterator<T> it = this.f4583f.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        qc.q.i(canvas, "canvas");
        qc.q.i(view, "child");
        if (this.f4586q && (!this.f4583f.isEmpty()) != false && this.f4583f.contains(view)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        qc.q.i(view, "view");
        this.f4584m.remove(view);
        if (this.f4583f.remove(view)) {
            this.f4586q = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        return (F) FragmentManager.l0(this).i0(getId());
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        qc.q.i(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                qc.q.h(childAt, "view");
                a(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        qc.q.i(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        View childAt = getChildAt(i10);
        qc.q.h(childAt, "view");
        a(childAt);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        qc.q.i(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            qc.q.h(childAt, "view");
            a(childAt);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            qc.q.h(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i10, i11);
    }

    public final void setDrawDisappearingViewsLast(boolean z10) {
        this.f4586q = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        qc.q.i(onApplyWindowInsetsListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f4585p = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        qc.q.i(view, "view");
        if (view.getParent() == this) {
            this.f4584m.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        qc.q.i(context, "context");
        this.f4583f = new ArrayList();
        this.f4584m = new ArrayList();
        this.f4586q = true;
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i10, int i11, qc.h hVar) {
        this(context, attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        String str;
        qc.q.i(context, "context");
        this.f4583f = new ArrayList();
        this.f4584m = new ArrayList();
        this.f4586q = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = e3.c.f14025e;
            qc.q.h(iArr, "FragmentContainerView");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(e3.c.f14026f);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        super(context, attributeSet);
        String str;
        qc.q.i(context, "context");
        qc.q.i(attributeSet, "attrs");
        qc.q.i(fragmentManager, "fm");
        this.f4583f = new ArrayList();
        this.f4584m = new ArrayList();
        this.f4586q = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = e3.c.f14025e;
        qc.q.h(iArr, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(e3.c.f14026f) : classAttribute;
        String string = obtainStyledAttributes.getString(e3.c.f14027g);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment i02 = fragmentManager.i0(id2);
        if (classAttribute != null && i02 == null) {
            if (id2 == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment a10 = fragmentManager.w0().a(context.getClassLoader(), classAttribute);
            qc.q.h(a10, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a10.onInflate(context, attributeSet, (Bundle) null);
            fragmentManager.q().x(true).d(this, a10, string).m();
        }
        fragmentManager.e1(this);
    }
}
