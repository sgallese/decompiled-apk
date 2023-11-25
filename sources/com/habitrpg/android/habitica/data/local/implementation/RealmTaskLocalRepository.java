package com.habitrpg.android.habitica.data.local.implementation;

import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.data.local.TaskLocalRepository;
import com.habitrpg.android.habitica.models.tasks.ChecklistItem;
import com.habitrpg.android.habitica.models.tasks.RemindersItem;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.models.tasks.TaskList;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.shared.habitica.models.tasks.TaskType;
import com.habitrpg.shared.habitica.models.tasks.TasksOrder;
import dc.w;
import dd.g;
import dd.h;
import dd.i;
import io.realm.RealmQuery;
import io.realm.g1;
import io.realm.j0;
import io.realm.j1;
import io.realm.o0;
import io.realm.x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import qc.q;
import yc.v;

/* compiled from: RealmTaskLocalRepository.kt */
/* loaded from: classes4.dex */
public final class RealmTaskLocalRepository extends RealmBaseLocalRepository implements TaskLocalRepository {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealmTaskLocalRepository(o0 o0Var) {
        super(o0Var);
        q.i(o0Var, "realm");
    }

    private final g1<Task> findTasks(TaskType taskType, String str) {
        g1<Task> p10 = getRealm().k1(Task.class).n("typeValue", taskType.getValue()).n("ownerID", str).K("position", j1.ASCENDING, "dateCreated", j1.DESCENDING).p();
        q.h(p10, "findAll(...)");
        return p10;
    }

    private final void removeCompletedTodos(String str, Collection<Task> collection) {
        j0 a10 = getRealm().k1(Task.class).n("ownerID", str).n("typeValue", TaskType.TODO.getValue()).l(Task.FILTER_COMPLETED, Boolean.TRUE).p().a();
        q.f(a10);
        ArrayList arrayList = new ArrayList();
        for (Object obj : a10) {
            if (!collection.contains((Task) obj)) {
                arrayList.add(obj);
            }
        }
        executeTransaction(new RealmTaskLocalRepository$removeCompletedTodos$1(arrayList));
    }

    private final void removeOldChecklists(List<? extends ChecklistItem> list) {
        j0 a10 = getRealm().k1(ChecklistItem.class).p().a();
        q.f(a10);
        final ArrayList arrayList = new ArrayList();
        for (Object obj : a10) {
            if (!list.contains((ChecklistItem) obj)) {
                arrayList.add(obj);
            }
        }
        getRealm().V0(new o0.a() { // from class: com.habitrpg.android.habitica.data.local.implementation.c
            @Override // io.realm.o0.a
            public final void a(o0 o0Var) {
                RealmTaskLocalRepository.removeOldChecklists$lambda$7(arrayList, o0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeOldChecklists$lambda$7(List list, o0 o0Var) {
        q.i(list, "$itemsToDelete");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ChecklistItem) it.next()).deleteFromRealm();
        }
    }

    private final void removeOldReminders(List<? extends RemindersItem> list) {
        j0 a10 = getRealm().k1(RemindersItem.class).p().a();
        q.f(a10);
        final ArrayList arrayList = new ArrayList();
        for (Object obj : a10) {
            if (!list.contains((RemindersItem) obj)) {
                arrayList.add(obj);
            }
        }
        getRealm().V0(new o0.a() { // from class: com.habitrpg.android.habitica.data.local.implementation.b
            @Override // io.realm.o0.a
            public final void a(o0 o0Var) {
                RealmTaskLocalRepository.removeOldReminders$lambda$9(arrayList, o0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeOldReminders$lambda$9(List list, o0 o0Var) {
        q.i(list, "$itemsToDelete");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((RemindersItem) it.next()).deleteFromRealm();
        }
    }

    private final void removeOldTasks(String str, List<? extends Task> list) {
        if (getRealm().isClosed()) {
            return;
        }
        RealmQuery b10 = getRealm().k1(Task.class).n("ownerID", str).b().b();
        TaskType taskType = TaskType.TODO;
        j0 a10 = b10.n("typeValue", taskType.getValue()).l(Task.FILTER_COMPLETED, Boolean.FALSE).j().H().F("typeValue", taskType.getValue()).j().p().a();
        q.f(a10);
        ArrayList arrayList = new ArrayList();
        for (Object obj : a10) {
            if (!list.contains((Task) obj)) {
                arrayList.add(obj);
            }
        }
        executeTransaction(new RealmTaskLocalRepository$removeOldTasks$1(arrayList));
    }

    private final List<Task> sortTasks(Map<String, Task> map, List<String> list) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (String str : list) {
            Task task = map.get(str);
            if (task != null) {
                task.setPosition(i10);
                arrayList.add(task);
                i10++;
                map.remove(str);
            }
        }
        return arrayList;
    }

    @Override // com.habitrpg.android.habitica.data.local.TaskLocalRepository
    public void deleteTask(String str) {
        q.i(str, "taskID");
        executeTransaction(new RealmTaskLocalRepository$deleteTask$1((Task) getRealm().k1(Task.class).n("id", str).q()));
    }

    @Override // com.habitrpg.android.habitica.data.local.TaskLocalRepository
    public g<List<Task>> getErroredTasks(String str) {
        q.i(str, "userID");
        g1 p10 = getRealm().k1(Task.class).n("ownerID", str).l("hasErrored", Boolean.TRUE).I("position").p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        return new g<g1<Task>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getErroredTasks$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getErroredTasks$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getErroredTasks$$inlined$filter$1$2", f = "RealmTaskLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getErroredTasks$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(h hVar) {
                    this.$this_unsafeFlow = hVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getErroredTasks$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getErroredTasks$$inlined$filter$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getErroredTasks$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getErroredTasks$$inlined$filter$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getErroredTasks$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        r2 = r5
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r2 = r2.isLoaded()
                        if (r2 == 0) goto L48
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getErroredTasks$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<Task>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }

    @Override // com.habitrpg.android.habitica.data.local.TaskLocalRepository
    public g<Task> getTask(String str) {
        q.i(str, TaskFormActivity.TASK_ID_KEY);
        if (getRealm().isClosed()) {
            return i.s();
        }
        g1 p10 = getRealm().k1(Task.class).n("id", str).p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        final g<g1<Task>> gVar = new g<g1<Task>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTask$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTask$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTask$$inlined$filter$1$2", f = "RealmTaskLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTask$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(h hVar) {
                    this.$this_unsafeFlow = hVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTask$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTask$$inlined$filter$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTask$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTask$$inlined$filter$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTask$$inlined$filter$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r7)
                        goto L54
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        dc.n.b(r7)
                        dd.h r7 = r5.$this_unsafeFlow
                        r2 = r6
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r4 = r2.isLoaded()
                        if (r4 == 0) goto L48
                        boolean r2 = r2.isEmpty()
                        r2 = r2 ^ r3
                        if (r2 == 0) goto L48
                        r2 = 1
                        goto L49
                    L48:
                        r2 = 0
                    L49:
                        if (r2 == 0) goto L54
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L54
                        return r1
                    L54:
                        dc.w r6 = dc.w.f13270a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTask$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<Task>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
        return i.u(new g<Task>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTask$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTask$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTask$$inlined$map$1$2", f = "RealmTaskLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTask$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(h hVar) {
                    this.$this_unsafeFlow = hVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTask$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTask$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTask$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTask$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTask$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L45
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        io.realm.g1 r5 = (io.realm.g1) r5
                        java.lang.Object r5 = r5.first()
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTask$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super Task> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        });
    }

    @Override // com.habitrpg.android.habitica.data.local.TaskLocalRepository
    public g<Task> getTaskAtPosition(String str, int i10) {
        q.i(str, "taskType");
        g1 p10 = getRealm().k1(Task.class).n("typeValue", str).m("position", Integer.valueOf(i10)).p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        final g<g1<Task>> gVar = new g<g1<Task>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTaskAtPosition$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTaskAtPosition$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTaskAtPosition$$inlined$filter$1$2", f = "RealmTaskLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTaskAtPosition$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(h hVar) {
                    this.$this_unsafeFlow = hVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTaskAtPosition$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTaskAtPosition$$inlined$filter$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTaskAtPosition$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTaskAtPosition$$inlined$filter$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTaskAtPosition$$inlined$filter$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r7)
                        goto L54
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        dc.n.b(r7)
                        dd.h r7 = r5.$this_unsafeFlow
                        r2 = r6
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r4 = r2.isLoaded()
                        if (r4 == 0) goto L48
                        boolean r2 = r2.isEmpty()
                        r2 = r2 ^ r3
                        if (r2 == 0) goto L48
                        r2 = 1
                        goto L49
                    L48:
                        r2 = 0
                    L49:
                        if (r2 == 0) goto L54
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L54
                        return r1
                    L54:
                        dc.w r6 = dc.w.f13270a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTaskAtPosition$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<Task>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
        return i.u(new g<Task>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTaskAtPosition$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTaskAtPosition$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTaskAtPosition$$inlined$map$1$2", f = "RealmTaskLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTaskAtPosition$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(h hVar) {
                    this.$this_unsafeFlow = hVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTaskAtPosition$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTaskAtPosition$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTaskAtPosition$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTaskAtPosition$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTaskAtPosition$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L45
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        io.realm.g1 r5 = (io.realm.g1) r5
                        java.lang.Object r5 = r5.first()
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTaskAtPosition$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super Task> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        });
    }

    @Override // com.habitrpg.android.habitica.data.local.TaskLocalRepository
    public g<Task> getTaskCopy(String str) {
        q.i(str, TaskFormActivity.TASK_ID_KEY);
        final g<Task> task = getTask(str);
        return new g<Task>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTaskCopy$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTaskCopy$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;
                final /* synthetic */ RealmTaskLocalRepository this$0;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTaskCopy$$inlined$map$1$2", f = "RealmTaskLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTaskCopy$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(h hVar, RealmTaskLocalRepository realmTaskLocalRepository) {
                    this.$this_unsafeFlow = hVar;
                    this.this$0 = realmTaskLocalRepository;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTaskCopy$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTaskCopy$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTaskCopy$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTaskCopy$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTaskCopy$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L59
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        com.habitrpg.android.habitica.models.tasks.Task r5 = (com.habitrpg.android.habitica.models.tasks.Task) r5
                        boolean r2 = r5.isManaged()
                        if (r2 == 0) goto L50
                        boolean r2 = r5.isValid()
                        if (r2 == 0) goto L50
                        com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository r2 = r4.this$0
                        io.realm.o0 r2 = r2.getRealm()
                        io.realm.a1 r5 = r2.s0(r5)
                        com.habitrpg.android.habitica.models.tasks.Task r5 = (com.habitrpg.android.habitica.models.tasks.Task) r5
                    L50:
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L59
                        return r1
                    L59:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTaskCopy$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super Task> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar, this), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }

    @Override // com.habitrpg.android.habitica.data.local.TaskLocalRepository
    public g<List<Task>> getTasks(TaskType taskType, String str, String[] strArr) {
        q.i(taskType, "taskType");
        q.i(str, "userID");
        q.i(strArr, "includedGroupIDs");
        if (getRealm().isClosed()) {
            return i.s();
        }
        final g a10 = ac.c.a(findTasks(taskType, str));
        return new g<g1<Task>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTasks$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTasks$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTasks$$inlined$filter$1$2", f = "RealmTaskLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTasks$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(h hVar) {
                    this.$this_unsafeFlow = hVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTasks$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTasks$$inlined$filter$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTasks$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTasks$$inlined$filter$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTasks$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        r2 = r5
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r2 = r2.isLoaded()
                        if (r2 == 0) goto L48
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTasks$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<Task>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }

    @Override // com.habitrpg.android.habitica.data.local.TaskLocalRepository
    public g<List<Task>> getTasksForChallenge(String str, String str2) {
        g1 p10 = getRealm().k1(Task.class).n("challengeID", str).n("ownerID", str2).p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        return new g<g1<Task>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTasksForChallenge$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTasksForChallenge$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTasksForChallenge$$inlined$filter$1$2", f = "RealmTaskLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTasksForChallenge$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(h hVar) {
                    this.$this_unsafeFlow = hVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTasksForChallenge$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTasksForChallenge$$inlined$filter$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTasksForChallenge$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTasksForChallenge$$inlined$filter$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTasksForChallenge$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        r2 = r5
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r2 = r2.isLoaded()
                        if (r2 == 0) goto L48
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTasksForChallenge$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<Task>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }

    @Override // com.habitrpg.android.habitica.data.local.TaskLocalRepository
    public g<User> getUser(String str) {
        q.i(str, "userID");
        g1 p10 = getRealm().k1(User.class).n("id", str).p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        final g<g1<User>> gVar = new g<g1<User>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getUser$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getUser$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getUser$$inlined$filter$1$2", f = "RealmTaskLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getUser$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(h hVar) {
                    this.$this_unsafeFlow = hVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getUser$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getUser$$inlined$filter$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getUser$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getUser$$inlined$filter$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getUser$$inlined$filter$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r7)
                        goto L59
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        dc.n.b(r7)
                        dd.h r7 = r5.$this_unsafeFlow
                        r2 = r6
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r4 = r2.isLoaded()
                        if (r4 == 0) goto L4d
                        boolean r4 = r2.isValid()
                        if (r4 == 0) goto L4d
                        boolean r2 = r2.isEmpty()
                        if (r2 != 0) goto L4d
                        r2 = 1
                        goto L4e
                    L4d:
                        r2 = 0
                    L4e:
                        if (r2 == 0) goto L59
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L59
                        return r1
                    L59:
                        dc.w r6 = dc.w.f13270a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getUser$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<User>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
        return i.u(new g<User>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getUser$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getUser$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getUser$$inlined$map$1$2", f = "RealmTaskLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getUser$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(h hVar) {
                    this.$this_unsafeFlow = hVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getUser$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getUser$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getUser$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getUser$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getUser$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L45
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        io.realm.g1 r5 = (io.realm.g1) r5
                        java.lang.Object r5 = r5.first()
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getUser$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super User> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        });
    }

    @Override // com.habitrpg.android.habitica.data.local.TaskLocalRepository
    public void markTaskCompleted(String str, boolean z10) {
        q.i(str, TaskFormActivity.TASK_ID_KEY);
        executeTransaction(new RealmTaskLocalRepository$markTaskCompleted$1((Task) getRealm().k1(Task.class).n("id", str).q()));
    }

    @Override // com.habitrpg.android.habitica.data.local.TaskLocalRepository
    public void saveCompletedTodos(String str, Collection<Task> collection) {
        q.i(str, TaskFormActivity.USER_ID_KEY);
        q.i(collection, NavigationDrawerFragment.SIDEBAR_TASKS);
        removeCompletedTodos(str, collection);
        executeTransaction(new RealmTaskLocalRepository$saveCompletedTodos$1(collection));
    }

    @Override // com.habitrpg.android.habitica.data.local.TaskLocalRepository
    public void saveTasks(String str, TasksOrder tasksOrder, TaskList taskList) {
        boolean u10;
        Object obj;
        int i10;
        boolean z10;
        q.i(str, "ownerID");
        q.i(tasksOrder, "tasksOrder");
        q.i(taskList, NavigationDrawerFragment.SIDEBAR_TASKS);
        List<? extends Task> arrayList = new ArrayList<>();
        arrayList.addAll(sortTasks(taskList.getTasks(), tasksOrder.getHabits()));
        arrayList.addAll(sortTasks(taskList.getTasks(), tasksOrder.getDailys()));
        arrayList.addAll(sortTasks(taskList.getTasks(), tasksOrder.getTodos()));
        arrayList.addAll(sortTasks(taskList.getTasks(), tasksOrder.getRewards()));
        for (Task task : taskList.getTasks().values()) {
            ListIterator<? extends Task> listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    obj = listIterator.previous();
                    if (((Task) obj).getType() == task.getType()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Task task2 = (Task) obj;
            if (task2 != null) {
                i10 = task2.getPosition();
            } else {
                i10 = -1;
            }
            task.setPosition(i10 + 1);
            arrayList.add(task);
        }
        removeOldTasks(str, arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Task task3 : arrayList) {
            u10 = v.u(task3.getOwnerID());
            if (u10) {
                task3.setOwnerID(str);
            }
            x0<ChecklistItem> checklist = task3.getChecklist();
            if (checklist != null) {
                arrayList2.addAll(checklist);
            }
            x0<RemindersItem> reminders = task3.getReminders();
            if (reminders != null) {
                arrayList3.addAll(reminders);
            }
        }
        removeOldReminders(arrayList3);
        removeOldChecklists(arrayList2);
        executeTransaction(new RealmTaskLocalRepository$saveTasks$3(arrayList));
    }

    @Override // com.habitrpg.android.habitica.data.local.TaskLocalRepository
    public void swapTaskPosition(int i10, int i11) {
        Task task = (Task) getRealm().k1(Task.class).m("position", Integer.valueOf(i10)).q();
        Task task2 = (Task) getRealm().k1(Task.class).m("position", Integer.valueOf(i11)).q();
        if (task != null && task2 != null && task.isValid() && task2.isValid()) {
            executeTransaction(new RealmTaskLocalRepository$swapTaskPosition$1(task, i11, task2, i10));
        }
    }

    @Override // com.habitrpg.android.habitica.data.local.TaskLocalRepository
    public TaskList updateIsdue(TaskList taskList) {
        Boolean bool;
        q.i(taskList, "daily");
        g1 p10 = getRealm().k1(Task.class).n("typeValue", TaskType.DAILY.getValue()).p();
        getRealm().beginTransaction();
        q.f(p10);
        ArrayList<Task> arrayList = new ArrayList();
        for (Object obj : p10) {
            if (taskList.getTasks().containsKey(((Task) obj).getId())) {
                arrayList.add(obj);
            }
        }
        for (Task task : arrayList) {
            Task task2 = taskList.getTasks().get(task.getId());
            if (task2 != null) {
                bool = task2.isDue();
            } else {
                bool = null;
            }
            task.setDue(bool);
        }
        getRealm().m();
        return taskList;
    }

    @Override // com.habitrpg.android.habitica.data.local.TaskLocalRepository
    public void updateTaskPositions(List<String> list) {
        q.i(list, "taskOrder");
        List<String> list2 = list;
        if ((!list2.isEmpty()) != false) {
            executeTransaction(new RealmTaskLocalRepository$updateTaskPositions$1(getRealm().k1(Task.class).v("id", (String[]) list2.toArray(new String[0])).p(), list));
        }
    }

    @Override // com.habitrpg.android.habitica.data.local.TaskLocalRepository
    public g<List<Task>> getTasks(String str) {
        q.i(str, TaskFormActivity.USER_ID_KEY);
        if (getRealm().isClosed()) {
            return i.s();
        }
        g1 p10 = getRealm().k1(Task.class).n("ownerID", str).K("position", j1.ASCENDING, "dateCreated", j1.DESCENDING).p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        return new g<g1<Task>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTasks$$inlined$filter$2

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTasks$$inlined$filter$2$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTasks$$inlined$filter$2$2", f = "RealmTaskLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTasks$$inlined$filter$2$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(h hVar) {
                    this.$this_unsafeFlow = hVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTasks$$inlined$filter$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTasks$$inlined$filter$2$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTasks$$inlined$filter$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTasks$$inlined$filter$2$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTasks$$inlined$filter$2$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        r2 = r5
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r2 = r2.isLoaded()
                        if (r2 == 0) goto L48
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository$getTasks$$inlined$filter$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<Task>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }
}
