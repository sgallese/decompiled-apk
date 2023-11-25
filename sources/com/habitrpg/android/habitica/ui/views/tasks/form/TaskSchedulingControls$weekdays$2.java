package com.habitrpg.android.habitica.ui.views.tasks.form;

import java.text.DateFormatSymbols;
import qc.r;

/* compiled from: TaskSchedulingControls.kt */
/* loaded from: classes4.dex */
final class TaskSchedulingControls$weekdays$2 extends r implements pc.a<String[]> {
    public static final TaskSchedulingControls$weekdays$2 INSTANCE = new TaskSchedulingControls$weekdays$2();

    TaskSchedulingControls$weekdays$2() {
        super(0);
    }

    @Override // pc.a
    public final String[] invoke() {
        return new DateFormatSymbols().getWeekdays();
    }
}
