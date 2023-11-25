package bb;

/* compiled from: DoubleCheck.java */
/* loaded from: classes4.dex */
public final class a<T> implements cc.a<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f8114c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile cc.a<T> f8115a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f8116b = f8114c;

    private a(cc.a<T> aVar) {
        this.f8115a = aVar;
    }

    public static <P extends cc.a<T>, T> cc.a<T> a(P p10) {
        b.b(p10);
        if (p10 instanceof a) {
            return p10;
        }
        return new a(p10);
    }

    private static Object b(Object obj, Object obj2) {
        boolean z10;
        if (obj != f8114c) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && obj != obj2) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
        }
        return obj2;
    }

    @Override // cc.a
    public T get() {
        T t10 = (T) this.f8116b;
        Object obj = f8114c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = this.f8116b;
                if (t10 == obj) {
                    t10 = this.f8115a.get();
                    this.f8116b = b(this.f8116b, t10);
                    this.f8115a = null;
                }
            }
        }
        return t10;
    }
}
