package androidx.compose.ui.platform;

import android.view.RenderNode;

/* compiled from: RenderNodeApi23.android.kt */
/* loaded from: classes.dex */
final class r3 {

    /* renamed from: a  reason: collision with root package name */
    public static final r3 f2815a = new r3();

    private r3() {
    }

    public final void a(RenderNode renderNode) {
        qc.q.i(renderNode, "renderNode");
        renderNode.discardDisplayList();
    }
}
