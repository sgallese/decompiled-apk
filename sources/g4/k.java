package g4;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.l;
import androidx.work.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import n4.p;
import n4.q;
import n4.t;
import o4.o;

/* compiled from: WorkerWrapper.java */
/* loaded from: classes.dex */
public class k implements Runnable {
    static final String G = l.f("WorkerWrapper");
    private t A;
    private List<String> B;
    private String C;
    private volatile boolean F;

    /* renamed from: f  reason: collision with root package name */
    Context f16152f;

    /* renamed from: m  reason: collision with root package name */
    private String f16153m;

    /* renamed from: p  reason: collision with root package name */
    private List<e> f16154p;

    /* renamed from: q  reason: collision with root package name */
    private WorkerParameters.a f16155q;

    /* renamed from: r  reason: collision with root package name */
    p f16156r;

    /* renamed from: s  reason: collision with root package name */
    ListenableWorker f16157s;

    /* renamed from: t  reason: collision with root package name */
    p4.a f16158t;

    /* renamed from: v  reason: collision with root package name */
    private androidx.work.b f16160v;

    /* renamed from: w  reason: collision with root package name */
    private m4.a f16161w;

    /* renamed from: x  reason: collision with root package name */
    private WorkDatabase f16162x;

    /* renamed from: y  reason: collision with root package name */
    private q f16163y;

    /* renamed from: z  reason: collision with root package name */
    private n4.b f16164z;

    /* renamed from: u  reason: collision with root package name */
    ListenableWorker.a f16159u = ListenableWorker.a.a();
    androidx.work.impl.utils.futures.c<Boolean> D = androidx.work.impl.utils.futures.c.s();
    com.google.common.util.concurrent.a<ListenableWorker.a> E = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WorkerWrapper.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.a f16165f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f16166m;

        a(com.google.common.util.concurrent.a aVar, androidx.work.impl.utils.futures.c cVar) {
            this.f16165f = aVar;
            this.f16166m = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f16165f.get();
                l.c().a(k.G, String.format("Starting work for %s", k.this.f16156r.f20194c), new Throwable[0]);
                k kVar = k.this;
                kVar.E = kVar.f16157s.startWork();
                this.f16166m.q(k.this.E);
            } catch (Throwable th) {
                this.f16166m.p(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WorkerWrapper.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f16168f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f16169m;

        b(androidx.work.impl.utils.futures.c cVar, String str) {
            this.f16168f = cVar;
            this.f16169m = str;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            try {
                try {
                    ListenableWorker.a aVar = (ListenableWorker.a) this.f16168f.get();
                    if (aVar == null) {
                        l.c().b(k.G, String.format("%s returned a null result. Treating it as a failure.", k.this.f16156r.f20194c), new Throwable[0]);
                    } else {
                        l.c().a(k.G, String.format("%s returned a %s result.", k.this.f16156r.f20194c, aVar), new Throwable[0]);
                        k.this.f16159u = aVar;
                    }
                } catch (InterruptedException e10) {
                    e = e10;
                    l.c().b(k.G, String.format("%s failed because it threw an exception/error", this.f16169m), e);
                } catch (CancellationException e11) {
                    l.c().d(k.G, String.format("%s was cancelled", this.f16169m), e11);
                } catch (ExecutionException e12) {
                    e = e12;
                    l.c().b(k.G, String.format("%s failed because it threw an exception/error", this.f16169m), e);
                }
            } finally {
                k.this.f();
            }
        }
    }

    /* compiled from: WorkerWrapper.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        Context f16171a;

        /* renamed from: b  reason: collision with root package name */
        ListenableWorker f16172b;

        /* renamed from: c  reason: collision with root package name */
        m4.a f16173c;

        /* renamed from: d  reason: collision with root package name */
        p4.a f16174d;

        /* renamed from: e  reason: collision with root package name */
        androidx.work.b f16175e;

        /* renamed from: f  reason: collision with root package name */
        WorkDatabase f16176f;

        /* renamed from: g  reason: collision with root package name */
        String f16177g;

        /* renamed from: h  reason: collision with root package name */
        List<e> f16178h;

        /* renamed from: i  reason: collision with root package name */
        WorkerParameters.a f16179i = new WorkerParameters.a();

        public c(Context context, androidx.work.b bVar, p4.a aVar, m4.a aVar2, WorkDatabase workDatabase, String str) {
            this.f16171a = context.getApplicationContext();
            this.f16174d = aVar;
            this.f16173c = aVar2;
            this.f16175e = bVar;
            this.f16176f = workDatabase;
            this.f16177g = str;
        }

        public k a() {
            return new k(this);
        }

        public c b(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f16179i = aVar;
            }
            return this;
        }

        public c c(List<e> list) {
            this.f16178h = list;
            return this;
        }
    }

    k(c cVar) {
        this.f16152f = cVar.f16171a;
        this.f16158t = cVar.f16174d;
        this.f16161w = cVar.f16173c;
        this.f16153m = cVar.f16177g;
        this.f16154p = cVar.f16178h;
        this.f16155q = cVar.f16179i;
        this.f16157s = cVar.f16172b;
        this.f16160v = cVar.f16175e;
        WorkDatabase workDatabase = cVar.f16176f;
        this.f16162x = workDatabase;
        this.f16163y = workDatabase.B();
        this.f16164z = this.f16162x.t();
        this.A = this.f16162x.C();
    }

    private String a(List<String> list) {
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        sb2.append(this.f16153m);
        sb2.append(", tags={ ");
        boolean z10 = true;
        for (String str : list) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        sb2.append(" } ]");
        return sb2.toString();
    }

    private void c(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            l.c().d(G, String.format("Worker result SUCCESS for %s", this.C), new Throwable[0]);
            if (this.f16156r.d()) {
                h();
            } else {
                m();
            }
        } else if (aVar instanceof ListenableWorker.a.b) {
            l.c().d(G, String.format("Worker result RETRY for %s", this.C), new Throwable[0]);
            g();
        } else {
            l.c().d(G, String.format("Worker result FAILURE for %s", this.C), new Throwable[0]);
            if (this.f16156r.d()) {
                h();
            } else {
                l();
            }
        }
    }

    private void e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f16163y.m(str2) != u.a.CANCELLED) {
                this.f16163y.b(u.a.FAILED, str2);
            }
            linkedList.addAll(this.f16164z.a(str2));
        }
    }

    private void g() {
        this.f16162x.c();
        try {
            this.f16163y.b(u.a.ENQUEUED, this.f16153m);
            this.f16163y.s(this.f16153m, System.currentTimeMillis());
            this.f16163y.c(this.f16153m, -1L);
            this.f16162x.r();
        } finally {
            this.f16162x.g();
            i(true);
        }
    }

    private void h() {
        this.f16162x.c();
        try {
            this.f16163y.s(this.f16153m, System.currentTimeMillis());
            this.f16163y.b(u.a.ENQUEUED, this.f16153m);
            this.f16163y.o(this.f16153m);
            this.f16163y.c(this.f16153m, -1L);
            this.f16162x.r();
        } finally {
            this.f16162x.g();
            i(false);
        }
    }

    private void i(boolean z10) {
        ListenableWorker listenableWorker;
        this.f16162x.c();
        try {
            if (!this.f16162x.B().k()) {
                o4.g.a(this.f16152f, RescheduleReceiver.class, false);
            }
            if (z10) {
                this.f16163y.b(u.a.ENQUEUED, this.f16153m);
                this.f16163y.c(this.f16153m, -1L);
            }
            if (this.f16156r != null && (listenableWorker = this.f16157s) != null && listenableWorker.isRunInForeground()) {
                this.f16161w.b(this.f16153m);
            }
            this.f16162x.r();
            this.f16162x.g();
            this.D.o(Boolean.valueOf(z10));
        } catch (Throwable th) {
            this.f16162x.g();
            throw th;
        }
    }

    private void j() {
        u.a m10 = this.f16163y.m(this.f16153m);
        if (m10 == u.a.RUNNING) {
            l.c().a(G, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f16153m), new Throwable[0]);
            i(true);
            return;
        }
        l.c().a(G, String.format("Status for %s is %s; not doing any work", this.f16153m, m10), new Throwable[0]);
        i(false);
    }

    private void k() {
        boolean z10;
        androidx.work.e b10;
        if (n()) {
            return;
        }
        this.f16162x.c();
        try {
            p n10 = this.f16163y.n(this.f16153m);
            this.f16156r = n10;
            if (n10 == null) {
                l.c().b(G, String.format("Didn't find WorkSpec for id %s", this.f16153m), new Throwable[0]);
                i(false);
                this.f16162x.r();
            } else if (n10.f20193b != u.a.ENQUEUED) {
                j();
                this.f16162x.r();
                l.c().a(G, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f16156r.f20194c), new Throwable[0]);
            } else {
                if (n10.d() || this.f16156r.c()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    p pVar = this.f16156r;
                    if (pVar.f20205n == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10 && currentTimeMillis < pVar.a()) {
                        l.c().a(G, String.format("Delaying execution for %s because it is being executed before schedule.", this.f16156r.f20194c), new Throwable[0]);
                        i(true);
                        this.f16162x.r();
                        return;
                    }
                }
                this.f16162x.r();
                this.f16162x.g();
                if (this.f16156r.d()) {
                    b10 = this.f16156r.f20196e;
                } else {
                    androidx.work.j b11 = this.f16160v.f().b(this.f16156r.f20195d);
                    if (b11 == null) {
                        l.c().b(G, String.format("Could not create Input Merger %s", this.f16156r.f20195d), new Throwable[0]);
                        l();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f16156r.f20196e);
                    arrayList.addAll(this.f16163y.q(this.f16153m));
                    b10 = b11.b(arrayList);
                }
                WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f16153m), b10, this.B, this.f16155q, this.f16156r.f20202k, this.f16160v.e(), this.f16158t, this.f16160v.m(), new o4.q(this.f16162x, this.f16158t), new o4.p(this.f16162x, this.f16161w, this.f16158t));
                if (this.f16157s == null) {
                    this.f16157s = this.f16160v.m().b(this.f16152f, this.f16156r.f20194c, workerParameters);
                }
                ListenableWorker listenableWorker = this.f16157s;
                if (listenableWorker == null) {
                    l.c().b(G, String.format("Could not create Worker %s", this.f16156r.f20194c), new Throwable[0]);
                    l();
                } else if (listenableWorker.isUsed()) {
                    l.c().b(G, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f16156r.f20194c), new Throwable[0]);
                    l();
                } else {
                    this.f16157s.setUsed();
                    if (o()) {
                        if (n()) {
                            return;
                        }
                        androidx.work.impl.utils.futures.c s10 = androidx.work.impl.utils.futures.c.s();
                        o oVar = new o(this.f16152f, this.f16156r, this.f16157s, workerParameters.b(), this.f16158t);
                        this.f16158t.a().execute(oVar);
                        com.google.common.util.concurrent.a<Void> a10 = oVar.a();
                        a10.addListener(new a(a10, s10), this.f16158t.a());
                        s10.addListener(new b(s10, this.C), this.f16158t.c());
                        return;
                    }
                    j();
                }
            }
        } finally {
            this.f16162x.g();
        }
    }

    private void m() {
        this.f16162x.c();
        try {
            this.f16163y.b(u.a.SUCCEEDED, this.f16153m);
            this.f16163y.h(this.f16153m, ((ListenableWorker.a.c) this.f16159u).e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.f16164z.a(this.f16153m)) {
                if (this.f16163y.m(str) == u.a.BLOCKED && this.f16164z.c(str)) {
                    l.c().d(G, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.f16163y.b(u.a.ENQUEUED, str);
                    this.f16163y.s(str, currentTimeMillis);
                }
            }
            this.f16162x.r();
        } finally {
            this.f16162x.g();
            i(false);
        }
    }

    private boolean n() {
        if (!this.F) {
            return false;
        }
        l.c().a(G, String.format("Work interrupted for %s", this.C), new Throwable[0]);
        if (this.f16163y.m(this.f16153m) == null) {
            i(false);
        } else {
            i(!r0.isFinished());
        }
        return true;
    }

    private boolean o() {
        this.f16162x.c();
        try {
            boolean z10 = false;
            if (this.f16163y.m(this.f16153m) == u.a.ENQUEUED) {
                this.f16163y.b(u.a.RUNNING, this.f16153m);
                this.f16163y.r(this.f16153m);
                z10 = true;
            }
            this.f16162x.r();
            return z10;
        } finally {
            this.f16162x.g();
        }
    }

    public com.google.common.util.concurrent.a<Boolean> b() {
        return this.D;
    }

    public void d() {
        boolean z10;
        this.F = true;
        n();
        com.google.common.util.concurrent.a<ListenableWorker.a> aVar = this.E;
        if (aVar != null) {
            z10 = aVar.isDone();
            this.E.cancel(true);
        } else {
            z10 = false;
        }
        ListenableWorker listenableWorker = this.f16157s;
        if (listenableWorker != null && !z10) {
            listenableWorker.stop();
        } else {
            l.c().a(G, String.format("WorkSpec %s is already done. Not interrupting.", this.f16156r), new Throwable[0]);
        }
    }

    void f() {
        if (!n()) {
            this.f16162x.c();
            try {
                u.a m10 = this.f16163y.m(this.f16153m);
                this.f16162x.A().a(this.f16153m);
                if (m10 == null) {
                    i(false);
                } else if (m10 == u.a.RUNNING) {
                    c(this.f16159u);
                } else if (!m10.isFinished()) {
                    g();
                }
                this.f16162x.r();
            } finally {
                this.f16162x.g();
            }
        }
        List<e> list = this.f16154p;
        if (list != null) {
            Iterator<e> it = list.iterator();
            while (it.hasNext()) {
                it.next().e(this.f16153m);
            }
            f.b(this.f16160v, this.f16162x, this.f16154p);
        }
    }

    void l() {
        this.f16162x.c();
        try {
            e(this.f16153m);
            this.f16163y.h(this.f16153m, ((ListenableWorker.a.C0166a) this.f16159u).e());
            this.f16162x.r();
        } finally {
            this.f16162x.g();
            i(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        List<String> a10 = this.A.a(this.f16153m);
        this.B = a10;
        this.C = a(a10);
        k();
    }
}
