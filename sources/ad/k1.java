package ad;

/* compiled from: EventLoop.common.kt */
/* loaded from: classes4.dex */
public final class k1 {

    /* renamed from: a  reason: collision with root package name */
    private static final fd.g0 f531a = new fd.g0("REMOVED_TASK");

    /* renamed from: b  reason: collision with root package name */
    private static final fd.g0 f532b = new fd.g0("CLOSED_EMPTY");

    public static final long c(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        if (j10 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j10;
    }
}
