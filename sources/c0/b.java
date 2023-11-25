package c0;

import androidx.compose.ui.e;
import j0.g2;
import j0.i2;
import j0.l3;
import j0.z1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import n1.y0;
import p1.g;
import v1.d;

/* compiled from: AnnotatedStringResolveInlineContent.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final dc.l<List<d.b<v1.u>>, List<d.b<pc.q<String, j0.l, Integer, dc.w>>>> f8179a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnnotatedStringResolveInlineContent.kt */
    /* loaded from: classes.dex */
    public static final class a implements n1.i0 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f8180a = new a();

        /* compiled from: AnnotatedStringResolveInlineContent.kt */
        /* renamed from: c0.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0195a extends qc.r implements pc.l<y0.a, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ List<n1.y0> f8181f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0195a(List<? extends n1.y0> list) {
                super(1);
                this.f8181f = list;
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(y0.a aVar) {
                invoke2(aVar);
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(y0.a aVar) {
                qc.q.i(aVar, "$this$layout");
                List<n1.y0> list = this.f8181f;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    y0.a.r(aVar, list.get(i10), 0, 0, 0.0f, 4, null);
                }
            }
        }

        a() {
        }

        @Override // n1.i0
        public /* synthetic */ int maxIntrinsicHeight(n1.n nVar, List list, int i10) {
            return n1.h0.a(this, nVar, list, i10);
        }

        @Override // n1.i0
        public /* synthetic */ int maxIntrinsicWidth(n1.n nVar, List list, int i10) {
            return n1.h0.b(this, nVar, list, i10);
        }

        @Override // n1.i0
        /* renamed from: measure-3p2s80s */
        public final n1.j0 mo0measure3p2s80s(n1.l0 l0Var, List<? extends n1.g0> list, long j10) {
            qc.q.i(l0Var, "$this$Layout");
            qc.q.i(list, "children");
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(list.get(i10).w(j10));
            }
            return n1.k0.b(l0Var, j2.b.n(j10), j2.b.m(j10), null, new C0195a(arrayList), 4, null);
        }

        @Override // n1.i0
        public /* synthetic */ int minIntrinsicHeight(n1.n nVar, List list, int i10) {
            return n1.h0.c(this, nVar, list, i10);
        }

        @Override // n1.i0
        public /* synthetic */ int minIntrinsicWidth(n1.n nVar, List list, int i10) {
            return n1.h0.d(this, nVar, list, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnnotatedStringResolveInlineContent.kt */
    /* renamed from: c0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0196b extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ v1.d f8182f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ List<d.b<pc.q<String, j0.l, Integer, dc.w>>> f8183m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f8184p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0196b(v1.d dVar, List<d.b<pc.q<String, j0.l, Integer, dc.w>>> list, int i10) {
            super(2);
            this.f8182f = dVar;
            this.f8183m = list;
            this.f8184p = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            b.a(this.f8182f, this.f8183m, lVar, z1.a(this.f8184p | 1));
        }
    }

    static {
        List i10;
        List i11;
        i10 = ec.t.i();
        i11 = ec.t.i();
        f8179a = new dc.l<>(i10, i11);
    }

    public static final void a(v1.d dVar, List<d.b<pc.q<String, j0.l, Integer, dc.w>>> list, j0.l lVar, int i10) {
        qc.q.i(dVar, "text");
        qc.q.i(list, "inlineContents");
        j0.l q10 = lVar.q(-1794596951);
        if (j0.n.K()) {
            j0.n.V(-1794596951, i10, -1, "androidx.compose.foundation.text.InlineChildren (AnnotatedStringResolveInlineContent.kt:70)");
        }
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            d.b<pc.q<String, j0.l, Integer, dc.w>> bVar = list.get(i12);
            pc.q<String, j0.l, Integer, dc.w> a10 = bVar.a();
            int b10 = bVar.b();
            int c10 = bVar.c();
            a aVar = a.f8180a;
            q10.e(-1323940314);
            e.a aVar2 = androidx.compose.ui.e.f2335a;
            int a11 = j0.j.a(q10, i11);
            j0.v F = q10.F();
            g.a aVar3 = p1.g.f20790l;
            pc.a<p1.g> a12 = aVar3.a();
            pc.q<i2<p1.g>, j0.l, Integer, dc.w> a13 = n1.x.a(aVar2);
            if (!(q10.u() instanceof j0.f)) {
                j0.j.c();
            }
            q10.s();
            if (q10.n()) {
                q10.B(a12);
            } else {
                q10.H();
            }
            j0.l a14 = l3.a(q10);
            l3.b(a14, aVar, aVar3.e());
            l3.b(a14, F, aVar3.g());
            pc.p<p1.g, Integer, dc.w> b11 = aVar3.b();
            if (a14.n() || !qc.q.d(a14.f(), Integer.valueOf(a11))) {
                a14.J(Integer.valueOf(a11));
                a14.I(Integer.valueOf(a11), b11);
            }
            a13.invoke(i2.a(i2.b(q10)), q10, 0);
            q10.e(2058660585);
            a10.invoke(dVar.subSequence(b10, c10).i(), q10, 0);
            q10.N();
            q10.O();
            q10.N();
            i12++;
            i11 = 0;
        }
        if (j0.n.K()) {
            j0.n.U();
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new C0196b(dVar, list, i10));
        }
    }

    public static final boolean b(v1.d dVar) {
        qc.q.i(dVar, "<this>");
        return dVar.l("androidx.compose.foundation.text.inlineContent", 0, dVar.i().length());
    }

    public static final dc.l<List<d.b<v1.u>>, List<d.b<pc.q<String, j0.l, Integer, dc.w>>>> c(v1.d dVar, Map<String, p> map) {
        boolean z10;
        qc.q.i(dVar, "<this>");
        if (map != null && !map.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return f8179a;
        }
        List<d.b<String>> h10 = dVar.h("androidx.compose.foundation.text.inlineContent", 0, dVar.i().length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = h10.size();
        for (int i10 = 0; i10 < size; i10++) {
            d.b<String> bVar = h10.get(i10);
            p pVar = map.get(bVar.e());
            if (pVar != null) {
                arrayList.add(new d.b(pVar.b(), bVar.f(), bVar.d()));
                arrayList2.add(new d.b(pVar.a(), bVar.f(), bVar.d()));
            }
        }
        return new dc.l<>(arrayList, arrayList2);
    }
}
