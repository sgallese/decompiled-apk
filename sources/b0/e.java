package b0;

import qc.q;

/* compiled from: CornerSize.kt */
/* loaded from: classes.dex */
final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    private final float f7623a;

    public /* synthetic */ e(float f10, qc.h hVar) {
        this(f10);
    }

    @Override // b0.b
    public float a(long j10, j2.e eVar) {
        q.i(eVar, "density");
        return eVar.v0(this.f7623a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && j2.h.l(this.f7623a, ((e) obj).f7623a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return j2.h.m(this.f7623a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f7623a + ".dp)";
    }

    private e(float f10) {
        this.f7623a = f10;
    }
}
