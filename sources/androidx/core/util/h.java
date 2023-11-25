package androidx.core.util;

/* compiled from: Pools.java */
/* loaded from: classes.dex */
public class h<T> extends g<T> {

    /* renamed from: c  reason: collision with root package name */
    private final Object f4062c;

    public h(int i10) {
        super(i10);
        this.f4062c = new Object();
    }

    @Override // androidx.core.util.g, androidx.core.util.f
    public boolean a(T t10) {
        boolean a10;
        synchronized (this.f4062c) {
            a10 = super.a(t10);
        }
        return a10;
    }

    @Override // androidx.core.util.g, androidx.core.util.f
    public T b() {
        T t10;
        synchronized (this.f4062c) {
            t10 = (T) super.b();
        }
        return t10;
    }
}
