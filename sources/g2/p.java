package g2;

/* compiled from: TextGeometricTransform.kt */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: c  reason: collision with root package name */
    public static final a f16082c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    private static final p f16083d = new p(1.0f, 0.0f);

    /* renamed from: a  reason: collision with root package name */
    private final float f16084a;

    /* renamed from: b  reason: collision with root package name */
    private final float f16085b;

    /* compiled from: TextGeometricTransform.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final p a() {
            return p.f16083d;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.p.<init>():void");
    }

    public final float b() {
        return this.f16084a;
    }

    public final float c() {
        return this.f16085b;
    }

    public boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f16084a == pVar.f16084a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        if (this.f16085b == pVar.f16085b) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f16084a) * 31) + Float.floatToIntBits(this.f16085b);
    }

    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.f16084a + ", skewX=" + this.f16085b + ')';
    }

    public p(float f10, float f11) {
        this.f16084a = f10;
        this.f16085b = f11;
    }

    public /* synthetic */ p(float f10, float f11, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 0.0f : f11);
    }
}
