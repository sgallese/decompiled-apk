package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.databinding.ActivityGiftSubscriptionBinding;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.user.ContributorInfo;
import com.habitrpg.android.habitica.models.user.Profile;
import com.habitrpg.android.habitica.ui.views.UsernameLabel;
import com.habitrpg.common.habitica.views.AvatarView;
import kotlin.coroutines.Continuation;

/* compiled from: GiftSubscriptionActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.GiftSubscriptionActivity$onCreate$2", f = "GiftSubscriptionActivity.kt", l = {74}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GiftSubscriptionActivity$onCreate$2 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    int label;
    final /* synthetic */ GiftSubscriptionActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftSubscriptionActivity$onCreate$2(GiftSubscriptionActivity giftSubscriptionActivity, Continuation<? super GiftSubscriptionActivity$onCreate$2> continuation) {
        super(2, continuation);
        this.this$0 = giftSubscriptionActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new GiftSubscriptionActivity$onCreate$2(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((GiftSubscriptionActivity$onCreate$2) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        String str;
        ActivityGiftSubscriptionBinding activityGiftSubscriptionBinding;
        ActivityGiftSubscriptionBinding activityGiftSubscriptionBinding2;
        String str2;
        ActivityGiftSubscriptionBinding activityGiftSubscriptionBinding3;
        int i10;
        ActivityGiftSubscriptionBinding activityGiftSubscriptionBinding4;
        d10 = ic.d.d();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                dc.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            dc.n.b(obj);
            SocialRepository socialRepository = this.this$0.getSocialRepository();
            str = this.this$0.giftedUsername;
            if (str == null) {
                str = this.this$0.giftedUserID;
            }
            this.label = 1;
            obj = SocialRepository.DefaultImpls.retrieveMember$default(socialRepository, str, false, this, 2, null);
            if (obj == d10) {
                return d10;
            }
        }
        Member member = (Member) obj;
        if (member != null) {
            activityGiftSubscriptionBinding = this.this$0.binding;
            ActivityGiftSubscriptionBinding activityGiftSubscriptionBinding5 = null;
            if (activityGiftSubscriptionBinding == null) {
                qc.q.z("binding");
                activityGiftSubscriptionBinding = null;
            }
            AvatarView avatarView = activityGiftSubscriptionBinding.avatarView;
            qc.q.h(avatarView, "avatarView");
            AvatarView.setAvatar$default(avatarView, member, null, 2, null);
            activityGiftSubscriptionBinding2 = this.this$0.binding;
            if (activityGiftSubscriptionBinding2 == null) {
                qc.q.z("binding");
                activityGiftSubscriptionBinding2 = null;
            }
            UsernameLabel usernameLabel = activityGiftSubscriptionBinding2.displayNameTextView;
            Profile profile = member.getProfile();
            if (profile != null) {
                str2 = profile.getName();
            } else {
                str2 = null;
            }
            usernameLabel.setUsername(str2);
            activityGiftSubscriptionBinding3 = this.this$0.binding;
            if (activityGiftSubscriptionBinding3 == null) {
                qc.q.z("binding");
                activityGiftSubscriptionBinding3 = null;
            }
            UsernameLabel usernameLabel2 = activityGiftSubscriptionBinding3.displayNameTextView;
            ContributorInfo contributor = member.getContributor();
            if (contributor != null) {
                i10 = contributor.getLevel();
            } else {
                i10 = 0;
            }
            usernameLabel2.setTier(i10);
            activityGiftSubscriptionBinding4 = this.this$0.binding;
            if (activityGiftSubscriptionBinding4 == null) {
                qc.q.z("binding");
            } else {
                activityGiftSubscriptionBinding5 = activityGiftSubscriptionBinding4;
            }
            activityGiftSubscriptionBinding5.usernameTextView.setText("@" + member.getUsername());
            this.this$0.giftedUserID = member.getId();
            this.this$0.giftedUsername = member.getUsername();
            return dc.w.f13270a;
        }
        return dc.w.f13270a;
    }
}
