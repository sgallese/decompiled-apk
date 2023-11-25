package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: NestedScrollingParentHelper.java */
/* loaded from: classes.dex */
public class g0 {

    /* renamed from: a  reason: collision with root package name */
    private int f4164a;

    /* renamed from: b  reason: collision with root package name */
    private int f4165b;

    public g0(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f4164a | this.f4165b;
    }

    public void b(View view, View view2, int i10) {
        c(view, view2, i10, 0);
    }

    public void c(View view, View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f4165b = i10;
        } else {
            this.f4164a = i10;
        }
    }

    public void d(View view) {
        e(view, 0);
    }

    public void e(View view, int i10) {
        if (i10 == 1) {
            this.f4165b = 0;
        } else {
            this.f4164a = 0;
        }
    }
}
