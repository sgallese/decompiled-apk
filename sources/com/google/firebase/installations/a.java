package com.google.firebase.installations;

import com.google.firebase.installations.f;

/* compiled from: AutoValue_InstallationTokenResult.java */
/* loaded from: classes3.dex */
final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final String f11516a;

    /* renamed from: b  reason: collision with root package name */
    private final long f11517b;

    /* renamed from: c  reason: collision with root package name */
    private final long f11518c;

    /* compiled from: AutoValue_InstallationTokenResult.java */
    /* loaded from: classes3.dex */
    static final class b extends f.a {

        /* renamed from: a  reason: collision with root package name */
        private String f11519a;

        /* renamed from: b  reason: collision with root package name */
        private Long f11520b;

        /* renamed from: c  reason: collision with root package name */
        private Long f11521c;

        @Override // com.google.firebase.installations.f.a
        public f a() {
            String str = "";
            if (this.f11519a == null) {
                str = " token";
            }
            if (this.f11520b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f11521c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f11519a, this.f11520b.longValue(), this.f11521c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.f.a
        public f.a b(String str) {
            if (str != null) {
                this.f11519a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        @Override // com.google.firebase.installations.f.a
        public f.a c(long j10) {
            this.f11521c = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.installations.f.a
        public f.a d(long j10) {
            this.f11520b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // com.google.firebase.installations.f
    public String b() {
        return this.f11516a;
    }

    @Override // com.google.firebase.installations.f
    public long c() {
        return this.f11518c;
    }

    @Override // com.google.firebase.installations.f
    public long d() {
        return this.f11517b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f11516a.equals(fVar.b()) && this.f11517b == fVar.d() && this.f11518c == fVar.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f11516a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f11517b;
        long j11 = this.f11518c;
        return ((hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f11516a + ", tokenExpirationTimestamp=" + this.f11517b + ", tokenCreationTimestamp=" + this.f11518c + "}";
    }

    private a(String str, long j10, long j11) {
        this.f11516a = str;
        this.f11517b = j10;
        this.f11518c = j11;
    }
}
