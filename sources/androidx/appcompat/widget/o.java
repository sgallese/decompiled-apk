package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: AppCompatImageHelper.java */
/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f1586a;

    /* renamed from: b  reason: collision with root package name */
    private e1 f1587b;

    /* renamed from: c  reason: collision with root package name */
    private e1 f1588c;

    /* renamed from: d  reason: collision with root package name */
    private e1 f1589d;

    /* renamed from: e  reason: collision with root package name */
    private int f1590e = 0;

    public o(ImageView imageView) {
        this.f1586a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f1589d == null) {
            this.f1589d = new e1();
        }
        e1 e1Var = this.f1589d;
        e1Var.a();
        ColorStateList a10 = androidx.core.widget.e.a(this.f1586a);
        if (a10 != null) {
            e1Var.f1506d = true;
            e1Var.f1503a = a10;
        }
        PorterDuff.Mode b10 = androidx.core.widget.e.b(this.f1586a);
        if (b10 != null) {
            e1Var.f1505c = true;
            e1Var.f1504b = b10;
        }
        if (!e1Var.f1506d && !e1Var.f1505c) {
            return false;
        }
        j.i(drawable, e1Var, this.f1586a.getDrawableState());
        return true;
    }

    private boolean l() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 21) {
            if (this.f1587b != null) {
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
        if (this.f1586a.getDrawable() != null) {
            this.f1586a.getDrawable().setLevel(this.f1590e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        Drawable drawable = this.f1586a.getDrawable();
        if (drawable != null) {
            n0.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            e1 e1Var = this.f1588c;
            if (e1Var != null) {
                j.i(drawable, e1Var, this.f1586a.getDrawableState());
                return;
            }
            e1 e1Var2 = this.f1587b;
            if (e1Var2 != null) {
                j.i(drawable, e1Var2, this.f1586a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList d() {
        e1 e1Var = this.f1588c;
        if (e1Var != null) {
            return e1Var.f1503a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode e() {
        e1 e1Var = this.f1588c;
        if (e1Var != null) {
            return e1Var.f1504b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        if (this.f1586a.getBackground() instanceof RippleDrawable) {
            return false;
        }
        return true;
    }

    public void g(AttributeSet attributeSet, int i10) {
        int n10;
        Context context = this.f1586a.getContext();
        int[] iArr = g.j.P;
        g1 v10 = g1.v(context, attributeSet, iArr, i10, 0);
        ImageView imageView = this.f1586a;
        androidx.core.view.p0.s0(imageView, imageView.getContext(), iArr, attributeSet, v10.r(), i10, 0);
        try {
            Drawable drawable = this.f1586a.getDrawable();
            if (drawable == null && (n10 = v10.n(g.j.Q, -1)) != -1 && (drawable = h.a.b(this.f1586a.getContext(), n10)) != null) {
                this.f1586a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                n0.b(drawable);
            }
            int i11 = g.j.R;
            if (v10.s(i11)) {
                androidx.core.widget.e.c(this.f1586a, v10.c(i11));
            }
            int i12 = g.j.S;
            if (v10.s(i12)) {
                androidx.core.widget.e.d(this.f1586a, n0.e(v10.k(i12, -1), null));
            }
        } finally {
            v10.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(Drawable drawable) {
        this.f1590e = drawable.getLevel();
    }

    public void i(int i10) {
        if (i10 != 0) {
            Drawable b10 = h.a.b(this.f1586a.getContext(), i10);
            if (b10 != null) {
                n0.b(b10);
            }
            this.f1586a.setImageDrawable(b10);
        } else {
            this.f1586a.setImageDrawable(null);
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(ColorStateList colorStateList) {
        if (this.f1588c == null) {
            this.f1588c = new e1();
        }
        e1 e1Var = this.f1588c;
        e1Var.f1503a = colorStateList;
        e1Var.f1506d = true;
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(PorterDuff.Mode mode) {
        if (this.f1588c == null) {
            this.f1588c = new e1();
        }
        e1 e1Var = this.f1588c;
        e1Var.f1504b = mode;
        e1Var.f1505c = true;
        c();
    }
}
