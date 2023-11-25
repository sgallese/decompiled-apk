package g4;

import android.content.Context;
import android.os.Build;
import androidx.recyclerview.widget.m;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.l;
import i4.m;
import java.util.Iterator;
import java.util.List;
import n4.p;
import n4.q;

/* compiled from: Schedulers.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final String f16126a = l.f("Schedulers");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e a(Context context, j jVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            m mVar = new m(context, jVar);
            o4.g.a(context, SystemJobService.class, true);
            l.c().a(f16126a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return mVar;
        }
        e c10 = c(context);
        if (c10 == null) {
            androidx.work.impl.background.systemalarm.f fVar = new androidx.work.impl.background.systemalarm.f(context);
            o4.g.a(context, SystemAlarmService.class, true);
            l.c().a(f16126a, "Created SystemAlarmScheduler", new Throwable[0]);
            return fVar;
        }
        return c10;
    }

    public static void b(androidx.work.b bVar, WorkDatabase workDatabase, List<e> list) {
        if (list != null && list.size() != 0) {
            q B = workDatabase.B();
            workDatabase.c();
            try {
                List<p> f10 = B.f(bVar.h());
                List<p> t10 = B.t(m.e.DEFAULT_DRAG_ANIMATION_DURATION);
                if (f10 != null && f10.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator<p> it = f10.iterator();
                    while (it.hasNext()) {
                        B.c(it.next().f20192a, currentTimeMillis);
                    }
                }
                workDatabase.r();
                if (f10 != null && f10.size() > 0) {
                    p[] pVarArr = (p[]) f10.toArray(new p[f10.size()]);
                    for (e eVar : list) {
                        if (eVar.c()) {
                            eVar.a(pVarArr);
                        }
                    }
                }
                if (t10 != null && t10.size() > 0) {
                    p[] pVarArr2 = (p[]) t10.toArray(new p[t10.size()]);
                    for (e eVar2 : list) {
                        if (!eVar2.c()) {
                            eVar2.a(pVarArr2);
                        }
                    }
                }
            } finally {
                workDatabase.g();
            }
        }
    }

    private static e c(Context context) {
        try {
            e eVar = (e) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(context);
            l.c().a(f16126a, String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler"), new Throwable[0]);
            return eVar;
        } catch (Throwable th) {
            l.c().a(f16126a, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}
