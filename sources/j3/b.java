package j3;

import androidx.lifecycle.v0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import qc.q;

/* compiled from: InitializerViewModelFactory.kt */
/* loaded from: classes.dex */
public final class b implements y0.b {

    /* renamed from: a  reason: collision with root package name */
    private final f<?>[] f19018a;

    public b(f<?>... fVarArr) {
        q.i(fVarArr, "initializers");
        this.f19018a = fVarArr;
    }

    @Override // androidx.lifecycle.y0.b
    public /* synthetic */ v0 a(Class cls) {
        return z0.a(this, cls);
    }

    @Override // androidx.lifecycle.y0.b
    public <T extends v0> T b(Class<T> cls, a aVar) {
        q.i(cls, "modelClass");
        q.i(aVar, "extras");
        T t10 = null;
        for (f<?> fVar : this.f19018a) {
            if (q.d(fVar.a(), cls)) {
                Object invoke = fVar.b().invoke(aVar);
                if (invoke instanceof v0) {
                    t10 = (T) invoke;
                } else {
                    t10 = null;
                }
            }
        }
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }
}
