package x7;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.play.core.internal.zzat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: o */
    private static final Map f25853o = new HashMap();

    /* renamed from: a */
    private final Context f25854a;

    /* renamed from: b */
    private final f f25855b;

    /* renamed from: c */
    private final String f25856c;

    /* renamed from: g */
    private boolean f25860g;

    /* renamed from: h */
    private final Intent f25861h;

    /* renamed from: i */
    private final m f25862i;

    /* renamed from: m */
    private ServiceConnection f25866m;

    /* renamed from: n */
    private IInterface f25867n;

    /* renamed from: d */
    private final List f25857d = new ArrayList();

    /* renamed from: e */
    private final Set f25858e = new HashSet();

    /* renamed from: f */
    private final Object f25859f = new Object();

    /* renamed from: k */
    private final IBinder.DeathRecipient f25864k = new IBinder.DeathRecipient() { // from class: x7.h
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            r.i(r.this);
        }
    };

    /* renamed from: l */
    private final AtomicInteger f25865l = new AtomicInteger(0);

    /* renamed from: j */
    private final WeakReference f25863j = new WeakReference(null);

    public r(Context context, f fVar, String str, Intent intent, m mVar, l lVar) {
        this.f25854a = context;
        this.f25855b = fVar;
        this.f25856c = str;
        this.f25861h = intent;
        this.f25862i = mVar;
    }

    public static /* synthetic */ void i(r rVar) {
        rVar.f25855b.d("reportBinderDeath", new Object[0]);
        l lVar = (l) rVar.f25863j.get();
        if (lVar != null) {
            rVar.f25855b.d("calling onBinderDied", new Object[0]);
            lVar.zza();
        } else {
            rVar.f25855b.d("%s : Binder has died.", rVar.f25856c);
            Iterator it = rVar.f25857d.iterator();
            while (it.hasNext()) {
                ((g) it.next()).c(rVar.t());
            }
            rVar.f25857d.clear();
        }
        rVar.u();
    }

    public static /* bridge */ /* synthetic */ void n(r rVar, g gVar) {
        if (rVar.f25867n == null && !rVar.f25860g) {
            rVar.f25855b.d("Initiate binding to the service.", new Object[0]);
            rVar.f25857d.add(gVar);
            q qVar = new q(rVar, null);
            rVar.f25866m = qVar;
            rVar.f25860g = true;
            if (!rVar.f25854a.bindService(rVar.f25861h, qVar, 1)) {
                rVar.f25855b.d("Failed to bind to the service.", new Object[0]);
                rVar.f25860g = false;
                Iterator it = rVar.f25857d.iterator();
                while (it.hasNext()) {
                    ((g) it.next()).c(new zzat());
                }
                rVar.f25857d.clear();
            }
        } else if (rVar.f25860g) {
            rVar.f25855b.d("Waiting to bind to the service.", new Object[0]);
            rVar.f25857d.add(gVar);
        } else {
            gVar.run();
        }
    }

    public static /* bridge */ /* synthetic */ void o(r rVar) {
        rVar.f25855b.d("linkToDeath", new Object[0]);
        try {
            rVar.f25867n.asBinder().linkToDeath(rVar.f25864k, 0);
        } catch (RemoteException e10) {
            rVar.f25855b.c(e10, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void p(r rVar) {
        rVar.f25855b.d("unlinkToDeath", new Object[0]);
        rVar.f25867n.asBinder().unlinkToDeath(rVar.f25864k, 0);
    }

    private final RemoteException t() {
        return new RemoteException(String.valueOf(this.f25856c).concat(" : Binder has died."));
    }

    public final void u() {
        synchronized (this.f25859f) {
            Iterator it = this.f25858e.iterator();
            while (it.hasNext()) {
                ((c8.o) it.next()).d(t());
            }
            this.f25858e.clear();
        }
    }

    public final Handler c() {
        Handler handler;
        Map map = f25853o;
        synchronized (map) {
            if (!map.containsKey(this.f25856c)) {
                HandlerThread handlerThread = new HandlerThread(this.f25856c, 10);
                handlerThread.start();
                map.put(this.f25856c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.f25856c);
        }
        return handler;
    }

    public final IInterface e() {
        return this.f25867n;
    }

    public final void q(g gVar, final c8.o oVar) {
        synchronized (this.f25859f) {
            this.f25858e.add(oVar);
            oVar.a().a(new c8.a() { // from class: x7.i
                @Override // c8.a
                public final void a(c8.d dVar) {
                    r.this.r(oVar, dVar);
                }
            });
        }
        synchronized (this.f25859f) {
            if (this.f25865l.getAndIncrement() > 0) {
                this.f25855b.a("Already connected to the service.", new Object[0]);
            }
        }
        c().post(new j(this, gVar.b(), gVar));
    }

    public final /* synthetic */ void r(c8.o oVar, c8.d dVar) {
        synchronized (this.f25859f) {
            this.f25858e.remove(oVar);
        }
    }

    public final void s(c8.o oVar) {
        synchronized (this.f25859f) {
            this.f25858e.remove(oVar);
        }
        synchronized (this.f25859f) {
            if (this.f25865l.get() > 0 && this.f25865l.decrementAndGet() > 0) {
                this.f25855b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            c().post(new k(this));
        }
    }
}
