package h6;

import h6.m;
import java.util.List;

/* compiled from: AutoValue_LogRequest.java */
/* loaded from: classes.dex */
final class g extends m {

    /* renamed from: a  reason: collision with root package name */
    private final long f16568a;

    /* renamed from: b  reason: collision with root package name */
    private final long f16569b;

    /* renamed from: c  reason: collision with root package name */
    private final k f16570c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f16571d;

    /* renamed from: e  reason: collision with root package name */
    private final String f16572e;

    /* renamed from: f  reason: collision with root package name */
    private final List<l> f16573f;

    /* renamed from: g  reason: collision with root package name */
    private final p f16574g;

    /* compiled from: AutoValue_LogRequest.java */
    /* loaded from: classes.dex */
    static final class b extends m.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f16575a;

        /* renamed from: b  reason: collision with root package name */
        private Long f16576b;

        /* renamed from: c  reason: collision with root package name */
        private k f16577c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f16578d;

        /* renamed from: e  reason: collision with root package name */
        private String f16579e;

        /* renamed from: f  reason: collision with root package name */
        private List<l> f16580f;

        /* renamed from: g  reason: collision with root package name */
        private p f16581g;

        @Override // h6.m.a
        public m a() {
            String str = "";
            if (this.f16575a == null) {
                str = " requestTimeMs";
            }
            if (this.f16576b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.f16575a.longValue(), this.f16576b.longValue(), this.f16577c, this.f16578d, this.f16579e, this.f16580f, this.f16581g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // h6.m.a
        public m.a b(k kVar) {
            this.f16577c = kVar;
            return this;
        }

        @Override // h6.m.a
        public m.a c(List<l> list) {
            this.f16580f = list;
            return this;
        }

        @Override // h6.m.a
        m.a d(Integer num) {
            this.f16578d = num;
            return this;
        }

        @Override // h6.m.a
        m.a e(String str) {
            this.f16579e = str;
            return this;
        }

        @Override // h6.m.a
        public m.a f(p pVar) {
            this.f16581g = pVar;
            return this;
        }

        @Override // h6.m.a
        public m.a g(long j10) {
            this.f16575a = Long.valueOf(j10);
            return this;
        }

        @Override // h6.m.a
        public m.a h(long j10) {
            this.f16576b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // h6.m
    public k b() {
        return this.f16570c;
    }

    @Override // h6.m
    public List<l> c() {
        return this.f16573f;
    }

    @Override // h6.m
    public Integer d() {
        return this.f16571d;
    }

    @Override // h6.m
    public String e() {
        return this.f16572e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List<l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f16568a == mVar.g() && this.f16569b == mVar.h() && ((kVar = this.f16570c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.f16571d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.f16572e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f16573f) != null ? list.equals(mVar.c()) : mVar.c() == null)) {
            p pVar = this.f16574g;
            if (pVar == null) {
                if (mVar.f() == null) {
                    return true;
                }
            } else if (pVar.equals(mVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // h6.m
    public p f() {
        return this.f16574g;
    }

    @Override // h6.m
    public long g() {
        return this.f16568a;
    }

    @Override // h6.m
    public long h() {
        return this.f16569b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j10 = this.f16568a;
        long j11 = this.f16569b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        k kVar = this.f16570c;
        int i11 = 0;
        if (kVar == null) {
            hashCode = 0;
        } else {
            hashCode = kVar.hashCode();
        }
        int i12 = (i10 ^ hashCode) * 1000003;
        Integer num = this.f16571d;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i13 = (i12 ^ hashCode2) * 1000003;
        String str = this.f16572e;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i14 = (i13 ^ hashCode3) * 1000003;
        List<l> list = this.f16573f;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        p pVar = this.f16574g;
        if (pVar != null) {
            i11 = pVar.hashCode();
        }
        return i15 ^ i11;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f16568a + ", requestUptimeMs=" + this.f16569b + ", clientInfo=" + this.f16570c + ", logSource=" + this.f16571d + ", logSourceName=" + this.f16572e + ", logEvents=" + this.f16573f + ", qosTier=" + this.f16574g + "}";
    }

    private g(long j10, long j11, k kVar, Integer num, String str, List<l> list, p pVar) {
        this.f16568a = j10;
        this.f16569b = j11;
        this.f16570c = kVar;
        this.f16571d = num;
        this.f16572e = str;
        this.f16573f = list;
        this.f16574g = pVar;
    }
}
