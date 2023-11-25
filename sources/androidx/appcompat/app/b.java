package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

/* compiled from: ActionBarDrawerToggle.java */
/* loaded from: classes.dex */
public class b implements DrawerLayout.e {
    private final InterfaceC0011b mActivityImpl;
    private final int mCloseDrawerContentDescRes;
    boolean mDrawerIndicatorEnabled;
    private final DrawerLayout mDrawerLayout;
    private boolean mDrawerSlideAnimationEnabled;
    private boolean mHasCustomUpIndicator;
    private Drawable mHomeAsUpIndicator;
    private final int mOpenDrawerContentDescRes;
    private i.d mSlider;
    View.OnClickListener mToolbarNavigationClickListener;
    private boolean mWarnedForDisplayHomeAsUp;

    /* compiled from: ActionBarDrawerToggle.java */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b bVar = b.this;
            if (bVar.mDrawerIndicatorEnabled) {
                bVar.toggle();
                return;
            }
            View.OnClickListener onClickListener = bVar.mToolbarNavigationClickListener;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* compiled from: ActionBarDrawerToggle.java */
    /* renamed from: androidx.appcompat.app.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0011b {
        boolean a();

        Context b();

        void c(Drawable drawable, int i10);

        Drawable d();

        void e(int i10);
    }

    /* compiled from: ActionBarDrawerToggle.java */
    /* loaded from: classes.dex */
    public interface c {
        InterfaceC0011b getDrawerToggleDelegate();
    }

    /* compiled from: ActionBarDrawerToggle.java */
    /* loaded from: classes.dex */
    private static class d implements InterfaceC0011b {

        /* renamed from: a  reason: collision with root package name */
        private final Activity f765a;

        /* compiled from: ActionBarDrawerToggle.java */
        /* loaded from: classes.dex */
        static class a {
            static void a(ActionBar actionBar, int i10) {
                actionBar.setHomeActionContentDescription(i10);
            }

            static void b(ActionBar actionBar, Drawable drawable) {
                actionBar.setHomeAsUpIndicator(drawable);
            }
        }

        d(Activity activity) {
            this.f765a = activity;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0011b
        public boolean a() {
            ActionBar actionBar = this.f765a.getActionBar();
            if (actionBar != null && (actionBar.getDisplayOptions() & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0011b
        public Context b() {
            ActionBar actionBar = this.f765a.getActionBar();
            if (actionBar != null) {
                return actionBar.getThemedContext();
            }
            return this.f765a;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0011b
        public void c(Drawable drawable, int i10) {
            ActionBar actionBar = this.f765a.getActionBar();
            if (actionBar != null) {
                a.b(actionBar, drawable);
                a.a(actionBar, i10);
            }
        }

        @Override // androidx.appcompat.app.b.InterfaceC0011b
        public Drawable d() {
            TypedArray obtainStyledAttributes = b().obtainStyledAttributes(null, new int[]{16843531}, 16843470, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0011b
        public void e(int i10) {
            ActionBar actionBar = this.f765a.getActionBar();
            if (actionBar != null) {
                a.a(actionBar, i10);
            }
        }
    }

    /* compiled from: ActionBarDrawerToggle.java */
    /* loaded from: classes.dex */
    static class e implements InterfaceC0011b {

        /* renamed from: a  reason: collision with root package name */
        final Toolbar f766a;

        /* renamed from: b  reason: collision with root package name */
        final Drawable f767b;

        /* renamed from: c  reason: collision with root package name */
        final CharSequence f768c;

        e(Toolbar toolbar) {
            this.f766a = toolbar;
            this.f767b = toolbar.getNavigationIcon();
            this.f768c = toolbar.getNavigationContentDescription();
        }

        @Override // androidx.appcompat.app.b.InterfaceC0011b
        public boolean a() {
            return true;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0011b
        public Context b() {
            return this.f766a.getContext();
        }

        @Override // androidx.appcompat.app.b.InterfaceC0011b
        public void c(Drawable drawable, int i10) {
            this.f766a.setNavigationIcon(drawable);
            e(i10);
        }

        @Override // androidx.appcompat.app.b.InterfaceC0011b
        public Drawable d() {
            return this.f767b;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0011b
        public void e(int i10) {
            if (i10 == 0) {
                this.f766a.setNavigationContentDescription(this.f768c);
            } else {
                this.f766a.setNavigationContentDescription(i10);
            }
        }
    }

    public b(Activity activity, DrawerLayout drawerLayout, int i10, int i11) {
        this(activity, null, drawerLayout, null, i10, i11);
    }

    private void setPosition(float f10) {
        if (f10 == 1.0f) {
            this.mSlider.f(true);
        } else if (f10 == 0.0f) {
            this.mSlider.f(false);
        }
        this.mSlider.setProgress(f10);
    }

    public i.d getDrawerArrowDrawable() {
        return this.mSlider;
    }

    Drawable getThemeUpIndicator() {
        return this.mActivityImpl.d();
    }

    public View.OnClickListener getToolbarNavigationClickListener() {
        return this.mToolbarNavigationClickListener;
    }

    public boolean isDrawerIndicatorEnabled() {
        return this.mDrawerIndicatorEnabled;
    }

    public boolean isDrawerSlideAnimationEnabled() {
        return this.mDrawerSlideAnimationEnabled;
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (!this.mHasCustomUpIndicator) {
            this.mHomeAsUpIndicator = getThemeUpIndicator();
        }
        syncState();
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void onDrawerClosed(View view) {
        setPosition(0.0f);
        if (this.mDrawerIndicatorEnabled) {
            setActionBarDescription(this.mOpenDrawerContentDescRes);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void onDrawerOpened(View view) {
        setPosition(1.0f);
        if (this.mDrawerIndicatorEnabled) {
            setActionBarDescription(this.mCloseDrawerContentDescRes);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void onDrawerSlide(View view, float f10) {
        if (this.mDrawerSlideAnimationEnabled) {
            setPosition(Math.min(1.0f, Math.max(0.0f, f10)));
        } else {
            setPosition(0.0f);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem != null && menuItem.getItemId() == 16908332 && this.mDrawerIndicatorEnabled) {
            toggle();
            return true;
        }
        return false;
    }

    void setActionBarDescription(int i10) {
        this.mActivityImpl.e(i10);
    }

    void setActionBarUpIndicator(Drawable drawable, int i10) {
        if (!this.mWarnedForDisplayHomeAsUp && !this.mActivityImpl.a()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.mWarnedForDisplayHomeAsUp = true;
        }
        this.mActivityImpl.c(drawable, i10);
    }

    public void setDrawerArrowDrawable(i.d dVar) {
        this.mSlider = dVar;
        syncState();
    }

    public void setDrawerIndicatorEnabled(boolean z10) {
        int i10;
        if (z10 != this.mDrawerIndicatorEnabled) {
            if (z10) {
                i.d dVar = this.mSlider;
                if (this.mDrawerLayout.C(8388611)) {
                    i10 = this.mCloseDrawerContentDescRes;
                } else {
                    i10 = this.mOpenDrawerContentDescRes;
                }
                setActionBarUpIndicator(dVar, i10);
            } else {
                setActionBarUpIndicator(this.mHomeAsUpIndicator, 0);
            }
            this.mDrawerIndicatorEnabled = z10;
        }
    }

    public void setDrawerSlideAnimationEnabled(boolean z10) {
        this.mDrawerSlideAnimationEnabled = z10;
        if (!z10) {
            setPosition(0.0f);
        }
    }

    public void setHomeAsUpIndicator(Drawable drawable) {
        if (drawable == null) {
            this.mHomeAsUpIndicator = getThemeUpIndicator();
            this.mHasCustomUpIndicator = false;
        } else {
            this.mHomeAsUpIndicator = drawable;
            this.mHasCustomUpIndicator = true;
        }
        if (this.mDrawerIndicatorEnabled) {
            return;
        }
        setActionBarUpIndicator(this.mHomeAsUpIndicator, 0);
    }

    public void setToolbarNavigationClickListener(View.OnClickListener onClickListener) {
        this.mToolbarNavigationClickListener = onClickListener;
    }

    public void syncState() {
        int i10;
        if (this.mDrawerLayout.C(8388611)) {
            setPosition(1.0f);
        } else {
            setPosition(0.0f);
        }
        if (this.mDrawerIndicatorEnabled) {
            i.d dVar = this.mSlider;
            if (this.mDrawerLayout.C(8388611)) {
                i10 = this.mCloseDrawerContentDescRes;
            } else {
                i10 = this.mOpenDrawerContentDescRes;
            }
            setActionBarUpIndicator(dVar, i10);
        }
    }

    void toggle() {
        int q10 = this.mDrawerLayout.q(8388611);
        if (this.mDrawerLayout.F(8388611) && q10 != 2) {
            this.mDrawerLayout.d(8388611);
        } else if (q10 != 1) {
            this.mDrawerLayout.K(8388611);
        }
    }

    public b(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i10, int i11) {
        this(activity, toolbar, drawerLayout, null, i10, i11);
    }

    b(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, i.d dVar, int i10, int i11) {
        this.mDrawerSlideAnimationEnabled = true;
        this.mDrawerIndicatorEnabled = true;
        this.mWarnedForDisplayHomeAsUp = false;
        if (toolbar != null) {
            this.mActivityImpl = new e(toolbar);
            toolbar.setNavigationOnClickListener(new a());
        } else if (activity instanceof c) {
            this.mActivityImpl = ((c) activity).getDrawerToggleDelegate();
        } else {
            this.mActivityImpl = new d(activity);
        }
        this.mDrawerLayout = drawerLayout;
        this.mOpenDrawerContentDescRes = i10;
        this.mCloseDrawerContentDescRes = i11;
        if (dVar == null) {
            this.mSlider = new i.d(this.mActivityImpl.b());
        } else {
            this.mSlider = dVar;
        }
        this.mHomeAsUpIndicator = getThemeUpIndicator();
    }

    public void setHomeAsUpIndicator(int i10) {
        setHomeAsUpIndicator(i10 != 0 ? this.mDrawerLayout.getResources().getDrawable(i10) : null);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void onDrawerStateChanged(int i10) {
    }
}
