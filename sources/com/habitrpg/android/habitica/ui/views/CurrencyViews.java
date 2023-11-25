package com.habitrpg.android.habitica.ui.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import qc.q;

/* compiled from: CurrencyViews.kt */
/* loaded from: classes4.dex */
public final class CurrencyViews extends LinearLayout {
    public static final int $stable = 8;
    private final CurrencyView gemTextView;
    private final CurrencyView goldTextView;
    private final CurrencyView hourglassTextView;
    private boolean lightBackground;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrencyViews(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.i(context, "context");
        Context context2 = getContext();
        q.h(context2, "getContext(...)");
        this.hourglassTextView = new CurrencyView(context2, "hourglasses", this.lightBackground);
        Context context3 = getContext();
        q.h(context3, "getContext(...)");
        this.goldTextView = new CurrencyView(context3, "gold", this.lightBackground);
        Context context4 = getContext();
        q.h(context4, "getContext(...)");
        this.gemTextView = new CurrencyView(context4, NavigationDrawerFragment.SIDEBAR_GEMS, this.lightBackground);
        Resources.Theme theme = context.getTheme();
        TypedArray obtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, R.styleable.CurrencyViews, 0, 0) : null;
        setupViews();
        boolean z10 = !ContextExtensionsKt.isUsingNightModeResources(context);
        setLightBackground(obtainStyledAttributes != null ? obtainStyledAttributes.getBoolean(0, z10) : z10);
    }

    private final void setupView(CurrencyView currencyView, int i10) {
        LinearLayout.LayoutParams layoutParams;
        addView(currencyView);
        currencyView.setTextSize(12.0f);
        ViewGroup.LayoutParams layoutParams2 = currencyView.getLayoutParams();
        if (layoutParams2 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.setMarginStart(i10);
        }
        currencyView.setLayoutParams(layoutParams);
    }

    private final void setupViews() {
        int applyDimension = (int) TypedValue.applyDimension(1, 12.0f, getContext().getResources().getDisplayMetrics());
        setupView(this.hourglassTextView, applyDimension);
        setupView(this.goldTextView, applyDimension);
        setupView(this.gemTextView, applyDimension);
    }

    public final int getGemVisibility() {
        return this.gemTextView.getVisibility();
    }

    public final double getGems() {
        return this.gemTextView.getValue();
    }

    public final double getGold() {
        return this.goldTextView.getValue();
    }

    public final int getGoldVisibility() {
        return this.goldTextView.getVisibility();
    }

    public final int getHourglassVisibility() {
        return this.hourglassTextView.getVisibility();
    }

    public final double getHourglasses() {
        return this.hourglassTextView.getValue();
    }

    public final boolean getLightBackground() {
        return this.lightBackground;
    }

    public final void setGemVisibility(int i10) {
        this.gemTextView.setVisibility(i10);
    }

    public final void setGems(double d10) {
        this.gemTextView.setValue(d10);
    }

    public final void setGold(double d10) {
        this.goldTextView.setValue(d10);
    }

    public final void setGoldVisibility(int i10) {
        this.goldTextView.setVisibility(i10);
    }

    public final void setHourglassVisibility(int i10) {
        this.hourglassTextView.setVisibility(i10);
        this.hourglassTextView.setHideWhenEmpty(false);
    }

    public final void setHourglasses(double d10) {
        this.hourglassTextView.setValue(d10);
    }

    public final void setLightBackground(boolean z10) {
        this.lightBackground = z10;
        this.hourglassTextView.setLightBackground(z10);
        this.gemTextView.setLightBackground(z10);
        this.goldTextView.setLightBackground(z10);
    }

    public CurrencyViews(Context context) {
        super(context);
        Context context2 = getContext();
        q.h(context2, "getContext(...)");
        this.hourglassTextView = new CurrencyView(context2, "hourglasses", this.lightBackground);
        Context context3 = getContext();
        q.h(context3, "getContext(...)");
        this.goldTextView = new CurrencyView(context3, "gold", this.lightBackground);
        Context context4 = getContext();
        q.h(context4, "getContext(...)");
        this.gemTextView = new CurrencyView(context4, NavigationDrawerFragment.SIDEBAR_GEMS, this.lightBackground);
        setupViews();
    }
}
