package com.google.firebase.remoteconfig;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.e;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.internal.m;
import com.google.firebase.remoteconfig.internal.o;
import com.google.firebase.remoteconfig.internal.p;
import com.google.firebase.remoteconfig.internal.q;
import com.google.firebase.remoteconfig.internal.t;
import com.google.firebase.remoteconfig.internal.x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import s.t0;

/* compiled from: RemoteConfigComponent.java */
@KeepForSdk
/* loaded from: classes3.dex */
public class c {

    /* renamed from: j  reason: collision with root package name */
    private static final Clock f11923j = DefaultClock.getInstance();

    /* renamed from: k  reason: collision with root package name */
    private static final Random f11924k = new Random();

    /* renamed from: l  reason: collision with root package name */
    private static final Map<String, com.google.firebase.remoteconfig.a> f11925l = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, com.google.firebase.remoteconfig.a> f11926a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f11927b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f11928c;

    /* renamed from: d  reason: collision with root package name */
    private final e f11929d;

    /* renamed from: e  reason: collision with root package name */
    private final j9.e f11930e;

    /* renamed from: f  reason: collision with root package name */
    private final g8.b f11931f;

    /* renamed from: g  reason: collision with root package name */
    private final i9.b<i8.a> f11932g;

    /* renamed from: h  reason: collision with root package name */
    private final String f11933h;

    /* renamed from: i  reason: collision with root package name */
    private Map<String, String> f11934i;

    /* compiled from: RemoteConfigComponent.java */
    /* loaded from: classes3.dex */
    private static class a implements BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private static final AtomicReference<a> f11935a = new AtomicReference<>();

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<a> atomicReference = f11935a;
            if (atomicReference.get() == null) {
                a aVar = new a();
                if (t0.a(atomicReference, null, aVar)) {
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener(aVar);
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z10) {
            c.p(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, @j8.b ScheduledExecutorService scheduledExecutorService, e eVar, j9.e eVar2, g8.b bVar, i9.b<i8.a> bVar2) {
        this(context, scheduledExecutorService, eVar, eVar2, bVar, bVar2, true);
    }

    private f e(String str, String str2) {
        return f.h(this.f11928c, t.c(this.f11927b, String.format("%s_%s_%s_%s.json", "frc", this.f11933h, str, str2)));
    }

    private o i(f fVar, f fVar2) {
        return new o(this.f11928c, fVar, fVar2);
    }

    static p j(Context context, String str, String str2) {
        return new p(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", str, str2, "settings"), 0));
    }

    private static x k(e eVar, String str, i9.b<i8.a> bVar) {
        if (n(eVar) && str.equals("firebase")) {
            return new x(bVar);
        }
        return null;
    }

    private static boolean m(e eVar, String str) {
        if (str.equals("firebase") && n(eVar)) {
            return true;
        }
        return false;
    }

    private static boolean n(e eVar) {
        return eVar.l().equals("[DEFAULT]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i8.a o() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void p(boolean z10) {
        synchronized (c.class) {
            Iterator<com.google.firebase.remoteconfig.a> it = f11925l.values().iterator();
            while (it.hasNext()) {
                it.next().y(z10);
            }
        }
    }

    synchronized com.google.firebase.remoteconfig.a c(e eVar, String str, j9.e eVar2, g8.b bVar, Executor executor, f fVar, f fVar2, f fVar3, m mVar, o oVar, p pVar) {
        g8.b bVar2;
        if (!this.f11926a.containsKey(str)) {
            Context context = this.f11927b;
            if (m(eVar, str)) {
                bVar2 = bVar;
            } else {
                bVar2 = null;
            }
            com.google.firebase.remoteconfig.a aVar = new com.google.firebase.remoteconfig.a(context, eVar, eVar2, bVar2, executor, fVar, fVar2, fVar3, mVar, oVar, pVar, l(eVar, eVar2, mVar, fVar2, this.f11927b, str, pVar));
            aVar.B();
            this.f11926a.put(str, aVar);
            f11925l.put(str, aVar);
        }
        return this.f11926a.get(str);
    }

    @KeepForSdk
    public synchronized com.google.firebase.remoteconfig.a d(String str) {
        f e10;
        f e11;
        f e12;
        p j10;
        o i10;
        e10 = e(str, "fetch");
        e11 = e(str, "activate");
        e12 = e(str, "defaults");
        j10 = j(this.f11927b, this.f11933h, str);
        i10 = i(e11, e12);
        final x k10 = k(this.f11929d, str, this.f11932g);
        if (k10 != null) {
            i10.b(new BiConsumer() { // from class: da.m
                @Override // com.google.android.gms.common.util.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    x.this.a((String) obj, (com.google.firebase.remoteconfig.internal.g) obj2);
                }
            });
        }
        return c(this.f11929d, str, this.f11930e, this.f11931f, this.f11928c, e10, e11, e12, g(str, e10, j10), i10, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.firebase.remoteconfig.a f() {
        return d("firebase");
    }

    synchronized m g(String str, f fVar, p pVar) {
        j9.e eVar;
        i9.b<i8.a> bVar;
        eVar = this.f11930e;
        if (n(this.f11929d)) {
            bVar = this.f11932g;
        } else {
            bVar = new i9.b() { // from class: da.n
                @Override // i9.b
                public final Object get() {
                    i8.a o10;
                    o10 = com.google.firebase.remoteconfig.c.o();
                    return o10;
                }
            };
        }
        return new m(eVar, bVar, this.f11928c, f11923j, f11924k, fVar, h(this.f11929d.m().b(), str, pVar), pVar, this.f11934i);
    }

    ConfigFetchHttpClient h(String str, String str2, p pVar) {
        return new ConfigFetchHttpClient(this.f11927b, this.f11929d.m().c(), str, str2, pVar.b(), pVar.b());
    }

    synchronized q l(e eVar, j9.e eVar2, m mVar, f fVar, Context context, String str, p pVar) {
        return new q(eVar, eVar2, mVar, fVar, context, str, pVar, this.f11928c);
    }

    protected c(Context context, ScheduledExecutorService scheduledExecutorService, e eVar, j9.e eVar2, g8.b bVar, i9.b<i8.a> bVar2, boolean z10) {
        this.f11926a = new HashMap();
        this.f11934i = new HashMap();
        this.f11927b = context;
        this.f11928c = scheduledExecutorService;
        this.f11929d = eVar;
        this.f11930e = eVar2;
        this.f11931f = bVar;
        this.f11932g = bVar2;
        this.f11933h = eVar.m().c();
        a.b(context);
        if (z10) {
            Tasks.call(scheduledExecutorService, new Callable() { // from class: com.google.firebase.remoteconfig.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return c.this.f();
                }
            });
        }
    }
}
