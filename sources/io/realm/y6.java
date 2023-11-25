package io.realm;

import com.habitrpg.android.habitica.models.user.OwnedItem;
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

/* compiled from: com_habitrpg_android_habitica_models_user_OwnedItemRealmProxy.java */
/* loaded from: classes4.dex */
public class y6 extends OwnedItem implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18457r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18458p;

    /* renamed from: q  reason: collision with root package name */
    private l0<OwnedItem> f18459q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_user_OwnedItemRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18460e;

        /* renamed from: f  reason: collision with root package name */
        long f18461f;

        /* renamed from: g  reason: collision with root package name */
        long f18462g;

        /* renamed from: h  reason: collision with root package name */
        long f18463h;

        a(OsSchemaInfo osSchemaInfo) {
            super(4);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("OwnedItem");
            this.f18460e = a("userID", "userID", b10);
            this.f18461f = a("key", "key", b10);
            this.f18462g = a("itemType", "itemType", b10);
            this.f18463h = a("numberOwned", "numberOwned", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18460e = aVar.f18460e;
            aVar2.f18461f = aVar.f18461f;
            aVar2.f18462g = aVar.f18462g;
            aVar2.f18463h = aVar.f18463h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y6() {
        this.f18459q.p();
    }

    public static OwnedItem c(o0 o0Var, a aVar, OwnedItem ownedItem, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(ownedItem);
        if (oVar != null) {
            return (OwnedItem) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(OwnedItem.class), set);
        osObjectBuilder.c1(aVar.f18460e, ownedItem.realmGet$userID());
        osObjectBuilder.c1(aVar.f18461f, ownedItem.realmGet$key());
        osObjectBuilder.c1(aVar.f18462g, ownedItem.realmGet$itemType());
        osObjectBuilder.V0(aVar.f18463h, Integer.valueOf(ownedItem.realmGet$numberOwned()));
        y6 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(ownedItem, k10);
        return k10;
    }

    public static OwnedItem d(o0 o0Var, a aVar, OwnedItem ownedItem, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((ownedItem instanceof io.realm.internal.o) && !d1.isFrozen(ownedItem)) {
            io.realm.internal.o oVar = (io.realm.internal.o) ownedItem;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return ownedItem;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(ownedItem);
        if (oVar2 != null) {
            return (OwnedItem) oVar2;
        }
        return c(o0Var, aVar, ownedItem, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static OwnedItem f(OwnedItem ownedItem, int i10, int i11, Map<a1, o.a<a1>> map) {
        OwnedItem ownedItem2;
        if (i10 <= i11 && ownedItem != null) {
            o.a<a1> aVar = map.get(ownedItem);
            if (aVar == null) {
                ownedItem2 = new OwnedItem();
                map.put(ownedItem, new o.a<>(i10, ownedItem2));
            } else if (i10 >= aVar.f17831a) {
                return (OwnedItem) aVar.f17832b;
            } else {
                OwnedItem ownedItem3 = (OwnedItem) aVar.f17832b;
                aVar.f17831a = i10;
                ownedItem2 = ownedItem3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) ownedItem).b().f();
            ownedItem2.realmSet$userID(ownedItem.realmGet$userID());
            ownedItem2.realmSet$key(ownedItem.realmGet$key());
            ownedItem2.realmSet$itemType(ownedItem.realmGet$itemType());
            ownedItem2.realmSet$numberOwned(ownedItem.realmGet$numberOwned());
            return ownedItem2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "OwnedItem", true, 4, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "userID", realmFieldType, false, false, false);
        bVar.b("", "key", realmFieldType, false, false, false);
        bVar.b("", "itemType", realmFieldType, false, false, false);
        bVar.b("", "numberOwned", RealmFieldType.INTEGER, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18457r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, OwnedItem ownedItem, Map<a1, Long> map) {
        if ((ownedItem instanceof io.realm.internal.o) && !d1.isFrozen(ownedItem)) {
            io.realm.internal.o oVar = (io.realm.internal.o) ownedItem;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        long nativePtr = o0Var.c1(OwnedItem.class).getNativePtr();
        a aVar = (a) o0Var.R().e(OwnedItem.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(ownedItem, Long.valueOf(createEmbeddedObject));
        String realmGet$userID = ownedItem.realmGet$userID();
        if (realmGet$userID != null) {
            Table.nativeSetString(nativePtr, aVar.f18460e, createEmbeddedObject, realmGet$userID, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18460e, createEmbeddedObject, false);
        }
        String realmGet$key = ownedItem.realmGet$key();
        if (realmGet$key != null) {
            Table.nativeSetString(nativePtr, aVar.f18461f, createEmbeddedObject, realmGet$key, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18461f, createEmbeddedObject, false);
        }
        String realmGet$itemType = ownedItem.realmGet$itemType();
        if (realmGet$itemType != null) {
            Table.nativeSetString(nativePtr, aVar.f18462g, createEmbeddedObject, realmGet$itemType, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18462g, createEmbeddedObject, false);
        }
        Table.nativeSetLong(nativePtr, aVar.f18463h, createEmbeddedObject, ownedItem.realmGet$numberOwned(), false);
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y6 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(OwnedItem.class), false, Collections.emptyList());
        y6 y6Var = new y6();
        cVar.a();
        return y6Var;
    }

    static OwnedItem l(o0 o0Var, a aVar, OwnedItem ownedItem, OwnedItem ownedItem2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(OwnedItem.class), set);
        osObjectBuilder.c1(aVar.f18460e, ownedItem2.realmGet$userID());
        osObjectBuilder.c1(aVar.f18461f, ownedItem2.realmGet$key());
        osObjectBuilder.c1(aVar.f18462g, ownedItem2.realmGet$itemType());
        osObjectBuilder.V0(aVar.f18463h, Integer.valueOf(ownedItem2.realmGet$numberOwned()));
        osObjectBuilder.f1((io.realm.internal.o) ownedItem);
        return ownedItem;
    }

    public static void n(o0 o0Var, OwnedItem ownedItem, OwnedItem ownedItem2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(OwnedItem.class), ownedItem2, ownedItem, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18459q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18458p = (a) cVar.c();
        l0<OwnedItem> l0Var = new l0<>(this);
        this.f18459q = l0Var;
        l0Var.r(cVar.e());
        this.f18459q.s(cVar.f());
        this.f18459q.o(cVar.b());
        this.f18459q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18459q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        y6 y6Var = (y6) obj;
        io.realm.a f10 = this.f18459q.f();
        io.realm.a f11 = y6Var.f18459q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18459q.g().getTable().p();
        String p11 = y6Var.f18459q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18459q.g().getObjectKey() == y6Var.f18459q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18459q.f().getPath();
        String p10 = this.f18459q.g().getTable().p();
        long objectKey = this.f18459q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.user.OwnedItem, io.realm.z6
    public String realmGet$itemType() {
        this.f18459q.f().e();
        return this.f18459q.g().getString(this.f18458p.f18462g);
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedItem, io.realm.z6
    public String realmGet$key() {
        this.f18459q.f().e();
        return this.f18459q.g().getString(this.f18458p.f18461f);
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedItem, io.realm.z6
    public int realmGet$numberOwned() {
        this.f18459q.f().e();
        return (int) this.f18459q.g().getLong(this.f18458p.f18463h);
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedItem, io.realm.z6
    public String realmGet$userID() {
        this.f18459q.f().e();
        return this.f18459q.g().getString(this.f18458p.f18460e);
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedItem, io.realm.z6
    public void realmSet$itemType(String str) {
        if (this.f18459q.i()) {
            if (!this.f18459q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18459q.g();
            if (str == null) {
                g10.getTable().F(this.f18458p.f18462g, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18458p.f18462g, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18459q.f().e();
        if (str == null) {
            this.f18459q.g().setNull(this.f18458p.f18462g);
        } else {
            this.f18459q.g().setString(this.f18458p.f18462g, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedItem, io.realm.z6
    public void realmSet$key(String str) {
        if (this.f18459q.i()) {
            if (!this.f18459q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18459q.g();
            if (str == null) {
                g10.getTable().F(this.f18458p.f18461f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18458p.f18461f, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18459q.f().e();
        if (str == null) {
            this.f18459q.g().setNull(this.f18458p.f18461f);
        } else {
            this.f18459q.g().setString(this.f18458p.f18461f, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedItem, io.realm.z6
    public void realmSet$numberOwned(int i10) {
        if (this.f18459q.i()) {
            if (!this.f18459q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18459q.g();
            g10.getTable().E(this.f18458p.f18463h, g10.getObjectKey(), i10, true);
            return;
        }
        this.f18459q.f().e();
        this.f18459q.g().setLong(this.f18458p.f18463h, i10);
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedItem, io.realm.z6
    public void realmSet$userID(String str) {
        if (this.f18459q.i()) {
            if (!this.f18459q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18459q.g();
            if (str == null) {
                g10.getTable().F(this.f18458p.f18460e, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18458p.f18460e, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18459q.f().e();
        if (str == null) {
            this.f18459q.g().setNull(this.f18458p.f18460e);
        } else {
            this.f18459q.g().setString(this.f18458p.f18460e, str);
        }
    }

    public String toString() {
        String str;
        String str2;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("OwnedItem = proxy[");
        sb2.append("{userID:");
        String str3 = "null";
        if (realmGet$userID() == null) {
            str = "null";
        } else {
            str = realmGet$userID();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{key:");
        if (realmGet$key() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$key();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{itemType:");
        if (realmGet$itemType() != null) {
            str3 = realmGet$itemType();
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{numberOwned:");
        sb2.append(realmGet$numberOwned());
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
