package w;

/* compiled from: RowColumnImpl.kt */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    private float f25245a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f25246b;

    /* renamed from: c  reason: collision with root package name */
    private l f25247c;

    public x() {
        this(0.0f, false, null, 7, null);
    }

    public final l a() {
        return this.f25247c;
    }

    public final boolean b() {
        return this.f25246b;
    }

    public final float c() {
        return this.f25245a;
    }

    public final void d(l lVar) {
        this.f25247c = lVar;
    }

    public final void e(boolean z10) {
        this.f25246b = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (Float.compare(this.f25245a, xVar.f25245a) == 0 && this.f25246b == xVar.f25246b && qc.q.d(this.f25247c, xVar.f25247c)) {
            return true;
        }
        return false;
    }

    public final void f(float f10) {
        this.f25245a = f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int floatToIntBits = Float.floatToIntBits(this.f25245a) * 31;
        boolean z10 = this.f25246b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (floatToIntBits + i10) * 31;
        l lVar = this.f25247c;
        if (lVar == null) {
            hashCode = 0;
        } else {
            hashCode = lVar.hashCode();
        }
        return i11 + hashCode;
    }

    public String toString() {
        return "RowColumnParentData(weight=" + this.f25245a + ", fill=" + this.f25246b + ", crossAxisAlignment=" + this.f25247c + ')';
    }

    public x(float f10, boolean z10, l lVar) {
        this.f25245a = f10;
        this.f25246b = z10;
        this.f25247c = lVar;
    }

    public /* synthetic */ x(float f10, boolean z10, l lVar, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? null : lVar);
    }
}
