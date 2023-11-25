package i6;

import i6.o;

/* compiled from: AutoValue_SendRequest.java */
/* loaded from: classes.dex */
final class c extends o {

    /* renamed from: a  reason: collision with root package name */
    private final p f17048a;

    /* renamed from: b  reason: collision with root package name */
    private final String f17049b;

    /* renamed from: c  reason: collision with root package name */
    private final g6.c<?> f17050c;

    /* renamed from: d  reason: collision with root package name */
    private final g6.e<?, byte[]> f17051d;

    /* renamed from: e  reason: collision with root package name */
    private final g6.b f17052e;

    /* compiled from: AutoValue_SendRequest.java */
    /* loaded from: classes.dex */
    static final class b extends o.a {

        /* renamed from: a  reason: collision with root package name */
        private p f17053a;

        /* renamed from: b  reason: collision with root package name */
        private String f17054b;

        /* renamed from: c  reason: collision with root package name */
        private g6.c<?> f17055c;

        /* renamed from: d  reason: collision with root package name */
        private g6.e<?, byte[]> f17056d;

        /* renamed from: e  reason: collision with root package name */
        private g6.b f17057e;

        @Override // i6.o.a
        public o a() {
            String str = "";
            if (this.f17053a == null) {
                str = " transportContext";
            }
            if (this.f17054b == null) {
                str = str + " transportName";
            }
            if (this.f17055c == null) {
                str = str + " event";
            }
            if (this.f17056d == null) {
                str = str + " transformer";
            }
            if (this.f17057e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f17053a, this.f17054b, this.f17055c, this.f17056d, this.f17057e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // i6.o.a
        o.a b(g6.b bVar) {
            if (bVar != null) {
                this.f17057e = bVar;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        @Override // i6.o.a
        o.a c(g6.c<?> cVar) {
            if (cVar != null) {
                this.f17055c = cVar;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        @Override // i6.o.a
        o.a d(g6.e<?, byte[]> eVar) {
            if (eVar != null) {
                this.f17056d = eVar;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        @Override // i6.o.a
        public o.a e(p pVar) {
            if (pVar != null) {
                this.f17053a = pVar;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        @Override // i6.o.a
        public o.a f(String str) {
            if (str != null) {
                this.f17054b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    @Override // i6.o
    public g6.b b() {
        return this.f17052e;
    }

    @Override // i6.o
    g6.c<?> c() {
        return this.f17050c;
    }

    @Override // i6.o
    g6.e<?, byte[]> e() {
        return this.f17051d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f17048a.equals(oVar.f()) && this.f17049b.equals(oVar.g()) && this.f17050c.equals(oVar.c()) && this.f17051d.equals(oVar.e()) && this.f17052e.equals(oVar.b())) {
            return true;
        }
        return false;
    }

    @Override // i6.o
    public p f() {
        return this.f17048a;
    }

    @Override // i6.o
    public String g() {
        return this.f17049b;
    }

    public int hashCode() {
        return ((((((((this.f17048a.hashCode() ^ 1000003) * 1000003) ^ this.f17049b.hashCode()) * 1000003) ^ this.f17050c.hashCode()) * 1000003) ^ this.f17051d.hashCode()) * 1000003) ^ this.f17052e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f17048a + ", transportName=" + this.f17049b + ", event=" + this.f17050c + ", transformer=" + this.f17051d + ", encoding=" + this.f17052e + "}";
    }

    private c(p pVar, String str, g6.c<?> cVar, g6.e<?, byte[]> eVar, g6.b bVar) {
        this.f17048a = pVar;
        this.f17049b = str;
        this.f17050c = cVar;
        this.f17051d = eVar;
        this.f17052e = bVar;
    }
}
