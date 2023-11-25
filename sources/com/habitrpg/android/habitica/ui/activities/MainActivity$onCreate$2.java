package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.models.user.UserQuestStatus;
import kotlin.coroutines.Continuation;

/* compiled from: MainActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.MainActivity$onCreate$2", f = "MainActivity.kt", l = {237}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MainActivity$onCreate$2 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    int label;
    final /* synthetic */ MainActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$onCreate$2(MainActivity mainActivity, Continuation<? super MainActivity$onCreate$2> continuation) {
        super(2, continuation);
        this.this$0 = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new MainActivity$onCreate$2(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((MainActivity$onCreate$2) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
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
            dd.g<UserQuestStatus> userQuestStatus = this.this$0.getUserRepository().getUserQuestStatus();
            final MainActivity mainActivity = this.this$0;
            dd.h<? super UserQuestStatus> hVar = new dd.h() { // from class: com.habitrpg.android.habitica.ui.activities.MainActivity$onCreate$2.1
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((UserQuestStatus) obj2, (Continuation<? super dc.w>) continuation);
                }

                public final Object emit(UserQuestStatus userQuestStatus2, Continuation<? super dc.w> continuation) {
                    MainActivity.this.userQuestStatus = userQuestStatus2;
                    return dc.w.f13270a;
                }
            };
            this.label = 1;
            if (userQuestStatus.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return dc.w.f13270a;
    }
}
