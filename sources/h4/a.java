package h4;

import androidx.work.l;
import androidx.work.s;
import java.util.HashMap;
import java.util.Map;
import n4.p;

/* compiled from: DelayedWorkTracker.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: d  reason: collision with root package name */
    static final String f16449d = l.f("DelayedWorkTracker");

    /* renamed from: a  reason: collision with root package name */
    final b f16450a;

    /* renamed from: b  reason: collision with root package name */
    private final s f16451b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Runnable> f16452c = new HashMap();

    /* compiled from: DelayedWorkTracker.java */
    /* renamed from: h4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0388a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p f16453f;

        RunnableC0388a(p pVar) {
            this.f16453f = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            l.c().a(a.f16449d, String.format("Scheduling work %s", this.f16453f.f20192a), new Throwable[0]);
            a.this.f16450a.a(this.f16453f);
        }
    }

    public a(b bVar, s sVar) {
        this.f16450a = bVar;
        this.f16451b = sVar;
    }

    public void a(p pVar) {
        Runnable remove = this.f16452c.remove(pVar.f20192a);
        if (remove != null) {
            this.f16451b.b(remove);
        }
        RunnableC0388a runnableC0388a = new RunnableC0388a(pVar);
        this.f16452c.put(pVar.f20192a, runnableC0388a);
        this.f16451b.a(pVar.a() - System.currentTimeMillis(), runnableC0388a);
    }

    public void b(String str) {
        Runnable remove = this.f16452c.remove(str);
        if (remove != null) {
            this.f16451b.b(remove);
        }
    }
}
