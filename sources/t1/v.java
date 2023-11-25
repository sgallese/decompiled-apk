package t1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import qc.g0;
import v1.i0;

/* compiled from: SemanticsProperties.kt */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ wc.h<Object>[] f23517a = {g0.d(new qc.t(v.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), g0.d(new qc.t(v.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1)), g0.d(new qc.t(v.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), g0.d(new qc.t(v.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), g0.d(new qc.t(v.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), g0.d(new qc.t(v.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), g0.d(new qc.t(v.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), g0.d(new qc.t(v.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1)), g0.d(new qc.t(v.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), g0.d(new qc.t(v.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), g0.d(new qc.t(v.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), g0.d(new qc.t(v.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), g0.d(new qc.t(v.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), g0.d(new qc.t(v.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1)), g0.d(new qc.t(v.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), g0.d(new qc.t(v.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), g0.d(new qc.t(v.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1)), g0.d(new qc.t(v.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1)), g0.d(new qc.t(v.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1)), g0.d(new qc.t(v.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1))};

    static {
        s sVar = s.f23478a;
        sVar.v();
        sVar.r();
        sVar.p();
        sVar.o();
        sVar.g();
        sVar.n();
        sVar.n();
        sVar.A();
        sVar.i();
        sVar.B();
        sVar.s();
        sVar.w();
        sVar.e();
        sVar.y();
        sVar.j();
        sVar.u();
        sVar.a();
        sVar.b();
        sVar.z();
        k.f23437a.c();
    }

    public static final void A(x xVar) {
        qc.q.i(xVar, "<this>");
        xVar.a(s.f23478a.m(), dc.w.f13270a);
    }

    public static final void B(x xVar, String str, pc.a<Boolean> aVar) {
        qc.q.i(xVar, "<this>");
        xVar.a(k.f23437a.q(), new a(str, aVar));
    }

    public static /* synthetic */ void C(x xVar, String str, pc.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        B(xVar, str, aVar);
    }

    public static final void D(x xVar, String str, pc.p<? super Float, ? super Float, Boolean> pVar) {
        qc.q.i(xVar, "<this>");
        xVar.a(k.f23437a.r(), new a(str, pVar));
    }

    public static /* synthetic */ void E(x xVar, String str, pc.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        D(xVar, str, pVar);
    }

    public static final void F(x xVar, String str, pc.l<? super Integer, Boolean> lVar) {
        qc.q.i(xVar, "<this>");
        qc.q.i(lVar, "action");
        xVar.a(k.f23437a.s(), new a(str, lVar));
    }

    public static /* synthetic */ void G(x xVar, String str, pc.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        F(xVar, str, lVar);
    }

    public static final void H(x xVar, b bVar) {
        qc.q.i(xVar, "<this>");
        qc.q.i(bVar, "<set-?>");
        s.f23478a.a().c(xVar, f23517a[16], bVar);
    }

    public static final void I(x xVar, boolean z10) {
        qc.q.i(xVar, "<this>");
        s.f23478a.n().c(xVar, f23517a[5], Boolean.valueOf(z10));
    }

    public static final void J(x xVar, String str) {
        List d10;
        qc.q.i(xVar, "<this>");
        qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        w<List<String>> c10 = s.f23478a.c();
        d10 = ec.s.d(str);
        xVar.a(c10, d10);
    }

    public static final void K(x xVar, v1.d dVar) {
        qc.q.i(xVar, "<this>");
        qc.q.i(dVar, "<set-?>");
        s.f23478a.e().c(xVar, f23517a[12], dVar);
    }

    public static final void L(x xVar, boolean z10) {
        qc.q.i(xVar, "<this>");
        s.f23478a.g().c(xVar, f23517a[4], Boolean.valueOf(z10));
    }

    public static final void M(x xVar, j jVar) {
        qc.q.i(xVar, "<this>");
        qc.q.i(jVar, "<set-?>");
        s.f23478a.i().c(xVar, f23517a[8], jVar);
    }

    public static final void N(x xVar, int i10) {
        qc.q.i(xVar, "$this$imeAction");
        s.f23478a.j().c(xVar, f23517a[14], b2.o.i(i10));
    }

    public static final void O(x xVar, int i10) {
        qc.q.i(xVar, "$this$liveRegion");
        s.f23478a.o().c(xVar, f23517a[3], g.c(i10));
    }

    public static final void P(x xVar, String str) {
        qc.q.i(xVar, "<this>");
        qc.q.i(str, "<set-?>");
        s.f23478a.p().c(xVar, f23517a[2], str);
    }

    public static final void Q(x xVar, h hVar) {
        qc.q.i(xVar, "<this>");
        qc.q.i(hVar, "<set-?>");
        s.f23478a.r().c(xVar, f23517a[1], hVar);
    }

    public static final void R(x xVar, int i10) {
        qc.q.i(xVar, "$this$role");
        s.f23478a.s().c(xVar, f23517a[10], i.h(i10));
    }

    public static final void S(x xVar, String str, pc.q<? super Integer, ? super Integer, ? super Boolean, Boolean> qVar) {
        qc.q.i(xVar, "<this>");
        xVar.a(k.f23437a.u(), new a(str, qVar));
    }

    public static /* synthetic */ void T(x xVar, String str, pc.q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        S(xVar, str, qVar);
    }

    public static final void U(x xVar, String str, pc.l<? super v1.d, Boolean> lVar) {
        qc.q.i(xVar, "<this>");
        xVar.a(k.f23437a.v(), new a(str, lVar));
    }

    public static final void V(x xVar, v1.d dVar) {
        List d10;
        qc.q.i(xVar, "<this>");
        qc.q.i(dVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        w<List<v1.d>> x10 = s.f23478a.x();
        d10 = ec.s.d(dVar);
        xVar.a(x10, d10);
    }

    public static /* synthetic */ void W(x xVar, String str, pc.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        U(xVar, str, lVar);
    }

    public static final void X(x xVar, long j10) {
        qc.q.i(xVar, "$this$textSelectionRange");
        s.f23478a.y().c(xVar, f23517a[13], i0.b(j10));
    }

    public static final void Y(x xVar, u1.a aVar) {
        qc.q.i(xVar, "<this>");
        qc.q.i(aVar, "<set-?>");
        s.f23478a.z().c(xVar, f23517a[18], aVar);
    }

    public static final void Z(x xVar, boolean z10) {
        qc.q.i(xVar, "<this>");
        s.f23478a.n().c(xVar, f23517a[6], Boolean.valueOf(z10));
    }

    public static final void a(x xVar, String str, pc.a<Boolean> aVar) {
        qc.q.i(xVar, "<this>");
        xVar.a(k.f23437a.a(), new a(str, aVar));
    }

    public static final void a0(x xVar, j jVar) {
        qc.q.i(xVar, "<this>");
        qc.q.i(jVar, "<set-?>");
        s.f23478a.B().c(xVar, f23517a[9], jVar);
    }

    public static /* synthetic */ void b(x xVar, String str, pc.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        a(xVar, str, aVar);
    }

    public static final void c(x xVar, String str, pc.a<Boolean> aVar) {
        qc.q.i(xVar, "<this>");
        xVar.a(k.f23437a.b(), new a(str, aVar));
    }

    public static /* synthetic */ void d(x xVar, String str, pc.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        c(xVar, str, aVar);
    }

    public static final void e(x xVar, String str, pc.a<Boolean> aVar) {
        qc.q.i(xVar, "<this>");
        xVar.a(k.f23437a.d(), new a(str, aVar));
    }

    public static /* synthetic */ void f(x xVar, String str, pc.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        e(xVar, str, aVar);
    }

    public static final void g(x xVar) {
        qc.q.i(xVar, "<this>");
        xVar.a(s.f23478a.d(), dc.w.f13270a);
    }

    public static final void h(x xVar, String str, pc.a<Boolean> aVar) {
        qc.q.i(xVar, "<this>");
        xVar.a(k.f23437a.e(), new a(str, aVar));
    }

    public static /* synthetic */ void i(x xVar, String str, pc.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        h(xVar, str, aVar);
    }

    public static final void j(x xVar, String str) {
        qc.q.i(xVar, "<this>");
        qc.q.i(str, "description");
        xVar.a(s.f23478a.f(), str);
    }

    public static final void k(x xVar, String str, pc.a<Boolean> aVar) {
        qc.q.i(xVar, "<this>");
        xVar.a(k.f23437a.f(), new a(str, aVar));
    }

    public static /* synthetic */ void l(x xVar, String str, pc.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        k(xVar, str, aVar);
    }

    public static final void m(x xVar, String str, pc.l<? super List<v1.g0>, Boolean> lVar) {
        qc.q.i(xVar, "<this>");
        xVar.a(k.f23437a.g(), new a(str, lVar));
    }

    public static /* synthetic */ void n(x xVar, String str, pc.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        m(xVar, str, lVar);
    }

    public static final void o(x xVar, pc.l<Object, Integer> lVar) {
        qc.q.i(xVar, "<this>");
        qc.q.i(lVar, "mapping");
        xVar.a(s.f23478a.k(), lVar);
    }

    public static final void p(x xVar, String str, pc.l<? super v1.d, Boolean> lVar) {
        qc.q.i(xVar, "<this>");
        xVar.a(k.f23437a.h(), new a(str, lVar));
    }

    public static /* synthetic */ void q(x xVar, String str, pc.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        p(xVar, str, lVar);
    }

    public static final void r(x xVar, String str, pc.a<Boolean> aVar) {
        qc.q.i(xVar, "<this>");
        xVar.a(k.f23437a.i(), new a(str, aVar));
    }

    public static /* synthetic */ void s(x xVar, String str, pc.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        r(xVar, str, aVar);
    }

    public static final void t(x xVar, String str, pc.a<Boolean> aVar) {
        qc.q.i(xVar, "<this>");
        xVar.a(k.f23437a.j(), new a(str, aVar));
    }

    public static /* synthetic */ void u(x xVar, String str, pc.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        t(xVar, str, aVar);
    }

    public static final void v(x xVar) {
        qc.q.i(xVar, "<this>");
        xVar.a(s.f23478a.q(), dc.w.f13270a);
    }

    public static final void w(x xVar, String str, pc.a<Boolean> aVar) {
        qc.q.i(xVar, "<this>");
        xVar.a(k.f23437a.o(), new a(str, aVar));
    }

    public static /* synthetic */ void x(x xVar, String str, pc.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        w(xVar, str, aVar);
    }

    public static final void y(x xVar, String str, pc.a<Boolean> aVar) {
        qc.q.i(xVar, "<this>");
        xVar.a(k.f23437a.p(), new a(str, aVar));
    }

    public static /* synthetic */ void z(x xVar, String str, pc.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        y(xVar, str, aVar);
    }
}
