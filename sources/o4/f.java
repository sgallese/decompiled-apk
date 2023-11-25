package o4;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* compiled from: IdGenerator.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final WorkDatabase f20483a;

    public f(WorkDatabase workDatabase) {
        this.f20483a = workDatabase;
    }

    public static void a(Context context, x3.b bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i10 = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i11 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            bVar.beginTransaction();
            try {
                bVar.P("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                bVar.P("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                sharedPreferences.edit().clear().apply();
                bVar.O();
            } finally {
                bVar.e0();
            }
        }
    }

    private int c(String str) {
        int i10;
        this.f20483a.c();
        try {
            Long b10 = this.f20483a.x().b(str);
            int i11 = 0;
            if (b10 != null) {
                i10 = b10.intValue();
            } else {
                i10 = 0;
            }
            if (i10 != Integer.MAX_VALUE) {
                i11 = i10 + 1;
            }
            e(str, i11);
            this.f20483a.r();
            return i10;
        } finally {
            this.f20483a.g();
        }
    }

    private void e(String str, int i10) {
        this.f20483a.x().a(new n4.d(str, i10));
    }

    public int b() {
        int c10;
        synchronized (f.class) {
            c10 = c("next_alarm_manager_id");
        }
        return c10;
    }

    public int d(int i10, int i11) {
        synchronized (f.class) {
            int c10 = c("next_job_scheduler_id");
            if (c10 >= i10 && c10 <= i11) {
                i10 = c10;
            }
            e("next_job_scheduler_id", i10 + 1);
        }
        return i10;
    }
}
