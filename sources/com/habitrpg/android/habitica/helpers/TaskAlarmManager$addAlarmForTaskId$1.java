package com.habitrpg.android.habitica.helpers;

import ad.k0;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.models.tasks.Task;
import dc.n;
import dc.w;
import dd.i;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskAlarmManager.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.helpers.TaskAlarmManager$addAlarmForTaskId$1", f = "TaskAlarmManager.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class TaskAlarmManager$addAlarmForTaskId$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ String $taskId;
    int label;
    final /* synthetic */ TaskAlarmManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskAlarmManager$addAlarmForTaskId$1(TaskAlarmManager taskAlarmManager, String str, Continuation<? super TaskAlarmManager$addAlarmForTaskId$1> continuation) {
        super(2, continuation);
        this.this$0 = taskAlarmManager;
        this.$taskId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new TaskAlarmManager$addAlarmForTaskId$1(this.this$0, this.$taskId, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((TaskAlarmManager$addAlarmForTaskId$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        TaskRepository taskRepository;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            taskRepository = this.this$0.taskRepository;
            final dd.g<Task> taskCopy = taskRepository.getTaskCopy(this.$taskId);
            dd.g<Task> gVar = new dd.g<Task>() { // from class: com.habitrpg.android.habitica.helpers.TaskAlarmManager$addAlarmForTaskId$1$invokeSuspend$$inlined$filter$1

                /* compiled from: Emitters.kt */
                /* renamed from: com.habitrpg.android.habitica.helpers.TaskAlarmManager$addAlarmForTaskId$1$invokeSuspend$$inlined$filter$1$2  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements dd.h {
                    final /* synthetic */ dd.h $this_unsafeFlow;

                    /* compiled from: Emitters.kt */
                    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.helpers.TaskAlarmManager$addAlarmForTaskId$1$invokeSuspend$$inlined$filter$1$2", f = "TaskAlarmManager.kt", l = {223}, m = "emit")
                    /* renamed from: com.habitrpg.android.habitica.helpers.TaskAlarmManager$addAlarmForTaskId$1$invokeSuspend$$inlined$filter$1$2$1  reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
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

                    public AnonymousClass2(dd.h hVar) {
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
                            boolean r0 = r7 instanceof com.habitrpg.android.habitica.helpers.TaskAlarmManager$addAlarmForTaskId$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r7
                            com.habitrpg.android.habitica.helpers.TaskAlarmManager$addAlarmForTaskId$1$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.habitrpg.android.habitica.helpers.TaskAlarmManager$addAlarmForTaskId$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.habitrpg.android.habitica.helpers.TaskAlarmManager$addAlarmForTaskId$1$invokeSuspend$$inlined$filter$1$2$1 r0 = new com.habitrpg.android.habitica.helpers.TaskAlarmManager$addAlarmForTaskId$1$invokeSuspend$$inlined$filter$1$2$1
                            r0.<init>(r7)
                        L18:
                            java.lang.Object r7 = r0.result
                            java.lang.Object r1 = ic.b.d()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            dc.n.b(r7)
                            goto L5b
                        L29:
                            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                            r6.<init>(r7)
                            throw r6
                        L31:
                            dc.n.b(r7)
                            dd.h r7 = r5.$this_unsafeFlow
                            r2 = r6
                            com.habitrpg.android.habitica.models.tasks.Task r2 = (com.habitrpg.android.habitica.models.tasks.Task) r2
                            boolean r4 = r2.isValid()
                            if (r4 == 0) goto L4f
                            boolean r4 = r2.isManaged()
                            if (r4 == 0) goto L4f
                            com.habitrpg.shared.habitica.models.tasks.TaskType r4 = com.habitrpg.shared.habitica.models.tasks.TaskType.DAILY
                            com.habitrpg.shared.habitica.models.tasks.TaskType r2 = r2.getType()
                            if (r4 != r2) goto L4f
                            r2 = 1
                            goto L50
                        L4f:
                            r2 = 0
                        L50:
                            if (r2 == 0) goto L5b
                            r0.label = r3
                            java.lang.Object r6 = r7.emit(r6, r0)
                            if (r6 != r1) goto L5b
                            return r1
                        L5b:
                            dc.w r6 = dc.w.f13270a
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.helpers.TaskAlarmManager$addAlarmForTaskId$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // dd.g
                public Object collect(dd.h<? super Task> hVar, Continuation continuation) {
                    Object d11;
                    Object collect = dd.g.this.collect(new AnonymousClass2(hVar), continuation);
                    d11 = ic.d.d();
                    if (collect == d11) {
                        return collect;
                    }
                    return w.f13270a;
                }
            };
            this.label = 1;
            obj = i.v(gVar, this);
            if (obj == d10) {
                return d10;
            }
        }
        this.this$0.setAlarmsForTask((Task) obj);
        return w.f13270a;
    }
}
