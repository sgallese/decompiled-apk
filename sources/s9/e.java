package s9;

import aa.k;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FirebasePerformance.java */
/* loaded from: classes3.dex */
public class e {

    /* renamed from: i  reason: collision with root package name */
    private static final v9.a f23044i = v9.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f23045a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final com.google.firebase.perf.config.a f23046b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.firebase.perf.util.f f23047c;

    /* renamed from: d  reason: collision with root package name */
    private Boolean f23048d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.firebase.e f23049e;

    /* renamed from: f  reason: collision with root package name */
    private final i9.b<com.google.firebase.remoteconfig.c> f23050f;

    /* renamed from: g  reason: collision with root package name */
    private final j9.e f23051g;

    /* renamed from: h  reason: collision with root package name */
    private final i9.b<g6.g> f23052h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(com.google.firebase.e eVar, i9.b<com.google.firebase.remoteconfig.c> bVar, j9.e eVar2, i9.b<g6.g> bVar2, RemoteConfigManager remoteConfigManager, com.google.firebase.perf.config.a aVar, SessionManager sessionManager) {
        this.f23048d = null;
        this.f23049e = eVar;
        this.f23050f = bVar;
        this.f23051g = eVar2;
        this.f23052h = bVar2;
        if (eVar == null) {
            this.f23048d = Boolean.FALSE;
            this.f23046b = aVar;
            this.f23047c = new com.google.firebase.perf.util.f(new Bundle());
            return;
        }
        k.k().r(eVar, eVar2, bVar2);
        Context j10 = eVar.j();
        com.google.firebase.perf.util.f a10 = a(j10);
        this.f23047c = a10;
        remoteConfigManager.setFirebaseRemoteConfigProvider(bVar);
        this.f23046b = aVar;
        aVar.P(a10);
        aVar.O(j10);
        sessionManager.setApplicationContext(j10);
        this.f23048d = aVar.j();
        v9.a aVar2 = f23044i;
        if (aVar2.h() && d()) {
            aVar2.f(String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", v9.b.b(eVar.m().e(), j10.getPackageName())));
        }
    }

    private static com.google.firebase.perf.util.f a(Context context) {
        Bundle bundle;
        com.google.firebase.perf.util.f fVar;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            Log.d("isEnabled", "No perf enable meta data found " + e10.getMessage());
            bundle = null;
        }
        if (bundle != null) {
            fVar = new com.google.firebase.perf.util.f(bundle);
        } else {
            fVar = new com.google.firebase.perf.util.f();
        }
        return fVar;
    }

    public static e c() {
        return (e) com.google.firebase.e.k().i(e.class);
    }

    public Map<String, String> b() {
        return new HashMap(this.f23045a);
    }

    public boolean d() {
        Boolean bool = this.f23048d;
        if (bool != null) {
            return bool.booleanValue();
        }
        return com.google.firebase.e.k().s();
    }

    public Trace e(String str) {
        return Trace.c(str);
    }
}
