package com.habitrpg.android.habitica.ui.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.m;
import androidx.lifecycle.w0;
import com.habitrpg.android.habitica.data.ChallengeRepository;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.NotificationsManager;
import com.habitrpg.android.habitica.models.inventory.Quest;
import com.habitrpg.android.habitica.models.inventory.QuestMember;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.social.Group;
import com.habitrpg.android.habitica.models.social.UserParty;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import dd.g;
import dd.i;
import io.realm.x0;
import java.util.Iterator;
import java.util.List;
import qc.q;

/* compiled from: PartyViewModel.kt */
/* loaded from: classes4.dex */
public final class PartyViewModel extends GroupViewModel {
    public static final int $stable = 8;
    private final LiveData<List<Member>> members;
    private final g<List<Member>> membersFlow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartyViewModel(UserRepository userRepository, MainUserViewModel mainUserViewModel, ChallengeRepository challengeRepository, SocialRepository socialRepository, NotificationsManager notificationsManager) {
        super(userRepository, mainUserViewModel, challengeRepository, socialRepository, notificationsManager);
        q.i(userRepository, "userRepository");
        q.i(mainUserViewModel, "userViewModel");
        q.i(challengeRepository, "challengeRepository");
        q.i(socialRepository, "socialRepository");
        q.i(notificationsManager, "notificationsManager");
        g<List<Member>> R = i.R(i.u(getGroupIDFlow()), new PartyViewModel$special$$inlined$flatMapLatest$1(null, socialRepository));
        this.membersFlow = R;
        this.members = m.c(R, null, 0L, 3, null);
        setGroupViewType(GroupViewType.PARTY);
    }

    public final void acceptQuest() {
        String groupID = getGroupID();
        if (groupID != null) {
            ExceptionHandlerKt.launchCatching$default(w0.a(this), null, new PartyViewModel$acceptQuest$1$1(this, groupID, null), 1, null);
        }
    }

    public final LiveData<List<Member>> getMembersData() {
        return this.members;
    }

    public final boolean isQuestActive$Habitica_2311256681_prodRelease() {
        Quest quest;
        Group f10 = getGroupData().f();
        if (f10 == null || (quest = f10.getQuest()) == null || !quest.getActive()) {
            return false;
        }
        return true;
    }

    public final boolean isUserOnQuest$Habitica_2311256681_prodRelease() {
        boolean z10;
        Quest quest;
        x0<QuestMember> members;
        String str;
        Group f10 = getGroupData().f();
        if (f10 != null && (quest = f10.getQuest()) != null && (members = quest.getMembers()) != null && !members.isEmpty()) {
            Iterator<QuestMember> it = members.iterator();
            while (it.hasNext()) {
                String key = it.next().getKey();
                User f11 = getUser().f();
                if (f11 != null) {
                    str = f11.getId();
                } else {
                    str = null;
                }
                if (q.d(key, str)) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        return !z10;
    }

    public final void loadPartyID() {
        ad.g.d(w0.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new PartyViewModel$loadPartyID$1(this, null), 2, null);
    }

    public final void rejectQuest() {
        String groupID = getGroupID();
        if (groupID != null) {
            ExceptionHandlerKt.launchCatching$default(w0.a(this), null, new PartyViewModel$rejectQuest$1$1(this, groupID, null), 1, null);
        }
    }

    public final boolean showParticipantButtons() {
        UserParty userParty;
        boolean z10;
        Quest quest;
        User f10 = getUser().f();
        Quest quest2 = null;
        if (f10 != null) {
            userParty = f10.getParty();
        } else {
            userParty = null;
        }
        if (userParty == null) {
            return false;
        }
        UserParty party = f10.getParty();
        if (party != null) {
            quest2 = party.getQuest();
        }
        if (quest2 == null || isQuestActive$Habitica_2311256681_prodRelease()) {
            return false;
        }
        UserParty party2 = f10.getParty();
        if (party2 != null && (quest = party2.getQuest()) != null && quest.getRSVPNeeded()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    private static /* synthetic */ void getMembersFlow$annotations() {
    }
}
