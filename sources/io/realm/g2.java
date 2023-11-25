package io.realm;

import com.google.android.gms.common.Scopes;
import com.habitrpg.android.habitica.models.auth.LocalAuthentication;
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

/* compiled from: com_habitrpg_android_habitica_models_auth_LocalAuthenticationRealmProxy.java */
/* loaded from: classes4.dex */
public class g2 extends LocalAuthentication implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17524r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17525p;

    /* renamed from: q  reason: collision with root package name */
    private l0<LocalAuthentication> f17526q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_auth_LocalAuthenticationRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17527e;

        /* renamed from: f  reason: collision with root package name */
        long f17528f;

        /* renamed from: g  reason: collision with root package name */
        long f17529g;

        a(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("LocalAuthentication");
            this.f17527e = a("username", "username", b10);
            this.f17528f = a(Scopes.EMAIL, Scopes.EMAIL, b10);
            this.f17529g = a("hasPassword", "hasPassword", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17527e = aVar.f17527e;
            aVar2.f17528f = aVar.f17528f;
            aVar2.f17529g = aVar.f17529g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g2() {
        this.f17526q.p();
    }

    public static LocalAuthentication c(o0 o0Var, a aVar, LocalAuthentication localAuthentication, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(localAuthentication);
        if (oVar != null) {
            return (LocalAuthentication) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(LocalAuthentication.class), set);
        osObjectBuilder.c1(aVar.f17527e, localAuthentication.realmGet$username());
        osObjectBuilder.c1(aVar.f17528f, localAuthentication.realmGet$email());
        osObjectBuilder.F0(aVar.f17529g, localAuthentication.realmGet$hasPassword());
        g2 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(localAuthentication, k10);
        return k10;
    }

    public static LocalAuthentication d(o0 o0Var, a aVar, LocalAuthentication localAuthentication, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((localAuthentication instanceof io.realm.internal.o) && !d1.isFrozen(localAuthentication)) {
            io.realm.internal.o oVar = (io.realm.internal.o) localAuthentication;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return localAuthentication;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(localAuthentication);
        if (oVar2 != null) {
            return (LocalAuthentication) oVar2;
        }
        return c(o0Var, aVar, localAuthentication, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static LocalAuthentication f(LocalAuthentication localAuthentication, int i10, int i11, Map<a1, o.a<a1>> map) {
        LocalAuthentication localAuthentication2;
        if (i10 <= i11 && localAuthentication != null) {
            o.a<a1> aVar = map.get(localAuthentication);
            if (aVar == null) {
                localAuthentication2 = new LocalAuthentication();
                map.put(localAuthentication, new o.a<>(i10, localAuthentication2));
            } else if (i10 >= aVar.f17831a) {
                return (LocalAuthentication) aVar.f17832b;
            } else {
                LocalAuthentication localAuthentication3 = (LocalAuthentication) aVar.f17832b;
                aVar.f17831a = i10;
                localAuthentication2 = localAuthentication3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) localAuthentication).b().f();
            localAuthentication2.realmSet$username(localAuthentication.realmGet$username());
            localAuthentication2.realmSet$email(localAuthentication.realmGet$email());
            localAuthentication2.realmSet$hasPassword(localAuthentication.realmGet$hasPassword());
            return localAuthentication2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "LocalAuthentication", true, 3, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "username", realmFieldType, false, false, false);
        bVar.b("", Scopes.EMAIL, realmFieldType, false, false, false);
        bVar.b("", "hasPassword", RealmFieldType.BOOLEAN, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17524r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, LocalAuthentication localAuthentication, Map<a1, Long> map) {
        if ((localAuthentication instanceof io.realm.internal.o) && !d1.isFrozen(localAuthentication)) {
            io.realm.internal.o oVar = (io.realm.internal.o) localAuthentication;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        long nativePtr = o0Var.c1(LocalAuthentication.class).getNativePtr();
        a aVar = (a) o0Var.R().e(LocalAuthentication.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(localAuthentication, Long.valueOf(createEmbeddedObject));
        String realmGet$username = localAuthentication.realmGet$username();
        if (realmGet$username != null) {
            Table.nativeSetString(nativePtr, aVar.f17527e, createEmbeddedObject, realmGet$username, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17527e, createEmbeddedObject, false);
        }
        String realmGet$email = localAuthentication.realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(nativePtr, aVar.f17528f, createEmbeddedObject, realmGet$email, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17528f, createEmbeddedObject, false);
        }
        Boolean realmGet$hasPassword = localAuthentication.realmGet$hasPassword();
        if (realmGet$hasPassword != null) {
            Table.nativeSetBoolean(nativePtr, aVar.f17529g, createEmbeddedObject, realmGet$hasPassword.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17529g, createEmbeddedObject, false);
        }
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g2 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(LocalAuthentication.class), false, Collections.emptyList());
        g2 g2Var = new g2();
        cVar.a();
        return g2Var;
    }

    static LocalAuthentication l(o0 o0Var, a aVar, LocalAuthentication localAuthentication, LocalAuthentication localAuthentication2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(LocalAuthentication.class), set);
        osObjectBuilder.c1(aVar.f17527e, localAuthentication2.realmGet$username());
        osObjectBuilder.c1(aVar.f17528f, localAuthentication2.realmGet$email());
        osObjectBuilder.F0(aVar.f17529g, localAuthentication2.realmGet$hasPassword());
        osObjectBuilder.f1((io.realm.internal.o) localAuthentication);
        return localAuthentication;
    }

    public static void n(o0 o0Var, LocalAuthentication localAuthentication, LocalAuthentication localAuthentication2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(LocalAuthentication.class), localAuthentication2, localAuthentication, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17526q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17525p = (a) cVar.c();
        l0<LocalAuthentication> l0Var = new l0<>(this);
        this.f17526q = l0Var;
        l0Var.r(cVar.e());
        this.f17526q.s(cVar.f());
        this.f17526q.o(cVar.b());
        this.f17526q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17526q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g2 g2Var = (g2) obj;
        io.realm.a f10 = this.f17526q.f();
        io.realm.a f11 = g2Var.f17526q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17526q.g().getTable().p();
        String p11 = g2Var.f17526q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17526q.g().getObjectKey() == g2Var.f17526q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17526q.f().getPath();
        String p10 = this.f17526q.g().getTable().p();
        long objectKey = this.f17526q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.auth.LocalAuthentication, io.realm.h2
    public String realmGet$email() {
        this.f17526q.f().e();
        return this.f17526q.g().getString(this.f17525p.f17528f);
    }

    @Override // com.habitrpg.android.habitica.models.auth.LocalAuthentication, io.realm.h2
    public Boolean realmGet$hasPassword() {
        this.f17526q.f().e();
        if (this.f17526q.g().isNull(this.f17525p.f17529g)) {
            return null;
        }
        return Boolean.valueOf(this.f17526q.g().getBoolean(this.f17525p.f17529g));
    }

    @Override // com.habitrpg.android.habitica.models.auth.LocalAuthentication, io.realm.h2
    public String realmGet$username() {
        this.f17526q.f().e();
        return this.f17526q.g().getString(this.f17525p.f17527e);
    }

    @Override // com.habitrpg.android.habitica.models.auth.LocalAuthentication, io.realm.h2
    public void realmSet$email(String str) {
        if (this.f17526q.i()) {
            if (!this.f17526q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17526q.g();
            if (str == null) {
                g10.getTable().F(this.f17525p.f17528f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17525p.f17528f, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17526q.f().e();
        if (str == null) {
            this.f17526q.g().setNull(this.f17525p.f17528f);
        } else {
            this.f17526q.g().setString(this.f17525p.f17528f, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.auth.LocalAuthentication, io.realm.h2
    public void realmSet$hasPassword(Boolean bool) {
        if (this.f17526q.i()) {
            if (!this.f17526q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17526q.g();
            if (bool == null) {
                g10.getTable().F(this.f17525p.f17529g, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().z(this.f17525p.f17529g, g10.getObjectKey(), bool.booleanValue(), true);
                return;
            }
        }
        this.f17526q.f().e();
        if (bool == null) {
            this.f17526q.g().setNull(this.f17525p.f17529g);
        } else {
            this.f17526q.g().setBoolean(this.f17525p.f17529g, bool.booleanValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.auth.LocalAuthentication, io.realm.h2
    public void realmSet$username(String str) {
        if (this.f17526q.i()) {
            if (!this.f17526q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17526q.g();
            if (str == null) {
                g10.getTable().F(this.f17525p.f17527e, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17525p.f17527e, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17526q.f().e();
        if (str == null) {
            this.f17526q.g().setNull(this.f17525p.f17527e);
        } else {
            this.f17526q.g().setString(this.f17525p.f17527e, str);
        }
    }

    public String toString() {
        String str;
        String str2;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("LocalAuthentication = proxy[");
        sb2.append("{username:");
        Object obj = "null";
        if (realmGet$username() == null) {
            str = "null";
        } else {
            str = realmGet$username();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{email:");
        if (realmGet$email() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$email();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{hasPassword:");
        if (realmGet$hasPassword() != null) {
            obj = realmGet$hasPassword();
        }
        sb2.append(obj);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
