package na;

import java.util.Random;

/* compiled from: AccelerationInitializer.java */
/* loaded from: classes4.dex */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private float f20300a;

    /* renamed from: b  reason: collision with root package name */
    private float f20301b;

    /* renamed from: c  reason: collision with root package name */
    private int f20302c;

    /* renamed from: d  reason: collision with root package name */
    private int f20303d;

    public a(float f10, float f11, int i10, int i11) {
        this.f20300a = f10;
        this.f20301b = f11;
        this.f20302c = i10;
        this.f20303d = i11;
    }

    @Override // na.b
    public void a(ma.b bVar, Random random) {
        int i10 = this.f20302c;
        float f10 = i10;
        int i11 = this.f20303d;
        if (i11 != i10) {
            f10 = random.nextInt(i11 - i10) + this.f20302c;
        }
        float f11 = (float) ((f10 * 3.141592653589793d) / 180.0d);
        float nextFloat = random.nextFloat();
        float f12 = this.f20301b;
        float f13 = this.f20300a;
        double d10 = (nextFloat * (f12 - f13)) + f13;
        double d11 = f11;
        bVar.f19820j = (float) (Math.cos(d11) * d10);
        bVar.f19821k = (float) (d10 * Math.sin(d11));
    }
}
