package m9;

import m9.f;

/* compiled from: AutoValue_TokenResult.java */
/* loaded from: classes3.dex */
final class b extends f {

    /* renamed from: a  reason: collision with root package name */
    private final String f19793a;

    /* renamed from: b  reason: collision with root package name */
    private final long f19794b;

    /* renamed from: c  reason: collision with root package name */
    private final f.b f19795c;

    /* compiled from: AutoValue_TokenResult.java */
    /* renamed from: m9.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0447b extends f.a {

        /* renamed from: a  reason: collision with root package name */
        private String f19796a;

        /* renamed from: b  reason: collision with root package name */
        private Long f19797b;

        /* renamed from: c  reason: collision with root package name */
        private f.b f19798c;

        @Override // m9.f.a
        public f a() {
            String str = "";
            if (this.f19797b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f19796a, this.f19797b.longValue(), this.f19798c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // m9.f.a
        public f.a b(f.b bVar) {
            this.f19798c = bVar;
            return this;
        }

        @Override // m9.f.a
        public f.a c(String str) {
            this.f19796a = str;
            return this;
        }

        @Override // m9.f.a
        public f.a d(long j10) {
            this.f19797b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // m9.f
    public f.b b() {
        return this.f19795c;
    }

    @Override // m9.f
    public String c() {
        return this.f19793a;
    }

    @Override // m9.f
    public long d() {
        return this.f19794b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f19793a;
        if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
            if (this.f19794b == fVar.d()) {
                f.b bVar = this.f19795c;
                if (bVar == null) {
                    if (fVar.b() == null) {
                        return true;
                    }
                } else if (bVar.equals(fVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f19793a;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.f19794b;
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        f.b bVar = this.f19795c;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return i11 ^ i10;
    }

    public String toString() {
        return "TokenResult{token=" + this.f19793a + ", tokenExpirationTimestamp=" + this.f19794b + ", responseCode=" + this.f19795c + "}";
    }

    private b(String str, long j10, f.b bVar) {
        this.f19793a = str;
        this.f19794b = j10;
        this.f19795c = bVar;
    }
}
