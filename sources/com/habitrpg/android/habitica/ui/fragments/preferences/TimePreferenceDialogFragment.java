package com.habitrpg.android.habitica.ui.fragments.preferences;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.TimePicker;
import androidx.preference.DialogPreference;
import com.habitrpg.android.habitica.prefs.TimePreference;
import java.util.Arrays;
import java.util.Locale;
import qc.j0;
import qc.q;

/* compiled from: TimePreferenceDialogFragment.kt */
/* loaded from: classes4.dex */
public final class TimePreferenceDialogFragment extends Hilt_TimePreferenceDialogFragment {
    public TimePicker picker;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final String TAG = TimePreferenceDialogFragment.class.getSimpleName();

    /* compiled from: TimePreferenceDialogFragment.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(qc.h hVar) {
            this();
        }

        public final String getTAG() {
            return TimePreferenceDialogFragment.TAG;
        }

        public final TimePreferenceDialogFragment newInstance(androidx.preference.h hVar, String str) {
            q.i(hVar, "preferenceFragment");
            q.i(str, "key");
            TimePreferenceDialogFragment timePreferenceDialogFragment = new TimePreferenceDialogFragment();
            Bundle bundle = new Bundle(1);
            bundle.putString("key", str);
            timePreferenceDialogFragment.setArguments(bundle);
            timePreferenceDialogFragment.setTargetFragment(hVar, 0);
            return timePreferenceDialogFragment;
        }
    }

    private final String getNewTimeValue() {
        int intValue;
        int intValue2;
        if (Build.VERSION.SDK_INT >= 23) {
            intValue = getPicker().getHour();
            intValue2 = getPicker().getMinute();
        } else {
            Integer currentHour = getPicker().getCurrentHour();
            q.h(currentHour, "getCurrentHour(...)");
            intValue = currentHour.intValue();
            Integer currentMinute = getPicker().getCurrentMinute();
            q.h(currentMinute, "getCurrentMinute(...)");
            intValue2 = currentMinute.intValue();
        }
        j0 j0Var = j0.f21683a;
        String format = String.format(Locale.UK, "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(intValue2)}, 1));
        q.h(format, "format(locale, format, *args)");
        return intValue + ":" + format;
    }

    private final TimePreference getTimePreference() {
        DialogPreference preference = getPreference();
        q.g(preference, "null cannot be cast to non-null type com.habitrpg.android.habitica.prefs.TimePreference");
        return (TimePreference) preference;
    }

    public final TimePicker getPicker() {
        TimePicker timePicker = this.picker;
        if (timePicker != null) {
            return timePicker;
        }
        q.z("picker");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.g
    public void onBindDialogView(View view) {
        q.i(view, "view");
        super.onBindDialogView(view);
        TimePreference timePreference = getTimePreference();
        int lastHour = timePreference.getLastHour();
        int lastMinute = timePreference.getLastMinute();
        if (Build.VERSION.SDK_INT >= 23) {
            getPicker().setHour(lastHour);
            getPicker().setMinute(lastMinute);
            return;
        }
        getPicker().setCurrentHour(Integer.valueOf(lastHour));
        getPicker().setCurrentMinute(Integer.valueOf(lastMinute));
    }

    @Override // androidx.preference.g
    protected View onCreateDialogView(Context context) {
        q.i(context, "context");
        setPicker(new TimePicker(context));
        getPicker().setIs24HourView(Boolean.valueOf(DateFormat.is24HourFormat(context)));
        return getPicker();
    }

    @Override // androidx.preference.g
    public void onDialogClosed(boolean z10) {
        if (z10) {
            TimePreference timePreference = getTimePreference();
            String newTimeValue = getNewTimeValue();
            timePreference.setSummary(newTimeValue);
            if (timePreference.callChangeListener(newTimeValue)) {
                timePreference.setText(newTimeValue);
            }
        }
    }

    public final void setPicker(TimePicker timePicker) {
        q.i(timePicker, "<set-?>");
        this.picker = timePicker;
    }
}
