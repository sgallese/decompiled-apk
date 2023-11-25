package io.realm.internal;

import io.realm.RealmFieldType;
import io.realm.internal.core.NativeRealmAny;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* compiled from: InvalidRow.java */
/* loaded from: classes4.dex */
public enum f implements q {
    INSTANCE;

    private RuntimeException getStubException() {
        return new IllegalStateException("Object is no longer managed by Realm. Has it been deleted?");
    }

    public void checkIfAttached() {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public long createEmbeddedObject(long j10, RealmFieldType realmFieldType) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public q freeze(OsSharedRealm osSharedRealm) {
        return INSTANCE;
    }

    @Override // io.realm.internal.q
    public byte[] getBinaryByteArray(long j10) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public boolean getBoolean(long j10) {
        throw getStubException();
    }

    public long getColumnCount() {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public long getColumnKey(String str) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public String[] getColumnNames() {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public RealmFieldType getColumnType(long j10) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public Date getDate(long j10) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public Decimal128 getDecimal128(long j10) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public double getDouble(long j10) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public float getFloat(long j10) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public long getLink(long j10) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public long getLong(long j10) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public OsList getModelList(long j10) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public OsMap getModelMap(long j10) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public OsSet getModelSet(long j10) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public NativeRealmAny getNativeRealmAny(long j10) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public ObjectId getObjectId(long j10) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public long getObjectKey() {
        throw getStubException();
    }

    public OsMap getRealmAnyMap(long j10) {
        throw getStubException();
    }

    public OsSet getRealmAnySet(long j10) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public String getString(long j10) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public Table getTable() {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public UUID getUUID(long j10) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public OsList getValueList(long j10, RealmFieldType realmFieldType) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public OsMap getValueMap(long j10, RealmFieldType realmFieldType) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public OsSet getValueSet(long j10, RealmFieldType realmFieldType) {
        throw getStubException();
    }

    public boolean hasColumn(String str) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public boolean isLoaded() {
        return true;
    }

    @Override // io.realm.internal.q
    public boolean isNull(long j10) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public boolean isNullLink(long j10) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public boolean isValid() {
        return false;
    }

    @Override // io.realm.internal.q
    public void nullifyLink(long j10) {
        throw getStubException();
    }

    public void setBinaryByteArray(long j10, byte[] bArr) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public void setBoolean(long j10, boolean z10) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public void setDate(long j10, Date date) {
        throw getStubException();
    }

    public void setDecimal128(long j10, Decimal128 decimal128) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public void setDouble(long j10, double d10) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public void setFloat(long j10, float f10) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public void setLink(long j10, long j11) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public void setLong(long j10, long j11) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public void setNull(long j10) {
        throw getStubException();
    }

    public void setObjectId(long j10, ObjectId objectId) {
        throw getStubException();
    }

    public void setRealmAny(long j10, long j11) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public void setString(long j10, String str) {
        throw getStubException();
    }

    public void setUUID(long j10, UUID uuid) {
        throw getStubException();
    }
}
