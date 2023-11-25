package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.SocialRepository;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FullProfileActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.FullProfileActivity$updateView$5", f = "FullProfileActivity.kt", l = {458}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class FullProfileActivity$updateView$5 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    int label;
    final /* synthetic */ FullProfileActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullProfileActivity$updateView$5(FullProfileActivity fullProfileActivity, Continuation<? super FullProfileActivity$updateView$5> continuation) {
        super(2, continuation);
        this.this$0 = fullProfileActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new FullProfileActivity$updateView$5(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((FullProfileActivity$updateView$5) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        String str;
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
            SocialRepository socialRepository = this.this$0.getSocialRepository();
            str = this.this$0.userID;
            this.label = 1;
            obj = socialRepository.getMemberAchievements(str, this);
            if (obj == d10) {
                return d10;
            }
        }
        this.this$0.fillAchievements((List) obj);
        return dc.w.f13270a;
    }
}
