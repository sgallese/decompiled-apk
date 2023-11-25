package androidx.room;

/* compiled from: EntityInsertionAdapter.java */
/* loaded from: classes.dex */
public abstract class b<T> extends o {
    public b(i iVar) {
        super(iVar);
    }

    protected abstract void g(x3.f fVar, T t10);

    public final void h(T t10) {
        x3.f a10 = a();
        try {
            g(a10, t10);
            a10.Q0();
        } finally {
            f(a10);
        }
    }
}
