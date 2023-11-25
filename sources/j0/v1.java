package j0;

/* compiled from: CompositionLocal.kt */
/* loaded from: classes.dex */
public abstract class v1<T> extends t<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(pc.a<? extends T> aVar) {
        super(aVar, null);
        qc.q.i(aVar, "defaultFactory");
    }

    public final w1<T> c(T t10) {
        return new w1<>(this, t10, true);
    }

    public final w1<T> d(T t10) {
        return new w1<>(this, t10, false);
    }
}
