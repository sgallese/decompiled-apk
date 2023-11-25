package androidx.compose.ui.platform;

import android.view.RenderNode;

/* compiled from: RenderNodeApi23.android.kt */
/* loaded from: classes.dex */
final class s3 {

    /* renamed from: a  reason: collision with root package name */
    public static final s3 f2822a = new s3();

    private s3() {
    }

    public final int a(RenderNode renderNode) {
        qc.q.i(renderNode, "renderNode");
        return renderNode.getAmbientShadowColor();
    }

    public final int b(RenderNode renderNode) {
        qc.q.i(renderNode, "renderNode");
        return renderNode.getSpotShadowColor();
    }

    public final void c(RenderNode renderNode, int i10) {
        qc.q.i(renderNode, "renderNode");
        renderNode.setAmbientShadowColor(i10);
    }

    public final void d(RenderNode renderNode, int i10) {
        qc.q.i(renderNode, "renderNode");
        renderNode.setSpotShadowColor(i10);
    }
}
