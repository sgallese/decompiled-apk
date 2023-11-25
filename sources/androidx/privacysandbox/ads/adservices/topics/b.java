package androidx.privacysandbox.ads.adservices.topics;

import j$.util.Objects;
import java.util.HashSet;
import java.util.List;

/* compiled from: GetTopicsResponse.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final List<c> f6438a;

    public b(List<c> list) {
        qc.q.i(list, "topics");
        this.f6438a = list;
    }

    public final List<c> a() {
        return this.f6438a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f6438a.size() != bVar.f6438a.size()) {
            return false;
        }
        return qc.q.d(new HashSet(this.f6438a), new HashSet(bVar.f6438a));
    }

    public int hashCode() {
        return Objects.hash(this.f6438a);
    }

    public String toString() {
        return "Topics=" + this.f6438a;
    }
}
