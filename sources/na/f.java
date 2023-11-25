package na;

import java.util.Random;

/* compiled from: SpeeddByComponentsInitializer.java */
/* loaded from: classes4.dex */
public class f implements b {

    /* renamed from: a  reason: collision with root package name */
    private float f20310a;

    /* renamed from: b  reason: collision with root package name */
    private float f20311b;

    /* renamed from: c  reason: collision with root package name */
    private float f20312c;

    /* renamed from: d  reason: collision with root package name */
    private float f20313d;

    public f(float f10, float f11, float f12, float f13) {
        this.f20310a = f10;
        this.f20311b = f11;
        this.f20312c = f12;
        this.f20313d = f13;
    }

    @Override // na.b
    public void a(ma.b bVar, Random random) {
        float nextFloat = random.nextFloat();
        float f10 = this.f20311b;
        float f11 = this.f20310a;
        bVar.f19818h = (nextFloat * (f10 - f11)) + f11;
        float nextFloat2 = random.nextFloat();
        float f12 = this.f20313d;
        float f13 = this.f20312c;
        bVar.f19819i = (nextFloat2 * (f12 - f13)) + f13;
    }
}
