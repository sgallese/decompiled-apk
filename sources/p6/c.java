package p6;

import java.util.Set;
import p6.f;

/* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
/* loaded from: classes.dex */
final class c extends f.b {

    /* renamed from: a  reason: collision with root package name */
    private final long f21103a;

    /* renamed from: b  reason: collision with root package name */
    private final long f21104b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<f.c> f21105c;

    /* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
    /* loaded from: classes.dex */
    static final class b extends f.b.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f21106a;

        /* renamed from: b  reason: collision with root package name */
        private Long f21107b;

        /* renamed from: c  reason: collision with root package name */
        private Set<f.c> f21108c;

        @Override // p6.f.b.a
        public f.b a() {
            String str = "";
            if (this.f21106a == null) {
                str = " delta";
            }
            if (this.f21107b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f21108c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new c(this.f21106a.longValue(), this.f21107b.longValue(), this.f21108c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p6.f.b.a
        public f.b.a b(long j10) {
            this.f21106a = Long.valueOf(j10);
            return this;
        }

        @Override // p6.f.b.a
        public f.b.a c(Set<f.c> set) {
            if (set != null) {
                this.f21108c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        @Override // p6.f.b.a
        public f.b.a d(long j10) {
            this.f21107b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // p6.f.b
    long b() {
        return this.f21103a;
    }

    @Override // p6.f.b
    Set<f.c> c() {
        return this.f21105c;
    }

    @Override // p6.f.b
    long d() {
        return this.f21104b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f.b)) {
            return false;
        }
        f.b bVar = (f.b) obj;
        if (this.f21103a == bVar.b() && this.f21104b == bVar.d() && this.f21105c.equals(bVar.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f21103a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f21104b;
        return this.f21105c.hashCode() ^ ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f21103a + ", maxAllowedDelay=" + this.f21104b + ", flags=" + this.f21105c + "}";
    }

    private c(long j10, long j11, Set<f.c> set) {
        this.f21103a = j10;
        this.f21104b = j11;
        this.f21105c = set;
    }
}
