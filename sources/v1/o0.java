package v1;

/* compiled from: TtsAnnotation.kt */
/* loaded from: classes.dex */
public final class o0 extends m0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f24490a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(String str) {
        super(null);
        qc.q.i(str, "verbatim");
        this.f24490a = str;
    }

    public final String a() {
        return this.f24490a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof o0) && qc.q.d(this.f24490a, ((o0) obj).f24490a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f24490a.hashCode();
    }

    public String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.f24490a + ')';
    }
}
