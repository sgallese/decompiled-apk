package h0;

import android.content.Context;
import android.view.ViewGroup;
import ec.t;
import ec.y;
import java.util.ArrayList;
import java.util.List;

/* compiled from: RippleContainer.android.kt */
/* loaded from: classes.dex */
public final class i extends ViewGroup {

    /* renamed from: f  reason: collision with root package name */
    private final int f16393f;

    /* renamed from: m  reason: collision with root package name */
    private final List<l> f16394m;

    /* renamed from: p  reason: collision with root package name */
    private final List<l> f16395p;

    /* renamed from: q  reason: collision with root package name */
    private final j f16396q;

    /* renamed from: r  reason: collision with root package name */
    private int f16397r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        super(context);
        qc.q.i(context, "context");
        this.f16393f = 5;
        ArrayList arrayList = new ArrayList();
        this.f16394m = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f16395p = arrayList2;
        this.f16396q = new j();
        setClipChildren(false);
        l lVar = new l(context);
        addView(lVar);
        arrayList.add(lVar);
        arrayList2.add(lVar);
        this.f16397r = 1;
        setTag(v0.h.I, Boolean.TRUE);
    }

    public final void a(a aVar) {
        qc.q.i(aVar, "<this>");
        aVar.n();
        l b10 = this.f16396q.b(aVar);
        if (b10 != null) {
            b10.d();
            this.f16396q.c(aVar);
            this.f16395p.add(b10);
        }
    }

    public final l b(a aVar) {
        Object E;
        int k10;
        qc.q.i(aVar, "<this>");
        l b10 = this.f16396q.b(aVar);
        if (b10 == null) {
            E = y.E(this.f16395p);
            l lVar = (l) E;
            if (lVar == null) {
                int i10 = this.f16397r;
                k10 = t.k(this.f16394m);
                if (i10 > k10) {
                    Context context = getContext();
                    qc.q.h(context, "context");
                    lVar = new l(context);
                    addView(lVar);
                    this.f16394m.add(lVar);
                } else {
                    lVar = this.f16394m.get(this.f16397r);
                    a a10 = this.f16396q.a(lVar);
                    if (a10 != null) {
                        a10.n();
                        this.f16396q.c(a10);
                        lVar.d();
                    }
                }
                int i11 = this.f16397r;
                if (i11 < this.f16393f - 1) {
                    this.f16397r = i11 + 1;
                } else {
                    this.f16397r = 0;
                }
            }
            this.f16396q.d(aVar, lVar);
            return lVar;
        }
        return b10;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
