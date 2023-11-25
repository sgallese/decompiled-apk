package n1;

/* compiled from: ContentScale.kt */
/* loaded from: classes.dex */
public final class g {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(long j10, long j11) {
        return z0.l.g(j11) / z0.l.g(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(long j10, long j11) {
        return Math.max(h(j10, j11), e(j10, j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g(long j10, long j11) {
        return Math.min(h(j10, j11), e(j10, j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float h(long j10, long j11) {
        return z0.l.i(j11) / z0.l.i(j10);
    }
}
