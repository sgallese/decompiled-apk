package z0;

/* compiled from: MutableRect.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private float f26350a;

    /* renamed from: b  reason: collision with root package name */
    private float f26351b;

    /* renamed from: c  reason: collision with root package name */
    private float f26352c;

    /* renamed from: d  reason: collision with root package name */
    private float f26353d;

    public d(float f10, float f11, float f12, float f13) {
        this.f26350a = f10;
        this.f26351b = f11;
        this.f26352c = f12;
        this.f26353d = f13;
    }

    public final float a() {
        return this.f26353d;
    }

    public final float b() {
        return this.f26350a;
    }

    public final float c() {
        return this.f26352c;
    }

    public final float d() {
        return this.f26351b;
    }

    public final void e(float f10, float f11, float f12, float f13) {
        this.f26350a = Math.max(f10, this.f26350a);
        this.f26351b = Math.max(f11, this.f26351b);
        this.f26352c = Math.min(f12, this.f26352c);
        this.f26353d = Math.min(f13, this.f26353d);
    }

    public final boolean f() {
        if (this.f26350a < this.f26352c && this.f26351b < this.f26353d) {
            return false;
        }
        return true;
    }

    public final void g(float f10, float f11, float f12, float f13) {
        this.f26350a = f10;
        this.f26351b = f11;
        this.f26352c = f12;
        this.f26353d = f13;
    }

    public final void h(float f10) {
        this.f26353d = f10;
    }

    public final void i(float f10) {
        this.f26350a = f10;
    }

    public final void j(float f10) {
        this.f26352c = f10;
    }

    public final void k(float f10) {
        this.f26351b = f10;
    }

    public String toString() {
        return "MutableRect(" + c.a(this.f26350a, 1) + ", " + c.a(this.f26351b, 1) + ", " + c.a(this.f26352c, 1) + ", " + c.a(this.f26353d, 1) + ')';
    }
}
