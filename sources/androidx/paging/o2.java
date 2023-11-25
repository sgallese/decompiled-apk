package androidx.paging;

import kotlin.NoWhenBranchMatchedException;

/* compiled from: ViewportHint.kt */
/* loaded from: classes.dex */
public abstract class o2 {

    /* renamed from: a  reason: collision with root package name */
    private final int f5974a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5975b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5976c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5977d;

    /* compiled from: ViewportHint.kt */
    /* loaded from: classes.dex */
    public static final class a extends o2 {

        /* renamed from: e  reason: collision with root package name */
        private final int f5978e;

        /* renamed from: f  reason: collision with root package name */
        private final int f5979f;

        public a(int i10, int i11, int i12, int i13, int i14, int i15) {
            super(i12, i13, i14, i15, null);
            this.f5978e = i10;
            this.f5979f = i11;
        }

        @Override // androidx.paging.o2
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f5978e == aVar.f5978e && this.f5979f == aVar.f5979f && d() == aVar.d() && c() == aVar.c() && a() == aVar.a() && b() == aVar.b()) {
                return true;
            }
            return false;
        }

        public final int f() {
            return this.f5979f;
        }

        public final int g() {
            return this.f5978e;
        }

        @Override // androidx.paging.o2
        public int hashCode() {
            return super.hashCode() + this.f5978e + this.f5979f;
        }

        public String toString() {
            String h10;
            h10 = yc.o.h("ViewportHint.Access(\n            |    pageOffset=" + this.f5978e + ",\n            |    indexInPage=" + this.f5979f + ",\n            |    presentedItemsBefore=" + d() + ",\n            |    presentedItemsAfter=" + c() + ",\n            |    originalPageOffsetFirst=" + a() + ",\n            |    originalPageOffsetLast=" + b() + ",\n            |)", null, 1, null);
            return h10;
        }
    }

    /* compiled from: ViewportHint.kt */
    /* loaded from: classes.dex */
    public static final class b extends o2 {
        public b(int i10, int i11, int i12, int i13) {
            super(i10, i11, i12, i13, null);
        }

        public String toString() {
            String h10;
            h10 = yc.o.h("ViewportHint.Initial(\n            |    presentedItemsBefore=" + d() + ",\n            |    presentedItemsAfter=" + c() + ",\n            |    originalPageOffsetFirst=" + a() + ",\n            |    originalPageOffsetLast=" + b() + ",\n            |)", null, 1, null);
            return h10;
        }
    }

    /* compiled from: ViewportHint.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5980a;

        static {
            int[] iArr = new int[t0.values().length];
            try {
                iArr[t0.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t0.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t0.APPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f5980a = iArr;
        }
    }

    public /* synthetic */ o2(int i10, int i11, int i12, int i13, qc.h hVar) {
        this(i10, i11, i12, i13);
    }

    public final int a() {
        return this.f5976c;
    }

    public final int b() {
        return this.f5977d;
    }

    public final int c() {
        return this.f5975b;
    }

    public final int d() {
        return this.f5974a;
    }

    public final int e(t0 t0Var) {
        qc.q.i(t0Var, "loadType");
        int i10 = c.f5980a[t0Var.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return this.f5975b;
                }
                throw new NoWhenBranchMatchedException();
            }
            return this.f5974a;
        }
        throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj;
        if (this.f5974a == o2Var.f5974a && this.f5975b == o2Var.f5975b && this.f5976c == o2Var.f5976c && this.f5977d == o2Var.f5977d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5974a + this.f5975b + this.f5976c + this.f5977d;
    }

    private o2(int i10, int i11, int i12, int i13) {
        this.f5974a = i10;
        this.f5975b = i11;
        this.f5976c = i12;
        this.f5977d = i13;
    }
}
