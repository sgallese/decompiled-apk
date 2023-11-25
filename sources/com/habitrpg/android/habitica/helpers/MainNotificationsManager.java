package com.habitrpg.android.habitica.helpers;

import ad.l0;
import android.content.Context;
import androidx.core.app.r;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.common.habitica.models.Notification;
import dc.w;
import dd.i;
import dd.n0;
import dd.x;
import ec.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import qc.q;

/* compiled from: NotificationsManager.kt */
/* loaded from: classes4.dex */
public final class MainNotificationsManager implements NotificationsManager {
    public static final int $stable = 8;
    private WeakReference<ApiClient> apiClient;
    private final dd.g<Notification> displayNotificationEvents;
    private final cd.d<Notification> displayedNotificationEvents;
    private Date lastNotificationHandling;
    private final x<List<Notification>> notificationsFlow = n0.a(null);
    private final Map<String, Boolean> seenNotifications;

    public MainNotificationsManager() {
        cd.d<Notification> b10 = cd.g.b(0, null, null, 7, null);
        this.displayedNotificationEvents = b10;
        this.displayNotificationEvents = i.u(i.M(b10));
        this.seenNotifications = new HashMap();
    }

    private final boolean handlePopupNotifications(List<Notification> list) {
        long j10;
        int s10;
        boolean z10;
        Date date = new Date();
        long time = date.getTime();
        Date date2 = this.lastNotificationHandling;
        if (date2 != null) {
            j10 = date2.getTime();
        } else {
            j10 = 0;
        }
        if (time - j10 < 300) {
            return true;
        }
        this.lastNotificationHandling = date;
        ArrayList<Notification> arrayList = new ArrayList();
        for (Object obj : list) {
            if ((!this.seenNotifications.containsKey(((Notification) obj).getId())) != false) {
                arrayList.add(obj);
            }
        }
        s10 = u.s(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(s10);
        for (Notification notification : arrayList) {
            String type = notification.getType();
            if (q.d(type, Notification.Type.ACHIEVEMENT_PARTY_UP.getType()) || q.d(type, Notification.Type.ACHIEVEMENT_PARTY_ON.getType()) || q.d(type, Notification.Type.ACHIEVEMENT_BEAST_MASTER.getType()) || q.d(type, Notification.Type.ACHIEVEMENT_MOUNT_MASTER.getType()) || q.d(type, Notification.Type.ACHIEVEMENT_TRIAD_BINGO.getType()) || q.d(type, Notification.Type.ACHIEVEMENT_GUILD_JOINED.getType()) || q.d(type, Notification.Type.ACHIEVEMENT_CHALLENGE_JOINED.getType()) || q.d(type, Notification.Type.ACHIEVEMENT_INVITED_FRIEND.getType()) || q.d(type, Notification.Type.ACHIEVEMENT_ALL_YOUR_BASE.getType()) || q.d(type, Notification.Type.ACHIEVEMENT_BACK_TO_BASICS.getType()) || q.d(type, Notification.Type.ACHIEVEMENT_JUST_ADD_WATER.getType()) || q.d(type, Notification.Type.ACHIEVEMENT_LOST_MASTERCLASSER.getType()) || q.d(type, Notification.Type.ACHIEVEMENT_MIND_OVER_MATTER.getType()) || q.d(type, Notification.Type.ACHIEVEMENT_DUST_DEVIL.getType()) || q.d(type, Notification.Type.ACHIEVEMENT_ARID_AUTHORITY.getType()) || q.d(type, Notification.Type.ACHIEVEMENT_MONSTER_MAGUS.getType()) || q.d(type, Notification.Type.ACHIEVEMENT_UNDEAD_UNDERTAKER.getType()) || q.d(type, Notification.Type.ACHIEVEMENT_PRIMED_FOR_PAINTING.getType()) || q.d(type, Notification.Type.ACHIEVEMENT_PEARLY_PRO.getType()) || q.d(type, Notification.Type.ACHIEVEMENT_TICKLED_PINK.getType()) || q.d(type, Notification.Type.ACHIEVEMENT_ROSY_OUTLOOK.getType()) || q.d(type, Notification.Type.ACHIEVEMENT_BUG_BONANZA.getType()) || q.d(type, Notification.Type.ACHIEVEMENT_BARE_NECESSITIES.getType()) || q.d(type, Notification.Type.ACHIEVEMENT_FRESHWATER_FRIENDS.getType()) || q.d(type, Notification.Type.ACHIEVEMENT_GOOD_AS_GOLD.getType()) || q.d(type, Notification.Type.ACHIEVEMENT_ALL_THAT_GLITTERS.getType()) || q.d(type, Notification.Type.ACHIEVEMENT_BONE_COLLECTOR.getType()) || q.d(type, Notification.Type.ACHIEVEMENT_SKELETON_CREW.getType()) || q.d(type, Notification.Type.ACHIEVEMENT_SEEING_RED.getType()) || q.d(type, Notification.Type.ACHIEVEMENT_RED_LETTER_DAY.getType()) || q.d(type, Notification.Type.ACHIEVEMENT_GENERIC.getType()) || q.d(type, Notification.Type.ACHIEVEMENT_ONBOARDING_COMPLETE.getType()) || q.d(type, Notification.Type.LOGIN_INCENTIVE.getType()) || q.d(type, Notification.Type.NEW_MYSTERY_ITEMS.getType()) || q.d(type, Notification.Type.FIRST_DROP.getType())) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                readNotification(notification);
            }
            arrayList2.add(w.f13270a);
        }
        return true;
    }

    private final void readNotification(Notification notification) {
        ExceptionHandlerKt.launchCatching$default(l0.b(), null, new MainNotificationsManager$readNotification$1(this, notification, null), 1, null);
    }

    @Override // com.habitrpg.android.habitica.helpers.NotificationsManager
    public void dismissTaskNotification(Context context, Task task) {
        int i10;
        q.i(context, "context");
        q.i(task, "task");
        r d10 = r.d(context);
        String id2 = task.getId();
        if (id2 != null) {
            i10 = id2.hashCode();
        } else {
            i10 = 0;
        }
        d10.b(i10);
    }

    @Override // com.habitrpg.android.habitica.helpers.NotificationsManager
    public WeakReference<ApiClient> getApiClient() {
        return this.apiClient;
    }

    @Override // com.habitrpg.android.habitica.helpers.NotificationsManager
    public dd.g<Notification> getDisplayNotificationEvents() {
        return this.displayNotificationEvents;
    }

    @Override // com.habitrpg.android.habitica.helpers.NotificationsManager
    public Notification getNotification(String str) {
        q.i(str, "id");
        List<Notification> value = this.notificationsFlow.getValue();
        Object obj = null;
        if (value == null) {
            return null;
        }
        Iterator<T> it = value.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (q.d(((Notification) next).getId(), str)) {
                obj = next;
                break;
            }
        }
        return (Notification) obj;
    }

    @Override // com.habitrpg.android.habitica.helpers.NotificationsManager
    public dd.g<List<Notification>> getNotifications() {
        return i.u(this.notificationsFlow);
    }

    @Override // com.habitrpg.android.habitica.helpers.NotificationsManager
    public void setApiClient(WeakReference<ApiClient> weakReference) {
        this.apiClient = weakReference;
    }

    @Override // com.habitrpg.android.habitica.helpers.NotificationsManager
    public void setNotifications(List<Notification> list) {
        q.i(list, "current");
        this.notificationsFlow.setValue(list);
        handlePopupNotifications(list);
    }
}
