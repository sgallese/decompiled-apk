package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.recyclerview.widget.m;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.l;
import g4.j;
import java.util.List;
import java.util.concurrent.TimeUnit;
import n4.g;
import n4.h;
import n4.k;
import n4.p;
import n4.q;
import n4.t;

/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* renamed from: f  reason: collision with root package name */
    private static final String f7592f = l.f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private static String a(p pVar, String str, Integer num, String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", pVar.f20192a, pVar.f20194c, num, pVar.f20193b.name(), str, str2);
    }

    private static String c(k kVar, t tVar, h hVar, List<p> list) {
        String str;
        Integer num;
        StringBuilder sb2 = new StringBuilder();
        if (Build.VERSION.SDK_INT >= 23) {
            str = "Job Id";
        } else {
            str = "Alarm Id";
        }
        sb2.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", str));
        for (p pVar : list) {
            g c10 = hVar.c(pVar.f20192a);
            if (c10 != null) {
                num = Integer.valueOf(c10.f20170b);
            } else {
                num = null;
            }
            sb2.append(a(pVar, TextUtils.join(",", kVar.b(pVar.f20192a)), num, TextUtils.join(",", tVar.a(pVar.f20192a))));
        }
        return sb2.toString();
    }

    @Override // androidx.work.Worker
    public ListenableWorker.a doWork() {
        WorkDatabase o10 = j.k(getApplicationContext()).o();
        q B = o10.B();
        k z10 = o10.z();
        t C = o10.C();
        h y10 = o10.y();
        List<p> e10 = B.e(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List<p> j10 = B.j();
        List<p> t10 = B.t(m.e.DEFAULT_DRAG_ANIMATION_DURATION);
        if (e10 != null && !e10.isEmpty()) {
            l c10 = l.c();
            String str = f7592f;
            c10.d(str, "Recently completed work:\n\n", new Throwable[0]);
            l.c().d(str, c(z10, C, y10, e10), new Throwable[0]);
        }
        if (j10 != null && !j10.isEmpty()) {
            l c11 = l.c();
            String str2 = f7592f;
            c11.d(str2, "Running work:\n\n", new Throwable[0]);
            l.c().d(str2, c(z10, C, y10, j10), new Throwable[0]);
        }
        if (t10 != null && !t10.isEmpty()) {
            l c12 = l.c();
            String str3 = f7592f;
            c12.d(str3, "Enqueued work:\n\n", new Throwable[0]);
            l.c().d(str3, c(z10, C, y10, t10), new Throwable[0]);
        }
        return ListenableWorker.a.c();
    }
}
