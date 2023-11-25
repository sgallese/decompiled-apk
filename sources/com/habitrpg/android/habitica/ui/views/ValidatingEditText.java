package com.habitrpg.android.habitica.ui.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.ValidatingEditTextBinding;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import qc.q;

/* compiled from: ValidatingEditText.kt */
/* loaded from: classes4.dex */
public final class ValidatingEditText extends LinearLayout {
    public static final int $stable = 8;
    private ValidatingEditTextBinding binding;
    private pc.l<? super String, Boolean> validator;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.util.AttributeSet, qc.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ValidatingEditText(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            qc.q.i(r3, r0)
            r0 = 0
            r1 = 2
            r2.<init>(r3, r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.ValidatingEditText.<init>(android.content.Context):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ValidatingEditText validatingEditText, View view, boolean z10) {
        q.i(validatingEditText, "this$0");
        if (z10) {
            return;
        }
        showErrorIfNecessary$default(validatingEditText, null, 1, null);
    }

    public static /* synthetic */ void showErrorIfNecessary$default(ValidatingEditText validatingEditText, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        validatingEditText.showErrorIfNecessary(str);
    }

    public final String getErrorText() {
        CharSequence text = this.binding.errorText.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public final String getText() {
        Editable text = this.binding.editText.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public final pc.l<String, Boolean> getValidator() {
        return this.validator;
    }

    public final boolean isValid() {
        pc.l<? super String, Boolean> lVar = this.validator;
        boolean z10 = false;
        if (lVar != null && !lVar.invoke(getText()).booleanValue()) {
            z10 = true;
        }
        return !z10;
    }

    public final void setErrorText(String str) {
        this.binding.errorText.setText(str);
    }

    public final void setText(String str) {
        this.binding.editText.setText(str);
    }

    public final void setValidator(pc.l<? super String, Boolean> lVar) {
        this.validator = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        if ((!r4) == true) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void showErrorIfNecessary(java.lang.String r4) {
        /*
            r3 = this;
            pc.l<? super java.lang.String, java.lang.Boolean> r0 = r3.validator
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1a
            if (r4 != 0) goto Lc
            java.lang.String r4 = r3.getText()
        Lc:
            java.lang.Object r4 = r0.invoke(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != r1) goto L1a
            r4 = 1
            goto L1b
        L1a:
            r4 = 0
        L1b:
            if (r4 != 0) goto L37
            java.lang.String r4 = r3.getErrorText()
            if (r4 == 0) goto L2b
            boolean r4 = yc.m.u(r4)
            r4 = r4 ^ r1
            if (r4 != r1) goto L2b
            goto L2c
        L2b:
            r1 = 0
        L2c:
            if (r1 != 0) goto L2f
            goto L37
        L2f:
            com.habitrpg.android.habitica.databinding.ValidatingEditTextBinding r4 = r3.binding
            android.widget.TextView r4 = r4.errorText
            r4.setVisibility(r2)
            goto L40
        L37:
            com.habitrpg.android.habitica.databinding.ValidatingEditTextBinding r4 = r3.binding
            android.widget.TextView r4 = r4.errorText
            r0 = 8
            r4.setVisibility(r0)
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.ValidatingEditText.showErrorIfNecessary(java.lang.String):void");
    }

    public /* synthetic */ ValidatingEditText(Context context, AttributeSet attributeSet, int i10, qc.h hVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidatingEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes;
        q.i(context, "context");
        ValidatingEditTextBinding inflate = ValidatingEditTextBinding.inflate(ContextExtensionsKt.getLayoutInflater(context), this);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
        setOrientation(1);
        Resources.Theme theme = context.getTheme();
        if (theme != null && (obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, R.styleable.ValidatingEditText, 0, 0)) != null) {
            this.binding.inputLayout.setHint(obtainStyledAttributes.getString(2));
            this.binding.editText.setMaxLines(obtainStyledAttributes.getInt(0, 20));
            this.binding.editText.setInputType(obtainStyledAttributes.getInt(1, 1));
        }
        this.binding.editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.habitrpg.android.habitica.ui.views.m
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                ValidatingEditText._init_$lambda$1(ValidatingEditText.this, view, z10);
            }
        });
        TextInputEditText textInputEditText = this.binding.editText;
        q.h(textInputEditText, "editText");
        textInputEditText.addTextChangedListener(new TextWatcher() { // from class: com.habitrpg.android.habitica.ui.views.ValidatingEditText$special$$inlined$doOnTextChanged$1
            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                ValidatingEditTextBinding validatingEditTextBinding;
                validatingEditTextBinding = ValidatingEditText.this.binding;
                if (validatingEditTextBinding.errorText.getVisibility() == 0) {
                    ValidatingEditText.this.showErrorIfNecessary(String.valueOf(charSequence));
                }
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }
        });
    }
}
