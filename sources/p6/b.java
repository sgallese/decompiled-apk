package p6;

import java.util.Map;
import p6.f;

/* compiled from: AutoValue_SchedulerConfig.java */
/* loaded from: classes.dex */
final class b extends f {

    /* renamed from: a  reason: collision with root package name */
    private final s6.a f21101a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<g6.d, f.b> f21102b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(s6.a aVar, Map<g6.d, f.b> map) {
        if (aVar != null) {
            this.f21101a = aVar;
            if (map != null) {
                this.f21102b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    @Override // p6.f
    s6.a e() {
        return this.f21101a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f21101a.equals(fVar.e()) && this.f21102b.equals(fVar.h())) {
            return true;
        }
        return false;
    }

    @Override // p6.f
    Map<g6.d, f.b> h() {
        return this.f21102b;
    }

    public int hashCode() {
        return ((this.f21101a.hashCode() ^ 1000003) * 1000003) ^ this.f21102b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f21101a + ", values=" + this.f21102b + "}";
    }
}
