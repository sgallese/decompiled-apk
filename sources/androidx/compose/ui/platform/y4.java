package androidx.compose.ui.platform;

import android.view.ViewParent;

/* compiled from: RenderNodeLayer.android.kt */
/* loaded from: classes.dex */
public final class y4 {

    /* renamed from: a  reason: collision with root package name */
    public static final y4 f2967a = new y4();

    private y4() {
    }

    public final void a(AndroidComposeView androidComposeView) {
        qc.q.i(androidComposeView, "ownerView");
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }
}
