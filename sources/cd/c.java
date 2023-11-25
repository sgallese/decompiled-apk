package cd;

import dc.w;
import fd.g0;
import fd.j0;

/* compiled from: BufferedChannel.kt */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final j<Object> f8983a = new j<>(-1, null, null, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final int f8984b;

    /* renamed from: c  reason: collision with root package name */
    private static final int f8985c;

    /* renamed from: d  reason: collision with root package name */
    public static final g0 f8986d;

    /* renamed from: e  reason: collision with root package name */
    private static final g0 f8987e;

    /* renamed from: f  reason: collision with root package name */
    private static final g0 f8988f;

    /* renamed from: g  reason: collision with root package name */
    private static final g0 f8989g;

    /* renamed from: h  reason: collision with root package name */
    private static final g0 f8990h;

    /* renamed from: i  reason: collision with root package name */
    private static final g0 f8991i;

    /* renamed from: j  reason: collision with root package name */
    private static final g0 f8992j;

    /* renamed from: k  reason: collision with root package name */
    private static final g0 f8993k;

    /* renamed from: l  reason: collision with root package name */
    private static final g0 f8994l;

    /* renamed from: m  reason: collision with root package name */
    private static final g0 f8995m;

    /* renamed from: n  reason: collision with root package name */
    private static final g0 f8996n;

    /* renamed from: o  reason: collision with root package name */
    private static final g0 f8997o;

    /* renamed from: p  reason: collision with root package name */
    private static final g0 f8998p;

    /* renamed from: q  reason: collision with root package name */
    private static final g0 f8999q;

    /* renamed from: r  reason: collision with root package name */
    private static final g0 f9000r;

    /* renamed from: s  reason: collision with root package name */
    private static final g0 f9001s;

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: BufferedChannel.kt */
    /* loaded from: classes4.dex */
    /* synthetic */ class a<E> extends qc.n implements pc.p<Long, j<E>, j<E>> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f9002w = new a();

        a() {
            super(2, c.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final j<E> h(long j10, j<E> jVar) {
            return c.x(j10, jVar);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ Object invoke(Long l10, Object obj) {
            return h(l10.longValue(), (j) obj);
        }
    }

    static {
        int e10;
        int e11;
        e10 = j0.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
        f8984b = e10;
        e11 = j0.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);
        f8985c = e11;
        f8986d = new g0("BUFFERED");
        f8987e = new g0("SHOULD_BUFFER");
        f8988f = new g0("S_RESUMING_BY_RCV");
        f8989g = new g0("RESUMING_BY_EB");
        f8990h = new g0("POISONED");
        f8991i = new g0("DONE_RCV");
        f8992j = new g0("INTERRUPTED_SEND");
        f8993k = new g0("INTERRUPTED_RCV");
        f8994l = new g0("CHANNEL_CLOSED");
        f8995m = new g0("SUSPEND");
        f8996n = new g0("SUSPEND_NO_WAITER");
        f8997o = new g0("FAILED");
        f8998p = new g0("NO_RECEIVE_RESULT");
        f8999q = new g0("CLOSE_HANDLER_CLOSED");
        f9000r = new g0("CLOSE_HANDLER_INVOKED");
        f9001s = new g0("NO_CLOSE_CAUSE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long A(int i10) {
        if (i10 != 0) {
            if (i10 != Integer.MAX_VALUE) {
                return i10;
            }
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean B(ad.m<? super T> mVar, T t10, pc.l<? super Throwable, w> lVar) {
        Object t11 = mVar.t(t10, null, lVar);
        if (t11 != null) {
            mVar.w(t11);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean C(ad.m mVar, Object obj, pc.l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        return B(mVar, obj, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(long j10, boolean z10) {
        long j11;
        if (z10) {
            j11 = 4611686018427387904L;
        } else {
            j11 = 0;
        }
        return j11 + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long w(long j10, int i10) {
        return (i10 << 60) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> j<E> x(long j10, j<E> jVar) {
        return new j<>(j10, jVar, jVar.u(), 0);
    }

    public static final <E> wc.d<j<E>> y() {
        return a.f9002w;
    }

    public static final g0 z() {
        return f8994l;
    }
}
