package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.h0;
import androidx.core.view.p0;
import androidx.core.view.p1;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes3.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    private static final int S = v6.k.f24801k;
    private boolean A;
    private Drawable B;
    Drawable C;
    private int D;
    private boolean E;
    private ValueAnimator F;
    private long G;
    private final TimeInterpolator H;
    private final TimeInterpolator I;
    private int J;
    private AppBarLayout.g K;
    int L;
    private int M;
    p1 N;
    private int O;
    private boolean P;
    private int Q;
    private boolean R;

    /* renamed from: f  reason: collision with root package name */
    private boolean f9451f;

    /* renamed from: m  reason: collision with root package name */
    private int f9452m;

    /* renamed from: p  reason: collision with root package name */
    private ViewGroup f9453p;

    /* renamed from: q  reason: collision with root package name */
    private View f9454q;

    /* renamed from: r  reason: collision with root package name */
    private View f9455r;

    /* renamed from: s  reason: collision with root package name */
    private int f9456s;

    /* renamed from: t  reason: collision with root package name */
    private int f9457t;

    /* renamed from: u  reason: collision with root package name */
    private int f9458u;

    /* renamed from: v  reason: collision with root package name */
    private int f9459v;

    /* renamed from: w  reason: collision with root package name */
    private final Rect f9460w;

    /* renamed from: x  reason: collision with root package name */
    final com.google.android.material.internal.a f9461x;

    /* renamed from: y  reason: collision with root package name */
    final g7.a f9462y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f9463z;

    /* loaded from: classes3.dex */
    class a implements h0 {
        a() {
        }

        @Override // androidx.core.view.h0
        public p1 a(View view, p1 p1Var) {
            return CollapsingToolbarLayout.this.o(p1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* loaded from: classes3.dex */
    private class d implements AppBarLayout.g {
        d() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.b
        public void a(AppBarLayout appBarLayout, int i10) {
            int i11;
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.L = i10;
            p1 p1Var = collapsingToolbarLayout.N;
            if (p1Var != null) {
                i11 = p1Var.l();
            } else {
                i11 = 0;
            }
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i12);
                c cVar = (c) childAt.getLayoutParams();
                n k10 = CollapsingToolbarLayout.k(childAt);
                int i13 = cVar.f9466a;
                if (i13 != 1) {
                    if (i13 == 2) {
                        k10.f(Math.round((-i10) * cVar.f9467b));
                    }
                } else {
                    k10.f(t2.a.b(-i10, 0, CollapsingToolbarLayout.this.i(childAt)));
                }
            }
            CollapsingToolbarLayout.this.v();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.C != null && i11 > 0) {
                p0.l0(collapsingToolbarLayout2);
            }
            int height = (CollapsingToolbarLayout.this.getHeight() - p0.F(CollapsingToolbarLayout.this)) - i11;
            float f10 = height;
            CollapsingToolbarLayout.this.f9461x.A0(Math.min(1.0f, (r0 - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger()) / f10));
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            collapsingToolbarLayout3.f9461x.n0(collapsingToolbarLayout3.L + height);
            CollapsingToolbarLayout.this.f9461x.y0(Math.abs(i10) / f10);
        }
    }

    /* loaded from: classes3.dex */
    public interface e extends com.google.android.material.internal.m {
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, v6.b.f24638i);
    }

    private void a(int i10) {
        TimeInterpolator timeInterpolator;
        d();
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.F = valueAnimator2;
            if (i10 > this.D) {
                timeInterpolator = this.H;
            } else {
                timeInterpolator = this.I;
            }
            valueAnimator2.setInterpolator(timeInterpolator);
            this.F.addUpdateListener(new b());
        } else if (valueAnimator.isRunning()) {
            this.F.cancel();
        }
        this.F.setDuration(this.G);
        this.F.setIntValues(this.D, i10);
        this.F.start();
    }

    private TextUtils.TruncateAt b(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    return TextUtils.TruncateAt.END;
                }
                return TextUtils.TruncateAt.MARQUEE;
            }
            return TextUtils.TruncateAt.MIDDLE;
        }
        return TextUtils.TruncateAt.START;
    }

    private void c(AppBarLayout appBarLayout) {
        if (l()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    private void d() {
        if (!this.f9451f) {
            return;
        }
        ViewGroup viewGroup = null;
        this.f9453p = null;
        this.f9454q = null;
        int i10 = this.f9452m;
        if (i10 != -1) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById(i10);
            this.f9453p = viewGroup2;
            if (viewGroup2 != null) {
                this.f9454q = e(viewGroup2);
            }
        }
        if (this.f9453p == null) {
            int childCount = getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i11);
                if (m(childAt)) {
                    viewGroup = (ViewGroup) childAt;
                    break;
                }
                i11++;
            }
            this.f9453p = viewGroup;
        }
        u();
        this.f9451f = false;
    }

    private View e(View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return view;
    }

    private static int h(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return view.getMeasuredHeight();
    }

    private static CharSequence j(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    static n k(View view) {
        int i10 = v6.f.Y;
        n nVar = (n) view.getTag(i10);
        if (nVar == null) {
            n nVar2 = new n(view);
            view.setTag(i10, nVar2);
            return nVar2;
        }
        return nVar;
    }

    private boolean l() {
        if (this.M == 1) {
            return true;
        }
        return false;
    }

    private static boolean m(View view) {
        if (!(view instanceof Toolbar) && !(view instanceof android.widget.Toolbar)) {
            return false;
        }
        return true;
    }

    private boolean n(View view) {
        View view2 = this.f9454q;
        if (view2 != null && view2 != this) {
            if (view == view2) {
                return true;
            }
        } else if (view == this.f9453p) {
            return true;
        }
        return false;
    }

    private void q(boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        View view = this.f9454q;
        if (view == null) {
            view = this.f9453p;
        }
        int i15 = i(view);
        com.google.android.material.internal.c.a(this, this.f9455r, this.f9460w);
        ViewGroup viewGroup = this.f9453p;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            i10 = toolbar.getTitleMarginStart();
            i12 = toolbar.getTitleMarginEnd();
            i13 = toolbar.getTitleMarginTop();
            i11 = toolbar.getTitleMarginBottom();
        } else if (Build.VERSION.SDK_INT >= 24 && (viewGroup instanceof android.widget.Toolbar)) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            i10 = toolbar2.getTitleMarginStart();
            i12 = toolbar2.getTitleMarginEnd();
            i13 = toolbar2.getTitleMarginTop();
            i11 = toolbar2.getTitleMarginBottom();
        } else {
            i10 = 0;
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        com.google.android.material.internal.a aVar = this.f9461x;
        Rect rect = this.f9460w;
        int i16 = rect.left;
        if (z10) {
            i14 = i12;
        } else {
            i14 = i10;
        }
        int i17 = i16 + i14;
        int i18 = rect.top + i15 + i13;
        int i19 = rect.right;
        if (!z10) {
            i10 = i12;
        }
        aVar.e0(i17, i18, i19 - i10, (rect.bottom + i15) - i11);
    }

    private void r() {
        setContentDescription(getTitle());
    }

    private void s(Drawable drawable, int i10, int i11) {
        t(drawable, this.f9453p, i10, i11);
    }

    private void t(Drawable drawable, View view, int i10, int i11) {
        if (l() && view != null && this.f9463z) {
            i11 = view.getBottom();
        }
        drawable.setBounds(0, 0, i10, i11);
    }

    private void u() {
        View view;
        if (!this.f9463z && (view = this.f9455r) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f9455r);
            }
        }
        if (this.f9463z && this.f9453p != null) {
            if (this.f9455r == null) {
                this.f9455r = new View(getContext());
            }
            if (this.f9455r.getParent() == null) {
                this.f9453p.addView(this.f9455r, -1, -1);
            }
        }
    }

    private void w(int i10, int i11, int i12, int i13, boolean z10) {
        View view;
        boolean z11;
        int i14;
        int i15;
        if (this.f9463z && (view = this.f9455r) != null) {
            boolean z12 = false;
            if (p0.X(view) && this.f9455r.getVisibility() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.A = z11;
            if (z11 || z10) {
                if (p0.E(this) == 1) {
                    z12 = true;
                }
                q(z12);
                com.google.android.material.internal.a aVar = this.f9461x;
                if (z12) {
                    i14 = this.f9458u;
                } else {
                    i14 = this.f9456s;
                }
                int i16 = this.f9460w.top + this.f9457t;
                int i17 = i12 - i10;
                if (z12) {
                    i15 = this.f9456s;
                } else {
                    i15 = this.f9458u;
                }
                aVar.o0(i14, i16, i17 - i15, (i13 - i11) - this.f9459v);
                this.f9461x.b0(z10);
            }
        }
    }

    private void x() {
        if (this.f9453p != null && this.f9463z && TextUtils.isEmpty(this.f9461x.O())) {
            setTitle(j(this.f9453p));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        Drawable drawable;
        super.draw(canvas);
        d();
        if (this.f9453p == null && (drawable = this.B) != null && this.D > 0) {
            drawable.mutate().setAlpha(this.D);
            this.B.draw(canvas);
        }
        if (this.f9463z && this.A) {
            if (this.f9453p != null && this.B != null && this.D > 0 && l() && this.f9461x.F() < this.f9461x.G()) {
                int save = canvas.save();
                canvas.clipRect(this.B.getBounds(), Region.Op.DIFFERENCE);
                this.f9461x.l(canvas);
                canvas.restoreToCount(save);
            } else {
                this.f9461x.l(canvas);
            }
        }
        if (this.C != null && this.D > 0) {
            p1 p1Var = this.N;
            if (p1Var != null) {
                i10 = p1Var.l();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                this.C.setBounds(0, -this.L, getWidth(), i10 - this.L);
                this.C.mutate().setAlpha(this.D);
                this.C.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        if (this.B != null && this.D > 0 && n(view)) {
            t(this.B, view, getWidth(), getHeight());
            this.B.mutate().setAlpha(this.D);
            this.B.draw(canvas);
            z10 = true;
        } else {
            z10 = false;
        }
        if (super.drawChild(canvas, view, j10) || z10) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.C;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.B;
        if (drawable2 != null && drawable2.isStateful()) {
            z10 |= drawable2.setState(drawableState);
        }
        com.google.android.material.internal.a aVar = this.f9461x;
        if (aVar != null) {
            z10 |= aVar.I0(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: f  reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        return new c(-1, -1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: g  reason: merged with bridge method [inline-methods] */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public int getCollapsedTitleGravity() {
        return this.f9461x.q();
    }

    public float getCollapsedTitleTextSize() {
        return this.f9461x.u();
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.f9461x.v();
    }

    public Drawable getContentScrim() {
        return this.B;
    }

    public int getExpandedTitleGravity() {
        return this.f9461x.B();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f9459v;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f9458u;
    }

    public int getExpandedTitleMarginStart() {
        return this.f9456s;
    }

    public int getExpandedTitleMarginTop() {
        return this.f9457t;
    }

    public float getExpandedTitleTextSize() {
        return this.f9461x.D();
    }

    public Typeface getExpandedTitleTypeface() {
        return this.f9461x.E();
    }

    public int getHyphenationFrequency() {
        return this.f9461x.H();
    }

    public int getLineCount() {
        return this.f9461x.I();
    }

    public float getLineSpacingAdd() {
        return this.f9461x.J();
    }

    public float getLineSpacingMultiplier() {
        return this.f9461x.K();
    }

    public int getMaxLines() {
        return this.f9461x.L();
    }

    int getScrimAlpha() {
        return this.D;
    }

    public long getScrimAnimationDuration() {
        return this.G;
    }

    public int getScrimVisibleHeightTrigger() {
        int i10;
        int i11 = this.J;
        if (i11 >= 0) {
            return i11 + this.O + this.Q;
        }
        p1 p1Var = this.N;
        if (p1Var != null) {
            i10 = p1Var.l();
        } else {
            i10 = 0;
        }
        int F = p0.F(this);
        if (F > 0) {
            return Math.min((F * 2) + i10, getHeight());
        }
        return getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.C;
    }

    public CharSequence getTitle() {
        if (this.f9463z) {
            return this.f9461x.O();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.M;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f9461x.N();
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.f9461x.R();
    }

    final int i(View view) {
        return ((getHeight() - k(view).b()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((c) view.getLayoutParams())).bottomMargin;
    }

    p1 o(p1 p1Var) {
        p1 p1Var2;
        if (p0.B(this)) {
            p1Var2 = p1Var;
        } else {
            p1Var2 = null;
        }
        if (!androidx.core.util.c.a(this.N, p1Var2)) {
            this.N = p1Var2;
            requestLayout();
        }
        return p1Var.c();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            c(appBarLayout);
            p0.D0(this, p0.B(appBarLayout));
            if (this.K == null) {
                this.K = new d();
            }
            appBarLayout.d(this.K);
            p0.r0(this);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f9461x.Y(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.g gVar = this.K;
        if (gVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).v(gVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        p1 p1Var = this.N;
        if (p1Var != null) {
            int l10 = p1Var.l();
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                if (!p0.B(childAt) && childAt.getTop() < l10) {
                    p0.f0(childAt, l10);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            k(getChildAt(i15)).d();
        }
        w(i10, i11, i12, i13, false);
        x();
        v();
        int childCount3 = getChildCount();
        for (int i16 = 0; i16 < childCount3; i16++) {
            k(getChildAt(i16)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        d();
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        p1 p1Var = this.N;
        if (p1Var != null) {
            i12 = p1Var.l();
        } else {
            i12 = 0;
        }
        if ((mode == 0 || this.P) && i12 > 0) {
            this.O = i12;
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + i12, 1073741824));
        }
        if (this.R && this.f9461x.L() > 1) {
            x();
            w(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int z10 = this.f9461x.z();
            if (z10 > 1) {
                this.Q = Math.round(this.f9461x.A()) * (z10 - 1);
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.Q, 1073741824));
            }
        }
        ViewGroup viewGroup = this.f9453p;
        if (viewGroup != null) {
            View view = this.f9454q;
            if (view != null && view != this) {
                setMinimumHeight(h(view));
            } else {
                setMinimumHeight(h(viewGroup));
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Drawable drawable = this.B;
        if (drawable != null) {
            s(drawable, i10, i11);
        }
    }

    public void p(boolean z10, boolean z11) {
        if (this.E != z10) {
            int i10 = 255;
            if (z11) {
                if (!z10) {
                    i10 = 0;
                }
                a(i10);
            } else {
                if (!z10) {
                    i10 = 0;
                }
                setScrimAlpha(i10);
            }
            this.E = z10;
        }
    }

    public void setCollapsedTitleGravity(int i10) {
        this.f9461x.j0(i10);
    }

    public void setCollapsedTitleTextAppearance(int i10) {
        this.f9461x.g0(i10);
    }

    public void setCollapsedTitleTextColor(int i10) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setCollapsedTitleTextSize(float f10) {
        this.f9461x.k0(f10);
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.f9461x.l0(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.B;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.B = drawable3;
            if (drawable3 != null) {
                s(drawable3, getWidth(), getHeight());
                this.B.setCallback(this);
                this.B.setAlpha(this.D);
            }
            p0.l0(this);
        }
    }

    public void setContentScrimColor(int i10) {
        setContentScrim(new ColorDrawable(i10));
    }

    public void setContentScrimResource(int i10) {
        setContentScrim(androidx.core.content.a.e(getContext(), i10));
    }

    public void setExpandedTitleColor(int i10) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setExpandedTitleGravity(int i10) {
        this.f9461x.u0(i10);
    }

    public void setExpandedTitleMarginBottom(int i10) {
        this.f9459v = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i10) {
        this.f9458u = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i10) {
        this.f9456s = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i10) {
        this.f9457t = i10;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i10) {
        this.f9461x.r0(i10);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.f9461x.t0(colorStateList);
    }

    public void setExpandedTitleTextSize(float f10) {
        this.f9461x.v0(f10);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.f9461x.w0(typeface);
    }

    public void setExtraMultilineHeightEnabled(boolean z10) {
        this.R = z10;
    }

    public void setForceApplySystemWindowInsetTop(boolean z10) {
        this.P = z10;
    }

    public void setHyphenationFrequency(int i10) {
        this.f9461x.B0(i10);
    }

    public void setLineSpacingAdd(float f10) {
        this.f9461x.D0(f10);
    }

    public void setLineSpacingMultiplier(float f10) {
        this.f9461x.E0(f10);
    }

    public void setMaxLines(int i10) {
        this.f9461x.F0(i10);
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z10) {
        this.f9461x.H0(z10);
    }

    void setScrimAlpha(int i10) {
        ViewGroup viewGroup;
        if (i10 != this.D) {
            if (this.B != null && (viewGroup = this.f9453p) != null) {
                p0.l0(viewGroup);
            }
            this.D = i10;
            p0.l0(this);
        }
    }

    public void setScrimAnimationDuration(long j10) {
        this.G = j10;
    }

    public void setScrimVisibleHeightTrigger(int i10) {
        if (this.J != i10) {
            this.J = i10;
            v();
        }
    }

    public void setScrimsShown(boolean z10) {
        boolean z11;
        if (p0.Y(this) && !isInEditMode()) {
            z11 = true;
        } else {
            z11 = false;
        }
        p(z10, z11);
    }

    public void setStaticLayoutBuilderConfigurer(e eVar) {
        this.f9461x.J0(eVar);
    }

    public void setStatusBarScrim(Drawable drawable) {
        boolean z10;
        Drawable drawable2 = this.C;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.C = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.C.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.m(this.C, p0.E(this));
                Drawable drawable4 = this.C;
                if (getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawable4.setVisible(z10, false);
                this.C.setCallback(this);
                this.C.setAlpha(this.D);
            }
            p0.l0(this);
        }
    }

    public void setStatusBarScrimColor(int i10) {
        setStatusBarScrim(new ColorDrawable(i10));
    }

    public void setStatusBarScrimResource(int i10) {
        setStatusBarScrim(androidx.core.content.a.e(getContext(), i10));
    }

    public void setTitle(CharSequence charSequence) {
        this.f9461x.K0(charSequence);
        r();
    }

    public void setTitleCollapseMode(int i10) {
        this.M = i10;
        boolean l10 = l();
        this.f9461x.z0(l10);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            c((AppBarLayout) parent);
        }
        if (l10 && this.B == null) {
            setContentScrimColor(this.f9462y.d(getResources().getDimension(v6.d.f24663a)));
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        this.f9461x.M0(truncateAt);
    }

    public void setTitleEnabled(boolean z10) {
        if (z10 != this.f9463z) {
            this.f9463z = z10;
            r();
            u();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        this.f9461x.G0(timeInterpolator);
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
        Drawable drawable = this.C;
        if (drawable != null && drawable.isVisible() != z10) {
            this.C.setVisible(z10, false);
        }
        Drawable drawable2 = this.B;
        if (drawable2 != null && drawable2.isVisible() != z10) {
            this.B.setVisible(z10, false);
        }
    }

    final void v() {
        boolean z10;
        if (this.B != null || this.C != null) {
            if (getHeight() + this.L < getScrimVisibleHeightTrigger()) {
                z10 = true;
            } else {
                z10 = false;
            }
            setScrimsShown(z10);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.B && drawable != this.C) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CollapsingToolbarLayout(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.f9461x.i0(colorStateList);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* loaded from: classes3.dex */
    public static class c extends FrameLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        int f9466a;

        /* renamed from: b  reason: collision with root package name */
        float f9467b;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9466a = 0;
            this.f9467b = 0.5f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v6.l.f24990r2);
            this.f9466a = obtainStyledAttributes.getInt(v6.l.f25000s2, 0);
            a(obtainStyledAttributes.getFloat(v6.l.f25010t2, 0.5f));
            obtainStyledAttributes.recycle();
        }

        public void a(float f10) {
            this.f9467b = f10;
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.f9466a = 0;
            this.f9467b = 0.5f;
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f9466a = 0;
            this.f9467b = 0.5f;
        }
    }
}
