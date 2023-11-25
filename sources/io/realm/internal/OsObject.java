package io.realm.internal;

import io.realm.RealmFieldType;
import io.realm.a1;
import io.realm.d0;
import io.realm.e1;
import io.realm.exceptions.RealmException;
import io.realm.internal.j;
import java.util.UUID;
import org.bson.types.ObjectId;

@Keep
/* loaded from: classes4.dex */
public class OsObject implements h {
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private final long nativePtr;
    private j<b> observerPairs = new j<>();

    /* loaded from: classes4.dex */
    private static class a implements j.a<b> {

        /* renamed from: a  reason: collision with root package name */
        private final String[] f17726a;

        a(String[] strArr) {
            this.f17726a = strArr;
        }

        private d0 b() {
            boolean z10;
            String[] strArr = this.f17726a;
            if (strArr == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                strArr = new String[0];
            }
            return new c(strArr, z10);
        }

        @Override // io.realm.internal.j.a
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public void a(b bVar, Object obj) {
            bVar.a((a1) obj, b());
        }
    }

    /* loaded from: classes4.dex */
    public static class b<T extends a1> extends j.b<T, e1<T>> {
        public b(T t10, e1<T> e1Var) {
            super(t10, e1Var);
        }

        public void a(T t10, d0 d0Var) {
            ((e1) this.f17820b).a(t10, d0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class c implements d0 {

        /* renamed from: a  reason: collision with root package name */
        final String[] f17727a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f17728b;

        c(String[] strArr, boolean z10) {
            this.f17727a = strArr;
            this.f17728b = z10;
        }
    }

    public OsObject(OsSharedRealm osSharedRealm, UncheckedRow uncheckedRow) {
        this.nativePtr = nativeCreate(osSharedRealm.getNativePtr(), uncheckedRow.getNativePtr());
        osSharedRealm.context.a(this);
    }

    public static UncheckedRow create(Table table) {
        return new UncheckedRow(table.q().context, table, nativeCreateNewObject(table.getNativePtr()));
    }

    public static long createEmbeddedObject(Table table, long j10, long j11) {
        return nativeCreateEmbeddedObject(table.getNativePtr(), j10, j11);
    }

    public static long createRow(Table table) {
        return nativeCreateRow(table.getNativePtr());
    }

    public static long createRowWithPrimaryKey(Table table, long j10, Object obj) {
        long parseLong;
        boolean z10;
        RealmFieldType n10 = table.n(j10);
        OsSharedRealm q10 = table.q();
        if (n10 == RealmFieldType.STRING) {
            if (obj != null && !(obj instanceof String)) {
                throw new IllegalArgumentException("Primary key value is not a String: " + obj);
            }
            return nativeCreateRowWithStringPrimaryKey(q10.getNativePtr(), table.getNativePtr(), j10, (String) obj);
        } else if (n10 == RealmFieldType.INTEGER) {
            if (obj == null) {
                parseLong = 0;
            } else {
                parseLong = Long.parseLong(obj.toString());
            }
            long j11 = parseLong;
            long nativePtr = q10.getNativePtr();
            long nativePtr2 = table.getNativePtr();
            if (obj == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            return nativeCreateRowWithLongPrimaryKey(nativePtr, nativePtr2, j10, j11, z10);
        } else {
            String str = null;
            if (n10 == RealmFieldType.OBJECT_ID) {
                if (obj != null && !(obj instanceof ObjectId)) {
                    throw new IllegalArgumentException("Primary key value is not an ObjectId: " + obj);
                }
                if (obj != null) {
                    str = obj.toString();
                }
                return nativeCreateRowWithObjectIdPrimaryKey(q10.getNativePtr(), table.getNativePtr(), j10, str);
            } else if (n10 == RealmFieldType.UUID) {
                if (obj != null && !(obj instanceof UUID)) {
                    throw new IllegalArgumentException("Primary key value is not an UUID: " + obj);
                }
                if (obj != null) {
                    str = obj.toString();
                }
                return nativeCreateRowWithUUIDPrimaryKey(q10.getNativePtr(), table.getNativePtr(), j10, str);
            } else {
                throw new RealmException("Cannot check for duplicate rows for unsupported primary key type: " + n10);
            }
        }
    }

    public static UncheckedRow createWithPrimaryKey(Table table, Object obj) {
        String obj2;
        String obj3;
        long parseLong;
        boolean z10;
        long andVerifyPrimaryKeyColumnIndex = getAndVerifyPrimaryKeyColumnIndex(table);
        RealmFieldType n10 = table.n(andVerifyPrimaryKeyColumnIndex);
        OsSharedRealm q10 = table.q();
        if (n10 == RealmFieldType.STRING) {
            if (obj != null && !(obj instanceof String)) {
                throw new IllegalArgumentException("Primary key value is not a String: " + obj);
            }
            return new UncheckedRow(q10.context, table, nativeCreateNewObjectWithStringPrimaryKey(q10.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, (String) obj));
        } else if (n10 == RealmFieldType.INTEGER) {
            if (obj == null) {
                parseLong = 0;
            } else {
                parseLong = Long.parseLong(obj.toString());
            }
            long j10 = parseLong;
            g gVar = q10.context;
            long nativePtr = q10.getNativePtr();
            long nativePtr2 = table.getNativePtr();
            if (obj == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            return new UncheckedRow(gVar, table, nativeCreateNewObjectWithLongPrimaryKey(nativePtr, nativePtr2, andVerifyPrimaryKeyColumnIndex, j10, z10));
        } else if (n10 == RealmFieldType.OBJECT_ID) {
            if (obj == null) {
                obj3 = null;
            } else {
                obj3 = obj.toString();
            }
            return new UncheckedRow(q10.context, table, nativeCreateNewObjectWithObjectIdPrimaryKey(q10.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, obj3));
        } else if (n10 == RealmFieldType.UUID) {
            if (obj == null) {
                obj2 = null;
            } else {
                obj2 = obj.toString();
            }
            return new UncheckedRow(q10.context, table, nativeCreateNewObjectWithUUIDPrimaryKey(q10.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, obj2));
        } else {
            throw new RealmException("Cannot check for duplicate rows for unsupported primary key type: " + n10);
        }
    }

    private static long getAndVerifyPrimaryKeyColumnIndex(Table table) {
        String b10 = OsObjectStore.b(table.q(), table.h());
        if (b10 != null) {
            return table.k(b10);
        }
        throw new IllegalStateException(table.p() + " has no primary key defined.");
    }

    private static native long nativeCreate(long j10, long j11);

    private static native long nativeCreateEmbeddedObject(long j10, long j11, long j12);

    private static native long nativeCreateNewObject(long j10);

    private static native long nativeCreateNewObjectWithLongPrimaryKey(long j10, long j11, long j12, long j13, boolean z10);

    private static native long nativeCreateNewObjectWithObjectIdPrimaryKey(long j10, long j11, long j12, String str);

    private static native long nativeCreateNewObjectWithStringPrimaryKey(long j10, long j11, long j12, String str);

    private static native long nativeCreateNewObjectWithUUIDPrimaryKey(long j10, long j11, long j12, String str);

    private static native long nativeCreateRow(long j10);

    private static native long nativeCreateRowWithLongPrimaryKey(long j10, long j11, long j12, long j13, boolean z10);

    private static native long nativeCreateRowWithObjectIdPrimaryKey(long j10, long j11, long j12, String str);

    private static native long nativeCreateRowWithStringPrimaryKey(long j10, long j11, long j12, String str);

    private static native long nativeCreateRowWithUUIDPrimaryKey(long j10, long j11, long j12, String str);

    private static native long nativeGetFinalizerPtr();

    private native void nativeStartListening(long j10);

    private native void nativeStopListening(long j10);

    private void notifyChangeListeners(String[] strArr) {
        this.observerPairs.c(new a(strArr));
    }

    public <T extends a1> void addListener(T t10, e1<T> e1Var) {
        if (this.observerPairs.d()) {
            nativeStartListening(this.nativePtr);
        }
        this.observerPairs.a(new b(t10, e1Var));
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.nativePtr;
    }

    public <T extends a1> void removeListener(T t10) {
        this.observerPairs.f(t10);
        if (this.observerPairs.d()) {
            nativeStopListening(this.nativePtr);
        }
    }

    public void setObserverPairs(j<b> jVar) {
        if (this.observerPairs.d()) {
            this.observerPairs = jVar;
            if (!jVar.d()) {
                nativeStartListening(this.nativePtr);
                return;
            }
            return;
        }
        throw new IllegalStateException("'observerPairs' is not empty. Listeners have been added before.");
    }

    public <T extends a1> void removeListener(T t10, e1<T> e1Var) {
        this.observerPairs.e(t10, e1Var);
        if (this.observerPairs.d()) {
            nativeStopListening(this.nativePtr);
        }
    }
}
