package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.n0;
import androidx.core.view.accessibility.s0;
import androidx.core.view.p0;
import y2.c;

/* loaded from: classes3.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    y2.c f9566a;

    /* renamed from: b  reason: collision with root package name */
    c f9567b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f9568c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f9569d;

    /* renamed from: f  reason: collision with root package name */
    private boolean f9571f;

    /* renamed from: e  reason: collision with root package name */
    private float f9570e = 0.0f;

    /* renamed from: g  reason: collision with root package name */
    int f9572g = 2;

    /* renamed from: h  reason: collision with root package name */
    float f9573h = 0.5f;

    /* renamed from: i  reason: collision with root package name */
    float f9574i = 0.0f;

    /* renamed from: j  reason: collision with root package name */
    float f9575j = 0.5f;

    /* renamed from: k  reason: collision with root package name */
    private final c.AbstractC0604c f9576k = new a();

    /* loaded from: classes3.dex */
    class a extends c.AbstractC0604c {

        /* renamed from: a  reason: collision with root package name */
        private int f9577a;

        /* renamed from: b  reason: collision with root package name */
        private int f9578b = -1;

        a() {
        }

        private boolean n(View view, float f10) {
            boolean z10;
            if (f10 != 0.0f) {
                if (p0.E(view) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i10 = SwipeDismissBehavior.this.f9572g;
                if (i10 == 2) {
                    return true;
                }
                if (i10 == 0) {
                    if (z10) {
                        if (f10 >= 0.0f) {
                            return false;
                        }
                    } else if (f10 <= 0.0f) {
                        return false;
                    }
                    return true;
                } else if (i10 != 1) {
                    return false;
                } else {
                    if (z10) {
                        if (f10 <= 0.0f) {
                            return false;
                        }
                    } else if (f10 >= 0.0f) {
                        return false;
                    }
                    return true;
                }
            }
            if (Math.abs(view.getLeft() - this.f9577a) < Math.round(view.getWidth() * SwipeDismissBehavior.this.f9573h)) {
                return false;
            }
            return true;
        }

        @Override // y2.c.AbstractC0604c
        public int a(View view, int i10, int i11) {
            boolean z10;
            int width;
            int width2;
            int width3;
            if (p0.E(view) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i12 = SwipeDismissBehavior.this.f9572g;
            if (i12 == 0) {
                if (z10) {
                    width = this.f9577a - view.getWidth();
                    width2 = this.f9577a;
                } else {
                    width = this.f9577a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i12 == 1) {
                if (z10) {
                    width = this.f9577a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                } else {
                    width = this.f9577a - view.getWidth();
                    width2 = this.f9577a;
                }
            } else {
                width = this.f9577a - view.getWidth();
                width2 = view.getWidth() + this.f9577a;
            }
            return SwipeDismissBehavior.H(width, i10, width2);
        }

        @Override // y2.c.AbstractC0604c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // y2.c.AbstractC0604c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // y2.c.AbstractC0604c
        public void i(View view, int i10) {
            this.f9578b = i10;
            this.f9577a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.f9569d = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.f9569d = false;
            }
        }

        @Override // y2.c.AbstractC0604c
        public void j(int i10) {
            c cVar = SwipeDismissBehavior.this.f9567b;
            if (cVar != null) {
                cVar.b(i10);
            }
        }

        @Override // y2.c.AbstractC0604c
        public void k(View view, int i10, int i11, int i12, int i13) {
            float width = view.getWidth() * SwipeDismissBehavior.this.f9574i;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.f9575j;
            float abs = Math.abs(i10 - this.f9577a);
            if (abs <= width) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.G(0.0f, 1.0f - SwipeDismissBehavior.J(width, width2, abs), 1.0f));
            }
        }

        @Override // y2.c.AbstractC0604c
        public void l(View view, float f10, float f11) {
            int i10;
            boolean z10;
            c cVar;
            this.f9578b = -1;
            int width = view.getWidth();
            if (n(view, f10)) {
                if (f10 >= 0.0f) {
                    int left = view.getLeft();
                    int i11 = this.f9577a;
                    if (left >= i11) {
                        i10 = i11 + width;
                        z10 = true;
                    }
                }
                i10 = this.f9577a - width;
                z10 = true;
            } else {
                i10 = this.f9577a;
                z10 = false;
            }
            if (SwipeDismissBehavior.this.f9566a.O(i10, view.getTop())) {
                p0.m0(view, new d(view, z10));
            } else if (z10 && (cVar = SwipeDismissBehavior.this.f9567b) != null) {
                cVar.a(view);
            }
        }

        @Override // y2.c.AbstractC0604c
        public boolean m(View view, int i10) {
            int i11 = this.f9578b;
            if ((i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.F(view)) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements s0 {
        b() {
        }

        @Override // androidx.core.view.accessibility.s0
        public boolean a(View view, s0.a aVar) {
            boolean z10;
            boolean z11 = false;
            if (!SwipeDismissBehavior.this.F(view)) {
                return false;
            }
            if (p0.E(view) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = SwipeDismissBehavior.this.f9572g;
            if ((i10 == 0 && z10) || (i10 == 1 && !z10)) {
                z11 = true;
            }
            int width = view.getWidth();
            if (z11) {
                width = -width;
            }
            p0.e0(view, width);
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.f9567b;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a(View view);

        void b(int i10);
    }

    /* loaded from: classes3.dex */
    private class d implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        private final View f9581f;

        /* renamed from: m  reason: collision with root package name */
        private final boolean f9582m;

        d(View view, boolean z10) {
            this.f9581f = view;
            this.f9582m = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            y2.c cVar2 = SwipeDismissBehavior.this.f9566a;
            if (cVar2 != null && cVar2.m(true)) {
                p0.m0(this.f9581f, this);
            } else if (this.f9582m && (cVar = SwipeDismissBehavior.this.f9567b) != null) {
                cVar.a(this.f9581f);
            }
        }
    }

    static float G(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    static int H(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    private void I(ViewGroup viewGroup) {
        y2.c o10;
        if (this.f9566a == null) {
            if (this.f9571f) {
                o10 = y2.c.n(viewGroup, this.f9570e, this.f9576k);
            } else {
                o10 = y2.c.o(viewGroup, this.f9576k);
            }
            this.f9566a = o10;
        }
    }

    static float J(float f10, float f11, float f12) {
        return (f12 - f10) / (f11 - f10);
    }

    private void O(View view) {
        p0.o0(view, 1048576);
        if (F(view)) {
            p0.q0(view, n0.a.f4097y, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (this.f9566a != null) {
            if (!this.f9569d || motionEvent.getActionMasked() != 3) {
                this.f9566a.F(motionEvent);
                return true;
            }
            return true;
        }
        return false;
    }

    public boolean F(View view) {
        return true;
    }

    public void K(float f10) {
        this.f9575j = G(0.0f, f10, 1.0f);
    }

    public void L(c cVar) {
        this.f9567b = cVar;
    }

    public void M(float f10) {
        this.f9574i = G(0.0f, f10, 1.0f);
    }

    public void N(int i10) {
        this.f9572g = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10 = this.f9568c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f9568c = false;
            }
        } else {
            z10 = coordinatorLayout.v(v10, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f9568c = z10;
        }
        if (!z10) {
            return false;
        }
        I(coordinatorLayout);
        if (!this.f9569d && this.f9566a.P(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        boolean l10 = super.l(coordinatorLayout, v10, i10);
        if (p0.C(v10) == 0) {
            p0.F0(v10, 1);
            O(v10);
        }
        return l10;
    }
}
