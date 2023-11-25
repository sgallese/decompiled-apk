package j$.util;

import j$.util.Collection;
import j$.util.Map;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public class DesugarCollections {
    private static final Field COLLECTION_FIELD;
    private static final Field MUTEX_FIELD;
    public static final Class SYNCHRONIZED_COLLECTION;
    private static final Constructor SYNCHRONIZED_COLLECTION_CONSTRUCTOR;
    static final Class SYNCHRONIZED_LIST;
    private static final Constructor SYNCHRONIZED_SET_CONSTRUCTOR;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class SynchronizedMap implements java.util.Map, Serializable, Map {
        private static final long serialVersionUID = 1978198479659022715L;
        private transient Set entrySet;
        private transient Set keySet;

        /* renamed from: m  reason: collision with root package name */
        private final java.util.Map f18472m;
        final Object mutex = this;
        private transient java.util.Collection values;

        SynchronizedMap(java.util.Map map) {
            this.f18472m = (java.util.Map) Objects.requireNonNull(map);
        }

        private java.util.Collection instantiateCollection(java.util.Collection collection, Object obj) {
            if (DesugarCollections.SYNCHRONIZED_COLLECTION_CONSTRUCTOR == null) {
                return Collections.synchronizedCollection(collection);
            }
            try {
                return (java.util.Collection) DesugarCollections.SYNCHRONIZED_COLLECTION_CONSTRUCTOR.newInstance(collection, obj);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
                throw new Error("Unable to instantiate a synchronized list.", e10);
            }
        }

        private Set instantiateSet(Set set, Object obj) {
            if (DesugarCollections.SYNCHRONIZED_SET_CONSTRUCTOR == null) {
                return Collections.synchronizedSet(set);
            }
            try {
                return (Set) DesugarCollections.SYNCHRONIZED_SET_CONSTRUCTOR.newInstance(set, obj);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
                throw new Error("Unable to instantiate a synchronized list.", e10);
            }
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            synchronized (this.mutex) {
                objectOutputStream.defaultWriteObject();
            }
        }

        @Override // java.util.Map
        public void clear() {
            synchronized (this.mutex) {
                this.f18472m.clear();
            }
        }

        @Override // java.util.Map, j$.util.Map
        public Object compute(Object obj, BiFunction biFunction) {
            Object compute;
            synchronized (this.mutex) {
                compute = Map.EL.compute(this.f18472m, obj, biFunction);
            }
            return compute;
        }

        @Override // java.util.Map, j$.util.Map
        public Object computeIfAbsent(Object obj, Function function) {
            Object computeIfAbsent;
            synchronized (this.mutex) {
                computeIfAbsent = Map.EL.computeIfAbsent(this.f18472m, obj, function);
            }
            return computeIfAbsent;
        }

        @Override // java.util.Map, j$.util.Map
        public Object computeIfPresent(Object obj, BiFunction biFunction) {
            Object computeIfPresent;
            synchronized (this.mutex) {
                computeIfPresent = Map.EL.computeIfPresent(this.f18472m, obj, biFunction);
            }
            return computeIfPresent;
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            boolean containsKey;
            synchronized (this.mutex) {
                containsKey = this.f18472m.containsKey(obj);
            }
            return containsKey;
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            boolean containsValue;
            synchronized (this.mutex) {
                containsValue = this.f18472m.containsValue(obj);
            }
            return containsValue;
        }

        @Override // java.util.Map
        public Set entrySet() {
            Set set;
            synchronized (this.mutex) {
                if (this.entrySet == null) {
                    this.entrySet = instantiateSet(this.f18472m.entrySet(), this.mutex);
                }
                set = this.entrySet;
            }
            return set;
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            boolean equals;
            if (this == obj) {
                return true;
            }
            synchronized (this.mutex) {
                equals = this.f18472m.equals(obj);
            }
            return equals;
        }

        @Override // java.util.Map, j$.util.Map
        public void forEach(BiConsumer biConsumer) {
            synchronized (this.mutex) {
                Map.EL.forEach(this.f18472m, biConsumer);
            }
        }

        @Override // java.util.Map
        public Object get(Object obj) {
            Object obj2;
            synchronized (this.mutex) {
                obj2 = this.f18472m.get(obj);
            }
            return obj2;
        }

        @Override // java.util.Map, j$.util.Map
        public Object getOrDefault(Object obj, Object obj2) {
            Object orDefault;
            synchronized (this.mutex) {
                orDefault = Map.EL.getOrDefault(this.f18472m, obj, obj2);
            }
            return orDefault;
        }

        @Override // java.util.Map
        public int hashCode() {
            int hashCode;
            synchronized (this.mutex) {
                hashCode = this.f18472m.hashCode();
            }
            return hashCode;
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.mutex) {
                isEmpty = this.f18472m.isEmpty();
            }
            return isEmpty;
        }

        @Override // java.util.Map
        public Set keySet() {
            Set set;
            synchronized (this.mutex) {
                if (this.keySet == null) {
                    this.keySet = instantiateSet(this.f18472m.keySet(), this.mutex);
                }
                set = this.keySet;
            }
            return set;
        }

        @Override // java.util.Map, j$.util.Map
        public Object merge(Object obj, Object obj2, BiFunction biFunction) {
            Object merge;
            synchronized (this.mutex) {
                merge = Map.EL.merge(this.f18472m, obj, obj2, biFunction);
            }
            return merge;
        }

        @Override // java.util.Map
        public Object put(Object obj, Object obj2) {
            Object put;
            synchronized (this.mutex) {
                put = this.f18472m.put(obj, obj2);
            }
            return put;
        }

        @Override // java.util.Map
        public void putAll(java.util.Map map) {
            synchronized (this.mutex) {
                this.f18472m.putAll(map);
            }
        }

        @Override // java.util.Map, j$.util.Map
        public Object putIfAbsent(Object obj, Object obj2) {
            Object putIfAbsent;
            synchronized (this.mutex) {
                putIfAbsent = Map.EL.putIfAbsent(this.f18472m, obj, obj2);
            }
            return putIfAbsent;
        }

        @Override // java.util.Map
        public Object remove(Object obj) {
            Object remove;
            synchronized (this.mutex) {
                remove = this.f18472m.remove(obj);
            }
            return remove;
        }

        @Override // java.util.Map, j$.util.Map
        public boolean remove(Object obj, Object obj2) {
            boolean remove;
            synchronized (this.mutex) {
                remove = Map.EL.remove(this.f18472m, obj, obj2);
            }
            return remove;
        }

        @Override // java.util.Map, j$.util.Map
        public Object replace(Object obj, Object obj2) {
            Object replace;
            synchronized (this.mutex) {
                replace = Map.EL.replace(this.f18472m, obj, obj2);
            }
            return replace;
        }

        @Override // java.util.Map, j$.util.Map
        public boolean replace(Object obj, Object obj2, Object obj3) {
            boolean replace;
            synchronized (this.mutex) {
                replace = Map.EL.replace(this.f18472m, obj, obj2, obj3);
            }
            return replace;
        }

        @Override // java.util.Map, j$.util.Map
        public void replaceAll(BiFunction biFunction) {
            synchronized (this.mutex) {
                Map.EL.replaceAll(this.f18472m, biFunction);
            }
        }

        @Override // java.util.Map
        public int size() {
            int size;
            synchronized (this.mutex) {
                size = this.f18472m.size();
            }
            return size;
        }

        public String toString() {
            String obj;
            synchronized (this.mutex) {
                obj = this.f18472m.toString();
            }
            return obj;
        }

        @Override // java.util.Map
        public java.util.Collection values() {
            java.util.Collection collection;
            synchronized (this.mutex) {
                if (this.values == null) {
                    this.values = instantiateCollection(this.f18472m.values(), this.mutex);
                }
                collection = this.values;
            }
            return collection;
        }
    }

    static {
        Class<?> cls = Collections.synchronizedCollection(new ArrayList()).getClass();
        SYNCHRONIZED_COLLECTION = cls;
        SYNCHRONIZED_LIST = Collections.synchronizedList(new LinkedList()).getClass();
        Field field = getField(cls, "mutex");
        MUTEX_FIELD = field;
        if (field != null) {
            field.setAccessible(true);
        }
        Field field2 = getField(cls, "c");
        COLLECTION_FIELD = field2;
        if (field2 != null) {
            field2.setAccessible(true);
        }
        Constructor constructor = getConstructor(Collections.synchronizedSet(new HashSet()).getClass(), Set.class, Object.class);
        SYNCHRONIZED_SET_CONSTRUCTOR = constructor;
        if (constructor != null) {
            constructor.setAccessible(true);
        }
        Constructor constructor2 = getConstructor(cls, java.util.Collection.class, Object.class);
        SYNCHRONIZED_COLLECTION_CONSTRUCTOR = constructor2;
        if (constructor2 != null) {
            constructor2.setAccessible(true);
        }
    }

    private static Constructor getConstructor(Class cls, Class... clsArr) {
        try {
            return cls.getDeclaredConstructor(clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private static Field getField(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean removeIf(java.util.Collection collection, Predicate predicate) {
        boolean removeIf;
        Field field = MUTEX_FIELD;
        if (field == null) {
            try {
                return Collection.EL.removeIf((java.util.Collection) COLLECTION_FIELD.get(collection), predicate);
            } catch (IllegalAccessException e10) {
                throw new Error("Runtime illegal access in synchronized collection removeIf fall-back.", e10);
            }
        }
        try {
            synchronized (field.get(collection)) {
                removeIf = Collection.EL.removeIf((java.util.Collection) COLLECTION_FIELD.get(collection), predicate);
            }
            return removeIf;
        } catch (IllegalAccessException e11) {
            throw new Error("Runtime illegal access in synchronized collection removeIf.", e11);
        }
    }

    public static <K, V> java.util.Map<K, V> synchronizedMap(java.util.Map<K, V> map) {
        return new SynchronizedMap(map);
    }
}
