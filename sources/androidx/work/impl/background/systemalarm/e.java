package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.l;
import g4.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o4.k;
import o4.n;
import o4.r;

/* compiled from: SystemAlarmDispatcher.java */
/* loaded from: classes.dex */
public class e implements g4.b {

    /* renamed from: x  reason: collision with root package name */
    static final String f7499x = l.f("SystemAlarmDispatcher");

    /* renamed from: f  reason: collision with root package name */
    final Context f7500f;

    /* renamed from: m  reason: collision with root package name */
    private final p4.a f7501m;

    /* renamed from: p  reason: collision with root package name */
    private final r f7502p;

    /* renamed from: q  reason: collision with root package name */
    private final g4.d f7503q;

    /* renamed from: r  reason: collision with root package name */
    private final j f7504r;

    /* renamed from: s  reason: collision with root package name */
    final androidx.work.impl.background.systemalarm.b f7505s;

    /* renamed from: t  reason: collision with root package name */
    private final Handler f7506t;

    /* renamed from: u  reason: collision with root package name */
    final List<Intent> f7507u;

    /* renamed from: v  reason: collision with root package name */
    Intent f7508v;

    /* renamed from: w  reason: collision with root package name */
    private c f7509w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar;
            d dVar;
            synchronized (e.this.f7507u) {
                e eVar2 = e.this;
                eVar2.f7508v = eVar2.f7507u.get(0);
            }
            Intent intent = e.this.f7508v;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = e.this.f7508v.getIntExtra("KEY_START_ID", 0);
                l c10 = l.c();
                String str = e.f7499x;
                c10.a(str, String.format("Processing command %s, %s", e.this.f7508v, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock b10 = n.b(e.this.f7500f, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    l.c().a(str, String.format("Acquiring operation wake lock (%s) %s", action, b10), new Throwable[0]);
                    b10.acquire();
                    e eVar3 = e.this;
                    eVar3.f7505s.p(eVar3.f7508v, intExtra, eVar3);
                    l.c().a(str, String.format("Releasing operation wake lock (%s) %s", action, b10), new Throwable[0]);
                    b10.release();
                    eVar = e.this;
                    dVar = new d(eVar);
                } catch (Throwable th) {
                    try {
                        l c11 = l.c();
                        String str2 = e.f7499x;
                        c11.b(str2, "Unexpected error in onHandleIntent", th);
                        l.c().a(str2, String.format("Releasing operation wake lock (%s) %s", action, b10), new Throwable[0]);
                        b10.release();
                        eVar = e.this;
                        dVar = new d(eVar);
                    } catch (Throwable th2) {
                        l.c().a(e.f7499x, String.format("Releasing operation wake lock (%s) %s", action, b10), new Throwable[0]);
                        b10.release();
                        e eVar4 = e.this;
                        eVar4.k(new d(eVar4));
                        throw th2;
                    }
                }
                eVar.k(dVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        private final e f7511f;

        /* renamed from: m  reason: collision with root package name */
        private final Intent f7512m;

        /* renamed from: p  reason: collision with root package name */
        private final int f7513p;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(e eVar, Intent intent, int i10) {
            this.f7511f = eVar;
            this.f7512m = intent;
            this.f7513p = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7511f.a(this.f7512m, this.f7513p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    public interface c {
        void a();
    }

    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    static class d implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        private final e f7514f;

        d(e eVar) {
            this.f7514f = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7514f.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Context context) {
        this(context, null, null);
    }

    private void b() {
        if (this.f7506t.getLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Needs to be invoked on the main thread.");
    }

    private boolean i(String str) {
        b();
        synchronized (this.f7507u) {
            Iterator<Intent> it = this.f7507u.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    private void l() {
        b();
        PowerManager.WakeLock b10 = n.b(this.f7500f, "ProcessCommand");
        try {
            b10.acquire();
            this.f7504r.p().b(new a());
        } finally {
            b10.release();
        }
    }

    public boolean a(Intent intent, int i10) {
        l c10 = l.c();
        String str = f7499x;
        boolean z10 = false;
        c10.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i10)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            l.c().h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i10);
            synchronized (this.f7507u) {
                if (!this.f7507u.isEmpty()) {
                    z10 = true;
                }
                this.f7507u.add(intent);
                if (!z10) {
                    l();
                }
            }
            return true;
        }
    }

    void c() {
        l c10 = l.c();
        String str = f7499x;
        c10.a(str, "Checking if commands are complete.", new Throwable[0]);
        b();
        synchronized (this.f7507u) {
            if (this.f7508v != null) {
                l.c().a(str, String.format("Removing command %s", this.f7508v), new Throwable[0]);
                if (this.f7507u.remove(0).equals(this.f7508v)) {
                    this.f7508v = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            k c11 = this.f7501m.c();
            if (!this.f7505s.o() && this.f7507u.isEmpty() && !c11.a()) {
                l.c().a(str, "No more commands & intents.", new Throwable[0]);
                c cVar = this.f7509w;
                if (cVar != null) {
                    cVar.a();
                }
            } else if (!this.f7507u.isEmpty()) {
                l();
            }
        }
    }

    @Override // g4.b
    public void d(String str, boolean z10) {
        k(new b(this, androidx.work.impl.background.systemalarm.b.c(this.f7500f, str, z10), 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g4.d e() {
        return this.f7503q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p4.a f() {
        return this.f7501m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j g() {
        return this.f7504r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r h() {
        return this.f7502p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        l.c().a(f7499x, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f7503q.i(this);
        this.f7502p.a();
        this.f7509w = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(Runnable runnable) {
        this.f7506t.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(c cVar) {
        if (this.f7509w != null) {
            l.c().b(f7499x, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.f7509w = cVar;
        }
    }

    e(Context context, g4.d dVar, j jVar) {
        Context applicationContext = context.getApplicationContext();
        this.f7500f = applicationContext;
        this.f7505s = new androidx.work.impl.background.systemalarm.b(applicationContext);
        this.f7502p = new r();
        jVar = jVar == null ? j.k(context) : jVar;
        this.f7504r = jVar;
        dVar = dVar == null ? jVar.m() : dVar;
        this.f7503q = dVar;
        this.f7501m = jVar.p();
        dVar.c(this);
        this.f7507u = new ArrayList();
        this.f7508v = null;
        this.f7506t = new Handler(Looper.getMainLooper());
    }
}
