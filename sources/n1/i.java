package n1;

/* compiled from: ContentScale.kt */
/* loaded from: classes.dex */
public final class i implements f {

    /* renamed from: b  reason: collision with root package name */
    private final float f19998b;

    public i(float f10) {
        this.f19998b = f10;
    }

    @Override // n1.f
    public long a(long j10, long j11) {
        float f10 = this.f19998b;
        return e1.a(f10, f10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i) && Float.compare(this.f19998b, ((i) obj).f19998b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f19998b);
    }

    public String toString() {
        return "FixedScale(value=" + this.f19998b + ')';
    }
}
