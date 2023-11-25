package io.realm;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.models.user.ABTest;
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

/* compiled from: com_habitrpg_android_habitica_models_user_ABTestRealmProxy.java */
/* loaded from: classes4.dex */
public class s5 extends ABTest implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18176r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18177p;

    /* renamed from: q  reason: collision with root package name */
    private l0<ABTest> f18178q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_user_ABTestRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18179e;

        /* renamed from: f  reason: collision with root package name */
        long f18180f;

        a(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("ABTest");
            this.f18179e = a(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, b10);
            this.f18180f = a("group", "group", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18179e = aVar.f18179e;
            aVar2.f18180f = aVar.f18180f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s5() {
        this.f18178q.p();
    }

    public static ABTest c(o0 o0Var, a aVar, ABTest aBTest, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(aBTest);
        if (oVar != null) {
            return (ABTest) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(ABTest.class), set);
        osObjectBuilder.c1(aVar.f18179e, aBTest.realmGet$name());
        osObjectBuilder.c1(aVar.f18180f, aBTest.realmGet$group());
        s5 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(aBTest, k10);
        return k10;
    }

    public static ABTest d(o0 o0Var, a aVar, ABTest aBTest, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((aBTest instanceof io.realm.internal.o) && !d1.isFrozen(aBTest)) {
            io.realm.internal.o oVar = (io.realm.internal.o) aBTest;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return aBTest;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(aBTest);
        if (oVar2 != null) {
            return (ABTest) oVar2;
        }
        return c(o0Var, aVar, aBTest, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static ABTest f(ABTest aBTest, int i10, int i11, Map<a1, o.a<a1>> map) {
        ABTest aBTest2;
        if (i10 <= i11 && aBTest != null) {
            o.a<a1> aVar = map.get(aBTest);
            if (aVar == null) {
                aBTest2 = new ABTest();
                map.put(aBTest, new o.a<>(i10, aBTest2));
            } else if (i10 >= aVar.f17831a) {
                return (ABTest) aVar.f17832b;
            } else {
                ABTest aBTest3 = (ABTest) aVar.f17832b;
                aVar.f17831a = i10;
                aBTest2 = aBTest3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) aBTest).b().f();
            aBTest2.realmSet$name(aBTest.realmGet$name());
            aBTest2.realmSet$group(aBTest.realmGet$group());
            return aBTest2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "ABTest", true, 2, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", AppMeasurementSdk.ConditionalUserProperty.NAME, realmFieldType, false, false, true);
        bVar.b("", "group", realmFieldType, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18176r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, ABTest aBTest, Map<a1, Long> map) {
        if ((aBTest instanceof io.realm.internal.o) && !d1.isFrozen(aBTest)) {
            io.realm.internal.o oVar = (io.realm.internal.o) aBTest;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        long nativePtr = o0Var.c1(ABTest.class).getNativePtr();
        a aVar = (a) o0Var.R().e(ABTest.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(aBTest, Long.valueOf(createEmbeddedObject));
        String realmGet$name = aBTest.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, aVar.f18179e, createEmbeddedObject, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18179e, createEmbeddedObject, false);
        }
        String realmGet$group = aBTest.realmGet$group();
        if (realmGet$group != null) {
            Table.nativeSetString(nativePtr, aVar.f18180f, createEmbeddedObject, realmGet$group, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18180f, createEmbeddedObject, false);
        }
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static s5 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(ABTest.class), false, Collections.emptyList());
        s5 s5Var = new s5();
        cVar.a();
        return s5Var;
    }

    static ABTest l(o0 o0Var, a aVar, ABTest aBTest, ABTest aBTest2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(ABTest.class), set);
        osObjectBuilder.c1(aVar.f18179e, aBTest2.realmGet$name());
        osObjectBuilder.c1(aVar.f18180f, aBTest2.realmGet$group());
        osObjectBuilder.f1((io.realm.internal.o) aBTest);
        return aBTest;
    }

    public static void n(o0 o0Var, ABTest aBTest, ABTest aBTest2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(ABTest.class), aBTest2, aBTest, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18178q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18177p = (a) cVar.c();
        l0<ABTest> l0Var = new l0<>(this);
        this.f18178q = l0Var;
        l0Var.r(cVar.e());
        this.f18178q.s(cVar.f());
        this.f18178q.o(cVar.b());
        this.f18178q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18178q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s5 s5Var = (s5) obj;
        io.realm.a f10 = this.f18178q.f();
        io.realm.a f11 = s5Var.f18178q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18178q.g().getTable().p();
        String p11 = s5Var.f18178q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18178q.g().getObjectKey() == s5Var.f18178q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18178q.f().getPath();
        String p10 = this.f18178q.g().getTable().p();
        long objectKey = this.f18178q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.user.ABTest, io.realm.t5
    public String realmGet$group() {
        this.f18178q.f().e();
        return this.f18178q.g().getString(this.f18177p.f18180f);
    }

    @Override // com.habitrpg.android.habitica.models.user.ABTest, io.realm.t5
    public String realmGet$name() {
        this.f18178q.f().e();
        return this.f18178q.g().getString(this.f18177p.f18179e);
    }

    @Override // com.habitrpg.android.habitica.models.user.ABTest, io.realm.t5
    public void realmSet$group(String str) {
        if (this.f18178q.i()) {
            if (!this.f18178q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18178q.g();
            if (str != null) {
                g10.getTable().G(this.f18177p.f18180f, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'group' to null.");
        }
        this.f18178q.f().e();
        if (str != null) {
            this.f18178q.g().setString(this.f18177p.f18180f, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'group' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.user.ABTest, io.realm.t5
    public void realmSet$name(String str) {
        if (this.f18178q.i()) {
            if (!this.f18178q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18178q.g();
            if (str != null) {
                g10.getTable().G(this.f18177p.f18179e, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        }
        this.f18178q.f().e();
        if (str != null) {
            this.f18178q.g().setString(this.f18177p.f18179e, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
    }

    public String toString() {
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        return "ABTest = proxy[{name:" + realmGet$name() + "},{group:" + realmGet$group() + "}]";
    }
}
