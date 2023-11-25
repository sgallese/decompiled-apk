package com.habitrpg.android.habitica.ui.activities;

import android.view.View;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.models.inventory.QuestContent;
import com.habitrpg.common.habitica.models.notifications.QuestInvitationData;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NotificationsActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.NotificationsActivity$createQuestInvitationNotification$1", f = "NotificationsActivity.kt", l = {401}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NotificationsActivity$createQuestInvitationNotification$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    final /* synthetic */ QuestInvitationData $data;
    final /* synthetic */ View $view;
    int label;
    final /* synthetic */ NotificationsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsActivity$createQuestInvitationNotification$1(NotificationsActivity notificationsActivity, QuestInvitationData questInvitationData, View view, Continuation<? super NotificationsActivity$createQuestInvitationNotification$1> continuation) {
        super(2, continuation);
        this.this$0 = notificationsActivity;
        this.$data = questInvitationData;
        this.$view = view;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new NotificationsActivity$createQuestInvitationNotification$1(this.this$0, this.$data, this.$view, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((NotificationsActivity$createQuestInvitationNotification$1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        String str;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                dc.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            dc.n.b(obj);
            InventoryRepository inventoryRepository = this.this$0.getInventoryRepository();
            QuestInvitationData questInvitationData = this.$data;
            if (questInvitationData == null || (str = questInvitationData.getQuestKey()) == null) {
                str = "";
            }
            dd.g<QuestContent> questContent = inventoryRepository.getQuestContent(str);
            this.label = 1;
            obj = dd.i.x(questContent, this);
            if (obj == d10) {
                return d10;
            }
        }
        QuestContent questContent2 = (QuestContent) obj;
        if (questContent2 != null) {
            this.this$0.updateQuestInvitationView(this.$view, questContent2);
        }
        return dc.w.f13270a;
    }
}
