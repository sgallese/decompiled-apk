package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import qc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidPopup.android.kt */
/* loaded from: classes.dex */
public class i implements f {
    @Override // androidx.compose.ui.window.f
    public void a(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams) {
        q.i(windowManager, "windowManager");
        q.i(view, "popupView");
        q.i(layoutParams, "params");
        windowManager.updateViewLayout(view, layoutParams);
    }

    @Override // androidx.compose.ui.window.f
    public void b(View view, int i10, int i11) {
        q.i(view, "composeView");
    }

    @Override // androidx.compose.ui.window.f
    public void c(View view, Rect rect) {
        q.i(view, "composeView");
        q.i(rect, "outRect");
        view.getWindowVisibleDisplayFrame(rect);
    }
}
