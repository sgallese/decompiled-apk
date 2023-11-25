package com.habitrpg.android.habitica.extensions;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.g0;
import androidx.lifecycle.v;
import qc.q;

/* compiled from: BaseViewModelExtensions.kt */
/* loaded from: classes4.dex */
public final class BaseViewModelExtensionsKt {
    public static final <T> void observeOnce(final LiveData<T> liveData, v vVar, final g0<T> g0Var) {
        q.i(liveData, "<this>");
        q.i(vVar, "lifecycleOwner");
        q.i(g0Var, "observer");
        liveData.j(vVar, new g0<T>() { // from class: com.habitrpg.android.habitica.extensions.BaseViewModelExtensionsKt$observeOnce$1
            @Override // androidx.lifecycle.g0
            public void onChanged(T t10) {
                g0Var.onChanged(t10);
                liveData.o(this);
            }
        });
    }
}
