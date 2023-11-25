package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.interactors.ShareAvatarUseCase;
import com.habitrpg.android.habitica.models.members.Member;
import kotlin.coroutines.Continuation;

/* compiled from: FullProfileActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.FullProfileActivity$onOptionsItemSelected$1$1", f = "FullProfileActivity.kt", l = {294}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FullProfileActivity$onOptionsItemSelected$1$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    final /* synthetic */ Member $it;
    final /* synthetic */ ShareAvatarUseCase $usecase;
    int label;
    final /* synthetic */ FullProfileActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullProfileActivity$onOptionsItemSelected$1$1(ShareAvatarUseCase shareAvatarUseCase, FullProfileActivity fullProfileActivity, Member member, Continuation<? super FullProfileActivity$onOptionsItemSelected$1$1> continuation) {
        super(2, continuation);
        this.$usecase = shareAvatarUseCase;
        this.this$0 = fullProfileActivity;
        this.$it = member;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new FullProfileActivity$onOptionsItemSelected$1$1(this.$usecase, this.this$0, this.$it, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((FullProfileActivity$onOptionsItemSelected$1$1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
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
            ShareAvatarUseCase shareAvatarUseCase = this.$usecase;
            ShareAvatarUseCase.RequestValues requestValues = new ShareAvatarUseCase.RequestValues(this.this$0, this.$it, "Check out my avatar on Habitica!", "avatar_profile");
            this.label = 1;
            if (shareAvatarUseCase.callInteractor(requestValues, this) == d10) {
                return d10;
            }
        }
        return dc.w.f13270a;
    }
}
