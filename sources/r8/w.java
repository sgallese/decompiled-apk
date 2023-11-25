package r8;

import r8.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_User.java */
/* loaded from: classes3.dex */
final class w extends b0.e.f {

    /* renamed from: a  reason: collision with root package name */
    private final String f22512a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_User.java */
    /* loaded from: classes3.dex */
    public static final class b extends b0.e.f.a {

        /* renamed from: a  reason: collision with root package name */
        private String f22513a;

        @Override // r8.b0.e.f.a
        public b0.e.f a() {
            String str = "";
            if (this.f22513a == null) {
                str = " identifier";
            }
            if (str.isEmpty()) {
                return new w(this.f22513a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // r8.b0.e.f.a
        public b0.e.f.a b(String str) {
            if (str != null) {
                this.f22513a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }
    }

    @Override // r8.b0.e.f
    public String b() {
        return this.f22512a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0.e.f) {
            return this.f22512a.equals(((b0.e.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f22512a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f22512a + "}";
    }

    private w(String str) {
        this.f22512a = str;
    }
}
