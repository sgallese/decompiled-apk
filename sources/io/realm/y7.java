package io.realm;

import com.habitrpg.android.habitica.models.user.UserAchievement;
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

/* compiled from: com_habitrpg_android_habitica_models_user_UserAchievementRealmProxy.java */
/* loaded from: classes4.dex */
public class y7 extends UserAchievement implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18464r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18465p;

    /* renamed from: q  reason: collision with root package name */
    private l0<UserAchievement> f18466q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_user_UserAchievementRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18467e;

        /* renamed from: f  reason: collision with root package name */
        long f18468f;

        a(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("UserAchievement");
            this.f18467e = a("key", "key", b10);
            this.f18468f = a("earned", "earned", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18467e = aVar.f18467e;
            aVar2.f18468f = aVar.f18468f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y7() {
        this.f18466q.p();
    }

    public static UserAchievement c(o0 o0Var, a aVar, UserAchievement userAchievement, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(userAchievement);
        if (oVar != null) {
            return (UserAchievement) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(UserAchievement.class), set);
        osObjectBuilder.c1(aVar.f18467e, userAchievement.realmGet$key());
        osObjectBuilder.F0(aVar.f18468f, Boolean.valueOf(userAchievement.realmGet$earned()));
        y7 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(userAchievement, k10);
        return k10;
    }

    public static UserAchievement d(o0 o0Var, a aVar, UserAchievement userAchievement, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((userAchievement instanceof io.realm.internal.o) && !d1.isFrozen(userAchievement)) {
            io.realm.internal.o oVar = (io.realm.internal.o) userAchievement;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return userAchievement;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(userAchievement);
        if (oVar2 != null) {
            return (UserAchievement) oVar2;
        }
        return c(o0Var, aVar, userAchievement, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static UserAchievement f(UserAchievement userAchievement, int i10, int i11, Map<a1, o.a<a1>> map) {
        UserAchievement userAchievement2;
        if (i10 <= i11 && userAchievement != null) {
            o.a<a1> aVar = map.get(userAchievement);
            if (aVar == null) {
                userAchievement2 = new UserAchievement();
                map.put(userAchievement, new o.a<>(i10, userAchievement2));
            } else if (i10 >= aVar.f17831a) {
                return (UserAchievement) aVar.f17832b;
            } else {
                UserAchievement userAchievement3 = (UserAchievement) aVar.f17832b;
                aVar.f17831a = i10;
                userAchievement2 = userAchievement3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) userAchievement).b().f();
            userAchievement2.realmSet$key(userAchievement.realmGet$key());
            userAchievement2.realmSet$earned(userAchievement.realmGet$earned());
            return userAchievement2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "UserAchievement", true, 2, 0);
        bVar.b("", "key", RealmFieldType.STRING, false, false, false);
        bVar.b("", "earned", RealmFieldType.BOOLEAN, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18464r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, UserAchievement userAchievement, Map<a1, Long> map) {
        if ((userAchievement instanceof io.realm.internal.o) && !d1.isFrozen(userAchievement)) {
            io.realm.internal.o oVar = (io.realm.internal.o) userAchievement;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        long nativePtr = o0Var.c1(UserAchievement.class).getNativePtr();
        a aVar = (a) o0Var.R().e(UserAchievement.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(userAchievement, Long.valueOf(createEmbeddedObject));
        String realmGet$key = userAchievement.realmGet$key();
        if (realmGet$key != null) {
            Table.nativeSetString(nativePtr, aVar.f18467e, createEmbeddedObject, realmGet$key, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18467e, createEmbeddedObject, false);
        }
        Table.nativeSetBoolean(nativePtr, aVar.f18468f, createEmbeddedObject, userAchievement.realmGet$earned(), false);
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y7 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(UserAchievement.class), false, Collections.emptyList());
        y7 y7Var = new y7();
        cVar.a();
        return y7Var;
    }

    static UserAchievement l(o0 o0Var, a aVar, UserAchievement userAchievement, UserAchievement userAchievement2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(UserAchievement.class), set);
        osObjectBuilder.c1(aVar.f18467e, userAchievement2.realmGet$key());
        osObjectBuilder.F0(aVar.f18468f, Boolean.valueOf(userAchievement2.realmGet$earned()));
        osObjectBuilder.f1((io.realm.internal.o) userAchievement);
        return userAchievement;
    }

    public static void n(o0 o0Var, UserAchievement userAchievement, UserAchievement userAchievement2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(UserAchievement.class), userAchievement2, userAchievement, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18466q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18465p = (a) cVar.c();
        l0<UserAchievement> l0Var = new l0<>(this);
        this.f18466q = l0Var;
        l0Var.r(cVar.e());
        this.f18466q.s(cVar.f());
        this.f18466q.o(cVar.b());
        this.f18466q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18466q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        y7 y7Var = (y7) obj;
        io.realm.a f10 = this.f18466q.f();
        io.realm.a f11 = y7Var.f18466q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18466q.g().getTable().p();
        String p11 = y7Var.f18466q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18466q.g().getObjectKey() == y7Var.f18466q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18466q.f().getPath();
        String p10 = this.f18466q.g().getTable().p();
        long objectKey = this.f18466q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.user.UserAchievement, io.realm.z7
    public boolean realmGet$earned() {
        this.f18466q.f().e();
        return this.f18466q.g().getBoolean(this.f18465p.f18468f);
    }

    @Override // com.habitrpg.android.habitica.models.user.UserAchievement, io.realm.z7
    public String realmGet$key() {
        this.f18466q.f().e();
        return this.f18466q.g().getString(this.f18465p.f18467e);
    }

    @Override // com.habitrpg.android.habitica.models.user.UserAchievement, io.realm.z7
    public void realmSet$earned(boolean z10) {
        if (this.f18466q.i()) {
            if (!this.f18466q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18466q.g();
            g10.getTable().z(this.f18465p.f18468f, g10.getObjectKey(), z10, true);
            return;
        }
        this.f18466q.f().e();
        this.f18466q.g().setBoolean(this.f18465p.f18468f, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.UserAchievement, io.realm.z7
    public void realmSet$key(String str) {
        if (this.f18466q.i()) {
            if (!this.f18466q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18466q.g();
            if (str == null) {
                g10.getTable().F(this.f18465p.f18467e, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18465p.f18467e, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18466q.f().e();
        if (str == null) {
            this.f18466q.g().setNull(this.f18465p.f18467e);
        } else {
            this.f18466q.g().setString(this.f18465p.f18467e, str);
        }
    }

    public String toString() {
        String str;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("UserAchievement = proxy[");
        sb2.append("{key:");
        if (realmGet$key() != null) {
            str = realmGet$key();
        } else {
            str = "null";
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{earned:");
        sb2.append(realmGet$earned());
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
