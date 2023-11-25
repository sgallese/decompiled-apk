package androidx.compose.ui.platform;

import android.view.RenderNode;

/* compiled from: RenderNodeApi23.android.kt */
/* loaded from: classes.dex */
final class q3 {

    /* renamed from: a  reason: collision with root package name */
    public static final q3 f2810a = new q3();

    private q3() {
    }

    public final void a(RenderNode renderNode) {
        qc.q.i(renderNode, "renderNode");
        renderNode.destroyDisplayListData();
    }
}
