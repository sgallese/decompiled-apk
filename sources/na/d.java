package na;

import java.util.Random;

/* compiled from: RotationSpeedInitializer.java */
/* loaded from: classes4.dex */
public class d implements b {

    /* renamed from: a  reason: collision with root package name */
    private float f20306a;

    /* renamed from: b  reason: collision with root package name */
    private float f20307b;

    public d(float f10, float f11) {
        this.f20306a = f10;
        this.f20307b = f11;
    }

    @Override // na.b
    public void a(ma.b bVar, Random random) {
        float nextFloat = random.nextFloat();
        float f10 = this.f20307b;
        float f11 = this.f20306a;
        bVar.f19817g = (nextFloat * (f10 - f11)) + f11;
    }
}
