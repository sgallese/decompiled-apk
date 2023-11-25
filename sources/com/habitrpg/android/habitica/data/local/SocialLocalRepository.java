package com.habitrpg.android.habitica.data.local;

import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.social.ChatMessage;
import com.habitrpg.android.habitica.models.social.Group;
import com.habitrpg.android.habitica.models.social.GroupMembership;
import com.habitrpg.android.habitica.models.social.InboxConversation;
import com.habitrpg.android.habitica.models.user.User;
import dd.g;
import io.realm.g1;
import java.util.List;

/* compiled from: SocialLocalRepository.kt */
/* loaded from: classes4.dex */
public interface SocialLocalRepository extends BaseLocalRepository {
    void deleteMessage(String str);

    boolean doesGroupExist(String str);

    g<Group> getGroup(String str);

    g<List<ChatMessage>> getGroupChat(String str);

    g<List<Member>> getGroupMembers(String str);

    g<GroupMembership> getGroupMembership(String str, String str2);

    g<List<GroupMembership>> getGroupMemberships(String str);

    g<g1<InboxConversation>> getInboxConversation(String str);

    g<g1<ChatMessage>> getInboxMessages(String str, String str2);

    g<Member> getMember(String str);

    g<List<Member>> getPartyMembers(String str);

    g<List<Group>> getUserGroups(String str, String str2);

    void likeMessage(ChatMessage chatMessage, String str, boolean z10);

    void rejectGroupInvitation(String str, String str2);

    void removeQuest(String str);

    void saveChatMessages(String str, List<? extends ChatMessage> list);

    void saveGroup(Group group);

    void saveGroupMemberships(String str, List<? extends GroupMembership> list);

    void saveInboxConversations(String str, List<? extends InboxConversation> list);

    void saveInboxMessages(String str, String str2, List<? extends ChatMessage> list, int i10);

    void savePartyMembers(String str, List<? extends Member> list);

    void setQuestActivity(Group group, boolean z10);

    void updateMembership(String str, String str2, boolean z10);

    void updateRSVPNeeded(User user, boolean z10);
}
