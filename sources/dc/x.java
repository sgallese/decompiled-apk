package dc;

import java.io.Serializable;

/* compiled from: Lazy.kt */
/* loaded from: classes4.dex */
public final class x<T> implements f<T>, Serializable {

    /* renamed from: f  reason: collision with root package name */
    private pc.a<? extends T> f13271f;

    /* renamed from: m  reason: collision with root package name */
    private Object f13272m;

    public x(pc.a<? extends T> aVar) {
        qc.q.i(aVar, "initializer");
        this.f13271f = aVar;
        this.f13272m = v.f13269a;
    }

    public boolean a() {
        if (this.f13272m != v.f13269a) {
            return true;
        }
        return false;
    }

    @Override // dc.f
    public T getValue() {
        if (this.f13272m == v.f13269a) {
            pc.a<? extends T> aVar = this.f13271f;
            qc.q.f(aVar);
            this.f13272m = aVar.invoke();
            this.f13271f = null;
        }
        return (T) this.f13272m;
    }

    public String toString() {
        if (a()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
