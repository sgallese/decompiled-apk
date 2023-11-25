package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.c;
import androidx.room.d;
import androidx.room.f;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MultiInstanceInvalidationClient.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    final Context f7003a;

    /* renamed from: b  reason: collision with root package name */
    final String f7004b;

    /* renamed from: c  reason: collision with root package name */
    int f7005c;

    /* renamed from: d  reason: collision with root package name */
    final androidx.room.f f7006d;

    /* renamed from: e  reason: collision with root package name */
    final f.c f7007e;

    /* renamed from: f  reason: collision with root package name */
    androidx.room.d f7008f;

    /* renamed from: g  reason: collision with root package name */
    final Executor f7009g;

    /* renamed from: h  reason: collision with root package name */
    final androidx.room.c f7010h = new a();

    /* renamed from: i  reason: collision with root package name */
    final AtomicBoolean f7011i = new AtomicBoolean(false);

    /* renamed from: j  reason: collision with root package name */
    final ServiceConnection f7012j;

    /* renamed from: k  reason: collision with root package name */
    final Runnable f7013k;

    /* renamed from: l  reason: collision with root package name */
    final Runnable f7014l;

    /* renamed from: m  reason: collision with root package name */
    private final Runnable f7015m;

    /* compiled from: MultiInstanceInvalidationClient.java */
    /* loaded from: classes.dex */
    class a extends c.a {

        /* compiled from: MultiInstanceInvalidationClient.java */
        /* renamed from: androidx.room.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0161a implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ String[] f7017f;

            RunnableC0161a(String[] strArr) {
                this.f7017f = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.f7006d.e(this.f7017f);
            }
        }

        a() {
        }

        @Override // androidx.room.c
        public void f(String[] strArr) {
            g.this.f7009g.execute(new RunnableC0161a(strArr));
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.java */
    /* loaded from: classes.dex */
    class b implements ServiceConnection {
        b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            g.this.f7008f = d.a.J(iBinder);
            g gVar = g.this;
            gVar.f7009g.execute(gVar.f7013k);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            g gVar = g.this;
            gVar.f7009g.execute(gVar.f7014l);
            g.this.f7008f = null;
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.java */
    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                g gVar = g.this;
                androidx.room.d dVar = gVar.f7008f;
                if (dVar != null) {
                    gVar.f7005c = dVar.g(gVar.f7010h, gVar.f7004b);
                    g gVar2 = g.this;
                    gVar2.f7006d.a(gVar2.f7007e);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
            }
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.java */
    /* loaded from: classes.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            gVar.f7006d.g(gVar.f7007e);
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.java */
    /* loaded from: classes.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            gVar.f7006d.g(gVar.f7007e);
            try {
                g gVar2 = g.this;
                androidx.room.d dVar = gVar2.f7008f;
                if (dVar != null) {
                    dVar.H(gVar2.f7010h, gVar2.f7005c);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e10);
            }
            g gVar3 = g.this;
            gVar3.f7003a.unbindService(gVar3.f7012j);
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.java */
    /* loaded from: classes.dex */
    class f extends f.c {
        f(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.f.c
        boolean a() {
            return true;
        }

        @Override // androidx.room.f.c
        public void b(Set<String> set) {
            if (g.this.f7011i.get()) {
                return;
            }
            try {
                g gVar = g.this;
                androidx.room.d dVar = gVar.f7008f;
                if (dVar != null) {
                    dVar.B(gVar.f7005c, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot broadcast invalidation", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Context context, String str, androidx.room.f fVar, Executor executor) {
        b bVar = new b();
        this.f7012j = bVar;
        this.f7013k = new c();
        this.f7014l = new d();
        this.f7015m = new e();
        Context applicationContext = context.getApplicationContext();
        this.f7003a = applicationContext;
        this.f7004b = str;
        this.f7006d = fVar;
        this.f7009g = executor;
        this.f7007e = new f((String[]) fVar.f6980a.keySet().toArray(new String[0]));
        applicationContext.bindService(new Intent(applicationContext, MultiInstanceInvalidationService.class), bVar, 1);
    }
}
