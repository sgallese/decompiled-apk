package com.habitrpg.android.habitica.ui.viewmodels;

import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.f0;
import androidx.lifecycle.m;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.data.ChallengeRepository;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.NotificationsManager;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.social.Challenge;
import com.habitrpg.android.habitica.models.social.ChatMessage;
import com.habitrpg.android.habitica.models.social.Group;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.android.habitica.ui.views.LoadingButtonState;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import dc.f;
import dc.w;
import dd.g;
import dd.h;
import dd.i;
import dd.n0;
import dd.x;
import j0.y2;
import java.util.HashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import qc.q;
import t0.r;
import t0.t;

/* compiled from: GroupViewModel.kt */
/* loaded from: classes4.dex */
public class GroupViewModel extends BaseViewModel {
    public static final int $stable = 8;
    private final f _chatMessages$delegate;
    private final ChallengeRepository challengeRepository;
    private final f chatmessages$delegate;
    private boolean gotNewMessages;
    private final LiveData<Group> group;
    private final g<Group> groupFlow;
    private final g<String> groupIDFlow;
    private final x<String> groupIDState;
    private GroupViewType groupViewType;
    private final LiveData<Boolean> isMemberData;
    private final g<Boolean> isMemberFlow;
    private final LiveData<Member> leader;
    private final g<Member> leaderFlow;
    private final NotificationsManager notificationsManager;
    private final t<String, LoadingButtonState> pendingInviteStates;
    private final r<Member> pendingInvites;
    private final SocialRepository socialRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupViewModel(UserRepository userRepository, MainUserViewModel mainUserViewModel, ChallengeRepository challengeRepository, SocialRepository socialRepository, NotificationsManager notificationsManager) {
        super(userRepository, mainUserViewModel);
        q.i(userRepository, "userRepository");
        q.i(mainUserViewModel, "userViewModel");
        q.i(challengeRepository, "challengeRepository");
        q.i(socialRepository, "socialRepository");
        q.i(notificationsManager, "notificationsManager");
        this.challengeRepository = challengeRepository;
        this.socialRepository = socialRepository;
        this.notificationsManager = notificationsManager;
        x<String> a10 = n0.a(null);
        this.groupIDState = a10;
        this.groupIDFlow = a10;
        final g<Group> R = i.R(i.u(a10), new GroupViewModel$special$$inlined$flatMapLatest$1(null, this));
        this.groupFlow = R;
        this.group = m.c(R, null, 0L, 3, null);
        g<Member> R2 = i.R(i.u(new g<String>() { // from class: com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$special$$inlined$map$1$2", f = "GroupViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(h hVar) {
                    this.$this_unsafeFlow = hVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$special$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$special$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L49
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        com.habitrpg.android.habitica.models.social.Group r5 = (com.habitrpg.android.habitica.models.social.Group) r5
                        if (r5 == 0) goto L3f
                        java.lang.String r5 = r5.getLeaderID()
                        goto L40
                    L3f:
                        r5 = 0
                    L40:
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L49
                        return r1
                    L49:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super String> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        }), new GroupViewModel$special$$inlined$flatMapLatest$2(null, this));
        this.leaderFlow = R2;
        this.leader = m.c(R2, null, 0L, 3, null);
        final g R3 = i.R(i.u(a10), new GroupViewModel$special$$inlined$flatMapLatest$3(null, this));
        g<Boolean> gVar = new g<Boolean>() { // from class: com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$special$$inlined$map$2

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$special$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$special$$inlined$map$2$2", f = "GroupViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$special$$inlined$map$2$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(h hVar) {
                    this.$this_unsafeFlow = hVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$special$$inlined$map$2$2$1 r0 = (com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$special$$inlined$map$2$2$1 r0 = new com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$special$$inlined$map$2$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L4a
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        com.habitrpg.android.habitica.models.social.GroupMembership r5 = (com.habitrpg.android.habitica.models.social.GroupMembership) r5
                        if (r5 == 0) goto L3c
                        r5 = 1
                        goto L3d
                    L3c:
                        r5 = 0
                    L3d:
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4a
                        return r1
                    L4a:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super Boolean> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
        this.isMemberFlow = gVar;
        this.isMemberData = m.c(gVar, null, 0L, 3, null);
        this._chatMessages$delegate = dc.g.b(GroupViewModel$_chatMessages$2.INSTANCE);
        this.chatmessages$delegate = dc.g.b(new GroupViewModel$chatmessages$2(this));
        this.pendingInvites = y2.e();
        this.pendingInviteStates = y2.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f0<List<ChatMessage>> get_chatMessages() {
        return (f0) this._chatMessages$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void joinGroup$default(GroupViewModel groupViewModel, String str, pc.a aVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            if ((i10 & 2) != 0) {
                aVar = null;
            }
            groupViewModel.joinGroup(str, aVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinGroup");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void leaveGroup$default(GroupViewModel groupViewModel, List list, boolean z10, pc.a aVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            if ((i10 & 4) != 0) {
                aVar = null;
            }
            groupViewModel.leaveGroup(list, z10, aVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: leaveGroup");
    }

    public static /* synthetic */ void rejectGroupInvite$default(GroupViewModel groupViewModel, String str, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            groupViewModel.rejectGroupInvite(str);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rejectGroupInvite");
    }

    public final void deleteMessage(ChatMessage chatMessage) {
        List<ChatMessage> list;
        q.i(chatMessage, "chatMessage");
        List<ChatMessage> f10 = get_chatMessages().f();
        if (f10 != null) {
            int indexOf = f10.indexOf(chatMessage);
            List<ChatMessage> f11 = get_chatMessages().f();
            if (f11 != null) {
                list = ec.r.F0(f11);
            } else {
                list = null;
            }
            if (list != null) {
                list.remove(chatMessage);
            }
            get_chatMessages().n(list);
            ad.g.d(w0.a(this), ExceptionHandler.Companion.coroutine(new GroupViewModel$deleteMessage$1(list, indexOf, chatMessage, this)), null, new GroupViewModel$deleteMessage$2(this, chatMessage, null), 2, null);
        }
    }

    public final ChallengeRepository getChallengeRepository() {
        return this.challengeRepository;
    }

    public final LiveData<List<ChatMessage>> getChatmessages() {
        return (LiveData) this.chatmessages$delegate.getValue();
    }

    public final boolean getGotNewMessages() {
        return this.gotNewMessages;
    }

    public final LiveData<Group> getGroupData() {
        return this.group;
    }

    public final String getGroupID() {
        return this.groupIDState.getValue();
    }

    public final g<String> getGroupIDFlow() {
        return this.groupIDFlow;
    }

    protected final x<String> getGroupIDState() {
        return this.groupIDState;
    }

    public final GroupViewType getGroupViewType() {
        return this.groupViewType;
    }

    public final LiveData<Boolean> getIsMemberData() {
        return this.isMemberData;
    }

    public final LiveData<Member> getLeaderData() {
        return this.leader;
    }

    public final String getLeaderID() {
        Group f10 = this.group.f();
        if (f10 != null) {
            return f10.getLeaderID();
        }
        return null;
    }

    public final NotificationsManager getNotificationsManager() {
        return this.notificationsManager;
    }

    public final t<String, LoadingButtonState> getPendingInviteStates() {
        return this.pendingInviteStates;
    }

    public final r<Member> getPendingInvites() {
        return this.pendingInvites;
    }

    public final SocialRepository getSocialRepository() {
        return this.socialRepository;
    }

    public final void inviteToGroup(HashMap<String, Object> hashMap) {
        q.i(hashMap, "inviteData");
        ExceptionHandlerKt.launchCatching$default(w0.a(this), null, new GroupViewModel$inviteToGroup$1(this, hashMap, null), 1, null);
    }

    public final boolean isLeader() {
        String str;
        User f10 = getUser().f();
        if (f10 != null) {
            str = f10.getId();
        } else {
            str = null;
        }
        return q.d(str, getLeaderID());
    }

    public final boolean isMember() {
        Boolean f10 = this.isMemberData.f();
        if (f10 == null) {
            return false;
        }
        return f10.booleanValue();
    }

    public final boolean isPublicGuild() {
        String str;
        Group f10 = this.group.f();
        if (f10 != null) {
            str = f10.getPrivacy();
        } else {
            str = null;
        }
        return q.d(str, "public");
    }

    public final void joinGroup(String str, pc.a<w> aVar) {
        ExceptionHandlerKt.launchCatching$default(w0.a(this), null, new GroupViewModel$joinGroup$1(this, str, aVar, null), 1, null);
    }

    public final void leaveGroup(List<? extends Challenge> list, boolean z10, pc.a<w> aVar) {
        q.i(list, "groupChallenges");
        if (!z10) {
            ExceptionHandlerKt.launchCatching$default(w0.a(this), null, new GroupViewModel$leaveGroup$1(list, this, null), 1, null);
        }
        ad.g.d(w0.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new GroupViewModel$leaveGroup$2(this, z10, aVar, null), 2, null);
    }

    public final void likeMessage(ChatMessage chatMessage) {
        q.i(chatMessage, "message");
        ExceptionHandlerKt.launchCatching$default(w0.a(this), null, new GroupViewModel$likeMessage$1(this, chatMessage, null), 1, null);
    }

    public final void markMessagesSeen() {
        boolean z10;
        String groupID = getGroupID();
        if (groupID != null) {
            if (groupID.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && this.gotNewMessages) {
                ExceptionHandlerKt.launchCatching$default(w0.a(this), null, new GroupViewModel$markMessagesSeen$1$1(this, groupID, null), 1, null);
            }
        }
    }

    @Override // com.habitrpg.android.habitica.ui.viewmodels.BaseViewModel, androidx.lifecycle.v0
    protected void onCleared() {
        this.socialRepository.close();
        super.onCleared();
    }

    public final void postGroupChat(String str, pc.a<w> aVar, pc.a<w> aVar2) {
        q.i(str, "chatText");
        q.i(aVar, "onComplete");
        q.i(aVar2, "onError");
        String groupID = getGroupID();
        if (groupID != null) {
            ad.g.d(w0.a(this), ExceptionHandler.Companion.coroutine(new GroupViewModel$postGroupChat$1$1(aVar2)), null, new GroupViewModel$postGroupChat$1$2(this, groupID, str, aVar, null), 2, null);
        }
    }

    public final void rejectGroupInvite(String str) {
        String groupID = getGroupID();
        if (groupID != null) {
            ExceptionHandlerKt.launchCatching$default(w0.a(this), null, new GroupViewModel$rejectGroupInvite$1$1(this, str, groupID, null), 1, null);
        }
    }

    public final void rescindInvite(Member member) {
        q.i(member, "invitedMember");
        this.pendingInviteStates.put(member.getId(), LoadingButtonState.LOADING);
        ExceptionHandlerKt.launchCatching(w0.a(this), new GroupViewModel$rescindInvite$1(this, member), new GroupViewModel$rescindInvite$2(this, member, null));
    }

    public final void retrieveGroup(pc.a<w> aVar) {
        boolean z10;
        String groupID = getGroupID();
        boolean z11 = false;
        if (groupID != null) {
            if (groupID.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = true;
            }
        }
        if (z11) {
            ad.g.d(w0.a(this), ExceptionHandler.Companion.coroutine(GroupViewModel$retrieveGroup$1.INSTANCE), null, new GroupViewModel$retrieveGroup$2(this, aVar, null), 2, null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.String] */
    public final void retrieveGroupChat(pc.a<w> aVar) {
        boolean z10;
        q.i(aVar, "onComplete");
        qc.f0 f0Var = new qc.f0();
        f0Var.f21676f = getGroupID();
        if (this.groupViewType == GroupViewType.PARTY) {
            f0Var.f21676f = NavigationDrawerFragment.SIDEBAR_PARTY;
        }
        CharSequence charSequence = (CharSequence) f0Var.f21676f;
        if (charSequence != null && charSequence.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            aVar.invoke();
        } else {
            ad.g.d(w0.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new GroupViewModel$retrieveGroupChat$1(this, f0Var, aVar, null), 2, null);
        }
    }

    public final void setGotNewMessages(boolean z10) {
        this.gotNewMessages = z10;
    }

    public final void setGroupID(String str) {
        q.i(str, "groupID");
        if (q.d(str, this.groupIDState.getValue())) {
            return;
        }
        this.groupIDState.setValue(str);
        ExceptionHandlerKt.launchCatching$default(w0.a(this), null, new GroupViewModel$setGroupID$1(this, str, null), 1, null);
    }

    public final void setGroupViewType(GroupViewType groupViewType) {
        this.groupViewType = groupViewType;
    }

    public final void updateGroup(Bundle bundle) {
        ad.g.d(w0.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new GroupViewModel$updateGroup$1(this, bundle, null), 2, null);
    }

    public final void updateOrCreateGroup(Bundle bundle) {
        ad.g.d(w0.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new GroupViewModel$updateOrCreateGroup$1(this, bundle, null), 2, null);
    }
}
