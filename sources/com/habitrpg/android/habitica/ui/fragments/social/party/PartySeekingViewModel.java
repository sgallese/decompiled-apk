package com.habitrpg.android.habitica.ui.fragments.social.party;

import androidx.lifecycle.w0;
import androidx.paging.q1;
import androidx.paging.r1;
import androidx.paging.s1;
import androidx.paging.u1;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.ui.viewmodels.BaseViewModel;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.android.habitica.ui.views.LoadingButtonState;
import j0.j1;
import j0.y2;

/* compiled from: PartySeekingFragment.kt */
/* loaded from: classes4.dex */
public final class PartySeekingViewModel extends BaseViewModel {
    public static final int $stable = 8;
    private final t0.t<String, dc.l<Boolean, LoadingButtonState>> inviteStates;
    private final j1<Boolean> isRefreshing;
    private final dd.g<s1<Member>> seekingUsers;
    private final SocialRepository socialRepository;

    /* compiled from: PartySeekingFragment.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingViewModel$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    static final class AnonymousClass1 extends qc.r implements pc.a<u1<Integer, Member>> {
        AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // pc.a
        public final u1<Integer, Member> invoke() {
            return new PartySeekingPagingSource(PartySeekingViewModel.this.getSocialRepository());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartySeekingViewModel(UserRepository userRepository, MainUserViewModel mainUserViewModel, SocialRepository socialRepository) {
        super(userRepository, mainUserViewModel);
        qc.q.i(userRepository, "userRepository");
        qc.q.i(mainUserViewModel, "userViewModel");
        qc.q.i(socialRepository, "socialRepository");
        this.socialRepository = socialRepository;
        this.isRefreshing = y2.i(Boolean.FALSE, null, 2, null);
        this.inviteStates = y2.g();
        this.seekingUsers = androidx.paging.f.a(new q1(new r1(30, 10, false, 0, 0, 0, 60, null), null, new AnonymousClass1(), 2, null).a(), w0.a(this));
    }

    public final t0.t<String, dc.l<Boolean, LoadingButtonState>> getInviteStates() {
        return this.inviteStates;
    }

    public final dd.g<s1<Member>> getSeekingUsers() {
        return this.seekingUsers;
    }

    public final SocialRepository getSocialRepository() {
        return this.socialRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object inviteUser(com.habitrpg.android.habitica.models.members.Member r5, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.invitations.InviteResponse> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingViewModel$inviteUser$1
            if (r0 == 0) goto L13
            r0 = r6
            com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingViewModel$inviteUser$1 r0 = (com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingViewModel$inviteUser$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingViewModel$inviteUser$1 r0 = new com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingViewModel$inviteUser$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dc.n.b(r6)
            goto L53
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            dc.n.b(r6)
            com.habitrpg.android.habitica.data.SocialRepository r6 = r4.socialRepository
            java.lang.String r5 = r5.getId()
            java.util.List r5 = ec.r.d(r5)
            java.lang.String r2 = "uuids"
            dc.l r5 = dc.r.a(r2, r5)
            java.util.Map r5 = ec.k0.e(r5)
            r0.label = r3
            java.lang.String r2 = "party"
            java.lang.Object r6 = r6.inviteToGroup(r2, r5, r0)
            if (r6 != r1) goto L53
            return r1
        L53:
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L5e
            java.lang.Object r5 = ec.r.c0(r6)
            com.habitrpg.android.habitica.models.invitations.InviteResponse r5 = (com.habitrpg.android.habitica.models.invitations.InviteResponse) r5
            goto L5f
        L5e:
            r5 = 0
        L5f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingViewModel.inviteUser(com.habitrpg.android.habitica.models.members.Member, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final j1<Boolean> isRefreshing() {
        return this.isRefreshing;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object rescindInvite(com.habitrpg.android.habitica.models.members.Member r5, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.members.Member> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingViewModel$rescindInvite$1
            if (r0 == 0) goto L13
            r0 = r6
            com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingViewModel$rescindInvite$1 r0 = (com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingViewModel$rescindInvite$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingViewModel$rescindInvite$1 r0 = new com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingViewModel$rescindInvite$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dc.n.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            dc.n.b(r6)
            com.habitrpg.android.habitica.data.SocialRepository r6 = r4.socialRepository
            java.lang.String r5 = r5.getId()
            r0.label = r3
            java.lang.String r2 = "party"
            java.lang.Object r6 = r6.removeMemberFromGroup(r2, r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L50
            java.lang.Object r5 = ec.r.c0(r6)
            com.habitrpg.android.habitica.models.members.Member r5 = (com.habitrpg.android.habitica.models.members.Member) r5
            goto L51
        L50:
            r5 = 0
        L51:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingViewModel.rescindInvite(com.habitrpg.android.habitica.models.members.Member, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
