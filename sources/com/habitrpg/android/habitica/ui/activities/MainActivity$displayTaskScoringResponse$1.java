package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.interactors.NotifyUserUseCase;
import com.habitrpg.shared.habitica.models.responses.TaskScoringResult;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.MainActivity$displayTaskScoringResponse$1", f = "MainActivity.kt", l = {655}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class MainActivity$displayTaskScoringResponse$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    final /* synthetic */ Double $damageValue;
    final /* synthetic */ TaskScoringResult $data;
    int label;
    final /* synthetic */ MainActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$displayTaskScoringResponse$1(MainActivity mainActivity, TaskScoringResult taskScoringResult, Double d10, Continuation<? super MainActivity$displayTaskScoringResponse$1> continuation) {
        super(2, continuation);
        this.this$0 = mainActivity;
        this.$data = taskScoringResult;
        this.$damageValue = d10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new MainActivity$displayTaskScoringResponse$1(this.this$0, this.$data, this.$damageValue, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((MainActivity$displayTaskScoringResponse$1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
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
            NotifyUserUseCase notifyUserUseCase$Habitica_2311256681_prodRelease = this.this$0.getNotifyUserUseCase$Habitica_2311256681_prodRelease();
            MainActivity mainActivity = this.this$0;
            NotifyUserUseCase.RequestValues requestValues = new NotifyUserUseCase.RequestValues(mainActivity, mainActivity.getSnackbarContainer(), this.this$0.getViewModel().getUser().f(), kotlin.coroutines.jvm.internal.b.b(this.$data.getExperienceDelta()), kotlin.coroutines.jvm.internal.b.b(this.$data.getHealthDelta()), kotlin.coroutines.jvm.internal.b.b(this.$data.getGoldDelta()), kotlin.coroutines.jvm.internal.b.b(this.$data.getManaDelta()), this.$damageValue, kotlin.coroutines.jvm.internal.b.a(this.$data.getHasLeveledUp()), kotlin.coroutines.jvm.internal.b.d(this.$data.getLevel()));
            this.label = 1;
            if (notifyUserUseCase$Habitica_2311256681_prodRelease.callInteractor(requestValues, this) == d10) {
                return d10;
            }
        }
        return dc.w.f13270a;
    }
}
