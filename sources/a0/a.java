package a0;

import androidx.compose.ui.e;
import androidx.compose.ui.platform.k1;
import androidx.compose.ui.platform.m1;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import dc.w;
import pc.l;
import qc.q;
import qc.r;
import t.v;
import t1.i;
import t1.o;
import t1.x;
import v.m;

/* compiled from: Toggleable.kt */
/* loaded from: classes.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Toggleable.kt */
    /* renamed from: a0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0000a extends r implements pc.a<w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ l<Boolean, w> f47f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f48m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0000a(l<? super Boolean, w> lVar, boolean z10) {
            super(0);
            this.f47f = lVar;
            this.f48m = z10;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f47f.invoke(Boolean.valueOf(!this.f48m));
        }
    }

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class b extends r implements l<m1, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f49f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ m f50m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ v f51p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ boolean f52q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ i f53r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ l f54s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, m mVar, v vVar, boolean z11, i iVar, l lVar) {
            super(1);
            this.f49f = z10;
            this.f50m = mVar;
            this.f51p = vVar;
            this.f52q = z11;
            this.f53r = iVar;
            this.f54s = lVar;
        }

        public final void a(m1 m1Var) {
            q.i(m1Var, "$this$null");
            m1Var.b("toggleable");
            m1Var.a().c(AppMeasurementSdk.ConditionalUserProperty.VALUE, Boolean.valueOf(this.f49f));
            m1Var.a().c("interactionSource", this.f50m);
            m1Var.a().c("indication", this.f51p);
            m1Var.a().c("enabled", Boolean.valueOf(this.f52q));
            m1Var.a().c("role", this.f53r);
            m1Var.a().c("onValueChange", this.f54s);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(m1 m1Var) {
            a(m1Var);
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Toggleable.kt */
    /* loaded from: classes.dex */
    public static final class c extends r implements l<x, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ u1.a f55f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(u1.a aVar) {
            super(1);
            this.f55f = aVar;
        }

        public final void a(x xVar) {
            q.i(xVar, "$this$semantics");
            t1.v.Y(xVar, this.f55f);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(x xVar) {
            a(xVar);
            return w.f13270a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class d extends r implements l<m1, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ u1.a f56f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f57m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ i f58p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ m f59q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ v f60r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ pc.a f61s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(u1.a aVar, boolean z10, i iVar, m mVar, v vVar, pc.a aVar2) {
            super(1);
            this.f56f = aVar;
            this.f57m = z10;
            this.f58p = iVar;
            this.f59q = mVar;
            this.f60r = vVar;
            this.f61s = aVar2;
        }

        public final void a(m1 m1Var) {
            q.i(m1Var, "$this$null");
            m1Var.b("triStateToggleable");
            m1Var.a().c("state", this.f56f);
            m1Var.a().c("enabled", Boolean.valueOf(this.f57m));
            m1Var.a().c("role", this.f58p);
            m1Var.a().c("interactionSource", this.f59q);
            m1Var.a().c("indication", this.f60r);
            m1Var.a().c("onClick", this.f61s);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(m1 m1Var) {
            a(m1Var);
            return w.f13270a;
        }
    }

    public static final e a(e eVar, boolean z10, m mVar, v vVar, boolean z11, i iVar, l<? super Boolean, w> lVar) {
        l a10;
        q.i(eVar, "$this$toggleable");
        q.i(mVar, "interactionSource");
        q.i(lVar, "onValueChange");
        if (k1.c()) {
            a10 = new b(z10, mVar, vVar, z11, iVar, lVar);
        } else {
            a10 = k1.a();
        }
        return k1.b(eVar, a10, b(e.f2335a, u1.b.a(z10), mVar, vVar, z11, iVar, new C0000a(lVar, z10)));
    }

    public static final e b(e eVar, u1.a aVar, m mVar, v vVar, boolean z10, i iVar, pc.a<w> aVar2) {
        l<m1, w> a10;
        q.i(eVar, "$this$triStateToggleable");
        q.i(aVar, "state");
        q.i(mVar, "interactionSource");
        q.i(aVar2, "onClick");
        if (k1.c()) {
            a10 = new d(aVar, z10, iVar, mVar, vVar, aVar2);
        } else {
            a10 = k1.a();
        }
        return k1.b(eVar, a10, o.c(androidx.compose.foundation.e.c(e.f2335a, mVar, vVar, z10, null, iVar, aVar2, 8, null), false, new c(aVar), 1, null));
    }
}
