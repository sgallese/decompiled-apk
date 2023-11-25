package com.habitrpg.android.habitica.helpers;

import ad.k0;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.common.habitica.models.Notification;
import dc.n;
import dc.w;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NotificationsManager.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.helpers.MainNotificationsManager$readNotification$1", f = "NotificationsManager.kt", l = {119, 121}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class MainNotificationsManager$readNotification$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ Notification $notification;
    int label;
    final /* synthetic */ MainNotificationsManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainNotificationsManager$readNotification$1(MainNotificationsManager mainNotificationsManager, Notification notification, Continuation<? super MainNotificationsManager$readNotification$1> continuation) {
        super(2, continuation);
        this.this$0 = mainNotificationsManager;
        this.$notification = notification;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new MainNotificationsManager$readNotification$1(this.this$0, this.$notification, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((MainNotificationsManager$readNotification$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        cd.d dVar;
        Map map;
        ApiClient apiClient;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    n.b(obj);
                    List list = (List) obj;
                    return w.f13270a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
        } else {
            n.b(obj);
            dVar = this.this$0.displayedNotificationEvents;
            Notification notification = this.$notification;
            this.label = 1;
            if (dVar.r(notification, this) == d10) {
                return d10;
            }
        }
        map = this.this$0.seenNotifications;
        map.put(this.$notification.getId(), kotlin.coroutines.jvm.internal.b.a(true));
        WeakReference<ApiClient> apiClient2 = this.this$0.getApiClient();
        if (apiClient2 != null && (apiClient = apiClient2.get()) != null) {
            String id2 = this.$notification.getId();
            this.label = 2;
            obj = apiClient.readNotification(id2, this);
            if (obj == d10) {
                return d10;
            }
            List list2 = (List) obj;
        }
        return w.f13270a;
    }
}
