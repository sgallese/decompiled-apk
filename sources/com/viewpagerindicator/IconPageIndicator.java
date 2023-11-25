package com.viewpagerindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import pa.b;

/* loaded from: classes4.dex */
public class IconPageIndicator extends HorizontalScrollView implements ViewPager.j {

    /* renamed from: f  reason: collision with root package name */
    private final com.viewpagerindicator.a f12941f;

    /* renamed from: m  reason: collision with root package name */
    private ViewPager f12942m;

    /* renamed from: p  reason: collision with root package name */
    private ViewPager.j f12943p;

    /* renamed from: q  reason: collision with root package name */
    private Runnable f12944q;

    /* renamed from: r  reason: collision with root package name */
    private int f12945r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ View f12946f;

        a(View view) {
            this.f12946f = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            IconPageIndicator.this.smoothScrollTo(this.f12946f.getLeft() - ((IconPageIndicator.this.getWidth() - this.f12946f.getWidth()) / 2), 0);
            IconPageIndicator.this.f12944q = null;
        }
    }

    public IconPageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setHorizontalScrollBarEnabled(false);
        com.viewpagerindicator.a aVar = new com.viewpagerindicator.a(context, b.f21285a);
        this.f12941f = aVar;
        addView(aVar, new FrameLayout.LayoutParams(-2, -1, 17));
    }

    private void b(int i10) {
        View childAt = this.f12941f.getChildAt(i10);
        Runnable runnable = this.f12944q;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f12944q = aVar;
        post(aVar);
    }

    public void c() {
        this.f12941f.removeAllViews();
        pa.a aVar = (pa.a) this.f12942m.getAdapter();
        int count = aVar.getCount();
        for (int i10 = 0; i10 < count; i10++) {
            ImageView imageView = new ImageView(getContext(), null, b.f21285a);
            imageView.setImageResource(aVar.getIconResId(i10));
            this.f12941f.addView(imageView);
        }
        if (this.f12945r > count) {
            this.f12945r = count - 1;
        }
        setCurrentItem(this.f12945r);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f12944q;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f12944q;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void onPageScrollStateChanged(int i10) {
        ViewPager.j jVar = this.f12943p;
        if (jVar != null) {
            jVar.onPageScrollStateChanged(i10);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void onPageScrolled(int i10, float f10, int i11) {
        ViewPager.j jVar = this.f12943p;
        if (jVar != null) {
            jVar.onPageScrolled(i10, f10, i11);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void onPageSelected(int i10) {
        setCurrentItem(i10);
        ViewPager.j jVar = this.f12943p;
        if (jVar != null) {
            jVar.onPageSelected(i10);
        }
    }

    public void setCurrentItem(int i10) {
        boolean z10;
        ViewPager viewPager = this.f12942m;
        if (viewPager != null) {
            this.f12945r = i10;
            viewPager.setCurrentItem(i10);
            int childCount = this.f12941f.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.f12941f.getChildAt(i11);
                if (i11 == i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                childAt.setSelected(z10);
                if (z10) {
                    b(i10);
                }
            }
            return;
        }
        throw new IllegalStateException("ViewPager has not been bound.");
    }

    public void setOnPageChangeListener(ViewPager.j jVar) {
        this.f12943p = jVar;
    }

    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.f12942m;
        if (viewPager2 == viewPager) {
            return;
        }
        if (viewPager2 != null) {
            viewPager2.setOnPageChangeListener(null);
        }
        if (viewPager.getAdapter() != null) {
            this.f12942m = viewPager;
            viewPager.setOnPageChangeListener(this);
            c();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }
}
