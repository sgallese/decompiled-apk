package na;

import java.util.Random;

/* compiled from: RotationInitiazer.java */
/* loaded from: classes4.dex */
public class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private int f20304a;

    /* renamed from: b  reason: collision with root package name */
    private int f20305b;

    public c(int i10, int i11) {
        this.f20304a = i10;
        this.f20305b = i11;
    }

    @Override // na.b
    public void a(ma.b bVar, Random random) {
        int i10 = this.f20304a;
        int i11 = this.f20305b;
        if (i10 != i11) {
            i10 = this.f20304a + random.nextInt(i11 - i10);
        }
        bVar.f19816f = i10;
    }
}
