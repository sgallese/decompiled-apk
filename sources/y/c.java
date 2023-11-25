package y;

/* compiled from: IntervalList.kt */
/* loaded from: classes.dex */
public interface c<T> {

    /* compiled from: IntervalList.kt */
    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final int f26022a;

        /* renamed from: b  reason: collision with root package name */
        private final int f26023b;

        /* renamed from: c  reason: collision with root package name */
        private final T f26024c;

        public a(int i10, int i11, T t10) {
            boolean z10;
            this.f26022a = i10;
            this.f26023b = i11;
            this.f26024c = t10;
            if (i10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (i11 > 0) {
                    return;
                }
                throw new IllegalArgumentException(("size should be >0, but was " + i11).toString());
            }
            throw new IllegalArgumentException(("startIndex should be >= 0, but was " + i10).toString());
        }

        public final int a() {
            return this.f26023b;
        }

        public final int b() {
            return this.f26022a;
        }

        public final T c() {
            return this.f26024c;
        }
    }

    void a(int i10, int i11, pc.l<? super a<? extends T>, dc.w> lVar);

    a<T> get(int i10);

    int getSize();
}
