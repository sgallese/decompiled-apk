package p1;

/* compiled from: HitTestResult.kt */
/* loaded from: classes.dex */
public final class w {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long a(float f10, boolean z10) {
        long j10;
        long floatToIntBits = Float.floatToIntBits(f10);
        if (z10) {
            j10 = 1;
        } else {
            j10 = 0;
        }
        return p.b((j10 & 4294967295L) | (floatToIntBits << 32));
    }
}
