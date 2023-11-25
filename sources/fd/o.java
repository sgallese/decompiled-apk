package fd;

/* compiled from: LimitedDispatcher.kt */
/* loaded from: classes4.dex */
public final class o {
    public static final void a(int i10) {
        boolean z10 = true;
        if (i10 < 1) {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i10).toString());
    }
}
