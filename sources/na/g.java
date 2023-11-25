package na;

import java.util.Random;

/* compiled from: SpeeddModuleAndRangeInitializer.java */
/* loaded from: classes4.dex */
public class g implements b {

    /* renamed from: a  reason: collision with root package name */
    private float f20314a;

    /* renamed from: b  reason: collision with root package name */
    private float f20315b;

    /* renamed from: c  reason: collision with root package name */
    private int f20316c;

    /* renamed from: d  reason: collision with root package name */
    private int f20317d;

    public g(float f10, float f11, int i10, int i11) {
        int i12;
        this.f20314a = f10;
        this.f20315b = f11;
        this.f20316c = i10;
        this.f20317d = i11;
        while (true) {
            int i13 = this.f20316c;
            if (i13 >= 0) {
                break;
            }
            this.f20316c = i13 + 360;
        }
        while (true) {
            i12 = this.f20317d;
            if (i12 >= 0) {
                break;
            }
            this.f20317d = i12 + 360;
        }
        int i14 = this.f20316c;
        if (i14 > i12) {
            this.f20316c = i12;
            this.f20317d = i14;
        }
    }

    @Override // na.b
    public void a(ma.b bVar, Random random) {
        float nextFloat = random.nextFloat();
        float f10 = this.f20315b;
        float f11 = this.f20314a;
        float f12 = (nextFloat * (f10 - f11)) + f11;
        int i10 = this.f20317d;
        int i11 = this.f20316c;
        if (i10 != i11) {
            i11 = random.nextInt(i10 - i11) + this.f20316c;
        }
        double d10 = f12;
        double d11 = (float) ((i11 * 3.141592653589793d) / 180.0d);
        bVar.f19818h = (float) (Math.cos(d11) * d10);
        bVar.f19819i = (float) (d10 * Math.sin(d11));
    }
}
