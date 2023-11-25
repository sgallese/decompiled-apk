package com.habitrpg.android.habitica.ui.views.tasks.form;

import android.animation.LayoutTransition;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.t0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.models.tasks.RemindersItem;
import com.habitrpg.common.habitica.extensions.IntExtensionsKt;
import com.habitrpg.shared.habitica.models.tasks.TaskType;
import dc.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import qc.q;
import xc.o;

/* compiled from: ReminderContainer.kt */
/* loaded from: classes4.dex */
public final class ReminderContainer extends LinearLayout {
    public static final int $stable = 8;
    private Integer firstDayOfWeek;
    private boolean shouldShowNotifPermission;
    private pc.l<? super Boolean, w> showNotifPermission;
    private TaskType taskType;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReminderContainer(Context context) {
        this(context, null, 0, 6, null);
        q.i(context, "context");
    }

    private final void addReminderViewAt(int i10, RemindersItem remindersItem) {
        LinearLayout.LayoutParams layoutParams;
        Context context = getContext();
        q.h(context, "getContext(...)");
        ReminderItemFormView reminderItemFormView = new ReminderItemFormView(context, null, 0, 6, null);
        reminderItemFormView.setFirstDayOfWeek(this.firstDayOfWeek);
        reminderItemFormView.setTaskType(this.taskType);
        if (remindersItem != null) {
            reminderItemFormView.setItem(remindersItem);
            reminderItemFormView.setAddButton(false);
        }
        reminderItemFormView.setValueChangedListener(new ReminderContainer$addReminderViewAt$2(this, reminderItemFormView));
        if (i10 < 0) {
            i10 = getChildCount() - i10;
        }
        if (getChildCount() <= i10) {
            addView(reminderItemFormView);
            reminderItemFormView.setAddButton(true);
        } else {
            addView(reminderItemFormView, i10);
        }
        ViewGroup.LayoutParams layoutParams2 = reminderItemFormView.getLayoutParams();
        if (layoutParams2 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, IntExtensionsKt.dpToPx(8, getContext()));
        }
        reminderItemFormView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void addReminderViewAt$default(ReminderContainer reminderContainer, int i10, RemindersItem remindersItem, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            remindersItem = null;
        }
        reminderContainer.addReminderViewAt(i10, remindersItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isLastChild(View view) {
        Object v10;
        v10 = o.v(t0.a(this));
        return q.d(v10, view);
    }

    public final Integer getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    public final List<RemindersItem> getReminders() {
        ReminderItemFormView reminderItemFormView;
        ArrayList arrayList = new ArrayList();
        for (View view : t0.a(this)) {
            if (view instanceof ReminderItemFormView) {
                reminderItemFormView = (ReminderItemFormView) view;
            } else {
                reminderItemFormView = null;
            }
            if (reminderItemFormView != null && reminderItemFormView.getItem().getTime() != null) {
                arrayList.add(reminderItemFormView.getItem());
            }
        }
        return arrayList;
    }

    public final boolean getShouldShowNotifPermission() {
        return this.shouldShowNotifPermission;
    }

    public final pc.l<Boolean, w> getShowNotifPermission() {
        return this.showNotifPermission;
    }

    public final TaskType getTaskType() {
        return this.taskType;
    }

    public final void setFirstDayOfWeek(Integer num) {
        xc.g m10;
        m10 = o.m(t0.a(this), ReminderContainer$special$$inlined$filterIsInstance$1.INSTANCE);
        q.g(m10, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        Iterator it = m10.iterator();
        while (it.hasNext()) {
            ((ReminderItemFormView) it.next()).setFirstDayOfWeek(num);
        }
        this.firstDayOfWeek = num;
    }

    public final void setReminders(List<? extends RemindersItem> list) {
        xc.g A;
        q.i(list, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.disableTransitionType(2);
        layoutTransition.disableTransitionType(4);
        layoutTransition.disableTransitionType(3);
        setLayoutTransition(layoutTransition);
        if (getChildCount() > 1) {
            A = o.A(t0.a(this), getChildCount() - 1);
            Iterator it = A.iterator();
            while (it.hasNext()) {
                removeView((View) it.next());
            }
        }
        Iterator<? extends RemindersItem> it2 = list.iterator();
        while (it2.hasNext()) {
            addReminderViewAt(getChildCount() - 1, it2.next());
        }
        setLayoutTransition(new LayoutTransition());
    }

    public final void setShouldShowNotifPermission(boolean z10) {
        this.shouldShowNotifPermission = z10;
    }

    public final void setShowNotifPermission(pc.l<? super Boolean, w> lVar) {
        this.showNotifPermission = lVar;
    }

    public final void setTaskType(TaskType taskType) {
        q.i(taskType, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.taskType = taskType;
        for (View view : t0.a(this)) {
            if (view instanceof ReminderItemFormView) {
                ((ReminderItemFormView) view).setTaskType(this.taskType);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReminderContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.i(context, "context");
    }

    public /* synthetic */ ReminderContainer(Context context, AttributeSet attributeSet, int i10, int i11, qc.h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReminderContainer(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.i(context, "context");
        this.taskType = TaskType.DAILY;
        setOrientation(1);
        addReminderViewAt$default(this, 0, null, 2, null);
    }
}
