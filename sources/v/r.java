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

/* compiled from: PressInteraction.kt */
/* loaded from: classes.dex */
public final class r {

    /* compiled from: PressInteraction.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.interaction.PressInteractionKt$collectIsPressedAsState$1$1", f = "PressInteraction.kt", l = {88}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f24253f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ k f24254m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ j1<Boolean> f24255p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PressInteraction.kt */
        /* renamed from: v.r$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0570a implements dd.h<j> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ List<p> f24256f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ j1<Boolean> f24257m;

            C0570a(List<p> list, j1<Boolean> j1Var) {
                this.f24256f = list;
                this.f24257m = j1Var;
            }

            @Override // dd.h
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final Object emit(j jVar, Continuation<? super w> continuation) {
                if (jVar instanceof p) {
                    this.f24256f.add(jVar);
                } else if (jVar instanceof q) {
                    this.f24256f.remove(((q) jVar).a());
                } else if (jVar instanceof o) {
                    this.f24256f.remove(((o) jVar).a());
                }
                this.f24257m.setValue(kotlin.coroutines.jvm.internal.b.a(!this.f24256f.isEmpty()));
                return w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k kVar, j1<Boolean> j1Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f24254m = kVar;
            this.f24255p = j1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new a(this.f24254m, this.f24255p, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f24253f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                ArrayList arrayList = new ArrayList();
                dd.g<j> b10 = this.f24254m.b();
                C0570a c0570a = new C0570a(arrayList, this.f24255p);
                this.f24253f = 1;
                if (b10.collect(c0570a, this) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    public static final g3<Boolean> a(k kVar, j0.l lVar, int i10) {
        qc.q.i(kVar, "<this>");
        lVar.e(-1692965168);
        if (j0.n.K()) {
            j0.n.V(-1692965168, i10, -1, "androidx.compose.foundation.interaction.collectIsPressedAsState (PressInteraction.kt:83)");
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
