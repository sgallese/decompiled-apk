package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.b;

/* compiled from: ActionBar.java */
/* loaded from: classes.dex */
public abstract class a {

    /* compiled from: ActionBar.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z10);
    }

    /* compiled from: ActionBar.java */
    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public abstract void A(Drawable drawable);

    public abstract void B(boolean z10);

    public abstract void C(boolean z10);

    public abstract void D(CharSequence charSequence);

    public abstract void E(CharSequence charSequence);

    public abstract void F(CharSequence charSequence);

    public androidx.appcompat.view.b G(b.a aVar) {
        return null;
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public abstract void h(boolean z10);

    public abstract int i();

    public abstract Context j();

    public abstract void k();

    public boolean l() {
        return false;
    }

    public abstract boolean o(int i10, KeyEvent keyEvent);

    public boolean p(KeyEvent keyEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(Drawable drawable);

    public abstract void s(boolean z10);

    public abstract void t(boolean z10);

    public abstract void u(boolean z10);

    public abstract void v(boolean z10);

    public abstract void w(boolean z10);

    public abstract void x(float f10);

    public abstract void y(int i10);

    public abstract void z(int i10);

    /* compiled from: ActionBar.java */
    /* renamed from: androidx.appcompat.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0010a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f763a;

        public C0010a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f763a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.j.f15929t);
            this.f763a = obtainStyledAttributes.getInt(g.j.f15934u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0010a(int i10, int i11) {
            super(i10, i11);
            this.f763a = 8388627;
        }

        public C0010a(C0010a c0010a) {
            super((ViewGroup.MarginLayoutParams) c0010a);
            this.f763a = 0;
            this.f763a = c0010a.f763a;
        }

        public C0010a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f763a = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n() {
    }

    public void m(Configuration configuration) {
    }
}
