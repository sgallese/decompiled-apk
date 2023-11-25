package com.habitrpg.android.habitica.ui.views;

import com.habitrpg.shared.habitica.models.Avatar;
import j0.g2;
import j0.n;

/* compiled from: ComposableAvatarView.kt */
/* loaded from: classes4.dex */
public final class ComposableAvatarViewKt {
    public static final void ComposableAvatarView(Avatar avatar, androidx.compose.ui.e eVar, j0.l lVar, int i10, int i11) {
        j0.l q10 = lVar.q(-1910576504);
        if ((i11 & 2) != 0) {
            eVar = androidx.compose.ui.e.f2335a;
        }
        if (n.K()) {
            n.V(-1910576504, i10, -1, "com.habitrpg.android.habitica.ui.views.ComposableAvatarView (ComposableAvatarView.kt:12)");
        }
        androidx.compose.ui.viewinterop.e.a(ComposableAvatarViewKt$ComposableAvatarView$1.INSTANCE, eVar, new ComposableAvatarViewKt$ComposableAvatarView$2(avatar), q10, (i10 & 112) | 6, 0);
        if (n.K()) {
            n.U();
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new ComposableAvatarViewKt$ComposableAvatarView$3(avatar, eVar, i10, i11));
        }
    }
}
