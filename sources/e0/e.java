package e0;

import kotlin.NoWhenBranchMatchedException;

/* compiled from: AndroidSelectionHandles.android.kt */
/* loaded from: classes.dex */
public final class e implements androidx.compose.ui.window.j {

    /* renamed from: a  reason: collision with root package name */
    private final f f13633a;

    /* renamed from: b  reason: collision with root package name */
    private final long f13634b;

    /* compiled from: AndroidSelectionHandles.android.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13635a;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[f.TopLeft.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.TopRight.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.TopMiddle.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13635a = iArr;
        }
    }

    public /* synthetic */ e(f fVar, long j10, qc.h hVar) {
        this(fVar, j10);
    }

    @Override // androidx.compose.ui.window.j
    public long a(j2.n nVar, long j10, j2.r rVar, long j11) {
        qc.q.i(nVar, "anchorBounds");
        qc.q.i(rVar, "layoutDirection");
        int i10 = a.f13635a[this.f13633a.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return j2.m.a((nVar.b() + j2.l.j(this.f13634b)) - (j2.p.g(j11) / 2), nVar.c() + j2.l.k(this.f13634b));
                }
                throw new NoWhenBranchMatchedException();
            }
            return j2.m.a((nVar.b() + j2.l.j(this.f13634b)) - j2.p.g(j11), nVar.c() + j2.l.k(this.f13634b));
        }
        return j2.m.a(nVar.b() + j2.l.j(this.f13634b), nVar.c() + j2.l.k(this.f13634b));
    }

    private e(f fVar, long j10) {
        qc.q.i(fVar, "handleReferencePoint");
        this.f13633a = fVar;
        this.f13634b = j10;
    }
}
