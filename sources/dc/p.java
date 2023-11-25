package dc;

import java.io.Serializable;

/* compiled from: LazyJVM.kt */
/* loaded from: classes4.dex */
final class p<T> implements f<T>, Serializable {

    /* renamed from: f  reason: collision with root package name */
    private pc.a<? extends T> f13260f;

    /* renamed from: m  reason: collision with root package name */
    private volatile Object f13261m;

    /* renamed from: p  reason: collision with root package name */
    private final Object f13262p;

    public p(pc.a<? extends T> aVar, Object obj) {
        qc.q.i(aVar, "initializer");
        this.f13260f = aVar;
        this.f13261m = v.f13269a;
        this.f13262p = obj == null ? this : obj;
    }

    public boolean a() {
        if (this.f13261m != v.f13269a) {
            return true;
        }
        return false;
    }

    @Override // dc.f
    public T getValue() {
        T t10;
        T t11 = (T) this.f13261m;
        v vVar = v.f13269a;
        if (t11 != vVar) {
            return t11;
        }
        synchronized (this.f13262p) {
            t10 = (T) this.f13261m;
            if (t10 == vVar) {
                pc.a<? extends T> aVar = this.f13260f;
                qc.q.f(aVar);
                t10 = aVar.invoke();
                this.f13261m = t10;
                this.f13260f = null;
            }
        }
        return t10;
    }

    public String toString() {
        if (a()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }

    public /* synthetic */ p(pc.a aVar, Object obj, int i10, qc.h hVar) {
        this(aVar, (i10 & 2) != 0 ? null : obj);
    }
}
