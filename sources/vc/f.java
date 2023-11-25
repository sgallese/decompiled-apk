package vc;

/* compiled from: PrimitiveRanges.kt */
/* loaded from: classes4.dex */
public final class f extends d implements c<Integer> {

    /* renamed from: r  reason: collision with root package name */
    public static final a f25123r = new a(null);

    /* renamed from: s  reason: collision with root package name */
    private static final f f25124s = new f(1, 0);

    /* compiled from: PrimitiveRanges.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final f a() {
            return f.f25124s;
        }
    }

    public f(int i10, int i11) {
        super(i10, i11, 1);
    }

    @Override // vc.d
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            if (!isEmpty() || !((f) obj).isEmpty()) {
                f fVar = (f) obj;
                if (h() != fVar.h() || i() != fVar.i()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // vc.d
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (h() * 31) + i();
    }

    @Override // vc.d, vc.c
    public boolean isEmpty() {
        if (h() > i()) {
            return true;
        }
        return false;
    }

    public boolean m(int i10) {
        if (h() <= i10 && i10 <= i()) {
            return true;
        }
        return false;
    }

    @Override // vc.c
    /* renamed from: n  reason: merged with bridge method [inline-methods] */
    public Integer f() {
        return Integer.valueOf(i());
    }

    @Override // vc.c
    /* renamed from: o  reason: merged with bridge method [inline-methods] */
    public Integer a() {
        return Integer.valueOf(h());
    }

    @Override // vc.d
    public String toString() {
        return h() + ".." + i();
    }
}
