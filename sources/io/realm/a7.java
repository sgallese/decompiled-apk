package io.realm;

import com.habitrpg.android.habitica.models.user.OwnedMount;
import io.realm.a;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_user_OwnedMountRealmProxy.java */
/* loaded from: classes4.dex */
public class a7 extends OwnedMount implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17306r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17307p;

    /* renamed from: q  reason: collision with root package name */
    private l0<OwnedMount> f17308q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_user_OwnedMountRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17309e;

        /* renamed from: f  reason: collision with root package name */
        long f17310f;

        /* renamed from: g  reason: collision with root package name */
        long f17311g;

        a(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("OwnedMount");
            this.f17309e = a("userID", "userID", b10);
            this.f17310f = a("key", "key", b10);
            this.f17311g = a("owned", "owned", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17309e = aVar.f17309e;
            aVar2.f17310f = aVar.f17310f;
            aVar2.f17311g = aVar.f17311g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a7() {
        this.f17308q.p();
    }

    public static OwnedMount c(o0 o0Var, a aVar, OwnedMount ownedMount, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(ownedMount);
        if (oVar != null) {
            return (OwnedMount) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(OwnedMount.class), set);
        osObjectBuilder.c1(aVar.f17309e, ownedMount.realmGet$userID());
        osObjectBuilder.c1(aVar.f17310f, ownedMount.realmGet$key());
        osObjectBuilder.F0(aVar.f17311g, Boolean.valueOf(ownedMount.realmGet$owned()));
        a7 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(ownedMount, k10);
        return k10;
    }

    public static OwnedMount d(o0 o0Var, a aVar, OwnedMount ownedMount, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((ownedMount instanceof io.realm.internal.o) && !d1.isFrozen(ownedMount)) {
            io.realm.internal.o oVar = (io.realm.internal.o) ownedMount;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return ownedMount;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(ownedMount);
        if (oVar2 != null) {
            return (OwnedMount) oVar2;
        }
        return c(o0Var, aVar, ownedMount, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static OwnedMount f(OwnedMount ownedMount, int i10, int i11, Map<a1, o.a<a1>> map) {
        OwnedMount ownedMount2;
        if (i10 <= i11 && ownedMount != null) {
            o.a<a1> aVar = map.get(ownedMount);
            if (aVar == null) {
                ownedMount2 = new OwnedMount();
                map.put(ownedMount, new o.a<>(i10, ownedMount2));
            } else if (i10 >= aVar.f17831a) {
                return (OwnedMount) aVar.f17832b;
            } else {
                OwnedMount ownedMount3 = (OwnedMount) aVar.f17832b;
                aVar.f17831a = i10;
                ownedMount2 = ownedMount3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) ownedMount).b().f();
            ownedMount2.realmSet$userID(ownedMount.realmGet$userID());
            ownedMount2.realmSet$key(ownedMount.realmGet$key());
            ownedMount2.realmSet$owned(ownedMount.realmGet$owned());
            return ownedMount2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "OwnedMount", true, 3, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "userID", realmFieldType, false, false, false);
        bVar.b("", "key", realmFieldType, false, false, false);
        bVar.b("", "owned", RealmFieldType.BOOLEAN, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17306r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, OwnedMount ownedMount, Map<a1, Long> map) {
        if ((ownedMount instanceof io.realm.internal.o) && !d1.isFrozen(ownedMount)) {
            io.realm.internal.o oVar = (io.realm.internal.o) ownedMount;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        long nativePtr = o0Var.c1(OwnedMount.class).getNativePtr();
        a aVar = (a) o0Var.R().e(OwnedMount.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(ownedMount, Long.valueOf(createEmbeddedObject));
        String realmGet$userID = ownedMount.realmGet$userID();
        if (realmGet$userID != null) {
            Table.nativeSetString(nativePtr, aVar.f17309e, createEmbeddedObject, realmGet$userID, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17309e, createEmbeddedObject, false);
        }
        String realmGet$key = ownedMount.realmGet$key();
        if (realmGet$key != null) {
            Table.nativeSetString(nativePtr, aVar.f17310f, createEmbeddedObject, realmGet$key, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17310f, createEmbeddedObject, false);
        }
        Table.nativeSetBoolean(nativePtr, aVar.f17311g, createEmbeddedObject, ownedMount.realmGet$owned(), false);
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a7 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(OwnedMount.class), false, Collections.emptyList());
        a7 a7Var = new a7();
        cVar.a();
        return a7Var;
    }

    static OwnedMount l(o0 o0Var, a aVar, OwnedMount ownedMount, OwnedMount ownedMount2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(OwnedMount.class), set);
        osObjectBuilder.c1(aVar.f17309e, ownedMount2.realmGet$userID());
        osObjectBuilder.c1(aVar.f17310f, ownedMount2.realmGet$key());
        osObjectBuilder.F0(aVar.f17311g, Boolean.valueOf(ownedMount2.realmGet$owned()));
        osObjectBuilder.f1((io.realm.internal.o) ownedMount);
        return ownedMount;
    }

    public static void n(o0 o0Var, OwnedMount ownedMount, OwnedMount ownedMount2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(OwnedMount.class), ownedMount2, ownedMount, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17308q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17307p = (a) cVar.c();
        l0<OwnedMount> l0Var = new l0<>(this);
        this.f17308q = l0Var;
        l0Var.r(cVar.e());
        this.f17308q.s(cVar.f());
        this.f17308q.o(cVar.b());
        this.f17308q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17308q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a7 a7Var = (a7) obj;
        io.realm.a f10 = this.f17308q.f();
        io.realm.a f11 = a7Var.f17308q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17308q.g().getTable().p();
        String p11 = a7Var.f17308q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17308q.g().getObjectKey() == a7Var.f17308q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17308q.f().getPath();
        String p10 = this.f17308q.g().getTable().p();
        long objectKey = this.f17308q.g().getObjectKey();
        int i11 = 0;
        if (path != null) {
            i10 = path.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (527 + i10) * 31;
        if (p10 != null) {
            i11 = p10.hashCode();
        }
        return ((i12 + i11) * 31) + ((int) ((objectKey >>> 32) ^ objectKey));
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedMount, io.realm.b7
    public String realmGet$key() {
        this.f17308q.f().e();
        return this.f17308q.g().getString(this.f17307p.f17310f);
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedMount, io.realm.b7
    public boolean realmGet$owned() {
        this.f17308q.f().e();
        return this.f17308q.g().getBoolean(this.f17307p.f17311g);
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedMount, io.realm.b7
    public String realmGet$userID() {
        this.f17308q.f().e();
        return this.f17308q.g().getString(this.f17307p.f17309e);
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedMount, io.realm.b7
    public void realmSet$key(String str) {
        if (this.f17308q.i()) {
            if (!this.f17308q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17308q.g();
            if (str == null) {
                g10.getTable().F(this.f17307p.f17310f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17307p.f17310f, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17308q.f().e();
        if (str == null) {
            this.f17308q.g().setNull(this.f17307p.f17310f);
        } else {
            this.f17308q.g().setString(this.f17307p.f17310f, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedMount, io.realm.b7
    public void realmSet$owned(boolean z10) {
        if (this.f17308q.i()) {
            if (!this.f17308q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17308q.g();
            g10.getTable().z(this.f17307p.f17311g, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17308q.f().e();
        this.f17308q.g().setBoolean(this.f17307p.f17311g, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedMount, io.realm.b7
    public void realmSet$userID(String str) {
        if (this.f17308q.i()) {
            if (!this.f17308q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17308q.g();
            if (str == null) {
                g10.getTable().F(this.f17307p.f17309e, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17307p.f17309e, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17308q.f().e();
        if (str == null) {
            this.f17308q.g().setNull(this.f17307p.f17309e);
        } else {
            this.f17308q.g().setString(this.f17307p.f17309e, str);
        }
    }

    public String toString() {
        String str;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("OwnedMount = proxy[");
        sb2.append("{userID:");
        String str2 = "null";
        if (realmGet$userID() == null) {
            str = "null";
        } else {
            str = realmGet$userID();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{key:");
        if (realmGet$key() != null) {
            str2 = realmGet$key();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{owned:");
        sb2.append(realmGet$owned());
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
