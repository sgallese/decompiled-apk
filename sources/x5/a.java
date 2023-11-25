package x5;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private String f25808a;

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    /* renamed from: x5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0586a {

        /* renamed from: a  reason: collision with root package name */
        private String f25809a;

        /* synthetic */ C0586a(p pVar) {
        }

        public a a() {
            String str = this.f25809a;
            if (str != null) {
                a aVar = new a(null);
                aVar.f25808a = str;
                return aVar;
            }
            throw new IllegalArgumentException("Purchase token must be set");
        }

        public C0586a b(String str) {
            this.f25809a = str;
            return this;
        }
    }

    /* synthetic */ a(d0 d0Var) {
    }

    public static C0586a b() {
        return new C0586a(null);
    }

    public String a() {
        return this.f25808a;
    }
}
