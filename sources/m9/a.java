package m9;

import m9.d;

/* compiled from: AutoValue_InstallationResponse.java */
/* loaded from: classes3.dex */
final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private final String f19783a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19784b;

    /* renamed from: c  reason: collision with root package name */
    private final String f19785c;

    /* renamed from: d  reason: collision with root package name */
    private final f f19786d;

    /* renamed from: e  reason: collision with root package name */
    private final d.b f19787e;

    /* compiled from: AutoValue_InstallationResponse.java */
    /* loaded from: classes3.dex */
    static final class b extends d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f19788a;

        /* renamed from: b  reason: collision with root package name */
        private String f19789b;

        /* renamed from: c  reason: collision with root package name */
        private String f19790c;

        /* renamed from: d  reason: collision with root package name */
        private f f19791d;

        /* renamed from: e  reason: collision with root package name */
        private d.b f19792e;

        @Override // m9.d.a
        public d a() {
            return new a(this.f19788a, this.f19789b, this.f19790c, this.f19791d, this.f19792e);
        }

        @Override // m9.d.a
        public d.a b(f fVar) {
            this.f19791d = fVar;
            return this;
        }

        @Override // m9.d.a
        public d.a c(String str) {
            this.f19789b = str;
            return this;
        }

        @Override // m9.d.a
        public d.a d(String str) {
            this.f19790c = str;
            return this;
        }

        @Override // m9.d.a
        public d.a e(d.b bVar) {
            this.f19792e = bVar;
            return this;
        }

        @Override // m9.d.a
        public d.a f(String str) {
            this.f19788a = str;
            return this;
        }
    }

    @Override // m9.d
    public f b() {
        return this.f19786d;
    }

    @Override // m9.d
    public String c() {
        return this.f19784b;
    }

    @Override // m9.d
    public String d() {
        return this.f19785c;
    }

    @Override // m9.d
    public d.b e() {
        return this.f19787e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f19783a;
        if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
            String str2 = this.f19784b;
            if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                String str3 = this.f19785c;
                if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                    f fVar = this.f19786d;
                    if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                        d.b bVar = this.f19787e;
                        if (bVar == null) {
                            if (dVar.e() == null) {
                                return true;
                            }
                        } else if (bVar.equals(dVar.e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // m9.d
    public String f() {
        return this.f19783a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.f19783a;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.f19784b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        String str3 = this.f19785c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 ^ hashCode3) * 1000003;
        f fVar = this.f19786d;
        if (fVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = fVar.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        d.b bVar = this.f19787e;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return i14 ^ i10;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f19783a + ", fid=" + this.f19784b + ", refreshToken=" + this.f19785c + ", authToken=" + this.f19786d + ", responseCode=" + this.f19787e + "}";
    }

    private a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f19783a = str;
        this.f19784b = str2;
        this.f19785c = str3;
        this.f19786d = fVar;
        this.f19787e = bVar;
    }
}
