package io.realm;

import com.habitrpg.android.habitica.models.tasks.Days;
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

/* loaded from: classes4.dex */
public class com_habitrpg_android_habitica_models_tasks_DaysRealmProxy extends Days implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17411r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17412p;

    /* renamed from: q  reason: collision with root package name */
    private l0<Days> f17413q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17414e;

        /* renamed from: f  reason: collision with root package name */
        long f17415f;

        /* renamed from: g  reason: collision with root package name */
        long f17416g;

        /* renamed from: h  reason: collision with root package name */
        long f17417h;

        /* renamed from: i  reason: collision with root package name */
        long f17418i;

        /* renamed from: j  reason: collision with root package name */
        long f17419j;

        /* renamed from: k  reason: collision with root package name */
        long f17420k;

        a(OsSchemaInfo osSchemaInfo) {
            super(7);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("Days");
            this.f17414e = a("m", "m", b10);
            this.f17415f = a("t", "t", b10);
            this.f17416g = a("w", "w", b10);
            this.f17417h = a("th", "th", b10);
            this.f17418i = a("f", "f", b10);
            this.f17419j = a("s", "s", b10);
            this.f17420k = a("su", "su", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17414e = aVar.f17414e;
            aVar2.f17415f = aVar.f17415f;
            aVar2.f17416g = aVar.f17416g;
            aVar2.f17417h = aVar.f17417h;
            aVar2.f17418i = aVar.f17418i;
            aVar2.f17419j = aVar.f17419j;
            aVar2.f17420k = aVar.f17420k;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_habitrpg_android_habitica_models_tasks_DaysRealmProxy() {
        this.f17413q.p();
    }

    public static Days c(o0 o0Var, a aVar, Days days, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(days);
        if (oVar != null) {
            return (Days) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Days.class), set);
        osObjectBuilder.F0(aVar.f17414e, Boolean.valueOf(days.realmGet$m()));
        osObjectBuilder.F0(aVar.f17415f, Boolean.valueOf(days.realmGet$t()));
        osObjectBuilder.F0(aVar.f17416g, Boolean.valueOf(days.realmGet$w()));
        osObjectBuilder.F0(aVar.f17417h, Boolean.valueOf(days.realmGet$th()));
        osObjectBuilder.F0(aVar.f17418i, Boolean.valueOf(days.realmGet$f()));
        osObjectBuilder.F0(aVar.f17419j, Boolean.valueOf(days.realmGet$s()));
        osObjectBuilder.F0(aVar.f17420k, Boolean.valueOf(days.realmGet$su()));
        com_habitrpg_android_habitica_models_tasks_DaysRealmProxy k10 = k(o0Var, osObjectBuilder.e1());
        map.put(days, k10);
        return k10;
    }

    public static Days d(o0 o0Var, a aVar, Days days, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((days instanceof io.realm.internal.o) && !d1.isFrozen(days)) {
            io.realm.internal.o oVar = (io.realm.internal.o) days;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return days;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(days);
        if (oVar2 != null) {
            return (Days) oVar2;
        }
        return c(o0Var, aVar, days, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static Days f(Days days, int i10, int i11, Map<a1, o.a<a1>> map) {
        Days days2;
        if (i10 <= i11 && days != null) {
            o.a<a1> aVar = map.get(days);
            if (aVar == null) {
                days2 = new Days();
                map.put(days, new o.a<>(i10, days2));
            } else if (i10 >= aVar.f17831a) {
                return (Days) aVar.f17832b;
            } else {
                Days days3 = (Days) aVar.f17832b;
                aVar.f17831a = i10;
                days2 = days3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) days).b().f();
            days2.realmSet$m(days.realmGet$m());
            days2.realmSet$t(days.realmGet$t());
            days2.realmSet$w(days.realmGet$w());
            days2.realmSet$th(days.realmGet$th());
            days2.realmSet$f(days.realmGet$f());
            days2.realmSet$s(days.realmGet$s());
            days2.realmSet$su(days.realmGet$su());
            return days2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "Days", true, 7, 0);
        RealmFieldType realmFieldType = RealmFieldType.BOOLEAN;
        bVar.b("", "m", realmFieldType, false, false, true);
        bVar.b("", "t", realmFieldType, false, false, true);
        bVar.b("", "w", realmFieldType, false, false, true);
        bVar.b("", "th", realmFieldType, false, false, true);
        bVar.b("", "f", realmFieldType, false, false, true);
        bVar.b("", "s", realmFieldType, false, false, true);
        bVar.b("", "su", realmFieldType, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17411r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, Days days, Map<a1, Long> map) {
        if ((days instanceof io.realm.internal.o) && !d1.isFrozen(days)) {
            io.realm.internal.o oVar = (io.realm.internal.o) days;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        long nativePtr = o0Var.c1(Days.class).getNativePtr();
        a aVar = (a) o0Var.R().e(Days.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(days, Long.valueOf(createEmbeddedObject));
        Table.nativeSetBoolean(nativePtr, aVar.f17414e, createEmbeddedObject, days.realmGet$m(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17415f, createEmbeddedObject, days.realmGet$t(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17416g, createEmbeddedObject, days.realmGet$w(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17417h, createEmbeddedObject, days.realmGet$th(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17418i, createEmbeddedObject, days.realmGet$f(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17419j, createEmbeddedObject, days.realmGet$s(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17420k, createEmbeddedObject, days.realmGet$su(), false);
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com_habitrpg_android_habitica_models_tasks_DaysRealmProxy k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(Days.class), false, Collections.emptyList());
        com_habitrpg_android_habitica_models_tasks_DaysRealmProxy com_habitrpg_android_habitica_models_tasks_daysrealmproxy = new com_habitrpg_android_habitica_models_tasks_DaysRealmProxy();
        cVar.a();
        return com_habitrpg_android_habitica_models_tasks_daysrealmproxy;
    }

    static Days l(o0 o0Var, a aVar, Days days, Days days2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Days.class), set);
        osObjectBuilder.F0(aVar.f17414e, Boolean.valueOf(days2.realmGet$m()));
        osObjectBuilder.F0(aVar.f17415f, Boolean.valueOf(days2.realmGet$t()));
        osObjectBuilder.F0(aVar.f17416g, Boolean.valueOf(days2.realmGet$w()));
        osObjectBuilder.F0(aVar.f17417h, Boolean.valueOf(days2.realmGet$th()));
        osObjectBuilder.F0(aVar.f17418i, Boolean.valueOf(days2.realmGet$f()));
        osObjectBuilder.F0(aVar.f17419j, Boolean.valueOf(days2.realmGet$s()));
        osObjectBuilder.F0(aVar.f17420k, Boolean.valueOf(days2.realmGet$su()));
        osObjectBuilder.f1((io.realm.internal.o) days);
        return days;
    }

    public static void n(o0 o0Var, Days days, Days days2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(Days.class), days2, days, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17413q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17412p = (a) cVar.c();
        l0<Days> l0Var = new l0<>(this);
        this.f17413q = l0Var;
        l0Var.r(cVar.e());
        this.f17413q.s(cVar.f());
        this.f17413q.o(cVar.b());
        this.f17413q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17413q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_habitrpg_android_habitica_models_tasks_DaysRealmProxy com_habitrpg_android_habitica_models_tasks_daysrealmproxy = (com_habitrpg_android_habitica_models_tasks_DaysRealmProxy) obj;
        io.realm.a f10 = this.f17413q.f();
        io.realm.a f11 = com_habitrpg_android_habitica_models_tasks_daysrealmproxy.f17413q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17413q.g().getTable().p();
        String p11 = com_habitrpg_android_habitica_models_tasks_daysrealmproxy.f17413q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17413q.g().getObjectKey() == com_habitrpg_android_habitica_models_tasks_daysrealmproxy.f17413q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17413q.f().getPath();
        String p10 = this.f17413q.g().getTable().p();
        long objectKey = this.f17413q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.tasks.Days, io.realm.j5
    public boolean realmGet$f() {
        this.f17413q.f().e();
        return this.f17413q.g().getBoolean(this.f17412p.f17418i);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Days, io.realm.j5
    public boolean realmGet$m() {
        this.f17413q.f().e();
        return this.f17413q.g().getBoolean(this.f17412p.f17414e);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Days, io.realm.j5
    public boolean realmGet$s() {
        this.f17413q.f().e();
        return this.f17413q.g().getBoolean(this.f17412p.f17419j);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Days, io.realm.j5
    public boolean realmGet$su() {
        this.f17413q.f().e();
        return this.f17413q.g().getBoolean(this.f17412p.f17420k);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Days, io.realm.j5
    public boolean realmGet$t() {
        this.f17413q.f().e();
        return this.f17413q.g().getBoolean(this.f17412p.f17415f);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Days, io.realm.j5
    public boolean realmGet$th() {
        this.f17413q.f().e();
        return this.f17413q.g().getBoolean(this.f17412p.f17417h);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Days, io.realm.j5
    public boolean realmGet$w() {
        this.f17413q.f().e();
        return this.f17413q.g().getBoolean(this.f17412p.f17416g);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Days, io.realm.j5
    public void realmSet$f(boolean z10) {
        if (this.f17413q.i()) {
            if (!this.f17413q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17413q.g();
            g10.getTable().z(this.f17412p.f17418i, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17413q.f().e();
        this.f17413q.g().setBoolean(this.f17412p.f17418i, z10);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Days, io.realm.j5
    public void realmSet$m(boolean z10) {
        if (this.f17413q.i()) {
            if (!this.f17413q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17413q.g();
            g10.getTable().z(this.f17412p.f17414e, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17413q.f().e();
        this.f17413q.g().setBoolean(this.f17412p.f17414e, z10);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Days, io.realm.j5
    public void realmSet$s(boolean z10) {
        if (this.f17413q.i()) {
            if (!this.f17413q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17413q.g();
            g10.getTable().z(this.f17412p.f17419j, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17413q.f().e();
        this.f17413q.g().setBoolean(this.f17412p.f17419j, z10);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Days, io.realm.j5
    public void realmSet$su(boolean z10) {
        if (this.f17413q.i()) {
            if (!this.f17413q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17413q.g();
            g10.getTable().z(this.f17412p.f17420k, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17413q.f().e();
        this.f17413q.g().setBoolean(this.f17412p.f17420k, z10);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Days, io.realm.j5
    public void realmSet$t(boolean z10) {
        if (this.f17413q.i()) {
            if (!this.f17413q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17413q.g();
            g10.getTable().z(this.f17412p.f17415f, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17413q.f().e();
        this.f17413q.g().setBoolean(this.f17412p.f17415f, z10);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Days, io.realm.j5
    public void realmSet$th(boolean z10) {
        if (this.f17413q.i()) {
            if (!this.f17413q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17413q.g();
            g10.getTable().z(this.f17412p.f17417h, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17413q.f().e();
        this.f17413q.g().setBoolean(this.f17412p.f17417h, z10);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Days, io.realm.j5
    public void realmSet$w(boolean z10) {
        if (this.f17413q.i()) {
            if (!this.f17413q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17413q.g();
            g10.getTable().z(this.f17412p.f17416g, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17413q.f().e();
        this.f17413q.g().setBoolean(this.f17412p.f17416g, z10);
    }

    public String toString() {
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        return "Days = proxy[{m:" + realmGet$m() + "},{t:" + realmGet$t() + "},{w:" + realmGet$w() + "},{th:" + realmGet$th() + "},{f:" + realmGet$f() + "},{s:" + realmGet$s() + "},{su:" + realmGet$su() + "}]";
    }
}
