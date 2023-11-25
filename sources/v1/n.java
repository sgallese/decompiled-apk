package v1;

import a1.e4;

/* compiled from: MultiParagraph.kt */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final m f24479a;

    /* renamed from: b  reason: collision with root package name */
    private final int f24480b;

    /* renamed from: c  reason: collision with root package name */
    private final int f24481c;

    /* renamed from: d  reason: collision with root package name */
    private int f24482d;

    /* renamed from: e  reason: collision with root package name */
    private int f24483e;

    /* renamed from: f  reason: collision with root package name */
    private float f24484f;

    /* renamed from: g  reason: collision with root package name */
    private float f24485g;

    public n(m mVar, int i10, int i11, int i12, int i13, float f10, float f11) {
        qc.q.i(mVar, "paragraph");
        this.f24479a = mVar;
        this.f24480b = i10;
        this.f24481c = i11;
        this.f24482d = i12;
        this.f24483e = i13;
        this.f24484f = f10;
        this.f24485g = f11;
    }

    public final float a() {
        return this.f24485g;
    }

    public final int b() {
        return this.f24481c;
    }

    public final int c() {
        return this.f24483e;
    }

    public final int d() {
        return this.f24481c - this.f24480b;
    }

    public final m e() {
        return this.f24479a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (qc.q.d(this.f24479a, nVar.f24479a) && this.f24480b == nVar.f24480b && this.f24481c == nVar.f24481c && this.f24482d == nVar.f24482d && this.f24483e == nVar.f24483e && Float.compare(this.f24484f, nVar.f24484f) == 0 && Float.compare(this.f24485g, nVar.f24485g) == 0) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f24480b;
    }

    public final int g() {
        return this.f24482d;
    }

    public final float h() {
        return this.f24484f;
    }

    public int hashCode() {
        return (((((((((((this.f24479a.hashCode() * 31) + this.f24480b) * 31) + this.f24481c) * 31) + this.f24482d) * 31) + this.f24483e) * 31) + Float.floatToIntBits(this.f24484f)) * 31) + Float.floatToIntBits(this.f24485g);
    }

    public final e4 i(e4 e4Var) {
        qc.q.i(e4Var, "<this>");
        e4Var.p(z0.g.a(0.0f, this.f24484f));
        return e4Var;
    }

    public final z0.h j(z0.h hVar) {
        qc.q.i(hVar, "<this>");
        return hVar.r(z0.g.a(0.0f, this.f24484f));
    }

    public final long k(long j10) {
        return j0.b(l(i0.n(j10)), l(i0.i(j10)));
    }

    public final int l(int i10) {
        return i10 + this.f24480b;
    }

    public final int m(int i10) {
        return i10 + this.f24482d;
    }

    public final float n(float f10) {
        return f10 + this.f24484f;
    }

    public final long o(long j10) {
        return z0.g.a(z0.f.o(j10), z0.f.p(j10) - this.f24484f);
    }

    public final int p(int i10) {
        int l10;
        l10 = vc.l.l(i10, this.f24480b, this.f24481c);
        return l10 - this.f24480b;
    }

    public final int q(int i10) {
        return i10 - this.f24482d;
    }

    public final float r(float f10) {
        return f10 - this.f24484f;
    }

    public String toString() {
        return "ParagraphInfo(paragraph=" + this.f24479a + ", startIndex=" + this.f24480b + ", endIndex=" + this.f24481c + ", startLineIndex=" + this.f24482d + ", endLineIndex=" + this.f24483e + ", top=" + this.f24484f + ", bottom=" + this.f24485g + ')';
    }
}
