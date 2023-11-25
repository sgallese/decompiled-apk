package n2;

/* compiled from: Pools.java */
/* loaded from: classes.dex */
class g<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f20092a;

    /* renamed from: b  reason: collision with root package name */
    private int f20093b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(int i10) {
        if (i10 > 0) {
            this.f20092a = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // n2.f
    public boolean a(T t10) {
        int i10 = this.f20093b;
        Object[] objArr = this.f20092a;
        if (i10 < objArr.length) {
            objArr[i10] = t10;
            this.f20093b = i10 + 1;
            return true;
        }
        return false;
    }

    @Override // n2.f
    public T b() {
        int i10 = this.f20093b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f20092a;
        T t10 = (T) objArr[i11];
        objArr[i11] = null;
        this.f20093b = i10 - 1;
        return t10;
    }

    @Override // n2.f
    public void c(T[] tArr, int i10) {
        if (i10 > tArr.length) {
            i10 = tArr.length;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            T t10 = tArr[i11];
            int i12 = this.f20093b;
            Object[] objArr = this.f20092a;
            if (i12 < objArr.length) {
                objArr[i12] = t10;
                this.f20093b = i12 + 1;
            }
        }
    }
}
