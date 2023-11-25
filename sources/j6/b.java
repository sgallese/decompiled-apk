package j6;

import j6.g;

/* compiled from: AutoValue_BackendResponse.java */
/* loaded from: classes.dex */
final class b extends g {

    /* renamed from: a  reason: collision with root package name */
    private final g.a f19035a;

    /* renamed from: b  reason: collision with root package name */
    private final long f19036b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(g.a aVar, long j10) {
        if (aVar != null) {
            this.f19035a = aVar;
            this.f19036b = j10;
            return;
        }
        throw new NullPointerException("Null status");
    }

    @Override // j6.g
    public long b() {
        return this.f19036b;
    }

    @Override // j6.g
    public g.a c() {
        return this.f19035a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f19035a.equals(gVar.c()) && this.f19036b == gVar.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f19035a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f19036b;
        return hashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f19035a + ", nextRequestWaitMillis=" + this.f19036b + "}";
    }
}
