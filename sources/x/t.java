package x;

import java.util.List;
import java.util.Map;
import n1.j0;

/* compiled from: LazyListMeasureResult.kt */
/* loaded from: classes.dex */
public final class t implements r, j0 {

    /* renamed from: a  reason: collision with root package name */
    private final u f25639a;

    /* renamed from: b  reason: collision with root package name */
    private final int f25640b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f25641c;

    /* renamed from: d  reason: collision with root package name */
    private final float f25642d;

    /* renamed from: e  reason: collision with root package name */
    private final List<l> f25643e;

    /* renamed from: f  reason: collision with root package name */
    private final int f25644f;

    /* renamed from: g  reason: collision with root package name */
    private final int f25645g;

    /* renamed from: h  reason: collision with root package name */
    private final int f25646h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f25647i;

    /* renamed from: j  reason: collision with root package name */
    private final u.o f25648j;

    /* renamed from: k  reason: collision with root package name */
    private final int f25649k;

    /* renamed from: l  reason: collision with root package name */
    private final int f25650l;

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ j0 f25651m;

    /* JADX WARN: Multi-variable type inference failed */
    public t(u uVar, int i10, boolean z10, float f10, j0 j0Var, List<? extends l> list, int i11, int i12, int i13, boolean z11, u.o oVar, int i14, int i15) {
        qc.q.i(j0Var, "measureResult");
        qc.q.i(list, "visibleItemsInfo");
        qc.q.i(oVar, "orientation");
        this.f25639a = uVar;
        this.f25640b = i10;
        this.f25641c = z10;
        this.f25642d = f10;
        this.f25643e = list;
        this.f25644f = i11;
        this.f25645g = i12;
        this.f25646h = i13;
        this.f25647i = z11;
        this.f25648j = oVar;
        this.f25649k = i14;
        this.f25650l = i15;
        this.f25651m = j0Var;
    }

    @Override // x.r
    public int a() {
        return this.f25646h;
    }

    @Override // x.r
    public List<l> b() {
        return this.f25643e;
    }

    public final boolean c() {
        return this.f25641c;
    }

    @Override // n1.j0
    public Map<n1.a, Integer> d() {
        return this.f25651m.d();
    }

    @Override // n1.j0
    public void e() {
        this.f25651m.e();
    }

    public final float f() {
        return this.f25642d;
    }

    public final u g() {
        return this.f25639a;
    }

    @Override // n1.j0
    public int getHeight() {
        return this.f25651m.getHeight();
    }

    @Override // n1.j0
    public int getWidth() {
        return this.f25651m.getWidth();
    }

    public final int h() {
        return this.f25640b;
    }
}
