package io.realm.internal;

import io.realm.h0;
import io.realm.internal.ObservableCollection;
import io.realm.u0;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public class OsResults implements h, ObservableCollection {

    /* renamed from: u  reason: collision with root package name */
    private static final long f17755u = nativeGetFinalizerPtr();

    /* renamed from: f  reason: collision with root package name */
    private final long f17756f;

    /* renamed from: m  reason: collision with root package name */
    private final OsSharedRealm f17757m;

    /* renamed from: p  reason: collision with root package name */
    private final g f17758p;

    /* renamed from: q  reason: collision with root package name */
    private final Table f17759q;

    /* renamed from: r  reason: collision with root package name */
    protected boolean f17760r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f17761s = false;

    /* renamed from: t  reason: collision with root package name */
    protected final j<ObservableCollection.b> f17762t = new j<>();

    /* loaded from: classes4.dex */
    public static abstract class a<T> implements Iterator<T> {

        /* renamed from: f  reason: collision with root package name */
        protected OsResults f17763f;

        /* renamed from: m  reason: collision with root package name */
        protected int f17764m = -1;

        public a(OsResults osResults) {
            if (!osResults.f17757m.isClosed()) {
                this.f17763f = osResults;
                if (osResults.f17761s) {
                    return;
                }
                if (osResults.f17757m.isInTransaction()) {
                    c();
                    return;
                } else {
                    this.f17763f.f17757m.addIterator(this);
                    return;
                }
            }
            throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
        }

        void a() {
            if (this.f17763f != null) {
                return;
            }
            throw new ConcurrentModificationException("No outside changes to a Realm is allowed while iterating a living Realm collection.");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c() {
            this.f17763f = this.f17763f.g();
        }

        T d(int i10) {
            return e(i10, this.f17763f);
        }

        protected abstract T e(int i10, OsResults osResults);

        /* JADX INFO: Access modifiers changed from: package-private */
        public void f() {
            this.f17763f = null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            if (this.f17764m + 1 < this.f17763f.s()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            int i10 = this.f17764m + 1;
            this.f17764m = i10;
            if (i10 < this.f17763f.s()) {
                return d(this.f17764m);
            }
            throw new NoSuchElementException("Cannot access index " + this.f17764m + " when size is " + this.f17763f.s() + ". Remember to check hasNext() before using next().");
        }

        @Override // java.util.Iterator
        @Deprecated
        public void remove() {
            throw new UnsupportedOperationException("remove() is not supported by RealmResults iterators.");
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class b<T> extends a<T> implements ListIterator<T> {
        public b(OsResults osResults, int i10) {
            super(osResults);
            if (i10 >= 0 && i10 <= this.f17763f.s()) {
                this.f17764m = i10 - 1;
                return;
            }
            throw new IndexOutOfBoundsException("Starting location must be a valid index: [0, " + (this.f17763f.s() - 1) + "]. Yours was " + i10);
        }

        @Override // java.util.ListIterator
        @Deprecated
        public void add(T t10) {
            throw new UnsupportedOperationException("Adding an element is not supported. Use Realm.createObject() instead.");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            a();
            if (this.f17764m >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            a();
            return this.f17764m + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            a();
            try {
                this.f17764m--;
                return d(this.f17764m);
            } catch (IndexOutOfBoundsException unused) {
                throw new NoSuchElementException("Cannot access index less than zero. This was " + this.f17764m + ". Remember to check hasPrevious() before using previous().");
            }
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            a();
            return this.f17764m;
        }

        @Override // java.util.ListIterator
        @Deprecated
        public void set(T t10) {
            throw new UnsupportedOperationException("Replacing an element is not supported.");
        }
    }

    /* loaded from: classes4.dex */
    public enum c {
        EMPTY,
        TABLE,
        PRIMITIVE_LIST,
        QUERY,
        TABLEVIEW;

        static c getByValue(byte b10) {
            if (b10 != 0) {
                if (b10 != 1) {
                    if (b10 != 2) {
                        if (b10 != 3) {
                            if (b10 == 4) {
                                return TABLEVIEW;
                            }
                            throw new IllegalArgumentException("Invalid value: " + ((int) b10));
                        }
                        return QUERY;
                    }
                    return PRIMITIVE_LIST;
                }
                return TABLE;
            }
            return EMPTY;
        }
    }

    OsResults(OsSharedRealm osSharedRealm, Table table, long j10) {
        this.f17757m = osSharedRealm;
        g gVar = osSharedRealm.context;
        this.f17758p = gVar;
        this.f17759q = table;
        this.f17756f = j10;
        gVar.a(this);
        this.f17760r = j() != c.QUERY;
    }

    public static OsResults f(OsSharedRealm osSharedRealm, TableQuery tableQuery) {
        tableQuery.z();
        return new OsResults(osSharedRealm, tableQuery.k(), nativeCreateResults(osSharedRealm.getNativePtr(), tableQuery.getNativePtr()));
    }

    private static native Object nativeAggregate(long j10, long j11, byte b10);

    private static native void nativeClear(long j10);

    private static native boolean nativeContains(long j10, long j11);

    protected static native long nativeCreateResults(long j10, long j11);

    private static native long nativeCreateResultsFromBacklinks(long j10, long j11, long j12, long j13);

    private static native long nativeCreateSnapshot(long j10);

    private static native void nativeDelete(long j10, long j11);

    private static native boolean nativeDeleteFirst(long j10);

    private static native boolean nativeDeleteLast(long j10);

    private static native void nativeEvaluateQueryIfNeeded(long j10, boolean z10);

    private static native long nativeFirstRow(long j10);

    private static native long nativeFreeze(long j10, long j11);

    private static native long nativeGetFinalizerPtr();

    private static native byte nativeGetMode(long j10);

    private static native long nativeGetRow(long j10, int i10);

    private static native long nativeGetTable(long j10);

    private static native Object nativeGetValue(long j10, int i10);

    private static native long nativeIndexOf(long j10, long j11);

    private static native boolean nativeIsValid(long j10);

    private static native long nativeLastRow(long j10);

    private static native void nativeSetBinary(long j10, String str, byte[] bArr);

    private static native void nativeSetBoolean(long j10, String str, boolean z10);

    private static native void nativeSetDecimal128(long j10, String str, long j11, long j12);

    private static native void nativeSetDouble(long j10, String str, double d10);

    private static native void nativeSetFloat(long j10, String str, float f10);

    private static native void nativeSetInt(long j10, String str, long j11);

    private static native void nativeSetList(long j10, String str, long j11);

    private static native void nativeSetNull(long j10, String str);

    private static native void nativeSetObject(long j10, String str, long j11);

    private static native void nativeSetObjectId(long j10, String str, String str2);

    private static native void nativeSetString(long j10, String str, String str2);

    private static native void nativeSetTimestamp(long j10, String str, long j11);

    private static native void nativeSetUUID(long j10, String str, String str2);

    private static native long nativeSize(long j10);

    private native void nativeStartListening(long j10);

    private native void nativeStopListening(long j10);

    private static native long nativeStringDescriptor(long j10, String str, long j11);

    private static native long nativeWhere(long j10);

    private static native String toJSON(long j10, int i10);

    public <T> void c(T t10, h0<T> h0Var) {
        if (this.f17762t.d()) {
            nativeStartListening(this.f17756f);
        }
        this.f17762t.a(new ObservableCollection.b(t10, h0Var));
    }

    public <T> void d(T t10, u0<T> u0Var) {
        c(t10, new ObservableCollection.c(u0Var));
    }

    public void e() {
        nativeClear(this.f17756f);
    }

    public OsResults g() {
        if (this.f17761s) {
            return this;
        }
        OsResults osResults = new OsResults(this.f17757m, this.f17759q, nativeCreateSnapshot(this.f17756f));
        osResults.f17761s = true;
        return osResults;
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return f17755u;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.f17756f;
    }

    public UncheckedRow h() {
        long nativeFirstRow = nativeFirstRow(this.f17756f);
        if (nativeFirstRow != 0) {
            return this.f17759q.t(nativeFirstRow);
        }
        return null;
    }

    public OsResults i(OsSharedRealm osSharedRealm) {
        OsResults osResults = new OsResults(osSharedRealm, this.f17759q.f(osSharedRealm), nativeFreeze(this.f17756f, osSharedRealm.getNativePtr()));
        if (n()) {
            osResults.p();
        }
        return osResults;
    }

    public c j() {
        return c.getByValue(nativeGetMode(this.f17756f));
    }

    public Table k() {
        return this.f17759q;
    }

    public UncheckedRow l(int i10) {
        return this.f17759q.t(nativeGetRow(this.f17756f, i10));
    }

    public Object m(int i10) {
        return nativeGetValue(this.f17756f, i10);
    }

    public boolean n() {
        return this.f17760r;
    }

    @Override // io.realm.internal.ObservableCollection
    public void notifyChangeListeners(long j10) {
        OsCollectionChangeSet osCollectionChangeSet;
        if (j10 == 0) {
            osCollectionChangeSet = new d();
        } else {
            osCollectionChangeSet = new OsCollectionChangeSet(j10, !n());
        }
        if (osCollectionChangeSet.e() && n()) {
            return;
        }
        this.f17760r = true;
        this.f17762t.c(new ObservableCollection.a(osCollectionChangeSet));
    }

    public boolean o() {
        return nativeIsValid(this.f17756f);
    }

    public void p() {
        if (this.f17760r) {
            return;
        }
        nativeEvaluateQueryIfNeeded(this.f17756f, false);
        notifyChangeListeners(0L);
    }

    public <T> void q(T t10, h0<T> h0Var) {
        this.f17762t.e(t10, h0Var);
        if (this.f17762t.d()) {
            nativeStopListening(this.f17756f);
        }
    }

    public <T> void r(T t10, u0<T> u0Var) {
        q(t10, new ObservableCollection.c(u0Var));
    }

    public long s() {
        return nativeSize(this.f17756f);
    }

    public TableQuery t() {
        return new TableQuery(this.f17758p, this.f17759q, nativeWhere(this.f17756f));
    }
}
