package com.habitrpg.android.habitica.helpers.notifications;

import android.content.Context;
import qc.q;
import yc.v;

/* compiled from: HabiticaLocalNotificationFactory.kt */
/* loaded from: classes4.dex */
public final class HabiticaLocalNotificationFactory {
    public static final int $stable = 0;

    public final HabiticaLocalNotification build(String str, Context context) {
        boolean r10;
        boolean r11;
        boolean r12;
        boolean r13;
        boolean r14;
        boolean r15;
        boolean r16;
        boolean r17;
        boolean r18;
        boolean r19;
        boolean r20;
        boolean r21;
        r10 = v.r(PushNotificationManager.PARTY_INVITE_PUSH_NOTIFICATION_KEY, str, true);
        if (!r10) {
            r11 = v.r(PushNotificationManager.RECEIVED_PRIVATE_MESSAGE_PUSH_NOTIFICATION_KEY, str, true);
            if (!r11) {
                r12 = v.r(PushNotificationManager.RECEIVED_GEMS_PUSH_NOTIFICATION_KEY, str, true);
                if (!r12) {
                    r13 = v.r(PushNotificationManager.RECEIVED_SUBSCRIPTION_GIFT_PUSH_NOTIFICATION_KEY, str, true);
                    if (!r13) {
                        r14 = v.r(PushNotificationManager.GUILD_INVITE_PUSH_NOTIFICATION_KEY, str, true);
                        if (!r14) {
                            r15 = v.r(PushNotificationManager.QUEST_INVITE_PUSH_NOTIFICATION_KEY, str, true);
                            if (!r15) {
                                r16 = v.r(PushNotificationManager.QUEST_BEGUN_PUSH_NOTIFICATION_KEY, str, true);
                                if (!r16) {
                                    r17 = v.r(PushNotificationManager.WON_CHALLENGE_PUSH_NOTIFICATION_KEY, str, true);
                                    if (!r17) {
                                        r18 = v.r(PushNotificationManager.CHANGE_USERNAME_PUSH_NOTIFICATION_KEY, str, true);
                                        if (!r18) {
                                            r19 = v.r(PushNotificationManager.GIFT_ONE_GET_ONE_PUSH_NOTIFICATION_KEY, str, true);
                                            if (!r19) {
                                                r20 = v.r(PushNotificationManager.CHAT_MENTION_NOTIFICATION_KEY, str, true);
                                                if (!r20) {
                                                    r21 = v.r(PushNotificationManager.GROUP_ACTIVITY_NOTIFICATION_KEY, str, true);
                                                    if (r21) {
                                                        q.f(context);
                                                        return new GroupActivityNotification(context, str);
                                                    }
                                                    q.f(context);
                                                    return new GenericLocalNotification(context, str);
                                                }
                                                q.f(context);
                                                return new ChatMentionNotification(context, str);
                                            }
                                            q.f(context);
                                            return new GiftOneGetOneLocalNotification(context, str);
                                        }
                                        q.f(context);
                                        return new ChangeUsernameLocalNotification(context, str);
                                    }
                                    q.f(context);
                                    return new WonChallengeLocalNotification(context, str);
                                }
                                q.f(context);
                                return new QuestBegunLocalNotification(context, str);
                            }
                            q.f(context);
                            return new QuestInviteLocalNotification(context, str);
                        }
                        q.f(context);
                        return new GuildInviteLocalNotification(context, str);
                    }
                    q.f(context);
                    return new ReceivedSubscriptionGiftLocalNotification(context, str);
                }
                q.f(context);
                return new ReceivedGemsGiftLocalNotification(context, str);
            }
            q.f(context);
            return new ReceivedPrivateMessageLocalNotification(context, str);
        }
        q.f(context);
        return new PartyInviteLocalNotification(context, str);
    }
}
