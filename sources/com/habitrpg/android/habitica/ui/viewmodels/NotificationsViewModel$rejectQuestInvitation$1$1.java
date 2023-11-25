package com.habitrpg.android.habitica.ui.viewmodels;

import ad.k0;
import com.habitrpg.android.habitica.data.SocialRepository;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NotificationsViewModel.kt */
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$rejectQuestInvitation$1$1", f = "NotificationsViewModel.kt", l = {423}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NotificationsViewModel$rejectQuestInvitation$1$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ String $it;
    int label;
    final /* synthetic */ NotificationsViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsViewModel$rejectQuestInvitation$1$1(NotificationsViewModel notificationsViewModel, String str, Continuation<? super NotificationsViewModel$rejectQuestInvitation$1$1> continuation) {
        super(2, continuation);
        this.this$0 = notificationsViewModel;
        this.$it = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new NotificationsViewModel$rejectQuestInvitation$1$1(this.this$0, this.$it, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((NotificationsViewModel$rejectQuestInvitation$1$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            SocialRepository socialRepository = this.this$0.getSocialRepository();
            String str = this.$it;
            this.label = 1;
            if (socialRepository.rejectQuest(null, str, this) == d10) {
                return d10;
            }
        }
        this.this$0.refreshUser();
        return w.f13270a;
    }
}
