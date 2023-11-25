package m0;

import ec.o;
import ec.p;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import l0.f;
import qc.q;

/* compiled from: SmallPersistentVector.kt */
/* loaded from: classes.dex */
public final class j<E> extends b<E> implements l0.d<E> {

    /* renamed from: p  reason: collision with root package name */
    public static final a f19726p = new a(null);

    /* renamed from: q  reason: collision with root package name */
    private static final j f19727q = new j(new Object[0]);

    /* renamed from: m  reason: collision with root package name */
    private final Object[] f19728m;

    /* compiled from: SmallPersistentVector.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final j a() {
            return j.f19727q;
        }
    }

    public j(Object[] objArr) {
        boolean z10;
        q.i(objArr, "buffer");
        this.f19728m = objArr;
        if (objArr.length <= 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        p0.a.a(z10);
    }

    private final Object[] h(int i10) {
        return new Object[i10];
    }

    @Override // l0.f
    public l0.f<E> L(int i10) {
        p0.d.a(i10, size());
        if (size() == 1) {
            return f19727q;
        }
        Object[] copyOf = Arrays.copyOf(this.f19728m, size() - 1);
        q.h(copyOf, "copyOf(this, newSize)");
        o.i(this.f19728m, copyOf, i10, i10 + 1, size());
        return new j(copyOf);
    }

    @Override // ec.a
    public int a() {
        return this.f19728m.length;
    }

    @Override // java.util.Collection, java.util.List, l0.f
    public l0.f<E> add(E e10) {
        if (size() < 32) {
            Object[] copyOf = Arrays.copyOf(this.f19728m, size() + 1);
            q.h(copyOf, "copyOf(this, newSize)");
            copyOf[size()] = e10;
            return new j(copyOf);
        }
        return new e(this.f19728m, l.c(e10), size() + 1, 0);
    }

    @Override // m0.b, java.util.Collection, java.util.List, l0.f
    public l0.f<E> addAll(Collection<? extends E> collection) {
        q.i(collection, "elements");
        if (size() + collection.size() <= 32) {
            Object[] copyOf = Arrays.copyOf(this.f19728m, size() + collection.size());
            q.h(copyOf, "copyOf(this, newSize)");
            int size = size();
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                copyOf[size] = it.next();
                size++;
            }
            return new j(copyOf);
        }
        f.a<E> builder = builder();
        builder.addAll(collection);
        return builder.build();
    }

    @Override // l0.f
    public f.a<E> builder() {
        return new f(this, null, this.f19728m, 0);
    }

    @Override // ec.c, java.util.List
    public E get(int i10) {
        p0.d.a(i10, size());
        return (E) this.f19728m[i10];
    }

    @Override // ec.c, java.util.List
    public int indexOf(Object obj) {
        int S;
        S = p.S(this.f19728m, obj);
        return S;
    }

    @Override // ec.c, java.util.List
    public int lastIndexOf(Object obj) {
        int T;
        T = p.T(this.f19728m, obj);
        return T;
    }

    @Override // ec.c, java.util.List
    public ListIterator<E> listIterator(int i10) {
        p0.d.b(i10, size());
        return new c(this.f19728m, i10, size());
    }

    @Override // ec.c, java.util.List
    public l0.f<E> set(int i10, E e10) {
        p0.d.a(i10, size());
        Object[] objArr = this.f19728m;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        q.h(copyOf, "copyOf(this, size)");
        copyOf[i10] = e10;
        return new j(copyOf);
    }

    @Override // l0.f
    public l0.f<E> z(pc.l<? super E, Boolean> lVar) {
        Object[] p10;
        q.i(lVar, "predicate");
        Object[] objArr = this.f19728m;
        int size = size();
        int size2 = size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size2; i10++) {
            Object obj = this.f19728m[i10];
            if (lVar.invoke(obj).booleanValue()) {
                if (!z10) {
                    Object[] objArr2 = this.f19728m;
                    objArr = Arrays.copyOf(objArr2, objArr2.length);
                    q.h(objArr, "copyOf(this, size)");
                    z10 = true;
                    size = i10;
                }
            } else if (z10) {
                objArr[size] = obj;
                size++;
            }
        }
        if (size == size()) {
            return this;
        }
        if (size != 0) {
            p10 = o.p(objArr, 0, size);
            return new j(p10);
        }
        return f19727q;
    }

    @Override // java.util.List, l0.f
    public l0.f<E> add(int i10, E e10) {
        p0.d.b(i10, size());
        if (i10 == size()) {
            return add((j<E>) e10);
        }
        if (size() < 32) {
            Object[] h10 = h(size() + 1);
            o.m(this.f19728m, h10, 0, 0, i10, 6, null);
            o.i(this.f19728m, h10, i10 + 1, i10, size());
            h10[i10] = e10;
            return new j(h10);
        }
        Object[] objArr = this.f19728m;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        q.h(copyOf, "copyOf(this, size)");
        o.i(this.f19728m, copyOf, i10 + 1, i10, size() - 1);
        copyOf[i10] = e10;
        return new e(copyOf, l.c(this.f19728m[31]), size() + 1, 0);
    }
}
