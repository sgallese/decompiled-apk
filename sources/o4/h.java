package o4;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* compiled from: PreferenceUtils.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final WorkDatabase f20485a;

    public h(WorkDatabase workDatabase) {
        this.f20485a = workDatabase;
    }

    public static void b(Context context, x3.b bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j10 = 0;
            long j11 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                j10 = 1;
            }
            bVar.beginTransaction();
            try {
                bVar.P("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j11)});
                bVar.P("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j10)});
                sharedPreferences.edit().clear().apply();
                bVar.O();
            } finally {
                bVar.e0();
            }
        }
    }

    public boolean a() {
        Long b10 = this.f20485a.x().b("reschedule_needed");
        if (b10 != null && b10.longValue() == 1) {
            return true;
        }
        return false;
    }

    public void c(boolean z10) {
        this.f20485a.x().a(new n4.d("reschedule_needed", z10));
    }
}
