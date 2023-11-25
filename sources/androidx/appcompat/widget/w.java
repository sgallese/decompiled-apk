package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* compiled from: AppCompatSeekBarHelper.java */
/* loaded from: classes.dex */
class w extends r {

    /* renamed from: d  reason: collision with root package name */
    private final SeekBar f1696d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f1697e;

    /* renamed from: f  reason: collision with root package name */
    private ColorStateList f1698f;

    /* renamed from: g  reason: collision with root package name */
    private PorterDuff.Mode f1699g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1700h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1701i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(SeekBar seekBar) {
        super(seekBar);
        this.f1698f = null;
        this.f1699g = null;
        this.f1700h = false;
        this.f1701i = false;
        this.f1696d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f1697e;
        if (drawable != null) {
            if (this.f1700h || this.f1701i) {
                Drawable r10 = androidx.core.graphics.drawable.a.r(drawable.mutate());
                this.f1697e = r10;
                if (this.f1700h) {
                    androidx.core.graphics.drawable.a.o(r10, this.f1698f);
                }
                if (this.f1701i) {
                    androidx.core.graphics.drawable.a.p(this.f1697e, this.f1699g);
                }
                if (this.f1697e.isStateful()) {
                    this.f1697e.setState(this.f1696d.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.r
    public void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        Context context = this.f1696d.getContext();
        int[] iArr = g.j.T;
        g1 v10 = g1.v(context, attributeSet, iArr, i10, 0);
        SeekBar seekBar = this.f1696d;
        androidx.core.view.p0.s0(seekBar, seekBar.getContext(), iArr, attributeSet, v10.r(), i10, 0);
        Drawable h10 = v10.h(g.j.U);
        if (h10 != null) {
            this.f1696d.setThumb(h10);
        }
        j(v10.g(g.j.V));
        int i11 = g.j.X;
        if (v10.s(i11)) {
            this.f1699g = n0.e(v10.k(i11, -1), this.f1699g);
            this.f1701i = true;
        }
        int i12 = g.j.W;
        if (v10.s(i12)) {
            this.f1698f = v10.c(i12);
            this.f1700h = true;
        }
        v10.w();
        f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Canvas canvas) {
        int i10;
        if (this.f1697e != null) {
            int max = this.f1696d.getMax();
            int i11 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1697e.getIntrinsicWidth();
                int intrinsicHeight = this.f1697e.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i10 = intrinsicWidth / 2;
                } else {
                    i10 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i11 = intrinsicHeight / 2;
                }
                this.f1697e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f1696d.getWidth() - this.f1696d.getPaddingLeft()) - this.f1696d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f1696d.getPaddingLeft(), this.f1696d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f1697e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        Drawable drawable = this.f1697e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1696d.getDrawableState())) {
            this.f1696d.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        Drawable drawable = this.f1697e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f1697e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1697e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1696d);
            androidx.core.graphics.drawable.a.m(drawable, androidx.core.view.p0.E(this.f1696d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1696d.getDrawableState());
            }
            f();
        }
        this.f1696d.invalidate();
    }
}
