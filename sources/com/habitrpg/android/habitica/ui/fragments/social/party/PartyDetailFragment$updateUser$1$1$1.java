package com.habitrpg.android.habitica.ui.fragments.social.party;

import ad.k0;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.databinding.FragmentPartyDetailBinding;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.common.habitica.views.AvatarView;
import dc.w;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PartyDetailFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment$updateUser$1$1$1", f = "PartyDetailFragment.kt", l = {237}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class PartyDetailFragment$updateUser$1$1$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ String $groupName;
    final /* synthetic */ String $id;
    int label;
    final /* synthetic */ PartyDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartyDetailFragment$updateUser$1$1$1(PartyDetailFragment partyDetailFragment, String str, String str2, Continuation<? super PartyDetailFragment$updateUser$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = partyDetailFragment;
        this.$id = str;
        this.$groupName = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new PartyDetailFragment$updateUser$1$1$1(this.this$0, this.$id, this.$groupName, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((PartyDetailFragment$updateUser$1$1$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        SwipeRefreshLayout root;
        SwipeRefreshLayout root2;
        AvatarView avatarView;
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
            String str = this.$id;
            this.label = 1;
            obj = SocialRepository.DefaultImpls.retrieveMember$default(socialRepository, str, false, this, 2, null);
            if (obj == d10) {
                return d10;
            }
        }
        Member member = (Member) obj;
        if (member == null) {
            return w.f13270a;
        }
        FragmentPartyDetailBinding binding = this.this$0.getBinding();
        TextView textView = null;
        if (binding != null && (root2 = binding.getRoot()) != null && (avatarView = (AvatarView) root2.findViewById(R.id.groupleader_avatar_view)) != null) {
            AvatarView.setAvatar$default(avatarView, member, null, 2, null);
        }
        FragmentPartyDetailBinding binding2 = this.this$0.getBinding();
        if (binding2 != null && (root = binding2.getRoot()) != null) {
            textView = (TextView) root.findViewById(R.id.groupleader_text_view);
        }
        if (textView != null) {
            textView.setText(this.this$0.getString(R.string.invitation_title, member.getDisplayName(), this.$groupName));
        }
        return w.f13270a;
    }
}
