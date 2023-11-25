package androidx.compose.ui.window;

import dc.w;
import ec.t;
import java.util.ArrayList;
import java.util.List;
import n1.g0;
import n1.h0;
import n1.i0;
import n1.j0;
import n1.k0;
import n1.l0;
import n1.n;
import n1.y0;
import qc.q;
import qc.r;

/* compiled from: AndroidPopup.android.kt */
/* loaded from: classes.dex */
public final class b implements i0 {

    /* renamed from: a  reason: collision with root package name */
    public static final b f3145a = new b();

    /* compiled from: AndroidPopup.android.kt */
    /* loaded from: classes.dex */
    public static final class a extends r implements pc.l<y0.a, w> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f3146f = new a();

        public a() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            q.i(aVar, "$this$layout");
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(y0.a aVar) {
            invoke2(aVar);
            return w.f13270a;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    /* renamed from: androidx.compose.ui.window.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0057b extends r implements pc.l<y0.a, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ y0 f3147f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0057b(y0 y0Var) {
            super(1);
            this.f3147f = y0Var;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(y0.a aVar) {
            invoke2(aVar);
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            q.i(aVar, "$this$layout");
            y0.a.r(aVar, this.f3147f, 0, 0, 0.0f, 4, null);
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    /* loaded from: classes.dex */
    public static final class c extends r implements pc.l<y0.a, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List<y0> f3148f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends y0> list) {
            super(1);
            this.f3148f = list;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(y0.a aVar) {
            invoke2(aVar);
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            int k10;
            q.i(aVar, "$this$layout");
            k10 = t.k(this.f3148f);
            if (k10 < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                y0.a.r(aVar, this.f3148f.get(i10), 0, 0, 0.0f, 4, null);
                if (i10 == k10) {
                    return;
                }
                i10++;
            }
        }
    }

    @Override // n1.i0
    public /* synthetic */ int maxIntrinsicHeight(n nVar, List list, int i10) {
        return h0.a(this, nVar, list, i10);
    }

    @Override // n1.i0
    public /* synthetic */ int maxIntrinsicWidth(n nVar, List list, int i10) {
        return h0.b(this, nVar, list, i10);
    }

    @Override // n1.i0
    /* renamed from: measure-3p2s80s */
    public final j0 mo0measure3p2s80s(l0 l0Var, List<? extends g0> list, long j10) {
        int k10;
        int i10;
        int i11;
        q.i(l0Var, "$this$Layout");
        q.i(list, "measurables");
        int size = list.size();
        if (size != 0) {
            int i12 = 0;
            if (size != 1) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    arrayList.add(list.get(i13).w(j10));
                }
                k10 = t.k(arrayList);
                if (k10 >= 0) {
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        y0 y0Var = (y0) arrayList.get(i12);
                        i14 = Math.max(i14, y0Var.A0());
                        i15 = Math.max(i15, y0Var.l0());
                        if (i12 == k10) {
                            break;
                        }
                        i12++;
                    }
                    i10 = i14;
                    i11 = i15;
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                return k0.b(l0Var, i10, i11, null, new c(arrayList), 4, null);
            }
            y0 w10 = list.get(0).w(j10);
            return k0.b(l0Var, w10.A0(), w10.l0(), null, new C0057b(w10), 4, null);
        }
        return k0.b(l0Var, 0, 0, null, a.f3146f, 4, null);
    }

    @Override // n1.i0
    public /* synthetic */ int minIntrinsicHeight(n nVar, List list, int i10) {
        return h0.c(this, nVar, list, i10);
    }

    @Override // n1.i0
    public /* synthetic */ int minIntrinsicWidth(n nVar, List list, int i10) {
        return h0.d(this, nVar, list, i10);
    }
}
