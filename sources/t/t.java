package t;

import android.content.Context;
import android.widget.EdgeEffect;

/* compiled from: EdgeEffectCompat.kt */
/* loaded from: classes.dex */
final class t extends EdgeEffect {

    /* renamed from: a  reason: collision with root package name */
    private final float f23204a;

    /* renamed from: b  reason: collision with root package name */
    private float f23205b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context) {
        super(context);
        qc.q.i(context, "context");
        this.f23204a = j2.a.a(context).v0(j2.h.j(1));
    }

    public final void a(float f10) {
        float f11 = this.f23205b + f10;
        this.f23205b = f11;
        if (Math.abs(f11) > this.f23204a) {
            onRelease();
        }
    }

    @Override // android.widget.EdgeEffect
    public void onAbsorb(int i10) {
        this.f23205b = 0.0f;
        super.onAbsorb(i10);
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f10, float f11) {
        this.f23205b = 0.0f;
        super.onPull(f10, f11);
    }

    @Override // android.widget.EdgeEffect
    public void onRelease() {
        this.f23205b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f10) {
        this.f23205b = 0.0f;
        super.onPull(f10);
    }
}
