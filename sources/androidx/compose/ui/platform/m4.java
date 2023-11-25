package androidx.compose.ui.platform;

import android.view.View;

/* compiled from: ViewLayer.android.kt */
/* loaded from: classes.dex */
final class m4 {

    /* renamed from: a  reason: collision with root package name */
    public static final m4 f2771a = new m4();

    private m4() {
    }

    public final void a(View view, int i10) {
        qc.q.i(view, "view");
        view.setOutlineAmbientShadowColor(i10);
    }

    public final void b(View view, int i10) {
        qc.q.i(view, "view");
        view.setOutlineSpotShadowColor(i10);
    }
}
