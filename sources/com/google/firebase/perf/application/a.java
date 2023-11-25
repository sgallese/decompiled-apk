package com.google.firebase.perf.application;

import aa.k;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.q;
import ba.m;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.g;
import com.google.firebase.perf.util.j;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import w9.g;

/* compiled from: AppStateMonitor.java */
/* loaded from: classes3.dex */
public class a implements Application.ActivityLifecycleCallbacks {
    private static final v9.a E = v9.a.e();
    private static volatile a F;
    private Timer A;
    private ba.d B;
    private boolean C;
    private boolean D;

    /* renamed from: f  reason: collision with root package name */
    private final WeakHashMap<Activity, Boolean> f11742f;

    /* renamed from: m  reason: collision with root package name */
    private final WeakHashMap<Activity, d> f11743m;

    /* renamed from: p  reason: collision with root package name */
    private final WeakHashMap<Activity, c> f11744p;

    /* renamed from: q  reason: collision with root package name */
    private final WeakHashMap<Activity, Trace> f11745q;

    /* renamed from: r  reason: collision with root package name */
    private final Map<String, Long> f11746r;

    /* renamed from: s  reason: collision with root package name */
    private final Set<WeakReference<b>> f11747s;

    /* renamed from: t  reason: collision with root package name */
    private Set<InterfaceC0251a> f11748t;

    /* renamed from: u  reason: collision with root package name */
    private final AtomicInteger f11749u;

    /* renamed from: v  reason: collision with root package name */
    private final k f11750v;

    /* renamed from: w  reason: collision with root package name */
    private final com.google.firebase.perf.config.a f11751w;

    /* renamed from: x  reason: collision with root package name */
    private final com.google.firebase.perf.util.a f11752x;

    /* renamed from: y  reason: collision with root package name */
    private final boolean f11753y;

    /* renamed from: z  reason: collision with root package name */
    private Timer f11754z;

    /* compiled from: AppStateMonitor.java */
    /* renamed from: com.google.firebase.perf.application.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0251a {
        void a();
    }

    /* compiled from: AppStateMonitor.java */
    /* loaded from: classes3.dex */
    public interface b {
        void onUpdateAppState(ba.d dVar);
    }

    a(k kVar, com.google.firebase.perf.util.a aVar) {
        this(kVar, aVar, com.google.firebase.perf.config.a.g(), g());
    }

    public static a b() {
        if (F == null) {
            synchronized (a.class) {
                if (F == null) {
                    F = new a(k.k(), new com.google.firebase.perf.util.a());
                }
            }
        }
        return F;
    }

    public static String c(Activity activity) {
        return "_st_" + activity.getClass().getSimpleName();
    }

    private static boolean g() {
        return d.a();
    }

    private void l() {
        synchronized (this.f11748t) {
            for (InterfaceC0251a interfaceC0251a : this.f11748t) {
                if (interfaceC0251a != null) {
                    interfaceC0251a.a();
                }
            }
        }
    }

    private void m(Activity activity) {
        Trace trace = this.f11745q.get(activity);
        if (trace == null) {
            return;
        }
        this.f11745q.remove(activity);
        g<g.a> e10 = this.f11743m.get(activity).e();
        if (!e10.d()) {
            E.k("Failed to record frame data for %s.", activity.getClass().getSimpleName());
            return;
        }
        j.a(trace, e10.c());
        trace.stop();
    }

    private void n(String str, Timer timer, Timer timer2) {
        if (!this.f11751w.K()) {
            return;
        }
        m.b G = m.w0().O(str).M(timer.e()).N(timer.d(timer2)).G(SessionManager.getInstance().perfSession().a());
        int andSet = this.f11749u.getAndSet(0);
        synchronized (this.f11746r) {
            G.I(this.f11746r);
            if (andSet != 0) {
                G.K(com.google.firebase.perf.util.b.TRACE_STARTED_NOT_STOPPED.toString(), andSet);
            }
            this.f11746r.clear();
        }
        this.f11750v.C(G.build(), ba.d.FOREGROUND_BACKGROUND);
    }

    private void o(Activity activity) {
        if (h() && this.f11751w.K()) {
            d dVar = new d(activity);
            this.f11743m.put(activity, dVar);
            if (activity instanceof q) {
                c cVar = new c(this.f11752x, this.f11750v, this, dVar);
                this.f11744p.put(activity, cVar);
                ((q) activity).getSupportFragmentManager().o1(cVar, true);
            }
        }
    }

    private void q(ba.d dVar) {
        this.B = dVar;
        synchronized (this.f11747s) {
            Iterator<WeakReference<b>> it = this.f11747s.iterator();
            while (it.hasNext()) {
                b bVar = it.next().get();
                if (bVar != null) {
                    bVar.onUpdateAppState(this.B);
                } else {
                    it.remove();
                }
            }
        }
    }

    public ba.d a() {
        return this.B;
    }

    public void d(String str, long j10) {
        synchronized (this.f11746r) {
            Long l10 = this.f11746r.get(str);
            if (l10 == null) {
                this.f11746r.put(str, Long.valueOf(j10));
            } else {
                this.f11746r.put(str, Long.valueOf(l10.longValue() + j10));
            }
        }
    }

    public void e(int i10) {
        this.f11749u.addAndGet(i10);
    }

    public boolean f() {
        return this.D;
    }

    protected boolean h() {
        return this.f11753y;
    }

    public synchronized void i(Context context) {
        if (this.C) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            this.C = true;
        }
    }

    public void j(InterfaceC0251a interfaceC0251a) {
        synchronized (this.f11748t) {
            this.f11748t.add(interfaceC0251a);
        }
    }

    public void k(WeakReference<b> weakReference) {
        synchronized (this.f11747s) {
            this.f11747s.add(weakReference);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        o(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.f11743m.remove(activity);
        if (this.f11744p.containsKey(activity)) {
            ((q) activity).getSupportFragmentManager().J1(this.f11744p.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        if (this.f11742f.isEmpty()) {
            this.f11754z = this.f11752x.a();
            this.f11742f.put(activity, Boolean.TRUE);
            if (this.D) {
                q(ba.d.FOREGROUND);
                l();
                this.D = false;
            } else {
                n(com.google.firebase.perf.util.c.BACKGROUND_TRACE_NAME.toString(), this.A, this.f11754z);
                q(ba.d.FOREGROUND);
            }
        } else {
            this.f11742f.put(activity, Boolean.TRUE);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (h() && this.f11751w.K()) {
            if (!this.f11743m.containsKey(activity)) {
                o(activity);
            }
            this.f11743m.get(activity).c();
            Trace trace = new Trace(c(activity), this.f11750v, this.f11752x, this);
            trace.start();
            this.f11745q.put(activity, trace);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
        if (h()) {
            m(activity);
        }
        if (this.f11742f.containsKey(activity)) {
            this.f11742f.remove(activity);
            if (this.f11742f.isEmpty()) {
                this.A = this.f11752x.a();
                n(com.google.firebase.perf.util.c.FOREGROUND_TRACE_NAME.toString(), this.f11754z, this.A);
                q(ba.d.BACKGROUND);
            }
        }
    }

    public void p(WeakReference<b> weakReference) {
        synchronized (this.f11747s) {
            this.f11747s.remove(weakReference);
        }
    }

    @VisibleForTesting
    a(k kVar, com.google.firebase.perf.util.a aVar, com.google.firebase.perf.config.a aVar2, boolean z10) {
        this.f11742f = new WeakHashMap<>();
        this.f11743m = new WeakHashMap<>();
        this.f11744p = new WeakHashMap<>();
        this.f11745q = new WeakHashMap<>();
        this.f11746r = new HashMap();
        this.f11747s = new HashSet();
        this.f11748t = new HashSet();
        this.f11749u = new AtomicInteger(0);
        this.B = ba.d.BACKGROUND;
        this.C = false;
        this.D = true;
        this.f11750v = kVar;
        this.f11752x = aVar;
        this.f11751w = aVar2;
        this.f11753y = z10;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
