package androidx.appcompat.widget;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.r0;

/* compiled from: ScrollingTabContainerView.java */
/* loaded from: classes.dex */
public class z0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: w  reason: collision with root package name */
    private static final Interpolator f1723w = new DecelerateInterpolator();

    /* renamed from: f  reason: collision with root package name */
    Runnable f1724f;

    /* renamed from: m  reason: collision with root package name */
    private c f1725m;

    /* renamed from: p  reason: collision with root package name */
    r0 f1726p;

    /* renamed from: q  reason: collision with root package name */
    private Spinner f1727q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f1728r;

    /* renamed from: s  reason: collision with root package name */
    int f1729s;

    /* renamed from: t  reason: collision with root package name */
    int f1730t;

    /* renamed from: u  reason: collision with root package name */
    private int f1731u;

    /* renamed from: v  reason: collision with root package name */
    private int f1732v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScrollingTabContainerView.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ View f1733f;

        a(View view) {
            this.f1733f = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            z0.this.smoothScrollTo(this.f1733f.getLeft() - ((z0.this.getWidth() - this.f1733f.getWidth()) / 2), 0);
            z0.this.f1724f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ScrollingTabContainerView.java */
    /* loaded from: classes.dex */
    public class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return z0.this.f1726p.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            return ((d) z0.this.f1726p.getChildAt(i10)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                return z0.this.c((a.c) getItem(i10), true);
            }
            ((d) view).a((a.c) getItem(i10));
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ScrollingTabContainerView.java */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z10;
            ((d) view).b().e();
            int childCount = z0.this.f1726p.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = z0.this.f1726p.getChildAt(i10);
                if (childAt == view) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                childAt.setSelected(z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ScrollingTabContainerView.java */
    /* loaded from: classes.dex */
    public class d extends LinearLayout {

        /* renamed from: f  reason: collision with root package name */
        private final int[] f1737f;

        /* renamed from: m  reason: collision with root package name */
        private a.c f1738m;

        /* renamed from: p  reason: collision with root package name */
        private TextView f1739p;

        /* renamed from: q  reason: collision with root package name */
        private ImageView f1740q;

        /* renamed from: r  reason: collision with root package name */
        private View f1741r;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public d(android.content.Context r4, androidx.appcompat.app.a.c r5, boolean r6) {
            /*
                r2 = this;
                androidx.appcompat.widget.z0.this = r3
                int r3 = g.a.f15693d
                r0 = 0
                r2.<init>(r4, r0, r3)
                r1 = 16842964(0x10100d4, float:2.3694152E-38)
                int[] r1 = new int[]{r1}
                r2.f1737f = r1
                r2.f1738m = r5
                r5 = 0
                androidx.appcompat.widget.g1 r3 = androidx.appcompat.widget.g1.v(r4, r0, r1, r3, r5)
                boolean r4 = r3.s(r5)
                if (r4 == 0) goto L25
                android.graphics.drawable.Drawable r4 = r3.g(r5)
                r2.setBackgroundDrawable(r4)
            L25:
                r3.w()
                if (r6 == 0) goto L30
                r3 = 8388627(0x800013, float:1.175497E-38)
                r2.setGravity(r3)
            L30:
                r2.c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.z0.d.<init>(androidx.appcompat.widget.z0, android.content.Context, androidx.appcompat.app.a$c, boolean):void");
        }

        public void a(a.c cVar) {
            this.f1738m = cVar;
            c();
        }

        public a.c b() {
            return this.f1738m;
        }

        public void c() {
            a.c cVar = this.f1738m;
            View b10 = cVar.b();
            CharSequence charSequence = null;
            if (b10 != null) {
                ViewParent parent = b10.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b10);
                    }
                    addView(b10);
                }
                this.f1741r = b10;
                TextView textView = this.f1739p;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1740q;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1740q.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1741r;
            if (view != null) {
                removeView(view);
                this.f1741r = null;
            }
            Drawable c10 = cVar.c();
            CharSequence d10 = cVar.d();
            if (c10 != null) {
                if (this.f1740q == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f1740q = appCompatImageView;
                }
                this.f1740q.setImageDrawable(c10);
                this.f1740q.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1740q;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1740q.setImageDrawable(null);
                }
            }
            boolean z10 = !TextUtils.isEmpty(d10);
            if (z10) {
                if (this.f1739p == null) {
                    b0 b0Var = new b0(getContext(), null, g.a.f15694e);
                    b0Var.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    b0Var.setLayoutParams(layoutParams2);
                    addView(b0Var);
                    this.f1739p = b0Var;
                }
                this.f1739p.setText(d10);
                this.f1739p.setVisibility(0);
            } else {
                TextView textView2 = this.f1739p;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1739p.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1740q;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            if (!z10) {
                charSequence = cVar.a();
            }
            l1.a(this, charSequence);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (z0.this.f1729s > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = z0.this.f1729s;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            boolean z11;
            if (isSelected() != z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            super.setSelected(z10);
            if (z11 && z10) {
                sendAccessibilityEvent(4);
            }
        }
    }

    private Spinner b() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, g.a.f15697h);
        appCompatSpinner.setLayoutParams(new r0.a(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    private boolean d() {
        Spinner spinner = this.f1727q;
        if (spinner != null && spinner.getParent() == this) {
            return true;
        }
        return false;
    }

    private void e() {
        if (d()) {
            return;
        }
        if (this.f1727q == null) {
            this.f1727q = b();
        }
        removeView(this.f1726p);
        addView(this.f1727q, new ViewGroup.LayoutParams(-2, -1));
        if (this.f1727q.getAdapter() == null) {
            this.f1727q.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f1724f;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f1724f = null;
        }
        this.f1727q.setSelection(this.f1732v);
    }

    private boolean f() {
        if (!d()) {
            return false;
        }
        removeView(this.f1727q);
        addView(this.f1726p, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1727q.getSelectedItemPosition());
        return false;
    }

    public void a(int i10) {
        View childAt = this.f1726p.getChildAt(i10);
        Runnable runnable = this.f1724f;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f1724f = aVar;
        post(aVar);
    }

    d c(a.c cVar, boolean z10) {
        d dVar = new d(getContext(), cVar, z10);
        if (z10) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1731u));
        } else {
            dVar.setFocusable(true);
            if (this.f1725m == null) {
                this.f1725m = new c();
            }
            dVar.setOnClickListener(this.f1725m);
        }
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1724f;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.view.a b10 = androidx.appcompat.view.a.b(getContext());
        setContentHeight(b10.f());
        this.f1730t = b10.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1724f;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        ((d) view).b().e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z10;
        int mode = View.MeasureSpec.getMode(i10);
        boolean z11 = true;
        if (mode == 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        setFillViewport(z10);
        int childCount = this.f1726p.getChildCount();
        if (childCount > 1 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            if (childCount > 2) {
                this.f1729s = (int) (View.MeasureSpec.getSize(i10) * 0.4f);
            } else {
                this.f1729s = View.MeasureSpec.getSize(i10) / 2;
            }
            this.f1729s = Math.min(this.f1729s, this.f1730t);
        } else {
            this.f1729s = -1;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1731u, 1073741824);
        if (z10 || !this.f1728r) {
            z11 = false;
        }
        if (z11) {
            this.f1726p.measure(0, makeMeasureSpec);
            if (this.f1726p.getMeasuredWidth() > View.MeasureSpec.getSize(i10)) {
                e();
            } else {
                f();
            }
        } else {
            f();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i10, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z10 && measuredWidth != measuredWidth2) {
            setTabSelected(this.f1732v);
        }
    }

    public void setAllowCollapse(boolean z10) {
        this.f1728r = z10;
    }

    public void setContentHeight(int i10) {
        this.f1731u = i10;
        requestLayout();
    }

    public void setTabSelected(int i10) {
        boolean z10;
        this.f1732v = i10;
        int childCount = this.f1726p.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = this.f1726p.getChildAt(i11);
            if (i11 == i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            childAt.setSelected(z10);
            if (z10) {
                a(i10);
            }
        }
        Spinner spinner = this.f1727q;
        if (spinner != null && i10 >= 0) {
            spinner.setSelection(i10);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
