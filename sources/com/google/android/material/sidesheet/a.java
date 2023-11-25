package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: RightSheetDelegate.java */
/* loaded from: classes3.dex */
final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    final SideSheetBehavior<? extends View> f10316a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f10316a = sideSheetBehavior;
    }

    private boolean j(View view) {
        if (view.getLeft() > (e() - d()) / 2) {
            return true;
        }
        return false;
    }

    private boolean k(float f10, float f11) {
        if (d.a(f10, f11) && f11 > this.f10316a.f0()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.c
    public int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.c
    public float b(int i10) {
        float e10 = e();
        return (e10 - i10) / (e10 - d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.c
    public int c(View view, float f10, float f11) {
        if (f10 < 0.0f) {
            return 3;
        }
        if (l(view, f10)) {
            if (!k(f10, f11) && !j(view)) {
                return 3;
            }
        } else if (f10 == 0.0f || !d.a(f10, f11)) {
            int left = view.getLeft();
            if (Math.abs(left - d()) < Math.abs(left - e())) {
                return 3;
            }
        }
        return 5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.c
    public int d() {
        return Math.max(0, (e() - this.f10316a.W()) - this.f10316a.c0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.c
    public int e() {
        return this.f10316a.e0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.c
    public <V extends View> int f(V v10) {
        return v10.getLeft() - this.f10316a.c0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.c
    public int g() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.c
    public boolean h(View view, int i10, boolean z10) {
        int d02 = this.f10316a.d0(i10);
        y2.c g02 = this.f10316a.g0();
        if (g02 != null && (!z10 ? g02.Q(view, d02, view.getTop()) : g02.O(d02, view.getTop()))) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.c
    public void i(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        int e02 = this.f10316a.e0();
        if (i10 <= e02) {
            marginLayoutParams.rightMargin = e02 - i10;
        }
    }

    boolean l(View view, float f10) {
        if (Math.abs(view.getRight() + (f10 * this.f10316a.a0())) > this.f10316a.b0()) {
            return true;
        }
        return false;
    }
}
