package com.habitrpg.common.habitica.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.habitrpg.common.habitica.R;
import com.habitrpg.common.habitica.databinding.ProgressBarBinding;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.extensions.DataBindingUtils;
import qc.h;
import qc.q;

/* compiled from: HabiticaProgressBar.kt */
/* loaded from: classes4.dex */
public final class HabiticaProgressBar extends FrameLayout {
    private int barBackgroundColor;
    private int barForegroundColor;
    private int barPendingColor;
    private final ProgressBarBinding binding;
    private double currentValue;
    private double maxValue;
    private double pendingValue;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.util.AttributeSet, qc.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HabiticaProgressBar(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            qc.q.i(r3, r0)
            r0 = 0
            r1 = 2
            r2.<init>(r3, r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.common.habitica.views.HabiticaProgressBar.<init>(android.content.Context):void");
    }

    private final void setBarWeight(double d10) {
        View view = this.binding.bar;
        q.h(view, "bar");
        setLayoutWeight(view, d10);
        View view2 = this.binding.emptyBarSpace;
        q.h(view2, "emptyBarSpace");
        setLayoutWeight(view2, 1.0f - d10);
    }

    private final void setLayoutWeight(View view, double d10) {
        LinearLayout.LayoutParams layoutParams;
        boolean z10;
        view.clearAnimation();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        Double d11 = null;
        if (layoutParams2 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        boolean z11 = true;
        if (d10 == 0.0d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (d10 != 1.0d) {
                z11 = false;
            }
            if (!z11) {
                if (layoutParams != null) {
                    d11 = Double.valueOf(layoutParams.weight);
                }
                if (!q.b(d11, d10)) {
                    if (layoutParams != null) {
                        layoutParams.weight = (float) d10;
                    }
                    view.setLayoutParams(layoutParams);
                    return;
                }
                return;
            }
        }
        if (layoutParams != null) {
            layoutParams.weight = (float) d10;
        }
        view.setLayoutParams(layoutParams);
    }

    private final void setPendingBarWeight(double d10) {
        View view = this.binding.pendingBar;
        q.h(view, "pendingBar");
        setLayoutWeight(view, d10);
        View view2 = this.binding.pendingEmptyBarSpace;
        q.h(view2, "pendingEmptyBarSpace");
        setLayoutWeight(view2, 1.0f - d10);
    }

    private final void updateBar() {
        double d10 = this.currentValue - this.pendingValue;
        double d11 = 0.0d;
        if (d10 >= 0.0d) {
            d11 = Math.min(1.0d, d10 / this.maxValue);
        }
        double min = Math.min(1.0d, this.currentValue / this.maxValue);
        setBarWeight(d11);
        setPendingBarWeight(min);
    }

    public final int getBarBackgroundColor() {
        return this.barBackgroundColor;
    }

    public final int getBarForegroundColor() {
        return this.barForegroundColor;
    }

    public final int getBarPendingColor() {
        return this.barPendingColor;
    }

    public final ProgressBarBinding getBinding() {
        return this.binding;
    }

    public final double getCurrentValue() {
        return this.currentValue;
    }

    public final double getMaxValue() {
        return this.maxValue;
    }

    public final double getPendingValue() {
        return this.pendingValue;
    }

    public final void set(double d10, double d11) {
        setCurrentValue(d10);
        setMaxValue(d11);
        updateBar();
    }

    public final void setBarBackgroundColor(int i10) {
        this.barBackgroundColor = i10;
        if (i10 != 0) {
            DataBindingUtils.INSTANCE.setRoundedBackground(this, i10);
        }
    }

    public final void setBarForegroundColor(int i10) {
        this.barForegroundColor = i10;
        DataBindingUtils dataBindingUtils = DataBindingUtils.INSTANCE;
        View view = this.binding.bar;
        q.h(view, "bar");
        dataBindingUtils.setRoundedBackground(view, i10);
    }

    public final void setBarPendingColor(int i10) {
        this.barPendingColor = i10;
        DataBindingUtils dataBindingUtils = DataBindingUtils.INSTANCE;
        View view = this.binding.pendingBar;
        q.h(view, "pendingBar");
        dataBindingUtils.setRoundedBackground(view, i10);
    }

    public final void setCurrentValue(double d10) {
        boolean z10;
        if (this.currentValue == d10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.currentValue = d10;
            updateBar();
        }
    }

    public final void setMaxValue(double d10) {
        boolean z10;
        if (this.maxValue == d10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.maxValue = d10;
            updateBar();
        }
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

    public /* synthetic */ HabiticaProgressBar(Context context, AttributeSet attributeSet, int i10, h hVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HabiticaProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.i(context, "context");
        ProgressBarBinding inflate = ProgressBarBinding.inflate(ContextExtensionsKt.getLayoutInflater(context), this);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
        View.inflate(context, R.layout.progress_bar, this);
        Resources.Theme theme = context.getTheme();
        TypedArray obtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, R.styleable.HabiticaProgressBar, 0, 0) : null;
        setBarForegroundColor(obtainStyledAttributes != null ? obtainStyledAttributes.getColor(R.styleable.HabiticaProgressBar_barForegroundColor, 0) : 0);
        setBarPendingColor(obtainStyledAttributes != null ? obtainStyledAttributes.getColor(R.styleable.HabiticaProgressBar_barPendingColor, 0) : 0);
        setBarBackgroundColor(obtainStyledAttributes != null ? obtainStyledAttributes.getColor(R.styleable.HabiticaProgressBar_barBackgroundColor, 0) : 0);
    }
}
