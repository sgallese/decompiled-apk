package v1;

import a2.l;
import java.util.ArrayList;
import java.util.List;
import v1.d;

/* compiled from: MultiParagraphIntrinsics.kt */
/* loaded from: classes.dex */
public final class i implements p {

    /* renamed from: a  reason: collision with root package name */
    private final d f24463a;

    /* renamed from: b  reason: collision with root package name */
    private final List<d.b<u>> f24464b;

    /* renamed from: c  reason: collision with root package name */
    private final dc.f f24465c;

    /* renamed from: d  reason: collision with root package name */
    private final dc.f f24466d;

    /* renamed from: e  reason: collision with root package name */
    private final List<o> f24467e;

    /* compiled from: MultiParagraphIntrinsics.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.a<Float> {
        a() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            int k10;
            o oVar;
            float f10;
            p b10;
            List<o> f11 = i.this.f();
            if (f11.isEmpty()) {
                oVar = null;
            } else {
                o oVar2 = f11.get(0);
                float c10 = oVar2.b().c();
                k10 = ec.t.k(f11);
                int i10 = 1;
                if (1 <= k10) {
                    while (true) {
                        o oVar3 = f11.get(i10);
                        float c11 = oVar3.b().c();
                        if (Float.compare(c10, c11) < 0) {
                            oVar2 = oVar3;
                            c10 = c11;
                        }
                        if (i10 == k10) {
                            break;
                        }
                        i10++;
                    }
                }
                oVar = oVar2;
            }
            o oVar4 = oVar;
            if (oVar4 != null && (b10 = oVar4.b()) != null) {
                f10 = b10.c();
            } else {
                f10 = 0.0f;
            }
            return Float.valueOf(f10);
        }
    }

    /* compiled from: MultiParagraphIntrinsics.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.a<Float> {
        b() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            int k10;
            o oVar;
            float f10;
            p b10;
            List<o> f11 = i.this.f();
            if (f11.isEmpty()) {
                oVar = null;
            } else {
                o oVar2 = f11.get(0);
                float a10 = oVar2.b().a();
                k10 = ec.t.k(f11);
                int i10 = 1;
                if (1 <= k10) {
                    while (true) {
                        o oVar3 = f11.get(i10);
                        float a11 = oVar3.b().a();
                        if (Float.compare(a10, a11) < 0) {
                            oVar2 = oVar3;
                            a10 = a11;
                        }
                        if (i10 == k10) {
                            break;
                        }
                        i10++;
                    }
                }
                oVar = oVar2;
            }
            o oVar4 = oVar;
            if (oVar4 != null && (b10 = oVar4.b()) != null) {
                f10 = b10.a();
            } else {
                f10 = 0.0f;
            }
            return Float.valueOf(f10);
        }
    }

    public i(d dVar, k0 k0Var, List<d.b<u>> list, j2.e eVar, l.b bVar) {
        dc.f a10;
        dc.f a11;
        d n10;
        List b10;
        d dVar2 = dVar;
        qc.q.i(dVar2, "annotatedString");
        qc.q.i(k0Var, "style");
        qc.q.i(list, "placeholders");
        qc.q.i(eVar, "density");
        qc.q.i(bVar, "fontFamilyResolver");
        this.f24463a = dVar2;
        this.f24464b = list;
        dc.j jVar = dc.j.NONE;
        a10 = dc.h.a(jVar, new b());
        this.f24465c = a10;
        a11 = dc.h.a(jVar, new a());
        this.f24466d = a11;
        s L = k0Var.L();
        List<d.b<s>> m10 = e.m(dVar2, L);
        ArrayList arrayList = new ArrayList(m10.size());
        int size = m10.size();
        int i10 = 0;
        while (i10 < size) {
            d.b<s> bVar2 = m10.get(i10);
            n10 = e.n(dVar2, bVar2.f(), bVar2.d());
            s h10 = h(bVar2.e(), L);
            String i11 = n10.i();
            k0 H = k0Var.H(h10);
            List<d.b<b0>> f10 = n10.f();
            b10 = j.b(g(), bVar2.f(), bVar2.d());
            arrayList.add(new o(q.a(i11, H, f10, b10, eVar, bVar), bVar2.f(), bVar2.d()));
            i10++;
            dVar2 = dVar;
        }
        this.f24467e = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s h(s sVar, s sVar2) {
        g2.l l10 = sVar.l();
        if (l10 != null) {
            l10.l();
            return sVar;
        }
        return s.b(sVar, null, sVar2.l(), 0L, null, null, null, null, null, null, 509, null);
    }

    @Override // v1.p
    public float a() {
        return ((Number) this.f24465c.getValue()).floatValue();
    }

    @Override // v1.p
    public boolean b() {
        List<o> list = this.f24467e;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (list.get(i10).b().b()) {
                return true;
            }
        }
        return false;
    }

    @Override // v1.p
    public float c() {
        return ((Number) this.f24466d.getValue()).floatValue();
    }

    public final d e() {
        return this.f24463a;
    }

    public final List<o> f() {
        return this.f24467e;
    }

    public final List<d.b<u>> g() {
        return this.f24464b;
    }
}
