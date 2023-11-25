package coil.request;

import ad.x1;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import b5.h;
import b5.n;
import b5.o;
import coil.util.Lifecycles;
import d5.c;
import g5.l;
import java.util.concurrent.CancellationException;
import q4.g;

/* compiled from: RequestDelegate.kt */
/* loaded from: classes.dex */
public final class ViewTargetRequestDelegate implements o {

    /* renamed from: f  reason: collision with root package name */
    private final g f9053f;

    /* renamed from: m  reason: collision with root package name */
    private final h f9054m;

    /* renamed from: p  reason: collision with root package name */
    private final c<?> f9055p;

    /* renamed from: q  reason: collision with root package name */
    private final p f9056q;

    /* renamed from: r  reason: collision with root package name */
    private final x1 f9057r;

    public ViewTargetRequestDelegate(g gVar, h hVar, c<?> cVar, p pVar, x1 x1Var) {
        this.f9053f = gVar;
        this.f9054m = hVar;
        this.f9055p = cVar;
        this.f9056q = pVar;
        this.f9057r = x1Var;
    }

    public void a() {
        x1.a.a(this.f9057r, null, 1, null);
        c<?> cVar = this.f9055p;
        if (cVar instanceof u) {
            this.f9056q.d((u) cVar);
        }
        this.f9056q.d(this);
    }

    public final void b() {
        this.f9053f.c(this.f9054m);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View] */
    @Override // b5.o
    public void d() {
        if (this.f9055p.getView().isAttachedToWindow()) {
            return;
        }
        l.l(this.f9055p.getView()).c(this);
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // androidx.lifecycle.i
    public /* synthetic */ void onCreate(v vVar) {
        androidx.lifecycle.h.a(this, vVar);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View] */
    @Override // androidx.lifecycle.i
    public void onDestroy(v vVar) {
        l.l(this.f9055p.getView()).a();
    }

    @Override // androidx.lifecycle.i
    public /* synthetic */ void onPause(v vVar) {
        androidx.lifecycle.h.c(this, vVar);
    }

    @Override // androidx.lifecycle.i
    public /* synthetic */ void onResume(v vVar) {
        androidx.lifecycle.h.d(this, vVar);
    }

    @Override // androidx.lifecycle.i
    public /* synthetic */ void onStart(v vVar) {
        androidx.lifecycle.h.e(this, vVar);
    }

    @Override // androidx.lifecycle.i
    public /* synthetic */ void onStop(v vVar) {
        androidx.lifecycle.h.f(this, vVar);
    }

    @Override // b5.o
    public /* synthetic */ void p() {
        n.b(this);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View] */
    @Override // b5.o
    public void start() {
        this.f9056q.a(this);
        c<?> cVar = this.f9055p;
        if (cVar instanceof u) {
            Lifecycles.b(this.f9056q, (u) cVar);
        }
        l.l(this.f9055p.getView()).c(this);
    }
}
