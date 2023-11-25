package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.ui.theme.HabiticaColors;
import com.habitrpg.android.habitica.ui.theme.HabiticaTheme;
import com.habitrpg.android.habitica.ui.theme.HabiticaThemeKt;
import com.habitrpg.android.habitica.ui.views.tasks.AssignedViewKt;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* compiled from: TaskFormActivity.kt */
/* loaded from: classes4.dex */
final class TaskFormActivity$onCreate$10 extends qc.r implements pc.p<j0.l, Integer, dc.w> {
    final /* synthetic */ TaskFormActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TaskFormActivity.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.activities.TaskFormActivity$onCreate$10$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends qc.r implements pc.p<j0.l, Integer, dc.w> {
        final /* synthetic */ TaskFormActivity this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TaskFormActivity.kt */
        /* renamed from: com.habitrpg.android.habitica.ui.activities.TaskFormActivity$onCreate$10$1$2  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass2 extends qc.r implements pc.a<dc.w> {
            final /* synthetic */ TaskFormActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(TaskFormActivity taskFormActivity) {
                super(0);
                this.this$0 = taskFormActivity;
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ dc.w invoke() {
                invoke2();
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.showAssignDialog();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TaskFormActivity.kt */
        /* renamed from: com.habitrpg.android.habitica.ui.activities.TaskFormActivity$onCreate$10$1$3  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass3 extends qc.r implements pc.l<String, dc.w> {
            final /* synthetic */ TaskFormActivity this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: TaskFormActivity.kt */
            @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.TaskFormActivity$onCreate$10$1$3$1", f = "TaskFormActivity.kt", l = {322}, m = "invokeSuspend")
            /* renamed from: com.habitrpg.android.habitica.ui.activities.TaskFormActivity$onCreate$10$1$3$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C02711 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
                final /* synthetic */ String $it;
                int label;
                final /* synthetic */ TaskFormActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C02711(TaskFormActivity taskFormActivity, String str, Continuation<? super C02711> continuation) {
                    super(2, continuation);
                    this.this$0 = taskFormActivity;
                    this.$it = str;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                    return new C02711(this.this$0, this.$it, continuation);
                }

                @Override // pc.p
                public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                    return ((C02711) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d10;
                    Task task;
                    d10 = ic.d.d();
                    int i10 = this.label;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            dc.n.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        dc.n.b(obj);
                        task = this.this$0.task;
                        if (task != null) {
                            TaskFormActivity taskFormActivity = this.this$0;
                            String str = this.$it;
                            TaskRepository taskRepository = taskFormActivity.getTaskRepository();
                            this.label = 1;
                            if (taskRepository.markTaskNeedsWork(task, str, this) == d10) {
                                return d10;
                            }
                        }
                    }
                    return dc.w.f13270a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(TaskFormActivity taskFormActivity) {
                super(1);
                this.this$0 = taskFormActivity;
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(String str) {
                invoke2(str);
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
                t0.t tVar;
                qc.q.i(str, "it");
                tVar = this.this$0.taskCompletedMap;
                tVar.remove(str);
                ad.i.d(androidx.lifecycle.w.a(this.this$0), ad.a1.c(), null, new C02711(this.this$0, str, null), 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TaskFormActivity taskFormActivity) {
            super(2);
            this.this$0 = taskFormActivity;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            t0.r rVar;
            t0.t tVar;
            Task task;
            Task task2;
            t0.r rVar2;
            if ((i10 & 11) == 2 && lVar.t()) {
                lVar.z();
                return;
            }
            if (j0.n.K()) {
                j0.n.V(1274571077, i10, -1, "com.habitrpg.android.habitica.ui.activities.TaskFormActivity.onCreate.<anonymous>.<anonymous> (TaskFormActivity.kt:310)");
            }
            rVar = this.this$0.groupMembers;
            TaskFormActivity taskFormActivity = this.this$0;
            ArrayList arrayList = new ArrayList();
            for (Object obj : rVar) {
                rVar2 = taskFormActivity.assignedIDs;
                if (rVar2.contains(((Member) obj).getId())) {
                    arrayList.add(obj);
                }
            }
            tVar = this.this$0.taskCompletedMap;
            HabiticaTheme habiticaTheme = HabiticaTheme.INSTANCE;
            int i11 = HabiticaTheme.$stable;
            HabiticaColors colors = habiticaTheme.getColors(lVar, i11);
            task = this.this$0.task;
            int i12 = Task.$stable;
            int i13 = HabiticaColors.$stable;
            long m146windowBackgroundForXeAY9LY = colors.m146windowBackgroundForXeAY9LY(task, lVar, (i13 << 3) | i12);
            HabiticaColors colors2 = habiticaTheme.getColors(lVar, i11);
            task2 = this.this$0.task;
            AssignedViewKt.m179AssignedViewnjYn8yo(arrayList, tVar, m146windowBackgroundForXeAY9LY, colors2.m144textPrimaryForXeAY9LY(task2, lVar, i12 | (i13 << 3)), new AnonymousClass2(this.this$0), new AnonymousClass3(this.this$0), null, true, lVar, 12582920, 64);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskFormActivity$onCreate$10(TaskFormActivity taskFormActivity) {
        super(2);
        this.this$0 = taskFormActivity;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return dc.w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        if ((i10 & 11) == 2 && lVar.t()) {
            lVar.z();
            return;
        }
        if (j0.n.K()) {
            j0.n.V(-2004371280, i10, -1, "com.habitrpg.android.habitica.ui.activities.TaskFormActivity.onCreate.<anonymous> (TaskFormActivity.kt:309)");
        }
        HabiticaThemeKt.HabiticaTheme(q0.c.b(lVar, 1274571077, true, new AnonymousClass1(this.this$0)), lVar, 6);
        if (j0.n.K()) {
            j0.n.U();
        }
    }
}
