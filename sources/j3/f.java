package j3;

import androidx.lifecycle.v0;
import pc.l;
import qc.q;

/* compiled from: InitializerViewModelFactory.kt */
/* loaded from: classes.dex */
public final class f<T extends v0> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<T> f19021a;

    /* renamed from: b  reason: collision with root package name */
    private final l<a, T> f19022b;

    /* JADX WARN: Multi-variable type inference failed */
    public f(Class<T> cls, l<? super a, ? extends T> lVar) {
        q.i(cls, "clazz");
        q.i(lVar, "initializer");
        this.f19021a = cls;
        this.f19022b = lVar;
    }

    public final Class<T> a() {
        return this.f19021a;
    }

    public final l<a, T> b() {
        return this.f19022b;
    }
}
