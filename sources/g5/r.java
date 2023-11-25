package g5;

/* compiled from: ImageLoaderOptions.kt */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f16205a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f16206b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f16207c;

    /* renamed from: d  reason: collision with root package name */
    private final int f16208d;

    /* renamed from: e  reason: collision with root package name */
    private final t4.l f16209e;

    public r(boolean z10, boolean z11, boolean z12, int i10, t4.l lVar) {
        this.f16205a = z10;
        this.f16206b = z11;
        this.f16207c = z12;
        this.f16208d = i10;
        this.f16209e = lVar;
    }

    public final boolean a() {
        return this.f16205a;
    }

    public final t4.l b() {
        return this.f16209e;
    }

    public final int c() {
        return this.f16208d;
    }

    public final boolean d() {
        return this.f16206b;
    }

    public final boolean e() {
        return this.f16207c;
    }

    public /* synthetic */ r(boolean z10, boolean z11, boolean z12, int i10, t4.l lVar, int i11, qc.h hVar) {
        this((i11 & 1) != 0 ? true : z10, (i11 & 2) != 0 ? true : z11, (i11 & 4) == 0 ? z12 : true, (i11 & 8) != 0 ? 4 : i10, (i11 & 16) != 0 ? t4.l.RESPECT_PERFORMANCE : lVar);
    }
}
