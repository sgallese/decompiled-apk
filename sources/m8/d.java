package m8;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import i8.a;
import i9.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: AnalyticsDeferredProxy.java */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final i9.a<i8.a> f19776a;

    /* renamed from: b  reason: collision with root package name */
    private volatile o8.a f19777b;

    /* renamed from: c  reason: collision with root package name */
    private volatile p8.b f19778c;

    /* renamed from: d  reason: collision with root package name */
    private final List<p8.a> f19779d;

    public d(i9.a<i8.a> aVar) {
        this(aVar, new p8.c(), new o8.f());
    }

    private void f() {
        this.f19776a.a(new a.InterfaceC0403a() { // from class: m8.c
            @Override // i9.a.InterfaceC0403a
            public final void a(i9.b bVar) {
                d.this.i(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(String str, Bundle bundle) {
        this.f19777b.a(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(p8.a aVar) {
        synchronized (this) {
            if (this.f19778c instanceof p8.c) {
                this.f19779d.add(aVar);
            }
            this.f19778c.a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(i9.b bVar) {
        n8.f.f().b("AnalyticsConnector now available.");
        i8.a aVar = (i8.a) bVar.get();
        o8.e eVar = new o8.e(aVar);
        e eVar2 = new e();
        if (j(aVar, eVar2) != null) {
            n8.f.f().b("Registered Firebase Analytics listener.");
            o8.d dVar = new o8.d();
            o8.c cVar = new o8.c(eVar, 500, TimeUnit.MILLISECONDS);
            synchronized (this) {
                Iterator<p8.a> it = this.f19779d.iterator();
                while (it.hasNext()) {
                    dVar.a(it.next());
                }
                eVar2.d(dVar);
                eVar2.e(cVar);
                this.f19778c = dVar;
                this.f19777b = cVar;
            }
            return;
        }
        n8.f.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    private static a.InterfaceC0402a j(i8.a aVar, e eVar) {
        a.InterfaceC0402a b10 = aVar.b("clx", eVar);
        if (b10 == null) {
            n8.f.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            b10 = aVar.b(AppMeasurement.CRASH_ORIGIN, eVar);
            if (b10 != null) {
                n8.f.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return b10;
    }

    public o8.a d() {
        return new o8.a() { // from class: m8.b
            @Override // o8.a
            public final void a(String str, Bundle bundle) {
                d.this.g(str, bundle);
            }
        };
    }

    public p8.b e() {
        return new p8.b() { // from class: m8.a
            @Override // p8.b
            public final void a(p8.a aVar) {
                d.this.h(aVar);
            }
        };
    }

    public d(i9.a<i8.a> aVar, p8.b bVar, o8.a aVar2) {
        this.f19776a = aVar;
        this.f19778c = bVar;
        this.f19779d = new ArrayList();
        this.f19777b = aVar2;
        f();
    }
}
