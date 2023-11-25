package i4;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import n4.q;

/* compiled from: SystemJobScheduler.java */
/* loaded from: classes.dex */
public class m implements g4.e {

    /* renamed from: r  reason: collision with root package name */
    private static final String f16959r = androidx.work.l.f("SystemJobScheduler");

    /* renamed from: f  reason: collision with root package name */
    private final Context f16960f;

    /* renamed from: m  reason: collision with root package name */
    private final JobScheduler f16961m;

    /* renamed from: p  reason: collision with root package name */
    private final g4.j f16962p;

    /* renamed from: q  reason: collision with root package name */
    private final l f16963q;

    public m(Context context, g4.j jVar) {
        this(context, jVar, (JobScheduler) context.getSystemService("jobscheduler"), new l(context));
    }

    public static void b(Context context) {
        List<JobInfo> g10;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (g10 = g(context, jobScheduler)) != null && !g10.isEmpty()) {
            Iterator<JobInfo> it = g10.iterator();
            while (it.hasNext()) {
                d(jobScheduler, it.next().getId());
            }
        }
    }

    private static void d(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th) {
            androidx.work.l.c().b(f16959r, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th);
        }
    }

    private static List<Integer> f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g10 = g(context, jobScheduler);
        if (g10 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : g10) {
            if (str.equals(h(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    private static List<JobInfo> g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            androidx.work.l.c().b(f16959r, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static String h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return extras.getString("EXTRA_WORK_SPEC_ID");
                }
                return null;
            } catch (NullPointerException unused) {
                return null;
            }
        }
        return null;
    }

    public static boolean i(Context context, g4.j jVar) {
        int i10;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g10 = g(context, jobScheduler);
        List<String> a10 = jVar.o().y().a();
        boolean z10 = false;
        if (g10 != null) {
            i10 = g10.size();
        } else {
            i10 = 0;
        }
        HashSet hashSet = new HashSet(i10);
        if (g10 != null && !g10.isEmpty()) {
            for (JobInfo jobInfo : g10) {
                String h10 = h(jobInfo);
                if (!TextUtils.isEmpty(h10)) {
                    hashSet.add(h10);
                } else {
                    d(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator<String> it = a10.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (!hashSet.contains(it.next())) {
                androidx.work.l.c().a(f16959r, "Reconciling jobs", new Throwable[0]);
                z10 = true;
                break;
            }
        }
        if (z10) {
            WorkDatabase o10 = jVar.o();
            o10.c();
            try {
                q B = o10.B();
                Iterator<String> it2 = a10.iterator();
                while (it2.hasNext()) {
                    B.c(it2.next(), -1L);
                }
                o10.r();
            } finally {
                o10.g();
            }
        }
        return z10;
    }

    @Override // g4.e
    public void a(n4.p... pVarArr) {
        int d10;
        List<Integer> f10;
        int d11;
        WorkDatabase o10 = this.f16962p.o();
        o4.f fVar = new o4.f(o10);
        for (n4.p pVar : pVarArr) {
            o10.c();
            try {
                n4.p n10 = o10.B().n(pVar.f20192a);
                if (n10 == null) {
                    androidx.work.l.c().h(f16959r, "Skipping scheduling " + pVar.f20192a + " because it's no longer in the DB", new Throwable[0]);
                    o10.r();
                } else if (n10.f20193b != u.a.ENQUEUED) {
                    androidx.work.l.c().h(f16959r, "Skipping scheduling " + pVar.f20192a + " because it is no longer enqueued", new Throwable[0]);
                    o10.r();
                } else {
                    n4.g c10 = o10.y().c(pVar.f20192a);
                    if (c10 != null) {
                        d10 = c10.f20170b;
                    } else {
                        d10 = fVar.d(this.f16962p.i().i(), this.f16962p.i().g());
                    }
                    if (c10 == null) {
                        this.f16962p.o().y().b(new n4.g(pVar.f20192a, d10));
                    }
                    j(pVar, d10);
                    if (Build.VERSION.SDK_INT == 23 && (f10 = f(this.f16960f, this.f16961m, pVar.f20192a)) != null) {
                        int indexOf = f10.indexOf(Integer.valueOf(d10));
                        if (indexOf >= 0) {
                            f10.remove(indexOf);
                        }
                        if (!f10.isEmpty()) {
                            d11 = f10.get(0).intValue();
                        } else {
                            d11 = fVar.d(this.f16962p.i().i(), this.f16962p.i().g());
                        }
                        j(pVar, d11);
                    }
                    o10.r();
                }
                o10.g();
            } catch (Throwable th) {
                o10.g();
                throw th;
            }
        }
    }

    @Override // g4.e
    public boolean c() {
        return true;
    }

    @Override // g4.e
    public void e(String str) {
        List<Integer> f10 = f(this.f16960f, this.f16961m, str);
        if (f10 != null && !f10.isEmpty()) {
            Iterator<Integer> it = f10.iterator();
            while (it.hasNext()) {
                d(this.f16961m, it.next().intValue());
            }
            this.f16962p.o().y().d(str);
        }
    }

    public void j(n4.p pVar, int i10) {
        int i11;
        JobInfo a10 = this.f16963q.a(pVar, i10);
        androidx.work.l c10 = androidx.work.l.c();
        String str = f16959r;
        c10.a(str, String.format("Scheduling work ID %s Job ID %s", pVar.f20192a, Integer.valueOf(i10)), new Throwable[0]);
        try {
            if (this.f16961m.schedule(a10) == 0) {
                androidx.work.l.c().h(str, String.format("Unable to schedule work ID %s", pVar.f20192a), new Throwable[0]);
                if (pVar.f20208q && pVar.f20209r == androidx.work.p.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    pVar.f20208q = false;
                    androidx.work.l.c().a(str, String.format("Scheduling a non-expedited job (work ID %s)", pVar.f20192a), new Throwable[0]);
                    j(pVar, i10);
                }
            }
        } catch (IllegalStateException e10) {
            List<JobInfo> g10 = g(this.f16960f, this.f16961m);
            if (g10 != null) {
                i11 = g10.size();
            } else {
                i11 = 0;
            }
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(i11), Integer.valueOf(this.f16962p.o().B().g().size()), Integer.valueOf(this.f16962p.i().h()));
            androidx.work.l.c().b(f16959r, format, new Throwable[0]);
            throw new IllegalStateException(format, e10);
        } catch (Throwable th) {
            androidx.work.l.c().b(f16959r, String.format("Unable to schedule %s", pVar), th);
        }
    }

    public m(Context context, g4.j jVar, JobScheduler jobScheduler, l lVar) {
        this.f16960f = context;
        this.f16962p = jVar;
        this.f16961m = jobScheduler;
        this.f16963q = lVar;
    }
}
