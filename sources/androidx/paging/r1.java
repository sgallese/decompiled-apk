package androidx.paging;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PagingConfig.kt */
/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: g  reason: collision with root package name */
    public static final a f6017g = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final int f6018a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6019b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f6020c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6021d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6022e;

    /* renamed from: f  reason: collision with root package name */
    public final int f6023f;

    /* compiled from: PagingConfig.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    public r1(int i10, int i11, boolean z10, int i12, int i13, int i14) {
        this.f6018a = i10;
        this.f6019b = i11;
        this.f6020c = z10;
        this.f6021d = i12;
        this.f6022e = i13;
        this.f6023f = i14;
        if (!z10 && i11 == 0) {
            throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
        }
        if (i13 == Integer.MAX_VALUE || i13 >= (i11 * 2) + i10) {
            if (!(i14 == Integer.MIN_VALUE || i14 > 0)) {
                throw new IllegalArgumentException("jumpThreshold must be positive to enable jumps or COUNT_UNDEFINED to disable jumping.".toString());
            }
            return;
        }
        throw new IllegalArgumentException("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=" + i10 + ", prefetchDist=" + i11 + ", maxSize=" + i13);
    }

    public /* synthetic */ r1(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15, qc.h hVar) {
        this(i10, (i15 & 2) != 0 ? i10 : i11, (i15 & 4) != 0 ? true : z10, (i15 & 8) != 0 ? i10 * 3 : i12, (i15 & 16) != 0 ? Integer.MAX_VALUE : i13, (i15 & 32) != 0 ? RecyclerView.UNDEFINED_DURATION : i14);
    }
}
