package d6;

import a1.p1;
import a1.r1;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.ui.platform.j0;
import j0.n;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: SystemUiController.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final long f13126a = r1.e(0.0f, 0.0f, 0.0f, 0.3f, null, 16, null);

    /* renamed from: b  reason: collision with root package name */
    private static final l<p1, p1> f13127b = a.f13128f;

    /* compiled from: SystemUiController.kt */
    /* loaded from: classes.dex */
    static final class a extends r implements l<p1, p1> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f13128f = new a();

        a() {
            super(1);
        }

        public final long a(long j10) {
            return r1.g(e.f13126a, j10);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ p1 invoke(p1 p1Var) {
            return p1.g(a(p1Var.y()));
        }
    }

    private static final Window c(Context context) {
        while (!(context instanceof Activity)) {
            if (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
                q.h(context, "baseContext");
            } else {
                return null;
            }
        }
        return ((Activity) context).getWindow();
    }

    private static final Window d(j0.l lVar, int i10) {
        androidx.compose.ui.window.d dVar;
        lVar.e(1009281237);
        if (n.K()) {
            n.V(1009281237, i10, -1, "com.google.accompanist.systemuicontroller.findWindow (SystemUiController.kt:191)");
        }
        ViewParent parent = ((View) lVar.C(j0.k())).getParent();
        Window window = null;
        if (parent instanceof androidx.compose.ui.window.d) {
            dVar = (androidx.compose.ui.window.d) parent;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            window = dVar.getWindow();
        }
        if (window == null) {
            Context context = ((View) lVar.C(j0.k())).getContext();
            q.h(context, "LocalView.current.context");
            window = c(context);
        }
        if (n.K()) {
            n.U();
        }
        lVar.N();
        return window;
    }

    public static final d e(Window window, j0.l lVar, int i10, int i11) {
        lVar.e(-715745933);
        if ((i11 & 1) != 0) {
            window = d(lVar, 0);
        }
        if (n.K()) {
            n.V(-715745933, i10, -1, "com.google.accompanist.systemuicontroller.rememberSystemUiController (SystemUiController.kt:183)");
        }
        View view = (View) lVar.C(j0.k());
        lVar.e(511388516);
        boolean Q = lVar.Q(view) | lVar.Q(window);
        Object f10 = lVar.f();
        if (Q || f10 == j0.l.f18688a.a()) {
            f10 = new b(view, window);
            lVar.J(f10);
        }
        lVar.N();
        b bVar = (b) f10;
        if (n.K()) {
            n.U();
        }
        lVar.N();
        return bVar;
    }
}
