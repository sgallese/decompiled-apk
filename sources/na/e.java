package na;

import java.util.Random;

/* compiled from: ScaleInitializer.java */
/* loaded from: classes4.dex */
public class e implements b {

    /* renamed from: a  reason: collision with root package name */
    private float f20308a;

    /* renamed from: b  reason: collision with root package name */
    private float f20309b;

    public e(float f10, float f11) {
        this.f20309b = f10;
        this.f20308a = f11;
    }

    @Override // na.b
    public void a(ma.b bVar, Random random) {
        float nextFloat = random.nextFloat();
        float f10 = this.f20308a;
        float f11 = this.f20309b;
        bVar.f19814d = (nextFloat * (f10 - f11)) + f11;
    }
}
