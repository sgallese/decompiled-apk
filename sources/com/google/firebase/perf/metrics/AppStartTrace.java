package com.google.firebase.perf.metrics;

import aa.k;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.Process;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Keep;
import androidx.lifecycle.h0;
import androidx.lifecycle.j0;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import ba.d;
import ba.m;
import com.google.firebase.e;
import com.google.firebase.l;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, u {
    private static final Timer L = new com.google.firebase.perf.util.a().a();
    private static final long M = TimeUnit.MINUTES.toMicros(1);
    private static volatile AppStartTrace N;
    private static ExecutorService O;
    private PerfSession G;

    /* renamed from: m  reason: collision with root package name */
    private final k f11801m;

    /* renamed from: p  reason: collision with root package name */
    private final com.google.firebase.perf.util.a f11802p;

    /* renamed from: q  reason: collision with root package name */
    private final com.google.firebase.perf.config.a f11803q;

    /* renamed from: r  reason: collision with root package name */
    private final m.b f11804r;

    /* renamed from: s  reason: collision with root package name */
    private Context f11805s;

    /* renamed from: t  reason: collision with root package name */
    private WeakReference<Activity> f11806t;

    /* renamed from: u  reason: collision with root package name */
    private WeakReference<Activity> f11807u;

    /* renamed from: w  reason: collision with root package name */
    private final Timer f11809w;

    /* renamed from: x  reason: collision with root package name */
    private final Timer f11810x;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11800f = false;

    /* renamed from: v  reason: collision with root package name */
    private boolean f11808v = false;

    /* renamed from: y  reason: collision with root package name */
    private Timer f11811y = null;

    /* renamed from: z  reason: collision with root package name */
    private Timer f11812z = null;
    private Timer A = null;
    private Timer B = null;
    private Timer C = null;
    private Timer D = null;
    private Timer E = null;
    private Timer F = null;
    private boolean H = false;
    private int I = 0;
    private final b J = new b();
    private boolean K = false;

    /* loaded from: classes3.dex */
    private final class b implements ViewTreeObserver.OnDrawListener {
        private b() {
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            AppStartTrace.j(AppStartTrace.this);
        }
    }

    /* loaded from: classes3.dex */
    public static class c implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        private final AppStartTrace f11814f;

        public c(AppStartTrace appStartTrace) {
            this.f11814f = appStartTrace;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f11814f.f11811y == null) {
                this.f11814f.H = true;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.firebase.perf.metrics.AppStartTrace$a] */
    /* JADX WARN: Type inference failed for: r1v3 */
    AppStartTrace(k kVar, com.google.firebase.perf.util.a aVar, com.google.firebase.perf.config.a aVar2, ExecutorService executorService) {
        Timer timer;
        long startElapsedRealtime;
        this.f11801m = kVar;
        this.f11802p = aVar;
        this.f11803q = aVar2;
        O = executorService;
        this.f11804r = m.w0().O("_experiment_app_start_ttid");
        if (Build.VERSION.SDK_INT >= 24) {
            startElapsedRealtime = Process.getStartElapsedRealtime();
            timer = Timer.f(startElapsedRealtime);
        } else {
            timer = null;
        }
        this.f11809w = timer;
        l lVar = (l) e.k().i(l.class);
        this.f11810x = lVar != null ? Timer.f(lVar.b()) : 0;
    }

    static /* synthetic */ int j(AppStartTrace appStartTrace) {
        int i10 = appStartTrace.I;
        appStartTrace.I = i10 + 1;
        return i10;
    }

    private Timer k() {
        Timer timer = this.f11810x;
        if (timer != null) {
            return timer;
        }
        return L;
    }

    public static AppStartTrace l() {
        if (N != null) {
            return N;
        }
        return m(k.k(), new com.google.firebase.perf.util.a());
    }

    @SuppressLint({"ThreadPoolCreation"})
    static AppStartTrace m(k kVar, com.google.firebase.perf.util.a aVar) {
        if (N == null) {
            synchronized (AppStartTrace.class) {
                if (N == null) {
                    N = new AppStartTrace(kVar, aVar, com.google.firebase.perf.config.a.g(), new ThreadPoolExecutor(0, 1, M + 10, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                }
            }
        }
        return N;
    }

    private Timer n() {
        Timer timer = this.f11809w;
        if (timer != null) {
            return timer;
        }
        return k();
    }

    public static boolean o(Context context) {
        boolean z10;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            String packageName = context.getPackageName();
            String str = packageName + ":";
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(str))) {
                    if (Build.VERSION.SDK_INT < 23) {
                        z10 = q(context);
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public static boolean q(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return true;
        }
        return powerManager.isInteractive();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(m.b bVar) {
        this.f11801m.C(bVar.build(), d.FOREGROUND_BACKGROUND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        m.b N2 = m.w0().O(com.google.firebase.perf.util.c.APP_START_TRACE_NAME.toString()).M(k().e()).N(k().d(this.A));
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(m.w0().O(com.google.firebase.perf.util.c.ON_CREATE_TRACE_NAME.toString()).M(k().e()).N(k().d(this.f11811y)).build());
        m.b w02 = m.w0();
        w02.O(com.google.firebase.perf.util.c.ON_START_TRACE_NAME.toString()).M(this.f11811y.e()).N(this.f11811y.d(this.f11812z));
        arrayList.add(w02.build());
        m.b w03 = m.w0();
        w03.O(com.google.firebase.perf.util.c.ON_RESUME_TRACE_NAME.toString()).M(this.f11812z.e()).N(this.f11812z.d(this.A));
        arrayList.add(w03.build());
        N2.F(arrayList).G(this.G.a());
        this.f11801m.C(N2.build(), d.FOREGROUND_BACKGROUND);
    }

    private void t(final m.b bVar) {
        if (this.D != null && this.E != null && this.F != null) {
            O.execute(new Runnable() { // from class: w9.f
                @Override // java.lang.Runnable
                public final void run() {
                    AppStartTrace.this.r(bVar);
                }
            });
            y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        String str;
        if (this.F != null) {
            return;
        }
        this.F = this.f11802p.a();
        this.f11804r.H(m.w0().O("_experiment_onDrawFoQ").M(n().e()).N(n().d(this.F)).build());
        if (this.f11809w != null) {
            this.f11804r.H(m.w0().O("_experiment_procStart_to_classLoad").M(n().e()).N(n().d(k())).build());
        }
        m.b bVar = this.f11804r;
        if (this.K) {
            str = "true";
        } else {
            str = "false";
        }
        bVar.L("systemDeterminedForeground", str);
        this.f11804r.K("onDrawCount", this.I);
        this.f11804r.G(this.G.a());
        t(this.f11804r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        if (this.D != null) {
            return;
        }
        this.D = this.f11802p.a();
        this.f11804r.M(n().e()).N(n().d(this.D));
        t(this.f11804r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        if (this.E != null) {
            return;
        }
        this.E = this.f11802p.a();
        this.f11804r.H(m.w0().O("_experiment_preDrawFoQ").M(n().e()).N(n().d(this.E)).build());
        t(this.f11804r);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000a, B:10:0x000f, B:15:0x001b, B:17:0x003c), top: B:25:0x0001 }] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void onActivityCreated(android.app.Activity r5, android.os.Bundle r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r6 = r4.H     // Catch: java.lang.Throwable -> L42
            if (r6 != 0) goto L40
            com.google.firebase.perf.util.Timer r6 = r4.f11811y     // Catch: java.lang.Throwable -> L42
            if (r6 == 0) goto La
            goto L40
        La:
            boolean r6 = r4.K     // Catch: java.lang.Throwable -> L42
            r0 = 1
            if (r6 != 0) goto L1a
            android.content.Context r6 = r4.f11805s     // Catch: java.lang.Throwable -> L42
            boolean r6 = o(r6)     // Catch: java.lang.Throwable -> L42
            if (r6 == 0) goto L18
            goto L1a
        L18:
            r6 = 0
            goto L1b
        L1a:
            r6 = 1
        L1b:
            r4.K = r6     // Catch: java.lang.Throwable -> L42
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L42
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L42
            r4.f11806t = r6     // Catch: java.lang.Throwable -> L42
            com.google.firebase.perf.util.a r5 = r4.f11802p     // Catch: java.lang.Throwable -> L42
            com.google.firebase.perf.util.Timer r5 = r5.a()     // Catch: java.lang.Throwable -> L42
            r4.f11811y = r5     // Catch: java.lang.Throwable -> L42
            com.google.firebase.perf.util.Timer r5 = r4.n()     // Catch: java.lang.Throwable -> L42
            com.google.firebase.perf.util.Timer r6 = r4.f11811y     // Catch: java.lang.Throwable -> L42
            long r5 = r5.d(r6)     // Catch: java.lang.Throwable -> L42
            long r1 = com.google.firebase.perf.metrics.AppStartTrace.M     // Catch: java.lang.Throwable -> L42
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 <= 0) goto L3e
            r4.f11808v = r0     // Catch: java.lang.Throwable -> L42
        L3e:
            monitor-exit(r4)
            return
        L40:
            monitor-exit(r4)
            return
        L42:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (!this.H && !this.f11808v && this.f11803q.h()) {
            activity.findViewById(16908290).getViewTreeObserver().removeOnDrawListener(this.J);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        if (!this.H && !this.f11808v) {
            boolean h10 = this.f11803q.h();
            if (h10) {
                View findViewById = activity.findViewById(16908290);
                findViewById.getViewTreeObserver().addOnDrawListener(this.J);
                com.google.firebase.perf.util.e.e(findViewById, new Runnable() { // from class: w9.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppStartTrace.this.u();
                    }
                });
                h.a(findViewById, new Runnable() { // from class: w9.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppStartTrace.this.v();
                    }
                }, new Runnable() { // from class: w9.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppStartTrace.this.w();
                    }
                });
            }
            if (this.A != null) {
                return;
            }
            this.f11807u = new WeakReference<>(activity);
            this.A = this.f11802p.a();
            this.G = SessionManager.getInstance().perfSession();
            v9.a.e().a("onResume(): " + activity.getClass().getName() + ": " + k().d(this.A) + " microseconds");
            O.execute(new Runnable() { // from class: w9.e
                @Override // java.lang.Runnable
                public final void run() {
                    AppStartTrace.this.s();
                }
            });
            if (!h10) {
                y();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (!this.H && this.f11812z == null && !this.f11808v) {
            this.f11812z = this.f11802p.a();
        }
    }

    @Keep
    @h0(p.a.ON_STOP)
    public void onAppEnteredBackground() {
        if (!this.H && !this.f11808v && this.C == null) {
            this.C = this.f11802p.a();
            this.f11804r.H(m.w0().O("_experiment_firstBackgrounding").M(n().e()).N(n().d(this.C)).build());
        }
    }

    @Keep
    @h0(p.a.ON_START)
    public void onAppEnteredForeground() {
        if (!this.H && !this.f11808v && this.B == null) {
            this.B = this.f11802p.a();
            this.f11804r.H(m.w0().O("_experiment_firstForegrounding").M(n().e()).N(n().d(this.B)).build());
        }
    }

    public synchronized void x(Context context) {
        boolean z10;
        if (this.f11800f) {
            return;
        }
        j0.l().getLifecycle().a(this);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            if (!this.K && !o(applicationContext)) {
                z10 = false;
                this.K = z10;
                this.f11800f = true;
                this.f11805s = applicationContext;
            }
            z10 = true;
            this.K = z10;
            this.f11800f = true;
            this.f11805s = applicationContext;
        }
    }

    public synchronized void y() {
        if (!this.f11800f) {
            return;
        }
        j0.l().getLifecycle().d(this);
        ((Application) this.f11805s).unregisterActivityLifecycleCallbacks(this);
        this.f11800f = false;
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
