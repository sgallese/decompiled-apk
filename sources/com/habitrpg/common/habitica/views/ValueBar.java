package com.habitrpg.common.habitica.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.common.habitica.R;
import com.habitrpg.common.habitica.databinding.ValueBarBinding;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.extensions.IntExtensionsKt;
import java.math.RoundingMode;
import java.text.NumberFormat;
import qc.q;

/* compiled from: ValueBar.kt */
/* loaded from: classes4.dex */
public final class ValueBar extends FrameLayout {
    private long animationDelay;
    private long animationDuration;
    private Integer barHeight;
    private ValueBarBinding binding;
    private String description;
    private final NumberFormat formatter;
    private double pendingValue;
    private String valueSuffix;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValueBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArray;
        int i10;
        int i11;
        int i12;
        Float f10;
        Integer num;
        int i13;
        Drawable drawable;
        q.i(context, "context");
        ValueBarBinding inflate = ValueBarBinding.inflate(ContextExtensionsKt.getLayoutInflater(context), this, true);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
        NumberFormat numberFormat = NumberFormat.getInstance();
        this.formatter = numberFormat;
        this.description = "";
        Resources.Theme theme = context.getTheme();
        if (theme != null) {
            typedArray = theme.obtainStyledAttributes(attributeSet, R.styleable.ValueBar, 0, 0);
        } else {
            typedArray = null;
        }
        HabiticaProgressBar habiticaProgressBar = this.binding.progressBar;
        if (typedArray != null) {
            i10 = typedArray.getColor(R.styleable.ValueBar_barForegroundColor, 0);
        } else {
            i10 = 0;
        }
        habiticaProgressBar.setBarForegroundColor(i10);
        HabiticaProgressBar habiticaProgressBar2 = this.binding.progressBar;
        if (typedArray != null) {
            i11 = typedArray.getColor(R.styleable.ValueBar_barPendingColor, 0);
        } else {
            i11 = 0;
        }
        habiticaProgressBar2.setBarPendingColor(i11);
        HabiticaProgressBar habiticaProgressBar3 = this.binding.progressBar;
        if (typedArray != null) {
            i12 = typedArray.getColor(R.styleable.ValueBar_barBackgroundColor, 0);
        } else {
            i12 = 0;
        }
        habiticaProgressBar3.setBarBackgroundColor(i12);
        if (typedArray != null) {
            f10 = Float.valueOf(typedArray.getDimension(R.styleable.ValueBar_labelSpacing, IntExtensionsKt.dpToPx(2, context)));
        } else {
            f10 = null;
        }
        if (f10 != null) {
            this.binding.labelWrapper.setPadding(0, (int) f10.floatValue(), 0, 0);
        }
        if (typedArray != null) {
            num = Integer.valueOf((int) typedArray.getDimension(R.styleable.ValueBar_barHeight, context.getResources().getDimension(R.dimen.bar_size)));
        } else {
            num = null;
        }
        setBarHeight(num);
        if (typedArray != null) {
            i13 = typedArray.getColor(R.styleable.ValueBar_valueTextColor, 0);
        } else {
            i13 = 0;
        }
        if (i13 != 0) {
            this.binding.valueTextView.setTextColor(i13);
        }
        int color = typedArray != null ? typedArray.getColor(R.styleable.ValueBar_descriptionTextColor, 0) : 0;
        if (color != 0) {
            this.binding.descriptionTextView.setTextColor(color);
        }
        if (typedArray != null) {
            drawable = typedArray.getDrawable(R.styleable.ValueBar_barIconDrawable);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            setIcon(drawable);
        }
        this.binding.descriptionTextView.setText(typedArray != null ? typedArray.getString(R.styleable.ValueBar_description) : null);
        numberFormat.setMaximumFractionDigits(1);
        numberFormat.setRoundingMode(RoundingMode.UP);
        numberFormat.setGroupingUsed(true);
        this.animationDuration = 500L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void set$lambda$0(ValueBar valueBar, ValueAnimator valueAnimator) {
        Integer num;
        double floatValue;
        q.i(valueBar, "this$0");
        q.i(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Integer) {
            num = (Integer) animatedValue;
        } else {
            num = null;
        }
        if (num != null) {
            floatValue = num.intValue();
        } else {
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            q.g(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
            floatValue = ((Float) animatedValue2).floatValue();
        }
        valueBar.setCurrentValue(floatValue);
        valueBar.updateBar();
    }

    private final void updateBar() {
        this.binding.progressBar.set(getCurrentValue(), getMaxValue());
        this.binding.progressBar.setPendingValue(this.pendingValue);
        String format = this.formatter.format(getCurrentValue());
        String format2 = this.formatter.format(Integer.valueOf((int) getMaxValue()));
        String str = this.valueSuffix;
        if (str == null) {
            str = "";
        }
        setValueText(format + " / " + format2 + " " + str);
    }

    public final long getAnimationDelay() {
        return this.animationDelay;
    }

    public final long getAnimationDuration() {
        return this.animationDuration;
    }

    public final int getBarBackgroundColor() {
        return this.binding.progressBar.getBarBackgroundColor();
    }

    public final int getBarForegroundColor() {
        return this.binding.progressBar.getBarForegroundColor();
    }

    public final Integer getBarHeight() {
        return this.barHeight;
    }

    public final int getBarPendingColor() {
        return this.binding.progressBar.getBarPendingColor();
    }

    public final double getCurrentValue() {
        return this.binding.progressBar.getCurrentValue();
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getDescriptionIconVisibility() {
        return this.binding.descriptionIconView.getVisibility();
    }

    public final double getMaxValue() {
        return this.binding.progressBar.getMaxValue();
    }

    public final double getPendingValue() {
        return this.pendingValue;
    }

    public final HabiticaProgressBar getProgressBar() {
        HabiticaProgressBar habiticaProgressBar = this.binding.progressBar;
        q.h(habiticaProgressBar, "progressBar");
        return habiticaProgressBar;
    }

    public final String getValueSuffix() {
        return this.valueSuffix;
    }

    public final void set(double d10, double d11) {
        boolean z10;
        boolean z11;
        ValueAnimator ofInt;
        boolean z12;
        if (this.binding.progressBar.getCurrentValue() == d10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (getMaxValue() == d11) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                return;
            }
        }
        if (this.animationDuration != 0) {
            CharSequence text = this.binding.valueTextView.getText();
            q.h(text, "getText(...)");
            if (text.length() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                if (0.0d < d10 && d10 < 1.0d) {
                    ofInt = ValueAnimator.ofFloat((float) getCurrentValue(), (float) d10);
                } else {
                    ofInt = ValueAnimator.ofInt((int) getCurrentValue(), (int) d10);
                }
                ofInt.setDuration(this.animationDuration);
                ofInt.setStartDelay(this.animationDelay);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.habitrpg.common.habitica.views.a
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ValueBar.set$lambda$0(ValueBar.this, valueAnimator);
                    }
                });
                ofInt.start();
                setMaxValue(d11);
                updateBar();
            }
        }
        setCurrentValue(d10);
        setMaxValue(d11);
        updateBar();
    }

    public final void setAnimationDelay(long j10) {
        this.animationDelay = j10;
    }

    public final void setAnimationDuration(long j10) {
        this.animationDuration = j10;
    }

    public final void setBarBackgroundColor(int i10) {
        this.binding.progressBar.setBarBackgroundColor(i10);
    }

    public final void setBarForegroundColor(int i10) {
        this.binding.progressBar.setBarForegroundColor(i10);
    }

    public final void setBarHeight(Integer num) {
        this.barHeight = num;
        if (num != null) {
            this.binding.progressBar.getLayoutParams().height = num.intValue();
        }
    }

    public final void setBarPendingColor(int i10) {
        this.binding.progressBar.setBarPendingColor(i10);
    }

    public final void setCurrentValue(double d10) {
        this.binding.progressBar.setCurrentValue(d10);
    }

    public final void setDescription(String str) {
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.description = str;
        this.binding.descriptionTextView.setText(str);
    }

    public final void setDescriptionIcon(Drawable drawable) {
        q.i(drawable, "iconRes");
        this.binding.descriptionIconView.setImageDrawable(drawable);
    }

    public final void setDescriptionIconVisibility(int i10) {
        this.binding.descriptionIconView.setVisibility(i10);
    }

    public final void setIcon(Drawable drawable) {
        q.i(drawable, "iconRes");
        this.binding.iconView.setImageDrawable(drawable);
        this.binding.iconView.setVisibility(0);
    }

    public final void setLabelVisibility(int i10) {
        this.binding.valueTextView.setVisibility(i10);
        this.binding.descriptionTextView.setVisibility(i10);
    }

    public final void setMaxValue(double d10) {
        this.binding.progressBar.setMaxValue(d10);
    }

    public final void setPendingValue(double d10) {
        boolean z10;
        if (this.pendingValue == d10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.pendingValue = d10;
            updateBar();
        }
    }

    public final void setSecondaryIcon(Drawable drawable) {
        q.i(drawable, "iconRes");
        this.binding.secondaryIconView.setImageDrawable(drawable);
        this.binding.secondaryIconView.setVisibility(0);
    }

    public final void setValueSuffix(String str) {
        this.valueSuffix = str;
    }

    public final void setValueText(String str) {
        q.i(str, "valueText");
        this.binding.valueTextView.setText(str);
    }

    public final void setDescriptionIcon(Bitmap bitmap) {
        q.i(bitmap, "bitmap");
        this.binding.descriptionIconView.setImageBitmap(bitmap);
    }

    public final void setIcon(Bitmap bitmap) {
        q.i(bitmap, "bitmap");
        this.binding.iconView.setImageBitmap(bitmap);
        this.binding.iconView.setVisibility(0);
    }

    public final void setSecondaryIcon(Bitmap bitmap) {
        q.i(bitmap, "bitmap");
        this.binding.secondaryIconView.setImageBitmap(bitmap);
        this.binding.secondaryIconView.setVisibility(0);
    }
}
