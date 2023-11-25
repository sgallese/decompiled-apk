package io.realm;

import com.habitrpg.android.habitica.models.user.OwnedPet;
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

/* compiled from: com_habitrpg_android_habitica_models_user_OwnedPetRealmProxy.java */
/* loaded from: classes4.dex */
public class c7 extends OwnedPet implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17391r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17392p;

    /* renamed from: q  reason: collision with root package name */
    private l0<OwnedPet> f17393q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_user_OwnedPetRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17394e;

        /* renamed from: f  reason: collision with root package name */
        long f17395f;

        /* renamed from: g  reason: collision with root package name */
        long f17396g;

        a(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("OwnedPet");
            this.f17394e = a("userID", "userID", b10);
            this.f17395f = a("key", "key", b10);
            this.f17396g = a("trained", "trained", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17394e = aVar.f17394e;
            aVar2.f17395f = aVar.f17395f;
            aVar2.f17396g = aVar.f17396g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c7() {
        this.f17393q.p();
    }

    public static OwnedPet c(o0 o0Var, a aVar, OwnedPet ownedPet, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(ownedPet);
        if (oVar != null) {
            return (OwnedPet) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(OwnedPet.class), set);
        osObjectBuilder.c1(aVar.f17394e, ownedPet.realmGet$userID());
        osObjectBuilder.c1(aVar.f17395f, ownedPet.realmGet$key());
        osObjectBuilder.V0(aVar.f17396g, Integer.valueOf(ownedPet.realmGet$trained()));
        c7 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(ownedPet, k10);
        return k10;
    }

    public static OwnedPet d(o0 o0Var, a aVar, OwnedPet ownedPet, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((ownedPet instanceof io.realm.internal.o) && !d1.isFrozen(ownedPet)) {
            io.realm.internal.o oVar = (io.realm.internal.o) ownedPet;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return ownedPet;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(ownedPet);
        if (oVar2 != null) {
            return (OwnedPet) oVar2;
        }
        return c(o0Var, aVar, ownedPet, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static OwnedPet f(OwnedPet ownedPet, int i10, int i11, Map<a1, o.a<a1>> map) {
        OwnedPet ownedPet2;
        if (i10 <= i11 && ownedPet != null) {
            o.a<a1> aVar = map.get(ownedPet);
            if (aVar == null) {
                ownedPet2 = new OwnedPet();
                map.put(ownedPet, new o.a<>(i10, ownedPet2));
            } else if (i10 >= aVar.f17831a) {
                return (OwnedPet) aVar.f17832b;
            } else {
                OwnedPet ownedPet3 = (OwnedPet) aVar.f17832b;
                aVar.f17831a = i10;
                ownedPet2 = ownedPet3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) ownedPet).b().f();
            ownedPet2.realmSet$userID(ownedPet.realmGet$userID());
            ownedPet2.realmSet$key(ownedPet.realmGet$key());
            ownedPet2.realmSet$trained(ownedPet.realmGet$trained());
            return ownedPet2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "OwnedPet", true, 3, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "userID", realmFieldType, false, false, false);
        bVar.b("", "key", realmFieldType, false, false, false);
        bVar.b("", "trained", RealmFieldType.INTEGER, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17391r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, OwnedPet ownedPet, Map<a1, Long> map) {
        if ((ownedPet instanceof io.realm.internal.o) && !d1.isFrozen(ownedPet)) {
            io.realm.internal.o oVar = (io.realm.internal.o) ownedPet;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        long nativePtr = o0Var.c1(OwnedPet.class).getNativePtr();
        a aVar = (a) o0Var.R().e(OwnedPet.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(ownedPet, Long.valueOf(createEmbeddedObject));
        String realmGet$userID = ownedPet.realmGet$userID();
        if (realmGet$userID != null) {
            Table.nativeSetString(nativePtr, aVar.f17394e, createEmbeddedObject, realmGet$userID, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17394e, createEmbeddedObject, false);
        }
        String realmGet$key = ownedPet.realmGet$key();
        if (realmGet$key != null) {
            Table.nativeSetString(nativePtr, aVar.f17395f, createEmbeddedObject, realmGet$key, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17395f, createEmbeddedObject, false);
        }
        Table.nativeSetLong(nativePtr, aVar.f17396g, createEmbeddedObject, ownedPet.realmGet$trained(), false);
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c7 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(OwnedPet.class), false, Collections.emptyList());
        c7 c7Var = new c7();
        cVar.a();
        return c7Var;
    }

    static OwnedPet l(o0 o0Var, a aVar, OwnedPet ownedPet, OwnedPet ownedPet2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(OwnedPet.class), set);
        osObjectBuilder.c1(aVar.f17394e, ownedPet2.realmGet$userID());
        osObjectBuilder.c1(aVar.f17395f, ownedPet2.realmGet$key());
        osObjectBuilder.V0(aVar.f17396g, Integer.valueOf(ownedPet2.realmGet$trained()));
        osObjectBuilder.f1((io.realm.internal.o) ownedPet);
        return ownedPet;
    }

    public static void n(o0 o0Var, OwnedPet ownedPet, OwnedPet ownedPet2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(OwnedPet.class), ownedPet2, ownedPet, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17393q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17392p = (a) cVar.c();
        l0<OwnedPet> l0Var = new l0<>(this);
        this.f17393q = l0Var;
        l0Var.r(cVar.e());
        this.f17393q.s(cVar.f());
        this.f17393q.o(cVar.b());
        this.f17393q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17393q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c7 c7Var = (c7) obj;
        io.realm.a f10 = this.f17393q.f();
        io.realm.a f11 = c7Var.f17393q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17393q.g().getTable().p();
        String p11 = c7Var.f17393q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17393q.g().getObjectKey() == c7Var.f17393q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17393q.f().getPath();
        String p10 = this.f17393q.g().getTable().p();
        long objectKey = this.f17393q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.user.OwnedPet, io.realm.d7
    public String realmGet$key() {
        this.f17393q.f().e();
        return this.f17393q.g().getString(this.f17392p.f17395f);
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedPet, io.realm.d7
    public int realmGet$trained() {
        this.f17393q.f().e();
        return (int) this.f17393q.g().getLong(this.f17392p.f17396g);
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedPet, io.realm.d7
    public String realmGet$userID() {
        this.f17393q.f().e();
        return this.f17393q.g().getString(this.f17392p.f17394e);
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedPet, io.realm.d7
    public void realmSet$key(String str) {
        if (this.f17393q.i()) {
            if (!this.f17393q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17393q.g();
            if (str == null) {
                g10.getTable().F(this.f17392p.f17395f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17392p.f17395f, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17393q.f().e();
        if (str == null) {
            this.f17393q.g().setNull(this.f17392p.f17395f);
        } else {
            this.f17393q.g().setString(this.f17392p.f17395f, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedPet, io.realm.d7
    public void realmSet$trained(int i10) {
        if (this.f17393q.i()) {
            if (!this.f17393q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17393q.g();
            g10.getTable().E(this.f17392p.f17396g, g10.getObjectKey(), i10, true);
            return;
        }
        this.f17393q.f().e();
        this.f17393q.g().setLong(this.f17392p.f17396g, i10);
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedPet, io.realm.d7
    public void realmSet$userID(String str) {
        if (this.f17393q.i()) {
            if (!this.f17393q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17393q.g();
            if (str == null) {
                g10.getTable().F(this.f17392p.f17394e, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17392p.f17394e, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17393q.f().e();
        if (str == null) {
            this.f17393q.g().setNull(this.f17392p.f17394e);
        } else {
            this.f17393q.g().setString(this.f17392p.f17394e, str);
        }
    }

    public String toString() {
        String str;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("OwnedPet = proxy[");
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
        sb2.append("{trained:");
        sb2.append(realmGet$trained());
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
