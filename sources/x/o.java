package x;

import j0.g2;
import j0.z1;
import java.util.List;
import y.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyListItemProvider.kt */
/* loaded from: classes.dex */
public final class o implements n {

    /* renamed from: a  reason: collision with root package name */
    private final a0 f25582a;

    /* renamed from: b  reason: collision with root package name */
    private final k f25583b;

    /* renamed from: c  reason: collision with root package name */
    private final androidx.compose.foundation.lazy.b f25584c;

    /* renamed from: d  reason: collision with root package name */
    private final y.r f25585d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyListItemProvider.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f25587m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(2);
            this.f25587m = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.t()) {
                lVar.z();
                return;
            }
            if (j0.n.K()) {
                j0.n.V(-824725566, i10, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item.<anonymous> (LazyListItemProvider.kt:76)");
            }
            k kVar = o.this.f25583b;
            int i11 = this.f25587m;
            o oVar = o.this;
            c.a<j> aVar = kVar.d().get(i11);
            aVar.c().a().invoke(oVar.e(), Integer.valueOf(i11 - aVar.b()), lVar, 0);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyListItemProvider.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f25589m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ Object f25590p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f25591q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, Object obj, int i11) {
            super(2);
            this.f25589m = i10;
            this.f25590p = obj;
            this.f25591q = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            o.this.g(this.f25589m, this.f25590p, lVar, z1.a(this.f25591q | 1));
        }
    }

    public o(a0 a0Var, k kVar, androidx.compose.foundation.lazy.b bVar, y.r rVar) {
        qc.q.i(a0Var, "state");
        qc.q.i(kVar, "intervalContent");
        qc.q.i(bVar, "itemScope");
        qc.q.i(rVar, "keyIndexMap");
        this.f25582a = a0Var;
        this.f25583b = kVar;
        this.f25584c = bVar;
        this.f25585d = rVar;
    }

    @Override // y.o
    public Object a(int i10) {
        Object a10 = f().a(i10);
        if (a10 == null) {
            return this.f25583b.f(i10);
        }
        return a10;
    }

    @Override // y.o
    public int b(Object obj) {
        qc.q.i(obj, "key");
        return f().b(obj);
    }

    @Override // y.o
    public int c() {
        return this.f25583b.e();
    }

    @Override // y.o
    public Object d(int i10) {
        return this.f25583b.c(i10);
    }

    @Override // x.n
    public androidx.compose.foundation.lazy.b e() {
        return this.f25584c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        return qc.q.d(this.f25583b, ((o) obj).f25583b);
    }

    @Override // x.n
    public y.r f() {
        return this.f25585d;
    }

    @Override // y.o
    public void g(int i10, Object obj, j0.l lVar, int i11) {
        qc.q.i(obj, "key");
        j0.l q10 = lVar.q(-462424778);
        if (j0.n.K()) {
            j0.n.V(-462424778, i11, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:75)");
        }
        y.x.a(obj, i10, this.f25582a.q(), q0.c.b(q10, -824725566, true, new a(i10)), q10, ((i11 << 3) & 112) | 3592);
        if (j0.n.K()) {
            j0.n.U();
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new b(i10, obj, i11));
        }
    }

    @Override // x.n
    public List<Integer> h() {
        return this.f25583b.g();
    }

    public int hashCode() {
        return this.f25583b.hashCode();
    }
}
