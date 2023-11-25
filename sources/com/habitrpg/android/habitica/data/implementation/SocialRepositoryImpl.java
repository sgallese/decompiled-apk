package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.local.SocialLocalRepository;
import com.habitrpg.android.habitica.models.Achievement;
import com.habitrpg.android.habitica.models.invitations.InviteResponse;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.responses.PostChatMessageResult;
import com.habitrpg.android.habitica.models.social.ChatMessage;
import com.habitrpg.android.habitica.models.social.FindUsernameResult;
import com.habitrpg.android.habitica.models.social.Group;
import com.habitrpg.android.habitica.models.social.GroupMembership;
import com.habitrpg.android.habitica.models.social.InboxConversation;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.modules.AuthenticationHandler;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import dc.w;
import dd.g;
import dd.i;
import ec.t;
import ic.d;
import io.realm.g1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.b;
import qc.q;
import yc.v;

/* compiled from: SocialRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class SocialRepositoryImpl extends BaseRepositoryImpl<SocialLocalRepository> implements SocialRepository {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialRepositoryImpl(SocialLocalRepository socialLocalRepository, ApiClient apiClient, AuthenticationHandler authenticationHandler) {
        super(socialLocalRepository, apiClient, authenticationHandler);
        q.i(socialLocalRepository, "localRepository");
        q.i(apiClient, "apiClient");
        q.i(authenticationHandler, "authenticationHandler");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    @Override // com.habitrpg.android.habitica.data.SocialRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object abortQuest(java.lang.String r5, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.inventory.Quest> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$abortQuest$1
            if (r0 == 0) goto L13
            r0 = r6
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$abortQuest$1 r0 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$abortQuest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$abortQuest$1 r0 = new com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$abortQuest$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl r0 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl) r0
            dc.n.b(r6)
            goto L4e
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            dc.n.b(r6)
            com.habitrpg.android.habitica.data.ApiClient r6 = r4.getApiClient()
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r6.abortQuest(r5, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r0 = r4
        L4e:
            com.habitrpg.android.habitica.models.inventory.Quest r6 = (com.habitrpg.android.habitica.models.inventory.Quest) r6
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r0 = r0.getLocalRepository()
            com.habitrpg.android.habitica.data.local.SocialLocalRepository r0 = (com.habitrpg.android.habitica.data.local.SocialLocalRepository) r0
            r0.removeQuest(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl.abortQuest(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // com.habitrpg.android.habitica.data.SocialRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object acceptQuest(com.habitrpg.android.habitica.models.user.User r5, java.lang.String r6, kotlin.coroutines.Continuation<? super java.lang.Void> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$acceptQuest$1
            if (r0 == 0) goto L13
            r0 = r7
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$acceptQuest$1 r0 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$acceptQuest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$acceptQuest$1 r0 = new com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$acceptQuest$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$1
            com.habitrpg.android.habitica.models.user.User r5 = (com.habitrpg.android.habitica.models.user.User) r5
            java.lang.Object r6 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl r6 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl) r6
            dc.n.b(r7)
            goto L4e
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            dc.n.b(r7)
            com.habitrpg.android.habitica.data.ApiClient r7 = r4.getApiClient()
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r7.acceptQuest(r6, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r6 = r4
        L4e:
            if (r5 == 0) goto L5a
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r6 = r6.getLocalRepository()
            com.habitrpg.android.habitica.data.local.SocialLocalRepository r6 = (com.habitrpg.android.habitica.data.local.SocialLocalRepository) r6
            r7 = 0
            r6.updateRSVPNeeded(r5, r7)
        L5a:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl.acceptQuest(com.habitrpg.android.habitica.models.user.User, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.SocialRepository
    public Object blockMember(String str, Continuation<? super List<String>> continuation) {
        return getApiClient().blockMember(str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    @Override // com.habitrpg.android.habitica.data.SocialRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object cancelQuest(java.lang.String r5, kotlin.coroutines.Continuation<? super java.lang.Void> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$cancelQuest$1
            if (r0 == 0) goto L13
            r0 = r6
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$cancelQuest$1 r0 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$cancelQuest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$cancelQuest$1 r0 = new com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$cancelQuest$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl r0 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl) r0
            dc.n.b(r6)
            goto L4e
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            dc.n.b(r6)
            com.habitrpg.android.habitica.data.ApiClient r6 = r4.getApiClient()
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r6.cancelQuest(r5, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r0 = r4
        L4e:
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r6 = r0.getLocalRepository()
            com.habitrpg.android.habitica.data.local.SocialLocalRepository r6 = (com.habitrpg.android.habitica.data.local.SocialLocalRepository) r6
            r6.removeQuest(r5)
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl.cancelQuest(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    @Override // com.habitrpg.android.habitica.data.SocialRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object createGroup(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.Boolean r9, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.social.Group> r10) {
        /*
            r3 = this;
            boolean r9 = r10 instanceof com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$createGroup$1
            if (r9 == 0) goto L13
            r9 = r10
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$createGroup$1 r9 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$createGroup$1) r9
            int r0 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r9.label = r0
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$createGroup$1 r9 = new com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$createGroup$1
            r9.<init>(r3, r10)
        L18:
            java.lang.Object r10 = r9.result
            java.lang.Object r0 = ic.b.d()
            int r1 = r9.label
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            java.lang.Object r4 = r9.L$0
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl r4 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl) r4
            dc.n.b(r10)
            goto L5c
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            dc.n.b(r10)
            com.habitrpg.android.habitica.models.social.Group r10 = new com.habitrpg.android.habitica.models.social.Group
            r10.<init>()
            r10.setName(r4)
            r10.setDescription(r5)
            r10.setType(r7)
            r10.setLeaderID(r6)
            r10.setPrivacy(r8)
            com.habitrpg.android.habitica.data.ApiClient r4 = r3.getApiClient()
            r9.L$0 = r3
            r9.label = r2
            java.lang.Object r10 = r4.createGroup(r10, r9)
            if (r10 != r0) goto L5b
            return r0
        L5b:
            r4 = r3
        L5c:
            com.habitrpg.android.habitica.models.social.Group r10 = (com.habitrpg.android.habitica.models.social.Group) r10
            if (r10 == 0) goto L69
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r4 = r4.getLocalRepository()
            com.habitrpg.android.habitica.data.local.SocialLocalRepository r4 = (com.habitrpg.android.habitica.data.local.SocialLocalRepository) r4
            r4.save(r10)
        L69:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl.createGroup(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    @Override // com.habitrpg.android.habitica.data.SocialRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object deleteMessage(com.habitrpg.android.habitica.models.social.ChatMessage r6, kotlin.coroutines.Continuation<? super java.lang.Void> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$deleteMessage$1
            if (r0 == 0) goto L13
            r0 = r7
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$deleteMessage$1 r0 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$deleteMessage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$deleteMessage$1 r0 = new com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$deleteMessage$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L31
            if (r2 != r3) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            java.lang.Object r6 = r0.L$1
            com.habitrpg.android.habitica.models.social.ChatMessage r6 = (com.habitrpg.android.habitica.models.social.ChatMessage) r6
            java.lang.Object r0 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl r0 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl) r0
            dc.n.b(r7)
            goto L7a
        L3d:
            dc.n.b(r7)
            boolean r7 = r6.isInboxMessage()
            if (r7 == 0) goto L5d
            com.habitrpg.android.habitica.data.ApiClient r7 = r5.getApiClient()
            java.lang.String r2 = r6.getId()
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r7.deleteInboxMessage(r2, r0)
            if (r7 != r1) goto L5b
            return r1
        L5b:
            r0 = r5
            goto L7a
        L5d:
            com.habitrpg.android.habitica.data.ApiClient r7 = r5.getApiClient()
            java.lang.String r2 = r6.getGroupId()
            if (r2 != 0) goto L69
            java.lang.String r2 = ""
        L69:
            java.lang.String r4 = r6.getId()
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = r7.deleteMessage(r2, r4, r0)
            if (r7 != r1) goto L5b
            return r1
        L7a:
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r7 = r0.getLocalRepository()
            com.habitrpg.android.habitica.data.local.SocialLocalRepository r7 = (com.habitrpg.android.habitica.data.local.SocialLocalRepository) r7
            java.lang.String r6 = r6.getId()
            r7.deleteMessage(r6)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl.deleteMessage(com.habitrpg.android.habitica.models.social.ChatMessage, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.SocialRepository
    public Object findUsernames(String str, String str2, String str3, Continuation<? super List<FindUsernameResult>> continuation) {
        return getApiClient().findUsernames(str, str2, str3, continuation);
    }

    @Override // com.habitrpg.android.habitica.data.SocialRepository
    public Object flagMessage(String str, String str2, String str3, Continuation<? super Void> continuation) {
        boolean u10;
        boolean u11;
        u10 = v.u(str);
        if (u10 || q.d(getCurrentUserID(), "")) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("comment", str2);
        boolean z10 = false;
        if (str3 != null) {
            u11 = v.u(str3);
            if ((!u11) == true) {
                z10 = true;
            }
        }
        if (!z10) {
            return getApiClient().flagInboxMessage(str, linkedHashMap, continuation);
        }
        return getApiClient().flagMessage(str3, str, linkedHashMap, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    @Override // com.habitrpg.android.habitica.data.SocialRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object forceStartQuest(com.habitrpg.android.habitica.models.social.Group r6, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.inventory.Quest> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$forceStartQuest$1
            if (r0 == 0) goto L13
            r0 = r7
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$forceStartQuest$1 r0 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$forceStartQuest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$forceStartQuest$1 r0 = new com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$forceStartQuest$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.L$1
            com.habitrpg.android.habitica.models.social.Group r6 = (com.habitrpg.android.habitica.models.social.Group) r6
            java.lang.Object r0 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl r0 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl) r0
            dc.n.b(r7)
            goto L5e
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            dc.n.b(r7)
            com.habitrpg.android.habitica.data.ApiClient r7 = r5.getApiClient()
            java.lang.String r2 = r6.getId()
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r4 = r5.getLocalRepository()
            com.habitrpg.android.habitica.data.local.SocialLocalRepository r4 = (com.habitrpg.android.habitica.data.local.SocialLocalRepository) r4
            com.habitrpg.android.habitica.models.BaseObject r4 = r4.getUnmanagedCopy(r6)
            com.habitrpg.android.habitica.models.social.Group r4 = (com.habitrpg.android.habitica.models.social.Group) r4
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = r7.forceStartQuest(r2, r4, r0)
            if (r7 != r1) goto L5d
            return r1
        L5d:
            r0 = r5
        L5e:
            com.habitrpg.android.habitica.models.inventory.Quest r7 = (com.habitrpg.android.habitica.models.inventory.Quest) r7
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r0 = r0.getLocalRepository()
            com.habitrpg.android.habitica.data.local.SocialLocalRepository r0 = (com.habitrpg.android.habitica.data.local.SocialLocalRepository) r0
            r0.setQuestActivity(r6, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl.forceStartQuest(com.habitrpg.android.habitica.models.social.Group, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.SocialRepository
    public g<Group> getGroup(String str) {
        boolean u10;
        boolean z10 = false;
        if (str != null) {
            u10 = v.u(str);
            if ((!u10) == true) {
                z10 = true;
            }
        }
        if (!z10) {
            return i.s();
        }
        return getLocalRepository().getGroup(str);
    }

    @Override // com.habitrpg.android.habitica.data.SocialRepository
    public g<List<ChatMessage>> getGroupChat(String str) {
        q.i(str, TaskFormActivity.GROUP_ID_KEY);
        return getLocalRepository().getGroupChat(str);
    }

    @Override // com.habitrpg.android.habitica.data.SocialRepository
    public Object getGroupMembers(String str, Continuation<? super g<? extends List<? extends Member>>> continuation) {
        return getLocalRepository().getGroupMembers(str);
    }

    @Override // com.habitrpg.android.habitica.data.SocialRepository
    public g<GroupMembership> getGroupMembership(String str) {
        q.i(str, "id");
        return i.R(getAuthenticationHandler().getUserIDFlow(), new SocialRepositoryImpl$getGroupMembership$$inlined$flatMapLatest$1(null, this, str));
    }

    @Override // com.habitrpg.android.habitica.data.SocialRepository
    public g<List<GroupMembership>> getGroupMemberships() {
        return i.R(getAuthenticationHandler().getUserIDFlow(), new SocialRepositoryImpl$getGroupMemberships$$inlined$flatMapLatest$1(null, this));
    }

    @Override // com.habitrpg.android.habitica.data.SocialRepository
    public g<g1<InboxConversation>> getInboxConversations() {
        return i.R(getAuthenticationHandler().getUserIDFlow(), new SocialRepositoryImpl$getInboxConversations$$inlined$flatMapLatest$1(null, this));
    }

    @Override // com.habitrpg.android.habitica.data.SocialRepository
    public g<g1<ChatMessage>> getInboxMessages(String str) {
        return i.R(getAuthenticationHandler().getUserIDFlow(), new SocialRepositoryImpl$getInboxMessages$$inlined$flatMapLatest$1(null, this, str));
    }

    @Override // com.habitrpg.android.habitica.data.SocialRepository
    public g<Member> getMember(String str) {
        return getLocalRepository().getMember(str);
    }

    @Override // com.habitrpg.android.habitica.data.SocialRepository
    public Object getMemberAchievements(String str, Continuation<? super List<? extends Achievement>> continuation) {
        if (str == null) {
            return null;
        }
        return getApiClient().getMemberAchievements(str, continuation);
    }

    @Override // com.habitrpg.android.habitica.data.SocialRepository
    public Object getPartyMembers(String str, Continuation<? super g<? extends List<? extends Member>>> continuation) {
        return getLocalRepository().getPartyMembers(str);
    }

    @Override // com.habitrpg.android.habitica.data.SocialRepository
    public g<List<Group>> getUserGroups(String str) {
        return i.R(getAuthenticationHandler().getUserIDFlow(), new SocialRepositoryImpl$getUserGroups$$inlined$flatMapLatest$1(null, this, str));
    }

    @Override // com.habitrpg.android.habitica.data.SocialRepository
    public Object inviteToGroup(String str, Map<String, ? extends Object> map, Continuation<? super List<InviteResponse>> continuation) {
        return getApiClient().inviteToGroup(str, map, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    @Override // com.habitrpg.android.habitica.data.SocialRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object joinGroup(java.lang.String r5, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.social.Group> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$joinGroup$1
            if (r0 == 0) goto L13
            r0 = r6
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$joinGroup$1 r0 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$joinGroup$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$joinGroup$1 r0 = new com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$joinGroup$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl r0 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl) r0
            dc.n.b(r6)
            goto L5d
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            dc.n.b(r6)
            r6 = 0
            if (r5 == 0) goto L47
            boolean r2 = yc.m.u(r5)
            r2 = r2 ^ r3
            if (r2 != r3) goto L47
            r6 = 1
        L47:
            if (r6 != 0) goto L4b
            r5 = 0
            return r5
        L4b:
            com.habitrpg.android.habitica.data.ApiClient r6 = r4.getApiClient()
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r6.joinGroup(r5, r0)
            if (r6 != r1) goto L5c
            return r1
        L5c:
            r0 = r4
        L5d:
            com.habitrpg.android.habitica.models.social.Group r6 = (com.habitrpg.android.habitica.models.social.Group) r6
            if (r6 == 0) goto L77
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r1 = r0.getLocalRepository()
            com.habitrpg.android.habitica.data.local.SocialLocalRepository r1 = (com.habitrpg.android.habitica.data.local.SocialLocalRepository) r1
            java.lang.String r2 = r0.getCurrentUserID()
            r1.updateMembership(r2, r5, r3)
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r5 = r0.getLocalRepository()
            com.habitrpg.android.habitica.data.local.SocialLocalRepository r5 = (com.habitrpg.android.habitica.data.local.SocialLocalRepository) r5
            r5.save(r6)
        L77:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl.joinGroup(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091 A[PHI: r10
      0x0091: PHI (r10v11 java.lang.Object) = (r10v10 java.lang.Object), (r10v1 java.lang.Object) binds: [B:33:0x008e, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // com.habitrpg.android.habitica.data.SocialRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object leaveGroup(java.lang.String r8, boolean r9, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.social.Group> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$leaveGroup$1
            if (r0 == 0) goto L13
            r0 = r10
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$leaveGroup$1 r0 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$leaveGroup$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$leaveGroup$1 r0 = new com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$leaveGroup$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L42
            if (r2 == r6) goto L36
            if (r2 != r3) goto L2e
            dc.n.b(r10)
            goto L91
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.Object r8 = r0.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl r9 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl) r9
            dc.n.b(r10)
            goto L6d
        L42:
            dc.n.b(r10)
            if (r8 == 0) goto L50
            boolean r10 = yc.m.u(r8)
            r10 = r10 ^ r6
            if (r10 != r6) goto L50
            r10 = 1
            goto L51
        L50:
            r10 = 0
        L51:
            if (r10 != 0) goto L54
            return r4
        L54:
            com.habitrpg.android.habitica.data.ApiClient r10 = r7.getApiClient()
            if (r9 == 0) goto L5d
            java.lang.String r9 = "remain-in-challenges"
            goto L5f
        L5d:
            java.lang.String r9 = "leave-challenges"
        L5f:
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r6
            java.lang.Object r9 = r10.leaveGroup(r8, r9, r0)
            if (r9 != r1) goto L6c
            return r1
        L6c:
            r9 = r7
        L6d:
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r10 = r9.getLocalRepository()
            com.habitrpg.android.habitica.data.local.SocialLocalRepository r10 = (com.habitrpg.android.habitica.data.local.SocialLocalRepository) r10
            java.lang.String r2 = r9.getCurrentUserID()
            r10.updateMembership(r2, r8, r5)
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r9 = r9.getLocalRepository()
            com.habitrpg.android.habitica.data.local.SocialLocalRepository r9 = (com.habitrpg.android.habitica.data.local.SocialLocalRepository) r9
            dd.g r8 = r9.getGroup(r8)
            r0.L$0 = r4
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r10 = dd.i.x(r8, r0)
            if (r10 != r1) goto L91
            return r1
        L91:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl.leaveGroup(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.SocialRepository
    public Object leaveQuest(String str, Continuation<? super Void> continuation) {
        return getApiClient().leaveQuest(str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    @Override // com.habitrpg.android.habitica.data.SocialRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object likeMessage(com.habitrpg.android.habitica.models.social.ChatMessage r7, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.social.ChatMessage> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$likeMessage$1
            if (r0 == 0) goto L13
            r0 = r8
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$likeMessage$1 r0 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$likeMessage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$likeMessage$1 r0 = new com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$likeMessage$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r7 = r0.L$1
            com.habitrpg.android.habitica.models.social.ChatMessage r7 = (com.habitrpg.android.habitica.models.social.ChatMessage) r7
            java.lang.Object r0 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl r0 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl) r0
            dc.n.b(r8)
            goto L7c
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            dc.n.b(r8)
            java.lang.String r8 = r7.getId()
            boolean r8 = yc.m.u(r8)
            if (r8 == 0) goto L48
            return r3
        L48:
            java.lang.String r8 = r6.getCurrentUserID()
            boolean r8 = r7.userLikesMessage(r8)
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r2 = r6.getLocalRepository()
            com.habitrpg.android.habitica.data.local.SocialLocalRepository r2 = (com.habitrpg.android.habitica.data.local.SocialLocalRepository) r2
            java.lang.String r5 = r6.getCurrentUserID()
            r8 = r8 ^ r4
            r2.likeMessage(r7, r5, r8)
            com.habitrpg.android.habitica.data.ApiClient r8 = r6.getApiClient()
            java.lang.String r2 = r7.getGroupId()
            if (r2 != 0) goto L6a
            java.lang.String r2 = ""
        L6a:
            java.lang.String r5 = r7.getId()
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r8.likeMessage(r2, r5, r0)
            if (r8 != r1) goto L7b
            return r1
        L7b:
            r0 = r6
        L7c:
            com.habitrpg.android.habitica.models.social.ChatMessage r8 = (com.habitrpg.android.habitica.models.social.ChatMessage) r8
            if (r8 != 0) goto L81
            goto L88
        L81:
            java.lang.String r7 = r7.getGroupId()
            r8.setGroupId(r7)
        L88:
            if (r8 == 0) goto L93
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r7 = r0.getLocalRepository()
            com.habitrpg.android.habitica.data.local.SocialLocalRepository r7 = (com.habitrpg.android.habitica.data.local.SocialLocalRepository) r7
            r7.save(r8)
        L93:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl.likeMessage(com.habitrpg.android.habitica.models.social.ChatMessage, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.SocialRepository
    public Object markMessagesSeen(String str, Continuation<? super w> continuation) {
        Object d10;
        Object seenMessages = getApiClient().seenMessages(str, continuation);
        d10 = d.d();
        if (seenMessages == d10) {
            return seenMessages;
        }
        return w.f13270a;
    }

    @Override // com.habitrpg.android.habitica.data.SocialRepository
    public Object markPrivateMessagesRead(User user, Continuation<? super w> continuation) {
        Object d10;
        boolean z10 = false;
        if (user != null && user.isManaged()) {
            z10 = true;
        }
        if (z10) {
            getLocalRepository().modify(user, SocialRepositoryImpl$markPrivateMessagesRead$2.INSTANCE);
        }
        Object markPrivateMessagesRead = getApiClient().markPrivateMessagesRead(continuation);
        d10 = d.d();
        if (markPrivateMessagesRead == d10) {
            return markPrivateMessagesRead;
        }
        return w.f13270a;
    }

    @Override // com.habitrpg.android.habitica.data.SocialRepository
    public void markSomePrivateMessagesAsRead(User user, List<? extends ChatMessage> list) {
        boolean z10;
        boolean z11;
        int i10;
        q.i(list, "messages");
        if (user != null && user.isManaged()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            List<? extends ChatMessage> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                i10 = 0;
            } else {
                Iterator<T> it = list2.iterator();
                i10 = 0;
                while (it.hasNext()) {
                    if ((!((ChatMessage) it.next()).isSeen()) != false && (i10 = i10 + 1) < 0) {
                        t.q();
                    }
                }
            }
            getLocalRepository().modify(user, new SocialRepositoryImpl$markSomePrivateMessagesAsRead$1(i10));
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ChatMessage chatMessage = (ChatMessage) obj;
            if (chatMessage.isManaged() && !chatMessage.isSeen()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            getLocalRepository().modify((ChatMessage) it2.next(), SocialRepositoryImpl$markSomePrivateMessagesAsRead$3.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    @Override // com.habitrpg.android.habitica.data.SocialRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object postGroupChat(java.lang.String r5, java.util.HashMap<java.lang.String, java.lang.String> r6, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.responses.PostChatMessageResult> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$postGroupChat$1
            if (r0 == 0) goto L13
            r0 = r7
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$postGroupChat$1 r0 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$postGroupChat$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$postGroupChat$1 r0 = new com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$postGroupChat$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            java.lang.String r5 = (java.lang.String) r5
            dc.n.b(r7)
            goto L47
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            dc.n.b(r7)
            com.habitrpg.android.habitica.data.ApiClient r7 = r4.getApiClient()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r7 = r7.postGroupChat(r5, r6, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            com.habitrpg.android.habitica.models.responses.PostChatMessageResult r7 = (com.habitrpg.android.habitica.models.responses.PostChatMessageResult) r7
            if (r7 == 0) goto L4e
            com.habitrpg.android.habitica.models.social.ChatMessage r6 = r7.message
            goto L4f
        L4e:
            r6 = 0
        L4f:
            if (r6 != 0) goto L52
            goto L55
        L52:
            r6.setGroupId(r5)
        L55:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl.postGroupChat(java.lang.String, java.util.HashMap, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064 A[PHI: r8
      0x0064: PHI (r8v6 java.lang.Object) = (r8v5 java.lang.Object), (r8v1 java.lang.Object) binds: [B:21:0x0061, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // com.habitrpg.android.habitica.data.SocialRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object postPrivateMessage(java.lang.String r6, java.util.HashMap<java.lang.String, java.lang.String> r7, kotlin.coroutines.Continuation<? super java.util.List<? extends com.habitrpg.android.habitica.models.social.ChatMessage>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$postPrivateMessage$1
            if (r0 == 0) goto L13
            r0 = r8
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$postPrivateMessage$1 r0 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$postPrivateMessage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$postPrivateMessage$1 r0 = new com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$postPrivateMessage$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            dc.n.b(r8)
            goto L64
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl r7 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl) r7
            dc.n.b(r8)
            goto L55
        L40:
            dc.n.b(r8)
            com.habitrpg.android.habitica.data.ApiClient r8 = r5.getApiClient()
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r8.postPrivateMessage(r7, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r7 = r5
        L55:
            r8 = 0
            r0.L$0 = r8
            r0.L$1 = r8
            r0.label = r3
            r8 = 0
            java.lang.Object r8 = r7.retrieveInboxMessages(r6, r8, r0)
            if (r8 != r1) goto L64
            return r1
        L64:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl.postPrivateMessage(java.lang.String, java.util.HashMap, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    @Override // com.habitrpg.android.habitica.data.SocialRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object rejectGroupInvite(java.lang.String r5, kotlin.coroutines.Continuation<? super java.lang.Void> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$rejectGroupInvite$1
            if (r0 == 0) goto L13
            r0 = r6
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$rejectGroupInvite$1 r0 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$rejectGroupInvite$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$rejectGroupInvite$1 r0 = new com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$rejectGroupInvite$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl r0 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl) r0
            dc.n.b(r6)
            goto L4e
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            dc.n.b(r6)
            com.habitrpg.android.habitica.data.ApiClient r6 = r4.getApiClient()
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r6.rejectGroupInvite(r5, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r0 = r4
        L4e:
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r6 = r0.getLocalRepository()
            com.habitrpg.android.habitica.data.local.SocialLocalRepository r6 = (com.habitrpg.android.habitica.data.local.SocialLocalRepository) r6
            java.lang.String r0 = r0.getCurrentUserID()
            r6.rejectGroupInvitation(r0, r5)
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl.rejectGroupInvite(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // com.habitrpg.android.habitica.data.SocialRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object rejectQuest(com.habitrpg.android.habitica.models.user.User r5, java.lang.String r6, kotlin.coroutines.Continuation<? super java.lang.Void> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$rejectQuest$1
            if (r0 == 0) goto L13
            r0 = r7
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$rejectQuest$1 r0 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$rejectQuest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$rejectQuest$1 r0 = new com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$rejectQuest$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$1
            com.habitrpg.android.habitica.models.user.User r5 = (com.habitrpg.android.habitica.models.user.User) r5
            java.lang.Object r6 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl r6 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl) r6
            dc.n.b(r7)
            goto L4e
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            dc.n.b(r7)
            com.habitrpg.android.habitica.data.ApiClient r7 = r4.getApiClient()
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r7.rejectQuest(r6, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r6 = r4
        L4e:
            if (r5 == 0) goto L5a
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r6 = r6.getLocalRepository()
            com.habitrpg.android.habitica.data.local.SocialLocalRepository r6 = (com.habitrpg.android.habitica.data.local.SocialLocalRepository) r6
            r7 = 0
            r6.updateRSVPNeeded(r5, r7)
        L5a:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl.rejectQuest(com.habitrpg.android.habitica.models.user.User, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[PHI: r8
      0x0063: PHI (r8v5 java.lang.Object) = (r8v4 java.lang.Object), (r8v1 java.lang.Object) binds: [B:21:0x0060, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // com.habitrpg.android.habitica.data.SocialRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object removeMemberFromGroup(java.lang.String r6, java.lang.String r7, kotlin.coroutines.Continuation<? super java.util.List<? extends com.habitrpg.android.habitica.models.members.Member>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$removeMemberFromGroup$1
            if (r0 == 0) goto L13
            r0 = r8
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$removeMemberFromGroup$1 r0 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$removeMemberFromGroup$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$removeMemberFromGroup$1 r0 = new com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$removeMemberFromGroup$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            dc.n.b(r8)
            goto L63
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl r7 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl) r7
            dc.n.b(r8)
            goto L55
        L40:
            dc.n.b(r8)
            com.habitrpg.android.habitica.data.ApiClient r8 = r5.getApiClient()
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r8.removeMemberFromGroup(r6, r7, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r7 = r5
        L55:
            r8 = 0
            r0.L$0 = r8
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r8 = r7.retrievePartyMembers(r6, r4, r0)
            if (r8 != r1) goto L63
            return r1
        L63:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl.removeMemberFromGroup(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.SocialRepository
    public Object reportMember(String str, Map<String, String> map, Continuation<? super Void> continuation) {
        return getApiClient().reportMember(str, map, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    @Override // com.habitrpg.android.habitica.data.SocialRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object retrieveGroup(java.lang.String r6, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.social.Group> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$retrieveGroup$1
            if (r0 == 0) goto L13
            r0 = r7
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$retrieveGroup$1 r0 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$retrieveGroup$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$retrieveGroup$1 r0 = new com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$retrieveGroup$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.L$0
            com.habitrpg.android.habitica.models.social.Group r6 = (com.habitrpg.android.habitica.models.social.Group) r6
            dc.n.b(r7)
            goto L75
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl r2 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl) r2
            dc.n.b(r7)
            goto L59
        L44:
            dc.n.b(r7)
            com.habitrpg.android.habitica.data.ApiClient r7 = r5.getApiClient()
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r7.getGroup(r6, r0)
            if (r7 != r1) goto L58
            return r1
        L58:
            r2 = r5
        L59:
            com.habitrpg.android.habitica.models.social.Group r7 = (com.habitrpg.android.habitica.models.social.Group) r7
            if (r7 == 0) goto L66
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r4 = r2.getLocalRepository()
            com.habitrpg.android.habitica.data.local.SocialLocalRepository r4 = (com.habitrpg.android.habitica.data.local.SocialLocalRepository) r4
            r4.saveGroup(r7)
        L66:
            r0.L$0 = r7
            r4 = 0
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r6 = r2.retrieveGroupChat(r6, r0)
            if (r6 != r1) goto L74
            return r1
        L74:
            r6 = r7
        L75:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl.retrieveGroup(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    @Override // com.habitrpg.android.habitica.data.SocialRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object retrieveGroupChat(java.lang.String r5, kotlin.coroutines.Continuation<? super java.util.List<? extends com.habitrpg.android.habitica.models.social.ChatMessage>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$retrieveGroupChat$1
            if (r0 == 0) goto L13
            r0 = r6
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$retrieveGroupChat$1 r0 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$retrieveGroupChat$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$retrieveGroupChat$1 r0 = new com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$retrieveGroupChat$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            java.lang.String r5 = (java.lang.String) r5
            dc.n.b(r6)
            goto L47
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            dc.n.b(r6)
            com.habitrpg.android.habitica.data.ApiClient r6 = r4.getApiClient()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.listGroupChat(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L62
            r0 = r6
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L52:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L62
            java.lang.Object r1 = r0.next()
            com.habitrpg.android.habitica.models.social.ChatMessage r1 = (com.habitrpg.android.habitica.models.social.ChatMessage) r1
            r1.setGroupId(r5)
            goto L52
        L62:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl.retrieveGroupChat(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    @Override // com.habitrpg.android.habitica.data.SocialRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object retrieveInboxConversations(kotlin.coroutines.Continuation<? super java.util.List<? extends com.habitrpg.android.habitica.models.social.InboxConversation>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$retrieveInboxConversations$1
            if (r0 == 0) goto L13
            r0 = r5
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$retrieveInboxConversations$1 r0 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$retrieveInboxConversations$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$retrieveInboxConversations$1 r0 = new com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$retrieveInboxConversations$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl r0 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl) r0
            dc.n.b(r5)
            goto L48
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            dc.n.b(r5)
            com.habitrpg.android.habitica.data.ApiClient r5 = r4.getApiClient()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.retrieveInboxConversations(r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L4e
            r5 = 0
            return r5
        L4e:
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r1 = r0.getLocalRepository()
            com.habitrpg.android.habitica.data.local.SocialLocalRepository r1 = (com.habitrpg.android.habitica.data.local.SocialLocalRepository) r1
            java.lang.String r0 = r0.getCurrentUserID()
            r1.saveInboxConversations(r0, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl.retrieveInboxConversations(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    @Override // com.habitrpg.android.habitica.data.SocialRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object retrieveInboxMessages(java.lang.String r5, int r6, kotlin.coroutines.Continuation<? super java.util.List<? extends com.habitrpg.android.habitica.models.social.ChatMessage>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$retrieveInboxMessages$1
            if (r0 == 0) goto L13
            r0 = r7
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$retrieveInboxMessages$1 r0 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$retrieveInboxMessages$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$retrieveInboxMessages$1 r0 = new com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$retrieveInboxMessages$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            int r6 = r0.I$0
            java.lang.Object r5 = r0.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl r0 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl) r0
            dc.n.b(r7)
            goto L52
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            dc.n.b(r7)
            com.habitrpg.android.habitica.data.ApiClient r7 = r4.getApiClient()
            r0.L$0 = r4
            r0.L$1 = r5
            r0.I$0 = r6
            r0.label = r3
            java.lang.Object r7 = r7.retrieveInboxMessages(r5, r6, r0)
            if (r7 != r1) goto L51
            return r1
        L51:
            r0 = r4
        L52:
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L58
            r5 = 0
            return r5
        L58:
            r1 = r7
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L5f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r1.next()
            com.habitrpg.android.habitica.models.social.ChatMessage r2 = (com.habitrpg.android.habitica.models.social.ChatMessage) r2
            r2.setInboxMessage(r3)
            goto L5f
        L6f:
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r1 = r0.getLocalRepository()
            com.habitrpg.android.habitica.data.local.SocialLocalRepository r1 = (com.habitrpg.android.habitica.data.local.SocialLocalRepository) r1
            java.lang.String r0 = r0.getCurrentUserID()
            r1.saveInboxMessages(r0, r5, r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl.retrieveInboxMessages(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094 A[RETURN] */
    @Override // com.habitrpg.android.habitica.data.SocialRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object retrieveMember(java.lang.String r8, boolean r9, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.members.Member> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$retrieveMember$1
            if (r0 == 0) goto L13
            r0 = r10
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$retrieveMember$1 r0 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$retrieveMember$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$retrieveMember$1 r0 = new com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$retrieveMember$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4a
            if (r2 == r5) goto L46
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            dc.n.b(r10)
            goto L95
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.Object r8 = r0.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl r9 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl) r9
            dc.n.b(r10)     // Catch: java.lang.IllegalArgumentException -> L44
            goto L7f
        L44:
            goto L84
        L46:
            dc.n.b(r10)
            goto L5f
        L4a:
            dc.n.b(r10)
            if (r8 != 0) goto L50
            goto L98
        L50:
            if (r9 == 0) goto L60
            com.habitrpg.android.habitica.data.ApiClient r9 = r7.getApiClient()
            r0.label = r5
            java.lang.Object r10 = r9.getHallMember(r8, r0)
            if (r10 != r1) goto L5f
            return r1
        L5f:
            return r10
        L60:
            java.util.UUID r9 = java.util.UUID.fromString(r8)     // Catch: java.lang.IllegalArgumentException -> L82
            java.lang.String r9 = r9.toString()     // Catch: java.lang.IllegalArgumentException -> L82
            java.lang.String r10 = "toString(...)"
            qc.q.h(r9, r10)     // Catch: java.lang.IllegalArgumentException -> L82
            com.habitrpg.android.habitica.data.ApiClient r10 = r7.getApiClient()     // Catch: java.lang.IllegalArgumentException -> L82
            r0.L$0 = r7     // Catch: java.lang.IllegalArgumentException -> L82
            r0.L$1 = r8     // Catch: java.lang.IllegalArgumentException -> L82
            r0.label = r4     // Catch: java.lang.IllegalArgumentException -> L82
            java.lang.Object r10 = r10.getMember(r9, r0)     // Catch: java.lang.IllegalArgumentException -> L82
            if (r10 != r1) goto L7e
            return r1
        L7e:
            r9 = r7
        L7f:
            com.habitrpg.android.habitica.models.members.Member r10 = (com.habitrpg.android.habitica.models.members.Member) r10     // Catch: java.lang.IllegalArgumentException -> L44
            goto L97
        L82:
            r9 = r7
        L84:
            com.habitrpg.android.habitica.data.ApiClient r9 = r9.getApiClient()
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r10 = r9.getMemberWithUsername(r8, r0)
            if (r10 != r1) goto L95
            return r1
        L95:
            com.habitrpg.android.habitica.models.members.Member r10 = (com.habitrpg.android.habitica.models.members.Member) r10
        L97:
            r6 = r10
        L98:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl.retrieveMember(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    @Override // com.habitrpg.android.habitica.data.SocialRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object retrievePartyMembers(java.lang.String r5, boolean r6, kotlin.coroutines.Continuation<? super java.util.List<? extends com.habitrpg.android.habitica.models.members.Member>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$retrievePartyMembers$1
            if (r0 == 0) goto L13
            r0 = r7
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$retrievePartyMembers$1 r0 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$retrievePartyMembers$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$retrievePartyMembers$1 r0 = new com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$retrievePartyMembers$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl r6 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl) r6
            dc.n.b(r7)
            goto L52
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            dc.n.b(r7)
            com.habitrpg.android.habitica.data.ApiClient r7 = r4.getApiClient()
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r6)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r7 = r7.getGroupMembers(r5, r6, r0)
            if (r7 != r1) goto L51
            return r1
        L51:
            r6 = r4
        L52:
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L5f
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r6 = r6.getLocalRepository()
            com.habitrpg.android.habitica.data.local.SocialLocalRepository r6 = (com.habitrpg.android.habitica.data.local.SocialLocalRepository) r6
            r6.savePartyMembers(r5, r7)
        L5f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl.retrievePartyMembers(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.SocialRepository
    public Object retrievePartySeekingUsers(int i10, Continuation<? super List<? extends Member>> continuation) {
        return getApiClient().retrievePartySeekingUsers(i10, continuation);
    }

    @Override // com.habitrpg.android.habitica.data.SocialRepository
    public Object retrievegroupInvites(String str, boolean z10, Continuation<? super List<? extends Member>> continuation) {
        return getApiClient().getGroupInvites(str, b.a(z10), continuation);
    }

    @Override // com.habitrpg.android.habitica.data.SocialRepository
    public Object transferGems(String str, int i10, Continuation<? super Void> continuation) {
        return getApiClient().transferGems(str, i10, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // com.habitrpg.android.habitica.data.SocialRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object transferGroupOwnership(java.lang.String r7, java.lang.String r8, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.social.Group> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$transferGroupOwnership$1
            if (r0 == 0) goto L13
            r0 = r9
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$transferGroupOwnership$1 r0 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$transferGroupOwnership$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$transferGroupOwnership$1 r0 = new com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$transferGroupOwnership$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            dc.n.b(r9)
            goto L90
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.L$2
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r0.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r2 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl r2 = (com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl) r2
            dc.n.b(r9)
            goto L62
        L45:
            dc.n.b(r9)
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r9 = r6.getLocalRepository()
            com.habitrpg.android.habitica.data.local.SocialLocalRepository r9 = (com.habitrpg.android.habitica.data.local.SocialLocalRepository) r9
            dd.g r9 = r9.getGroup(r7)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r8
            r0.label = r4
            java.lang.Object r9 = dd.i.v(r9, r0)
            if (r9 != r1) goto L61
            return r1
        L61:
            r2 = r6
        L62:
            com.habitrpg.android.habitica.models.social.Group r9 = (com.habitrpg.android.habitica.models.social.Group) r9
            r4 = 0
            if (r9 == 0) goto L74
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r5 = r2.getLocalRepository()
            com.habitrpg.android.habitica.data.local.SocialLocalRepository r5 = (com.habitrpg.android.habitica.data.local.SocialLocalRepository) r5
            com.habitrpg.android.habitica.models.BaseObject r9 = r5.getUnmanagedCopy(r9)
            com.habitrpg.android.habitica.models.social.Group r9 = (com.habitrpg.android.habitica.models.social.Group) r9
            goto L75
        L74:
            r9 = r4
        L75:
            if (r9 != 0) goto L78
            goto L7b
        L78:
            r9.setLeaderID(r8)
        L7b:
            if (r9 == 0) goto L93
            com.habitrpg.android.habitica.data.ApiClient r8 = r2.getApiClient()
            r0.L$0 = r4
            r0.L$1 = r4
            r0.L$2 = r4
            r0.label = r3
            java.lang.Object r9 = r8.updateGroup(r7, r9, r0)
            if (r9 != r1) goto L90
            return r1
        L90:
            r4 = r9
            com.habitrpg.android.habitica.models.social.Group r4 = (com.habitrpg.android.habitica.models.social.Group) r4
        L93:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl.transferGroupOwnership(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.SocialRepository
    public Object updateGroup(Group group, String str, String str2, String str3, Boolean bool, Continuation<? super Group> continuation) {
        boolean z10;
        if (group == null) {
            return null;
        }
        Group group2 = (Group) getLocalRepository().getUnmanagedCopy((SocialLocalRepository) group);
        group2.setName(str);
        group2.setDescription(str2);
        group2.setLeaderID(str3);
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            z10 = false;
        }
        group2.setLeaderOnlyChallenges(z10);
        getLocalRepository().save((SocialLocalRepository) group2);
        return getApiClient().updateGroup(group2.getId(), group2, continuation);
    }

    @Override // com.habitrpg.android.habitica.data.SocialRepository
    public Object updateMember(String str, Map<String, ? extends Map<String, Boolean>> map, Continuation<? super Member> continuation) {
        return getApiClient().updateMember(str, map, continuation);
    }

    @Override // com.habitrpg.android.habitica.data.SocialRepository
    public Object postPrivateMessage(String str, String str2, Continuation<? super List<? extends ChatMessage>> continuation) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("message", str2);
        hashMap.put("toUserId", str);
        return postPrivateMessage(str, hashMap, continuation);
    }

    @Override // com.habitrpg.android.habitica.data.SocialRepository
    public Object postGroupChat(String str, String str2, Continuation<? super PostChatMessageResult> continuation) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("message", str2);
        return postGroupChat(str, hashMap, continuation);
    }
}
