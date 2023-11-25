package o4;

import android.text.TextUtils;
import androidx.work.e;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.o;
import java.util.Iterator;
import java.util.List;

/* compiled from: EnqueueRunnable.java */
/* loaded from: classes.dex */
public class b implements Runnable {

    /* renamed from: p  reason: collision with root package name */
    private static final String f20480p = androidx.work.l.f("EnqueueRunnable");

    /* renamed from: f  reason: collision with root package name */
    private final g4.g f20481f;

    /* renamed from: m  reason: collision with root package name */
    private final g4.c f20482m = new g4.c();

    public b(g4.g gVar) {
        this.f20481f = gVar;
    }

    private static boolean b(g4.g gVar) {
        boolean c10 = c(gVar.g(), gVar.f(), (String[]) g4.g.l(gVar).toArray(new String[0]), gVar.d(), gVar.b());
        gVar.k();
        return c10;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e1 A[LOOP:5: B:125:0x01db->B:127:0x01e1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x020a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean c(g4.j r19, java.util.List<? extends androidx.work.w> r20, java.lang.String[] r21, java.lang.String r22, androidx.work.f r23) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.b.c(g4.j, java.util.List, java.lang.String[], java.lang.String, androidx.work.f):boolean");
    }

    private static boolean e(g4.g gVar) {
        List<g4.g> e10 = gVar.e();
        boolean z10 = false;
        if (e10 != null) {
            boolean z11 = false;
            for (g4.g gVar2 : e10) {
                if (!gVar2.j()) {
                    z11 |= e(gVar2);
                } else {
                    androidx.work.l.c().h(f20480p, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", gVar2.c())), new Throwable[0]);
                }
            }
            z10 = z11;
        }
        return b(gVar) | z10;
    }

    private static void g(n4.p pVar) {
        androidx.work.c cVar = pVar.f20201j;
        String str = pVar.f20194c;
        if (!str.equals(ConstraintTrackingWorker.class.getName())) {
            if (cVar.f() || cVar.i()) {
                e.a aVar = new e.a();
                aVar.c(pVar.f20196e).e("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
                pVar.f20194c = ConstraintTrackingWorker.class.getName();
                pVar.f20196e = aVar.a();
            }
        }
    }

    private static boolean h(g4.j jVar, String str) {
        try {
            Class<?> cls = Class.forName(str);
            Iterator<g4.e> it = jVar.n().iterator();
            while (it.hasNext()) {
                if (cls.isAssignableFrom(it.next().getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    public boolean a() {
        WorkDatabase o10 = this.f20481f.g().o();
        o10.c();
        try {
            boolean e10 = e(this.f20481f);
            o10.r();
            return e10;
        } finally {
            o10.g();
        }
    }

    public androidx.work.o d() {
        return this.f20482m;
    }

    public void f() {
        g4.j g10 = this.f20481f.g();
        g4.f.b(g10.i(), g10.o(), g10.n());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!this.f20481f.h()) {
                if (a()) {
                    g.a(this.f20481f.g().h(), RescheduleReceiver.class, true);
                    f();
                }
                this.f20482m.a(androidx.work.o.f7597a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f20481f));
        } catch (Throwable th) {
            this.f20482m.a(new o.b.a(th));
        }
    }
}
