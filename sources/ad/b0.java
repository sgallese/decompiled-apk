package ad;

/* compiled from: CompletionState.kt */
/* loaded from: classes4.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f468a;

    /* renamed from: b  reason: collision with root package name */
    public final pc.l<Throwable, dc.w> f469b;

    /* JADX WARN: Multi-variable type inference failed */
    public b0(Object obj, pc.l<? super Throwable, dc.w> lVar) {
        this.f468a = obj;
        this.f469b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (qc.q.d(this.f468a, b0Var.f468a) && qc.q.d(this.f469b, b0Var.f469b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Object obj = this.f468a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return (hashCode * 31) + this.f469b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f468a + ", onCancellation=" + this.f469b + ')';
    }
}
