package com.google.firebase;

/* compiled from: AutoValue_StartupTime.java */
/* loaded from: classes3.dex */
final class a extends l {

    /* renamed from: a  reason: collision with root package name */
    private final long f11250a;

    /* renamed from: b  reason: collision with root package name */
    private final long f11251b;

    /* renamed from: c  reason: collision with root package name */
    private final long f11252c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(long j10, long j11, long j12) {
        this.f11250a = j10;
        this.f11251b = j11;
        this.f11252c = j12;
    }

    @Override // com.google.firebase.l
    public long b() {
        return this.f11251b;
    }

    @Override // com.google.firebase.l
    public long c() {
        return this.f11250a;
    }

    @Override // com.google.firebase.l
    public long d() {
        return this.f11252c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f11250a == lVar.c() && this.f11251b == lVar.b() && this.f11252c == lVar.d()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f11250a;
        long j11 = this.f11251b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f11252c;
        return ((int) ((j12 >>> 32) ^ j12)) ^ i10;
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f11250a + ", elapsedRealtime=" + this.f11251b + ", uptimeMillis=" + this.f11252c + "}";
    }
}
