package b0;

import qc.q;
import z0.l;

/* compiled from: CornerSize.kt */
/* loaded from: classes.dex */
final class f implements b {

    /* renamed from: a  reason: collision with root package name */
    private final float f7624a;

    public f(float f10) {
        this.f7624a = f10;
        if (f10 >= 0.0f && f10 <= 100.0f) {
            return;
        }
        throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
    }

    @Override // b0.b
    public float a(long j10, j2.e eVar) {
        q.i(eVar, "density");
        return l.h(j10) * (this.f7624a / 100.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f) && Float.compare(this.f7624a, ((f) obj).f7624a) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f7624a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f7624a + "%)";
    }
}
