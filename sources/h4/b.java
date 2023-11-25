package h4;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.l;
import androidx.work.u;
import g4.e;
import g4.j;
import j4.c;
import j4.d;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import n4.p;

/* compiled from: GreedyScheduler.java */
/* loaded from: classes.dex */
public class b implements e, c, g4.b {

    /* renamed from: v  reason: collision with root package name */
    private static final String f16455v = l.f("GreedyScheduler");

    /* renamed from: f  reason: collision with root package name */
    private final Context f16456f;

    /* renamed from: m  reason: collision with root package name */
    private final j f16457m;

    /* renamed from: p  reason: collision with root package name */
    private final d f16458p;

    /* renamed from: r  reason: collision with root package name */
    private a f16460r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f16461s;

    /* renamed from: u  reason: collision with root package name */
    Boolean f16463u;

    /* renamed from: q  reason: collision with root package name */
    private final Set<p> f16459q = new HashSet();

    /* renamed from: t  reason: collision with root package name */
    private final Object f16462t = new Object();

    public b(Context context, androidx.work.b bVar, p4.a aVar, j jVar) {
        this.f16456f = context;
        this.f16457m = jVar;
        this.f16458p = new d(context, aVar, this);
        this.f16460r = new a(this, bVar.k());
    }

    private void g() {
        this.f16463u = Boolean.valueOf(o4.j.b(this.f16456f, this.f16457m.i()));
    }

    private void h() {
        if (!this.f16461s) {
            this.f16457m.m().c(this);
            this.f16461s = true;
        }
    }

    private void i(String str) {
        synchronized (this.f16462t) {
            Iterator<p> it = this.f16459q.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.f20192a.equals(str)) {
                    l.c().a(f16455v, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.f16459q.remove(next);
                    this.f16458p.d(this.f16459q);
                    break;
                }
            }
        }
    }

    @Override // g4.e
    public void a(p... pVarArr) {
        if (this.f16463u == null) {
            g();
        }
        if (!this.f16463u.booleanValue()) {
            l.c().d(f16455v, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p pVar : pVarArr) {
            long a10 = pVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (pVar.f20193b == u.a.ENQUEUED) {
                if (currentTimeMillis < a10) {
                    a aVar = this.f16460r;
                    if (aVar != null) {
                        aVar.a(pVar);
                    }
                } else if (pVar.b()) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 23 && pVar.f20201j.h()) {
                        l.c().a(f16455v, String.format("Ignoring WorkSpec %s, Requires device idle.", pVar), new Throwable[0]);
                    } else if (i10 >= 24 && pVar.f20201j.e()) {
                        l.c().a(f16455v, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", pVar), new Throwable[0]);
                    } else {
                        hashSet.add(pVar);
                        hashSet2.add(pVar.f20192a);
                    }
                } else {
                    l.c().a(f16455v, String.format("Starting work for %s", pVar.f20192a), new Throwable[0]);
                    this.f16457m.u(pVar.f20192a);
                }
            }
        }
        synchronized (this.f16462t) {
            if (!hashSet.isEmpty()) {
                l.c().a(f16455v, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                this.f16459q.addAll(hashSet);
                this.f16458p.d(this.f16459q);
            }
        }
    }

    @Override // j4.c
    public void b(List<String> list) {
        for (String str : list) {
            l.c().a(f16455v, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f16457m.x(str);
        }
    }

    @Override // g4.e
    public boolean c() {
        return false;
    }

    @Override // g4.b
    public void d(String str, boolean z10) {
        i(str);
    }

    @Override // g4.e
    public void e(String str) {
        if (this.f16463u == null) {
            g();
        }
        if (!this.f16463u.booleanValue()) {
            l.c().d(f16455v, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        h();
        l.c().a(f16455v, String.format("Cancelling work ID %s", str), new Throwable[0]);
        a aVar = this.f16460r;
        if (aVar != null) {
            aVar.b(str);
        }
        this.f16457m.x(str);
    }

    @Override // j4.c
    public void f(List<String> list) {
        for (String str : list) {
            l.c().a(f16455v, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f16457m.u(str);
        }
    }
}
