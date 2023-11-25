package com.habitrpg.android.habitica.ui.views.tasks.form;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.core.view.t0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.TaskFormTaskSchedulingBinding;
import com.habitrpg.android.habitica.models.tasks.Days;
import com.habitrpg.android.habitica.ui.adapter.SimpleSpinnerAdapter;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.extensions.IntExtensionsKt;
import com.habitrpg.shared.habitica.models.tasks.Frequency;
import com.habitrpg.shared.habitica.models.tasks.TaskType;
import ec.b0;
import ec.s;
import ec.t;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import qc.q;
import yc.u;
import yc.y;

/* compiled from: TaskSchedulingControls.kt */
/* loaded from: classes4.dex */
public final class TaskSchedulingControls extends LinearLayout implements DatePickerDialog.OnDateSetListener {
    public static final int $stable = 8;
    private final TaskFormTaskSchedulingBinding binding;
    private final DateFormat dateFormatter;
    private List<Integer> daysOfMonth;
    private Date dueDate;
    private int firstDayOfWeek;
    private Frequency frequency;
    private final SimpleSpinnerAdapter frequencyAdapter;
    private Date startDate;
    private Calendar startDateCalendar;
    private TaskType taskType;
    private int tintColor;
    private List<Integer> weekdayOrder;
    private final dc.f weekdays$delegate;
    private Days weeklyRepeat;
    private List<Integer> weeksOfMonth;

    /* compiled from: TaskSchedulingControls.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Frequency.values().length];
            try {
                iArr[Frequency.WEEKLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Frequency.MONTHLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Frequency.YEARLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Frequency.DAILY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TaskSchedulingControls(Context context) {
        this(context, null, 0, 6, null);
        q.i(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(Context context, final TaskSchedulingControls taskSchedulingControls, View view) {
        q.i(context, "$context");
        q.i(taskSchedulingControls, "this$0");
        DatePickerDialog datePickerDialog = new DatePickerDialog(context, taskSchedulingControls, taskSchedulingControls.startDateCalendar.get(1), taskSchedulingControls.startDateCalendar.get(2), taskSchedulingControls.startDateCalendar.get(5));
        datePickerDialog.setButton(-3, taskSchedulingControls.getResources().getString(R.string.today), new DialogInterface.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.tasks.form.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                TaskSchedulingControls.lambda$2$lambda$0(TaskSchedulingControls.this, dialogInterface, i10);
            }
        });
        if (taskSchedulingControls.firstDayOfWeek >= 0) {
            datePickerDialog.getDatePicker().setFirstDayOfWeek(taskSchedulingControls.firstDayOfWeek);
        }
        if (taskSchedulingControls.taskType == TaskType.TODO) {
            datePickerDialog.setButton(-3, taskSchedulingControls.getResources().getString(R.string.clear), new DialogInterface.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.tasks.form.h
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    TaskSchedulingControls.lambda$2$lambda$1(TaskSchedulingControls.this, dialogInterface, i10);
                }
            });
        }
        datePickerDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(TaskSchedulingControls taskSchedulingControls, View view) {
        List<Integer> n10;
        q.i(taskSchedulingControls, "this$0");
        n10 = t.n(Integer.valueOf(taskSchedulingControls.startDateCalendar.get(5)));
        taskSchedulingControls.setDaysOfMonth(n10);
        taskSchedulingControls.setWeeksOfMonth(null);
        taskSchedulingControls.generateSummary();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(TaskSchedulingControls taskSchedulingControls, View view) {
        List<Integer> n10;
        q.i(taskSchedulingControls, "this$0");
        n10 = t.n(Integer.valueOf(taskSchedulingControls.startDateCalendar.get(4) - 1));
        taskSchedulingControls.setWeeksOfMonth(n10);
        taskSchedulingControls.setDaysOfMonth(null);
        taskSchedulingControls.generateSummary();
    }

    private final void configureMonthlyRepeatViews() {
        boolean z10;
        List<Integer> list = this.daysOfMonth;
        boolean z11 = true;
        if (list != null && !list.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            TextView textView = this.binding.monthlyRepeatDays;
            q.h(textView, "monthlyRepeatDays");
            styleButtonAsActive(textView);
        } else {
            TextView textView2 = this.binding.monthlyRepeatDays;
            q.h(textView2, "monthlyRepeatDays");
            styleButtonAsInactive(textView2);
        }
        List<Integer> list2 = this.weeksOfMonth;
        if (list2 == null || list2.isEmpty()) {
            z11 = false;
        }
        if (z11) {
            TextView textView3 = this.binding.monthlyRepeatWeeks;
            q.h(textView3, "monthlyRepeatWeeks");
            styleButtonAsActive(textView3);
            return;
        }
        TextView textView4 = this.binding.monthlyRepeatWeeks;
        q.h(textView4, "monthlyRepeatWeeks");
        styleButtonAsInactive(textView4);
    }

    private final void configureViewsForFrequency() {
        int i10;
        int i11;
        boolean z10;
        List<Integer> d10;
        TextView textView = this.binding.repeatsEveryTitle;
        Context context = getContext();
        int i12 = WhenMappings.$EnumSwitchMapping$0[this.frequency.ordinal()];
        boolean z11 = true;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    i10 = R.string.days;
                } else {
                    i10 = R.string.years;
                }
            } else {
                i10 = R.string.months;
            }
        } else {
            i10 = R.string.weeks;
        }
        textView.setText(context.getText(i10));
        LinearLayout linearLayout = this.binding.weeklyRepeatWrapper;
        Frequency frequency = this.frequency;
        Frequency frequency2 = Frequency.WEEKLY;
        int i13 = 8;
        if (frequency == frequency2 && this.taskType == TaskType.DAILY) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        LinearLayout linearLayout2 = this.binding.monthlyRepeatWrapper;
        Frequency frequency3 = this.frequency;
        Frequency frequency4 = Frequency.MONTHLY;
        if (frequency3 == frequency4 && this.taskType == TaskType.DAILY) {
            i13 = 0;
        }
        linearLayout2.setVisibility(i13);
        Frequency frequency5 = this.frequency;
        if (frequency5 == frequency2) {
            createWeeklyRepeatViews();
        } else if (frequency5 == frequency4) {
            if (this.weeksOfMonth != null && (!r0.isEmpty()) == true) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (this.daysOfMonth == null || (!r0.isEmpty()) != true) {
                    z11 = false;
                }
                if (!z11) {
                    d10 = s.d(Integer.valueOf(this.startDateCalendar.get(5)));
                    setDaysOfMonth(d10);
                }
            }
        }
    }

    private final void configureViewsForType() {
        int i10;
        int i11;
        int i12;
        TextView textView = this.binding.startDateTitle;
        Context context = getContext();
        TaskType taskType = this.taskType;
        TaskType taskType2 = TaskType.DAILY;
        if (taskType == taskType2) {
            i10 = R.string.start_date;
        } else {
            i10 = R.string.due_date;
        }
        textView.setText(context.getString(i10));
        LinearLayout linearLayout = this.binding.repeatsEveryWrapper;
        int i13 = 0;
        if (this.taskType == taskType2) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        TextView textView2 = this.binding.summaryTextview;
        if (this.taskType == taskType2) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView2.setVisibility(i12);
        LinearLayout linearLayout2 = this.binding.weeklyRepeatWrapper;
        if (this.taskType != taskType2) {
            i13 = 8;
        }
        linearLayout2.setVisibility(i13);
    }

    private final void createWeeklyRepeatViews() {
        Object m02;
        char X0;
        this.binding.weeklyRepeatWrapper.removeAllViews();
        int dpToPx = IntExtensionsKt.dpToPx(32, getContext());
        m02 = b0.m0(this.weekdayOrder);
        int intValue = ((Number) m02).intValue();
        Iterator<Integer> it = this.weekdayOrder.iterator();
        while (it.hasNext()) {
            final int intValue2 = it.next().intValue();
            TextView textView = new TextView(getContext(), null, 0, R.style.TaskFormWeekdayButton);
            final boolean isWeekdayActive = isWeekdayActive(intValue2);
            textView.setLayoutParams(new LinearLayout.LayoutParams(dpToPx, dpToPx));
            X0 = y.X0(getWeekdays()[intValue2]);
            textView.setText(String.valueOf(Character.toUpperCase(X0)));
            textView.setContentDescription(toContentDescription(getWeekdays()[intValue2], isWeekdayActive));
            textView.setTag(Integer.valueOf(intValue2));
            if (isWeekdayActive) {
                textView.setBackground(androidx.core.content.a.e(getContext(), R.drawable.habit_scoring_circle_selected));
                Context context = getContext();
                q.h(context, "getContext(...)");
                textView.setTextColor(ContextExtensionsKt.getThemeColor(context, R.attr.tintedUiDetails));
            } else {
                textView.setBackground(androidx.core.content.a.e(getContext(), R.drawable.habit_scoring_circle));
                Context context2 = getContext();
                q.h(context2, "getContext(...)");
                textView.setTextColor(ContextExtensionsKt.getThemeColor(context2, R.attr.textColorTintedSecondary));
            }
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.tasks.form.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TaskSchedulingControls.createWeeklyRepeatViews$lambda$5(TaskSchedulingControls.this, intValue2, isWeekdayActive, view);
                }
            });
            this.binding.weeklyRepeatWrapper.addView(textView);
            if (intValue2 != intValue) {
                View space = new Space(getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
                layoutParams.weight = 1.0f;
                space.setLayoutParams(layoutParams);
                this.binding.weeklyRepeatWrapper.addView(space);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createWeeklyRepeatViews$lambda$5(TaskSchedulingControls taskSchedulingControls, int i10, boolean z10, View view) {
        q.i(taskSchedulingControls, "this$0");
        taskSchedulingControls.setWeekdayActive(i10, !z10);
    }

    private final void generateSummary() {
        String str;
        String str2;
        boolean z10;
        String valueOf;
        String valueOf2;
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.frequency.ordinal()];
        String str3 = "";
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        str = "";
                    } else if (getEveryX() == 1) {
                        str = "day";
                    } else {
                        str = "days";
                    }
                } else if (getEveryX() == 1) {
                    str = "year";
                } else {
                    str = "years";
                }
            } else if (getEveryX() == 1) {
                str = "month";
            } else {
                str = "months";
            }
        } else if (getEveryX() == 1) {
            str = "week";
        } else {
            str = "weeks";
        }
        if (this.frequency != Frequency.WEEKLY) {
            str2 = "";
        } else {
            ArrayList arrayList = new ArrayList();
            if (this.weeklyRepeat.getM()) {
                arrayList.add("Monday");
            }
            if (this.weeklyRepeat.getT()) {
                arrayList.add("Tuesday");
            }
            if (this.weeklyRepeat.getW()) {
                arrayList.add("Wednesday");
            }
            if (this.weeklyRepeat.getTh()) {
                arrayList.add("Thursday");
            }
            if (this.weeklyRepeat.getF()) {
                arrayList.add("Friday");
            }
            if (this.weeklyRepeat.getS()) {
                arrayList.add("Saturday");
            }
            if (this.weeklyRepeat.getSu()) {
                arrayList.add("Sunday");
            }
            str2 = " on " + TextUtils.join(", ", arrayList);
        }
        if (this.frequency == Frequency.MONTHLY) {
            if (this.daysOfMonth != null && (!r6.isEmpty()) == true) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i11 = this.startDateCalendar.get(5);
                if (Build.VERSION.SDK_INT >= 24) {
                    com.habitrpg.android.habitica.helpers.h.a();
                    valueOf2 = com.habitrpg.android.habitica.helpers.g.a("{0,ordinal}", Locale.getDefault()).format(new Integer[]{Integer.valueOf(i11)});
                } else {
                    valueOf2 = String.valueOf(i11);
                }
                str2 = " on the " + valueOf2;
            } else {
                int i12 = this.startDateCalendar.get(4);
                if (Build.VERSION.SDK_INT >= 24) {
                    com.habitrpg.android.habitica.helpers.h.a();
                    valueOf = com.habitrpg.android.habitica.helpers.g.a("{0,ordinal}", Locale.getDefault()).format(new Integer[]{Integer.valueOf(i12)});
                } else {
                    valueOf = String.valueOf(i12);
                }
                str2 = " on the " + valueOf + " week on " + this.startDateCalendar.getDisplayName(7, 2, Locale.getDefault());
            }
        }
        if (getEveryX() != 1) {
            str3 = getEveryX() + " ";
        }
        String string = getResources().getString(R.string.repeat_summary, this.frequency, str3, str, str2);
        q.h(string, "getString(...)");
        this.binding.summaryTextview.setText(string);
    }

    private final String[] getWeekdays() {
        Object value = this.weekdays$delegate.getValue();
        q.h(value, "getValue(...)");
        return (String[]) value;
    }

    private final boolean isWeekdayActive(int i10) {
        switch (i10) {
            case 1:
                return this.weeklyRepeat.getSu();
            case 2:
                return this.weeklyRepeat.getM();
            case 3:
                return this.weeklyRepeat.getT();
            case 4:
                return this.weeklyRepeat.getW();
            case 5:
                return this.weeklyRepeat.getTh();
            case 6:
                return this.weeklyRepeat.getF();
            case 7:
                return this.weeklyRepeat.getS();
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$2$lambda$0(TaskSchedulingControls taskSchedulingControls, DialogInterface dialogInterface, int i10) {
        q.i(taskSchedulingControls, "this$0");
        if (taskSchedulingControls.taskType == TaskType.TODO) {
            taskSchedulingControls.setDueDate(new Date());
        } else {
            taskSchedulingControls.setStartDate(new Date());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$2$lambda$1(TaskSchedulingControls taskSchedulingControls, DialogInterface dialogInterface, int i10) {
        q.i(taskSchedulingControls, "this$0");
        taskSchedulingControls.setDueDate(null);
    }

    private final void setWeekdayActive(int i10, boolean z10) {
        switch (i10) {
            case 1:
                this.weeklyRepeat.setSu(z10);
                break;
            case 2:
                this.weeklyRepeat.setM(z10);
                break;
            case 3:
                this.weeklyRepeat.setT(z10);
                break;
            case 4:
                this.weeklyRepeat.setW(z10);
                break;
            case 5:
                this.weeklyRepeat.setTh(z10);
                break;
            case 6:
                this.weeklyRepeat.setF(z10);
                break;
            case 7:
                this.weeklyRepeat.setS(z10);
                break;
        }
        createWeeklyRepeatViews();
        ((TextView) this.binding.weeklyRepeatWrapper.findViewWithTag(Integer.valueOf(i10))).sendAccessibilityEvent(4);
        generateSummary();
    }

    private final void styleButtonAsActive(TextView textView) {
        Context context = getContext();
        q.h(context, "getContext(...)");
        textView.setTextColor(ContextExtensionsKt.getThemeColor(context, R.attr.tintedUiDetails));
        Context context2 = getContext();
        q.h(context2, "getContext(...)");
        textView.setBackgroundTintList(ColorStateList.valueOf(ContextExtensionsKt.getThemeColor(context2, R.attr.tintedUiMain)));
        CharSequence text = textView.getText();
        q.h(text, "getText(...)");
        textView.setContentDescription(toContentDescription(text, true));
    }

    private final void styleButtonAsInactive(TextView textView) {
        Context context = getContext();
        q.h(context, "getContext(...)");
        textView.setTextColor(ContextExtensionsKt.getThemeColor(context, R.attr.textColorTintedSecondary));
        Context context2 = getContext();
        q.h(context2, "getContext(...)");
        textView.setBackgroundTintList(ColorStateList.valueOf(ContextExtensionsKt.getThemeColor(context2, R.attr.colorTintedBackgroundOffset)));
        CharSequence text = textView.getText();
        q.h(text, "getText(...)");
        textView.setContentDescription(toContentDescription(text, false));
    }

    private final String toContentDescription(CharSequence charSequence, boolean z10) {
        String string;
        if (z10) {
            string = getContext().getString(R.string.selected);
        } else {
            string = getContext().getString(R.string.not_selected);
        }
        q.f(string);
        return ((Object) charSequence) + ", " + string;
    }

    public final List<Integer> getDaysOfMonth() {
        return this.daysOfMonth;
    }

    public final Date getDueDate() {
        return this.dueDate;
    }

    public final int getEveryX() {
        Integer j10;
        Object text = this.binding.repeatsEveryEdittext.getText();
        if (text == null) {
            text = "1";
        }
        j10 = u.j(text.toString());
        if (j10 != null) {
            return j10.intValue();
        }
        return 1;
    }

    public final int getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    public final Frequency getFrequency() {
        return this.frequency;
    }

    public final Date getStartDate() {
        return this.startDate;
    }

    public final TaskType getTaskType() {
        return this.taskType;
    }

    public final int getTintColor() {
        return this.tintColor;
    }

    public final Days getWeeklyRepeat() {
        return this.weeklyRepeat;
    }

    public final List<Integer> getWeeksOfMonth() {
        return this.weeksOfMonth;
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
        this.startDateCalendar.set(i10, i11, i12);
        if (this.taskType == TaskType.TODO) {
            setDueDate(this.startDateCalendar.getTime());
            return;
        }
        Date time = this.startDateCalendar.getTime();
        q.h(time, "getTime(...)");
        setStartDate(time);
    }

    public final void setDaysOfMonth(List<Integer> list) {
        this.daysOfMonth = list;
        configureMonthlyRepeatViews();
        generateSummary();
    }

    public final void setDueDate(Date date) {
        this.dueDate = date;
        if (date != null) {
            this.binding.startDateTextview.setText(this.dateFormatter.format(date));
        } else {
            this.binding.startDateTextview.setText((CharSequence) null);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        LinearLayout linearLayout = this.binding.weeklyRepeatWrapper;
        q.h(linearLayout, "weeklyRepeatWrapper");
        Iterator<View> it = t0.a(linearLayout).iterator();
        while (it.hasNext()) {
            it.next().setEnabled(z10);
        }
        this.binding.startDateWrapper.setEnabled(z10);
        this.binding.monthlyRepeatDays.setEnabled(z10);
        this.binding.monthlyRepeatWeeks.setEnabled(z10);
    }

    public final void setEveryX(int i10) {
        try {
            this.binding.repeatsEveryEdittext.setText(String.valueOf(i10));
        } catch (NumberFormatException unused) {
            this.binding.repeatsEveryEdittext.setText("1");
        }
        generateSummary();
    }

    public final void setFirstDayOfWeek(int i10) {
        List<Integer> C0;
        this.firstDayOfWeek = i10;
        if (i10 >= 0) {
            C0 = b0.C0(new vc.f(1, 7));
            Collections.rotate(C0, (-this.firstDayOfWeek) + 1);
            this.weekdayOrder = C0;
        }
    }

    public final void setFrequency(Frequency frequency) {
        q.i(frequency, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.frequency = frequency;
        Spinner spinner = this.binding.repeatsEverySpinner;
        int i10 = WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    i11 = 0;
                }
            }
        }
        spinner.setSelection(i11);
        configureViewsForFrequency();
        generateSummary();
    }

    public final void setStartDate(Date date) {
        q.i(date, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.startDate = date;
        this.binding.startDateTextview.setText(this.dateFormatter.format(date));
        this.startDateCalendar.setTime(date);
        generateSummary();
    }

    public final void setTaskType(TaskType taskType) {
        q.i(taskType, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.taskType = taskType;
        configureViewsForType();
        if (taskType == TaskType.TODO) {
            setDueDate(null);
        }
    }

    public final void setTintColor(int i10) {
        this.tintColor = i10;
    }

    public final void setWeeklyRepeat(Days days) {
        q.i(days, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.weeklyRepeat = days;
        createWeeklyRepeatViews();
        generateSummary();
    }

    public final void setWeeksOfMonth(List<Integer> list) {
        this.weeksOfMonth = list;
        configureMonthlyRepeatViews();
        generateSummary();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TaskSchedulingControls(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.i(context, "context");
    }

    public /* synthetic */ TaskSchedulingControls(Context context, AttributeSet attributeSet, int i10, int i11, qc.h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskSchedulingControls(final Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        dc.f b10;
        List<Integer> C0;
        q.i(context, "context");
        TaskFormTaskSchedulingBinding inflate = TaskFormTaskSchedulingBinding.inflate(ContextExtensionsKt.getLayoutInflater(context), this);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
        this.tintColor = androidx.core.content.a.c(context, R.color.brand_300);
        this.dateFormatter = DateFormat.getDateInstance(2);
        SimpleSpinnerAdapter simpleSpinnerAdapter = new SimpleSpinnerAdapter(context, R.array.repeatables_frequencies);
        this.frequencyAdapter = simpleSpinnerAdapter;
        this.taskType = TaskType.DAILY;
        this.startDate = new Date();
        this.startDateCalendar = Calendar.getInstance();
        this.frequency = Frequency.DAILY;
        this.weeklyRepeat = new Days();
        this.firstDayOfWeek = -1;
        b10 = dc.h.b(TaskSchedulingControls$weekdays$2.INSTANCE);
        this.weekdays$delegate = b10;
        C0 = b0.C0(new vc.f(1, 7));
        this.weekdayOrder = C0;
        inflate.repeatsEverySpinner.setAdapter((SpinnerAdapter) simpleSpinnerAdapter);
        setFrequency(Frequency.WEEKLY);
        setStartDate(new Date());
        setEveryX(1);
        setWeeklyRepeat(new Days());
        inflate.repeatsEverySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.habitrpg.android.habitica.ui.views.tasks.form.TaskSchedulingControls.1
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i11, long j10) {
                Frequency frequency;
                TaskSchedulingControls taskSchedulingControls = TaskSchedulingControls.this;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            frequency = Frequency.DAILY;
                        } else {
                            frequency = Frequency.YEARLY;
                        }
                    } else {
                        frequency = Frequency.MONTHLY;
                    }
                } else {
                    frequency = Frequency.WEEKLY;
                }
                taskSchedulingControls.setFrequency(frequency);
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
                TaskSchedulingControls taskSchedulingControls = TaskSchedulingControls.this;
                taskSchedulingControls.setFrequency(taskSchedulingControls.getFrequency());
            }
        });
        inflate.startDateWrapper.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.tasks.form.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TaskSchedulingControls._init_$lambda$2(context, this, view);
            }
        });
        inflate.monthlyRepeatDays.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.tasks.form.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TaskSchedulingControls._init_$lambda$3(TaskSchedulingControls.this, view);
            }
        });
        inflate.monthlyRepeatWeeks.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.tasks.form.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TaskSchedulingControls._init_$lambda$4(TaskSchedulingControls.this, view);
            }
        });
        setOrientation(1);
        configureViewsForType();
        configureViewsForFrequency();
    }
}
