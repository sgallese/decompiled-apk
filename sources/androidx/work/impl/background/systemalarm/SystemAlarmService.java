package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.z;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.l;
import o4.n;

/* loaded from: classes.dex */
public class SystemAlarmService extends z implements e.c {

    /* renamed from: q  reason: collision with root package name */
    private static final String f7476q = l.f("SystemAlarmService");

    /* renamed from: m  reason: collision with root package name */
    private e f7477m;

    /* renamed from: p  reason: collision with root package name */
    private boolean f7478p;

    private void e() {
        e eVar = new e(this);
        this.f7477m = eVar;
        eVar.m(this);
    }

    @Override // androidx.work.impl.background.systemalarm.e.c
    public void a() {
        this.f7478p = true;
        l.c().a(f7476q, "All commands completed in dispatcher", new Throwable[0]);
        n.a();
        stopSelf();
    }

    @Override // androidx.lifecycle.z, android.app.Service
    public void onCreate() {
        super.onCreate();
        e();
        this.f7478p = false;
    }

    @Override // androidx.lifecycle.z, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f7478p = true;
        this.f7477m.j();
    }

    @Override // androidx.lifecycle.z, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f7478p) {
            l.c().d(f7476q, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f7477m.j();
            e();
            this.f7478p = false;
        }
        if (intent != null) {
            this.f7477m.a(intent, i11);
            return 3;
        }
        return 3;
    }
}
