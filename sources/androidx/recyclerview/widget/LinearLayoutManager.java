package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.p implements m.h, RecyclerView.a0.b {
    int F;
    private c G;
    u H;
    private boolean I;
    private boolean J;
    boolean K;
    private boolean L;
    private boolean M;
    int N;
    int O;
    private boolean P;
    SavedState Q;
    final a R;
    private final b S;
    private int T;
    private int[] U;

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        int f6511f;

        /* renamed from: m  reason: collision with root package name */
        int f6512m;

        /* renamed from: p  reason: collision with root package name */
        boolean f6513p;

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

        boolean a() {
            if (this.f6511f >= 0) {
                return true;
            }
            return false;
        }

        void b() {
            this.f6511f = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f6511f);
            parcel.writeInt(this.f6512m);
            parcel.writeInt(this.f6513p ? 1 : 0);
        }

        SavedState(Parcel parcel) {
            this.f6511f = parcel.readInt();
            this.f6512m = parcel.readInt();
            this.f6513p = parcel.readInt() == 1;
        }

        @SuppressLint({"UnknownNullness"})
        public SavedState(SavedState savedState) {
            this.f6511f = savedState.f6511f;
            this.f6512m = savedState.f6512m;
            this.f6513p = savedState.f6513p;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        u f6514a;

        /* renamed from: b  reason: collision with root package name */
        int f6515b;

        /* renamed from: c  reason: collision with root package name */
        int f6516c;

        /* renamed from: d  reason: collision with root package name */
        boolean f6517d;

        /* renamed from: e  reason: collision with root package name */
        boolean f6518e;

        a() {
            e();
        }

        void a() {
            int m10;
            if (this.f6517d) {
                m10 = this.f6514a.i();
            } else {
                m10 = this.f6514a.m();
            }
            this.f6516c = m10;
        }

        public void b(View view, int i10) {
            if (this.f6517d) {
                this.f6516c = this.f6514a.d(view) + this.f6514a.o();
            } else {
                this.f6516c = this.f6514a.g(view);
            }
            this.f6515b = i10;
        }

        public void c(View view, int i10) {
            int o10 = this.f6514a.o();
            if (o10 >= 0) {
                b(view, i10);
                return;
            }
            this.f6515b = i10;
            if (this.f6517d) {
                int i11 = (this.f6514a.i() - o10) - this.f6514a.d(view);
                this.f6516c = this.f6514a.i() - i11;
                if (i11 > 0) {
                    int e10 = this.f6516c - this.f6514a.e(view);
                    int m10 = this.f6514a.m();
                    int min = e10 - (m10 + Math.min(this.f6514a.g(view) - m10, 0));
                    if (min < 0) {
                        this.f6516c += Math.min(i11, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g10 = this.f6514a.g(view);
            int m11 = g10 - this.f6514a.m();
            this.f6516c = g10;
            if (m11 > 0) {
                int i12 = (this.f6514a.i() - Math.min(0, (this.f6514a.i() - o10) - this.f6514a.d(view))) - (g10 + this.f6514a.e(view));
                if (i12 < 0) {
                    this.f6516c -= Math.min(m11, -i12);
                }
            }
        }

        boolean d(View view, RecyclerView.b0 b0Var) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            if (!qVar.c() && qVar.a() >= 0 && qVar.a() < b0Var.b()) {
                return true;
            }
            return false;
        }

        void e() {
            this.f6515b = -1;
            this.f6516c = RecyclerView.UNDEFINED_DURATION;
            this.f6517d = false;
            this.f6518e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f6515b + ", mCoordinate=" + this.f6516c + ", mLayoutFromEnd=" + this.f6517d + ", mValid=" + this.f6518e + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f6519a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f6520b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f6521c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f6522d;

        protected b() {
        }

        void a() {
            this.f6519a = 0;
            this.f6520b = false;
            this.f6521c = false;
            this.f6522d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: b  reason: collision with root package name */
        int f6524b;

        /* renamed from: c  reason: collision with root package name */
        int f6525c;

        /* renamed from: d  reason: collision with root package name */
        int f6526d;

        /* renamed from: e  reason: collision with root package name */
        int f6527e;

        /* renamed from: f  reason: collision with root package name */
        int f6528f;

        /* renamed from: g  reason: collision with root package name */
        int f6529g;

        /* renamed from: k  reason: collision with root package name */
        int f6533k;

        /* renamed from: m  reason: collision with root package name */
        boolean f6535m;

        /* renamed from: a  reason: collision with root package name */
        boolean f6523a = true;

        /* renamed from: h  reason: collision with root package name */
        int f6530h = 0;

        /* renamed from: i  reason: collision with root package name */
        int f6531i = 0;

        /* renamed from: j  reason: collision with root package name */
        boolean f6532j = false;

        /* renamed from: l  reason: collision with root package name */
        List<RecyclerView.f0> f6534l = null;

        c() {
        }

        private View e() {
            int size = this.f6534l.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = this.f6534l.get(i10).itemView;
                RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
                if (!qVar.c() && this.f6526d == qVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View f10 = f(view);
            if (f10 == null) {
                this.f6526d = -1;
            } else {
                this.f6526d = ((RecyclerView.q) f10.getLayoutParams()).a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean c(RecyclerView.b0 b0Var) {
            int i10 = this.f6526d;
            if (i10 >= 0 && i10 < b0Var.b()) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public View d(RecyclerView.w wVar) {
            if (this.f6534l != null) {
                return e();
            }
            View o10 = wVar.o(this.f6526d);
            this.f6526d += this.f6527e;
            return o10;
        }

        public View f(View view) {
            int a10;
            int size = this.f6534l.size();
            View view2 = null;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = this.f6534l.get(i11).itemView;
                RecyclerView.q qVar = (RecyclerView.q) view3.getLayoutParams();
                if (view3 != view && !qVar.c() && (a10 = (qVar.a() - this.f6526d) * this.f6527e) >= 0 && a10 < i10) {
                    view2 = view3;
                    if (a10 == 0) {
                        break;
                    }
                    i10 = a10;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context) {
        this(context, 1, false);
    }

    private void B2(RecyclerView.w wVar, c cVar) {
        if (cVar.f6523a && !cVar.f6535m) {
            int i10 = cVar.f6529g;
            int i11 = cVar.f6531i;
            if (cVar.f6528f == -1) {
                D2(wVar, i10, i11);
            } else {
                E2(wVar, i10, i11);
            }
        }
    }

    private void C2(RecyclerView.w wVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 > i10) {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                x1(i12, wVar);
            }
            return;
        }
        while (i10 > i11) {
            x1(i10, wVar);
            i10--;
        }
    }

    private void D2(RecyclerView.w wVar, int i10, int i11) {
        int V = V();
        if (i10 < 0) {
            return;
        }
        int h10 = (this.H.h() - i10) + i11;
        if (this.K) {
            for (int i12 = 0; i12 < V; i12++) {
                View U = U(i12);
                if (this.H.g(U) < h10 || this.H.q(U) < h10) {
                    C2(wVar, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = V - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View U2 = U(i14);
            if (this.H.g(U2) < h10 || this.H.q(U2) < h10) {
                C2(wVar, i13, i14);
                return;
            }
        }
    }

    private void E2(RecyclerView.w wVar, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int V = V();
        if (this.K) {
            int i13 = V - 1;
            for (int i14 = i13; i14 >= 0; i14--) {
                View U = U(i14);
                if (this.H.d(U) > i12 || this.H.p(U) > i12) {
                    C2(wVar, i13, i14);
                    return;
                }
            }
            return;
        }
        for (int i15 = 0; i15 < V; i15++) {
            View U2 = U(i15);
            if (this.H.d(U2) > i12 || this.H.p(U2) > i12) {
                C2(wVar, 0, i15);
                return;
            }
        }
    }

    private void G2() {
        if (this.F != 1 && w2()) {
            this.K = !this.J;
        } else {
            this.K = this.J;
        }
    }

    private boolean M2(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar) {
        View p22;
        boolean z10;
        boolean z11 = false;
        if (V() == 0) {
            return false;
        }
        View h02 = h0();
        if (h02 != null && aVar.d(h02, b0Var)) {
            aVar.c(h02, p0(h02));
            return true;
        }
        boolean z12 = this.I;
        boolean z13 = this.L;
        if (z12 != z13 || (p22 = p2(wVar, b0Var, aVar.f6517d, z13)) == null) {
            return false;
        }
        aVar.b(p22, p0(p22));
        if (!b0Var.e() && V1()) {
            int g10 = this.H.g(p22);
            int d10 = this.H.d(p22);
            int m10 = this.H.m();
            int i10 = this.H.i();
            if (d10 <= m10 && g10 < m10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (g10 >= i10 && d10 > i10) {
                z11 = true;
            }
            if (z10 || z11) {
                if (aVar.f6517d) {
                    m10 = i10;
                }
                aVar.f6516c = m10;
            }
        }
        return true;
    }

    private boolean N2(RecyclerView.b0 b0Var, a aVar) {
        int i10;
        boolean z10;
        int g10;
        boolean z11 = false;
        if (!b0Var.e() && (i10 = this.N) != -1) {
            if (i10 >= 0 && i10 < b0Var.b()) {
                aVar.f6515b = this.N;
                SavedState savedState = this.Q;
                if (savedState != null && savedState.a()) {
                    boolean z12 = this.Q.f6513p;
                    aVar.f6517d = z12;
                    if (z12) {
                        aVar.f6516c = this.H.i() - this.Q.f6512m;
                    } else {
                        aVar.f6516c = this.H.m() + this.Q.f6512m;
                    }
                    return true;
                } else if (this.O == Integer.MIN_VALUE) {
                    View O = O(this.N);
                    if (O != null) {
                        if (this.H.e(O) > this.H.n()) {
                            aVar.a();
                            return true;
                        } else if (this.H.g(O) - this.H.m() < 0) {
                            aVar.f6516c = this.H.m();
                            aVar.f6517d = false;
                            return true;
                        } else if (this.H.i() - this.H.d(O) < 0) {
                            aVar.f6516c = this.H.i();
                            aVar.f6517d = true;
                            return true;
                        } else {
                            if (aVar.f6517d) {
                                g10 = this.H.d(O) + this.H.o();
                            } else {
                                g10 = this.H.g(O);
                            }
                            aVar.f6516c = g10;
                        }
                    } else {
                        if (V() > 0) {
                            if (this.N < p0(U(0))) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 == this.K) {
                                z11 = true;
                            }
                            aVar.f6517d = z11;
                        }
                        aVar.a();
                    }
                    return true;
                } else {
                    boolean z13 = this.K;
                    aVar.f6517d = z13;
                    if (z13) {
                        aVar.f6516c = this.H.i() - this.O;
                    } else {
                        aVar.f6516c = this.H.m() + this.O;
                    }
                    return true;
                }
            }
            this.N = -1;
            this.O = RecyclerView.UNDEFINED_DURATION;
        }
        return false;
    }

    private void O2(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar) {
        int i10;
        if (N2(b0Var, aVar) || M2(wVar, b0Var, aVar)) {
            return;
        }
        aVar.a();
        if (this.L) {
            i10 = b0Var.b() - 1;
        } else {
            i10 = 0;
        }
        aVar.f6515b = i10;
    }

    private void P2(int i10, int i11, boolean z10, RecyclerView.b0 b0Var) {
        int i12;
        int m10;
        this.G.f6535m = F2();
        this.G.f6528f = i10;
        int[] iArr = this.U;
        boolean z11 = false;
        iArr[0] = 0;
        int i13 = 1;
        iArr[1] = 0;
        W1(b0Var, iArr);
        int max = Math.max(0, this.U[0]);
        int max2 = Math.max(0, this.U[1]);
        if (i10 == 1) {
            z11 = true;
        }
        c cVar = this.G;
        if (z11) {
            i12 = max2;
        } else {
            i12 = max;
        }
        cVar.f6530h = i12;
        if (!z11) {
            max = max2;
        }
        cVar.f6531i = max;
        if (z11) {
            cVar.f6530h = i12 + this.H.j();
            View s22 = s2();
            c cVar2 = this.G;
            if (this.K) {
                i13 = -1;
            }
            cVar2.f6527e = i13;
            int p02 = p0(s22);
            c cVar3 = this.G;
            cVar2.f6526d = p02 + cVar3.f6527e;
            cVar3.f6524b = this.H.d(s22);
            m10 = this.H.d(s22) - this.H.i();
        } else {
            View t22 = t2();
            this.G.f6530h += this.H.m();
            c cVar4 = this.G;
            if (!this.K) {
                i13 = -1;
            }
            cVar4.f6527e = i13;
            int p03 = p0(t22);
            c cVar5 = this.G;
            cVar4.f6526d = p03 + cVar5.f6527e;
            cVar5.f6524b = this.H.g(t22);
            m10 = (-this.H.g(t22)) + this.H.m();
        }
        c cVar6 = this.G;
        cVar6.f6525c = i11;
        if (z10) {
            cVar6.f6525c = i11 - m10;
        }
        cVar6.f6529g = m10;
    }

    private void Q2(int i10, int i11) {
        int i12;
        this.G.f6525c = this.H.i() - i11;
        c cVar = this.G;
        if (this.K) {
            i12 = -1;
        } else {
            i12 = 1;
        }
        cVar.f6527e = i12;
        cVar.f6526d = i10;
        cVar.f6528f = 1;
        cVar.f6524b = i11;
        cVar.f6529g = RecyclerView.UNDEFINED_DURATION;
    }

    private void R2(a aVar) {
        Q2(aVar.f6515b, aVar.f6516c);
    }

    private void S2(int i10, int i11) {
        int i12;
        this.G.f6525c = i11 - this.H.m();
        c cVar = this.G;
        cVar.f6526d = i10;
        if (this.K) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        cVar.f6527e = i12;
        cVar.f6528f = -1;
        cVar.f6524b = i11;
        cVar.f6529g = RecyclerView.UNDEFINED_DURATION;
    }

    private void T2(a aVar) {
        S2(aVar.f6515b, aVar.f6516c);
    }

    private int Y1(RecyclerView.b0 b0Var) {
        if (V() == 0) {
            return 0;
        }
        d2();
        return x.a(b0Var, this.H, h2(!this.M, true), g2(!this.M, true), this, this.M);
    }

    private int Z1(RecyclerView.b0 b0Var) {
        if (V() == 0) {
            return 0;
        }
        d2();
        return x.b(b0Var, this.H, h2(!this.M, true), g2(!this.M, true), this, this.M, this.K);
    }

    private int a2(RecyclerView.b0 b0Var) {
        if (V() == 0) {
            return 0;
        }
        d2();
        return x.c(b0Var, this.H, h2(!this.M, true), g2(!this.M, true), this, this.M);
    }

    private View f2() {
        return l2(0, V());
    }

    private View j2() {
        return l2(V() - 1, -1);
    }

    private View n2() {
        if (this.K) {
            return f2();
        }
        return j2();
    }

    private View o2() {
        if (this.K) {
            return j2();
        }
        return f2();
    }

    private int q2(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z10) {
        int i11;
        int i12 = this.H.i() - i10;
        if (i12 > 0) {
            int i13 = -H2(-i12, wVar, b0Var);
            int i14 = i10 + i13;
            if (z10 && (i11 = this.H.i() - i14) > 0) {
                this.H.r(i11);
                return i11 + i13;
            }
            return i13;
        }
        return 0;
    }

    private int r2(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z10) {
        int m10;
        int m11 = i10 - this.H.m();
        if (m11 > 0) {
            int i11 = -H2(m11, wVar, b0Var);
            int i12 = i10 + i11;
            if (z10 && (m10 = i12 - this.H.m()) > 0) {
                this.H.r(-m10);
                return i11 - m10;
            }
            return i11;
        }
        return 0;
    }

    private View s2() {
        int V;
        if (this.K) {
            V = 0;
        } else {
            V = V() - 1;
        }
        return U(V);
    }

    private View t2() {
        int i10;
        if (this.K) {
            i10 = V() - 1;
        } else {
            i10 = 0;
        }
        return U(i10);
    }

    private void z2(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i10, int i11) {
        boolean z10;
        if (b0Var.g() && V() != 0 && !b0Var.e() && V1()) {
            List<RecyclerView.f0> k10 = wVar.k();
            int size = k10.size();
            int p02 = p0(U(0));
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                RecyclerView.f0 f0Var = k10.get(i14);
                if (!f0Var.isRemoved()) {
                    char c10 = 1;
                    if (f0Var.getLayoutPosition() < p02) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 != this.K) {
                        c10 = 65535;
                    }
                    if (c10 == 65535) {
                        i12 += this.H.e(f0Var.itemView);
                    } else {
                        i13 += this.H.e(f0Var.itemView);
                    }
                }
            }
            this.G.f6534l = k10;
            if (i12 > 0) {
                S2(p0(t2()), i10);
                c cVar = this.G;
                cVar.f6530h = i12;
                cVar.f6525c = 0;
                cVar.a();
                e2(wVar, this.G, b0Var, false);
            }
            if (i13 > 0) {
                Q2(p0(s2()), i11);
                c cVar2 = this.G;
                cVar2.f6530h = i13;
                cVar2.f6525c = 0;
                cVar2.a();
                e2(wVar, this.G, b0Var, false);
            }
            this.G.f6534l = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void A(int i10, int i11, RecyclerView.b0 b0Var, RecyclerView.p.c cVar) {
        int i12;
        if (this.F != 0) {
            i10 = i11;
        }
        if (V() != 0 && i10 != 0) {
            d2();
            if (i10 > 0) {
                i12 = 1;
            } else {
                i12 = -1;
            }
            P2(i12, Math.abs(i10), true, b0Var);
            X1(b0Var, this.G, cVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean A0() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void B(int i10, RecyclerView.p.c cVar) {
        boolean z10;
        int i11;
        SavedState savedState = this.Q;
        int i12 = -1;
        if (savedState != null && savedState.a()) {
            SavedState savedState2 = this.Q;
            z10 = savedState2.f6513p;
            i11 = savedState2.f6511f;
        } else {
            G2();
            z10 = this.K;
            i11 = this.N;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        }
        if (!z10) {
            i12 = 1;
        }
        for (int i13 = 0; i13 < this.T && i11 >= 0 && i11 < i10; i13++) {
            cVar.a(i11, 0);
            i11 += i12;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int C(RecyclerView.b0 b0Var) {
        return Y1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int D(RecyclerView.b0 b0Var) {
        return Z1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int E(RecyclerView.b0 b0Var) {
        return a2(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int F(RecyclerView.b0 b0Var) {
        return Y1(b0Var);
    }

    boolean F2() {
        if (this.H.k() == 0 && this.H.h() == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int G(RecyclerView.b0 b0Var) {
        return Z1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int G1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.F == 1) {
            return 0;
        }
        return H2(i10, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int H(RecyclerView.b0 b0Var) {
        return a2(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void H1(int i10) {
        this.N = i10;
        this.O = RecyclerView.UNDEFINED_DURATION;
        SavedState savedState = this.Q;
        if (savedState != null) {
            savedState.b();
        }
        D1();
    }

    int H2(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        int i11;
        if (V() == 0 || i10 == 0) {
            return 0;
        }
        d2();
        this.G.f6523a = true;
        if (i10 > 0) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        int abs = Math.abs(i10);
        P2(i11, abs, true, b0Var);
        c cVar = this.G;
        int e22 = cVar.f6529g + e2(wVar, cVar, b0Var, false);
        if (e22 < 0) {
            return 0;
        }
        if (abs > e22) {
            i10 = i11 * e22;
        }
        this.H.r(-i10);
        this.G.f6533k = i10;
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int I1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.F == 0) {
            return 0;
        }
        return H2(i10, wVar, b0Var);
    }

    public void I2(int i10, int i11) {
        this.N = i10;
        this.O = i11;
        SavedState savedState = this.Q;
        if (savedState != null) {
            savedState.b();
        }
        D1();
    }

    public void J2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        s(null);
        if (i10 != this.F || this.H == null) {
            u b10 = u.b(this, i10);
            this.H = b10;
            this.R.f6514a = b10;
            this.F = i10;
            D1();
        }
    }

    public void K2(boolean z10) {
        s(null);
        if (z10 == this.J) {
            return;
        }
        this.J = z10;
        D1();
    }

    public void L2(boolean z10) {
        s(null);
        if (this.L == z10) {
            return;
        }
        this.L = z10;
        D1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public View O(int i10) {
        int V = V();
        if (V == 0) {
            return null;
        }
        int p02 = i10 - p0(U(0));
        if (p02 >= 0 && p02 < V) {
            View U = U(p02);
            if (p0(U) == i10) {
                return U;
            }
        }
        return super.O(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public RecyclerView.q P() {
        return new RecyclerView.q(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    boolean Q1() {
        if (j0() != 1073741824 && x0() != 1073741824 && y0()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void R0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.R0(recyclerView, wVar);
        if (this.P) {
            u1(wVar);
            wVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public View S0(View view, int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        int b22;
        View n22;
        View s22;
        G2();
        if (V() == 0 || (b22 = b2(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        d2();
        P2(b22, (int) (this.H.n() * 0.33333334f), false, b0Var);
        c cVar = this.G;
        cVar.f6529g = RecyclerView.UNDEFINED_DURATION;
        cVar.f6523a = false;
        e2(wVar, cVar, b0Var, true);
        if (b22 == -1) {
            n22 = o2();
        } else {
            n22 = n2();
        }
        if (b22 == -1) {
            s22 = t2();
        } else {
            s22 = s2();
        }
        if (s22.hasFocusable()) {
            if (n22 == null) {
                return null;
            }
            return s22;
        }
        return n22;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void S1(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i10) {
        q qVar = new q(recyclerView.getContext());
        qVar.p(i10);
        T1(qVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void T0(AccessibilityEvent accessibilityEvent) {
        super.T0(accessibilityEvent);
        if (V() > 0) {
            accessibilityEvent.setFromIndex(i2());
            accessibilityEvent.setToIndex(k2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean V1() {
        if (this.Q == null && this.I == this.L) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void W1(RecyclerView.b0 b0Var, int[] iArr) {
        int i10;
        int u22 = u2(b0Var);
        if (this.G.f6528f == -1) {
            i10 = 0;
        } else {
            i10 = u22;
            u22 = 0;
        }
        iArr[0] = u22;
        iArr[1] = i10;
    }

    void X1(RecyclerView.b0 b0Var, c cVar, RecyclerView.p.c cVar2) {
        int i10 = cVar.f6526d;
        if (i10 >= 0 && i10 < b0Var.b()) {
            cVar2.a(i10, Math.max(0, cVar.f6529g));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    @SuppressLint({"UnknownNullness"})
    public PointF b(int i10) {
        if (V() == 0) {
            return null;
        }
        boolean z10 = false;
        int i11 = 1;
        if (i10 < p0(U(0))) {
            z10 = true;
        }
        if (z10 != this.K) {
            i11 = -1;
        }
        if (this.F == 0) {
            return new PointF(i11, 0.0f);
        }
        return new PointF(0.0f, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b2(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 17) {
                    if (i10 != 33) {
                        if (i10 != 66) {
                            if (i10 != 130) {
                                return RecyclerView.UNDEFINED_DURATION;
                            }
                            if (this.F == 1) {
                                return 1;
                            }
                            return RecyclerView.UNDEFINED_DURATION;
                        } else if (this.F == 0) {
                            return 1;
                        } else {
                            return RecyclerView.UNDEFINED_DURATION;
                        }
                    } else if (this.F == 1) {
                        return -1;
                    } else {
                        return RecyclerView.UNDEFINED_DURATION;
                    }
                } else if (this.F == 0) {
                    return -1;
                } else {
                    return RecyclerView.UNDEFINED_DURATION;
                }
            } else if (this.F != 1 && w2()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.F == 1 || !w2()) {
            return -1;
        } else {
            return 1;
        }
    }

    c c2() {
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d2() {
        if (this.G == null) {
            this.G = c2();
        }
    }

    int e2(RecyclerView.w wVar, c cVar, RecyclerView.b0 b0Var, boolean z10) {
        int i10 = cVar.f6525c;
        int i11 = cVar.f6529g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f6529g = i11 + i10;
            }
            B2(wVar, cVar);
        }
        int i12 = cVar.f6525c + cVar.f6530h;
        b bVar = this.S;
        while (true) {
            if ((!cVar.f6535m && i12 <= 0) || !cVar.c(b0Var)) {
                break;
            }
            bVar.a();
            y2(wVar, b0Var, cVar, bVar);
            if (!bVar.f6520b) {
                cVar.f6524b += bVar.f6519a * cVar.f6528f;
                if (!bVar.f6521c || cVar.f6534l != null || !b0Var.e()) {
                    int i13 = cVar.f6525c;
                    int i14 = bVar.f6519a;
                    cVar.f6525c = i13 - i14;
                    i12 -= i14;
                }
                int i15 = cVar.f6529g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + bVar.f6519a;
                    cVar.f6529g = i16;
                    int i17 = cVar.f6525c;
                    if (i17 < 0) {
                        cVar.f6529g = i16 + i17;
                    }
                    B2(wVar, cVar);
                }
                if (z10 && bVar.f6522d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f6525c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void g1(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int q22;
        int i15;
        View O;
        int g10;
        int i16;
        int i17 = -1;
        if ((this.Q != null || this.N != -1) && b0Var.b() == 0) {
            u1(wVar);
            return;
        }
        SavedState savedState = this.Q;
        if (savedState != null && savedState.a()) {
            this.N = this.Q.f6511f;
        }
        d2();
        this.G.f6523a = false;
        G2();
        View h02 = h0();
        a aVar = this.R;
        if (aVar.f6518e && this.N == -1 && this.Q == null) {
            if (h02 != null && (this.H.g(h02) >= this.H.i() || this.H.d(h02) <= this.H.m())) {
                this.R.c(h02, p0(h02));
            }
        } else {
            aVar.e();
            a aVar2 = this.R;
            aVar2.f6517d = this.K ^ this.L;
            O2(wVar, b0Var, aVar2);
            this.R.f6518e = true;
        }
        c cVar = this.G;
        if (cVar.f6533k >= 0) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        cVar.f6528f = i10;
        int[] iArr = this.U;
        iArr[0] = 0;
        iArr[1] = 0;
        W1(b0Var, iArr);
        int max = Math.max(0, this.U[0]) + this.H.m();
        int max2 = Math.max(0, this.U[1]) + this.H.j();
        if (b0Var.e() && (i15 = this.N) != -1 && this.O != Integer.MIN_VALUE && (O = O(i15)) != null) {
            if (this.K) {
                i16 = this.H.i() - this.H.d(O);
                g10 = this.O;
            } else {
                g10 = this.H.g(O) - this.H.m();
                i16 = this.O;
            }
            int i18 = i16 - g10;
            if (i18 > 0) {
                max += i18;
            } else {
                max2 -= i18;
            }
        }
        a aVar3 = this.R;
        if (!aVar3.f6517d ? !this.K : this.K) {
            i17 = 1;
        }
        A2(wVar, b0Var, aVar3, i17);
        I(wVar);
        this.G.f6535m = F2();
        this.G.f6532j = b0Var.e();
        this.G.f6531i = 0;
        a aVar4 = this.R;
        if (aVar4.f6517d) {
            T2(aVar4);
            c cVar2 = this.G;
            cVar2.f6530h = max;
            e2(wVar, cVar2, b0Var, false);
            c cVar3 = this.G;
            i12 = cVar3.f6524b;
            int i19 = cVar3.f6526d;
            int i20 = cVar3.f6525c;
            if (i20 > 0) {
                max2 += i20;
            }
            R2(this.R);
            c cVar4 = this.G;
            cVar4.f6530h = max2;
            cVar4.f6526d += cVar4.f6527e;
            e2(wVar, cVar4, b0Var, false);
            c cVar5 = this.G;
            i11 = cVar5.f6524b;
            int i21 = cVar5.f6525c;
            if (i21 > 0) {
                S2(i19, i12);
                c cVar6 = this.G;
                cVar6.f6530h = i21;
                e2(wVar, cVar6, b0Var, false);
                i12 = this.G.f6524b;
            }
        } else {
            R2(aVar4);
            c cVar7 = this.G;
            cVar7.f6530h = max2;
            e2(wVar, cVar7, b0Var, false);
            c cVar8 = this.G;
            i11 = cVar8.f6524b;
            int i22 = cVar8.f6526d;
            int i23 = cVar8.f6525c;
            if (i23 > 0) {
                max += i23;
            }
            T2(this.R);
            c cVar9 = this.G;
            cVar9.f6530h = max;
            cVar9.f6526d += cVar9.f6527e;
            e2(wVar, cVar9, b0Var, false);
            c cVar10 = this.G;
            i12 = cVar10.f6524b;
            int i24 = cVar10.f6525c;
            if (i24 > 0) {
                Q2(i22, i11);
                c cVar11 = this.G;
                cVar11.f6530h = i24;
                e2(wVar, cVar11, b0Var, false);
                i11 = this.G.f6524b;
            }
        }
        if (V() > 0) {
            if (this.K ^ this.L) {
                int q23 = q2(i11, wVar, b0Var, true);
                i13 = i12 + q23;
                i14 = i11 + q23;
                q22 = r2(i13, wVar, b0Var, false);
            } else {
                int r22 = r2(i12, wVar, b0Var, true);
                i13 = i12 + r22;
                i14 = i11 + r22;
                q22 = q2(i14, wVar, b0Var, false);
            }
            i12 = i13 + q22;
            i11 = i14 + q22;
        }
        z2(wVar, b0Var, i12, i11);
        if (!b0Var.e()) {
            this.H.s();
        } else {
            this.R.e();
        }
        this.I = this.L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View g2(boolean z10, boolean z11) {
        if (this.K) {
            return m2(0, V(), z10, z11);
        }
        return m2(V() - 1, -1, z10, z11);
    }

    @Override // androidx.recyclerview.widget.m.h
    public void h(View view, View view2, int i10, int i11) {
        char c10;
        s("Cannot drop a view during a scroll or layout calculation");
        d2();
        G2();
        int p02 = p0(view);
        int p03 = p0(view2);
        if (p02 < p03) {
            c10 = 1;
        } else {
            c10 = 65535;
        }
        if (this.K) {
            if (c10 == 1) {
                I2(p03, this.H.i() - (this.H.g(view2) + this.H.e(view)));
            } else {
                I2(p03, this.H.i() - this.H.d(view2));
            }
        } else if (c10 == 65535) {
            I2(p03, this.H.g(view2));
        } else {
            I2(p03, this.H.d(view2) - this.H.e(view));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void h1(RecyclerView.b0 b0Var) {
        super.h1(b0Var);
        this.Q = null;
        this.N = -1;
        this.O = RecyclerView.UNDEFINED_DURATION;
        this.R.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View h2(boolean z10, boolean z11) {
        if (this.K) {
            return m2(V() - 1, -1, z10, z11);
        }
        return m2(0, V(), z10, z11);
    }

    public int i2() {
        View m22 = m2(0, V(), false, true);
        if (m22 == null) {
            return -1;
        }
        return p0(m22);
    }

    public int k2() {
        View m22 = m2(V() - 1, -1, false, true);
        if (m22 == null) {
            return -1;
        }
        return p0(m22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void l1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.Q = savedState;
            if (this.N != -1) {
                savedState.b();
            }
            D1();
        }
    }

    View l2(int i10, int i11) {
        char c10;
        int i12;
        int i13;
        d2();
        if (i11 > i10) {
            c10 = 1;
        } else if (i11 < i10) {
            c10 = 65535;
        } else {
            c10 = 0;
        }
        if (c10 == 0) {
            return U(i10);
        }
        if (this.H.g(U(i10)) < this.H.m()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        if (this.F == 0) {
            return this.f6591r.a(i10, i11, i12, i13);
        }
        return this.f6592s.a(i10, i11, i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public Parcelable m1() {
        if (this.Q != null) {
            return new SavedState(this.Q);
        }
        SavedState savedState = new SavedState();
        if (V() > 0) {
            d2();
            boolean z10 = this.I ^ this.K;
            savedState.f6513p = z10;
            if (z10) {
                View s22 = s2();
                savedState.f6512m = this.H.i() - this.H.d(s22);
                savedState.f6511f = p0(s22);
            } else {
                View t22 = t2();
                savedState.f6511f = p0(t22);
                savedState.f6512m = this.H.g(t22) - this.H.m();
            }
        } else {
            savedState.b();
        }
        return savedState;
    }

    View m2(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        d2();
        int i13 = 320;
        if (z10) {
            i12 = 24579;
        } else {
            i12 = 320;
        }
        if (!z11) {
            i13 = 0;
        }
        if (this.F == 0) {
            return this.f6591r.a(i10, i11, i12, i13);
        }
        return this.f6592s.a(i10, i11, i12, i13);
    }

    View p2(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z10, boolean z11) {
        int i10;
        int i11;
        int i12;
        boolean z12;
        boolean z13;
        d2();
        int V = V();
        if (z11) {
            i11 = V() - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = V;
            i11 = 0;
            i12 = 1;
        }
        int b10 = b0Var.b();
        int m10 = this.H.m();
        int i13 = this.H.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i11 != i10) {
            View U = U(i11);
            int p02 = p0(U);
            int g10 = this.H.g(U);
            int d10 = this.H.d(U);
            if (p02 >= 0 && p02 < b10) {
                if (((RecyclerView.q) U.getLayoutParams()).c()) {
                    if (view3 == null) {
                        view3 = U;
                    }
                } else {
                    if (d10 <= m10 && g10 < m10) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (g10 >= i13 && d10 > i13) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z12 && !z13) {
                        return U;
                    }
                    if (z10) {
                        if (!z13) {
                            if (view != null) {
                            }
                            view = U;
                        }
                        view2 = U;
                    } else {
                        if (!z12) {
                            if (view != null) {
                            }
                            view = U;
                        }
                        view2 = U;
                    }
                }
            }
            i11 += i12;
        }
        if (view == null) {
            if (view2 != null) {
                return view2;
            }
            return view3;
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void s(String str) {
        if (this.Q == null) {
            super.s(str);
        }
    }

    @Deprecated
    protected int u2(RecyclerView.b0 b0Var) {
        if (b0Var.d()) {
            return this.H.n();
        }
        return 0;
    }

    public int v2() {
        return this.F;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean w() {
        if (this.F == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean w2() {
        if (l0() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean x() {
        if (this.F == 1) {
            return true;
        }
        return false;
    }

    public boolean x2() {
        return this.M;
    }

    void y2(RecyclerView.w wVar, RecyclerView.b0 b0Var, c cVar, b bVar) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int f10;
        boolean z11;
        View d10 = cVar.d(wVar);
        if (d10 == null) {
            bVar.f6520b = true;
            return;
        }
        RecyclerView.q qVar = (RecyclerView.q) d10.getLayoutParams();
        if (cVar.f6534l == null) {
            boolean z12 = this.K;
            if (cVar.f6528f == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z12 == z11) {
                p(d10);
            } else {
                q(d10, 0);
            }
        } else {
            boolean z13 = this.K;
            if (cVar.f6528f == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z13 == z10) {
                n(d10);
            } else {
                o(d10, 0);
            }
        }
        J0(d10, 0, 0);
        bVar.f6519a = this.H.e(d10);
        if (this.F == 1) {
            if (w2()) {
                f10 = w0() - getPaddingRight();
                i13 = f10 - this.H.f(d10);
            } else {
                i13 = getPaddingLeft();
                f10 = this.H.f(d10) + i13;
            }
            if (cVar.f6528f == -1) {
                int i14 = cVar.f6524b;
                i12 = i14;
                i11 = f10;
                i10 = i14 - bVar.f6519a;
            } else {
                int i15 = cVar.f6524b;
                i10 = i15;
                i11 = f10;
                i12 = bVar.f6519a + i15;
            }
        } else {
            int paddingTop = getPaddingTop();
            int f11 = this.H.f(d10) + paddingTop;
            if (cVar.f6528f == -1) {
                int i16 = cVar.f6524b;
                i11 = i16;
                i10 = paddingTop;
                i12 = f11;
                i13 = i16 - bVar.f6519a;
            } else {
                int i17 = cVar.f6524b;
                i10 = paddingTop;
                i11 = bVar.f6519a + i17;
                i12 = f11;
                i13 = i17;
            }
        }
        I0(d10, i13, i10, i11, i12);
        if (qVar.c() || qVar.b()) {
            bVar.f6521c = true;
        }
        bVar.f6522d = d10.hasFocusable();
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context, int i10, boolean z10) {
        this.F = 1;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = true;
        this.N = -1;
        this.O = RecyclerView.UNDEFINED_DURATION;
        this.Q = null;
        this.R = new a();
        this.S = new b();
        this.T = 2;
        this.U = new int[2];
        J2(i10);
        K2(z10);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.F = 1;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = true;
        this.N = -1;
        this.O = RecyclerView.UNDEFINED_DURATION;
        this.Q = null;
        this.R = new a();
        this.S = new b();
        this.T = 2;
        this.U = new int[2];
        RecyclerView.p.d q02 = RecyclerView.p.q0(context, attributeSet, i10, i11);
        J2(q02.f6602a);
        K2(q02.f6604c);
        L2(q02.f6605d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A2(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar, int i10) {
    }
}
