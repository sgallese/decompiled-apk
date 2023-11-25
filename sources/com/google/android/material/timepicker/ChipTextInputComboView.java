package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.p0;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.o;
import com.google.android.material.internal.r;
import com.google.android.material.textfield.TextInputLayout;
import v6.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: f  reason: collision with root package name */
    private final Chip f10627f;

    /* renamed from: m  reason: collision with root package name */
    private final TextInputLayout f10628m;

    /* renamed from: p  reason: collision with root package name */
    private final EditText f10629p;

    /* renamed from: q  reason: collision with root package name */
    private TextWatcher f10630q;

    /* renamed from: r  reason: collision with root package name */
    private TextView f10631r;

    /* loaded from: classes3.dex */
    private class b extends o {
        private b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (!TextUtils.isEmpty(editable)) {
                String c10 = ChipTextInputComboView.this.c(editable);
                Chip chip = ChipTextInputComboView.this.f10627f;
                if (TextUtils.isEmpty(c10)) {
                    c10 = ChipTextInputComboView.this.c("00");
                }
                chip.setText(c10);
                return;
            }
            ChipTextInputComboView.this.f10627f.setText(ChipTextInputComboView.this.c("00"));
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(CharSequence charSequence) {
        return TimeModel.a(getResources(), charSequence);
    }

    private void d() {
        LocaleList locales;
        if (Build.VERSION.SDK_INT >= 24) {
            locales = getContext().getResources().getConfiguration().getLocales();
            this.f10629p.setImeHintLocales(locales);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f10627f.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        int i10;
        this.f10627f.setChecked(z10);
        EditText editText = this.f10629p;
        int i11 = 0;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        editText.setVisibility(i10);
        Chip chip = this.f10627f;
        if (z10) {
            i11 = 8;
        }
        chip.setVisibility(i11);
        if (isChecked()) {
            r.k(this.f10629p);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f10627f.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        this.f10627f.setTag(i10, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f10627f.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(h.f24751k, (ViewGroup) this, false);
        this.f10627f = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(h.f24752l, (ViewGroup) this, false);
        this.f10628m = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f10629p = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f10630q = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        this.f10631r = (TextView) findViewById(v6.f.f24727p);
        editText.setId(p0.m());
        p0.I0(this.f10631r, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
