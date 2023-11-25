package com.habitrpg.android.habitica.data.implementation;

import ad.l0;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.local.TaskLocalRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.models.BaseMainObject;
import com.habitrpg.android.habitica.models.responses.BulkTaskScoringData;
import com.habitrpg.android.habitica.models.social.Challenge;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.models.tasks.TaskList;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.modules.AuthenticationHandler;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.shared.habitica.models.responses.TaskDirectionData;
import com.habitrpg.shared.habitica.models.tasks.TaskType;
import com.habitrpg.shared.habitica.models.tasks.TasksOrder;
import dc.w;
import dd.g;
import dd.h;
import dd.i;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import pc.l;
import qc.q;

/* compiled from: TaskRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class TaskRepositoryImpl extends BaseRepositoryImpl<TaskLocalRepository> implements TaskRepository {
    public static final int $stable = 8;
    private final AppConfigManager appConfigManager;
    private long lastTaskAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskRepositoryImpl(TaskLocalRepository taskLocalRepository, ApiClient apiClient, AuthenticationHandler authenticationHandler, AppConfigManager appConfigManager) {
        super(taskLocalRepository, apiClient, authenticationHandler);
        q.i(taskLocalRepository, "localRepository");
        q.i(apiClient, "apiClient");
        q.i(authenticationHandler, "authenticationHandler");
        q.i(appConfigManager, "appConfigManager");
        this.appConfigManager = appConfigManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00e8 -> B:42:0x00eb). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleAssignmentChanges(com.habitrpg.android.habitica.models.tasks.Task r8, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r9, kotlin.coroutines.Continuation<? super dc.w> r10) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl.handleAssignmentChanges(com.habitrpg.android.habitica.models.tasks.Task, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void handleTaskResponse(User user, TaskDirectionData taskDirectionData, Task task, boolean z10, float f10) {
        getLocalRepository().executeTransaction(new TaskRepositoryImpl$handleTaskResponse$1(this, task, user, f10, taskDirectionData, z10));
    }

    @Override // com.habitrpg.android.habitica.data.TaskRepository
    public Object bulkScoreTasks(List<? extends Map<String, String>> list, Continuation<? super BulkTaskScoringData> continuation) {
        return getApiClient().bulkScoreTasks(list, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0109  */
    @Override // com.habitrpg.android.habitica.data.TaskRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object createTask(com.habitrpg.android.habitica.models.tasks.Task r13, boolean r14, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.tasks.Task> r15) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl.createTask(com.habitrpg.android.habitica.models.tasks.Task, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.TaskRepository
    public void createTaskInBackground(Task task, Map<String, ? extends List<String>> map) {
        q.i(task, "task");
        q.i(map, "assignChanges");
        ExceptionHandlerKt.launchCatching$default(l0.b(), null, new TaskRepositoryImpl$createTaskInBackground$1(this, task, map, null), 1, null);
    }

    @Override // com.habitrpg.android.habitica.data.TaskRepository
    public Object createTasks(List<? extends Task> list, Continuation<? super List<? extends Task>> continuation) {
        return getApiClient().createTasks(list, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    @Override // com.habitrpg.android.habitica.data.TaskRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object deleteTask(java.lang.String r5, kotlin.coroutines.Continuation<? super java.lang.Void> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$deleteTask$1
            if (r0 == 0) goto L13
            r0 = r6
            com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$deleteTask$1 r0 = (com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$deleteTask$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$deleteTask$1 r0 = new com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$deleteTask$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl r0 = (com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl) r0
            dc.n.b(r6)
            goto L4e
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            dc.n.b(r6)
            com.habitrpg.android.habitica.data.ApiClient r6 = r4.getApiClient()
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r6.deleteTask(r5, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r0 = r4
        L4e:
            java.lang.Void r6 = (java.lang.Void) r6
            r1 = 0
            if (r6 != 0) goto L54
            return r1
        L54:
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r6 = r0.getLocalRepository()
            com.habitrpg.android.habitica.data.local.TaskLocalRepository r6 = (com.habitrpg.android.habitica.data.local.TaskLocalRepository) r6
            r6.deleteTask(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl.deleteTask(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final AppConfigManager getAppConfigManager() {
        return this.appConfigManager;
    }

    @Override // com.habitrpg.android.habitica.data.TaskRepository
    public g<Task> getTask(String str) {
        q.i(str, TaskFormActivity.TASK_ID_KEY);
        return getLocalRepository().getTask(str);
    }

    @Override // com.habitrpg.android.habitica.data.TaskRepository
    public g<List<Task>> getTaskCopies() {
        final g R = i.R(getAuthenticationHandler().getUserIDFlow(), new TaskRepositoryImpl$getTaskCopies$$inlined$flatMapLatest$1(null, this));
        return new g<List<? extends Task>>() { // from class: com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$getTaskCopies$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$getTaskCopies$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;
                final /* synthetic */ TaskRepositoryImpl this$0;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$getTaskCopies$$inlined$map$1$2", f = "TaskRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$getTaskCopies$$inlined$map$1$2$1  reason: invalid class name */
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

                public AnonymousClass2(h hVar, TaskRepositoryImpl taskRepositoryImpl) {
                    this.$this_unsafeFlow = hVar;
                    this.this$0 = taskRepositoryImpl;
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
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$getTaskCopies$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$getTaskCopies$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$getTaskCopies$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$getTaskCopies$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$getTaskCopies$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L4d
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        java.util.List r5 = (java.util.List) r5
                        com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl r2 = r4.this$0
                        com.habitrpg.android.habitica.data.local.BaseLocalRepository r2 = r2.getLocalRepository()
                        com.habitrpg.android.habitica.data.local.TaskLocalRepository r2 = (com.habitrpg.android.habitica.data.local.TaskLocalRepository) r2
                        java.util.List r5 = r2.getUnmanagedCopy(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4d
                        return r1
                    L4d:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$getTaskCopies$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super List<? extends Task>> hVar, Continuation continuation) {
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

    @Override // com.habitrpg.android.habitica.data.TaskRepository
    public g<Task> getTaskCopy(String str) {
        q.i(str, TaskFormActivity.TASK_ID_KEY);
        return getLocalRepository().getTaskCopy(str);
    }

    @Override // com.habitrpg.android.habitica.data.TaskRepository
    public g<List<Task>> getTasks(TaskType taskType, String str, String[] strArr) {
        q.i(taskType, "taskType");
        q.i(strArr, "includedGroupIDs");
        TaskLocalRepository localRepository = getLocalRepository();
        if (str == null && (str = getAuthenticationHandler().getCurrentUserID()) == null) {
            str = "";
        }
        return localRepository.getTasks(taskType, str, strArr);
    }

    @Override // com.habitrpg.android.habitica.data.TaskRepository
    public g<List<Task>> getTasksForChallenge(String str) {
        TaskLocalRepository localRepository = getLocalRepository();
        String currentUserID = getCurrentUserID();
        if (currentUserID == null) {
            currentUserID = "";
        }
        return localRepository.getTasksForChallenge(str, currentUserID);
    }

    @Override // com.habitrpg.android.habitica.data.TaskRepository
    public g<Task> getUnmanagedTask(String str) {
        q.i(str, "taskid");
        final g<Task> task = getTask(str);
        return new g<Task>() { // from class: com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$getUnmanagedTask$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$getUnmanagedTask$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;
                final /* synthetic */ TaskRepositoryImpl this$0;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$getUnmanagedTask$$inlined$map$1$2", f = "TaskRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$getUnmanagedTask$$inlined$map$1$2$1  reason: invalid class name */
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

                public AnonymousClass2(h hVar, TaskRepositoryImpl taskRepositoryImpl) {
                    this.$this_unsafeFlow = hVar;
                    this.this$0 = taskRepositoryImpl;
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
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$getUnmanagedTask$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$getUnmanagedTask$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$getUnmanagedTask$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$getUnmanagedTask$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$getUnmanagedTask$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L4d
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        com.habitrpg.android.habitica.models.tasks.Task r5 = (com.habitrpg.android.habitica.models.tasks.Task) r5
                        com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl r2 = r4.this$0
                        com.habitrpg.android.habitica.data.local.BaseLocalRepository r2 = r2.getLocalRepository()
                        com.habitrpg.android.habitica.data.local.TaskLocalRepository r2 = (com.habitrpg.android.habitica.data.local.TaskLocalRepository) r2
                        com.habitrpg.android.habitica.models.BaseObject r5 = r2.getUnmanagedCopy(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4d
                        return r1
                    L4d:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$getUnmanagedTask$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
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

    @Override // com.habitrpg.android.habitica.data.TaskRepository
    public void markTaskCompleted(String str, boolean z10) {
        q.i(str, TaskFormActivity.TASK_ID_KEY);
        getLocalRepository().markTaskCompleted(str, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    @Override // com.habitrpg.android.habitica.data.TaskRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object markTaskNeedsWork(com.habitrpg.android.habitica.models.tasks.Task r5, java.lang.String r6, kotlin.coroutines.Continuation<? super dc.w> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$markTaskNeedsWork$1
            if (r0 == 0) goto L13
            r0 = r7
            com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$markTaskNeedsWork$1 r0 = (com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$markTaskNeedsWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$markTaskNeedsWork$1 r0 = new com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$markTaskNeedsWork$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r5 = r0.L$2
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r0.L$1
            com.habitrpg.android.habitica.models.tasks.Task r5 = (com.habitrpg.android.habitica.models.tasks.Task) r5
            java.lang.Object r0 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl r0 = (com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl) r0
            dc.n.b(r7)
            goto L5d
        L36:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3e:
            dc.n.b(r7)
            com.habitrpg.android.habitica.data.ApiClient r7 = r4.getApiClient()
            java.lang.String r2 = r5.getId()
            if (r2 != 0) goto L4d
            java.lang.String r2 = ""
        L4d:
            r0.L$0 = r4
            r0.L$1 = r5
            r0.L$2 = r6
            r0.label = r3
            java.lang.Object r7 = r7.markTaskNeedsWork(r2, r6, r0)
            if (r7 != r1) goto L5c
            return r1
        L5c:
            r0 = r4
        L5d:
            com.habitrpg.android.habitica.models.tasks.Task r7 = (com.habitrpg.android.habitica.models.tasks.Task) r7
            if (r7 == 0) goto Lad
            java.lang.String r1 = r5.getId()
            r7.setId(r1)
            int r5 = r5.getPosition()
            r7.setPosition(r5)
            com.habitrpg.android.habitica.models.tasks.TaskGroupPlan r5 = r7.getGroup()
            if (r5 == 0) goto La4
            io.realm.x0 r5 = r5.getAssignedUsersDetail()
            if (r5 == 0) goto La4
            java.util.Iterator r5 = r5.iterator()
        L7f:
            boolean r1 = r5.hasNext()
            r2 = 0
            if (r1 == 0) goto L98
            java.lang.Object r1 = r5.next()
            r3 = r1
            com.habitrpg.android.habitica.models.tasks.GroupAssignedDetails r3 = (com.habitrpg.android.habitica.models.tasks.GroupAssignedDetails) r3
            java.lang.String r3 = r3.getAssignedUserID()
            boolean r3 = qc.q.d(r3, r6)
            if (r3 == 0) goto L7f
            goto L99
        L98:
            r1 = r2
        L99:
            com.habitrpg.android.habitica.models.tasks.GroupAssignedDetails r1 = (com.habitrpg.android.habitica.models.tasks.GroupAssignedDetails) r1
            if (r1 == 0) goto La4
            r5 = 0
            r1.setCompleted(r5)
            r1.setCompletedDate(r2)
        La4:
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r5 = r0.getLocalRepository()
            com.habitrpg.android.habitica.data.local.TaskLocalRepository r5 = (com.habitrpg.android.habitica.data.local.TaskLocalRepository) r5
            r5.save(r7)
        Lad:
            dc.w r5 = dc.w.f13270a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl.markTaskNeedsWork(com.habitrpg.android.habitica.models.tasks.Task, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.TaskRepository
    public <T extends BaseMainObject> void modify(T t10, l<? super T, w> lVar) {
        q.i(t10, "obj");
        q.i(lVar, "transaction");
        getLocalRepository().modify(t10, lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    @Override // com.habitrpg.android.habitica.data.TaskRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object retrieveCompletedTodos(java.lang.String r5, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.tasks.TaskList> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$retrieveCompletedTodos$1
            if (r0 == 0) goto L13
            r0 = r6
            com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$retrieveCompletedTodos$1 r0 = (com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$retrieveCompletedTodos$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$retrieveCompletedTodos$1 r0 = new com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$retrieveCompletedTodos$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl r0 = (com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl) r0
            dc.n.b(r6)
            goto L50
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            dc.n.b(r6)
            com.habitrpg.android.habitica.data.ApiClient r6 = r4.getApiClient()
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.String r2 = "completedTodos"
            java.lang.Object r6 = r6.getTasks(r2, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            r0 = r4
        L50:
            com.habitrpg.android.habitica.models.tasks.TaskList r6 = (com.habitrpg.android.habitica.models.tasks.TaskList) r6
            if (r6 != 0) goto L56
            r5 = 0
            return r5
        L56:
            java.util.Map r1 = r6.getTasks()
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r2 = r0.getLocalRepository()
            com.habitrpg.android.habitica.data.local.TaskLocalRepository r2 = (com.habitrpg.android.habitica.data.local.TaskLocalRepository) r2
            if (r5 != 0) goto L6e
            com.habitrpg.android.habitica.modules.AuthenticationHandler r5 = r0.getAuthenticationHandler()
            java.lang.String r5 = r5.getCurrentUserID()
            if (r5 != 0) goto L6e
            java.lang.String r5 = ""
        L6e:
            java.util.Collection r0 = r1.values()
            r2.saveCompletedTodos(r5, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl.retrieveCompletedTodos(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.TaskRepository
    public Object retrieveDailiesFromDate(Date date, Continuation<? super TaskList> continuation) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZZZ", Locale.US);
        ApiClient apiClient = getApiClient();
        String format = simpleDateFormat.format(date);
        q.h(format, "format(...)");
        return apiClient.getTasks(Challenge.TASK_ORDER_DAILYS, format, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    @Override // com.habitrpg.android.habitica.data.TaskRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object retrieveTasks(java.lang.String r5, com.habitrpg.shared.habitica.models.tasks.TasksOrder r6, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.tasks.TaskList> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$retrieveTasks$1
            if (r0 == 0) goto L13
            r0 = r7
            com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$retrieveTasks$1 r0 = (com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$retrieveTasks$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$retrieveTasks$1 r0 = new com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$retrieveTasks$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r5 = r0.L$2
            r6 = r5
            com.habitrpg.shared.habitica.models.tasks.TasksOrder r6 = (com.habitrpg.shared.habitica.models.tasks.TasksOrder) r6
            java.lang.Object r5 = r0.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl r0 = (com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl) r0
            dc.n.b(r7)
            goto L55
        L36:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3e:
            dc.n.b(r7)
            com.habitrpg.android.habitica.data.ApiClient r7 = r4.getApiClient()
            r0.L$0 = r4
            r0.L$1 = r5
            r0.L$2 = r6
            r0.label = r3
            java.lang.Object r7 = r7.getTasks(r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r0 = r4
        L55:
            com.habitrpg.android.habitica.models.tasks.TaskList r7 = (com.habitrpg.android.habitica.models.tasks.TaskList) r7
            if (r7 != 0) goto L5b
            r5 = 0
            return r5
        L5b:
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r0 = r0.getLocalRepository()
            com.habitrpg.android.habitica.data.local.TaskLocalRepository r0 = (com.habitrpg.android.habitica.data.local.TaskLocalRepository) r0
            r0.saveTasks(r5, r6, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl.retrieveTasks(java.lang.String, com.habitrpg.shared.habitica.models.tasks.TasksOrder, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.TaskRepository
    public void saveTask(Task task) {
        q.i(task, "task");
        getLocalRepository().save((TaskLocalRepository) task);
    }

    @Override // com.habitrpg.android.habitica.data.TaskRepository
    public void saveTasks(String str, TasksOrder tasksOrder, TaskList taskList) {
        q.i(str, TaskFormActivity.USER_ID_KEY);
        q.i(tasksOrder, "order");
        q.i(taskList, NavigationDrawerFragment.SIDEBAR_TASKS);
        getLocalRepository().saveTasks(str, tasksOrder, taskList);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a A[EDGE_INSN: B:32:0x007a->B:28:0x007a BREAK  A[LOOP:0: B:23:0x0062->B:34:?], SYNTHETIC] */
    @Override // com.habitrpg.android.habitica.data.TaskRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object scoreChecklistItem(java.lang.String r5, java.lang.String r6, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.tasks.Task> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$scoreChecklistItem$1
            if (r0 == 0) goto L13
            r0 = r7
            com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$scoreChecklistItem$1 r0 = (com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$scoreChecklistItem$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$scoreChecklistItem$1 r0 = new com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$scoreChecklistItem$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r5 = r0.L$1
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl r5 = (com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl) r5
            dc.n.b(r7)
            goto L4f
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            dc.n.b(r7)
            com.habitrpg.android.habitica.data.ApiClient r7 = r4.getApiClient()
            r0.L$0 = r4
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = r7.scoreChecklistItem(r5, r6, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            r5 = r4
        L4f:
            com.habitrpg.android.habitica.models.tasks.Task r7 = (com.habitrpg.android.habitica.models.tasks.Task) r7
            r0 = 0
            if (r7 == 0) goto L7c
            io.realm.x0 r1 = r7.getChecklist()
            if (r1 == 0) goto L7c
            int r2 = r1.size()
            java.util.ListIterator r1 = r1.listIterator(r2)
        L62:
            boolean r2 = r1.hasPrevious()
            if (r2 == 0) goto L7a
            java.lang.Object r2 = r1.previous()
            r3 = r2
            com.habitrpg.android.habitica.models.tasks.ChecklistItem r3 = (com.habitrpg.android.habitica.models.tasks.ChecklistItem) r3
            java.lang.String r3 = r3.getId()
            boolean r3 = qc.q.d(r6, r3)
            if (r3 == 0) goto L62
            r0 = r2
        L7a:
            com.habitrpg.android.habitica.models.tasks.ChecklistItem r0 = (com.habitrpg.android.habitica.models.tasks.ChecklistItem) r0
        L7c:
            if (r0 == 0) goto L87
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r5 = r5.getLocalRepository()
            com.habitrpg.android.habitica.data.local.TaskLocalRepository r5 = (com.habitrpg.android.habitica.data.local.TaskLocalRepository) r5
            r5.save(r0)
        L87:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl.scoreChecklistItem(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.TaskRepository
    public void swapTaskPosition(int i10, int i11) {
        getLocalRepository().swapTaskPosition(i10, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f9 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00dc -> B:44:0x00f0). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00eb -> B:43:0x00ee). Please submit an issue!!! */
    @Override // com.habitrpg.android.habitica.data.TaskRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object syncErroredTasks(kotlin.coroutines.Continuation<? super java.util.List<? extends com.habitrpg.android.habitica.models.tasks.Task>> r10) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl.syncErroredTasks(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c2  */
    @Override // com.habitrpg.android.habitica.data.TaskRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object taskChecked(com.habitrpg.android.habitica.models.user.User r31, com.habitrpg.android.habitica.models.tasks.Task r32, boolean r33, boolean r34, pc.l<? super com.habitrpg.shared.habitica.models.responses.TaskScoringResult, dc.w> r35, kotlin.coroutines.Continuation<? super com.habitrpg.shared.habitica.models.responses.TaskScoringResult> r36) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl.taskChecked(com.habitrpg.android.habitica.models.user.User, com.habitrpg.android.habitica.models.tasks.Task, boolean, boolean, pc.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.TaskRepository
    public Object unlinkAllTasks(String str, String str2, Continuation<? super Void> continuation) {
        return getApiClient().unlinkAllTasks(str, str2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    @Override // com.habitrpg.android.habitica.data.TaskRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object updateTask(com.habitrpg.android.habitica.models.tasks.Task r13, boolean r14, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.tasks.Task> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$updateTask$1
            if (r0 == 0) goto L13
            r0 = r15
            com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$updateTask$1 r0 = (com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$updateTask$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$updateTask$1 r0 = new com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$updateTask$1
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 != r4) goto L3a
            java.lang.Object r13 = r0.L$2
            com.habitrpg.android.habitica.models.tasks.Task r13 = (com.habitrpg.android.habitica.models.tasks.Task) r13
            java.lang.Object r14 = r0.L$1
            com.habitrpg.android.habitica.models.tasks.Task r14 = (com.habitrpg.android.habitica.models.tasks.Task) r14
            java.lang.Object r0 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl r0 = (com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl) r0
            dc.n.b(r15)
            r11 = r15
            r15 = r13
            r13 = r14
            r14 = r11
            goto L9a
        L3a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L42:
            dc.n.b(r15)
            java.util.Date r15 = new java.util.Date
            r15.<init>()
            long r5 = r15.getTime()
            long r7 = r12.lastTaskAction
            r15 = 500(0x1f4, float:7.0E-43)
            long r9 = (long) r15
            long r9 = r5 - r9
            int r15 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r15 <= 0) goto L5b
            if (r14 == 0) goto L61
        L5b:
            boolean r14 = r13.isValid()
            if (r14 != 0) goto L62
        L61:
            return r13
        L62:
            r12.lastTaskAction = r5
            java.lang.String r14 = r13.getId()
            if (r14 != 0) goto L6b
            return r13
        L6b:
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r15 = r12.getLocalRepository()
            com.habitrpg.android.habitica.data.local.TaskLocalRepository r15 = (com.habitrpg.android.habitica.data.local.TaskLocalRepository) r15
            com.habitrpg.android.habitica.models.BaseObject r15 = r15.getUnmanagedCopy(r13)
            com.habitrpg.android.habitica.models.tasks.Task r15 = (com.habitrpg.android.habitica.models.tasks.Task) r15
            r15.setSaving(r4)
            r15.setHasErrored(r3)
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r2 = r12.getLocalRepository()
            com.habitrpg.android.habitica.data.local.TaskLocalRepository r2 = (com.habitrpg.android.habitica.data.local.TaskLocalRepository) r2
            r2.save(r15)
            com.habitrpg.android.habitica.data.ApiClient r2 = r12.getApiClient()
            r0.L$0 = r12
            r0.L$1 = r13
            r0.L$2 = r15
            r0.label = r4
            java.lang.Object r14 = r2.updateTask(r14, r15, r0)
            if (r14 != r1) goto L99
            return r1
        L99:
            r0 = r12
        L9a:
            com.habitrpg.android.habitica.models.tasks.Task r14 = (com.habitrpg.android.habitica.models.tasks.Task) r14
            if (r14 != 0) goto L9f
            goto La6
        L9f:
            int r1 = r13.getPosition()
            r14.setPosition(r1)
        La6:
            if (r14 != 0) goto La9
            goto Lb0
        La9:
            java.lang.String r1 = r13.getId()
            r14.setId(r1)
        Lb0:
            if (r14 != 0) goto Lb3
            goto Lba
        Lb3:
            java.lang.String r1 = r13.getOwnerID()
            r14.setOwnerID(r1)
        Lba:
            if (r14 == 0) goto Lcd
            io.realm.x0 r13 = r13.getTags()
            r14.setTags(r13)
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r13 = r0.getLocalRepository()
            com.habitrpg.android.habitica.data.local.TaskLocalRepository r13 = (com.habitrpg.android.habitica.data.local.TaskLocalRepository) r13
            r13.save(r14)
            goto Ldc
        Lcd:
            r15.setHasErrored(r4)
            r15.setSaving(r3)
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r13 = r0.getLocalRepository()
            com.habitrpg.android.habitica.data.local.TaskLocalRepository r13 = (com.habitrpg.android.habitica.data.local.TaskLocalRepository) r13
            r13.save(r15)
        Ldc:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl.updateTask(com.habitrpg.android.habitica.models.tasks.Task, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.TaskRepository
    public void updateTaskInBackground(Task task, Map<String, ? extends List<String>> map) {
        q.i(task, "task");
        q.i(map, "assignChanges");
        ExceptionHandlerKt.launchCatching$default(l0.b(), null, new TaskRepositoryImpl$updateTaskInBackground$1(this, task, map, null), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    @Override // com.habitrpg.android.habitica.data.TaskRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object updateTaskPosition(com.habitrpg.shared.habitica.models.tasks.TaskType r4, java.lang.String r5, int r6, kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> r7) {
        /*
            r3 = this;
            boolean r4 = r7 instanceof com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$updateTaskPosition$1
            if (r4 == 0) goto L13
            r4 = r7
            com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$updateTaskPosition$1 r4 = (com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$updateTaskPosition$1) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.label = r0
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$updateTaskPosition$1 r4 = new com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$updateTaskPosition$1
            r4.<init>(r3, r7)
        L18:
            java.lang.Object r7 = r4.result
            java.lang.Object r0 = ic.b.d()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            java.lang.Object r4 = r4.L$0
            com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl r4 = (com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl) r4
            dc.n.b(r7)
            goto L48
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            dc.n.b(r7)
            com.habitrpg.android.habitica.data.ApiClient r7 = r3.getApiClient()
            r4.L$0 = r3
            r4.label = r2
            java.lang.Object r7 = r7.postTaskNewPosition(r5, r6, r4)
            if (r7 != r0) goto L47
            return r0
        L47:
            r4 = r3
        L48:
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L4e
            r4 = 0
            return r4
        L4e:
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r4 = r4.getLocalRepository()
            com.habitrpg.android.habitica.data.local.TaskLocalRepository r4 = (com.habitrpg.android.habitica.data.local.TaskLocalRepository) r4
            r4.updateTaskPositions(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl.updateTaskPosition(com.habitrpg.shared.habitica.models.tasks.TaskType, java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.TaskRepository
    public List<Task> getTaskCopies(List<? extends Task> list) {
        q.i(list, NavigationDrawerFragment.SIDEBAR_TASKS);
        return getLocalRepository().getUnmanagedCopy(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    @Override // com.habitrpg.android.habitica.data.TaskRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object retrieveTasks(java.lang.String r6, com.habitrpg.shared.habitica.models.tasks.TasksOrder r7, java.util.Date r8, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.tasks.TaskList> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$retrieveTasks$2
            if (r0 == 0) goto L13
            r0 = r9
            com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$retrieveTasks$2 r0 = (com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$retrieveTasks$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$retrieveTasks$2 r0 = new com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$retrieveTasks$2
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r6 = r0.L$2
            r7 = r6
            com.habitrpg.shared.habitica.models.tasks.TasksOrder r7 = (com.habitrpg.shared.habitica.models.tasks.TasksOrder) r7
            java.lang.Object r6 = r0.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r8 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl r8 = (com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl) r8
            dc.n.b(r9)
            goto L69
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            dc.n.b(r9)
            java.text.SimpleDateFormat r9 = new java.text.SimpleDateFormat
            java.lang.String r2 = "yyyy-MM-dd'T'HH:mm:ssZZZZZ"
            java.util.Locale r4 = java.util.Locale.US
            r9.<init>(r2, r4)
            com.habitrpg.android.habitica.data.ApiClient r2 = r5.getApiClient()
            java.lang.String r8 = r9.format(r8)
            java.lang.String r9 = "format(...)"
            qc.q.h(r8, r9)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r3
            java.lang.String r9 = "dailys"
            java.lang.Object r9 = r2.getTasks(r9, r8, r0)
            if (r9 != r1) goto L68
            return r1
        L68:
            r8 = r5
        L69:
            com.habitrpg.android.habitica.models.tasks.TaskList r9 = (com.habitrpg.android.habitica.models.tasks.TaskList) r9
            if (r9 != 0) goto L6f
            r6 = 0
            return r6
        L6f:
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r8 = r8.getLocalRepository()
            com.habitrpg.android.habitica.data.local.TaskLocalRepository r8 = (com.habitrpg.android.habitica.data.local.TaskLocalRepository) r8
            r8.saveTasks(r6, r7, r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl.retrieveTasks(java.lang.String, com.habitrpg.shared.habitica.models.tasks.TasksOrder, java.util.Date, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    @Override // com.habitrpg.android.habitica.data.TaskRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object taskChecked(com.habitrpg.android.habitica.models.user.User r9, java.lang.String r10, boolean r11, boolean r12, pc.l<? super com.habitrpg.shared.habitica.models.responses.TaskScoringResult, dc.w> r13, kotlin.coroutines.Continuation<? super com.habitrpg.shared.habitica.models.responses.TaskScoringResult> r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$taskChecked$2
            if (r0 == 0) goto L13
            r0 = r14
            com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$taskChecked$2 r0 = (com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$taskChecked$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$taskChecked$2 r0 = new com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl$taskChecked$2
            r0.<init>(r8, r14)
        L18:
            r7 = r0
            java.lang.Object r14 = r7.result
            java.lang.Object r0 = ic.b.d()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L4b
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            dc.n.b(r14)
            goto L86
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            boolean r12 = r7.Z$1
            boolean r11 = r7.Z$0
            java.lang.Object r9 = r7.L$2
            r13 = r9
            pc.l r13 = (pc.l) r13
            java.lang.Object r9 = r7.L$1
            com.habitrpg.android.habitica.models.user.User r9 = (com.habitrpg.android.habitica.models.user.User) r9
            java.lang.Object r10 = r7.L$0
            com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl r10 = (com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl) r10
            dc.n.b(r14)
            r1 = r10
            goto L6c
        L4b:
            dc.n.b(r14)
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r14 = r8.getLocalRepository()
            com.habitrpg.android.habitica.data.local.TaskLocalRepository r14 = (com.habitrpg.android.habitica.data.local.TaskLocalRepository) r14
            dd.g r10 = r14.getTask(r10)
            r7.L$0 = r8
            r7.L$1 = r9
            r7.L$2 = r13
            r7.Z$0 = r11
            r7.Z$1 = r12
            r7.label = r3
            java.lang.Object r14 = dd.i.x(r10, r7)
            if (r14 != r0) goto L6b
            return r0
        L6b:
            r1 = r8
        L6c:
            r4 = r11
            r5 = r12
            r6 = r13
            r3 = r14
            com.habitrpg.android.habitica.models.tasks.Task r3 = (com.habitrpg.android.habitica.models.tasks.Task) r3
            r10 = 0
            if (r3 != 0) goto L76
            return r10
        L76:
            r7.L$0 = r10
            r7.L$1 = r10
            r7.L$2 = r10
            r7.label = r2
            r2 = r9
            java.lang.Object r14 = r1.taskChecked(r2, r3, r4, r5, r6, r7)
            if (r14 != r0) goto L86
            return r0
        L86:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl.taskChecked(com.habitrpg.android.habitica.models.user.User, java.lang.String, boolean, boolean, pc.l, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
