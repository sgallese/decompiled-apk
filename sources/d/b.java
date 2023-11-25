package d;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.d1;
import androidx.lifecycle.e1;
import dc.w;
import j0.l;
import j0.p;
import qc.q;
import w3.e;

/* compiled from: ComponentActivity.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final ViewGroup.LayoutParams f12965a = new ViewGroup.LayoutParams(-2, -2);

    public static final void a(ComponentActivity componentActivity, p pVar, pc.p<? super l, ? super Integer, w> pVar2) {
        ComposeView composeView;
        q.i(componentActivity, "<this>");
        q.i(pVar2, "content");
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(16908290)).getChildAt(0);
        if (childAt instanceof ComposeView) {
            composeView = (ComposeView) childAt;
        } else {
            composeView = null;
        }
        if (composeView != null) {
            composeView.setParentCompositionContext(pVar);
            composeView.setContent(pVar2);
            return;
        }
        ComposeView composeView2 = new ComposeView(componentActivity, null, 0, 6, null);
        composeView2.setParentCompositionContext(pVar);
        composeView2.setContent(pVar2);
        c(componentActivity);
        componentActivity.setContentView(composeView2, f12965a);
    }

    public static /* synthetic */ void b(ComponentActivity componentActivity, p pVar, pc.p pVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pVar = null;
        }
        a(componentActivity, pVar, pVar2);
    }

    private static final void c(ComponentActivity componentActivity) {
        View decorView = componentActivity.getWindow().getDecorView();
        q.h(decorView, "window.decorView");
        if (d1.a(decorView) == null) {
            d1.b(decorView, componentActivity);
        }
        if (e1.a(decorView) == null) {
            e1.b(decorView, componentActivity);
        }
        if (e.a(decorView) == null) {
            e.b(decorView, componentActivity);
        }
    }
}
