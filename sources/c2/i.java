package c2;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import qc.q;

/* compiled from: LocaleList.kt */
/* loaded from: classes.dex */
public final class i implements Collection<h>, rc.a, j$.util.Collection {

    /* renamed from: p  reason: collision with root package name */
    public static final a f8698p = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private final List<h> f8699f;

    /* renamed from: m  reason: collision with root package name */
    private final int f8700m;

    /* compiled from: LocaleList.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final i a() {
            return l.a().b();
        }
    }

    public i(List<h> list) {
        q.i(list, "localeList");
        this.f8699f = list;
        this.f8700m = list.size();
    }

    public boolean a(h hVar) {
        q.i(hVar, "element");
        return this.f8699f.contains(hVar);
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(h hVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends h> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        return a((h) obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        q.i(collection, "elements");
        return this.f8699f.containsAll(collection);
    }

    public final h e(int i10) {
        return this.f8699f.get(i10);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i) && q.d(this.f8699f, ((i) obj).f8699f)) {
            return true;
        }
        return false;
    }

    public final List<h> f() {
        return this.f8699f;
    }

    @Override // java.lang.Iterable, j$.util.Collection
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    public int h() {
        return this.f8700m;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f8699f.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f8699f.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<h> iterator() {
        return this.f8699f.iterator();
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream<h> parallelStream() {
        return Stream.Wrapper.convert(parallelStream());
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection
    public boolean removeIf(Predicate<? super h> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return h();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream<h> stream() {
        return Stream.Wrapper.convert(stream());
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return qc.g.a(this);
    }

    public String toString() {
        return "LocaleList(localeList=" + this.f8699f + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.util.List
    public /* synthetic */ j$.util.Spliterator spliterator() {
        return Collection.CC.$default$spliterator(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return Collection.CC.$default$toArray(this, intFunction);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        q.i(tArr, "array");
        return (T[]) qc.g.b(this, tArr);
    }
}
