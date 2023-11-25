package o0;

import ec.i;
import java.util.Iterator;
import l0.h;
import n0.d;
import qc.q;

/* compiled from: PersistentOrderedSet.kt */
/* loaded from: classes.dex */
public final class b<E> extends i<E> implements h<E> {

    /* renamed from: r  reason: collision with root package name */
    public static final a f20326r = new a(null);

    /* renamed from: s  reason: collision with root package name */
    private static final b f20327s;

    /* renamed from: m  reason: collision with root package name */
    private final Object f20328m;

    /* renamed from: p  reason: collision with root package name */
    private final Object f20329p;

    /* renamed from: q  reason: collision with root package name */
    private final d<E, o0.a> f20330q;

    /* compiled from: PersistentOrderedSet.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final <E> h<E> a() {
            return b.f20327s;
        }
    }

    static {
        p0.c cVar = p0.c.f20742a;
        f20327s = new b(cVar, cVar, d.f19865q.a());
    }

    public b(Object obj, Object obj2, d<E, o0.a> dVar) {
        q.i(dVar, "hashMap");
        this.f20328m = obj;
        this.f20329p = obj2;
        this.f20330q = dVar;
    }

    @Override // ec.a
    public int a() {
        return this.f20330q.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, l0.h
    public h<E> add(E e10) {
        if (this.f20330q.containsKey(e10)) {
            return this;
        }
        if (isEmpty()) {
            return new b(e10, e10, this.f20330q.q(e10, new o0.a()));
        }
        Object obj = this.f20329p;
        Object obj2 = ((d<E, o0.a>) this.f20330q).get(obj);
        q.f(obj2);
        return new b(this.f20328m, e10, this.f20330q.q(obj, ((o0.a) obj2).e(e10)).q(e10, new o0.a(obj)));
    }

    @Override // ec.a, java.util.Collection
    public boolean contains(Object obj) {
        return this.f20330q.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new c(this.f20328m, this.f20330q);
    }

    @Override // java.util.Collection, java.util.Set, l0.h
    public h<E> remove(E e10) {
        Object obj;
        Object obj2;
        o0.a aVar = this.f20330q.get(e10);
        if (aVar == null) {
            return this;
        }
        d<E, o0.a> r10 = this.f20330q.r(e10);
        if (aVar.b()) {
            o0.a aVar2 = r10.get(aVar.d());
            q.f(aVar2);
            r10 = r10.q(aVar.d(), aVar2.e(aVar.c()));
        }
        if (aVar.a()) {
            o0.a aVar3 = r10.get(aVar.c());
            q.f(aVar3);
            r10 = r10.q(aVar.c(), aVar3.f(aVar.d()));
        }
        if (!aVar.b()) {
            obj = aVar.c();
        } else {
            obj = this.f20328m;
        }
        if (!aVar.a()) {
            obj2 = aVar.d();
        } else {
            obj2 = this.f20329p;
        }
        return new b(obj, obj2, r10);
    }
}
