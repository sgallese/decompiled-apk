package p1;

import a2.k;
import a2.l;
import androidx.compose.ui.platform.g4;
import androidx.compose.ui.platform.t4;
import androidx.compose.ui.platform.w3;

/* compiled from: Owner.kt */
/* loaded from: classes.dex */
public interface i1 {

    /* renamed from: n  reason: collision with root package name */
    public static final a f20809n = a.f20810a;

    /* compiled from: Owner.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f20810a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static boolean f20811b;

        private a() {
        }

        public final boolean a() {
            return f20811b;
        }
    }

    /* compiled from: Owner.kt */
    /* loaded from: classes.dex */
    public interface b {
        void c();
    }

    void a(boolean z10);

    void b(j0 j0Var, boolean z10);

    long e(long j10);

    long f(long j10);

    void g(j0 j0Var, boolean z10, boolean z11);

    androidx.compose.ui.platform.i getAccessibilityManager();

    w0.i getAutofill();

    w0.d0 getAutofillTree();

    androidx.compose.ui.platform.x0 getClipboardManager();

    hc.f getCoroutineContext();

    j2.e getDensity();

    y0.j getFocusOwner();

    l.b getFontFamilyResolver();

    k.a getFontLoader();

    g1.a getHapticFeedBack();

    h1.b getInputModeManager();

    j2.r getLayoutDirection();

    o1.f getModifierLocalManager();

    b2.c0 getPlatformTextInputPluginRegistry();

    k1.z getPointerIconService();

    l0 getSharedDrawScope();

    boolean getShowLayoutBounds();

    k1 getSnapshotObserver();

    b2.l0 getTextInputService();

    w3 getTextToolbar();

    g4 getViewConfiguration();

    t4 getWindowInfo();

    void h(j0 j0Var);

    void i(j0 j0Var);

    void j(j0 j0Var, long j10);

    void k(j0 j0Var);

    void m(j0 j0Var, boolean z10, boolean z11, boolean z12);

    void n(b bVar);

    void o();

    void q();

    void r(j0 j0Var);

    boolean requestFocus();

    void setShowLayoutBounds(boolean z10);

    void t(pc.a<dc.w> aVar);

    g1 u(pc.l<? super a1.h1, dc.w> lVar, pc.a<dc.w> aVar);
}
