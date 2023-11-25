package t0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import l0.f;

/* compiled from: SnapshotStateList.kt */
/* loaded from: classes.dex */
public final class r<T> implements List<T>, d0, rc.d {

    /* renamed from: f  reason: collision with root package name */
    private e0 f23353f = new a(l0.a.b());

    /* compiled from: SnapshotStateList.kt */
    /* loaded from: classes.dex */
    public static final class a<T> extends e0 {

        /* renamed from: c  reason: collision with root package name */
        private l0.f<? extends T> f23354c;

        /* renamed from: d  reason: collision with root package name */
        private int f23355d;

        public a(l0.f<? extends T> fVar) {
            qc.q.i(fVar, "list");
            this.f23354c = fVar;
        }

        @Override // t0.e0
        public void c(e0 e0Var) {
            Object obj;
            qc.q.i(e0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            obj = s.f23359a;
            synchronized (obj) {
                this.f23354c = ((a) e0Var).f23354c;
                this.f23355d = ((a) e0Var).f23355d;
                dc.w wVar = dc.w.f13270a;
            }
        }

        @Override // t0.e0
        public e0 d() {
            return new a(this.f23354c);
        }

        public final l0.f<T> i() {
            return (l0.f<? extends T>) this.f23354c;
        }

        public final int j() {
            return this.f23355d;
        }

        public final void k(l0.f<? extends T> fVar) {
            qc.q.i(fVar, "<set-?>");
            this.f23354c = fVar;
        }

        public final void l(int i10) {
            this.f23355d = i10;
        }
    }

    /* compiled from: SnapshotStateList.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.l<List<T>, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f23356f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Collection<T> f23357m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(int i10, Collection<? extends T> collection) {
            super(1);
            this.f23356f = i10;
            this.f23357m = collection;
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List<T> list) {
            qc.q.i(list, "it");
            return Boolean.valueOf(list.addAll(this.f23356f, this.f23357m));
        }
    }

    /* compiled from: SnapshotStateList.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.l<List<T>, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Collection<T> f23358f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Collection<? extends T> collection) {
            super(1);
            this.f23358f = collection;
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List<T> list) {
            qc.q.i(list, "it");
            return Boolean.valueOf(list.retainAll(this.f23358f));
        }
    }

    private final boolean j(pc.l<? super List<T>, Boolean> lVar) {
        Object obj;
        int j10;
        l0.f<T> i10;
        Boolean invoke;
        g b10;
        Object obj2;
        boolean z10;
        do {
            obj = s.f23359a;
            synchronized (obj) {
                e0 e10 = e();
                qc.q.g(e10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) l.D((a) e10);
                j10 = aVar.j();
                i10 = aVar.i();
                dc.w wVar = dc.w.f13270a;
            }
            qc.q.f(i10);
            f.a<T> builder = i10.builder();
            invoke = lVar.invoke(builder);
            l0.f<T> build = builder.build();
            if (qc.q.d(build, i10)) {
                break;
            }
            e0 e11 = e();
            qc.q.g(e11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) e11;
            l.H();
            synchronized (l.G()) {
                b10 = g.f23297e.b();
                a aVar3 = (a) l.f0(aVar2, this, b10);
                obj2 = s.f23359a;
                synchronized (obj2) {
                    if (aVar3.j() == j10) {
                        aVar3.k(build);
                        z10 = true;
                        aVar3.l(aVar3.j() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            l.O(b10, this);
        } while (!z10);
        return invoke.booleanValue();
    }

    public final int a() {
        e0 e10 = e();
        qc.q.g(e10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((a) l.D((a) e10)).j();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t10) {
        Object obj;
        int j10;
        l0.f<T> i10;
        boolean z10;
        g b10;
        Object obj2;
        do {
            obj = s.f23359a;
            synchronized (obj) {
                e0 e10 = e();
                qc.q.g(e10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) l.D((a) e10);
                j10 = aVar.j();
                i10 = aVar.i();
                dc.w wVar = dc.w.f13270a;
            }
            qc.q.f(i10);
            l0.f<T> add = i10.add((l0.f<T>) t10);
            z10 = false;
            if (qc.q.d(add, i10)) {
                return false;
            }
            e0 e11 = e();
            qc.q.g(e11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) e11;
            l.H();
            synchronized (l.G()) {
                b10 = g.f23297e.b();
                a aVar3 = (a) l.f0(aVar2, this, b10);
                obj2 = s.f23359a;
                synchronized (obj2) {
                    if (aVar3.j() == j10) {
                        aVar3.k(add);
                        aVar3.l(aVar3.j() + 1);
                        z10 = true;
                    }
                }
            }
            l.O(b10, this);
        } while (!z10);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends T> collection) {
        qc.q.i(collection, "elements");
        return j(new b(i10, collection));
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        g b10;
        Object obj;
        e0 e10 = e();
        qc.q.g(e10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        a aVar = (a) e10;
        l.H();
        synchronized (l.G()) {
            b10 = g.f23297e.b();
            a aVar2 = (a) l.f0(aVar, this, b10);
            obj = s.f23359a;
            synchronized (obj) {
                aVar2.k(l0.a.b());
                aVar2.l(aVar2.j() + 1);
            }
        }
        l.O(b10, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return h().i().contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        qc.q.i(collection, "elements");
        return h().i().containsAll(collection);
    }

    @Override // t0.d0
    public e0 e() {
        return this.f23353f;
    }

    @Override // t0.d0
    public /* synthetic */ e0 f(e0 e0Var, e0 e0Var2, e0 e0Var3) {
        return c0.a(this, e0Var, e0Var2, e0Var3);
    }

    @Override // java.util.List
    public T get(int i10) {
        return h().i().get(i10);
    }

    public final a<T> h() {
        e0 e10 = e();
        qc.q.g(e10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (a) l.V((a) e10, this);
    }

    public int i() {
        return h().i().size();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return h().i().indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return h().i().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // t0.d0
    public void k(e0 e0Var) {
        qc.q.i(e0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        e0Var.g(e());
        this.f23353f = (a) e0Var;
    }

    public T l(int i10) {
        Object obj;
        int j10;
        l0.f<T> i11;
        g b10;
        Object obj2;
        boolean z10;
        T t10 = get(i10);
        do {
            obj = s.f23359a;
            synchronized (obj) {
                e0 e10 = e();
                qc.q.g(e10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) l.D((a) e10);
                j10 = aVar.j();
                i11 = aVar.i();
                dc.w wVar = dc.w.f13270a;
            }
            qc.q.f(i11);
            l0.f<T> L = i11.L(i10);
            if (qc.q.d(L, i11)) {
                break;
            }
            e0 e11 = e();
            qc.q.g(e11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) e11;
            l.H();
            synchronized (l.G()) {
                b10 = g.f23297e.b();
                a aVar3 = (a) l.f0(aVar2, this, b10);
                obj2 = s.f23359a;
                synchronized (obj2) {
                    if (aVar3.j() == j10) {
                        aVar3.k(L);
                        z10 = true;
                        aVar3.l(aVar3.j() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            l.O(b10, this);
        } while (!z10);
        return t10;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return h().i().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return new x(this, 0);
    }

    public final void m(int i10, int i11) {
        Object obj;
        int j10;
        l0.f<T> i12;
        g b10;
        Object obj2;
        boolean z10;
        do {
            obj = s.f23359a;
            synchronized (obj) {
                e0 e10 = e();
                qc.q.g(e10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) l.D((a) e10);
                j10 = aVar.j();
                i12 = aVar.i();
                dc.w wVar = dc.w.f13270a;
            }
            qc.q.f(i12);
            f.a<T> builder = i12.builder();
            builder.subList(i10, i11).clear();
            l0.f<T> build = builder.build();
            if (!qc.q.d(build, i12)) {
                e0 e11 = e();
                qc.q.g(e11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) e11;
                l.H();
                synchronized (l.G()) {
                    b10 = g.f23297e.b();
                    a aVar3 = (a) l.f0(aVar2, this, b10);
                    obj2 = s.f23359a;
                    synchronized (obj2) {
                        if (aVar3.j() == j10) {
                            aVar3.k(build);
                            z10 = true;
                            aVar3.l(aVar3.j() + 1);
                        } else {
                            z10 = false;
                        }
                    }
                }
                l.O(b10, this);
            } else {
                return;
            }
        } while (!z10);
    }

    public final int n(Collection<? extends T> collection, int i10, int i11) {
        Object obj;
        int j10;
        l0.f<T> i12;
        g b10;
        Object obj2;
        boolean z10;
        qc.q.i(collection, "elements");
        int size = size();
        do {
            obj = s.f23359a;
            synchronized (obj) {
                e0 e10 = e();
                qc.q.g(e10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) l.D((a) e10);
                j10 = aVar.j();
                i12 = aVar.i();
                dc.w wVar = dc.w.f13270a;
            }
            qc.q.f(i12);
            f.a<T> builder = i12.builder();
            builder.subList(i10, i11).retainAll(collection);
            l0.f<T> build = builder.build();
            if (qc.q.d(build, i12)) {
                break;
            }
            e0 e11 = e();
            qc.q.g(e11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) e11;
            l.H();
            synchronized (l.G()) {
                b10 = g.f23297e.b();
                a aVar3 = (a) l.f0(aVar2, this, b10);
                obj2 = s.f23359a;
                synchronized (obj2) {
                    if (aVar3.j() == j10) {
                        aVar3.k(build);
                        z10 = true;
                        aVar3.l(aVar3.j() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            l.O(b10, this);
        } while (!z10);
        return size - size();
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i10) {
        return l(i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        Object obj;
        int j10;
        l0.f<T> i10;
        boolean z10;
        g b10;
        Object obj2;
        qc.q.i(collection, "elements");
        do {
            obj = s.f23359a;
            synchronized (obj) {
                e0 e10 = e();
                qc.q.g(e10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) l.D((a) e10);
                j10 = aVar.j();
                i10 = aVar.i();
                dc.w wVar = dc.w.f13270a;
            }
            qc.q.f(i10);
            l0.f<T> removeAll = i10.removeAll((Collection<? extends T>) collection);
            z10 = false;
            if (qc.q.d(removeAll, i10)) {
                return false;
            }
            e0 e11 = e();
            qc.q.g(e11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) e11;
            l.H();
            synchronized (l.G()) {
                b10 = g.f23297e.b();
                a aVar3 = (a) l.f0(aVar2, this, b10);
                obj2 = s.f23359a;
                synchronized (obj2) {
                    if (aVar3.j() == j10) {
                        aVar3.k(removeAll);
                        aVar3.l(aVar3.j() + 1);
                        z10 = true;
                    }
                }
            }
            l.O(b10, this);
        } while (!z10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        qc.q.i(collection, "elements");
        return j(new c(collection));
    }

    @Override // java.util.List
    public T set(int i10, T t10) {
        Object obj;
        int j10;
        l0.f<T> i11;
        g b10;
        Object obj2;
        boolean z10;
        T t11 = get(i10);
        do {
            obj = s.f23359a;
            synchronized (obj) {
                e0 e10 = e();
                qc.q.g(e10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) l.D((a) e10);
                j10 = aVar.j();
                i11 = aVar.i();
                dc.w wVar = dc.w.f13270a;
            }
            qc.q.f(i11);
            l0.f<T> fVar = i11.set(i10, (int) t10);
            if (qc.q.d(fVar, i11)) {
                break;
            }
            e0 e11 = e();
            qc.q.g(e11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) e11;
            l.H();
            synchronized (l.G()) {
                b10 = g.f23297e.b();
                a aVar3 = (a) l.f0(aVar2, this, b10);
                obj2 = s.f23359a;
                synchronized (obj2) {
                    if (aVar3.j() == j10) {
                        aVar3.k(fVar);
                        z10 = true;
                        aVar3.l(aVar3.j() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            l.O(b10, this);
        } while (!z10);
        return t11;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return i();
    }

    @Override // java.util.List
    public List<T> subList(int i10, int i11) {
        boolean z10;
        boolean z11 = true;
        if (i10 >= 0 && i10 <= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || i11 > size()) {
            z11 = false;
        }
        if (z11) {
            return new f0(this, i10, i11);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return qc.g.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        Object obj;
        int j10;
        l0.f<T> i10;
        boolean z10;
        g b10;
        Object obj2;
        qc.q.i(collection, "elements");
        do {
            obj = s.f23359a;
            synchronized (obj) {
                e0 e10 = e();
                qc.q.g(e10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) l.D((a) e10);
                j10 = aVar.j();
                i10 = aVar.i();
                dc.w wVar = dc.w.f13270a;
            }
            qc.q.f(i10);
            l0.f<T> addAll = i10.addAll(collection);
            z10 = false;
            if (qc.q.d(addAll, i10)) {
                return false;
            }
            e0 e11 = e();
            qc.q.g(e11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) e11;
            l.H();
            synchronized (l.G()) {
                b10 = g.f23297e.b();
                a aVar3 = (a) l.f0(aVar2, this, b10);
                obj2 = s.f23359a;
                synchronized (obj2) {
                    if (aVar3.j() == j10) {
                        aVar3.k(addAll);
                        aVar3.l(aVar3.j() + 1);
                        z10 = true;
                    }
                }
            }
            l.O(b10, this);
        } while (!z10);
        return true;
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i10) {
        return new x(this, i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        Object obj2;
        int j10;
        l0.f<T> i10;
        boolean z10;
        g b10;
        Object obj3;
        do {
            obj2 = s.f23359a;
            synchronized (obj2) {
                e0 e10 = e();
                qc.q.g(e10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) l.D((a) e10);
                j10 = aVar.j();
                i10 = aVar.i();
                dc.w wVar = dc.w.f13270a;
            }
            qc.q.f(i10);
            l0.f<T> remove = i10.remove((l0.f<T>) obj);
            z10 = false;
            if (qc.q.d(remove, i10)) {
                return false;
            }
            e0 e11 = e();
            qc.q.g(e11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) e11;
            l.H();
            synchronized (l.G()) {
                b10 = g.f23297e.b();
                a aVar3 = (a) l.f0(aVar2, this, b10);
                obj3 = s.f23359a;
                synchronized (obj3) {
                    if (aVar3.j() == j10) {
                        aVar3.k(remove);
                        aVar3.l(aVar3.j() + 1);
                        z10 = true;
                    }
                }
            }
            l.O(b10, this);
        } while (!z10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        qc.q.i(tArr, "array");
        return (T[]) qc.g.b(this, tArr);
    }

    @Override // java.util.List
    public void add(int i10, T t10) {
        Object obj;
        int j10;
        l0.f<T> i11;
        g b10;
        Object obj2;
        boolean z10;
        do {
            obj = s.f23359a;
            synchronized (obj) {
                e0 e10 = e();
                qc.q.g(e10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) l.D((a) e10);
                j10 = aVar.j();
                i11 = aVar.i();
                dc.w wVar = dc.w.f13270a;
            }
            qc.q.f(i11);
            l0.f<T> add = i11.add(i10, (int) t10);
            if (qc.q.d(add, i11)) {
                return;
            }
            e0 e11 = e();
            qc.q.g(e11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) e11;
            l.H();
            synchronized (l.G()) {
                b10 = g.f23297e.b();
                a aVar3 = (a) l.f0(aVar2, this, b10);
                obj2 = s.f23359a;
                synchronized (obj2) {
                    if (aVar3.j() == j10) {
                        aVar3.k(add);
                        z10 = true;
                        aVar3.l(aVar3.j() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            l.O(b10, this);
        } while (!z10);
    }
}
