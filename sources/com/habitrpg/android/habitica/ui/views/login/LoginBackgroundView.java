package com.habitrpg.android.habitica.ui.views.login;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.habitrpg.android.habitica.R;
import ec.b0;
import ec.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import qc.h;
import qc.q;
import vc.f;
import vc.l;

/* compiled from: LoginBackgroundView.kt */
/* loaded from: classes4.dex */
public final class LoginBackgroundView extends RelativeLayout {
    private static final float SIZE_FACTOR = 1.5f;
    private static final int STAR_SIZE = 30;
    private boolean didLayoutStars;
    private ImageView leftCloudView;
    private FrameLayout.LayoutParams params;
    private final Random random;
    private ImageView rightCloudView;
    private List<StarView> starViews;
    private final int viewHeight;
    private int viewWidth;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: LoginBackgroundView.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginBackgroundView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        q.i(context, "context");
        this.random = new Random();
        this.params = new FrameLayout.LayoutParams(0, 0);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = context.getSystemService("window");
        q.g(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        WindowManager windowManager = (WindowManager) systemService;
        if (Build.VERSION.SDK_INT >= 30) {
            currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            bounds = currentWindowMetrics.getBounds();
            this.viewHeight = bounds.height();
            return;
        }
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        this.viewHeight = (int) (displayMetrics.heightPixels * SIZE_FACTOR);
    }

    private final void animateClouds() {
        ImageView imageView = this.leftCloudView;
        ImageView imageView2 = null;
        if (imageView == null) {
            q.z("leftCloudView");
            imageView = null;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(imageView, View.TRANSLATION_Y, 10.0f).setDuration(5000L);
        q.h(duration, "setDuration(...)");
        duration.setRepeatCount(-1);
        duration.setRepeatMode(2);
        duration.start();
        ImageView imageView3 = this.rightCloudView;
        if (imageView3 == null) {
            q.z("rightCloudView");
        } else {
            imageView2 = imageView3;
        }
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(imageView2, View.TRANSLATION_Y, -10.0f).setDuration(8000L);
        q.h(duration2, "setDuration(...)");
        duration2.setRepeatCount(-1);
        duration2.setRepeatMode(2);
        duration2.start();
    }

    private final void generateStar(int i10) {
        List<Integer> l10;
        Context context = getContext();
        q.h(context, "getContext(...)");
        StarView starView = new StarView(context);
        starView.setStarSize(i10);
        if (this.random.nextInt(10) > 2) {
            l10 = t.l(Integer.valueOf(getBlinkDuration()), Integer.valueOf(getBlinkDuration()), Integer.valueOf(getBlinkDuration()));
            starView.setBlinkDurations(l10);
        }
        List<StarView> list = this.starViews;
        if (list != null) {
            list.add(starView);
        }
        if (this.viewWidth > 0 && this.viewHeight > 0) {
            addView(starView, 0, getStarParams());
        } else {
            addView(starView, 0);
        }
    }

    private final void generateStars() {
        generateStars(1, 12, 25);
    }

    private final int getBlinkDuration() {
        return (this.random.nextInt(30) * 800) + 4;
    }

    private final RelativeLayout.LayoutParams getStarParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(30, 30);
        layoutParams.leftMargin = this.random.nextInt(this.viewWidth);
        layoutParams.topMargin = this.random.nextInt(this.viewHeight);
        return layoutParams;
    }

    private final void removeStarViews() {
        int i10;
        List<StarView> list = this.starViews;
        if (list != null) {
            i10 = list.size();
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            List<StarView> list2 = this.starViews;
            if (list2 != null) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    removeView((StarView) it.next());
                }
            }
            List<StarView> list3 = this.starViews;
            if (list3 != null) {
                list3.clear();
            }
        }
    }

    private final void updateStarLayoutParams() {
        if (this.viewWidth > 0 && this.viewHeight > 0 && !this.didLayoutStars) {
            List<StarView> list = this.starViews;
            boolean z10 = false;
            if (list != null && list.size() == 0) {
                z10 = true;
            }
            if (!z10) {
                List<StarView> list2 = this.starViews;
                if (list2 == null) {
                    list2 = t.i();
                }
                Iterator<StarView> it = list2.iterator();
                while (it.hasNext()) {
                    it.next().setLayoutParams(getStarParams());
                }
                this.didLayoutStars = true;
            }
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.left_cloud_view);
        q.h(findViewById, "findViewById(...)");
        this.leftCloudView = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.right_cloud_view);
        q.h(findViewById2, "findViewById(...)");
        this.rightCloudView = (ImageView) findViewById2;
        this.starViews = new ArrayList();
        generateStars();
        animateClouds();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        updateStarLayoutParams();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        this.viewWidth = size;
        setMeasuredDimension(size, this.viewHeight);
        FrameLayout.LayoutParams layoutParams = this.params;
        layoutParams.width = this.viewWidth;
        layoutParams.height = this.viewHeight;
        setLayoutParams(layoutParams);
        super.onMeasure(i10, i11);
    }

    private final void generateStars(int i10, int i11, int i12) {
        f s10;
        int U;
        f s11;
        int U2;
        f s12;
        int U3;
        removeStarViews();
        s10 = l.s(0, i10);
        U = b0.U(s10);
        for (int i13 = 0; i13 < U; i13++) {
            generateStar(2);
        }
        s11 = l.s(0, i11);
        U2 = b0.U(s11);
        for (int i14 = 0; i14 < U2; i14++) {
            generateStar(1);
        }
        s12 = l.s(0, i12);
        U3 = b0.U(s12);
        for (int i15 = 0; i15 < U3; i15++) {
            generateStar(0);
        }
        requestLayout();
    }
}
