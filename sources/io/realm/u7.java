package io.realm;

import com.habitrpg.android.habitica.models.user.SuppressedModals;
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

/* compiled from: com_habitrpg_android_habitica_models_user_SuppressedModalsRealmProxy.java */
/* loaded from: classes4.dex */
public class u7 extends SuppressedModals implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18305r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18306p;

    /* renamed from: q  reason: collision with root package name */
    private l0<SuppressedModals> f18307q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_user_SuppressedModalsRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18308e;

        /* renamed from: f  reason: collision with root package name */
        long f18309f;

        /* renamed from: g  reason: collision with root package name */
        long f18310g;

        /* renamed from: h  reason: collision with root package name */
        long f18311h;

        a(OsSchemaInfo osSchemaInfo) {
            super(4);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("SuppressedModals");
            this.f18308e = a("streak", "streak", b10);
            this.f18309f = a("raisePet", "raisePet", b10);
            this.f18310g = a("hatchPet", "hatchPet", b10);
            this.f18311h = a("levelUp", "levelUp", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18308e = aVar.f18308e;
            aVar2.f18309f = aVar.f18309f;
            aVar2.f18310g = aVar.f18310g;
            aVar2.f18311h = aVar.f18311h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u7() {
        this.f18307q.p();
    }

    public static SuppressedModals c(o0 o0Var, a aVar, SuppressedModals suppressedModals, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(suppressedModals);
        if (oVar != null) {
            return (SuppressedModals) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(SuppressedModals.class), set);
        osObjectBuilder.F0(aVar.f18308e, suppressedModals.realmGet$streak());
        osObjectBuilder.F0(aVar.f18309f, suppressedModals.realmGet$raisePet());
        osObjectBuilder.F0(aVar.f18310g, suppressedModals.realmGet$hatchPet());
        osObjectBuilder.F0(aVar.f18311h, suppressedModals.realmGet$levelUp());
        u7 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(suppressedModals, k10);
        return k10;
    }

    public static SuppressedModals d(o0 o0Var, a aVar, SuppressedModals suppressedModals, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((suppressedModals instanceof io.realm.internal.o) && !d1.isFrozen(suppressedModals)) {
            io.realm.internal.o oVar = (io.realm.internal.o) suppressedModals;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return suppressedModals;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(suppressedModals);
        if (oVar2 != null) {
            return (SuppressedModals) oVar2;
        }
        return c(o0Var, aVar, suppressedModals, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static SuppressedModals f(SuppressedModals suppressedModals, int i10, int i11, Map<a1, o.a<a1>> map) {
        SuppressedModals suppressedModals2;
        if (i10 <= i11 && suppressedModals != null) {
            o.a<a1> aVar = map.get(suppressedModals);
            if (aVar == null) {
                suppressedModals2 = new SuppressedModals();
                map.put(suppressedModals, new o.a<>(i10, suppressedModals2));
            } else if (i10 >= aVar.f17831a) {
                return (SuppressedModals) aVar.f17832b;
            } else {
                SuppressedModals suppressedModals3 = (SuppressedModals) aVar.f17832b;
                aVar.f17831a = i10;
                suppressedModals2 = suppressedModals3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) suppressedModals).b().f();
            suppressedModals2.realmSet$streak(suppressedModals.realmGet$streak());
            suppressedModals2.realmSet$raisePet(suppressedModals.realmGet$raisePet());
            suppressedModals2.realmSet$hatchPet(suppressedModals.realmGet$hatchPet());
            suppressedModals2.realmSet$levelUp(suppressedModals.realmGet$levelUp());
            return suppressedModals2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "SuppressedModals", true, 4, 0);
        RealmFieldType realmFieldType = RealmFieldType.BOOLEAN;
        bVar.b("", "streak", realmFieldType, false, false, false);
        bVar.b("", "raisePet", realmFieldType, false, false, false);
        bVar.b("", "hatchPet", realmFieldType, false, false, false);
        bVar.b("", "levelUp", realmFieldType, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18305r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, SuppressedModals suppressedModals, Map<a1, Long> map) {
        if ((suppressedModals instanceof io.realm.internal.o) && !d1.isFrozen(suppressedModals)) {
            io.realm.internal.o oVar = (io.realm.internal.o) suppressedModals;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        long nativePtr = o0Var.c1(SuppressedModals.class).getNativePtr();
        a aVar = (a) o0Var.R().e(SuppressedModals.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(suppressedModals, Long.valueOf(createEmbeddedObject));
        Boolean realmGet$streak = suppressedModals.realmGet$streak();
        if (realmGet$streak != null) {
            Table.nativeSetBoolean(nativePtr, aVar.f18308e, createEmbeddedObject, realmGet$streak.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18308e, createEmbeddedObject, false);
        }
        Boolean realmGet$raisePet = suppressedModals.realmGet$raisePet();
        if (realmGet$raisePet != null) {
            Table.nativeSetBoolean(nativePtr, aVar.f18309f, createEmbeddedObject, realmGet$raisePet.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18309f, createEmbeddedObject, false);
        }
        Boolean realmGet$hatchPet = suppressedModals.realmGet$hatchPet();
        if (realmGet$hatchPet != null) {
            Table.nativeSetBoolean(nativePtr, aVar.f18310g, createEmbeddedObject, realmGet$hatchPet.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18310g, createEmbeddedObject, false);
        }
        Boolean realmGet$levelUp = suppressedModals.realmGet$levelUp();
        if (realmGet$levelUp != null) {
            Table.nativeSetBoolean(nativePtr, aVar.f18311h, createEmbeddedObject, realmGet$levelUp.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18311h, createEmbeddedObject, false);
        }
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u7 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(SuppressedModals.class), false, Collections.emptyList());
        u7 u7Var = new u7();
        cVar.a();
        return u7Var;
    }

    static SuppressedModals l(o0 o0Var, a aVar, SuppressedModals suppressedModals, SuppressedModals suppressedModals2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(SuppressedModals.class), set);
        osObjectBuilder.F0(aVar.f18308e, suppressedModals2.realmGet$streak());
        osObjectBuilder.F0(aVar.f18309f, suppressedModals2.realmGet$raisePet());
        osObjectBuilder.F0(aVar.f18310g, suppressedModals2.realmGet$hatchPet());
        osObjectBuilder.F0(aVar.f18311h, suppressedModals2.realmGet$levelUp());
        osObjectBuilder.f1((io.realm.internal.o) suppressedModals);
        return suppressedModals;
    }

    public static void n(o0 o0Var, SuppressedModals suppressedModals, SuppressedModals suppressedModals2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(SuppressedModals.class), suppressedModals2, suppressedModals, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18307q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18306p = (a) cVar.c();
        l0<SuppressedModals> l0Var = new l0<>(this);
        this.f18307q = l0Var;
        l0Var.r(cVar.e());
        this.f18307q.s(cVar.f());
        this.f18307q.o(cVar.b());
        this.f18307q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18307q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        u7 u7Var = (u7) obj;
        io.realm.a f10 = this.f18307q.f();
        io.realm.a f11 = u7Var.f18307q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18307q.g().getTable().p();
        String p11 = u7Var.f18307q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18307q.g().getObjectKey() == u7Var.f18307q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18307q.f().getPath();
        String p10 = this.f18307q.g().getTable().p();
        long objectKey = this.f18307q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.user.SuppressedModals, io.realm.v7
    public Boolean realmGet$hatchPet() {
        this.f18307q.f().e();
        if (this.f18307q.g().isNull(this.f18306p.f18310g)) {
            return null;
        }
        return Boolean.valueOf(this.f18307q.g().getBoolean(this.f18306p.f18310g));
    }

    @Override // com.habitrpg.android.habitica.models.user.SuppressedModals, io.realm.v7
    public Boolean realmGet$levelUp() {
        this.f18307q.f().e();
        if (this.f18307q.g().isNull(this.f18306p.f18311h)) {
            return null;
        }
        return Boolean.valueOf(this.f18307q.g().getBoolean(this.f18306p.f18311h));
    }

    @Override // com.habitrpg.android.habitica.models.user.SuppressedModals, io.realm.v7
    public Boolean realmGet$raisePet() {
        this.f18307q.f().e();
        if (this.f18307q.g().isNull(this.f18306p.f18309f)) {
            return null;
        }
        return Boolean.valueOf(this.f18307q.g().getBoolean(this.f18306p.f18309f));
    }

    @Override // com.habitrpg.android.habitica.models.user.SuppressedModals, io.realm.v7
    public Boolean realmGet$streak() {
        this.f18307q.f().e();
        if (this.f18307q.g().isNull(this.f18306p.f18308e)) {
            return null;
        }
        return Boolean.valueOf(this.f18307q.g().getBoolean(this.f18306p.f18308e));
    }

    @Override // com.habitrpg.android.habitica.models.user.SuppressedModals, io.realm.v7
    public void realmSet$hatchPet(Boolean bool) {
        if (this.f18307q.i()) {
            if (!this.f18307q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18307q.g();
            if (bool == null) {
                g10.getTable().F(this.f18306p.f18310g, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().z(this.f18306p.f18310g, g10.getObjectKey(), bool.booleanValue(), true);
                return;
            }
        }
        this.f18307q.f().e();
        if (bool == null) {
            this.f18307q.g().setNull(this.f18306p.f18310g);
        } else {
            this.f18307q.g().setBoolean(this.f18306p.f18310g, bool.booleanValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.SuppressedModals, io.realm.v7
    public void realmSet$levelUp(Boolean bool) {
        if (this.f18307q.i()) {
            if (!this.f18307q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18307q.g();
            if (bool == null) {
                g10.getTable().F(this.f18306p.f18311h, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().z(this.f18306p.f18311h, g10.getObjectKey(), bool.booleanValue(), true);
                return;
            }
        }
        this.f18307q.f().e();
        if (bool == null) {
            this.f18307q.g().setNull(this.f18306p.f18311h);
        } else {
            this.f18307q.g().setBoolean(this.f18306p.f18311h, bool.booleanValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.SuppressedModals, io.realm.v7
    public void realmSet$raisePet(Boolean bool) {
        if (this.f18307q.i()) {
            if (!this.f18307q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18307q.g();
            if (bool == null) {
                g10.getTable().F(this.f18306p.f18309f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().z(this.f18306p.f18309f, g10.getObjectKey(), bool.booleanValue(), true);
                return;
            }
        }
        this.f18307q.f().e();
        if (bool == null) {
            this.f18307q.g().setNull(this.f18306p.f18309f);
        } else {
            this.f18307q.g().setBoolean(this.f18306p.f18309f, bool.booleanValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.SuppressedModals, io.realm.v7
    public void realmSet$streak(Boolean bool) {
        if (this.f18307q.i()) {
            if (!this.f18307q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18307q.g();
            if (bool == null) {
                g10.getTable().F(this.f18306p.f18308e, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().z(this.f18306p.f18308e, g10.getObjectKey(), bool.booleanValue(), true);
                return;
            }
        }
        this.f18307q.f().e();
        if (bool == null) {
            this.f18307q.g().setNull(this.f18306p.f18308e);
        } else {
            this.f18307q.g().setBoolean(this.f18306p.f18308e, bool.booleanValue());
        }
    }

    public String toString() {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("SuppressedModals = proxy[");
        sb2.append("{streak:");
        Object obj = "null";
        if (realmGet$streak() == null) {
            bool = "null";
        } else {
            bool = realmGet$streak();
        }
        sb2.append(bool);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{raisePet:");
        if (realmGet$raisePet() == null) {
            bool2 = "null";
        } else {
            bool2 = realmGet$raisePet();
        }
        sb2.append(bool2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{hatchPet:");
        if (realmGet$hatchPet() == null) {
            bool3 = "null";
        } else {
            bool3 = realmGet$hatchPet();
        }
        sb2.append(bool3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{levelUp:");
        if (realmGet$levelUp() != null) {
            obj = realmGet$levelUp();
        }
        sb2.append(obj);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
