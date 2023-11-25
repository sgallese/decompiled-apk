package com.habitrpg.android.habitica.helpers;

import ad.a1;
import ad.i;
import ad.l0;
import android.content.Intent;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import dc.l;
import dc.r;
import qc.q;

/* compiled from: NotificationOpenHandler.kt */
/* loaded from: classes4.dex */
public final class NotificationOpenHandler {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    /* compiled from: NotificationOpenHandler.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(qc.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void handleChatMessage(String str, String str2) {
            if (q.d(str, NavigationDrawerFragment.SIDEBAR_PARTY)) {
                openPartyScreen$default(this, false, 1, null);
            } else if (q.d(str, "guild")) {
                openGuildDetailScreen(str2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void openGiftOneGetOneInfoScreen() {
            MainNavigationController.navigate$default(MainNavigationController.INSTANCE, R.id.subscriptionPurchaseActivity, null, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void openGuildDetailScreen(String str) {
            MainNavigationController.INSTANCE.navigate(R.id.guildFragment, androidx.core.os.e.a(r.a("groupID", str)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void openNoPartyScreen() {
            MainNavigationController.navigate$default(MainNavigationController.INSTANCE, R.id.noPartyFragment, null, 2, null);
        }

        private final void openPartyScreen(boolean z10) {
            MainNavigationController.INSTANCE.navigate(R.id.partyFragment, androidx.core.os.e.a(r.a("tabToOpen", Integer.valueOf(z10 ? 1 : 0))));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static /* synthetic */ void openPartyScreen$default(Companion companion, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            companion.openPartyScreen(z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void openPrivateMessageScreen(String str, String str2) {
            if (str != null && str2 != null) {
                MainNavigationController.INSTANCE.navigate(R.id.inboxMessageListFragment, androidx.core.os.e.a(r.a("userID", str), r.a("username", str2)));
            } else {
                MainNavigationController.navigate$default(MainNavigationController.INSTANCE, R.id.inboxFragment, null, 2, null);
            }
        }

        private final void openQuestDetailSCreen() {
            MainNavigationController.navigate$default(MainNavigationController.INSTANCE, R.id.questDetailFragment, null, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void openSettingsScreen() {
            MainNavigationController.navigate$default(MainNavigationController.INSTANCE, R.id.prefsActivity, null, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void openSubscriptionScreen() {
            MainNavigationController.INSTANCE.navigate(R.id.gemPurchaseActivity, androidx.core.os.e.a(new l("openSubscription", Boolean.TRUE)));
        }

        public final void handleOpenedByNotification(String str, Intent intent) {
            q.i(str, "identifier");
            q.i(intent, "intent");
            i.d(l0.b(), a1.c(), null, new NotificationOpenHandler$Companion$handleOpenedByNotification$1(str, intent, null), 2, null);
        }
    }
}
