package io.realm.internal;

import io.realm.RealmFieldType;
import io.realm.internal.core.NativeRealmAny;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* compiled from: Row.java */
/* loaded from: classes4.dex */
public interface q {
    long createEmbeddedObject(long j10, RealmFieldType realmFieldType);

    q freeze(OsSharedRealm osSharedRealm);

    byte[] getBinaryByteArray(long j10);

    boolean getBoolean(long j10);

    long getColumnKey(String str);

    String[] getColumnNames();

    RealmFieldType getColumnType(long j10);

    Date getDate(long j10);

    Decimal128 getDecimal128(long j10);

    double getDouble(long j10);

    float getFloat(long j10);

    long getLink(long j10);

    long getLong(long j10);

    OsList getModelList(long j10);

    OsMap getModelMap(long j10);

    OsSet getModelSet(long j10);

    NativeRealmAny getNativeRealmAny(long j10);

    ObjectId getObjectId(long j10);

    long getObjectKey();

    String getString(long j10);

    Table getTable();

    UUID getUUID(long j10);

    OsList getValueList(long j10, RealmFieldType realmFieldType);

    OsMap getValueMap(long j10, RealmFieldType realmFieldType);

    OsSet getValueSet(long j10, RealmFieldType realmFieldType);

    boolean isLoaded();

    boolean isNull(long j10);

    boolean isNullLink(long j10);

    boolean isValid();

    void nullifyLink(long j10);

    void setBoolean(long j10, boolean z10);

    void setDate(long j10, Date date);

    void setDouble(long j10, double d10);

    void setFloat(long j10, float f10);

    void setLink(long j10, long j11);

    void setLong(long j10, long j11);

    void setNull(long j10);

    void setString(long j10, String str);
}
