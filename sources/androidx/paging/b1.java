package androidx.paging;

import androidx.recyclerview.widget.i;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: NullPaddedListDiffHelper.kt */
/* loaded from: classes.dex */
public final class b1 {

    /* compiled from: NullPaddedListDiffHelper.kt */
    /* loaded from: classes.dex */
    public static final class a extends i.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a1<T> f5414a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a1<T> f5415b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i.f<T> f5416c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f5417d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f5418e;

        a(a1<T> a1Var, a1<T> a1Var2, i.f<T> fVar, int i10, int i11) {
            this.f5414a = a1Var;
            this.f5415b = a1Var2;
            this.f5416c = fVar;
            this.f5417d = i10;
            this.f5418e = i11;
        }

        @Override // androidx.recyclerview.widget.i.b
        public boolean areContentsTheSame(int i10, int i11) {
            Object i12 = this.f5414a.i(i10);
            Object i13 = this.f5415b.i(i11);
            if (i12 == i13) {
                return true;
            }
            return this.f5416c.areContentsTheSame(i12, i13);
        }

        @Override // androidx.recyclerview.widget.i.b
        public boolean areItemsTheSame(int i10, int i11) {
            Object i12 = this.f5414a.i(i10);
            Object i13 = this.f5415b.i(i11);
            if (i12 == i13) {
                return true;
            }
            return this.f5416c.areItemsTheSame(i12, i13);
        }

        @Override // androidx.recyclerview.widget.i.b
        public Object getChangePayload(int i10, int i11) {
            Object i12 = this.f5414a.i(i10);
            Object i13 = this.f5415b.i(i11);
            if (i12 == i13) {
                return Boolean.TRUE;
            }
            return this.f5416c.getChangePayload(i12, i13);
        }

        @Override // androidx.recyclerview.widget.i.b
        public int getNewListSize() {
            return this.f5418e;
        }

        @Override // androidx.recyclerview.widget.i.b
        public int getOldListSize() {
            return this.f5417d;
        }
    }

    public static final <T> z0 a(a1<T> a1Var, a1<T> a1Var2, i.f<T> fVar) {
        vc.f s10;
        boolean z10;
        qc.q.i(a1Var, "<this>");
        qc.q.i(a1Var2, "newList");
        qc.q.i(fVar, "diffCallback");
        a aVar = new a(a1Var, a1Var2, fVar, a1Var.f(), a1Var2.f());
        boolean z11 = true;
        i.e c10 = androidx.recyclerview.widget.i.c(aVar, true);
        qc.q.h(c10, "NullPaddedList<T>.comput…    },\n        true\n    )");
        s10 = vc.l.s(0, a1Var.f());
        if (!(s10 instanceof Collection) || !((Collection) s10).isEmpty()) {
            Iterator<Integer> it = s10.iterator();
            while (it.hasNext()) {
                if (c10.b(((ec.h0) it).a()) != -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    break;
                }
            }
        }
        z11 = false;
        return new z0(c10, z11);
    }

    public static final <T> void b(a1<T> a1Var, androidx.recyclerview.widget.r rVar, a1<T> a1Var2, z0 z0Var) {
        qc.q.i(a1Var, "<this>");
        qc.q.i(rVar, "callback");
        qc.q.i(a1Var2, "newList");
        qc.q.i(z0Var, "diffResult");
        if (z0Var.b()) {
            c1.f5429a.a(a1Var, a1Var2, rVar, z0Var);
        } else {
            u.f6094a.b(rVar, a1Var, a1Var2);
        }
    }

    public static final int c(a1<?> a1Var, z0 z0Var, a1<?> a1Var2, int i10) {
        boolean z10;
        vc.f s10;
        int m10;
        int i11;
        int b10;
        vc.f s11;
        int m11;
        qc.q.i(a1Var, "<this>");
        qc.q.i(z0Var, "diffResult");
        qc.q.i(a1Var2, "newList");
        if (!z0Var.b()) {
            s11 = vc.l.s(0, a1Var2.getSize());
            m11 = vc.l.m(i10, s11);
            return m11;
        }
        int g10 = i10 - a1Var.g();
        int f10 = a1Var.f();
        if (g10 >= 0 && g10 < f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            for (int i12 = 0; i12 < 30; i12++) {
                int i13 = i12 / 2;
                if (i12 % 2 == 1) {
                    i11 = -1;
                } else {
                    i11 = 1;
                }
                int i14 = (i13 * i11) + g10;
                if (i14 >= 0 && i14 < a1Var.f() && (b10 = z0Var.a().b(i14)) != -1) {
                    return b10 + a1Var2.g();
                }
            }
        }
        s10 = vc.l.s(0, a1Var2.getSize());
        m10 = vc.l.m(i10, s10);
        return m10;
    }
}
