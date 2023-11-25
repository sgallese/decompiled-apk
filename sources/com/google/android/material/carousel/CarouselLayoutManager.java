package com.google.android.material.carousel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.util.i;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import com.google.android.material.carousel.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class CarouselLayoutManager extends RecyclerView.p implements com.google.android.material.carousel.a {
    private int F;
    private int G;
    private int H;
    private com.google.android.material.carousel.b K;
    private com.google.android.material.carousel.d L;
    private com.google.android.material.carousel.c M;
    private boolean I = false;
    private final c J = new c();
    private int N = 0;

    /* loaded from: classes3.dex */
    class a extends q {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a0
        public PointF a(int i10) {
            if (CarouselLayoutManager.this.L == null) {
                return null;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return new PointF(carouselLayoutManager.s2(carouselLayoutManager.L.f(), i10) - CarouselLayoutManager.this.F, 0.0f);
        }

        @Override // androidx.recyclerview.widget.q
        public int t(View view, int i10) {
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return (int) (CarouselLayoutManager.this.F - carouselLayoutManager.s2(carouselLayoutManager.L.f(), CarouselLayoutManager.this.p0(view)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        View f9782a;

        /* renamed from: b  reason: collision with root package name */
        float f9783b;

        /* renamed from: c  reason: collision with root package name */
        d f9784c;

        b(View view, float f10, d dVar) {
            this.f9782a = view;
            this.f9783b = f10;
            this.f9784c = dVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class c extends RecyclerView.o {

        /* renamed from: a  reason: collision with root package name */
        private final Paint f9785a;

        /* renamed from: b  reason: collision with root package name */
        private List<c.C0233c> f9786b;

        c() {
            Paint paint = new Paint();
            this.f9785a = paint;
            this.f9786b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        void c(List<c.C0233c> list) {
            this.f9786b = Collections.unmodifiableList(list);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            super.onDrawOver(canvas, recyclerView, b0Var);
            this.f9785a.setStrokeWidth(recyclerView.getResources().getDimension(v6.d.f24689n));
            for (c.C0233c c0233c : this.f9786b) {
                this.f9785a.setColor(androidx.core.graphics.a.c(-65281, -16776961, c0233c.f9802c));
                canvas.drawLine(c0233c.f9801b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).r2(), c0233c.f9801b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).o2(), this.f9785a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        final c.C0233c f9787a;

        /* renamed from: b  reason: collision with root package name */
        final c.C0233c f9788b;

        d(c.C0233c c0233c, c.C0233c c0233c2) {
            boolean z10;
            if (c0233c.f9800a <= c0233c2.f9800a) {
                z10 = true;
            } else {
                z10 = false;
            }
            i.a(z10);
            this.f9787a = c0233c;
            this.f9788b = c0233c2;
        }
    }

    public CarouselLayoutManager() {
        C2(new f());
    }

    private void A2(RecyclerView.w wVar) {
        while (V() > 0) {
            View U = U(0);
            float m22 = m2(U);
            if (!w2(m22, t2(this.M.e(), m22, true))) {
                break;
            }
            w1(U, wVar);
        }
        while (V() - 1 >= 0) {
            View U2 = U(V() - 1);
            float m23 = m2(U2);
            if (v2(m23, t2(this.M.e(), m23, true))) {
                w1(U2, wVar);
            } else {
                return;
            }
        }
    }

    private int B2(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (V() == 0 || i10 == 0) {
            return 0;
        }
        int j22 = j2(i10, this.F, this.G, this.H);
        this.F += j22;
        E2();
        float d10 = this.M.d() / 2.0f;
        int h22 = h2(p0(U(0)));
        Rect rect = new Rect();
        for (int i11 = 0; i11 < V(); i11++) {
            z2(U(i11), h22, d10, rect);
            h22 = c2(h22, (int) this.M.d());
        }
        l2(wVar, b0Var);
        return j22;
    }

    private void D2(View view, float f10, d dVar) {
        if (view instanceof e) {
            c.C0233c c0233c = dVar.f9787a;
            float f11 = c0233c.f9802c;
            c.C0233c c0233c2 = dVar.f9788b;
            ((e) view).a(w6.a.b(f11, c0233c2.f9802c, c0233c.f9800a, c0233c2.f9800a, f10));
        }
    }

    private void E2() {
        com.google.android.material.carousel.c g10;
        int i10 = this.H;
        int i11 = this.G;
        if (i10 <= i11) {
            if (u2()) {
                g10 = this.L.h();
            } else {
                g10 = this.L.g();
            }
            this.M = g10;
        } else {
            this.M = this.L.i(this.F, i11, i10);
        }
        this.J.c(this.M.e());
    }

    private void F2() {
        if (this.I && V() >= 1) {
            int i10 = 0;
            while (i10 < V() - 1) {
                int p02 = p0(U(i10));
                int i11 = i10 + 1;
                int p03 = p0(U(i11));
                if (p02 <= p03) {
                    i10 = i11;
                } else {
                    x2();
                    throw new IllegalStateException("Detected invalid child order. Child at index [" + i10 + "] had adapter position [" + p02 + "] and child at index [" + i11 + "] had adapter position [" + p03 + "].");
                }
            }
        }
    }

    private void b2(View view, int i10, float f10) {
        float d10 = this.M.d() / 2.0f;
        q(view, i10);
        I0(view, (int) (f10 - d10), r2(), (int) (f10 + d10), o2());
    }

    private int c2(int i10, int i11) {
        if (u2()) {
            return i10 - i11;
        }
        return i10 + i11;
    }

    private int d2(int i10, int i11) {
        if (u2()) {
            return i10 + i11;
        }
        return i10 - i11;
    }

    private void e2(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i10) {
        int h22 = h2(i10);
        while (i10 < b0Var.b()) {
            b y22 = y2(wVar, h22, i10);
            if (!v2(y22.f9783b, y22.f9784c)) {
                h22 = c2(h22, (int) this.M.d());
                if (!w2(y22.f9783b, y22.f9784c)) {
                    b2(y22.f9782a, -1, y22.f9783b);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    private void f2(RecyclerView.w wVar, int i10) {
        int h22 = h2(i10);
        while (i10 >= 0) {
            b y22 = y2(wVar, h22, i10);
            if (!w2(y22.f9783b, y22.f9784c)) {
                h22 = d2(h22, (int) this.M.d());
                if (!v2(y22.f9783b, y22.f9784c)) {
                    b2(y22.f9782a, 0, y22.f9783b);
                }
                i10--;
            } else {
                return;
            }
        }
    }

    private float g2(View view, float f10, d dVar) {
        c.C0233c c0233c = dVar.f9787a;
        float f11 = c0233c.f9801b;
        c.C0233c c0233c2 = dVar.f9788b;
        float b10 = w6.a.b(f11, c0233c2.f9801b, c0233c.f9800a, c0233c2.f9800a, f10);
        if (dVar.f9788b == this.M.c() || dVar.f9787a == this.M.h()) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            float d10 = (((ViewGroup.MarginLayoutParams) qVar).rightMargin + ((ViewGroup.MarginLayoutParams) qVar).leftMargin) / this.M.d();
            c.C0233c c0233c3 = dVar.f9788b;
            return b10 + ((f10 - c0233c3.f9800a) * ((1.0f - c0233c3.f9802c) + d10));
        }
        return b10;
    }

    private int h2(int i10) {
        return c2(q2() - this.F, (int) (this.M.d() * i10));
    }

    private int i2(RecyclerView.b0 b0Var, com.google.android.material.carousel.d dVar) {
        com.google.android.material.carousel.c h10;
        c.C0233c f10;
        float f11;
        boolean u22 = u2();
        if (u22) {
            h10 = dVar.g();
        } else {
            h10 = dVar.h();
        }
        if (u22) {
            f10 = h10.a();
        } else {
            f10 = h10.f();
        }
        float b10 = (((float) (b0Var.b() - 1)) * h10.d()) + getPaddingEnd();
        if (u22) {
            f11 = -1.0f;
        } else {
            f11 = 1.0f;
        }
        float f12 = b10 * f11;
        float q22 = f10.f9800a - q2();
        float p22 = p2() - f10.f9800a;
        if (Math.abs(q22) > Math.abs(f12)) {
            return 0;
        }
        return (int) ((f12 - q22) + p22);
    }

    private static int j2(int i10, int i11, int i12, int i13) {
        int i14 = i11 + i10;
        if (i14 < i12) {
            return i12 - i11;
        }
        if (i14 > i13) {
            return i13 - i11;
        }
        return i10;
    }

    private int k2(com.google.android.material.carousel.d dVar) {
        com.google.android.material.carousel.c g10;
        c.C0233c a10;
        int i10;
        boolean u22 = u2();
        if (u22) {
            g10 = dVar.h();
        } else {
            g10 = dVar.g();
        }
        if (u22) {
            a10 = g10.f();
        } else {
            a10 = g10.a();
        }
        int paddingStart = getPaddingStart();
        if (u22) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        return (int) (((paddingStart * i10) + q2()) - d2((int) a10.f9800a, (int) (g10.d() / 2.0f)));
    }

    private void l2(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        A2(wVar);
        if (V() == 0) {
            f2(wVar, this.N - 1);
            e2(wVar, b0Var, this.N);
        } else {
            int p02 = p0(U(0));
            int p03 = p0(U(V() - 1));
            f2(wVar, p02 - 1);
            e2(wVar, b0Var, p03 + 1);
        }
        F2();
    }

    private float m2(View view) {
        super.b0(view, new Rect());
        return r0.centerX();
    }

    private float n2(float f10, d dVar) {
        c.C0233c c0233c = dVar.f9787a;
        float f11 = c0233c.f9803d;
        c.C0233c c0233c2 = dVar.f9788b;
        return w6.a.b(f11, c0233c2.f9803d, c0233c.f9801b, c0233c2.f9801b, f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int o2() {
        return i0() - getPaddingBottom();
    }

    private int p2() {
        if (u2()) {
            return 0;
        }
        return w0();
    }

    private int q2() {
        if (u2()) {
            return w0();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int r2() {
        return getPaddingTop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int s2(com.google.android.material.carousel.c cVar, int i10) {
        if (u2()) {
            return (int) (((a() - cVar.f().f9800a) - (i10 * cVar.d())) - (cVar.d() / 2.0f));
        }
        return (int) (((i10 * cVar.d()) - cVar.a().f9800a) + (cVar.d() / 2.0f));
    }

    private static d t2(List<c.C0233c> list, float f10, boolean z10) {
        float f11;
        float f12 = Float.MAX_VALUE;
        float f13 = Float.MAX_VALUE;
        float f14 = Float.MAX_VALUE;
        float f15 = -3.4028235E38f;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < list.size(); i14++) {
            c.C0233c c0233c = list.get(i14);
            if (z10) {
                f11 = c0233c.f9801b;
            } else {
                f11 = c0233c.f9800a;
            }
            float abs = Math.abs(f11 - f10);
            if (f11 <= f10 && abs <= f12) {
                i10 = i14;
                f12 = abs;
            }
            if (f11 > f10 && abs <= f13) {
                i12 = i14;
                f13 = abs;
            }
            if (f11 <= f14) {
                i11 = i14;
                f14 = f11;
            }
            if (f11 > f15) {
                i13 = i14;
                f15 = f11;
            }
        }
        if (i10 == -1) {
            i10 = i11;
        }
        if (i12 == -1) {
            i12 = i13;
        }
        return new d(list.get(i10), list.get(i12));
    }

    private boolean u2() {
        if (l0() == 1) {
            return true;
        }
        return false;
    }

    private boolean v2(float f10, d dVar) {
        int d22 = d2((int) f10, (int) (n2(f10, dVar) / 2.0f));
        if (u2()) {
            if (d22 < 0) {
                return true;
            }
        } else if (d22 > a()) {
            return true;
        }
        return false;
    }

    private boolean w2(float f10, d dVar) {
        int c22 = c2((int) f10, (int) (n2(f10, dVar) / 2.0f));
        if (u2()) {
            if (c22 > a()) {
                return true;
            }
        } else if (c22 < 0) {
            return true;
        }
        return false;
    }

    private void x2() {
        if (this.I && Log.isLoggable("CarouselLayoutManager", 3)) {
            Log.d("CarouselLayoutManager", "internal representation of views on the screen");
            for (int i10 = 0; i10 < V(); i10++) {
                View U = U(i10);
                Log.d("CarouselLayoutManager", "item position " + p0(U) + ", center:" + m2(U) + ", child index:" + i10);
            }
            Log.d("CarouselLayoutManager", "==============");
        }
    }

    private b y2(RecyclerView.w wVar, float f10, int i10) {
        float d10 = this.M.d() / 2.0f;
        View o10 = wVar.o(i10);
        J0(o10, 0, 0);
        float c22 = c2((int) f10, (int) d10);
        d t22 = t2(this.M.e(), c22, false);
        float g22 = g2(o10, c22, t22);
        D2(o10, c22, t22);
        return new b(o10, g22, t22);
    }

    private void z2(View view, float f10, float f11, Rect rect) {
        float c22 = c2((int) f10, (int) f11);
        d t22 = t2(this.M.e(), c22, false);
        float g22 = g2(view, c22, t22);
        D2(view, c22, t22);
        super.b0(view, rect);
        view.offsetLeftAndRight((int) (g22 - (rect.left + f11)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int C(RecyclerView.b0 b0Var) {
        return (int) this.L.f().d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean C1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        com.google.android.material.carousel.d dVar = this.L;
        if (dVar == null) {
            return false;
        }
        int s22 = s2(dVar.f(), p0(view)) - this.F;
        if (z11 || s22 == 0) {
            return false;
        }
        recyclerView.scrollBy(s22, 0);
        return true;
    }

    public void C2(com.google.android.material.carousel.b bVar) {
        this.K = bVar;
        this.L = null;
        D1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int D(RecyclerView.b0 b0Var) {
        return this.F;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int E(RecyclerView.b0 b0Var) {
        return this.H - this.G;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int G1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (w()) {
            return B2(i10, wVar, b0Var);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void H1(int i10) {
        com.google.android.material.carousel.d dVar = this.L;
        if (dVar == null) {
            return;
        }
        this.F = s2(dVar.f(), i10);
        this.N = t2.a.b(i10, 0, Math.max(0, k0() - 1));
        E2();
        D1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void J0(View view, int i10, int i11) {
        float f10;
        if (view instanceof e) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            Rect rect = new Rect();
            v(view, rect);
            int i12 = i10 + rect.left + rect.right;
            int i13 = i11 + rect.top + rect.bottom;
            com.google.android.material.carousel.d dVar = this.L;
            if (dVar != null) {
                f10 = dVar.f().d();
            } else {
                f10 = ((ViewGroup.MarginLayoutParams) qVar).width;
            }
            view.measure(RecyclerView.p.W(w0(), x0(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i12, (int) f10, w()), RecyclerView.p.W(i0(), j0(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) qVar).height, x()));
            return;
        }
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q P() {
        return new RecyclerView.q(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void S1(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i10) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i10);
        T1(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void T0(AccessibilityEvent accessibilityEvent) {
        super.T0(accessibilityEvent);
        if (V() > 0) {
            accessibilityEvent.setFromIndex(p0(U(0)));
            accessibilityEvent.setToIndex(p0(U(V() - 1)));
        }
    }

    @Override // com.google.android.material.carousel.a
    public int a() {
        return w0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b0(View view, Rect rect) {
        super.b0(view, rect);
        float centerX = rect.centerX();
        float width = (rect.width() - n2(centerX, t2(this.M.e(), centerX, true))) / 2.0f;
        rect.set((int) (rect.left + width), rect.top, (int) (rect.right - width), rect.bottom);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void g1(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        boolean z10;
        int i10;
        if (b0Var.b() <= 0) {
            u1(wVar);
            this.N = 0;
            return;
        }
        boolean u22 = u2();
        if (this.L == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            View o10 = wVar.o(0);
            J0(o10, 0, 0);
            com.google.android.material.carousel.c b10 = this.K.b(this, o10);
            if (u22) {
                b10 = com.google.android.material.carousel.c.j(b10);
            }
            this.L = com.google.android.material.carousel.d.e(this, b10);
        }
        int k22 = k2(this.L);
        int i22 = i2(b0Var, this.L);
        if (u22) {
            i10 = i22;
        } else {
            i10 = k22;
        }
        this.G = i10;
        if (u22) {
            i22 = k22;
        }
        this.H = i22;
        if (z10) {
            this.F = k22;
        } else {
            int i11 = this.F;
            this.F = i11 + j2(0, i11, i10, i22);
        }
        this.N = t2.a.b(this.N, 0, b0Var.b());
        E2();
        I(wVar);
        l2(wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void h1(RecyclerView.b0 b0Var) {
        super.h1(b0Var);
        if (V() == 0) {
            this.N = 0;
        } else {
            this.N = p0(U(0));
        }
        F2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean w() {
        return true;
    }
}
