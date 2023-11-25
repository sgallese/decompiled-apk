package l1;

import r.x;

/* compiled from: VelocityTracker.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private long f19482a;

    /* renamed from: b  reason: collision with root package name */
    private float f19483b;

    public a(long j10, float f10) {
        this.f19482a = j10;
        this.f19483b = f10;
    }

    public final float a() {
        return this.f19483b;
    }

    public final long b() {
        return this.f19482a;
    }

    public final void c(float f10) {
        this.f19483b = f10;
    }

    public final void d(long j10) {
        this.f19482a = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f19482a == aVar.f19482a && Float.compare(this.f19483b, aVar.f19483b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (x.a(this.f19482a) * 31) + Float.floatToIntBits(this.f19483b);
    }

    public String toString() {
        return "DataPointAtTime(time=" + this.f19482a + ", dataPoint=" + this.f19483b + ')';
    }
}
