package x5;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final String f25827a;

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f25828a;

        /* synthetic */ a(l0 l0Var) {
        }

        public o a() {
            if (this.f25828a != null) {
                return new o(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public a b(String str) {
            this.f25828a = str;
            return this;
        }
    }

    /* synthetic */ o(a aVar, m0 m0Var) {
        this.f25827a = aVar.f25828a;
    }

    public static a a() {
        return new a(null);
    }

    public final String b() {
        return this.f25827a;
    }
}
