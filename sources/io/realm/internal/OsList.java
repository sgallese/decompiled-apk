package io.realm.internal;

import io.realm.internal.ObservableCollection;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes4.dex */
public class OsList implements h, ObservableCollection, k {

    /* renamed from: r  reason: collision with root package name */
    private static final long f17717r = nativeGetFinalizerPtr();

    /* renamed from: f  reason: collision with root package name */
    private final long f17718f;

    /* renamed from: m  reason: collision with root package name */
    private final g f17719m;

    /* renamed from: p  reason: collision with root package name */
    private final Table f17720p;

    /* renamed from: q  reason: collision with root package name */
    private final j<ObservableCollection.b> f17721q = new j<>();

    public OsList(UncheckedRow uncheckedRow, long j10) {
        OsSharedRealm q10 = uncheckedRow.getTable().q();
        long[] nativeCreate = nativeCreate(q10.getNativePtr(), uncheckedRow.getNativePtr(), j10);
        this.f17718f = nativeCreate[0];
        g gVar = q10.context;
        this.f17719m = gVar;
        gVar.a(this);
        if (nativeCreate[1] != 0) {
            this.f17720p = new Table(q10, nativeCreate[1]);
        } else {
            this.f17720p = null;
        }
    }

    private static native void nativeAddBinary(long j10, byte[] bArr);

    private static native void nativeAddBoolean(long j10, boolean z10);

    private static native void nativeAddDate(long j10, long j11);

    private static native void nativeAddDecimal128(long j10, long j11, long j12);

    private static native void nativeAddDouble(long j10, double d10);

    private static native void nativeAddFloat(long j10, float f10);

    private static native void nativeAddLong(long j10, long j11);

    private static native void nativeAddNull(long j10);

    private static native void nativeAddObjectId(long j10, String str);

    private static native void nativeAddRealmAny(long j10, long j11);

    private static native void nativeAddRow(long j10, long j11);

    private static native void nativeAddString(long j10, String str);

    private static native void nativeAddUUID(long j10, String str);

    private static native long[] nativeCreate(long j10, long j11, long j12);

    private static native long nativeCreateAndAddEmbeddedObject(long j10, long j11);

    private static native long nativeCreateAndSetEmbeddedObject(long j10, long j11);

    private static native void nativeDelete(long j10, long j11);

    private static native void nativeDeleteAll(long j10);

    private static native long nativeFreeze(long j10, long j11);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetQuery(long j10);

    private static native long nativeGetRow(long j10, long j11);

    private static native Object nativeGetValue(long j10, long j11);

    private static native void nativeInsertBinary(long j10, long j11, byte[] bArr);

    private static native void nativeInsertBoolean(long j10, long j11, boolean z10);

    private static native void nativeInsertDate(long j10, long j11, long j12);

    private static native void nativeInsertDecimal128(long j10, long j11, long j12, long j13);

    private static native void nativeInsertDouble(long j10, long j11, double d10);

    private static native void nativeInsertFloat(long j10, long j11, float f10);

    private static native void nativeInsertLong(long j10, long j11, long j12);

    private static native void nativeInsertNull(long j10, long j11);

    private static native void nativeInsertObjectId(long j10, long j11, String str);

    private static native void nativeInsertRealmAny(long j10, long j11, long j12);

    private static native void nativeInsertRow(long j10, long j11, long j12);

    private static native void nativeInsertString(long j10, long j11, String str);

    private static native void nativeInsertUUID(long j10, long j11, String str);

    private static native boolean nativeIsValid(long j10);

    private static native void nativeMove(long j10, long j11, long j12);

    private static native void nativeRemove(long j10, long j11);

    private static native void nativeRemoveAll(long j10);

    private static native void nativeSetBinary(long j10, long j11, byte[] bArr);

    private static native void nativeSetBoolean(long j10, long j11, boolean z10);

    private static native void nativeSetDate(long j10, long j11, long j12);

    private static native void nativeSetDecimal128(long j10, long j11, long j12, long j13);

    private static native void nativeSetDouble(long j10, long j11, double d10);

    private static native void nativeSetFloat(long j10, long j11, float f10);

    private static native void nativeSetLong(long j10, long j11, long j12);

    private static native void nativeSetNull(long j10, long j11);

    private static native void nativeSetObjectId(long j10, long j11, String str);

    private static native void nativeSetRealmAny(long j10, long j11, long j12);

    private static native void nativeSetRow(long j10, long j11, long j12);

    private static native void nativeSetString(long j10, long j11, String str);

    private static native void nativeSetUUID(long j10, long j11, String str);

    private static native long nativeSize(long j10);

    private native void nativeStartListening(long j10);

    private native void nativeStopListening(long j10);

    public void A(long j10, long j11) {
        nativeInsertLong(this.f17718f, j10, j11);
    }

    public void B(long j10) {
        nativeInsertNull(this.f17718f, j10);
    }

    public void C(long j10, ObjectId objectId) {
        if (objectId == null) {
            nativeInsertNull(this.f17718f, j10);
        } else {
            nativeInsertObjectId(this.f17718f, j10, objectId.toString());
        }
    }

    public void D(long j10, long j11) {
        nativeInsertRealmAny(this.f17718f, j10, j11);
    }

    public void E(long j10, long j11) {
        nativeInsertRow(this.f17718f, j10, j11);
    }

    public void F(long j10, String str) {
        nativeInsertString(this.f17718f, j10, str);
    }

    public void G(long j10, UUID uuid) {
        if (uuid == null) {
            nativeInsertNull(this.f17718f, j10);
        } else {
            nativeInsertUUID(this.f17718f, j10, uuid.toString());
        }
    }

    public boolean H() {
        if (nativeSize(this.f17718f) <= 0) {
            return true;
        }
        return false;
    }

    public boolean I() {
        return nativeIsValid(this.f17718f);
    }

    public void J(long j10) {
        nativeRemove(this.f17718f, j10);
    }

    public void K() {
        nativeRemoveAll(this.f17718f);
    }

    public void L(long j10, byte[] bArr) {
        nativeSetBinary(this.f17718f, j10, bArr);
    }

    public void M(long j10, boolean z10) {
        nativeSetBoolean(this.f17718f, j10, z10);
    }

    public void N(long j10, Date date) {
        if (date == null) {
            nativeSetNull(this.f17718f, j10);
        } else {
            nativeSetDate(this.f17718f, j10, date.getTime());
        }
    }

    public void O(long j10, Decimal128 decimal128) {
        if (decimal128 == null) {
            nativeSetNull(this.f17718f, j10);
        } else {
            nativeSetDecimal128(this.f17718f, j10, decimal128.j(), decimal128.i());
        }
    }

    public void P(long j10, double d10) {
        nativeSetDouble(this.f17718f, j10, d10);
    }

    public void Q(long j10, float f10) {
        nativeSetFloat(this.f17718f, j10, f10);
    }

    public void R(long j10, long j11) {
        nativeSetLong(this.f17718f, j10, j11);
    }

    public void S(long j10) {
        nativeSetNull(this.f17718f, j10);
    }

    public void T(long j10, ObjectId objectId) {
        if (objectId == null) {
            nativeSetNull(this.f17718f, j10);
        } else {
            nativeSetObjectId(this.f17718f, j10, objectId.toString());
        }
    }

    public void U(long j10, long j11) {
        nativeSetRealmAny(this.f17718f, j10, j11);
    }

    public void V(long j10, long j11) {
        nativeSetRow(this.f17718f, j10, j11);
    }

    public void W(long j10, String str) {
        nativeSetString(this.f17718f, j10, str);
    }

    public void X(long j10, UUID uuid) {
        if (uuid == null) {
            nativeSetNull(this.f17718f, j10);
        } else {
            nativeSetUUID(this.f17718f, j10, uuid.toString());
        }
    }

    public long Y() {
        return nativeSize(this.f17718f);
    }

    public void a(byte[] bArr) {
        nativeAddBinary(this.f17718f, bArr);
    }

    public void b(boolean z10) {
        nativeAddBoolean(this.f17718f, z10);
    }

    public void c(Date date) {
        if (date == null) {
            nativeAddNull(this.f17718f);
        } else {
            nativeAddDate(this.f17718f, date.getTime());
        }
    }

    public void d(Decimal128 decimal128) {
        if (decimal128 == null) {
            nativeAddNull(this.f17718f);
        } else {
            nativeAddDecimal128(this.f17718f, decimal128.j(), decimal128.i());
        }
    }

    public void e(double d10) {
        nativeAddDouble(this.f17718f, d10);
    }

    public void f(float f10) {
        nativeAddFloat(this.f17718f, f10);
    }

    public void g(long j10) {
        nativeAddLong(this.f17718f, j10);
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return f17717r;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.f17718f;
    }

    public void h() {
        nativeAddNull(this.f17718f);
    }

    public void i(ObjectId objectId) {
        if (objectId == null) {
            nativeAddNull(this.f17718f);
        } else {
            nativeAddObjectId(this.f17718f, objectId.toString());
        }
    }

    public void j(long j10) {
        nativeAddRealmAny(this.f17718f, j10);
    }

    public void k(long j10) {
        nativeAddRow(this.f17718f, j10);
    }

    public void l(String str) {
        nativeAddString(this.f17718f, str);
    }

    public void m(UUID uuid) {
        if (uuid == null) {
            nativeAddNull(this.f17718f);
        } else {
            nativeAddUUID(this.f17718f, uuid.toString());
        }
    }

    public long n() {
        return nativeCreateAndAddEmbeddedObject(this.f17718f, Y());
    }

    @Override // io.realm.internal.ObservableCollection
    public void notifyChangeListeners(long j10) {
        OsCollectionChangeSet osCollectionChangeSet = new OsCollectionChangeSet(j10, false);
        if (osCollectionChangeSet.e()) {
            return;
        }
        this.f17721q.c(new ObservableCollection.a(osCollectionChangeSet));
    }

    public long o(long j10) {
        return nativeCreateAndAddEmbeddedObject(this.f17718f, j10);
    }

    public long p(long j10) {
        return nativeCreateAndSetEmbeddedObject(this.f17718f, j10);
    }

    public void q() {
        nativeDeleteAll(this.f17718f);
    }

    public TableQuery r() {
        return new TableQuery(this.f17719m, this.f17720p, nativeGetQuery(this.f17718f));
    }

    public UncheckedRow s(long j10) {
        return this.f17720p.t(nativeGetRow(this.f17718f, j10));
    }

    public Object t(long j10) {
        return nativeGetValue(this.f17718f, j10);
    }

    public void u(long j10, byte[] bArr) {
        nativeInsertBinary(this.f17718f, j10, bArr);
    }

    public void v(long j10, boolean z10) {
        nativeInsertBoolean(this.f17718f, j10, z10);
    }

    public void w(long j10, Date date) {
        if (date == null) {
            nativeInsertNull(this.f17718f, j10);
        } else {
            nativeInsertDate(this.f17718f, j10, date.getTime());
        }
    }

    public void x(long j10, Decimal128 decimal128) {
        if (decimal128 == null) {
            nativeInsertNull(this.f17718f, j10);
        } else {
            nativeInsertDecimal128(this.f17718f, j10, decimal128.j(), decimal128.i());
        }
    }

    public void y(long j10, double d10) {
        nativeInsertDouble(this.f17718f, j10, d10);
    }

    public void z(long j10, float f10) {
        nativeInsertFloat(this.f17718f, j10, f10);
    }
}
