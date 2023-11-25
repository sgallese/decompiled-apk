package aa;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import ba.c;
import ba.i;
import ba.m;
import com.google.firebase.perf.application.a;
import com.google.firebase.perf.session.SessionManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: TransportManager.java */
/* loaded from: classes3.dex */
public class k implements a.b {
    private static final v9.a E = v9.a.e();
    private static final k F = new k();
    private c.b A;
    private String B;
    private String C;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, Integer> f447f;

    /* renamed from: q  reason: collision with root package name */
    private com.google.firebase.e f450q;

    /* renamed from: r  reason: collision with root package name */
    private s9.e f451r;

    /* renamed from: s  reason: collision with root package name */
    private j9.e f452s;

    /* renamed from: t  reason: collision with root package name */
    private i9.b<g6.g> f453t;

    /* renamed from: u  reason: collision with root package name */
    private b f454u;

    /* renamed from: w  reason: collision with root package name */
    private Context f456w;

    /* renamed from: x  reason: collision with root package name */
    private com.google.firebase.perf.config.a f457x;

    /* renamed from: y  reason: collision with root package name */
    private d f458y;

    /* renamed from: z  reason: collision with root package name */
    private com.google.firebase.perf.application.a f459z;

    /* renamed from: m  reason: collision with root package name */
    private final ConcurrentLinkedQueue<c> f448m = new ConcurrentLinkedQueue<>();

    /* renamed from: p  reason: collision with root package name */
    private final AtomicBoolean f449p = new AtomicBoolean(false);
    private boolean D = false;

    /* renamed from: v  reason: collision with root package name */
    private ExecutorService f455v = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    @SuppressLint({"ThreadPoolCreation"})
    private k() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f447f = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    private ba.i D(i.b bVar, ba.d dVar) {
        G();
        c.b I = this.A.I(dVar);
        if (bVar.f() || bVar.i()) {
            I = I.clone().F(j());
        }
        return bVar.E(I).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        Context j10 = this.f450q.j();
        this.f456w = j10;
        this.B = j10.getPackageName();
        this.f457x = com.google.firebase.perf.config.a.g();
        this.f458y = new d(this.f456w, new com.google.firebase.perf.util.i(100L, 1L, TimeUnit.MINUTES), 500L);
        this.f459z = com.google.firebase.perf.application.a.b();
        this.f454u = new b(this.f453t, this.f457x.a());
        h();
    }

    private void F(i.b bVar, ba.d dVar) {
        if (!u()) {
            if (s(bVar)) {
                E.b("Transport is not initialized yet, %s will be queued for to be dispatched later", n(bVar));
                this.f448m.add(new c(bVar, dVar));
                return;
            }
            return;
        }
        ba.i D = D(bVar, dVar);
        if (t(D)) {
            g(D);
            SessionManager.getInstance().updatePerfSessionIfExpired();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void G() {
        /*
            r6 = this;
            com.google.firebase.perf.config.a r0 = r6.f457x
            boolean r0 = r0.K()
            if (r0 == 0) goto L6f
            ba.c$b r0 = r6.A
            boolean r0 = r0.E()
            if (r0 == 0) goto L15
            boolean r0 = r6.D
            if (r0 != 0) goto L15
            return
        L15:
            r0 = 0
            r1 = 1
            j9.e r2 = r6.f452s     // Catch: java.util.concurrent.TimeoutException -> L29 java.lang.InterruptedException -> L3a java.util.concurrent.ExecutionException -> L4b
            com.google.android.gms.tasks.Task r2 = r2.getId()     // Catch: java.util.concurrent.TimeoutException -> L29 java.lang.InterruptedException -> L3a java.util.concurrent.ExecutionException -> L4b
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.TimeoutException -> L29 java.lang.InterruptedException -> L3a java.util.concurrent.ExecutionException -> L4b
            r4 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r2 = com.google.android.gms.tasks.Tasks.await(r2, r4, r3)     // Catch: java.util.concurrent.TimeoutException -> L29 java.lang.InterruptedException -> L3a java.util.concurrent.ExecutionException -> L4b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.util.concurrent.TimeoutException -> L29 java.lang.InterruptedException -> L3a java.util.concurrent.ExecutionException -> L4b
            goto L5c
        L29:
            r2 = move-exception
            v9.a r3 = aa.k.E
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.getMessage()
            r1[r0] = r2
            java.lang.String r0 = "Task to retrieve Installation Id is timed out: %s"
            r3.d(r0, r1)
            goto L5b
        L3a:
            r2 = move-exception
            v9.a r3 = aa.k.E
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.getMessage()
            r1[r0] = r2
            java.lang.String r0 = "Task to retrieve Installation Id is interrupted: %s"
            r3.d(r0, r1)
            goto L5b
        L4b:
            r2 = move-exception
            v9.a r3 = aa.k.E
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.getMessage()
            r1[r0] = r2
            java.lang.String r0 = "Unable to retrieve Installation Id: %s"
            r3.d(r0, r1)
        L5b:
            r2 = 0
        L5c:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L68
            ba.c$b r0 = r6.A
            r0.H(r2)
            goto L6f
        L68:
            v9.a r0 = aa.k.E
            java.lang.String r1 = "Firebase Installation Id is empty, contact Firebase Support for debugging."
            r0.j(r1)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.k.G():void");
    }

    private void H() {
        if (this.f451r == null && u()) {
            this.f451r = s9.e.c();
        }
    }

    private void g(ba.i iVar) {
        if (iVar.f()) {
            E.g("Logging %s. In a minute, visit the Firebase console to view your data: %s", n(iVar), i(iVar.g()));
        } else {
            E.g("Logging %s", n(iVar));
        }
        this.f454u.b(iVar);
    }

    private void h() {
        this.f459z.k(new WeakReference<>(F));
        c.b e02 = ba.c.e0();
        this.A = e02;
        e02.J(this.f450q.m().c()).G(ba.a.X().E(this.B).F(s9.a.f23041b).G(p(this.f456w)));
        this.f449p.set(true);
        while (!this.f448m.isEmpty()) {
            final c poll = this.f448m.poll();
            if (poll != null) {
                this.f455v.execute(new Runnable() { // from class: aa.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.this.v(poll);
                    }
                });
            }
        }
    }

    private String i(m mVar) {
        String o02 = mVar.o0();
        if (o02.startsWith("_st_")) {
            return v9.b.c(this.C, this.B, o02);
        }
        return v9.b.a(this.C, this.B, o02);
    }

    private Map<String, String> j() {
        H();
        s9.e eVar = this.f451r;
        if (eVar != null) {
            return eVar.b();
        }
        return Collections.emptyMap();
    }

    public static k k() {
        return F;
    }

    private static String l(ba.g gVar) {
        return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", Boolean.valueOf(gVar.d0()), Integer.valueOf(gVar.a0()), Integer.valueOf(gVar.Z()));
    }

    private static String m(ba.h hVar) {
        long j10;
        String str;
        if (hVar.z0()) {
            j10 = hVar.q0();
        } else {
            j10 = 0;
        }
        if (hVar.v0()) {
            str = String.valueOf(hVar.k0());
        } else {
            str = "UNKNOWN";
        }
        return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", hVar.s0(), str, new DecimalFormat("#.####").format(j10 / 1000.0d));
    }

    private static String n(ba.j jVar) {
        if (jVar.f()) {
            return o(jVar.g());
        }
        if (jVar.i()) {
            return m(jVar.j());
        }
        if (jVar.a()) {
            return l(jVar.l());
        }
        return "log";
    }

    private static String o(m mVar) {
        return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", mVar.o0(), new DecimalFormat("#.####").format(mVar.l0() / 1000.0d));
    }

    private static String p(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            if (str == null) {
                return "";
            }
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    private void q(ba.i iVar) {
        if (iVar.f()) {
            this.f459z.d(com.google.firebase.perf.util.b.TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        } else if (iVar.i()) {
            this.f459z.d(com.google.firebase.perf.util.b.NETWORK_TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        }
    }

    private boolean s(ba.j jVar) {
        int intValue = this.f447f.get("KEY_AVAILABLE_TRACES_FOR_CACHING").intValue();
        int intValue2 = this.f447f.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING").intValue();
        int intValue3 = this.f447f.get("KEY_AVAILABLE_GAUGES_FOR_CACHING").intValue();
        if (jVar.f() && intValue > 0) {
            this.f447f.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(intValue - 1));
            return true;
        } else if (jVar.i() && intValue2 > 0) {
            this.f447f.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(intValue2 - 1));
            return true;
        } else if (jVar.a() && intValue3 > 0) {
            this.f447f.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(intValue3 - 1));
            return true;
        } else {
            E.b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", n(jVar), Integer.valueOf(intValue), Integer.valueOf(intValue2), Integer.valueOf(intValue3));
            return false;
        }
    }

    private boolean t(ba.i iVar) {
        if (!this.f457x.K()) {
            E.g("Performance collection is not enabled, dropping %s", n(iVar));
            return false;
        } else if (!iVar.V().a0()) {
            E.k("App Instance ID is null or empty, dropping %s", n(iVar));
            return false;
        } else if (!x9.e.b(iVar, this.f456w)) {
            E.k("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", n(iVar));
            return false;
        } else if (!this.f458y.h(iVar)) {
            q(iVar);
            E.g("Event dropped due to device sampling - %s", n(iVar));
            return false;
        } else if (!this.f458y.g(iVar)) {
            return true;
        } else {
            q(iVar);
            E.g("Rate limited (per device) - %s", n(iVar));
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(c cVar) {
        F(cVar.f414a, cVar.f415b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(m mVar, ba.d dVar) {
        F(ba.i.X().H(mVar), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(ba.h hVar, ba.d dVar) {
        F(ba.i.X().G(hVar), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(ba.g gVar, ba.d dVar) {
        F(ba.i.X().F(gVar), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        this.f458y.a(this.D);
    }

    public void A(final ba.g gVar, final ba.d dVar) {
        this.f455v.execute(new Runnable() { // from class: aa.i
            @Override // java.lang.Runnable
            public final void run() {
                k.this.y(gVar, dVar);
            }
        });
    }

    public void B(final ba.h hVar, final ba.d dVar) {
        this.f455v.execute(new Runnable() { // from class: aa.g
            @Override // java.lang.Runnable
            public final void run() {
                k.this.x(hVar, dVar);
            }
        });
    }

    public void C(final m mVar, final ba.d dVar) {
        this.f455v.execute(new Runnable() { // from class: aa.e
            @Override // java.lang.Runnable
            public final void run() {
                k.this.w(mVar, dVar);
            }
        });
    }

    @Override // com.google.firebase.perf.application.a.b
    public void onUpdateAppState(ba.d dVar) {
        boolean z10;
        if (dVar == ba.d.FOREGROUND) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.D = z10;
        if (u()) {
            this.f455v.execute(new Runnable() { // from class: aa.h
                @Override // java.lang.Runnable
                public final void run() {
                    k.this.z();
                }
            });
        }
    }

    public void r(com.google.firebase.e eVar, j9.e eVar2, i9.b<g6.g> bVar) {
        this.f450q = eVar;
        this.C = eVar.m().e();
        this.f452s = eVar2;
        this.f453t = bVar;
        this.f455v.execute(new Runnable() { // from class: aa.f
            @Override // java.lang.Runnable
            public final void run() {
                k.this.E();
            }
        });
    }

    public boolean u() {
        return this.f449p.get();
    }
}
