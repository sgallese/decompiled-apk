package com.habitrpg.android.habitica.ui.fragments.tasks;

import ad.k0;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.models.TutorialStep;
import com.habitrpg.android.habitica.models.social.Challenge;
import dc.n;
import dc.w;
import dd.h;
import ec.t;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TasksFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.tasks.TasksFragment$updateBottomBarBadges$1", f = "TasksFragment.kt", l = {269}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class TasksFragment$updateBottomBarBadges$1 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ TasksFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TasksFragment$updateBottomBarBadges$1(TasksFragment tasksFragment, Continuation<? super TasksFragment$updateBottomBarBadges$1> continuation) {
        super(2, continuation);
        this.this$0 = tasksFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new TasksFragment$updateBottomBarBadges$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((TasksFragment$updateBottomBarBadges$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        List<String> l10;
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
            TutorialRepository tutorialRepository = this.this$0.getTutorialRepository();
            l10 = t.l(Challenge.TASK_ORDER_HABITS, "dailies", Challenge.TASK_ORDER_TODOS, Challenge.TASK_ORDER_REWARDS);
            dd.g<List<TutorialStep>> tutorialSteps = tutorialRepository.getTutorialSteps(l10);
            final TasksFragment tasksFragment = this.this$0;
            h<? super List<TutorialStep>> hVar = new h() { // from class: com.habitrpg.android.habitica.ui.fragments.tasks.TasksFragment$updateBottomBarBadges$1.1
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List) obj2, (Continuation<? super w>) continuation);
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x0081 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:63:0x0077 A[SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.util.List<? extends com.habitrpg.android.habitica.models.TutorialStep> r8, kotlin.coroutines.Continuation<? super dc.w> r9) {
                    /*
                        r7 = this;
                        java.util.ArrayList r9 = new java.util.ArrayList
                        r9.<init>()
                        java.util.Iterator r8 = r8.iterator()
                    L9:
                        boolean r0 = r8.hasNext()
                        r1 = 0
                        r2 = 1
                        r3 = 0
                        if (r0 == 0) goto L88
                        java.lang.Object r0 = r8.next()
                        com.habitrpg.android.habitica.models.TutorialStep r0 = (com.habitrpg.android.habitica.models.TutorialStep) r0
                        java.lang.String r4 = r0.getIdentifier()
                        if (r4 == 0) goto L62
                        int r5 = r4.hashCode()
                        switch(r5) {
                            case -1224929921: goto L53;
                            case 110534893: goto L44;
                            case 1100650276: goto L35;
                            case 1433373815: goto L26;
                            default: goto L25;
                        }
                    L25:
                        goto L62
                    L26:
                        java.lang.String r5 = "dailies"
                        boolean r4 = r4.equals(r5)
                        if (r4 != 0) goto L2f
                        goto L62
                    L2f:
                        com.habitrpg.shared.habitica.models.tasks.TaskType r4 = com.habitrpg.shared.habitica.models.tasks.TaskType.DAILY
                        r5 = 2131296644(0x7f090184, float:1.821121E38)
                        goto L65
                    L35:
                        java.lang.String r5 = "rewards"
                        boolean r4 = r4.equals(r5)
                        if (r4 != 0) goto L3e
                        goto L62
                    L3e:
                        com.habitrpg.shared.habitica.models.tasks.TaskType r4 = com.habitrpg.shared.habitica.models.tasks.TaskType.REWARD
                        r5 = 2131297377(0x7f090461, float:1.8212697E38)
                        goto L65
                    L44:
                        java.lang.String r5 = "todos"
                        boolean r4 = r4.equals(r5)
                        if (r4 != 0) goto L4d
                        goto L62
                    L4d:
                        com.habitrpg.shared.habitica.models.tasks.TaskType r4 = com.habitrpg.shared.habitica.models.tasks.TaskType.TODO
                        r5 = 2131297670(0x7f090586, float:1.8213291E38)
                        goto L65
                    L53:
                        java.lang.String r5 = "habits"
                        boolean r4 = r4.equals(r5)
                        if (r4 != 0) goto L5c
                        goto L62
                    L5c:
                        com.habitrpg.shared.habitica.models.tasks.TaskType r4 = com.habitrpg.shared.habitica.models.tasks.TaskType.HABIT
                        r5 = 2131296859(0x7f09025b, float:1.8211647E38)
                        goto L65
                    L62:
                        com.habitrpg.shared.habitica.models.tasks.TaskType r4 = com.habitrpg.shared.habitica.models.tasks.TaskType.HABIT
                        r5 = -1
                    L65:
                        com.habitrpg.android.habitica.ui.fragments.tasks.TasksFragment r6 = com.habitrpg.android.habitica.ui.fragments.tasks.TasksFragment.this
                        com.habitrpg.android.habitica.ui.views.navigation.HabiticaBottomNavigationView r6 = r6.getBottomNavigation()
                        if (r6 == 0) goto L71
                        com.habitrpg.android.habitica.ui.views.navigation.BottomNavigationItem r3 = r6.tabWithId(r5)
                    L71:
                        boolean r0 = r0.getShouldDisplay()
                        if (r0 == 0) goto L81
                        if (r3 != 0) goto L7a
                        goto L7d
                    L7a:
                        r3.setBadgeCount(r2)
                    L7d:
                        r9.add(r4)
                        goto L9
                    L81:
                        if (r3 != 0) goto L84
                        goto L9
                    L84:
                        r3.setBadgeCount(r1)
                        goto L9
                    L88:
                        int r8 = r9.size()
                        if (r8 != r2) goto Lea
                        com.habitrpg.android.habitica.ui.fragments.tasks.TasksFragment r8 = com.habitrpg.android.habitica.ui.fragments.tasks.TasksFragment.this
                        java.util.Map r8 = r8.getViewFragmentsDictionary$Habitica_2311256681_prodRelease()
                        if (r8 == 0) goto Lad
                        com.habitrpg.android.habitica.ui.fragments.tasks.TasksFragment r0 = com.habitrpg.android.habitica.ui.fragments.tasks.TasksFragment.this
                        java.lang.Object r9 = r9.get(r1)
                        com.habitrpg.shared.habitica.models.tasks.TaskType r9 = (com.habitrpg.shared.habitica.models.tasks.TaskType) r9
                        int r9 = com.habitrpg.android.habitica.ui.fragments.tasks.TasksFragment.access$indexForTaskType(r0, r9)
                        java.lang.Integer r9 = kotlin.coroutines.jvm.internal.b.d(r9)
                        java.lang.Object r8 = r8.get(r9)
                        com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment r8 = (com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment) r8
                        goto Lae
                    Lad:
                        r8 = r3
                    Lae:
                        if (r8 == 0) goto Lb5
                        java.util.List r9 = r8.getTutorialTexts()
                        goto Lb6
                    Lb5:
                        r9 = r3
                    Lb6:
                        if (r9 == 0) goto Lea
                        com.habitrpg.android.habitica.ui.fragments.tasks.TasksFragment r9 = com.habitrpg.android.habitica.ui.fragments.tasks.TasksFragment.this
                        android.content.Context r9 = r9.getContext()
                        if (r9 == 0) goto Lea
                        com.habitrpg.android.habitica.ui.fragments.tasks.TasksFragment r9 = com.habitrpg.android.habitica.ui.fragments.tasks.TasksFragment.this
                        android.content.Context r9 = r9.getContext()
                        if (r9 == 0) goto Lcf
                        r0 = 2131953352(0x7f1306c8, float:1.9543173E38)
                        java.lang.String r3 = r9.getString(r0)
                    Lcf:
                        java.util.List r9 = r8.getTutorialTexts()
                        java.lang.Iterable r9 = (java.lang.Iterable) r9
                        boolean r9 = ec.r.T(r9, r3)
                        if (r9 != 0) goto Lea
                        if (r3 == 0) goto Lea
                        java.util.List r9 = r8.getTutorialTexts()
                        java.util.Collection r9 = (java.util.Collection) r9
                        java.util.List r9 = ec.r.s0(r9, r3)
                        r8.setTutorialTexts(r9)
                    Lea:
                        dc.w r8 = dc.w.f13270a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.tasks.TasksFragment$updateBottomBarBadges$1.AnonymousClass1.emit(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
                }
            };
            this.label = 1;
            if (tutorialSteps.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
