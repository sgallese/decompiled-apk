package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.p0;
import com.google.firebase.messaging.t0;
import h9.a;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class FirebaseMessaging {

    /* renamed from: o  reason: collision with root package name */
    private static final long f11559o = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: p  reason: collision with root package name */
    private static t0 f11560p;
    @SuppressLint({"FirebaseUnknownNullness"})

    /* renamed from: q  reason: collision with root package name */
    static g6.g f11561q;

    /* renamed from: r  reason: collision with root package name */
    static ScheduledExecutorService f11562r;

    /* renamed from: a  reason: collision with root package name */
    private final com.google.firebase.e f11563a;

    /* renamed from: b  reason: collision with root package name */
    private final h9.a f11564b;

    /* renamed from: c  reason: collision with root package name */
    private final j9.e f11565c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f11566d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f11567e;

    /* renamed from: f  reason: collision with root package name */
    private final p0 f11568f;

    /* renamed from: g  reason: collision with root package name */
    private final a f11569g;

    /* renamed from: h  reason: collision with root package name */
    private final Executor f11570h;

    /* renamed from: i  reason: collision with root package name */
    private final Executor f11571i;

    /* renamed from: j  reason: collision with root package name */
    private final Executor f11572j;

    /* renamed from: k  reason: collision with root package name */
    private final Task<y0> f11573k;

    /* renamed from: l  reason: collision with root package name */
    private final f0 f11574l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f11575m;

    /* renamed from: n  reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f11576n;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        private final f9.d f11577a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f11578b;

        /* renamed from: c  reason: collision with root package name */
        private f9.b<com.google.firebase.b> f11579c;

        /* renamed from: d  reason: collision with root package name */
        private Boolean f11580d;

        a(f9.d dVar) {
            this.f11577a = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(f9.a aVar) {
            if (c()) {
                FirebaseMessaging.this.C();
            }
        }

        private Boolean e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context j10 = FirebaseMessaging.this.f11563a.j();
            SharedPreferences sharedPreferences = j10.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = j10.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(j10.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                }
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        synchronized void b() {
            if (this.f11578b) {
                return;
            }
            Boolean e10 = e();
            this.f11580d = e10;
            if (e10 == null) {
                f9.b<com.google.firebase.b> bVar = new f9.b() { // from class: com.google.firebase.messaging.x
                    @Override // f9.b
                    public final void a(f9.a aVar) {
                        FirebaseMessaging.a.this.d(aVar);
                    }
                };
                this.f11579c = bVar;
                this.f11577a.a(com.google.firebase.b.class, bVar);
            }
            this.f11578b = true;
        }

        synchronized boolean c() {
            boolean s10;
            b();
            Boolean bool = this.f11580d;
            if (bool != null) {
                s10 = bool.booleanValue();
            } else {
                s10 = FirebaseMessaging.this.f11563a.s();
            }
            return s10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FirebaseMessaging(com.google.firebase.e eVar, h9.a aVar, i9.b<ca.i> bVar, i9.b<g9.j> bVar2, j9.e eVar2, g6.g gVar, f9.d dVar) {
        this(eVar, aVar, bVar, bVar2, eVar2, gVar, dVar, new f0(eVar.j()));
    }

    private synchronized void B() {
        if (!this.f11575m) {
            D(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        h9.a aVar = this.f11564b;
        if (aVar != null) {
            aVar.c();
        } else if (E(p())) {
            B();
        }
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(com.google.firebase.e eVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) eVar.i(FirebaseMessaging.class);
            Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public static synchronized FirebaseMessaging l() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(com.google.firebase.e.k());
        }
        return firebaseMessaging;
    }

    private static synchronized t0 m(Context context) {
        t0 t0Var;
        synchronized (FirebaseMessaging.class) {
            if (f11560p == null) {
                f11560p = new t0(context);
            }
            t0Var = f11560p;
        }
        return t0Var;
    }

    private String n() {
        if ("[DEFAULT]".equals(this.f11563a.l())) {
            return "";
        }
        return this.f11563a.n();
    }

    public static g6.g q() {
        return f11561q;
    }

    private void r(String str) {
        if ("[DEFAULT]".equals(this.f11563a.l())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f11563a.l());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new m(this.f11566d).i(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task u(final String str, final t0.a aVar) {
        return this.f11567e.e().onSuccessTask(this.f11572j, new SuccessContinuation() { // from class: com.google.firebase.messaging.w
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task v10;
                v10 = FirebaseMessaging.this.v(str, aVar, (String) obj);
                return v10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task v(String str, t0.a aVar, String str2) throws Exception {
        m(this.f11566d).f(n(), str, str2, this.f11574l.a());
        if (aVar == null || !str2.equals(aVar.f11692a)) {
            r(str2);
        }
        return Tasks.forResult(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(i());
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        if (s()) {
            C();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(y0 y0Var) {
        if (s()) {
            y0Var.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        l0.c(this.f11566d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void A(boolean z10) {
        this.f11575m = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void D(long j10) {
        j(new u0(this, Math.min(Math.max(30L, 2 * j10), f11559o)), j10);
        this.f11575m = true;
    }

    boolean E(t0.a aVar) {
        if (aVar != null && !aVar.b(this.f11574l.a())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String i() throws IOException {
        h9.a aVar = this.f11564b;
        if (aVar != null) {
            try {
                return (String) Tasks.await(aVar.b());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        }
        final t0.a p10 = p();
        if (!E(p10)) {
            return p10.f11692a;
        }
        final String c10 = f0.c(this.f11563a);
        try {
            return (String) Tasks.await(this.f11568f.b(c10, new p0.a() { // from class: com.google.firebase.messaging.u
                @Override // com.google.firebase.messaging.p0.a
                public final Task start() {
                    Task u10;
                    u10 = FirebaseMessaging.this.u(c10, p10);
                    return u10;
                }
            }));
        } catch (InterruptedException | ExecutionException e11) {
            throw new IOException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ThreadPoolCreation"})
    public void j(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            if (f11562r == null) {
                f11562r = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
            }
            f11562r.schedule(runnable, j10, TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context k() {
        return this.f11566d;
    }

    public Task<String> o() {
        h9.a aVar = this.f11564b;
        if (aVar != null) {
            return aVar.b();
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f11570h.execute(new Runnable() { // from class: com.google.firebase.messaging.v
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.w(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    t0.a p() {
        return m(this.f11566d).d(n(), f0.c(this.f11563a));
    }

    public boolean s() {
        return this.f11569g.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean t() {
        return this.f11574l.g();
    }

    FirebaseMessaging(com.google.firebase.e eVar, h9.a aVar, i9.b<ca.i> bVar, i9.b<g9.j> bVar2, j9.e eVar2, g6.g gVar, f9.d dVar, f0 f0Var) {
        this(eVar, aVar, eVar2, gVar, dVar, f0Var, new a0(eVar, f0Var, bVar, bVar2, eVar2), n.f(), n.c(), n.b());
    }

    FirebaseMessaging(com.google.firebase.e eVar, h9.a aVar, j9.e eVar2, g6.g gVar, f9.d dVar, f0 f0Var, a0 a0Var, Executor executor, Executor executor2, Executor executor3) {
        this.f11575m = false;
        f11561q = gVar;
        this.f11563a = eVar;
        this.f11564b = aVar;
        this.f11565c = eVar2;
        this.f11569g = new a(dVar);
        Context j10 = eVar.j();
        this.f11566d = j10;
        p pVar = new p();
        this.f11576n = pVar;
        this.f11574l = f0Var;
        this.f11571i = executor;
        this.f11567e = a0Var;
        this.f11568f = new p0(executor);
        this.f11570h = executor2;
        this.f11572j = executor3;
        Context j11 = eVar.j();
        if (j11 instanceof Application) {
            ((Application) j11).registerActivityLifecycleCallbacks(pVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + j11 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.a(new a.InterfaceC0392a() { // from class: com.google.firebase.messaging.q
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.r
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.x();
            }
        });
        Task<y0> e10 = y0.e(this, f0Var, a0Var, j10, n.g());
        this.f11573k = e10;
        e10.addOnSuccessListener(executor2, new OnSuccessListener() { // from class: com.google.firebase.messaging.s
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                FirebaseMessaging.this.y((y0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.t
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.z();
            }
        });
    }
}
