package androidx.paging;

import androidx.paging.a2;
import androidx.paging.o;
import java.util.List;

/* compiled from: WrapperPositionalDataSource.kt */
/* loaded from: classes.dex */
public final class s2<A, B> extends a2<B> {

    /* renamed from: a  reason: collision with root package name */
    private final a2<A> f6046a;

    /* renamed from: b  reason: collision with root package name */
    private final n.a<List<A>, List<B>> f6047b;

    /* compiled from: WrapperPositionalDataSource.kt */
    /* loaded from: classes.dex */
    public static final class a extends a2.b<A> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a2.b<B> f6048a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ s2<A, B> f6049b;

        a(a2.b<B> bVar, s2<A, B> s2Var) {
            this.f6048a = bVar;
            this.f6049b = s2Var;
        }

        @Override // androidx.paging.a2.b
        public void a(List<? extends A> list, int i10) {
            qc.q.i(list, "data");
            this.f6048a.a(o.Companion.a(this.f6049b.f(), list), i10);
        }
    }

    /* compiled from: WrapperPositionalDataSource.kt */
    /* loaded from: classes.dex */
    public static final class b extends a2.d<A> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a2.d<B> f6050a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ s2<A, B> f6051b;

        b(a2.d<B> dVar, s2<A, B> s2Var) {
            this.f6050a = dVar;
            this.f6051b = s2Var;
        }

        @Override // androidx.paging.a2.d
        public void a(List<? extends A> list) {
            qc.q.i(list, "data");
            this.f6050a.a(o.Companion.a(this.f6051b.f(), list));
        }
    }

    public s2(a2<A> a2Var, n.a<List<A>, List<B>> aVar) {
        qc.q.i(a2Var, "source");
        qc.q.i(aVar, "listFunction");
        this.f6046a = a2Var;
        this.f6047b = aVar;
    }

    @Override // androidx.paging.o
    public void addInvalidatedCallback(o.d dVar) {
        qc.q.i(dVar, "onInvalidatedCallback");
        this.f6046a.addInvalidatedCallback(dVar);
    }

    public final n.a<List<A>, List<B>> f() {
        return this.f6047b;
    }

    @Override // androidx.paging.o
    public void invalidate() {
        this.f6046a.invalidate();
    }

    @Override // androidx.paging.o
    public boolean isInvalid() {
        return this.f6046a.isInvalid();
    }

    @Override // androidx.paging.a2
    public void loadInitial(a2.c cVar, a2.b<B> bVar) {
        qc.q.i(cVar, "params");
        qc.q.i(bVar, "callback");
        this.f6046a.loadInitial(cVar, new a(bVar, this));
    }

    @Override // androidx.paging.a2
    public void loadRange(a2.e eVar, a2.d<B> dVar) {
        qc.q.i(eVar, "params");
        qc.q.i(dVar, "callback");
        this.f6046a.loadRange(eVar, new b(dVar, this));
    }

    @Override // androidx.paging.o
    public void removeInvalidatedCallback(o.d dVar) {
        qc.q.i(dVar, "onInvalidatedCallback");
        this.f6046a.removeInvalidatedCallback(dVar);
    }
}
