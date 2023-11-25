package l9;

import l9.c;
import l9.d;

/* compiled from: AutoValue_PersistedInstallationEntry.java */
/* loaded from: classes3.dex */
final class a extends d {

    /* renamed from: b  reason: collision with root package name */
    private final String f19610b;

    /* renamed from: c  reason: collision with root package name */
    private final c.a f19611c;

    /* renamed from: d  reason: collision with root package name */
    private final String f19612d;

    /* renamed from: e  reason: collision with root package name */
    private final String f19613e;

    /* renamed from: f  reason: collision with root package name */
    private final long f19614f;

    /* renamed from: g  reason: collision with root package name */
    private final long f19615g;

    /* renamed from: h  reason: collision with root package name */
    private final String f19616h;

    /* compiled from: AutoValue_PersistedInstallationEntry.java */
    /* loaded from: classes3.dex */
    static final class b extends d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f19617a;

        /* renamed from: b  reason: collision with root package name */
        private c.a f19618b;

        /* renamed from: c  reason: collision with root package name */
        private String f19619c;

        /* renamed from: d  reason: collision with root package name */
        private String f19620d;

        /* renamed from: e  reason: collision with root package name */
        private Long f19621e;

        /* renamed from: f  reason: collision with root package name */
        private Long f19622f;

        /* renamed from: g  reason: collision with root package name */
        private String f19623g;

        @Override // l9.d.a
        public d a() {
            String str = "";
            if (this.f19618b == null) {
                str = " registrationStatus";
            }
            if (this.f19621e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f19622f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.f19617a, this.f19618b, this.f19619c, this.f19620d, this.f19621e.longValue(), this.f19622f.longValue(), this.f19623g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // l9.d.a
        public d.a b(String str) {
            this.f19619c = str;
            return this;
        }

        @Override // l9.d.a
        public d.a c(long j10) {
            this.f19621e = Long.valueOf(j10);
            return this;
        }

        @Override // l9.d.a
        public d.a d(String str) {
            this.f19617a = str;
            return this;
        }

        @Override // l9.d.a
        public d.a e(String str) {
            this.f19623g = str;
            return this;
        }

        @Override // l9.d.a
        public d.a f(String str) {
            this.f19620d = str;
            return this;
        }

        @Override // l9.d.a
        public d.a g(c.a aVar) {
            if (aVar != null) {
                this.f19618b = aVar;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        @Override // l9.d.a
        public d.a h(long j10) {
            this.f19622f = Long.valueOf(j10);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(d dVar) {
            this.f19617a = dVar.d();
            this.f19618b = dVar.g();
            this.f19619c = dVar.b();
            this.f19620d = dVar.f();
            this.f19621e = Long.valueOf(dVar.c());
            this.f19622f = Long.valueOf(dVar.h());
            this.f19623g = dVar.e();
        }
    }

    @Override // l9.d
    public String b() {
        return this.f19612d;
    }

    @Override // l9.d
    public long c() {
        return this.f19614f;
    }

    @Override // l9.d
    public String d() {
        return this.f19610b;
    }

    @Override // l9.d
    public String e() {
        return this.f19616h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f19610b;
        if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
            if (this.f19611c.equals(dVar.g()) && ((str = this.f19612d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f19613e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f19614f == dVar.c() && this.f19615g == dVar.h()) {
                String str4 = this.f19616h;
                if (str4 == null) {
                    if (dVar.e() == null) {
                        return true;
                    }
                } else if (str4.equals(dVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // l9.d
    public String f() {
        return this.f19613e;
    }

    @Override // l9.d
    public c.a g() {
        return this.f19611c;
    }

    @Override // l9.d
    public long h() {
        return this.f19615g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.f19610b;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = (((hashCode ^ 1000003) * 1000003) ^ this.f19611c.hashCode()) * 1000003;
        String str2 = this.f19612d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (hashCode4 ^ hashCode2) * 1000003;
        String str3 = this.f19613e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 ^ hashCode3) * 1000003;
        long j10 = this.f19614f;
        int i13 = (i12 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f19615g;
        int i14 = (i13 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f19616h;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i14 ^ i10;
    }

    @Override // l9.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f19610b + ", registrationStatus=" + this.f19611c + ", authToken=" + this.f19612d + ", refreshToken=" + this.f19613e + ", expiresInSecs=" + this.f19614f + ", tokenCreationEpochInSecs=" + this.f19615g + ", fisError=" + this.f19616h + "}";
    }

    private a(String str, c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.f19610b = str;
        this.f19611c = aVar;
        this.f19612d = str2;
        this.f19613e = str3;
        this.f19614f = j10;
        this.f19615g = j11;
        this.f19616h = str4;
    }
}
