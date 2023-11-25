package com.habitrpg.android.habitica.ui.views.stats;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatEditText;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.StatsSliderViewBinding;
import com.habitrpg.android.habitica.extensions.AfterChangeTextWatcher;
import com.habitrpg.android.habitica.extensions.AttributeSetExtentionsKt;
import com.habitrpg.android.habitica.extensions.DrawableExtendsionsKt;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: StatsSliderView.kt */
/* loaded from: classes4.dex */
public final class StatsSliderView extends LinearLayout {
    public static final int $stable = 8;
    private l<? super Integer, w> allocateAction;
    private final StatsSliderViewBinding binding;
    private int currentValue;
    private int maxValue;
    private int previousValue;

    /* compiled from: StatsSliderView.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.views.stats.StatsSliderView$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    static final class AnonymousClass1 extends r implements l<Editable, w> {
        AnonymousClass1() {
            super(1);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(Editable editable) {
            invoke2(editable);
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Editable editable) {
            int i10;
            try {
                i10 = Integer.parseInt(String.valueOf(editable));
            } catch (NumberFormatException unused) {
                i10 = 0;
            }
            if (i10 != StatsSliderView.this.getCurrentValue() && i10 <= StatsSliderView.this.getMaxValue() && i10 > 0) {
                StatsSliderView.this.setCurrentValue(i10);
                l<Integer, w> allocateAction = StatsSliderView.this.getAllocateAction();
                if (allocateAction != null) {
                    allocateAction.invoke(Integer.valueOf(StatsSliderView.this.getCurrentValue()));
                }
            } else if (i10 > StatsSliderView.this.getMaxValue() || i10 < 0) {
                StatsSliderView.this.binding.valueEditText.setText(String.valueOf(StatsSliderView.this.getCurrentValue()));
                StatsSliderView.this.binding.valueEditText.setSelection(StatsSliderView.this.binding.valueEditText.length());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsSliderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArray;
        q.i(context, "context");
        StatsSliderViewBinding inflate = StatsSliderViewBinding.inflate(ContextExtensionsKt.getLayoutInflater(context), this);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
        setGravity(16);
        if (attributeSet != null) {
            int[] iArr = R.styleable.StatsSliderView;
            q.h(iArr, "StatsSliderView");
            typedArray = AttributeSetExtentionsKt.styledAttributes(attributeSet, context, iArr);
        } else {
            typedArray = null;
        }
        if (typedArray != null) {
            inflate.statTypeTitle.setText(typedArray.getString(2));
            int color = typedArray.getColor(0, 0);
            inflate.statTypeTitle.setTextColor(typedArray.getColor(1, 0));
            inflate.statsSeekBar.setProgressTintList(ColorStateList.valueOf(color));
            Drawable e10 = androidx.core.content.a.e(context, R.drawable.seekbar_thumb);
            if (e10 != null) {
                DrawableExtendsionsKt.setTintWith(e10, color, PorterDuff.Mode.MULTIPLY);
            }
            inflate.statsSeekBar.setThumb(e10);
        }
        inflate.valueEditText.addTextChangedListener(new AfterChangeTextWatcher(new AnonymousClass1()));
        inflate.statsSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.habitrpg.android.habitica.ui.views.stats.StatsSliderView.2
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
                l<Integer, w> allocateAction;
                StatsSliderView.this.setCurrentValue(i10);
                if (z10 && (allocateAction = StatsSliderView.this.getAllocateAction()) != null) {
                    allocateAction.invoke(Integer.valueOf(StatsSliderView.this.getCurrentValue()));
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        setCurrentValue(0);
    }

    public final l<Integer, w> getAllocateAction() {
        return this.allocateAction;
    }

    public final int getCurrentValue() {
        return this.currentValue;
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public final int getPreviousValue() {
        return this.previousValue;
    }

    public final void setAllocateAction(l<? super Integer, w> lVar) {
        this.allocateAction = lVar;
    }

    public final void setCurrentValue(int i10) {
        this.currentValue = i10;
        this.binding.statsSeekBar.setProgress(i10);
        this.binding.valueEditText.setText(String.valueOf(i10));
        if (this.binding.valueEditText.isFocused()) {
            AppCompatEditText appCompatEditText = this.binding.valueEditText;
            appCompatEditText.setSelection(appCompatEditText.length());
        }
    }

    public final void setMaxValue(int i10) {
        this.maxValue = i10;
        this.binding.statsSeekBar.setMax(i10);
    }

    public final void setPreviousValue(int i10) {
        this.previousValue = i10;
        this.binding.previousValueTextView.setText(String.valueOf(i10));
    }
}
