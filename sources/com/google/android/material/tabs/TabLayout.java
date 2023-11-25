package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.l1;
import androidx.core.view.accessibility.n0;
import androidx.core.view.l0;
import androidx.core.view.p0;
import androidx.core.view.s;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.material.internal.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import v6.k;

@ViewPager.e
/* loaded from: classes3.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: n0  reason: collision with root package name */
    private static final int f10374n0 = k.f24803m;

    /* renamed from: o0  reason: collision with root package name */
    private static final androidx.core.util.f<g> f10375o0 = new androidx.core.util.h(16);
    ColorStateList A;
    Drawable B;
    private int C;
    PorterDuff.Mode D;
    float E;
    float F;
    float G;
    final int H;
    int I;
    private final int J;
    private final int K;
    private final int L;
    private int M;
    int N;
    int O;
    int P;
    int Q;
    boolean R;
    boolean S;
    int T;
    int U;
    boolean V;
    private com.google.android.material.tabs.c W;

    /* renamed from: a0  reason: collision with root package name */
    private final TimeInterpolator f10376a0;

    /* renamed from: b0  reason: collision with root package name */
    private c f10377b0;

    /* renamed from: c0  reason: collision with root package name */
    private final ArrayList<c> f10378c0;

    /* renamed from: d0  reason: collision with root package name */
    private c f10379d0;

    /* renamed from: e0  reason: collision with root package name */
    private ValueAnimator f10380e0;

    /* renamed from: f  reason: collision with root package name */
    int f10381f;

    /* renamed from: f0  reason: collision with root package name */
    ViewPager f10382f0;

    /* renamed from: g0  reason: collision with root package name */
    private androidx.viewpager.widget.a f10383g0;

    /* renamed from: h0  reason: collision with root package name */
    private DataSetObserver f10384h0;

    /* renamed from: i0  reason: collision with root package name */
    private h f10385i0;

    /* renamed from: j0  reason: collision with root package name */
    private b f10386j0;

    /* renamed from: k0  reason: collision with root package name */
    private boolean f10387k0;

    /* renamed from: l0  reason: collision with root package name */
    private int f10388l0;

    /* renamed from: m  reason: collision with root package name */
    private final ArrayList<g> f10389m;

    /* renamed from: m0  reason: collision with root package name */
    private final androidx.core.util.f<i> f10390m0;

    /* renamed from: p  reason: collision with root package name */
    private g f10391p;

    /* renamed from: q  reason: collision with root package name */
    final f f10392q;

    /* renamed from: r  reason: collision with root package name */
    int f10393r;

    /* renamed from: s  reason: collision with root package name */
    int f10394s;

    /* renamed from: t  reason: collision with root package name */
    int f10395t;

    /* renamed from: u  reason: collision with root package name */
    int f10396u;

    /* renamed from: v  reason: collision with root package name */
    private final int f10397v;

    /* renamed from: w  reason: collision with root package name */
    private final int f10398w;

    /* renamed from: x  reason: collision with root package name */
    private int f10399x;

    /* renamed from: y  reason: collision with root package name */
    ColorStateList f10400y;

    /* renamed from: z  reason: collision with root package name */
    ColorStateList f10401z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class b implements ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        private boolean f10403a;

        b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f10382f0 == viewPager) {
                tabLayout.M(aVar2, this.f10403a);
            }
        }

        void b(boolean z10) {
            this.f10403a = z10;
        }
    }

    @Deprecated
    /* loaded from: classes3.dex */
    public interface c<T extends g> {
        void onTabReselected(T t10);

        void onTabSelected(T t10);

        void onTabUnselected(T t10);
    }

    /* loaded from: classes3.dex */
    public interface d extends c<g> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class e extends DataSetObserver {
        e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.F();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.F();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f extends LinearLayout {

        /* renamed from: f  reason: collision with root package name */
        ValueAnimator f10406f;

        /* renamed from: m  reason: collision with root package name */
        private int f10407m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ View f10409a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ View f10410b;

            a(View view, View view2) {
                this.f10409a = view;
                this.f10410b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.this.j(this.f10409a, this.f10410b, valueAnimator.getAnimatedFraction());
            }
        }

        f(Context context) {
            super(context);
            this.f10407m = -1;
            setWillNotDraw(false);
        }

        private void e() {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f10381f == -1) {
                tabLayout.f10381f = tabLayout.getSelectedTabPosition();
            }
            f(TabLayout.this.f10381f);
        }

        private void f(int i10) {
            if (TabLayout.this.f10388l0 != 0 && (TabLayout.this.getTabSelectedIndicator().getBounds().left != -1 || TabLayout.this.getTabSelectedIndicator().getBounds().right != -1)) {
                return;
            }
            View childAt = getChildAt(i10);
            com.google.android.material.tabs.c cVar = TabLayout.this.W;
            TabLayout tabLayout = TabLayout.this;
            cVar.c(tabLayout, childAt, tabLayout.B);
            TabLayout.this.f10381f = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g() {
            f(TabLayout.this.getSelectedTabPosition());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(View view, View view2, float f10) {
            boolean z10;
            if (view != null && view.getWidth() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                com.google.android.material.tabs.c cVar = TabLayout.this.W;
                TabLayout tabLayout = TabLayout.this;
                cVar.d(tabLayout, view, view2, f10, tabLayout.B);
            } else {
                Drawable drawable = TabLayout.this.B;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.B.getBounds().bottom);
            }
            p0.l0(this);
        }

        private void k(boolean z10, int i10, int i11) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f10381f == i10) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i10);
            if (childAt2 == null) {
                g();
                return;
            }
            TabLayout.this.f10381f = i10;
            a aVar = new a(childAt, childAt2);
            if (z10) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f10406f = valueAnimator;
                valueAnimator.setInterpolator(TabLayout.this.f10376a0);
                valueAnimator.setDuration(i11);
                valueAnimator.setFloatValues(0.0f, 1.0f);
                valueAnimator.addUpdateListener(aVar);
                valueAnimator.start();
                return;
            }
            this.f10406f.removeAllUpdateListeners();
            this.f10406f.addUpdateListener(aVar);
        }

        void c(int i10, int i11) {
            ValueAnimator valueAnimator = this.f10406f;
            if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.f10381f != i10) {
                this.f10406f.cancel();
            }
            k(true, i10, i11);
        }

        boolean d() {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (getChildAt(i10).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int height;
            int height2 = TabLayout.this.B.getBounds().height();
            if (height2 < 0) {
                height2 = TabLayout.this.B.getIntrinsicHeight();
            }
            int i10 = TabLayout.this.P;
            if (i10 != 0) {
                if (i10 != 1) {
                    height = 0;
                    if (i10 != 2) {
                        if (i10 != 3) {
                            height2 = 0;
                        } else {
                            height2 = getHeight();
                        }
                    }
                } else {
                    height = (getHeight() - height2) / 2;
                    height2 = (getHeight() + height2) / 2;
                }
            } else {
                height = getHeight() - height2;
                height2 = getHeight();
            }
            if (TabLayout.this.B.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.B.getBounds();
                TabLayout.this.B.setBounds(bounds.left, height, bounds.right, height2);
                TabLayout.this.B.draw(canvas);
            }
            super.draw(canvas);
        }

        void h(int i10, float f10) {
            TabLayout.this.f10381f = Math.round(i10 + f10);
            ValueAnimator valueAnimator = this.f10406f;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f10406f.cancel();
            }
            j(getChildAt(i10), getChildAt(i10 + 1), f10);
        }

        void i(int i10) {
            Rect bounds = TabLayout.this.B.getBounds();
            TabLayout.this.B.setBounds(bounds.left, 0, bounds.right, i10);
            requestLayout();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            ValueAnimator valueAnimator = this.f10406f;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                k(false, TabLayout.this.getSelectedTabPosition(), -1);
            } else {
                e();
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (View.MeasureSpec.getMode(i10) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z10 = true;
            if (tabLayout.N == 1 || tabLayout.Q == 2) {
                int childCount = getChildCount();
                int i12 = 0;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = getChildAt(i13);
                    if (childAt.getVisibility() == 0) {
                        i12 = Math.max(i12, childAt.getMeasuredWidth());
                    }
                }
                if (i12 <= 0) {
                    return;
                }
                if (i12 * childCount <= getMeasuredWidth() - (((int) r.c(getContext(), 16)) * 2)) {
                    boolean z11 = false;
                    for (int i14 = 0; i14 < childCount; i14++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i14).getLayoutParams();
                        if (layoutParams.width != i12 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i12;
                            layoutParams.weight = 0.0f;
                            z11 = true;
                        }
                    }
                    z10 = z11;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.N = 0;
                    tabLayout2.U(false);
                }
                if (z10) {
                    super.onMeasure(i10, i11);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i10) {
            super.onRtlPropertiesChanged(i10);
            if (Build.VERSION.SDK_INT < 23 && this.f10407m != i10) {
                requestLayout();
                this.f10407m = i10;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        private Object f10412a;

        /* renamed from: b  reason: collision with root package name */
        private Drawable f10413b;

        /* renamed from: c  reason: collision with root package name */
        private CharSequence f10414c;

        /* renamed from: d  reason: collision with root package name */
        private CharSequence f10415d;

        /* renamed from: f  reason: collision with root package name */
        private View f10417f;

        /* renamed from: h  reason: collision with root package name */
        public TabLayout f10419h;

        /* renamed from: i  reason: collision with root package name */
        public i f10420i;

        /* renamed from: e  reason: collision with root package name */
        private int f10416e = -1;

        /* renamed from: g  reason: collision with root package name */
        private int f10418g = 1;

        /* renamed from: j  reason: collision with root package name */
        private int f10421j = -1;

        public View e() {
            return this.f10417f;
        }

        public Drawable f() {
            return this.f10413b;
        }

        public int g() {
            return this.f10416e;
        }

        public int h() {
            return this.f10418g;
        }

        public CharSequence i() {
            return this.f10414c;
        }

        public boolean j() {
            TabLayout tabLayout = this.f10419h;
            if (tabLayout != null) {
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                if (selectedTabPosition != -1 && selectedTabPosition == this.f10416e) {
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        void k() {
            this.f10419h = null;
            this.f10420i = null;
            this.f10412a = null;
            this.f10413b = null;
            this.f10421j = -1;
            this.f10414c = null;
            this.f10415d = null;
            this.f10416e = -1;
            this.f10417f = null;
        }

        public void l() {
            TabLayout tabLayout = this.f10419h;
            if (tabLayout != null) {
                tabLayout.K(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public g m(CharSequence charSequence) {
            this.f10415d = charSequence;
            t();
            return this;
        }

        public g n(int i10) {
            return o(LayoutInflater.from(this.f10420i.getContext()).inflate(i10, (ViewGroup) this.f10420i, false));
        }

        public g o(View view) {
            this.f10417f = view;
            t();
            return this;
        }

        public g p(Drawable drawable) {
            this.f10413b = drawable;
            TabLayout tabLayout = this.f10419h;
            if (tabLayout.N == 1 || tabLayout.Q == 2) {
                tabLayout.U(true);
            }
            t();
            if (com.google.android.material.badge.b.f9552a && this.f10420i.l() && this.f10420i.f10429r.isVisible()) {
                this.f10420i.invalidate();
            }
            return this;
        }

        void q(int i10) {
            this.f10416e = i10;
        }

        public g r(int i10) {
            TabLayout tabLayout = this.f10419h;
            if (tabLayout != null) {
                return s(tabLayout.getResources().getText(i10));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public g s(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f10415d) && !TextUtils.isEmpty(charSequence)) {
                this.f10420i.setContentDescription(charSequence);
            }
            this.f10414c = charSequence;
            t();
            return this;
        }

        void t() {
            i iVar = this.f10420i;
            if (iVar != null) {
                iVar.t();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class h implements ViewPager.j {

        /* renamed from: f  reason: collision with root package name */
        private final WeakReference<TabLayout> f10422f;

        /* renamed from: m  reason: collision with root package name */
        private int f10423m;

        /* renamed from: p  reason: collision with root package name */
        private int f10424p;

        public h(TabLayout tabLayout) {
            this.f10422f = new WeakReference<>(tabLayout);
        }

        void a() {
            this.f10424p = 0;
            this.f10423m = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i10) {
            this.f10423m = this.f10424p;
            this.f10424p = i10;
            TabLayout tabLayout = this.f10422f.get();
            if (tabLayout != null) {
                tabLayout.V(this.f10424p);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i10, float f10, int i11) {
            boolean z10;
            boolean z11;
            TabLayout tabLayout = this.f10422f.get();
            if (tabLayout != null) {
                int i12 = this.f10424p;
                if (i12 == 2 && this.f10423m != 1) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (i12 == 2 && this.f10423m == 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                tabLayout.P(i10, f10, z10, z11, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i10) {
            boolean z10;
            TabLayout tabLayout = this.f10422f.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i10 && i10 < tabLayout.getTabCount()) {
                int i11 = this.f10424p;
                if (i11 != 0 && (i11 != 2 || this.f10423m != 0)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                tabLayout.L(tabLayout.B(i10), z10);
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class i extends LinearLayout {

        /* renamed from: f  reason: collision with root package name */
        private g f10425f;

        /* renamed from: m  reason: collision with root package name */
        private TextView f10426m;

        /* renamed from: p  reason: collision with root package name */
        private ImageView f10427p;

        /* renamed from: q  reason: collision with root package name */
        private View f10428q;

        /* renamed from: r  reason: collision with root package name */
        private com.google.android.material.badge.a f10429r;

        /* renamed from: s  reason: collision with root package name */
        private View f10430s;

        /* renamed from: t  reason: collision with root package name */
        private TextView f10431t;

        /* renamed from: u  reason: collision with root package name */
        private ImageView f10432u;

        /* renamed from: v  reason: collision with root package name */
        private Drawable f10433v;

        /* renamed from: w  reason: collision with root package name */
        private int f10434w;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class a implements View.OnLayoutChangeListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ View f10436a;

            a(View view) {
                this.f10436a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                if (this.f10436a.getVisibility() == 0) {
                    i.this.s(this.f10436a);
                }
            }
        }

        public i(Context context) {
            super(context);
            this.f10434w = 2;
            u(context);
            p0.K0(this, TabLayout.this.f10393r, TabLayout.this.f10394s, TabLayout.this.f10395t, TabLayout.this.f10396u);
            setGravity(17);
            setOrientation(!TabLayout.this.R ? 1 : 0);
            setClickable(true);
            p0.L0(this, l0.b(getContext(), CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE));
        }

        private void f(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new a(view));
        }

        private float g(Layout layout, int i10, float f10) {
            return layout.getLineWidth(i10) * (f10 / layout.getPaint().getTextSize());
        }

        private com.google.android.material.badge.a getBadge() {
            return this.f10429r;
        }

        private com.google.android.material.badge.a getOrCreateBadge() {
            if (this.f10429r == null) {
                this.f10429r = com.google.android.material.badge.a.c(getContext());
            }
            r();
            com.google.android.material.badge.a aVar = this.f10429r;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        private void h(boolean z10) {
            setClipChildren(z10);
            setClipToPadding(z10);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z10);
                viewGroup.setClipToPadding(z10);
            }
        }

        private FrameLayout i() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(Canvas canvas) {
            Drawable drawable = this.f10433v;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f10433v.draw(canvas);
            }
        }

        private FrameLayout k(View view) {
            if ((view != this.f10427p && view != this.f10426m) || !com.google.android.material.badge.b.f9552a) {
                return null;
            }
            return (FrameLayout) view.getParent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean l() {
            if (this.f10429r != null) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void m() {
            FrameLayout frameLayout;
            if (com.google.android.material.badge.b.f9552a) {
                frameLayout = i();
                addView(frameLayout, 0);
            } else {
                frameLayout = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(v6.h.f24743c, (ViewGroup) frameLayout, false);
            this.f10427p = imageView;
            frameLayout.addView(imageView, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void n() {
            FrameLayout frameLayout;
            if (com.google.android.material.badge.b.f9552a) {
                frameLayout = i();
                addView(frameLayout);
            } else {
                frameLayout = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(v6.h.f24744d, (ViewGroup) frameLayout, false);
            this.f10426m = textView;
            frameLayout.addView(textView);
        }

        private void p(View view) {
            if (l() && view != null) {
                h(false);
                com.google.android.material.badge.b.a(this.f10429r, view, k(view));
                this.f10428q = view;
            }
        }

        private void q() {
            if (!l()) {
                return;
            }
            h(true);
            View view = this.f10428q;
            if (view != null) {
                com.google.android.material.badge.b.b(this.f10429r, view);
                this.f10428q = null;
            }
        }

        private void r() {
            g gVar;
            g gVar2;
            if (!l()) {
                return;
            }
            if (this.f10430s != null) {
                q();
            } else if (this.f10427p != null && (gVar2 = this.f10425f) != null && gVar2.f() != null) {
                View view = this.f10428q;
                ImageView imageView = this.f10427p;
                if (view != imageView) {
                    q();
                    p(this.f10427p);
                    return;
                }
                s(imageView);
            } else if (this.f10426m != null && (gVar = this.f10425f) != null && gVar.h() == 1) {
                View view2 = this.f10428q;
                TextView textView = this.f10426m;
                if (view2 != textView) {
                    q();
                    p(this.f10426m);
                    return;
                }
                s(textView);
            } else {
                q();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(View view) {
            if (l() && view == this.f10428q) {
                com.google.android.material.badge.b.c(this.f10429r, view, k(view));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        public void u(Context context) {
            int i10 = TabLayout.this.H;
            GradientDrawable gradientDrawable = null;
            if (i10 != 0) {
                Drawable b10 = h.a.b(context, i10);
                this.f10433v = b10;
                if (b10 != null && b10.isStateful()) {
                    this.f10433v.setState(getDrawableState());
                }
            } else {
                this.f10433v = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            if (TabLayout.this.A != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList a10 = n7.b.a(TabLayout.this.A);
                boolean z10 = TabLayout.this.V;
                if (z10) {
                    gradientDrawable2 = null;
                }
                if (!z10) {
                    gradientDrawable = gradientDrawable3;
                }
                gradientDrawable2 = new RippleDrawable(a10, gradientDrawable2, gradientDrawable);
            }
            p0.y0(this, gradientDrawable2);
            TabLayout.this.invalidate();
        }

        private void x(TextView textView, ImageView imageView, boolean z10) {
            Drawable drawable;
            CharSequence charSequence;
            int i10;
            CharSequence charSequence2;
            int i11;
            g gVar = this.f10425f;
            CharSequence charSequence3 = null;
            if (gVar != null && gVar.f() != null) {
                drawable = androidx.core.graphics.drawable.a.r(this.f10425f.f()).mutate();
            } else {
                drawable = null;
            }
            if (drawable != null) {
                androidx.core.graphics.drawable.a.o(drawable, TabLayout.this.f10401z);
                PorterDuff.Mode mode = TabLayout.this.D;
                if (mode != null) {
                    androidx.core.graphics.drawable.a.p(drawable, mode);
                }
            }
            g gVar2 = this.f10425f;
            if (gVar2 != null) {
                charSequence = gVar2.i();
            } else {
                charSequence = null;
            }
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z11 = true;
            boolean z12 = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (!z12 || this.f10425f.f10418g != 1) {
                    z11 = false;
                }
                if (z12) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                textView.setText(charSequence2);
                if (z11) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                textView.setVisibility(i11);
                if (z12) {
                    setVisibility(0);
                }
            } else {
                z11 = false;
            }
            if (z10 && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (z11 && imageView.getVisibility() == 0) {
                    i10 = (int) r.c(getContext(), 8);
                } else {
                    i10 = 0;
                }
                if (TabLayout.this.R) {
                    if (i10 != s.a(marginLayoutParams)) {
                        s.c(marginLayoutParams, i10);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (i10 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i10;
                    s.c(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            g gVar3 = this.f10425f;
            if (gVar3 != null) {
                charSequence3 = gVar3.f10415d;
            }
            if (Build.VERSION.SDK_INT > 23) {
                if (!z12) {
                    charSequence = charSequence3;
                }
                l1.a(this, charSequence);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f10433v;
            boolean z10 = false;
            if (drawable != null && drawable.isStateful()) {
                z10 = false | this.f10433v.setState(drawableState);
            }
            if (z10) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int getContentHeight() {
            View[] viewArr = {this.f10426m, this.f10427p, this.f10430s};
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < 3; i12++) {
                View view = viewArr[i12];
                if (view != null && view.getVisibility() == 0) {
                    if (z10) {
                        i11 = Math.min(i11, view.getTop());
                    } else {
                        i11 = view.getTop();
                    }
                    if (z10) {
                        i10 = Math.max(i10, view.getBottom());
                    } else {
                        i10 = view.getBottom();
                    }
                    z10 = true;
                }
            }
            return i10 - i11;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int getContentWidth() {
            View[] viewArr = {this.f10426m, this.f10427p, this.f10430s};
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < 3; i12++) {
                View view = viewArr[i12];
                if (view != null && view.getVisibility() == 0) {
                    if (z10) {
                        i11 = Math.min(i11, view.getLeft());
                    } else {
                        i11 = view.getLeft();
                    }
                    if (z10) {
                        i10 = Math.max(i10, view.getRight());
                    } else {
                        i10 = view.getRight();
                    }
                    z10 = true;
                }
            }
            return i10 - i11;
        }

        public g getTab() {
            return this.f10425f;
        }

        void o() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            com.google.android.material.badge.a aVar = this.f10429r;
            if (aVar != null && aVar.isVisible()) {
                accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.f10429r.f()));
            }
            n0 e12 = n0.e1(accessibilityNodeInfo);
            e12.q0(n0.g.a(0, 1, this.f10425f.g(), 1, false, isSelected()));
            if (isSelected()) {
                e12.o0(false);
                e12.f0(n0.a.f4081i);
            }
            e12.N0(getResources().getString(v6.j.f24772h));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i10 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.I, RecyclerView.UNDEFINED_DURATION);
            }
            super.onMeasure(i10, i11);
            if (this.f10426m != null) {
                float f10 = TabLayout.this.E;
                int i12 = this.f10434w;
                ImageView imageView = this.f10427p;
                boolean z10 = true;
                if (imageView != null && imageView.getVisibility() == 0) {
                    i12 = 1;
                } else {
                    TextView textView = this.f10426m;
                    if (textView != null && textView.getLineCount() > 1) {
                        f10 = TabLayout.this.G;
                    }
                }
                float textSize = this.f10426m.getTextSize();
                int lineCount = this.f10426m.getLineCount();
                int d10 = androidx.core.widget.j.d(this.f10426m);
                if (f10 != textSize || (d10 >= 0 && i12 != d10)) {
                    if (TabLayout.this.Q == 1 && f10 > textSize && lineCount == 1 && ((layout = this.f10426m.getLayout()) == null || g(layout, 0, f10) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        z10 = false;
                    }
                    if (z10) {
                        this.f10426m.setTextSize(0, f10);
                        this.f10426m.setMaxLines(i12);
                        super.onMeasure(i10, i11);
                    }
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f10425f != null) {
                if (!performClick) {
                    playSoundEffect(0);
                }
                this.f10425f.l();
                return true;
            }
            return performClick;
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            if (isSelected() != z10) {
            }
            super.setSelected(z10);
            TextView textView = this.f10426m;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.f10427p;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.f10430s;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        void setTab(g gVar) {
            if (gVar != this.f10425f) {
                this.f10425f = gVar;
                t();
            }
        }

        final void t() {
            boolean z10;
            w();
            g gVar = this.f10425f;
            if (gVar != null && gVar.j()) {
                z10 = true;
            } else {
                z10 = false;
            }
            setSelected(z10);
        }

        final void v() {
            setOrientation(!TabLayout.this.R ? 1 : 0);
            TextView textView = this.f10431t;
            if (textView == null && this.f10432u == null) {
                x(this.f10426m, this.f10427p, true);
            } else {
                x(textView, this.f10432u, false);
            }
        }

        final void w() {
            View view;
            ViewParent parent;
            g gVar = this.f10425f;
            if (gVar != null) {
                view = gVar.e();
            } else {
                view = null;
            }
            if (view != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(view);
                    }
                    View view2 = this.f10430s;
                    if (view2 != null && (parent = view2.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f10430s);
                    }
                    addView(view);
                }
                this.f10430s = view;
                TextView textView = this.f10426m;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f10427p;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f10427p.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.f10431t = textView2;
                if (textView2 != null) {
                    this.f10434w = androidx.core.widget.j.d(textView2);
                }
                this.f10432u = (ImageView) view.findViewById(16908294);
            } else {
                View view3 = this.f10430s;
                if (view3 != null) {
                    removeView(view3);
                    this.f10430s = null;
                }
                this.f10431t = null;
                this.f10432u = null;
            }
            if (this.f10430s == null) {
                if (this.f10427p == null) {
                    m();
                }
                if (this.f10426m == null) {
                    n();
                    this.f10434w = androidx.core.widget.j.d(this.f10426m);
                }
                androidx.core.widget.j.o(this.f10426m, TabLayout.this.f10397v);
                if (isSelected() && TabLayout.this.f10399x != -1) {
                    androidx.core.widget.j.o(this.f10426m, TabLayout.this.f10399x);
                } else {
                    androidx.core.widget.j.o(this.f10426m, TabLayout.this.f10398w);
                }
                ColorStateList colorStateList = TabLayout.this.f10400y;
                if (colorStateList != null) {
                    this.f10426m.setTextColor(colorStateList);
                }
                x(this.f10426m, this.f10427p, true);
                r();
                f(this.f10427p);
                f(this.f10426m);
            } else {
                TextView textView3 = this.f10431t;
                if (textView3 != null || this.f10432u != null) {
                    x(textView3, this.f10432u, false);
                }
            }
            if (gVar != null && !TextUtils.isEmpty(gVar.f10415d)) {
                setContentDescription(gVar.f10415d);
            }
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, v6.b.f24627c0);
    }

    private void A() {
        if (this.f10380e0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f10380e0 = valueAnimator;
            valueAnimator.setInterpolator(this.f10376a0);
            this.f10380e0.setDuration(this.O);
            this.f10380e0.addUpdateListener(new a());
        }
    }

    private boolean C() {
        if (getTabMode() != 0 && getTabMode() != 2) {
            return false;
        }
        return true;
    }

    private void J(int i10) {
        i iVar = (i) this.f10392q.getChildAt(i10);
        this.f10392q.removeViewAt(i10);
        if (iVar != null) {
            iVar.o();
            this.f10390m0.a(iVar);
        }
        requestLayout();
    }

    private void R(ViewPager viewPager, boolean z10, boolean z11) {
        ViewPager viewPager2 = this.f10382f0;
        if (viewPager2 != null) {
            h hVar = this.f10385i0;
            if (hVar != null) {
                viewPager2.removeOnPageChangeListener(hVar);
            }
            b bVar = this.f10386j0;
            if (bVar != null) {
                this.f10382f0.removeOnAdapterChangeListener(bVar);
            }
        }
        c cVar = this.f10379d0;
        if (cVar != null) {
            I(cVar);
            this.f10379d0 = null;
        }
        if (viewPager != null) {
            this.f10382f0 = viewPager;
            if (this.f10385i0 == null) {
                this.f10385i0 = new h(this);
            }
            this.f10385i0.a();
            viewPager.addOnPageChangeListener(this.f10385i0);
            j jVar = new j(viewPager);
            this.f10379d0 = jVar;
            g(jVar);
            androidx.viewpager.widget.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                M(adapter, z10);
            }
            if (this.f10386j0 == null) {
                this.f10386j0 = new b();
            }
            this.f10386j0.b(z10);
            viewPager.addOnAdapterChangeListener(this.f10386j0);
            N(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f10382f0 = null;
            M(null, false);
        }
        this.f10387k0 = z11;
    }

    private void S() {
        int size = this.f10389m.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f10389m.get(i10).t();
        }
    }

    private void T(LinearLayout.LayoutParams layoutParams) {
        if (this.Q == 1 && this.N == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    private int getDefaultHeight() {
        int size = this.f10389m.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                g gVar = this.f10389m.get(i10);
                if (gVar != null && gVar.f() != null && !TextUtils.isEmpty(gVar.i())) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        if (z10 && !this.R) {
            return 72;
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i10 = this.J;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.Q;
        if (i11 != 0 && i11 != 2) {
            return 0;
        }
        return this.L;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f10392q.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void l(com.google.android.material.tabs.d dVar) {
        g E = E();
        CharSequence charSequence = dVar.f10439f;
        if (charSequence != null) {
            E.s(charSequence);
        }
        Drawable drawable = dVar.f10440m;
        if (drawable != null) {
            E.p(drawable);
        }
        int i10 = dVar.f10441p;
        if (i10 != 0) {
            E.n(i10);
        }
        if (!TextUtils.isEmpty(dVar.getContentDescription())) {
            E.m(dVar.getContentDescription());
        }
        i(E);
    }

    private void m(g gVar) {
        i iVar = gVar.f10420i;
        iVar.setSelected(false);
        iVar.setActivated(false);
        this.f10392q.addView(iVar, gVar.g(), u());
    }

    private void n(View view) {
        if (view instanceof com.google.android.material.tabs.d) {
            l((com.google.android.material.tabs.d) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void o(int i10) {
        if (i10 == -1) {
            return;
        }
        if (getWindowToken() != null && p0.Y(this) && !this.f10392q.d()) {
            int scrollX = getScrollX();
            int r10 = r(i10, 0.0f);
            if (scrollX != r10) {
                A();
                this.f10380e0.setIntValues(scrollX, r10);
                this.f10380e0.start();
            }
            this.f10392q.c(i10, this.O);
            return;
        }
        N(i10, 0.0f, true);
    }

    private void p(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
            } else {
                this.f10392q.setGravity(1);
                return;
            }
        } else {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        }
        this.f10392q.setGravity(8388611);
    }

    private void q() {
        int max;
        int i10 = this.Q;
        if (i10 != 0 && i10 != 2) {
            max = 0;
        } else {
            max = Math.max(0, this.M - this.f10393r);
        }
        p0.K0(this.f10392q, max, 0, 0, 0);
        int i11 = this.Q;
        if (i11 != 0) {
            if (i11 == 1 || i11 == 2) {
                if (this.N == 2) {
                    Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
                }
                this.f10392q.setGravity(1);
            }
        } else {
            p(this.N);
        }
        U(true);
    }

    private int r(int i10, float f10) {
        View childAt;
        View view;
        int i11 = this.Q;
        int i12 = 0;
        if ((i11 != 0 && i11 != 2) || (childAt = this.f10392q.getChildAt(i10)) == null) {
            return 0;
        }
        int i13 = i10 + 1;
        if (i13 < this.f10392q.getChildCount()) {
            view = this.f10392q.getChildAt(i13);
        } else {
            view = null;
        }
        int width = childAt.getWidth();
        if (view != null) {
            i12 = view.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i14 = (int) ((width + i12) * 0.5f * f10);
        if (p0.E(this) == 0) {
            return left + i14;
        }
        return left - i14;
    }

    private void s(g gVar, int i10) {
        gVar.q(i10);
        this.f10389m.add(i10, gVar);
        int size = this.f10389m.size();
        int i11 = -1;
        for (int i12 = i10 + 1; i12 < size; i12++) {
            if (this.f10389m.get(i12).g() == this.f10381f) {
                i11 = i12;
            }
            this.f10389m.get(i12).q(i12);
        }
        this.f10381f = i11;
    }

    private void setSelectedTabView(int i10) {
        boolean z10;
        boolean z11;
        int childCount = this.f10392q.getChildCount();
        if (i10 < childCount) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.f10392q.getChildAt(i11);
                boolean z12 = true;
                if ((i11 == i10 && !childAt.isSelected()) || (i11 != i10 && childAt.isSelected())) {
                    if (i11 == i10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    childAt.setSelected(z11);
                    if (i11 != i10) {
                        z12 = false;
                    }
                    childAt.setActivated(z12);
                    if (childAt instanceof i) {
                        ((i) childAt).w();
                    }
                } else {
                    if (i11 == i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    childAt.setSelected(z10);
                    if (i11 != i10) {
                        z12 = false;
                    }
                    childAt.setActivated(z12);
                }
            }
        }
    }

    private static ColorStateList t(int i10, int i11) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i11, i10});
    }

    private LinearLayout.LayoutParams u() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        T(layoutParams);
        return layoutParams;
    }

    private i w(g gVar) {
        i iVar;
        androidx.core.util.f<i> fVar = this.f10390m0;
        if (fVar != null) {
            iVar = fVar.b();
        } else {
            iVar = null;
        }
        if (iVar == null) {
            iVar = new i(getContext());
        }
        iVar.setTab(gVar);
        iVar.setFocusable(true);
        iVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.f10415d)) {
            iVar.setContentDescription(gVar.f10414c);
        } else {
            iVar.setContentDescription(gVar.f10415d);
        }
        return iVar;
    }

    private void x(g gVar) {
        for (int size = this.f10378c0.size() - 1; size >= 0; size--) {
            this.f10378c0.get(size).onTabReselected(gVar);
        }
    }

    private void y(g gVar) {
        for (int size = this.f10378c0.size() - 1; size >= 0; size--) {
            this.f10378c0.get(size).onTabSelected(gVar);
        }
    }

    private void z(g gVar) {
        for (int size = this.f10378c0.size() - 1; size >= 0; size--) {
            this.f10378c0.get(size).onTabUnselected(gVar);
        }
    }

    public g B(int i10) {
        if (i10 >= 0 && i10 < getTabCount()) {
            return this.f10389m.get(i10);
        }
        return null;
    }

    public boolean D() {
        return this.S;
    }

    public g E() {
        g v10 = v();
        v10.f10419h = this;
        v10.f10420i = w(v10);
        if (v10.f10421j != -1) {
            v10.f10420i.setId(v10.f10421j);
        }
        return v10;
    }

    void F() {
        int currentItem;
        H();
        androidx.viewpager.widget.a aVar = this.f10383g0;
        if (aVar != null) {
            int count = aVar.getCount();
            for (int i10 = 0; i10 < count; i10++) {
                k(E().s(this.f10383g0.getPageTitle(i10)), false);
            }
            ViewPager viewPager = this.f10382f0;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                K(B(currentItem));
            }
        }
    }

    protected boolean G(g gVar) {
        return f10375o0.a(gVar);
    }

    public void H() {
        for (int childCount = this.f10392q.getChildCount() - 1; childCount >= 0; childCount--) {
            J(childCount);
        }
        Iterator<g> it = this.f10389m.iterator();
        while (it.hasNext()) {
            g next = it.next();
            it.remove();
            next.k();
            G(next);
        }
        this.f10391p = null;
    }

    @Deprecated
    public void I(c cVar) {
        this.f10378c0.remove(cVar);
    }

    public void K(g gVar) {
        L(gVar, true);
    }

    public void L(g gVar, boolean z10) {
        int i10;
        g gVar2 = this.f10391p;
        if (gVar2 == gVar) {
            if (gVar2 != null) {
                x(gVar);
                o(gVar.g());
                return;
            }
            return;
        }
        if (gVar != null) {
            i10 = gVar.g();
        } else {
            i10 = -1;
        }
        if (z10) {
            if ((gVar2 == null || gVar2.g() == -1) && i10 != -1) {
                N(i10, 0.0f, true);
            } else {
                o(i10);
            }
            if (i10 != -1) {
                setSelectedTabView(i10);
            }
        }
        this.f10391p = gVar;
        if (gVar2 != null && gVar2.f10419h != null) {
            z(gVar2);
        }
        if (gVar != null) {
            y(gVar);
        }
    }

    void M(androidx.viewpager.widget.a aVar, boolean z10) {
        DataSetObserver dataSetObserver;
        androidx.viewpager.widget.a aVar2 = this.f10383g0;
        if (aVar2 != null && (dataSetObserver = this.f10384h0) != null) {
            aVar2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f10383g0 = aVar;
        if (z10 && aVar != null) {
            if (this.f10384h0 == null) {
                this.f10384h0 = new e();
            }
            aVar.registerDataSetObserver(this.f10384h0);
        }
        F();
    }

    public void N(int i10, float f10, boolean z10) {
        O(i10, f10, z10, true);
    }

    public void O(int i10, float f10, boolean z10, boolean z11) {
        P(i10, f10, z10, z11, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P(int i10, float f10, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        int round = Math.round(i10 + f10);
        if (round >= 0 && round < this.f10392q.getChildCount()) {
            if (z11) {
                this.f10392q.h(i10, f10);
            }
            ValueAnimator valueAnimator = this.f10380e0;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f10380e0.cancel();
            }
            int r10 = r(i10, f10);
            int scrollX = getScrollX();
            if ((i10 < getSelectedTabPosition() && r10 >= scrollX) || ((i10 > getSelectedTabPosition() && r10 <= scrollX) || i10 == getSelectedTabPosition())) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (p0.E(this) == 1) {
                if ((i10 < getSelectedTabPosition() && r10 <= scrollX) || ((i10 > getSelectedTabPosition() && r10 >= scrollX) || i10 == getSelectedTabPosition())) {
                    z13 = true;
                } else {
                    z13 = false;
                }
            }
            if (z13 || this.f10388l0 == 1 || z12) {
                if (i10 < 0) {
                    r10 = 0;
                }
                scrollTo(r10, 0);
            }
            if (z10) {
                setSelectedTabView(round);
            }
        }
    }

    public void Q(ViewPager viewPager, boolean z10) {
        R(viewPager, z10, false);
    }

    void U(boolean z10) {
        for (int i10 = 0; i10 < this.f10392q.getChildCount(); i10++) {
            View childAt = this.f10392q.getChildAt(i10);
            childAt.setMinimumWidth(getTabMinWidth());
            T((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z10) {
                childAt.requestLayout();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V(int i10) {
        this.f10388l0 = i10;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        n(view);
    }

    @Deprecated
    public void g(c cVar) {
        if (!this.f10378c0.contains(cVar)) {
            this.f10378c0.add(cVar);
        }
    }

    public int getSelectedTabPosition() {
        g gVar = this.f10391p;
        if (gVar != null) {
            return gVar.g();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f10389m.size();
    }

    public int getTabGravity() {
        return this.N;
    }

    public ColorStateList getTabIconTint() {
        return this.f10401z;
    }

    public int getTabIndicatorAnimationMode() {
        return this.U;
    }

    public int getTabIndicatorGravity() {
        return this.P;
    }

    int getTabMaxWidth() {
        return this.I;
    }

    public int getTabMode() {
        return this.Q;
    }

    public ColorStateList getTabRippleColor() {
        return this.A;
    }

    public Drawable getTabSelectedIndicator() {
        return this.B;
    }

    public ColorStateList getTabTextColors() {
        return this.f10400y;
    }

    public void h(d dVar) {
        g(dVar);
    }

    public void i(g gVar) {
        k(gVar, this.f10389m.isEmpty());
    }

    public void j(g gVar, int i10, boolean z10) {
        if (gVar.f10419h == this) {
            s(gVar, i10);
            m(gVar);
            if (z10) {
                gVar.l();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public void k(g gVar, boolean z10) {
        j(gVar, this.f10389m.size(), z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        p7.h.e(this);
        if (this.f10382f0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                R((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f10387k0) {
            setupWithViewPager(null);
            this.f10387k0 = false;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        for (int i10 = 0; i10 < this.f10392q.getChildCount(); i10++) {
            View childAt = this.f10392q.getChildAt(i10);
            if (childAt instanceof i) {
                ((i) childAt).j(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        n0.e1(accessibilityNodeInfo).p0(n0.f.a(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (C() && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r0 != 2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L29;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.r.c(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.K
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.r.c(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.I = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Lad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.Q
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto L8d
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L8d
        L80:
            r4 = 1
            goto L8d
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L8d
            goto L80
        L8d:
            if (r4 == 0) goto Lad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 8 && !C()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        p7.h.d(this, f10);
    }

    public void setInlineLabel(boolean z10) {
        if (this.R != z10) {
            this.R = z10;
            for (int i10 = 0; i10 < this.f10392q.getChildCount(); i10++) {
                View childAt = this.f10392q.getChildAt(i10);
                if (childAt instanceof i) {
                    ((i) childAt).v();
                }
            }
            q();
        }
    }

    public void setInlineLabelResource(int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        A();
        this.f10380e0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
        this.B = mutate;
        f7.d.g(mutate, this.C);
        int i10 = this.T;
        if (i10 == -1) {
            i10 = this.B.getIntrinsicHeight();
        }
        this.f10392q.i(i10);
    }

    public void setSelectedTabIndicatorColor(int i10) {
        this.C = i10;
        f7.d.g(this.B, i10);
        U(false);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.P != i10) {
            this.P = i10;
            p0.l0(this.f10392q);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.T = i10;
        this.f10392q.i(i10);
    }

    public void setTabGravity(int i10) {
        if (this.N != i10) {
            this.N = i10;
            q();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f10401z != colorStateList) {
            this.f10401z = colorStateList;
            S();
        }
    }

    public void setTabIconTintResource(int i10) {
        setTabIconTint(h.a.a(getContext(), i10));
    }

    public void setTabIndicatorAnimationMode(int i10) {
        this.U = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    this.W = new com.google.android.material.tabs.b();
                    return;
                }
                throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
            }
            this.W = new com.google.android.material.tabs.a();
            return;
        }
        this.W = new com.google.android.material.tabs.c();
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.S = z10;
        this.f10392q.g();
        p0.l0(this.f10392q);
    }

    public void setTabMode(int i10) {
        if (i10 != this.Q) {
            this.Q = i10;
            q();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            for (int i10 = 0; i10 < this.f10392q.getChildCount(); i10++) {
                View childAt = this.f10392q.getChildAt(i10);
                if (childAt instanceof i) {
                    ((i) childAt).u(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i10) {
        setTabRippleColor(h.a.a(getContext(), i10));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f10400y != colorStateList) {
            this.f10400y = colorStateList;
            S();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(androidx.viewpager.widget.a aVar) {
        M(aVar, false);
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.V != z10) {
            this.V = z10;
            for (int i10 = 0; i10 < this.f10392q.getChildCount(); i10++) {
                View childAt = this.f10392q.getChildAt(i10);
                if (childAt instanceof i) {
                    ((i) childAt).u(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        Q(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    protected g v() {
        g b10 = f10375o0.b();
        if (b10 == null) {
            return new g();
        }
        return b10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TabLayout(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10) {
        n(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.f10377b0;
        if (cVar2 != null) {
            I(cVar2);
        }
        this.f10377b0 = cVar;
        if (cVar != null) {
            g(cVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        n(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        n(view);
    }

    public void setSelectedTabIndicator(int i10) {
        if (i10 != 0) {
            setSelectedTabIndicator(h.a.b(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    /* loaded from: classes3.dex */
    public static class j implements d {

        /* renamed from: a  reason: collision with root package name */
        private final ViewPager f10438a;

        public j(ViewPager viewPager) {
            this.f10438a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabSelected(g gVar) {
            this.f10438a.setCurrentItem(gVar.g());
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabReselected(g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabUnselected(g gVar) {
        }
    }
}
