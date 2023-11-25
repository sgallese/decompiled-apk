package q0;

import dc.w;
import j0.g2;
import j0.l;
import j0.x1;
import j0.z1;
import java.util.ArrayList;
import java.util.List;
import pc.p;
import pc.s;
import pc.t;
import qc.k0;
import qc.q;
import qc.r;

/* compiled from: ComposableLambda.jvm.kt */
/* loaded from: classes.dex */
public final class b implements q0.a {

    /* renamed from: f  reason: collision with root package name */
    private final int f21309f;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f21310m;

    /* renamed from: p  reason: collision with root package name */
    private Object f21311p;

    /* renamed from: q  reason: collision with root package name */
    private x1 f21312q;

    /* renamed from: r  reason: collision with root package name */
    private List<x1> f21313r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComposableLambda.jvm.kt */
    /* loaded from: classes.dex */
    public static final class a extends r implements p<l, Integer, w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Object f21315m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f21316p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, int i10) {
            super(2);
            this.f21315m = obj;
            this.f21316p = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return w.f13270a;
        }

        public final void invoke(l lVar, int i10) {
            q.i(lVar, "nc");
            b.this.b(this.f21315m, lVar, z1.a(this.f21316p) | 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComposableLambda.jvm.kt */
    /* renamed from: q0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0477b extends r implements p<l, Integer, w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Object f21318m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ Object f21319p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f21320q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0477b(Object obj, Object obj2, int i10) {
            super(2);
            this.f21318m = obj;
            this.f21319p = obj2;
            this.f21320q = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return w.f13270a;
        }

        public final void invoke(l lVar, int i10) {
            q.i(lVar, "nc");
            b.this.c(this.f21318m, this.f21319p, lVar, z1.a(this.f21320q) | 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComposableLambda.jvm.kt */
    /* loaded from: classes.dex */
    public static final class c extends r implements p<l, Integer, w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Object f21322m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ Object f21323p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ Object f21324q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f21325r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Object obj, Object obj2, Object obj3, int i10) {
            super(2);
            this.f21322m = obj;
            this.f21323p = obj2;
            this.f21324q = obj3;
            this.f21325r = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return w.f13270a;
        }

        public final void invoke(l lVar, int i10) {
            q.i(lVar, "nc");
            b.this.d(this.f21322m, this.f21323p, this.f21324q, lVar, z1.a(this.f21325r) | 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComposableLambda.jvm.kt */
    /* loaded from: classes.dex */
    public static final class d extends r implements p<l, Integer, w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Object f21327m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ Object f21328p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ Object f21329q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ Object f21330r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ int f21331s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
            super(2);
            this.f21327m = obj;
            this.f21328p = obj2;
            this.f21329q = obj3;
            this.f21330r = obj4;
            this.f21331s = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return w.f13270a;
        }

        public final void invoke(l lVar, int i10) {
            q.i(lVar, "nc");
            b.this.e(this.f21327m, this.f21328p, this.f21329q, this.f21330r, lVar, z1.a(this.f21331s) | 1);
        }
    }

    public b(int i10, boolean z10) {
        this.f21309f = i10;
        this.f21310m = z10;
    }

    private final void f(l lVar) {
        x1 b10;
        if (this.f21310m && (b10 = lVar.b()) != null) {
            lVar.A(b10);
            if (q0.c.e(this.f21312q, b10)) {
                this.f21312q = b10;
                return;
            }
            List<x1> list = this.f21313r;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                this.f21313r = arrayList;
                arrayList.add(b10);
                return;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (q0.c.e(list.get(i10), b10)) {
                    list.set(i10, b10);
                    return;
                }
            }
            list.add(b10);
        }
    }

    private final void g() {
        if (this.f21310m) {
            x1 x1Var = this.f21312q;
            if (x1Var != null) {
                x1Var.invalidate();
                this.f21312q = null;
            }
            List<x1> list = this.f21313r;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).invalidate();
                }
                list.clear();
            }
        }
    }

    @Override // pc.s
    public /* bridge */ /* synthetic */ Object D0(Object obj, Object obj2, Object obj3, l lVar, Integer num) {
        return d(obj, obj2, obj3, lVar, num.intValue());
    }

    public Object a(l lVar, int i10) {
        int f10;
        q.i(lVar, "c");
        l q10 = lVar.q(this.f21309f);
        f(q10);
        if (q10.Q(this)) {
            f10 = q0.c.d(0);
        } else {
            f10 = q0.c.f(0);
        }
        int i11 = i10 | f10;
        Object obj = this.f21311p;
        q.g(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((p) k0.e(obj, 2)).invoke(q10, Integer.valueOf(i11));
        g2 w10 = q10.w();
        if (w10 != null) {
            q.g(this, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
            w10.a((p) k0.e(this, 2));
        }
        return invoke;
    }

    public Object b(Object obj, l lVar, int i10) {
        int f10;
        q.i(lVar, "c");
        l q10 = lVar.q(this.f21309f);
        f(q10);
        if (q10.Q(this)) {
            f10 = q0.c.d(1);
        } else {
            f10 = q0.c.f(1);
        }
        Object obj2 = this.f21311p;
        q.g(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((pc.q) k0.e(obj2, 3)).invoke(obj, q10, Integer.valueOf(f10 | i10));
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new a(obj, i10));
        }
        return invoke;
    }

    public Object c(Object obj, Object obj2, l lVar, int i10) {
        int f10;
        q.i(lVar, "c");
        l q10 = lVar.q(this.f21309f);
        f(q10);
        if (q10.Q(this)) {
            f10 = q0.c.d(2);
        } else {
            f10 = q0.c.f(2);
        }
        Object obj3 = this.f21311p;
        q.g(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((pc.r) k0.e(obj3, 4)).invoke(obj, obj2, q10, Integer.valueOf(f10 | i10));
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new C0477b(obj, obj2, i10));
        }
        return invoke;
    }

    public Object d(Object obj, Object obj2, Object obj3, l lVar, int i10) {
        int f10;
        q.i(lVar, "c");
        l q10 = lVar.q(this.f21309f);
        f(q10);
        if (q10.Q(this)) {
            f10 = q0.c.d(3);
        } else {
            f10 = q0.c.f(3);
        }
        Object obj4 = this.f21311p;
        q.g(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object D0 = ((s) k0.e(obj4, 5)).D0(obj, obj2, obj3, q10, Integer.valueOf(f10 | i10));
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new c(obj, obj2, obj3, i10));
        }
        return D0;
    }

    public Object e(Object obj, Object obj2, Object obj3, Object obj4, l lVar, int i10) {
        int f10;
        q.i(lVar, "c");
        l q10 = lVar.q(this.f21309f);
        f(q10);
        if (q10.Q(this)) {
            f10 = q0.c.d(4);
        } else {
            f10 = q0.c.f(4);
        }
        Object obj5 = this.f21311p;
        q.g(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object t02 = ((t) k0.e(obj5, 6)).t0(obj, obj2, obj3, obj4, q10, Integer.valueOf(f10 | i10));
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new d(obj, obj2, obj3, obj4, i10));
        }
        return t02;
    }

    public final void h(Object obj) {
        boolean z10;
        q.i(obj, "block");
        if (!q.d(this.f21311p, obj)) {
            if (this.f21311p == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f21311p = obj;
            if (!z10) {
                g();
            }
        }
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ Object invoke(l lVar, Integer num) {
        return a(lVar, num.intValue());
    }

    @Override // pc.t
    public /* bridge */ /* synthetic */ Object t0(Object obj, Object obj2, Object obj3, Object obj4, l lVar, Integer num) {
        return e(obj, obj2, obj3, obj4, lVar, num.intValue());
    }

    @Override // pc.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, l lVar, Integer num) {
        return b(obj, lVar, num.intValue());
    }

    @Override // pc.r
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, l lVar, Integer num) {
        return c(obj, obj2, lVar, num.intValue());
    }
}
