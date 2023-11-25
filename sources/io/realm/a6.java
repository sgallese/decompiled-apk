package io.realm;

import com.habitrpg.android.habitica.models.user.Backer;
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

/* compiled from: com_habitrpg_android_habitica_models_user_BackerRealmProxy.java */
/* loaded from: classes4.dex */
public class a6 extends Backer implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17301r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17302p;

    /* renamed from: q  reason: collision with root package name */
    private l0<Backer> f17303q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_user_BackerRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17304e;

        /* renamed from: f  reason: collision with root package name */
        long f17305f;

        a(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("Backer");
            this.f17304e = a("npc", "npc", b10);
            this.f17305f = a("tier", "tier", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17304e = aVar.f17304e;
            aVar2.f17305f = aVar.f17305f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a6() {
        this.f17303q.p();
    }

    public static Backer c(o0 o0Var, a aVar, Backer backer, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(backer);
        if (oVar != null) {
            return (Backer) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Backer.class), set);
        osObjectBuilder.c1(aVar.f17304e, backer.realmGet$npc());
        osObjectBuilder.V0(aVar.f17305f, backer.realmGet$tier());
        a6 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(backer, k10);
        return k10;
    }

    public static Backer d(o0 o0Var, a aVar, Backer backer, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((backer instanceof io.realm.internal.o) && !d1.isFrozen(backer)) {
            io.realm.internal.o oVar = (io.realm.internal.o) backer;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return backer;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(backer);
        if (oVar2 != null) {
            return (Backer) oVar2;
        }
        return c(o0Var, aVar, backer, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static Backer f(Backer backer, int i10, int i11, Map<a1, o.a<a1>> map) {
        Backer backer2;
        if (i10 <= i11 && backer != null) {
            o.a<a1> aVar = map.get(backer);
            if (aVar == null) {
                backer2 = new Backer();
                map.put(backer, new o.a<>(i10, backer2));
            } else if (i10 >= aVar.f17831a) {
                return (Backer) aVar.f17832b;
            } else {
                Backer backer3 = (Backer) aVar.f17832b;
                aVar.f17831a = i10;
                backer2 = backer3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) backer).b().f();
            backer2.realmSet$npc(backer.realmGet$npc());
            backer2.realmSet$tier(backer.realmGet$tier());
            return backer2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "Backer", true, 2, 0);
        bVar.b("", "npc", RealmFieldType.STRING, false, false, false);
        bVar.b("", "tier", RealmFieldType.INTEGER, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17301r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, Backer backer, Map<a1, Long> map) {
        if ((backer instanceof io.realm.internal.o) && !d1.isFrozen(backer)) {
            io.realm.internal.o oVar = (io.realm.internal.o) backer;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        long nativePtr = o0Var.c1(Backer.class).getNativePtr();
        a aVar = (a) o0Var.R().e(Backer.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(backer, Long.valueOf(createEmbeddedObject));
        String realmGet$npc = backer.realmGet$npc();
        if (realmGet$npc != null) {
            Table.nativeSetString(nativePtr, aVar.f17304e, createEmbeddedObject, realmGet$npc, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17304e, createEmbeddedObject, false);
        }
        Integer realmGet$tier = backer.realmGet$tier();
        if (realmGet$tier != null) {
            Table.nativeSetLong(nativePtr, aVar.f17305f, createEmbeddedObject, realmGet$tier.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17305f, createEmbeddedObject, false);
        }
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a6 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(Backer.class), false, Collections.emptyList());
        a6 a6Var = new a6();
        cVar.a();
        return a6Var;
    }

    static Backer l(o0 o0Var, a aVar, Backer backer, Backer backer2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Backer.class), set);
        osObjectBuilder.c1(aVar.f17304e, backer2.realmGet$npc());
        osObjectBuilder.V0(aVar.f17305f, backer2.realmGet$tier());
        osObjectBuilder.f1((io.realm.internal.o) backer);
        return backer;
    }

    public static void n(o0 o0Var, Backer backer, Backer backer2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(Backer.class), backer2, backer, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17303q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17302p = (a) cVar.c();
        l0<Backer> l0Var = new l0<>(this);
        this.f17303q = l0Var;
        l0Var.r(cVar.e());
        this.f17303q.s(cVar.f());
        this.f17303q.o(cVar.b());
        this.f17303q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17303q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a6 a6Var = (a6) obj;
        io.realm.a f10 = this.f17303q.f();
        io.realm.a f11 = a6Var.f17303q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17303q.g().getTable().p();
        String p11 = a6Var.f17303q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17303q.g().getObjectKey() == a6Var.f17303q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17303q.f().getPath();
        String p10 = this.f17303q.g().getTable().p();
        long objectKey = this.f17303q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.user.Backer, io.realm.b6
    public String realmGet$npc() {
        this.f17303q.f().e();
        return this.f17303q.g().getString(this.f17302p.f17304e);
    }

    @Override // com.habitrpg.android.habitica.models.user.Backer, io.realm.b6
    public Integer realmGet$tier() {
        this.f17303q.f().e();
        if (this.f17303q.g().isNull(this.f17302p.f17305f)) {
            return null;
        }
        return Integer.valueOf((int) this.f17303q.g().getLong(this.f17302p.f17305f));
    }

    @Override // com.habitrpg.android.habitica.models.user.Backer, io.realm.b6
    public void realmSet$npc(String str) {
        if (this.f17303q.i()) {
            if (!this.f17303q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17303q.g();
            if (str == null) {
                g10.getTable().F(this.f17302p.f17304e, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17302p.f17304e, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17303q.f().e();
        if (str == null) {
            this.f17303q.g().setNull(this.f17302p.f17304e);
        } else {
            this.f17303q.g().setString(this.f17302p.f17304e, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Backer, io.realm.b6
    public void realmSet$tier(Integer num) {
        if (this.f17303q.i()) {
            if (!this.f17303q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17303q.g();
            if (num == null) {
                g10.getTable().F(this.f17302p.f17305f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().E(this.f17302p.f17305f, g10.getObjectKey(), num.intValue(), true);
                return;
            }
        }
        this.f17303q.f().e();
        if (num == null) {
            this.f17303q.g().setNull(this.f17302p.f17305f);
        } else {
            this.f17303q.g().setLong(this.f17302p.f17305f, num.intValue());
        }
    }

    public String toString() {
        String str;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("Backer = proxy[");
        sb2.append("{npc:");
        Object obj = "null";
        if (realmGet$npc() == null) {
            str = "null";
        } else {
            str = realmGet$npc();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{tier:");
        if (realmGet$tier() != null) {
            obj = realmGet$tier();
        }
        sb2.append(obj);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
