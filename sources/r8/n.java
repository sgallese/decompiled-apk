package r8;

import r8.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution.java */
/* loaded from: classes3.dex */
final class n extends b0.e.d.a.b {

    /* renamed from: a  reason: collision with root package name */
    private final c0<b0.e.d.a.b.AbstractC0513e> f22440a;

    /* renamed from: b  reason: collision with root package name */
    private final b0.e.d.a.b.c f22441b;

    /* renamed from: c  reason: collision with root package name */
    private final b0.a f22442c;

    /* renamed from: d  reason: collision with root package name */
    private final b0.e.d.a.b.AbstractC0511d f22443d;

    /* renamed from: e  reason: collision with root package name */
    private final c0<b0.e.d.a.b.AbstractC0507a> f22444e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution.java */
    /* loaded from: classes3.dex */
    public static final class b extends b0.e.d.a.b.AbstractC0509b {

        /* renamed from: a  reason: collision with root package name */
        private c0<b0.e.d.a.b.AbstractC0513e> f22445a;

        /* renamed from: b  reason: collision with root package name */
        private b0.e.d.a.b.c f22446b;

        /* renamed from: c  reason: collision with root package name */
        private b0.a f22447c;

        /* renamed from: d  reason: collision with root package name */
        private b0.e.d.a.b.AbstractC0511d f22448d;

        /* renamed from: e  reason: collision with root package name */
        private c0<b0.e.d.a.b.AbstractC0507a> f22449e;

        @Override // r8.b0.e.d.a.b.AbstractC0509b
        public b0.e.d.a.b a() {
            String str = "";
            if (this.f22448d == null) {
                str = " signal";
            }
            if (this.f22449e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new n(this.f22445a, this.f22446b, this.f22447c, this.f22448d, this.f22449e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // r8.b0.e.d.a.b.AbstractC0509b
        public b0.e.d.a.b.AbstractC0509b b(b0.a aVar) {
            this.f22447c = aVar;
            return this;
        }

        @Override // r8.b0.e.d.a.b.AbstractC0509b
        public b0.e.d.a.b.AbstractC0509b c(c0<b0.e.d.a.b.AbstractC0507a> c0Var) {
            if (c0Var != null) {
                this.f22449e = c0Var;
                return this;
            }
            throw new NullPointerException("Null binaries");
        }

        @Override // r8.b0.e.d.a.b.AbstractC0509b
        public b0.e.d.a.b.AbstractC0509b d(b0.e.d.a.b.c cVar) {
            this.f22446b = cVar;
            return this;
        }

        @Override // r8.b0.e.d.a.b.AbstractC0509b
        public b0.e.d.a.b.AbstractC0509b e(b0.e.d.a.b.AbstractC0511d abstractC0511d) {
            if (abstractC0511d != null) {
                this.f22448d = abstractC0511d;
                return this;
            }
            throw new NullPointerException("Null signal");
        }

        @Override // r8.b0.e.d.a.b.AbstractC0509b
        public b0.e.d.a.b.AbstractC0509b f(c0<b0.e.d.a.b.AbstractC0513e> c0Var) {
            this.f22445a = c0Var;
            return this;
        }
    }

    @Override // r8.b0.e.d.a.b
    public b0.a b() {
        return this.f22442c;
    }

    @Override // r8.b0.e.d.a.b
    public c0<b0.e.d.a.b.AbstractC0507a> c() {
        return this.f22444e;
    }

    @Override // r8.b0.e.d.a.b
    public b0.e.d.a.b.c d() {
        return this.f22441b;
    }

    @Override // r8.b0.e.d.a.b
    public b0.e.d.a.b.AbstractC0511d e() {
        return this.f22443d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.a.b)) {
            return false;
        }
        b0.e.d.a.b bVar = (b0.e.d.a.b) obj;
        c0<b0.e.d.a.b.AbstractC0513e> c0Var = this.f22440a;
        if (c0Var != null ? c0Var.equals(bVar.f()) : bVar.f() == null) {
            b0.e.d.a.b.c cVar = this.f22441b;
            if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                b0.a aVar = this.f22442c;
                if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                    if (this.f22443d.equals(bVar.e()) && this.f22444e.equals(bVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // r8.b0.e.d.a.b
    public c0<b0.e.d.a.b.AbstractC0513e> f() {
        return this.f22440a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        c0<b0.e.d.a.b.AbstractC0513e> c0Var = this.f22440a;
        int i10 = 0;
        if (c0Var == null) {
            hashCode = 0;
        } else {
            hashCode = c0Var.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        b0.e.d.a.b.c cVar = this.f22441b;
        if (cVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = cVar.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        b0.a aVar = this.f22442c;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return ((((i12 ^ i10) * 1000003) ^ this.f22443d.hashCode()) * 1000003) ^ this.f22444e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f22440a + ", exception=" + this.f22441b + ", appExitInfo=" + this.f22442c + ", signal=" + this.f22443d + ", binaries=" + this.f22444e + "}";
    }

    private n(c0<b0.e.d.a.b.AbstractC0513e> c0Var, b0.e.d.a.b.c cVar, b0.a aVar, b0.e.d.a.b.AbstractC0511d abstractC0511d, c0<b0.e.d.a.b.AbstractC0507a> c0Var2) {
        this.f22440a = c0Var;
        this.f22441b = cVar;
        this.f22442c = aVar;
        this.f22443d = abstractC0511d;
        this.f22444e = c0Var2;
    }
}
