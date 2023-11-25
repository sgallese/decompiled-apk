package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.y0;
import java.lang.reflect.Constructor;
import java.util.List;

/* compiled from: SavedStateViewModelFactory.kt */
/* loaded from: classes.dex */
public final class r0 extends y0.d implements y0.b {

    /* renamed from: a  reason: collision with root package name */
    private Application f5040a;

    /* renamed from: b  reason: collision with root package name */
    private final y0.b f5041b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f5042c;

    /* renamed from: d  reason: collision with root package name */
    private p f5043d;

    /* renamed from: e  reason: collision with root package name */
    private androidx.savedstate.a f5044e;

    public r0() {
        this.f5041b = new y0.a();
    }

    @Override // androidx.lifecycle.y0.b
    public <T extends v0> T a(Class<T> cls) {
        qc.q.i(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.y0.b
    public <T extends v0> T b(Class<T> cls, j3.a aVar) {
        List list;
        Constructor c10;
        List list2;
        qc.q.i(cls, "modelClass");
        qc.q.i(aVar, "extras");
        String str = (String) aVar.a(y0.c.f5084c);
        if (str != null) {
            if (aVar.a(o0.f5025a) != null && aVar.a(o0.f5026b) != null) {
                Application application = (Application) aVar.a(y0.a.f5079g);
                boolean isAssignableFrom = b.class.isAssignableFrom(cls);
                if (!isAssignableFrom || application == null) {
                    list = s0.f5046b;
                    c10 = s0.c(cls, list);
                } else {
                    list2 = s0.f5045a;
                    c10 = s0.c(cls, list2);
                }
                if (c10 == null) {
                    return (T) this.f5041b.b(cls, aVar);
                }
                if (isAssignableFrom && application != null) {
                    return (T) s0.d(cls, c10, application, o0.a(aVar));
                }
                return (T) s0.d(cls, c10, o0.a(aVar));
            } else if (this.f5043d != null) {
                return (T) d(str, cls);
            } else {
                throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            }
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.y0.d
    public void c(v0 v0Var) {
        qc.q.i(v0Var, "viewModel");
        if (this.f5043d != null) {
            androidx.savedstate.a aVar = this.f5044e;
            qc.q.f(aVar);
            p pVar = this.f5043d;
            qc.q.f(pVar);
            LegacySavedStateHandleController.a(v0Var, aVar, pVar);
        }
    }

    public final <T extends v0> T d(String str, Class<T> cls) {
        List list;
        Constructor c10;
        T t10;
        Application application;
        List list2;
        qc.q.i(str, "key");
        qc.q.i(cls, "modelClass");
        p pVar = this.f5043d;
        if (pVar != null) {
            boolean isAssignableFrom = b.class.isAssignableFrom(cls);
            if (!isAssignableFrom || this.f5040a == null) {
                list = s0.f5046b;
                c10 = s0.c(cls, list);
            } else {
                list2 = s0.f5045a;
                c10 = s0.c(cls, list2);
            }
            if (c10 == null) {
                if (this.f5040a != null) {
                    return (T) this.f5041b.a(cls);
                }
                return (T) y0.c.f5082a.a().a(cls);
            }
            androidx.savedstate.a aVar = this.f5044e;
            qc.q.f(aVar);
            SavedStateHandleController b10 = LegacySavedStateHandleController.b(aVar, pVar, str, this.f5042c);
            if (isAssignableFrom && (application = this.f5040a) != null) {
                qc.q.f(application);
                t10 = (T) s0.d(cls, c10, application, b10.b());
            } else {
                t10 = (T) s0.d(cls, c10, b10.b());
            }
            t10.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", b10);
            return t10;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @SuppressLint({"LambdaLast"})
    public r0(Application application, w3.d dVar, Bundle bundle) {
        y0.a aVar;
        qc.q.i(dVar, "owner");
        this.f5044e = dVar.getSavedStateRegistry();
        this.f5043d = dVar.getLifecycle();
        this.f5042c = bundle;
        this.f5040a = application;
        if (application != null) {
            aVar = y0.a.f5077e.b(application);
        } else {
            aVar = new y0.a();
        }
        this.f5041b = aVar;
    }
}
