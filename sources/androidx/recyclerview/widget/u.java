package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper.java */
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a  reason: collision with root package name */
    protected final RecyclerView.p f6939a;

    /* renamed from: b  reason: collision with root package name */
    private int f6940b;

    /* renamed from: c  reason: collision with root package name */
    final Rect f6941c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrientationHelper.java */
    /* loaded from: classes.dex */
    public class a extends u {
        a(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.u
        public int d(View view) {
            return this.f6939a.f0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.u
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f6939a.e0(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.u
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f6939a.d0(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.u
        public int g(View view) {
            return this.f6939a.c0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.u
        public int h() {
            return this.f6939a.w0();
        }

        @Override // androidx.recyclerview.widget.u
        public int i() {
            return this.f6939a.w0() - this.f6939a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.u
        public int j() {
            return this.f6939a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.u
        public int k() {
            return this.f6939a.x0();
        }

        @Override // androidx.recyclerview.widget.u
        public int l() {
            return this.f6939a.j0();
        }

        @Override // androidx.recyclerview.widget.u
        public int m() {
            return this.f6939a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.u
        public int n() {
            return (this.f6939a.w0() - this.f6939a.getPaddingLeft()) - this.f6939a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.u
        public int p(View view) {
            this.f6939a.v0(view, true, this.f6941c);
            return this.f6941c.right;
        }

        @Override // androidx.recyclerview.widget.u
        public int q(View view) {
            this.f6939a.v0(view, true, this.f6941c);
            return this.f6941c.left;
        }

        @Override // androidx.recyclerview.widget.u
        public void r(int i10) {
            this.f6939a.L0(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrientationHelper.java */
    /* loaded from: classes.dex */
    public class b extends u {
        b(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.u
        public int d(View view) {
            return this.f6939a.a0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.u
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f6939a.d0(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.u
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f6939a.e0(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.u
        public int g(View view) {
            return this.f6939a.g0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.u
        public int h() {
            return this.f6939a.i0();
        }

        @Override // androidx.recyclerview.widget.u
        public int i() {
            return this.f6939a.i0() - this.f6939a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.u
        public int j() {
            return this.f6939a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.u
        public int k() {
            return this.f6939a.j0();
        }

        @Override // androidx.recyclerview.widget.u
        public int l() {
            return this.f6939a.x0();
        }

        @Override // androidx.recyclerview.widget.u
        public int m() {
            return this.f6939a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.u
        public int n() {
            return (this.f6939a.i0() - this.f6939a.getPaddingTop()) - this.f6939a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.u
        public int p(View view) {
            this.f6939a.v0(view, true, this.f6941c);
            return this.f6941c.bottom;
        }

        @Override // androidx.recyclerview.widget.u
        public int q(View view) {
            this.f6939a.v0(view, true, this.f6941c);
            return this.f6941c.top;
        }

        @Override // androidx.recyclerview.widget.u
        public void r(int i10) {
            this.f6939a.M0(i10);
        }
    }

    /* synthetic */ u(RecyclerView.p pVar, a aVar) {
        this(pVar);
    }

    public static u a(RecyclerView.p pVar) {
        return new a(pVar);
    }

    public static u b(RecyclerView.p pVar, int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return c(pVar);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return a(pVar);
    }

    public static u c(RecyclerView.p pVar) {
        return new b(pVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f6940b) {
            return 0;
        }
        return n() - this.f6940b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i10);

    public void s() {
        this.f6940b = n();
    }

    private u(RecyclerView.p pVar) {
        this.f6940b = RecyclerView.UNDEFINED_DURATION;
        this.f6941c = new Rect();
        this.f6939a = pVar;
    }
}
