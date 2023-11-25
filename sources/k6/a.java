package k6;

/* compiled from: DoubleCheck.java */
/* loaded from: classes.dex */
public final class a<T> implements cc.a<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f19357c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile cc.a<T> f19358a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f19359b = f19357c;

    private a(cc.a<T> aVar) {
        this.f19358a = aVar;
    }

    public static <P extends cc.a<T>, T> cc.a<T> a(P p10) {
        d.b(p10);
        if (p10 instanceof a) {
            return p10;
        }
        return new a(p10);
    }

    public static Object b(Object obj, Object obj2) {
        boolean z10;
        if (obj != f19357c) {
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
        T t10 = (T) this.f19359b;
        Object obj = f19357c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = this.f19359b;
                if (t10 == obj) {
                    t10 = this.f19358a.get();
                    this.f19359b = b(this.f19359b, t10);
                    this.f19358a = null;
                }
            }
        }
        return t10;
    }
}
