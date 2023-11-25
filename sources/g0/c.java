package g0;

import androidx.compose.ui.platform.k1;
import androidx.compose.ui.platform.m1;
import dc.w;
import kotlin.coroutines.Continuation;
import pc.l;
import pc.p;
import qc.n;
import qc.q;
import qc.r;

/* compiled from: PullRefresh.kt */
/* loaded from: classes.dex */
public final class c {

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class a extends r implements l<m1, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e f15972f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f15973m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, boolean z10) {
            super(1);
            this.f15972f = eVar;
            this.f15973m = z10;
        }

        public final void a(m1 m1Var) {
            q.i(m1Var, "$this$null");
            m1Var.b("pullRefresh");
            m1Var.a().c("state", this.f15972f);
            m1Var.a().c("enabled", Boolean.valueOf(this.f15973m));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(m1 m1Var) {
            a(m1Var);
            return w.f13270a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class b extends r implements l<m1, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ l f15974f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ p f15975m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ boolean f15976p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l lVar, p pVar, boolean z10) {
            super(1);
            this.f15974f = lVar;
            this.f15975m = pVar;
            this.f15976p = z10;
        }

        public final void a(m1 m1Var) {
            q.i(m1Var, "$this$null");
            m1Var.b("pullRefresh");
            m1Var.a().c("onPull", this.f15974f);
            m1Var.a().c("onRelease", this.f15975m);
            m1Var.a().c("enabled", Boolean.valueOf(this.f15976p));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(m1 m1Var) {
            a(m1Var);
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PullRefresh.kt */
    /* renamed from: g0.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class C0377c extends n implements l<Float, Float> {
        C0377c(Object obj) {
            super(1, obj, e.class, "onPull", "onPull$material_release(F)F", 0);
        }

        public final Float h(float f10) {
            return Float.valueOf(((e) this.f21661m).q(f10));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Float invoke(Float f10) {
            return h(f10.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PullRefresh.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class d extends qc.a implements p<Float, Continuation<? super Float>, Object> {
        d(Object obj) {
            super(2, obj, e.class, "onRelease", "onRelease$material_release(F)F", 4);
        }

        public final Object b(float f10, Continuation<? super Float> continuation) {
            return c.e((e) this.f21647f, f10, continuation);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ Object invoke(Float f10, Continuation<? super Float> continuation) {
            return b(f10.floatValue(), continuation);
        }
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, e eVar2, boolean z10) {
        l a10;
        q.i(eVar, "<this>");
        q.i(eVar2, "state");
        if (k1.c()) {
            a10 = new a(eVar2, z10);
        } else {
            a10 = k1.a();
        }
        return k1.b(eVar, a10, c(androidx.compose.ui.e.f2335a, new C0377c(eVar2), new d(eVar2), z10));
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, l<? super Float, Float> lVar, p<? super Float, ? super Continuation<? super Float>, ? extends Object> pVar, boolean z10) {
        l a10;
        q.i(eVar, "<this>");
        q.i(lVar, "onPull");
        q.i(pVar, "onRelease");
        if (k1.c()) {
            a10 = new b(lVar, pVar, z10);
        } else {
            a10 = k1.a();
        }
        return k1.b(eVar, a10, androidx.compose.ui.input.nestedscroll.a.b(androidx.compose.ui.e.f2335a, new g0.d(lVar, pVar, z10), null, 2, null));
    }

    public static /* synthetic */ androidx.compose.ui.e d(androidx.compose.ui.e eVar, e eVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return b(eVar, eVar2, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object e(e eVar, float f10, Continuation continuation) {
        return kotlin.coroutines.jvm.internal.b.c(eVar.r(f10));
    }
}
