package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChildHelper.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    final b f6716a;

    /* renamed from: b  reason: collision with root package name */
    final a f6717b = new a();

    /* renamed from: c  reason: collision with root package name */
    final List<View> f6718c = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChildHelper.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        long f6719a = 0;

        /* renamed from: b  reason: collision with root package name */
        a f6720b;

        a() {
        }

        private void c() {
            if (this.f6720b == null) {
                this.f6720b = new a();
            }
        }

        void a(int i10) {
            if (i10 >= 64) {
                a aVar = this.f6720b;
                if (aVar != null) {
                    aVar.a(i10 - 64);
                    return;
                }
                return;
            }
            this.f6719a &= ~(1 << i10);
        }

        int b(int i10) {
            a aVar = this.f6720b;
            if (aVar == null) {
                if (i10 >= 64) {
                    return Long.bitCount(this.f6719a);
                }
                return Long.bitCount(this.f6719a & ((1 << i10) - 1));
            } else if (i10 < 64) {
                return Long.bitCount(this.f6719a & ((1 << i10) - 1));
            } else {
                return aVar.b(i10 - 64) + Long.bitCount(this.f6719a);
            }
        }

        boolean d(int i10) {
            if (i10 >= 64) {
                c();
                return this.f6720b.d(i10 - 64);
            } else if ((this.f6719a & (1 << i10)) != 0) {
                return true;
            } else {
                return false;
            }
        }

        void e(int i10, boolean z10) {
            boolean z11;
            if (i10 >= 64) {
                c();
                this.f6720b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f6719a;
            if ((Long.MIN_VALUE & j10) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            long j11 = (1 << i10) - 1;
            this.f6719a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f6720b != null) {
                c();
                this.f6720b.e(0, z11);
            }
        }

        boolean f(int i10) {
            boolean z10;
            if (i10 >= 64) {
                c();
                return this.f6720b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f6719a;
            if ((j11 & j10) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            long j12 = j11 & (~j10);
            this.f6719a = j12;
            long j13 = j10 - 1;
            this.f6719a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f6720b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f6720b.f(0);
            }
            return z10;
        }

        void g() {
            this.f6719a = 0L;
            a aVar = this.f6720b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i10) {
            if (i10 >= 64) {
                c();
                this.f6720b.h(i10 - 64);
                return;
            }
            this.f6719a |= 1 << i10;
        }

        public String toString() {
            if (this.f6720b == null) {
                return Long.toBinaryString(this.f6719a);
            }
            return this.f6720b.toString() + "xx" + Long.toBinaryString(this.f6719a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChildHelper.java */
    /* loaded from: classes.dex */
    public interface b {
        View a(int i10);

        void b(View view);

        int c();

        void d();

        int e(View view);

        RecyclerView.f0 f(View view);

        void g(int i10);

        void h(View view);

        void i(View view, int i10);

        void j(int i10);

        void k(View view, int i10, ViewGroup.LayoutParams layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(b bVar) {
        this.f6716a = bVar;
    }

    private int h(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int c10 = this.f6716a.c();
        int i11 = i10;
        while (i11 < c10) {
            int b10 = i10 - (i11 - this.f6717b.b(i11));
            if (b10 == 0) {
                while (this.f6717b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += b10;
        }
        return -1;
    }

    private void l(View view) {
        this.f6718c.add(view);
        this.f6716a.b(view);
    }

    private boolean t(View view) {
        if (this.f6718c.remove(view)) {
            this.f6716a.h(view);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view, int i10, boolean z10) {
        int h10;
        if (i10 < 0) {
            h10 = this.f6716a.c();
        } else {
            h10 = h(i10);
        }
        this.f6717b.e(h10, z10);
        if (z10) {
            l(view);
        }
        this.f6716a.i(view, h10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(View view, boolean z10) {
        a(view, -1, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int h10;
        if (i10 < 0) {
            h10 = this.f6716a.c();
        } else {
            h10 = h(i10);
        }
        this.f6717b.e(h10, z10);
        if (z10) {
            l(view);
        }
        this.f6716a.k(view, h10, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(int i10) {
        int h10 = h(i10);
        this.f6717b.f(h10);
        this.f6716a.g(h10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View e(int i10) {
        int size = this.f6718c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.f6718c.get(i11);
            RecyclerView.f0 f10 = this.f6716a.f(view);
            if (f10.getLayoutPosition() == i10 && !f10.isInvalid() && !f10.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View f(int i10) {
        return this.f6716a.a(h(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.f6716a.c() - this.f6718c.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View i(int i10) {
        return this.f6716a.a(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return this.f6716a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(View view) {
        int e10 = this.f6716a.e(view);
        if (e10 >= 0) {
            this.f6717b.h(e10);
            l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int m(View view) {
        int e10 = this.f6716a.e(view);
        if (e10 == -1 || this.f6717b.d(e10)) {
            return -1;
        }
        return e10 - this.f6717b.b(e10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n(View view) {
        return this.f6718c.contains(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o() {
        this.f6717b.g();
        for (int size = this.f6718c.size() - 1; size >= 0; size--) {
            this.f6716a.h(this.f6718c.get(size));
            this.f6718c.remove(size);
        }
        this.f6716a.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(View view) {
        int e10 = this.f6716a.e(view);
        if (e10 < 0) {
            return;
        }
        if (this.f6717b.f(e10)) {
            t(view);
        }
        this.f6716a.j(e10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(int i10) {
        int h10 = h(i10);
        View a10 = this.f6716a.a(h10);
        if (a10 == null) {
            return;
        }
        if (this.f6717b.f(h10)) {
            t(a10);
        }
        this.f6716a.j(h10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r(View view) {
        int e10 = this.f6716a.e(view);
        if (e10 == -1) {
            t(view);
            return true;
        } else if (this.f6717b.d(e10)) {
            this.f6717b.f(e10);
            t(view);
            this.f6716a.j(e10);
            return true;
        } else {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(View view) {
        int e10 = this.f6716a.e(view);
        if (e10 >= 0) {
            if (this.f6717b.d(e10)) {
                this.f6717b.a(e10);
                t(view);
                return;
            }
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public String toString() {
        return this.f6717b.toString() + ", hidden list:" + this.f6718c.size();
    }
}
