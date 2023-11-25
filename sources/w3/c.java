package w3;

import android.os.Bundle;
import androidx.lifecycle.p;
import androidx.savedstate.Recreator;
import qc.h;
import qc.q;

/* compiled from: SavedStateRegistryController.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f25360d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final d f25361a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.savedstate.a f25362b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f25363c;

    /* compiled from: SavedStateRegistryController.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final c a(d dVar) {
            q.i(dVar, "owner");
            return new c(dVar, null);
        }
    }

    public /* synthetic */ c(d dVar, h hVar) {
        this(dVar);
    }

    public static final c a(d dVar) {
        return f25360d.a(dVar);
    }

    public final androidx.savedstate.a b() {
        return this.f25362b;
    }

    public final void c() {
        boolean z10;
        p lifecycle = this.f25361a.getLifecycle();
        if (lifecycle.b() == p.b.INITIALIZED) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            lifecycle.a(new Recreator(this.f25361a));
            this.f25362b.e(lifecycle);
            this.f25363c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public final void d(Bundle bundle) {
        if (!this.f25363c) {
            c();
        }
        p lifecycle = this.f25361a.getLifecycle();
        if ((!lifecycle.b().isAtLeast(p.b.STARTED)) != false) {
            this.f25362b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
    }

    public final void e(Bundle bundle) {
        q.i(bundle, "outBundle");
        this.f25362b.g(bundle);
    }

    private c(d dVar) {
        this.f25361a = dVar;
        this.f25362b = new androidx.savedstate.a();
    }
}
