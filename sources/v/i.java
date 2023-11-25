package v;

import ad.k0;
import dc.w;
import j0.d3;
import j0.g3;
import j0.h0;
import j0.j1;
import j0.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* compiled from: HoverInteraction.kt */
/* loaded from: classes.dex */
public final class i {

    /* compiled from: HoverInteraction.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.interaction.HoverInteractionKt$collectIsHoveredAsState$1$1", f = "HoverInteraction.kt", l = {69}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f24244f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ k f24245m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ j1<Boolean> f24246p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: HoverInteraction.kt */
        /* renamed from: v.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0569a implements dd.h<j> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ List<g> f24247f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ j1<Boolean> f24248m;

            C0569a(List<g> list, j1<Boolean> j1Var) {
                this.f24247f = list;
                this.f24248m = j1Var;
            }

            @Override // dd.h
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final Object emit(j jVar, Continuation<? super w> continuation) {
                if (jVar instanceof g) {
                    this.f24247f.add(jVar);
                } else if (jVar instanceof h) {
                    this.f24247f.remove(((h) jVar).a());
                }
                this.f24248m.setValue(kotlin.coroutines.jvm.internal.b.a(!this.f24247f.isEmpty()));
                return w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k kVar, j1<Boolean> j1Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f24245m = kVar;
            this.f24246p = j1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new a(this.f24245m, this.f24246p, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f24244f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                ArrayList arrayList = new ArrayList();
                dd.g<j> b10 = this.f24245m.b();
                C0569a c0569a = new C0569a(arrayList, this.f24246p);
                this.f24244f = 1;
                if (b10.collect(c0569a, this) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    public static final g3<Boolean> a(k kVar, j0.l lVar, int i10) {
        qc.q.i(kVar, "<this>");
        lVar.e(1206586544);
        if (j0.n.K()) {
            j0.n.V(1206586544, i10, -1, "androidx.compose.foundation.interaction.collectIsHoveredAsState (HoverInteraction.kt:64)");
        }
        lVar.e(-492369756);
        Object f10 = lVar.f();
        l.a aVar = j0.l.f18688a;
        if (f10 == aVar.a()) {
            f10 = d3.e(Boolean.FALSE, null, 2, null);
            lVar.J(f10);
        }
        lVar.N();
        j1 j1Var = (j1) f10;
        int i11 = i10 & 14;
        lVar.e(511388516);
        boolean Q = lVar.Q(kVar) | lVar.Q(j1Var);
        Object f11 = lVar.f();
        if (Q || f11 == aVar.a()) {
            f11 = new a(kVar, j1Var, null);
            lVar.J(f11);
        }
        lVar.N();
        h0.d(kVar, (pc.p) f11, lVar, i11 | 64);
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return j1Var;
    }
}
