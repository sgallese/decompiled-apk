package j$.util.concurrent;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j$.sun.misc.DesugarUnsafe;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import okhttp3.internal.http2.Settings;

/* loaded from: classes2.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements java.util.concurrent.ConcurrentMap<K, V>, Serializable, ConcurrentMap<K, V> {
    private static final int ABASE;
    private static final int ASHIFT;
    private static final long BASECOUNT;
    private static final long CELLSBUSY;
    private static final long CELLVALUE;
    static final int NCPU = Runtime.getRuntime().availableProcessors();
    private static final long SIZECTL;
    private static final long TRANSFERINDEX;
    private static final DesugarUnsafe U;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;
    private volatile transient long baseCount;
    private volatile transient int cellsBusy;
    private volatile transient CounterCell[] counterCells;
    private transient EntrySetView entrySet;
    private transient KeySetView keySet;
    private volatile transient Node[] nextTable;
    private volatile transient int sizeCtl;
    volatile transient Node[] table;
    private volatile transient int transferIndex;
    private transient ValuesView values;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class BaseIterator extends Traverser {
        Node lastReturned;
        final ConcurrentHashMap map;

        BaseIterator(Node[] nodeArr, int i10, int i11, int i12, ConcurrentHashMap concurrentHashMap) {
            super(nodeArr, i10, i11, i12);
            this.map = concurrentHashMap;
            advance();
        }

        public final boolean hasMoreElements() {
            return this.next != null;
        }

        public final boolean hasNext() {
            return this.next != null;
        }

        public final void remove() {
            Node node = this.lastReturned;
            if (node == null) {
                throw new IllegalStateException();
            }
            this.lastReturned = null;
            this.map.replaceNode(node.key, null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static abstract class CollectionView implements Collection, Serializable {
        private static final long serialVersionUID = 7249069246763182397L;
        final ConcurrentHashMap map;

        CollectionView(ConcurrentHashMap concurrentHashMap) {
            this.map = concurrentHashMap;
        }

        @Override // java.util.Collection
        public final void clear() {
            this.map.clear();
        }

        @Override // java.util.Collection
        public abstract boolean contains(Object obj);

        @Override // java.util.Collection
        public final boolean containsAll(Collection collection) {
            if (collection != this) {
                for (Object obj : collection) {
                    if (obj == null || !contains(obj)) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return this.map.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public abstract Iterator iterator();

        @Override // java.util.Collection
        public abstract boolean remove(Object obj);

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            collection.getClass();
            Node[] nodeArr = this.map.table;
            boolean z10 = false;
            if (nodeArr == null) {
                return false;
            }
            if (!(collection instanceof Set) || collection.size() <= nodeArr.length) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    z10 |= remove(it.next());
                }
            } else {
                Iterator it2 = iterator();
                while (it2.hasNext()) {
                    if (collection.contains(it2.next())) {
                        it2.remove();
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection collection) {
            collection.getClass();
            Iterator it = iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // java.util.Collection
        public final int size() {
            return this.map.size();
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            long mappingCount = this.map.mappingCount();
            if (mappingCount <= 2147483639) {
                int i10 = (int) mappingCount;
                Object[] objArr = new Object[i10];
                Iterator it = iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (i11 == i10) {
                        if (i10 >= 2147483639) {
                            throw new OutOfMemoryError("Required array size too large");
                        }
                        int i12 = i10 < 1073741819 ? (i10 >>> 1) + 1 + i10 : 2147483639;
                        objArr = Arrays.copyOf(objArr, i12);
                        i10 = i12;
                    }
                    objArr[i11] = next;
                    i11++;
                }
                return i11 == i10 ? objArr : Arrays.copyOf(objArr, i11);
            }
            throw new OutOfMemoryError("Required array size too large");
        }

        @Override // java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            long mappingCount = this.map.mappingCount();
            if (mappingCount <= 2147483639) {
                int i10 = (int) mappingCount;
                Object[] objArr2 = objArr.length >= i10 ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
                int length = objArr2.length;
                Iterator it = iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (i11 == length) {
                        if (length >= 2147483639) {
                            throw new OutOfMemoryError("Required array size too large");
                        }
                        int i12 = length < 1073741819 ? (length >>> 1) + 1 + length : 2147483639;
                        objArr2 = Arrays.copyOf(objArr2, i12);
                        length = i12;
                    }
                    objArr2[i11] = next;
                    i11++;
                }
                if (objArr != objArr2 || i11 >= length) {
                    return i11 == length ? objArr2 : Arrays.copyOf(objArr2, i11);
                }
                objArr2[i11] = null;
                return objArr2;
            }
            throw new OutOfMemoryError("Required array size too large");
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            Iterator it = iterator();
            if (it.hasNext()) {
                while (true) {
                    Object next = it.next();
                    if (next == this) {
                        next = "(this Collection)";
                    }
                    sb2.append(next);
                    if (!it.hasNext()) {
                        break;
                    }
                    sb2.append(',');
                    sb2.append(' ');
                }
            }
            sb2.append(']');
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class CounterCell {
        volatile long value;

        CounterCell(long j10) {
            this.value = j10;
        }
    }

    /* loaded from: classes2.dex */
    static final class EntryIterator extends BaseIterator implements Iterator {
        EntryIterator(Node[] nodeArr, int i10, int i11, int i12, ConcurrentHashMap concurrentHashMap) {
            super(nodeArr, i10, i11, i12, concurrentHashMap);
        }

        @Override // java.util.Iterator
        public final Map.Entry next() {
            Node node = this.next;
            if (node != null) {
                Object obj = node.key;
                Object obj2 = node.val;
                this.lastReturned = node;
                advance();
                return new MapEntry(obj, obj2, this.map);
            }
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class EntrySetView extends CollectionView implements Set, j$.util.Collection {
        private static final long serialVersionUID = 2249069246763182397L;

        EntrySetView(ConcurrentHashMap concurrentHashMap) {
            super(concurrentHashMap);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean add(Map.Entry entry) {
            return this.map.putVal(entry.getKey(), entry.getValue(), false) == null;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean addAll(Collection collection) {
            Iterator it = collection.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                if (add((Map.Entry) it.next())) {
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            Object value;
            return (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = this.map.get(key)) == null || (value = entry.getValue()) == null || (value != obj2 && !value.equals(obj2))) ? false : true;
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            Set set;
            return (obj instanceof Set) && ((set = (Set) obj) == this || (containsAll(set) && set.containsAll(this)));
        }

        @Override // java.lang.Iterable, j$.util.Collection
        public void forEach(Consumer consumer) {
            consumer.getClass();
            Node[] nodeArr = this.map.table;
            if (nodeArr == null) {
                return;
            }
            Traverser traverser = new Traverser(nodeArr, nodeArr.length, 0, nodeArr.length);
            while (true) {
                Node advance = traverser.advance();
                if (advance == null) {
                    return;
                }
                consumer.accept(new MapEntry(advance.key, advance.val, this.map));
            }
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            Node[] nodeArr = this.map.table;
            int i10 = 0;
            if (nodeArr != null) {
                Traverser traverser = new Traverser(nodeArr, nodeArr.length, 0, nodeArr.length);
                while (true) {
                    Node advance = traverser.advance();
                    if (advance == null) {
                        break;
                    }
                    i10 += advance.hashCode();
                }
            }
            return i10;
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            ConcurrentHashMap concurrentHashMap = this.map;
            Node[] nodeArr = concurrentHashMap.table;
            int length = nodeArr == null ? 0 : nodeArr.length;
            return new EntryIterator(nodeArr, length, 0, length, concurrentHashMap);
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ Stream parallelStream() {
            return Collection.CC.$default$parallelStream(this);
        }

        @Override // java.util.Collection
        public /* synthetic */ java.util.stream.Stream parallelStream() {
            return Stream.Wrapper.convert(parallelStream());
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            Object value;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && this.map.remove(key, value);
        }

        @Override // java.util.Collection, j$.util.Collection
        public boolean removeIf(Predicate predicate) {
            return this.map.removeEntryIf(predicate);
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Collection, j$.util.List
        public Spliterator spliterator() {
            ConcurrentHashMap concurrentHashMap = this.map;
            long sumCount = concurrentHashMap.sumCount();
            Node[] nodeArr = concurrentHashMap.table;
            int length = nodeArr == null ? 0 : nodeArr.length;
            return new EntrySpliterator(nodeArr, length, 0, length, sumCount >= 0 ? sumCount : 0L, concurrentHashMap);
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set
        public /* synthetic */ java.util.Spliterator spliterator() {
            return Spliterator.Wrapper.convert(spliterator());
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ Stream stream() {
            return Collection.CC.$default$stream(this);
        }

        @Override // java.util.Collection
        public /* synthetic */ java.util.stream.Stream stream() {
            return Stream.Wrapper.convert(stream());
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ Object[] toArray(IntFunction intFunction) {
            return Collection.CC.$default$toArray(this, intFunction);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class EntrySpliterator extends Traverser implements Spliterator {
        long est;
        final ConcurrentHashMap map;

        EntrySpliterator(Node[] nodeArr, int i10, int i11, int i12, long j10, ConcurrentHashMap concurrentHashMap) {
            super(nodeArr, i10, i11, i12);
            this.map = concurrentHashMap;
            this.est = j10;
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            return 4353;
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            return this.est;
        }

        @Override // j$.util.Spliterator
        public void forEachRemaining(Consumer consumer) {
            consumer.getClass();
            while (true) {
                Node advance = advance();
                if (advance == null) {
                    return;
                }
                consumer.accept(new MapEntry(advance.key, advance.val, this.map));
            }
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ Comparator getComparator() {
            return Spliterator.CC.$default$getComparator(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i10) {
            return Spliterator.CC.$default$hasCharacteristics(this, i10);
        }

        @Override // j$.util.Spliterator
        public boolean tryAdvance(Consumer consumer) {
            consumer.getClass();
            Node advance = advance();
            if (advance == null) {
                return false;
            }
            consumer.accept(new MapEntry(advance.key, advance.val, this.map));
            return true;
        }

        @Override // j$.util.Spliterator
        public EntrySpliterator trySplit() {
            int i10 = this.baseIndex;
            int i11 = this.baseLimit;
            int i12 = (i10 + i11) >>> 1;
            if (i12 <= i10) {
                return null;
            }
            Node[] nodeArr = this.tab;
            int i13 = this.baseSize;
            this.baseLimit = i12;
            long j10 = this.est >>> 1;
            this.est = j10;
            return new EntrySpliterator(nodeArr, i13, i12, i11, j10, this.map);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ForwardingNode extends Node {
        final Node[] nextTable;

        ForwardingNode(Node[] nodeArr) {
            super(-1, null, null);
            this.nextTable = nodeArr;
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.Node
        Node find(int i10, Object obj) {
            int length;
            Node tabAt;
            Object obj2;
            Node[] nodeArr = this.nextTable;
            loop0: while (obj != null && nodeArr != null && (length = nodeArr.length) != 0 && (tabAt = ConcurrentHashMap.tabAt(nodeArr, (length - 1) & i10)) != null) {
                do {
                    int i11 = tabAt.hash;
                    if (i11 == i10 && ((obj2 = tabAt.key) == obj || (obj2 != null && obj.equals(obj2)))) {
                        return tabAt;
                    }
                    if (i11 >= 0) {
                        tabAt = tabAt.next;
                    } else if (!(tabAt instanceof ForwardingNode)) {
                        return tabAt.find(i10, obj);
                    } else {
                        nodeArr = ((ForwardingNode) tabAt).nextTable;
                    }
                } while (tabAt != null);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class KeyIterator extends BaseIterator implements Iterator, Enumeration {
        KeyIterator(Node[] nodeArr, int i10, int i11, int i12, ConcurrentHashMap concurrentHashMap) {
            super(nodeArr, i10, i11, i12, concurrentHashMap);
        }

        @Override // java.util.Iterator
        public final Object next() {
            Node node = this.next;
            if (node != null) {
                Object obj = node.key;
                this.lastReturned = node;
                advance();
                return obj;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Enumeration
        public final Object nextElement() {
            return next();
        }
    }

    /* loaded from: classes2.dex */
    public static class KeySetView extends CollectionView implements Set, j$.util.Collection {
        private static final long serialVersionUID = 7249069246763182397L;
        private final Object value;

        KeySetView(ConcurrentHashMap concurrentHashMap, Object obj) {
            super(concurrentHashMap);
            this.value = obj;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean add(Object obj) {
            Object obj2 = this.value;
            if (obj2 != null) {
                return this.map.putVal(obj, obj2, true) == null;
            }
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean addAll(java.util.Collection collection) {
            Object obj = this.value;
            if (obj != null) {
                Iterator it = collection.iterator();
                boolean z10 = false;
                while (it.hasNext()) {
                    if (this.map.putVal(it.next(), obj, true) == null) {
                        z10 = true;
                    }
                }
                return z10;
            }
            throw new UnsupportedOperationException();
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
        public boolean contains(Object obj) {
            return this.map.containsKey(obj);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            Set set;
            return (obj instanceof Set) && ((set = (Set) obj) == this || (containsAll(set) && set.containsAll(this)));
        }

        @Override // java.lang.Iterable, j$.util.Collection
        public void forEach(Consumer consumer) {
            consumer.getClass();
            Node[] nodeArr = this.map.table;
            if (nodeArr == null) {
                return;
            }
            Traverser traverser = new Traverser(nodeArr, nodeArr.length, 0, nodeArr.length);
            while (true) {
                Node advance = traverser.advance();
                if (advance == null) {
                    return;
                }
                consumer.accept(advance.key);
            }
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            Iterator it = iterator();
            int i10 = 0;
            while (it.hasNext()) {
                i10 += it.next().hashCode();
            }
            return i10;
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            ConcurrentHashMap concurrentHashMap = this.map;
            Node[] nodeArr = concurrentHashMap.table;
            int length = nodeArr == null ? 0 : nodeArr.length;
            return new KeyIterator(nodeArr, length, 0, length, concurrentHashMap);
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ Stream parallelStream() {
            return Collection.CC.$default$parallelStream(this);
        }

        @Override // java.util.Collection
        public /* synthetic */ java.util.stream.Stream parallelStream() {
            return Stream.Wrapper.convert(parallelStream());
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
        public boolean remove(Object obj) {
            return this.map.remove(obj) != null;
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
        public /* bridge */ /* synthetic */ boolean removeAll(java.util.Collection collection) {
            return super.removeAll(collection);
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.CC.$default$removeIf(this, predicate);
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Collection, j$.util.List
        public Spliterator spliterator() {
            ConcurrentHashMap concurrentHashMap = this.map;
            long sumCount = concurrentHashMap.sumCount();
            Node[] nodeArr = concurrentHashMap.table;
            int length = nodeArr == null ? 0 : nodeArr.length;
            return new KeySpliterator(nodeArr, length, 0, length, sumCount >= 0 ? sumCount : 0L);
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set
        public /* synthetic */ java.util.Spliterator spliterator() {
            return Spliterator.Wrapper.convert(spliterator());
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ Stream stream() {
            return Collection.CC.$default$stream(this);
        }

        @Override // java.util.Collection
        public /* synthetic */ java.util.stream.Stream stream() {
            return Stream.Wrapper.convert(stream());
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ Object[] toArray(IntFunction intFunction) {
            return Collection.CC.$default$toArray(this, intFunction);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class KeySpliterator extends Traverser implements Spliterator {
        long est;

        KeySpliterator(Node[] nodeArr, int i10, int i11, int i12, long j10) {
            super(nodeArr, i10, i11, i12);
            this.est = j10;
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            return 4353;
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            return this.est;
        }

        @Override // j$.util.Spliterator
        public void forEachRemaining(Consumer consumer) {
            consumer.getClass();
            while (true) {
                Node advance = advance();
                if (advance == null) {
                    return;
                }
                consumer.accept(advance.key);
            }
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ Comparator getComparator() {
            return Spliterator.CC.$default$getComparator(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i10) {
            return Spliterator.CC.$default$hasCharacteristics(this, i10);
        }

        @Override // j$.util.Spliterator
        public boolean tryAdvance(Consumer consumer) {
            consumer.getClass();
            Node advance = advance();
            if (advance == null) {
                return false;
            }
            consumer.accept(advance.key);
            return true;
        }

        @Override // j$.util.Spliterator
        public KeySpliterator trySplit() {
            int i10 = this.baseIndex;
            int i11 = this.baseLimit;
            int i12 = (i10 + i11) >>> 1;
            if (i12 <= i10) {
                return null;
            }
            Node[] nodeArr = this.tab;
            int i13 = this.baseSize;
            this.baseLimit = i12;
            long j10 = this.est >>> 1;
            this.est = j10;
            return new KeySpliterator(nodeArr, i13, i12, i11, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class MapEntry implements Map.Entry {
        final Object key;
        final ConcurrentHashMap map;
        Object val;

        MapEntry(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
            this.key = obj;
            this.val = obj2;
            this.map = concurrentHashMap;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            Map.Entry entry;
            Object key;
            Object value;
            Object obj2;
            Object obj3;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.key) || key.equals(obj2)) && (value == (obj3 = this.val) || value.equals(obj3));
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.val;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.key.hashCode() ^ this.val.hashCode();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            obj.getClass();
            Object obj2 = this.val;
            this.val = obj;
            this.map.put(this.key, obj);
            return obj2;
        }

        public String toString() {
            return Helpers.mapEntryToString(this.key, this.val);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class Node implements Map.Entry {
        final int hash;
        final Object key;
        volatile Node next;
        volatile Object val;

        Node(int i10, Object obj, Object obj2) {
            this.hash = i10;
            this.key = obj;
            this.val = obj2;
        }

        Node(int i10, Object obj, Object obj2, Node node) {
            this(i10, obj, obj2);
            this.next = node;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            Map.Entry entry;
            Object key;
            Object value;
            Object obj2;
            Object obj3;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.key) || key.equals(obj2)) && (value == (obj3 = this.val) || value.equals(obj3));
        }

        Node find(int i10, Object obj) {
            Object obj2;
            if (obj != null) {
                Node node = this;
                do {
                    if (node.hash == i10 && ((obj2 = node.key) == obj || (obj2 != null && obj.equals(obj2)))) {
                        return node;
                    }
                    node = node.next;
                } while (node != null);
                return null;
            }
            return null;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.val;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.key.hashCode() ^ this.val.hashCode();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final String toString() {
            return Helpers.mapEntryToString(this.key, this.val);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ReservationNode extends Node {
        ReservationNode() {
            super(-3, null, null);
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.Node
        Node find(int i10, Object obj) {
            return null;
        }
    }

    /* loaded from: classes2.dex */
    static class Segment extends ReentrantLock implements Serializable {
        private static final long serialVersionUID = 2249069246763182397L;
        final float loadFactor;

        Segment(float f10) {
            this.loadFactor = f10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class TableStack {
        int index;
        int length;
        TableStack next;
        Node[] tab;

        TableStack() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class Traverser {
        int baseIndex;
        int baseLimit;
        final int baseSize;
        int index;
        Node next = null;
        TableStack spare;
        TableStack stack;
        Node[] tab;

        Traverser(Node[] nodeArr, int i10, int i11, int i12) {
            this.tab = nodeArr;
            this.baseSize = i10;
            this.index = i11;
            this.baseIndex = i11;
            this.baseLimit = i12;
        }

        private void pushState(Node[] nodeArr, int i10, int i11) {
            TableStack tableStack = this.spare;
            if (tableStack != null) {
                this.spare = tableStack.next;
            } else {
                tableStack = new TableStack();
            }
            tableStack.tab = nodeArr;
            tableStack.length = i11;
            tableStack.index = i10;
            tableStack.next = this.stack;
            this.stack = tableStack;
        }

        private void recoverState(int i10) {
            TableStack tableStack;
            while (true) {
                tableStack = this.stack;
                if (tableStack == null) {
                    break;
                }
                int i11 = this.index;
                int i12 = tableStack.length;
                int i13 = i11 + i12;
                this.index = i13;
                if (i13 < i10) {
                    break;
                }
                this.index = tableStack.index;
                this.tab = tableStack.tab;
                tableStack.tab = null;
                TableStack tableStack2 = tableStack.next;
                tableStack.next = this.spare;
                this.stack = tableStack2;
                this.spare = tableStack;
                i10 = i12;
            }
            if (tableStack == null) {
                int i14 = this.index + this.baseSize;
                this.index = i14;
                if (i14 >= i10) {
                    int i15 = this.baseIndex + 1;
                    this.baseIndex = i15;
                    this.index = i15;
                }
            }
        }

        final Node advance() {
            Node[] nodeArr;
            int length;
            int i10;
            Node node = this.next;
            if (node != null) {
                node = node.next;
            }
            while (node == null) {
                if (this.baseIndex >= this.baseLimit || (nodeArr = this.tab) == null || (length = nodeArr.length) <= (i10 = this.index) || i10 < 0) {
                    this.next = null;
                    return null;
                }
                Node tabAt = ConcurrentHashMap.tabAt(nodeArr, i10);
                if (tabAt == null || tabAt.hash >= 0) {
                    node = tabAt;
                } else if (tabAt instanceof ForwardingNode) {
                    this.tab = ((ForwardingNode) tabAt).nextTable;
                    pushState(nodeArr, i10, length);
                    node = null;
                } else {
                    node = tabAt instanceof TreeBin ? ((TreeBin) tabAt).first : null;
                }
                if (this.stack != null) {
                    recoverState(length);
                } else {
                    int i11 = i10 + this.baseSize;
                    this.index = i11;
                    if (i11 >= length) {
                        int i12 = this.baseIndex + 1;
                        this.baseIndex = i12;
                        this.index = i12;
                    }
                }
            }
            this.next = node;
            return node;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class TreeBin extends Node {
        private static final long LOCKSTATE;
        private static final DesugarUnsafe U;
        volatile TreeNode first;
        volatile int lockState;
        TreeNode root;
        volatile Thread waiter;

        static {
            DesugarUnsafe unsafe = DesugarUnsafe.getUnsafe();
            U = unsafe;
            LOCKSTATE = unsafe.objectFieldOffset(TreeBin.class, "lockState");
        }

        TreeBin(TreeNode treeNode) {
            super(-2, null, null);
            int compareComparables;
            int tieBreakOrder;
            this.first = treeNode;
            TreeNode treeNode2 = null;
            while (treeNode != null) {
                TreeNode treeNode3 = (TreeNode) treeNode.next;
                treeNode.right = null;
                treeNode.left = null;
                if (treeNode2 == null) {
                    treeNode.parent = null;
                    treeNode.red = false;
                } else {
                    Object obj = treeNode.key;
                    int i10 = treeNode.hash;
                    TreeNode treeNode4 = treeNode2;
                    Class cls = null;
                    while (true) {
                        Object obj2 = treeNode4.key;
                        int i11 = treeNode4.hash;
                        tieBreakOrder = i11 > i10 ? -1 : i11 < i10 ? 1 : ((cls == null && (cls = ConcurrentHashMap.comparableClassFor(obj)) == null) || (compareComparables = ConcurrentHashMap.compareComparables(cls, obj, obj2)) == 0) ? tieBreakOrder(obj, obj2) : compareComparables;
                        TreeNode treeNode5 = tieBreakOrder <= 0 ? treeNode4.left : treeNode4.right;
                        if (treeNode5 == null) {
                            break;
                        }
                        treeNode4 = treeNode5;
                    }
                    treeNode.parent = treeNode4;
                    if (tieBreakOrder <= 0) {
                        treeNode4.left = treeNode;
                    } else {
                        treeNode4.right = treeNode;
                    }
                    treeNode = balanceInsertion(treeNode2, treeNode);
                }
                treeNode2 = treeNode;
                treeNode = treeNode3;
            }
            this.root = treeNode2;
        }

        static TreeNode balanceDeletion(TreeNode treeNode, TreeNode treeNode2) {
            while (treeNode2 != null && treeNode2 != treeNode) {
                TreeNode treeNode3 = treeNode2.parent;
                if (treeNode3 == null) {
                    treeNode2.red = false;
                    return treeNode2;
                } else if (treeNode2.red) {
                    treeNode2.red = false;
                    return treeNode;
                } else {
                    TreeNode treeNode4 = treeNode3.left;
                    if (treeNode4 == treeNode2) {
                        treeNode4 = treeNode3.right;
                        if (treeNode4 != null && treeNode4.red) {
                            treeNode4.red = false;
                            treeNode3.red = true;
                            treeNode = rotateLeft(treeNode, treeNode3);
                            treeNode3 = treeNode2.parent;
                            treeNode4 = treeNode3 == null ? null : treeNode3.right;
                        }
                        if (treeNode4 == null) {
                            treeNode2 = treeNode3;
                        } else {
                            TreeNode treeNode5 = treeNode4.left;
                            TreeNode treeNode6 = treeNode4.right;
                            if ((treeNode6 != null && treeNode6.red) || (treeNode5 != null && treeNode5.red)) {
                                if (treeNode6 == null || !treeNode6.red) {
                                    if (treeNode5 != null) {
                                        treeNode5.red = false;
                                    }
                                    treeNode4.red = true;
                                    treeNode = rotateRight(treeNode, treeNode4);
                                    treeNode3 = treeNode2.parent;
                                    treeNode4 = treeNode3 != null ? treeNode3.right : null;
                                }
                                if (treeNode4 != null) {
                                    treeNode4.red = treeNode3 == null ? false : treeNode3.red;
                                    TreeNode treeNode7 = treeNode4.right;
                                    if (treeNode7 != null) {
                                        treeNode7.red = false;
                                    }
                                }
                                if (treeNode3 != null) {
                                    treeNode3.red = false;
                                    treeNode = rotateLeft(treeNode, treeNode3);
                                }
                                treeNode2 = treeNode;
                            }
                            treeNode4.red = true;
                            treeNode2 = treeNode3;
                        }
                    } else {
                        if (treeNode4 != null && treeNode4.red) {
                            treeNode4.red = false;
                            treeNode3.red = true;
                            treeNode = rotateRight(treeNode, treeNode3);
                            treeNode3 = treeNode2.parent;
                            treeNode4 = treeNode3 == null ? null : treeNode3.left;
                        }
                        if (treeNode4 == null) {
                            treeNode2 = treeNode3;
                        } else {
                            TreeNode treeNode8 = treeNode4.left;
                            TreeNode treeNode9 = treeNode4.right;
                            if ((treeNode8 != null && treeNode8.red) || (treeNode9 != null && treeNode9.red)) {
                                if (treeNode8 == null || !treeNode8.red) {
                                    if (treeNode9 != null) {
                                        treeNode9.red = false;
                                    }
                                    treeNode4.red = true;
                                    treeNode = rotateLeft(treeNode, treeNode4);
                                    treeNode3 = treeNode2.parent;
                                    treeNode4 = treeNode3 != null ? treeNode3.left : null;
                                }
                                if (treeNode4 != null) {
                                    treeNode4.red = treeNode3 == null ? false : treeNode3.red;
                                    TreeNode treeNode10 = treeNode4.left;
                                    if (treeNode10 != null) {
                                        treeNode10.red = false;
                                    }
                                }
                                if (treeNode3 != null) {
                                    treeNode3.red = false;
                                    treeNode = rotateRight(treeNode, treeNode3);
                                }
                                treeNode2 = treeNode;
                            }
                            treeNode4.red = true;
                            treeNode2 = treeNode3;
                        }
                    }
                }
            }
            return treeNode;
        }

        static TreeNode balanceInsertion(TreeNode treeNode, TreeNode treeNode2) {
            TreeNode treeNode3;
            treeNode2.red = true;
            while (true) {
                TreeNode treeNode4 = treeNode2.parent;
                if (treeNode4 == null) {
                    treeNode2.red = false;
                    return treeNode2;
                } else if (!treeNode4.red || (treeNode3 = treeNode4.parent) == null) {
                    break;
                } else {
                    TreeNode treeNode5 = treeNode3.left;
                    if (treeNode4 == treeNode5) {
                        treeNode5 = treeNode3.right;
                        if (treeNode5 == null || !treeNode5.red) {
                            if (treeNode2 == treeNode4.right) {
                                treeNode = rotateLeft(treeNode, treeNode4);
                                TreeNode treeNode6 = treeNode4.parent;
                                treeNode3 = treeNode6 == null ? null : treeNode6.parent;
                                treeNode4 = treeNode6;
                                treeNode2 = treeNode4;
                            }
                            if (treeNode4 != null) {
                                treeNode4.red = false;
                                if (treeNode3 != null) {
                                    treeNode3.red = true;
                                    treeNode = rotateRight(treeNode, treeNode3);
                                }
                            }
                        } else {
                            treeNode5.red = false;
                            treeNode4.red = false;
                            treeNode3.red = true;
                            treeNode2 = treeNode3;
                        }
                    } else if (treeNode5 == null || !treeNode5.red) {
                        if (treeNode2 == treeNode4.left) {
                            treeNode = rotateRight(treeNode, treeNode4);
                            TreeNode treeNode7 = treeNode4.parent;
                            treeNode3 = treeNode7 == null ? null : treeNode7.parent;
                            treeNode4 = treeNode7;
                            treeNode2 = treeNode4;
                        }
                        if (treeNode4 != null) {
                            treeNode4.red = false;
                            if (treeNode3 != null) {
                                treeNode3.red = true;
                                treeNode = rotateLeft(treeNode, treeNode3);
                            }
                        }
                    } else {
                        treeNode5.red = false;
                        treeNode4.red = false;
                        treeNode3.red = true;
                        treeNode2 = treeNode3;
                    }
                }
            }
            return treeNode;
        }

        private final void contendedLock() {
            boolean z10 = false;
            while (true) {
                int i10 = this.lockState;
                if ((i10 & (-3)) == 0) {
                    if (U.compareAndSetInt(this, LOCKSTATE, i10, 1)) {
                        break;
                    }
                } else if ((i10 & 2) == 0) {
                    if (U.compareAndSetInt(this, LOCKSTATE, i10, i10 | 2)) {
                        this.waiter = Thread.currentThread();
                        z10 = true;
                    }
                } else if (z10) {
                    LockSupport.park(this);
                }
            }
            if (z10) {
                this.waiter = null;
            }
        }

        private final void lockRoot() {
            if (U.compareAndSetInt(this, LOCKSTATE, 0, 1)) {
                return;
            }
            contendedLock();
        }

        static TreeNode rotateLeft(TreeNode treeNode, TreeNode treeNode2) {
            TreeNode treeNode3;
            if (treeNode2 != null && (treeNode3 = treeNode2.right) != null) {
                TreeNode treeNode4 = treeNode3.left;
                treeNode2.right = treeNode4;
                if (treeNode4 != null) {
                    treeNode4.parent = treeNode2;
                }
                TreeNode treeNode5 = treeNode2.parent;
                treeNode3.parent = treeNode5;
                if (treeNode5 == null) {
                    treeNode3.red = false;
                    treeNode = treeNode3;
                } else if (treeNode5.left == treeNode2) {
                    treeNode5.left = treeNode3;
                } else {
                    treeNode5.right = treeNode3;
                }
                treeNode3.left = treeNode2;
                treeNode2.parent = treeNode3;
            }
            return treeNode;
        }

        static TreeNode rotateRight(TreeNode treeNode, TreeNode treeNode2) {
            TreeNode treeNode3;
            if (treeNode2 != null && (treeNode3 = treeNode2.left) != null) {
                TreeNode treeNode4 = treeNode3.right;
                treeNode2.left = treeNode4;
                if (treeNode4 != null) {
                    treeNode4.parent = treeNode2;
                }
                TreeNode treeNode5 = treeNode2.parent;
                treeNode3.parent = treeNode5;
                if (treeNode5 == null) {
                    treeNode3.red = false;
                    treeNode = treeNode3;
                } else if (treeNode5.right == treeNode2) {
                    treeNode5.right = treeNode3;
                } else {
                    treeNode5.left = treeNode3;
                }
                treeNode3.right = treeNode2;
                treeNode2.parent = treeNode3;
            }
            return treeNode;
        }

        static int tieBreakOrder(Object obj, Object obj2) {
            int compareTo;
            return (obj == null || obj2 == null || (compareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) ? System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1 : compareTo;
        }

        private final void unlockRoot() {
            this.lockState = 0;
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.Node
        final Node find(int i10, Object obj) {
            Object obj2;
            Thread thread;
            Thread thread2;
            TreeNode treeNode = null;
            if (obj != null) {
                Node node = this.first;
                while (node != null) {
                    int i11 = this.lockState;
                    if ((i11 & 3) == 0) {
                        DesugarUnsafe desugarUnsafe = U;
                        long j10 = LOCKSTATE;
                        if (desugarUnsafe.compareAndSetInt(this, j10, i11, i11 + 4)) {
                            try {
                                TreeNode treeNode2 = this.root;
                                if (treeNode2 != null) {
                                    treeNode = treeNode2.findTreeNode(i10, obj, null);
                                }
                                if (desugarUnsafe.getAndAddInt(this, j10, -4) == 6 && (thread2 = this.waiter) != null) {
                                    LockSupport.unpark(thread2);
                                }
                                return treeNode;
                            } catch (Throwable th) {
                                if (U.getAndAddInt(this, LOCKSTATE, -4) == 6 && (thread = this.waiter) != null) {
                                    LockSupport.unpark(thread);
                                }
                                throw th;
                            }
                        }
                    } else if (node.hash == i10 && ((obj2 = node.key) == obj || (obj2 != null && obj.equals(obj2)))) {
                        return node;
                    } else {
                        node = node.next;
                    }
                }
            }
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0097, code lost:
        
            return null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        final j$.util.concurrent.ConcurrentHashMap.TreeNode putTreeVal(int r13, java.lang.Object r14, java.lang.Object r15) {
            /*
                r12 = this;
                j$.util.concurrent.ConcurrentHashMap$TreeNode r0 = r12.root
                r1 = 0
                r2 = 0
                r3 = r1
            L5:
                if (r0 != 0) goto L18
                j$.util.concurrent.ConcurrentHashMap$TreeNode r0 = new j$.util.concurrent.ConcurrentHashMap$TreeNode
                r8 = 0
                r9 = 0
                r4 = r0
                r5 = r13
                r6 = r14
                r7 = r15
                r4.<init>(r5, r6, r7, r8, r9)
                r12.root = r0
                r12.first = r0
                goto L97
            L18:
                int r4 = r0.hash
                r9 = 1
                if (r4 <= r13) goto L20
                r4 = -1
                r10 = -1
                goto L5f
            L20:
                if (r4 >= r13) goto L24
                r10 = 1
                goto L5f
            L24:
                java.lang.Object r4 = r0.key
                if (r4 == r14) goto La0
                if (r4 == 0) goto L32
                boolean r5 = r14.equals(r4)
                if (r5 == 0) goto L32
                goto La0
            L32:
                if (r3 != 0) goto L3a
                java.lang.Class r3 = j$.util.concurrent.ConcurrentHashMap.comparableClassFor(r14)
                if (r3 == 0) goto L40
            L3a:
                int r5 = j$.util.concurrent.ConcurrentHashMap.compareComparables(r3, r14, r4)
                if (r5 != 0) goto L5e
            L40:
                if (r2 != 0) goto L58
                j$.util.concurrent.ConcurrentHashMap$TreeNode r2 = r0.left
                if (r2 == 0) goto L4c
                j$.util.concurrent.ConcurrentHashMap$TreeNode r2 = r2.findTreeNode(r13, r14, r3)
                if (r2 != 0) goto L56
            L4c:
                j$.util.concurrent.ConcurrentHashMap$TreeNode r2 = r0.right
                if (r2 == 0) goto L57
                j$.util.concurrent.ConcurrentHashMap$TreeNode r2 = r2.findTreeNode(r13, r14, r3)
                if (r2 == 0) goto L57
            L56:
                return r2
            L57:
                r2 = 1
            L58:
                int r4 = tieBreakOrder(r14, r4)
                r10 = r4
                goto L5f
            L5e:
                r10 = r5
            L5f:
                if (r10 > 0) goto L64
                j$.util.concurrent.ConcurrentHashMap$TreeNode r4 = r0.left
                goto L66
            L64:
                j$.util.concurrent.ConcurrentHashMap$TreeNode r4 = r0.right
            L66:
                if (r4 != 0) goto L9d
                j$.util.concurrent.ConcurrentHashMap$TreeNode r2 = r12.first
                j$.util.concurrent.ConcurrentHashMap$TreeNode r11 = new j$.util.concurrent.ConcurrentHashMap$TreeNode
                r3 = r11
                r4 = r13
                r5 = r14
                r6 = r15
                r7 = r2
                r8 = r0
                r3.<init>(r4, r5, r6, r7, r8)
                r12.first = r11
                if (r2 == 0) goto L7b
                r2.prev = r11
            L7b:
                if (r10 > 0) goto L80
                r0.left = r11
                goto L82
            L80:
                r0.right = r11
            L82:
                boolean r13 = r0.red
                if (r13 != 0) goto L89
                r11.red = r9
                goto L97
            L89:
                r12.lockRoot()
                j$.util.concurrent.ConcurrentHashMap$TreeNode r13 = r12.root     // Catch: java.lang.Throwable -> L98
                j$.util.concurrent.ConcurrentHashMap$TreeNode r13 = balanceInsertion(r13, r11)     // Catch: java.lang.Throwable -> L98
                r12.root = r13     // Catch: java.lang.Throwable -> L98
                r12.unlockRoot()
            L97:
                return r1
            L98:
                r13 = move-exception
                r12.unlockRoot()
                throw r13
            L9d:
                r0 = r4
                goto L5
            La0:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.TreeBin.putTreeVal(int, java.lang.Object, java.lang.Object):j$.util.concurrent.ConcurrentHashMap$TreeNode");
        }

        /* JADX WARN: Removed duplicated region for block: B:57:0x008d A[Catch: all -> 0x00c9, TryCatch #0 {all -> 0x00c9, blocks: (B:22:0x002f, B:26:0x0038, B:29:0x003e, B:31:0x004c, B:39:0x0064, B:41:0x006a, B:42:0x006c, B:57:0x008d, B:64:0x009e, B:60:0x0095, B:62:0x0099, B:63:0x009c, B:65:0x00a4, B:69:0x00ad, B:71:0x00b1, B:73:0x00b5, B:75:0x00b9, B:79:0x00c2, B:76:0x00bc, B:78:0x00c0, B:68:0x00a9, B:45:0x0076, B:47:0x007a, B:48:0x007d, B:32:0x0051, B:34:0x0057, B:36:0x005b, B:37:0x005e, B:38:0x0060), top: B:86:0x002f }] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x00a9 A[Catch: all -> 0x00c9, TryCatch #0 {all -> 0x00c9, blocks: (B:22:0x002f, B:26:0x0038, B:29:0x003e, B:31:0x004c, B:39:0x0064, B:41:0x006a, B:42:0x006c, B:57:0x008d, B:64:0x009e, B:60:0x0095, B:62:0x0099, B:63:0x009c, B:65:0x00a4, B:69:0x00ad, B:71:0x00b1, B:73:0x00b5, B:75:0x00b9, B:79:0x00c2, B:76:0x00bc, B:78:0x00c0, B:68:0x00a9, B:45:0x0076, B:47:0x007a, B:48:0x007d, B:32:0x0051, B:34:0x0057, B:36:0x005b, B:37:0x005e, B:38:0x0060), top: B:86:0x002f }] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x00b1 A[Catch: all -> 0x00c9, TryCatch #0 {all -> 0x00c9, blocks: (B:22:0x002f, B:26:0x0038, B:29:0x003e, B:31:0x004c, B:39:0x0064, B:41:0x006a, B:42:0x006c, B:57:0x008d, B:64:0x009e, B:60:0x0095, B:62:0x0099, B:63:0x009c, B:65:0x00a4, B:69:0x00ad, B:71:0x00b1, B:73:0x00b5, B:75:0x00b9, B:79:0x00c2, B:76:0x00bc, B:78:0x00c0, B:68:0x00a9, B:45:0x0076, B:47:0x007a, B:48:0x007d, B:32:0x0051, B:34:0x0057, B:36:0x005b, B:37:0x005e, B:38:0x0060), top: B:86:0x002f }] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00b9 A[Catch: all -> 0x00c9, TryCatch #0 {all -> 0x00c9, blocks: (B:22:0x002f, B:26:0x0038, B:29:0x003e, B:31:0x004c, B:39:0x0064, B:41:0x006a, B:42:0x006c, B:57:0x008d, B:64:0x009e, B:60:0x0095, B:62:0x0099, B:63:0x009c, B:65:0x00a4, B:69:0x00ad, B:71:0x00b1, B:73:0x00b5, B:75:0x00b9, B:79:0x00c2, B:76:0x00bc, B:78:0x00c0, B:68:0x00a9, B:45:0x0076, B:47:0x007a, B:48:0x007d, B:32:0x0051, B:34:0x0057, B:36:0x005b, B:37:0x005e, B:38:0x0060), top: B:86:0x002f }] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x00bc A[Catch: all -> 0x00c9, TryCatch #0 {all -> 0x00c9, blocks: (B:22:0x002f, B:26:0x0038, B:29:0x003e, B:31:0x004c, B:39:0x0064, B:41:0x006a, B:42:0x006c, B:57:0x008d, B:64:0x009e, B:60:0x0095, B:62:0x0099, B:63:0x009c, B:65:0x00a4, B:69:0x00ad, B:71:0x00b1, B:73:0x00b5, B:75:0x00b9, B:79:0x00c2, B:76:0x00bc, B:78:0x00c0, B:68:0x00a9, B:45:0x0076, B:47:0x007a, B:48:0x007d, B:32:0x0051, B:34:0x0057, B:36:0x005b, B:37:0x005e, B:38:0x0060), top: B:86:0x002f }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        final boolean removeTreeNode(j$.util.concurrent.ConcurrentHashMap.TreeNode r10) {
            /*
                Method dump skipped, instructions count: 207
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.TreeBin.removeTreeNode(j$.util.concurrent.ConcurrentHashMap$TreeNode):boolean");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class TreeNode extends Node {
        TreeNode left;
        TreeNode parent;
        TreeNode prev;
        boolean red;
        TreeNode right;

        TreeNode(int i10, Object obj, Object obj2, Node node, TreeNode treeNode) {
            super(i10, obj, obj2, node);
            this.parent = treeNode;
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.Node
        Node find(int i10, Object obj) {
            return findTreeNode(i10, obj, null);
        }

        final TreeNode findTreeNode(int i10, Object obj, Class cls) {
            int compareComparables;
            if (obj != null) {
                TreeNode treeNode = this;
                do {
                    TreeNode treeNode2 = treeNode.left;
                    TreeNode treeNode3 = treeNode.right;
                    int i11 = treeNode.hash;
                    if (i11 <= i10) {
                        if (i11 >= i10) {
                            Object obj2 = treeNode.key;
                            if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                                return treeNode;
                            }
                            if (treeNode2 != null) {
                                if (treeNode3 != null) {
                                    if ((cls == null && (cls = ConcurrentHashMap.comparableClassFor(obj)) == null) || (compareComparables = ConcurrentHashMap.compareComparables(cls, obj, obj2)) == 0) {
                                        TreeNode findTreeNode = treeNode3.findTreeNode(i10, obj, cls);
                                        if (findTreeNode != null) {
                                            return findTreeNode;
                                        }
                                    } else if (compareComparables >= 0) {
                                        treeNode2 = treeNode3;
                                    }
                                }
                            }
                        }
                        treeNode = treeNode3;
                    }
                    treeNode = treeNode2;
                } while (treeNode != null);
                return null;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ValueIterator extends BaseIterator implements Iterator, Enumeration {
        ValueIterator(Node[] nodeArr, int i10, int i11, int i12, ConcurrentHashMap concurrentHashMap) {
            super(nodeArr, i10, i11, i12, concurrentHashMap);
        }

        @Override // java.util.Iterator
        public final Object next() {
            Node node = this.next;
            if (node != null) {
                Object obj = node.val;
                this.lastReturned = node;
                advance();
                return obj;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Enumeration
        public final Object nextElement() {
            return next();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ValueSpliterator extends Traverser implements Spliterator {
        long est;

        ValueSpliterator(Node[] nodeArr, int i10, int i11, int i12, long j10) {
            super(nodeArr, i10, i11, i12);
            this.est = j10;
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            return 4352;
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            return this.est;
        }

        @Override // j$.util.Spliterator
        public void forEachRemaining(Consumer consumer) {
            consumer.getClass();
            while (true) {
                Node advance = advance();
                if (advance == null) {
                    return;
                }
                consumer.accept(advance.val);
            }
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ Comparator getComparator() {
            return Spliterator.CC.$default$getComparator(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i10) {
            return Spliterator.CC.$default$hasCharacteristics(this, i10);
        }

        @Override // j$.util.Spliterator
        public boolean tryAdvance(Consumer consumer) {
            consumer.getClass();
            Node advance = advance();
            if (advance == null) {
                return false;
            }
            consumer.accept(advance.val);
            return true;
        }

        @Override // j$.util.Spliterator
        public ValueSpliterator trySplit() {
            int i10 = this.baseIndex;
            int i11 = this.baseLimit;
            int i12 = (i10 + i11) >>> 1;
            if (i12 <= i10) {
                return null;
            }
            Node[] nodeArr = this.tab;
            int i13 = this.baseSize;
            this.baseLimit = i12;
            long j10 = this.est >>> 1;
            this.est = j10;
            return new ValueSpliterator(nodeArr, i13, i12, i11, j10);
        }
    }

    /* loaded from: classes2.dex */
    static final class ValuesView extends CollectionView implements j$.util.Collection {
        private static final long serialVersionUID = 2249069246763182397L;

        ValuesView(ConcurrentHashMap concurrentHashMap) {
            super(concurrentHashMap);
        }

        @Override // java.util.Collection
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(java.util.Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
        public final boolean contains(Object obj) {
            return this.map.containsValue(obj);
        }

        @Override // java.lang.Iterable, j$.util.Collection
        public void forEach(Consumer consumer) {
            consumer.getClass();
            Node[] nodeArr = this.map.table;
            if (nodeArr == null) {
                return;
            }
            Traverser traverser = new Traverser(nodeArr, nodeArr.length, 0, nodeArr.length);
            while (true) {
                Node advance = traverser.advance();
                if (advance == null) {
                    return;
                }
                consumer.accept(advance.val);
            }
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            ConcurrentHashMap concurrentHashMap = this.map;
            Node[] nodeArr = concurrentHashMap.table;
            int length = nodeArr == null ? 0 : nodeArr.length;
            return new ValueIterator(nodeArr, length, 0, length, concurrentHashMap);
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ Stream parallelStream() {
            return Collection.CC.$default$parallelStream(this);
        }

        @Override // java.util.Collection
        public /* synthetic */ java.util.stream.Stream parallelStream() {
            return Stream.Wrapper.convert(parallelStream());
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
        public final boolean remove(Object obj) {
            if (obj != null) {
                Iterator it = iterator();
                while (it.hasNext()) {
                    if (obj.equals(it.next())) {
                        it.remove();
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
        public boolean removeAll(java.util.Collection collection) {
            collection.getClass();
            Iterator it = iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // java.util.Collection, j$.util.Collection
        public boolean removeIf(Predicate predicate) {
            return this.map.removeValueIf(predicate);
        }

        @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.util.List
        public Spliterator spliterator() {
            ConcurrentHashMap concurrentHashMap = this.map;
            long sumCount = concurrentHashMap.sumCount();
            Node[] nodeArr = concurrentHashMap.table;
            int length = nodeArr == null ? 0 : nodeArr.length;
            return new ValueSpliterator(nodeArr, length, 0, length, sumCount >= 0 ? sumCount : 0L);
        }

        @Override // java.util.Collection, java.lang.Iterable
        public /* synthetic */ java.util.Spliterator spliterator() {
            return Spliterator.Wrapper.convert(spliterator());
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ Stream stream() {
            return Collection.CC.$default$stream(this);
        }

        @Override // java.util.Collection
        public /* synthetic */ java.util.stream.Stream stream() {
            return Stream.Wrapper.convert(stream());
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ Object[] toArray(IntFunction intFunction) {
            return Collection.CC.$default$toArray(this, intFunction);
        }
    }

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", Segment[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        DesugarUnsafe unsafe = DesugarUnsafe.getUnsafe();
        U = unsafe;
        SIZECTL = unsafe.objectFieldOffset(ConcurrentHashMap.class, "sizeCtl");
        TRANSFERINDEX = unsafe.objectFieldOffset(ConcurrentHashMap.class, "transferIndex");
        BASECOUNT = unsafe.objectFieldOffset(ConcurrentHashMap.class, "baseCount");
        CELLSBUSY = unsafe.objectFieldOffset(ConcurrentHashMap.class, "cellsBusy");
        CELLVALUE = unsafe.objectFieldOffset(CounterCell.class, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        ABASE = unsafe.arrayBaseOffset(Node[].class);
        int arrayIndexScale = unsafe.arrayIndexScale(Node[].class);
        if (((arrayIndexScale - 1) & arrayIndexScale) != 0) {
            throw new ExceptionInInitializerError("array index scale not a power of two");
        }
        ASHIFT = 31 - Integer.numberOfLeadingZeros(arrayIndexScale);
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i10) {
        this(i10, 0.75f, 1);
    }

    public ConcurrentHashMap(int i10, float f10, int i11) {
        if (f10 <= 0.0f || i10 < 0 || i11 <= 0) {
            throw new IllegalArgumentException();
        }
        long j10 = (long) (((i10 < i11 ? i11 : i10) / f10) + 1.0d);
        this.sizeCtl = j10 >= 1073741824 ? 1073741824 : tableSizeFor((int) j10);
    }

    public ConcurrentHashMap(Map<? extends K, ? extends V> map) {
        this.sizeCtl = 16;
        putAll(map);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r1.compareAndSetLong(r11, r3, r5, r9) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void addCount(long r12, int r14) {
        /*
            r11 = this;
            j$.util.concurrent.ConcurrentHashMap$CounterCell[] r0 = r11.counterCells
            if (r0 != 0) goto L14
            j$.sun.misc.DesugarUnsafe r1 = j$.util.concurrent.ConcurrentHashMap.U
            long r3 = j$.util.concurrent.ConcurrentHashMap.BASECOUNT
            long r5 = r11.baseCount
            long r9 = r5 + r12
            r2 = r11
            r7 = r9
            boolean r1 = r1.compareAndSetLong(r2, r3, r5, r7)
            if (r1 != 0) goto L3b
        L14:
            r1 = 1
            if (r0 == 0) goto L94
            int r2 = r0.length
            int r2 = r2 - r1
            if (r2 < 0) goto L94
            int r3 = j$.util.concurrent.ThreadLocalRandom.getProbe()
            r2 = r2 & r3
            r4 = r0[r2]
            if (r4 == 0) goto L94
            j$.sun.misc.DesugarUnsafe r3 = j$.util.concurrent.ConcurrentHashMap.U
            long r5 = j$.util.concurrent.ConcurrentHashMap.CELLVALUE
            long r7 = r4.value
            long r9 = r7 + r12
            boolean r0 = r3.compareAndSetLong(r4, r5, r7, r9)
            if (r0 != 0) goto L34
            r1 = r0
            goto L94
        L34:
            if (r14 > r1) goto L37
            return
        L37:
            long r9 = r11.sumCount()
        L3b:
            if (r14 < 0) goto L93
        L3d:
            int r4 = r11.sizeCtl
            long r12 = (long) r4
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 < 0) goto L93
            j$.util.concurrent.ConcurrentHashMap$Node[] r12 = r11.table
            if (r12 == 0) goto L93
            int r13 = r12.length
            r14 = 1073741824(0x40000000, float:2.0)
            if (r13 >= r14) goto L93
            int r13 = resizeStamp(r13)
            if (r4 >= 0) goto L7b
            int r14 = r4 >>> 16
            if (r14 != r13) goto L93
            int r14 = r13 + 1
            if (r4 == r14) goto L93
            r14 = 65535(0xffff, float:9.1834E-41)
            int r13 = r13 + r14
            if (r4 == r13) goto L93
            j$.util.concurrent.ConcurrentHashMap$Node[] r13 = r11.nextTable
            if (r13 == 0) goto L93
            int r14 = r11.transferIndex
            if (r14 > 0) goto L6a
            goto L93
        L6a:
            j$.sun.misc.DesugarUnsafe r0 = j$.util.concurrent.ConcurrentHashMap.U
            long r2 = j$.util.concurrent.ConcurrentHashMap.SIZECTL
            int r5 = r4 + 1
            r1 = r11
            boolean r14 = r0.compareAndSetInt(r1, r2, r4, r5)
            if (r14 == 0) goto L8e
            r11.transfer(r12, r13)
            goto L8e
        L7b:
            j$.sun.misc.DesugarUnsafe r0 = j$.util.concurrent.ConcurrentHashMap.U
            long r2 = j$.util.concurrent.ConcurrentHashMap.SIZECTL
            int r13 = r13 << 16
            int r5 = r13 + 2
            r1 = r11
            boolean r13 = r0.compareAndSetInt(r1, r2, r4, r5)
            if (r13 == 0) goto L8e
            r13 = 0
            r11.transfer(r12, r13)
        L8e:
            long r9 = r11.sumCount()
            goto L3d
        L93:
            return
        L94:
            r11.fullAddCount(r12, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.addCount(long, int):void");
    }

    static final boolean casTabAt(Node[] nodeArr, int i10, Node node, Node node2) {
        return U.compareAndSetObject(nodeArr, (i10 << ASHIFT) + ABASE, node, node2);
    }

    static Class comparableClassFor(Object obj) {
        Type[] actualTypeArguments;
        if (obj instanceof Comparable) {
            Class<?> cls = obj.getClass();
            if (cls == String.class) {
                return cls;
            }
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces != null) {
                for (Type type : genericInterfaces) {
                    if (type instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) type;
                        if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                            return cls;
                        }
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    static int compareComparables(Class cls, Object obj, Object obj2) {
        if (obj2 == null || obj2.getClass() != cls) {
            return 0;
        }
        return ((Comparable) obj).compareTo(obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x009d, code lost:
    
        if (r24.counterCells != r7) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009f, code lost:
    
        r24.counterCells = (j$.util.concurrent.ConcurrentHashMap.CounterCell[]) java.util.Arrays.copyOf(r7, r8 << 1);
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x001b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void fullAddCount(long r25, boolean r27) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.fullAddCount(long, boolean):void");
    }

    private final Node[] initTable() {
        while (true) {
            Node[] nodeArr = this.table;
            if (nodeArr != null && nodeArr.length != 0) {
                return nodeArr;
            }
            int i10 = this.sizeCtl;
            if (i10 < 0) {
                Thread.yield();
            } else if (U.compareAndSetInt(this, SIZECTL, i10, -1)) {
                try {
                    Node[] nodeArr2 = this.table;
                    if (nodeArr2 == null || nodeArr2.length == 0) {
                        int i11 = i10 > 0 ? i10 : 16;
                        Node[] nodeArr3 = new Node[i11];
                        this.table = nodeArr3;
                        i10 = i11 - (i11 >>> 2);
                        nodeArr2 = nodeArr3;
                    }
                    this.sizeCtl = i10;
                    return nodeArr2;
                } catch (Throwable th) {
                    this.sizeCtl = i10;
                    throw th;
                }
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        long j10;
        boolean z10;
        boolean z11;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j11 = 0;
        long j12 = 0;
        Node node = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            Object readObject2 = objectInputStream.readObject();
            j10 = 1;
            if (readObject == null || readObject2 == null) {
                break;
            }
            j12++;
            node = new Node(spread(readObject.hashCode()), readObject, readObject2, node);
        }
        if (j12 == 0) {
            this.sizeCtl = 0;
            return;
        }
        long j13 = (long) ((((float) j12) / 0.75f) + 1.0d);
        int tableSizeFor = j13 >= 1073741824 ? 1073741824 : tableSizeFor((int) j13);
        Node[] nodeArr = new Node[tableSizeFor];
        int i10 = tableSizeFor - 1;
        while (node != null) {
            Node node2 = node.next;
            int i11 = node.hash;
            int i12 = i11 & i10;
            Node tabAt = tabAt(nodeArr, i12);
            if (tabAt == null) {
                z11 = true;
            } else {
                Object obj2 = node.key;
                if (tabAt.hash >= 0) {
                    int i13 = 0;
                    for (Node node3 = tabAt; node3 != null; node3 = node3.next) {
                        if (node3.hash == i11 && ((obj = node3.key) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z10 = false;
                            break;
                        }
                        i13++;
                    }
                    z10 = true;
                    if (!z10 || i13 < 8) {
                        z11 = z10;
                    } else {
                        long j14 = j11 + 1;
                        node.next = tabAt;
                        Node node4 = node;
                        TreeNode treeNode = null;
                        TreeNode treeNode2 = null;
                        while (node4 != null) {
                            long j15 = j14;
                            TreeNode treeNode3 = new TreeNode(node4.hash, node4.key, node4.val, null, null);
                            treeNode3.prev = treeNode2;
                            if (treeNode2 == null) {
                                treeNode = treeNode3;
                            } else {
                                treeNode2.next = treeNode3;
                            }
                            node4 = node4.next;
                            treeNode2 = treeNode3;
                            j14 = j15;
                        }
                        setTabAt(nodeArr, i12, new TreeBin(treeNode));
                        j11 = j14;
                    }
                } else if (((TreeBin) tabAt).putTreeVal(i11, obj2, node.val) == null) {
                    j11 += j10;
                }
                z11 = false;
            }
            j10 = 1;
            if (z11) {
                j11++;
                node.next = tabAt;
                setTabAt(nodeArr, i12, node);
            }
            node = node2;
        }
        this.table = nodeArr;
        this.sizeCtl = tableSizeFor - (tableSizeFor >>> 2);
        this.baseCount = j11;
    }

    static final int resizeStamp(int i10) {
        return Integer.numberOfLeadingZeros(i10) | 32768;
    }

    static final void setTabAt(Node[] nodeArr, int i10, Node node) {
        U.putObjectRelease(nodeArr, (i10 << ASHIFT) + ABASE, node);
    }

    static final int spread(int i10) {
        return (i10 ^ (i10 >>> 16)) & Integer.MAX_VALUE;
    }

    static final Node tabAt(Node[] nodeArr, int i10) {
        return (Node) U.getObjectAcquire(nodeArr, (i10 << ASHIFT) + ABASE);
    }

    private static final int tableSizeFor(int i10) {
        int numberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i10 - 1);
        if (numberOfLeadingZeros < 0) {
            return 1;
        }
        if (numberOfLeadingZeros >= 1073741824) {
            return 1073741824;
        }
        return 1 + numberOfLeadingZeros;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [j$.util.concurrent.ConcurrentHashMap$Node] */
    /* JADX WARN: Type inference failed for: r13v12, types: [j$.util.concurrent.ConcurrentHashMap$Node] */
    /* JADX WARN: Type inference failed for: r5v17, types: [j$.util.concurrent.ConcurrentHashMap$Node] */
    /* JADX WARN: Type inference failed for: r5v22, types: [j$.util.concurrent.ConcurrentHashMap$Node] */
    private final void transfer(Node[] nodeArr, Node[] nodeArr2) {
        Node[] nodeArr3;
        int i10;
        int i11;
        ForwardingNode forwardingNode;
        ConcurrentHashMap<K, V> concurrentHashMap;
        int i12;
        TreeNode treeNode;
        ConcurrentHashMap<K, V> concurrentHashMap2 = this;
        Node[] nodeArr4 = nodeArr;
        int length = nodeArr4.length;
        int i13 = NCPU;
        int i14 = i13 > 1 ? (length >>> 3) / i13 : length;
        int i15 = i14 < 16 ? 16 : i14;
        if (nodeArr2 == null) {
            try {
                Node[] nodeArr5 = new Node[length << 1];
                concurrentHashMap2.nextTable = nodeArr5;
                concurrentHashMap2.transferIndex = length;
                nodeArr3 = nodeArr5;
            } catch (Throwable unused) {
                concurrentHashMap2.sizeCtl = Integer.MAX_VALUE;
                return;
            }
        } else {
            nodeArr3 = nodeArr2;
        }
        int length2 = nodeArr3.length;
        ForwardingNode forwardingNode2 = new ForwardingNode(nodeArr3);
        int i16 = 0;
        int i17 = 0;
        boolean z10 = true;
        boolean z11 = false;
        while (true) {
            if (z10) {
                int i18 = i17 - 1;
                if (i18 >= i16 || z11) {
                    i16 = i16;
                    i17 = i18;
                } else {
                    int i19 = concurrentHashMap2.transferIndex;
                    if (i19 <= 0) {
                        i17 = -1;
                    } else {
                        DesugarUnsafe desugarUnsafe = U;
                        long j10 = TRANSFERINDEX;
                        int i20 = i19 > i15 ? i19 - i15 : 0;
                        int i21 = i16;
                        if (desugarUnsafe.compareAndSetInt(this, j10, i19, i20)) {
                            i17 = i19 - 1;
                            i16 = i20;
                        } else {
                            i16 = i21;
                            i17 = i18;
                        }
                    }
                }
                z10 = false;
            } else {
                int i22 = i16;
                TreeNode treeNode2 = null;
                if (i17 < 0 || i17 >= length || (i12 = i17 + length) >= length2) {
                    i10 = i15;
                    i11 = length2;
                    forwardingNode = forwardingNode2;
                    concurrentHashMap = this;
                    if (z11) {
                        concurrentHashMap.nextTable = null;
                        concurrentHashMap.table = nodeArr3;
                        concurrentHashMap.sizeCtl = (length << 1) - (length >>> 1);
                        return;
                    }
                    DesugarUnsafe desugarUnsafe2 = U;
                    long j11 = SIZECTL;
                    int i23 = concurrentHashMap.sizeCtl;
                    int i24 = i17;
                    if (!desugarUnsafe2.compareAndSetInt(this, j11, i23, i23 - 1)) {
                        i17 = i24;
                    } else if (i23 - 2 != (resizeStamp(length) << 16)) {
                        return;
                    } else {
                        i17 = length;
                        z10 = true;
                        z11 = true;
                    }
                } else {
                    Node tabAt = tabAt(nodeArr4, i17);
                    if (tabAt == null) {
                        z10 = casTabAt(nodeArr4, i17, null, forwardingNode2);
                        concurrentHashMap = concurrentHashMap2;
                        i10 = i15;
                        i11 = length2;
                        forwardingNode = forwardingNode2;
                    } else {
                        int i25 = tabAt.hash;
                        if (i25 == -1) {
                            concurrentHashMap = concurrentHashMap2;
                            i10 = i15;
                            i11 = length2;
                            forwardingNode = forwardingNode2;
                            z10 = true;
                        } else {
                            synchronized (tabAt) {
                                if (tabAt(nodeArr4, i17) == tabAt) {
                                    if (i25 >= 0) {
                                        int i26 = i25 & length;
                                        TreeNode treeNode3 = tabAt;
                                        for (TreeNode treeNode4 = tabAt.next; treeNode4 != null; treeNode4 = treeNode4.next) {
                                            int i27 = treeNode4.hash & length;
                                            if (i27 != i26) {
                                                treeNode3 = treeNode4;
                                                i26 = i27;
                                            }
                                        }
                                        if (i26 == 0) {
                                            treeNode = null;
                                            treeNode2 = treeNode3;
                                        } else {
                                            treeNode = treeNode3;
                                        }
                                        Node node = tabAt;
                                        while (node != treeNode3) {
                                            int i28 = node.hash;
                                            Object obj = node.key;
                                            int i29 = i15;
                                            Object obj2 = node.val;
                                            int i30 = length2;
                                            if ((i28 & length) == 0) {
                                                treeNode2 = new Node(i28, obj, obj2, treeNode2);
                                            } else {
                                                treeNode = new Node(i28, obj, obj2, treeNode);
                                            }
                                            node = node.next;
                                            i15 = i29;
                                            length2 = i30;
                                        }
                                        i10 = i15;
                                        i11 = length2;
                                        setTabAt(nodeArr3, i17, treeNode2);
                                        setTabAt(nodeArr3, i12, treeNode);
                                        setTabAt(nodeArr4, i17, forwardingNode2);
                                        forwardingNode = forwardingNode2;
                                    } else {
                                        i10 = i15;
                                        i11 = length2;
                                        if (tabAt instanceof TreeBin) {
                                            TreeBin treeBin = (TreeBin) tabAt;
                                            TreeNode treeNode5 = null;
                                            TreeNode treeNode6 = null;
                                            Node node2 = treeBin.first;
                                            int i31 = 0;
                                            int i32 = 0;
                                            TreeNode treeNode7 = null;
                                            while (node2 != null) {
                                                TreeBin treeBin2 = treeBin;
                                                int i33 = node2.hash;
                                                ForwardingNode forwardingNode3 = forwardingNode2;
                                                TreeNode treeNode8 = new TreeNode(i33, node2.key, node2.val, null, null);
                                                if ((i33 & length) == 0) {
                                                    treeNode8.prev = treeNode6;
                                                    if (treeNode6 == null) {
                                                        treeNode2 = treeNode8;
                                                    } else {
                                                        treeNode6.next = treeNode8;
                                                    }
                                                    i31++;
                                                    treeNode6 = treeNode8;
                                                } else {
                                                    treeNode8.prev = treeNode5;
                                                    if (treeNode5 == null) {
                                                        treeNode7 = treeNode8;
                                                    } else {
                                                        treeNode5.next = treeNode8;
                                                    }
                                                    i32++;
                                                    treeNode5 = treeNode8;
                                                }
                                                node2 = node2.next;
                                                treeBin = treeBin2;
                                                forwardingNode2 = forwardingNode3;
                                            }
                                            TreeBin treeBin3 = treeBin;
                                            ForwardingNode forwardingNode4 = forwardingNode2;
                                            Node untreeify = i31 <= 6 ? untreeify(treeNode2) : i32 != 0 ? new TreeBin(treeNode2) : treeBin3;
                                            Node untreeify2 = i32 <= 6 ? untreeify(treeNode7) : i31 != 0 ? new TreeBin(treeNode7) : treeBin3;
                                            setTabAt(nodeArr3, i17, untreeify);
                                            setTabAt(nodeArr3, i12, untreeify2);
                                            nodeArr4 = nodeArr;
                                            forwardingNode = forwardingNode4;
                                            setTabAt(nodeArr4, i17, forwardingNode);
                                        }
                                    }
                                    z10 = true;
                                } else {
                                    i10 = i15;
                                    i11 = length2;
                                }
                                forwardingNode = forwardingNode2;
                            }
                            concurrentHashMap = this;
                        }
                    }
                }
                forwardingNode2 = forwardingNode;
                concurrentHashMap2 = concurrentHashMap;
                i16 = i22;
                i15 = i10;
                length2 = i11;
            }
        }
    }

    private final void treeifyBin(Node[] nodeArr, int i10) {
        if (nodeArr != null) {
            int length = nodeArr.length;
            if (length < 64) {
                tryPresize(length << 1);
                return;
            }
            Node tabAt = tabAt(nodeArr, i10);
            if (tabAt == null || tabAt.hash < 0) {
                return;
            }
            synchronized (tabAt) {
                if (tabAt(nodeArr, i10) == tabAt) {
                    TreeNode treeNode = null;
                    Node node = tabAt;
                    TreeNode treeNode2 = null;
                    while (node != null) {
                        TreeNode treeNode3 = new TreeNode(node.hash, node.key, node.val, null, null);
                        treeNode3.prev = treeNode2;
                        if (treeNode2 == null) {
                            treeNode = treeNode3;
                        } else {
                            treeNode2.next = treeNode3;
                        }
                        node = node.next;
                        treeNode2 = treeNode3;
                    }
                    setTabAt(nodeArr, i10, new TreeBin(treeNode));
                }
            }
        }
    }

    private final void tryPresize(int i10) {
        int length;
        int tableSizeFor = i10 >= 536870912 ? 1073741824 : tableSizeFor(i10 + (i10 >>> 1) + 1);
        while (true) {
            int i11 = this.sizeCtl;
            if (i11 < 0) {
                return;
            }
            Node[] nodeArr = this.table;
            if (nodeArr == null || (length = nodeArr.length) == 0) {
                int i12 = i11 > tableSizeFor ? i11 : tableSizeFor;
                if (U.compareAndSetInt(this, SIZECTL, i11, -1)) {
                    try {
                        if (this.table == nodeArr) {
                            this.table = new Node[i12];
                            i11 = i12 - (i12 >>> 2);
                        }
                    } finally {
                        this.sizeCtl = i11;
                    }
                } else {
                    continue;
                }
            } else if (tableSizeFor <= i11 || length >= 1073741824) {
                return;
            } else {
                if (nodeArr == this.table) {
                    if (U.compareAndSetInt(this, SIZECTL, i11, (resizeStamp(length) << 16) + 2)) {
                        transfer(nodeArr, null);
                    }
                }
            }
        }
    }

    static Node untreeify(Node node) {
        Node node2 = null;
        Node node3 = null;
        while (node != null) {
            Node node4 = new Node(node.hash, node.key, node.val);
            if (node3 == null) {
                node2 = node4;
            } else {
                node3.next = node4;
            }
            node = node.next;
            node3 = node4;
        }
        return node2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int i10 = 1;
        int i11 = 0;
        while (i10 < 16) {
            i11++;
            i10 <<= 1;
        }
        int i12 = 32 - i11;
        int i13 = i10 - 1;
        Segment[] segmentArr = new Segment[16];
        for (int i14 = 0; i14 < 16; i14++) {
            segmentArr[i14] = new Segment(0.75f);
        }
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("segments", segmentArr);
        putFields.put("segmentShift", i12);
        putFields.put("segmentMask", i13);
        objectOutputStream.writeFields();
        Node[] nodeArr = this.table;
        if (nodeArr != null) {
            Traverser traverser = new Traverser(nodeArr, nodeArr.length, 0, nodeArr.length);
            while (true) {
                Node advance = traverser.advance();
                if (advance == null) {
                    break;
                }
                objectOutputStream.writeObject(advance.key);
                objectOutputStream.writeObject(advance.val);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Node tabAt;
        Node[] nodeArr = this.table;
        long j10 = 0;
        loop0: while (true) {
            int i10 = 0;
            while (nodeArr != null && i10 < nodeArr.length) {
                tabAt = tabAt(nodeArr, i10);
                if (tabAt == null) {
                    i10++;
                } else {
                    int i11 = tabAt.hash;
                    if (i11 == -1) {
                        break;
                    }
                    synchronized (tabAt) {
                        if (tabAt(nodeArr, i10) == tabAt) {
                            for (Node node = i11 >= 0 ? tabAt : tabAt instanceof TreeBin ? ((TreeBin) tabAt).first : null; node != null; node = node.next) {
                                j10--;
                            }
                            setTabAt(nodeArr, i10, null);
                            i10++;
                        }
                    }
                }
            }
            nodeArr = helpTransfer(nodeArr, tabAt);
        }
        if (j10 != 0) {
            addCount(j10, -1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x010b, code lost:
    
        if (r4 == 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x010d, code lost:
    
        addCount(r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0111, code lost:
    
        return r5;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object compute(java.lang.Object r14, java.util.function.BiFunction r15) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.compute(java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x00f3, code lost:
    
        if (r5 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00f5, code lost:
    
        addCount(1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00fa, code lost:
    
        return r5;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object computeIfAbsent(java.lang.Object r13, java.util.function.Function r14) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfAbsent(java.lang.Object, java.util.function.Function):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a6, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object computeIfPresent(java.lang.Object r14, java.util.function.BiFunction r15) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto Lba
            if (r15 == 0) goto Lba
            int r1 = r14.hashCode()
            int r1 = spread(r1)
            j$.util.concurrent.ConcurrentHashMap$Node[] r2 = r13.table
            r3 = 0
            r5 = r0
            r4 = 0
        L12:
            if (r2 == 0) goto Lb4
            int r6 = r2.length
            if (r6 != 0) goto L19
            goto Lb4
        L19:
            int r6 = r6 + (-1)
            r6 = r6 & r1
            j$.util.concurrent.ConcurrentHashMap$Node r7 = tabAt(r2, r6)
            if (r7 != 0) goto L24
            goto Laa
        L24:
            int r8 = r7.hash
            r9 = -1
            if (r8 != r9) goto L2e
            j$.util.concurrent.ConcurrentHashMap$Node[] r2 = r13.helpTransfer(r2, r7)
            goto L12
        L2e:
            monitor-enter(r7)
            j$.util.concurrent.ConcurrentHashMap$Node r10 = tabAt(r2, r6)     // Catch: java.lang.Throwable -> Lb1
            if (r10 != r7) goto La7
            if (r8 < 0) goto L6c
            r4 = 1
            r10 = r0
            r8 = r7
        L3a:
            int r11 = r8.hash     // Catch: java.lang.Throwable -> Lb1
            if (r11 != r1) goto L61
            java.lang.Object r11 = r8.key     // Catch: java.lang.Throwable -> Lb1
            if (r11 == r14) goto L4a
            if (r11 == 0) goto L61
            boolean r11 = r14.equals(r11)     // Catch: java.lang.Throwable -> Lb1
            if (r11 == 0) goto L61
        L4a:
            java.lang.Object r5 = r8.val     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch: java.lang.Throwable -> Lb1
            if (r5 == 0) goto L55
            r8.val = r5     // Catch: java.lang.Throwable -> Lb1
            goto La7
        L55:
            j$.util.concurrent.ConcurrentHashMap$Node r3 = r8.next     // Catch: java.lang.Throwable -> Lb1
            if (r10 == 0) goto L5c
            r10.next = r3     // Catch: java.lang.Throwable -> Lb1
            goto L5f
        L5c:
            setTabAt(r2, r6, r3)     // Catch: java.lang.Throwable -> Lb1
        L5f:
            r3 = -1
            goto La7
        L61:
            j$.util.concurrent.ConcurrentHashMap$Node r10 = r8.next     // Catch: java.lang.Throwable -> Lb1
            if (r10 != 0) goto L66
            goto La7
        L66:
            int r4 = r4 + 1
            r12 = r10
            r10 = r8
            r8 = r12
            goto L3a
        L6c:
            boolean r8 = r7 instanceof j$.util.concurrent.ConcurrentHashMap.TreeBin     // Catch: java.lang.Throwable -> Lb1
            if (r8 == 0) goto L9a
            r4 = r7
            j$.util.concurrent.ConcurrentHashMap$TreeBin r4 = (j$.util.concurrent.ConcurrentHashMap.TreeBin) r4     // Catch: java.lang.Throwable -> Lb1
            j$.util.concurrent.ConcurrentHashMap$TreeNode r8 = r4.root     // Catch: java.lang.Throwable -> Lb1
            if (r8 == 0) goto L98
            j$.util.concurrent.ConcurrentHashMap$TreeNode r8 = r8.findTreeNode(r1, r14, r0)     // Catch: java.lang.Throwable -> Lb1
            if (r8 == 0) goto L98
            java.lang.Object r5 = r8.val     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch: java.lang.Throwable -> Lb1
            if (r5 == 0) goto L88
            r8.val = r5     // Catch: java.lang.Throwable -> Lb1
            goto L98
        L88:
            boolean r3 = r4.removeTreeNode(r8)     // Catch: java.lang.Throwable -> Lb1
            if (r3 == 0) goto L97
            j$.util.concurrent.ConcurrentHashMap$TreeNode r3 = r4.first     // Catch: java.lang.Throwable -> Lb1
            j$.util.concurrent.ConcurrentHashMap$Node r3 = untreeify(r3)     // Catch: java.lang.Throwable -> Lb1
            setTabAt(r2, r6, r3)     // Catch: java.lang.Throwable -> Lb1
        L97:
            r3 = -1
        L98:
            r4 = 2
            goto La7
        L9a:
            boolean r6 = r7 instanceof j$.util.concurrent.ConcurrentHashMap.ReservationNode     // Catch: java.lang.Throwable -> Lb1
            if (r6 != 0) goto L9f
            goto La7
        L9f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r15 = "Recursive update"
            r14.<init>(r15)     // Catch: java.lang.Throwable -> Lb1
            throw r14     // Catch: java.lang.Throwable -> Lb1
        La7:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lb1
            if (r4 == 0) goto L12
        Laa:
            if (r3 == 0) goto Lb0
            long r14 = (long) r3
            r13.addCount(r14, r4)
        Lb0:
            return r5
        Lb1:
            r14 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lb1
            throw r14
        Lb4:
            j$.util.concurrent.ConcurrentHashMap$Node[] r2 = r13.initTable()
            goto L12
        Lba:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfPresent(java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        obj.getClass();
        Node[] nodeArr = this.table;
        if (nodeArr != null) {
            Traverser traverser = new Traverser(nodeArr, nodeArr.length, 0, nodeArr.length);
            while (true) {
                Node advance = traverser.advance();
                if (advance == null) {
                    break;
                }
                Object obj2 = advance.val;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        EntrySetView entrySetView = this.entrySet;
        if (entrySetView != null) {
            return entrySetView;
        }
        EntrySetView entrySetView2 = new EntrySetView(this);
        this.entrySet = entrySetView2;
        return entrySetView2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        V value;
        V v10;
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                Node[] nodeArr = this.table;
                int length = nodeArr == null ? 0 : nodeArr.length;
                Traverser traverser = new Traverser(nodeArr, length, 0, length);
                while (true) {
                    Node advance = traverser.advance();
                    if (advance == null) {
                        for (Map.Entry<K, V> entry : map.entrySet()) {
                            K key = entry.getKey();
                            if (key == null || (value = entry.getValue()) == null || (v10 = get(key)) == null || (value != v10 && !value.equals(v10))) {
                                return false;
                            }
                        }
                        return true;
                    }
                    Object obj2 = advance.val;
                    Object obj3 = map.get(advance.key);
                    if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                        break;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        Node[] nodeArr = this.table;
        if (nodeArr == null) {
            return;
        }
        Traverser traverser = new Traverser(nodeArr, nodeArr.length, 0, nodeArr.length);
        while (true) {
            Node advance = traverser.advance();
            if (advance == null) {
                return;
            }
            biConsumer.accept(advance.key, advance.val);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004d, code lost:
    
        return (V) r1.val;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public V get(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            int r0 = spread(r0)
            j$.util.concurrent.ConcurrentHashMap$Node[] r1 = r4.table
            r2 = 0
            if (r1 == 0) goto L4e
            int r3 = r1.length
            if (r3 <= 0) goto L4e
            int r3 = r3 + (-1)
            r3 = r3 & r0
            j$.util.concurrent.ConcurrentHashMap$Node r1 = tabAt(r1, r3)
            if (r1 == 0) goto L4e
            int r3 = r1.hash
            if (r3 != r0) goto L2c
            java.lang.Object r3 = r1.key
            if (r3 == r5) goto L29
            if (r3 == 0) goto L37
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L37
        L29:
            java.lang.Object r5 = r1.val
            return r5
        L2c:
            if (r3 >= 0) goto L37
            j$.util.concurrent.ConcurrentHashMap$Node r5 = r1.find(r0, r5)
            if (r5 == 0) goto L36
            java.lang.Object r2 = r5.val
        L36:
            return r2
        L37:
            j$.util.concurrent.ConcurrentHashMap$Node r1 = r1.next
            if (r1 == 0) goto L4e
            int r3 = r1.hash
            if (r3 != r0) goto L37
            java.lang.Object r3 = r1.key
            if (r3 == r5) goto L4b
            if (r3 == 0) goto L37
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L37
        L4b:
            java.lang.Object r5 = r1.val
            return r5
        L4e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public Object getOrDefault(Object obj, Object obj2) {
        V v10 = get(obj);
        return v10 == null ? obj2 : v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        Node[] nodeArr = this.table;
        int i10 = 0;
        if (nodeArr != null) {
            Traverser traverser = new Traverser(nodeArr, nodeArr.length, 0, nodeArr.length);
            while (true) {
                Node advance = traverser.advance();
                if (advance == null) {
                    break;
                }
                i10 += advance.val.hashCode() ^ advance.key.hashCode();
            }
        }
        return i10;
    }

    final Node[] helpTransfer(Node[] nodeArr, Node node) {
        Node[] nodeArr2;
        int i10;
        if (nodeArr == null || !(node instanceof ForwardingNode) || (nodeArr2 = ((ForwardingNode) node).nextTable) == null) {
            return this.table;
        }
        int resizeStamp = resizeStamp(nodeArr.length);
        while (true) {
            if (nodeArr2 != this.nextTable || this.table != nodeArr || (i10 = this.sizeCtl) >= 0 || (i10 >>> 16) != resizeStamp || i10 == resizeStamp + 1 || i10 == Settings.DEFAULT_INITIAL_WINDOW_SIZE + resizeStamp || this.transferIndex <= 0) {
                break;
            } else if (U.compareAndSetInt(this, SIZECTL, i10, i10 + 1)) {
                transfer(nodeArr, nodeArr2);
                break;
            }
        }
        return nodeArr2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return sumCount() <= 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        KeySetView keySetView = this.keySet;
        if (keySetView != null) {
            return keySetView;
        }
        KeySetView keySetView2 = new KeySetView(this, null);
        this.keySet = keySetView2;
        return keySetView2;
    }

    public long mappingCount() {
        long sumCount = sumCount();
        if (sumCount < 0) {
            return 0L;
        }
        return sumCount;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d7, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object merge(java.lang.Object r18, java.lang.Object r19, java.util.function.BiFunction r20) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.merge(java.lang.Object, java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        return (V) putVal(k10, v10, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        tryPresize(map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            putVal(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V putIfAbsent(K k10, V v10) {
        return (V) putVal(k10, v10, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a2, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b1, code lost:
    
        addCount(1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b6, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.lang.Object putVal(java.lang.Object r9, java.lang.Object r10, boolean r11) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto Lc0
            if (r10 == 0) goto Lc0
            int r1 = r9.hashCode()
            int r1 = spread(r1)
            j$.util.concurrent.ConcurrentHashMap$Node[] r2 = r8.table
            r3 = 0
        L10:
            if (r2 == 0) goto Lba
            int r4 = r2.length
            if (r4 != 0) goto L17
            goto Lba
        L17:
            int r4 = r4 + (-1)
            r4 = r4 & r1
            j$.util.concurrent.ConcurrentHashMap$Node r5 = tabAt(r2, r4)
            if (r5 != 0) goto L2d
            j$.util.concurrent.ConcurrentHashMap$Node r5 = new j$.util.concurrent.ConcurrentHashMap$Node
            r5.<init>(r1, r9, r10)
            boolean r4 = casTabAt(r2, r4, r0, r5)
            if (r4 == 0) goto L10
            goto Lb1
        L2d:
            int r6 = r5.hash
            r7 = -1
            if (r6 != r7) goto L37
            j$.util.concurrent.ConcurrentHashMap$Node[] r2 = r8.helpTransfer(r2, r5)
            goto L10
        L37:
            if (r11 == 0) goto L4c
            if (r6 != r1) goto L4c
            java.lang.Object r7 = r5.key
            if (r7 == r9) goto L47
            if (r7 == 0) goto L4c
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L4c
        L47:
            java.lang.Object r7 = r5.val
            if (r7 == 0) goto L4c
            return r7
        L4c:
            monitor-enter(r5)
            j$.util.concurrent.ConcurrentHashMap$Node r7 = tabAt(r2, r4)     // Catch: java.lang.Throwable -> Lb7
            if (r7 != r5) goto La3
            if (r6 < 0) goto L7e
            r3 = 1
            r6 = r5
        L57:
            int r7 = r6.hash     // Catch: java.lang.Throwable -> Lb7
            if (r7 != r1) goto L6e
            java.lang.Object r7 = r6.key     // Catch: java.lang.Throwable -> Lb7
            if (r7 == r9) goto L67
            if (r7 == 0) goto L6e
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> Lb7
            if (r7 == 0) goto L6e
        L67:
            java.lang.Object r7 = r6.val     // Catch: java.lang.Throwable -> Lb7
            if (r11 != 0) goto La4
            r6.val = r10     // Catch: java.lang.Throwable -> Lb7
            goto La4
        L6e:
            j$.util.concurrent.ConcurrentHashMap$Node r7 = r6.next     // Catch: java.lang.Throwable -> Lb7
            if (r7 != 0) goto L7a
            j$.util.concurrent.ConcurrentHashMap$Node r7 = new j$.util.concurrent.ConcurrentHashMap$Node     // Catch: java.lang.Throwable -> Lb7
            r7.<init>(r1, r9, r10)     // Catch: java.lang.Throwable -> Lb7
            r6.next = r7     // Catch: java.lang.Throwable -> Lb7
            goto La3
        L7a:
            int r3 = r3 + 1
            r6 = r7
            goto L57
        L7e:
            boolean r6 = r5 instanceof j$.util.concurrent.ConcurrentHashMap.TreeBin     // Catch: java.lang.Throwable -> Lb7
            if (r6 == 0) goto L96
            r3 = r5
            j$.util.concurrent.ConcurrentHashMap$TreeBin r3 = (j$.util.concurrent.ConcurrentHashMap.TreeBin) r3     // Catch: java.lang.Throwable -> Lb7
            j$.util.concurrent.ConcurrentHashMap$TreeNode r3 = r3.putTreeVal(r1, r9, r10)     // Catch: java.lang.Throwable -> Lb7
            if (r3 == 0) goto L93
            java.lang.Object r6 = r3.val     // Catch: java.lang.Throwable -> Lb7
            if (r11 != 0) goto L91
            r3.val = r10     // Catch: java.lang.Throwable -> Lb7
        L91:
            r7 = r6
            goto L94
        L93:
            r7 = r0
        L94:
            r3 = 2
            goto La4
        L96:
            boolean r6 = r5 instanceof j$.util.concurrent.ConcurrentHashMap.ReservationNode     // Catch: java.lang.Throwable -> Lb7
            if (r6 != 0) goto L9b
            goto La3
        L9b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r10 = "Recursive update"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> Lb7
            throw r9     // Catch: java.lang.Throwable -> Lb7
        La3:
            r7 = r0
        La4:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lb7
            if (r3 == 0) goto L10
            r9 = 8
            if (r3 < r9) goto Lae
            r8.treeifyBin(r2, r4)
        Lae:
            if (r7 == 0) goto Lb1
            return r7
        Lb1:
            r9 = 1
            r8.addCount(r9, r3)
            return r0
        Lb7:
            r9 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lb7
            throw r9
        Lba:
            j$.util.concurrent.ConcurrentHashMap$Node[] r2 = r8.initTable()
            goto L10
        Lc0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.putVal(java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        return (V) replaceNode(obj, null, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || replaceNode(obj, null, obj2) == null) ? false : true;
    }

    boolean removeEntryIf(Predicate predicate) {
        predicate.getClass();
        Node[] nodeArr = this.table;
        boolean z10 = false;
        if (nodeArr != null) {
            Traverser traverser = new Traverser(nodeArr, nodeArr.length, 0, nodeArr.length);
            while (true) {
                Node advance = traverser.advance();
                if (advance == null) {
                    break;
                }
                Object obj = advance.key;
                Object obj2 = advance.val;
                if (predicate.test(new AbstractMap.SimpleImmutableEntry(obj, obj2)) && replaceNode(obj, null, obj2) != null) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    boolean removeValueIf(Predicate predicate) {
        predicate.getClass();
        Node[] nodeArr = this.table;
        boolean z10 = false;
        if (nodeArr != null) {
            Traverser traverser = new Traverser(nodeArr, nodeArr.length, 0, nodeArr.length);
            while (true) {
                Node advance = traverser.advance();
                if (advance == null) {
                    break;
                }
                Object obj = advance.key;
                Object obj2 = advance.val;
                if (predicate.test(obj2) && replaceNode(obj, null, obj2) != null) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public Object replace(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return replaceNode(obj, obj2, null);
            }
            throw null;
        }
        throw null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return replaceNode(obj, obj3, obj2) != null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        Node[] nodeArr = this.table;
        if (nodeArr == null) {
            return;
        }
        Traverser traverser = new Traverser(nodeArr, nodeArr.length, 0, nodeArr.length);
        while (true) {
            Node advance = traverser.advance();
            if (advance == null) {
                return;
            }
            Object obj = advance.val;
            Object obj2 = advance.key;
            do {
                Object apply = biFunction.apply(obj2, obj);
                apply.getClass();
                if (replaceNode(obj2, apply, obj) == null) {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a7, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.lang.Object replaceNode(java.lang.Object r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            r12 = this;
            int r0 = r13.hashCode()
            int r0 = spread(r0)
            j$.util.concurrent.ConcurrentHashMap$Node[] r1 = r12.table
        La:
            r2 = 0
            if (r1 == 0) goto Lba
            int r3 = r1.length
            if (r3 == 0) goto Lba
            int r3 = r3 + (-1)
            r3 = r3 & r0
            j$.util.concurrent.ConcurrentHashMap$Node r4 = tabAt(r1, r3)
            if (r4 != 0) goto L1b
            goto Lba
        L1b:
            int r5 = r4.hash
            r6 = -1
            if (r5 != r6) goto L25
            j$.util.concurrent.ConcurrentHashMap$Node[] r1 = r12.helpTransfer(r1, r4)
            goto La
        L25:
            monitor-enter(r4)
            j$.util.concurrent.ConcurrentHashMap$Node r7 = tabAt(r1, r3)     // Catch: java.lang.Throwable -> Lb7
            if (r7 != r4) goto La8
            r7 = 1
            if (r5 < 0) goto L6a
            r8 = r2
            r5 = r4
        L31:
            int r9 = r5.hash     // Catch: java.lang.Throwable -> Lb7
            if (r9 != r0) goto L61
            java.lang.Object r9 = r5.key     // Catch: java.lang.Throwable -> Lb7
            if (r9 == r13) goto L41
            if (r9 == 0) goto L61
            boolean r9 = r13.equals(r9)     // Catch: java.lang.Throwable -> Lb7
            if (r9 == 0) goto L61
        L41:
            java.lang.Object r9 = r5.val     // Catch: java.lang.Throwable -> Lb7
            if (r15 == 0) goto L4f
            if (r15 == r9) goto L4f
            if (r9 == 0) goto La9
            boolean r10 = r15.equals(r9)     // Catch: java.lang.Throwable -> Lb7
            if (r10 == 0) goto La9
        L4f:
            if (r14 == 0) goto L54
            r5.val = r14     // Catch: java.lang.Throwable -> Lb7
            goto Laa
        L54:
            if (r8 == 0) goto L5b
            j$.util.concurrent.ConcurrentHashMap$Node r3 = r5.next     // Catch: java.lang.Throwable -> Lb7
            r8.next = r3     // Catch: java.lang.Throwable -> Lb7
            goto Laa
        L5b:
            j$.util.concurrent.ConcurrentHashMap$Node r5 = r5.next     // Catch: java.lang.Throwable -> Lb7
        L5d:
            setTabAt(r1, r3, r5)     // Catch: java.lang.Throwable -> Lb7
            goto Laa
        L61:
            j$.util.concurrent.ConcurrentHashMap$Node r8 = r5.next     // Catch: java.lang.Throwable -> Lb7
            if (r8 != 0) goto L66
            goto La9
        L66:
            r11 = r8
            r8 = r5
            r5 = r11
            goto L31
        L6a:
            boolean r5 = r4 instanceof j$.util.concurrent.ConcurrentHashMap.TreeBin     // Catch: java.lang.Throwable -> Lb7
            if (r5 == 0) goto L9b
            r5 = r4
            j$.util.concurrent.ConcurrentHashMap$TreeBin r5 = (j$.util.concurrent.ConcurrentHashMap.TreeBin) r5     // Catch: java.lang.Throwable -> Lb7
            j$.util.concurrent.ConcurrentHashMap$TreeNode r8 = r5.root     // Catch: java.lang.Throwable -> Lb7
            if (r8 == 0) goto La9
            j$.util.concurrent.ConcurrentHashMap$TreeNode r8 = r8.findTreeNode(r0, r13, r2)     // Catch: java.lang.Throwable -> Lb7
            if (r8 == 0) goto La9
            java.lang.Object r9 = r8.val     // Catch: java.lang.Throwable -> Lb7
            if (r15 == 0) goto L89
            if (r15 == r9) goto L89
            if (r9 == 0) goto La9
            boolean r10 = r15.equals(r9)     // Catch: java.lang.Throwable -> Lb7
            if (r10 == 0) goto La9
        L89:
            if (r14 == 0) goto L8e
            r8.val = r14     // Catch: java.lang.Throwable -> Lb7
            goto Laa
        L8e:
            boolean r8 = r5.removeTreeNode(r8)     // Catch: java.lang.Throwable -> Lb7
            if (r8 == 0) goto Laa
            j$.util.concurrent.ConcurrentHashMap$TreeNode r5 = r5.first     // Catch: java.lang.Throwable -> Lb7
            j$.util.concurrent.ConcurrentHashMap$Node r5 = untreeify(r5)     // Catch: java.lang.Throwable -> Lb7
            goto L5d
        L9b:
            boolean r3 = r4 instanceof j$.util.concurrent.ConcurrentHashMap.ReservationNode     // Catch: java.lang.Throwable -> Lb7
            if (r3 != 0) goto La0
            goto La8
        La0:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r14 = "Recursive update"
            r13.<init>(r14)     // Catch: java.lang.Throwable -> Lb7
            throw r13     // Catch: java.lang.Throwable -> Lb7
        La8:
            r7 = 0
        La9:
            r9 = r2
        Laa:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb7
            if (r7 == 0) goto La
            if (r9 == 0) goto Lba
            if (r14 != 0) goto Lb6
            r13 = -1
            r12.addCount(r13, r6)
        Lb6:
            return r9
        Lb7:
            r13 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb7
            throw r13
        Lba:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.replaceNode(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long sumCount = sumCount();
        if (sumCount < 0) {
            return 0;
        }
        if (sumCount > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) sumCount;
    }

    final long sumCount() {
        CounterCell[] counterCellArr = this.counterCells;
        long j10 = this.baseCount;
        if (counterCellArr != null) {
            for (CounterCell counterCell : counterCellArr) {
                if (counterCell != null) {
                    j10 += counterCell.value;
                }
            }
        }
        return j10;
    }

    @Override // java.util.AbstractMap
    public String toString() {
        Node[] nodeArr = this.table;
        int length = nodeArr == null ? 0 : nodeArr.length;
        Traverser traverser = new Traverser(nodeArr, length, 0, length);
        StringBuilder sb2 = new StringBuilder();
        sb2.append('{');
        Node advance = traverser.advance();
        if (advance != null) {
            while (true) {
                Object obj = advance.key;
                Object obj2 = advance.val;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb2.append(obj);
                sb2.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb2.append(obj2);
                advance = traverser.advance();
                if (advance == null) {
                    break;
                }
                sb2.append(',');
                sb2.append(' ');
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Collection values() {
        ValuesView valuesView = this.values;
        if (valuesView != null) {
            return valuesView;
        }
        ValuesView valuesView2 = new ValuesView(this);
        this.values = valuesView2;
        return valuesView2;
    }
}
