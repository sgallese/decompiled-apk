package fd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: Atomic.kt */
/* loaded from: classes4.dex */
public abstract class b<T> extends z {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f15620a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = a.f15618a;

    private final Object c(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15620a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = a.f15618a;
        if (obj2 != obj3) {
            return obj2;
        }
        if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj3, obj)) {
            return obj;
        }
        return atomicReferenceFieldUpdater.get(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fd.z
    public final Object a(Object obj) {
        Object obj2 = f15620a.get(this);
        if (obj2 == a.f15618a) {
            obj2 = c(d(obj));
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(T t10, Object obj);

    public abstract Object d(T t10);
}
