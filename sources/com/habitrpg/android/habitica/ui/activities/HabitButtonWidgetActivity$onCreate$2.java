package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.ui.adapter.SkillTasksRecyclerViewAdapter;
import com.habitrpg.shared.habitica.models.tasks.TaskType;
import java.util.List;
import kotlin.coroutines.Continuation;

/* compiled from: HabitButtonWidgetActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.HabitButtonWidgetActivity$onCreate$2", f = "HabitButtonWidgetActivity.kt", l = {77}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HabitButtonWidgetActivity$onCreate$2 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ HabitButtonWidgetActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HabitButtonWidgetActivity$onCreate$2(HabitButtonWidgetActivity habitButtonWidgetActivity, Continuation<? super HabitButtonWidgetActivity$onCreate$2> continuation) {
        super(2, continuation);
        this.this$0 = habitButtonWidgetActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new HabitButtonWidgetActivity$onCreate$2(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((HabitButtonWidgetActivity$onCreate$2) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        SkillTasksRecyclerViewAdapter skillTasksRecyclerViewAdapter;
        SkillTasksRecyclerViewAdapter skillTasksRecyclerViewAdapter2;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                skillTasksRecyclerViewAdapter2 = (SkillTasksRecyclerViewAdapter) this.L$0;
                dc.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            dc.n.b(obj);
            skillTasksRecyclerViewAdapter = this.this$0.adapter;
            if (skillTasksRecyclerViewAdapter != null) {
                dd.g tasks$default = TaskRepository.DefaultImpls.getTasks$default(this.this$0.getTaskRepository(), TaskType.HABIT, null, new String[0], 2, null);
                this.L$0 = skillTasksRecyclerViewAdapter;
                this.label = 1;
                Object x10 = dd.i.x(tasks$default, this);
                if (x10 == d10) {
                    return d10;
                }
                skillTasksRecyclerViewAdapter2 = skillTasksRecyclerViewAdapter;
                obj = x10;
            }
            return dc.w.f13270a;
        }
        List list = (List) obj;
        if (list == null) {
            list = ec.t.i();
        }
        skillTasksRecyclerViewAdapter2.setData(list);
        return dc.w.f13270a;
    }
}
