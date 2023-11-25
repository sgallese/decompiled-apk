package r8;

import r8.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.java */
/* loaded from: classes3.dex */
final class r extends b0.e.d.a.b.AbstractC0513e {

    /* renamed from: a  reason: collision with root package name */
    private final String f22474a;

    /* renamed from: b  reason: collision with root package name */
    private final int f22475b;

    /* renamed from: c  reason: collision with root package name */
    private final c0<b0.e.d.a.b.AbstractC0513e.AbstractC0515b> f22476c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.java */
    /* loaded from: classes3.dex */
    public static final class b extends b0.e.d.a.b.AbstractC0513e.AbstractC0514a {

        /* renamed from: a  reason: collision with root package name */
        private String f22477a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f22478b;

        /* renamed from: c  reason: collision with root package name */
        private c0<b0.e.d.a.b.AbstractC0513e.AbstractC0515b> f22479c;

        @Override // r8.b0.e.d.a.b.AbstractC0513e.AbstractC0514a
        public b0.e.d.a.b.AbstractC0513e a() {
            String str = "";
            if (this.f22477a == null) {
                str = " name";
            }
            if (this.f22478b == null) {
                str = str + " importance";
            }
            if (this.f22479c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new r(this.f22477a, this.f22478b.intValue(), this.f22479c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // r8.b0.e.d.a.b.AbstractC0513e.AbstractC0514a
        public b0.e.d.a.b.AbstractC0513e.AbstractC0514a b(c0<b0.e.d.a.b.AbstractC0513e.AbstractC0515b> c0Var) {
            if (c0Var != null) {
                this.f22479c = c0Var;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override // r8.b0.e.d.a.b.AbstractC0513e.AbstractC0514a
        public b0.e.d.a.b.AbstractC0513e.AbstractC0514a c(int i10) {
            this.f22478b = Integer.valueOf(i10);
            return this;
        }

        @Override // r8.b0.e.d.a.b.AbstractC0513e.AbstractC0514a
        public b0.e.d.a.b.AbstractC0513e.AbstractC0514a d(String str) {
            if (str != null) {
                this.f22477a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    @Override // r8.b0.e.d.a.b.AbstractC0513e
    public c0<b0.e.d.a.b.AbstractC0513e.AbstractC0515b> b() {
        return this.f22476c;
    }

    @Override // r8.b0.e.d.a.b.AbstractC0513e
    public int c() {
        return this.f22475b;
    }

    @Override // r8.b0.e.d.a.b.AbstractC0513e
    public String d() {
        return this.f22474a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.a.b.AbstractC0513e)) {
            return false;
        }
        b0.e.d.a.b.AbstractC0513e abstractC0513e = (b0.e.d.a.b.AbstractC0513e) obj;
        if (this.f22474a.equals(abstractC0513e.d()) && this.f22475b == abstractC0513e.c() && this.f22476c.equals(abstractC0513e.b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f22474a.hashCode() ^ 1000003) * 1000003) ^ this.f22475b) * 1000003) ^ this.f22476c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f22474a + ", importance=" + this.f22475b + ", frames=" + this.f22476c + "}";
    }

    private r(String str, int i10, c0<b0.e.d.a.b.AbstractC0513e.AbstractC0515b> c0Var) {
        this.f22474a = str;
        this.f22475b = i10;
        this.f22476c = c0Var;
    }
}
