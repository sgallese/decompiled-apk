package n1;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.stream.Stream;
import j$.util.stream.StreamSupport;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* compiled from: SubcomposeLayout.kt */
/* loaded from: classes.dex */
public interface k1 {

    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    public static final class a implements Collection<Object>, rc.a, j$.util.Collection {

        /* renamed from: f  reason: collision with root package name */
        private final Set<Object> f20016f;

        public a(Set<Object> set) {
            qc.q.i(set, "set");
            this.f20016f = set;
        }

        @Override // java.util.Collection
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final boolean add(Object obj) {
            return this.f20016f.add(obj);
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final void clear() {
            this.f20016f.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return this.f20016f.contains(obj);
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<? extends Object> collection) {
            qc.q.i(collection, "elements");
            return this.f20016f.containsAll(collection);
        }

        public int e() {
            return this.f20016f.size();
        }

        @Override // java.lang.Iterable, j$.util.Collection
        public /* synthetic */ void forEach(Consumer consumer) {
            Iterable$CC.$default$forEach(this, consumer);
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.f20016f.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return this.f20016f.iterator();
        }

        @Override // java.util.Collection
        public /* synthetic */ Stream<Object> parallelStream() {
            return Stream.Wrapper.convert(parallelStream());
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            return this.f20016f.remove(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            qc.q.i(collection, "slotIds");
            return this.f20016f.remove(collection);
        }

        @Override // java.util.Collection, j$.util.Collection
        public boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            qc.q.i(collection, "slotIds");
            return this.f20016f.retainAll(collection);
        }

        @Override // java.util.Collection
        public final /* bridge */ int size() {
            return e();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public /* synthetic */ Spliterator spliterator() {
            return Spliterator.Wrapper.convert(spliterator());
        }

        @Override // java.util.Collection
        public /* synthetic */ java.util.stream.Stream<Object> stream() {
            return Stream.Wrapper.convert(stream());
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return qc.g.a(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ j$.util.stream.Stream parallelStream() {
            j$.util.stream.Stream stream;
            stream = StreamSupport.stream(Collection.EL.spliterator(this), true);
            return stream;
        }

        @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.util.List
        public /* synthetic */ j$.util.Spliterator spliterator() {
            return Spliterators.spliterator(this, 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ j$.util.stream.Stream stream() {
            return Collection.CC.$default$stream(this);
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ Object[] toArray(IntFunction intFunction) {
            Object[] array;
            array = toArray((Object[]) intFunction.apply(0));
            return array;
        }

        public /* synthetic */ a(Set set, int i10, qc.h hVar) {
            this((i10 & 1) != 0 ? new LinkedHashSet() : set);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            qc.q.i(tArr, "array");
            return (T[]) qc.g.b(this, tArr);
        }
    }

    boolean a(Object obj, Object obj2);

    void b(a aVar);
}
