package com.habitrpg.android.habitica.extensions;

import android.text.Editable;
import android.text.TextWatcher;
import dc.w;
import pc.r;
import qc.q;

/* compiled from: TextWatcherExtensions.kt */
/* loaded from: classes4.dex */
public final class BeforeChangeTextWatcher implements TextWatcher {
    public static final int $stable = 8;
    private r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, w> function;

    public BeforeChangeTextWatcher(r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, w> rVar) {
        q.i(rVar, "function");
        this.function = rVar;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.function.invoke(charSequence, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
