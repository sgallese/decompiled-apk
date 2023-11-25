package r8;

import r8.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
/* loaded from: classes3.dex */
final class m extends b0.e.d.a {

    /* renamed from: a  reason: collision with root package name */
    private final b0.e.d.a.b f22430a;

    /* renamed from: b  reason: collision with root package name */
    private final c0<b0.c> f22431b;

    /* renamed from: c  reason: collision with root package name */
    private final c0<b0.c> f22432c;

    /* renamed from: d  reason: collision with root package name */
    private final Boolean f22433d;

    /* renamed from: e  reason: collision with root package name */
    private final int f22434e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
    /* loaded from: classes3.dex */
    public static final class b extends b0.e.d.a.AbstractC0506a {

        /* renamed from: a  reason: collision with root package name */
        private b0.e.d.a.b f22435a;

        /* renamed from: b  reason: collision with root package name */
        private c0<b0.c> f22436b;

        /* renamed from: c  reason: collision with root package name */
        private c0<b0.c> f22437c;

        /* renamed from: d  reason: collision with root package name */
        private Boolean f22438d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f22439e;

        @Override // r8.b0.e.d.a.AbstractC0506a
        public b0.e.d.a a() {
            String str = "";
            if (this.f22435a == null) {
                str = " execution";
            }
            if (this.f22439e == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new m(this.f22435a, this.f22436b, this.f22437c, this.f22438d, this.f22439e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // r8.b0.e.d.a.AbstractC0506a
        public b0.e.d.a.AbstractC0506a b(Boolean bool) {
            this.f22438d = bool;
            return this;
        }

        @Override // r8.b0.e.d.a.AbstractC0506a
        public b0.e.d.a.AbstractC0506a c(c0<b0.c> c0Var) {
            this.f22436b = c0Var;
            return this;
        }

        @Override // r8.b0.e.d.a.AbstractC0506a
        public b0.e.d.a.AbstractC0506a d(b0.e.d.a.b bVar) {
            if (bVar != null) {
                this.f22435a = bVar;
                return this;
            }
            throw new NullPointerException("Null execution");
        }

        @Override // r8.b0.e.d.a.AbstractC0506a
        public b0.e.d.a.AbstractC0506a e(c0<b0.c> c0Var) {
            this.f22437c = c0Var;
            return this;
        }

        @Override // r8.b0.e.d.a.AbstractC0506a
        public b0.e.d.a.AbstractC0506a f(int i10) {
            this.f22439e = Integer.valueOf(i10);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(b0.e.d.a aVar) {
            this.f22435a = aVar.d();
            this.f22436b = aVar.c();
            this.f22437c = aVar.e();
            this.f22438d = aVar.b();
            this.f22439e = Integer.valueOf(aVar.f());
        }
    }

    @Override // r8.b0.e.d.a
    public Boolean b() {
        return this.f22433d;
    }

    @Override // r8.b0.e.d.a
    public c0<b0.c> c() {
        return this.f22431b;
    }

    @Override // r8.b0.e.d.a
    public b0.e.d.a.b d() {
        return this.f22430a;
    }

    @Override // r8.b0.e.d.a
    public c0<b0.c> e() {
        return this.f22432c;
    }

    public boolean equals(Object obj) {
        c0<b0.c> c0Var;
        c0<b0.c> c0Var2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.a)) {
            return false;
        }
        b0.e.d.a aVar = (b0.e.d.a) obj;
        if (this.f22430a.equals(aVar.d()) && ((c0Var = this.f22431b) != null ? c0Var.equals(aVar.c()) : aVar.c() == null) && ((c0Var2 = this.f22432c) != null ? c0Var2.equals(aVar.e()) : aVar.e() == null) && ((bool = this.f22433d) != null ? bool.equals(aVar.b()) : aVar.b() == null) && this.f22434e == aVar.f()) {
            return true;
        }
        return false;
    }

    @Override // r8.b0.e.d.a
    public int f() {
        return this.f22434e;
    }

    @Override // r8.b0.e.d.a
    public b0.e.d.a.AbstractC0506a g() {
        return new b(this);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.f22430a.hashCode() ^ 1000003) * 1000003;
        c0<b0.c> c0Var = this.f22431b;
        int i10 = 0;
        if (c0Var == null) {
            hashCode = 0;
        } else {
            hashCode = c0Var.hashCode();
        }
        int i11 = (hashCode3 ^ hashCode) * 1000003;
        c0<b0.c> c0Var2 = this.f22432c;
        if (c0Var2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c0Var2.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        Boolean bool = this.f22433d;
        if (bool != null) {
            i10 = bool.hashCode();
        }
        return ((i12 ^ i10) * 1000003) ^ this.f22434e;
    }

    public String toString() {
        return "Application{execution=" + this.f22430a + ", customAttributes=" + this.f22431b + ", internalKeys=" + this.f22432c + ", background=" + this.f22433d + ", uiOrientation=" + this.f22434e + "}";
    }

    private m(b0.e.d.a.b bVar, c0<b0.c> c0Var, c0<b0.c> c0Var2, Boolean bool, int i10) {
        this.f22430a = bVar;
        this.f22431b = c0Var;
        this.f22432c = c0Var2;
        this.f22433d = bool;
        this.f22434e = i10;
    }
}
