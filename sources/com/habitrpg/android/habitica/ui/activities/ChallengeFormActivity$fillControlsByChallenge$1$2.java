package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.models.tasks.Task;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChallengeFormActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity$fillControlsByChallenge$1$2", f = "ChallengeFormActivity.kt", l = {443}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ChallengeFormActivity$fillControlsByChallenge$1$2 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    final /* synthetic */ String $it;
    int label;
    final /* synthetic */ ChallengeFormActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeFormActivity$fillControlsByChallenge$1$2(ChallengeFormActivity challengeFormActivity, String str, Continuation<? super ChallengeFormActivity$fillControlsByChallenge$1$2> continuation) {
        super(2, continuation);
        this.this$0 = challengeFormActivity;
        this.$it = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new ChallengeFormActivity$fillControlsByChallenge$1$2(this.this$0, this.$it, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((ChallengeFormActivity$fillControlsByChallenge$1$2) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
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
            dd.g<List<Task>> challengeTasks = this.this$0.getChallengeRepository$Habitica_2311256681_prodRelease().getChallengeTasks(this.$it);
            final ChallengeFormActivity challengeFormActivity = this.this$0;
            dd.h<? super List<Task>> hVar = new dd.h() { // from class: com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity$fillControlsByChallenge$1$2.1
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List) obj2, (Continuation<? super dc.w>) continuation);
                }

                public final Object emit(List<? extends Task> list, Continuation<? super dc.w> continuation) {
                    ChallengeFormActivity challengeFormActivity2 = ChallengeFormActivity.this;
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        challengeFormActivity2.addOrUpdateTaskInList((Task) it.next(), true);
                    }
                    return dc.w.f13270a;
                }
            };
            this.label = 1;
            if (challengeTasks.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return dc.w.f13270a;
    }
}
