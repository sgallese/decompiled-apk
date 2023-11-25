package io.realm.internal;

import io.realm.RealmFieldType;
import java.util.Locale;

/* loaded from: classes4.dex */
public class CheckedRow extends UncheckedRow {

    /* renamed from: r  reason: collision with root package name */
    private UncheckedRow f17704r;

    private CheckedRow(g gVar, Table table, long j10) {
        super(gVar, table, j10);
    }

    public static CheckedRow e(g gVar, Table table, long j10) {
        return new CheckedRow(gVar, table, table.nativeGetRowPtr(table.getNativePtr(), j10));
    }

    public static CheckedRow f(UncheckedRow uncheckedRow) {
        return new CheckedRow(uncheckedRow);
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.q
    public q freeze(OsSharedRealm osSharedRealm) {
        if (!isValid()) {
            return f.INSTANCE;
        }
        return new CheckedRow(this.f17792f, this.f17793m.f(osSharedRealm), nativeFreeze(getNativePtr(), osSharedRealm.getNativePtr()));
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.q
    public OsList getModelList(long j10) {
        if (getTable().n(j10) == RealmFieldType.LIST) {
            return super.getModelList(j10);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Field '%s' is not a 'RealmList'.", getTable().l(j10)));
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.q
    public OsMap getModelMap(long j10) {
        if (getTable().n(j10) == RealmFieldType.STRING_TO_LINK_MAP) {
            return super.c(j10);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Field '%s' is not a 'RealmDictionary'.", getTable().l(j10)));
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.q
    public OsSet getModelSet(long j10) {
        return super.getModelSet(j10);
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.q
    public OsList getValueList(long j10, RealmFieldType realmFieldType) {
        if (realmFieldType == getTable().n(j10)) {
            return super.getValueList(j10, realmFieldType);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "The type of field '%1$s' is not 'RealmFieldType.%2$s'.", getTable().l(j10), realmFieldType.name()));
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.q
    public OsMap getValueMap(long j10, RealmFieldType realmFieldType) {
        if (realmFieldType == getTable().n(j10)) {
            return super.getValueMap(j10, realmFieldType);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "The type of field '%1$s' is not 'RealmFieldType.%2$s'.", getTable().l(j10), realmFieldType.name()));
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.q
    public OsSet getValueSet(long j10, RealmFieldType realmFieldType) {
        if (realmFieldType == getTable().n(j10)) {
            return super.getValueSet(j10, realmFieldType);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "The type of field '%1$s' is not 'RealmFieldType.%2$s'.", getTable().l(j10), realmFieldType.name()));
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.q
    public boolean isNull(long j10) {
        return super.isNull(j10);
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.q
    public boolean isNullLink(long j10) {
        RealmFieldType columnType = getColumnType(j10);
        if (columnType != RealmFieldType.OBJECT && columnType != RealmFieldType.LIST) {
            return false;
        }
        return super.isNullLink(j10);
    }

    @Override // io.realm.internal.UncheckedRow
    protected native boolean nativeGetBoolean(long j10, long j11);

    @Override // io.realm.internal.UncheckedRow
    protected native byte[] nativeGetByteArray(long j10, long j11);

    @Override // io.realm.internal.UncheckedRow
    protected native long nativeGetColumnCount(long j10);

    @Override // io.realm.internal.UncheckedRow
    protected native long nativeGetColumnKey(long j10, String str);

    @Override // io.realm.internal.UncheckedRow
    protected native int nativeGetColumnType(long j10, long j11);

    @Override // io.realm.internal.UncheckedRow
    protected native long[] nativeGetDecimal128(long j10, long j11);

    @Override // io.realm.internal.UncheckedRow
    protected native double nativeGetDouble(long j10, long j11);

    @Override // io.realm.internal.UncheckedRow
    protected native float nativeGetFloat(long j10, long j11);

    @Override // io.realm.internal.UncheckedRow
    protected native long nativeGetLink(long j10, long j11);

    @Override // io.realm.internal.UncheckedRow
    protected native long nativeGetLong(long j10, long j11);

    @Override // io.realm.internal.UncheckedRow
    protected native String nativeGetObjectId(long j10, long j11);

    @Override // io.realm.internal.UncheckedRow
    protected native String nativeGetString(long j10, long j11);

    @Override // io.realm.internal.UncheckedRow
    protected native long nativeGetTimestamp(long j10, long j11);

    @Override // io.realm.internal.UncheckedRow
    protected native boolean nativeIsNullLink(long j10, long j11);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeNullifyLink(long j10, long j11);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetBoolean(long j10, long j11, boolean z10);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetByteArray(long j10, long j11, byte[] bArr);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetDecimal128(long j10, long j11, long j12, long j13);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetDouble(long j10, long j11, double d10);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetFloat(long j10, long j11, float f10);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetLink(long j10, long j11, long j12);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetLong(long j10, long j11, long j12);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetObjectId(long j10, long j11, String str);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetString(long j10, long j11, String str);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetTimestamp(long j10, long j11, long j12);

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.q
    public void setNull(long j10) {
        if (getColumnType(j10) == RealmFieldType.BINARY) {
            super.d(j10, null);
        } else {
            super.setNull(j10);
        }
    }

    public CheckedRow(UncheckedRow uncheckedRow) {
        super(uncheckedRow);
        this.f17704r = uncheckedRow;
    }
}
