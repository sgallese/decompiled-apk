package k8;

/* compiled from: Lazy.java */
/* loaded from: classes3.dex */
public class u<T> implements i9.b<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f19426c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile Object f19427a = f19426c;

    /* renamed from: b  reason: collision with root package name */
    private volatile i9.b<T> f19428b;

    public u(i9.b<T> bVar) {
        this.f19428b = bVar;
    }

    @Override // i9.b
    public T get() {
        T t10 = (T) this.f19427a;
        Object obj = f19426c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = this.f19427a;
                if (t10 == obj) {
                    t10 = this.f19428b.get();
                    this.f19427a = t10;
                    this.f19428b = null;
                }
            }
        }
        return t10;
    }
}
