package com.habitrpg.android.habitica;

import android.content.SharedPreferences;
import com.habitrpg.android.habitica.extensions.DateUtils;
import com.habitrpg.android.habitica.helpers.Analytics;
import java.util.Date;

/* compiled from: HabiticaBaseApplication.kt */
/* loaded from: classes4.dex */
public final class ApplicationLifecycleTracker implements androidx.lifecycle.i {
    public static final int $stable = 8;
    private long lastResumeTime;
    private final SharedPreferences sharedPreferences;

    public ApplicationLifecycleTracker(SharedPreferences sharedPreferences) {
        qc.q.i(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
    }

    private final void addDurationToDay(long j10) {
        long j11;
        long j12 = this.sharedPreferences.getLong("usage_time_total", 0L) + j10;
        Date date = new Date();
        if (this.sharedPreferences.contains("usage_time_day")) {
            date = new Date(this.sharedPreferences.getLong("usage_time_day", 0L));
        }
        long j13 = this.sharedPreferences.getLong("usage_time_current", 0L);
        if (!DateUtils.Companion.isSameDay(date, new Date())) {
            long j14 = this.sharedPreferences.getLong("usage_time_daily_average", 0L);
            int i10 = this.sharedPreferences.getInt("usage_time_day_count", 0);
            long j15 = (j14 * i10) + j13;
            int i11 = i10 + 1;
            long j16 = j15 / i11;
            SharedPreferences.Editor edit = this.sharedPreferences.edit();
            edit.putInt("usage_time_day_count", i11);
            edit.putLong("usage_time_daily_average", j16);
            edit.apply();
            Analytics analytics = Analytics.INSTANCE;
            analytics.setUserProperty("usage_time_daily_average", Long.valueOf(j16));
            analytics.setUserProperty("usage_time_total", Long.valueOf(j12));
            date = new Date();
            j11 = 0;
        } else {
            j11 = j13;
        }
        SharedPreferences.Editor edit2 = this.sharedPreferences.edit();
        edit2.putLong("usage_time_current", j11 + j10);
        edit2.putLong("usage_time_total", j12);
        edit2.putLong("usage_time_day", date.getTime());
        edit2.apply();
    }

    @Override // androidx.lifecycle.i
    public /* bridge */ /* synthetic */ void onCreate(androidx.lifecycle.v vVar) {
        androidx.lifecycle.h.a(this, vVar);
    }

    @Override // androidx.lifecycle.i
    public /* bridge */ /* synthetic */ void onDestroy(androidx.lifecycle.v vVar) {
        androidx.lifecycle.h.b(this, vVar);
    }

    @Override // androidx.lifecycle.i
    public void onPause(androidx.lifecycle.v vVar) {
        qc.q.i(vVar, "owner");
        androidx.lifecycle.h.c(this, vVar);
        addDurationToDay((new Date().getTime() - this.lastResumeTime) / 1000);
    }

    @Override // androidx.lifecycle.i
    public void onResume(androidx.lifecycle.v vVar) {
        qc.q.i(vVar, "owner");
        androidx.lifecycle.h.d(this, vVar);
        this.lastResumeTime = new Date().getTime();
    }

    @Override // androidx.lifecycle.i
    public /* bridge */ /* synthetic */ void onStart(androidx.lifecycle.v vVar) {
        androidx.lifecycle.h.e(this, vVar);
    }

    @Override // androidx.lifecycle.i
    public /* bridge */ /* synthetic */ void onStop(androidx.lifecycle.v vVar) {
        androidx.lifecycle.h.f(this, vVar);
    }
}
