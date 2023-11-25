package o4;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;

/* compiled from: WorkForegroundRunnable.java */
/* loaded from: classes.dex */
public class o implements Runnable {

    /* renamed from: t  reason: collision with root package name */
    static final String f20502t = androidx.work.l.f("WorkForegroundRunnable");

    /* renamed from: f  reason: collision with root package name */
    final androidx.work.impl.utils.futures.c<Void> f20503f = androidx.work.impl.utils.futures.c.s();

    /* renamed from: m  reason: collision with root package name */
    final Context f20504m;

    /* renamed from: p  reason: collision with root package name */
    final n4.p f20505p;

    /* renamed from: q  reason: collision with root package name */
    final ListenableWorker f20506q;

    /* renamed from: r  reason: collision with root package name */
    final androidx.work.h f20507r;

    /* renamed from: s  reason: collision with root package name */
    final p4.a f20508s;

    /* compiled from: WorkForegroundRunnable.java */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f20509f;

        a(androidx.work.impl.utils.futures.c cVar) {
            this.f20509f = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20509f.q(o.this.f20506q.getForegroundInfoAsync());
        }
    }

    /* compiled from: WorkForegroundRunnable.java */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f20511f;

        b(androidx.work.impl.utils.futures.c cVar) {
            this.f20511f = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                androidx.work.g gVar = (androidx.work.g) this.f20511f.get();
                if (gVar != null) {
                    androidx.work.l.c().a(o.f20502t, String.format("Updating notification for %s", o.this.f20505p.f20194c), new Throwable[0]);
                    o.this.f20506q.setRunInForeground(true);
                    o oVar = o.this;
                    oVar.f20503f.q(oVar.f20507r.a(oVar.f20504m, oVar.f20506q.getId(), gVar));
                    return;
                }
                throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", o.this.f20505p.f20194c));
            } catch (Throwable th) {
                o.this.f20503f.p(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public o(Context context, n4.p pVar, ListenableWorker listenableWorker, androidx.work.h hVar, p4.a aVar) {
        this.f20504m = context;
        this.f20505p = pVar;
        this.f20506q = listenableWorker;
        this.f20507r = hVar;
        this.f20508s = aVar;
    }

    public com.google.common.util.concurrent.a<Void> a() {
        return this.f20503f;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (this.f20505p.f20208q && !androidx.core.os.a.b()) {
            androidx.work.impl.utils.futures.c s10 = androidx.work.impl.utils.futures.c.s();
            this.f20508s.a().execute(new a(s10));
            s10.addListener(new b(s10), this.f20508s.a());
            return;
        }
        this.f20503f.o(null);
    }
}
