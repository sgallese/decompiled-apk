package com.habitrpg.android.habitica.helpers.notifications;

/* loaded from: classes4.dex */
public final class HabiticaFirebaseMessagingService_MembersInjector implements qa.a<HabiticaFirebaseMessagingService> {
    private final cc.a<PushNotificationManager> pushNotificationManagerProvider;

    public HabiticaFirebaseMessagingService_MembersInjector(cc.a<PushNotificationManager> aVar) {
        this.pushNotificationManagerProvider = aVar;
    }

    public static qa.a<HabiticaFirebaseMessagingService> create(cc.a<PushNotificationManager> aVar) {
        return new HabiticaFirebaseMessagingService_MembersInjector(aVar);
    }

    public static void injectPushNotificationManager(HabiticaFirebaseMessagingService habiticaFirebaseMessagingService, PushNotificationManager pushNotificationManager) {
        habiticaFirebaseMessagingService.pushNotificationManager = pushNotificationManager;
    }

    public void injectMembers(HabiticaFirebaseMessagingService habiticaFirebaseMessagingService) {
        injectPushNotificationManager(habiticaFirebaseMessagingService, this.pushNotificationManagerProvider.get());
    }
}
