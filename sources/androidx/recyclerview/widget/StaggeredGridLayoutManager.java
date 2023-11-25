package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.p implements RecyclerView.a0.b {
    d[] G;
    u H;
    u I;
    private int J;
    private int K;
    private final p L;
    private BitSet O;
    private boolean T;
    private boolean U;
    private SavedState V;
    private int W;

    /* renamed from: b0  reason: collision with root package name */
    private int[] f6627b0;
    private int F = -1;
    boolean M = false;
    boolean N = false;
    int P = -1;
    int Q = RecyclerView.UNDEFINED_DURATION;
    LazySpanLookup R = new LazySpanLookup();
    private int S = 2;
    private final Rect X = new Rect();
    private final b Y = new b();
    private boolean Z = false;

    /* renamed from: a0  reason: collision with root package name */
    private boolean f6626a0 = true;

    /* renamed from: c0  reason: collision with root package name */
    private final Runnable f6628c0 = new a();

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        int f6635f;

        /* renamed from: m  reason: collision with root package name */
        int f6636m;

        /* renamed from: p  reason: collision with root package name */
        int f6637p;

        /* renamed from: q  reason: collision with root package name */
        int[] f6638q;

        /* renamed from: r  reason: collision with root package name */
        int f6639r;

        /* renamed from: s  reason: collision with root package name */
        int[] f6640s;

        /* renamed from: t  reason: collision with root package name */
        List<LazySpanLookup.FullSpanItem> f6641t;

        /* renamed from: u  reason: collision with root package name */
        boolean f6642u;

        /* renamed from: v  reason: collision with root package name */
        boolean f6643v;

        /* renamed from: w  reason: collision with root package name */
        boolean f6644w;

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

        public SavedState() {
        }

        void a() {
            this.f6638q = null;
            this.f6637p = 0;
            this.f6635f = -1;
            this.f6636m = -1;
        }

        void b() {
            this.f6638q = null;
            this.f6637p = 0;
            this.f6639r = 0;
            this.f6640s = null;
            this.f6641t = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f6635f);
            parcel.writeInt(this.f6636m);
            parcel.writeInt(this.f6637p);
            if (this.f6637p > 0) {
                parcel.writeIntArray(this.f6638q);
            }
            parcel.writeInt(this.f6639r);
            if (this.f6639r > 0) {
                parcel.writeIntArray(this.f6640s);
            }
            parcel.writeInt(this.f6642u ? 1 : 0);
            parcel.writeInt(this.f6643v ? 1 : 0);
            parcel.writeInt(this.f6644w ? 1 : 0);
            parcel.writeList(this.f6641t);
        }

        SavedState(Parcel parcel) {
            this.f6635f = parcel.readInt();
            this.f6636m = parcel.readInt();
            int readInt = parcel.readInt();
            this.f6637p = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f6638q = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f6639r = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f6640s = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f6642u = parcel.readInt() == 1;
            this.f6643v = parcel.readInt() == 1;
            this.f6644w = parcel.readInt() == 1;
            this.f6641t = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f6637p = savedState.f6637p;
            this.f6635f = savedState.f6635f;
            this.f6636m = savedState.f6636m;
            this.f6638q = savedState.f6638q;
            this.f6639r = savedState.f6639r;
            this.f6640s = savedState.f6640s;
            this.f6642u = savedState.f6642u;
            this.f6643v = savedState.f6643v;
            this.f6644w = savedState.f6644w;
            this.f6641t = savedState.f6641t;
        }
    }

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.c2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        int f6646a;

        /* renamed from: b  reason: collision with root package name */
        int f6647b;

        /* renamed from: c  reason: collision with root package name */
        boolean f6648c;

        /* renamed from: d  reason: collision with root package name */
        boolean f6649d;

        /* renamed from: e  reason: collision with root package name */
        boolean f6650e;

        /* renamed from: f  reason: collision with root package name */
        int[] f6651f;

        b() {
            c();
        }

        void a() {
            int m10;
            if (this.f6648c) {
                m10 = StaggeredGridLayoutManager.this.H.i();
            } else {
                m10 = StaggeredGridLayoutManager.this.H.m();
            }
            this.f6647b = m10;
        }

        void b(int i10) {
            if (this.f6648c) {
                this.f6647b = StaggeredGridLayoutManager.this.H.i() - i10;
            } else {
                this.f6647b = StaggeredGridLayoutManager.this.H.m() + i10;
            }
        }

        void c() {
            this.f6646a = -1;
            this.f6647b = RecyclerView.UNDEFINED_DURATION;
            this.f6648c = false;
            this.f6649d = false;
            this.f6650e = false;
            int[] iArr = this.f6651f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void d(d[] dVarArr) {
            int length = dVarArr.length;
            int[] iArr = this.f6651f;
            if (iArr == null || iArr.length < length) {
                this.f6651f = new int[StaggeredGridLayoutManager.this.G.length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                this.f6651f[i10] = dVarArr[i10].p(RecyclerView.UNDEFINED_DURATION);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends RecyclerView.q {

        /* renamed from: r  reason: collision with root package name */
        d f6653r;

        /* renamed from: s  reason: collision with root package name */
        boolean f6654s;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean e() {
            return this.f6654s;
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        ArrayList<View> f6655a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        int f6656b = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: c  reason: collision with root package name */
        int f6657c = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: d  reason: collision with root package name */
        int f6658d = 0;

        /* renamed from: e  reason: collision with root package name */
        final int f6659e;

        d(int i10) {
            this.f6659e = i10;
        }

        void a(View view) {
            c n10 = n(view);
            n10.f6653r = this;
            this.f6655a.add(view);
            this.f6657c = RecyclerView.UNDEFINED_DURATION;
            if (this.f6655a.size() == 1) {
                this.f6656b = RecyclerView.UNDEFINED_DURATION;
            }
            if (n10.c() || n10.b()) {
                this.f6658d += StaggeredGridLayoutManager.this.H.e(view);
            }
        }

        void b(boolean z10, int i10) {
            int p10;
            if (z10) {
                p10 = l(RecyclerView.UNDEFINED_DURATION);
            } else {
                p10 = p(RecyclerView.UNDEFINED_DURATION);
            }
            e();
            if (p10 == Integer.MIN_VALUE) {
                return;
            }
            if (!z10 || p10 >= StaggeredGridLayoutManager.this.H.i()) {
                if (!z10 && p10 > StaggeredGridLayoutManager.this.H.m()) {
                    return;
                }
                if (i10 != Integer.MIN_VALUE) {
                    p10 += i10;
                }
                this.f6657c = p10;
                this.f6656b = p10;
            }
        }

        void c() {
            LazySpanLookup.FullSpanItem f10;
            ArrayList<View> arrayList = this.f6655a;
            View view = arrayList.get(arrayList.size() - 1);
            c n10 = n(view);
            this.f6657c = StaggeredGridLayoutManager.this.H.d(view);
            if (n10.f6654s && (f10 = StaggeredGridLayoutManager.this.R.f(n10.a())) != null && f10.f6632m == 1) {
                this.f6657c += f10.a(this.f6659e);
            }
        }

        void d() {
            LazySpanLookup.FullSpanItem f10;
            View view = this.f6655a.get(0);
            c n10 = n(view);
            this.f6656b = StaggeredGridLayoutManager.this.H.g(view);
            if (n10.f6654s && (f10 = StaggeredGridLayoutManager.this.R.f(n10.a())) != null && f10.f6632m == -1) {
                this.f6656b -= f10.a(this.f6659e);
            }
        }

        void e() {
            this.f6655a.clear();
            q();
            this.f6658d = 0;
        }

        public int f() {
            if (StaggeredGridLayoutManager.this.M) {
                return i(this.f6655a.size() - 1, -1, true);
            }
            return i(0, this.f6655a.size(), true);
        }

        public int g() {
            if (StaggeredGridLayoutManager.this.M) {
                return i(0, this.f6655a.size(), true);
            }
            return i(this.f6655a.size() - 1, -1, true);
        }

        int h(int i10, int i11, boolean z10, boolean z11, boolean z12) {
            int i12;
            boolean z13;
            int m10 = StaggeredGridLayoutManager.this.H.m();
            int i13 = StaggeredGridLayoutManager.this.H.i();
            if (i11 > i10) {
                i12 = 1;
            } else {
                i12 = -1;
            }
            while (i10 != i11) {
                View view = this.f6655a.get(i10);
                int g10 = StaggeredGridLayoutManager.this.H.g(view);
                int d10 = StaggeredGridLayoutManager.this.H.d(view);
                boolean z14 = false;
                if (!z12 ? g10 < i13 : g10 <= i13) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z12 ? d10 > m10 : d10 >= m10) {
                    z14 = true;
                }
                if (z13 && z14) {
                    if (z10 && z11) {
                        if (g10 >= m10 && d10 <= i13) {
                            return StaggeredGridLayoutManager.this.p0(view);
                        }
                    } else if (z11) {
                        return StaggeredGridLayoutManager.this.p0(view);
                    } else {
                        if (g10 < m10 || d10 > i13) {
                            return StaggeredGridLayoutManager.this.p0(view);
                        }
                    }
                }
                i10 += i12;
            }
            return -1;
        }

        int i(int i10, int i11, boolean z10) {
            return h(i10, i11, false, false, z10);
        }

        public int j() {
            return this.f6658d;
        }

        int k() {
            int i10 = this.f6657c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            c();
            return this.f6657c;
        }

        int l(int i10) {
            int i11 = this.f6657c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f6655a.size() == 0) {
                return i10;
            }
            c();
            return this.f6657c;
        }

        public View m(int i10, int i11) {
            View view = null;
            if (i11 == -1) {
                int size = this.f6655a.size();
                int i12 = 0;
                while (i12 < size) {
                    View view2 = this.f6655a.get(i12);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.M && staggeredGridLayoutManager.p0(view2) <= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.M && staggeredGridLayoutManager2.p0(view2) >= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    i12++;
                    view = view2;
                }
            } else {
                int size2 = this.f6655a.size() - 1;
                while (size2 >= 0) {
                    View view3 = this.f6655a.get(size2);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.M && staggeredGridLayoutManager3.p0(view3) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.M && staggeredGridLayoutManager4.p0(view3) <= i10) || !view3.hasFocusable()) {
                        break;
                    }
                    size2--;
                    view = view3;
                }
            }
            return view;
        }

        c n(View view) {
            return (c) view.getLayoutParams();
        }

        int o() {
            int i10 = this.f6656b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            d();
            return this.f6656b;
        }

        int p(int i10) {
            int i11 = this.f6656b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f6655a.size() == 0) {
                return i10;
            }
            d();
            return this.f6656b;
        }

        void q() {
            this.f6656b = RecyclerView.UNDEFINED_DURATION;
            this.f6657c = RecyclerView.UNDEFINED_DURATION;
        }

        void r(int i10) {
            int i11 = this.f6656b;
            if (i11 != Integer.MIN_VALUE) {
                this.f6656b = i11 + i10;
            }
            int i12 = this.f6657c;
            if (i12 != Integer.MIN_VALUE) {
                this.f6657c = i12 + i10;
            }
        }

        void s() {
            int size = this.f6655a.size();
            View remove = this.f6655a.remove(size - 1);
            c n10 = n(remove);
            n10.f6653r = null;
            if (n10.c() || n10.b()) {
                this.f6658d -= StaggeredGridLayoutManager.this.H.e(remove);
            }
            if (size == 1) {
                this.f6656b = RecyclerView.UNDEFINED_DURATION;
            }
            this.f6657c = RecyclerView.UNDEFINED_DURATION;
        }

        void t() {
            View remove = this.f6655a.remove(0);
            c n10 = n(remove);
            n10.f6653r = null;
            if (this.f6655a.size() == 0) {
                this.f6657c = RecyclerView.UNDEFINED_DURATION;
            }
            if (n10.c() || n10.b()) {
                this.f6658d -= StaggeredGridLayoutManager.this.H.e(remove);
            }
            this.f6656b = RecyclerView.UNDEFINED_DURATION;
        }

        void u(View view) {
            c n10 = n(view);
            n10.f6653r = this;
            this.f6655a.add(0, view);
            this.f6656b = RecyclerView.UNDEFINED_DURATION;
            if (this.f6655a.size() == 1) {
                this.f6657c = RecyclerView.UNDEFINED_DURATION;
            }
            if (n10.c() || n10.b()) {
                this.f6658d += StaggeredGridLayoutManager.this.H.e(view);
            }
        }

        void v(int i10) {
            this.f6656b = i10;
            this.f6657c = i10;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.p.d q02 = RecyclerView.p.q0(context, attributeSet, i10, i11);
        R2(q02.f6602a);
        T2(q02.f6603b);
        S2(q02.f6604c);
        this.L = new p();
        k2();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.N
            if (r0 == 0) goto L9
            int r0 = r6.u2()
            goto Ld
        L9:
            int r0 = r6.t2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.R
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.R
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.R
            r7.j(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.R
            r9.k(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.R
            r9.j(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.N
            if (r7 == 0) goto L4d
            int r7 = r6.t2()
            goto L51
        L4d:
            int r7 = r6.u2()
        L51:
            if (r3 > r7) goto L56
            r6.D1()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A2(int, int, int):void");
    }

    private void E2(View view, int i10, int i11, boolean z10) {
        boolean P1;
        v(view, this.X);
        c cVar = (c) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.X;
        int b32 = b3(i10, i12 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i13 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.X;
        int b33 = b3(i11, i13 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z10) {
            P1 = R1(view, b32, b33, cVar);
        } else {
            P1 = P1(view, b32, b33, cVar);
        }
        if (P1) {
            view.measure(b32, b33);
        }
    }

    private void F2(View view, c cVar, boolean z10) {
        if (cVar.f6654s) {
            if (this.J == 1) {
                E2(view, this.W, RecyclerView.p.W(i0(), j0(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
            } else {
                E2(view, RecyclerView.p.W(w0(), x0(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.W, z10);
            }
        } else if (this.J == 1) {
            E2(view, RecyclerView.p.W(this.K, x0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.p.W(i0(), j0(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
        } else {
            E2(view, RecyclerView.p.W(w0(), x0(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.p.W(this.K, j0(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0157, code lost:
    
        if (c2() != false) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void G2(androidx.recyclerview.widget.RecyclerView.w r9, androidx.recyclerview.widget.RecyclerView.b0 r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.G2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, boolean):void");
    }

    private boolean H2(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.J == 0) {
            if (i10 == -1) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != this.N) {
                return true;
            }
            return false;
        }
        if (i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 == this.N) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 == D2()) {
            return true;
        }
        return false;
    }

    private void J2(View view) {
        for (int i10 = this.F - 1; i10 >= 0; i10--) {
            this.G[i10].u(view);
        }
    }

    private void K2(RecyclerView.w wVar, p pVar) {
        int min;
        int min2;
        if (pVar.f6914a && !pVar.f6922i) {
            if (pVar.f6915b == 0) {
                if (pVar.f6918e == -1) {
                    L2(wVar, pVar.f6920g);
                } else {
                    M2(wVar, pVar.f6919f);
                }
            } else if (pVar.f6918e == -1) {
                int i10 = pVar.f6919f;
                int w22 = i10 - w2(i10);
                if (w22 < 0) {
                    min2 = pVar.f6920g;
                } else {
                    min2 = pVar.f6920g - Math.min(w22, pVar.f6915b);
                }
                L2(wVar, min2);
            } else {
                int x22 = x2(pVar.f6920g) - pVar.f6920g;
                if (x22 < 0) {
                    min = pVar.f6919f;
                } else {
                    min = Math.min(x22, pVar.f6915b) + pVar.f6919f;
                }
                M2(wVar, min);
            }
        }
    }

    private void L2(RecyclerView.w wVar, int i10) {
        for (int V = V() - 1; V >= 0; V--) {
            View U = U(V);
            if (this.H.g(U) >= i10 && this.H.q(U) >= i10) {
                c cVar = (c) U.getLayoutParams();
                if (cVar.f6654s) {
                    for (int i11 = 0; i11 < this.F; i11++) {
                        if (this.G[i11].f6655a.size() == 1) {
                            return;
                        }
                    }
                    for (int i12 = 0; i12 < this.F; i12++) {
                        this.G[i12].s();
                    }
                } else if (cVar.f6653r.f6655a.size() == 1) {
                    return;
                } else {
                    cVar.f6653r.s();
                }
                w1(U, wVar);
            } else {
                return;
            }
        }
    }

    private void M2(RecyclerView.w wVar, int i10) {
        while (V() > 0) {
            View U = U(0);
            if (this.H.d(U) <= i10 && this.H.p(U) <= i10) {
                c cVar = (c) U.getLayoutParams();
                if (cVar.f6654s) {
                    for (int i11 = 0; i11 < this.F; i11++) {
                        if (this.G[i11].f6655a.size() == 1) {
                            return;
                        }
                    }
                    for (int i12 = 0; i12 < this.F; i12++) {
                        this.G[i12].t();
                    }
                } else if (cVar.f6653r.f6655a.size() == 1) {
                    return;
                } else {
                    cVar.f6653r.t();
                }
                w1(U, wVar);
            } else {
                return;
            }
        }
    }

    private void N2() {
        if (this.I.k() == 1073741824) {
            return;
        }
        int V = V();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < V; i10++) {
            View U = U(i10);
            float e10 = this.I.e(U);
            if (e10 >= f10) {
                if (((c) U.getLayoutParams()).e()) {
                    e10 = (e10 * 1.0f) / this.F;
                }
                f10 = Math.max(f10, e10);
            }
        }
        int i11 = this.K;
        int round = Math.round(f10 * this.F);
        if (this.I.k() == Integer.MIN_VALUE) {
            round = Math.min(round, this.I.n());
        }
        Z2(round);
        if (this.K == i11) {
            return;
        }
        for (int i12 = 0; i12 < V; i12++) {
            View U2 = U(i12);
            c cVar = (c) U2.getLayoutParams();
            if (!cVar.f6654s) {
                if (D2() && this.J == 1) {
                    int i13 = this.F;
                    int i14 = cVar.f6653r.f6659e;
                    U2.offsetLeftAndRight(((-((i13 - 1) - i14)) * this.K) - ((-((i13 - 1) - i14)) * i11));
                } else {
                    int i15 = cVar.f6653r.f6659e;
                    int i16 = this.K * i15;
                    int i17 = i15 * i11;
                    if (this.J == 1) {
                        U2.offsetLeftAndRight(i16 - i17);
                    } else {
                        U2.offsetTopAndBottom(i16 - i17);
                    }
                }
            }
        }
    }

    private void O2() {
        if (this.J != 1 && D2()) {
            this.N = !this.M;
        } else {
            this.N = this.M;
        }
    }

    private void Q2(int i10) {
        boolean z10;
        p pVar = this.L;
        pVar.f6918e = i10;
        boolean z11 = this.N;
        int i11 = 1;
        if (i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 != z10) {
            i11 = -1;
        }
        pVar.f6917d = i11;
    }

    private void U2(int i10, int i11) {
        for (int i12 = 0; i12 < this.F; i12++) {
            if (!this.G[i12].f6655a.isEmpty()) {
                a3(this.G[i12], i10, i11);
            }
        }
    }

    private boolean V2(RecyclerView.b0 b0Var, b bVar) {
        int m22;
        if (this.T) {
            m22 = q2(b0Var.b());
        } else {
            m22 = m2(b0Var.b());
        }
        bVar.f6646a = m22;
        bVar.f6647b = RecyclerView.UNDEFINED_DURATION;
        return true;
    }

    private void W1(View view) {
        for (int i10 = this.F - 1; i10 >= 0; i10--) {
            this.G[i10].a(view);
        }
    }

    private void X1(b bVar) {
        int m10;
        SavedState savedState = this.V;
        int i10 = savedState.f6637p;
        if (i10 > 0) {
            if (i10 == this.F) {
                for (int i11 = 0; i11 < this.F; i11++) {
                    this.G[i11].e();
                    SavedState savedState2 = this.V;
                    int i12 = savedState2.f6638q[i11];
                    if (i12 != Integer.MIN_VALUE) {
                        if (savedState2.f6643v) {
                            m10 = this.H.i();
                        } else {
                            m10 = this.H.m();
                        }
                        i12 += m10;
                    }
                    this.G[i11].v(i12);
                }
            } else {
                savedState.b();
                SavedState savedState3 = this.V;
                savedState3.f6635f = savedState3.f6636m;
            }
        }
        SavedState savedState4 = this.V;
        this.U = savedState4.f6644w;
        S2(savedState4.f6642u);
        O2();
        SavedState savedState5 = this.V;
        int i13 = savedState5.f6635f;
        if (i13 != -1) {
            this.P = i13;
            bVar.f6648c = savedState5.f6643v;
        } else {
            bVar.f6648c = this.N;
        }
        if (savedState5.f6639r > 1) {
            LazySpanLookup lazySpanLookup = this.R;
            lazySpanLookup.f6629a = savedState5.f6640s;
            lazySpanLookup.f6630b = savedState5.f6641t;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void Y2(int r5, androidx.recyclerview.widget.RecyclerView.b0 r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.p r0 = r4.L
            r1 = 0
            r0.f6915b = r1
            r0.f6916c = r5
            boolean r0 = r4.G0()
            r2 = 1
            if (r0 == 0) goto L2e
            int r6 = r6.c()
            r0 = -1
            if (r6 == r0) goto L2e
            boolean r0 = r4.N
            if (r6 >= r5) goto L1b
            r5 = 1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            if (r0 != r5) goto L25
            androidx.recyclerview.widget.u r5 = r4.H
            int r5 = r5.n()
            goto L2f
        L25:
            androidx.recyclerview.widget.u r5 = r4.H
            int r5 = r5.n()
            r6 = r5
            r5 = 0
            goto L30
        L2e:
            r5 = 0
        L2f:
            r6 = 0
        L30:
            boolean r0 = r4.Y()
            if (r0 == 0) goto L4d
            androidx.recyclerview.widget.p r0 = r4.L
            androidx.recyclerview.widget.u r3 = r4.H
            int r3 = r3.m()
            int r3 = r3 - r6
            r0.f6919f = r3
            androidx.recyclerview.widget.p r6 = r4.L
            androidx.recyclerview.widget.u r0 = r4.H
            int r0 = r0.i()
            int r0 = r0 + r5
            r6.f6920g = r0
            goto L5d
        L4d:
            androidx.recyclerview.widget.p r0 = r4.L
            androidx.recyclerview.widget.u r3 = r4.H
            int r3 = r3.h()
            int r3 = r3 + r5
            r0.f6920g = r3
            androidx.recyclerview.widget.p r5 = r4.L
            int r6 = -r6
            r5.f6919f = r6
        L5d:
            androidx.recyclerview.widget.p r5 = r4.L
            r5.f6921h = r1
            r5.f6914a = r2
            androidx.recyclerview.widget.u r6 = r4.H
            int r6 = r6.k()
            if (r6 != 0) goto L74
            androidx.recyclerview.widget.u r6 = r4.H
            int r6 = r6.h()
            if (r6 != 0) goto L74
            r1 = 1
        L74:
            r5.f6922i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Y2(int, androidx.recyclerview.widget.RecyclerView$b0):void");
    }

    private void a2(View view, c cVar, p pVar) {
        if (pVar.f6918e == 1) {
            if (cVar.f6654s) {
                W1(view);
            } else {
                cVar.f6653r.a(view);
            }
        } else if (cVar.f6654s) {
            J2(view);
        } else {
            cVar.f6653r.u(view);
        }
    }

    private void a3(d dVar, int i10, int i11) {
        int j10 = dVar.j();
        if (i10 == -1) {
            if (dVar.o() + j10 <= i11) {
                this.O.set(dVar.f6659e, false);
            }
        } else if (dVar.k() - j10 >= i11) {
            this.O.set(dVar.f6659e, false);
        }
    }

    private int b2(int i10) {
        boolean z10;
        if (V() == 0) {
            if (!this.N) {
                return -1;
            }
            return 1;
        }
        if (i10 < t2()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.N) {
            return -1;
        }
        return 1;
    }

    private int b3(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return i10;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode);
    }

    private boolean d2(d dVar) {
        if (this.N) {
            if (dVar.k() < this.H.i()) {
                ArrayList<View> arrayList = dVar.f6655a;
                return !dVar.n(arrayList.get(arrayList.size() - 1)).f6654s;
            }
        } else if (dVar.o() > this.H.m()) {
            return !dVar.n(dVar.f6655a.get(0)).f6654s;
        }
        return false;
    }

    private int e2(RecyclerView.b0 b0Var) {
        if (V() == 0) {
            return 0;
        }
        return x.a(b0Var, this.H, o2(!this.f6626a0), n2(!this.f6626a0), this, this.f6626a0);
    }

    private int f2(RecyclerView.b0 b0Var) {
        if (V() == 0) {
            return 0;
        }
        return x.b(b0Var, this.H, o2(!this.f6626a0), n2(!this.f6626a0), this, this.f6626a0, this.N);
    }

    private int g2(RecyclerView.b0 b0Var) {
        if (V() == 0) {
            return 0;
        }
        return x.c(b0Var, this.H, o2(!this.f6626a0), n2(!this.f6626a0), this, this.f6626a0);
    }

    private int h2(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 17) {
                    if (i10 != 33) {
                        if (i10 != 66) {
                            if (i10 != 130) {
                                return RecyclerView.UNDEFINED_DURATION;
                            }
                            if (this.J == 1) {
                                return 1;
                            }
                            return RecyclerView.UNDEFINED_DURATION;
                        } else if (this.J == 0) {
                            return 1;
                        } else {
                            return RecyclerView.UNDEFINED_DURATION;
                        }
                    } else if (this.J == 1) {
                        return -1;
                    } else {
                        return RecyclerView.UNDEFINED_DURATION;
                    }
                } else if (this.J == 0) {
                    return -1;
                } else {
                    return RecyclerView.UNDEFINED_DURATION;
                }
            } else if (this.J != 1 && D2()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.J == 1 || !D2()) {
            return -1;
        } else {
            return 1;
        }
    }

    private LazySpanLookup.FullSpanItem i2(int i10) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f6633p = new int[this.F];
        for (int i11 = 0; i11 < this.F; i11++) {
            fullSpanItem.f6633p[i11] = i10 - this.G[i11].l(i10);
        }
        return fullSpanItem;
    }

    private LazySpanLookup.FullSpanItem j2(int i10) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f6633p = new int[this.F];
        for (int i11 = 0; i11 < this.F; i11++) {
            fullSpanItem.f6633p[i11] = this.G[i11].p(i10) - i10;
        }
        return fullSpanItem;
    }

    private void k2() {
        this.H = u.b(this, this.J);
        this.I = u.b(this, 1 - this.J);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    private int l2(RecyclerView.w wVar, p pVar, RecyclerView.b0 b0Var) {
        int i10;
        int i11;
        int m10;
        int v22;
        boolean z10;
        d dVar;
        int p10;
        int e10;
        int i12;
        int m11;
        int i13;
        int e11;
        int i14;
        boolean Z1;
        int l10;
        ?? r92 = 0;
        this.O.set(0, this.F, true);
        if (this.L.f6922i) {
            if (pVar.f6918e == 1) {
                i11 = Integer.MAX_VALUE;
            } else {
                i11 = RecyclerView.UNDEFINED_DURATION;
            }
        } else {
            if (pVar.f6918e == 1) {
                i10 = pVar.f6920g + pVar.f6915b;
            } else {
                i10 = pVar.f6919f - pVar.f6915b;
            }
            i11 = i10;
        }
        U2(pVar.f6918e, i11);
        if (this.N) {
            m10 = this.H.i();
        } else {
            m10 = this.H.m();
        }
        int i15 = m10;
        boolean z11 = false;
        while (pVar.a(b0Var) && (this.L.f6922i || !this.O.isEmpty())) {
            View b10 = pVar.b(wVar);
            c cVar = (c) b10.getLayoutParams();
            int a10 = cVar.a();
            int g10 = this.R.g(a10);
            if (g10 == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (cVar.f6654s) {
                    dVar = this.G[r92];
                } else {
                    dVar = z2(pVar);
                }
                this.R.n(a10, dVar);
            } else {
                dVar = this.G[g10];
            }
            d dVar2 = dVar;
            cVar.f6653r = dVar2;
            if (pVar.f6918e == 1) {
                p(b10);
            } else {
                q(b10, r92);
            }
            F2(b10, cVar, r92);
            if (pVar.f6918e == 1) {
                if (cVar.f6654s) {
                    l10 = v2(i15);
                } else {
                    l10 = dVar2.l(i15);
                }
                int e12 = this.H.e(b10) + l10;
                if (z10 && cVar.f6654s) {
                    LazySpanLookup.FullSpanItem i22 = i2(l10);
                    i22.f6632m = -1;
                    i22.f6631f = a10;
                    this.R.a(i22);
                }
                i12 = e12;
                e10 = l10;
            } else {
                if (cVar.f6654s) {
                    p10 = y2(i15);
                } else {
                    p10 = dVar2.p(i15);
                }
                e10 = p10 - this.H.e(b10);
                if (z10 && cVar.f6654s) {
                    LazySpanLookup.FullSpanItem j22 = j2(p10);
                    j22.f6632m = 1;
                    j22.f6631f = a10;
                    this.R.a(j22);
                }
                i12 = p10;
            }
            if (cVar.f6654s && pVar.f6917d == -1) {
                if (z10) {
                    this.Z = true;
                } else {
                    if (pVar.f6918e == 1) {
                        Z1 = Y1();
                    } else {
                        Z1 = Z1();
                    }
                    if ((!Z1) != false) {
                        LazySpanLookup.FullSpanItem f10 = this.R.f(a10);
                        if (f10 != null) {
                            f10.f6634q = true;
                        }
                        this.Z = true;
                    }
                }
            }
            a2(b10, cVar, pVar);
            if (D2() && this.J == 1) {
                if (cVar.f6654s) {
                    i14 = this.I.i();
                } else {
                    i14 = this.I.i() - (((this.F - 1) - dVar2.f6659e) * this.K);
                }
                e11 = i14;
                i13 = i14 - this.I.e(b10);
            } else {
                if (cVar.f6654s) {
                    m11 = this.I.m();
                } else {
                    m11 = (dVar2.f6659e * this.K) + this.I.m();
                }
                i13 = m11;
                e11 = this.I.e(b10) + m11;
            }
            if (this.J == 1) {
                I0(b10, i13, e10, e11, i12);
            } else {
                I0(b10, e10, i13, i12, e11);
            }
            if (cVar.f6654s) {
                U2(this.L.f6918e, i11);
            } else {
                a3(dVar2, this.L.f6918e, i11);
            }
            K2(wVar, this.L);
            if (this.L.f6921h && b10.hasFocusable()) {
                if (cVar.f6654s) {
                    this.O.clear();
                } else {
                    this.O.set(dVar2.f6659e, false);
                    z11 = true;
                    r92 = 0;
                }
            }
            z11 = true;
            r92 = 0;
        }
        if (!z11) {
            K2(wVar, this.L);
        }
        if (this.L.f6918e == -1) {
            v22 = this.H.m() - y2(this.H.m());
        } else {
            v22 = v2(this.H.i()) - this.H.i();
        }
        if (v22 > 0) {
            return Math.min(pVar.f6915b, v22);
        }
        return 0;
    }

    private int m2(int i10) {
        int V = V();
        for (int i11 = 0; i11 < V; i11++) {
            int p02 = p0(U(i11));
            if (p02 >= 0 && p02 < i10) {
                return p02;
            }
        }
        return 0;
    }

    private int q2(int i10) {
        for (int V = V() - 1; V >= 0; V--) {
            int p02 = p0(U(V));
            if (p02 >= 0 && p02 < i10) {
                return p02;
            }
        }
        return 0;
    }

    private void r2(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z10) {
        int i10;
        int v22 = v2(RecyclerView.UNDEFINED_DURATION);
        if (v22 != Integer.MIN_VALUE && (i10 = this.H.i() - v22) > 0) {
            int i11 = i10 - (-P2(-i10, wVar, b0Var));
            if (z10 && i11 > 0) {
                this.H.r(i11);
            }
        }
    }

    private void s2(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z10) {
        int m10;
        int y22 = y2(Integer.MAX_VALUE);
        if (y22 != Integer.MAX_VALUE && (m10 = y22 - this.H.m()) > 0) {
            int P2 = m10 - P2(m10, wVar, b0Var);
            if (z10 && P2 > 0) {
                this.H.r(-P2);
            }
        }
    }

    private int v2(int i10) {
        int l10 = this.G[0].l(i10);
        for (int i11 = 1; i11 < this.F; i11++) {
            int l11 = this.G[i11].l(i10);
            if (l11 > l10) {
                l10 = l11;
            }
        }
        return l10;
    }

    private int w2(int i10) {
        int p10 = this.G[0].p(i10);
        for (int i11 = 1; i11 < this.F; i11++) {
            int p11 = this.G[i11].p(i10);
            if (p11 > p10) {
                p10 = p11;
            }
        }
        return p10;
    }

    private int x2(int i10) {
        int l10 = this.G[0].l(i10);
        for (int i11 = 1; i11 < this.F; i11++) {
            int l11 = this.G[i11].l(i10);
            if (l11 < l10) {
                l10 = l11;
            }
        }
        return l10;
    }

    private int y2(int i10) {
        int p10 = this.G[0].p(i10);
        for (int i11 = 1; i11 < this.F; i11++) {
            int p11 = this.G[i11].p(i10);
            if (p11 < p10) {
                p10 = p11;
            }
        }
        return p10;
    }

    private d z2(p pVar) {
        int i10;
        int i11;
        int i12;
        if (H2(pVar.f6918e)) {
            i11 = this.F - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = this.F;
            i11 = 0;
            i12 = 1;
        }
        d dVar = null;
        if (pVar.f6918e == 1) {
            int m10 = this.H.m();
            int i13 = Integer.MAX_VALUE;
            while (i11 != i10) {
                d dVar2 = this.G[i11];
                int l10 = dVar2.l(m10);
                if (l10 < i13) {
                    dVar = dVar2;
                    i13 = l10;
                }
                i11 += i12;
            }
            return dVar;
        }
        int i14 = this.H.i();
        int i15 = RecyclerView.UNDEFINED_DURATION;
        while (i11 != i10) {
            d dVar3 = this.G[i11];
            int p10 = dVar3.p(i14);
            if (p10 > i15) {
                dVar = dVar3;
                i15 = p10;
            }
            i11 += i12;
        }
        return dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void A(int i10, int i11, RecyclerView.b0 b0Var, RecyclerView.p.c cVar) {
        int l10;
        int i12;
        if (this.J != 0) {
            i10 = i11;
        }
        if (V() != 0 && i10 != 0) {
            I2(i10, b0Var);
            int[] iArr = this.f6627b0;
            if (iArr == null || iArr.length < this.F) {
                this.f6627b0 = new int[this.F];
            }
            int i13 = 0;
            for (int i14 = 0; i14 < this.F; i14++) {
                p pVar = this.L;
                if (pVar.f6917d == -1) {
                    l10 = pVar.f6919f;
                    i12 = this.G[i14].p(l10);
                } else {
                    l10 = this.G[i14].l(pVar.f6920g);
                    i12 = this.L.f6920g;
                }
                int i15 = l10 - i12;
                if (i15 >= 0) {
                    this.f6627b0[i13] = i15;
                    i13++;
                }
            }
            Arrays.sort(this.f6627b0, 0, i13);
            for (int i16 = 0; i16 < i13 && this.L.a(b0Var); i16++) {
                cVar.a(this.L.f6916c, this.f6627b0[i16]);
                p pVar2 = this.L;
                pVar2.f6916c += pVar2.f6917d;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean A0() {
        if (this.S != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        if (r10 == r11) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
    
        if (r10 == r11) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
    
        r10 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    android.view.View B2() {
        /*
            r12 = this;
            int r0 = r12.V()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.F
            r2.<init>(r3)
            int r3 = r12.F
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.J
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.D2()
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = -1
        L21:
            boolean r6 = r12.N
            if (r6 == 0) goto L27
            r6 = -1
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L2b:
            if (r0 >= r6) goto L2e
            r5 = 1
        L2e:
            if (r0 == r6) goto Lab
            android.view.View r7 = r12.U(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f6653r
            int r9 = r9.f6659e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f6653r
            boolean r9 = r12.d2(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f6653r
            int r9 = r9.f6659e
            r2.clear(r9)
        L54:
            boolean r9 = r8.f6654s
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.U(r9)
            boolean r10 = r12.N
            if (r10 == 0) goto L77
            androidx.recyclerview.widget.u r10 = r12.H
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.u r11 = r12.H
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            androidx.recyclerview.widget.u r10 = r12.H
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.u r11 = r12.H
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L86
            return r7
        L86:
            if (r10 != r11) goto L8a
        L88:
            r10 = 1
            goto L8b
        L8a:
            r10 = 0
        L8b:
            if (r10 == 0) goto La9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r8 = r8.f6653r
            int r8 = r8.f6659e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r9.f6653r
            int r9 = r9.f6659e
            int r8 = r8 - r9
            if (r8 >= 0) goto La0
            r8 = 1
            goto La1
        La0:
            r8 = 0
        La1:
            if (r3 >= 0) goto La5
            r9 = 1
            goto La6
        La5:
            r9 = 0
        La6:
            if (r8 == r9) goto La9
            return r7
        La9:
            int r0 = r0 + r5
            goto L2e
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.B2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int C(RecyclerView.b0 b0Var) {
        return e2(b0Var);
    }

    public void C2() {
        this.R.b();
        D1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int D(RecyclerView.b0 b0Var) {
        return f2(b0Var);
    }

    boolean D2() {
        if (l0() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int E(RecyclerView.b0 b0Var) {
        return g2(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int F(RecyclerView.b0 b0Var) {
        return e2(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int G(RecyclerView.b0 b0Var) {
        return f2(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int G1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        return P2(i10, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int H(RecyclerView.b0 b0Var) {
        return g2(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void H1(int i10) {
        SavedState savedState = this.V;
        if (savedState != null && savedState.f6635f != i10) {
            savedState.a();
        }
        this.P = i10;
        this.Q = RecyclerView.UNDEFINED_DURATION;
        D1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int I1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        return P2(i10, wVar, b0Var);
    }

    void I2(int i10, RecyclerView.b0 b0Var) {
        int t22;
        int i11;
        if (i10 > 0) {
            t22 = u2();
            i11 = 1;
        } else {
            t22 = t2();
            i11 = -1;
        }
        this.L.f6914a = true;
        Y2(t22, b0Var);
        Q2(i11);
        p pVar = this.L;
        pVar.f6916c = t22 + pVar.f6917d;
        pVar.f6915b = Math.abs(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void L0(int i10) {
        super.L0(i10);
        for (int i11 = 0; i11 < this.F; i11++) {
            this.G[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void M0(int i10) {
        super.M0(i10);
        for (int i11 = 0; i11 < this.F; i11++) {
            this.G[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void M1(Rect rect, int i10, int i11) {
        int z10;
        int z11;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.J == 1) {
            z11 = RecyclerView.p.z(i11, rect.height() + paddingTop, n0());
            z10 = RecyclerView.p.z(i10, (this.K * this.F) + paddingLeft, o0());
        } else {
            z10 = RecyclerView.p.z(i10, rect.width() + paddingLeft, o0());
            z11 = RecyclerView.p.z(i11, (this.K * this.F) + paddingTop, n0());
        }
        L1(z10, z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void N0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.R.b();
        for (int i10 = 0; i10 < this.F; i10++) {
            this.G[i10].e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q P() {
        if (this.J == 0) {
            return new c(-2, -1);
        }
        return new c(-1, -2);
    }

    int P2(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (V() == 0 || i10 == 0) {
            return 0;
        }
        I2(i10, b0Var);
        int l22 = l2(wVar, this.L, b0Var);
        if (this.L.f6915b >= l22) {
            if (i10 < 0) {
                i10 = -l22;
            } else {
                i10 = l22;
            }
        }
        this.H.r(-i10);
        this.T = this.N;
        p pVar = this.L;
        pVar.f6915b = 0;
        K2(wVar, pVar);
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q Q(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q R(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void R0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.R0(recyclerView, wVar);
        y1(this.f6628c0);
        for (int i10 = 0; i10 < this.F; i10++) {
            this.G[i10].e();
        }
        recyclerView.requestLayout();
    }

    public void R2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        s(null);
        if (i10 == this.J) {
            return;
        }
        this.J = i10;
        u uVar = this.H;
        this.H = this.I;
        this.I = uVar;
        D1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View S0(View view, int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        View N;
        int t22;
        boolean z10;
        boolean z11;
        int g10;
        int g11;
        int g12;
        View m10;
        if (V() == 0 || (N = N(view)) == null) {
            return null;
        }
        O2();
        int h22 = h2(i10);
        if (h22 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) N.getLayoutParams();
        boolean z12 = cVar.f6654s;
        d dVar = cVar.f6653r;
        if (h22 == 1) {
            t22 = u2();
        } else {
            t22 = t2();
        }
        Y2(t22, b0Var);
        Q2(h22);
        p pVar = this.L;
        pVar.f6916c = pVar.f6917d + t22;
        pVar.f6915b = (int) (this.H.n() * 0.33333334f);
        p pVar2 = this.L;
        pVar2.f6921h = true;
        pVar2.f6914a = false;
        l2(wVar, pVar2, b0Var);
        this.T = this.N;
        if (!z12 && (m10 = dVar.m(t22, h22)) != null && m10 != N) {
            return m10;
        }
        if (H2(h22)) {
            for (int i11 = this.F - 1; i11 >= 0; i11--) {
                View m11 = this.G[i11].m(t22, h22);
                if (m11 != null && m11 != N) {
                    return m11;
                }
            }
        } else {
            for (int i12 = 0; i12 < this.F; i12++) {
                View m12 = this.G[i12].m(t22, h22);
                if (m12 != null && m12 != N) {
                    return m12;
                }
            }
        }
        boolean z13 = !this.M;
        if (h22 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z13 == z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z12) {
            if (z11) {
                g12 = dVar.f();
            } else {
                g12 = dVar.g();
            }
            View O = O(g12);
            if (O != null && O != N) {
                return O;
            }
        }
        if (H2(h22)) {
            for (int i13 = this.F - 1; i13 >= 0; i13--) {
                if (i13 != dVar.f6659e) {
                    if (z11) {
                        g11 = this.G[i13].f();
                    } else {
                        g11 = this.G[i13].g();
                    }
                    View O2 = O(g11);
                    if (O2 != null && O2 != N) {
                        return O2;
                    }
                }
            }
        } else {
            for (int i14 = 0; i14 < this.F; i14++) {
                if (z11) {
                    g10 = this.G[i14].f();
                } else {
                    g10 = this.G[i14].g();
                }
                View O3 = O(g10);
                if (O3 != null && O3 != N) {
                    return O3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void S1(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i10) {
        q qVar = new q(recyclerView.getContext());
        qVar.p(i10);
        T1(qVar);
    }

    public void S2(boolean z10) {
        s(null);
        SavedState savedState = this.V;
        if (savedState != null && savedState.f6642u != z10) {
            savedState.f6642u = z10;
        }
        this.M = z10;
        D1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void T0(AccessibilityEvent accessibilityEvent) {
        super.T0(accessibilityEvent);
        if (V() > 0) {
            View o22 = o2(false);
            View n22 = n2(false);
            if (o22 != null && n22 != null) {
                int p02 = p0(o22);
                int p03 = p0(n22);
                if (p02 < p03) {
                    accessibilityEvent.setFromIndex(p02);
                    accessibilityEvent.setToIndex(p03);
                    return;
                }
                accessibilityEvent.setFromIndex(p03);
                accessibilityEvent.setToIndex(p02);
            }
        }
    }

    public void T2(int i10) {
        s(null);
        if (i10 != this.F) {
            C2();
            this.F = i10;
            this.O = new BitSet(this.F);
            this.G = new d[this.F];
            for (int i11 = 0; i11 < this.F; i11++) {
                this.G[i11] = new d(i11);
            }
            D1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean V1() {
        if (this.V == null) {
            return true;
        }
        return false;
    }

    boolean W2(RecyclerView.b0 b0Var, b bVar) {
        int i10;
        int t22;
        int m10;
        boolean z10 = false;
        if (!b0Var.e() && (i10 = this.P) != -1) {
            if (i10 >= 0 && i10 < b0Var.b()) {
                SavedState savedState = this.V;
                if (savedState != null && savedState.f6635f != -1 && savedState.f6637p >= 1) {
                    bVar.f6647b = RecyclerView.UNDEFINED_DURATION;
                    bVar.f6646a = this.P;
                } else {
                    View O = O(this.P);
                    if (O != null) {
                        if (this.N) {
                            t22 = u2();
                        } else {
                            t22 = t2();
                        }
                        bVar.f6646a = t22;
                        if (this.Q != Integer.MIN_VALUE) {
                            if (bVar.f6648c) {
                                bVar.f6647b = (this.H.i() - this.Q) - this.H.d(O);
                            } else {
                                bVar.f6647b = (this.H.m() + this.Q) - this.H.g(O);
                            }
                            return true;
                        } else if (this.H.e(O) > this.H.n()) {
                            if (bVar.f6648c) {
                                m10 = this.H.i();
                            } else {
                                m10 = this.H.m();
                            }
                            bVar.f6647b = m10;
                            return true;
                        } else {
                            int g10 = this.H.g(O) - this.H.m();
                            if (g10 < 0) {
                                bVar.f6647b = -g10;
                                return true;
                            }
                            int i11 = this.H.i() - this.H.d(O);
                            if (i11 < 0) {
                                bVar.f6647b = i11;
                                return true;
                            }
                            bVar.f6647b = RecyclerView.UNDEFINED_DURATION;
                        }
                    } else {
                        int i12 = this.P;
                        bVar.f6646a = i12;
                        int i13 = this.Q;
                        if (i13 == Integer.MIN_VALUE) {
                            if (b2(i12) == 1) {
                                z10 = true;
                            }
                            bVar.f6648c = z10;
                            bVar.a();
                        } else {
                            bVar.b(i13);
                        }
                        bVar.f6649d = true;
                    }
                }
                return true;
            }
            this.P = -1;
            this.Q = RecyclerView.UNDEFINED_DURATION;
        }
        return false;
    }

    void X2(RecyclerView.b0 b0Var, b bVar) {
        if (W2(b0Var, bVar) || V2(b0Var, bVar)) {
            return;
        }
        bVar.a();
        bVar.f6646a = 0;
    }

    boolean Y1() {
        int l10 = this.G[0].l(RecyclerView.UNDEFINED_DURATION);
        for (int i10 = 1; i10 < this.F; i10++) {
            if (this.G[i10].l(RecyclerView.UNDEFINED_DURATION) != l10) {
                return false;
            }
        }
        return true;
    }

    boolean Z1() {
        int p10 = this.G[0].p(RecyclerView.UNDEFINED_DURATION);
        for (int i10 = 1; i10 < this.F; i10++) {
            if (this.G[i10].p(RecyclerView.UNDEFINED_DURATION) != p10) {
                return false;
            }
        }
        return true;
    }

    void Z2(int i10) {
        this.K = i10 / this.F;
        this.W = View.MeasureSpec.makeMeasureSpec(i10, this.I.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a1(RecyclerView recyclerView, int i10, int i11) {
        A2(i10, i11, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    public PointF b(int i10) {
        int b22 = b2(i10);
        PointF pointF = new PointF();
        if (b22 == 0) {
            return null;
        }
        if (this.J == 0) {
            pointF.x = b22;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = b22;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView recyclerView) {
        this.R.b();
        D1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c1(RecyclerView recyclerView, int i10, int i11, int i12) {
        A2(i10, i11, 8);
    }

    boolean c2() {
        int t22;
        int u22;
        int i10;
        if (V() == 0 || this.S == 0 || !z0()) {
            return false;
        }
        if (this.N) {
            t22 = u2();
            u22 = t2();
        } else {
            t22 = t2();
            u22 = u2();
        }
        if (t22 == 0 && B2() != null) {
            this.R.b();
            E1();
            D1();
            return true;
        } else if (!this.Z) {
            return false;
        } else {
            if (this.N) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            int i11 = u22 + 1;
            LazySpanLookup.FullSpanItem e10 = this.R.e(t22, i11, i10, true);
            if (e10 == null) {
                this.Z = false;
                this.R.d(i11);
                return false;
            }
            LazySpanLookup.FullSpanItem e11 = this.R.e(t22, e10.f6631f, i10 * (-1), true);
            if (e11 == null) {
                this.R.d(e10.f6631f);
            } else {
                this.R.d(e11.f6631f + 1);
            }
            E1();
            D1();
            return true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void d1(RecyclerView recyclerView, int i10, int i11) {
        A2(i10, i11, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void f1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        A2(i10, i11, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void g1(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        G2(wVar, b0Var, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void h1(RecyclerView.b0 b0Var) {
        super.h1(b0Var);
        this.P = -1;
        this.Q = RecyclerView.UNDEFINED_DURATION;
        this.V = null;
        this.Y.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void l1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.V = savedState;
            if (this.P != -1) {
                savedState.a();
                this.V.b();
            }
            D1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable m1() {
        int t22;
        int p10;
        int m10;
        int[] iArr;
        if (this.V != null) {
            return new SavedState(this.V);
        }
        SavedState savedState = new SavedState();
        savedState.f6642u = this.M;
        savedState.f6643v = this.T;
        savedState.f6644w = this.U;
        LazySpanLookup lazySpanLookup = this.R;
        if (lazySpanLookup != null && (iArr = lazySpanLookup.f6629a) != null) {
            savedState.f6640s = iArr;
            savedState.f6639r = iArr.length;
            savedState.f6641t = lazySpanLookup.f6630b;
        } else {
            savedState.f6639r = 0;
        }
        if (V() > 0) {
            if (this.T) {
                t22 = u2();
            } else {
                t22 = t2();
            }
            savedState.f6635f = t22;
            savedState.f6636m = p2();
            int i10 = this.F;
            savedState.f6637p = i10;
            savedState.f6638q = new int[i10];
            for (int i11 = 0; i11 < this.F; i11++) {
                if (this.T) {
                    p10 = this.G[i11].l(RecyclerView.UNDEFINED_DURATION);
                    if (p10 != Integer.MIN_VALUE) {
                        m10 = this.H.i();
                        p10 -= m10;
                        savedState.f6638q[i11] = p10;
                    } else {
                        savedState.f6638q[i11] = p10;
                    }
                } else {
                    p10 = this.G[i11].p(RecyclerView.UNDEFINED_DURATION);
                    if (p10 != Integer.MIN_VALUE) {
                        m10 = this.H.m();
                        p10 -= m10;
                        savedState.f6638q[i11] = p10;
                    } else {
                        savedState.f6638q[i11] = p10;
                    }
                }
            }
        } else {
            savedState.f6635f = -1;
            savedState.f6636m = -1;
            savedState.f6637p = 0;
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void n1(int i10) {
        if (i10 == 0) {
            c2();
        }
    }

    View n2(boolean z10) {
        int m10 = this.H.m();
        int i10 = this.H.i();
        View view = null;
        for (int V = V() - 1; V >= 0; V--) {
            View U = U(V);
            int g10 = this.H.g(U);
            int d10 = this.H.d(U);
            if (d10 > m10 && g10 < i10) {
                if (d10 > i10 && z10) {
                    if (view == null) {
                        view = U;
                    }
                } else {
                    return U;
                }
            }
        }
        return view;
    }

    View o2(boolean z10) {
        int m10 = this.H.m();
        int i10 = this.H.i();
        int V = V();
        View view = null;
        for (int i11 = 0; i11 < V; i11++) {
            View U = U(i11);
            int g10 = this.H.g(U);
            if (this.H.d(U) > m10 && g10 < i10) {
                if (g10 < m10 && z10) {
                    if (view == null) {
                        view = U;
                    }
                } else {
                    return U;
                }
            }
        }
        return view;
    }

    int p2() {
        View o22;
        if (this.N) {
            o22 = n2(true);
        } else {
            o22 = o2(true);
        }
        if (o22 == null) {
            return -1;
        }
        return p0(o22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void s(String str) {
        if (this.V == null) {
            super.s(str);
        }
    }

    int t2() {
        if (V() == 0) {
            return 0;
        }
        return p0(U(0));
    }

    int u2() {
        int V = V();
        if (V == 0) {
            return 0;
        }
        return p0(U(V - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean w() {
        if (this.J == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean x() {
        if (this.J == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean y(RecyclerView.q qVar) {
        return qVar instanceof c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class LazySpanLookup {

        /* renamed from: a  reason: collision with root package name */
        int[] f6629a;

        /* renamed from: b  reason: collision with root package name */
        List<FullSpanItem> f6630b;

        LazySpanLookup() {
        }

        private int i(int i10) {
            if (this.f6630b == null) {
                return -1;
            }
            FullSpanItem f10 = f(i10);
            if (f10 != null) {
                this.f6630b.remove(f10);
            }
            int size = this.f6630b.size();
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    if (this.f6630b.get(i11).f6631f >= i10) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = this.f6630b.get(i11);
            this.f6630b.remove(i11);
            return fullSpanItem.f6631f;
        }

        private void l(int i10, int i11) {
            List<FullSpanItem> list = this.f6630b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f6630b.get(size);
                int i12 = fullSpanItem.f6631f;
                if (i12 >= i10) {
                    fullSpanItem.f6631f = i12 + i11;
                }
            }
        }

        private void m(int i10, int i11) {
            List<FullSpanItem> list = this.f6630b;
            if (list == null) {
                return;
            }
            int i12 = i10 + i11;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f6630b.get(size);
                int i13 = fullSpanItem.f6631f;
                if (i13 >= i10) {
                    if (i13 < i12) {
                        this.f6630b.remove(size);
                    } else {
                        fullSpanItem.f6631f = i13 - i11;
                    }
                }
            }
        }

        public void a(FullSpanItem fullSpanItem) {
            if (this.f6630b == null) {
                this.f6630b = new ArrayList();
            }
            int size = this.f6630b.size();
            for (int i10 = 0; i10 < size; i10++) {
                FullSpanItem fullSpanItem2 = this.f6630b.get(i10);
                if (fullSpanItem2.f6631f == fullSpanItem.f6631f) {
                    this.f6630b.remove(i10);
                }
                if (fullSpanItem2.f6631f >= fullSpanItem.f6631f) {
                    this.f6630b.add(i10, fullSpanItem);
                    return;
                }
            }
            this.f6630b.add(fullSpanItem);
        }

        void b() {
            int[] iArr = this.f6629a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f6630b = null;
        }

        void c(int i10) {
            int[] iArr = this.f6629a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f6629a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[o(i10)];
                this.f6629a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f6629a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int d(int i10) {
            List<FullSpanItem> list = this.f6630b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f6630b.get(size).f6631f >= i10) {
                        this.f6630b.remove(size);
                    }
                }
            }
            return h(i10);
        }

        public FullSpanItem e(int i10, int i11, int i12, boolean z10) {
            List<FullSpanItem> list = this.f6630b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                FullSpanItem fullSpanItem = this.f6630b.get(i13);
                int i14 = fullSpanItem.f6631f;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || fullSpanItem.f6632m == i12 || (z10 && fullSpanItem.f6634q))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public FullSpanItem f(int i10) {
            List<FullSpanItem> list = this.f6630b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f6630b.get(size);
                if (fullSpanItem.f6631f == i10) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        int g(int i10) {
            int[] iArr = this.f6629a;
            if (iArr != null && i10 < iArr.length) {
                return iArr[i10];
            }
            return -1;
        }

        int h(int i10) {
            int[] iArr = this.f6629a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            int i11 = i(i10);
            if (i11 == -1) {
                int[] iArr2 = this.f6629a;
                Arrays.fill(iArr2, i10, iArr2.length, -1);
                return this.f6629a.length;
            }
            int min = Math.min(i11 + 1, this.f6629a.length);
            Arrays.fill(this.f6629a, i10, min, -1);
            return min;
        }

        void j(int i10, int i11) {
            int[] iArr = this.f6629a;
            if (iArr != null && i10 < iArr.length) {
                int i12 = i10 + i11;
                c(i12);
                int[] iArr2 = this.f6629a;
                System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
                Arrays.fill(this.f6629a, i10, i12, -1);
                l(i10, i11);
            }
        }

        void k(int i10, int i11) {
            int[] iArr = this.f6629a;
            if (iArr != null && i10 < iArr.length) {
                int i12 = i10 + i11;
                c(i12);
                int[] iArr2 = this.f6629a;
                System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
                int[] iArr3 = this.f6629a;
                Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
                m(i10, i11);
            }
        }

        void n(int i10, d dVar) {
            c(i10);
            this.f6629a[i10] = dVar.f6659e;
        }

        int o(int i10) {
            int length = this.f6629a.length;
            while (length <= i10) {
                length *= 2;
            }
            return length;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();

            /* renamed from: f  reason: collision with root package name */
            int f6631f;

            /* renamed from: m  reason: collision with root package name */
            int f6632m;

            /* renamed from: p  reason: collision with root package name */
            int[] f6633p;

            /* renamed from: q  reason: collision with root package name */
            boolean f6634q;

            /* loaded from: classes.dex */
            class a implements Parcelable.Creator<FullSpanItem> {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a  reason: merged with bridge method [inline-methods] */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b  reason: merged with bridge method [inline-methods] */
                public FullSpanItem[] newArray(int i10) {
                    return new FullSpanItem[i10];
                }
            }

            FullSpanItem(Parcel parcel) {
                this.f6631f = parcel.readInt();
                this.f6632m = parcel.readInt();
                this.f6634q = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f6633p = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int a(int i10) {
                int[] iArr = this.f6633p;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i10];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f6631f + ", mGapDir=" + this.f6632m + ", mHasUnwantedGapAfter=" + this.f6634q + ", mGapPerSpan=" + Arrays.toString(this.f6633p) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f6631f);
                parcel.writeInt(this.f6632m);
                parcel.writeInt(this.f6634q ? 1 : 0);
                int[] iArr = this.f6633p;
                if (iArr != null && iArr.length > 0) {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f6633p);
                    return;
                }
                parcel.writeInt(0);
            }

            FullSpanItem() {
            }
        }
    }
}
