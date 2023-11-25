package io.realm;

import com.habitrpg.android.habitica.models.tasks.GroupAssignedDetails;
import com.habitrpg.android.habitica.models.tasks.TaskGroupPlan;
import io.realm.a;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_tasks_TaskGroupPlanRealmProxy.java */
/* loaded from: classes4.dex */
public class n5 extends TaskGroupPlan implements io.realm.internal.o {

    /* renamed from: v  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17999v = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18000p;

    /* renamed from: q  reason: collision with root package name */
    private l0<TaskGroupPlan> f18001q;

    /* renamed from: r  reason: collision with root package name */
    private x0<String> f18002r;

    /* renamed from: u  reason: collision with root package name */
    private x0<GroupAssignedDetails> f18003u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_tasks_TaskGroupPlanRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18004e;

        /* renamed from: f  reason: collision with root package name */
        long f18005f;

        /* renamed from: g  reason: collision with root package name */
        long f18006g;

        /* renamed from: h  reason: collision with root package name */
        long f18007h;

        /* renamed from: i  reason: collision with root package name */
        long f18008i;

        /* renamed from: j  reason: collision with root package name */
        long f18009j;

        /* renamed from: k  reason: collision with root package name */
        long f18010k;

        /* renamed from: l  reason: collision with root package name */
        long f18011l;

        /* renamed from: m  reason: collision with root package name */
        long f18012m;

        /* renamed from: n  reason: collision with root package name */
        long f18013n;

        a(OsSchemaInfo osSchemaInfo) {
            super(10);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("TaskGroupPlan");
            this.f18004e = a("groupID", "groupID", b10);
            this.f18005f = a("managerNotes", "managerNotes", b10);
            this.f18006g = a("sharedCompletion", "sharedCompletion", b10);
            this.f18007h = a("assignedDate", "assignedDate", b10);
            this.f18008i = a("assigningUsername", "assigningUsername", b10);
            this.f18009j = a("assignedUsers", "assignedUsers", b10);
            this.f18010k = a("assignedUsersDetail", "assignedUsersDetail", b10);
            this.f18011l = a("approvalRequested", "approvalRequested", b10);
            this.f18012m = a("approvalApproved", "approvalApproved", b10);
            this.f18013n = a("approvalRequired", "approvalRequired", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18004e = aVar.f18004e;
            aVar2.f18005f = aVar.f18005f;
            aVar2.f18006g = aVar.f18006g;
            aVar2.f18007h = aVar.f18007h;
            aVar2.f18008i = aVar.f18008i;
            aVar2.f18009j = aVar.f18009j;
            aVar2.f18010k = aVar.f18010k;
            aVar2.f18011l = aVar.f18011l;
            aVar2.f18012m = aVar.f18012m;
            aVar2.f18013n = aVar.f18013n;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n5() {
        this.f18001q.p();
    }

    public static TaskGroupPlan c(o0 o0Var, a aVar, TaskGroupPlan taskGroupPlan, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(taskGroupPlan);
        if (oVar != null) {
            return (TaskGroupPlan) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(TaskGroupPlan.class), set);
        osObjectBuilder.c1(aVar.f18004e, taskGroupPlan.realmGet$groupID());
        osObjectBuilder.c1(aVar.f18005f, taskGroupPlan.realmGet$managerNotes());
        osObjectBuilder.c1(aVar.f18006g, taskGroupPlan.realmGet$sharedCompletion());
        osObjectBuilder.I0(aVar.f18007h, taskGroupPlan.realmGet$assignedDate());
        osObjectBuilder.c1(aVar.f18008i, taskGroupPlan.realmGet$assigningUsername());
        osObjectBuilder.d1(aVar.f18009j, taskGroupPlan.realmGet$assignedUsers());
        osObjectBuilder.F0(aVar.f18011l, taskGroupPlan.realmGet$approvalRequested());
        osObjectBuilder.F0(aVar.f18012m, taskGroupPlan.realmGet$approvalApproved());
        osObjectBuilder.F0(aVar.f18013n, taskGroupPlan.realmGet$approvalRequired());
        n5 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(taskGroupPlan, k10);
        x0<GroupAssignedDetails> realmGet$assignedUsersDetail = taskGroupPlan.realmGet$assignedUsersDetail();
        if (realmGet$assignedUsersDetail != null) {
            x0<GroupAssignedDetails> realmGet$assignedUsersDetail2 = k10.realmGet$assignedUsersDetail();
            realmGet$assignedUsersDetail2.clear();
            for (int i10 = 0; i10 < realmGet$assignedUsersDetail.size(); i10++) {
                GroupAssignedDetails groupAssignedDetails = realmGet$assignedUsersDetail.get(i10);
                if (((GroupAssignedDetails) map.get(groupAssignedDetails)) == null) {
                    k5 k11 = k5.k(o0Var, o0Var.c1(GroupAssignedDetails.class).s(realmGet$assignedUsersDetail2.m().n()));
                    map.put(groupAssignedDetails, k11);
                    k5.n(o0Var, groupAssignedDetails, k11, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheassignedUsersDetail.toString()");
                }
            }
        }
        return k10;
    }

    public static TaskGroupPlan d(o0 o0Var, a aVar, TaskGroupPlan taskGroupPlan, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((taskGroupPlan instanceof io.realm.internal.o) && !d1.isFrozen(taskGroupPlan)) {
            io.realm.internal.o oVar = (io.realm.internal.o) taskGroupPlan;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return taskGroupPlan;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(taskGroupPlan);
        if (oVar2 != null) {
            return (TaskGroupPlan) oVar2;
        }
        return c(o0Var, aVar, taskGroupPlan, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static TaskGroupPlan f(TaskGroupPlan taskGroupPlan, int i10, int i11, Map<a1, o.a<a1>> map) {
        TaskGroupPlan taskGroupPlan2;
        if (i10 > i11 || taskGroupPlan == null) {
            return null;
        }
        o.a<a1> aVar = map.get(taskGroupPlan);
        if (aVar == null) {
            taskGroupPlan2 = new TaskGroupPlan();
            map.put(taskGroupPlan, new o.a<>(i10, taskGroupPlan2));
        } else if (i10 >= aVar.f17831a) {
            return (TaskGroupPlan) aVar.f17832b;
        } else {
            TaskGroupPlan taskGroupPlan3 = (TaskGroupPlan) aVar.f17832b;
            aVar.f17831a = i10;
            taskGroupPlan2 = taskGroupPlan3;
        }
        o0 o0Var = (o0) ((io.realm.internal.o) taskGroupPlan).b().f();
        taskGroupPlan2.realmSet$groupID(taskGroupPlan.realmGet$groupID());
        taskGroupPlan2.realmSet$managerNotes(taskGroupPlan.realmGet$managerNotes());
        taskGroupPlan2.realmSet$sharedCompletion(taskGroupPlan.realmGet$sharedCompletion());
        taskGroupPlan2.realmSet$assignedDate(taskGroupPlan.realmGet$assignedDate());
        taskGroupPlan2.realmSet$assigningUsername(taskGroupPlan.realmGet$assigningUsername());
        taskGroupPlan2.realmSet$assignedUsers(new x0<>());
        taskGroupPlan2.realmGet$assignedUsers().addAll(taskGroupPlan.realmGet$assignedUsers());
        if (i10 == i11) {
            taskGroupPlan2.realmSet$assignedUsersDetail(null);
        } else {
            x0<GroupAssignedDetails> realmGet$assignedUsersDetail = taskGroupPlan.realmGet$assignedUsersDetail();
            x0<GroupAssignedDetails> x0Var = new x0<>();
            taskGroupPlan2.realmSet$assignedUsersDetail(x0Var);
            int i12 = i10 + 1;
            int size = realmGet$assignedUsersDetail.size();
            for (int i13 = 0; i13 < size; i13++) {
                x0Var.add(k5.f(realmGet$assignedUsersDetail.get(i13), i12, i11, map));
            }
        }
        taskGroupPlan2.realmSet$approvalRequested(taskGroupPlan.realmGet$approvalRequested());
        taskGroupPlan2.realmSet$approvalApproved(taskGroupPlan.realmGet$approvalApproved());
        taskGroupPlan2.realmSet$approvalRequired(taskGroupPlan.realmGet$approvalRequired());
        return taskGroupPlan2;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "TaskGroupPlan", true, 10, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "groupID", realmFieldType, false, false, false);
        bVar.b("", "managerNotes", realmFieldType, false, false, false);
        bVar.b("", "sharedCompletion", realmFieldType, false, false, false);
        bVar.b("", "assignedDate", RealmFieldType.DATE, false, false, false);
        bVar.b("", "assigningUsername", realmFieldType, false, false, false);
        bVar.c("", "assignedUsers", RealmFieldType.STRING_LIST, false);
        bVar.a("", "assignedUsersDetail", RealmFieldType.LIST, "GroupAssignedDetails");
        RealmFieldType realmFieldType2 = RealmFieldType.BOOLEAN;
        bVar.b("", "approvalRequested", realmFieldType2, false, false, false);
        bVar.b("", "approvalApproved", realmFieldType2, false, false, false);
        bVar.b("", "approvalRequired", realmFieldType2, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17999v;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, TaskGroupPlan taskGroupPlan, Map<a1, Long> map) {
        long j12;
        long j13;
        if ((taskGroupPlan instanceof io.realm.internal.o) && !d1.isFrozen(taskGroupPlan)) {
            io.realm.internal.o oVar = (io.realm.internal.o) taskGroupPlan;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(TaskGroupPlan.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(TaskGroupPlan.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(taskGroupPlan, Long.valueOf(createEmbeddedObject));
        String realmGet$groupID = taskGroupPlan.realmGet$groupID();
        if (realmGet$groupID != null) {
            Table.nativeSetString(nativePtr, aVar.f18004e, createEmbeddedObject, realmGet$groupID, false);
            j12 = createEmbeddedObject;
        } else {
            j12 = createEmbeddedObject;
            Table.nativeSetNull(nativePtr, aVar.f18004e, createEmbeddedObject, false);
        }
        String realmGet$managerNotes = taskGroupPlan.realmGet$managerNotes();
        if (realmGet$managerNotes != null) {
            long j14 = j12;
            Table.nativeSetString(nativePtr, aVar.f18005f, j14, realmGet$managerNotes, false);
            j12 = j14;
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18005f, j12, false);
        }
        String realmGet$sharedCompletion = taskGroupPlan.realmGet$sharedCompletion();
        if (realmGet$sharedCompletion != null) {
            long j15 = j12;
            Table.nativeSetString(nativePtr, aVar.f18006g, j15, realmGet$sharedCompletion, false);
            j12 = j15;
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18006g, j12, false);
        }
        Date realmGet$assignedDate = taskGroupPlan.realmGet$assignedDate();
        if (realmGet$assignedDate != null) {
            long j16 = j12;
            Table.nativeSetTimestamp(nativePtr, aVar.f18007h, j16, realmGet$assignedDate.getTime(), false);
            j12 = j16;
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18007h, j12, false);
        }
        String realmGet$assigningUsername = taskGroupPlan.realmGet$assigningUsername();
        if (realmGet$assigningUsername != null) {
            long j17 = j12;
            Table.nativeSetString(nativePtr, aVar.f18008i, j17, realmGet$assigningUsername, false);
            j13 = j17;
        } else {
            long j18 = j12;
            j13 = j18;
            Table.nativeSetNull(nativePtr, aVar.f18008i, j18, false);
        }
        OsList osList = new OsList(c12.s(j13), aVar.f18009j);
        osList.K();
        x0<String> realmGet$assignedUsers = taskGroupPlan.realmGet$assignedUsers();
        if (realmGet$assignedUsers != null) {
            Iterator<String> it = realmGet$assignedUsers.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    osList.h();
                } else {
                    osList.l(next);
                }
            }
        }
        OsList osList2 = new OsList(c12.s(j13), aVar.f18010k);
        x0<GroupAssignedDetails> realmGet$assignedUsersDetail = taskGroupPlan.realmGet$assignedUsersDetail();
        osList2.K();
        if (realmGet$assignedUsersDetail != null) {
            Iterator<GroupAssignedDetails> it2 = realmGet$assignedUsersDetail.iterator();
            while (it2.hasNext()) {
                GroupAssignedDetails next2 = it2.next();
                Long l10 = map.get(next2);
                if (l10 == null) {
                    k5.i(o0Var, c12, aVar.f18010k, j13, next2, map);
                    aVar = aVar;
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l10.toString());
                }
            }
        }
        a aVar2 = aVar;
        Boolean realmGet$approvalRequested = taskGroupPlan.realmGet$approvalRequested();
        if (realmGet$approvalRequested != null) {
            Table.nativeSetBoolean(nativePtr, aVar2.f18011l, j13, realmGet$approvalRequested.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar2.f18011l, j13, false);
        }
        Boolean realmGet$approvalApproved = taskGroupPlan.realmGet$approvalApproved();
        if (realmGet$approvalApproved != null) {
            Table.nativeSetBoolean(nativePtr, aVar2.f18012m, j13, realmGet$approvalApproved.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar2.f18012m, j13, false);
        }
        Boolean realmGet$approvalRequired = taskGroupPlan.realmGet$approvalRequired();
        if (realmGet$approvalRequired != null) {
            Table.nativeSetBoolean(nativePtr, aVar2.f18013n, j13, realmGet$approvalRequired.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar2.f18013n, j13, false);
        }
        return j13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n5 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(TaskGroupPlan.class), false, Collections.emptyList());
        n5 n5Var = new n5();
        cVar.a();
        return n5Var;
    }

    static TaskGroupPlan l(o0 o0Var, a aVar, TaskGroupPlan taskGroupPlan, TaskGroupPlan taskGroupPlan2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(TaskGroupPlan.class), set);
        osObjectBuilder.c1(aVar.f18004e, taskGroupPlan2.realmGet$groupID());
        osObjectBuilder.c1(aVar.f18005f, taskGroupPlan2.realmGet$managerNotes());
        osObjectBuilder.c1(aVar.f18006g, taskGroupPlan2.realmGet$sharedCompletion());
        osObjectBuilder.I0(aVar.f18007h, taskGroupPlan2.realmGet$assignedDate());
        osObjectBuilder.c1(aVar.f18008i, taskGroupPlan2.realmGet$assigningUsername());
        osObjectBuilder.d1(aVar.f18009j, taskGroupPlan2.realmGet$assignedUsers());
        x0<GroupAssignedDetails> realmGet$assignedUsersDetail = taskGroupPlan2.realmGet$assignedUsersDetail();
        if (realmGet$assignedUsersDetail != null) {
            x0 x0Var = new x0();
            OsList m10 = taskGroupPlan.realmGet$assignedUsersDetail().m();
            m10.q();
            for (int i10 = 0; i10 < realmGet$assignedUsersDetail.size(); i10++) {
                GroupAssignedDetails groupAssignedDetails = realmGet$assignedUsersDetail.get(i10);
                if (((GroupAssignedDetails) map.get(groupAssignedDetails)) == null) {
                    k5 k10 = k5.k(o0Var, o0Var.c1(GroupAssignedDetails.class).s(m10.n()));
                    map.put(groupAssignedDetails, k10);
                    x0Var.add(k10);
                    k5.n(o0Var, groupAssignedDetails, k10, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheassignedUsersDetail.toString()");
                }
            }
        } else {
            osObjectBuilder.b1(aVar.f18010k, new x0());
        }
        osObjectBuilder.F0(aVar.f18011l, taskGroupPlan2.realmGet$approvalRequested());
        osObjectBuilder.F0(aVar.f18012m, taskGroupPlan2.realmGet$approvalApproved());
        osObjectBuilder.F0(aVar.f18013n, taskGroupPlan2.realmGet$approvalRequired());
        osObjectBuilder.f1((io.realm.internal.o) taskGroupPlan);
        return taskGroupPlan;
    }

    public static void n(o0 o0Var, TaskGroupPlan taskGroupPlan, TaskGroupPlan taskGroupPlan2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(TaskGroupPlan.class), taskGroupPlan2, taskGroupPlan, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18001q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18000p = (a) cVar.c();
        l0<TaskGroupPlan> l0Var = new l0<>(this);
        this.f18001q = l0Var;
        l0Var.r(cVar.e());
        this.f18001q.s(cVar.f());
        this.f18001q.o(cVar.b());
        this.f18001q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18001q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        n5 n5Var = (n5) obj;
        io.realm.a f10 = this.f18001q.f();
        io.realm.a f11 = n5Var.f18001q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18001q.g().getTable().p();
        String p11 = n5Var.f18001q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18001q.g().getObjectKey() == n5Var.f18001q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18001q.f().getPath();
        String p10 = this.f18001q.g().getTable().p();
        long objectKey = this.f18001q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.tasks.TaskGroupPlan, io.realm.o5
    public Boolean realmGet$approvalApproved() {
        this.f18001q.f().e();
        if (this.f18001q.g().isNull(this.f18000p.f18012m)) {
            return null;
        }
        return Boolean.valueOf(this.f18001q.g().getBoolean(this.f18000p.f18012m));
    }

    @Override // com.habitrpg.android.habitica.models.tasks.TaskGroupPlan, io.realm.o5
    public Boolean realmGet$approvalRequested() {
        this.f18001q.f().e();
        if (this.f18001q.g().isNull(this.f18000p.f18011l)) {
            return null;
        }
        return Boolean.valueOf(this.f18001q.g().getBoolean(this.f18000p.f18011l));
    }

    @Override // com.habitrpg.android.habitica.models.tasks.TaskGroupPlan, io.realm.o5
    public Boolean realmGet$approvalRequired() {
        this.f18001q.f().e();
        if (this.f18001q.g().isNull(this.f18000p.f18013n)) {
            return null;
        }
        return Boolean.valueOf(this.f18001q.g().getBoolean(this.f18000p.f18013n));
    }

    @Override // com.habitrpg.android.habitica.models.tasks.TaskGroupPlan, io.realm.o5
    public Date realmGet$assignedDate() {
        this.f18001q.f().e();
        if (this.f18001q.g().isNull(this.f18000p.f18007h)) {
            return null;
        }
        return this.f18001q.g().getDate(this.f18000p.f18007h);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.TaskGroupPlan, io.realm.o5
    public x0<String> realmGet$assignedUsers() {
        this.f18001q.f().e();
        x0<String> x0Var = this.f18002r;
        if (x0Var != null) {
            return x0Var;
        }
        x0<String> x0Var2 = new x0<>(String.class, this.f18001q.g().getValueList(this.f18000p.f18009j, RealmFieldType.STRING_LIST), this.f18001q.f());
        this.f18002r = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.tasks.TaskGroupPlan, io.realm.o5
    public x0<GroupAssignedDetails> realmGet$assignedUsersDetail() {
        this.f18001q.f().e();
        x0<GroupAssignedDetails> x0Var = this.f18003u;
        if (x0Var != null) {
            return x0Var;
        }
        x0<GroupAssignedDetails> x0Var2 = new x0<>(GroupAssignedDetails.class, this.f18001q.g().getModelList(this.f18000p.f18010k), this.f18001q.f());
        this.f18003u = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.tasks.TaskGroupPlan, io.realm.o5
    public String realmGet$assigningUsername() {
        this.f18001q.f().e();
        return this.f18001q.g().getString(this.f18000p.f18008i);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.TaskGroupPlan, io.realm.o5
    public String realmGet$groupID() {
        this.f18001q.f().e();
        return this.f18001q.g().getString(this.f18000p.f18004e);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.TaskGroupPlan, io.realm.o5
    public String realmGet$managerNotes() {
        this.f18001q.f().e();
        return this.f18001q.g().getString(this.f18000p.f18005f);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.TaskGroupPlan, io.realm.o5
    public String realmGet$sharedCompletion() {
        this.f18001q.f().e();
        return this.f18001q.g().getString(this.f18000p.f18006g);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.TaskGroupPlan, io.realm.o5
    public void realmSet$approvalApproved(Boolean bool) {
        if (this.f18001q.i()) {
            if (!this.f18001q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18001q.g();
            if (bool == null) {
                g10.getTable().F(this.f18000p.f18012m, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().z(this.f18000p.f18012m, g10.getObjectKey(), bool.booleanValue(), true);
                return;
            }
        }
        this.f18001q.f().e();
        if (bool == null) {
            this.f18001q.g().setNull(this.f18000p.f18012m);
        } else {
            this.f18001q.g().setBoolean(this.f18000p.f18012m, bool.booleanValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.TaskGroupPlan, io.realm.o5
    public void realmSet$approvalRequested(Boolean bool) {
        if (this.f18001q.i()) {
            if (!this.f18001q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18001q.g();
            if (bool == null) {
                g10.getTable().F(this.f18000p.f18011l, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().z(this.f18000p.f18011l, g10.getObjectKey(), bool.booleanValue(), true);
                return;
            }
        }
        this.f18001q.f().e();
        if (bool == null) {
            this.f18001q.g().setNull(this.f18000p.f18011l);
        } else {
            this.f18001q.g().setBoolean(this.f18000p.f18011l, bool.booleanValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.TaskGroupPlan, io.realm.o5
    public void realmSet$approvalRequired(Boolean bool) {
        if (this.f18001q.i()) {
            if (!this.f18001q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18001q.g();
            if (bool == null) {
                g10.getTable().F(this.f18000p.f18013n, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().z(this.f18000p.f18013n, g10.getObjectKey(), bool.booleanValue(), true);
                return;
            }
        }
        this.f18001q.f().e();
        if (bool == null) {
            this.f18001q.g().setNull(this.f18000p.f18013n);
        } else {
            this.f18001q.g().setBoolean(this.f18000p.f18013n, bool.booleanValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.TaskGroupPlan, io.realm.o5
    public void realmSet$assignedDate(Date date) {
        if (this.f18001q.i()) {
            if (!this.f18001q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18001q.g();
            if (date == null) {
                g10.getTable().F(this.f18000p.f18007h, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().A(this.f18000p.f18007h, g10.getObjectKey(), date, true);
                return;
            }
        }
        this.f18001q.f().e();
        if (date == null) {
            this.f18001q.g().setNull(this.f18000p.f18007h);
        } else {
            this.f18001q.g().setDate(this.f18000p.f18007h, date);
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.TaskGroupPlan, io.realm.o5
    public void realmSet$assignedUsers(x0<String> x0Var) {
        if (this.f18001q.i() && (!this.f18001q.d() || this.f18001q.e().contains("assignedUsers"))) {
            return;
        }
        this.f18001q.f().e();
        OsList valueList = this.f18001q.g().getValueList(this.f18000p.f18009j, RealmFieldType.STRING_LIST);
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

    @Override // com.habitrpg.android.habitica.models.tasks.TaskGroupPlan, io.realm.o5
    public void realmSet$assignedUsersDetail(x0<GroupAssignedDetails> x0Var) {
        int i10 = 0;
        if (this.f18001q.i()) {
            if (!this.f18001q.d() || this.f18001q.e().contains("assignedUsersDetail")) {
                return;
            }
            if (x0Var != null && !x0Var.p()) {
                o0 o0Var = (o0) this.f18001q.f();
                x0<GroupAssignedDetails> x0Var2 = new x0<>();
                Iterator<GroupAssignedDetails> it = x0Var.iterator();
                while (it.hasNext()) {
                    GroupAssignedDetails next = it.next();
                    if (next != null && !d1.isManaged(next)) {
                        x0Var2.add((GroupAssignedDetails) o0Var.D0(next, new v[0]));
                    } else {
                        x0Var2.add(next);
                    }
                }
                x0Var = x0Var2;
            }
        }
        this.f18001q.f().e();
        OsList modelList = this.f18001q.g().getModelList(this.f18000p.f18010k);
        if (x0Var != null && x0Var.size() == modelList.Y()) {
            int size = x0Var.size();
            while (i10 < size) {
                GroupAssignedDetails groupAssignedDetails = x0Var.get(i10);
                this.f18001q.c(groupAssignedDetails);
                modelList.V(i10, ((io.realm.internal.o) groupAssignedDetails).b().g().getObjectKey());
                i10++;
            }
            return;
        }
        modelList.K();
        if (x0Var == null) {
            return;
        }
        int size2 = x0Var.size();
        while (i10 < size2) {
            GroupAssignedDetails groupAssignedDetails2 = x0Var.get(i10);
            this.f18001q.c(groupAssignedDetails2);
            modelList.k(((io.realm.internal.o) groupAssignedDetails2).b().g().getObjectKey());
            i10++;
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.TaskGroupPlan, io.realm.o5
    public void realmSet$assigningUsername(String str) {
        if (this.f18001q.i()) {
            if (!this.f18001q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18001q.g();
            if (str == null) {
                g10.getTable().F(this.f18000p.f18008i, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18000p.f18008i, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18001q.f().e();
        if (str == null) {
            this.f18001q.g().setNull(this.f18000p.f18008i);
        } else {
            this.f18001q.g().setString(this.f18000p.f18008i, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.TaskGroupPlan, io.realm.o5
    public void realmSet$groupID(String str) {
        if (this.f18001q.i()) {
            if (!this.f18001q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18001q.g();
            if (str == null) {
                g10.getTable().F(this.f18000p.f18004e, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18000p.f18004e, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18001q.f().e();
        if (str == null) {
            this.f18001q.g().setNull(this.f18000p.f18004e);
        } else {
            this.f18001q.g().setString(this.f18000p.f18004e, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.TaskGroupPlan, io.realm.o5
    public void realmSet$managerNotes(String str) {
        if (this.f18001q.i()) {
            if (!this.f18001q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18001q.g();
            if (str == null) {
                g10.getTable().F(this.f18000p.f18005f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18000p.f18005f, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18001q.f().e();
        if (str == null) {
            this.f18001q.g().setNull(this.f18000p.f18005f);
        } else {
            this.f18001q.g().setString(this.f18000p.f18005f, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.TaskGroupPlan, io.realm.o5
    public void realmSet$sharedCompletion(String str) {
        if (this.f18001q.i()) {
            if (!this.f18001q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18001q.g();
            if (str == null) {
                g10.getTable().F(this.f18000p.f18006g, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18000p.f18006g, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18001q.f().e();
        if (str == null) {
            this.f18001q.g().setNull(this.f18000p.f18006g);
        } else {
            this.f18001q.g().setString(this.f18000p.f18006g, str);
        }
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        Date date;
        String str4;
        Boolean bool;
        Boolean bool2;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("TaskGroupPlan = proxy[");
        sb2.append("{groupID:");
        Object obj = "null";
        if (realmGet$groupID() == null) {
            str = "null";
        } else {
            str = realmGet$groupID();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{managerNotes:");
        if (realmGet$managerNotes() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$managerNotes();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{sharedCompletion:");
        if (realmGet$sharedCompletion() == null) {
            str3 = "null";
        } else {
            str3 = realmGet$sharedCompletion();
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{assignedDate:");
        if (realmGet$assignedDate() == null) {
            date = "null";
        } else {
            date = realmGet$assignedDate();
        }
        sb2.append(date);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{assigningUsername:");
        if (realmGet$assigningUsername() == null) {
            str4 = "null";
        } else {
            str4 = realmGet$assigningUsername();
        }
        sb2.append(str4);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{assignedUsers:");
        sb2.append("RealmList<String>[");
        sb2.append(realmGet$assignedUsers().size());
        sb2.append("]");
        sb2.append("}");
        sb2.append(",");
        sb2.append("{assignedUsersDetail:");
        sb2.append("RealmList<GroupAssignedDetails>[");
        sb2.append(realmGet$assignedUsersDetail().size());
        sb2.append("]");
        sb2.append("}");
        sb2.append(",");
        sb2.append("{approvalRequested:");
        if (realmGet$approvalRequested() == null) {
            bool = "null";
        } else {
            bool = realmGet$approvalRequested();
        }
        sb2.append(bool);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{approvalApproved:");
        if (realmGet$approvalApproved() == null) {
            bool2 = "null";
        } else {
            bool2 = realmGet$approvalApproved();
        }
        sb2.append(bool2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{approvalRequired:");
        if (realmGet$approvalRequired() != null) {
            obj = realmGet$approvalRequired();
        }
        sb2.append(obj);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
