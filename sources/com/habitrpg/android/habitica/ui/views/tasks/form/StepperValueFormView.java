package com.habitrpg.android.habitica.ui.views.tasks.form;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.FormStepperValueBinding;
import com.habitrpg.android.habitica.extensions.BitmapExtensionsKt;
import com.habitrpg.android.habitica.extensions.OnChangeTextWatcher;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import dc.w;
import ec.p;
import java.text.DecimalFormat;
import qc.q;
import qc.r;
import yc.t;

/* compiled from: StepperValueFormView.kt */
/* loaded from: classes4.dex */
public final class StepperValueFormView extends RelativeLayout {
    public static final int $stable = 8;
    private final FormStepperValueBinding binding;
    private final DecimalFormat decimalFormat;
    private boolean editTextIsFocused;
    private Double maxValue;
    private double minValue;
    private pc.l<? super Double, w> onValueChanged;
    private double value;
    private String valueString;

    /* compiled from: StepperValueFormView.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.views.tasks.form.StepperValueFormView$3  reason: invalid class name */
    /* loaded from: classes4.dex */
    static final class AnonymousClass3 extends r implements pc.r<CharSequence, Integer, Integer, Integer, w> {
        AnonymousClass3() {
            super(4);
        }

        @Override // pc.r
        public /* bridge */ /* synthetic */ w invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
            invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
            return w.f13270a;
        }

        public final void invoke(CharSequence charSequence, int i10, int i11, int i12) {
            StepperValueFormView.this.setValueString(String.valueOf(charSequence));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StepperValueFormView(Context context) {
        this(context, null, 0, 6, null);
        q.i(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(StepperValueFormView stepperValueFormView, View view) {
        q.i(stepperValueFormView, "this$0");
        stepperValueFormView.setValue(stepperValueFormView.value + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(StepperValueFormView stepperValueFormView, View view) {
        q.i(stepperValueFormView, "this$0");
        stepperValueFormView.setValue(stepperValueFormView.value - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(StepperValueFormView stepperValueFormView, View view, boolean z10) {
        q.i(stepperValueFormView, "this$0");
        stepperValueFormView.editTextIsFocused = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setValueString(String str) {
        boolean z10;
        boolean z11;
        Double i10;
        boolean z12 = false;
        if (q.d(this.valueString, str) && q.d(this.binding.editText.getText().toString(), this.valueString)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.valueString = str;
        if (str.length() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        double d10 = 0.0d;
        if (z11) {
            pc.l<? super Double, w> lVar = this.onValueChanged;
            if (lVar != null) {
                lVar.invoke(Double.valueOf(0.0d));
                return;
            }
            return;
        }
        if (z10) {
            this.binding.editText.setText(this.valueString);
            if (this.editTextIsFocused) {
                this.binding.editText.setSelection(this.valueString.length());
            }
        }
        i10 = t.i(this.valueString);
        if (i10 != null) {
            d10 = i10.doubleValue();
        }
        if (this.value == d10) {
            z12 = true;
        }
        if (!z12 || z10) {
            setValue(d10);
        }
    }

    public final Drawable getIconDrawable() {
        Object M;
        Drawable[] compoundDrawables = this.binding.editText.getCompoundDrawables();
        q.h(compoundDrawables, "getCompoundDrawables(...)");
        M = p.M(compoundDrawables);
        return (Drawable) M;
    }

    public final Double getMaxValue() {
        return this.maxValue;
    }

    public final double getMinValue() {
        return this.minValue;
    }

    public final pc.l<Double, w> getOnValueChanged() {
        return this.onValueChanged;
    }

    public final double getValue() {
        return this.value;
    }

    public final void setIconDrawable(Drawable drawable) {
        this.binding.editText.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public final void setMaxValue(Double d10) {
        this.maxValue = d10;
    }

    public final void setMinValue(double d10) {
        this.minValue = d10;
    }

    public final void setOnValueChanged(pc.l<? super Double, w> lVar) {
        this.onValueChanged = lVar;
    }

    public final void setValue(double d10) {
        boolean z10;
        boolean z11;
        boolean z12;
        double d11 = this.minValue;
        if (d10 >= d11) {
            d11 = d10;
        }
        Double d12 = this.maxValue;
        if (d12 != null) {
            double doubleValue = d12.doubleValue();
            if (d11 > doubleValue && doubleValue > 0.0d) {
                d11 = doubleValue;
            }
        }
        double d13 = this.value;
        this.value = d11;
        boolean z13 = true;
        if (d13 == d10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            String format = this.decimalFormat.format(d11);
            q.h(format, "format(...)");
            setValueString(format);
        }
        ImageButton imageButton = this.binding.downButton;
        if (this.value > this.minValue) {
            z11 = true;
        } else {
            z11 = false;
        }
        imageButton.setEnabled(z11);
        Double d14 = this.maxValue;
        if (d14 != null) {
            double doubleValue2 = d14.doubleValue();
            if (doubleValue2 == 0.0d) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12) {
                ImageButton imageButton2 = this.binding.upButton;
                if (this.value >= doubleValue2) {
                    z13 = false;
                }
                imageButton2.setEnabled(z13);
            }
        }
        pc.l<? super Double, w> lVar = this.onValueChanged;
        if (lVar != null) {
            lVar.invoke(Double.valueOf(this.value));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StepperValueFormView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.i(context, "context");
    }

    public /* synthetic */ StepperValueFormView(Context context, AttributeSet attributeSet, int i10, int i11, qc.h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepperValueFormView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Drawable asDrawable;
        q.i(context, "context");
        FormStepperValueBinding inflate = FormStepperValueBinding.inflate(ContextExtensionsKt.getLayoutInflater(context), this);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
        this.decimalFormat = new DecimalFormat("0.###");
        this.valueString = "";
        Resources.Theme theme = context.getTheme();
        TypedArray obtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, R.styleable.StepperValueFormView, 0, 0) : null;
        this.maxValue = obtainStyledAttributes != null ? Double.valueOf(obtainStyledAttributes.getFloat(2, 0.0f)) : null;
        this.minValue = obtainStyledAttributes != null ? obtainStyledAttributes.getFloat(3, 0.0f) : 0.0d;
        setValue(obtainStyledAttributes != null ? obtainStyledAttributes.getFloat(0, 10.0f) : 10.0d);
        if (obtainStyledAttributes == null || (asDrawable = obtainStyledAttributes.getDrawable(1)) == null) {
            Bitmap imageOfGold = HabiticaIconsHelper.imageOfGold();
            q.h(imageOfGold, "imageOfGold(...)");
            Resources resources = context.getResources();
            q.h(resources, "getResources(...)");
            asDrawable = BitmapExtensionsKt.asDrawable(imageOfGold, resources);
        }
        setIconDrawable(asDrawable);
        inflate.upButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.tasks.form.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StepperValueFormView._init_$lambda$2(StepperValueFormView.this, view);
            }
        });
        inflate.downButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.tasks.form.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StepperValueFormView._init_$lambda$3(StepperValueFormView.this, view);
            }
        });
        inflate.editText.addTextChangedListener(new OnChangeTextWatcher(new AnonymousClass3()));
        inflate.editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.habitrpg.android.habitica.ui.views.tasks.form.f
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                StepperValueFormView._init_$lambda$4(StepperValueFormView.this, view, z10);
            }
        });
    }
}
