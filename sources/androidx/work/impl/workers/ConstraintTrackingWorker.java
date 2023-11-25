package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.l;
import g4.j;
import j4.c;
import j4.d;
import java.util.Collections;
import java.util.List;
import n4.p;

/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements c {

    /* renamed from: s  reason: collision with root package name */
    private static final String f7583s = l.f("ConstraintTrkngWrkr");

    /* renamed from: f  reason: collision with root package name */
    private WorkerParameters f7584f;

    /* renamed from: m  reason: collision with root package name */
    final Object f7585m;

    /* renamed from: p  reason: collision with root package name */
    volatile boolean f7586p;

    /* renamed from: q  reason: collision with root package name */
    androidx.work.impl.utils.futures.c<ListenableWorker.a> f7587q;

    /* renamed from: r  reason: collision with root package name */
    private ListenableWorker f7588r;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConstraintTrackingWorker.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.a f7590f;

        b(com.google.common.util.concurrent.a aVar) {
            this.f7590f = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ConstraintTrackingWorker.this.f7585m) {
                if (ConstraintTrackingWorker.this.f7586p) {
                    ConstraintTrackingWorker.this.d();
                } else {
                    ConstraintTrackingWorker.this.f7587q.q(this.f7590f);
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f7584f = workerParameters;
        this.f7585m = new Object();
        this.f7586p = false;
        this.f7587q = androidx.work.impl.utils.futures.c.s();
    }

    public WorkDatabase a() {
        return j.k(getApplicationContext()).o();
    }

    @Override // j4.c
    public void b(List<String> list) {
        l.c().a(f7583s, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.f7585m) {
            this.f7586p = true;
        }
    }

    void c() {
        this.f7587q.o(ListenableWorker.a.a());
    }

    void d() {
        this.f7587q.o(ListenableWorker.a.b());
    }

    void e() {
        String i10 = getInputData().i("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(i10)) {
            l.c().b(f7583s, "No worker to delegate to.", new Throwable[0]);
            c();
            return;
        }
        ListenableWorker b10 = getWorkerFactory().b(getApplicationContext(), i10, this.f7584f);
        this.f7588r = b10;
        if (b10 == null) {
            l.c().a(f7583s, "No worker to delegate to.", new Throwable[0]);
            c();
            return;
        }
        p n10 = a().B().n(getId().toString());
        if (n10 == null) {
            c();
            return;
        }
        d dVar = new d(getApplicationContext(), getTaskExecutor(), this);
        dVar.d(Collections.singletonList(n10));
        if (dVar.c(getId().toString())) {
            l.c().a(f7583s, String.format("Constraints met for delegate %s", i10), new Throwable[0]);
            try {
                com.google.common.util.concurrent.a<ListenableWorker.a> startWork = this.f7588r.startWork();
                startWork.addListener(new b(startWork), getBackgroundExecutor());
                return;
            } catch (Throwable th) {
                l c10 = l.c();
                String str = f7583s;
                c10.a(str, String.format("Delegated worker %s threw exception in startWork.", i10), th);
                synchronized (this.f7585m) {
                    if (this.f7586p) {
                        l.c().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                        d();
                    } else {
                        c();
                    }
                    return;
                }
            }
        }
        l.c().a(f7583s, String.format("Constraints not met for delegate %s. Requesting retry.", i10), new Throwable[0]);
        d();
    }

    @Override // androidx.work.ListenableWorker
    public p4.a getTaskExecutor() {
        return j.k(getApplicationContext()).p();
    }

    @Override // androidx.work.ListenableWorker
    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f7588r;
        if (listenableWorker != null && listenableWorker.isRunInForeground()) {
            return true;
        }
        return false;
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f7588r;
        if (listenableWorker != null && !listenableWorker.isStopped()) {
            this.f7588r.stop();
        }
    }

    @Override // androidx.work.ListenableWorker
    public com.google.common.util.concurrent.a<ListenableWorker.a> startWork() {
        getBackgroundExecutor().execute(new a());
        return this.f7587q;
    }

    @Override // j4.c
    public void f(List<String> list) {
    }
}
