package dc;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: LazyJVM.kt */
/* loaded from: classes4.dex */
final class o<T> implements f<T>, Serializable {

    /* renamed from: q  reason: collision with root package name */
    public static final a f13255q = new a(null);

    /* renamed from: r  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<o<?>, Object> f13256r = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "m");

    /* renamed from: f  reason: collision with root package name */
    private volatile pc.a<? extends T> f13257f;

    /* renamed from: m  reason: collision with root package name */
    private volatile Object f13258m;

    /* renamed from: p  reason: collision with root package name */
    private final Object f13259p;

    /* compiled from: LazyJVM.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    public o(pc.a<? extends T> aVar) {
        qc.q.i(aVar, "initializer");
        this.f13257f = aVar;
        v vVar = v.f13269a;
        this.f13258m = vVar;
        this.f13259p = vVar;
    }

    public boolean a() {
        if (this.f13258m != v.f13269a) {
            return true;
        }
        return false;
    }

    @Override // dc.f
    public T getValue() {
        T t10 = (T) this.f13258m;
        v vVar = v.f13269a;
        if (t10 != vVar) {
            return t10;
        }
        pc.a<? extends T> aVar = this.f13257f;
        if (aVar != null) {
            T invoke = aVar.invoke();
            if (androidx.concurrent.futures.b.a(f13256r, this, vVar, invoke)) {
                this.f13257f = null;
                return invoke;
            }
        }
        return (T) this.f13258m;
    }

    public String toString() {
        if (a()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
