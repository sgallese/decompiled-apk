package vc;

/* compiled from: PrimitiveRanges.kt */
/* loaded from: classes4.dex */
public final class i extends g implements c<Long> {

    /* renamed from: r  reason: collision with root package name */
    public static final a f25133r = new a(null);

    /* renamed from: s  reason: collision with root package name */
    private static final i f25134s = new i(1, 0);

    /* compiled from: PrimitiveRanges.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    public i(long j10, long j11) {
        super(j10, j11, 1L);
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            if (!isEmpty() || !((i) obj).isEmpty()) {
                i iVar = (i) obj;
                if (h() != iVar.h() || i() != iVar.i()) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((31 * (h() ^ (h() >>> 32))) + (i() ^ (i() >>> 32)));
    }

    @Override // vc.c
    public boolean isEmpty() {
        if (h() > i()) {
            return true;
        }
        return false;
    }

    public boolean k(long j10) {
        if (h() <= j10 && j10 <= i()) {
            return true;
        }
        return false;
    }

    @Override // vc.c
    /* renamed from: l  reason: merged with bridge method [inline-methods] */
    public Long f() {
        return Long.valueOf(i());
    }

    @Override // vc.c
    /* renamed from: m  reason: merged with bridge method [inline-methods] */
    public Long a() {
        return Long.valueOf(h());
    }

    public String toString() {
        return h() + ".." + i();
    }
}
