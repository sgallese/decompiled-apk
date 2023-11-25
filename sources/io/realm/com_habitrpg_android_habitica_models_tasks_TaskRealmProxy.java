package io.realm;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.models.Tag;
import com.habitrpg.android.habitica.models.tasks.ChecklistItem;
import com.habitrpg.android.habitica.models.tasks.Days;
import com.habitrpg.android.habitica.models.tasks.RemindersItem;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.models.tasks.TaskGroupPlan;
import io.realm.a;
import io.realm.com_habitrpg_android_habitica_models_tasks_ChecklistItemRealmProxy;
import io.realm.com_habitrpg_android_habitica_models_tasks_RemindersItemRealmProxy;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.w1;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class com_habitrpg_android_habitica_models_tasks_TaskRealmProxy extends Task implements io.realm.internal.o {

    /* renamed from: y  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17428y = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17429p;

    /* renamed from: q  reason: collision with root package name */
    private l0<Task> f17430q;

    /* renamed from: r  reason: collision with root package name */
    private x0<Tag> f17431r;

    /* renamed from: u  reason: collision with root package name */
    private x0<ChecklistItem> f17432u;

    /* renamed from: v  reason: collision with root package name */
    private x0<RemindersItem> f17433v;

    /* renamed from: x  reason: collision with root package name */
    private x0<Date> f17434x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {
        long A;
        long B;
        long C;
        long D;
        long E;
        long F;
        long G;
        long H;
        long I;
        long J;
        long K;
        long L;
        long M;
        long N;
        long O;

        /* renamed from: e  reason: collision with root package name */
        long f17435e;

        /* renamed from: f  reason: collision with root package name */
        long f17436f;

        /* renamed from: g  reason: collision with root package name */
        long f17437g;

        /* renamed from: h  reason: collision with root package name */
        long f17438h;

        /* renamed from: i  reason: collision with root package name */
        long f17439i;

        /* renamed from: j  reason: collision with root package name */
        long f17440j;

        /* renamed from: k  reason: collision with root package name */
        long f17441k;

        /* renamed from: l  reason: collision with root package name */
        long f17442l;

        /* renamed from: m  reason: collision with root package name */
        long f17443m;

        /* renamed from: n  reason: collision with root package name */
        long f17444n;

        /* renamed from: o  reason: collision with root package name */
        long f17445o;

        /* renamed from: p  reason: collision with root package name */
        long f17446p;

        /* renamed from: q  reason: collision with root package name */
        long f17447q;

        /* renamed from: r  reason: collision with root package name */
        long f17448r;

        /* renamed from: s  reason: collision with root package name */
        long f17449s;

        /* renamed from: t  reason: collision with root package name */
        long f17450t;

        /* renamed from: u  reason: collision with root package name */
        long f17451u;

        /* renamed from: v  reason: collision with root package name */
        long f17452v;

        /* renamed from: w  reason: collision with root package name */
        long f17453w;

        /* renamed from: x  reason: collision with root package name */
        long f17454x;

        /* renamed from: y  reason: collision with root package name */
        long f17455y;

        /* renamed from: z  reason: collision with root package name */
        long f17456z;

        a(OsSchemaInfo osSchemaInfo) {
            super(37);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("Task");
            this.f17435e = a("combinedID", "combinedID", b10);
            this.f17436f = a("id", "id", b10);
            this.f17437g = a("ownerID", "ownerID", b10);
            this.f17438h = a("priority", "priority", b10);
            this.f17439i = a("text", "text", b10);
            this.f17440j = a("notes", "notes", b10);
            this.f17441k = a("typeValue", "typeValue", b10);
            this.f17442l = a("challengeID", "challengeID", b10);
            this.f17443m = a("challengeBroken", "challengeBroken", b10);
            this.f17444n = a("attributeValue", "attributeValue", b10);
            this.f17445o = a(AppMeasurementSdk.ConditionalUserProperty.VALUE, AppMeasurementSdk.ConditionalUserProperty.VALUE, b10);
            this.f17446p = a("tags", "tags", b10);
            this.f17447q = a("dateCreated", "dateCreated", b10);
            this.f17448r = a("position", "position", b10);
            this.f17449s = a("group", "group", b10);
            this.f17450t = a("up", "up", b10);
            this.f17451u = a("down", "down", b10);
            this.f17452v = a("counterUp", "counterUp", b10);
            this.f17453w = a("counterDown", "counterDown", b10);
            this.f17454x = a(Task.FILTER_COMPLETED, Task.FILTER_COMPLETED, b10);
            this.f17455y = a("checklist", "checklist", b10);
            this.f17456z = a("reminders", "reminders", b10);
            this.A = a("frequencyValue", "frequencyValue", b10);
            this.B = a("everyX", "everyX", b10);
            this.C = a("streak", "streak", b10);
            this.D = a("startDate", "startDate", b10);
            this.E = a("repeat", "repeat", b10);
            this.F = a("dueDate", "dueDate", b10);
            this.G = a("isDue", "isDue", b10);
            this.H = a("nextDue", "nextDue", b10);
            this.I = a("updatedAt", "updatedAt", b10);
            this.J = a("isSaving", "isSaving", b10);
            this.K = a("hasErrored", "hasErrored", b10);
            this.L = a("isCreating", "isCreating", b10);
            this.M = a("yesterDaily", "yesterDaily", b10);
            this.N = a("daysOfMonthString", "daysOfMonthString", b10);
            this.O = a("weeksOfMonthString", "weeksOfMonthString", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17435e = aVar.f17435e;
            aVar2.f17436f = aVar.f17436f;
            aVar2.f17437g = aVar.f17437g;
            aVar2.f17438h = aVar.f17438h;
            aVar2.f17439i = aVar.f17439i;
            aVar2.f17440j = aVar.f17440j;
            aVar2.f17441k = aVar.f17441k;
            aVar2.f17442l = aVar.f17442l;
            aVar2.f17443m = aVar.f17443m;
            aVar2.f17444n = aVar.f17444n;
            aVar2.f17445o = aVar.f17445o;
            aVar2.f17446p = aVar.f17446p;
            aVar2.f17447q = aVar.f17447q;
            aVar2.f17448r = aVar.f17448r;
            aVar2.f17449s = aVar.f17449s;
            aVar2.f17450t = aVar.f17450t;
            aVar2.f17451u = aVar.f17451u;
            aVar2.f17452v = aVar.f17452v;
            aVar2.f17453w = aVar.f17453w;
            aVar2.f17454x = aVar.f17454x;
            aVar2.f17455y = aVar.f17455y;
            aVar2.f17456z = aVar.f17456z;
            aVar2.A = aVar.A;
            aVar2.B = aVar.B;
            aVar2.C = aVar.C;
            aVar2.D = aVar.D;
            aVar2.E = aVar.E;
            aVar2.F = aVar.F;
            aVar2.G = aVar.G;
            aVar2.H = aVar.H;
            aVar2.I = aVar.I;
            aVar2.J = aVar.J;
            aVar2.K = aVar.K;
            aVar2.L = aVar.L;
            aVar2.M = aVar.M;
            aVar2.N = aVar.N;
            aVar2.O = aVar.O;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_habitrpg_android_habitica_models_tasks_TaskRealmProxy() {
        this.f17430q.p();
    }

    public static Task c(o0 o0Var, a aVar, Task task, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        int i10;
        io.realm.internal.o oVar = map.get(task);
        if (oVar != null) {
            return (Task) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Task.class), set);
        osObjectBuilder.c1(aVar.f17435e, task.realmGet$combinedID());
        osObjectBuilder.c1(aVar.f17436f, task.realmGet$id());
        osObjectBuilder.c1(aVar.f17437g, task.realmGet$ownerID());
        osObjectBuilder.T0(aVar.f17438h, Float.valueOf(task.realmGet$priority()));
        osObjectBuilder.c1(aVar.f17439i, task.realmGet$text());
        osObjectBuilder.c1(aVar.f17440j, task.realmGet$notes());
        osObjectBuilder.c1(aVar.f17441k, task.realmGet$typeValue());
        osObjectBuilder.c1(aVar.f17442l, task.realmGet$challengeID());
        osObjectBuilder.c1(aVar.f17443m, task.realmGet$challengeBroken());
        osObjectBuilder.c1(aVar.f17444n, task.realmGet$attributeValue());
        osObjectBuilder.N0(aVar.f17445o, Double.valueOf(task.realmGet$value()));
        osObjectBuilder.I0(aVar.f17447q, task.realmGet$dateCreated());
        osObjectBuilder.V0(aVar.f17448r, Integer.valueOf(task.realmGet$position()));
        osObjectBuilder.F0(aVar.f17450t, task.realmGet$up());
        osObjectBuilder.F0(aVar.f17451u, task.realmGet$down());
        osObjectBuilder.V0(aVar.f17452v, task.realmGet$counterUp());
        osObjectBuilder.V0(aVar.f17453w, task.realmGet$counterDown());
        osObjectBuilder.F0(aVar.f17454x, Boolean.valueOf(task.realmGet$completed()));
        osObjectBuilder.c1(aVar.A, task.realmGet$frequencyValue());
        osObjectBuilder.V0(aVar.B, task.realmGet$everyX());
        osObjectBuilder.V0(aVar.C, task.realmGet$streak());
        osObjectBuilder.I0(aVar.D, task.realmGet$startDate());
        osObjectBuilder.I0(aVar.F, task.realmGet$dueDate());
        osObjectBuilder.F0(aVar.G, task.realmGet$isDue());
        osObjectBuilder.J0(aVar.H, task.realmGet$nextDue());
        osObjectBuilder.I0(aVar.I, task.realmGet$updatedAt());
        osObjectBuilder.F0(aVar.J, Boolean.valueOf(task.realmGet$isSaving()));
        osObjectBuilder.F0(aVar.K, Boolean.valueOf(task.realmGet$hasErrored()));
        osObjectBuilder.F0(aVar.L, Boolean.valueOf(task.realmGet$isCreating()));
        osObjectBuilder.F0(aVar.M, Boolean.valueOf(task.realmGet$yesterDaily()));
        osObjectBuilder.c1(aVar.N, task.realmGet$daysOfMonthString());
        osObjectBuilder.c1(aVar.O, task.realmGet$weeksOfMonthString());
        com_habitrpg_android_habitica_models_tasks_TaskRealmProxy l10 = l(o0Var, osObjectBuilder.e1());
        map.put(task, l10);
        x0<Tag> realmGet$tags = task.realmGet$tags();
        if (realmGet$tags != null) {
            x0<Tag> realmGet$tags2 = l10.realmGet$tags();
            realmGet$tags2.clear();
            for (int i11 = 0; i11 < realmGet$tags.size(); i11++) {
                Tag tag = realmGet$tags.get(i11);
                Tag tag2 = (Tag) map.get(tag);
                if (tag2 != null) {
                    realmGet$tags2.add(tag2);
                } else {
                    realmGet$tags2.add(w1.d(o0Var, (w1.a) o0Var.R().e(Tag.class), tag, z10, map, set));
                }
            }
        }
        TaskGroupPlan realmGet$group = task.realmGet$group();
        if (realmGet$group == null) {
            l10.realmSet$group(null);
        } else if (((TaskGroupPlan) map.get(realmGet$group)) == null) {
            n5 k10 = n5.k(o0Var, o0Var.c1(TaskGroupPlan.class).s(l10.b().g().createEmbeddedObject(aVar.f17449s, RealmFieldType.OBJECT)));
            map.put(realmGet$group, k10);
            n5.n(o0Var, realmGet$group, k10, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachegroup.toString()");
        }
        x0<ChecklistItem> realmGet$checklist = task.realmGet$checklist();
        if (realmGet$checklist != null) {
            x0<ChecklistItem> realmGet$checklist2 = l10.realmGet$checklist();
            realmGet$checklist2.clear();
            int i12 = 0;
            while (i12 < realmGet$checklist.size()) {
                ChecklistItem checklistItem = realmGet$checklist.get(i12);
                ChecklistItem checklistItem2 = (ChecklistItem) map.get(checklistItem);
                if (checklistItem2 != null) {
                    realmGet$checklist2.add(checklistItem2);
                    i10 = i12;
                } else {
                    i10 = i12;
                    realmGet$checklist2.add(com_habitrpg_android_habitica_models_tasks_ChecklistItemRealmProxy.d(o0Var, (com_habitrpg_android_habitica_models_tasks_ChecklistItemRealmProxy.a) o0Var.R().e(ChecklistItem.class), checklistItem, z10, map, set));
                }
                i12 = i10 + 1;
            }
        }
        x0<RemindersItem> realmGet$reminders = task.realmGet$reminders();
        if (realmGet$reminders != null) {
            x0<RemindersItem> realmGet$reminders2 = l10.realmGet$reminders();
            realmGet$reminders2.clear();
            for (int i13 = 0; i13 < realmGet$reminders.size(); i13++) {
                RemindersItem remindersItem = realmGet$reminders.get(i13);
                RemindersItem remindersItem2 = (RemindersItem) map.get(remindersItem);
                if (remindersItem2 != null) {
                    realmGet$reminders2.add(remindersItem2);
                } else {
                    realmGet$reminders2.add(com_habitrpg_android_habitica_models_tasks_RemindersItemRealmProxy.d(o0Var, (com_habitrpg_android_habitica_models_tasks_RemindersItemRealmProxy.a) o0Var.R().e(RemindersItem.class), remindersItem, z10, map, set));
                }
            }
        }
        Days realmGet$repeat = task.realmGet$repeat();
        if (realmGet$repeat == null) {
            l10.realmSet$repeat(null);
        } else if (((Days) map.get(realmGet$repeat)) == null) {
            com_habitrpg_android_habitica_models_tasks_DaysRealmProxy k11 = com_habitrpg_android_habitica_models_tasks_DaysRealmProxy.k(o0Var, o0Var.c1(Days.class).s(l10.b().g().createEmbeddedObject(aVar.E, RealmFieldType.OBJECT)));
            map.put(realmGet$repeat, k11);
            com_habitrpg_android_habitica_models_tasks_DaysRealmProxy.n(o0Var, realmGet$repeat, k11, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacherepeat.toString()");
        }
        return l10;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.habitrpg.android.habitica.models.tasks.Task d(io.realm.o0 r8, io.realm.com_habitrpg_android_habitica_models_tasks_TaskRealmProxy.a r9, com.habitrpg.android.habitica.models.tasks.Task r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
        /*
            boolean r0 = r10 instanceof io.realm.internal.o
            if (r0 == 0) goto L3e
            boolean r0 = io.realm.d1.isFrozen(r10)
            if (r0 != 0) goto L3e
            r0 = r10
            io.realm.internal.o r0 = (io.realm.internal.o) r0
            io.realm.l0 r1 = r0.b()
            io.realm.a r1 = r1.f()
            if (r1 == 0) goto L3e
            io.realm.l0 r0 = r0.b()
            io.realm.a r0 = r0.f()
            long r1 = r0.f17239m
            long r3 = r8.f17239m
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L36
            java.lang.String r0 = r0.getPath()
            java.lang.String r1 = r8.getPath()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3e
            return r10
        L36:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Objects which belong to Realm instances in other threads cannot be copied into this Realm instance."
            r8.<init>(r9)
            throw r8
        L3e:
            io.realm.a$d r0 = io.realm.a.f17237x
            java.lang.Object r0 = r0.get()
            io.realm.a$c r0 = (io.realm.a.c) r0
            java.lang.Object r1 = r12.get(r10)
            io.realm.internal.o r1 = (io.realm.internal.o) r1
            if (r1 == 0) goto L51
            com.habitrpg.android.habitica.models.tasks.Task r1 = (com.habitrpg.android.habitica.models.tasks.Task) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L93
            java.lang.Class<com.habitrpg.android.habitica.models.tasks.Task> r2 = com.habitrpg.android.habitica.models.tasks.Task.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f17435e
            java.lang.String r5 = r10.realmGet$combinedID()
            if (r5 != 0) goto L67
            long r3 = r2.d(r3)
            goto L6b
        L67:
            long r3 = r2.e(r3, r5)
        L6b:
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L73
            r0 = 0
            goto L94
        L73:
            io.realm.internal.UncheckedRow r3 = r2.s(r3)     // Catch: java.lang.Throwable -> L8e
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L8e
            r1 = r0
            r2 = r8
            r4 = r9
            r1.g(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L8e
            io.realm.com_habitrpg_android_habitica_models_tasks_TaskRealmProxy r1 = new io.realm.com_habitrpg_android_habitica_models_tasks_TaskRealmProxy     // Catch: java.lang.Throwable -> L8e
            r1.<init>()     // Catch: java.lang.Throwable -> L8e
            r12.put(r10, r1)     // Catch: java.lang.Throwable -> L8e
            r0.a()
            goto L93
        L8e:
            r8 = move-exception
            r0.a()
            throw r8
        L93:
            r0 = r11
        L94:
            r3 = r1
            if (r0 == 0) goto La1
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            com.habitrpg.android.habitica.models.tasks.Task r8 = n(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.habitrpg.android.habitica.models.tasks.Task r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_habitrpg_android_habitica_models_tasks_TaskRealmProxy.d(io.realm.o0, io.realm.com_habitrpg_android_habitica_models_tasks_TaskRealmProxy$a, com.habitrpg.android.habitica.models.tasks.Task, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.tasks.Task");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static Task f(Task task, int i10, int i11, Map<a1, o.a<a1>> map) {
        Task task2;
        if (i10 > i11 || task == null) {
            return null;
        }
        o.a<a1> aVar = map.get(task);
        if (aVar == null) {
            task2 = new Task();
            map.put(task, new o.a<>(i10, task2));
        } else if (i10 >= aVar.f17831a) {
            return (Task) aVar.f17832b;
        } else {
            Task task3 = (Task) aVar.f17832b;
            aVar.f17831a = i10;
            task2 = task3;
        }
        o0 o0Var = (o0) ((io.realm.internal.o) task).b().f();
        task2.realmSet$combinedID(task.realmGet$combinedID());
        task2.realmSet$id(task.realmGet$id());
        task2.realmSet$ownerID(task.realmGet$ownerID());
        task2.realmSet$priority(task.realmGet$priority());
        task2.realmSet$text(task.realmGet$text());
        task2.realmSet$notes(task.realmGet$notes());
        task2.realmSet$typeValue(task.realmGet$typeValue());
        task2.realmSet$challengeID(task.realmGet$challengeID());
        task2.realmSet$challengeBroken(task.realmGet$challengeBroken());
        task2.realmSet$attributeValue(task.realmGet$attributeValue());
        task2.realmSet$value(task.realmGet$value());
        if (i10 == i11) {
            task2.realmSet$tags(null);
        } else {
            x0<Tag> realmGet$tags = task.realmGet$tags();
            x0<Tag> x0Var = new x0<>();
            task2.realmSet$tags(x0Var);
            int i12 = i10 + 1;
            int size = realmGet$tags.size();
            for (int i13 = 0; i13 < size; i13++) {
                x0Var.add(w1.f(realmGet$tags.get(i13), i12, i11, map));
            }
        }
        task2.realmSet$dateCreated(task.realmGet$dateCreated());
        task2.realmSet$position(task.realmGet$position());
        int i14 = i10 + 1;
        task2.realmSet$group(n5.f(task.realmGet$group(), i14, i11, map));
        task2.realmSet$up(task.realmGet$up());
        task2.realmSet$down(task.realmGet$down());
        task2.realmSet$counterUp(task.realmGet$counterUp());
        task2.realmSet$counterDown(task.realmGet$counterDown());
        task2.realmSet$completed(task.realmGet$completed());
        if (i10 == i11) {
            task2.realmSet$checklist(null);
        } else {
            x0<ChecklistItem> realmGet$checklist = task.realmGet$checklist();
            x0<ChecklistItem> x0Var2 = new x0<>();
            task2.realmSet$checklist(x0Var2);
            int size2 = realmGet$checklist.size();
            for (int i15 = 0; i15 < size2; i15++) {
                x0Var2.add(com_habitrpg_android_habitica_models_tasks_ChecklistItemRealmProxy.f(realmGet$checklist.get(i15), i14, i11, map));
            }
        }
        if (i10 == i11) {
            task2.realmSet$reminders(null);
        } else {
            x0<RemindersItem> realmGet$reminders = task.realmGet$reminders();
            x0<RemindersItem> x0Var3 = new x0<>();
            task2.realmSet$reminders(x0Var3);
            int size3 = realmGet$reminders.size();
            for (int i16 = 0; i16 < size3; i16++) {
                x0Var3.add(com_habitrpg_android_habitica_models_tasks_RemindersItemRealmProxy.f(realmGet$reminders.get(i16), i14, i11, map));
            }
        }
        task2.realmSet$frequencyValue(task.realmGet$frequencyValue());
        task2.realmSet$everyX(task.realmGet$everyX());
        task2.realmSet$streak(task.realmGet$streak());
        task2.realmSet$startDate(task.realmGet$startDate());
        task2.realmSet$repeat(com_habitrpg_android_habitica_models_tasks_DaysRealmProxy.f(task.realmGet$repeat(), i14, i11, map));
        task2.realmSet$dueDate(task.realmGet$dueDate());
        task2.realmSet$isDue(task.realmGet$isDue());
        task2.realmSet$nextDue(new x0<>());
        task2.realmGet$nextDue().addAll(task.realmGet$nextDue());
        task2.realmSet$updatedAt(task.realmGet$updatedAt());
        task2.realmSet$isSaving(task.realmGet$isSaving());
        task2.realmSet$hasErrored(task.realmGet$hasErrored());
        task2.realmSet$isCreating(task.realmGet$isCreating());
        task2.realmSet$yesterDaily(task.realmGet$yesterDaily());
        task2.realmSet$daysOfMonthString(task.realmGet$daysOfMonthString());
        task2.realmSet$weeksOfMonthString(task.realmGet$weeksOfMonthString());
        return task2;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "Task", false, 37, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "combinedID", realmFieldType, true, false, false);
        bVar.b("", "id", realmFieldType, false, false, false);
        bVar.b("", "ownerID", realmFieldType, false, false, true);
        bVar.b("", "priority", RealmFieldType.FLOAT, false, false, true);
        bVar.b("", "text", realmFieldType, false, false, true);
        bVar.b("", "notes", realmFieldType, false, false, false);
        bVar.b("", "typeValue", realmFieldType, false, false, false);
        bVar.b("", "challengeID", realmFieldType, false, false, false);
        bVar.b("", "challengeBroken", realmFieldType, false, false, false);
        bVar.b("", "attributeValue", realmFieldType, false, false, false);
        bVar.b("", AppMeasurementSdk.ConditionalUserProperty.VALUE, RealmFieldType.DOUBLE, false, false, true);
        RealmFieldType realmFieldType2 = RealmFieldType.LIST;
        bVar.a("", "tags", realmFieldType2, "Tag");
        RealmFieldType realmFieldType3 = RealmFieldType.DATE;
        bVar.b("", "dateCreated", realmFieldType3, false, false, false);
        RealmFieldType realmFieldType4 = RealmFieldType.INTEGER;
        bVar.b("", "position", realmFieldType4, false, false, true);
        RealmFieldType realmFieldType5 = RealmFieldType.OBJECT;
        bVar.a("", "group", realmFieldType5, "TaskGroupPlan");
        RealmFieldType realmFieldType6 = RealmFieldType.BOOLEAN;
        bVar.b("", "up", realmFieldType6, false, false, false);
        bVar.b("", "down", realmFieldType6, false, false, false);
        bVar.b("", "counterUp", realmFieldType4, false, false, false);
        bVar.b("", "counterDown", realmFieldType4, false, false, false);
        bVar.b("", Task.FILTER_COMPLETED, realmFieldType6, false, false, true);
        bVar.a("", "checklist", realmFieldType2, "ChecklistItem");
        bVar.a("", "reminders", realmFieldType2, "RemindersItem");
        bVar.b("", "frequencyValue", realmFieldType, false, false, false);
        bVar.b("", "everyX", realmFieldType4, false, false, false);
        bVar.b("", "streak", realmFieldType4, false, false, false);
        bVar.b("", "startDate", realmFieldType3, false, false, false);
        bVar.a("", "repeat", realmFieldType5, "Days");
        bVar.b("", "dueDate", realmFieldType3, false, false, false);
        bVar.b("", "isDue", realmFieldType6, false, false, false);
        bVar.c("", "nextDue", RealmFieldType.DATE_LIST, false);
        bVar.b("", "updatedAt", realmFieldType3, false, false, false);
        bVar.b("", "isSaving", realmFieldType6, false, false, true);
        bVar.b("", "hasErrored", realmFieldType6, false, false, true);
        bVar.b("", "isCreating", realmFieldType6, false, false, true);
        bVar.b("", "yesterDaily", realmFieldType6, false, false, true);
        bVar.b("", "daysOfMonthString", realmFieldType, false, false, false);
        bVar.b("", "weeksOfMonthString", realmFieldType, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17428y;
    }

    public static long i(o0 o0Var, Task task, Map<a1, Long> map) {
        long nativeFindFirstString;
        long j10;
        long j11;
        long j12;
        Table table;
        long j13;
        a aVar;
        long j14;
        String str;
        a aVar2;
        long j15;
        long j16;
        Table table2;
        Table table3;
        long j17;
        if ((task instanceof io.realm.internal.o) && !d1.isFrozen(task)) {
            io.realm.internal.o oVar = (io.realm.internal.o) task;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(Task.class);
        long nativePtr = c12.getNativePtr();
        a aVar3 = (a) o0Var.R().e(Task.class);
        long j18 = aVar3.f17435e;
        String realmGet$combinedID = task.realmGet$combinedID();
        if (realmGet$combinedID == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j18);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j18, realmGet$combinedID);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(c12, j18, realmGet$combinedID);
        }
        long j19 = nativeFindFirstString;
        map.put(task, Long.valueOf(j19));
        String realmGet$id = task.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, aVar3.f17436f, j19, realmGet$id, false);
            j10 = j19;
            j11 = nativePtr;
        } else {
            j10 = j19;
            j11 = nativePtr;
            Table.nativeSetNull(nativePtr, aVar3.f17436f, j10, false);
        }
        String realmGet$ownerID = task.realmGet$ownerID();
        if (realmGet$ownerID != null) {
            long j20 = j10;
            Table.nativeSetString(j11, aVar3.f17437g, j20, realmGet$ownerID, false);
            j10 = j20;
        } else {
            Table.nativeSetNull(j11, aVar3.f17437g, j10, false);
        }
        long j21 = j10;
        Table.nativeSetFloat(j11, aVar3.f17438h, j21, task.realmGet$priority(), false);
        String realmGet$text = task.realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(j11, aVar3.f17439i, j21, realmGet$text, false);
            j12 = j21;
        } else {
            j12 = j21;
            Table.nativeSetNull(j11, aVar3.f17439i, j21, false);
        }
        String realmGet$notes = task.realmGet$notes();
        if (realmGet$notes != null) {
            long j22 = j12;
            Table.nativeSetString(j11, aVar3.f17440j, j22, realmGet$notes, false);
            j12 = j22;
        } else {
            Table.nativeSetNull(j11, aVar3.f17440j, j12, false);
        }
        String realmGet$typeValue = task.realmGet$typeValue();
        if (realmGet$typeValue != null) {
            long j23 = j12;
            Table.nativeSetString(j11, aVar3.f17441k, j23, realmGet$typeValue, false);
            j12 = j23;
        } else {
            Table.nativeSetNull(j11, aVar3.f17441k, j12, false);
        }
        String realmGet$challengeID = task.realmGet$challengeID();
        if (realmGet$challengeID != null) {
            long j24 = j12;
            Table.nativeSetString(j11, aVar3.f17442l, j24, realmGet$challengeID, false);
            j12 = j24;
        } else {
            Table.nativeSetNull(j11, aVar3.f17442l, j12, false);
        }
        String realmGet$challengeBroken = task.realmGet$challengeBroken();
        if (realmGet$challengeBroken != null) {
            long j25 = j12;
            Table.nativeSetString(j11, aVar3.f17443m, j25, realmGet$challengeBroken, false);
            j12 = j25;
        } else {
            Table.nativeSetNull(j11, aVar3.f17443m, j12, false);
        }
        String realmGet$attributeValue = task.realmGet$attributeValue();
        if (realmGet$attributeValue != null) {
            long j26 = j12;
            Table.nativeSetString(j11, aVar3.f17444n, j26, realmGet$attributeValue, false);
            j12 = j26;
        } else {
            Table.nativeSetNull(j11, aVar3.f17444n, j12, false);
        }
        long j27 = j12;
        Table.nativeSetDouble(j11, aVar3.f17445o, j27, task.realmGet$value(), false);
        OsList osList = new OsList(c12.s(j27), aVar3.f17446p);
        x0<Tag> realmGet$tags = task.realmGet$tags();
        if (realmGet$tags != null && realmGet$tags.size() == osList.Y()) {
            int size = realmGet$tags.size();
            int i10 = 0;
            while (i10 < size) {
                Tag tag = realmGet$tags.get(i10);
                Long l10 = map.get(tag);
                if (l10 == null) {
                    l10 = Long.valueOf(w1.i(o0Var, tag, map));
                }
                osList.V(i10, l10.longValue());
                i10++;
                c12 = c12;
            }
            table = c12;
        } else {
            table = c12;
            osList.K();
            if (realmGet$tags != null) {
                Iterator<Tag> it = realmGet$tags.iterator();
                while (it.hasNext()) {
                    Tag next = it.next();
                    Long l11 = map.get(next);
                    if (l11 == null) {
                        l11 = Long.valueOf(w1.i(o0Var, next, map));
                    }
                    osList.k(l11.longValue());
                }
            }
        }
        Date realmGet$dateCreated = task.realmGet$dateCreated();
        if (realmGet$dateCreated != null) {
            Table.nativeSetTimestamp(j11, aVar3.f17447q, j27, realmGet$dateCreated.getTime(), false);
            j13 = j27;
        } else {
            j13 = j27;
            Table.nativeSetNull(j11, aVar3.f17447q, j27, false);
        }
        long j28 = j13;
        Table.nativeSetLong(j11, aVar3.f17448r, j28, task.realmGet$position(), false);
        TaskGroupPlan realmGet$group = task.realmGet$group();
        if (realmGet$group != null) {
            Long l12 = map.get(realmGet$group);
            if (l12 == null) {
                aVar = aVar3;
                j14 = j28;
                n5.i(o0Var, table, aVar3.f17449s, j28, realmGet$group, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l12.toString());
            }
        } else {
            aVar = aVar3;
            j14 = j28;
            Table.nativeNullifyLink(j11, aVar.f17449s, j14);
        }
        Boolean realmGet$up = task.realmGet$up();
        if (realmGet$up != null) {
            long j29 = aVar.f17450t;
            boolean booleanValue = realmGet$up.booleanValue();
            long j30 = j14;
            str = "Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: ";
            aVar2 = aVar;
            Table.nativeSetBoolean(j11, j29, j30, booleanValue, false);
            j15 = j30;
        } else {
            long j31 = j14;
            str = "Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: ";
            aVar2 = aVar;
            j15 = j31;
            Table.nativeSetNull(j11, aVar2.f17450t, j31, false);
        }
        Boolean realmGet$down = task.realmGet$down();
        if (realmGet$down != null) {
            long j32 = j15;
            Table.nativeSetBoolean(j11, aVar2.f17451u, j32, realmGet$down.booleanValue(), false);
            j15 = j32;
        } else {
            Table.nativeSetNull(j11, aVar2.f17451u, j15, false);
        }
        Integer realmGet$counterUp = task.realmGet$counterUp();
        if (realmGet$counterUp != null) {
            long j33 = j15;
            Table.nativeSetLong(j11, aVar2.f17452v, j33, realmGet$counterUp.longValue(), false);
            j15 = j33;
        } else {
            Table.nativeSetNull(j11, aVar2.f17452v, j15, false);
        }
        Integer realmGet$counterDown = task.realmGet$counterDown();
        if (realmGet$counterDown != null) {
            long j34 = j15;
            Table.nativeSetLong(j11, aVar2.f17453w, j34, realmGet$counterDown.longValue(), false);
            j15 = j34;
        } else {
            Table.nativeSetNull(j11, aVar2.f17453w, j15, false);
        }
        long j35 = j15;
        Table.nativeSetBoolean(j11, aVar2.f17454x, j35, task.realmGet$completed(), false);
        Table table4 = table;
        OsList osList2 = new OsList(table4.s(j35), aVar2.f17455y);
        x0<ChecklistItem> realmGet$checklist = task.realmGet$checklist();
        if (realmGet$checklist != null && realmGet$checklist.size() == osList2.Y()) {
            int size2 = realmGet$checklist.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ChecklistItem checklistItem = realmGet$checklist.get(i11);
                Long l13 = map.get(checklistItem);
                if (l13 == null) {
                    l13 = Long.valueOf(com_habitrpg_android_habitica_models_tasks_ChecklistItemRealmProxy.i(o0Var, checklistItem, map));
                }
                osList2.V(i11, l13.longValue());
            }
        } else {
            osList2.K();
            if (realmGet$checklist != null) {
                Iterator<ChecklistItem> it2 = realmGet$checklist.iterator();
                while (it2.hasNext()) {
                    ChecklistItem next2 = it2.next();
                    Long l14 = map.get(next2);
                    if (l14 == null) {
                        l14 = Long.valueOf(com_habitrpg_android_habitica_models_tasks_ChecklistItemRealmProxy.i(o0Var, next2, map));
                    }
                    osList2.k(l14.longValue());
                }
            }
        }
        OsList osList3 = new OsList(table4.s(j35), aVar2.f17456z);
        x0<RemindersItem> realmGet$reminders = task.realmGet$reminders();
        if (realmGet$reminders != null && realmGet$reminders.size() == osList3.Y()) {
            int size3 = realmGet$reminders.size();
            for (int i12 = 0; i12 < size3; i12++) {
                RemindersItem remindersItem = realmGet$reminders.get(i12);
                Long l15 = map.get(remindersItem);
                if (l15 == null) {
                    l15 = Long.valueOf(com_habitrpg_android_habitica_models_tasks_RemindersItemRealmProxy.i(o0Var, remindersItem, map));
                }
                osList3.V(i12, l15.longValue());
            }
        } else {
            osList3.K();
            if (realmGet$reminders != null) {
                Iterator<RemindersItem> it3 = realmGet$reminders.iterator();
                while (it3.hasNext()) {
                    RemindersItem next3 = it3.next();
                    Long l16 = map.get(next3);
                    if (l16 == null) {
                        l16 = Long.valueOf(com_habitrpg_android_habitica_models_tasks_RemindersItemRealmProxy.i(o0Var, next3, map));
                    }
                    osList3.k(l16.longValue());
                }
            }
        }
        String realmGet$frequencyValue = task.realmGet$frequencyValue();
        if (realmGet$frequencyValue != null) {
            Table.nativeSetString(j11, aVar2.A, j35, realmGet$frequencyValue, false);
            j16 = j35;
            table2 = table4;
        } else {
            j16 = j35;
            table2 = table4;
            Table.nativeSetNull(j11, aVar2.A, j35, false);
        }
        Integer realmGet$everyX = task.realmGet$everyX();
        if (realmGet$everyX != null) {
            long j36 = j16;
            Table.nativeSetLong(j11, aVar2.B, j36, realmGet$everyX.longValue(), false);
            j16 = j36;
            table2 = table2;
        } else {
            Table.nativeSetNull(j11, aVar2.B, j16, false);
        }
        Integer realmGet$streak = task.realmGet$streak();
        if (realmGet$streak != null) {
            long j37 = j16;
            Table.nativeSetLong(j11, aVar2.C, j37, realmGet$streak.longValue(), false);
            j16 = j37;
            table2 = table2;
        } else {
            Table.nativeSetNull(j11, aVar2.C, j16, false);
        }
        Date realmGet$startDate = task.realmGet$startDate();
        if (realmGet$startDate != null) {
            long j38 = j16;
            Table.nativeSetTimestamp(j11, aVar2.D, j38, realmGet$startDate.getTime(), false);
            j16 = j38;
            table2 = table2;
        } else {
            Table.nativeSetNull(j11, aVar2.D, j16, false);
        }
        Days realmGet$repeat = task.realmGet$repeat();
        if (realmGet$repeat != null) {
            Long l17 = map.get(realmGet$repeat);
            if (l17 == null) {
                com_habitrpg_android_habitica_models_tasks_DaysRealmProxy.i(o0Var, table2, aVar2.E, j16, realmGet$repeat, map);
            } else {
                throw new IllegalArgumentException(str + l17.toString());
            }
        } else {
            Table.nativeNullifyLink(j11, aVar2.E, j16);
        }
        Date realmGet$dueDate = task.realmGet$dueDate();
        if (realmGet$dueDate != null) {
            long j39 = aVar2.F;
            long time = realmGet$dueDate.getTime();
            table3 = table2;
            long j40 = j16;
            Table.nativeSetTimestamp(j11, j39, j40, time, false);
            j16 = j40;
        } else {
            table3 = table2;
            Table.nativeSetNull(j11, aVar2.F, j16, false);
        }
        Boolean realmGet$isDue = task.realmGet$isDue();
        if (realmGet$isDue != null) {
            Table.nativeSetBoolean(j11, aVar2.G, j16, realmGet$isDue.booleanValue(), false);
        } else {
            Table.nativeSetNull(j11, aVar2.G, j16, false);
        }
        OsList osList4 = new OsList(table3.s(j16), aVar2.H);
        osList4.K();
        x0<Date> realmGet$nextDue = task.realmGet$nextDue();
        if (realmGet$nextDue != null) {
            Iterator<Date> it4 = realmGet$nextDue.iterator();
            while (it4.hasNext()) {
                Date next4 = it4.next();
                if (next4 == null) {
                    osList4.h();
                } else {
                    osList4.c(next4);
                }
            }
        }
        Date realmGet$updatedAt = task.realmGet$updatedAt();
        if (realmGet$updatedAt != null) {
            j17 = j16;
            Table.nativeSetTimestamp(j11, aVar2.I, j17, realmGet$updatedAt.getTime(), false);
        } else {
            j17 = j16;
            Table.nativeSetNull(j11, aVar2.I, j17, false);
        }
        long j41 = j11;
        long j42 = j17;
        Table.nativeSetBoolean(j41, aVar2.J, j42, task.realmGet$isSaving(), false);
        Table.nativeSetBoolean(j41, aVar2.K, j42, task.realmGet$hasErrored(), false);
        Table.nativeSetBoolean(j41, aVar2.L, j42, task.realmGet$isCreating(), false);
        Table.nativeSetBoolean(j41, aVar2.M, j42, task.realmGet$yesterDaily(), false);
        String realmGet$daysOfMonthString = task.realmGet$daysOfMonthString();
        if (realmGet$daysOfMonthString != null) {
            Table.nativeSetString(j11, aVar2.N, j17, realmGet$daysOfMonthString, false);
        } else {
            Table.nativeSetNull(j11, aVar2.N, j17, false);
        }
        String realmGet$weeksOfMonthString = task.realmGet$weeksOfMonthString();
        if (realmGet$weeksOfMonthString != null) {
            Table.nativeSetString(j11, aVar2.O, j17, realmGet$weeksOfMonthString, false);
        } else {
            Table.nativeSetNull(j11, aVar2.O, j17, false);
        }
        return j17;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long nativeFindFirstString;
        long j10;
        long j11;
        long j12;
        long j13;
        Task task;
        long j14;
        long j15;
        long j16;
        a aVar;
        long j17;
        a aVar2;
        long j18;
        String str;
        String str2;
        a aVar3;
        long j19;
        Table c12 = o0Var.c1(Task.class);
        long nativePtr = c12.getNativePtr();
        a aVar4 = (a) o0Var.R().e(Task.class);
        long j20 = aVar4.f17435e;
        while (it.hasNext()) {
            Task task2 = (Task) it.next();
            if (!map.containsKey(task2)) {
                if ((task2 instanceof io.realm.internal.o) && !d1.isFrozen(task2)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) task2;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(task2, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$combinedID = task2.realmGet$combinedID();
                if (realmGet$combinedID == null) {
                    nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j20);
                } else {
                    nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j20, realmGet$combinedID);
                }
                if (nativeFindFirstString == -1) {
                    j10 = OsObject.createRowWithPrimaryKey(c12, j20, realmGet$combinedID);
                } else {
                    j10 = nativeFindFirstString;
                }
                map.put(task2, Long.valueOf(j10));
                String realmGet$id = task2.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetString(nativePtr, aVar4.f17436f, j10, realmGet$id, false);
                    j11 = j10;
                    j12 = j20;
                    j13 = nativePtr;
                    task = task2;
                } else {
                    j11 = j10;
                    j12 = j20;
                    j13 = nativePtr;
                    task = task2;
                    Table.nativeSetNull(nativePtr, aVar4.f17436f, j11, false);
                }
                String realmGet$ownerID = task.realmGet$ownerID();
                if (realmGet$ownerID != null) {
                    long j21 = j11;
                    Table.nativeSetString(j13, aVar4.f17437g, j21, realmGet$ownerID, false);
                    j14 = j21;
                } else {
                    long j22 = j11;
                    j14 = j22;
                    Table.nativeSetNull(j13, aVar4.f17437g, j22, false);
                }
                long j23 = j14;
                Table.nativeSetFloat(j13, aVar4.f17438h, j23, task.realmGet$priority(), false);
                String realmGet$text = task.realmGet$text();
                if (realmGet$text != null) {
                    Table.nativeSetString(j13, aVar4.f17439i, j23, realmGet$text, false);
                    j15 = j23;
                } else {
                    j15 = j23;
                    Table.nativeSetNull(j13, aVar4.f17439i, j23, false);
                }
                String realmGet$notes = task.realmGet$notes();
                if (realmGet$notes != null) {
                    long j24 = j15;
                    Table.nativeSetString(j13, aVar4.f17440j, j24, realmGet$notes, false);
                    j15 = j24;
                } else {
                    Table.nativeSetNull(j13, aVar4.f17440j, j15, false);
                }
                String realmGet$typeValue = task.realmGet$typeValue();
                if (realmGet$typeValue != null) {
                    long j25 = j15;
                    Table.nativeSetString(j13, aVar4.f17441k, j25, realmGet$typeValue, false);
                    j15 = j25;
                } else {
                    Table.nativeSetNull(j13, aVar4.f17441k, j15, false);
                }
                String realmGet$challengeID = task.realmGet$challengeID();
                if (realmGet$challengeID != null) {
                    long j26 = j15;
                    Table.nativeSetString(j13, aVar4.f17442l, j26, realmGet$challengeID, false);
                    j15 = j26;
                } else {
                    Table.nativeSetNull(j13, aVar4.f17442l, j15, false);
                }
                String realmGet$challengeBroken = task.realmGet$challengeBroken();
                if (realmGet$challengeBroken != null) {
                    long j27 = j15;
                    Table.nativeSetString(j13, aVar4.f17443m, j27, realmGet$challengeBroken, false);
                    j15 = j27;
                } else {
                    Table.nativeSetNull(j13, aVar4.f17443m, j15, false);
                }
                String realmGet$attributeValue = task.realmGet$attributeValue();
                if (realmGet$attributeValue != null) {
                    long j28 = j15;
                    Table.nativeSetString(j13, aVar4.f17444n, j28, realmGet$attributeValue, false);
                    j15 = j28;
                } else {
                    Table.nativeSetNull(j13, aVar4.f17444n, j15, false);
                }
                long j29 = j15;
                Table.nativeSetDouble(j13, aVar4.f17445o, j29, task.realmGet$value(), false);
                OsList osList = new OsList(c12.s(j29), aVar4.f17446p);
                x0<Tag> realmGet$tags = task.realmGet$tags();
                if (realmGet$tags != null && realmGet$tags.size() == osList.Y()) {
                    int size = realmGet$tags.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        Tag tag = realmGet$tags.get(i10);
                        Long l10 = map.get(tag);
                        if (l10 == null) {
                            l10 = Long.valueOf(w1.i(o0Var, tag, map));
                        }
                        osList.V(i10, l10.longValue());
                    }
                } else {
                    osList.K();
                    if (realmGet$tags != null) {
                        Iterator<Tag> it2 = realmGet$tags.iterator();
                        while (it2.hasNext()) {
                            Tag next = it2.next();
                            Long l11 = map.get(next);
                            if (l11 == null) {
                                l11 = Long.valueOf(w1.i(o0Var, next, map));
                            }
                            osList.k(l11.longValue());
                        }
                    }
                }
                Date realmGet$dateCreated = task.realmGet$dateCreated();
                if (realmGet$dateCreated != null) {
                    Table.nativeSetTimestamp(j13, aVar4.f17447q, j29, realmGet$dateCreated.getTime(), false);
                    j16 = j29;
                } else {
                    j16 = j29;
                    Table.nativeSetNull(j13, aVar4.f17447q, j29, false);
                }
                long j30 = j16;
                Table.nativeSetLong(j13, aVar4.f17448r, j30, task.realmGet$position(), false);
                TaskGroupPlan realmGet$group = task.realmGet$group();
                String str3 = "Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: ";
                if (realmGet$group != null) {
                    Long l12 = map.get(realmGet$group);
                    if (l12 == null) {
                        aVar = aVar4;
                        j17 = j30;
                        n5.i(o0Var, c12, aVar4.f17449s, j30, realmGet$group, map);
                    } else {
                        throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l12.toString());
                    }
                } else {
                    aVar = aVar4;
                    j17 = j30;
                    Table.nativeNullifyLink(j13, aVar.f17449s, j17);
                }
                Boolean realmGet$up = task.realmGet$up();
                if (realmGet$up != null) {
                    long j31 = aVar.f17450t;
                    boolean booleanValue = realmGet$up.booleanValue();
                    aVar2 = aVar;
                    Table.nativeSetBoolean(j13, j31, j17, booleanValue, false);
                    str3 = "Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: ";
                } else {
                    aVar2 = aVar;
                    Table.nativeSetNull(j13, aVar2.f17450t, j17, false);
                }
                Boolean realmGet$down = task.realmGet$down();
                if (realmGet$down != null) {
                    Table.nativeSetBoolean(j13, aVar2.f17451u, j17, realmGet$down.booleanValue(), false);
                    str3 = str3;
                } else {
                    Table.nativeSetNull(j13, aVar2.f17451u, j17, false);
                }
                Integer realmGet$counterUp = task.realmGet$counterUp();
                if (realmGet$counterUp != null) {
                    Table.nativeSetLong(j13, aVar2.f17452v, j17, realmGet$counterUp.longValue(), false);
                    str3 = str3;
                } else {
                    Table.nativeSetNull(j13, aVar2.f17452v, j17, false);
                }
                Integer realmGet$counterDown = task.realmGet$counterDown();
                if (realmGet$counterDown != null) {
                    Table.nativeSetLong(j13, aVar2.f17453w, j17, realmGet$counterDown.longValue(), false);
                    str3 = str3;
                } else {
                    Table.nativeSetNull(j13, aVar2.f17453w, j17, false);
                }
                String str4 = str3;
                Table.nativeSetBoolean(j13, aVar2.f17454x, j17, task.realmGet$completed(), false);
                long j32 = j17;
                OsList osList2 = new OsList(c12.s(j32), aVar2.f17455y);
                x0<ChecklistItem> realmGet$checklist = task.realmGet$checklist();
                if (realmGet$checklist != null && realmGet$checklist.size() == osList2.Y()) {
                    int size2 = realmGet$checklist.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ChecklistItem checklistItem = realmGet$checklist.get(i11);
                        Long l13 = map.get(checklistItem);
                        if (l13 == null) {
                            l13 = Long.valueOf(com_habitrpg_android_habitica_models_tasks_ChecklistItemRealmProxy.i(o0Var, checklistItem, map));
                        }
                        osList2.V(i11, l13.longValue());
                    }
                } else {
                    osList2.K();
                    if (realmGet$checklist != null) {
                        Iterator<ChecklistItem> it3 = realmGet$checklist.iterator();
                        while (it3.hasNext()) {
                            ChecklistItem next2 = it3.next();
                            Long l14 = map.get(next2);
                            if (l14 == null) {
                                l14 = Long.valueOf(com_habitrpg_android_habitica_models_tasks_ChecklistItemRealmProxy.i(o0Var, next2, map));
                            }
                            osList2.k(l14.longValue());
                        }
                    }
                }
                OsList osList3 = new OsList(c12.s(j32), aVar2.f17456z);
                x0<RemindersItem> realmGet$reminders = task.realmGet$reminders();
                if (realmGet$reminders != null && realmGet$reminders.size() == osList3.Y()) {
                    int size3 = realmGet$reminders.size();
                    for (int i12 = 0; i12 < size3; i12++) {
                        RemindersItem remindersItem = realmGet$reminders.get(i12);
                        Long l15 = map.get(remindersItem);
                        if (l15 == null) {
                            l15 = Long.valueOf(com_habitrpg_android_habitica_models_tasks_RemindersItemRealmProxy.i(o0Var, remindersItem, map));
                        }
                        osList3.V(i12, l15.longValue());
                    }
                } else {
                    osList3.K();
                    if (realmGet$reminders != null) {
                        Iterator<RemindersItem> it4 = realmGet$reminders.iterator();
                        while (it4.hasNext()) {
                            RemindersItem next3 = it4.next();
                            Long l16 = map.get(next3);
                            if (l16 == null) {
                                l16 = Long.valueOf(com_habitrpg_android_habitica_models_tasks_RemindersItemRealmProxy.i(o0Var, next3, map));
                            }
                            osList3.k(l16.longValue());
                        }
                    }
                }
                String realmGet$frequencyValue = task.realmGet$frequencyValue();
                if (realmGet$frequencyValue != null) {
                    Table.nativeSetString(j13, aVar2.A, j32, realmGet$frequencyValue, false);
                    j18 = j32;
                    str = str4;
                } else {
                    j18 = j32;
                    str = str4;
                    Table.nativeSetNull(j13, aVar2.A, j32, false);
                }
                Integer realmGet$everyX = task.realmGet$everyX();
                if (realmGet$everyX != null) {
                    long j33 = j18;
                    Table.nativeSetLong(j13, aVar2.B, j33, realmGet$everyX.longValue(), false);
                    j18 = j33;
                    str = str;
                } else {
                    Table.nativeSetNull(j13, aVar2.B, j18, false);
                }
                Integer realmGet$streak = task.realmGet$streak();
                if (realmGet$streak != null) {
                    long j34 = j18;
                    Table.nativeSetLong(j13, aVar2.C, j34, realmGet$streak.longValue(), false);
                    j18 = j34;
                    str = str;
                } else {
                    Table.nativeSetNull(j13, aVar2.C, j18, false);
                }
                Date realmGet$startDate = task.realmGet$startDate();
                if (realmGet$startDate != null) {
                    long j35 = j18;
                    Table.nativeSetTimestamp(j13, aVar2.D, j35, realmGet$startDate.getTime(), false);
                    j18 = j35;
                    str2 = str;
                } else {
                    str2 = str;
                    Table.nativeSetNull(j13, aVar2.D, j18, false);
                }
                Days realmGet$repeat = task.realmGet$repeat();
                if (realmGet$repeat != null) {
                    Long l17 = map.get(realmGet$repeat);
                    if (l17 == null) {
                        aVar3 = aVar2;
                        com_habitrpg_android_habitica_models_tasks_DaysRealmProxy.i(o0Var, c12, aVar2.E, j18, realmGet$repeat, map);
                    } else {
                        throw new IllegalArgumentException(str2 + l17.toString());
                    }
                } else {
                    aVar3 = aVar2;
                    Table.nativeNullifyLink(j13, aVar3.E, j18);
                }
                Date realmGet$dueDate = task.realmGet$dueDate();
                if (realmGet$dueDate != null) {
                    long j36 = aVar3.F;
                    long time = realmGet$dueDate.getTime();
                    long j37 = j18;
                    aVar4 = aVar3;
                    Table.nativeSetTimestamp(j13, j36, j37, time, false);
                    j18 = j37;
                } else {
                    aVar4 = aVar3;
                    Table.nativeSetNull(j13, aVar4.F, j18, false);
                }
                Boolean realmGet$isDue = task.realmGet$isDue();
                if (realmGet$isDue != null) {
                    long j38 = j18;
                    Table.nativeSetBoolean(j13, aVar4.G, j38, realmGet$isDue.booleanValue(), false);
                    j18 = j38;
                } else {
                    Table.nativeSetNull(j13, aVar4.G, j18, false);
                }
                OsList osList4 = new OsList(c12.s(j18), aVar4.H);
                osList4.K();
                x0<Date> realmGet$nextDue = task.realmGet$nextDue();
                if (realmGet$nextDue != null) {
                    Iterator<Date> it5 = realmGet$nextDue.iterator();
                    while (it5.hasNext()) {
                        Date next4 = it5.next();
                        if (next4 == null) {
                            osList4.h();
                        } else {
                            osList4.c(next4);
                        }
                    }
                }
                Date realmGet$updatedAt = task.realmGet$updatedAt();
                if (realmGet$updatedAt != null) {
                    j19 = j18;
                    Table.nativeSetTimestamp(j13, aVar4.I, j19, realmGet$updatedAt.getTime(), false);
                } else {
                    j19 = j18;
                    Table.nativeSetNull(j13, aVar4.I, j19, false);
                }
                long j39 = j13;
                long j40 = j19;
                Table.nativeSetBoolean(j39, aVar4.J, j40, task.realmGet$isSaving(), false);
                Table.nativeSetBoolean(j39, aVar4.K, j40, task.realmGet$hasErrored(), false);
                Table.nativeSetBoolean(j39, aVar4.L, j40, task.realmGet$isCreating(), false);
                Table.nativeSetBoolean(j39, aVar4.M, j40, task.realmGet$yesterDaily(), false);
                String realmGet$daysOfMonthString = task.realmGet$daysOfMonthString();
                if (realmGet$daysOfMonthString != null) {
                    Table.nativeSetString(j13, aVar4.N, j19, realmGet$daysOfMonthString, false);
                } else {
                    Table.nativeSetNull(j13, aVar4.N, j19, false);
                }
                String realmGet$weeksOfMonthString = task.realmGet$weeksOfMonthString();
                if (realmGet$weeksOfMonthString != null) {
                    Table.nativeSetString(j13, aVar4.O, j19, realmGet$weeksOfMonthString, false);
                } else {
                    Table.nativeSetNull(j13, aVar4.O, j19, false);
                }
                j20 = j12;
                nativePtr = j13;
            }
        }
    }

    static com_habitrpg_android_habitica_models_tasks_TaskRealmProxy l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(Task.class), false, Collections.emptyList());
        com_habitrpg_android_habitica_models_tasks_TaskRealmProxy com_habitrpg_android_habitica_models_tasks_taskrealmproxy = new com_habitrpg_android_habitica_models_tasks_TaskRealmProxy();
        cVar.a();
        return com_habitrpg_android_habitica_models_tasks_taskrealmproxy;
    }

    static Task n(o0 o0Var, a aVar, Task task, Task task2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Task.class), set);
        osObjectBuilder.c1(aVar.f17435e, task2.realmGet$combinedID());
        osObjectBuilder.c1(aVar.f17436f, task2.realmGet$id());
        osObjectBuilder.c1(aVar.f17437g, task2.realmGet$ownerID());
        osObjectBuilder.T0(aVar.f17438h, Float.valueOf(task2.realmGet$priority()));
        osObjectBuilder.c1(aVar.f17439i, task2.realmGet$text());
        osObjectBuilder.c1(aVar.f17440j, task2.realmGet$notes());
        osObjectBuilder.c1(aVar.f17441k, task2.realmGet$typeValue());
        osObjectBuilder.c1(aVar.f17442l, task2.realmGet$challengeID());
        osObjectBuilder.c1(aVar.f17443m, task2.realmGet$challengeBroken());
        osObjectBuilder.c1(aVar.f17444n, task2.realmGet$attributeValue());
        osObjectBuilder.N0(aVar.f17445o, Double.valueOf(task2.realmGet$value()));
        x0<Tag> realmGet$tags = task2.realmGet$tags();
        if (realmGet$tags != null) {
            x0 x0Var = new x0();
            for (int i10 = 0; i10 < realmGet$tags.size(); i10++) {
                Tag tag = realmGet$tags.get(i10);
                Tag tag2 = (Tag) map.get(tag);
                if (tag2 != null) {
                    x0Var.add(tag2);
                } else {
                    x0Var.add(w1.d(o0Var, (w1.a) o0Var.R().e(Tag.class), tag, true, map, set));
                }
            }
            osObjectBuilder.b1(aVar.f17446p, x0Var);
        } else {
            osObjectBuilder.b1(aVar.f17446p, new x0());
        }
        osObjectBuilder.I0(aVar.f17447q, task2.realmGet$dateCreated());
        osObjectBuilder.V0(aVar.f17448r, Integer.valueOf(task2.realmGet$position()));
        TaskGroupPlan realmGet$group = task2.realmGet$group();
        if (realmGet$group == null) {
            osObjectBuilder.Z0(aVar.f17449s);
        } else if (((TaskGroupPlan) map.get(realmGet$group)) == null) {
            n5 k10 = n5.k(o0Var, o0Var.c1(TaskGroupPlan.class).s(((io.realm.internal.o) task).b().g().createEmbeddedObject(aVar.f17449s, RealmFieldType.OBJECT)));
            map.put(realmGet$group, k10);
            n5.n(o0Var, realmGet$group, k10, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachegroup.toString()");
        }
        osObjectBuilder.F0(aVar.f17450t, task2.realmGet$up());
        osObjectBuilder.F0(aVar.f17451u, task2.realmGet$down());
        osObjectBuilder.V0(aVar.f17452v, task2.realmGet$counterUp());
        osObjectBuilder.V0(aVar.f17453w, task2.realmGet$counterDown());
        osObjectBuilder.F0(aVar.f17454x, Boolean.valueOf(task2.realmGet$completed()));
        x0<ChecklistItem> realmGet$checklist = task2.realmGet$checklist();
        if (realmGet$checklist != null) {
            x0 x0Var2 = new x0();
            for (int i11 = 0; i11 < realmGet$checklist.size(); i11++) {
                ChecklistItem checklistItem = realmGet$checklist.get(i11);
                ChecklistItem checklistItem2 = (ChecklistItem) map.get(checklistItem);
                if (checklistItem2 != null) {
                    x0Var2.add(checklistItem2);
                } else {
                    x0Var2.add(com_habitrpg_android_habitica_models_tasks_ChecklistItemRealmProxy.d(o0Var, (com_habitrpg_android_habitica_models_tasks_ChecklistItemRealmProxy.a) o0Var.R().e(ChecklistItem.class), checklistItem, true, map, set));
                }
            }
            osObjectBuilder.b1(aVar.f17455y, x0Var2);
        } else {
            osObjectBuilder.b1(aVar.f17455y, new x0());
        }
        x0<RemindersItem> realmGet$reminders = task2.realmGet$reminders();
        if (realmGet$reminders != null) {
            x0 x0Var3 = new x0();
            for (int i12 = 0; i12 < realmGet$reminders.size(); i12++) {
                RemindersItem remindersItem = realmGet$reminders.get(i12);
                RemindersItem remindersItem2 = (RemindersItem) map.get(remindersItem);
                if (remindersItem2 != null) {
                    x0Var3.add(remindersItem2);
                } else {
                    x0Var3.add(com_habitrpg_android_habitica_models_tasks_RemindersItemRealmProxy.d(o0Var, (com_habitrpg_android_habitica_models_tasks_RemindersItemRealmProxy.a) o0Var.R().e(RemindersItem.class), remindersItem, true, map, set));
                }
            }
            osObjectBuilder.b1(aVar.f17456z, x0Var3);
        } else {
            osObjectBuilder.b1(aVar.f17456z, new x0());
        }
        osObjectBuilder.c1(aVar.A, task2.realmGet$frequencyValue());
        osObjectBuilder.V0(aVar.B, task2.realmGet$everyX());
        osObjectBuilder.V0(aVar.C, task2.realmGet$streak());
        osObjectBuilder.I0(aVar.D, task2.realmGet$startDate());
        Days realmGet$repeat = task2.realmGet$repeat();
        if (realmGet$repeat == null) {
            osObjectBuilder.Z0(aVar.E);
        } else if (((Days) map.get(realmGet$repeat)) == null) {
            com_habitrpg_android_habitica_models_tasks_DaysRealmProxy k11 = com_habitrpg_android_habitica_models_tasks_DaysRealmProxy.k(o0Var, o0Var.c1(Days.class).s(((io.realm.internal.o) task).b().g().createEmbeddedObject(aVar.E, RealmFieldType.OBJECT)));
            map.put(realmGet$repeat, k11);
            com_habitrpg_android_habitica_models_tasks_DaysRealmProxy.n(o0Var, realmGet$repeat, k11, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacherepeat.toString()");
        }
        osObjectBuilder.I0(aVar.F, task2.realmGet$dueDate());
        osObjectBuilder.F0(aVar.G, task2.realmGet$isDue());
        osObjectBuilder.J0(aVar.H, task2.realmGet$nextDue());
        osObjectBuilder.I0(aVar.I, task2.realmGet$updatedAt());
        osObjectBuilder.F0(aVar.J, Boolean.valueOf(task2.realmGet$isSaving()));
        osObjectBuilder.F0(aVar.K, Boolean.valueOf(task2.realmGet$hasErrored()));
        osObjectBuilder.F0(aVar.L, Boolean.valueOf(task2.realmGet$isCreating()));
        osObjectBuilder.F0(aVar.M, Boolean.valueOf(task2.realmGet$yesterDaily()));
        osObjectBuilder.c1(aVar.N, task2.realmGet$daysOfMonthString());
        osObjectBuilder.c1(aVar.O, task2.realmGet$weeksOfMonthString());
        osObjectBuilder.g1();
        return task;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17430q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17429p = (a) cVar.c();
        l0<Task> l0Var = new l0<>(this);
        this.f17430q = l0Var;
        l0Var.r(cVar.e());
        this.f17430q.s(cVar.f());
        this.f17430q.o(cVar.b());
        this.f17430q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17430q;
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public String realmGet$attributeValue() {
        this.f17430q.f().e();
        return this.f17430q.g().getString(this.f17429p.f17444n);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public String realmGet$challengeBroken() {
        this.f17430q.f().e();
        return this.f17430q.g().getString(this.f17429p.f17443m);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public String realmGet$challengeID() {
        this.f17430q.f().e();
        return this.f17430q.g().getString(this.f17429p.f17442l);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public x0<ChecklistItem> realmGet$checklist() {
        this.f17430q.f().e();
        x0<ChecklistItem> x0Var = this.f17432u;
        if (x0Var != null) {
            return x0Var;
        }
        x0<ChecklistItem> x0Var2 = new x0<>(ChecklistItem.class, this.f17430q.g().getModelList(this.f17429p.f17455y), this.f17430q.f());
        this.f17432u = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public String realmGet$combinedID() {
        this.f17430q.f().e();
        return this.f17430q.g().getString(this.f17429p.f17435e);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public boolean realmGet$completed() {
        this.f17430q.f().e();
        return this.f17430q.g().getBoolean(this.f17429p.f17454x);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public Integer realmGet$counterDown() {
        this.f17430q.f().e();
        if (this.f17430q.g().isNull(this.f17429p.f17453w)) {
            return null;
        }
        return Integer.valueOf((int) this.f17430q.g().getLong(this.f17429p.f17453w));
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public Integer realmGet$counterUp() {
        this.f17430q.f().e();
        if (this.f17430q.g().isNull(this.f17429p.f17452v)) {
            return null;
        }
        return Integer.valueOf((int) this.f17430q.g().getLong(this.f17429p.f17452v));
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public Date realmGet$dateCreated() {
        this.f17430q.f().e();
        if (this.f17430q.g().isNull(this.f17429p.f17447q)) {
            return null;
        }
        return this.f17430q.g().getDate(this.f17429p.f17447q);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public String realmGet$daysOfMonthString() {
        this.f17430q.f().e();
        return this.f17430q.g().getString(this.f17429p.N);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public Boolean realmGet$down() {
        this.f17430q.f().e();
        if (this.f17430q.g().isNull(this.f17429p.f17451u)) {
            return null;
        }
        return Boolean.valueOf(this.f17430q.g().getBoolean(this.f17429p.f17451u));
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public Date realmGet$dueDate() {
        this.f17430q.f().e();
        if (this.f17430q.g().isNull(this.f17429p.F)) {
            return null;
        }
        return this.f17430q.g().getDate(this.f17429p.F);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public Integer realmGet$everyX() {
        this.f17430q.f().e();
        if (this.f17430q.g().isNull(this.f17429p.B)) {
            return null;
        }
        return Integer.valueOf((int) this.f17430q.g().getLong(this.f17429p.B));
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public String realmGet$frequencyValue() {
        this.f17430q.f().e();
        return this.f17430q.g().getString(this.f17429p.A);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public TaskGroupPlan realmGet$group() {
        this.f17430q.f().e();
        if (this.f17430q.g().isNullLink(this.f17429p.f17449s)) {
            return null;
        }
        return (TaskGroupPlan) this.f17430q.f().B(TaskGroupPlan.class, this.f17430q.g().getLink(this.f17429p.f17449s), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public boolean realmGet$hasErrored() {
        this.f17430q.f().e();
        return this.f17430q.g().getBoolean(this.f17429p.K);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public String realmGet$id() {
        this.f17430q.f().e();
        return this.f17430q.g().getString(this.f17429p.f17436f);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public boolean realmGet$isCreating() {
        this.f17430q.f().e();
        return this.f17430q.g().getBoolean(this.f17429p.L);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public Boolean realmGet$isDue() {
        this.f17430q.f().e();
        if (this.f17430q.g().isNull(this.f17429p.G)) {
            return null;
        }
        return Boolean.valueOf(this.f17430q.g().getBoolean(this.f17429p.G));
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public boolean realmGet$isSaving() {
        this.f17430q.f().e();
        return this.f17430q.g().getBoolean(this.f17429p.J);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public x0<Date> realmGet$nextDue() {
        this.f17430q.f().e();
        x0<Date> x0Var = this.f17434x;
        if (x0Var != null) {
            return x0Var;
        }
        x0<Date> x0Var2 = new x0<>(Date.class, this.f17430q.g().getValueList(this.f17429p.H, RealmFieldType.DATE_LIST), this.f17430q.f());
        this.f17434x = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public String realmGet$notes() {
        this.f17430q.f().e();
        return this.f17430q.g().getString(this.f17429p.f17440j);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public String realmGet$ownerID() {
        this.f17430q.f().e();
        return this.f17430q.g().getString(this.f17429p.f17437g);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public int realmGet$position() {
        this.f17430q.f().e();
        return (int) this.f17430q.g().getLong(this.f17429p.f17448r);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public float realmGet$priority() {
        this.f17430q.f().e();
        return this.f17430q.g().getFloat(this.f17429p.f17438h);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public x0<RemindersItem> realmGet$reminders() {
        this.f17430q.f().e();
        x0<RemindersItem> x0Var = this.f17433v;
        if (x0Var != null) {
            return x0Var;
        }
        x0<RemindersItem> x0Var2 = new x0<>(RemindersItem.class, this.f17430q.g().getModelList(this.f17429p.f17456z), this.f17430q.f());
        this.f17433v = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public Days realmGet$repeat() {
        this.f17430q.f().e();
        if (this.f17430q.g().isNullLink(this.f17429p.E)) {
            return null;
        }
        return (Days) this.f17430q.f().B(Days.class, this.f17430q.g().getLink(this.f17429p.E), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public Date realmGet$startDate() {
        this.f17430q.f().e();
        if (this.f17430q.g().isNull(this.f17429p.D)) {
            return null;
        }
        return this.f17430q.g().getDate(this.f17429p.D);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public Integer realmGet$streak() {
        this.f17430q.f().e();
        if (this.f17430q.g().isNull(this.f17429p.C)) {
            return null;
        }
        return Integer.valueOf((int) this.f17430q.g().getLong(this.f17429p.C));
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public x0<Tag> realmGet$tags() {
        this.f17430q.f().e();
        x0<Tag> x0Var = this.f17431r;
        if (x0Var != null) {
            return x0Var;
        }
        x0<Tag> x0Var2 = new x0<>(Tag.class, this.f17430q.g().getModelList(this.f17429p.f17446p), this.f17430q.f());
        this.f17431r = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public String realmGet$text() {
        this.f17430q.f().e();
        return this.f17430q.g().getString(this.f17429p.f17439i);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public String realmGet$typeValue() {
        this.f17430q.f().e();
        return this.f17430q.g().getString(this.f17429p.f17441k);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public Boolean realmGet$up() {
        this.f17430q.f().e();
        if (this.f17430q.g().isNull(this.f17429p.f17450t)) {
            return null;
        }
        return Boolean.valueOf(this.f17430q.g().getBoolean(this.f17429p.f17450t));
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public Date realmGet$updatedAt() {
        this.f17430q.f().e();
        if (this.f17430q.g().isNull(this.f17429p.I)) {
            return null;
        }
        return this.f17430q.g().getDate(this.f17429p.I);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public double realmGet$value() {
        this.f17430q.f().e();
        return this.f17430q.g().getDouble(this.f17429p.f17445o);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public String realmGet$weeksOfMonthString() {
        this.f17430q.f().e();
        return this.f17430q.g().getString(this.f17429p.O);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public boolean realmGet$yesterDaily() {
        this.f17430q.f().e();
        return this.f17430q.g().getBoolean(this.f17429p.M);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$attributeValue(String str) {
        if (this.f17430q.i()) {
            if (!this.f17430q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17430q.g();
            if (str == null) {
                g10.getTable().F(this.f17429p.f17444n, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17429p.f17444n, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17430q.f().e();
        if (str == null) {
            this.f17430q.g().setNull(this.f17429p.f17444n);
        } else {
            this.f17430q.g().setString(this.f17429p.f17444n, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$challengeBroken(String str) {
        if (this.f17430q.i()) {
            if (!this.f17430q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17430q.g();
            if (str == null) {
                g10.getTable().F(this.f17429p.f17443m, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17429p.f17443m, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17430q.f().e();
        if (str == null) {
            this.f17430q.g().setNull(this.f17429p.f17443m);
        } else {
            this.f17430q.g().setString(this.f17429p.f17443m, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$challengeID(String str) {
        if (this.f17430q.i()) {
            if (!this.f17430q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17430q.g();
            if (str == null) {
                g10.getTable().F(this.f17429p.f17442l, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17429p.f17442l, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17430q.f().e();
        if (str == null) {
            this.f17430q.g().setNull(this.f17429p.f17442l);
        } else {
            this.f17430q.g().setString(this.f17429p.f17442l, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$checklist(x0<ChecklistItem> x0Var) {
        int i10 = 0;
        if (this.f17430q.i()) {
            if (!this.f17430q.d() || this.f17430q.e().contains("checklist")) {
                return;
            }
            if (x0Var != null && !x0Var.p()) {
                o0 o0Var = (o0) this.f17430q.f();
                x0<ChecklistItem> x0Var2 = new x0<>();
                Iterator<ChecklistItem> it = x0Var.iterator();
                while (it.hasNext()) {
                    ChecklistItem next = it.next();
                    if (next != null && !d1.isManaged(next)) {
                        x0Var2.add((ChecklistItem) o0Var.F0(next, new v[0]));
                    } else {
                        x0Var2.add(next);
                    }
                }
                x0Var = x0Var2;
            }
        }
        this.f17430q.f().e();
        OsList modelList = this.f17430q.g().getModelList(this.f17429p.f17455y);
        if (x0Var != null && x0Var.size() == modelList.Y()) {
            int size = x0Var.size();
            while (i10 < size) {
                ChecklistItem checklistItem = x0Var.get(i10);
                this.f17430q.c(checklistItem);
                modelList.V(i10, ((io.realm.internal.o) checklistItem).b().g().getObjectKey());
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
            ChecklistItem checklistItem2 = x0Var.get(i10);
            this.f17430q.c(checklistItem2);
            modelList.k(((io.realm.internal.o) checklistItem2).b().g().getObjectKey());
            i10++;
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$combinedID(String str) {
        if (this.f17430q.i()) {
            return;
        }
        this.f17430q.f().e();
        throw new RealmException("Primary key field 'combinedID' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$completed(boolean z10) {
        if (this.f17430q.i()) {
            if (!this.f17430q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17430q.g();
            g10.getTable().z(this.f17429p.f17454x, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17430q.f().e();
        this.f17430q.g().setBoolean(this.f17429p.f17454x, z10);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$counterDown(Integer num) {
        if (this.f17430q.i()) {
            if (!this.f17430q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17430q.g();
            if (num == null) {
                g10.getTable().F(this.f17429p.f17453w, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().E(this.f17429p.f17453w, g10.getObjectKey(), num.intValue(), true);
                return;
            }
        }
        this.f17430q.f().e();
        if (num == null) {
            this.f17430q.g().setNull(this.f17429p.f17453w);
        } else {
            this.f17430q.g().setLong(this.f17429p.f17453w, num.intValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$counterUp(Integer num) {
        if (this.f17430q.i()) {
            if (!this.f17430q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17430q.g();
            if (num == null) {
                g10.getTable().F(this.f17429p.f17452v, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().E(this.f17429p.f17452v, g10.getObjectKey(), num.intValue(), true);
                return;
            }
        }
        this.f17430q.f().e();
        if (num == null) {
            this.f17430q.g().setNull(this.f17429p.f17452v);
        } else {
            this.f17430q.g().setLong(this.f17429p.f17452v, num.intValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$dateCreated(Date date) {
        if (this.f17430q.i()) {
            if (!this.f17430q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17430q.g();
            if (date == null) {
                g10.getTable().F(this.f17429p.f17447q, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().A(this.f17429p.f17447q, g10.getObjectKey(), date, true);
                return;
            }
        }
        this.f17430q.f().e();
        if (date == null) {
            this.f17430q.g().setNull(this.f17429p.f17447q);
        } else {
            this.f17430q.g().setDate(this.f17429p.f17447q, date);
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$daysOfMonthString(String str) {
        if (this.f17430q.i()) {
            if (!this.f17430q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17430q.g();
            if (str == null) {
                g10.getTable().F(this.f17429p.N, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17429p.N, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17430q.f().e();
        if (str == null) {
            this.f17430q.g().setNull(this.f17429p.N);
        } else {
            this.f17430q.g().setString(this.f17429p.N, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$down(Boolean bool) {
        if (this.f17430q.i()) {
            if (!this.f17430q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17430q.g();
            if (bool == null) {
                g10.getTable().F(this.f17429p.f17451u, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().z(this.f17429p.f17451u, g10.getObjectKey(), bool.booleanValue(), true);
                return;
            }
        }
        this.f17430q.f().e();
        if (bool == null) {
            this.f17430q.g().setNull(this.f17429p.f17451u);
        } else {
            this.f17430q.g().setBoolean(this.f17429p.f17451u, bool.booleanValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$dueDate(Date date) {
        if (this.f17430q.i()) {
            if (!this.f17430q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17430q.g();
            if (date == null) {
                g10.getTable().F(this.f17429p.F, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().A(this.f17429p.F, g10.getObjectKey(), date, true);
                return;
            }
        }
        this.f17430q.f().e();
        if (date == null) {
            this.f17430q.g().setNull(this.f17429p.F);
        } else {
            this.f17430q.g().setDate(this.f17429p.F, date);
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$everyX(Integer num) {
        if (this.f17430q.i()) {
            if (!this.f17430q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17430q.g();
            if (num == null) {
                g10.getTable().F(this.f17429p.B, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().E(this.f17429p.B, g10.getObjectKey(), num.intValue(), true);
                return;
            }
        }
        this.f17430q.f().e();
        if (num == null) {
            this.f17430q.g().setNull(this.f17429p.B);
        } else {
            this.f17430q.g().setLong(this.f17429p.B, num.intValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$frequencyValue(String str) {
        if (this.f17430q.i()) {
            if (!this.f17430q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17430q.g();
            if (str == null) {
                g10.getTable().F(this.f17429p.A, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17429p.A, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17430q.f().e();
        if (str == null) {
            this.f17430q.g().setNull(this.f17429p.A);
        } else {
            this.f17430q.g().setString(this.f17429p.A, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$group(TaskGroupPlan taskGroupPlan) {
        o0 o0Var = (o0) this.f17430q.f();
        if (this.f17430q.i()) {
            if (!this.f17430q.d() || this.f17430q.e().contains("group")) {
                return;
            }
            if (taskGroupPlan != null && !d1.isManaged(taskGroupPlan)) {
                TaskGroupPlan taskGroupPlan2 = (TaskGroupPlan) o0Var.J0(TaskGroupPlan.class, this, "group");
                n5.n(o0Var, taskGroupPlan, taskGroupPlan2, new HashMap(), Collections.EMPTY_SET);
                taskGroupPlan = taskGroupPlan2;
            }
            io.realm.internal.q g10 = this.f17430q.g();
            if (taskGroupPlan == null) {
                g10.nullifyLink(this.f17429p.f17449s);
                return;
            }
            this.f17430q.c(taskGroupPlan);
            g10.getTable().D(this.f17429p.f17449s, g10.getObjectKey(), ((io.realm.internal.o) taskGroupPlan).b().g().getObjectKey(), true);
            return;
        }
        this.f17430q.f().e();
        if (taskGroupPlan == null) {
            this.f17430q.g().nullifyLink(this.f17429p.f17449s);
            return;
        }
        if (d1.isManaged(taskGroupPlan)) {
            this.f17430q.c(taskGroupPlan);
        }
        n5.n(o0Var, taskGroupPlan, (TaskGroupPlan) o0Var.J0(TaskGroupPlan.class, this, "group"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$hasErrored(boolean z10) {
        if (this.f17430q.i()) {
            if (!this.f17430q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17430q.g();
            g10.getTable().z(this.f17429p.K, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17430q.f().e();
        this.f17430q.g().setBoolean(this.f17429p.K, z10);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$id(String str) {
        if (this.f17430q.i()) {
            if (!this.f17430q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17430q.g();
            if (str == null) {
                g10.getTable().F(this.f17429p.f17436f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17429p.f17436f, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17430q.f().e();
        if (str == null) {
            this.f17430q.g().setNull(this.f17429p.f17436f);
        } else {
            this.f17430q.g().setString(this.f17429p.f17436f, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$isCreating(boolean z10) {
        if (this.f17430q.i()) {
            if (!this.f17430q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17430q.g();
            g10.getTable().z(this.f17429p.L, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17430q.f().e();
        this.f17430q.g().setBoolean(this.f17429p.L, z10);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$isDue(Boolean bool) {
        if (this.f17430q.i()) {
            if (!this.f17430q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17430q.g();
            if (bool == null) {
                g10.getTable().F(this.f17429p.G, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().z(this.f17429p.G, g10.getObjectKey(), bool.booleanValue(), true);
                return;
            }
        }
        this.f17430q.f().e();
        if (bool == null) {
            this.f17430q.g().setNull(this.f17429p.G);
        } else {
            this.f17430q.g().setBoolean(this.f17429p.G, bool.booleanValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$isSaving(boolean z10) {
        if (this.f17430q.i()) {
            if (!this.f17430q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17430q.g();
            g10.getTable().z(this.f17429p.J, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17430q.f().e();
        this.f17430q.g().setBoolean(this.f17429p.J, z10);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$nextDue(x0<Date> x0Var) {
        if (this.f17430q.i() && (!this.f17430q.d() || this.f17430q.e().contains("nextDue"))) {
            return;
        }
        this.f17430q.f().e();
        OsList valueList = this.f17430q.g().getValueList(this.f17429p.H, RealmFieldType.DATE_LIST);
        valueList.K();
        if (x0Var == null) {
            return;
        }
        Iterator<Date> it = x0Var.iterator();
        while (it.hasNext()) {
            Date next = it.next();
            if (next == null) {
                valueList.h();
            } else {
                valueList.c(next);
            }
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$notes(String str) {
        if (this.f17430q.i()) {
            if (!this.f17430q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17430q.g();
            if (str == null) {
                g10.getTable().F(this.f17429p.f17440j, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17429p.f17440j, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17430q.f().e();
        if (str == null) {
            this.f17430q.g().setNull(this.f17429p.f17440j);
        } else {
            this.f17430q.g().setString(this.f17429p.f17440j, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$ownerID(String str) {
        if (this.f17430q.i()) {
            if (!this.f17430q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17430q.g();
            if (str != null) {
                g10.getTable().G(this.f17429p.f17437g, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'ownerID' to null.");
        }
        this.f17430q.f().e();
        if (str != null) {
            this.f17430q.g().setString(this.f17429p.f17437g, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'ownerID' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$position(int i10) {
        if (this.f17430q.i()) {
            if (!this.f17430q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17430q.g();
            g10.getTable().E(this.f17429p.f17448r, g10.getObjectKey(), i10, true);
            return;
        }
        this.f17430q.f().e();
        this.f17430q.g().setLong(this.f17429p.f17448r, i10);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$priority(float f10) {
        if (this.f17430q.i()) {
            if (!this.f17430q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17430q.g();
            g10.getTable().C(this.f17429p.f17438h, g10.getObjectKey(), f10, true);
            return;
        }
        this.f17430q.f().e();
        this.f17430q.g().setFloat(this.f17429p.f17438h, f10);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$reminders(x0<RemindersItem> x0Var) {
        int i10 = 0;
        if (this.f17430q.i()) {
            if (!this.f17430q.d() || this.f17430q.e().contains("reminders")) {
                return;
            }
            if (x0Var != null && !x0Var.p()) {
                o0 o0Var = (o0) this.f17430q.f();
                x0<RemindersItem> x0Var2 = new x0<>();
                Iterator<RemindersItem> it = x0Var.iterator();
                while (it.hasNext()) {
                    RemindersItem next = it.next();
                    if (next != null && !d1.isManaged(next)) {
                        x0Var2.add((RemindersItem) o0Var.F0(next, new v[0]));
                    } else {
                        x0Var2.add(next);
                    }
                }
                x0Var = x0Var2;
            }
        }
        this.f17430q.f().e();
        OsList modelList = this.f17430q.g().getModelList(this.f17429p.f17456z);
        if (x0Var != null && x0Var.size() == modelList.Y()) {
            int size = x0Var.size();
            while (i10 < size) {
                RemindersItem remindersItem = x0Var.get(i10);
                this.f17430q.c(remindersItem);
                modelList.V(i10, ((io.realm.internal.o) remindersItem).b().g().getObjectKey());
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
            RemindersItem remindersItem2 = x0Var.get(i10);
            this.f17430q.c(remindersItem2);
            modelList.k(((io.realm.internal.o) remindersItem2).b().g().getObjectKey());
            i10++;
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$repeat(Days days) {
        o0 o0Var = (o0) this.f17430q.f();
        if (this.f17430q.i()) {
            if (!this.f17430q.d() || this.f17430q.e().contains("repeat")) {
                return;
            }
            if (days != null && !d1.isManaged(days)) {
                Days days2 = (Days) o0Var.J0(Days.class, this, "repeat");
                com_habitrpg_android_habitica_models_tasks_DaysRealmProxy.n(o0Var, days, days2, new HashMap(), Collections.EMPTY_SET);
                days = days2;
            }
            io.realm.internal.q g10 = this.f17430q.g();
            if (days == null) {
                g10.nullifyLink(this.f17429p.E);
                return;
            }
            this.f17430q.c(days);
            g10.getTable().D(this.f17429p.E, g10.getObjectKey(), ((io.realm.internal.o) days).b().g().getObjectKey(), true);
            return;
        }
        this.f17430q.f().e();
        if (days == null) {
            this.f17430q.g().nullifyLink(this.f17429p.E);
            return;
        }
        if (d1.isManaged(days)) {
            this.f17430q.c(days);
        }
        com_habitrpg_android_habitica_models_tasks_DaysRealmProxy.n(o0Var, days, (Days) o0Var.J0(Days.class, this, "repeat"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$startDate(Date date) {
        if (this.f17430q.i()) {
            if (!this.f17430q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17430q.g();
            if (date == null) {
                g10.getTable().F(this.f17429p.D, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().A(this.f17429p.D, g10.getObjectKey(), date, true);
                return;
            }
        }
        this.f17430q.f().e();
        if (date == null) {
            this.f17430q.g().setNull(this.f17429p.D);
        } else {
            this.f17430q.g().setDate(this.f17429p.D, date);
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$streak(Integer num) {
        if (this.f17430q.i()) {
            if (!this.f17430q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17430q.g();
            if (num == null) {
                g10.getTable().F(this.f17429p.C, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().E(this.f17429p.C, g10.getObjectKey(), num.intValue(), true);
                return;
            }
        }
        this.f17430q.f().e();
        if (num == null) {
            this.f17430q.g().setNull(this.f17429p.C);
        } else {
            this.f17430q.g().setLong(this.f17429p.C, num.intValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$tags(x0<Tag> x0Var) {
        int i10 = 0;
        if (this.f17430q.i()) {
            if (!this.f17430q.d() || this.f17430q.e().contains("tags")) {
                return;
            }
            if (x0Var != null && !x0Var.p()) {
                o0 o0Var = (o0) this.f17430q.f();
                x0<Tag> x0Var2 = new x0<>();
                Iterator<Tag> it = x0Var.iterator();
                while (it.hasNext()) {
                    Tag next = it.next();
                    if (next != null && !d1.isManaged(next)) {
                        x0Var2.add((Tag) o0Var.F0(next, new v[0]));
                    } else {
                        x0Var2.add(next);
                    }
                }
                x0Var = x0Var2;
            }
        }
        this.f17430q.f().e();
        OsList modelList = this.f17430q.g().getModelList(this.f17429p.f17446p);
        if (x0Var != null && x0Var.size() == modelList.Y()) {
            int size = x0Var.size();
            while (i10 < size) {
                Tag tag = x0Var.get(i10);
                this.f17430q.c(tag);
                modelList.V(i10, ((io.realm.internal.o) tag).b().g().getObjectKey());
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
            Tag tag2 = x0Var.get(i10);
            this.f17430q.c(tag2);
            modelList.k(((io.realm.internal.o) tag2).b().g().getObjectKey());
            i10++;
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$text(String str) {
        if (this.f17430q.i()) {
            if (!this.f17430q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17430q.g();
            if (str != null) {
                g10.getTable().G(this.f17429p.f17439i, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
        this.f17430q.f().e();
        if (str != null) {
            this.f17430q.g().setString(this.f17429p.f17439i, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$typeValue(String str) {
        if (this.f17430q.i()) {
            if (!this.f17430q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17430q.g();
            if (str == null) {
                g10.getTable().F(this.f17429p.f17441k, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17429p.f17441k, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17430q.f().e();
        if (str == null) {
            this.f17430q.g().setNull(this.f17429p.f17441k);
        } else {
            this.f17430q.g().setString(this.f17429p.f17441k, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$up(Boolean bool) {
        if (this.f17430q.i()) {
            if (!this.f17430q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17430q.g();
            if (bool == null) {
                g10.getTable().F(this.f17429p.f17450t, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().z(this.f17429p.f17450t, g10.getObjectKey(), bool.booleanValue(), true);
                return;
            }
        }
        this.f17430q.f().e();
        if (bool == null) {
            this.f17430q.g().setNull(this.f17429p.f17450t);
        } else {
            this.f17430q.g().setBoolean(this.f17429p.f17450t, bool.booleanValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$updatedAt(Date date) {
        if (this.f17430q.i()) {
            if (!this.f17430q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17430q.g();
            if (date == null) {
                g10.getTable().F(this.f17429p.I, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().A(this.f17429p.I, g10.getObjectKey(), date, true);
                return;
            }
        }
        this.f17430q.f().e();
        if (date == null) {
            this.f17430q.g().setNull(this.f17429p.I);
        } else {
            this.f17430q.g().setDate(this.f17429p.I, date);
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$value(double d10) {
        if (this.f17430q.i()) {
            if (!this.f17430q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17430q.g();
            g10.getTable().B(this.f17429p.f17445o, g10.getObjectKey(), d10, true);
            return;
        }
        this.f17430q.f().e();
        this.f17430q.g().setDouble(this.f17429p.f17445o, d10);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$weeksOfMonthString(String str) {
        if (this.f17430q.i()) {
            if (!this.f17430q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17430q.g();
            if (str == null) {
                g10.getTable().F(this.f17429p.O, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17429p.O, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17430q.f().e();
        if (str == null) {
            this.f17430q.g().setNull(this.f17429p.O);
        } else {
            this.f17430q.g().setString(this.f17429p.O, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.Task, io.realm.p5
    public void realmSet$yesterDaily(boolean z10) {
        if (this.f17430q.i()) {
            if (!this.f17430q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17430q.g();
            g10.getTable().z(this.f17429p.M, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17430q.f().e();
        this.f17430q.g().setBoolean(this.f17429p.M, z10);
    }

    public String toString() {
        if (d1.isValid(this)) {
            StringBuilder sb2 = new StringBuilder("Task = proxy[");
            sb2.append("{combinedID:");
            sb2.append(realmGet$combinedID() != null ? realmGet$combinedID() : "null");
            sb2.append("}");
            sb2.append(",");
            sb2.append("{id:");
            sb2.append(realmGet$id() != null ? realmGet$id() : "null");
            sb2.append("}");
            sb2.append(",");
            sb2.append("{ownerID:");
            sb2.append(realmGet$ownerID());
            sb2.append("}");
            sb2.append(",");
            sb2.append("{priority:");
            sb2.append(realmGet$priority());
            sb2.append("}");
            sb2.append(",");
            sb2.append("{text:");
            sb2.append(realmGet$text());
            sb2.append("}");
            sb2.append(",");
            sb2.append("{notes:");
            sb2.append(realmGet$notes() != null ? realmGet$notes() : "null");
            sb2.append("}");
            sb2.append(",");
            sb2.append("{typeValue:");
            sb2.append(realmGet$typeValue() != null ? realmGet$typeValue() : "null");
            sb2.append("}");
            sb2.append(",");
            sb2.append("{challengeID:");
            sb2.append(realmGet$challengeID() != null ? realmGet$challengeID() : "null");
            sb2.append("}");
            sb2.append(",");
            sb2.append("{challengeBroken:");
            sb2.append(realmGet$challengeBroken() != null ? realmGet$challengeBroken() : "null");
            sb2.append("}");
            sb2.append(",");
            sb2.append("{attributeValue:");
            sb2.append(realmGet$attributeValue() != null ? realmGet$attributeValue() : "null");
            sb2.append("}");
            sb2.append(",");
            sb2.append("{value:");
            sb2.append(realmGet$value());
            sb2.append("}");
            sb2.append(",");
            sb2.append("{tags:");
            sb2.append("RealmList<Tag>[");
            sb2.append(realmGet$tags().size());
            sb2.append("]");
            sb2.append("}");
            sb2.append(",");
            sb2.append("{dateCreated:");
            sb2.append(realmGet$dateCreated() != null ? realmGet$dateCreated() : "null");
            sb2.append("}");
            sb2.append(",");
            sb2.append("{position:");
            sb2.append(realmGet$position());
            sb2.append("}");
            sb2.append(",");
            sb2.append("{group:");
            sb2.append(realmGet$group() != null ? "TaskGroupPlan" : "null");
            sb2.append("}");
            sb2.append(",");
            sb2.append("{up:");
            sb2.append(realmGet$up() != null ? realmGet$up() : "null");
            sb2.append("}");
            sb2.append(",");
            sb2.append("{down:");
            sb2.append(realmGet$down() != null ? realmGet$down() : "null");
            sb2.append("}");
            sb2.append(",");
            sb2.append("{counterUp:");
            sb2.append(realmGet$counterUp() != null ? realmGet$counterUp() : "null");
            sb2.append("}");
            sb2.append(",");
            sb2.append("{counterDown:");
            sb2.append(realmGet$counterDown() != null ? realmGet$counterDown() : "null");
            sb2.append("}");
            sb2.append(",");
            sb2.append("{completed:");
            sb2.append(realmGet$completed());
            sb2.append("}");
            sb2.append(",");
            sb2.append("{checklist:");
            sb2.append("RealmList<ChecklistItem>[");
            sb2.append(realmGet$checklist().size());
            sb2.append("]");
            sb2.append("}");
            sb2.append(",");
            sb2.append("{reminders:");
            sb2.append("RealmList<RemindersItem>[");
            sb2.append(realmGet$reminders().size());
            sb2.append("]");
            sb2.append("}");
            sb2.append(",");
            sb2.append("{frequencyValue:");
            sb2.append(realmGet$frequencyValue() != null ? realmGet$frequencyValue() : "null");
            sb2.append("}");
            sb2.append(",");
            sb2.append("{everyX:");
            sb2.append(realmGet$everyX() != null ? realmGet$everyX() : "null");
            sb2.append("}");
            sb2.append(",");
            sb2.append("{streak:");
            sb2.append(realmGet$streak() != null ? realmGet$streak() : "null");
            sb2.append("}");
            sb2.append(",");
            sb2.append("{startDate:");
            sb2.append(realmGet$startDate() != null ? realmGet$startDate() : "null");
            sb2.append("}");
            sb2.append(",");
            sb2.append("{repeat:");
            sb2.append(realmGet$repeat() != null ? "Days" : "null");
            sb2.append("}");
            sb2.append(",");
            sb2.append("{dueDate:");
            sb2.append(realmGet$dueDate() != null ? realmGet$dueDate() : "null");
            sb2.append("}");
            sb2.append(",");
            sb2.append("{isDue:");
            sb2.append(realmGet$isDue() != null ? realmGet$isDue() : "null");
            sb2.append("}");
            sb2.append(",");
            sb2.append("{nextDue:");
            sb2.append("RealmList<Date>[");
            sb2.append(realmGet$nextDue().size());
            sb2.append("]");
            sb2.append("}");
            sb2.append(",");
            sb2.append("{updatedAt:");
            sb2.append(realmGet$updatedAt() != null ? realmGet$updatedAt() : "null");
            sb2.append("}");
            sb2.append(",");
            sb2.append("{isSaving:");
            sb2.append(realmGet$isSaving());
            sb2.append("}");
            sb2.append(",");
            sb2.append("{hasErrored:");
            sb2.append(realmGet$hasErrored());
            sb2.append("}");
            sb2.append(",");
            sb2.append("{isCreating:");
            sb2.append(realmGet$isCreating());
            sb2.append("}");
            sb2.append(",");
            sb2.append("{yesterDaily:");
            sb2.append(realmGet$yesterDaily());
            sb2.append("}");
            sb2.append(",");
            sb2.append("{daysOfMonthString:");
            sb2.append(realmGet$daysOfMonthString() != null ? realmGet$daysOfMonthString() : "null");
            sb2.append("}");
            sb2.append(",");
            sb2.append("{weeksOfMonthString:");
            sb2.append(realmGet$weeksOfMonthString() != null ? realmGet$weeksOfMonthString() : "null");
            sb2.append("}");
            sb2.append("]");
            return sb2.toString();
        }
        return "Invalid object";
    }
}
