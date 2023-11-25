package androidx.work.impl.utils.futures;

/* compiled from: SettableFuture.java */
/* loaded from: classes.dex */
public final class c<V> extends a<V> {
    private c() {
    }

    public static <V> c<V> s() {
        return new c<>();
    }

    @Override // androidx.work.impl.utils.futures.a
    public boolean o(V v10) {
        return super.o(v10);
    }

    @Override // androidx.work.impl.utils.futures.a
    public boolean p(Throwable th) {
        return super.p(th);
    }

    @Override // androidx.work.impl.utils.futures.a
    public boolean q(com.google.common.util.concurrent.a<? extends V> aVar) {
        return super.q(aVar);
    }
}
