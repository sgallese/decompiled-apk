package n4;

import android.database.Cursor;
import androidx.work.u;
import java.util.ArrayList;
import java.util.List;
import n4.p;

/* compiled from: WorkSpecDao_Impl.java */
/* loaded from: classes.dex */
public final class r implements q {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.room.i f20218a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.room.b<p> f20219b;

    /* renamed from: c  reason: collision with root package name */
    private final androidx.room.o f20220c;

    /* renamed from: d  reason: collision with root package name */
    private final androidx.room.o f20221d;

    /* renamed from: e  reason: collision with root package name */
    private final androidx.room.o f20222e;

    /* renamed from: f  reason: collision with root package name */
    private final androidx.room.o f20223f;

    /* renamed from: g  reason: collision with root package name */
    private final androidx.room.o f20224g;

    /* renamed from: h  reason: collision with root package name */
    private final androidx.room.o f20225h;

    /* renamed from: i  reason: collision with root package name */
    private final androidx.room.o f20226i;

    /* renamed from: j  reason: collision with root package name */
    private final androidx.room.o f20227j;

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class a extends androidx.room.b<p> {
        a(androidx.room.i iVar) {
            super(iVar);
        }

        @Override // androidx.room.o
        public String d() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.b
        /* renamed from: i  reason: merged with bridge method [inline-methods] */
        public void g(x3.f fVar, p pVar) {
            String str = pVar.f20192a;
            if (str == null) {
                fVar.r0(1);
            } else {
                fVar.p(1, str);
            }
            fVar.N(2, v.j(pVar.f20193b));
            String str2 = pVar.f20194c;
            if (str2 == null) {
                fVar.r0(3);
            } else {
                fVar.p(3, str2);
            }
            String str3 = pVar.f20195d;
            if (str3 == null) {
                fVar.r0(4);
            } else {
                fVar.p(4, str3);
            }
            byte[] k10 = androidx.work.e.k(pVar.f20196e);
            if (k10 == null) {
                fVar.r0(5);
            } else {
                fVar.U(5, k10);
            }
            byte[] k11 = androidx.work.e.k(pVar.f20197f);
            if (k11 == null) {
                fVar.r0(6);
            } else {
                fVar.U(6, k11);
            }
            fVar.N(7, pVar.f20198g);
            fVar.N(8, pVar.f20199h);
            fVar.N(9, pVar.f20200i);
            fVar.N(10, pVar.f20202k);
            fVar.N(11, v.a(pVar.f20203l));
            fVar.N(12, pVar.f20204m);
            fVar.N(13, pVar.f20205n);
            fVar.N(14, pVar.f20206o);
            fVar.N(15, pVar.f20207p);
            fVar.N(16, pVar.f20208q ? 1L : 0L);
            fVar.N(17, v.i(pVar.f20209r));
            androidx.work.c cVar = pVar.f20201j;
            if (cVar != null) {
                fVar.N(18, v.h(cVar.b()));
                fVar.N(19, cVar.g() ? 1L : 0L);
                fVar.N(20, cVar.h() ? 1L : 0L);
                fVar.N(21, cVar.f() ? 1L : 0L);
                fVar.N(22, cVar.i() ? 1L : 0L);
                fVar.N(23, cVar.c());
                fVar.N(24, cVar.d());
                byte[] c10 = v.c(cVar.a());
                if (c10 == null) {
                    fVar.r0(25);
                    return;
                } else {
                    fVar.U(25, c10);
                    return;
                }
            }
            fVar.r0(18);
            fVar.r0(19);
            fVar.r0(20);
            fVar.r0(21);
            fVar.r0(22);
            fVar.r0(23);
            fVar.r0(24);
            fVar.r0(25);
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class b extends androidx.room.o {
        b(androidx.room.i iVar) {
            super(iVar);
        }

        @Override // androidx.room.o
        public String d() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class c extends androidx.room.o {
        c(androidx.room.i iVar) {
            super(iVar);
        }

        @Override // androidx.room.o
        public String d() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class d extends androidx.room.o {
        d(androidx.room.i iVar) {
            super(iVar);
        }

        @Override // androidx.room.o
        public String d() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class e extends androidx.room.o {
        e(androidx.room.i iVar) {
            super(iVar);
        }

        @Override // androidx.room.o
        public String d() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class f extends androidx.room.o {
        f(androidx.room.i iVar) {
            super(iVar);
        }

        @Override // androidx.room.o
        public String d() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class g extends androidx.room.o {
        g(androidx.room.i iVar) {
            super(iVar);
        }

        @Override // androidx.room.o
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class h extends androidx.room.o {
        h(androidx.room.i iVar) {
            super(iVar);
        }

        @Override // androidx.room.o
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class i extends androidx.room.o {
        i(androidx.room.i iVar) {
            super(iVar);
        }

        @Override // androidx.room.o
        public String d() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public r(androidx.room.i iVar) {
        this.f20218a = iVar;
        this.f20219b = new a(iVar);
        this.f20220c = new b(iVar);
        this.f20221d = new c(iVar);
        this.f20222e = new d(iVar);
        this.f20223f = new e(iVar);
        this.f20224g = new f(iVar);
        this.f20225h = new g(iVar);
        this.f20226i = new h(iVar);
        this.f20227j = new i(iVar);
    }

    @Override // n4.q
    public void a(String str) {
        this.f20218a.b();
        x3.f a10 = this.f20220c.a();
        if (str == null) {
            a10.r0(1);
        } else {
            a10.p(1, str);
        }
        this.f20218a.c();
        try {
            a10.u();
            this.f20218a.r();
        } finally {
            this.f20218a.g();
            this.f20220c.f(a10);
        }
    }

    @Override // n4.q
    public int b(u.a aVar, String... strArr) {
        this.f20218a.b();
        StringBuilder b10 = v3.e.b();
        b10.append("UPDATE workspec SET state=");
        b10.append("?");
        b10.append(" WHERE id IN (");
        v3.e.a(b10, strArr.length);
        b10.append(")");
        x3.f d10 = this.f20218a.d(b10.toString());
        d10.N(1, v.j(aVar));
        int i10 = 2;
        for (String str : strArr) {
            if (str == null) {
                d10.r0(i10);
            } else {
                d10.p(i10, str);
            }
            i10++;
        }
        this.f20218a.c();
        try {
            int u10 = d10.u();
            this.f20218a.r();
            return u10;
        } finally {
            this.f20218a.g();
        }
    }

    @Override // n4.q
    public int c(String str, long j10) {
        this.f20218a.b();
        x3.f a10 = this.f20225h.a();
        a10.N(1, j10);
        if (str == null) {
            a10.r0(2);
        } else {
            a10.p(2, str);
        }
        this.f20218a.c();
        try {
            int u10 = a10.u();
            this.f20218a.r();
            return u10;
        } finally {
            this.f20218a.g();
            this.f20225h.f(a10);
        }
    }

    @Override // n4.q
    public List<p.b> d(String str) {
        androidx.room.l d10 = androidx.room.l.d("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            d10.r0(1);
        } else {
            d10.p(1, str);
        }
        this.f20218a.b();
        Cursor b10 = v3.c.b(this.f20218a, d10, false, null);
        try {
            int b11 = v3.b.b(b10, "id");
            int b12 = v3.b.b(b10, "state");
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                p.b bVar = new p.b();
                bVar.f20210a = b10.getString(b11);
                bVar.f20211b = v.g(b10.getInt(b12));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            b10.close();
            d10.release();
        }
    }

    @Override // n4.q
    public List<p> e(long j10) {
        androidx.room.l lVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        androidx.room.l d10 = androidx.room.l.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        d10.N(1, j10);
        this.f20218a.b();
        Cursor b10 = v3.c.b(this.f20218a, d10, false, null);
        try {
            int b11 = v3.b.b(b10, "required_network_type");
            int b12 = v3.b.b(b10, "requires_charging");
            int b13 = v3.b.b(b10, "requires_device_idle");
            int b14 = v3.b.b(b10, "requires_battery_not_low");
            int b15 = v3.b.b(b10, "requires_storage_not_low");
            int b16 = v3.b.b(b10, "trigger_content_update_delay");
            int b17 = v3.b.b(b10, "trigger_max_content_delay");
            int b18 = v3.b.b(b10, "content_uri_triggers");
            int b19 = v3.b.b(b10, "id");
            int b20 = v3.b.b(b10, "state");
            int b21 = v3.b.b(b10, "worker_class_name");
            int b22 = v3.b.b(b10, "input_merger_class_name");
            int b23 = v3.b.b(b10, "input");
            int b24 = v3.b.b(b10, "output");
            lVar = d10;
            try {
                int b25 = v3.b.b(b10, "initial_delay");
                int b26 = v3.b.b(b10, "interval_duration");
                int b27 = v3.b.b(b10, "flex_duration");
                int b28 = v3.b.b(b10, "run_attempt_count");
                int b29 = v3.b.b(b10, "backoff_policy");
                int b30 = v3.b.b(b10, "backoff_delay_duration");
                int b31 = v3.b.b(b10, "period_start_time");
                int b32 = v3.b.b(b10, "minimum_retention_duration");
                int b33 = v3.b.b(b10, "schedule_requested_at");
                int b34 = v3.b.b(b10, "run_in_foreground");
                int b35 = v3.b.b(b10, "out_of_quota_policy");
                int i10 = b24;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.getString(b19);
                    int i11 = b19;
                    String string2 = b10.getString(b21);
                    int i12 = b21;
                    androidx.work.c cVar = new androidx.work.c();
                    int i13 = b11;
                    cVar.k(v.e(b10.getInt(b11)));
                    if (b10.getInt(b12) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cVar.m(z10);
                    if (b10.getInt(b13) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cVar.n(z11);
                    if (b10.getInt(b14) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    cVar.l(z12);
                    if (b10.getInt(b15) != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    cVar.o(z13);
                    int i14 = b12;
                    int i15 = b13;
                    cVar.p(b10.getLong(b16));
                    cVar.q(b10.getLong(b17));
                    cVar.j(v.b(b10.getBlob(b18)));
                    p pVar = new p(string, string2);
                    pVar.f20193b = v.g(b10.getInt(b20));
                    pVar.f20195d = b10.getString(b22);
                    pVar.f20196e = androidx.work.e.g(b10.getBlob(b23));
                    int i16 = i10;
                    pVar.f20197f = androidx.work.e.g(b10.getBlob(i16));
                    int i17 = b25;
                    i10 = i16;
                    pVar.f20198g = b10.getLong(i17);
                    int i18 = b22;
                    int i19 = b26;
                    pVar.f20199h = b10.getLong(i19);
                    int i20 = b14;
                    int i21 = b27;
                    pVar.f20200i = b10.getLong(i21);
                    int i22 = b28;
                    pVar.f20202k = b10.getInt(i22);
                    int i23 = b29;
                    pVar.f20203l = v.d(b10.getInt(i23));
                    b27 = i21;
                    int i24 = b30;
                    pVar.f20204m = b10.getLong(i24);
                    int i25 = b31;
                    pVar.f20205n = b10.getLong(i25);
                    b31 = i25;
                    int i26 = b32;
                    pVar.f20206o = b10.getLong(i26);
                    int i27 = b33;
                    pVar.f20207p = b10.getLong(i27);
                    int i28 = b34;
                    if (b10.getInt(i28) != 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    pVar.f20208q = z14;
                    int i29 = b35;
                    pVar.f20209r = v.f(b10.getInt(i29));
                    pVar.f20201j = cVar;
                    arrayList.add(pVar);
                    b12 = i14;
                    b35 = i29;
                    b22 = i18;
                    b25 = i17;
                    b26 = i19;
                    b28 = i22;
                    b33 = i27;
                    b19 = i11;
                    b21 = i12;
                    b11 = i13;
                    b34 = i28;
                    b32 = i26;
                    b13 = i15;
                    b30 = i24;
                    b14 = i20;
                    b29 = i23;
                }
                b10.close();
                lVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b10.close();
                lVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            lVar = d10;
        }
    }

    @Override // n4.q
    public List<p> f(int i10) {
        androidx.room.l lVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        androidx.room.l d10 = androidx.room.l.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        d10.N(1, i10);
        this.f20218a.b();
        Cursor b10 = v3.c.b(this.f20218a, d10, false, null);
        try {
            int b11 = v3.b.b(b10, "required_network_type");
            int b12 = v3.b.b(b10, "requires_charging");
            int b13 = v3.b.b(b10, "requires_device_idle");
            int b14 = v3.b.b(b10, "requires_battery_not_low");
            int b15 = v3.b.b(b10, "requires_storage_not_low");
            int b16 = v3.b.b(b10, "trigger_content_update_delay");
            int b17 = v3.b.b(b10, "trigger_max_content_delay");
            int b18 = v3.b.b(b10, "content_uri_triggers");
            int b19 = v3.b.b(b10, "id");
            int b20 = v3.b.b(b10, "state");
            int b21 = v3.b.b(b10, "worker_class_name");
            int b22 = v3.b.b(b10, "input_merger_class_name");
            int b23 = v3.b.b(b10, "input");
            int b24 = v3.b.b(b10, "output");
            lVar = d10;
            try {
                int b25 = v3.b.b(b10, "initial_delay");
                int b26 = v3.b.b(b10, "interval_duration");
                int b27 = v3.b.b(b10, "flex_duration");
                int b28 = v3.b.b(b10, "run_attempt_count");
                int b29 = v3.b.b(b10, "backoff_policy");
                int b30 = v3.b.b(b10, "backoff_delay_duration");
                int b31 = v3.b.b(b10, "period_start_time");
                int b32 = v3.b.b(b10, "minimum_retention_duration");
                int b33 = v3.b.b(b10, "schedule_requested_at");
                int b34 = v3.b.b(b10, "run_in_foreground");
                int b35 = v3.b.b(b10, "out_of_quota_policy");
                int i11 = b24;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.getString(b19);
                    int i12 = b19;
                    String string2 = b10.getString(b21);
                    int i13 = b21;
                    androidx.work.c cVar = new androidx.work.c();
                    int i14 = b11;
                    cVar.k(v.e(b10.getInt(b11)));
                    if (b10.getInt(b12) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cVar.m(z10);
                    if (b10.getInt(b13) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cVar.n(z11);
                    if (b10.getInt(b14) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    cVar.l(z12);
                    if (b10.getInt(b15) != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    cVar.o(z13);
                    int i15 = b12;
                    int i16 = b13;
                    cVar.p(b10.getLong(b16));
                    cVar.q(b10.getLong(b17));
                    cVar.j(v.b(b10.getBlob(b18)));
                    p pVar = new p(string, string2);
                    pVar.f20193b = v.g(b10.getInt(b20));
                    pVar.f20195d = b10.getString(b22);
                    pVar.f20196e = androidx.work.e.g(b10.getBlob(b23));
                    int i17 = i11;
                    pVar.f20197f = androidx.work.e.g(b10.getBlob(i17));
                    i11 = i17;
                    int i18 = b25;
                    pVar.f20198g = b10.getLong(i18);
                    int i19 = b22;
                    int i20 = b26;
                    pVar.f20199h = b10.getLong(i20);
                    int i21 = b14;
                    int i22 = b27;
                    pVar.f20200i = b10.getLong(i22);
                    int i23 = b28;
                    pVar.f20202k = b10.getInt(i23);
                    int i24 = b29;
                    pVar.f20203l = v.d(b10.getInt(i24));
                    b27 = i22;
                    int i25 = b30;
                    pVar.f20204m = b10.getLong(i25);
                    int i26 = b31;
                    pVar.f20205n = b10.getLong(i26);
                    b31 = i26;
                    int i27 = b32;
                    pVar.f20206o = b10.getLong(i27);
                    int i28 = b33;
                    pVar.f20207p = b10.getLong(i28);
                    int i29 = b34;
                    if (b10.getInt(i29) != 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    pVar.f20208q = z14;
                    int i30 = b35;
                    pVar.f20209r = v.f(b10.getInt(i30));
                    pVar.f20201j = cVar;
                    arrayList.add(pVar);
                    b35 = i30;
                    b12 = i15;
                    b22 = i19;
                    b25 = i18;
                    b26 = i20;
                    b28 = i23;
                    b33 = i28;
                    b19 = i12;
                    b21 = i13;
                    b11 = i14;
                    b34 = i29;
                    b32 = i27;
                    b13 = i16;
                    b30 = i25;
                    b14 = i21;
                    b29 = i24;
                }
                b10.close();
                lVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b10.close();
                lVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            lVar = d10;
        }
    }

    @Override // n4.q
    public List<p> g() {
        androidx.room.l lVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        androidx.room.l d10 = androidx.room.l.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f20218a.b();
        Cursor b10 = v3.c.b(this.f20218a, d10, false, null);
        try {
            int b11 = v3.b.b(b10, "required_network_type");
            int b12 = v3.b.b(b10, "requires_charging");
            int b13 = v3.b.b(b10, "requires_device_idle");
            int b14 = v3.b.b(b10, "requires_battery_not_low");
            int b15 = v3.b.b(b10, "requires_storage_not_low");
            int b16 = v3.b.b(b10, "trigger_content_update_delay");
            int b17 = v3.b.b(b10, "trigger_max_content_delay");
            int b18 = v3.b.b(b10, "content_uri_triggers");
            int b19 = v3.b.b(b10, "id");
            int b20 = v3.b.b(b10, "state");
            int b21 = v3.b.b(b10, "worker_class_name");
            int b22 = v3.b.b(b10, "input_merger_class_name");
            int b23 = v3.b.b(b10, "input");
            int b24 = v3.b.b(b10, "output");
            lVar = d10;
            try {
                int b25 = v3.b.b(b10, "initial_delay");
                int b26 = v3.b.b(b10, "interval_duration");
                int b27 = v3.b.b(b10, "flex_duration");
                int b28 = v3.b.b(b10, "run_attempt_count");
                int b29 = v3.b.b(b10, "backoff_policy");
                int b30 = v3.b.b(b10, "backoff_delay_duration");
                int b31 = v3.b.b(b10, "period_start_time");
                int b32 = v3.b.b(b10, "minimum_retention_duration");
                int b33 = v3.b.b(b10, "schedule_requested_at");
                int b34 = v3.b.b(b10, "run_in_foreground");
                int b35 = v3.b.b(b10, "out_of_quota_policy");
                int i10 = b24;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.getString(b19);
                    int i11 = b19;
                    String string2 = b10.getString(b21);
                    int i12 = b21;
                    androidx.work.c cVar = new androidx.work.c();
                    int i13 = b11;
                    cVar.k(v.e(b10.getInt(b11)));
                    if (b10.getInt(b12) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cVar.m(z10);
                    if (b10.getInt(b13) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cVar.n(z11);
                    if (b10.getInt(b14) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    cVar.l(z12);
                    if (b10.getInt(b15) != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    cVar.o(z13);
                    int i14 = b12;
                    int i15 = b13;
                    cVar.p(b10.getLong(b16));
                    cVar.q(b10.getLong(b17));
                    cVar.j(v.b(b10.getBlob(b18)));
                    p pVar = new p(string, string2);
                    pVar.f20193b = v.g(b10.getInt(b20));
                    pVar.f20195d = b10.getString(b22);
                    pVar.f20196e = androidx.work.e.g(b10.getBlob(b23));
                    int i16 = i10;
                    pVar.f20197f = androidx.work.e.g(b10.getBlob(i16));
                    i10 = i16;
                    int i17 = b25;
                    pVar.f20198g = b10.getLong(i17);
                    int i18 = b23;
                    int i19 = b26;
                    pVar.f20199h = b10.getLong(i19);
                    int i20 = b14;
                    int i21 = b27;
                    pVar.f20200i = b10.getLong(i21);
                    int i22 = b28;
                    pVar.f20202k = b10.getInt(i22);
                    int i23 = b29;
                    pVar.f20203l = v.d(b10.getInt(i23));
                    b27 = i21;
                    int i24 = b30;
                    pVar.f20204m = b10.getLong(i24);
                    int i25 = b31;
                    pVar.f20205n = b10.getLong(i25);
                    b31 = i25;
                    int i26 = b32;
                    pVar.f20206o = b10.getLong(i26);
                    int i27 = b33;
                    pVar.f20207p = b10.getLong(i27);
                    int i28 = b34;
                    if (b10.getInt(i28) != 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    pVar.f20208q = z14;
                    int i29 = b35;
                    pVar.f20209r = v.f(b10.getInt(i29));
                    pVar.f20201j = cVar;
                    arrayList.add(pVar);
                    b35 = i29;
                    b12 = i14;
                    b23 = i18;
                    b25 = i17;
                    b26 = i19;
                    b28 = i22;
                    b33 = i27;
                    b19 = i11;
                    b21 = i12;
                    b11 = i13;
                    b34 = i28;
                    b32 = i26;
                    b13 = i15;
                    b30 = i24;
                    b14 = i20;
                    b29 = i23;
                }
                b10.close();
                lVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b10.close();
                lVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            lVar = d10;
        }
    }

    @Override // n4.q
    public void h(String str, androidx.work.e eVar) {
        this.f20218a.b();
        x3.f a10 = this.f20221d.a();
        byte[] k10 = androidx.work.e.k(eVar);
        if (k10 == null) {
            a10.r0(1);
        } else {
            a10.U(1, k10);
        }
        if (str == null) {
            a10.r0(2);
        } else {
            a10.p(2, str);
        }
        this.f20218a.c();
        try {
            a10.u();
            this.f20218a.r();
        } finally {
            this.f20218a.g();
            this.f20221d.f(a10);
        }
    }

    @Override // n4.q
    public void i(p pVar) {
        this.f20218a.b();
        this.f20218a.c();
        try {
            this.f20219b.h(pVar);
            this.f20218a.r();
        } finally {
            this.f20218a.g();
        }
    }

    @Override // n4.q
    public List<p> j() {
        androidx.room.l lVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        androidx.room.l d10 = androidx.room.l.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f20218a.b();
        Cursor b10 = v3.c.b(this.f20218a, d10, false, null);
        try {
            int b11 = v3.b.b(b10, "required_network_type");
            int b12 = v3.b.b(b10, "requires_charging");
            int b13 = v3.b.b(b10, "requires_device_idle");
            int b14 = v3.b.b(b10, "requires_battery_not_low");
            int b15 = v3.b.b(b10, "requires_storage_not_low");
            int b16 = v3.b.b(b10, "trigger_content_update_delay");
            int b17 = v3.b.b(b10, "trigger_max_content_delay");
            int b18 = v3.b.b(b10, "content_uri_triggers");
            int b19 = v3.b.b(b10, "id");
            int b20 = v3.b.b(b10, "state");
            int b21 = v3.b.b(b10, "worker_class_name");
            int b22 = v3.b.b(b10, "input_merger_class_name");
            int b23 = v3.b.b(b10, "input");
            int b24 = v3.b.b(b10, "output");
            lVar = d10;
            try {
                int b25 = v3.b.b(b10, "initial_delay");
                int b26 = v3.b.b(b10, "interval_duration");
                int b27 = v3.b.b(b10, "flex_duration");
                int b28 = v3.b.b(b10, "run_attempt_count");
                int b29 = v3.b.b(b10, "backoff_policy");
                int b30 = v3.b.b(b10, "backoff_delay_duration");
                int b31 = v3.b.b(b10, "period_start_time");
                int b32 = v3.b.b(b10, "minimum_retention_duration");
                int b33 = v3.b.b(b10, "schedule_requested_at");
                int b34 = v3.b.b(b10, "run_in_foreground");
                int b35 = v3.b.b(b10, "out_of_quota_policy");
                int i10 = b24;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.getString(b19);
                    int i11 = b19;
                    String string2 = b10.getString(b21);
                    int i12 = b21;
                    androidx.work.c cVar = new androidx.work.c();
                    int i13 = b11;
                    cVar.k(v.e(b10.getInt(b11)));
                    if (b10.getInt(b12) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cVar.m(z10);
                    if (b10.getInt(b13) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cVar.n(z11);
                    if (b10.getInt(b14) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    cVar.l(z12);
                    if (b10.getInt(b15) != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    cVar.o(z13);
                    int i14 = b12;
                    int i15 = b13;
                    cVar.p(b10.getLong(b16));
                    cVar.q(b10.getLong(b17));
                    cVar.j(v.b(b10.getBlob(b18)));
                    p pVar = new p(string, string2);
                    pVar.f20193b = v.g(b10.getInt(b20));
                    pVar.f20195d = b10.getString(b22);
                    pVar.f20196e = androidx.work.e.g(b10.getBlob(b23));
                    int i16 = i10;
                    pVar.f20197f = androidx.work.e.g(b10.getBlob(i16));
                    i10 = i16;
                    int i17 = b25;
                    pVar.f20198g = b10.getLong(i17);
                    int i18 = b23;
                    int i19 = b26;
                    pVar.f20199h = b10.getLong(i19);
                    int i20 = b14;
                    int i21 = b27;
                    pVar.f20200i = b10.getLong(i21);
                    int i22 = b28;
                    pVar.f20202k = b10.getInt(i22);
                    int i23 = b29;
                    pVar.f20203l = v.d(b10.getInt(i23));
                    b27 = i21;
                    int i24 = b30;
                    pVar.f20204m = b10.getLong(i24);
                    int i25 = b31;
                    pVar.f20205n = b10.getLong(i25);
                    b31 = i25;
                    int i26 = b32;
                    pVar.f20206o = b10.getLong(i26);
                    int i27 = b33;
                    pVar.f20207p = b10.getLong(i27);
                    int i28 = b34;
                    if (b10.getInt(i28) != 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    pVar.f20208q = z14;
                    int i29 = b35;
                    pVar.f20209r = v.f(b10.getInt(i29));
                    pVar.f20201j = cVar;
                    arrayList.add(pVar);
                    b35 = i29;
                    b12 = i14;
                    b23 = i18;
                    b25 = i17;
                    b26 = i19;
                    b28 = i22;
                    b33 = i27;
                    b19 = i11;
                    b21 = i12;
                    b11 = i13;
                    b34 = i28;
                    b32 = i26;
                    b13 = i15;
                    b30 = i24;
                    b14 = i20;
                    b29 = i23;
                }
                b10.close();
                lVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b10.close();
                lVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            lVar = d10;
        }
    }

    @Override // n4.q
    public boolean k() {
        boolean z10 = false;
        androidx.room.l d10 = androidx.room.l.d("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f20218a.b();
        Cursor b10 = v3.c.b(this.f20218a, d10, false, null);
        try {
            if (b10.moveToFirst()) {
                if (b10.getInt(0) != 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            b10.close();
            d10.release();
        }
    }

    @Override // n4.q
    public List<String> l(String str) {
        androidx.room.l d10 = androidx.room.l.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            d10.r0(1);
        } else {
            d10.p(1, str);
        }
        this.f20218a.b();
        Cursor b10 = v3.c.b(this.f20218a, d10, false, null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(b10.getString(0));
            }
            return arrayList;
        } finally {
            b10.close();
            d10.release();
        }
    }

    @Override // n4.q
    public u.a m(String str) {
        androidx.room.l d10 = androidx.room.l.d("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            d10.r0(1);
        } else {
            d10.p(1, str);
        }
        this.f20218a.b();
        u.a aVar = null;
        Cursor b10 = v3.c.b(this.f20218a, d10, false, null);
        try {
            if (b10.moveToFirst()) {
                aVar = v.g(b10.getInt(0));
            }
            return aVar;
        } finally {
            b10.close();
            d10.release();
        }
    }

    @Override // n4.q
    public p n(String str) {
        androidx.room.l lVar;
        p pVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        androidx.room.l d10 = androidx.room.l.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            d10.r0(1);
        } else {
            d10.p(1, str);
        }
        this.f20218a.b();
        Cursor b10 = v3.c.b(this.f20218a, d10, false, null);
        try {
            int b11 = v3.b.b(b10, "required_network_type");
            int b12 = v3.b.b(b10, "requires_charging");
            int b13 = v3.b.b(b10, "requires_device_idle");
            int b14 = v3.b.b(b10, "requires_battery_not_low");
            int b15 = v3.b.b(b10, "requires_storage_not_low");
            int b16 = v3.b.b(b10, "trigger_content_update_delay");
            int b17 = v3.b.b(b10, "trigger_max_content_delay");
            int b18 = v3.b.b(b10, "content_uri_triggers");
            int b19 = v3.b.b(b10, "id");
            int b20 = v3.b.b(b10, "state");
            int b21 = v3.b.b(b10, "worker_class_name");
            int b22 = v3.b.b(b10, "input_merger_class_name");
            int b23 = v3.b.b(b10, "input");
            int b24 = v3.b.b(b10, "output");
            lVar = d10;
            try {
                int b25 = v3.b.b(b10, "initial_delay");
                int b26 = v3.b.b(b10, "interval_duration");
                int b27 = v3.b.b(b10, "flex_duration");
                int b28 = v3.b.b(b10, "run_attempt_count");
                int b29 = v3.b.b(b10, "backoff_policy");
                int b30 = v3.b.b(b10, "backoff_delay_duration");
                int b31 = v3.b.b(b10, "period_start_time");
                int b32 = v3.b.b(b10, "minimum_retention_duration");
                int b33 = v3.b.b(b10, "schedule_requested_at");
                int b34 = v3.b.b(b10, "run_in_foreground");
                int b35 = v3.b.b(b10, "out_of_quota_policy");
                if (b10.moveToFirst()) {
                    String string = b10.getString(b19);
                    String string2 = b10.getString(b21);
                    androidx.work.c cVar = new androidx.work.c();
                    cVar.k(v.e(b10.getInt(b11)));
                    if (b10.getInt(b12) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cVar.m(z10);
                    if (b10.getInt(b13) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cVar.n(z11);
                    if (b10.getInt(b14) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    cVar.l(z12);
                    if (b10.getInt(b15) != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    cVar.o(z13);
                    cVar.p(b10.getLong(b16));
                    cVar.q(b10.getLong(b17));
                    cVar.j(v.b(b10.getBlob(b18)));
                    p pVar2 = new p(string, string2);
                    pVar2.f20193b = v.g(b10.getInt(b20));
                    pVar2.f20195d = b10.getString(b22);
                    pVar2.f20196e = androidx.work.e.g(b10.getBlob(b23));
                    pVar2.f20197f = androidx.work.e.g(b10.getBlob(b24));
                    pVar2.f20198g = b10.getLong(b25);
                    pVar2.f20199h = b10.getLong(b26);
                    pVar2.f20200i = b10.getLong(b27);
                    pVar2.f20202k = b10.getInt(b28);
                    pVar2.f20203l = v.d(b10.getInt(b29));
                    pVar2.f20204m = b10.getLong(b30);
                    pVar2.f20205n = b10.getLong(b31);
                    pVar2.f20206o = b10.getLong(b32);
                    pVar2.f20207p = b10.getLong(b33);
                    if (b10.getInt(b34) != 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    pVar2.f20208q = z14;
                    pVar2.f20209r = v.f(b10.getInt(b35));
                    pVar2.f20201j = cVar;
                    pVar = pVar2;
                } else {
                    pVar = null;
                }
                b10.close();
                lVar.release();
                return pVar;
            } catch (Throwable th) {
                th = th;
                b10.close();
                lVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            lVar = d10;
        }
    }

    @Override // n4.q
    public int o(String str) {
        this.f20218a.b();
        x3.f a10 = this.f20224g.a();
        if (str == null) {
            a10.r0(1);
        } else {
            a10.p(1, str);
        }
        this.f20218a.c();
        try {
            int u10 = a10.u();
            this.f20218a.r();
            return u10;
        } finally {
            this.f20218a.g();
            this.f20224g.f(a10);
        }
    }

    @Override // n4.q
    public List<String> p(String str) {
        androidx.room.l d10 = androidx.room.l.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            d10.r0(1);
        } else {
            d10.p(1, str);
        }
        this.f20218a.b();
        Cursor b10 = v3.c.b(this.f20218a, d10, false, null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(b10.getString(0));
            }
            return arrayList;
        } finally {
            b10.close();
            d10.release();
        }
    }

    @Override // n4.q
    public List<androidx.work.e> q(String str) {
        androidx.room.l d10 = androidx.room.l.d("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            d10.r0(1);
        } else {
            d10.p(1, str);
        }
        this.f20218a.b();
        Cursor b10 = v3.c.b(this.f20218a, d10, false, null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(androidx.work.e.g(b10.getBlob(0)));
            }
            return arrayList;
        } finally {
            b10.close();
            d10.release();
        }
    }

    @Override // n4.q
    public int r(String str) {
        this.f20218a.b();
        x3.f a10 = this.f20223f.a();
        if (str == null) {
            a10.r0(1);
        } else {
            a10.p(1, str);
        }
        this.f20218a.c();
        try {
            int u10 = a10.u();
            this.f20218a.r();
            return u10;
        } finally {
            this.f20218a.g();
            this.f20223f.f(a10);
        }
    }

    @Override // n4.q
    public void s(String str, long j10) {
        this.f20218a.b();
        x3.f a10 = this.f20222e.a();
        a10.N(1, j10);
        if (str == null) {
            a10.r0(2);
        } else {
            a10.p(2, str);
        }
        this.f20218a.c();
        try {
            a10.u();
            this.f20218a.r();
        } finally {
            this.f20218a.g();
            this.f20222e.f(a10);
        }
    }

    @Override // n4.q
    public List<p> t(int i10) {
        androidx.room.l lVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        androidx.room.l d10 = androidx.room.l.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        d10.N(1, i10);
        this.f20218a.b();
        Cursor b10 = v3.c.b(this.f20218a, d10, false, null);
        try {
            int b11 = v3.b.b(b10, "required_network_type");
            int b12 = v3.b.b(b10, "requires_charging");
            int b13 = v3.b.b(b10, "requires_device_idle");
            int b14 = v3.b.b(b10, "requires_battery_not_low");
            int b15 = v3.b.b(b10, "requires_storage_not_low");
            int b16 = v3.b.b(b10, "trigger_content_update_delay");
            int b17 = v3.b.b(b10, "trigger_max_content_delay");
            int b18 = v3.b.b(b10, "content_uri_triggers");
            int b19 = v3.b.b(b10, "id");
            int b20 = v3.b.b(b10, "state");
            int b21 = v3.b.b(b10, "worker_class_name");
            int b22 = v3.b.b(b10, "input_merger_class_name");
            int b23 = v3.b.b(b10, "input");
            int b24 = v3.b.b(b10, "output");
            lVar = d10;
            try {
                int b25 = v3.b.b(b10, "initial_delay");
                int b26 = v3.b.b(b10, "interval_duration");
                int b27 = v3.b.b(b10, "flex_duration");
                int b28 = v3.b.b(b10, "run_attempt_count");
                int b29 = v3.b.b(b10, "backoff_policy");
                int b30 = v3.b.b(b10, "backoff_delay_duration");
                int b31 = v3.b.b(b10, "period_start_time");
                int b32 = v3.b.b(b10, "minimum_retention_duration");
                int b33 = v3.b.b(b10, "schedule_requested_at");
                int b34 = v3.b.b(b10, "run_in_foreground");
                int b35 = v3.b.b(b10, "out_of_quota_policy");
                int i11 = b24;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.getString(b19);
                    int i12 = b19;
                    String string2 = b10.getString(b21);
                    int i13 = b21;
                    androidx.work.c cVar = new androidx.work.c();
                    int i14 = b11;
                    cVar.k(v.e(b10.getInt(b11)));
                    if (b10.getInt(b12) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cVar.m(z10);
                    if (b10.getInt(b13) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cVar.n(z11);
                    if (b10.getInt(b14) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    cVar.l(z12);
                    if (b10.getInt(b15) != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    cVar.o(z13);
                    int i15 = b12;
                    int i16 = b13;
                    cVar.p(b10.getLong(b16));
                    cVar.q(b10.getLong(b17));
                    cVar.j(v.b(b10.getBlob(b18)));
                    p pVar = new p(string, string2);
                    pVar.f20193b = v.g(b10.getInt(b20));
                    pVar.f20195d = b10.getString(b22);
                    pVar.f20196e = androidx.work.e.g(b10.getBlob(b23));
                    int i17 = i11;
                    pVar.f20197f = androidx.work.e.g(b10.getBlob(i17));
                    i11 = i17;
                    int i18 = b25;
                    pVar.f20198g = b10.getLong(i18);
                    int i19 = b22;
                    int i20 = b26;
                    pVar.f20199h = b10.getLong(i20);
                    int i21 = b14;
                    int i22 = b27;
                    pVar.f20200i = b10.getLong(i22);
                    int i23 = b28;
                    pVar.f20202k = b10.getInt(i23);
                    int i24 = b29;
                    pVar.f20203l = v.d(b10.getInt(i24));
                    b27 = i22;
                    int i25 = b30;
                    pVar.f20204m = b10.getLong(i25);
                    int i26 = b31;
                    pVar.f20205n = b10.getLong(i26);
                    b31 = i26;
                    int i27 = b32;
                    pVar.f20206o = b10.getLong(i27);
                    int i28 = b33;
                    pVar.f20207p = b10.getLong(i28);
                    int i29 = b34;
                    if (b10.getInt(i29) != 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    pVar.f20208q = z14;
                    int i30 = b35;
                    pVar.f20209r = v.f(b10.getInt(i30));
                    pVar.f20201j = cVar;
                    arrayList.add(pVar);
                    b35 = i30;
                    b12 = i15;
                    b22 = i19;
                    b25 = i18;
                    b26 = i20;
                    b28 = i23;
                    b33 = i28;
                    b19 = i12;
                    b21 = i13;
                    b11 = i14;
                    b34 = i29;
                    b32 = i27;
                    b13 = i16;
                    b30 = i25;
                    b14 = i21;
                    b29 = i24;
                }
                b10.close();
                lVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b10.close();
                lVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            lVar = d10;
        }
    }

    @Override // n4.q
    public int u() {
        this.f20218a.b();
        x3.f a10 = this.f20226i.a();
        this.f20218a.c();
        try {
            int u10 = a10.u();
            this.f20218a.r();
            return u10;
        } finally {
            this.f20218a.g();
            this.f20226i.f(a10);
        }
    }
}
