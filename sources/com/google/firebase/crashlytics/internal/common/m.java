package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: CrashlyticsCore.java */
/* loaded from: classes3.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11421a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.firebase.e f11422b;

    /* renamed from: c  reason: collision with root package name */
    private final s f11423c;

    /* renamed from: f  reason: collision with root package name */
    private n f11426f;

    /* renamed from: g  reason: collision with root package name */
    private n f11427g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f11428h;

    /* renamed from: i  reason: collision with root package name */
    private k f11429i;

    /* renamed from: j  reason: collision with root package name */
    private final w f11430j;

    /* renamed from: k  reason: collision with root package name */
    private final u8.f f11431k;

    /* renamed from: l  reason: collision with root package name */
    public final p8.b f11432l;

    /* renamed from: m  reason: collision with root package name */
    private final o8.a f11433m;

    /* renamed from: n  reason: collision with root package name */
    private final ExecutorService f11434n;

    /* renamed from: o  reason: collision with root package name */
    private final i f11435o;

    /* renamed from: p  reason: collision with root package name */
    private final n8.a f11436p;

    /* renamed from: e  reason: collision with root package name */
    private final long f11425e = System.currentTimeMillis();

    /* renamed from: d  reason: collision with root package name */
    private final b0 f11424d = new b0();

    /* compiled from: CrashlyticsCore.java */
    /* loaded from: classes3.dex */
    class a implements Callable<Task<Void>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w8.i f11437a;

        a(w8.i iVar) {
            this.f11437a = iVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Task<Void> call() throws Exception {
            return m.this.f(this.f11437a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsCore.java */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ w8.i f11439f;

        b(w8.i iVar) {
            this.f11439f = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            m.this.f(this.f11439f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsCore.java */
    /* loaded from: classes3.dex */
    public class c implements Callable<Boolean> {
        c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            try {
                boolean d10 = m.this.f11426f.d();
                if (!d10) {
                    n8.f.f().k("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(d10);
            } catch (Exception e10) {
                n8.f.f().e("Problem encountered deleting Crashlytics initialization marker.", e10);
                return Boolean.FALSE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsCore.java */
    /* loaded from: classes3.dex */
    public class d implements Callable<Boolean> {
        d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            return Boolean.valueOf(m.this.f11429i.s());
        }
    }

    public m(com.google.firebase.e eVar, w wVar, n8.a aVar, s sVar, p8.b bVar, o8.a aVar2, u8.f fVar, ExecutorService executorService) {
        this.f11422b = eVar;
        this.f11423c = sVar;
        this.f11421a = eVar.j();
        this.f11430j = wVar;
        this.f11436p = aVar;
        this.f11432l = bVar;
        this.f11433m = aVar2;
        this.f11434n = executorService;
        this.f11431k = fVar;
        this.f11435o = new i(executorService);
    }

    private void d() {
        try {
            this.f11428h = Boolean.TRUE.equals((Boolean) t0.f(this.f11435o.h(new d())));
        } catch (Exception unused) {
            this.f11428h = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> f(w8.i iVar) {
        n();
        try {
            this.f11432l.a(new p8.a() { // from class: com.google.firebase.crashlytics.internal.common.l
                @Override // p8.a
                public final void a(String str) {
                    m.this.k(str);
                }
            });
            if (!iVar.b().f25445b.f25452a) {
                n8.f.f().b("Collection of crash reports disabled in Crashlytics settings.");
                return Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f11429i.z(iVar)) {
                n8.f.f().k("Previous sessions could not be finalized.");
            }
            return this.f11429i.R(iVar.a());
        } catch (Exception e10) {
            n8.f.f().e("Crashlytics encountered a problem during asynchronous initialization.", e10);
            return Tasks.forException(e10);
        } finally {
            m();
        }
    }

    private void h(w8.i iVar) {
        Future<?> submit = this.f11434n.submit(new b(iVar));
        n8.f.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            n8.f.f().e("Crashlytics was interrupted during initialization.", e10);
        } catch (ExecutionException e11) {
            n8.f.f().e("Crashlytics encountered a problem during initialization.", e11);
        } catch (TimeoutException e12) {
            n8.f.f().e("Crashlytics timed out during initialization.", e12);
        }
    }

    public static String i() {
        return "18.3.6";
    }

    static boolean j(String str, boolean z10) {
        if (!z10) {
            n8.f.f().i("Configured not to require a build ID.");
            return true;
        } else if (!TextUtils.isEmpty(str)) {
            return true;
        } else {
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".     |  | ");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".   \\ |  | /");
            Log.e("FirebaseCrashlytics", ".    \\    /");
            Log.e("FirebaseCrashlytics", ".     \\  /");
            Log.e("FirebaseCrashlytics", ".      \\/");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".      /\\");
            Log.e("FirebaseCrashlytics", ".     /  \\");
            Log.e("FirebaseCrashlytics", ".    /    \\");
            Log.e("FirebaseCrashlytics", ".   / |  | \\");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".");
            return false;
        }
    }

    boolean e() {
        return this.f11426f.c();
    }

    public Task<Void> g(w8.i iVar) {
        return t0.h(this.f11434n, new a(iVar));
    }

    public void k(String str) {
        this.f11429i.V(System.currentTimeMillis() - this.f11425e, str);
    }

    public void l(Throwable th) {
        this.f11429i.U(Thread.currentThread(), th);
    }

    void m() {
        this.f11435o.h(new c());
    }

    void n() {
        this.f11435o.b();
        this.f11426f.a();
        n8.f.f().i("Initialization marker file was created.");
    }

    public boolean o(com.google.firebase.crashlytics.internal.common.a aVar, w8.i iVar) {
        if (j(aVar.f11338b, h.k(this.f11421a, "com.crashlytics.RequireBuildId", true))) {
            String gVar = new g(this.f11430j).toString();
            try {
                this.f11427g = new n("crash_marker", this.f11431k);
                this.f11426f = new n("initialization_marker", this.f11431k);
                q8.i iVar2 = new q8.i(gVar, this.f11431k, this.f11435o);
                q8.c cVar = new q8.c(this.f11431k);
                this.f11429i = new k(this.f11421a, this.f11435o, this.f11430j, this.f11423c, this.f11431k, this.f11427g, aVar, iVar2, cVar, m0.g(this.f11421a, this.f11430j, this.f11431k, aVar, cVar, iVar2, new x8.a(UserVerificationMethods.USER_VERIFY_ALL, new x8.c(10)), iVar, this.f11424d), this.f11436p, this.f11433m);
                boolean e10 = e();
                d();
                this.f11429i.x(gVar, Thread.getDefaultUncaughtExceptionHandler(), iVar);
                if (e10 && h.c(this.f11421a)) {
                    n8.f.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                    h(iVar);
                    return false;
                }
                n8.f.f().b("Successfully configured exception handler.");
                return true;
            } catch (Exception e11) {
                n8.f.f().e("Crashlytics was not started due to an exception during initialization", e11);
                this.f11429i = null;
                return false;
            }
        }
        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
    }

    public void p(String str, String str2) {
        this.f11429i.P(str, str2);
    }

    public void q(String str) {
        this.f11429i.Q(str);
    }
}
