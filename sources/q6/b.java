package q6;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoValue_PersistedEvent.java */
/* loaded from: classes.dex */
public final class b extends k {

    /* renamed from: a  reason: collision with root package name */
    private final long f21493a;

    /* renamed from: b  reason: collision with root package name */
    private final i6.p f21494b;

    /* renamed from: c  reason: collision with root package name */
    private final i6.i f21495c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(long j10, i6.p pVar, i6.i iVar) {
        this.f21493a = j10;
        if (pVar != null) {
            this.f21494b = pVar;
            if (iVar != null) {
                this.f21495c = iVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    @Override // q6.k
    public i6.i b() {
        return this.f21495c;
    }

    @Override // q6.k
    public long c() {
        return this.f21493a;
    }

    @Override // q6.k
    public i6.p d() {
        return this.f21494b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f21493a == kVar.c() && this.f21494b.equals(kVar.d()) && this.f21495c.equals(kVar.b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f21493a;
        return this.f21495c.hashCode() ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f21494b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f21493a + ", transportContext=" + this.f21494b + ", event=" + this.f21495c + "}";
    }
}
