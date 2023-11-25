package androidx.compose.ui.platform;

import android.view.PointerIcon;
import android.view.View;

/* compiled from: AndroidComposeView.android.kt */
/* loaded from: classes.dex */
final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final e0 f2655a = new e0();

    private e0() {
    }

    public final void a(View view, k1.w wVar) {
        PointerIcon systemIcon;
        PointerIcon pointerIcon;
        qc.q.i(view, "view");
        if (wVar instanceof k1.b) {
            systemIcon = ((k1.b) wVar).a();
        } else if (wVar instanceof k1.c) {
            systemIcon = PointerIcon.getSystemIcon(view.getContext(), ((k1.c) wVar).a());
            qc.q.h(systemIcon, "getSystemIcon(view.context, icon.type)");
        } else {
            systemIcon = PointerIcon.getSystemIcon(view.getContext(), 1000);
            qc.q.h(systemIcon, "getSystemIcon(\n         …DEFAULT\n                )");
        }
        pointerIcon = view.getPointerIcon();
        if (!qc.q.d(pointerIcon, systemIcon)) {
            view.setPointerIcon(systemIcon);
        }
    }
}
