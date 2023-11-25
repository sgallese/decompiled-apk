package androidx.compose.ui.platform;

import android.view.View;

/* compiled from: AndroidComposeView.android.kt */
/* loaded from: classes.dex */
final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final h0 f2685a = new h0();

    private h0() {
    }

    public final void a(View view, int i10, boolean z10) {
        qc.q.i(view, "view");
        view.setFocusable(i10);
        view.setDefaultFocusHighlightEnabled(z10);
    }
}
