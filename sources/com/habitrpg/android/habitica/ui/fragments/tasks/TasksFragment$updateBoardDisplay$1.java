package com.habitrpg.android.habitica.ui.fragments.tasks;

import ad.k0;
import com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel;
import com.habitrpg.android.habitica.ui.views.navigation.HabiticaBottomNavigationView;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* compiled from: TasksFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.tasks.TasksFragment$updateBoardDisplay$1", f = "TasksFragment.kt", l = {432}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TasksFragment$updateBoardDisplay$1 extends l implements p<k0, Continuation<? super w>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ TasksFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TasksFragment$updateBoardDisplay$1(TasksFragment tasksFragment, Continuation<? super TasksFragment$updateBoardDisplay$1> continuation) {
        super(2, continuation);
        this.this$0 = tasksFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new TasksFragment$updateBoardDisplay$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((TasksFragment$updateBoardDisplay$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        HabiticaBottomNavigationView habiticaBottomNavigationView;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                habiticaBottomNavigationView = (HabiticaBottomNavigationView) this.L$0;
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            HabiticaBottomNavigationView bottomNavigation = this.this$0.getBottomNavigation();
            if (bottomNavigation != null) {
                TasksViewModel viewModel$Habitica_2311256681_prodRelease = this.this$0.getViewModel$Habitica_2311256681_prodRelease();
                this.L$0 = bottomNavigation;
                this.label = 1;
                Object canAddTasks = viewModel$Habitica_2311256681_prodRelease.canAddTasks(this);
                if (canAddTasks == d10) {
                    return d10;
                }
                habiticaBottomNavigationView = bottomNavigation;
                obj = canAddTasks;
            }
            return w.f13270a;
        }
        habiticaBottomNavigationView.setCanAddTasks(((Boolean) obj).booleanValue());
        return w.f13270a;
    }
}
