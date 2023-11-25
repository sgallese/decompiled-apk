package n1;

/* compiled from: AlignmentLine.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final k f19903a = new k(a.f19905w);

    /* renamed from: b  reason: collision with root package name */
    private static final k f19904b = new k(C0450b.f19906w);

    /* compiled from: AlignmentLine.kt */
    /* loaded from: classes.dex */
    /* synthetic */ class a extends qc.n implements pc.p<Integer, Integer, Integer> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f19905w = new a();

        a() {
            super(2, sc.a.class, "min", "min(II)I", 1);
        }

        public final Integer h(int i10, int i11) {
            return Integer.valueOf(Math.min(i10, i11));
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
            return h(num.intValue(), num2.intValue());
        }
    }

    /* compiled from: AlignmentLine.kt */
    /* renamed from: n1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    /* synthetic */ class C0450b extends qc.n implements pc.p<Integer, Integer, Integer> {

        /* renamed from: w  reason: collision with root package name */
        public static final C0450b f19906w = new C0450b();

        C0450b() {
            super(2, sc.a.class, "max", "max(II)I", 1);
        }

        public final Integer h(int i10, int i11) {
            return Integer.valueOf(Math.max(i10, i11));
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
            return h(num.intValue(), num2.intValue());
        }
    }

    public static final k a() {
        return f19903a;
    }

    public static final k b() {
        return f19904b;
    }

    public static final int c(n1.a aVar, int i10, int i11) {
        qc.q.i(aVar, "<this>");
        return aVar.a().invoke(Integer.valueOf(i10), Integer.valueOf(i11)).intValue();
    }
}
