package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.p0;

/* compiled from: ViewOffsetHelper.java */
/* loaded from: classes3.dex */
class n {

    /* renamed from: a  reason: collision with root package name */
    private final View f9503a;

    /* renamed from: b  reason: collision with root package name */
    private int f9504b;

    /* renamed from: c  reason: collision with root package name */
    private int f9505c;

    /* renamed from: d  reason: collision with root package name */
    private int f9506d;

    /* renamed from: e  reason: collision with root package name */
    private int f9507e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f9508f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f9509g = true;

    public n(View view) {
        this.f9503a = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        View view = this.f9503a;
        p0.f0(view, this.f9506d - (view.getTop() - this.f9504b));
        View view2 = this.f9503a;
        p0.e0(view2, this.f9507e - (view2.getLeft() - this.f9505c));
    }

    public int b() {
        return this.f9504b;
    }

    public int c() {
        return this.f9506d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        this.f9504b = this.f9503a.getTop();
        this.f9505c = this.f9503a.getLeft();
    }

    public boolean e(int i10) {
        if (this.f9509g && this.f9507e != i10) {
            this.f9507e = i10;
            a();
            return true;
        }
        return false;
    }

    public boolean f(int i10) {
        if (this.f9508f && this.f9506d != i10) {
            this.f9506d = i10;
            a();
            return true;
        }
        return false;
    }
}
