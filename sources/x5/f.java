package x5;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private String f25815a;

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f25816a;

        /* synthetic */ a(z zVar) {
        }

        public f a() {
            String str = this.f25816a;
            if (str != null) {
                f fVar = new f(null);
                fVar.f25815a = str;
                return fVar;
            }
            throw new IllegalArgumentException("Purchase token must be set");
        }

        public a b(String str) {
            this.f25816a = str;
            return this;
        }
    }

    /* synthetic */ f(a0 a0Var) {
    }

    public static a b() {
        return new a(null);
    }

    public String a() {
        return this.f25815a;
    }
}
