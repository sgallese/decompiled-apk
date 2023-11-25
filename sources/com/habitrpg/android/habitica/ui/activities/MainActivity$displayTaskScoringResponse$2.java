package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.interactors.DisplayItemDropUseCase;
import com.habitrpg.shared.habitica.models.responses.TaskScoringResult;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.MainActivity$displayTaskScoringResponse$2", f = "MainActivity.kt", l = {674}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class MainActivity$displayTaskScoringResponse$2 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    final /* synthetic */ TaskScoringResult $data;
    final /* synthetic */ boolean $showItemsFound;
    int label;
    final /* synthetic */ MainActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$displayTaskScoringResponse$2(MainActivity mainActivity, TaskScoringResult taskScoringResult, boolean z10, Continuation<? super MainActivity$displayTaskScoringResponse$2> continuation) {
        super(2, continuation);
        this.this$0 = mainActivity;
        this.$data = taskScoringResult;
        this.$showItemsFound = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new MainActivity$displayTaskScoringResponse$2(this.this$0, this.$data, this.$showItemsFound, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((MainActivity$displayTaskScoringResponse$2) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
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
            DisplayItemDropUseCase displayItemDropUseCase$Habitica_2311256681_prodRelease = this.this$0.getDisplayItemDropUseCase$Habitica_2311256681_prodRelease();
            TaskScoringResult taskScoringResult = this.$data;
            MainActivity mainActivity = this.this$0;
            DisplayItemDropUseCase.RequestValues requestValues = new DisplayItemDropUseCase.RequestValues(taskScoringResult, mainActivity, mainActivity.getSnackbarContainer(), this.$showItemsFound);
            this.label = 1;
            if (displayItemDropUseCase$Habitica_2311256681_prodRelease.callInteractor(requestValues, this) == d10) {
                return d10;
            }
        }
        return dc.w.f13270a;
    }
}
