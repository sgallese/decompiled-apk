package ad;

/* compiled from: JobSupport.kt */
/* loaded from: classes4.dex */
public final class f2 {

    /* renamed from: a  reason: collision with root package name */
    private static final fd.g0 f503a = new fd.g0("COMPLETING_ALREADY");

    /* renamed from: b  reason: collision with root package name */
    public static final fd.g0 f504b = new fd.g0("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c  reason: collision with root package name */
    private static final fd.g0 f505c = new fd.g0("COMPLETING_RETRY");

    /* renamed from: d  reason: collision with root package name */
    private static final fd.g0 f506d = new fd.g0("TOO_LATE_TO_CANCEL");

    /* renamed from: e  reason: collision with root package name */
    private static final fd.g0 f507e = new fd.g0("SEALED");

    /* renamed from: f  reason: collision with root package name */
    private static final f1 f508f = new f1(false);

    /* renamed from: g  reason: collision with root package name */
    private static final f1 f509g = new f1(true);

    public static final Object g(Object obj) {
        if (obj instanceof r1) {
            return new s1((r1) obj);
        }
        return obj;
    }

    public static final Object h(Object obj) {
        s1 s1Var;
        r1 r1Var;
        if (obj instanceof s1) {
            s1Var = (s1) obj;
        } else {
            s1Var = null;
        }
        if (s1Var != null && (r1Var = s1Var.f556a) != null) {
            return r1Var;
        }
        return obj;
    }
}
