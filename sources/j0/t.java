package j0;

/* compiled from: CompositionLocal.kt */
/* loaded from: classes.dex */
public abstract class t<T> {

    /* renamed from: a  reason: collision with root package name */
    private final u0<T> f18899a;

    public /* synthetic */ t(pc.a aVar, qc.h hVar) {
        this(aVar);
    }

    public final u0<T> a() {
        return this.f18899a;
    }

    public abstract g3<T> b(T t10, l lVar, int i10);

    private t(pc.a<? extends T> aVar) {
        this.f18899a = new u0<>(aVar);
    }
}
