package g5;

import a5.d;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SystemCallbacks.kt */
/* loaded from: classes.dex */
public final class w implements ComponentCallbacks2, d.a {

    /* renamed from: s  reason: collision with root package name */
    public static final a f16214s = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private final Context f16215f;

    /* renamed from: m  reason: collision with root package name */
    private final WeakReference<q4.j> f16216m;

    /* renamed from: p  reason: collision with root package name */
    private final a5.d f16217p;

    /* renamed from: q  reason: collision with root package name */
    private volatile boolean f16218q;

    /* renamed from: r  reason: collision with root package name */
    private final AtomicBoolean f16219r;

    /* compiled from: SystemCallbacks.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    public w(q4.j jVar, Context context, boolean z10) {
        a5.d cVar;
        this.f16215f = context;
        this.f16216m = new WeakReference<>(jVar);
        if (z10) {
            jVar.h();
            cVar = a5.e.a(context, this, null);
        } else {
            cVar = new a5.c();
        }
        this.f16217p = cVar;
        this.f16218q = cVar.a();
        this.f16219r = new AtomicBoolean(false);
    }

    @Override // a5.d.a
    public void a(boolean z10) {
        dc.w wVar;
        q4.j jVar = this.f16216m.get();
        if (jVar != null) {
            jVar.h();
            this.f16218q = z10;
            wVar = dc.w.f13270a;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            d();
        }
    }

    public final boolean b() {
        return this.f16218q;
    }

    public final void c() {
        this.f16215f.registerComponentCallbacks(this);
    }

    public final void d() {
        if (this.f16219r.getAndSet(true)) {
            return;
        }
        this.f16215f.unregisterComponentCallbacks(this);
        this.f16217p.shutdown();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        if (this.f16216m.get() == null) {
            d();
            dc.w wVar = dc.w.f13270a;
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        dc.w wVar;
        q4.j jVar = this.f16216m.get();
        if (jVar != null) {
            jVar.h();
            jVar.l(i10);
            wVar = dc.w.f13270a;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            d();
        }
    }
}
