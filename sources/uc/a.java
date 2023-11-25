package uc;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import qc.q;

/* compiled from: PlatformThreadLocalRandom.kt */
/* loaded from: classes4.dex */
public final class a extends tc.a {
    @Override // tc.c
    public double d(double d10) {
        return ThreadLocalRandom.current().nextDouble(d10);
    }

    @Override // tc.c
    public int h(int i10, int i11) {
        return ThreadLocalRandom.current().nextInt(i10, i11);
    }

    @Override // tc.a
    public Random i() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        q.h(current, "current()");
        return current;
    }
}
