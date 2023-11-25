package androidx.privacysandbox.ads.adservices.topics;

import r.x;

/* compiled from: Topic.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final long f6439a;

    /* renamed from: b  reason: collision with root package name */
    private final long f6440b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6441c;

    public c(long j10, long j11, int i10) {
        this.f6439a = j10;
        this.f6440b = j11;
        this.f6441c = i10;
    }

    public final long a() {
        return this.f6440b;
    }

    public final long b() {
        return this.f6439a;
    }

    public final int c() {
        return this.f6441c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f6439a == cVar.f6439a && this.f6440b == cVar.f6440b && this.f6441c == cVar.f6441c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((x.a(this.f6439a) * 31) + x.a(this.f6440b)) * 31) + this.f6441c;
    }

    public String toString() {
        return "Topic { " + ("TaxonomyVersion=" + this.f6439a + ", ModelVersion=" + this.f6440b + ", TopicCode=" + this.f6441c + " }");
    }
}
