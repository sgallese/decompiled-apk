package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatBackgroundHelper.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final View f1497a;

    /* renamed from: d  reason: collision with root package name */
    private e1 f1500d;

    /* renamed from: e  reason: collision with root package name */
    private e1 f1501e;

    /* renamed from: f  reason: collision with root package name */
    private e1 f1502f;

    /* renamed from: c  reason: collision with root package name */
    private int f1499c = -1;

    /* renamed from: b  reason: collision with root package name */
    private final j f1498b = j.b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(View view) {
        this.f1497a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f1502f == null) {
            this.f1502f = new e1();
        }
        e1 e1Var = this.f1502f;
        e1Var.a();
        ColorStateList u10 = androidx.core.view.p0.u(this.f1497a);
        if (u10 != null) {
            e1Var.f1506d = true;
            e1Var.f1503a = u10;
        }
        PorterDuff.Mode v10 = androidx.core.view.p0.v(this.f1497a);
        if (v10 != null) {
            e1Var.f1505c = true;
            e1Var.f1504b = v10;
        }
        if (!e1Var.f1506d && !e1Var.f1505c) {
            return false;
        }
        j.i(drawable, e1Var, this.f1497a.getDrawableState());
        return true;
    }

    private boolean k() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 21) {
            if (this.f1500d != null) {
                return true;
            }
            return false;
        } else if (i10 == 21) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Drawable background = this.f1497a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            e1 e1Var = this.f1501e;
            if (e1Var != null) {
                j.i(background, e1Var, this.f1497a.getDrawableState());
                return;
            }
            e1 e1Var2 = this.f1500d;
            if (e1Var2 != null) {
                j.i(background, e1Var2, this.f1497a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList c() {
        e1 e1Var = this.f1501e;
        if (e1Var != null) {
            return e1Var.f1503a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        e1 e1Var = this.f1501e;
        if (e1Var != null) {
            return e1Var.f1504b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(AttributeSet attributeSet, int i10) {
        Context context = this.f1497a.getContext();
        int[] iArr = g.j.U3;
        g1 v10 = g1.v(context, attributeSet, iArr, i10, 0);
        View view = this.f1497a;
        androidx.core.view.p0.s0(view, view.getContext(), iArr, attributeSet, v10.r(), i10, 0);
        try {
            int i11 = g.j.V3;
            if (v10.s(i11)) {
                this.f1499c = v10.n(i11, -1);
                ColorStateList f10 = this.f1498b.f(this.f1497a.getContext(), this.f1499c);
                if (f10 != null) {
                    h(f10);
                }
            }
            int i12 = g.j.W3;
            if (v10.s(i12)) {
                androidx.core.view.p0.z0(this.f1497a, v10.c(i12));
            }
            int i13 = g.j.X3;
            if (v10.s(i13)) {
                androidx.core.view.p0.A0(this.f1497a, n0.e(v10.k(i13, -1), null));
            }
        } finally {
            v10.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Drawable drawable) {
        this.f1499c = -1;
        h(null);
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(int i10) {
        ColorStateList colorStateList;
        this.f1499c = i10;
        j jVar = this.f1498b;
        if (jVar != null) {
            colorStateList = jVar.f(this.f1497a.getContext(), i10);
        } else {
            colorStateList = null;
        }
        h(colorStateList);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1500d == null) {
                this.f1500d = new e1();
            }
            e1 e1Var = this.f1500d;
            e1Var.f1503a = colorStateList;
            e1Var.f1506d = true;
        } else {
            this.f1500d = null;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(ColorStateList colorStateList) {
        if (this.f1501e == null) {
            this.f1501e = new e1();
        }
        e1 e1Var = this.f1501e;
        e1Var.f1503a = colorStateList;
        e1Var.f1506d = true;
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(PorterDuff.Mode mode) {
        if (this.f1501e == null) {
            this.f1501e = new e1();
        }
        e1 e1Var = this.f1501e;
        e1Var.f1504b = mode;
        e1Var.f1505c = true;
        b();
    }
}
