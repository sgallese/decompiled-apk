package g5;

/* compiled from: Time.kt */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final x f16220a = new x();

    /* renamed from: b  reason: collision with root package name */
    private static pc.a<Long> f16221b = a.f16222w;

    /* compiled from: Time.kt */
    /* loaded from: classes.dex */
    /* synthetic */ class a extends qc.n implements pc.a<Long> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f16222w = new a();

        a() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // pc.a
        /* renamed from: h  reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    private x() {
    }

    public final long a() {
        return f16221b.invoke().longValue();
    }
}
