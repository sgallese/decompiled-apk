package com.habitrpg.android.habitica.extensions;

import android.text.Editable;
import android.text.TextWatcher;
import dc.w;
import pc.l;
import qc.q;

/* compiled from: TextWatcherExtensions.kt */
/* loaded from: classes4.dex */
public final class AfterChangeTextWatcher implements TextWatcher {
    public static final int $stable = 8;
    private l<? super Editable, w> function;

    public AfterChangeTextWatcher(l<? super Editable, w> lVar) {
        q.i(lVar, "function");
        this.function = lVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.function.invoke(editable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
