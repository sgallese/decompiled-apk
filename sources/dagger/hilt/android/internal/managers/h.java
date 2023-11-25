package dagger.hilt.android.internal.managers;

import android.app.Application;
import android.app.Service;

/* compiled from: ServiceComponentManager.java */
/* loaded from: classes4.dex */
public final class h implements ab.b<Object> {

    /* renamed from: f  reason: collision with root package name */
    private final Service f13184f;

    /* renamed from: m  reason: collision with root package name */
    private Object f13185m;

    /* compiled from: ServiceComponentManager.java */
    /* loaded from: classes4.dex */
    public interface a {
        wa.d serviceComponentBuilder();
    }

    public h(Service service) {
        this.f13184f = service;
    }

    private Object a() {
        Application application = this.f13184f.getApplication();
        ab.d.d(application instanceof ab.b, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
        return ((a) ra.a.a(application, a.class)).serviceComponentBuilder().service(this.f13184f).build();
    }

    @Override // ab.b
    public Object generatedComponent() {
        if (this.f13185m == null) {
            this.f13185m = a();
        }
        return this.f13185m;
    }
}
