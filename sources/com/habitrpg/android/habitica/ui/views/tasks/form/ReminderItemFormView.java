package com.habitrpg.android.habitica.ui.views.tasks.form;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.TaskFormReminderItemBinding;
import com.habitrpg.android.habitica.models.tasks.RemindersItem;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.extensions.IntExtensionsKt;
import com.habitrpg.shared.habitica.models.tasks.TaskType;
import dc.w;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.util.DesugarDate;
import java.util.Date;
import java.util.Locale;
import qc.q;

/* compiled from: ReminderItemFormView.kt */
/* loaded from: classes4.dex */
public final class ReminderItemFormView extends LinearLayout implements TimePickerDialog.OnTimeSetListener, DatePickerDialog.OnDateSetListener {
    public static final int $stable = 8;
    private long animDuration;
    private final TaskFormReminderItemBinding binding;
    private Integer firstDayOfWeek;
    private boolean isAddButton;
    private RemindersItem item;
    private TaskType taskType;
    private int tintColor;
    private pc.l<? super Date, w> valueChangedListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReminderItemFormView(Context context) {
        this(context, null, 0, 6, null);
        q.i(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ReminderItemFormView reminderItemFormView, View view) {
        ViewGroup viewGroup;
        q.i(reminderItemFormView, "this$0");
        if (!reminderItemFormView.isAddButton) {
            ViewParent parent = reminderItemFormView.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                viewGroup.removeView(reminderItemFormView);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ReminderItemFormView reminderItemFormView, Context context, View view) {
        int i10;
        int i11;
        q.i(reminderItemFormView, "this$0");
        q.i(context, "$context");
        if (reminderItemFormView.taskType == TaskType.DAILY) {
            ZonedDateTime zonedDateTime = reminderItemFormView.item.getZonedDateTime();
            if (zonedDateTime == null) {
                zonedDateTime = ZonedDateTime.now();
            }
            int hour = zonedDateTime.getHour();
            ZonedDateTime zonedDateTime2 = reminderItemFormView.item.getZonedDateTime();
            if (zonedDateTime2 == null) {
                zonedDateTime2 = ZonedDateTime.now();
            }
            new TimePickerDialog(context, reminderItemFormView, hour, zonedDateTime2.getMinute(), DateFormat.is24HourFormat(context)).show();
            return;
        }
        ZonedDateTime zonedDateTime3 = reminderItemFormView.item.getZonedDateTime();
        if (zonedDateTime3 == null) {
            zonedDateTime3 = ZonedDateTime.now();
        }
        DatePickerDialog datePickerDialog = new DatePickerDialog(context, reminderItemFormView, zonedDateTime3.getYear(), zonedDateTime3.getMonthValue() - 1, zonedDateTime3.getDayOfMonth());
        Integer num = reminderItemFormView.firstDayOfWeek;
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = -1;
        }
        if (i10 >= 0) {
            DatePicker datePicker = datePickerDialog.getDatePicker();
            Integer num2 = reminderItemFormView.firstDayOfWeek;
            if (num2 != null) {
                i11 = num2.intValue();
            } else {
                i11 = 0;
            }
            datePicker.setFirstDayOfWeek(i11);
        }
        datePickerDialog.show();
    }

    private final CharSequence getFormattedTime() {
        if (this.item.getTime() != null) {
            return getFormatter().format(DesugarDate.from(this.item.getLocalZonedDateTimeInstant()));
        }
        return "";
    }

    private final java.text.DateFormat getFormatter() {
        if (this.taskType == TaskType.DAILY) {
            java.text.DateFormat timeInstance = java.text.DateFormat.getTimeInstance(3, Locale.getDefault());
            q.f(timeInstance);
            return timeInstance;
        }
        java.text.DateFormat dateTimeInstance = java.text.DateFormat.getDateTimeInstance(3, 3, Locale.getDefault());
        q.f(dateTimeInstance);
        return dateTimeInstance;
    }

    public final long getAnimDuration() {
        return this.animDuration;
    }

    public final Integer getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    public final RemindersItem getItem() {
        return this.item;
    }

    public final TaskType getTaskType() {
        return this.taskType;
    }

    public final int getTintColor() {
        return this.tintColor;
    }

    public final pc.l<Date, w> getValueChangedListener() {
        return this.valueChangedListener;
    }

    public final boolean isAddButton() {
        return this.isAddButton;
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        pc.l<? super Date, w> lVar = this.valueChangedListener;
        if (lVar != null) {
            this.item.setTime(ZonedDateTime.now().withYear(i10).withMonth(i11 + 1).withDayOfMonth(i12).format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
            this.binding.textView.setText(getFormattedTime());
            Date from = DesugarDate.from(this.item.getLocalZonedDateTimeInstant());
            q.h(from, "from(...)");
            lVar.invoke(from);
            new TimePickerDialog(getContext(), this, ZonedDateTime.now().getHour(), ZonedDateTime.now().getMinute(), DateFormat.is24HourFormat(getContext())).show();
        }
    }

    @Override // android.app.TimePickerDialog.OnTimeSetListener
    public void onTimeSet(TimePicker timePicker, int i10, int i11) {
        pc.l<? super Date, w> lVar = this.valueChangedListener;
        if (lVar != null) {
            ZonedDateTime zonedDateTime = this.item.getZonedDateTime();
            if (zonedDateTime == null) {
                zonedDateTime = ZonedDateTime.now();
            }
            this.item.setTime(zonedDateTime.withHour(i10).withMinute(i11).format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
            this.binding.textView.setText(getFormattedTime());
            Date from = DesugarDate.from(this.item.getLocalZonedDateTimeInstant());
            q.h(from, "from(...)");
            lVar.invoke(from);
        }
    }

    public final void setAddButton(boolean z10) {
        CharSequence formattedTime;
        this.isAddButton = z10;
        TextView textView = this.binding.textView;
        if (z10) {
            formattedTime = getContext().getString(R.string.new_reminder);
        } else {
            formattedTime = getFormattedTime();
        }
        textView.setText(formattedTime);
        if (z10) {
            RotateAnimation rotateAnimation = new RotateAnimation(135.0f, 0.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setDuration(this.animDuration);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            rotateAnimation.setFillAfter(true);
            this.binding.button.startAnimation(rotateAnimation);
            this.binding.button.setImportantForAccessibility(2);
            return;
        }
        RotateAnimation rotateAnimation2 = new RotateAnimation(0.0f, 135.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation2.setDuration(this.animDuration);
        rotateAnimation2.setInterpolator(new LinearInterpolator());
        rotateAnimation2.setFillAfter(true);
        this.binding.button.startAnimation(rotateAnimation2);
        this.binding.button.setImportantForAccessibility(1);
    }

    public final void setAnimDuration(long j10) {
        this.animDuration = j10;
    }

    public final void setFirstDayOfWeek(Integer num) {
        this.firstDayOfWeek = num;
    }

    public final void setItem(RemindersItem remindersItem) {
        q.i(remindersItem, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.item = remindersItem;
        this.binding.textView.setText(getFormattedTime());
    }

    public final void setTaskType(TaskType taskType) {
        q.i(taskType, "<set-?>");
        this.taskType = taskType;
    }

    public final void setTintColor(int i10) {
        this.tintColor = i10;
    }

    public final void setValueChangedListener(pc.l<? super Date, w> lVar) {
        this.valueChangedListener = lVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReminderItemFormView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.i(context, "context");
    }

    public /* synthetic */ ReminderItemFormView(Context context, AttributeSet attributeSet, int i10, int i11, qc.h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReminderItemFormView(final Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.i(context, "context");
        TaskFormReminderItemBinding inflate = TaskFormReminderItemBinding.inflate(ContextExtensionsKt.getLayoutInflater(context), this);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
        this.taskType = TaskType.DAILY;
        this.item = new RemindersItem();
        this.tintColor = ContextExtensionsKt.getThemeColor(context, R.attr.tintedUiSub);
        this.isAddButton = true;
        setMinimumHeight(IntExtensionsKt.dpToPx(38, context));
        setBackground(androidx.core.content.a.e(context, R.drawable.layout_rounded_bg_task_form));
        getBackground().mutate().setTint(ContextExtensionsKt.getThemeColor(context, R.attr.colorTintedBackgroundOffset));
        setGravity(16);
        inflate.button.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.tasks.form.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReminderItemFormView._init_$lambda$0(ReminderItemFormView.this, view);
            }
        });
        inflate.button.setContentDescription(context.getString(R.string.delete_reminder));
        inflate.button.getDrawable().mutate().setTint(this.tintColor);
        inflate.textView.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.tasks.form.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReminderItemFormView._init_$lambda$1(ReminderItemFormView.this, context, view);
            }
        });
        inflate.textView.setLabelFor(inflate.button.getId());
    }
}
