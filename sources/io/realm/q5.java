package io.realm;

import com.habitrpg.android.habitica.models.Tag;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.models.tasks.TaskTag;
import io.realm.a;
import io.realm.com_habitrpg_android_habitica_models_tasks_TaskRealmProxy;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.w1;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_tasks_TaskTagRealmProxy.java */
/* loaded from: classes4.dex */
public class q5 extends TaskTag implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18132r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18133p;

    /* renamed from: q  reason: collision with root package name */
    private l0<TaskTag> f18134q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_tasks_TaskTagRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18135e;

        /* renamed from: f  reason: collision with root package name */
        long f18136f;

        a(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("TaskTag");
            this.f18135e = a("tag", "tag", b10);
            this.f18136f = a("task", "task", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18135e = aVar.f18135e;
            aVar2.f18136f = aVar.f18136f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q5() {
        this.f18134q.p();
    }

    public static TaskTag c(o0 o0Var, a aVar, TaskTag taskTag, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(taskTag);
        if (oVar != null) {
            return (TaskTag) oVar;
        }
        q5 i10 = i(o0Var, new OsObjectBuilder(o0Var.c1(TaskTag.class), set).e1());
        map.put(taskTag, i10);
        Tag realmGet$tag = taskTag.realmGet$tag();
        if (realmGet$tag == null) {
            i10.realmSet$tag(null);
        } else {
            Tag tag = (Tag) map.get(realmGet$tag);
            if (tag != null) {
                i10.realmSet$tag(tag);
            } else {
                i10.realmSet$tag(w1.d(o0Var, (w1.a) o0Var.R().e(Tag.class), realmGet$tag, z10, map, set));
            }
        }
        Task realmGet$task = taskTag.realmGet$task();
        if (realmGet$task == null) {
            i10.realmSet$task(null);
        } else {
            Task task = (Task) map.get(realmGet$task);
            if (task != null) {
                i10.realmSet$task(task);
            } else {
                i10.realmSet$task(com_habitrpg_android_habitica_models_tasks_TaskRealmProxy.d(o0Var, (com_habitrpg_android_habitica_models_tasks_TaskRealmProxy.a) o0Var.R().e(Task.class), realmGet$task, z10, map, set));
            }
        }
        return i10;
    }

    public static TaskTag d(o0 o0Var, a aVar, TaskTag taskTag, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((taskTag instanceof io.realm.internal.o) && !d1.isFrozen(taskTag)) {
            io.realm.internal.o oVar = (io.realm.internal.o) taskTag;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return taskTag;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(taskTag);
        if (oVar2 != null) {
            return (TaskTag) oVar2;
        }
        return c(o0Var, aVar, taskTag, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static TaskTag f(TaskTag taskTag, int i10, int i11, Map<a1, o.a<a1>> map) {
        TaskTag taskTag2;
        if (i10 <= i11 && taskTag != null) {
            o.a<a1> aVar = map.get(taskTag);
            if (aVar == null) {
                taskTag2 = new TaskTag();
                map.put(taskTag, new o.a<>(i10, taskTag2));
            } else if (i10 >= aVar.f17831a) {
                return (TaskTag) aVar.f17832b;
            } else {
                TaskTag taskTag3 = (TaskTag) aVar.f17832b;
                aVar.f17831a = i10;
                taskTag2 = taskTag3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) taskTag).b().f();
            int i12 = i10 + 1;
            taskTag2.realmSet$tag(w1.f(taskTag.realmGet$tag(), i12, i11, map));
            taskTag2.realmSet$task(com_habitrpg_android_habitica_models_tasks_TaskRealmProxy.f(taskTag.realmGet$task(), i12, i11, map));
            return taskTag2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "TaskTag", true, 2, 0);
        RealmFieldType realmFieldType = RealmFieldType.OBJECT;
        bVar.a("", "tag", realmFieldType, "Tag");
        bVar.a("", "task", realmFieldType, "Task");
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18132r;
    }

    static q5 i(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(TaskTag.class), false, Collections.emptyList());
        q5 q5Var = new q5();
        cVar.a();
        return q5Var;
    }

    static TaskTag k(o0 o0Var, a aVar, TaskTag taskTag, TaskTag taskTag2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(TaskTag.class), set);
        Tag realmGet$tag = taskTag2.realmGet$tag();
        if (realmGet$tag == null) {
            osObjectBuilder.Z0(aVar.f18135e);
        } else {
            Tag tag = (Tag) map.get(realmGet$tag);
            if (tag != null) {
                osObjectBuilder.a1(aVar.f18135e, tag);
            } else {
                osObjectBuilder.a1(aVar.f18135e, w1.d(o0Var, (w1.a) o0Var.R().e(Tag.class), realmGet$tag, true, map, set));
            }
        }
        Task realmGet$task = taskTag2.realmGet$task();
        if (realmGet$task == null) {
            osObjectBuilder.Z0(aVar.f18136f);
        } else {
            Task task = (Task) map.get(realmGet$task);
            if (task != null) {
                osObjectBuilder.a1(aVar.f18136f, task);
            } else {
                osObjectBuilder.a1(aVar.f18136f, com_habitrpg_android_habitica_models_tasks_TaskRealmProxy.d(o0Var, (com_habitrpg_android_habitica_models_tasks_TaskRealmProxy.a) o0Var.R().e(Task.class), realmGet$task, true, map, set));
            }
        }
        osObjectBuilder.f1((io.realm.internal.o) taskTag);
        return taskTag;
    }

    public static void l(o0 o0Var, TaskTag taskTag, TaskTag taskTag2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        k(o0Var, (a) o0Var.R().e(TaskTag.class), taskTag2, taskTag, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18134q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18133p = (a) cVar.c();
        l0<TaskTag> l0Var = new l0<>(this);
        this.f18134q = l0Var;
        l0Var.r(cVar.e());
        this.f18134q.s(cVar.f());
        this.f18134q.o(cVar.b());
        this.f18134q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18134q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        q5 q5Var = (q5) obj;
        io.realm.a f10 = this.f18134q.f();
        io.realm.a f11 = q5Var.f18134q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18134q.g().getTable().p();
        String p11 = q5Var.f18134q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18134q.g().getObjectKey() == q5Var.f18134q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18134q.f().getPath();
        String p10 = this.f18134q.g().getTable().p();
        long objectKey = this.f18134q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.tasks.TaskTag, io.realm.r5
    public Tag realmGet$tag() {
        this.f18134q.f().e();
        if (this.f18134q.g().isNullLink(this.f18133p.f18135e)) {
            return null;
        }
        return (Tag) this.f18134q.f().B(Tag.class, this.f18134q.g().getLink(this.f18133p.f18135e), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.tasks.TaskTag, io.realm.r5
    public Task realmGet$task() {
        this.f18134q.f().e();
        if (this.f18134q.g().isNullLink(this.f18133p.f18136f)) {
            return null;
        }
        return (Task) this.f18134q.f().B(Task.class, this.f18134q.g().getLink(this.f18133p.f18136f), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.tasks.TaskTag, io.realm.r5
    public void realmSet$tag(Tag tag) {
        o0 o0Var = (o0) this.f18134q.f();
        if (this.f18134q.i()) {
            if (!this.f18134q.d() || this.f18134q.e().contains("tag")) {
                return;
            }
            if (tag != null && !d1.isManaged(tag)) {
                tag = (Tag) o0Var.F0(tag, new v[0]);
            }
            io.realm.internal.q g10 = this.f18134q.g();
            if (tag == null) {
                g10.nullifyLink(this.f18133p.f18135e);
                return;
            }
            this.f18134q.c(tag);
            g10.getTable().D(this.f18133p.f18135e, g10.getObjectKey(), ((io.realm.internal.o) tag).b().g().getObjectKey(), true);
            return;
        }
        this.f18134q.f().e();
        if (tag == null) {
            this.f18134q.g().nullifyLink(this.f18133p.f18135e);
            return;
        }
        this.f18134q.c(tag);
        this.f18134q.g().setLink(this.f18133p.f18135e, ((io.realm.internal.o) tag).b().g().getObjectKey());
    }

    @Override // com.habitrpg.android.habitica.models.tasks.TaskTag, io.realm.r5
    public void realmSet$task(Task task) {
        o0 o0Var = (o0) this.f18134q.f();
        if (this.f18134q.i()) {
            if (!this.f18134q.d() || this.f18134q.e().contains("task")) {
                return;
            }
            if (task != null && !d1.isManaged(task)) {
                task = (Task) o0Var.F0(task, new v[0]);
            }
            io.realm.internal.q g10 = this.f18134q.g();
            if (task == null) {
                g10.nullifyLink(this.f18133p.f18136f);
                return;
            }
            this.f18134q.c(task);
            g10.getTable().D(this.f18133p.f18136f, g10.getObjectKey(), ((io.realm.internal.o) task).b().g().getObjectKey(), true);
            return;
        }
        this.f18134q.f().e();
        if (task == null) {
            this.f18134q.g().nullifyLink(this.f18133p.f18136f);
            return;
        }
        this.f18134q.c(task);
        this.f18134q.g().setLink(this.f18133p.f18136f, ((io.realm.internal.o) task).b().g().getObjectKey());
    }

    public String toString() {
        String str;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("TaskTag = proxy[");
        sb2.append("{tag:");
        String str2 = "null";
        if (realmGet$tag() == null) {
            str = "null";
        } else {
            str = "Tag";
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{task:");
        if (realmGet$task() != null) {
            str2 = "Task";
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
