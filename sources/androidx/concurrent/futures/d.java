package androidx.concurrent.futures;

/* compiled from: ResolvableFuture.java */
/* loaded from: classes.dex */
public final class d<V> extends a<V> {
    private d() {
    }

    public static <V> d<V> w() {
        return new d<>();
    }

    @Override // androidx.concurrent.futures.a
    public boolean s(V v10) {
        return super.s(v10);
    }

    @Override // androidx.concurrent.futures.a
    public boolean t(Throwable th) {
        return super.t(th);
    }
}
