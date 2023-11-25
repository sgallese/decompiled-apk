package io.realm.internal;

import io.realm.RealmFieldType;
import io.realm.internal.core.NativeRealmAny;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes4.dex */
public class UncheckedRow implements h, q {

    /* renamed from: q  reason: collision with root package name */
    private static final long f17791q = nativeGetFinalizerPtr();

    /* renamed from: f  reason: collision with root package name */
    protected final g f17792f;

    /* renamed from: m  reason: collision with root package name */
    protected final Table f17793m;

    /* renamed from: p  reason: collision with root package name */
    private final long f17794p;

    /* loaded from: classes4.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f17795a;

        static {
            int[] iArr = new int[RealmFieldType.values().length];
            f17795a = iArr;
            try {
                iArr[RealmFieldType.OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17795a[RealmFieldType.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public UncheckedRow(g gVar, Table table, long j10) {
        this.f17792f = gVar;
        this.f17793m = table;
        this.f17794p = j10;
        gVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static UncheckedRow a(g gVar, Table table, long j10) {
        return new UncheckedRow(gVar, table, table.nativeGetRowPtr(table.getNativePtr(), j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static UncheckedRow b(g gVar, Table table, long j10) {
        return new UncheckedRow(gVar, table, j10);
    }

    private static native long nativeGetFinalizerPtr();

    public OsMap c(long j10) {
        return new OsMap(this, j10);
    }

    @Override // io.realm.internal.q
    public long createEmbeddedObject(long j10, RealmFieldType realmFieldType) {
        int i10 = a.f17795a[realmFieldType.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return getModelList(j10).n();
            }
            throw new IllegalArgumentException("Wrong parentPropertyType, expected OBJECT or LIST but received " + realmFieldType);
        }
        this.f17793m.a();
        return nativeCreateEmbeddedObject(this.f17794p, j10);
    }

    public void d(long j10, byte[] bArr) {
        this.f17793m.a();
        nativeSetByteArray(this.f17794p, j10, bArr);
    }

    public q freeze(OsSharedRealm osSharedRealm) {
        if (!isValid()) {
            return f.INSTANCE;
        }
        return new UncheckedRow(this.f17792f, this.f17793m.f(osSharedRealm), nativeFreeze(this.f17794p, osSharedRealm.getNativePtr()));
    }

    @Override // io.realm.internal.q
    public byte[] getBinaryByteArray(long j10) {
        return nativeGetByteArray(this.f17794p, j10);
    }

    @Override // io.realm.internal.q
    public boolean getBoolean(long j10) {
        return nativeGetBoolean(this.f17794p, j10);
    }

    @Override // io.realm.internal.q
    public long getColumnKey(String str) {
        if (str != null) {
            return nativeGetColumnKey(this.f17794p, str);
        }
        throw new IllegalArgumentException("Column name can not be null.");
    }

    @Override // io.realm.internal.q
    public String[] getColumnNames() {
        return nativeGetColumnNames(this.f17794p);
    }

    @Override // io.realm.internal.q
    public RealmFieldType getColumnType(long j10) {
        return RealmFieldType.fromNativeValue(nativeGetColumnType(this.f17794p, j10));
    }

    @Override // io.realm.internal.q
    public Date getDate(long j10) {
        return new Date(nativeGetTimestamp(this.f17794p, j10));
    }

    @Override // io.realm.internal.q
    public Decimal128 getDecimal128(long j10) {
        long[] nativeGetDecimal128 = nativeGetDecimal128(this.f17794p, j10);
        if (nativeGetDecimal128 != null) {
            return Decimal128.fromIEEE754BIDEncoding(nativeGetDecimal128[1], nativeGetDecimal128[0]);
        }
        return null;
    }

    @Override // io.realm.internal.q
    public double getDouble(long j10) {
        return nativeGetDouble(this.f17794p, j10);
    }

    @Override // io.realm.internal.q
    public float getFloat(long j10) {
        return nativeGetFloat(this.f17794p, j10);
    }

    @Override // io.realm.internal.q
    public long getLink(long j10) {
        return nativeGetLink(this.f17794p, j10);
    }

    @Override // io.realm.internal.q
    public long getLong(long j10) {
        return nativeGetLong(this.f17794p, j10);
    }

    public OsList getModelList(long j10) {
        return new OsList(this, j10);
    }

    public OsMap getModelMap(long j10) {
        return new OsMap(this, j10);
    }

    public OsSet getModelSet(long j10) {
        return new OsSet(this, j10);
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return f17791q;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.f17794p;
    }

    @Override // io.realm.internal.q
    public NativeRealmAny getNativeRealmAny(long j10) {
        return new NativeRealmAny(nativeGetRealmAny(this.f17794p, j10));
    }

    @Override // io.realm.internal.q
    public ObjectId getObjectId(long j10) {
        return new ObjectId(nativeGetObjectId(this.f17794p, j10));
    }

    @Override // io.realm.internal.q
    public long getObjectKey() {
        return nativeGetObjectKey(this.f17794p);
    }

    @Override // io.realm.internal.q
    public String getString(long j10) {
        return nativeGetString(this.f17794p, j10);
    }

    @Override // io.realm.internal.q
    public Table getTable() {
        return this.f17793m;
    }

    @Override // io.realm.internal.q
    public UUID getUUID(long j10) {
        return UUID.fromString(nativeGetUUID(this.f17794p, j10));
    }

    public OsList getValueList(long j10, RealmFieldType realmFieldType) {
        return new OsList(this, j10);
    }

    public OsMap getValueMap(long j10, RealmFieldType realmFieldType) {
        return new OsMap(this, j10);
    }

    public OsSet getValueSet(long j10, RealmFieldType realmFieldType) {
        return new OsSet(this, j10);
    }

    @Override // io.realm.internal.q
    public boolean isLoaded() {
        return true;
    }

    public boolean isNull(long j10) {
        return nativeIsNull(this.f17794p, j10);
    }

    public boolean isNullLink(long j10) {
        return nativeIsNullLink(this.f17794p, j10);
    }

    @Override // io.realm.internal.q
    public boolean isValid() {
        long j10 = this.f17794p;
        if (j10 != 0 && nativeIsValid(j10)) {
            return true;
        }
        return false;
    }

    protected native long nativeCreateEmbeddedObject(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: protected */
    public native long nativeFreeze(long j10, long j11);

    protected native boolean nativeGetBoolean(long j10, long j11);

    protected native byte[] nativeGetByteArray(long j10, long j11);

    protected native long nativeGetColumnCount(long j10);

    protected native long nativeGetColumnKey(long j10, String str);

    protected native String[] nativeGetColumnNames(long j10);

    protected native int nativeGetColumnType(long j10, long j11);

    protected native long[] nativeGetDecimal128(long j10, long j11);

    protected native double nativeGetDouble(long j10, long j11);

    protected native float nativeGetFloat(long j10, long j11);

    protected native long nativeGetLink(long j10, long j11);

    protected native long nativeGetLong(long j10, long j11);

    protected native String nativeGetObjectId(long j10, long j11);

    protected native long nativeGetObjectKey(long j10);

    protected native long nativeGetRealmAny(long j10, long j11);

    protected native String nativeGetString(long j10, long j11);

    protected native long nativeGetTimestamp(long j10, long j11);

    protected native String nativeGetUUID(long j10, long j11);

    protected native boolean nativeHasColumn(long j10, String str);

    protected native boolean nativeIsNull(long j10, long j11);

    protected native boolean nativeIsNullLink(long j10, long j11);

    protected native boolean nativeIsValid(long j10);

    protected native void nativeNullifyLink(long j10, long j11);

    protected native void nativeSetBoolean(long j10, long j11, boolean z10);

    protected native void nativeSetByteArray(long j10, long j11, byte[] bArr);

    protected native void nativeSetDecimal128(long j10, long j11, long j12, long j13);

    protected native void nativeSetDouble(long j10, long j11, double d10);

    protected native void nativeSetFloat(long j10, long j11, float f10);

    protected native void nativeSetLink(long j10, long j11, long j12);

    protected native void nativeSetLong(long j10, long j11, long j12);

    protected native void nativeSetNull(long j10, long j11);

    protected native void nativeSetObjectId(long j10, long j11, String str);

    protected native void nativeSetRealmAny(long j10, long j11, long j12);

    protected native void nativeSetString(long j10, long j11, String str);

    protected native void nativeSetTimestamp(long j10, long j11, long j12);

    protected native void nativeSetUUID(long j10, long j11, String str);

    @Override // io.realm.internal.q
    public void nullifyLink(long j10) {
        this.f17793m.a();
        nativeNullifyLink(this.f17794p, j10);
    }

    @Override // io.realm.internal.q
    public void setBoolean(long j10, boolean z10) {
        this.f17793m.a();
        nativeSetBoolean(this.f17794p, j10, z10);
    }

    @Override // io.realm.internal.q
    public void setDate(long j10, Date date) {
        this.f17793m.a();
        if (date != null) {
            nativeSetTimestamp(this.f17794p, j10, date.getTime());
            return;
        }
        throw new IllegalArgumentException("Null Date is not allowed.");
    }

    @Override // io.realm.internal.q
    public void setDouble(long j10, double d10) {
        this.f17793m.a();
        nativeSetDouble(this.f17794p, j10, d10);
    }

    @Override // io.realm.internal.q
    public void setFloat(long j10, float f10) {
        this.f17793m.a();
        nativeSetFloat(this.f17794p, j10, f10);
    }

    @Override // io.realm.internal.q
    public void setLink(long j10, long j11) {
        this.f17793m.a();
        nativeSetLink(this.f17794p, j10, j11);
    }

    @Override // io.realm.internal.q
    public void setLong(long j10, long j11) {
        this.f17793m.a();
        nativeSetLong(this.f17794p, j10, j11);
    }

    public void setNull(long j10) {
        this.f17793m.a();
        nativeSetNull(this.f17794p, j10);
    }

    @Override // io.realm.internal.q
    public void setString(long j10, String str) {
        this.f17793m.a();
        if (str == null) {
            nativeSetNull(this.f17794p, j10);
        } else {
            nativeSetString(this.f17794p, j10, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UncheckedRow(UncheckedRow uncheckedRow) {
        this.f17792f = uncheckedRow.f17792f;
        this.f17793m = uncheckedRow.f17793m;
        this.f17794p = uncheckedRow.f17794p;
    }
}
