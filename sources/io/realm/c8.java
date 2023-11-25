package io.realm;

import com.habitrpg.android.habitica.models.user.UserTaskPreferences;
import io.realm.a;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_user_UserTaskPreferencesRealmProxy.java */
/* loaded from: classes4.dex */
public class c8 extends UserTaskPreferences implements io.realm.internal.o {

    /* renamed from: u  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17397u = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17398p;

    /* renamed from: q  reason: collision with root package name */
    private l0<UserTaskPreferences> f17399q;

    /* renamed from: r  reason: collision with root package name */
    private x0<String> f17400r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_user_UserTaskPreferencesRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17401e;

        /* renamed from: f  reason: collision with root package name */
        long f17402f;

        /* renamed from: g  reason: collision with root package name */
        long f17403g;

        a(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("UserTaskPreferences");
            this.f17401e = a("confirmScoreNotes", "confirmScoreNotes", b10);
            this.f17402f = a("mirrorGroupTasks", "mirrorGroupTasks", b10);
            this.f17403g = a("groupByChallenge", "groupByChallenge", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17401e = aVar.f17401e;
            aVar2.f17402f = aVar.f17402f;
            aVar2.f17403g = aVar.f17403g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c8() {
        this.f17399q.p();
    }

    public static UserTaskPreferences c(o0 o0Var, a aVar, UserTaskPreferences userTaskPreferences, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(userTaskPreferences);
        if (oVar != null) {
            return (UserTaskPreferences) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(UserTaskPreferences.class), set);
        osObjectBuilder.F0(aVar.f17401e, Boolean.valueOf(userTaskPreferences.realmGet$confirmScoreNotes()));
        osObjectBuilder.d1(aVar.f17402f, userTaskPreferences.realmGet$mirrorGroupTasks());
        osObjectBuilder.F0(aVar.f17403g, Boolean.valueOf(userTaskPreferences.realmGet$groupByChallenge()));
        c8 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(userTaskPreferences, k10);
        return k10;
    }

    public static UserTaskPreferences d(o0 o0Var, a aVar, UserTaskPreferences userTaskPreferences, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((userTaskPreferences instanceof io.realm.internal.o) && !d1.isFrozen(userTaskPreferences)) {
            io.realm.internal.o oVar = (io.realm.internal.o) userTaskPreferences;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return userTaskPreferences;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(userTaskPreferences);
        if (oVar2 != null) {
            return (UserTaskPreferences) oVar2;
        }
        return c(o0Var, aVar, userTaskPreferences, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static UserTaskPreferences f(UserTaskPreferences userTaskPreferences, int i10, int i11, Map<a1, o.a<a1>> map) {
        UserTaskPreferences userTaskPreferences2;
        if (i10 <= i11 && userTaskPreferences != null) {
            o.a<a1> aVar = map.get(userTaskPreferences);
            if (aVar == null) {
                userTaskPreferences2 = new UserTaskPreferences();
                map.put(userTaskPreferences, new o.a<>(i10, userTaskPreferences2));
            } else if (i10 >= aVar.f17831a) {
                return (UserTaskPreferences) aVar.f17832b;
            } else {
                UserTaskPreferences userTaskPreferences3 = (UserTaskPreferences) aVar.f17832b;
                aVar.f17831a = i10;
                userTaskPreferences2 = userTaskPreferences3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) userTaskPreferences).b().f();
            userTaskPreferences2.realmSet$confirmScoreNotes(userTaskPreferences.realmGet$confirmScoreNotes());
            userTaskPreferences2.realmSet$mirrorGroupTasks(new x0<>());
            userTaskPreferences2.realmGet$mirrorGroupTasks().addAll(userTaskPreferences.realmGet$mirrorGroupTasks());
            userTaskPreferences2.realmSet$groupByChallenge(userTaskPreferences.realmGet$groupByChallenge());
            return userTaskPreferences2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "UserTaskPreferences", true, 3, 0);
        RealmFieldType realmFieldType = RealmFieldType.BOOLEAN;
        bVar.b("", "confirmScoreNotes", realmFieldType, false, false, true);
        bVar.c("", "mirrorGroupTasks", RealmFieldType.STRING_LIST, false);
        bVar.b("", "groupByChallenge", realmFieldType, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17397u;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, UserTaskPreferences userTaskPreferences, Map<a1, Long> map) {
        if ((userTaskPreferences instanceof io.realm.internal.o) && !d1.isFrozen(userTaskPreferences)) {
            io.realm.internal.o oVar = (io.realm.internal.o) userTaskPreferences;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(UserTaskPreferences.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(UserTaskPreferences.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(userTaskPreferences, Long.valueOf(createEmbeddedObject));
        Table.nativeSetBoolean(nativePtr, aVar.f17401e, createEmbeddedObject, userTaskPreferences.realmGet$confirmScoreNotes(), false);
        OsList osList = new OsList(c12.s(createEmbeddedObject), aVar.f17402f);
        osList.K();
        x0<String> realmGet$mirrorGroupTasks = userTaskPreferences.realmGet$mirrorGroupTasks();
        if (realmGet$mirrorGroupTasks != null) {
            Iterator<String> it = realmGet$mirrorGroupTasks.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    osList.h();
                } else {
                    osList.l(next);
                }
            }
        }
        Table.nativeSetBoolean(nativePtr, aVar.f17403g, createEmbeddedObject, userTaskPreferences.realmGet$groupByChallenge(), false);
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c8 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(UserTaskPreferences.class), false, Collections.emptyList());
        c8 c8Var = new c8();
        cVar.a();
        return c8Var;
    }

    static UserTaskPreferences l(o0 o0Var, a aVar, UserTaskPreferences userTaskPreferences, UserTaskPreferences userTaskPreferences2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(UserTaskPreferences.class), set);
        osObjectBuilder.F0(aVar.f17401e, Boolean.valueOf(userTaskPreferences2.realmGet$confirmScoreNotes()));
        osObjectBuilder.d1(aVar.f17402f, userTaskPreferences2.realmGet$mirrorGroupTasks());
        osObjectBuilder.F0(aVar.f17403g, Boolean.valueOf(userTaskPreferences2.realmGet$groupByChallenge()));
        osObjectBuilder.f1((io.realm.internal.o) userTaskPreferences);
        return userTaskPreferences;
    }

    public static void n(o0 o0Var, UserTaskPreferences userTaskPreferences, UserTaskPreferences userTaskPreferences2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(UserTaskPreferences.class), userTaskPreferences2, userTaskPreferences, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17399q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17398p = (a) cVar.c();
        l0<UserTaskPreferences> l0Var = new l0<>(this);
        this.f17399q = l0Var;
        l0Var.r(cVar.e());
        this.f17399q.s(cVar.f());
        this.f17399q.o(cVar.b());
        this.f17399q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17399q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c8 c8Var = (c8) obj;
        io.realm.a f10 = this.f17399q.f();
        io.realm.a f11 = c8Var.f17399q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17399q.g().getTable().p();
        String p11 = c8Var.f17399q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17399q.g().getObjectKey() == c8Var.f17399q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17399q.f().getPath();
        String p10 = this.f17399q.g().getTable().p();
        long objectKey = this.f17399q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.user.UserTaskPreferences, io.realm.d8
    public boolean realmGet$confirmScoreNotes() {
        this.f17399q.f().e();
        return this.f17399q.g().getBoolean(this.f17398p.f17401e);
    }

    @Override // com.habitrpg.android.habitica.models.user.UserTaskPreferences, io.realm.d8
    public boolean realmGet$groupByChallenge() {
        this.f17399q.f().e();
        return this.f17399q.g().getBoolean(this.f17398p.f17403g);
    }

    @Override // com.habitrpg.android.habitica.models.user.UserTaskPreferences, io.realm.d8
    public x0<String> realmGet$mirrorGroupTasks() {
        this.f17399q.f().e();
        x0<String> x0Var = this.f17400r;
        if (x0Var != null) {
            return x0Var;
        }
        x0<String> x0Var2 = new x0<>(String.class, this.f17399q.g().getValueList(this.f17398p.f17402f, RealmFieldType.STRING_LIST), this.f17399q.f());
        this.f17400r = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.user.UserTaskPreferences, io.realm.d8
    public void realmSet$confirmScoreNotes(boolean z10) {
        if (this.f17399q.i()) {
            if (!this.f17399q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17399q.g();
            g10.getTable().z(this.f17398p.f17401e, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17399q.f().e();
        this.f17399q.g().setBoolean(this.f17398p.f17401e, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.UserTaskPreferences, io.realm.d8
    public void realmSet$groupByChallenge(boolean z10) {
        if (this.f17399q.i()) {
            if (!this.f17399q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17399q.g();
            g10.getTable().z(this.f17398p.f17403g, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17399q.f().e();
        this.f17399q.g().setBoolean(this.f17398p.f17403g, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.UserTaskPreferences, io.realm.d8
    public void realmSet$mirrorGroupTasks(x0<String> x0Var) {
        if (this.f17399q.i() && (!this.f17399q.d() || this.f17399q.e().contains("mirrorGroupTasks"))) {
            return;
        }
        this.f17399q.f().e();
        OsList valueList = this.f17399q.g().getValueList(this.f17398p.f17402f, RealmFieldType.STRING_LIST);
        valueList.K();
        if (x0Var == null) {
            return;
        }
        Iterator<String> it = x0Var.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next == null) {
                valueList.h();
            } else {
                valueList.l(next);
            }
        }
    }

    public String toString() {
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        return "UserTaskPreferences = proxy[{confirmScoreNotes:" + realmGet$confirmScoreNotes() + "},{mirrorGroupTasks:RealmList<String>[" + realmGet$mirrorGroupTasks().size() + "]},{groupByChallenge:" + realmGet$groupByChallenge() + "}]";
    }
}
