package io.realm;

import com.habitrpg.android.habitica.models.user.GoogleSubscriptionData;
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

/* compiled from: com_habitrpg_android_habitica_models_user_GoogleSubscriptionDataRealmProxy.java */
/* loaded from: classes4.dex */
public class m6 extends GoogleSubscriptionData implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17974r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17975p;

    /* renamed from: q  reason: collision with root package name */
    private l0<GoogleSubscriptionData> f17976q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_user_GoogleSubscriptionDataRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17977e;

        /* renamed from: f  reason: collision with root package name */
        long f17978f;

        a(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("GoogleSubscriptionData");
            this.f17977e = a("orderId", "orderId", b10);
            this.f17978f = a("productId", "productId", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17977e = aVar.f17977e;
            aVar2.f17978f = aVar.f17978f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m6() {
        this.f17976q.p();
    }

    public static GoogleSubscriptionData c(o0 o0Var, a aVar, GoogleSubscriptionData googleSubscriptionData, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(googleSubscriptionData);
        if (oVar != null) {
            return (GoogleSubscriptionData) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(GoogleSubscriptionData.class), set);
        osObjectBuilder.c1(aVar.f17977e, googleSubscriptionData.realmGet$orderId());
        osObjectBuilder.c1(aVar.f17978f, googleSubscriptionData.realmGet$productId());
        m6 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(googleSubscriptionData, k10);
        return k10;
    }

    public static GoogleSubscriptionData d(o0 o0Var, a aVar, GoogleSubscriptionData googleSubscriptionData, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((googleSubscriptionData instanceof io.realm.internal.o) && !d1.isFrozen(googleSubscriptionData)) {
            io.realm.internal.o oVar = (io.realm.internal.o) googleSubscriptionData;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return googleSubscriptionData;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(googleSubscriptionData);
        if (oVar2 != null) {
            return (GoogleSubscriptionData) oVar2;
        }
        return c(o0Var, aVar, googleSubscriptionData, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static GoogleSubscriptionData f(GoogleSubscriptionData googleSubscriptionData, int i10, int i11, Map<a1, o.a<a1>> map) {
        GoogleSubscriptionData googleSubscriptionData2;
        if (i10 <= i11 && googleSubscriptionData != null) {
            o.a<a1> aVar = map.get(googleSubscriptionData);
            if (aVar == null) {
                googleSubscriptionData2 = new GoogleSubscriptionData();
                map.put(googleSubscriptionData, new o.a<>(i10, googleSubscriptionData2));
            } else if (i10 >= aVar.f17831a) {
                return (GoogleSubscriptionData) aVar.f17832b;
            } else {
                GoogleSubscriptionData googleSubscriptionData3 = (GoogleSubscriptionData) aVar.f17832b;
                aVar.f17831a = i10;
                googleSubscriptionData2 = googleSubscriptionData3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) googleSubscriptionData).b().f();
            googleSubscriptionData2.realmSet$orderId(googleSubscriptionData.realmGet$orderId());
            googleSubscriptionData2.realmSet$productId(googleSubscriptionData.realmGet$productId());
            return googleSubscriptionData2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "GoogleSubscriptionData", true, 2, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "orderId", realmFieldType, false, false, false);
        bVar.b("", "productId", realmFieldType, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17974r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, GoogleSubscriptionData googleSubscriptionData, Map<a1, Long> map) {
        if ((googleSubscriptionData instanceof io.realm.internal.o) && !d1.isFrozen(googleSubscriptionData)) {
            io.realm.internal.o oVar = (io.realm.internal.o) googleSubscriptionData;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        long nativePtr = o0Var.c1(GoogleSubscriptionData.class).getNativePtr();
        a aVar = (a) o0Var.R().e(GoogleSubscriptionData.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(googleSubscriptionData, Long.valueOf(createEmbeddedObject));
        String realmGet$orderId = googleSubscriptionData.realmGet$orderId();
        if (realmGet$orderId != null) {
            Table.nativeSetString(nativePtr, aVar.f17977e, createEmbeddedObject, realmGet$orderId, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17977e, createEmbeddedObject, false);
        }
        String realmGet$productId = googleSubscriptionData.realmGet$productId();
        if (realmGet$productId != null) {
            Table.nativeSetString(nativePtr, aVar.f17978f, createEmbeddedObject, realmGet$productId, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17978f, createEmbeddedObject, false);
        }
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m6 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(GoogleSubscriptionData.class), false, Collections.emptyList());
        m6 m6Var = new m6();
        cVar.a();
        return m6Var;
    }

    static GoogleSubscriptionData l(o0 o0Var, a aVar, GoogleSubscriptionData googleSubscriptionData, GoogleSubscriptionData googleSubscriptionData2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(GoogleSubscriptionData.class), set);
        osObjectBuilder.c1(aVar.f17977e, googleSubscriptionData2.realmGet$orderId());
        osObjectBuilder.c1(aVar.f17978f, googleSubscriptionData2.realmGet$productId());
        osObjectBuilder.f1((io.realm.internal.o) googleSubscriptionData);
        return googleSubscriptionData;
    }

    public static void n(o0 o0Var, GoogleSubscriptionData googleSubscriptionData, GoogleSubscriptionData googleSubscriptionData2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(GoogleSubscriptionData.class), googleSubscriptionData2, googleSubscriptionData, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17976q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17975p = (a) cVar.c();
        l0<GoogleSubscriptionData> l0Var = new l0<>(this);
        this.f17976q = l0Var;
        l0Var.r(cVar.e());
        this.f17976q.s(cVar.f());
        this.f17976q.o(cVar.b());
        this.f17976q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17976q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        m6 m6Var = (m6) obj;
        io.realm.a f10 = this.f17976q.f();
        io.realm.a f11 = m6Var.f17976q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17976q.g().getTable().p();
        String p11 = m6Var.f17976q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17976q.g().getObjectKey() == m6Var.f17976q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17976q.f().getPath();
        String p10 = this.f17976q.g().getTable().p();
        long objectKey = this.f17976q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.user.GoogleSubscriptionData, io.realm.n6
    public String realmGet$orderId() {
        this.f17976q.f().e();
        return this.f17976q.g().getString(this.f17975p.f17977e);
    }

    @Override // com.habitrpg.android.habitica.models.user.GoogleSubscriptionData, io.realm.n6
    public String realmGet$productId() {
        this.f17976q.f().e();
        return this.f17976q.g().getString(this.f17975p.f17978f);
    }

    @Override // com.habitrpg.android.habitica.models.user.GoogleSubscriptionData, io.realm.n6
    public void realmSet$orderId(String str) {
        if (this.f17976q.i()) {
            if (!this.f17976q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17976q.g();
            if (str == null) {
                g10.getTable().F(this.f17975p.f17977e, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17975p.f17977e, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17976q.f().e();
        if (str == null) {
            this.f17976q.g().setNull(this.f17975p.f17977e);
        } else {
            this.f17976q.g().setString(this.f17975p.f17977e, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.GoogleSubscriptionData, io.realm.n6
    public void realmSet$productId(String str) {
        if (this.f17976q.i()) {
            if (!this.f17976q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17976q.g();
            if (str == null) {
                g10.getTable().F(this.f17975p.f17978f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17975p.f17978f, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17976q.f().e();
        if (str == null) {
            this.f17976q.g().setNull(this.f17975p.f17978f);
        } else {
            this.f17976q.g().setString(this.f17975p.f17978f, str);
        }
    }

    public String toString() {
        String str;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("GoogleSubscriptionData = proxy[");
        sb2.append("{orderId:");
        String str2 = "null";
        if (realmGet$orderId() == null) {
            str = "null";
        } else {
            str = realmGet$orderId();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{productId:");
        if (realmGet$productId() != null) {
            str2 = realmGet$productId();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
