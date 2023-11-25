package com.habitrpg.android.habitica.ui.viewmodels;

import com.habitrpg.common.habitica.models.Notification;
import dc.n;
import dc.w;
import ec.b0;
import ic.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NotificationsViewModel.kt */
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel$getNotifications$1", f = "NotificationsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NotificationsViewModel$getNotifications$1 extends l implements q<List<? extends Notification>, List<? extends Notification>, Continuation<? super List<? extends Notification>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public NotificationsViewModel$getNotifications$1(Continuation<? super NotificationsViewModel$getNotifications$1> continuation) {
        super(3, continuation);
    }

    @Override // pc.q
    public /* bridge */ /* synthetic */ Object invoke(List<? extends Notification> list, List<? extends Notification> list2, Continuation<? super List<? extends Notification>> continuation) {
        return invoke2((List<Notification>) list, (List<Notification>) list2, (Continuation<? super List<Notification>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        List r02;
        List r03;
        d.d();
        if (this.label == 0) {
            n.b(obj);
            List list = (List) this.L$0;
            List list2 = (List) this.L$1;
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (qc.q.d(((Notification) obj2).getType(), Notification.Type.NEW_STUFF.getType())) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            if (obj2 == null) {
                r02 = b0.r0(list, list2);
                return r02;
            }
            List list3 = list;
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list2) {
                if ((!qc.q.d(((Notification) obj3).getType(), Notification.Type.NEW_STUFF.getType())) != false) {
                    arrayList.add(obj3);
                }
            }
            r03 = b0.r0(list3, arrayList);
            return r03;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(List<Notification> list, List<Notification> list2, Continuation<? super List<Notification>> continuation) {
        NotificationsViewModel$getNotifications$1 notificationsViewModel$getNotifications$1 = new NotificationsViewModel$getNotifications$1(continuation);
        notificationsViewModel$getNotifications$1.L$0 = list;
        notificationsViewModel$getNotifications$1.L$1 = list2;
        return notificationsViewModel$getNotifications$1.invokeSuspend(w.f13270a);
    }
}
