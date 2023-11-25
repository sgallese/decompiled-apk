package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.y0;

/* compiled from: AbstractSavedStateViewModelFactory.kt */
/* loaded from: classes.dex */
public abstract class a extends y0.d implements y0.b {

    /* renamed from: d  reason: collision with root package name */
    public static final C0094a f4926d = new C0094a(null);

    /* renamed from: a  reason: collision with root package name */
    private androidx.savedstate.a f4927a;

    /* renamed from: b  reason: collision with root package name */
    private p f4928b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f4929c;

    /* compiled from: AbstractSavedStateViewModelFactory.kt */
    /* renamed from: androidx.lifecycle.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0094a {
        private C0094a() {
        }

        public /* synthetic */ C0094a(qc.h hVar) {
            this();
        }
    }

    public a() {
    }

    private final <T extends v0> T d(String str, Class<T> cls) {
        androidx.savedstate.a aVar = this.f4927a;
        qc.q.f(aVar);
        p pVar = this.f4928b;
        qc.q.f(pVar);
        SavedStateHandleController b10 = LegacySavedStateHandleController.b(aVar, pVar, str, this.f4929c);
        T t10 = (T) e(str, cls, b10.b());
        t10.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", b10);
        return t10;
    }

    @Override // androidx.lifecycle.y0.b
    public <T extends v0> T a(Class<T> cls) {
        qc.q.i(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            if (this.f4928b != null) {
                return (T) d(canonicalName, cls);
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.y0.b
    public <T extends v0> T b(Class<T> cls, j3.a aVar) {
        qc.q.i(cls, "modelClass");
        qc.q.i(aVar, "extras");
        String str = (String) aVar.a(y0.c.f5084c);
        if (str != null) {
            if (this.f4927a != null) {
                return (T) d(str, cls);
            }
            return (T) e(str, cls, o0.a(aVar));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.y0.d
    public void c(v0 v0Var) {
        qc.q.i(v0Var, "viewModel");
        androidx.savedstate.a aVar = this.f4927a;
        if (aVar != null) {
            qc.q.f(aVar);
            p pVar = this.f4928b;
            qc.q.f(pVar);
            LegacySavedStateHandleController.a(v0Var, aVar, pVar);
        }
    }

    protected abstract <T extends v0> T e(String str, Class<T> cls, n0 n0Var);

    public a(w3.d dVar, Bundle bundle) {
        qc.q.i(dVar, "owner");
        this.f4927a = dVar.getSavedStateRegistry();
        this.f4928b = dVar.getLifecycle();
        this.f4929c = bundle;
    }
}
