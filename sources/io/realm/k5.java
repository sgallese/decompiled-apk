package io.realm;

import com.habitrpg.android.habitica.models.tasks.GroupAssignedDetails;
import com.habitrpg.android.habitica.models.tasks.Task;
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

/* compiled from: com_habitrpg_android_habitica_models_tasks_GroupAssignedDetailsRealmProxy.java */
/* loaded from: classes4.dex */
public class k5 extends GroupAssignedDetails implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17911r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17912p;

    /* renamed from: q  reason: collision with root package name */
    private l0<GroupAssignedDetails> f17913q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_tasks_GroupAssignedDetailsRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17914e;

        /* renamed from: f  reason: collision with root package name */
        long f17915f;

        /* renamed from: g  reason: collision with root package name */
        long f17916g;

        /* renamed from: h  reason: collision with root package name */
        long f17917h;

        /* renamed from: i  reason: collision with root package name */
        long f17918i;

        /* renamed from: j  reason: collision with root package name */
        long f17919j;

        a(OsSchemaInfo osSchemaInfo) {
            super(6);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("GroupAssignedDetails");
            this.f17914e = a("assignedDate", "assignedDate", b10);
            this.f17915f = a("assignedUsername", "assignedUsername", b10);
            this.f17916g = a("assignedUserID", "assignedUserID", b10);
            this.f17917h = a("assigningUsername", "assigningUsername", b10);
            this.f17918i = a(Task.FILTER_COMPLETED, Task.FILTER_COMPLETED, b10);
            this.f17919j = a("completedDate", "completedDate", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17914e = aVar.f17914e;
            aVar2.f17915f = aVar.f17915f;
            aVar2.f17916g = aVar.f17916g;
            aVar2.f17917h = aVar.f17917h;
            aVar2.f17918i = aVar.f17918i;
            aVar2.f17919j = aVar.f17919j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k5() {
        this.f17913q.p();
    }

    public static GroupAssignedDetails c(o0 o0Var, a aVar, GroupAssignedDetails groupAssignedDetails, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(groupAssignedDetails);
        if (oVar != null) {
            return (GroupAssignedDetails) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(GroupAssignedDetails.class), set);
        osObjectBuilder.I0(aVar.f17914e, groupAssignedDetails.realmGet$assignedDate());
        osObjectBuilder.c1(aVar.f17915f, groupAssignedDetails.realmGet$assignedUsername());
        osObjectBuilder.c1(aVar.f17916g, groupAssignedDetails.realmGet$assignedUserID());
        osObjectBuilder.c1(aVar.f17917h, groupAssignedDetails.realmGet$assigningUsername());
        osObjectBuilder.F0(aVar.f17918i, Boolean.valueOf(groupAssignedDetails.realmGet$completed()));
        osObjectBuilder.I0(aVar.f17919j, groupAssignedDetails.realmGet$completedDate());
        k5 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(groupAssignedDetails, k10);
        return k10;
    }

    public static GroupAssignedDetails d(o0 o0Var, a aVar, GroupAssignedDetails groupAssignedDetails, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((groupAssignedDetails instanceof io.realm.internal.o) && !d1.isFrozen(groupAssignedDetails)) {
            io.realm.internal.o oVar = (io.realm.internal.o) groupAssignedDetails;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return groupAssignedDetails;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(groupAssignedDetails);
        if (oVar2 != null) {
            return (GroupAssignedDetails) oVar2;
        }
        return c(o0Var, aVar, groupAssignedDetails, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static GroupAssignedDetails f(GroupAssignedDetails groupAssignedDetails, int i10, int i11, Map<a1, o.a<a1>> map) {
        GroupAssignedDetails groupAssignedDetails2;
        if (i10 <= i11 && groupAssignedDetails != null) {
            o.a<a1> aVar = map.get(groupAssignedDetails);
            if (aVar == null) {
                groupAssignedDetails2 = new GroupAssignedDetails();
                map.put(groupAssignedDetails, new o.a<>(i10, groupAssignedDetails2));
            } else if (i10 >= aVar.f17831a) {
                return (GroupAssignedDetails) aVar.f17832b;
            } else {
                GroupAssignedDetails groupAssignedDetails3 = (GroupAssignedDetails) aVar.f17832b;
                aVar.f17831a = i10;
                groupAssignedDetails2 = groupAssignedDetails3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) groupAssignedDetails).b().f();
            groupAssignedDetails2.realmSet$assignedDate(groupAssignedDetails.realmGet$assignedDate());
            groupAssignedDetails2.realmSet$assignedUsername(groupAssignedDetails.realmGet$assignedUsername());
            groupAssignedDetails2.realmSet$assignedUserID(groupAssignedDetails.realmGet$assignedUserID());
            groupAssignedDetails2.realmSet$assigningUsername(groupAssignedDetails.realmGet$assigningUsername());
            groupAssignedDetails2.realmSet$completed(groupAssignedDetails.realmGet$completed());
            groupAssignedDetails2.realmSet$completedDate(groupAssignedDetails.realmGet$completedDate());
            return groupAssignedDetails2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "GroupAssignedDetails", true, 6, 0);
        RealmFieldType realmFieldType = RealmFieldType.DATE;
        bVar.b("", "assignedDate", realmFieldType, false, false, false);
        RealmFieldType realmFieldType2 = RealmFieldType.STRING;
        bVar.b("", "assignedUsername", realmFieldType2, false, false, false);
        bVar.b("", "assignedUserID", realmFieldType2, false, false, false);
        bVar.b("", "assigningUsername", realmFieldType2, false, false, false);
        bVar.b("", Task.FILTER_COMPLETED, RealmFieldType.BOOLEAN, false, false, true);
        bVar.b("", "completedDate", realmFieldType, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17911r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, GroupAssignedDetails groupAssignedDetails, Map<a1, Long> map) {
        if ((groupAssignedDetails instanceof io.realm.internal.o) && !d1.isFrozen(groupAssignedDetails)) {
            io.realm.internal.o oVar = (io.realm.internal.o) groupAssignedDetails;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        long nativePtr = o0Var.c1(GroupAssignedDetails.class).getNativePtr();
        a aVar = (a) o0Var.R().e(GroupAssignedDetails.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(groupAssignedDetails, Long.valueOf(createEmbeddedObject));
        Date realmGet$assignedDate = groupAssignedDetails.realmGet$assignedDate();
        if (realmGet$assignedDate != null) {
            Table.nativeSetTimestamp(nativePtr, aVar.f17914e, createEmbeddedObject, realmGet$assignedDate.getTime(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17914e, createEmbeddedObject, false);
        }
        String realmGet$assignedUsername = groupAssignedDetails.realmGet$assignedUsername();
        if (realmGet$assignedUsername != null) {
            Table.nativeSetString(nativePtr, aVar.f17915f, createEmbeddedObject, realmGet$assignedUsername, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17915f, createEmbeddedObject, false);
        }
        String realmGet$assignedUserID = groupAssignedDetails.realmGet$assignedUserID();
        if (realmGet$assignedUserID != null) {
            Table.nativeSetString(nativePtr, aVar.f17916g, createEmbeddedObject, realmGet$assignedUserID, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17916g, createEmbeddedObject, false);
        }
        String realmGet$assigningUsername = groupAssignedDetails.realmGet$assigningUsername();
        if (realmGet$assigningUsername != null) {
            Table.nativeSetString(nativePtr, aVar.f17917h, createEmbeddedObject, realmGet$assigningUsername, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17917h, createEmbeddedObject, false);
        }
        Table.nativeSetBoolean(nativePtr, aVar.f17918i, createEmbeddedObject, groupAssignedDetails.realmGet$completed(), false);
        Date realmGet$completedDate = groupAssignedDetails.realmGet$completedDate();
        if (realmGet$completedDate != null) {
            Table.nativeSetTimestamp(nativePtr, aVar.f17919j, createEmbeddedObject, realmGet$completedDate.getTime(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17919j, createEmbeddedObject, false);
        }
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k5 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(GroupAssignedDetails.class), false, Collections.emptyList());
        k5 k5Var = new k5();
        cVar.a();
        return k5Var;
    }

    static GroupAssignedDetails l(o0 o0Var, a aVar, GroupAssignedDetails groupAssignedDetails, GroupAssignedDetails groupAssignedDetails2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(GroupAssignedDetails.class), set);
        osObjectBuilder.I0(aVar.f17914e, groupAssignedDetails2.realmGet$assignedDate());
        osObjectBuilder.c1(aVar.f17915f, groupAssignedDetails2.realmGet$assignedUsername());
        osObjectBuilder.c1(aVar.f17916g, groupAssignedDetails2.realmGet$assignedUserID());
        osObjectBuilder.c1(aVar.f17917h, groupAssignedDetails2.realmGet$assigningUsername());
        osObjectBuilder.F0(aVar.f17918i, Boolean.valueOf(groupAssignedDetails2.realmGet$completed()));
        osObjectBuilder.I0(aVar.f17919j, groupAssignedDetails2.realmGet$completedDate());
        osObjectBuilder.f1((io.realm.internal.o) groupAssignedDetails);
        return groupAssignedDetails;
    }

    public static void n(o0 o0Var, GroupAssignedDetails groupAssignedDetails, GroupAssignedDetails groupAssignedDetails2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(GroupAssignedDetails.class), groupAssignedDetails2, groupAssignedDetails, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17913q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17912p = (a) cVar.c();
        l0<GroupAssignedDetails> l0Var = new l0<>(this);
        this.f17913q = l0Var;
        l0Var.r(cVar.e());
        this.f17913q.s(cVar.f());
        this.f17913q.o(cVar.b());
        this.f17913q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17913q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k5 k5Var = (k5) obj;
        io.realm.a f10 = this.f17913q.f();
        io.realm.a f11 = k5Var.f17913q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17913q.g().getTable().p();
        String p11 = k5Var.f17913q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17913q.g().getObjectKey() == k5Var.f17913q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17913q.f().getPath();
        String p10 = this.f17913q.g().getTable().p();
        long objectKey = this.f17913q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.tasks.GroupAssignedDetails, io.realm.l5
    public Date realmGet$assignedDate() {
        this.f17913q.f().e();
        if (this.f17913q.g().isNull(this.f17912p.f17914e)) {
            return null;
        }
        return this.f17913q.g().getDate(this.f17912p.f17914e);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.GroupAssignedDetails, io.realm.l5
    public String realmGet$assignedUserID() {
        this.f17913q.f().e();
        return this.f17913q.g().getString(this.f17912p.f17916g);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.GroupAssignedDetails, io.realm.l5
    public String realmGet$assignedUsername() {
        this.f17913q.f().e();
        return this.f17913q.g().getString(this.f17912p.f17915f);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.GroupAssignedDetails, io.realm.l5
    public String realmGet$assigningUsername() {
        this.f17913q.f().e();
        return this.f17913q.g().getString(this.f17912p.f17917h);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.GroupAssignedDetails, io.realm.l5
    public boolean realmGet$completed() {
        this.f17913q.f().e();
        return this.f17913q.g().getBoolean(this.f17912p.f17918i);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.GroupAssignedDetails, io.realm.l5
    public Date realmGet$completedDate() {
        this.f17913q.f().e();
        if (this.f17913q.g().isNull(this.f17912p.f17919j)) {
            return null;
        }
        return this.f17913q.g().getDate(this.f17912p.f17919j);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.GroupAssignedDetails, io.realm.l5
    public void realmSet$assignedDate(Date date) {
        if (this.f17913q.i()) {
            if (!this.f17913q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17913q.g();
            if (date == null) {
                g10.getTable().F(this.f17912p.f17914e, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().A(this.f17912p.f17914e, g10.getObjectKey(), date, true);
                return;
            }
        }
        this.f17913q.f().e();
        if (date == null) {
            this.f17913q.g().setNull(this.f17912p.f17914e);
        } else {
            this.f17913q.g().setDate(this.f17912p.f17914e, date);
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.GroupAssignedDetails, io.realm.l5
    public void realmSet$assignedUserID(String str) {
        if (this.f17913q.i()) {
            if (!this.f17913q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17913q.g();
            if (str == null) {
                g10.getTable().F(this.f17912p.f17916g, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17912p.f17916g, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17913q.f().e();
        if (str == null) {
            this.f17913q.g().setNull(this.f17912p.f17916g);
        } else {
            this.f17913q.g().setString(this.f17912p.f17916g, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.GroupAssignedDetails, io.realm.l5
    public void realmSet$assignedUsername(String str) {
        if (this.f17913q.i()) {
            if (!this.f17913q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17913q.g();
            if (str == null) {
                g10.getTable().F(this.f17912p.f17915f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17912p.f17915f, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17913q.f().e();
        if (str == null) {
            this.f17913q.g().setNull(this.f17912p.f17915f);
        } else {
            this.f17913q.g().setString(this.f17912p.f17915f, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.GroupAssignedDetails, io.realm.l5
    public void realmSet$assigningUsername(String str) {
        if (this.f17913q.i()) {
            if (!this.f17913q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17913q.g();
            if (str == null) {
                g10.getTable().F(this.f17912p.f17917h, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17912p.f17917h, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17913q.f().e();
        if (str == null) {
            this.f17913q.g().setNull(this.f17912p.f17917h);
        } else {
            this.f17913q.g().setString(this.f17912p.f17917h, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.GroupAssignedDetails, io.realm.l5
    public void realmSet$completed(boolean z10) {
        if (this.f17913q.i()) {
            if (!this.f17913q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17913q.g();
            g10.getTable().z(this.f17912p.f17918i, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17913q.f().e();
        this.f17913q.g().setBoolean(this.f17912p.f17918i, z10);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.GroupAssignedDetails, io.realm.l5
    public void realmSet$completedDate(Date date) {
        if (this.f17913q.i()) {
            if (!this.f17913q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17913q.g();
            if (date == null) {
                g10.getTable().F(this.f17912p.f17919j, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().A(this.f17912p.f17919j, g10.getObjectKey(), date, true);
                return;
            }
        }
        this.f17913q.f().e();
        if (date == null) {
            this.f17913q.g().setNull(this.f17912p.f17919j);
        } else {
            this.f17913q.g().setDate(this.f17912p.f17919j, date);
        }
    }

    public String toString() {
        Date date;
        String str;
        String str2;
        String str3;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("GroupAssignedDetails = proxy[");
        sb2.append("{assignedDate:");
        Object obj = "null";
        if (realmGet$assignedDate() == null) {
            date = "null";
        } else {
            date = realmGet$assignedDate();
        }
        sb2.append(date);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{assignedUsername:");
        if (realmGet$assignedUsername() == null) {
            str = "null";
        } else {
            str = realmGet$assignedUsername();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{assignedUserID:");
        if (realmGet$assignedUserID() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$assignedUserID();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{assigningUsername:");
        if (realmGet$assigningUsername() == null) {
            str3 = "null";
        } else {
            str3 = realmGet$assigningUsername();
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{completed:");
        sb2.append(realmGet$completed());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{completedDate:");
        if (realmGet$completedDate() != null) {
            obj = realmGet$completedDate();
        }
        sb2.append(obj);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
