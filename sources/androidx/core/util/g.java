package androidx.core.util;

/* compiled from: Pools.java */
/* loaded from: classes.dex */
public class g<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f4060a;

    /* renamed from: b  reason: collision with root package name */
    private int f4061b;

    public g(int i10) {
        if (i10 > 0) {
            this.f4060a = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    private boolean c(T t10) {
        for (int i10 = 0; i10 < this.f4061b; i10++) {
            if (this.f4060a[i10] == t10) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.util.f
    public boolean a(T t10) {
        if (!c(t10)) {
            int i10 = this.f4061b;
            Object[] objArr = this.f4060a;
            if (i10 < objArr.length) {
                objArr[i10] = t10;
                this.f4061b = i10 + 1;
                return true;
            }
            return false;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    @Override // androidx.core.util.f
    public T b() {
        int i10 = this.f4061b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f4060a;
        T t10 = (T) objArr[i11];
        objArr[i11] = null;
        this.f4061b = i10 - 1;
        return t10;
    }
}
