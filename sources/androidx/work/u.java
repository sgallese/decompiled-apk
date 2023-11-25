package androidx.work;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* compiled from: WorkInfo.java */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    private UUID f7601a;

    /* renamed from: b  reason: collision with root package name */
    private a f7602b;

    /* renamed from: c  reason: collision with root package name */
    private e f7603c;

    /* renamed from: d  reason: collision with root package name */
    private Set<String> f7604d;

    /* renamed from: e  reason: collision with root package name */
    private e f7605e;

    /* renamed from: f  reason: collision with root package name */
    private int f7606f;

    /* compiled from: WorkInfo.java */
    /* loaded from: classes.dex */
    public enum a {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean isFinished() {
            if (this != SUCCEEDED && this != FAILED && this != CANCELLED) {
                return false;
            }
            return true;
        }
    }

    public u(UUID uuid, a aVar, e eVar, List<String> list, e eVar2, int i10) {
        this.f7601a = uuid;
        this.f7602b = aVar;
        this.f7603c = eVar;
        this.f7604d = new HashSet(list);
        this.f7605e = eVar2;
        this.f7606f = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f7606f != uVar.f7606f || !this.f7601a.equals(uVar.f7601a) || this.f7602b != uVar.f7602b || !this.f7603c.equals(uVar.f7603c) || !this.f7604d.equals(uVar.f7604d)) {
            return false;
        }
        return this.f7605e.equals(uVar.f7605e);
    }

    public int hashCode() {
        return (((((((((this.f7601a.hashCode() * 31) + this.f7602b.hashCode()) * 31) + this.f7603c.hashCode()) * 31) + this.f7604d.hashCode()) * 31) + this.f7605e.hashCode()) * 31) + this.f7606f;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.f7601a + "', mState=" + this.f7602b + ", mOutputData=" + this.f7603c + ", mTags=" + this.f7604d + ", mProgress=" + this.f7605e + '}';
    }
}
