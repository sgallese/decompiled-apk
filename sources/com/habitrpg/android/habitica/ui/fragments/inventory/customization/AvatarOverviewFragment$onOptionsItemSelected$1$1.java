package com.habitrpg.android.habitica.ui.fragments.inventory.customization;

import ad.k0;
import androidx.fragment.app.q;
import com.habitrpg.android.habitica.interactors.ShareAvatarUseCase;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.activities.BaseActivity;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import pc.p;

/* compiled from: AvatarOverviewFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarOverviewFragment$onOptionsItemSelected$1$1", f = "AvatarOverviewFragment.kt", l = {149}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AvatarOverviewFragment$onOptionsItemSelected$1$1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ User $it;
    final /* synthetic */ ShareAvatarUseCase $usecase;
    int label;
    final /* synthetic */ AvatarOverviewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarOverviewFragment$onOptionsItemSelected$1$1(ShareAvatarUseCase shareAvatarUseCase, AvatarOverviewFragment avatarOverviewFragment, User user, Continuation<? super AvatarOverviewFragment$onOptionsItemSelected$1$1> continuation) {
        super(2, continuation);
        this.$usecase = shareAvatarUseCase;
        this.this$0 = avatarOverviewFragment;
        this.$it = user;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new AvatarOverviewFragment$onOptionsItemSelected$1$1(this.$usecase, this.this$0, this.$it, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((AvatarOverviewFragment$onOptionsItemSelected$1$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
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
            ShareAvatarUseCase shareAvatarUseCase = this.$usecase;
            q requireActivity = this.this$0.requireActivity();
            qc.q.g(requireActivity, "null cannot be cast to non-null type com.habitrpg.android.habitica.ui.activities.BaseActivity");
            User user = this.$it;
            qc.q.h(user, "$it");
            ShareAvatarUseCase.RequestValues requestValues = new ShareAvatarUseCase.RequestValues((BaseActivity) requireActivity, user, "Check out my avatar on Habitica!", "avatar_customization");
            this.label = 1;
            if (shareAvatarUseCase.callInteractor(requestValues, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
