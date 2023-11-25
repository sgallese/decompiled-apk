package xa;

import androidx.lifecycle.n0;
import androidx.lifecycle.v0;
import androidx.lifecycle.y0;
import java.io.Closeable;
import java.util.Map;
import java.util.Set;
import wa.f;

/* compiled from: HiltViewModelFactory.java */
/* loaded from: classes4.dex */
public final class d implements y0.b {

    /* renamed from: a  reason: collision with root package name */
    private final Set<String> f25889a;

    /* renamed from: b  reason: collision with root package name */
    private final y0.b f25890b;

    /* renamed from: c  reason: collision with root package name */
    private final androidx.lifecycle.a f25891c;

    /* compiled from: HiltViewModelFactory.java */
    /* loaded from: classes4.dex */
    class a extends androidx.lifecycle.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f f25892e;

        a(f fVar) {
            this.f25892e = fVar;
        }

        @Override // androidx.lifecycle.a
        protected <T extends v0> T e(String str, Class<T> cls, n0 n0Var) {
            final e eVar = new e();
            cc.a<v0> aVar = ((b) ra.a.a(this.f25892e.savedStateHandle(n0Var).viewModelLifecycle(eVar).build(), b.class)).getHiltViewModelMap().get(cls.getName());
            if (aVar != null) {
                T t10 = (T) aVar.get();
                t10.addCloseable(new Closeable() { // from class: xa.c
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        e.this.a();
                    }
                });
                return t10;
            }
            throw new IllegalStateException("Expected the @HiltViewModel-annotated class '" + cls.getName() + "' to be available in the multi-binding of @HiltViewModelMap but none was found.");
        }
    }

    /* compiled from: HiltViewModelFactory.java */
    /* loaded from: classes4.dex */
    public interface b {
        Map<String, cc.a<v0>> getHiltViewModelMap();
    }

    public d(Set<String> set, y0.b bVar, f fVar) {
        this.f25889a = set;
        this.f25890b = bVar;
        this.f25891c = new a(fVar);
    }

    @Override // androidx.lifecycle.y0.b
    public <T extends v0> T a(Class<T> cls) {
        if (this.f25889a.contains(cls.getName())) {
            return (T) this.f25891c.a(cls);
        }
        return (T) this.f25890b.a(cls);
    }

    @Override // androidx.lifecycle.y0.b
    public <T extends v0> T b(Class<T> cls, j3.a aVar) {
        if (this.f25889a.contains(cls.getName())) {
            return (T) this.f25891c.b(cls, aVar);
        }
        return (T) this.f25890b.b(cls, aVar);
    }
}
