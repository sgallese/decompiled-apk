package b0;

import qc.q;

/* compiled from: CornerSize.kt */
/* loaded from: classes.dex */
final class g implements b {

    /* renamed from: a  reason: collision with root package name */
    private final float f7625a;

    public g(float f10) {
        this.f7625a = f10;
    }

    @Override // b0.b
    public float a(long j10, j2.e eVar) {
        q.i(eVar, "density");
        return this.f7625a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && Float.compare(this.f7625a, ((g) obj).f7625a) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f7625a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f7625a + ".px)";
    }
}
