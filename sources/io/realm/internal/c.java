package io.realm.internal;

import io.realm.RealmFieldType;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ColumnInfo.java */
/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, a> f17802a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, a> f17803b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f17804c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f17805d;

    /* JADX INFO: Access modifiers changed from: protected */
    public c(int i10) {
        this(i10, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long a(String str, String str2, OsObjectSchemaInfo osObjectSchemaInfo) {
        Property c10 = osObjectSchemaInfo.c(str2);
        a aVar = new a(c10);
        this.f17802a.put(str, aVar);
        this.f17803b.put(str2, aVar);
        this.f17804c.put(str, str2);
        return c10.c();
    }

    protected abstract void b(c cVar, c cVar2);

    public void c(c cVar) {
        if (this.f17805d) {
            if (cVar != null) {
                this.f17802a.clear();
                this.f17802a.putAll(cVar.f17802a);
                this.f17803b.clear();
                this.f17803b.putAll(cVar.f17803b);
                this.f17804c.clear();
                this.f17804c.putAll(cVar.f17804c);
                b(cVar, this);
                return;
            }
            throw new NullPointerException("Attempt to copy null ColumnInfo");
        }
        throw new UnsupportedOperationException("Attempt to modify an immutable ColumnInfo");
    }

    public a d(String str) {
        return this.f17802a.get(str);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ColumnInfo[");
        sb2.append("mutable=" + this.f17805d);
        sb2.append(",");
        boolean z10 = false;
        if (this.f17802a != null) {
            sb2.append("JavaFieldNames=[");
            boolean z11 = false;
            for (Map.Entry<String, a> entry : this.f17802a.entrySet()) {
                if (z11) {
                    sb2.append(",");
                }
                sb2.append(entry.getKey());
                sb2.append("->");
                sb2.append(entry.getValue());
                z11 = true;
            }
            sb2.append("]");
        }
        if (this.f17803b != null) {
            sb2.append(", InternalFieldNames=[");
            for (Map.Entry<String, a> entry2 : this.f17803b.entrySet()) {
                if (z10) {
                    sb2.append(",");
                }
                sb2.append(entry2.getKey());
                sb2.append("->");
                sb2.append(entry2.getValue());
                z10 = true;
            }
            sb2.append("]");
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(c cVar, boolean z10) {
        this(cVar == null ? 0 : cVar.f17802a.size(), z10);
        if (cVar != null) {
            this.f17802a.putAll(cVar.f17802a);
        }
    }

    /* compiled from: ColumnInfo.java */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f17806a;

        /* renamed from: b  reason: collision with root package name */
        public final RealmFieldType f17807b;

        /* renamed from: c  reason: collision with root package name */
        public final String f17808c;

        private a(long j10, RealmFieldType realmFieldType, String str) {
            this.f17806a = j10;
            this.f17807b = realmFieldType;
            this.f17808c = str;
        }

        public String toString() {
            return "ColumnDetails[" + this.f17806a + ", " + this.f17807b + ", " + this.f17808c + "]";
        }

        a(Property property) {
            this(property.c(), property.e(), property.d());
        }
    }

    private c(int i10, boolean z10) {
        this.f17802a = new HashMap(i10);
        this.f17803b = new HashMap(i10);
        this.f17804c = new HashMap(i10);
        this.f17805d = z10;
    }
}
