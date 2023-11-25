package y;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n1.j0;
import n1.j1;
import n1.l0;
import n1.y0;

/* compiled from: LazyLayoutMeasureScope.kt */
/* loaded from: classes.dex */
public final class u implements t, l0 {

    /* renamed from: f  reason: collision with root package name */
    private final m f26141f;

    /* renamed from: m  reason: collision with root package name */
    private final j1 f26142m;

    /* renamed from: p  reason: collision with root package name */
    private final o f26143p;

    /* renamed from: q  reason: collision with root package name */
    private final HashMap<Integer, List<y0>> f26144q;

    public u(m mVar, j1 j1Var) {
        qc.q.i(mVar, "itemContentFactory");
        qc.q.i(j1Var, "subcomposeMeasureScope");
        this.f26141f = mVar;
        this.f26142m = j1Var;
        this.f26143p = mVar.d().invoke();
        this.f26144q = new HashMap<>();
    }

    @Override // j2.e
    public long K(long j10) {
        return this.f26142m.K(j10);
    }

    @Override // j2.e
    public int K0(float f10) {
        return this.f26142m.K0(f10);
    }

    @Override // j2.e
    public long S0(long j10) {
        return this.f26142m.S0(j10);
    }

    @Override // j2.e
    public float T(long j10) {
        return this.f26142m.T(j10);
    }

    @Override // j2.e
    public float W0(long j10) {
        return this.f26142m.W0(j10);
    }

    @Override // j2.e
    public long c0(float f10) {
        return this.f26142m.c0(f10);
    }

    @Override // n1.l0
    public j0 e0(int i10, int i11, Map<n1.a, Integer> map, pc.l<? super y0.a, dc.w> lVar) {
        qc.q.i(map, "alignmentLines");
        qc.q.i(lVar, "placementBlock");
        return this.f26142m.e0(i10, i11, map, lVar);
    }

    @Override // j2.e
    public float getDensity() {
        return this.f26142m.getDensity();
    }

    @Override // n1.n
    public j2.r getLayoutDirection() {
        return this.f26142m.getLayoutDirection();
    }

    @Override // j2.e
    public float h0(int i10) {
        return this.f26142m.h0(i10);
    }

    @Override // y.t
    public List<y0> i0(int i10, long j10) {
        List<y0> list = this.f26144q.get(Integer.valueOf(i10));
        if (list == null) {
            Object a10 = this.f26143p.a(i10);
            List<n1.g0> u02 = this.f26142m.u0(a10, this.f26141f.b(i10, a10, this.f26143p.d(i10)));
            int size = u02.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(u02.get(i11).w(j10));
            }
            this.f26144q.put(Integer.valueOf(i10), arrayList);
            return arrayList;
        }
        return list;
    }

    @Override // j2.e
    public float j0(float f10) {
        return this.f26142m.j0(f10);
    }

    @Override // j2.e
    public float p0() {
        return this.f26142m.p0();
    }

    @Override // j2.e
    public float v0(float f10) {
        return this.f26142m.v0(f10);
    }
}
