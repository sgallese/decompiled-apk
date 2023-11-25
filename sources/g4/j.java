package g4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.l;
import androidx.work.o;
import androidx.work.r;
import androidx.work.v;
import androidx.work.w;
import i4.m;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* compiled from: WorkManagerImpl.java */
/* loaded from: classes.dex */
public class j extends v {

    /* renamed from: j  reason: collision with root package name */
    private static final String f16139j = l.f("WorkManagerImpl");

    /* renamed from: k  reason: collision with root package name */
    private static j f16140k = null;

    /* renamed from: l  reason: collision with root package name */
    private static j f16141l = null;

    /* renamed from: m  reason: collision with root package name */
    private static final Object f16142m = new Object();

    /* renamed from: a  reason: collision with root package name */
    private Context f16143a;

    /* renamed from: b  reason: collision with root package name */
    private androidx.work.b f16144b;

    /* renamed from: c  reason: collision with root package name */
    private WorkDatabase f16145c;

    /* renamed from: d  reason: collision with root package name */
    private p4.a f16146d;

    /* renamed from: e  reason: collision with root package name */
    private List<e> f16147e;

    /* renamed from: f  reason: collision with root package name */
    private d f16148f;

    /* renamed from: g  reason: collision with root package name */
    private o4.h f16149g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f16150h;

    /* renamed from: i  reason: collision with root package name */
    private BroadcastReceiver.PendingResult f16151i;

    public j(Context context, androidx.work.b bVar, p4.a aVar) {
        this(context, bVar, aVar, context.getResources().getBoolean(r.f7600a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
    
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        if (g4.j.f16141l != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        g4.j.f16141l = new g4.j(r4, r5, new p4.b(r5.l()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        g4.j.f16140k = g4.j.f16141l;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(android.content.Context r4, androidx.work.b r5) {
        /*
            java.lang.Object r0 = g4.j.f16142m
            monitor-enter(r0)
            g4.j r1 = g4.j.f16140k     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L14
            g4.j r2 = g4.j.f16141l     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto Lc
            goto L14
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L34
            throw r4     // Catch: java.lang.Throwable -> L34
        L14:
            if (r1 != 0) goto L32
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L34
            g4.j r1 = g4.j.f16141l     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L2e
            g4.j r1 = new g4.j     // Catch: java.lang.Throwable -> L34
            p4.b r2 = new p4.b     // Catch: java.lang.Throwable -> L34
            java.util.concurrent.Executor r3 = r5.l()     // Catch: java.lang.Throwable -> L34
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L34
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L34
            g4.j.f16141l = r1     // Catch: java.lang.Throwable -> L34
        L2e:
            g4.j r4 = g4.j.f16141l     // Catch: java.lang.Throwable -> L34
            g4.j.f16140k = r4     // Catch: java.lang.Throwable -> L34
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.j.e(android.content.Context, androidx.work.b):void");
    }

    @Deprecated
    public static j j() {
        synchronized (f16142m) {
            j jVar = f16140k;
            if (jVar != null) {
                return jVar;
            }
            return f16141l;
        }
    }

    public static j k(Context context) {
        j j10;
        synchronized (f16142m) {
            j10 = j();
            if (j10 == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof b.c) {
                    e(applicationContext, ((b.c) applicationContext).a());
                    j10 = k(applicationContext);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return j10;
    }

    private void q(Context context, androidx.work.b bVar, p4.a aVar, WorkDatabase workDatabase, List<e> list, d dVar) {
        boolean isDeviceProtectedStorage;
        Context applicationContext = context.getApplicationContext();
        this.f16143a = applicationContext;
        this.f16144b = bVar;
        this.f16146d = aVar;
        this.f16145c = workDatabase;
        this.f16147e = list;
        this.f16148f = dVar;
        this.f16149g = new o4.h(workDatabase);
        this.f16150h = false;
        if (Build.VERSION.SDK_INT >= 24) {
            isDeviceProtectedStorage = applicationContext.isDeviceProtectedStorage();
            if (isDeviceProtectedStorage) {
                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
            }
        }
        this.f16146d.b(new ForceStopRunnable(applicationContext, this));
    }

    @Override // androidx.work.v
    public o a(String str) {
        o4.a d10 = o4.a.d(str, this);
        this.f16146d.b(d10);
        return d10.e();
    }

    @Override // androidx.work.v
    public o c(List<? extends w> list) {
        if (!list.isEmpty()) {
            return new g(this, list).a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public o f(UUID uuid) {
        o4.a b10 = o4.a.b(uuid, this);
        this.f16146d.b(b10);
        return b10.e();
    }

    public List<e> g(Context context, androidx.work.b bVar, p4.a aVar) {
        return Arrays.asList(f.a(context, this), new h4.b(context, bVar, aVar, this));
    }

    public Context h() {
        return this.f16143a;
    }

    public androidx.work.b i() {
        return this.f16144b;
    }

    public o4.h l() {
        return this.f16149g;
    }

    public d m() {
        return this.f16148f;
    }

    public List<e> n() {
        return this.f16147e;
    }

    public WorkDatabase o() {
        return this.f16145c;
    }

    public p4.a p() {
        return this.f16146d;
    }

    public void r() {
        synchronized (f16142m) {
            this.f16150h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f16151i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f16151i = null;
            }
        }
    }

    public void s() {
        if (Build.VERSION.SDK_INT >= 23) {
            m.b(h());
        }
        o().B().u();
        f.b(i(), o(), n());
    }

    public void t(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f16142m) {
            this.f16151i = pendingResult;
            if (this.f16150h) {
                pendingResult.finish();
                this.f16151i = null;
            }
        }
    }

    public void u(String str) {
        v(str, null);
    }

    public void v(String str, WorkerParameters.a aVar) {
        this.f16146d.b(new o4.l(this, str, aVar));
    }

    public void w(String str) {
        this.f16146d.b(new o4.m(this, str, true));
    }

    public void x(String str) {
        this.f16146d.b(new o4.m(this, str, false));
    }

    public j(Context context, androidx.work.b bVar, p4.a aVar, boolean z10) {
        this(context, bVar, aVar, WorkDatabase.s(context.getApplicationContext(), aVar.c(), z10));
    }

    public j(Context context, androidx.work.b bVar, p4.a aVar, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        l.e(new l.a(bVar.j()));
        List<e> g10 = g(applicationContext, bVar, aVar);
        q(context, bVar, aVar, workDatabase, g10, new d(context, bVar, aVar, workDatabase, g10));
    }
}
