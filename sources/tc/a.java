package tc;

import java.util.Random;

/* compiled from: PlatformRandom.kt */
/* loaded from: classes4.dex */
public abstract class a extends c {
    @Override // tc.c
    public int b(int i10) {
        return d.e(i().nextInt(), i10);
    }

    @Override // tc.c
    public double c() {
        return i().nextDouble();
    }

    @Override // tc.c
    public float f() {
        return i().nextFloat();
    }

    @Override // tc.c
    public int g() {
        return i().nextInt();
    }

    public abstract Random i();
}
