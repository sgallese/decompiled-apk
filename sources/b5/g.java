package b5;

import androidx.lifecycle.p;
import androidx.lifecycle.u;
import androidx.lifecycle.v;

/* compiled from: GlobalLifecycle.kt */
/* loaded from: classes.dex */
public final class g extends androidx.lifecycle.p {

    /* renamed from: b  reason: collision with root package name */
    public static final g f7958b = new g();

    /* renamed from: c  reason: collision with root package name */
    private static final a f7959c = new a();

    /* compiled from: GlobalLifecycle.kt */
    /* loaded from: classes.dex */
    public static final class a implements v {
        a() {
        }

        @Override // androidx.lifecycle.v
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public g getLifecycle() {
            return g.f7958b;
        }
    }

    private g() {
    }

    @Override // androidx.lifecycle.p
    public void a(u uVar) {
        if (uVar instanceof androidx.lifecycle.i) {
            androidx.lifecycle.i iVar = (androidx.lifecycle.i) uVar;
            a aVar = f7959c;
            iVar.onCreate(aVar);
            iVar.onStart(aVar);
            iVar.onResume(aVar);
            return;
        }
        throw new IllegalArgumentException((uVar + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
    }

    @Override // androidx.lifecycle.p
    public p.b b() {
        return p.b.RESUMED;
    }

    public String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // androidx.lifecycle.p
    public void d(u uVar) {
    }
}
