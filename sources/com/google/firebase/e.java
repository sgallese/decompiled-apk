package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import k8.o;
import k8.u;
import l8.m;
import s.t0;

/* compiled from: FirebaseApp.java */
/* loaded from: classes3.dex */
public class e {

    /* renamed from: k  reason: collision with root package name */
    private static final Object f11500k = new Object();

    /* renamed from: l  reason: collision with root package name */
    static final Map<String, e> f11501l = new androidx.collection.a();

    /* renamed from: a  reason: collision with root package name */
    private final Context f11502a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11503b;

    /* renamed from: c  reason: collision with root package name */
    private final k f11504c;

    /* renamed from: d  reason: collision with root package name */
    private final o f11505d;

    /* renamed from: g  reason: collision with root package name */
    private final u<o9.a> f11508g;

    /* renamed from: h  reason: collision with root package name */
    private final i9.b<g9.f> f11509h;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f11506e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f11507f = new AtomicBoolean();

    /* renamed from: i  reason: collision with root package name */
    private final List<a> f11510i = new CopyOnWriteArrayList();

    /* renamed from: j  reason: collision with root package name */
    private final List<Object> f11511j = new CopyOnWriteArrayList();

    /* compiled from: FirebaseApp.java */
    @KeepForSdk
    /* loaded from: classes3.dex */
    public interface a {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FirebaseApp.java */
    @TargetApi(14)
    /* loaded from: classes3.dex */
    public static class b implements BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private static AtomicReference<b> f11512a = new AtomicReference<>();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f11512a.get() == null) {
                    b bVar = new b();
                    if (t0.a(f11512a, null, bVar)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z10) {
            synchronized (e.f11500k) {
                Iterator it = new ArrayList(e.f11501l.values()).iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (eVar.f11506e.get()) {
                        eVar.x(z10);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FirebaseApp.java */
    @TargetApi(24)
    /* loaded from: classes3.dex */
    public static class c extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<c> f11513b = new AtomicReference<>();

        /* renamed from: a  reason: collision with root package name */
        private final Context f11514a;

        public c(Context context) {
            this.f11514a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f11513b.get() == null) {
                c cVar = new c(context);
                if (t0.a(f11513b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f11514a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (e.f11500k) {
                Iterator<e> it = e.f11501l.values().iterator();
                while (it.hasNext()) {
                    it.next().o();
                }
            }
            c();
        }
    }

    protected e(final Context context, String str, k kVar) {
        this.f11502a = (Context) Preconditions.checkNotNull(context);
        this.f11503b = Preconditions.checkNotEmpty(str);
        this.f11504c = (k) Preconditions.checkNotNull(kVar);
        l b10 = FirebaseInitProvider.b();
        ea.c.b("Firebase");
        ea.c.b("ComponentDiscovery");
        List<i9.b<ComponentRegistrar>> b11 = k8.g.c(context, ComponentDiscoveryService.class).b();
        ea.c.a();
        ea.c.b("Runtime");
        o.b g10 = o.m(m.INSTANCE).d(b11).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(k8.c.s(context, Context.class, new Class[0])).b(k8.c.s(this, e.class, new Class[0])).b(k8.c.s(kVar, k.class, new Class[0])).g(new ea.b());
        if (androidx.core.os.u.a(context) && FirebaseInitProvider.c()) {
            g10.b(k8.c.s(b10, l.class, new Class[0]));
        }
        o e10 = g10.e();
        this.f11505d = e10;
        ea.c.a();
        this.f11508g = new u<>(new i9.b() { // from class: com.google.firebase.c
            @Override // i9.b
            public final Object get() {
                o9.a u10;
                u10 = e.this.u(context);
                return u10;
            }
        });
        this.f11509h = e10.c(g9.f.class);
        g(new a() { // from class: com.google.firebase.d
            @Override // com.google.firebase.e.a
            public final void onBackgroundStateChanged(boolean z10) {
                e.this.v(z10);
            }
        });
        ea.c.a();
    }

    private void h() {
        Preconditions.checkState(!this.f11507f.get(), "FirebaseApp was deleted");
    }

    public static e k() {
        e eVar;
        synchronized (f11500k) {
            eVar = f11501l.get("[DEFAULT]");
            if (eVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if ((!androidx.core.os.u.a(this.f11502a)) != false) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + l());
            c.b(this.f11502a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + l());
        this.f11505d.p(t());
        this.f11509h.get().l();
    }

    public static e p(Context context) {
        synchronized (f11500k) {
            if (f11501l.containsKey("[DEFAULT]")) {
                return k();
            }
            k a10 = k.a(context);
            if (a10 == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return q(context, a10);
        }
    }

    public static e q(Context context, k kVar) {
        return r(context, kVar, "[DEFAULT]");
    }

    public static e r(Context context, k kVar, String str) {
        boolean z10;
        e eVar;
        b.b(context);
        String w10 = w(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f11500k) {
            Map<String, e> map = f11501l;
            if (!map.containsKey(w10)) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkState(z10, "FirebaseApp name " + w10 + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            eVar = new e(context, w10, kVar);
            map.put(w10, eVar);
        }
        eVar.o();
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ o9.a u(Context context) {
        return new o9.a(context, n(), (f9.c) this.f11505d.a(f9.c.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(boolean z10) {
        if (!z10) {
            this.f11509h.get().l();
        }
    }

    private static String w(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator<a> it = this.f11510i.iterator();
        while (it.hasNext()) {
            it.next().onBackgroundStateChanged(z10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f11503b.equals(((e) obj).l());
    }

    @KeepForSdk
    public void g(a aVar) {
        h();
        if (this.f11506e.get() && BackgroundDetector.getInstance().isInBackground()) {
            aVar.onBackgroundStateChanged(true);
        }
        this.f11510i.add(aVar);
    }

    public int hashCode() {
        return this.f11503b.hashCode();
    }

    @KeepForSdk
    public <T> T i(Class<T> cls) {
        h();
        return (T) this.f11505d.a(cls);
    }

    public Context j() {
        h();
        return this.f11502a;
    }

    public String l() {
        h();
        return this.f11503b;
    }

    public k m() {
        h();
        return this.f11504c;
    }

    @KeepForSdk
    public String n() {
        return Base64Utils.encodeUrlSafeNoPadding(l().getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(m().c().getBytes(Charset.defaultCharset()));
    }

    @KeepForSdk
    public boolean s() {
        h();
        return this.f11508g.get().b();
    }

    @KeepForSdk
    public boolean t() {
        return "[DEFAULT]".equals(l());
    }

    public String toString() {
        return Objects.toStringHelper(this).add(AppMeasurementSdk.ConditionalUserProperty.NAME, this.f11503b).add("options", this.f11504c).toString();
    }
}
