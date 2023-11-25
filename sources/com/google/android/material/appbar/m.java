package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: ViewOffsetBehavior.java */
/* loaded from: classes3.dex */
class m<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    private n f9500a;

    /* renamed from: b  reason: collision with root package name */
    private int f9501b;

    /* renamed from: c  reason: collision with root package name */
    private int f9502c;

    public m() {
        this.f9501b = 0;
        this.f9502c = 0;
    }

    public int E() {
        n nVar = this.f9500a;
        if (nVar != null) {
            return nVar.c();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void F(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        coordinatorLayout.C(v10, i10);
    }

    public boolean G(int i10) {
        n nVar = this.f9500a;
        if (nVar != null) {
            return nVar.f(i10);
        }
        this.f9501b = i10;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        F(coordinatorLayout, v10, i10);
        if (this.f9500a == null) {
            this.f9500a = new n(v10);
        }
        this.f9500a.d();
        this.f9500a.a();
        int i11 = this.f9501b;
        if (i11 != 0) {
            this.f9500a.f(i11);
            this.f9501b = 0;
        }
        int i12 = this.f9502c;
        if (i12 != 0) {
            this.f9500a.e(i12);
            this.f9502c = 0;
            return true;
        }
        return true;
    }

    public m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9501b = 0;
        this.f9502c = 0;
    }
}
