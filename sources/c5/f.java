package c5;

import kotlin.coroutines.Continuation;
import qc.q;

/* compiled from: RealSizeResolver.kt */
/* loaded from: classes.dex */
public final class f implements j {

    /* renamed from: c  reason: collision with root package name */
    private final i f8843c;

    public f(i iVar) {
        this.f8843c = iVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f) && q.d(this.f8843c, ((f) obj).f8843c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f8843c.hashCode();
    }

    @Override // c5.j
    public Object m(Continuation<? super i> continuation) {
        return this.f8843c;
    }
}
