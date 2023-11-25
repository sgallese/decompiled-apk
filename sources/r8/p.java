package r8;

import r8.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.java */
/* loaded from: classes3.dex */
final class p extends b0.e.d.a.b.c {

    /* renamed from: a  reason: collision with root package name */
    private final String f22458a;

    /* renamed from: b  reason: collision with root package name */
    private final String f22459b;

    /* renamed from: c  reason: collision with root package name */
    private final c0<b0.e.d.a.b.AbstractC0513e.AbstractC0515b> f22460c;

    /* renamed from: d  reason: collision with root package name */
    private final b0.e.d.a.b.c f22461d;

    /* renamed from: e  reason: collision with root package name */
    private final int f22462e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.java */
    /* loaded from: classes3.dex */
    public static final class b extends b0.e.d.a.b.c.AbstractC0510a {

        /* renamed from: a  reason: collision with root package name */
        private String f22463a;

        /* renamed from: b  reason: collision with root package name */
        private String f22464b;

        /* renamed from: c  reason: collision with root package name */
        private c0<b0.e.d.a.b.AbstractC0513e.AbstractC0515b> f22465c;

        /* renamed from: d  reason: collision with root package name */
        private b0.e.d.a.b.c f22466d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f22467e;

        @Override // r8.b0.e.d.a.b.c.AbstractC0510a
        public b0.e.d.a.b.c a() {
            String str = "";
            if (this.f22463a == null) {
                str = " type";
            }
            if (this.f22465c == null) {
                str = str + " frames";
            }
            if (this.f22467e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new p(this.f22463a, this.f22464b, this.f22465c, this.f22466d, this.f22467e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // r8.b0.e.d.a.b.c.AbstractC0510a
        public b0.e.d.a.b.c.AbstractC0510a b(b0.e.d.a.b.c cVar) {
            this.f22466d = cVar;
            return this;
        }

        @Override // r8.b0.e.d.a.b.c.AbstractC0510a
        public b0.e.d.a.b.c.AbstractC0510a c(c0<b0.e.d.a.b.AbstractC0513e.AbstractC0515b> c0Var) {
            if (c0Var != null) {
                this.f22465c = c0Var;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override // r8.b0.e.d.a.b.c.AbstractC0510a
        public b0.e.d.a.b.c.AbstractC0510a d(int i10) {
            this.f22467e = Integer.valueOf(i10);
            return this;
        }

        @Override // r8.b0.e.d.a.b.c.AbstractC0510a
        public b0.e.d.a.b.c.AbstractC0510a e(String str) {
            this.f22464b = str;
            return this;
        }

        @Override // r8.b0.e.d.a.b.c.AbstractC0510a
        public b0.e.d.a.b.c.AbstractC0510a f(String str) {
            if (str != null) {
                this.f22463a = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }

    @Override // r8.b0.e.d.a.b.c
    public b0.e.d.a.b.c b() {
        return this.f22461d;
    }

    @Override // r8.b0.e.d.a.b.c
    public c0<b0.e.d.a.b.AbstractC0513e.AbstractC0515b> c() {
        return this.f22460c;
    }

    @Override // r8.b0.e.d.a.b.c
    public int d() {
        return this.f22462e;
    }

    @Override // r8.b0.e.d.a.b.c
    public String e() {
        return this.f22459b;
    }

    public boolean equals(Object obj) {
        String str;
        b0.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.a.b.c)) {
            return false;
        }
        b0.e.d.a.b.c cVar2 = (b0.e.d.a.b.c) obj;
        if (this.f22458a.equals(cVar2.f()) && ((str = this.f22459b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.f22460c.equals(cVar2.c()) && ((cVar = this.f22461d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.f22462e == cVar2.d()) {
            return true;
        }
        return false;
    }

    @Override // r8.b0.e.d.a.b.c
    public String f() {
        return this.f22458a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f22458a.hashCode() ^ 1000003) * 1000003;
        String str = this.f22459b;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f22460c.hashCode()) * 1000003;
        b0.e.d.a.b.c cVar = this.f22461d;
        if (cVar != null) {
            i10 = cVar.hashCode();
        }
        return ((hashCode3 ^ i10) * 1000003) ^ this.f22462e;
    }

    public String toString() {
        return "Exception{type=" + this.f22458a + ", reason=" + this.f22459b + ", frames=" + this.f22460c + ", causedBy=" + this.f22461d + ", overflowCount=" + this.f22462e + "}";
    }

    private p(String str, String str2, c0<b0.e.d.a.b.AbstractC0513e.AbstractC0515b> c0Var, b0.e.d.a.b.c cVar, int i10) {
        this.f22458a = str;
        this.f22459b = str2;
        this.f22460c = c0Var;
        this.f22461d = cVar;
        this.f22462e = i10;
    }
}
