package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SmoothCalendarLayoutManager.java */
/* loaded from: classes3.dex */
class n extends LinearLayoutManager {

    /* compiled from: SmoothCalendarLayoutManager.java */
    /* loaded from: classes3.dex */
    class a extends androidx.recyclerview.widget.q {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.q
        protected float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(Context context, int i10, boolean z10) {
        super(context, i10, z10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void S1(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i10) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i10);
        T1(aVar);
    }
}
