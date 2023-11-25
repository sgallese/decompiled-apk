package c0;

/* compiled from: ValidatingOffsetMapping.kt */
/* loaded from: classes.dex */
final class d1 implements b2.x {

    /* renamed from: b  reason: collision with root package name */
    private final b2.x f8244b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8245c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8246d;

    public d1(b2.x xVar, int i10, int i11) {
        qc.q.i(xVar, "delegate");
        this.f8244b = xVar;
        this.f8245c = i10;
        this.f8246d = i11;
    }

    @Override // b2.x
    public int a(int i10) {
        int a10 = this.f8244b.a(i10);
        boolean z10 = false;
        if (a10 >= 0 && a10 <= this.f8245c) {
            z10 = true;
        }
        if (z10) {
            return a10;
        }
        throw new IllegalStateException(("OffsetMapping.transformedToOriginal returned invalid mapping: " + i10 + " -> " + a10 + " is not in range of original text [0, " + this.f8245c + ']').toString());
    }

    @Override // b2.x
    public int b(int i10) {
        int b10 = this.f8244b.b(i10);
        boolean z10 = false;
        if (b10 >= 0 && b10 <= this.f8246d) {
            z10 = true;
        }
        if (z10) {
            return b10;
        }
        throw new IllegalStateException(("OffsetMapping.originalToTransformed returned invalid mapping: " + i10 + " -> " + b10 + " is not in range of transformed text [0, " + this.f8246d + ']').toString());
    }
}
