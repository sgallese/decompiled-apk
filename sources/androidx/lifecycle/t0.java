package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.p;

/* compiled from: ServiceLifecycleDispatcher.kt */
/* loaded from: classes.dex */
public class t0 {

    /* renamed from: a  reason: collision with root package name */
    private final x f5047a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f5048b;

    /* renamed from: c  reason: collision with root package name */
    private a f5049c;

    /* compiled from: ServiceLifecycleDispatcher.kt */
    /* loaded from: classes.dex */
    public static final class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        private final x f5050f;

        /* renamed from: m  reason: collision with root package name */
        private final p.a f5051m;

        /* renamed from: p  reason: collision with root package name */
        private boolean f5052p;

        public a(x xVar, p.a aVar) {
            qc.q.i(xVar, "registry");
            qc.q.i(aVar, "event");
            this.f5050f = xVar;
            this.f5051m = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f5052p) {
                this.f5050f.i(this.f5051m);
                this.f5052p = true;
            }
        }
    }

    public t0(v vVar) {
        qc.q.i(vVar, "provider");
        this.f5047a = new x(vVar);
        this.f5048b = new Handler();
    }

    private final void f(p.a aVar) {
        a aVar2 = this.f5049c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f5047a, aVar);
        this.f5049c = aVar3;
        Handler handler = this.f5048b;
        qc.q.f(aVar3);
        handler.postAtFrontOfQueue(aVar3);
    }

    public p a() {
        return this.f5047a;
    }

    public void b() {
        f(p.a.ON_START);
    }

    public void c() {
        f(p.a.ON_CREATE);
    }

    public void d() {
        f(p.a.ON_STOP);
        f(p.a.ON_DESTROY);
    }

    public void e() {
        f(p.a.ON_START);
    }
}
