package io.realm;

import com.habitrpg.android.habitica.models.user.AdditionalSubscriptionInfo;
import com.habitrpg.android.habitica.models.user.GoogleSubscriptionData;
import io.realm.a;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_user_AdditionalSubscriptionInfoRealmProxy.java */
/* loaded from: classes4.dex */
public class u5 extends AdditionalSubscriptionInfo implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18290r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18291p;

    /* renamed from: q  reason: collision with root package name */
    private l0<AdditionalSubscriptionInfo> f18292q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_user_AdditionalSubscriptionInfoRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18293e;

        a(OsSchemaInfo osSchemaInfo) {
            super(1);
            this.f18293e = a("data", "data", osSchemaInfo.b("AdditionalSubscriptionInfo"));
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            ((a) cVar2).f18293e = ((a) cVar).f18293e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u5() {
        this.f18292q.p();
    }

    public static AdditionalSubscriptionInfo c(o0 o0Var, a aVar, AdditionalSubscriptionInfo additionalSubscriptionInfo, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(additionalSubscriptionInfo);
        if (oVar != null) {
            return (AdditionalSubscriptionInfo) oVar;
        }
        u5 k10 = k(o0Var, new OsObjectBuilder(o0Var.c1(AdditionalSubscriptionInfo.class), set).e1());
        map.put(additionalSubscriptionInfo, k10);
        GoogleSubscriptionData realmGet$data = additionalSubscriptionInfo.realmGet$data();
        if (realmGet$data == null) {
            k10.realmSet$data(null);
        } else if (((GoogleSubscriptionData) map.get(realmGet$data)) == null) {
            m6 k11 = m6.k(o0Var, o0Var.c1(GoogleSubscriptionData.class).s(k10.b().g().createEmbeddedObject(aVar.f18293e, RealmFieldType.OBJECT)));
            map.put(realmGet$data, k11);
            m6.n(o0Var, realmGet$data, k11, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachedata.toString()");
        }
        return k10;
    }

    public static AdditionalSubscriptionInfo d(o0 o0Var, a aVar, AdditionalSubscriptionInfo additionalSubscriptionInfo, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((additionalSubscriptionInfo instanceof io.realm.internal.o) && !d1.isFrozen(additionalSubscriptionInfo)) {
            io.realm.internal.o oVar = (io.realm.internal.o) additionalSubscriptionInfo;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return additionalSubscriptionInfo;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(additionalSubscriptionInfo);
        if (oVar2 != null) {
            return (AdditionalSubscriptionInfo) oVar2;
        }
        return c(o0Var, aVar, additionalSubscriptionInfo, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static AdditionalSubscriptionInfo f(AdditionalSubscriptionInfo additionalSubscriptionInfo, int i10, int i11, Map<a1, o.a<a1>> map) {
        AdditionalSubscriptionInfo additionalSubscriptionInfo2;
        if (i10 <= i11 && additionalSubscriptionInfo != null) {
            o.a<a1> aVar = map.get(additionalSubscriptionInfo);
            if (aVar == null) {
                additionalSubscriptionInfo2 = new AdditionalSubscriptionInfo();
                map.put(additionalSubscriptionInfo, new o.a<>(i10, additionalSubscriptionInfo2));
            } else if (i10 >= aVar.f17831a) {
                return (AdditionalSubscriptionInfo) aVar.f17832b;
            } else {
                AdditionalSubscriptionInfo additionalSubscriptionInfo3 = (AdditionalSubscriptionInfo) aVar.f17832b;
                aVar.f17831a = i10;
                additionalSubscriptionInfo2 = additionalSubscriptionInfo3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) additionalSubscriptionInfo).b().f();
            additionalSubscriptionInfo2.realmSet$data(m6.f(additionalSubscriptionInfo.realmGet$data(), i10 + 1, i11, map));
            return additionalSubscriptionInfo2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "AdditionalSubscriptionInfo", true, 1, 0);
        bVar.a("", "data", RealmFieldType.OBJECT, "GoogleSubscriptionData");
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18290r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, AdditionalSubscriptionInfo additionalSubscriptionInfo, Map<a1, Long> map) {
        if ((additionalSubscriptionInfo instanceof io.realm.internal.o) && !d1.isFrozen(additionalSubscriptionInfo)) {
            io.realm.internal.o oVar = (io.realm.internal.o) additionalSubscriptionInfo;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(AdditionalSubscriptionInfo.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(AdditionalSubscriptionInfo.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(additionalSubscriptionInfo, Long.valueOf(createEmbeddedObject));
        GoogleSubscriptionData realmGet$data = additionalSubscriptionInfo.realmGet$data();
        if (realmGet$data != null) {
            Long l10 = map.get(realmGet$data);
            if (l10 == null) {
                m6.i(o0Var, c12, aVar.f18293e, createEmbeddedObject, realmGet$data, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l10.toString());
            }
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.f18293e, createEmbeddedObject);
        }
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u5 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(AdditionalSubscriptionInfo.class), false, Collections.emptyList());
        u5 u5Var = new u5();
        cVar.a();
        return u5Var;
    }

    static AdditionalSubscriptionInfo l(o0 o0Var, a aVar, AdditionalSubscriptionInfo additionalSubscriptionInfo, AdditionalSubscriptionInfo additionalSubscriptionInfo2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(AdditionalSubscriptionInfo.class), set);
        GoogleSubscriptionData realmGet$data = additionalSubscriptionInfo2.realmGet$data();
        if (realmGet$data == null) {
            osObjectBuilder.Z0(aVar.f18293e);
        } else if (((GoogleSubscriptionData) map.get(realmGet$data)) == null) {
            m6 k10 = m6.k(o0Var, o0Var.c1(GoogleSubscriptionData.class).s(((io.realm.internal.o) additionalSubscriptionInfo).b().g().createEmbeddedObject(aVar.f18293e, RealmFieldType.OBJECT)));
            map.put(realmGet$data, k10);
            m6.n(o0Var, realmGet$data, k10, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachedata.toString()");
        }
        osObjectBuilder.f1((io.realm.internal.o) additionalSubscriptionInfo);
        return additionalSubscriptionInfo;
    }

    public static void n(o0 o0Var, AdditionalSubscriptionInfo additionalSubscriptionInfo, AdditionalSubscriptionInfo additionalSubscriptionInfo2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(AdditionalSubscriptionInfo.class), additionalSubscriptionInfo2, additionalSubscriptionInfo, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18292q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18291p = (a) cVar.c();
        l0<AdditionalSubscriptionInfo> l0Var = new l0<>(this);
        this.f18292q = l0Var;
        l0Var.r(cVar.e());
        this.f18292q.s(cVar.f());
        this.f18292q.o(cVar.b());
        this.f18292q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18292q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        u5 u5Var = (u5) obj;
        io.realm.a f10 = this.f18292q.f();
        io.realm.a f11 = u5Var.f18292q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18292q.g().getTable().p();
        String p11 = u5Var.f18292q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18292q.g().getObjectKey() == u5Var.f18292q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18292q.f().getPath();
        String p10 = this.f18292q.g().getTable().p();
        long objectKey = this.f18292q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.user.AdditionalSubscriptionInfo, io.realm.v5
    public GoogleSubscriptionData realmGet$data() {
        this.f18292q.f().e();
        if (this.f18292q.g().isNullLink(this.f18291p.f18293e)) {
            return null;
        }
        return (GoogleSubscriptionData) this.f18292q.f().B(GoogleSubscriptionData.class, this.f18292q.g().getLink(this.f18291p.f18293e), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.user.AdditionalSubscriptionInfo, io.realm.v5
    public void realmSet$data(GoogleSubscriptionData googleSubscriptionData) {
        o0 o0Var = (o0) this.f18292q.f();
        if (this.f18292q.i()) {
            if (!this.f18292q.d() || this.f18292q.e().contains("data")) {
                return;
            }
            if (googleSubscriptionData != null && !d1.isManaged(googleSubscriptionData)) {
                GoogleSubscriptionData googleSubscriptionData2 = (GoogleSubscriptionData) o0Var.J0(GoogleSubscriptionData.class, this, "data");
                m6.n(o0Var, googleSubscriptionData, googleSubscriptionData2, new HashMap(), Collections.EMPTY_SET);
                googleSubscriptionData = googleSubscriptionData2;
            }
            io.realm.internal.q g10 = this.f18292q.g();
            if (googleSubscriptionData == null) {
                g10.nullifyLink(this.f18291p.f18293e);
                return;
            }
            this.f18292q.c(googleSubscriptionData);
            g10.getTable().D(this.f18291p.f18293e, g10.getObjectKey(), ((io.realm.internal.o) googleSubscriptionData).b().g().getObjectKey(), true);
            return;
        }
        this.f18292q.f().e();
        if (googleSubscriptionData == null) {
            this.f18292q.g().nullifyLink(this.f18291p.f18293e);
            return;
        }
        if (d1.isManaged(googleSubscriptionData)) {
            this.f18292q.c(googleSubscriptionData);
        }
        m6.n(o0Var, googleSubscriptionData, (GoogleSubscriptionData) o0Var.J0(GoogleSubscriptionData.class, this, "data"), new HashMap(), Collections.EMPTY_SET);
    }

    public String toString() {
        String str;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("AdditionalSubscriptionInfo = proxy[");
        sb2.append("{data:");
        if (realmGet$data() != null) {
            str = "GoogleSubscriptionData";
        } else {
            str = "null";
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
