package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.core.view.accessibility.n0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    boolean V;
    int W;
    int[] X;
    View[] Y;
    final SparseIntArray Z;

    /* renamed from: a0  reason: collision with root package name */
    final SparseIntArray f6505a0;

    /* renamed from: b0  reason: collision with root package name */
    c f6506b0;

    /* renamed from: c0  reason: collision with root package name */
    final Rect f6507c0;

    /* renamed from: d0  reason: collision with root package name */
    private boolean f6508d0;

    /* loaded from: classes.dex */
    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int getSpanIndex(int i10, int i11) {
            return i10 % i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int getSpanSize(int i10) {
            return 1;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        final SparseIntArray mSpanIndexCache = new SparseIntArray();
        final SparseIntArray mSpanGroupIndexCache = new SparseIntArray();
        private boolean mCacheSpanIndices = false;
        private boolean mCacheSpanGroupIndices = false;

        static int findFirstKeyLessThan(SparseIntArray sparseIntArray, int i10) {
            int size = sparseIntArray.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                if (sparseIntArray.keyAt(i12) < i10) {
                    i11 = i12 + 1;
                } else {
                    size = i12 - 1;
                }
            }
            int i13 = i11 - 1;
            if (i13 >= 0 && i13 < sparseIntArray.size()) {
                return sparseIntArray.keyAt(i13);
            }
            return -1;
        }

        int getCachedSpanGroupIndex(int i10, int i11) {
            if (!this.mCacheSpanGroupIndices) {
                return getSpanGroupIndex(i10, i11);
            }
            int i12 = this.mSpanGroupIndexCache.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int spanGroupIndex = getSpanGroupIndex(i10, i11);
            this.mSpanGroupIndexCache.put(i10, spanGroupIndex);
            return spanGroupIndex;
        }

        int getCachedSpanIndex(int i10, int i11) {
            if (!this.mCacheSpanIndices) {
                return getSpanIndex(i10, i11);
            }
            int i12 = this.mSpanIndexCache.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int spanIndex = getSpanIndex(i10, i11);
            this.mSpanIndexCache.put(i10, spanIndex);
            return spanIndex;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int getSpanGroupIndex(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.mCacheSpanGroupIndices
                r1 = 0
                if (r0 == 0) goto L24
                android.util.SparseIntArray r0 = r6.mSpanGroupIndexCache
                int r0 = findFirstKeyLessThan(r0, r7)
                r2 = -1
                if (r0 == r2) goto L24
                android.util.SparseIntArray r2 = r6.mSpanGroupIndexCache
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.getCachedSpanIndex(r0, r8)
                int r0 = r6.getSpanSize(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L27
                int r2 = r2 + 1
                goto L26
            L24:
                r2 = 0
                r3 = 0
            L26:
                r4 = 0
            L27:
                int r0 = r6.getSpanSize(r7)
            L2b:
                if (r3 >= r7) goto L40
                int r5 = r6.getSpanSize(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L38
                int r2 = r2 + 1
                r4 = 0
                goto L3d
            L38:
                if (r4 <= r8) goto L3d
                int r2 = r2 + 1
                r4 = r5
            L3d:
                int r3 = r3 + 1
                goto L2b
            L40:
                int r4 = r4 + r0
                if (r4 <= r8) goto L45
                int r2 = r2 + 1
            L45:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.getSpanGroupIndex(int, int):int");
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:17:0x0030). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:17:0x0030). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:17:0x0030). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int getSpanIndex(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.getSpanSize(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.mCacheSpanIndices
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.mSpanIndexCache
                int r2 = findFirstKeyLessThan(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.mSpanIndexCache
                int r3 = r3.get(r2)
                int r4 = r5.getSpanSize(r2)
                int r3 = r3 + r4
                goto L30
            L20:
                r2 = 0
                r3 = 0
            L22:
                if (r2 >= r6) goto L33
                int r4 = r5.getSpanSize(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L2d
                r3 = 0
                goto L30
            L2d:
                if (r3 <= r7) goto L30
                r3 = r4
            L30:
                int r2 = r2 + 1
                goto L22
            L33:
                int r0 = r0 + r3
                if (r0 > r7) goto L37
                return r3
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.getSpanIndex(int, int):int");
        }

        public abstract int getSpanSize(int i10);

        public void invalidateSpanGroupIndexCache() {
            this.mSpanGroupIndexCache.clear();
        }

        public void invalidateSpanIndexCache() {
            this.mSpanIndexCache.clear();
        }

        public boolean isSpanGroupIndexCacheEnabled() {
            return this.mCacheSpanGroupIndices;
        }

        public boolean isSpanIndexCacheEnabled() {
            return this.mCacheSpanIndices;
        }

        public void setSpanGroupIndexCacheEnabled(boolean z10) {
            if (!z10) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanGroupIndices = z10;
        }

        public void setSpanIndexCacheEnabled(boolean z10) {
            if (!z10) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanIndices = z10;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.V = false;
        this.W = -1;
        this.Z = new SparseIntArray();
        this.f6505a0 = new SparseIntArray();
        this.f6506b0 = new a();
        this.f6507c0 = new Rect();
        l3(RecyclerView.p.q0(context, attributeSet, i10, i11).f6603b);
    }

    private void U2(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (z10) {
            i12 = i10;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = i10 - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View view = this.Y[i11];
            b bVar = (b) view.getLayoutParams();
            int h32 = h3(wVar, b0Var, p0(view));
            bVar.f6510s = h32;
            bVar.f6509r = i14;
            i14 += h32;
            i11 += i13;
        }
    }

    private void V2() {
        int V = V();
        for (int i10 = 0; i10 < V; i10++) {
            b bVar = (b) U(i10).getLayoutParams();
            int a10 = bVar.a();
            this.Z.put(a10, bVar.f());
            this.f6505a0.put(a10, bVar.e());
        }
    }

    private void W2(int i10) {
        this.X = X2(this.X, this.W, i10);
    }

    static int[] X2(int[] iArr, int i10, int i11) {
        int i12;
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i10 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i11 / i10;
        int i15 = i11 % i10;
        int i16 = 0;
        for (int i17 = 1; i17 <= i10; i17++) {
            i13 += i15;
            if (i13 > 0 && i10 - i13 < i15) {
                i12 = i14 + 1;
                i13 -= i10;
            } else {
                i12 = i14;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    private void Y2() {
        this.Z.clear();
        this.f6505a0.clear();
    }

    private int Z2(RecyclerView.b0 b0Var) {
        int max;
        if (V() != 0 && b0Var.b() != 0) {
            d2();
            boolean x22 = x2();
            View h22 = h2(!x22, true);
            View g22 = g2(!x22, true);
            if (h22 != null && g22 != null) {
                int cachedSpanGroupIndex = this.f6506b0.getCachedSpanGroupIndex(p0(h22), this.W);
                int cachedSpanGroupIndex2 = this.f6506b0.getCachedSpanGroupIndex(p0(g22), this.W);
                int min = Math.min(cachedSpanGroupIndex, cachedSpanGroupIndex2);
                int max2 = Math.max(cachedSpanGroupIndex, cachedSpanGroupIndex2);
                int cachedSpanGroupIndex3 = this.f6506b0.getCachedSpanGroupIndex(b0Var.b() - 1, this.W) + 1;
                if (this.K) {
                    max = Math.max(0, (cachedSpanGroupIndex3 - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (!x22) {
                    return max;
                }
                return Math.round((max * (Math.abs(this.H.d(g22) - this.H.g(h22)) / ((this.f6506b0.getCachedSpanGroupIndex(p0(g22), this.W) - this.f6506b0.getCachedSpanGroupIndex(p0(h22), this.W)) + 1))) + (this.H.m() - this.H.g(h22)));
            }
        }
        return 0;
    }

    private int a3(RecyclerView.b0 b0Var) {
        if (V() != 0 && b0Var.b() != 0) {
            d2();
            View h22 = h2(!x2(), true);
            View g22 = g2(!x2(), true);
            if (h22 != null && g22 != null) {
                if (!x2()) {
                    return this.f6506b0.getCachedSpanGroupIndex(b0Var.b() - 1, this.W) + 1;
                }
                int d10 = this.H.d(g22) - this.H.g(h22);
                int cachedSpanGroupIndex = this.f6506b0.getCachedSpanGroupIndex(p0(h22), this.W);
                return (int) ((d10 / ((this.f6506b0.getCachedSpanGroupIndex(p0(g22), this.W) - cachedSpanGroupIndex) + 1)) * (this.f6506b0.getCachedSpanGroupIndex(b0Var.b() - 1, this.W) + 1));
            }
        }
        return 0;
    }

    private void b3(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.a aVar, int i10) {
        boolean z10;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int g32 = g3(wVar, b0Var, aVar.f6515b);
        if (z10) {
            while (g32 > 0) {
                int i11 = aVar.f6515b;
                if (i11 > 0) {
                    int i12 = i11 - 1;
                    aVar.f6515b = i12;
                    g32 = g3(wVar, b0Var, i12);
                } else {
                    return;
                }
            }
            return;
        }
        int b10 = b0Var.b() - 1;
        int i13 = aVar.f6515b;
        while (i13 < b10) {
            int i14 = i13 + 1;
            int g33 = g3(wVar, b0Var, i14);
            if (g33 <= g32) {
                break;
            }
            i13 = i14;
            g32 = g33;
        }
        aVar.f6515b = i13;
    }

    private void c3() {
        View[] viewArr = this.Y;
        if (viewArr == null || viewArr.length != this.W) {
            this.Y = new View[this.W];
        }
    }

    private int f3(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i10) {
        if (!b0Var.e()) {
            return this.f6506b0.getCachedSpanGroupIndex(i10, this.W);
        }
        int f10 = wVar.f(i10);
        if (f10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
            return 0;
        }
        return this.f6506b0.getCachedSpanGroupIndex(f10, this.W);
    }

    private int g3(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i10) {
        if (!b0Var.e()) {
            return this.f6506b0.getCachedSpanIndex(i10, this.W);
        }
        int i11 = this.f6505a0.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int f10 = wVar.f(i10);
        if (f10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 0;
        }
        return this.f6506b0.getCachedSpanIndex(f10, this.W);
    }

    private int h3(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i10) {
        if (!b0Var.e()) {
            return this.f6506b0.getSpanSize(i10);
        }
        int i11 = this.Z.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int f10 = wVar.f(i10);
        if (f10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 1;
        }
        return this.f6506b0.getSpanSize(f10);
    }

    private void i3(float f10, int i10) {
        W2(Math.max(Math.round(f10 * this.W), i10));
    }

    private void j3(View view, int i10, boolean z10) {
        int i11;
        int i12;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f6607m;
        int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int d32 = d3(bVar.f6509r, bVar.f6510s);
        if (this.F == 1) {
            i12 = RecyclerView.p.W(d32, i10, i14, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i11 = RecyclerView.p.W(this.H.n(), j0(), i13, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int W = RecyclerView.p.W(d32, i10, i13, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int W2 = RecyclerView.p.W(this.H.n(), x0(), i14, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i11 = W;
            i12 = W2;
        }
        k3(view, i12, i11, z10);
    }

    private void k3(View view, int i10, int i11, boolean z10) {
        boolean P1;
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (z10) {
            P1 = R1(view, i10, i11, qVar);
        } else {
            P1 = P1(view, i10, i11, qVar);
        }
        if (P1) {
            view.measure(i10, i11);
        }
    }

    private void n3() {
        int i02;
        int paddingTop;
        if (v2() == 1) {
            i02 = w0() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            i02 = i0() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        W2(i02 - paddingTop);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void A2(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.a aVar, int i10) {
        super.A2(wVar, b0Var, aVar, i10);
        n3();
        if (b0Var.b() > 0 && !b0Var.e()) {
            b3(wVar, b0Var, aVar, i10);
        }
        c3();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int D(RecyclerView.b0 b0Var) {
        if (this.f6508d0) {
            return Z2(b0Var);
        }
        return super.D(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int E(RecyclerView.b0 b0Var) {
        if (this.f6508d0) {
            return a3(b0Var);
        }
        return super.E(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int G(RecyclerView.b0 b0Var) {
        if (this.f6508d0) {
            return Z2(b0Var);
        }
        return super.G(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int G1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        n3();
        c3();
        return super.G1(i10, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int H(RecyclerView.b0 b0Var) {
        if (this.f6508d0) {
            return a3(b0Var);
        }
        return super.H(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int I1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        n3();
        c3();
        return super.I1(i10, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void L2(boolean z10) {
        if (!z10) {
            super.L2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void M1(Rect rect, int i10, int i11) {
        int z10;
        int z11;
        if (this.X == null) {
            super.M1(rect, i10, i11);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.F == 1) {
            z11 = RecyclerView.p.z(i11, rect.height() + paddingTop, n0());
            int[] iArr = this.X;
            z10 = RecyclerView.p.z(i10, iArr[iArr.length - 1] + paddingLeft, o0());
        } else {
            z10 = RecyclerView.p.z(i10, rect.width() + paddingLeft, o0());
            int[] iArr2 = this.X;
            z11 = RecyclerView.p.z(i11, iArr2[iArr2.length - 1] + paddingTop, n0());
        }
        L1(z10, z11);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q P() {
        if (this.F == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q Q(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q R(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
    
        if (r13 == r7) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f6, code lost:
    
        if (r13 == r11) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View S0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.w r26, androidx.recyclerview.widget.RecyclerView.b0 r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.S0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public boolean V1() {
        if (this.Q == null && !this.V) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView.w wVar, RecyclerView.b0 b0Var, n0 n0Var) {
        super.W0(wVar, b0Var, n0Var);
        n0Var.n0(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void X1(RecyclerView.b0 b0Var, LinearLayoutManager.c cVar, RecyclerView.p.c cVar2) {
        int i10 = this.W;
        for (int i11 = 0; i11 < this.W && cVar.c(b0Var) && i10 > 0; i11++) {
            int i12 = cVar.f6526d;
            cVar2.a(i12, Math.max(0, cVar.f6529g));
            i10 -= this.f6506b0.getSpanSize(i12);
            cVar.f6526d += cVar.f6527e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView.w wVar, RecyclerView.b0 b0Var, View view, n0 n0Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.X0(view, n0Var);
            return;
        }
        b bVar = (b) layoutParams;
        int f32 = f3(wVar, b0Var, bVar.a());
        if (this.F == 0) {
            n0Var.q0(n0.g.a(bVar.e(), bVar.f(), f32, 1, false, false));
        } else {
            n0Var.q0(n0.g.a(f32, 1, bVar.e(), bVar.f(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int Z(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.F == 1) {
            return this.W;
        }
        if (b0Var.b() < 1) {
            return 0;
        }
        return f3(wVar, b0Var, b0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a1(RecyclerView recyclerView, int i10, int i11) {
        this.f6506b0.invalidateSpanIndexCache();
        this.f6506b0.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView recyclerView) {
        this.f6506b0.invalidateSpanIndexCache();
        this.f6506b0.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c1(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.f6506b0.invalidateSpanIndexCache();
        this.f6506b0.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void d1(RecyclerView recyclerView, int i10, int i11) {
        this.f6506b0.invalidateSpanIndexCache();
        this.f6506b0.invalidateSpanGroupIndexCache();
    }

    int d3(int i10, int i11) {
        if (this.F == 1 && w2()) {
            int[] iArr = this.X;
            int i12 = this.W;
            return iArr[i12 - i10] - iArr[(i12 - i10) - i11];
        }
        int[] iArr2 = this.X;
        return iArr2[i11 + i10] - iArr2[i10];
    }

    public int e3() {
        return this.W;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void f1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.f6506b0.invalidateSpanIndexCache();
        this.f6506b0.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void g1(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (b0Var.e()) {
            V2();
        }
        super.g1(wVar, b0Var);
        Y2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void h1(RecyclerView.b0 b0Var) {
        super.h1(b0Var);
        this.V = false;
    }

    public void l3(int i10) {
        if (i10 == this.W) {
            return;
        }
        this.V = true;
        if (i10 >= 1) {
            this.W = i10;
            this.f6506b0.invalidateSpanIndexCache();
            D1();
            return;
        }
        throw new IllegalArgumentException("Span count should be at least 1. Provided " + i10);
    }

    public void m3(c cVar) {
        this.f6506b0 = cVar;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View p2(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z10, boolean z11) {
        int i10;
        int i11;
        int V = V();
        int i12 = 1;
        if (z11) {
            i11 = V() - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = V;
            i11 = 0;
        }
        int b10 = b0Var.b();
        d2();
        int m10 = this.H.m();
        int i13 = this.H.i();
        View view = null;
        View view2 = null;
        while (i11 != i10) {
            View U = U(i11);
            int p02 = p0(U);
            if (p02 >= 0 && p02 < b10 && g3(wVar, b0Var, p02) == 0) {
                if (((RecyclerView.q) U.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = U;
                    }
                } else if (this.H.g(U) < i13 && this.H.d(U) >= m10) {
                    return U;
                } else {
                    if (view == null) {
                        view = U;
                    }
                }
            }
            i11 += i12;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int s0(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.F == 0) {
            return this.W;
        }
        if (b0Var.b() < 1) {
            return 0;
        }
        return f3(wVar, b0Var, b0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean y(RecyclerView.q qVar) {
        return qVar instanceof b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
    
        r21.f6520b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
    
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void y2(androidx.recyclerview.widget.RecyclerView.w r18, androidx.recyclerview.widget.RecyclerView.b0 r19, androidx.recyclerview.widget.LinearLayoutManager.c r20, androidx.recyclerview.widget.LinearLayoutManager.b r21) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.y2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.q {

        /* renamed from: r  reason: collision with root package name */
        int f6509r;

        /* renamed from: s  reason: collision with root package name */
        int f6510s;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6509r = -1;
            this.f6510s = 0;
        }

        public int e() {
            return this.f6509r;
        }

        public int f() {
            return this.f6510s;
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f6509r = -1;
            this.f6510s = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f6509r = -1;
            this.f6510s = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6509r = -1;
            this.f6510s = 0;
        }
    }

    public GridLayoutManager(Context context, int i10) {
        super(context);
        this.V = false;
        this.W = -1;
        this.Z = new SparseIntArray();
        this.f6505a0 = new SparseIntArray();
        this.f6506b0 = new a();
        this.f6507c0 = new Rect();
        l3(i10);
    }

    public GridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(context, i11, z10);
        this.V = false;
        this.W = -1;
        this.Z = new SparseIntArray();
        this.f6505a0 = new SparseIntArray();
        this.f6506b0 = new a();
        this.f6507c0 = new Rect();
        l3(i10);
    }
}
