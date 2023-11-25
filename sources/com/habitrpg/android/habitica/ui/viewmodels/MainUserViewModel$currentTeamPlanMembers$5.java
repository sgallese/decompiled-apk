package com.habitrpg.android.habitica.ui.viewmodels;

import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.models.TeamPlan;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.social.Group;
import dc.n;
import dc.w;
import dd.i;
import ic.d;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainUserViewModel.kt */
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel$currentTeamPlanMembers$5", f = "MainUserViewModel.kt", l = {66, 67}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class MainUserViewModel$currentTeamPlanMembers$5 extends l implements p<List<? extends Member>, Continuation<? super w>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MainUserViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainUserViewModel$currentTeamPlanMembers$5(MainUserViewModel mainUserViewModel, Continuation<? super MainUserViewModel$currentTeamPlanMembers$5> continuation) {
        super(2, continuation);
        this.this$0 = mainUserViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        MainUserViewModel$currentTeamPlanMembers$5 mainUserViewModel$currentTeamPlanMembers$5 = new MainUserViewModel$currentTeamPlanMembers$5(this.this$0, continuation);
        mainUserViewModel$currentTeamPlanMembers$5.L$0 = obj;
        return mainUserViewModel$currentTeamPlanMembers$5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    n.b(obj);
                    Group group = (Group) obj;
                    return w.f13270a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
        } else {
            n.b(obj);
            if (((List) this.L$0).isEmpty()) {
                dd.w<TeamPlan> currentTeamPlan = this.this$0.getCurrentTeamPlan();
                this.label = 1;
                obj = i.D(currentTeamPlan, this);
                if (obj == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
        TeamPlan teamPlan = (TeamPlan) obj;
        if (teamPlan != null) {
            UserRepository userRepository = this.this$0.getUserRepository();
            String id2 = teamPlan.getId();
            this.label = 2;
            obj = userRepository.retrieveTeamPlan(id2, this);
            if (obj == d10) {
                return d10;
            }
            Group group2 = (Group) obj;
        }
        return w.f13270a;
    }

    @Override // pc.p
    public final Object invoke(List<? extends Member> list, Continuation<? super w> continuation) {
        return ((MainUserViewModel$currentTeamPlanMembers$5) create(list, continuation)).invokeSuspend(w.f13270a);
    }
}
