package io.realm;

import com.habitrpg.android.habitica.models.user.OwnedCustomization;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
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

/* compiled from: com_habitrpg_android_habitica_models_user_OwnedCustomizationRealmProxy.java */
/* loaded from: classes4.dex */
public class w6 extends OwnedCustomization implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18392r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18393p;

    /* renamed from: q  reason: collision with root package name */
    private l0<OwnedCustomization> f18394q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_user_OwnedCustomizationRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18395e;

        /* renamed from: f  reason: collision with root package name */
        long f18396f;

        /* renamed from: g  reason: collision with root package name */
        long f18397g;

        /* renamed from: h  reason: collision with root package name */
        long f18398h;

        /* renamed from: i  reason: collision with root package name */
        long f18399i;

        a(OsSchemaInfo osSchemaInfo) {
            super(5);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("OwnedCustomization");
            this.f18395e = a("userID", "userID", b10);
            this.f18396f = a("key", "key", b10);
            this.f18397g = a(TaskFormActivity.TASK_TYPE_KEY, TaskFormActivity.TASK_TYPE_KEY, b10);
            this.f18398h = a("category", "category", b10);
            this.f18399i = a("purchased", "purchased", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18395e = aVar.f18395e;
            aVar2.f18396f = aVar.f18396f;
            aVar2.f18397g = aVar.f18397g;
            aVar2.f18398h = aVar.f18398h;
            aVar2.f18399i = aVar.f18399i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w6() {
        this.f18394q.p();
    }

    public static OwnedCustomization c(o0 o0Var, a aVar, OwnedCustomization ownedCustomization, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(ownedCustomization);
        if (oVar != null) {
            return (OwnedCustomization) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(OwnedCustomization.class), set);
        osObjectBuilder.c1(aVar.f18395e, ownedCustomization.realmGet$userID());
        osObjectBuilder.c1(aVar.f18396f, ownedCustomization.realmGet$key());
        osObjectBuilder.c1(aVar.f18397g, ownedCustomization.realmGet$type());
        osObjectBuilder.c1(aVar.f18398h, ownedCustomization.realmGet$category());
        osObjectBuilder.F0(aVar.f18399i, Boolean.valueOf(ownedCustomization.realmGet$purchased()));
        w6 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(ownedCustomization, k10);
        return k10;
    }

    public static OwnedCustomization d(o0 o0Var, a aVar, OwnedCustomization ownedCustomization, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((ownedCustomization instanceof io.realm.internal.o) && !d1.isFrozen(ownedCustomization)) {
            io.realm.internal.o oVar = (io.realm.internal.o) ownedCustomization;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return ownedCustomization;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(ownedCustomization);
        if (oVar2 != null) {
            return (OwnedCustomization) oVar2;
        }
        return c(o0Var, aVar, ownedCustomization, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static OwnedCustomization f(OwnedCustomization ownedCustomization, int i10, int i11, Map<a1, o.a<a1>> map) {
        OwnedCustomization ownedCustomization2;
        if (i10 <= i11 && ownedCustomization != null) {
            o.a<a1> aVar = map.get(ownedCustomization);
            if (aVar == null) {
                ownedCustomization2 = new OwnedCustomization();
                map.put(ownedCustomization, new o.a<>(i10, ownedCustomization2));
            } else if (i10 >= aVar.f17831a) {
                return (OwnedCustomization) aVar.f17832b;
            } else {
                OwnedCustomization ownedCustomization3 = (OwnedCustomization) aVar.f17832b;
                aVar.f17831a = i10;
                ownedCustomization2 = ownedCustomization3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) ownedCustomization).b().f();
            ownedCustomization2.realmSet$userID(ownedCustomization.realmGet$userID());
            ownedCustomization2.realmSet$key(ownedCustomization.realmGet$key());
            ownedCustomization2.realmSet$type(ownedCustomization.realmGet$type());
            ownedCustomization2.realmSet$category(ownedCustomization.realmGet$category());
            ownedCustomization2.realmSet$purchased(ownedCustomization.realmGet$purchased());
            return ownedCustomization2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "OwnedCustomization", true, 5, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "userID", realmFieldType, false, false, false);
        bVar.b("", "key", realmFieldType, false, false, false);
        bVar.b("", TaskFormActivity.TASK_TYPE_KEY, realmFieldType, false, false, false);
        bVar.b("", "category", realmFieldType, false, false, false);
        bVar.b("", "purchased", RealmFieldType.BOOLEAN, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18392r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, OwnedCustomization ownedCustomization, Map<a1, Long> map) {
        if ((ownedCustomization instanceof io.realm.internal.o) && !d1.isFrozen(ownedCustomization)) {
            io.realm.internal.o oVar = (io.realm.internal.o) ownedCustomization;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        long nativePtr = o0Var.c1(OwnedCustomization.class).getNativePtr();
        a aVar = (a) o0Var.R().e(OwnedCustomization.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(ownedCustomization, Long.valueOf(createEmbeddedObject));
        String realmGet$userID = ownedCustomization.realmGet$userID();
        if (realmGet$userID != null) {
            Table.nativeSetString(nativePtr, aVar.f18395e, createEmbeddedObject, realmGet$userID, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18395e, createEmbeddedObject, false);
        }
        String realmGet$key = ownedCustomization.realmGet$key();
        if (realmGet$key != null) {
            Table.nativeSetString(nativePtr, aVar.f18396f, createEmbeddedObject, realmGet$key, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18396f, createEmbeddedObject, false);
        }
        String realmGet$type = ownedCustomization.realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(nativePtr, aVar.f18397g, createEmbeddedObject, realmGet$type, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18397g, createEmbeddedObject, false);
        }
        String realmGet$category = ownedCustomization.realmGet$category();
        if (realmGet$category != null) {
            Table.nativeSetString(nativePtr, aVar.f18398h, createEmbeddedObject, realmGet$category, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18398h, createEmbeddedObject, false);
        }
        Table.nativeSetBoolean(nativePtr, aVar.f18399i, createEmbeddedObject, ownedCustomization.realmGet$purchased(), false);
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w6 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(OwnedCustomization.class), false, Collections.emptyList());
        w6 w6Var = new w6();
        cVar.a();
        return w6Var;
    }

    static OwnedCustomization l(o0 o0Var, a aVar, OwnedCustomization ownedCustomization, OwnedCustomization ownedCustomization2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(OwnedCustomization.class), set);
        osObjectBuilder.c1(aVar.f18395e, ownedCustomization2.realmGet$userID());
        osObjectBuilder.c1(aVar.f18396f, ownedCustomization2.realmGet$key());
        osObjectBuilder.c1(aVar.f18397g, ownedCustomization2.realmGet$type());
        osObjectBuilder.c1(aVar.f18398h, ownedCustomization2.realmGet$category());
        osObjectBuilder.F0(aVar.f18399i, Boolean.valueOf(ownedCustomization2.realmGet$purchased()));
        osObjectBuilder.f1((io.realm.internal.o) ownedCustomization);
        return ownedCustomization;
    }

    public static void n(o0 o0Var, OwnedCustomization ownedCustomization, OwnedCustomization ownedCustomization2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(OwnedCustomization.class), ownedCustomization2, ownedCustomization, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18394q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18393p = (a) cVar.c();
        l0<OwnedCustomization> l0Var = new l0<>(this);
        this.f18394q = l0Var;
        l0Var.r(cVar.e());
        this.f18394q.s(cVar.f());
        this.f18394q.o(cVar.b());
        this.f18394q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18394q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        w6 w6Var = (w6) obj;
        io.realm.a f10 = this.f18394q.f();
        io.realm.a f11 = w6Var.f18394q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18394q.g().getTable().p();
        String p11 = w6Var.f18394q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18394q.g().getObjectKey() == w6Var.f18394q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18394q.f().getPath();
        String p10 = this.f18394q.g().getTable().p();
        long objectKey = this.f18394q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.user.OwnedCustomization, io.realm.x6
    public String realmGet$category() {
        this.f18394q.f().e();
        return this.f18394q.g().getString(this.f18393p.f18398h);
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedCustomization, io.realm.x6
    public String realmGet$key() {
        this.f18394q.f().e();
        return this.f18394q.g().getString(this.f18393p.f18396f);
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedCustomization, io.realm.x6
    public boolean realmGet$purchased() {
        this.f18394q.f().e();
        return this.f18394q.g().getBoolean(this.f18393p.f18399i);
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedCustomization, io.realm.x6
    public String realmGet$type() {
        this.f18394q.f().e();
        return this.f18394q.g().getString(this.f18393p.f18397g);
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedCustomization, io.realm.x6
    public String realmGet$userID() {
        this.f18394q.f().e();
        return this.f18394q.g().getString(this.f18393p.f18395e);
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedCustomization, io.realm.x6
    public void realmSet$category(String str) {
        if (this.f18394q.i()) {
            if (!this.f18394q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18394q.g();
            if (str == null) {
                g10.getTable().F(this.f18393p.f18398h, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18393p.f18398h, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18394q.f().e();
        if (str == null) {
            this.f18394q.g().setNull(this.f18393p.f18398h);
        } else {
            this.f18394q.g().setString(this.f18393p.f18398h, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedCustomization, io.realm.x6
    public void realmSet$key(String str) {
        if (this.f18394q.i()) {
            if (!this.f18394q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18394q.g();
            if (str == null) {
                g10.getTable().F(this.f18393p.f18396f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18393p.f18396f, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18394q.f().e();
        if (str == null) {
            this.f18394q.g().setNull(this.f18393p.f18396f);
        } else {
            this.f18394q.g().setString(this.f18393p.f18396f, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedCustomization, io.realm.x6
    public void realmSet$purchased(boolean z10) {
        if (this.f18394q.i()) {
            if (!this.f18394q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18394q.g();
            g10.getTable().z(this.f18393p.f18399i, g10.getObjectKey(), z10, true);
            return;
        }
        this.f18394q.f().e();
        this.f18394q.g().setBoolean(this.f18393p.f18399i, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedCustomization, io.realm.x6
    public void realmSet$type(String str) {
        if (this.f18394q.i()) {
            if (!this.f18394q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18394q.g();
            if (str == null) {
                g10.getTable().F(this.f18393p.f18397g, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18393p.f18397g, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18394q.f().e();
        if (str == null) {
            this.f18394q.g().setNull(this.f18393p.f18397g);
        } else {
            this.f18394q.g().setString(this.f18393p.f18397g, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedCustomization, io.realm.x6
    public void realmSet$userID(String str) {
        if (this.f18394q.i()) {
            if (!this.f18394q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18394q.g();
            if (str == null) {
                g10.getTable().F(this.f18393p.f18395e, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18393p.f18395e, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18394q.f().e();
        if (str == null) {
            this.f18394q.g().setNull(this.f18393p.f18395e);
        } else {
            this.f18394q.g().setString(this.f18393p.f18395e, str);
        }
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("OwnedCustomization = proxy[");
        sb2.append("{userID:");
        String str4 = "null";
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
        sb2.append("{type:");
        if (realmGet$type() == null) {
            str3 = "null";
        } else {
            str3 = realmGet$type();
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{category:");
        if (realmGet$category() != null) {
            str4 = realmGet$category();
        }
        sb2.append(str4);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{purchased:");
        sb2.append(realmGet$purchased());
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
