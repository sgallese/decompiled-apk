package io.realm;

import com.habitrpg.android.habitica.models.user.AuthenticationTimestamps;
import io.realm.a;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_user_AuthenticationTimestampsRealmProxy.java */
/* loaded from: classes4.dex */
public class y5 extends AuthenticationTimestamps implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18452r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18453p;

    /* renamed from: q  reason: collision with root package name */
    private l0<AuthenticationTimestamps> f18454q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_user_AuthenticationTimestampsRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18455e;

        /* renamed from: f  reason: collision with root package name */
        long f18456f;

        a(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("AuthenticationTimestamps");
            this.f18455e = a("lastLoggedIn", "lastLoggedIn", b10);
            this.f18456f = a("createdAt", "createdAt", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18455e = aVar.f18455e;
            aVar2.f18456f = aVar.f18456f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y5() {
        this.f18454q.p();
    }

    public static AuthenticationTimestamps c(o0 o0Var, a aVar, AuthenticationTimestamps authenticationTimestamps, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(authenticationTimestamps);
        if (oVar != null) {
            return (AuthenticationTimestamps) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(AuthenticationTimestamps.class), set);
        osObjectBuilder.I0(aVar.f18455e, authenticationTimestamps.realmGet$lastLoggedIn());
        osObjectBuilder.I0(aVar.f18456f, authenticationTimestamps.realmGet$createdAt());
        y5 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(authenticationTimestamps, k10);
        return k10;
    }

    public static AuthenticationTimestamps d(o0 o0Var, a aVar, AuthenticationTimestamps authenticationTimestamps, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((authenticationTimestamps instanceof io.realm.internal.o) && !d1.isFrozen(authenticationTimestamps)) {
            io.realm.internal.o oVar = (io.realm.internal.o) authenticationTimestamps;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return authenticationTimestamps;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(authenticationTimestamps);
        if (oVar2 != null) {
            return (AuthenticationTimestamps) oVar2;
        }
        return c(o0Var, aVar, authenticationTimestamps, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static AuthenticationTimestamps f(AuthenticationTimestamps authenticationTimestamps, int i10, int i11, Map<a1, o.a<a1>> map) {
        AuthenticationTimestamps authenticationTimestamps2;
        if (i10 <= i11 && authenticationTimestamps != null) {
            o.a<a1> aVar = map.get(authenticationTimestamps);
            if (aVar == null) {
                authenticationTimestamps2 = new AuthenticationTimestamps();
                map.put(authenticationTimestamps, new o.a<>(i10, authenticationTimestamps2));
            } else if (i10 >= aVar.f17831a) {
                return (AuthenticationTimestamps) aVar.f17832b;
            } else {
                AuthenticationTimestamps authenticationTimestamps3 = (AuthenticationTimestamps) aVar.f17832b;
                aVar.f17831a = i10;
                authenticationTimestamps2 = authenticationTimestamps3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) authenticationTimestamps).b().f();
            authenticationTimestamps2.realmSet$lastLoggedIn(authenticationTimestamps.realmGet$lastLoggedIn());
            authenticationTimestamps2.realmSet$createdAt(authenticationTimestamps.realmGet$createdAt());
            return authenticationTimestamps2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "AuthenticationTimestamps", true, 2, 0);
        RealmFieldType realmFieldType = RealmFieldType.DATE;
        bVar.b("", "lastLoggedIn", realmFieldType, false, false, false);
        bVar.b("", "createdAt", realmFieldType, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18452r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, AuthenticationTimestamps authenticationTimestamps, Map<a1, Long> map) {
        if ((authenticationTimestamps instanceof io.realm.internal.o) && !d1.isFrozen(authenticationTimestamps)) {
            io.realm.internal.o oVar = (io.realm.internal.o) authenticationTimestamps;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        long nativePtr = o0Var.c1(AuthenticationTimestamps.class).getNativePtr();
        a aVar = (a) o0Var.R().e(AuthenticationTimestamps.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(authenticationTimestamps, Long.valueOf(createEmbeddedObject));
        Date realmGet$lastLoggedIn = authenticationTimestamps.realmGet$lastLoggedIn();
        if (realmGet$lastLoggedIn != null) {
            Table.nativeSetTimestamp(nativePtr, aVar.f18455e, createEmbeddedObject, realmGet$lastLoggedIn.getTime(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18455e, createEmbeddedObject, false);
        }
        Date realmGet$createdAt = authenticationTimestamps.realmGet$createdAt();
        if (realmGet$createdAt != null) {
            Table.nativeSetTimestamp(nativePtr, aVar.f18456f, createEmbeddedObject, realmGet$createdAt.getTime(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18456f, createEmbeddedObject, false);
        }
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y5 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(AuthenticationTimestamps.class), false, Collections.emptyList());
        y5 y5Var = new y5();
        cVar.a();
        return y5Var;
    }

    static AuthenticationTimestamps l(o0 o0Var, a aVar, AuthenticationTimestamps authenticationTimestamps, AuthenticationTimestamps authenticationTimestamps2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(AuthenticationTimestamps.class), set);
        osObjectBuilder.I0(aVar.f18455e, authenticationTimestamps2.realmGet$lastLoggedIn());
        osObjectBuilder.I0(aVar.f18456f, authenticationTimestamps2.realmGet$createdAt());
        osObjectBuilder.f1((io.realm.internal.o) authenticationTimestamps);
        return authenticationTimestamps;
    }

    public static void n(o0 o0Var, AuthenticationTimestamps authenticationTimestamps, AuthenticationTimestamps authenticationTimestamps2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(AuthenticationTimestamps.class), authenticationTimestamps2, authenticationTimestamps, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18454q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18453p = (a) cVar.c();
        l0<AuthenticationTimestamps> l0Var = new l0<>(this);
        this.f18454q = l0Var;
        l0Var.r(cVar.e());
        this.f18454q.s(cVar.f());
        this.f18454q.o(cVar.b());
        this.f18454q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18454q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        y5 y5Var = (y5) obj;
        io.realm.a f10 = this.f18454q.f();
        io.realm.a f11 = y5Var.f18454q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18454q.g().getTable().p();
        String p11 = y5Var.f18454q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18454q.g().getObjectKey() == y5Var.f18454q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18454q.f().getPath();
        String p10 = this.f18454q.g().getTable().p();
        long objectKey = this.f18454q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.user.AuthenticationTimestamps, io.realm.z5
    public Date realmGet$createdAt() {
        this.f18454q.f().e();
        if (this.f18454q.g().isNull(this.f18453p.f18456f)) {
            return null;
        }
        return this.f18454q.g().getDate(this.f18453p.f18456f);
    }

    @Override // com.habitrpg.android.habitica.models.user.AuthenticationTimestamps, io.realm.z5
    public Date realmGet$lastLoggedIn() {
        this.f18454q.f().e();
        if (this.f18454q.g().isNull(this.f18453p.f18455e)) {
            return null;
        }
        return this.f18454q.g().getDate(this.f18453p.f18455e);
    }

    @Override // com.habitrpg.android.habitica.models.user.AuthenticationTimestamps, io.realm.z5
    public void realmSet$createdAt(Date date) {
        if (this.f18454q.i()) {
            if (!this.f18454q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18454q.g();
            if (date == null) {
                g10.getTable().F(this.f18453p.f18456f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().A(this.f18453p.f18456f, g10.getObjectKey(), date, true);
                return;
            }
        }
        this.f18454q.f().e();
        if (date == null) {
            this.f18454q.g().setNull(this.f18453p.f18456f);
        } else {
            this.f18454q.g().setDate(this.f18453p.f18456f, date);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.AuthenticationTimestamps, io.realm.z5
    public void realmSet$lastLoggedIn(Date date) {
        if (this.f18454q.i()) {
            if (!this.f18454q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18454q.g();
            if (date == null) {
                g10.getTable().F(this.f18453p.f18455e, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().A(this.f18453p.f18455e, g10.getObjectKey(), date, true);
                return;
            }
        }
        this.f18454q.f().e();
        if (date == null) {
            this.f18454q.g().setNull(this.f18453p.f18455e);
        } else {
            this.f18454q.g().setDate(this.f18453p.f18455e, date);
        }
    }

    public String toString() {
        Date date;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("AuthenticationTimestamps = proxy[");
        sb2.append("{lastLoggedIn:");
        Object obj = "null";
        if (realmGet$lastLoggedIn() == null) {
            date = "null";
        } else {
            date = realmGet$lastLoggedIn();
        }
        sb2.append(date);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{createdAt:");
        if (realmGet$createdAt() != null) {
            obj = realmGet$createdAt();
        }
        sb2.append(obj);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
