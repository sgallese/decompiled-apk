package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import androidx.recyclerview.widget.u;
import com.google.android.flexbox.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class FlexboxLayoutManager extends RecyclerView.p implements com.google.android.flexbox.a, RecyclerView.a0.b {

    /* renamed from: f0  reason: collision with root package name */
    private static final Rect f9340f0 = new Rect();
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private boolean K;
    private boolean L;
    private List<com.google.android.flexbox.b> M;
    private final com.google.android.flexbox.c N;
    private RecyclerView.w O;
    private RecyclerView.b0 P;
    private c Q;
    private b R;
    private u S;
    private u T;
    private SavedState U;
    private int V;
    private int W;
    private int X;
    private int Y;
    private boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    private SparseArray<View> f9341a0;

    /* renamed from: b0  reason: collision with root package name */
    private final Context f9342b0;

    /* renamed from: c0  reason: collision with root package name */
    private View f9343c0;

    /* renamed from: d0  reason: collision with root package name */
    private int f9344d0;

    /* renamed from: e0  reason: collision with root package name */
    private c.b f9345e0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        private int f9357a;

        /* renamed from: b  reason: collision with root package name */
        private int f9358b;

        /* renamed from: c  reason: collision with root package name */
        private int f9359c;

        /* renamed from: d  reason: collision with root package name */
        private int f9360d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f9361e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f9362f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f9363g;

        private b() {
            this.f9360d = 0;
        }

        static /* synthetic */ int l(b bVar, int i10) {
            int i11 = bVar.f9360d + i10;
            bVar.f9360d = i11;
            return i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r() {
            int m10;
            int w02;
            if (!FlexboxLayoutManager.this.l() && FlexboxLayoutManager.this.K) {
                if (this.f9361e) {
                    w02 = FlexboxLayoutManager.this.S.i();
                } else {
                    w02 = FlexboxLayoutManager.this.w0() - FlexboxLayoutManager.this.S.m();
                }
                this.f9359c = w02;
                return;
            }
            if (this.f9361e) {
                m10 = FlexboxLayoutManager.this.S.i();
            } else {
                m10 = FlexboxLayoutManager.this.S.m();
            }
            this.f9359c = m10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(View view) {
            u uVar = FlexboxLayoutManager.this.G == 0 ? FlexboxLayoutManager.this.T : FlexboxLayoutManager.this.S;
            if (!FlexboxLayoutManager.this.l() && FlexboxLayoutManager.this.K) {
                if (this.f9361e) {
                    this.f9359c = uVar.g(view) + uVar.o();
                } else {
                    this.f9359c = uVar.d(view);
                }
            } else if (this.f9361e) {
                this.f9359c = uVar.d(view) + uVar.o();
            } else {
                this.f9359c = uVar.g(view);
            }
            this.f9357a = FlexboxLayoutManager.this.p0(view);
            int i10 = 0;
            this.f9363g = false;
            int[] iArr = FlexboxLayoutManager.this.N.f9395c;
            int i11 = this.f9357a;
            if (i11 == -1) {
                i11 = 0;
            }
            int i12 = iArr[i11];
            if (i12 != -1) {
                i10 = i12;
            }
            this.f9358b = i10;
            if (FlexboxLayoutManager.this.M.size() > this.f9358b) {
                this.f9357a = ((com.google.android.flexbox.b) FlexboxLayoutManager.this.M.get(this.f9358b)).f9389o;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t() {
            this.f9357a = -1;
            this.f9358b = -1;
            this.f9359c = RecyclerView.UNDEFINED_DURATION;
            boolean z10 = false;
            this.f9362f = false;
            this.f9363g = false;
            if (FlexboxLayoutManager.this.l()) {
                if (FlexboxLayoutManager.this.G == 0) {
                    if (FlexboxLayoutManager.this.F == 1) {
                        z10 = true;
                    }
                    this.f9361e = z10;
                    return;
                }
                if (FlexboxLayoutManager.this.G == 2) {
                    z10 = true;
                }
                this.f9361e = z10;
            } else if (FlexboxLayoutManager.this.G == 0) {
                if (FlexboxLayoutManager.this.F == 3) {
                    z10 = true;
                }
                this.f9361e = z10;
            } else {
                if (FlexboxLayoutManager.this.G == 2) {
                    z10 = true;
                }
                this.f9361e = z10;
            }
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f9357a + ", mFlexLinePosition=" + this.f9358b + ", mCoordinate=" + this.f9359c + ", mPerpendicularCoordinate=" + this.f9360d + ", mLayoutFromEnd=" + this.f9361e + ", mValid=" + this.f9362f + ", mAssignedFromSavedState=" + this.f9363g + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private int f9365a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f9366b;

        /* renamed from: c  reason: collision with root package name */
        private int f9367c;

        /* renamed from: d  reason: collision with root package name */
        private int f9368d;

        /* renamed from: e  reason: collision with root package name */
        private int f9369e;

        /* renamed from: f  reason: collision with root package name */
        private int f9370f;

        /* renamed from: g  reason: collision with root package name */
        private int f9371g;

        /* renamed from: h  reason: collision with root package name */
        private int f9372h;

        /* renamed from: i  reason: collision with root package name */
        private int f9373i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f9374j;

        private c() {
            this.f9372h = 1;
            this.f9373i = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean D(RecyclerView.b0 b0Var, List<com.google.android.flexbox.b> list) {
            int i10;
            int i11 = this.f9368d;
            if (i11 >= 0 && i11 < b0Var.b() && (i10 = this.f9367c) >= 0 && i10 < list.size()) {
                return true;
            }
            return false;
        }

        static /* synthetic */ int c(c cVar, int i10) {
            int i11 = cVar.f9369e + i10;
            cVar.f9369e = i11;
            return i11;
        }

        static /* synthetic */ int d(c cVar, int i10) {
            int i11 = cVar.f9369e - i10;
            cVar.f9369e = i11;
            return i11;
        }

        static /* synthetic */ int i(c cVar, int i10) {
            int i11 = cVar.f9365a - i10;
            cVar.f9365a = i11;
            return i11;
        }

        static /* synthetic */ int l(c cVar) {
            int i10 = cVar.f9367c;
            cVar.f9367c = i10 + 1;
            return i10;
        }

        static /* synthetic */ int m(c cVar) {
            int i10 = cVar.f9367c;
            cVar.f9367c = i10 - 1;
            return i10;
        }

        static /* synthetic */ int n(c cVar, int i10) {
            int i11 = cVar.f9367c + i10;
            cVar.f9367c = i11;
            return i11;
        }

        static /* synthetic */ int q(c cVar, int i10) {
            int i11 = cVar.f9370f + i10;
            cVar.f9370f = i11;
            return i11;
        }

        static /* synthetic */ int u(c cVar, int i10) {
            int i11 = cVar.f9368d + i10;
            cVar.f9368d = i11;
            return i11;
        }

        static /* synthetic */ int v(c cVar, int i10) {
            int i11 = cVar.f9368d - i10;
            cVar.f9368d = i11;
            return i11;
        }

        public String toString() {
            return "LayoutState{mAvailable=" + this.f9365a + ", mFlexLinePosition=" + this.f9367c + ", mPosition=" + this.f9368d + ", mOffset=" + this.f9369e + ", mScrollingOffset=" + this.f9370f + ", mLastScrollDelta=" + this.f9371g + ", mItemDirection=" + this.f9372h + ", mLayoutDirection=" + this.f9373i + '}';
        }
    }

    public FlexboxLayoutManager(Context context, int i10) {
        this(context, i10, 1);
    }

    private int A2(View view) {
        return g0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).topMargin;
    }

    private int B2(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        boolean z10;
        if (V() == 0 || i10 == 0) {
            return 0;
        }
        k2();
        int i11 = 1;
        this.Q.f9374j = true;
        if (!l() && this.K) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 ? i10 <= 0 : i10 >= 0) {
            i11 = -1;
        }
        int abs = Math.abs(i10);
        W2(i11, abs);
        int l22 = this.Q.f9370f + l2(wVar, b0Var, this.Q);
        if (l22 < 0) {
            return 0;
        }
        if (z10) {
            if (abs > l22) {
                i10 = (-i11) * l22;
            }
        } else if (abs > l22) {
            i10 = i11 * l22;
        }
        this.S.r(-i10);
        this.Q.f9371g = i10;
        return i10;
    }

    private int C2(int i10) {
        int height;
        int i02;
        int i11;
        boolean z10 = false;
        if (V() == 0 || i10 == 0) {
            return 0;
        }
        k2();
        boolean l10 = l();
        View view = this.f9343c0;
        if (l10) {
            height = view.getWidth();
        } else {
            height = view.getHeight();
        }
        if (l10) {
            i02 = w0();
        } else {
            i02 = i0();
        }
        if (l0() == 1) {
            z10 = true;
        }
        if (z10) {
            int abs = Math.abs(i10);
            if (i10 < 0) {
                i11 = Math.min((i02 + this.R.f9360d) - height, abs);
            } else if (this.R.f9360d + i10 > 0) {
                i11 = this.R.f9360d;
            } else {
                return i10;
            }
        } else if (i10 > 0) {
            return Math.min((i02 - this.R.f9360d) - height, i10);
        } else {
            if (this.R.f9360d + i10 < 0) {
                i11 = this.R.f9360d;
            } else {
                return i10;
            }
        }
        return -i11;
    }

    private boolean D2(View view, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int w02 = w0() - getPaddingRight();
        int i02 = i0() - getPaddingBottom();
        int y22 = y2(view);
        int A2 = A2(view);
        int z22 = z2(view);
        int w22 = w2(view);
        if (paddingLeft <= y22 && w02 >= z22) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (y22 < w02 && z22 < paddingLeft) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (paddingTop <= A2 && i02 >= w22) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (A2 < i02 && w22 < paddingTop) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (z10) {
            if (z11 && z13) {
                return true;
            }
            return false;
        } else if (z12 && z14) {
            return true;
        } else {
            return false;
        }
    }

    private int E2(com.google.android.flexbox.b bVar, c cVar) {
        if (l()) {
            return F2(bVar, cVar);
        }
        return G2(bVar, cVar);
    }

    private static boolean F0(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (i12 > 0 && i10 != i12) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i10) {
                return false;
            }
            return true;
        } else if (size < i10) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int F2(com.google.android.flexbox.b r22, com.google.android.flexbox.FlexboxLayoutManager.c r23) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.F2(com.google.android.flexbox.b, com.google.android.flexbox.FlexboxLayoutManager$c):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int G2(com.google.android.flexbox.b r26, com.google.android.flexbox.FlexboxLayoutManager.c r27) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.G2(com.google.android.flexbox.b, com.google.android.flexbox.FlexboxLayoutManager$c):int");
    }

    private void H2(RecyclerView.w wVar, c cVar) {
        if (!cVar.f9374j) {
            return;
        }
        if (cVar.f9373i == -1) {
            J2(wVar, cVar);
        } else {
            K2(wVar, cVar);
        }
    }

    private void I2(RecyclerView.w wVar, int i10, int i11) {
        while (i11 >= i10) {
            x1(i11, wVar);
            i11--;
        }
    }

    private void J2(RecyclerView.w wVar, c cVar) {
        int V;
        int i10;
        View U;
        int i11;
        if (cVar.f9370f < 0 || (V = V()) == 0 || (U = U(V - 1)) == null || (i11 = this.N.f9395c[p0(U)]) == -1) {
            return;
        }
        com.google.android.flexbox.b bVar = this.M.get(i11);
        int i12 = i10;
        while (true) {
            if (i12 < 0) {
                break;
            }
            View U2 = U(i12);
            if (U2 != null) {
                if (!d2(U2, cVar.f9370f)) {
                    break;
                } else if (bVar.f9389o != p0(U2)) {
                    continue;
                } else if (i11 <= 0) {
                    V = i12;
                    break;
                } else {
                    i11 += cVar.f9373i;
                    bVar = this.M.get(i11);
                    V = i12;
                }
            }
            i12--;
        }
        I2(wVar, V, i10);
    }

    private void K2(RecyclerView.w wVar, c cVar) {
        int V;
        View U;
        if (cVar.f9370f < 0 || (V = V()) == 0 || (U = U(0)) == null) {
            return;
        }
        int i10 = this.N.f9395c[p0(U)];
        int i11 = -1;
        if (i10 == -1) {
            return;
        }
        com.google.android.flexbox.b bVar = this.M.get(i10);
        int i12 = 0;
        while (true) {
            if (i12 >= V) {
                break;
            }
            View U2 = U(i12);
            if (U2 != null) {
                if (!e2(U2, cVar.f9370f)) {
                    break;
                } else if (bVar.f9390p != p0(U2)) {
                    continue;
                } else if (i10 >= this.M.size() - 1) {
                    i11 = i12;
                    break;
                } else {
                    i10 += cVar.f9373i;
                    bVar = this.M.get(i10);
                    i11 = i12;
                }
            }
            i12++;
        }
        I2(wVar, 0, i11);
    }

    private void L2() {
        int x02;
        boolean z10;
        if (l()) {
            x02 = j0();
        } else {
            x02 = x0();
        }
        c cVar = this.Q;
        if (x02 != 0 && x02 != Integer.MIN_VALUE) {
            z10 = false;
        } else {
            z10 = true;
        }
        cVar.f9366b = z10;
    }

    private void M2() {
        boolean z10;
        boolean z11;
        boolean z12;
        int l02 = l0();
        int i10 = this.F;
        boolean z13 = false;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        this.K = false;
                        this.L = false;
                        return;
                    }
                    if (l02 == 1) {
                        z13 = true;
                    }
                    this.K = z13;
                    if (this.G == 2) {
                        this.K = !z13;
                    }
                    this.L = true;
                    return;
                }
                if (l02 == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.K = z12;
                if (this.G == 2) {
                    this.K = !z12;
                }
                this.L = false;
                return;
            }
            if (l02 != 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.K = z11;
            if (this.G == 2) {
                z13 = true;
            }
            this.L = z13;
            return;
        }
        if (l02 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.K = z10;
        if (this.G == 2) {
            z13 = true;
        }
        this.L = z13;
    }

    private boolean P1(View view, int i10, int i11, RecyclerView.q qVar) {
        if (!view.isLayoutRequested() && E0() && F0(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) qVar).width) && F0(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) qVar).height)) {
            return false;
        }
        return true;
    }

    private boolean R2(RecyclerView.b0 b0Var, b bVar) {
        View m22;
        int m10;
        boolean z10 = false;
        if (V() == 0) {
            return false;
        }
        if (bVar.f9361e) {
            m22 = p2(b0Var.b());
        } else {
            m22 = m2(b0Var.b());
        }
        if (m22 != null) {
            bVar.s(m22);
            if (!b0Var.e() && V1()) {
                if (this.S.g(m22) >= this.S.i() || this.S.d(m22) < this.S.m()) {
                    z10 = true;
                }
                if (z10) {
                    if (bVar.f9361e) {
                        m10 = this.S.i();
                    } else {
                        m10 = this.S.m();
                    }
                    bVar.f9359c = m10;
                }
            }
            return true;
        }
        return false;
    }

    private boolean S2(RecyclerView.b0 b0Var, b bVar, SavedState savedState) {
        int i10;
        View U;
        int g10;
        boolean z10 = false;
        if (!b0Var.e() && (i10 = this.V) != -1) {
            if (i10 >= 0 && i10 < b0Var.b()) {
                bVar.f9357a = this.V;
                bVar.f9358b = this.N.f9395c[bVar.f9357a];
                SavedState savedState2 = this.U;
                if (savedState2 != null && savedState2.g(b0Var.b())) {
                    bVar.f9359c = this.S.m() + savedState.f9356m;
                    bVar.f9363g = true;
                    bVar.f9358b = -1;
                    return true;
                } else if (this.W == Integer.MIN_VALUE) {
                    View O = O(this.V);
                    if (O != null) {
                        if (this.S.e(O) > this.S.n()) {
                            bVar.r();
                            return true;
                        } else if (this.S.g(O) - this.S.m() < 0) {
                            bVar.f9359c = this.S.m();
                            bVar.f9361e = false;
                            return true;
                        } else if (this.S.i() - this.S.d(O) < 0) {
                            bVar.f9359c = this.S.i();
                            bVar.f9361e = true;
                            return true;
                        } else {
                            if (bVar.f9361e) {
                                g10 = this.S.d(O) + this.S.o();
                            } else {
                                g10 = this.S.g(O);
                            }
                            bVar.f9359c = g10;
                        }
                    } else {
                        if (V() > 0 && (U = U(0)) != null) {
                            if (this.V < p0(U)) {
                                z10 = true;
                            }
                            bVar.f9361e = z10;
                        }
                        bVar.r();
                    }
                    return true;
                } else {
                    if (l() || !this.K) {
                        bVar.f9359c = this.S.m() + this.W;
                    } else {
                        bVar.f9359c = this.W - this.S.j();
                    }
                    return true;
                }
            }
            this.V = -1;
            this.W = RecyclerView.UNDEFINED_DURATION;
        }
        return false;
    }

    private void T2(RecyclerView.b0 b0Var, b bVar) {
        if (!S2(b0Var, bVar, this.U) && !R2(b0Var, bVar)) {
            bVar.r();
            bVar.f9357a = 0;
            bVar.f9358b = 0;
        }
    }

    private void U2(int i10) {
        if (i10 >= r2()) {
            return;
        }
        int V = V();
        this.N.t(V);
        this.N.u(V);
        this.N.s(V);
        if (i10 >= this.N.f9395c.length) {
            return;
        }
        this.f9344d0 = i10;
        View x22 = x2();
        if (x22 == null) {
            return;
        }
        this.V = p0(x22);
        if (!l() && this.K) {
            this.W = this.S.d(x22) + this.S.j();
        } else {
            this.W = this.S.g(x22) - this.S.m();
        }
    }

    private void V2(int i10) {
        int i11;
        int i12;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(w0(), x0());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i0(), j0());
        int w02 = w0();
        int i02 = i0();
        boolean z10 = true;
        if (l()) {
            int i13 = this.X;
            if (i13 == Integer.MIN_VALUE || i13 == w02) {
                z10 = false;
            }
            i11 = this.Q.f9366b ? this.f9342b0.getResources().getDisplayMetrics().heightPixels : this.Q.f9365a;
        } else {
            int i14 = this.Y;
            if (i14 == Integer.MIN_VALUE || i14 == i02) {
                z10 = false;
            }
            if (!this.Q.f9366b) {
                i11 = this.Q.f9365a;
            } else {
                i11 = this.f9342b0.getResources().getDisplayMetrics().widthPixels;
            }
        }
        int i15 = i11;
        this.X = w02;
        this.Y = i02;
        int i16 = this.f9344d0;
        if (i16 == -1 && (this.V != -1 || z10)) {
            if (this.R.f9361e) {
                return;
            }
            this.M.clear();
            this.f9345e0.a();
            if (l()) {
                this.N.e(this.f9345e0, makeMeasureSpec, makeMeasureSpec2, i15, this.R.f9357a, this.M);
            } else {
                this.N.h(this.f9345e0, makeMeasureSpec, makeMeasureSpec2, i15, this.R.f9357a, this.M);
            }
            this.M = this.f9345e0.f9398a;
            this.N.p(makeMeasureSpec, makeMeasureSpec2);
            this.N.X();
            b bVar = this.R;
            bVar.f9358b = this.N.f9395c[bVar.f9357a];
            this.Q.f9367c = this.R.f9358b;
            return;
        }
        if (i16 == -1) {
            i12 = this.R.f9357a;
        } else {
            i12 = Math.min(i16, this.R.f9357a);
        }
        int i17 = i12;
        this.f9345e0.a();
        if (l()) {
            if (this.M.size() > 0) {
                this.N.j(this.M, i17);
                this.N.b(this.f9345e0, makeMeasureSpec, makeMeasureSpec2, i15, i17, this.R.f9357a, this.M);
            } else {
                this.N.s(i10);
                this.N.d(this.f9345e0, makeMeasureSpec, makeMeasureSpec2, i15, 0, this.M);
            }
        } else if (this.M.size() > 0) {
            this.N.j(this.M, i17);
            this.N.b(this.f9345e0, makeMeasureSpec2, makeMeasureSpec, i15, i17, this.R.f9357a, this.M);
        } else {
            this.N.s(i10);
            this.N.g(this.f9345e0, makeMeasureSpec, makeMeasureSpec2, i15, 0, this.M);
        }
        this.M = this.f9345e0.f9398a;
        this.N.q(makeMeasureSpec, makeMeasureSpec2, i17);
        this.N.Y(i17);
    }

    private void W2(int i10, int i11) {
        boolean z10;
        int i12;
        this.Q.f9373i = i10;
        boolean l10 = l();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(w0(), x0());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i0(), j0());
        if (!l10 && this.K) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 == 1) {
            View U = U(V() - 1);
            if (U == null) {
                return;
            }
            this.Q.f9369e = this.S.d(U);
            int p02 = p0(U);
            View q22 = q2(U, this.M.get(this.N.f9395c[p02]));
            this.Q.f9372h = 1;
            c cVar = this.Q;
            cVar.f9368d = p02 + cVar.f9372h;
            if (this.N.f9395c.length <= this.Q.f9368d) {
                this.Q.f9367c = -1;
            } else {
                c cVar2 = this.Q;
                cVar2.f9367c = this.N.f9395c[cVar2.f9368d];
            }
            if (z10) {
                this.Q.f9369e = this.S.g(q22);
                this.Q.f9370f = (-this.S.g(q22)) + this.S.m();
                c cVar3 = this.Q;
                cVar3.f9370f = Math.max(cVar3.f9370f, 0);
            } else {
                this.Q.f9369e = this.S.d(q22);
                this.Q.f9370f = this.S.d(q22) - this.S.i();
            }
            if ((this.Q.f9367c == -1 || this.Q.f9367c > this.M.size() - 1) && this.Q.f9368d <= getFlexItemCount()) {
                int i13 = i11 - this.Q.f9370f;
                this.f9345e0.a();
                if (i13 > 0) {
                    if (l10) {
                        this.N.d(this.f9345e0, makeMeasureSpec, makeMeasureSpec2, i13, this.Q.f9368d, this.M);
                    } else {
                        this.N.g(this.f9345e0, makeMeasureSpec, makeMeasureSpec2, i13, this.Q.f9368d, this.M);
                    }
                    this.N.q(makeMeasureSpec, makeMeasureSpec2, this.Q.f9368d);
                    this.N.Y(this.Q.f9368d);
                }
            }
        } else {
            View U2 = U(0);
            if (U2 == null) {
                return;
            }
            this.Q.f9369e = this.S.g(U2);
            int p03 = p0(U2);
            View n22 = n2(U2, this.M.get(this.N.f9395c[p03]));
            this.Q.f9372h = 1;
            int i14 = this.N.f9395c[p03];
            if (i14 == -1) {
                i14 = 0;
            }
            if (i14 <= 0) {
                this.Q.f9368d = -1;
            } else {
                this.Q.f9368d = p03 - this.M.get(i14 - 1).b();
            }
            c cVar4 = this.Q;
            if (i14 > 0) {
                i12 = i14 - 1;
            } else {
                i12 = 0;
            }
            cVar4.f9367c = i12;
            if (z10) {
                this.Q.f9369e = this.S.d(n22);
                this.Q.f9370f = this.S.d(n22) - this.S.i();
                c cVar5 = this.Q;
                cVar5.f9370f = Math.max(cVar5.f9370f, 0);
            } else {
                this.Q.f9369e = this.S.g(n22);
                this.Q.f9370f = (-this.S.g(n22)) + this.S.m();
            }
        }
        c cVar6 = this.Q;
        cVar6.f9365a = i11 - cVar6.f9370f;
    }

    private void X2(b bVar, boolean z10, boolean z11) {
        if (!z11) {
            this.Q.f9366b = false;
        } else {
            L2();
        }
        if (!l() && this.K) {
            this.Q.f9365a = bVar.f9359c - getPaddingRight();
        } else {
            this.Q.f9365a = this.S.i() - bVar.f9359c;
        }
        this.Q.f9368d = bVar.f9357a;
        this.Q.f9372h = 1;
        this.Q.f9373i = 1;
        this.Q.f9369e = bVar.f9359c;
        this.Q.f9370f = RecyclerView.UNDEFINED_DURATION;
        this.Q.f9367c = bVar.f9358b;
        if (z10 && this.M.size() > 1 && bVar.f9358b >= 0 && bVar.f9358b < this.M.size() - 1) {
            com.google.android.flexbox.b bVar2 = this.M.get(bVar.f9358b);
            c.l(this.Q);
            c.u(this.Q, bVar2.b());
        }
    }

    private void Y2(b bVar, boolean z10, boolean z11) {
        if (!z11) {
            this.Q.f9366b = false;
        } else {
            L2();
        }
        if (!l() && this.K) {
            this.Q.f9365a = (this.f9343c0.getWidth() - bVar.f9359c) - this.S.m();
        } else {
            this.Q.f9365a = bVar.f9359c - this.S.m();
        }
        this.Q.f9368d = bVar.f9357a;
        this.Q.f9372h = 1;
        this.Q.f9373i = -1;
        this.Q.f9369e = bVar.f9359c;
        this.Q.f9370f = RecyclerView.UNDEFINED_DURATION;
        this.Q.f9367c = bVar.f9358b;
        if (z10 && bVar.f9358b > 0 && this.M.size() > bVar.f9358b) {
            com.google.android.flexbox.b bVar2 = this.M.get(bVar.f9358b);
            c.m(this.Q);
            c.v(this.Q, bVar2.b());
        }
    }

    private boolean d2(View view, int i10) {
        if (!l() && this.K) {
            if (this.S.d(view) <= i10) {
                return true;
            }
            return false;
        } else if (this.S.g(view) >= this.S.h() - i10) {
            return true;
        } else {
            return false;
        }
    }

    private boolean e2(View view, int i10) {
        if (!l() && this.K) {
            if (this.S.h() - this.S.g(view) <= i10) {
                return true;
            }
            return false;
        } else if (this.S.d(view) <= i10) {
            return true;
        } else {
            return false;
        }
    }

    private void f2() {
        this.M.clear();
        this.R.t();
        this.R.f9360d = 0;
    }

    private int g2(RecyclerView.b0 b0Var) {
        if (V() == 0) {
            return 0;
        }
        int b10 = b0Var.b();
        k2();
        View m22 = m2(b10);
        View p22 = p2(b10);
        if (b0Var.b() == 0 || m22 == null || p22 == null) {
            return 0;
        }
        return Math.min(this.S.n(), this.S.d(p22) - this.S.g(m22));
    }

    private int h2(RecyclerView.b0 b0Var) {
        if (V() == 0) {
            return 0;
        }
        int b10 = b0Var.b();
        View m22 = m2(b10);
        View p22 = p2(b10);
        if (b0Var.b() != 0 && m22 != null && p22 != null) {
            int p02 = p0(m22);
            int p03 = p0(p22);
            int abs = Math.abs(this.S.d(p22) - this.S.g(m22));
            int i10 = this.N.f9395c[p02];
            if (i10 != 0 && i10 != -1) {
                return Math.round((i10 * (abs / ((r4[p03] - i10) + 1))) + (this.S.m() - this.S.g(m22)));
            }
        }
        return 0;
    }

    private int i2(RecyclerView.b0 b0Var) {
        if (V() == 0) {
            return 0;
        }
        int b10 = b0Var.b();
        View m22 = m2(b10);
        View p22 = p2(b10);
        if (b0Var.b() == 0 || m22 == null || p22 == null) {
            return 0;
        }
        int o22 = o2();
        return (int) ((Math.abs(this.S.d(p22) - this.S.g(m22)) / ((r2() - o22) + 1)) * b0Var.b());
    }

    private void j2() {
        if (this.Q == null) {
            this.Q = new c();
        }
    }

    private void k2() {
        if (this.S != null) {
            return;
        }
        if (l()) {
            if (this.G == 0) {
                this.S = u.a(this);
                this.T = u.c(this);
                return;
            }
            this.S = u.c(this);
            this.T = u.a(this);
        } else if (this.G == 0) {
            this.S = u.c(this);
            this.T = u.a(this);
        } else {
            this.S = u.a(this);
            this.T = u.c(this);
        }
    }

    private int l2(RecyclerView.w wVar, RecyclerView.b0 b0Var, c cVar) {
        if (cVar.f9370f != Integer.MIN_VALUE) {
            if (cVar.f9365a < 0) {
                c.q(cVar, cVar.f9365a);
            }
            H2(wVar, cVar);
        }
        int i10 = cVar.f9365a;
        int i11 = cVar.f9365a;
        boolean l10 = l();
        int i12 = 0;
        while (true) {
            if ((i11 > 0 || this.Q.f9366b) && cVar.D(b0Var, this.M)) {
                com.google.android.flexbox.b bVar = this.M.get(cVar.f9367c);
                cVar.f9368d = bVar.f9389o;
                i12 += E2(bVar, cVar);
                if (!l10 && this.K) {
                    c.d(cVar, bVar.a() * cVar.f9373i);
                } else {
                    c.c(cVar, bVar.a() * cVar.f9373i);
                }
                i11 -= bVar.a();
            }
        }
        c.i(cVar, i12);
        if (cVar.f9370f != Integer.MIN_VALUE) {
            c.q(cVar, i12);
            if (cVar.f9365a < 0) {
                c.q(cVar, cVar.f9365a);
            }
            H2(wVar, cVar);
        }
        return i10 - cVar.f9365a;
    }

    private View m2(int i10) {
        View t22 = t2(0, V(), i10);
        if (t22 == null) {
            return null;
        }
        int i11 = this.N.f9395c[p0(t22)];
        if (i11 == -1) {
            return null;
        }
        return n2(t22, this.M.get(i11));
    }

    private View n2(View view, com.google.android.flexbox.b bVar) {
        boolean l10 = l();
        int i10 = bVar.f9382h;
        for (int i11 = 1; i11 < i10; i11++) {
            View U = U(i11);
            if (U != null && U.getVisibility() != 8) {
                if (this.K && !l10) {
                    if (this.S.d(view) >= this.S.d(U)) {
                    }
                    view = U;
                } else {
                    if (this.S.g(view) <= this.S.g(U)) {
                    }
                    view = U;
                }
            }
        }
        return view;
    }

    private View p2(int i10) {
        View t22 = t2(V() - 1, -1, i10);
        if (t22 == null) {
            return null;
        }
        return q2(t22, this.M.get(this.N.f9395c[p0(t22)]));
    }

    private View q2(View view, com.google.android.flexbox.b bVar) {
        boolean l10 = l();
        int V = (V() - bVar.f9382h) - 1;
        for (int V2 = V() - 2; V2 > V; V2--) {
            View U = U(V2);
            if (U != null && U.getVisibility() != 8) {
                if (this.K && !l10) {
                    if (this.S.g(view) <= this.S.g(U)) {
                    }
                    view = U;
                } else {
                    if (this.S.d(view) >= this.S.d(U)) {
                    }
                    view = U;
                }
            }
        }
        return view;
    }

    private View s2(int i10, int i11, boolean z10) {
        int i12;
        if (i11 > i10) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        while (i10 != i11) {
            View U = U(i10);
            if (D2(U, z10)) {
                return U;
            }
            i10 += i12;
        }
        return null;
    }

    private View t2(int i10, int i11, int i12) {
        int i13;
        int p02;
        k2();
        j2();
        int m10 = this.S.m();
        int i14 = this.S.i();
        if (i11 > i10) {
            i13 = 1;
        } else {
            i13 = -1;
        }
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View U = U(i10);
            if (U != null && (p02 = p0(U)) >= 0 && p02 < i12) {
                if (((RecyclerView.q) U.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = U;
                    }
                } else if (this.S.g(U) >= m10 && this.S.d(U) <= i14) {
                    return U;
                } else {
                    if (view == null) {
                        view = U;
                    }
                }
            }
            i10 += i13;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    private int u2(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z10) {
        boolean z11;
        int i11;
        int i12;
        if (!l() && this.K) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            int m10 = i10 - this.S.m();
            if (m10 <= 0) {
                return 0;
            }
            i11 = B2(m10, wVar, b0Var);
        } else {
            int i13 = this.S.i() - i10;
            if (i13 <= 0) {
                return 0;
            }
            i11 = -B2(-i13, wVar, b0Var);
        }
        int i14 = i10 + i11;
        if (z10 && (i12 = this.S.i() - i14) > 0) {
            this.S.r(i12);
            return i12 + i11;
        }
        return i11;
    }

    private int v2(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z10) {
        int i11;
        int m10;
        if (!l() && this.K) {
            int i12 = this.S.i() - i10;
            if (i12 <= 0) {
                return 0;
            }
            i11 = B2(-i12, wVar, b0Var);
        } else {
            int m11 = i10 - this.S.m();
            if (m11 <= 0) {
                return 0;
            }
            i11 = -B2(m11, wVar, b0Var);
        }
        int i13 = i10 + i11;
        if (z10 && (m10 = i13 - this.S.m()) > 0) {
            this.S.r(-m10);
            return i11 - m10;
        }
        return i11;
    }

    private int w2(View view) {
        return a0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).bottomMargin;
    }

    private View x2() {
        return U(0);
    }

    private int y2(View view) {
        return c0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).leftMargin;
    }

    private int z2(View view) {
        return f0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).rightMargin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean A0() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int C(RecyclerView.b0 b0Var) {
        return g2(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int D(RecyclerView.b0 b0Var) {
        return h2(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int E(RecyclerView.b0 b0Var) {
        return i2(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int F(RecyclerView.b0 b0Var) {
        return g2(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int G(RecyclerView.b0 b0Var) {
        return h2(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int G1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (l() && this.G != 0) {
            int C2 = C2(i10);
            b.l(this.R, C2);
            this.T.r(-C2);
            return C2;
        }
        int B2 = B2(i10, wVar, b0Var);
        this.f9341a0.clear();
        return B2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int H(RecyclerView.b0 b0Var) {
        return i2(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void H1(int i10) {
        this.V = i10;
        this.W = RecyclerView.UNDEFINED_DURATION;
        SavedState savedState = this.U;
        if (savedState != null) {
            savedState.h();
        }
        D1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int I1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (!l() && (this.G != 0 || l())) {
            int C2 = C2(i10);
            b.l(this.R, C2);
            this.T.r(-C2);
            return C2;
        }
        int B2 = B2(i10, wVar, b0Var);
        this.f9341a0.clear();
        return B2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void N0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        t1();
    }

    public void N2(int i10) {
        int i11 = this.I;
        if (i11 != i10) {
            if (i11 == 4 || i10 == 4) {
                t1();
                f2();
            }
            this.I = i10;
            D1();
        }
    }

    public void O2(int i10) {
        if (this.F != i10) {
            t1();
            this.F = i10;
            this.S = null;
            this.T = null;
            f2();
            D1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q P() {
        return new LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void P0(RecyclerView recyclerView) {
        super.P0(recyclerView);
        this.f9343c0 = (View) recyclerView.getParent();
    }

    public void P2(int i10) {
        if (i10 != 2) {
            int i11 = this.G;
            if (i11 != i10) {
                if (i11 == 0 || i10 == 0) {
                    t1();
                    f2();
                }
                this.G = i10;
                this.S = null;
                this.T = null;
                D1();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q Q(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public void Q2(int i10) {
        if (this.H != i10) {
            this.H = i10;
            D1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void R0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.R0(recyclerView, wVar);
        if (this.Z) {
            u1(wVar);
            wVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void S1(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i10) {
        q qVar = new q(recyclerView.getContext());
        qVar.p(i10);
        T1(qVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a1(RecyclerView recyclerView, int i10, int i11) {
        super.a1(recyclerView, i10, i11);
        U2(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    public PointF b(int i10) {
        View U;
        int i11;
        if (V() == 0 || (U = U(0)) == null) {
            return null;
        }
        if (i10 < p0(U)) {
            i11 = -1;
        } else {
            i11 = 1;
        }
        if (l()) {
            return new PointF(0.0f, i11);
        }
        return new PointF(i11, 0.0f);
    }

    @Override // com.google.android.flexbox.a
    public void c(View view, int i10, int i11, com.google.android.flexbox.b bVar) {
        v(view, f9340f0);
        if (l()) {
            int m02 = m0(view) + r0(view);
            bVar.f9379e += m02;
            bVar.f9380f += m02;
            return;
        }
        int u02 = u0(view) + T(view);
        bVar.f9379e += u02;
        bVar.f9380f += u02;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c1(RecyclerView recyclerView, int i10, int i11, int i12) {
        super.c1(recyclerView, i10, i11, i12);
        U2(Math.min(i10, i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void d1(RecyclerView recyclerView, int i10, int i11) {
        super.d1(recyclerView, i10, i11);
        U2(i10);
    }

    @Override // com.google.android.flexbox.a
    public View e(int i10) {
        return i(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void e1(RecyclerView recyclerView, int i10, int i11) {
        super.e1(recyclerView, i10, i11);
        U2(i10);
    }

    @Override // com.google.android.flexbox.a
    public int f(int i10, int i11, int i12) {
        return RecyclerView.p.W(w0(), x0(), i11, i12, w());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void f1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        super.f1(recyclerView, i10, i11, obj);
        U2(i10);
    }

    @Override // com.google.android.flexbox.a
    public void g(int i10, View view) {
        this.f9341a0.put(i10, view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void g1(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        int i10;
        int i11;
        this.O = wVar;
        this.P = b0Var;
        int b10 = b0Var.b();
        if (b10 == 0 && b0Var.e()) {
            return;
        }
        M2();
        k2();
        j2();
        this.N.t(b10);
        this.N.u(b10);
        this.N.s(b10);
        this.Q.f9374j = false;
        SavedState savedState = this.U;
        if (savedState != null && savedState.g(b10)) {
            this.V = this.U.f9355f;
        }
        if (!this.R.f9362f || this.V != -1 || this.U != null) {
            this.R.t();
            T2(b0Var, this.R);
            this.R.f9362f = true;
        }
        I(wVar);
        if (this.R.f9361e) {
            Y2(this.R, false, true);
        } else {
            X2(this.R, false, true);
        }
        V2(b10);
        l2(wVar, b0Var, this.Q);
        if (this.R.f9361e) {
            i11 = this.Q.f9369e;
            X2(this.R, true, false);
            l2(wVar, b0Var, this.Q);
            i10 = this.Q.f9369e;
        } else {
            i10 = this.Q.f9369e;
            Y2(this.R, true, false);
            l2(wVar, b0Var, this.Q);
            i11 = this.Q.f9369e;
        }
        if (V() > 0) {
            if (this.R.f9361e) {
                v2(i11 + u2(i10, wVar, b0Var, true), wVar, b0Var, false);
            } else {
                u2(i10 + v2(i11, wVar, b0Var, true), wVar, b0Var, false);
            }
        }
    }

    @Override // com.google.android.flexbox.a
    public int getAlignContent() {
        return 5;
    }

    @Override // com.google.android.flexbox.a
    public int getAlignItems() {
        return this.I;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexDirection() {
        return this.F;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexItemCount() {
        return this.P.b();
    }

    @Override // com.google.android.flexbox.a
    public List<com.google.android.flexbox.b> getFlexLinesInternal() {
        return this.M;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexWrap() {
        return this.G;
    }

    @Override // com.google.android.flexbox.a
    public int getLargestMainSize() {
        if (this.M.size() == 0) {
            return 0;
        }
        int size = this.M.size();
        int i10 = RecyclerView.UNDEFINED_DURATION;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = Math.max(i10, this.M.get(i11).f9379e);
        }
        return i10;
    }

    @Override // com.google.android.flexbox.a
    public int getMaxLine() {
        return this.J;
    }

    @Override // com.google.android.flexbox.a
    public int getSumOfCrossSize() {
        int size = this.M.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += this.M.get(i11).f9381g;
        }
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void h1(RecyclerView.b0 b0Var) {
        super.h1(b0Var);
        this.U = null;
        this.V = -1;
        this.W = RecyclerView.UNDEFINED_DURATION;
        this.f9344d0 = -1;
        this.R.t();
        this.f9341a0.clear();
    }

    @Override // com.google.android.flexbox.a
    public View i(int i10) {
        View view = this.f9341a0.get(i10);
        if (view != null) {
            return view;
        }
        return this.O.o(i10);
    }

    @Override // com.google.android.flexbox.a
    public int j(View view, int i10, int i11) {
        int u02;
        int T;
        if (l()) {
            u02 = m0(view);
            T = r0(view);
        } else {
            u02 = u0(view);
            T = T(view);
        }
        return u02 + T;
    }

    @Override // com.google.android.flexbox.a
    public int k(int i10, int i11, int i12) {
        return RecyclerView.p.W(i0(), j0(), i11, i12, x());
    }

    @Override // com.google.android.flexbox.a
    public boolean l() {
        int i10 = this.F;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void l1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.U = (SavedState) parcelable;
            D1();
        }
    }

    @Override // com.google.android.flexbox.a
    public int m(View view) {
        int m02;
        int r02;
        if (l()) {
            m02 = u0(view);
            r02 = T(view);
        } else {
            m02 = m0(view);
            r02 = r0(view);
        }
        return m02 + r02;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable m1() {
        if (this.U != null) {
            return new SavedState(this.U);
        }
        SavedState savedState = new SavedState();
        if (V() <= 0) {
            savedState.h();
        } else {
            View x22 = x2();
            savedState.f9355f = p0(x22);
            savedState.f9356m = this.S.g(x22) - this.S.m();
        }
        return savedState;
    }

    public int o2() {
        View s22 = s2(0, V(), false);
        if (s22 == null) {
            return -1;
        }
        return p0(s22);
    }

    public int r2() {
        View s22 = s2(V() - 1, -1, false);
        if (s22 == null) {
            return -1;
        }
        return p0(s22);
    }

    @Override // com.google.android.flexbox.a
    public void setFlexLines(List<com.google.android.flexbox.b> list) {
        this.M = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean w() {
        int i10;
        if (this.G == 0) {
            return l();
        }
        if (l()) {
            int w02 = w0();
            View view = this.f9343c0;
            if (view != null) {
                i10 = view.getWidth();
            } else {
                i10 = 0;
            }
            if (w02 <= i10) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean x() {
        int i10;
        if (this.G == 0) {
            return !l();
        }
        if (l()) {
            return true;
        }
        int i02 = i0();
        View view = this.f9343c0;
        if (view != null) {
            i10 = view.getHeight();
        } else {
            i10 = 0;
        }
        if (i02 > i10) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean y(RecyclerView.q qVar) {
        return qVar instanceof LayoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        private int f9355f;

        /* renamed from: m  reason: collision with root package name */
        private int f9356m;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean g(int i10) {
            int i11 = this.f9355f;
            if (i11 >= 0 && i11 < i10) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h() {
            this.f9355f = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "SavedState{mAnchorPosition=" + this.f9355f + ", mAnchorOffset=" + this.f9356m + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f9355f);
            parcel.writeInt(this.f9356m);
        }

        SavedState() {
        }

        private SavedState(Parcel parcel) {
            this.f9355f = parcel.readInt();
            this.f9356m = parcel.readInt();
        }

        private SavedState(SavedState savedState) {
            this.f9355f = savedState.f9355f;
            this.f9356m = savedState.f9356m;
        }
    }

    public FlexboxLayoutManager(Context context, int i10, int i11) {
        this.J = -1;
        this.M = new ArrayList();
        this.N = new com.google.android.flexbox.c(this);
        this.R = new b();
        this.V = -1;
        this.W = RecyclerView.UNDEFINED_DURATION;
        this.X = RecyclerView.UNDEFINED_DURATION;
        this.Y = RecyclerView.UNDEFINED_DURATION;
        this.f9341a0 = new SparseArray<>();
        this.f9344d0 = -1;
        this.f9345e0 = new c.b();
        O2(i10);
        P2(i11);
        N2(4);
        this.f9342b0 = context;
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends RecyclerView.q implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new a();

        /* renamed from: r  reason: collision with root package name */
        private float f9346r;

        /* renamed from: s  reason: collision with root package name */
        private float f9347s;

        /* renamed from: t  reason: collision with root package name */
        private int f9348t;

        /* renamed from: u  reason: collision with root package name */
        private float f9349u;

        /* renamed from: v  reason: collision with root package name */
        private int f9350v;

        /* renamed from: w  reason: collision with root package name */
        private int f9351w;

        /* renamed from: x  reason: collision with root package name */
        private int f9352x;

        /* renamed from: y  reason: collision with root package name */
        private int f9353y;

        /* renamed from: z  reason: collision with root package name */
        private boolean f9354z;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<LayoutParams> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public LayoutParams[] newArray(int i10) {
                return new LayoutParams[i10];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9346r = 0.0f;
            this.f9347s = 1.0f;
            this.f9348t = -1;
            this.f9349u = -1.0f;
            this.f9352x = 16777215;
            this.f9353y = 16777215;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int A0() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int D0() {
            return this.f9351w;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float E() {
            return this.f9347s;
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean F0() {
            return this.f9354z;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int I() {
            return this.f9350v;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int I0() {
            return this.f9353y;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void Q(int i10) {
            this.f9350v = i10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int R() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int T0() {
            return this.f9352x;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int V() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int c0() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void f0(int i10) {
            this.f9351w = i10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return 1;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float k0() {
            return this.f9346r;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float q0() {
            return this.f9349u;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeFloat(this.f9346r);
            parcel.writeFloat(this.f9347s);
            parcel.writeInt(this.f9348t);
            parcel.writeFloat(this.f9349u);
            parcel.writeInt(this.f9350v);
            parcel.writeInt(this.f9351w);
            parcel.writeInt(this.f9352x);
            parcel.writeInt(this.f9353y);
            parcel.writeByte(this.f9354z ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.FlexItem
        public int x() {
            return this.f9348t;
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f9346r = 0.0f;
            this.f9347s = 1.0f;
            this.f9348t = -1;
            this.f9349u = -1.0f;
            this.f9352x = 16777215;
            this.f9353y = 16777215;
        }

        protected LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.f9346r = 0.0f;
            this.f9347s = 1.0f;
            this.f9348t = -1;
            this.f9349u = -1.0f;
            this.f9352x = 16777215;
            this.f9353y = 16777215;
            this.f9346r = parcel.readFloat();
            this.f9347s = parcel.readFloat();
            this.f9348t = parcel.readInt();
            this.f9349u = parcel.readFloat();
            this.f9350v = parcel.readInt();
            this.f9351w = parcel.readInt();
            this.f9352x = parcel.readInt();
            this.f9353y = parcel.readInt();
            this.f9354z = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.J = -1;
        this.M = new ArrayList();
        this.N = new com.google.android.flexbox.c(this);
        this.R = new b();
        this.V = -1;
        this.W = RecyclerView.UNDEFINED_DURATION;
        this.X = RecyclerView.UNDEFINED_DURATION;
        this.Y = RecyclerView.UNDEFINED_DURATION;
        this.f9341a0 = new SparseArray<>();
        this.f9344d0 = -1;
        this.f9345e0 = new c.b();
        RecyclerView.p.d q02 = RecyclerView.p.q0(context, attributeSet, i10, i11);
        int i12 = q02.f6602a;
        if (i12 != 0) {
            if (i12 == 1) {
                if (q02.f6604c) {
                    O2(3);
                } else {
                    O2(2);
                }
            }
        } else if (q02.f6604c) {
            O2(1);
        } else {
            O2(0);
        }
        P2(1);
        N2(4);
        this.f9342b0 = context;
    }

    @Override // com.google.android.flexbox.a
    public void d(com.google.android.flexbox.b bVar) {
    }
}
