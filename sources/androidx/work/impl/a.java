package androidx.work.impl;

import android.content.Context;
import android.os.Build;

/* compiled from: WorkDatabaseMigrations.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static u3.a f7460a = new C0168a(1, 2);

    /* renamed from: b  reason: collision with root package name */
    public static u3.a f7461b = new b(3, 4);

    /* renamed from: c  reason: collision with root package name */
    public static u3.a f7462c = new c(4, 5);

    /* renamed from: d  reason: collision with root package name */
    public static u3.a f7463d = new d(6, 7);

    /* renamed from: e  reason: collision with root package name */
    public static u3.a f7464e = new e(7, 8);

    /* renamed from: f  reason: collision with root package name */
    public static u3.a f7465f = new f(8, 9);

    /* renamed from: g  reason: collision with root package name */
    public static u3.a f7466g = new g(11, 12);

    /* compiled from: WorkDatabaseMigrations.java */
    /* renamed from: androidx.work.impl.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0168a extends u3.a {
        C0168a(int i10, int i11) {
            super(i10, i11);
        }

        @Override // u3.a
        public void a(x3.b bVar) {
            bVar.o("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.o("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            bVar.o("DROP TABLE IF EXISTS alarmInfo");
            bVar.o("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    class b extends u3.a {
        b(int i10, int i11) {
            super(i10, i11);
        }

        @Override // u3.a
        public void a(x3.b bVar) {
            if (Build.VERSION.SDK_INT >= 23) {
                bVar.o("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    class c extends u3.a {
        c(int i10, int i11) {
            super(i10, i11);
        }

        @Override // u3.a
        public void a(x3.b bVar) {
            bVar.o("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            bVar.o("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    class d extends u3.a {
        d(int i10, int i11) {
            super(i10, i11);
        }

        @Override // u3.a
        public void a(x3.b bVar) {
            bVar.o("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    class e extends u3.a {
        e(int i10, int i11) {
            super(i10, i11);
        }

        @Override // u3.a
        public void a(x3.b bVar) {
            bVar.o("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    class f extends u3.a {
        f(int i10, int i11) {
            super(i10, i11);
        }

        @Override // u3.a
        public void a(x3.b bVar) {
            bVar.o("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    class g extends u3.a {
        g(int i10, int i11) {
            super(i10, i11);
        }

        @Override // u3.a
        public void a(x3.b bVar) {
            bVar.o("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public static class h extends u3.a {

        /* renamed from: c  reason: collision with root package name */
        final Context f7467c;

        public h(Context context, int i10, int i11) {
            super(i10, i11);
            this.f7467c = context;
        }

        @Override // u3.a
        public void a(x3.b bVar) {
            if (this.f24102b >= 10) {
                bVar.P("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.f7467c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public static class i extends u3.a {

        /* renamed from: c  reason: collision with root package name */
        final Context f7468c;

        public i(Context context) {
            super(9, 10);
            this.f7468c = context;
        }

        @Override // u3.a
        public void a(x3.b bVar) {
            bVar.o("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            o4.h.b(this.f7468c, bVar);
            o4.f.a(this.f7468c, bVar);
        }
    }
}
