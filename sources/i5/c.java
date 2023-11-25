package i5;

import qc.q;

/* compiled from: Timeline.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final q5.a f16982a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f16983b;

    public c(q5.a aVar, boolean z10) {
        q.i(aVar, "event");
        this.f16982a = aVar;
        this.f16983b = z10;
    }

    public final q5.a a() {
        return this.f16982a;
    }

    public final boolean b() {
        return this.f16983b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (q.d(this.f16982a, cVar.f16982a) && this.f16983b == cVar.f16983b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f16982a.hashCode() * 31;
        boolean z10 = this.f16983b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "EventQueueMessage(event=" + this.f16982a + ", inForeground=" + this.f16983b + ')';
    }
}
