package m1;

import r.x;

/* compiled from: RotaryScrollEvent.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final float f19732a;

    /* renamed from: b  reason: collision with root package name */
    private final float f19733b;

    /* renamed from: c  reason: collision with root package name */
    private final long f19734c;

    public b(float f10, float f11, long j10) {
        this.f19732a = f10;
        this.f19733b = f11;
        this.f19734c = j10;
    }

    public boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (bVar.f19732a == this.f19732a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        if (bVar.f19733b == this.f19733b) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 || bVar.f19734c != this.f19734c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.f19732a) * 31) + Float.floatToIntBits(this.f19733b)) * 31) + x.a(this.f19734c);
    }

    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.f19732a + ",horizontalScrollPixels=" + this.f19733b + ",uptimeMillis=" + this.f19734c + ')';
    }
}
