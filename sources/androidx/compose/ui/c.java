package androidx.compose.ui;

import androidx.compose.ui.e;
import androidx.compose.ui.platform.k1;
import androidx.compose.ui.platform.m1;
import dc.w;
import pc.l;
import pc.p;
import qc.k0;
import qc.q;
import qc.r;

/* compiled from: ComposedModifier.kt */
/* loaded from: classes.dex */
public final class c {

    /* compiled from: ComposedModifier.kt */
    /* loaded from: classes.dex */
    public static final class a extends r implements l<e.b, Boolean> {

        /* renamed from: f */
        public static final a f2321f = new a();

        a() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a */
        public final Boolean invoke(e.b bVar) {
            q.i(bVar, "it");
            return Boolean.valueOf(!(bVar instanceof androidx.compose.ui.b));
        }
    }

    /* compiled from: ComposedModifier.kt */
    /* loaded from: classes.dex */
    public static final class b extends r implements p<e, e.b, e> {

        /* renamed from: f */
        final /* synthetic */ j0.l f2322f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j0.l lVar) {
            super(2);
            this.f2322f = lVar;
        }

        @Override // pc.p
        /* renamed from: a */
        public final e invoke(e eVar, e.b bVar) {
            q.i(eVar, "acc");
            q.i(bVar, "element");
            boolean z10 = bVar instanceof androidx.compose.ui.b;
            e.b bVar2 = bVar;
            if (z10) {
                pc.q<e, j0.l, Integer, e> e10 = ((androidx.compose.ui.b) bVar).e();
                q.g(e10, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                bVar2 = c.d(this.f2322f, (e) ((pc.q) k0.e(e10, 3)).invoke(e.f2335a, this.f2322f, 0));
            }
            return eVar.a(bVar2);
        }
    }

    public static final e a(e eVar, l<? super m1, w> lVar, pc.q<? super e, ? super j0.l, ? super Integer, ? extends e> qVar) {
        q.i(eVar, "<this>");
        q.i(lVar, "inspectorInfo");
        q.i(qVar, "factory");
        return eVar.a(new androidx.compose.ui.b(lVar, qVar));
    }

    public static /* synthetic */ e b(e eVar, l lVar, pc.q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = k1.a();
        }
        return a(eVar, lVar, qVar);
    }

    public static final /* synthetic */ e c(j0.l lVar, e eVar) {
        q.i(lVar, "<this>");
        q.i(eVar, "modifier");
        return e(lVar, eVar);
    }

    public static final e d(j0.l lVar, e eVar) {
        q.i(lVar, "<this>");
        q.i(eVar, "modifier");
        if (eVar.h(a.f2321f)) {
            return eVar;
        }
        lVar.e(1219399079);
        e eVar2 = (e) eVar.b(e.f2335a, new b(lVar));
        lVar.N();
        return eVar2;
    }

    public static final e e(j0.l lVar, e eVar) {
        q.i(lVar, "<this>");
        q.i(eVar, "modifier");
        if (eVar != e.f2335a) {
            return d(lVar, new CompositionLocalMapInjectionElement(lVar.F()).a(eVar));
        }
        return eVar;
    }
}
