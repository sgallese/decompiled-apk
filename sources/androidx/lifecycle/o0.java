package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.p;
import androidx.lifecycle.y0;
import androidx.savedstate.a;
import j3.a;

/* compiled from: SavedStateHandleSupport.kt */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a.b<w3.d> f5025a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final a.b<c1> f5026b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final a.b<Bundle> f5027c = new a();

    /* compiled from: SavedStateHandleSupport.kt */
    /* loaded from: classes.dex */
    public static final class a implements a.b<Bundle> {
        a() {
        }
    }

    /* compiled from: SavedStateHandleSupport.kt */
    /* loaded from: classes.dex */
    public static final class b implements a.b<w3.d> {
        b() {
        }
    }

    /* compiled from: SavedStateHandleSupport.kt */
    /* loaded from: classes.dex */
    public static final class c implements a.b<c1> {
        c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SavedStateHandleSupport.kt */
    /* loaded from: classes.dex */
    public static final class d extends qc.r implements pc.l<j3.a, q0> {

        /* renamed from: f  reason: collision with root package name */
        public static final d f5028f = new d();

        d() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final q0 invoke(j3.a aVar) {
            qc.q.i(aVar, "$this$initializer");
            return new q0();
        }
    }

    public static final n0 a(j3.a aVar) {
        qc.q.i(aVar, "<this>");
        w3.d dVar = (w3.d) aVar.a(f5025a);
        if (dVar != null) {
            c1 c1Var = (c1) aVar.a(f5026b);
            if (c1Var != null) {
                Bundle bundle = (Bundle) aVar.a(f5027c);
                String str = (String) aVar.a(y0.c.f5084c);
                if (str != null) {
                    return b(dVar, c1Var, str, bundle);
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    private static final n0 b(w3.d dVar, c1 c1Var, String str, Bundle bundle) {
        p0 d10 = d(dVar);
        q0 e10 = e(c1Var);
        n0 n0Var = e10.b().get(str);
        if (n0Var == null) {
            n0 a10 = n0.f5016f.a(d10.a(str), bundle);
            e10.b().put(str, a10);
            return a10;
        }
        return n0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends w3.d & c1> void c(T t10) {
        boolean z10;
        qc.q.i(t10, "<this>");
        p.b b10 = t10.getLifecycle().b();
        if (b10 != p.b.INITIALIZED && b10 != p.b.CREATED) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (t10.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
                p0 p0Var = new p0(t10.getSavedStateRegistry(), t10);
                t10.getSavedStateRegistry().h("androidx.lifecycle.internal.SavedStateHandlesProvider", p0Var);
                t10.getLifecycle().a(new SavedStateHandleAttacher(p0Var));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final p0 d(w3.d dVar) {
        p0 p0Var;
        qc.q.i(dVar, "<this>");
        a.c c10 = dVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        if (c10 instanceof p0) {
            p0Var = (p0) c10;
        } else {
            p0Var = null;
        }
        if (p0Var != null) {
            return p0Var;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final q0 e(c1 c1Var) {
        qc.q.i(c1Var, "<this>");
        j3.c cVar = new j3.c();
        cVar.a(qc.g0.b(q0.class), d.f5028f);
        return (q0) new y0(c1Var, cVar.b()).b("androidx.lifecycle.internal.SavedStateHandlesVM", q0.class);
    }
}
