package coil.request;

import ad.x1;
import androidx.lifecycle.h;
import androidx.lifecycle.p;
import androidx.lifecycle.v;
import b5.n;
import b5.o;

/* compiled from: RequestDelegate.kt */
/* loaded from: classes.dex */
public final class BaseRequestDelegate implements o {

    /* renamed from: f  reason: collision with root package name */
    private final p f9051f;

    /* renamed from: m  reason: collision with root package name */
    private final x1 f9052m;

    public BaseRequestDelegate(p pVar, x1 x1Var) {
        this.f9051f = pVar;
        this.f9052m = x1Var;
    }

    public void a() {
        x1.a.a(this.f9052m, null, 1, null);
    }

    @Override // b5.o
    public /* synthetic */ void d() {
        n.a(this);
    }

    @Override // androidx.lifecycle.i
    public /* synthetic */ void onCreate(v vVar) {
        h.a(this, vVar);
    }

    @Override // androidx.lifecycle.i
    public void onDestroy(v vVar) {
        a();
    }

    @Override // androidx.lifecycle.i
    public /* synthetic */ void onPause(v vVar) {
        h.c(this, vVar);
    }

    @Override // androidx.lifecycle.i
    public /* synthetic */ void onResume(v vVar) {
        h.d(this, vVar);
    }

    @Override // androidx.lifecycle.i
    public /* synthetic */ void onStart(v vVar) {
        h.e(this, vVar);
    }

    @Override // androidx.lifecycle.i
    public /* synthetic */ void onStop(v vVar) {
        h.f(this, vVar);
    }

    @Override // b5.o
    public void p() {
        this.f9051f.d(this);
    }

    @Override // b5.o
    public void start() {
        this.f9051f.a(this);
    }
}
