package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.p0;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HeaderBehavior.java */
/* loaded from: classes3.dex */
public abstract class k<V extends View> extends m<V> {

    /* renamed from: d  reason: collision with root package name */
    private Runnable f9486d;

    /* renamed from: e  reason: collision with root package name */
    OverScroller f9487e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f9488f;

    /* renamed from: g  reason: collision with root package name */
    private int f9489g;

    /* renamed from: h  reason: collision with root package name */
    private int f9490h;

    /* renamed from: i  reason: collision with root package name */
    private int f9491i;

    /* renamed from: j  reason: collision with root package name */
    private VelocityTracker f9492j;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: HeaderBehavior.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        private final CoordinatorLayout f9493f;

        /* renamed from: m  reason: collision with root package name */
        private final V f9494m;

        a(CoordinatorLayout coordinatorLayout, V v10) {
            this.f9493f = coordinatorLayout;
            this.f9494m = v10;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f9494m != null && (overScroller = k.this.f9487e) != null) {
                if (overScroller.computeScrollOffset()) {
                    k kVar = k.this;
                    kVar.P(this.f9493f, this.f9494m, kVar.f9487e.getCurrY());
                    p0.m0(this.f9494m, this);
                    return;
                }
                k.this.N(this.f9493f, this.f9494m);
            }
        }
    }

    public k() {
        this.f9489g = -1;
        this.f9491i = -1;
    }

    private void I() {
        if (this.f9492j == null) {
            this.f9492j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L4e
            r4 = 2
            if (r0 == r4) goto L2d
            r12 = 3
            if (r0 == r12) goto L72
            r12 = 6
            if (r0 == r12) goto L13
            goto L4c
        L13:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L1b
            r12 = 1
            goto L1c
        L1b:
            r12 = 0
        L1c:
            int r13 = r14.getPointerId(r12)
            r11.f9489g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f9490h = r12
            goto L4c
        L2d:
            int r0 = r11.f9489g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r3
        L36:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f9490h
            int r7 = r1 - r0
            r11.f9490h = r0
            int r8 = r11.K(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.O(r5, r6, r7, r8, r9)
        L4c:
            r12 = 0
            goto L81
        L4e:
            android.view.VelocityTracker r0 = r11.f9492j
            if (r0 == 0) goto L72
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f9492j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f9492j
            int r4 = r11.f9489g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.L(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.J(r6, r7, r8, r9, r10)
            r12 = 1
            goto L73
        L72:
            r12 = 0
        L73:
            r11.f9488f = r3
            r11.f9489g = r1
            android.view.VelocityTracker r13 = r11.f9492j
            if (r13 == 0) goto L81
            r13.recycle()
            r13 = 0
            r11.f9492j = r13
        L81:
            android.view.VelocityTracker r13 = r11.f9492j
            if (r13 == 0) goto L88
            r13.addMovement(r14)
        L88:
            boolean r13 = r11.f9488f
            if (r13 != 0) goto L90
            if (r12 == 0) goto L8f
            goto L90
        L8f:
            r2 = 0
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.k.D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    boolean H(V v10) {
        return false;
    }

    final boolean J(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, float f10) {
        Runnable runnable = this.f9486d;
        if (runnable != null) {
            v10.removeCallbacks(runnable);
            this.f9486d = null;
        }
        if (this.f9487e == null) {
            this.f9487e = new OverScroller(v10.getContext());
        }
        this.f9487e.fling(0, E(), 0, Math.round(f10), 0, 0, i10, i11);
        if (this.f9487e.computeScrollOffset()) {
            a aVar = new a(coordinatorLayout, v10);
            this.f9486d = aVar;
            p0.m0(v10, aVar);
            return true;
        }
        N(coordinatorLayout, v10);
        return false;
    }

    int K(V v10) {
        return -v10.getHeight();
    }

    int L(V v10) {
        return v10.getHeight();
    }

    int M() {
        return E();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int O(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        return Q(coordinatorLayout, v10, M() - i10, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int P(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        return Q(coordinatorLayout, v10, i10, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
    }

    int Q(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        int b10;
        int E = E();
        if (i11 != 0 && E >= i11 && E <= i12 && E != (b10 = t2.a.b(i10, i11, i12))) {
            G(b10);
            return E - b10;
        }
        return 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10;
        int findPointerIndex;
        if (this.f9491i < 0) {
            this.f9491i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f9488f) {
            int i10 = this.f9489g;
            if (i10 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y10 - this.f9490h) > this.f9491i) {
                this.f9490h = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f9489g = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            if (H(v10) && coordinatorLayout.v(v10, x10, y11)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f9488f = z10;
            if (z10) {
                this.f9490h = y11;
                this.f9489g = motionEvent.getPointerId(0);
                I();
                OverScroller overScroller = this.f9487e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f9487e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f9492j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9489g = -1;
        this.f9491i = -1;
    }

    void N(CoordinatorLayout coordinatorLayout, V v10) {
    }
}
