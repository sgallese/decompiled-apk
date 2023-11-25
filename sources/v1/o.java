package v1;

/* compiled from: MultiParagraphIntrinsics.kt */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final p f24487a;

    /* renamed from: b  reason: collision with root package name */
    private final int f24488b;

    /* renamed from: c  reason: collision with root package name */
    private final int f24489c;

    public o(p pVar, int i10, int i11) {
        qc.q.i(pVar, "intrinsics");
        this.f24487a = pVar;
        this.f24488b = i10;
        this.f24489c = i11;
    }

    public final int a() {
        return this.f24489c;
    }

    public final p b() {
        return this.f24487a;
    }

    public final int c() {
        return this.f24488b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (qc.q.d(this.f24487a, oVar.f24487a) && this.f24488b == oVar.f24488b && this.f24489c == oVar.f24489c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f24487a.hashCode() * 31) + this.f24488b) * 31) + this.f24489c;
    }

    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.f24487a + ", startIndex=" + this.f24488b + ", endIndex=" + this.f24489c + ')';
    }
}
