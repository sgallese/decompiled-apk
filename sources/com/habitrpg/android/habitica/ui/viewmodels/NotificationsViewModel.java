package com.habitrpg.android.habitica.ui.viewmodels;

import ad.g;
import android.os.Bundle;
import androidx.core.os.e;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.NotificationsManager;
import com.habitrpg.android.habitica.models.inventory.Quest;
import com.habitrpg.android.habitica.models.invitations.Invitations;
import com.habitrpg.android.habitica.models.invitations.PartyInvite;
import com.habitrpg.android.habitica.models.social.UserParty;
import com.habitrpg.android.habitica.models.user.Flags;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import com.habitrpg.common.habitica.models.Notification;
import com.habitrpg.common.habitica.models.notifications.GroupTaskRequiresApprovalData;
import com.habitrpg.common.habitica.models.notifications.GuildInvitationData;
import com.habitrpg.common.habitica.models.notifications.GuildInvite;
import com.habitrpg.common.habitica.models.notifications.ItemReceivedData;
import com.habitrpg.common.habitica.models.notifications.NewChatMessageData;
import com.habitrpg.common.habitica.models.notifications.NewStuffData;
import com.habitrpg.common.habitica.models.notifications.NotificationData;
import com.habitrpg.common.habitica.models.notifications.NotificationGroup;
import com.habitrpg.common.habitica.models.notifications.PartyInvitationData;
import com.habitrpg.common.habitica.models.notifications.QuestInvitationData;
import dc.w;
import dd.h;
import dd.i;
import dd.n0;
import dd.x;
import io.realm.x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import pc.l;
import qc.q;
import qc.r;
import yc.v;

/* compiled from: NotificationsViewModel.kt */
/* loaded from: classes4.dex */
public class NotificationsViewModel extends BaseViewModel {
    public static final int $stable = 8;
    private final List<String> actionableNotificationTypes;
    private final x<List<Notification>> customNotifications;
    private final NotificationsManager notificationsManager;
    private UserParty party;
    private final SocialRepository socialRepository;
    private final List<String> supportedNotificationTypes;

    /* compiled from: NotificationsViewModel.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    static final class AnonymousClass1 extends r implements l<User, w> {
        AnonymousClass1() {
            super(1);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(User user) {
            invoke2(user);
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(User user) {
            if (user == null) {
                return;
            }
            NotificationsViewModel.this.party = user.getParty();
            List convertInvitationsToNotifications = NotificationsViewModel.this.convertInvitationsToNotifications(user);
            Flags flags = user.getFlags();
            boolean z10 = false;
            if (flags != null && flags.getNewStuff()) {
                z10 = true;
            }
            if (z10) {
                Notification notification = new Notification();
                notification.setId("custom-new-stuff-notification");
                notification.setType(Notification.Type.NEW_STUFF.getType());
                notification.setData(new NewStuffData());
                convertInvitationsToNotifications.add(notification);
            }
            NotificationsViewModel.this.customNotifications.setValue(convertInvitationsToNotifications);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsViewModel(UserRepository userRepository, MainUserViewModel mainUserViewModel, NotificationsManager notificationsManager, SocialRepository socialRepository) {
        super(userRepository, mainUserViewModel);
        q.i(userRepository, "userRepository");
        q.i(mainUserViewModel, "userViewModel");
        q.i(notificationsManager, "notificationsManager");
        q.i(socialRepository, "socialRepository");
        this.notificationsManager = notificationsManager;
        this.socialRepository = socialRepository;
        this.supportedNotificationTypes = ec.r.l(Notification.Type.NEW_STUFF.getType(), Notification.Type.NEW_CHAT_MESSAGE.getType(), Notification.Type.NEW_MYSTERY_ITEMS.getType(), Notification.Type.GROUP_TASK_NEEDS_WORK.getType(), Notification.Type.GROUP_TASK_APPROVED.getType(), Notification.Type.UNALLOCATED_STATS_POINTS.getType(), Notification.Type.ITEM_RECEIVED.getType());
        this.actionableNotificationTypes = ec.r.l(Notification.Type.GUILD_INVITATION.getType(), Notification.Type.PARTY_INVITATION.getType(), Notification.Type.QUEST_INVITATION.getType());
        this.customNotifications = n0.a(ec.r.i());
        mainUserViewModel.getUser().k(new NotificationsViewModel$sam$androidx_lifecycle_Observer$0(new AnonymousClass1()));
    }

    private final void acceptGroupInvitation(String str) {
        if (str != null) {
            g.d(w0.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new NotificationsViewModel$acceptGroupInvitation$1$1(this, str, null), 2, null);
        }
    }

    private final void acceptQuestInvitation() {
        String id2;
        UserParty userParty = this.party;
        if (userParty != null && (id2 = userParty.getId()) != null) {
            ExceptionHandlerKt.launchCatching$default(w0.a(this), null, new NotificationsViewModel$acceptQuestInvitation$1$1(this, id2, null), 1, null);
        }
    }

    private final void acceptTaskApproval(Notification notification) {
        NotificationData data = notification.getData();
        if (data instanceof GroupTaskRequiresApprovalData) {
            GroupTaskRequiresApprovalData groupTaskRequiresApprovalData = (GroupTaskRequiresApprovalData) data;
        }
    }

    private final void clickGroupInvitation(Notification notification, MainNavigationController mainNavigationController) {
        GuildInvitationData guildInvitationData;
        GuildInvite invitation;
        String type = notification.getType();
        String str = null;
        if (q.d(type, Notification.Type.GUILD_INVITATION.getType())) {
            Bundle bundle = new Bundle();
            NotificationData data = notification.getData();
            if (data instanceof GuildInvitationData) {
                guildInvitationData = (GuildInvitationData) data;
            } else {
                guildInvitationData = null;
            }
            if (guildInvitationData != null && (invitation = guildInvitationData.getInvitation()) != null) {
                str = invitation.getId();
            }
            bundle.putString("groupID", str);
            bundle.putBoolean("isMember", true);
            mainNavigationController.navigate(R.id.guildFragment, bundle);
        } else if (q.d(type, Notification.Type.PARTY_INVITATION.getType())) {
            MainNavigationController.navigate$default(mainNavigationController, R.id.partyFragment, null, 2, null);
        }
    }

    private final void clickItemReceivedNotification(Notification notification, MainNavigationController mainNavigationController) {
        ItemReceivedData itemReceivedData;
        String str;
        String destination;
        boolean F;
        NotificationData data = notification.getData();
        if (data instanceof ItemReceivedData) {
            itemReceivedData = (ItemReceivedData) data;
        } else {
            itemReceivedData = null;
        }
        boolean z10 = false;
        if (itemReceivedData != null && (destination = itemReceivedData.getDestination()) != null) {
            F = v.F(destination, "/", false, 2, null);
            if (F) {
                z10 = true;
            }
        }
        if (z10) {
            MainNavigationController mainNavigationController2 = MainNavigationController.INSTANCE;
            String destination2 = itemReceivedData.getDestination();
            if (destination2 == null) {
                destination2 = "";
            }
            mainNavigationController2.navigate(destination2);
            return;
        }
        if (itemReceivedData != null) {
            str = itemReceivedData.getDestination();
        } else {
            str = null;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1068284038:
                    if (str.equals("mounts")) {
                        MainNavigationController.navigate$default(mainNavigationController, R.id.stableFragment, null, 2, null);
                        return;
                    }
                    break;
                case -892499141:
                    if (str.equals(NavigationDrawerFragment.SIDEBAR_STABLE)) {
                        MainNavigationController.navigate$default(mainNavigationController, R.id.stableFragment, null, 2, null);
                        return;
                    }
                    break;
                case 3437364:
                    if (str.equals("pets")) {
                        MainNavigationController.navigate$default(mainNavigationController, R.id.stableFragment, null, 2, null);
                        return;
                    }
                    break;
                case 1076356494:
                    if (str.equals(NavigationDrawerFragment.SIDEBAR_EQUIPMENT)) {
                        MainNavigationController.navigate$default(mainNavigationController, R.id.equipmentOverviewFragment, null, 2, null);
                        return;
                    }
                    break;
                case 1637263315:
                    if (str.equals("customization")) {
                        MainNavigationController.navigate$default(mainNavigationController, R.id.avatarCustomizationFragment, null, 2, null);
                        return;
                    }
                    break;
            }
        }
        MainNavigationController.navigate$default(mainNavigationController, R.id.itemsFragment, null, 2, null);
    }

    private final void clickNewChatMessage(Notification notification, MainNavigationController mainNavigationController) {
        NewChatMessageData newChatMessageData;
        NotificationGroup group;
        NotificationGroup group2;
        NotificationData data = notification.getData();
        String str = null;
        if (data instanceof NewChatMessageData) {
            newChatMessageData = (NewChatMessageData) data;
        } else {
            newChatMessageData = null;
        }
        if (isPartyMessage(newChatMessageData)) {
            Bundle bundle = new Bundle();
            if (newChatMessageData != null && (group2 = newChatMessageData.getGroup()) != null) {
                str = group2.getId();
            }
            bundle.putString("groupID", str);
            bundle.putInt("tabToOpen", 1);
            mainNavigationController.navigate(R.id.partyFragment, bundle);
            return;
        }
        Bundle bundle2 = new Bundle();
        if (newChatMessageData != null && (group = newChatMessageData.getGroup()) != null) {
            str = group.getId();
        }
        bundle2.putString("groupID", str);
        bundle2.putBoolean("isMember", true);
        bundle2.putInt("tabToOpen", 1);
        mainNavigationController.navigate(R.id.guildFragment, bundle2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Notification> convertInvitationsToNotifications(User user) {
        Collection i10;
        Collection i11;
        Quest quest;
        x0<com.habitrpg.android.habitica.models.invitations.GuildInvite> guilds;
        x0<PartyInvite> parties;
        ArrayList arrayList = new ArrayList();
        Invitations invitations = user.getInvitations();
        if (invitations != null && (parties = invitations.getParties()) != null) {
            i10 = new ArrayList(ec.r.s(parties, 10));
            for (PartyInvite partyInvite : parties) {
                Notification notification = new Notification();
                notification.setId("custom-party-invitation-" + partyInvite.getId());
                notification.setType(Notification.Type.PARTY_INVITATION.getType());
                PartyInvitationData partyInvitationData = new PartyInvitationData();
                partyInvitationData.setInvitation(new com.habitrpg.common.habitica.models.notifications.PartyInvite());
                com.habitrpg.common.habitica.models.notifications.PartyInvite invitation = partyInvitationData.getInvitation();
                if (invitation != null) {
                    invitation.setId(partyInvite.getId());
                }
                com.habitrpg.common.habitica.models.notifications.PartyInvite invitation2 = partyInvitationData.getInvitation();
                if (invitation2 != null) {
                    invitation2.setName(partyInvite.getName());
                }
                com.habitrpg.common.habitica.models.notifications.PartyInvite invitation3 = partyInvitationData.getInvitation();
                if (invitation3 != null) {
                    invitation3.setInviter(partyInvite.getInviter());
                }
                notification.setData(partyInvitationData);
                i10.add(notification);
            }
        } else {
            i10 = ec.r.i();
        }
        arrayList.addAll(i10);
        Invitations invitations2 = user.getInvitations();
        if (invitations2 != null && (guilds = invitations2.getGuilds()) != null) {
            i11 = new ArrayList(ec.r.s(guilds, 10));
            for (com.habitrpg.android.habitica.models.invitations.GuildInvite guildInvite : guilds) {
                Notification notification2 = new Notification();
                notification2.setId("custom-guild-invitation-" + guildInvite.getId());
                notification2.setType(Notification.Type.GUILD_INVITATION.getType());
                GuildInvitationData guildInvitationData = new GuildInvitationData();
                guildInvitationData.setInvitation(new GuildInvite());
                GuildInvite invitation4 = guildInvitationData.getInvitation();
                if (invitation4 != null) {
                    invitation4.setId(guildInvite.getId());
                }
                GuildInvite invitation5 = guildInvitationData.getInvitation();
                if (invitation5 != null) {
                    invitation5.setName(guildInvite.getName());
                }
                GuildInvite invitation6 = guildInvitationData.getInvitation();
                if (invitation6 != null) {
                    invitation6.setInviter(guildInvite.getInviter());
                }
                GuildInvite invitation7 = guildInvitationData.getInvitation();
                if (invitation7 != null) {
                    invitation7.setPublicGuild(guildInvite.getPublicGuild());
                }
                notification2.setData(guildInvitationData);
                i11.add(notification2);
            }
        } else {
            i11 = ec.r.i();
        }
        arrayList.addAll(i11);
        UserParty party = user.getParty();
        String str = null;
        if (party != null) {
            quest = party.getQuest();
        } else {
            quest = null;
        }
        if (quest != null && quest.getRSVPNeeded()) {
            Notification notification3 = new Notification();
            UserParty party2 = user.getParty();
            if (party2 != null) {
                str = party2.getId();
            }
            notification3.setId("custom-quest-invitation-" + str);
            notification3.setType(Notification.Type.QUEST_INVITATION.getType());
            QuestInvitationData questInvitationData = new QuestInvitationData();
            questInvitationData.setQuestKey(quest.getKey());
            notification3.setData(questInvitationData);
            arrayList.add(notification3);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Notification> filterSupportedTypes(List<Notification> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (ec.r.T(this.supportedNotificationTypes, ((Notification) obj).getType())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final Notification findNotification(String str) {
        Object obj;
        Notification notification = this.notificationsManager.getNotification(str);
        if (notification == null) {
            Iterator<T> it = this.customNotifications.getValue().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (q.d(((Notification) obj).getId(), str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return (Notification) obj;
        }
        return notification;
    }

    private final boolean isCustomNewStuffNotification(Notification notification) {
        return q.d(notification.getId(), "custom-new-stuff-notification");
    }

    private final boolean isCustomNotification(Notification notification) {
        boolean F;
        F = v.F(notification.getId(), "custom-", false, 2, null);
        return F;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshUser() {
        g.d(w0.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new NotificationsViewModel$refreshUser$1(this, null), 2, null);
    }

    private final void rejectQuestInvitation() {
        String id2;
        UserParty userParty = this.party;
        if (userParty != null && (id2 = userParty.getId()) != null) {
            ExceptionHandlerKt.launchCatching$default(w0.a(this), null, new NotificationsViewModel$rejectQuestInvitation$1$1(this, id2, null), 1, null);
        }
    }

    private final void rejectTaskApproval(Notification notification) {
        NotificationData data = notification.getData();
        if (data instanceof GroupTaskRequiresApprovalData) {
            GroupTaskRequiresApprovalData groupTaskRequiresApprovalData = (GroupTaskRequiresApprovalData) data;
        }
    }

    public final void accept(String str) {
        PartyInvitationData partyInvitationData;
        String str2;
        com.habitrpg.common.habitica.models.notifications.PartyInvite invitation;
        GuildInvitationData guildInvitationData;
        String str3;
        GuildInvite invitation2;
        q.i(str, "notificationId");
        Notification findNotification = findNotification(str);
        if (findNotification == null) {
            return;
        }
        String type = findNotification.getType();
        if (q.d(type, Notification.Type.GUILD_INVITATION.getType())) {
            NotificationData data = findNotification.getData();
            if (data instanceof GuildInvitationData) {
                guildInvitationData = (GuildInvitationData) data;
            } else {
                guildInvitationData = null;
            }
            if (guildInvitationData != null && (invitation2 = guildInvitationData.getInvitation()) != null) {
                str3 = invitation2.getId();
            } else {
                str3 = null;
            }
            acceptGroupInvitation(str3);
        } else if (q.d(type, Notification.Type.PARTY_INVITATION.getType())) {
            NotificationData data2 = findNotification.getData();
            if (data2 instanceof PartyInvitationData) {
                partyInvitationData = (PartyInvitationData) data2;
            } else {
                partyInvitationData = null;
            }
            if (partyInvitationData != null && (invitation = partyInvitationData.getInvitation()) != null) {
                str2 = invitation.getId();
            } else {
                str2 = null;
            }
            acceptGroupInvitation(str2);
        } else if (q.d(type, Notification.Type.QUEST_INVITATION.getType())) {
            acceptQuestInvitation();
        } else if (q.d(type, Notification.Type.GROUP_TASK_REQUIRES_APPROVAL.getType())) {
            acceptTaskApproval(findNotification);
        }
        if (isCustomNotification(findNotification)) {
            g.d(w0.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new NotificationsViewModel$accept$1(this, null), 2, null);
        } else {
            dismissNotification(findNotification);
        }
    }

    public final dd.g<Boolean> allNotificationsSeen() {
        final dd.g<List<Notification>> notifications = getNotifications();
        return i.l(new dd.g<Boolean>() { // from class: com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$allNotificationsSeen$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$allNotificationsSeen$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$allNotificationsSeen$$inlined$map$1$2", f = "NotificationsViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$allNotificationsSeen$$inlined$map$1$2$1  reason: invalid class name */
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
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$allNotificationsSeen$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$allNotificationsSeen$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$allNotificationsSeen$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$allNotificationsSeen$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$allNotificationsSeen$$inlined$map$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r7)
                        goto L75
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        dc.n.b(r7)
                        dd.h r7 = r5.$this_unsafeFlow
                        java.util.List r6 = (java.util.List) r6
                        java.lang.Iterable r6 = (java.lang.Iterable) r6
                        boolean r2 = r6 instanceof java.util.Collection
                        if (r2 == 0) goto L49
                        r2 = r6
                        java.util.Collection r2 = (java.util.Collection) r2
                        boolean r2 = r2.isEmpty()
                        if (r2 == 0) goto L49
                    L47:
                        r6 = 1
                        goto L68
                    L49:
                        java.util.Iterator r6 = r6.iterator()
                    L4d:
                        boolean r2 = r6.hasNext()
                        if (r2 == 0) goto L47
                        java.lang.Object r2 = r6.next()
                        com.habitrpg.common.habitica.models.Notification r2 = (com.habitrpg.common.habitica.models.Notification) r2
                        java.lang.Boolean r2 = r2.getSeen()
                        java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r3)
                        boolean r2 = qc.q.d(r2, r4)
                        if (r2 != 0) goto L4d
                        r6 = 0
                    L68:
                        java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r6)
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L75
                        return r1
                    L75:
                        dc.w r6 = dc.w.f13270a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$allNotificationsSeen$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super Boolean> hVar, Continuation continuation) {
                Object d10;
                Object collect = dd.g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        });
    }

    public final void click(String str, MainNavigationController mainNavigationController) {
        q.i(str, "notificationId");
        q.i(mainNavigationController, "navController");
        Notification findNotification = findNotification(str);
        if (findNotification == null) {
            return;
        }
        dismissNotification(findNotification);
        String type = findNotification.getType();
        if (q.d(type, Notification.Type.NEW_STUFF.getType())) {
            MainNavigationController.navigate$default(mainNavigationController, R.id.newsFragment, null, 2, null);
        } else if (q.d(type, Notification.Type.NEW_CHAT_MESSAGE.getType())) {
            clickNewChatMessage(findNotification, mainNavigationController);
        } else if (q.d(type, Notification.Type.GUILD_INVITATION.getType())) {
            clickGroupInvitation(findNotification, mainNavigationController);
        } else if (q.d(type, Notification.Type.PARTY_INVITATION.getType())) {
            clickGroupInvitation(findNotification, mainNavigationController);
        } else if (q.d(type, Notification.Type.QUEST_INVITATION.getType())) {
            MainNavigationController.navigate$default(mainNavigationController, R.id.partyFragment, null, 2, null);
        } else if (q.d(type, Notification.Type.NEW_MYSTERY_ITEMS.getType())) {
            mainNavigationController.navigate(R.id.itemsFragment, e.a(new dc.l("itemType", "special")));
        } else if (q.d(type, Notification.Type.UNALLOCATED_STATS_POINTS.getType())) {
            MainNavigationController.navigate$default(mainNavigationController, R.id.statsFragment, null, 2, null);
        } else if (q.d(type, Notification.Type.GROUP_TASK_APPROVED.getType())) {
            MainNavigationController.navigate$default(mainNavigationController, R.id.tasksFragment, null, 2, null);
        } else if (q.d(type, Notification.Type.GROUP_TASK_NEEDS_WORK.getType())) {
            MainNavigationController.navigate$default(mainNavigationController, R.id.tasksFragment, null, 2, null);
        } else if (q.d(type, Notification.Type.ITEM_RECEIVED.getType())) {
            clickItemReceivedNotification(findNotification, mainNavigationController);
        }
    }

    public final void dismissAllNotifications(List<Notification> list) {
        Object obj;
        q.i(list, "notifications");
        List<Notification> list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list2) {
            if (true ^ isCustomNotification((Notification) obj2)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if ((!ec.r.T(this.actionableNotificationTypes, ((Notification) obj3).getType())) != false) {
                arrayList2.add(obj3);
            }
        }
        ArrayList arrayList3 = new ArrayList(ec.r.s(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((Notification) it.next()).getId());
        }
        Iterator<T> it2 = list2.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                if (isCustomNewStuffNotification((Notification) obj)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Notification notification = (Notification) obj;
        if (notification != null) {
            dismissNotification(notification);
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("notificationIds", arrayList3);
        ExceptionHandlerKt.launchCatching$default(w0.a(this), null, new NotificationsViewModel$dismissAllNotifications$1(this, hashMap, null), 1, null);
    }

    public final void dismissNotification(Notification notification) {
        q.i(notification, "notification");
        if (isCustomNotification(notification)) {
            if (isCustomNewStuffNotification(notification)) {
                updateUser("flags.newStuff", Boolean.FALSE);
                x<List<Notification>> xVar = this.customNotifications;
                List<Notification> value = xVar.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : value) {
                    if (!q.d(((Notification) obj).getId(), notification.getId())) {
                        arrayList.add(obj);
                    }
                }
                xVar.setValue(arrayList);
                return;
            }
            return;
        }
        ExceptionHandlerKt.launchCatching$default(w0.a(this), null, new NotificationsViewModel$dismissNotification$2(this, notification, null), 1, null);
    }

    public final dd.g<Boolean> getHasPartyNotification() {
        final dd.g<List<Notification>> notifications = getNotifications();
        return i.l(new dd.g<Boolean>() { // from class: com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getHasPartyNotification$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getHasPartyNotification$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;
                final /* synthetic */ NotificationsViewModel this$0;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getHasPartyNotification$$inlined$map$1$2", f = "NotificationsViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getHasPartyNotification$$inlined$map$1$2$1  reason: invalid class name */
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

                public AnonymousClass2(h hVar, NotificationsViewModel notificationsViewModel) {
                    this.$this_unsafeFlow = hVar;
                    this.this$0 = notificationsViewModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getHasPartyNotification$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r9
                        com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getHasPartyNotification$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getHasPartyNotification$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getHasPartyNotification$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getHasPartyNotification$$inlined$map$1$2$1
                        r0.<init>(r9)
                    L18:
                        java.lang.Object r9 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r9)
                        goto L72
                    L29:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r9)
                        throw r8
                    L31:
                        dc.n.b(r9)
                        dd.h r9 = r7.$this_unsafeFlow
                        java.util.List r8 = (java.util.List) r8
                        java.lang.Iterable r8 = (java.lang.Iterable) r8
                        java.util.Iterator r8 = r8.iterator()
                    L3e:
                        boolean r2 = r8.hasNext()
                        r4 = 0
                        if (r2 == 0) goto L60
                        java.lang.Object r2 = r8.next()
                        r5 = r2
                        com.habitrpg.common.habitica.models.Notification r5 = (com.habitrpg.common.habitica.models.Notification) r5
                        com.habitrpg.common.habitica.models.notifications.NotificationData r5 = r5.getData()
                        boolean r6 = r5 instanceof com.habitrpg.common.habitica.models.notifications.NewChatMessageData
                        if (r6 == 0) goto L57
                        r4 = r5
                        com.habitrpg.common.habitica.models.notifications.NewChatMessageData r4 = (com.habitrpg.common.habitica.models.notifications.NewChatMessageData) r4
                    L57:
                        com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel r5 = r7.this$0
                        boolean r4 = r5.isPartyMessage(r4)
                        if (r4 == 0) goto L3e
                        r4 = r2
                    L60:
                        if (r4 == 0) goto L64
                        r8 = 1
                        goto L65
                    L64:
                        r8 = 0
                    L65:
                        java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r8)
                        r0.label = r3
                        java.lang.Object r8 = r9.emit(r8, r0)
                        if (r8 != r1) goto L72
                        return r1
                    L72:
                        dc.w r8 = dc.w.f13270a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getHasPartyNotification$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super Boolean> hVar, Continuation continuation) {
                Object d10;
                Object collect = dd.g.this.collect(new AnonymousClass2(hVar, this), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        });
    }

    public final dd.g<Integer> getNotificationCount() {
        final dd.g<List<Notification>> notifications = getNotifications();
        return i.l(new dd.g<Integer>() { // from class: com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getNotificationCount$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getNotificationCount$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getNotificationCount$$inlined$map$1$2", f = "NotificationsViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getNotificationCount$$inlined$map$1$2$1  reason: invalid class name */
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
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getNotificationCount$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getNotificationCount$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getNotificationCount$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getNotificationCount$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getNotificationCount$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L4b
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        java.util.List r5 = (java.util.List) r5
                        java.util.Collection r5 = (java.util.Collection) r5
                        int r5 = r5.size()
                        java.lang.Integer r5 = kotlin.coroutines.jvm.internal.b.d(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4b
                        return r1
                    L4b:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getNotificationCount$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super Integer> hVar, Continuation continuation) {
                Object d10;
                Object collect = dd.g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        });
    }

    public final dd.g<List<Notification>> getNotifications() {
        final dd.g<List<Notification>> notifications = this.notificationsManager.getNotifications();
        final dd.g A = i.A(new dd.g<List<? extends Notification>>() { // from class: com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getNotifications$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getNotifications$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;
                final /* synthetic */ NotificationsViewModel this$0;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getNotifications$$inlined$map$1$2", f = "NotificationsViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getNotifications$$inlined$map$1$2$1  reason: invalid class name */
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

                public AnonymousClass2(h hVar, NotificationsViewModel notificationsViewModel) {
                    this.$this_unsafeFlow = hVar;
                    this.this$0 = notificationsViewModel;
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
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getNotifications$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getNotifications$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getNotifications$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getNotifications$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getNotifications$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        java.util.List r5 = (java.util.List) r5
                        com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel r2 = r4.this$0
                        java.util.List r5 = com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel.access$filterSupportedTypes(r2, r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getNotifications$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super List<? extends Notification>> hVar, Continuation continuation) {
                Object d10;
                Object collect = dd.g.this.collect(new AnonymousClass2(hVar, this), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        }, this.customNotifications, new NotificationsViewModel$getNotifications$1(null));
        return new dd.g<List<? extends Notification>>() { // from class: com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getNotifications$$inlined$map$2

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getNotifications$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getNotifications$$inlined$map$2$2", f = "NotificationsViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getNotifications$$inlined$map$2$2$1  reason: invalid class name */
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
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getNotifications$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getNotifications$$inlined$map$2$2$1 r0 = (com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getNotifications$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getNotifications$$inlined$map$2$2$1 r0 = new com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getNotifications$$inlined$map$2$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L4c
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        java.util.List r5 = (java.util.List) r5
                        java.lang.Iterable r5 = (java.lang.Iterable) r5
                        com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getNotifications$lambda$2$$inlined$sortedBy$1 r2 = new com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getNotifications$lambda$2$$inlined$sortedBy$1
                        r2.<init>()
                        java.util.List r5 = ec.r.x0(r5, r2)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4c
                        return r1
                    L4c:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getNotifications$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super List<? extends Notification>> hVar, Continuation continuation) {
                Object d10;
                Object collect = dd.g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }

    public final NotificationsManager getNotificationsManager() {
        return this.notificationsManager;
    }

    public final SocialRepository getSocialRepository() {
        return this.socialRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000a, code lost:
    
        if (r0.isValid() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isPartyMessage(com.habitrpg.common.habitica.models.notifications.NewChatMessageData r4) {
        /*
            r3 = this;
            com.habitrpg.android.habitica.models.social.UserParty r0 = r3.party
            r1 = 0
            if (r0 == 0) goto Ld
            boolean r0 = r0.isValid()
            r2 = 1
            if (r0 != r2) goto Ld
            goto Le
        Ld:
            r2 = 0
        Le:
            if (r2 == 0) goto L3b
            r0 = 0
            if (r4 == 0) goto L1e
            com.habitrpg.common.habitica.models.notifications.NotificationGroup r2 = r4.getGroup()
            if (r2 == 0) goto L1e
            java.lang.String r2 = r2.getId()
            goto L1f
        L1e:
            r2 = r0
        L1f:
            if (r2 != 0) goto L22
            goto L3b
        L22:
            com.habitrpg.android.habitica.models.social.UserParty r1 = r3.party
            if (r1 == 0) goto L2b
            java.lang.String r1 = r1.getId()
            goto L2c
        L2b:
            r1 = r0
        L2c:
            com.habitrpg.common.habitica.models.notifications.NotificationGroup r4 = r4.getGroup()
            if (r4 == 0) goto L36
            java.lang.String r0 = r4.getId()
        L36:
            boolean r4 = qc.q.d(r1, r0)
            return r4
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel.isPartyMessage(com.habitrpg.common.habitica.models.notifications.NewChatMessageData):boolean");
    }

    public final void markNotificationsAsSeen(List<Notification> list) {
        q.i(list, "notifications");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (true ^ isCustomNotification((Notification) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (q.d(((Notification) obj2).getSeen(), Boolean.FALSE)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(ec.r.s(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((Notification) it.next()).getId());
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("notificationIds", arrayList3);
        ExceptionHandlerKt.launchCatching$default(w0.a(this), null, new NotificationsViewModel$markNotificationsAsSeen$1(this, hashMap, null), 1, null);
    }

    public final Object refreshNotifications(Continuation<? super User> continuation) {
        return UserRepository.DefaultImpls.retrieveUser$default(getUserRepository(), false, true, false, continuation, 4, null);
    }

    public final void reject(String str) {
        PartyInvitationData partyInvitationData;
        com.habitrpg.common.habitica.models.notifications.PartyInvite invitation;
        GuildInvitationData guildInvitationData;
        GuildInvite invitation2;
        q.i(str, "notificationId");
        Notification findNotification = findNotification(str);
        if (findNotification == null) {
            return;
        }
        String type = findNotification.getType();
        String str2 = null;
        if (q.d(type, Notification.Type.GUILD_INVITATION.getType())) {
            NotificationData data = findNotification.getData();
            if (data instanceof GuildInvitationData) {
                guildInvitationData = (GuildInvitationData) data;
            } else {
                guildInvitationData = null;
            }
            if (guildInvitationData != null && (invitation2 = guildInvitationData.getInvitation()) != null) {
                str2 = invitation2.getId();
            }
            rejectGroupInvite(str2);
        } else if (q.d(type, Notification.Type.PARTY_INVITATION.getType())) {
            NotificationData data2 = findNotification.getData();
            if (data2 instanceof PartyInvitationData) {
                partyInvitationData = (PartyInvitationData) data2;
            } else {
                partyInvitationData = null;
            }
            if (partyInvitationData != null && (invitation = partyInvitationData.getInvitation()) != null) {
                str2 = invitation.getId();
            }
            rejectGroupInvite(str2);
        } else if (q.d(type, Notification.Type.QUEST_INVITATION.getType())) {
            rejectQuestInvitation();
        } else if (q.d(type, Notification.Type.GROUP_TASK_REQUIRES_APPROVAL.getType())) {
            rejectTaskApproval(findNotification);
        }
        if (!isCustomNotification(findNotification)) {
            dismissNotification(findNotification);
        }
    }

    public final void rejectGroupInvite(String str) {
        if (str != null) {
            ExceptionHandlerKt.launchCatching$default(w0.a(this), null, new NotificationsViewModel$rejectGroupInvite$1$1(this, str, null), 1, null);
        }
    }
}
