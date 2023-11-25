package io.realm.internal;

import io.realm.RealmFieldType;
import io.realm.internal.core.NativeRealmAny;
import io.realm.s;
import io.realm.u0;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* compiled from: PendingRow.java */
/* loaded from: classes4.dex */
public class l implements q {

    /* renamed from: f  reason: collision with root package name */
    private OsSharedRealm f17822f;

    /* renamed from: m  reason: collision with root package name */
    private OsResults f17823m;

    /* renamed from: p  reason: collision with root package name */
    private u0<l> f17824p;

    /* renamed from: q  reason: collision with root package name */
    private WeakReference<a> f17825q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f17826r;

    /* compiled from: PendingRow.java */
    /* loaded from: classes4.dex */
    public interface a {
        void a(q qVar);
    }

    private void a() {
        this.f17823m.r(this, this.f17824p);
        this.f17823m = null;
        this.f17824p = null;
        this.f17822f.removePendingRow(this);
    }

    private void c() {
        WeakReference<a> weakReference = this.f17825q;
        if (weakReference != null) {
            a aVar = weakReference.get();
            if (aVar == null) {
                a();
                return;
            } else if (this.f17823m.o()) {
                UncheckedRow h10 = this.f17823m.h();
                a();
                if (h10 != null) {
                    if (this.f17826r) {
                        h10 = CheckedRow.f(h10);
                    }
                    aVar.a(h10);
                    return;
                }
                aVar.a(f.INSTANCE);
                return;
            } else {
                a();
                return;
            }
        }
        throw new IllegalStateException("The 'frontEnd' has not been set.");
    }

    public void b() {
        if (this.f17823m != null) {
            c();
            return;
        }
        throw new IllegalStateException("The query has been executed. This 'PendingRow' is not valid anymore.");
    }

    @Override // io.realm.internal.q
    public long createEmbeddedObject(long j10, RealmFieldType realmFieldType) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public q freeze(OsSharedRealm osSharedRealm) {
        return s.INSTANCE;
    }

    @Override // io.realm.internal.q
    public byte[] getBinaryByteArray(long j10) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public boolean getBoolean(long j10) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public long getColumnKey(String str) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public String[] getColumnNames() {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public RealmFieldType getColumnType(long j10) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public Date getDate(long j10) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public Decimal128 getDecimal128(long j10) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public double getDouble(long j10) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public float getFloat(long j10) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public long getLink(long j10) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public long getLong(long j10) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public OsList getModelList(long j10) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public OsMap getModelMap(long j10) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public OsSet getModelSet(long j10) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public NativeRealmAny getNativeRealmAny(long j10) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public ObjectId getObjectId(long j10) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public long getObjectKey() {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public String getString(long j10) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public Table getTable() {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public UUID getUUID(long j10) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public OsList getValueList(long j10, RealmFieldType realmFieldType) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public OsMap getValueMap(long j10, RealmFieldType realmFieldType) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public OsSet getValueSet(long j10, RealmFieldType realmFieldType) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public boolean isLoaded() {
        return false;
    }

    @Override // io.realm.internal.q
    public boolean isNull(long j10) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public boolean isNullLink(long j10) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public boolean isValid() {
        return false;
    }

    @Override // io.realm.internal.q
    public void nullifyLink(long j10) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public void setBoolean(long j10, boolean z10) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public void setDate(long j10, Date date) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public void setDouble(long j10, double d10) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public void setFloat(long j10, float f10) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public void setLink(long j10, long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public void setLong(long j10, long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public void setNull(long j10) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public void setString(long j10, String str) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
}
