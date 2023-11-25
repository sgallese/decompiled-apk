package io.realm;

import io.realm.internal.OsList;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* compiled from: RealmList.java */
/* loaded from: classes4.dex */
public class x0<E> extends AbstractList<E> implements OrderedRealmCollection<E> {

    /* renamed from: f  reason: collision with root package name */
    protected Class<E> f18407f;

    /* renamed from: m  reason: collision with root package name */
    protected String f18408m;

    /* renamed from: p  reason: collision with root package name */
    private final y<E> f18409p;

    /* renamed from: q  reason: collision with root package name */
    public final io.realm.a f18410q;

    /* renamed from: r  reason: collision with root package name */
    private List<E> f18411r;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RealmList.java */
    /* loaded from: classes4.dex */
    public class b implements Iterator<E> {

        /* renamed from: f  reason: collision with root package name */
        int f18412f;

        /* renamed from: m  reason: collision with root package name */
        int f18413m;

        /* renamed from: p  reason: collision with root package name */
        int f18414p;

        private b() {
            this.f18412f = 0;
            this.f18413m = -1;
            this.f18414p = ((AbstractList) x0.this).modCount;
        }

        final void a() {
            if (((AbstractList) x0.this).modCount == this.f18414p) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            x0.this.j();
            a();
            if (this.f18412f != x0.this.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public E next() {
            x0.this.j();
            a();
            int i10 = this.f18412f;
            try {
                E e10 = (E) x0.this.get(i10);
                this.f18413m = i10;
                this.f18412f = i10 + 1;
                return e10;
            } catch (IndexOutOfBoundsException unused) {
                a();
                throw new NoSuchElementException("Cannot access index " + i10 + " when size is " + x0.this.size() + ". Remember to check hasNext() before using next().");
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            x0.this.j();
            if (this.f18413m >= 0) {
                a();
                try {
                    x0.this.remove(this.f18413m);
                    int i10 = this.f18413m;
                    int i11 = this.f18412f;
                    if (i10 < i11) {
                        this.f18412f = i11 - 1;
                    }
                    this.f18413m = -1;
                    this.f18414p = ((AbstractList) x0.this).modCount;
                    return;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ConcurrentModificationException();
                }
            }
            throw new IllegalStateException("Cannot call remove() twice. Must call next() in between.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RealmList.java */
    /* loaded from: classes4.dex */
    public class c extends x0<E>.b implements ListIterator<E> {
        c(int i10) {
            super();
            if (i10 >= 0 && i10 <= x0.this.size()) {
                this.f18412f = i10;
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Starting location must be a valid index: [0, ");
            sb2.append(x0.this.size() - 1);
            sb2.append("]. Index was ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }

        @Override // java.util.ListIterator
        public void add(E e10) {
            x0.this.f18410q.e();
            a();
            try {
                int i10 = this.f18412f;
                x0.this.add(i10, e10);
                this.f18413m = -1;
                this.f18412f = i10 + 1;
                this.f18414p = ((AbstractList) x0.this).modCount;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (this.f18412f != 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f18412f;
        }

        @Override // java.util.ListIterator
        public E previous() {
            a();
            int i10 = this.f18412f - 1;
            try {
                E e10 = (E) x0.this.get(i10);
                this.f18412f = i10;
                this.f18413m = i10;
                return e10;
            } catch (IndexOutOfBoundsException unused) {
                a();
                throw new NoSuchElementException("Cannot access index less than zero. This was " + i10 + ". Remember to check hasPrevious() before using previous().");
            }
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f18412f - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e10) {
            x0.this.f18410q.e();
            if (this.f18413m >= 0) {
                a();
                try {
                    x0.this.set(this.f18413m, e10);
                    this.f18414p = ((AbstractList) x0.this).modCount;
                    return;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ConcurrentModificationException();
                }
            }
            throw new IllegalStateException();
        }
    }

    public x0() {
        this.f18410q = null;
        this.f18409p = null;
        this.f18411r = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f18410q.e();
    }

    private E k(boolean z10, E e10) {
        if (p()) {
            j();
            if (!this.f18409p.l()) {
                return get(0);
            }
        } else {
            List<E> list = this.f18411r;
            if (list != null && !list.isEmpty()) {
                return this.f18411r.get(0);
            }
        }
        if (!z10) {
            return e10;
        }
        throw new IndexOutOfBoundsException("The list is empty.");
    }

    private y<E> l(io.realm.a aVar, OsList osList, Class<E> cls, String str) {
        if (cls != null && !o(cls)) {
            if (cls == String.class) {
                return new k1(aVar, osList, cls);
            }
            if (cls != Long.class && cls != Integer.class && cls != Short.class && cls != Byte.class) {
                if (cls == Boolean.class) {
                    return new d(aVar, osList, cls);
                }
                if (cls == byte[].class) {
                    return new io.realm.b(aVar, osList, cls);
                }
                if (cls == Double.class) {
                    return new l(aVar, osList, cls);
                }
                if (cls == Float.class) {
                    return new q(aVar, osList, cls);
                }
                if (cls == Date.class) {
                    return new h(aVar, osList, cls);
                }
                if (cls == Decimal128.class) {
                    return new j(aVar, osList, cls);
                }
                if (cls == ObjectId.class) {
                    return new e0(aVar, osList, cls);
                }
                if (cls == UUID.class) {
                    return new m1(aVar, osList, cls);
                }
                if (cls == p0.class) {
                    return new q0(aVar, osList, cls);
                }
                throw new IllegalArgumentException("Unexpected value class: " + cls.getName());
            }
            return new x(aVar, osList, cls);
        }
        return new b1(aVar, osList, cls, str);
    }

    private boolean n() {
        y<E> yVar = this.f18409p;
        if (yVar != null && yVar.m()) {
            return true;
        }
        return false;
    }

    private static boolean o(Class<?> cls) {
        return a1.class.isAssignableFrom(cls);
    }

    @Override // io.realm.RealmCollection
    public RealmQuery<E> B() {
        if (p()) {
            j();
            if (this.f18409p.f()) {
                return RealmQuery.g(this);
            }
            throw new UnsupportedOperationException("This feature is available only when the element type is implementing RealmModel.");
        }
        throw new UnsupportedOperationException("This method is only available in managed mode.");
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        if (p()) {
            j();
            this.f18409p.i(i10, e10);
        } else {
            this.f18411r.add(i10, e10);
        }
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (p()) {
            j();
            this.f18409p.o();
        } else {
            this.f18411r.clear();
        }
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (p()) {
            this.f18410q.e();
            if ((obj instanceof io.realm.internal.o) && ((io.realm.internal.o) obj).b().g() == io.realm.internal.f.INSTANCE) {
                return false;
            }
            return super.contains(obj);
        }
        return this.f18411r.contains(obj);
    }

    public E first() {
        return k(true, null);
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        if (p()) {
            j();
            return this.f18409p.g(i10);
        }
        return this.f18411r.get(i10);
    }

    @Override // io.realm.RealmCollection
    public boolean isValid() {
        io.realm.a aVar = this.f18410q;
        if (aVar == null) {
            return true;
        }
        if (aVar.isClosed()) {
            return false;
        }
        return n();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        if (p()) {
            return new b();
        }
        return super.iterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OsList m() {
        return this.f18409p.h();
    }

    public boolean p() {
        if (this.f18410q != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i10) {
        E remove;
        if (p()) {
            j();
            remove = get(i10);
            this.f18409p.n(i10);
        } else {
            remove = this.f18411r.remove(i10);
        }
        ((AbstractList) this).modCount++;
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        if (p() && !this.f18410q.c0()) {
            throw new IllegalStateException("Objects can only be removed from inside a write transaction.");
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        if (p()) {
            j();
            return this.f18409p.p(i10, e10);
        }
        return this.f18411r.set(i10, e10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        if (p()) {
            j();
            return this.f18409p.s();
        }
        return this.f18411r.size();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        if (!p()) {
            sb2.append("RealmList<?>@[");
            int size = size();
            while (i10 < size) {
                E e10 = get(i10);
                if (e10 instanceof a1) {
                    sb2.append(System.identityHashCode(e10));
                } else if (e10 instanceof byte[]) {
                    sb2.append("byte[");
                    sb2.append(((byte[]) e10).length);
                    sb2.append("]");
                } else {
                    sb2.append(e10);
                }
                sb2.append(",");
                i10++;
            }
            if (size() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            sb2.append("]");
        } else {
            sb2.append("RealmList<");
            String str = this.f18408m;
            if (str != null) {
                sb2.append(str);
            } else if (o(this.f18407f)) {
                sb2.append(this.f18410q.R().h(this.f18407f).a());
            } else {
                Class<E> cls = this.f18407f;
                if (cls == byte[].class) {
                    sb2.append(cls.getSimpleName());
                } else {
                    sb2.append(cls.getName());
                }
            }
            sb2.append(">@[");
            if (!n()) {
                sb2.append("invalid");
            } else if (o(this.f18407f)) {
                while (i10 < size()) {
                    sb2.append(((io.realm.internal.o) get(i10)).b().g().getObjectKey());
                    sb2.append(",");
                    i10++;
                }
                if (size() > 0) {
                    sb2.setLength(sb2.length() - 1);
                }
            } else {
                while (i10 < size()) {
                    E e11 = get(i10);
                    if (e11 instanceof byte[]) {
                        sb2.append("byte[");
                        sb2.append(((byte[]) e11).length);
                        sb2.append("]");
                    } else {
                        sb2.append(e11);
                    }
                    sb2.append(",");
                    i10++;
                }
                if (size() > 0) {
                    sb2.setLength(sb2.length() - 1);
                }
            }
            sb2.append("]");
        }
        return sb2.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i10) {
        if (p()) {
            return new c(i10);
        }
        return super.listIterator(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x0(Class<E> cls, OsList osList, io.realm.a aVar) {
        this.f18407f = cls;
        this.f18409p = l(aVar, osList, cls, null);
        this.f18410q = aVar;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        if (p()) {
            j();
            this.f18409p.a(e10);
        } else {
            this.f18411r.add(e10);
        }
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        if (p() && !this.f18410q.c0()) {
            throw new IllegalStateException("Objects can only be removed from inside a write transaction.");
        }
        return super.remove(obj);
    }
}
