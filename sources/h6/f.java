package h6;

import h6.l;
import java.util.Arrays;

/* compiled from: AutoValue_LogEvent.java */
/* loaded from: classes.dex */
final class f extends l {

    /* renamed from: a  reason: collision with root package name */
    private final long f16554a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f16555b;

    /* renamed from: c  reason: collision with root package name */
    private final long f16556c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f16557d;

    /* renamed from: e  reason: collision with root package name */
    private final String f16558e;

    /* renamed from: f  reason: collision with root package name */
    private final long f16559f;

    /* renamed from: g  reason: collision with root package name */
    private final o f16560g;

    /* compiled from: AutoValue_LogEvent.java */
    /* loaded from: classes.dex */
    static final class b extends l.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f16561a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f16562b;

        /* renamed from: c  reason: collision with root package name */
        private Long f16563c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f16564d;

        /* renamed from: e  reason: collision with root package name */
        private String f16565e;

        /* renamed from: f  reason: collision with root package name */
        private Long f16566f;

        /* renamed from: g  reason: collision with root package name */
        private o f16567g;

        @Override // h6.l.a
        public l a() {
            String str = "";
            if (this.f16561a == null) {
                str = " eventTimeMs";
            }
            if (this.f16563c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f16566f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f16561a.longValue(), this.f16562b, this.f16563c.longValue(), this.f16564d, this.f16565e, this.f16566f.longValue(), this.f16567g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // h6.l.a
        public l.a b(Integer num) {
            this.f16562b = num;
            return this;
        }

        @Override // h6.l.a
        public l.a c(long j10) {
            this.f16561a = Long.valueOf(j10);
            return this;
        }

        @Override // h6.l.a
        public l.a d(long j10) {
            this.f16563c = Long.valueOf(j10);
            return this;
        }

        @Override // h6.l.a
        public l.a e(o oVar) {
            this.f16567g = oVar;
            return this;
        }

        @Override // h6.l.a
        l.a f(byte[] bArr) {
            this.f16564d = bArr;
            return this;
        }

        @Override // h6.l.a
        l.a g(String str) {
            this.f16565e = str;
            return this;
        }

        @Override // h6.l.a
        public l.a h(long j10) {
            this.f16566f = Long.valueOf(j10);
            return this;
        }
    }

    @Override // h6.l
    public Integer b() {
        return this.f16555b;
    }

    @Override // h6.l
    public long c() {
        return this.f16554a;
    }

    @Override // h6.l
    public long d() {
        return this.f16556c;
    }

    @Override // h6.l
    public o e() {
        return this.f16560g;
    }

    public boolean equals(Object obj) {
        Integer num;
        byte[] f10;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f16554a == lVar.c() && ((num = this.f16555b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.f16556c == lVar.d()) {
            byte[] bArr = this.f16557d;
            if (lVar instanceof f) {
                f10 = ((f) lVar).f16557d;
            } else {
                f10 = lVar.f();
            }
            if (Arrays.equals(bArr, f10) && ((str = this.f16558e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f16559f == lVar.h()) {
                o oVar = this.f16560g;
                if (oVar == null) {
                    if (lVar.e() == null) {
                        return true;
                    }
                } else if (oVar.equals(lVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // h6.l
    public byte[] f() {
        return this.f16557d;
    }

    @Override // h6.l
    public String g() {
        return this.f16558e;
    }

    @Override // h6.l
    public long h() {
        return this.f16559f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        long j10 = this.f16554a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f16555b;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j11 = this.f16556c;
        int hashCode3 = (((((i10 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f16557d)) * 1000003;
        String str = this.f16558e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        long j12 = this.f16559f;
        int i12 = (((hashCode3 ^ hashCode2) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        o oVar = this.f16560g;
        if (oVar != null) {
            i11 = oVar.hashCode();
        }
        return i12 ^ i11;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f16554a + ", eventCode=" + this.f16555b + ", eventUptimeMs=" + this.f16556c + ", sourceExtension=" + Arrays.toString(this.f16557d) + ", sourceExtensionJsonProto3=" + this.f16558e + ", timezoneOffsetSeconds=" + this.f16559f + ", networkConnectionInfo=" + this.f16560g + "}";
    }

    private f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, o oVar) {
        this.f16554a = j10;
        this.f16555b = num;
        this.f16556c = j11;
        this.f16557d = bArr;
        this.f16558e = str;
        this.f16559f = j12;
        this.f16560g = oVar;
    }
}
