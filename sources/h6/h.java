package h6;

/* compiled from: AutoValue_LogResponse.java */
/* loaded from: classes.dex */
final class h extends n {

    /* renamed from: a  reason: collision with root package name */
    private final long f16582a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(long j10) {
        this.f16582a = j10;
    }

    @Override // h6.n
    public long c() {
        return this.f16582a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof n) && this.f16582a == ((n) obj).c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f16582a;
        return 1000003 ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f16582a + "}";
    }
}
