package g4;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.l;
import g4.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import o4.n;

/* compiled from: Processor.java */
/* loaded from: classes.dex */
public class d implements b, m4.a {

    /* renamed from: y  reason: collision with root package name */
    private static final String f16111y = l.f("Processor");

    /* renamed from: m  reason: collision with root package name */
    private Context f16113m;

    /* renamed from: p  reason: collision with root package name */
    private androidx.work.b f16114p;

    /* renamed from: q  reason: collision with root package name */
    private p4.a f16115q;

    /* renamed from: r  reason: collision with root package name */
    private WorkDatabase f16116r;

    /* renamed from: u  reason: collision with root package name */
    private List<e> f16119u;

    /* renamed from: t  reason: collision with root package name */
    private Map<String, k> f16118t = new HashMap();

    /* renamed from: s  reason: collision with root package name */
    private Map<String, k> f16117s = new HashMap();

    /* renamed from: v  reason: collision with root package name */
    private Set<String> f16120v = new HashSet();

    /* renamed from: w  reason: collision with root package name */
    private final List<b> f16121w = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private PowerManager.WakeLock f16112f = null;

    /* renamed from: x  reason: collision with root package name */
    private final Object f16122x = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Processor.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        private b f16123f;

        /* renamed from: m  reason: collision with root package name */
        private String f16124m;

        /* renamed from: p  reason: collision with root package name */
        private com.google.common.util.concurrent.a<Boolean> f16125p;

        a(b bVar, String str, com.google.common.util.concurrent.a<Boolean> aVar) {
            this.f16123f = bVar;
            this.f16124m = str;
            this.f16125p = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                z10 = this.f16125p.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z10 = true;
            }
            this.f16123f.d(this.f16124m, z10);
        }
    }

    public d(Context context, androidx.work.b bVar, p4.a aVar, WorkDatabase workDatabase, List<e> list) {
        this.f16113m = context;
        this.f16114p = bVar;
        this.f16115q = aVar;
        this.f16116r = workDatabase;
        this.f16119u = list;
    }

    private static boolean e(String str, k kVar) {
        if (kVar != null) {
            kVar.d();
            l.c().a(f16111y, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
            return true;
        }
        l.c().a(f16111y, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
        return false;
    }

    private void m() {
        synchronized (this.f16122x) {
            if ((!this.f16117s.isEmpty()) == false) {
                try {
                    this.f16113m.startService(androidx.work.impl.foreground.a.e(this.f16113m));
                } catch (Throwable th) {
                    l.c().b(f16111y, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = this.f16112f;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f16112f = null;
                }
            }
        }
    }

    @Override // m4.a
    public void a(String str, androidx.work.g gVar) {
        synchronized (this.f16122x) {
            l.c().d(f16111y, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
            k remove = this.f16118t.remove(str);
            if (remove != null) {
                if (this.f16112f == null) {
                    PowerManager.WakeLock b10 = n.b(this.f16113m, "ProcessorForegroundLck");
                    this.f16112f = b10;
                    b10.acquire();
                }
                this.f16117s.put(str, remove);
                androidx.core.content.a.n(this.f16113m, androidx.work.impl.foreground.a.c(this.f16113m, str, gVar));
            }
        }
    }

    @Override // m4.a
    public void b(String str) {
        synchronized (this.f16122x) {
            this.f16117s.remove(str);
            m();
        }
    }

    public void c(b bVar) {
        synchronized (this.f16122x) {
            this.f16121w.add(bVar);
        }
    }

    @Override // g4.b
    public void d(String str, boolean z10) {
        synchronized (this.f16122x) {
            this.f16118t.remove(str);
            l.c().a(f16111y, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z10)), new Throwable[0]);
            Iterator<b> it = this.f16121w.iterator();
            while (it.hasNext()) {
                it.next().d(str, z10);
            }
        }
    }

    public boolean f(String str) {
        boolean contains;
        synchronized (this.f16122x) {
            contains = this.f16120v.contains(str);
        }
        return contains;
    }

    public boolean g(String str) {
        boolean z10;
        synchronized (this.f16122x) {
            if (!this.f16118t.containsKey(str) && !this.f16117s.containsKey(str)) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    public boolean h(String str) {
        boolean containsKey;
        synchronized (this.f16122x) {
            containsKey = this.f16117s.containsKey(str);
        }
        return containsKey;
    }

    public void i(b bVar) {
        synchronized (this.f16122x) {
            this.f16121w.remove(bVar);
        }
    }

    public boolean j(String str) {
        return k(str, null);
    }

    public boolean k(String str, WorkerParameters.a aVar) {
        synchronized (this.f16122x) {
            if (g(str)) {
                l.c().a(f16111y, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            k a10 = new k.c(this.f16113m, this.f16114p, this.f16115q, this, this.f16116r, str).c(this.f16119u).b(aVar).a();
            com.google.common.util.concurrent.a<Boolean> b10 = a10.b();
            b10.addListener(new a(this, str, b10), this.f16115q.a());
            this.f16118t.put(str, a10);
            this.f16115q.c().execute(a10);
            l.c().a(f16111y, String.format("%s: processing %s", getClass().getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    public boolean l(String str) {
        boolean e10;
        synchronized (this.f16122x) {
            boolean z10 = true;
            l.c().a(f16111y, String.format("Processor cancelling %s", str), new Throwable[0]);
            this.f16120v.add(str);
            k remove = this.f16117s.remove(str);
            if (remove == null) {
                z10 = false;
            }
            if (remove == null) {
                remove = this.f16118t.remove(str);
            }
            e10 = e(str, remove);
            if (z10) {
                m();
            }
        }
        return e10;
    }

    public boolean n(String str) {
        boolean e10;
        synchronized (this.f16122x) {
            l.c().a(f16111y, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            e10 = e(str, this.f16117s.remove(str));
        }
        return e10;
    }

    public boolean o(String str) {
        boolean e10;
        synchronized (this.f16122x) {
            l.c().a(f16111y, String.format("Processor stopping background work %s", str), new Throwable[0]);
            e10 = e(str, this.f16118t.remove(str));
        }
        return e10;
    }
}
