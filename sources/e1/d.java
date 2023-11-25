package e1;

/* compiled from: FastFloatParser.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private float f13739a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f13740b;

    public d(float f10, boolean z10) {
        this.f13739a = f10;
        this.f13740b = z10;
    }

    public final float a() {
        return this.f13739a;
    }

    public final boolean b() {
        return this.f13740b;
    }

    public final void c(boolean z10) {
        this.f13740b = z10;
    }

    public final void d(float f10) {
        this.f13739a = f10;
    }

    public /* synthetic */ d(float f10, boolean z10, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? Float.NaN : f10, (i10 & 2) != 0 ? false : z10);
    }
}
