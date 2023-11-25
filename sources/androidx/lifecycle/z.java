package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: LifecycleService.kt */
/* loaded from: classes.dex */
public class z extends Service implements v {

    /* renamed from: f  reason: collision with root package name */
    private final t0 f5086f = new t0(this);

    @Override // androidx.lifecycle.v
    public p getLifecycle() {
        return this.f5086f.a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        qc.q.i(intent, "intent");
        this.f5086f.b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f5086f.c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f5086f.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i10) {
        this.f5086f.e();
        super.onStart(intent, i10);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
