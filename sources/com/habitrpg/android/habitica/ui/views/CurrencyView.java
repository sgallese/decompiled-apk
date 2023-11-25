package com.habitrpg.android.habitica.ui.views;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import androidx.appcompat.widget.b0;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.common.habitica.R;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.helpers.NumberAbbreviator;
import qc.q;

/* compiled from: CurrencyView.kt */
/* loaded from: classes4.dex */
public final class CurrencyView extends b0 {
    public static final int $stable = 8;
    private long animationDelay;
    private long animationDuration;
    private String currency;
    private String currencyContentDescription;
    private int decimals;
    private BitmapDrawable drawable;
    private boolean hideWhenEmpty;
    private Bitmap icon;
    private boolean isLocked;
    private boolean lightBackground;
    private int minForAbbrevation;
    private double value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrencyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z10;
        q.i(context, "context");
        this.decimals = 2;
        this.animationDuration = 500L;
        Resources.Theme theme = context.getTheme();
        TypedArray obtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, R.styleable.CurrencyView, 0, 0) : null;
        boolean z11 = !ContextExtensionsKt.isUsingNightModeResources(context);
        if (obtainStyledAttributes != null) {
            try {
                z11 = obtainStyledAttributes.getBoolean(1, z11);
            } catch (ArrayIndexOutOfBoundsException unused) {
                z10 = !ContextExtensionsKt.isUsingNightModeResources(context);
            }
        }
        z10 = z11;
        setLightBackground(z10);
        setCurrency(obtainStyledAttributes != null ? obtainStyledAttributes.getString(0) : null);
        setVisibility(8);
        setSingleLine();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _set_value_$lambda$2(CurrencyView currencyView, ValueAnimator valueAnimator) {
        q.i(currencyView, "this$0");
        q.i(valueAnimator, "it");
        q.g(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Float");
        currencyView.update(((Float) r3).floatValue());
    }

    private final void configureCurrency() {
        if (q.d("gold", this.currency)) {
            setIcon(HabiticaIconsHelper.imageOfGold());
            if (this.lightBackground) {
                setTextColor(androidx.core.content.a.c(getContext(), com.habitrpg.android.habitica.R.color.yellow_1));
            } else {
                setTextColor(androidx.core.content.a.c(getContext(), com.habitrpg.android.habitica.R.color.yellow_100));
            }
        } else if (q.d(NavigationDrawerFragment.SIDEBAR_GEMS, this.currency)) {
            setIcon(HabiticaIconsHelper.imageOfGem());
            if (this.lightBackground) {
                setTextColor(androidx.core.content.a.c(getContext(), com.habitrpg.android.habitica.R.color.green_10));
            } else {
                setTextColor(androidx.core.content.a.c(getContext(), com.habitrpg.android.habitica.R.color.green_50));
            }
        } else if (q.d("hourglasses", this.currency)) {
            setIcon(HabiticaIconsHelper.imageOfHourglass());
            if (this.lightBackground) {
                setTextColor(androidx.core.content.a.c(getContext(), com.habitrpg.android.habitica.R.color.brand_300));
            } else {
                setTextColor(androidx.core.content.a.c(getContext(), com.habitrpg.android.habitica.R.color.brand_500));
            }
        }
        this.hideWhenEmpty = q.d("hourglasses", this.currency);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endUpdate() {
        CharSequence text = getText();
        setContentDescription(((Object) text) + " " + this.currencyContentDescription);
        updateVisibility();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -2;
            setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    private final void setCurrencyContentDescriptionFromCurrency(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 3169028) {
                if (hashCode != 3178592) {
                    if (hashCode == 1959233222 && str.equals("hourglasses")) {
                        this.currencyContentDescription = getContext().getString(com.habitrpg.android.habitica.R.string.mystic_hourglasses);
                        return;
                    }
                } else if (str.equals("gold")) {
                    this.currencyContentDescription = getContext().getString(com.habitrpg.android.habitica.R.string.gold_plural);
                    return;
                }
            } else if (str.equals(NavigationDrawerFragment.SIDEBAR_GEMS)) {
                this.currencyContentDescription = getContext().getString(com.habitrpg.android.habitica.R.string.gems);
                return;
            }
        }
        this.currencyContentDescription = "";
    }

    private final void update(double d10) {
        setText(NumberAbbreviator.INSTANCE.abbreviate(getContext(), d10, this.decimals, this.minForAbbrevation));
    }

    private final void updateVisibility() {
        int i10 = 0;
        if (this.hideWhenEmpty && q.d("0", getText())) {
            i10 = 8;
        }
        setVisibility(i10);
    }

    public final long getAnimationDelay() {
        return this.animationDelay;
    }

    public final long getAnimationDuration() {
        return this.animationDuration;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final int getDecimals() {
        return this.decimals;
    }

    public final boolean getHideWhenEmpty() {
        return this.hideWhenEmpty;
    }

    public final Bitmap getIcon() {
        return this.icon;
    }

    public final boolean getLightBackground() {
        return this.lightBackground;
    }

    public final int getMinForAbbrevation() {
        return this.minForAbbrevation;
    }

    public final double getValue() {
        return this.value;
    }

    public final boolean isLocked() {
        return this.isLocked;
    }

    public final void setAnimationDelay(long j10) {
        this.animationDelay = j10;
    }

    public final void setAnimationDuration(long j10) {
        this.animationDuration = j10;
    }

    public final void setCurrency(String str) {
        this.currency = str;
        setCurrencyContentDescriptionFromCurrency(str);
        configureCurrency();
        updateVisibility();
    }

    public final void setDecimals(int i10) {
        this.decimals = i10;
    }

    public final void setHideWhenEmpty(boolean z10) {
        this.hideWhenEmpty = z10;
    }

    public final void setIcon(Bitmap bitmap) {
        this.icon = bitmap;
        if (bitmap != null) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), bitmap);
            this.drawable = bitmapDrawable;
            setCompoundDrawablesWithIntrinsicBounds(bitmapDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
            setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 6.0f, getContext().getResources().getDisplayMetrics()));
            setGravity(16);
        }
    }

    public final void setLightBackground(boolean z10) {
        this.lightBackground = z10;
        configureCurrency();
    }

    public final void setLocked(boolean z10) {
        this.isLocked = z10;
        if (z10) {
            setTextColor(androidx.core.content.a.c(getContext(), com.habitrpg.android.habitica.R.color.text_quad));
            BitmapDrawable bitmapDrawable = this.drawable;
            if (bitmapDrawable != null) {
                bitmapDrawable.setAlpha(127);
            }
        } else {
            BitmapDrawable bitmapDrawable2 = this.drawable;
            if (bitmapDrawable2 != null) {
                bitmapDrawable2.setAlpha(255);
            }
        }
        setCompoundDrawablesWithIntrinsicBounds(this.drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public final void setMinForAbbrevation(int i10) {
        this.minForAbbrevation = i10;
    }

    public final void setValue(double d10) {
        boolean z10;
        CharSequence text = getText();
        q.h(text, "getText(...)");
        if (text.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && this.animationDuration != 0) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat((float) this.value, (float) d10);
            ofFloat.setDuration(this.animationDuration);
            ofFloat.setStartDelay(this.animationDelay);
            q.f(ofFloat);
            ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.habitrpg.android.habitica.ui.views.CurrencyView$special$$inlined$doOnStart$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    CurrencyView.this.getLayoutParams().width = CurrencyView.this.getWidth();
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }
            });
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.habitrpg.android.habitica.ui.views.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CurrencyView._set_value_$lambda$2(CurrencyView.this, valueAnimator);
                }
            });
            ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.habitrpg.android.habitica.ui.views.CurrencyView$special$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    CurrencyView.this.endUpdate();
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            });
            ofFloat.start();
        } else {
            update(d10);
            endUpdate();
        }
        this.value = d10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrencyView(Context context, String str, boolean z10) {
        super(context);
        q.i(context, "context");
        q.i(str, "currency");
        this.decimals = 2;
        this.animationDuration = 500L;
        setLightBackground(z10);
        setCurrency(str);
        setCurrencyContentDescriptionFromCurrency(str);
        setVisibility(8);
        setSingleLine();
    }
}
