package x;

import java.util.List;
import n1.y0;

/* compiled from: LazyListMeasuredItemProvider.kt */
/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a  reason: collision with root package name */
    private final n f25673a;

    /* renamed from: b  reason: collision with root package name */
    private final y.t f25674b;

    /* renamed from: c  reason: collision with root package name */
    private final long f25675c;

    public /* synthetic */ v(long j10, boolean z10, n nVar, y.t tVar, qc.h hVar) {
        this(j10, z10, nVar, tVar);
    }

    public abstract u a(int i10, Object obj, Object obj2, List<? extends y0> list);

    public final u b(int i10) {
        return a(i10, this.f25673a.a(i10), this.f25673a.d(i10), this.f25674b.i0(i10, this.f25675c));
    }

    public final long c() {
        return this.f25675c;
    }

    public final y.r d() {
        return this.f25673a.f();
    }

    private v(long j10, boolean z10, n nVar, y.t tVar) {
        qc.q.i(nVar, "itemProvider");
        qc.q.i(tVar, "measureScope");
        this.f25673a = nVar;
        this.f25674b = tVar;
        this.f25675c = j2.c.b(0, z10 ? j2.b.n(j10) : Integer.MAX_VALUE, 0, !z10 ? j2.b.m(j10) : Integer.MAX_VALUE, 5, null);
    }
}
