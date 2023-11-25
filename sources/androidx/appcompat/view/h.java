package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.x0;
import androidx.core.view.y0;
import androidx.core.view.z0;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ViewPropertyAnimatorCompatSet.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: c  reason: collision with root package name */
    private Interpolator f1004c;

    /* renamed from: d  reason: collision with root package name */
    y0 f1005d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1006e;

    /* renamed from: b  reason: collision with root package name */
    private long f1003b = -1;

    /* renamed from: f  reason: collision with root package name */
    private final z0 f1007f = new a();

    /* renamed from: a  reason: collision with root package name */
    final ArrayList<x0> f1002a = new ArrayList<>();

    /* compiled from: ViewPropertyAnimatorCompatSet.java */
    /* loaded from: classes.dex */
    class a extends z0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1008a = false;

        /* renamed from: b  reason: collision with root package name */
        private int f1009b = 0;

        a() {
        }

        @Override // androidx.core.view.y0
        public void b(View view) {
            int i10 = this.f1009b + 1;
            this.f1009b = i10;
            if (i10 == h.this.f1002a.size()) {
                y0 y0Var = h.this.f1005d;
                if (y0Var != null) {
                    y0Var.b(null);
                }
                d();
            }
        }

        @Override // androidx.core.view.z0, androidx.core.view.y0
        public void c(View view) {
            if (this.f1008a) {
                return;
            }
            this.f1008a = true;
            y0 y0Var = h.this.f1005d;
            if (y0Var != null) {
                y0Var.c(null);
            }
        }

        void d() {
            this.f1009b = 0;
            this.f1008a = false;
            h.this.b();
        }
    }

    public void a() {
        if (!this.f1006e) {
            return;
        }
        Iterator<x0> it = this.f1002a.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
        this.f1006e = false;
    }

    void b() {
        this.f1006e = false;
    }

    public h c(x0 x0Var) {
        if (!this.f1006e) {
            this.f1002a.add(x0Var);
        }
        return this;
    }

    public h d(x0 x0Var, x0 x0Var2) {
        this.f1002a.add(x0Var);
        x0Var2.l(x0Var.d());
        this.f1002a.add(x0Var2);
        return this;
    }

    public h e(long j10) {
        if (!this.f1006e) {
            this.f1003b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f1006e) {
            this.f1004c = interpolator;
        }
        return this;
    }

    public h g(y0 y0Var) {
        if (!this.f1006e) {
            this.f1005d = y0Var;
        }
        return this;
    }

    public void h() {
        if (this.f1006e) {
            return;
        }
        Iterator<x0> it = this.f1002a.iterator();
        while (it.hasNext()) {
            x0 next = it.next();
            long j10 = this.f1003b;
            if (j10 >= 0) {
                next.h(j10);
            }
            Interpolator interpolator = this.f1004c;
            if (interpolator != null) {
                next.i(interpolator);
            }
            if (this.f1005d != null) {
                next.j(this.f1007f);
            }
            next.n();
        }
        this.f1006e = true;
    }
}
