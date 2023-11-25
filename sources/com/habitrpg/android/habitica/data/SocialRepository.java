package com.habitrpg.android.habitica.data;

import com.habitrpg.android.habitica.models.Achievement;
import com.habitrpg.android.habitica.models.inventory.Quest;
import com.habitrpg.android.habitica.models.invitations.InviteResponse;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.responses.PostChatMessageResult;
import com.habitrpg.android.habitica.models.social.ChatMessage;
import com.habitrpg.android.habitica.models.social.FindUsernameResult;
import com.habitrpg.android.habitica.models.social.Group;
import com.habitrpg.android.habitica.models.social.GroupMembership;
import com.habitrpg.android.habitica.models.social.InboxConversation;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import dc.w;
import dd.g;
import io.realm.g1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* compiled from: SocialRepository.kt */
/* loaded from: classes4.dex */
public interface SocialRepository extends BaseRepository {

    /* compiled from: SocialRepository.kt */
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object acceptQuest$default(SocialRepository socialRepository, User user, String str, Continuation continuation, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    str = NavigationDrawerFragment.SIDEBAR_PARTY;
                }
                return socialRepository.acceptQuest(user, str, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: acceptQuest");
        }

        public static /* synthetic */ Object findUsernames$default(SocialRepository socialRepository, String str, String str2, String str3, Continuation continuation, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    str2 = null;
                }
                if ((i10 & 4) != 0) {
                    str3 = null;
                }
                return socialRepository.findUsernames(str, str2, str3, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findUsernames");
        }

        public static /* synthetic */ Object flagMessage$default(SocialRepository socialRepository, String str, String str2, String str3, Continuation continuation, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    str3 = null;
                }
                return socialRepository.flagMessage(str, str2, str3, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: flagMessage");
        }

        public static /* synthetic */ Object rejectQuest$default(SocialRepository socialRepository, User user, String str, Continuation continuation, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    str = NavigationDrawerFragment.SIDEBAR_PARTY;
                }
                return socialRepository.rejectQuest(user, str, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rejectQuest");
        }

        public static /* synthetic */ Object retrieveMember$default(SocialRepository socialRepository, String str, boolean z10, Continuation continuation, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    z10 = false;
                }
                return socialRepository.retrieveMember(str, z10, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrieveMember");
        }

        public static /* synthetic */ Object retrievePartySeekingUsers$default(SocialRepository socialRepository, int i10, Continuation continuation, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    i10 = 0;
                }
                return socialRepository.retrievePartySeekingUsers(i10, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrievePartySeekingUsers");
        }
    }

    Object abortQuest(String str, Continuation<? super Quest> continuation);

    Object acceptQuest(User user, String str, Continuation<? super Void> continuation);

    Object blockMember(String str, Continuation<? super List<String>> continuation);

    Object cancelQuest(String str, Continuation<? super Void> continuation);

    Object createGroup(String str, String str2, String str3, String str4, String str5, Boolean bool, Continuation<? super Group> continuation);

    Object deleteMessage(ChatMessage chatMessage, Continuation<? super Void> continuation);

    Object findUsernames(String str, String str2, String str3, Continuation<? super List<FindUsernameResult>> continuation);

    Object flagMessage(String str, String str2, String str3, Continuation<? super Void> continuation);

    Object forceStartQuest(Group group, Continuation<? super Quest> continuation);

    g<Group> getGroup(String str);

    g<List<ChatMessage>> getGroupChat(String str);

    Object getGroupMembers(String str, Continuation<? super g<? extends List<? extends Member>>> continuation);

    g<GroupMembership> getGroupMembership(String str);

    g<List<GroupMembership>> getGroupMemberships();

    g<g1<InboxConversation>> getInboxConversations();

    g<g1<ChatMessage>> getInboxMessages(String str);

    g<Member> getMember(String str);

    Object getMemberAchievements(String str, Continuation<? super List<? extends Achievement>> continuation);

    Object getPartyMembers(String str, Continuation<? super g<? extends List<? extends Member>>> continuation);

    g<List<Group>> getUserGroups(String str);

    Object inviteToGroup(String str, Map<String, ? extends Object> map, Continuation<? super List<InviteResponse>> continuation);

    Object joinGroup(String str, Continuation<? super Group> continuation);

    Object leaveGroup(String str, boolean z10, Continuation<? super Group> continuation);

    Object leaveQuest(String str, Continuation<? super Void> continuation);

    Object likeMessage(ChatMessage chatMessage, Continuation<? super ChatMessage> continuation);

    Object markMessagesSeen(String str, Continuation<? super w> continuation);

    Object markPrivateMessagesRead(User user, Continuation<? super w> continuation);

    void markSomePrivateMessagesAsRead(User user, List<? extends ChatMessage> list);

    Object postGroupChat(String str, String str2, Continuation<? super PostChatMessageResult> continuation);

    Object postGroupChat(String str, HashMap<String, String> hashMap, Continuation<? super PostChatMessageResult> continuation);

    Object postPrivateMessage(String str, String str2, Continuation<? super List<? extends ChatMessage>> continuation);

    Object postPrivateMessage(String str, HashMap<String, String> hashMap, Continuation<? super List<? extends ChatMessage>> continuation);

    Object rejectGroupInvite(String str, Continuation<? super Void> continuation);

    Object rejectQuest(User user, String str, Continuation<? super Void> continuation);

    Object removeMemberFromGroup(String str, String str2, Continuation<? super List<? extends Member>> continuation);

    Object reportMember(String str, Map<String, String> map, Continuation<? super Void> continuation);

    Object retrieveGroup(String str, Continuation<? super Group> continuation);

    Object retrieveGroupChat(String str, Continuation<? super List<? extends ChatMessage>> continuation);

    Object retrieveInboxConversations(Continuation<? super List<? extends InboxConversation>> continuation);

    Object retrieveInboxMessages(String str, int i10, Continuation<? super List<? extends ChatMessage>> continuation);

    Object retrieveMember(String str, boolean z10, Continuation<? super Member> continuation);

    Object retrievePartyMembers(String str, boolean z10, Continuation<? super List<? extends Member>> continuation);

    Object retrievePartySeekingUsers(int i10, Continuation<? super List<? extends Member>> continuation);

    Object retrievegroupInvites(String str, boolean z10, Continuation<? super List<? extends Member>> continuation);

    Object transferGems(String str, int i10, Continuation<? super Void> continuation);

    Object transferGroupOwnership(String str, String str2, Continuation<? super Group> continuation);

    Object updateGroup(Group group, String str, String str2, String str3, Boolean bool, Continuation<? super Group> continuation);

    Object updateMember(String str, Map<String, ? extends Map<String, Boolean>> map, Continuation<? super Member> continuation);
}
