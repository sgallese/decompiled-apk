package com.habitrpg.android.habitica.ui.views.tasks.form;

import dc.w;
import java.util.Date;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReminderContainer.kt */
/* loaded from: classes4.dex */
public final class ReminderContainer$addReminderViewAt$2 extends r implements pc.l<Date, w> {
    final /* synthetic */ ReminderItemFormView $view;
    final /* synthetic */ ReminderContainer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReminderContainer$addReminderViewAt$2(ReminderContainer reminderContainer, ReminderItemFormView reminderItemFormView) {
        super(1);
        this.this$0 = reminderContainer;
        this.$view = reminderItemFormView;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Date date) {
        invoke2(date);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Date date) {
        boolean isLastChild;
        pc.l<Boolean, w> showNotifPermission;
        q.i(date, "it");
        isLastChild = this.this$0.isLastChild(this.$view);
        if (isLastChild) {
            ReminderContainer.addReminderViewAt$default(this.this$0, -1, null, 2, null);
            this.$view.setAnimDuration(300L);
            this.$view.setAddButton(false);
            if (!this.this$0.getShouldShowNotifPermission() || (showNotifPermission = this.this$0.getShowNotifPermission()) == null) {
                return;
            }
            showNotifPermission.invoke(Boolean.TRUE);
        }
    }
}
