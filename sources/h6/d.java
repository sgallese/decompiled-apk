package h6;

import java.util.List;

/* compiled from: AutoValue_BatchedLogRequest.java */
/* loaded from: classes.dex */
final class d extends j {

    /* renamed from: a  reason: collision with root package name */
    private final List<m> f16549a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(List<m> list) {
        if (list != null) {
            this.f16549a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    @Override // h6.j
    public List<m> c() {
        return this.f16549a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f16549a.equals(((j) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f16549a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f16549a + "}";
    }
}
