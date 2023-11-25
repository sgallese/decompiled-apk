package r8;

import r8.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Log.java */
/* loaded from: classes3.dex */
final class u extends b0.e.d.AbstractC0517d {

    /* renamed from: a  reason: collision with root package name */
    private final String f22502a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Log.java */
    /* loaded from: classes3.dex */
    public static final class b extends b0.e.d.AbstractC0517d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f22503a;

        @Override // r8.b0.e.d.AbstractC0517d.a
        public b0.e.d.AbstractC0517d a() {
            String str = "";
            if (this.f22503a == null) {
                str = " content";
            }
            if (str.isEmpty()) {
                return new u(this.f22503a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // r8.b0.e.d.AbstractC0517d.a
        public b0.e.d.AbstractC0517d.a b(String str) {
            if (str != null) {
                this.f22503a = str;
                return this;
            }
            throw new NullPointerException("Null content");
        }
    }

    @Override // r8.b0.e.d.AbstractC0517d
    public String b() {
        return this.f22502a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0.e.d.AbstractC0517d) {
            return this.f22502a.equals(((b0.e.d.AbstractC0517d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f22502a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f22502a + "}";
    }

    private u(String str) {
        this.f22502a = str;
    }
}
