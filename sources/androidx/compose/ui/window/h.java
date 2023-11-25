package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import ec.t;
import java.util.List;
import qc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidPopup.android.kt */
/* loaded from: classes.dex */
public final class h extends i {
    @Override // androidx.compose.ui.window.i, androidx.compose.ui.window.f
    public void b(View view, int i10, int i11) {
        List n10;
        q.i(view, "composeView");
        n10 = t.n(new Rect(0, 0, i10, i11));
        view.setSystemGestureExclusionRects(n10);
    }
}
