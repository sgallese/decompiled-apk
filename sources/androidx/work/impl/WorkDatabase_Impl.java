package androidx.work.impl;

import androidx.room.f;
import androidx.room.i;
import androidx.room.k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import n4.b;
import n4.e;
import n4.h;
import n4.i;
import n4.k;
import n4.l;
import n4.n;
import n4.o;
import n4.q;
import n4.r;
import n4.t;
import n4.u;
import v3.f;
import x3.c;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: m  reason: collision with root package name */
    private volatile q f7452m;

    /* renamed from: n  reason: collision with root package name */
    private volatile b f7453n;

    /* renamed from: o  reason: collision with root package name */
    private volatile t f7454o;

    /* renamed from: p  reason: collision with root package name */
    private volatile h f7455p;

    /* renamed from: q  reason: collision with root package name */
    private volatile k f7456q;

    /* renamed from: r  reason: collision with root package name */
    private volatile n f7457r;

    /* renamed from: s  reason: collision with root package name */
    private volatile e f7458s;

    @Override // androidx.work.impl.WorkDatabase
    public n A() {
        n nVar;
        if (this.f7457r != null) {
            return this.f7457r;
        }
        synchronized (this) {
            if (this.f7457r == null) {
                this.f7457r = new o(this);
            }
            nVar = this.f7457r;
        }
        return nVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public q B() {
        q qVar;
        if (this.f7452m != null) {
            return this.f7452m;
        }
        synchronized (this) {
            if (this.f7452m == null) {
                this.f7452m = new r(this);
            }
            qVar = this.f7452m;
        }
        return qVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public t C() {
        t tVar;
        if (this.f7454o != null) {
            return this.f7454o;
        }
        synchronized (this) {
            if (this.f7454o == null) {
                this.f7454o = new u(this);
            }
            tVar = this.f7454o;
        }
        return tVar;
    }

    @Override // androidx.room.i
    protected f e() {
        return new f(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.i
    protected c f(androidx.room.a aVar) {
        return aVar.f6960a.a(c.b.a(aVar.f6961b).c(aVar.f6962c).b(new androidx.room.k(aVar, new a(12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6")).a());
    }

    @Override // androidx.work.impl.WorkDatabase
    public b t() {
        b bVar;
        if (this.f7453n != null) {
            return this.f7453n;
        }
        synchronized (this) {
            if (this.f7453n == null) {
                this.f7453n = new n4.c(this);
            }
            bVar = this.f7453n;
        }
        return bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public e x() {
        e eVar;
        if (this.f7458s != null) {
            return this.f7458s;
        }
        synchronized (this) {
            if (this.f7458s == null) {
                this.f7458s = new n4.f(this);
            }
            eVar = this.f7458s;
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public h y() {
        h hVar;
        if (this.f7455p != null) {
            return this.f7455p;
        }
        synchronized (this) {
            if (this.f7455p == null) {
                this.f7455p = new i(this);
            }
            hVar = this.f7455p;
        }
        return hVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public k z() {
        k kVar;
        if (this.f7456q != null) {
            return this.f7456q;
        }
        synchronized (this) {
            if (this.f7456q == null) {
                this.f7456q = new l(this);
            }
            kVar = this.f7456q;
        }
        return kVar;
    }

    /* loaded from: classes.dex */
    class a extends k.a {
        a(int i10) {
            super(i10);
        }

        @Override // androidx.room.k.a
        public void a(x3.b bVar) {
            bVar.o("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.o("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            bVar.o("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            bVar.o("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            bVar.o("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            bVar.o("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            bVar.o("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.o("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            bVar.o("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.o("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.o("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            bVar.o("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.o("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            bVar.o("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.o("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // androidx.room.k.a
        public void b(x3.b bVar) {
            bVar.o("DROP TABLE IF EXISTS `Dependency`");
            bVar.o("DROP TABLE IF EXISTS `WorkSpec`");
            bVar.o("DROP TABLE IF EXISTS `WorkTag`");
            bVar.o("DROP TABLE IF EXISTS `SystemIdInfo`");
            bVar.o("DROP TABLE IF EXISTS `WorkName`");
            bVar.o("DROP TABLE IF EXISTS `WorkProgress`");
            bVar.o("DROP TABLE IF EXISTS `Preference`");
            if (((androidx.room.i) WorkDatabase_Impl.this).f7031h != null) {
                int size = ((androidx.room.i) WorkDatabase_Impl.this).f7031h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((i.b) ((androidx.room.i) WorkDatabase_Impl.this).f7031h.get(i10)).b(bVar);
                }
            }
        }

        @Override // androidx.room.k.a
        protected void c(x3.b bVar) {
            if (((androidx.room.i) WorkDatabase_Impl.this).f7031h != null) {
                int size = ((androidx.room.i) WorkDatabase_Impl.this).f7031h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((i.b) ((androidx.room.i) WorkDatabase_Impl.this).f7031h.get(i10)).a(bVar);
                }
            }
        }

        @Override // androidx.room.k.a
        public void d(x3.b bVar) {
            ((androidx.room.i) WorkDatabase_Impl.this).f7024a = bVar;
            bVar.o("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.m(bVar);
            if (((androidx.room.i) WorkDatabase_Impl.this).f7031h != null) {
                int size = ((androidx.room.i) WorkDatabase_Impl.this).f7031h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((i.b) ((androidx.room.i) WorkDatabase_Impl.this).f7031h.get(i10)).c(bVar);
                }
            }
        }

        @Override // androidx.room.k.a
        public void f(x3.b bVar) {
            v3.c.a(bVar);
        }

        @Override // androidx.room.k.a
        protected k.b g(x3.b bVar) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap.put("prerequisite_id", new f.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new f.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
            hashSet2.add(new f.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
            v3.f fVar = new v3.f("Dependency", hashMap, hashSet, hashSet2);
            v3.f a10 = v3.f.a(bVar, "Dependency");
            if (!fVar.equals(a10)) {
                return new k.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + fVar + "\n Found:\n" + a10);
            }
            HashMap hashMap2 = new HashMap(25);
            hashMap2.put("id", new f.a("id", "TEXT", true, 1, null, 1));
            hashMap2.put("state", new f.a("state", "INTEGER", true, 0, null, 1));
            hashMap2.put("worker_class_name", new f.a("worker_class_name", "TEXT", true, 0, null, 1));
            hashMap2.put("input_merger_class_name", new f.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            hashMap2.put("input", new f.a("input", "BLOB", true, 0, null, 1));
            hashMap2.put("output", new f.a("output", "BLOB", true, 0, null, 1));
            hashMap2.put("initial_delay", new f.a("initial_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("interval_duration", new f.a("interval_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("flex_duration", new f.a("flex_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_attempt_count", new f.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_policy", new f.a("backoff_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_delay_duration", new f.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("period_start_time", new f.a("period_start_time", "INTEGER", true, 0, null, 1));
            hashMap2.put("minimum_retention_duration", new f.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("schedule_requested_at", new f.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_in_foreground", new f.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            hashMap2.put("out_of_quota_policy", new f.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("required_network_type", new f.a("required_network_type", "INTEGER", false, 0, null, 1));
            hashMap2.put("requires_charging", new f.a("requires_charging", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_device_idle", new f.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_battery_not_low", new f.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_storage_not_low", new f.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_content_update_delay", new f.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_max_content_delay", new f.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("content_uri_triggers", new f.a("content_uri_triggers", "BLOB", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new f.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
            hashSet4.add(new f.d("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
            v3.f fVar2 = new v3.f("WorkSpec", hashMap2, hashSet3, hashSet4);
            v3.f a11 = v3.f.a(bVar, "WorkSpec");
            if (!fVar2.equals(a11)) {
                return new k.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + fVar2 + "\n Found:\n" + a11);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new f.a("tag", "TEXT", true, 1, null, 1));
            hashMap3.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new f.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
            v3.f fVar3 = new v3.f("WorkTag", hashMap3, hashSet5, hashSet6);
            v3.f a12 = v3.f.a(bVar, "WorkTag");
            if (!fVar3.equals(a12)) {
                return new k.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + fVar3 + "\n Found:\n" + a12);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap4.put("system_id", new f.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            v3.f fVar4 = new v3.f("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            v3.f a13 = v3.f.a(bVar, "SystemIdInfo");
            if (!fVar4.equals(a13)) {
                return new k.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + fVar4 + "\n Found:\n" + a13);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put(AppMeasurementSdk.ConditionalUserProperty.NAME, new f.a(AppMeasurementSdk.ConditionalUserProperty.NAME, "TEXT", true, 1, null, 1));
            hashMap5.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new f.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
            v3.f fVar5 = new v3.f("WorkName", hashMap5, hashSet8, hashSet9);
            v3.f a14 = v3.f.a(bVar, "WorkName");
            if (!fVar5.equals(a14)) {
                return new k.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + fVar5 + "\n Found:\n" + a14);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap6.put("progress", new f.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            v3.f fVar6 = new v3.f("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            v3.f a15 = v3.f.a(bVar, "WorkProgress");
            if (!fVar6.equals(a15)) {
                return new k.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + fVar6 + "\n Found:\n" + a15);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new f.a("key", "TEXT", true, 1, null, 1));
            hashMap7.put("long_value", new f.a("long_value", "INTEGER", false, 0, null, 1));
            v3.f fVar7 = new v3.f("Preference", hashMap7, new HashSet(0), new HashSet(0));
            v3.f a16 = v3.f.a(bVar, "Preference");
            if (!fVar7.equals(a16)) {
                return new k.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + fVar7 + "\n Found:\n" + a16);
            }
            return new k.b(true, null);
        }

        @Override // androidx.room.k.a
        public void e(x3.b bVar) {
        }
    }
}
