package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.z;
import androidx.work.impl.foreground.a;
import androidx.work.l;

/* loaded from: classes.dex */
public class SystemForegroundService extends z implements a.b {

    /* renamed from: s  reason: collision with root package name */
    private static final String f7521s = l.f("SystemFgService");

    /* renamed from: t  reason: collision with root package name */
    private static SystemForegroundService f7522t = null;

    /* renamed from: m  reason: collision with root package name */
    private Handler f7523m;

    /* renamed from: p  reason: collision with root package name */
    private boolean f7524p;

    /* renamed from: q  reason: collision with root package name */
    androidx.work.impl.foreground.a f7525q;

    /* renamed from: r  reason: collision with root package name */
    NotificationManager f7526r;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f7527f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Notification f7528m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f7529p;

        a(int i10, Notification notification, int i11) {
            this.f7527f = i10;
            this.f7528m = notification;
            this.f7529p = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f7527f, this.f7528m, this.f7529p);
            } else {
                SystemForegroundService.this.startForeground(this.f7527f, this.f7528m);
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f7531f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Notification f7532m;

        b(int i10, Notification notification) {
            this.f7531f = i10;
            this.f7532m = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f7526r.notify(this.f7531f, this.f7532m);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f7534f;

        c(int i10) {
            this.f7534f = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f7526r.cancel(this.f7534f);
        }
    }

    private void e() {
        this.f7523m = new Handler(Looper.getMainLooper());
        this.f7526r = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.f7525q = aVar;
        aVar.m(this);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void b(int i10, int i11, Notification notification) {
        this.f7523m.post(new a(i10, notification, i11));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void c(int i10, Notification notification) {
        this.f7523m.post(new b(i10, notification));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void d(int i10) {
        this.f7523m.post(new c(i10));
    }

    @Override // androidx.lifecycle.z, android.app.Service
    public void onCreate() {
        super.onCreate();
        f7522t = this;
        e();
    }

    @Override // androidx.lifecycle.z, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f7525q.k();
    }

    @Override // androidx.lifecycle.z, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f7524p) {
            l.c().d(f7521s, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f7525q.k();
            e();
            this.f7524p = false;
        }
        if (intent != null) {
            this.f7525q.l(intent);
            return 3;
        }
        return 3;
    }

    @Override // androidx.work.impl.foreground.a.b
    public void stop() {
        this.f7524p = true;
        l.c().a(f7521s, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f7522t = null;
        stopSelf();
    }
}
