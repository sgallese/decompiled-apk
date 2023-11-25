package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.q;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import r8.b0;
import r8.d0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CrashlyticsController.java */
/* loaded from: classes3.dex */
public class k {

    /* renamed from: s  reason: collision with root package name */
    static final FilenameFilter f11372s = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.common.j
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean I;
            I = k.I(file, str);
            return I;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final Context f11373a;

    /* renamed from: b  reason: collision with root package name */
    private final s f11374b;

    /* renamed from: c  reason: collision with root package name */
    private final n f11375c;

    /* renamed from: d  reason: collision with root package name */
    private final q8.i f11376d;

    /* renamed from: e  reason: collision with root package name */
    private final i f11377e;

    /* renamed from: f  reason: collision with root package name */
    private final w f11378f;

    /* renamed from: g  reason: collision with root package name */
    private final u8.f f11379g;

    /* renamed from: h  reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.common.a f11380h;

    /* renamed from: i  reason: collision with root package name */
    private final q8.c f11381i;

    /* renamed from: j  reason: collision with root package name */
    private final n8.a f11382j;

    /* renamed from: k  reason: collision with root package name */
    private final o8.a f11383k;

    /* renamed from: l  reason: collision with root package name */
    private final m0 f11384l;

    /* renamed from: m  reason: collision with root package name */
    private q f11385m;

    /* renamed from: n  reason: collision with root package name */
    private w8.i f11386n = null;

    /* renamed from: o  reason: collision with root package name */
    final TaskCompletionSource<Boolean> f11387o = new TaskCompletionSource<>();

    /* renamed from: p  reason: collision with root package name */
    final TaskCompletionSource<Boolean> f11388p = new TaskCompletionSource<>();

    /* renamed from: q  reason: collision with root package name */
    final TaskCompletionSource<Void> f11389q = new TaskCompletionSource<>();

    /* renamed from: r  reason: collision with root package name */
    final AtomicBoolean f11390r = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsController.java */
    /* loaded from: classes3.dex */
    public class a implements q.a {
        a() {
        }

        @Override // com.google.firebase.crashlytics.internal.common.q.a
        public void a(w8.i iVar, Thread thread, Throwable th) {
            k.this.F(iVar, thread, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsController.java */
    /* loaded from: classes3.dex */
    public class b implements Callable<Task<Void>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f11392a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Throwable f11393b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Thread f11394c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ w8.i f11395d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f11396e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CrashlyticsController.java */
        /* loaded from: classes3.dex */
        public class a implements SuccessContinuation<w8.d, Void> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Executor f11398a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f11399b;

            a(Executor executor, String str) {
                this.f11398a = executor;
                this.f11399b = str;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public Task<Void> then(w8.d dVar) throws Exception {
                String str = null;
                if (dVar == null) {
                    n8.f.f().k("Received null app settings, cannot send reports at crash time.");
                    return Tasks.forResult(null);
                }
                Task[] taskArr = new Task[2];
                taskArr[0] = k.this.L();
                m0 m0Var = k.this.f11384l;
                Executor executor = this.f11398a;
                if (b.this.f11396e) {
                    str = this.f11399b;
                }
                taskArr[1] = m0Var.w(executor, str);
                return Tasks.whenAll(taskArr);
            }
        }

        b(long j10, Throwable th, Thread thread, w8.i iVar, boolean z10) {
            this.f11392a = j10;
            this.f11393b = th;
            this.f11394c = thread;
            this.f11395d = iVar;
            this.f11396e = z10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Task<Void> call() throws Exception {
            long E = k.E(this.f11392a);
            String B = k.this.B();
            if (B == null) {
                n8.f.f().d("Tried to write a fatal exception while no session was open.");
                return Tasks.forResult(null);
            }
            k.this.f11375c.a();
            k.this.f11384l.r(this.f11393b, this.f11394c, B, E);
            k.this.w(this.f11392a);
            k.this.t(this.f11395d);
            k.this.v(new com.google.firebase.crashlytics.internal.common.g(k.this.f11378f).toString());
            if (!k.this.f11374b.d()) {
                return Tasks.forResult(null);
            }
            Executor c10 = k.this.f11377e.c();
            return this.f11395d.a().onSuccessTask(c10, new a(c10, B));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsController.java */
    /* loaded from: classes3.dex */
    public class c implements SuccessContinuation<Void, Boolean> {
        c() {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Task<Boolean> then(Void r12) throws Exception {
            return Tasks.forResult(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsController.java */
    /* loaded from: classes3.dex */
    public class d implements SuccessContinuation<Boolean, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Task f11402a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CrashlyticsController.java */
        /* loaded from: classes3.dex */
        public class a implements Callable<Task<Void>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Boolean f11404a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CrashlyticsController.java */
            /* renamed from: com.google.firebase.crashlytics.internal.common.k$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class C0247a implements SuccessContinuation<w8.d, Void> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ Executor f11406a;

                C0247a(Executor executor) {
                    this.f11406a = executor;
                }

                @Override // com.google.android.gms.tasks.SuccessContinuation
                /* renamed from: a  reason: merged with bridge method [inline-methods] */
                public Task<Void> then(w8.d dVar) throws Exception {
                    if (dVar != null) {
                        k.this.L();
                        k.this.f11384l.v(this.f11406a);
                        k.this.f11389q.trySetResult(null);
                        return Tasks.forResult(null);
                    }
                    n8.f.f().k("Received null app settings at app startup. Cannot send cached reports");
                    return Tasks.forResult(null);
                }
            }

            a(Boolean bool) {
                this.f11404a = bool;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public Task<Void> call() throws Exception {
                if (!this.f11404a.booleanValue()) {
                    n8.f.f().i("Deleting cached crash reports...");
                    k.r(k.this.J());
                    k.this.f11384l.u();
                    k.this.f11389q.trySetResult(null);
                    return Tasks.forResult(null);
                }
                n8.f.f().b("Sending cached crash reports...");
                k.this.f11374b.c(this.f11404a.booleanValue());
                Executor c10 = k.this.f11377e.c();
                return d.this.f11402a.onSuccessTask(c10, new C0247a(c10));
            }
        }

        d(Task task) {
            this.f11402a = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Task<Void> then(Boolean bool) throws Exception {
            return k.this.f11377e.i(new a(bool));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsController.java */
    /* loaded from: classes3.dex */
    public class e implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f11408a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f11409b;

        e(long j10, String str) {
            this.f11408a = j10;
            this.f11409b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            if (!k.this.H()) {
                k.this.f11381i.g(this.f11408a, this.f11409b);
                return null;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsController.java */
    /* loaded from: classes3.dex */
    public class f implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f11411f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Throwable f11412m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ Thread f11413p;

        f(long j10, Throwable th, Thread thread) {
            this.f11411f = j10;
            this.f11412m = th;
            this.f11413p = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!k.this.H()) {
                long E = k.E(this.f11411f);
                String B = k.this.B();
                if (B == null) {
                    n8.f.f().k("Tried to write a non-fatal exception while no session was open.");
                } else {
                    k.this.f11384l.s(this.f11412m, this.f11413p, B, E);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsController.java */
    /* loaded from: classes3.dex */
    public class g implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f11415a;

        g(String str) {
            this.f11415a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            k.this.v(this.f11415a);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsController.java */
    /* loaded from: classes3.dex */
    public class h implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f11417a;

        h(long j10) {
            this.f11417a = j10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f11417a);
            k.this.f11383k.a("_ae", bundle);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Context context, i iVar, w wVar, s sVar, u8.f fVar, n nVar, com.google.firebase.crashlytics.internal.common.a aVar, q8.i iVar2, q8.c cVar, m0 m0Var, n8.a aVar2, o8.a aVar3) {
        this.f11373a = context;
        this.f11377e = iVar;
        this.f11378f = wVar;
        this.f11374b = sVar;
        this.f11379g = fVar;
        this.f11375c = nVar;
        this.f11380h = aVar;
        this.f11376d = iVar2;
        this.f11381i = cVar;
        this.f11382j = aVar2;
        this.f11383k = aVar3;
        this.f11384l = m0Var;
    }

    private static boolean A() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String B() {
        SortedSet<String> n10 = this.f11384l.n();
        if (!n10.isEmpty()) {
            return n10.first();
        }
        return null;
    }

    private static long C() {
        return E(System.currentTimeMillis());
    }

    static List<z> D(n8.g gVar, String str, u8.f fVar, byte[] bArr) {
        File o10 = fVar.o(str, "user-data");
        File o11 = fVar.o(str, "keys");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.google.firebase.crashlytics.internal.common.f("logs_file", "logs", bArr));
        arrayList.add(new v("crash_meta_file", "metadata", gVar.g()));
        arrayList.add(new v("session_meta_file", "session", gVar.f()));
        arrayList.add(new v("app_meta_file", "app", gVar.a()));
        arrayList.add(new v("device_meta_file", "device", gVar.c()));
        arrayList.add(new v("os_meta_file", "os", gVar.b()));
        arrayList.add(N(gVar));
        arrayList.add(new v("user_meta_file", "user", o10));
        arrayList.add(new v("keys_file", "keys", o11));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long E(long j10) {
        return j10 / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean I(File file, String str) {
        return str.startsWith(".ae");
    }

    private Task<Void> K(long j10) {
        if (A()) {
            n8.f.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return Tasks.forResult(null);
        }
        n8.f.f().b("Logging app exception event to Firebase Analytics");
        return Tasks.call(new ScheduledThreadPoolExecutor(1), new h(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> L() {
        ArrayList arrayList = new ArrayList();
        for (File file : J()) {
            try {
                arrayList.add(K(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                n8.f.f().k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    private static boolean M(String str, File file, b0.a aVar) {
        if (file == null || !file.exists()) {
            n8.f.f().k("No minidump data found for session " + str);
        }
        if (aVar == null) {
            n8.f.f().g("No Tombstones data found for session " + str);
        }
        if ((file == null || !file.exists()) && aVar == null) {
            return true;
        }
        return false;
    }

    private static z N(n8.g gVar) {
        File e10 = gVar.e();
        if (e10 != null && e10.exists()) {
            return new v("minidump_file", "minidump", e10);
        }
        return new com.google.firebase.crashlytics.internal.common.f("minidump_file", "minidump", new byte[]{0});
    }

    private Task<Boolean> S() {
        if (this.f11374b.d()) {
            n8.f.f().b("Automatic data collection is enabled. Allowing upload.");
            this.f11387o.trySetResult(Boolean.FALSE);
            return Tasks.forResult(Boolean.TRUE);
        }
        n8.f.f().b("Automatic data collection is disabled.");
        n8.f.f().i("Notifying that unsent reports are available.");
        this.f11387o.trySetResult(Boolean.TRUE);
        Task<TContinuationResult> onSuccessTask = this.f11374b.g().onSuccessTask(new c());
        n8.f.f().b("Waiting for send/deleteUnsentReports to be called.");
        return t0.n(onSuccessTask, this.f11388p.getTask());
    }

    private void T(String str) {
        List<ApplicationExitInfo> historicalProcessExitReasons;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            historicalProcessExitReasons = ((ActivityManager) this.f11373a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                this.f11384l.t(str, historicalProcessExitReasons, new q8.c(this.f11379g, str), q8.i.i(str, this.f11379g, this.f11377e));
                return;
            }
            n8.f.f().i("No ApplicationExitInfo available. Session: " + str);
            return;
        }
        n8.f.f().i("ANR feature enabled, but device is API " + i10);
    }

    private static d0.a o(w wVar, com.google.firebase.crashlytics.internal.common.a aVar) {
        return d0.a.b(wVar.f(), aVar.f11342f, aVar.f11343g, wVar.a(), t.determineFrom(aVar.f11340d).getId(), aVar.f11344h);
    }

    private static d0.b p() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return d0.b.c(com.google.firebase.crashlytics.internal.common.h.m(), Build.MODEL, Runtime.getRuntime().availableProcessors(), com.google.firebase.crashlytics.internal.common.h.t(), statFs.getBlockCount() * statFs.getBlockSize(), com.google.firebase.crashlytics.internal.common.h.z(), com.google.firebase.crashlytics.internal.common.h.n(), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static d0.c q() {
        return d0.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, com.google.firebase.crashlytics.internal.common.h.A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void u(boolean z10, w8.i iVar) {
        String str;
        ArrayList arrayList = new ArrayList(this.f11384l.n());
        if (arrayList.size() <= z10) {
            n8.f.f().i("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z10 ? 1 : 0);
        if (iVar.b().f25445b.f25453b) {
            T(str2);
        } else {
            n8.f.f().i("ANR feature disabled.");
        }
        if (this.f11382j.c(str2)) {
            y(str2);
        }
        if (z10 != 0) {
            str = (String) arrayList.get(0);
        } else {
            str = null;
        }
        this.f11384l.i(C(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(String str) {
        long C = C();
        n8.f.f().b("Opening a new session with ID " + str);
        this.f11382j.d(str, String.format(Locale.US, "Crashlytics Android SDK/%s", m.i()), C, r8.d0.b(o(this.f11378f, this.f11380h), q(), p()));
        this.f11381i.e(str);
        this.f11384l.o(str, C);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(long j10) {
        try {
            if (!this.f11379g.e(".ae" + j10).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e10) {
            n8.f.f().l("Could not create app exception marker file.", e10);
        }
    }

    private void y(String str) {
        n8.f.f().i("Finalizing native report for session " + str);
        n8.g a10 = this.f11382j.a(str);
        File e10 = a10.e();
        b0.a d10 = a10.d();
        if (M(str, e10, d10)) {
            n8.f.f().k("No native core present");
            return;
        }
        long lastModified = e10.lastModified();
        q8.c cVar = new q8.c(this.f11379g, str);
        File i10 = this.f11379g.i(str);
        if (!i10.isDirectory()) {
            n8.f.f().k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        w(lastModified);
        List<z> D = D(a10, str, this.f11379g, cVar.b());
        a0.b(i10, D);
        n8.f.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.f11384l.h(str, D, d10);
        cVar.a();
    }

    void F(w8.i iVar, Thread thread, Throwable th) {
        G(iVar, thread, th, false);
    }

    synchronized void G(w8.i iVar, Thread thread, Throwable th, boolean z10) {
        n8.f.f().b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        try {
            t0.f(this.f11377e.i(new b(System.currentTimeMillis(), th, thread, iVar, z10)));
        } catch (TimeoutException unused) {
            n8.f.f().d("Cannot send reports. Timed out while fetching settings.");
        } catch (Exception e10) {
            n8.f.f().e("Error handling uncaught exception", e10);
        }
    }

    boolean H() {
        q qVar = this.f11385m;
        if (qVar != null && qVar.a()) {
            return true;
        }
        return false;
    }

    List<File> J() {
        return this.f11379g.f(f11372s);
    }

    void O(String str) {
        this.f11377e.h(new g(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P(String str, String str2) {
        try {
            this.f11376d.l(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f11373a;
            if (context != null && com.google.firebase.crashlytics.internal.common.h.x(context)) {
                throw e10;
            }
            n8.f.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q(String str) {
        this.f11376d.m(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"TaskMainThread"})
    public Task<Void> R(Task<w8.d> task) {
        if (!this.f11384l.l()) {
            n8.f.f().i("No crash reports are available to be sent.");
            this.f11387o.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        n8.f.f().i("Crash reports are available to be sent.");
        return S().onSuccessTask(new d(task));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U(Thread thread, Throwable th) {
        this.f11377e.g(new f(System.currentTimeMillis(), th, thread));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V(long j10, String str) {
        this.f11377e.h(new e(j10, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean s() {
        if (!this.f11375c.c()) {
            String B = B();
            if (B != null && this.f11382j.c(B)) {
                return true;
            }
            return false;
        }
        n8.f.f().i("Found previous crash marker.");
        this.f11375c.d();
        return true;
    }

    void t(w8.i iVar) {
        u(false, iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, w8.i iVar) {
        this.f11386n = iVar;
        O(str);
        q qVar = new q(new a(), iVar, uncaughtExceptionHandler, this.f11382j);
        this.f11385m = qVar;
        Thread.setDefaultUncaughtExceptionHandler(qVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean z(w8.i iVar) {
        this.f11377e.b();
        if (H()) {
            n8.f.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        n8.f.f().i("Finalizing previously open sessions.");
        try {
            u(true, iVar);
            n8.f.f().i("Closed all previously open sessions.");
            return true;
        } catch (Exception e10) {
            n8.f.f().e("Unable to finalize previously open sessions.", e10);
            return false;
        }
    }
}
