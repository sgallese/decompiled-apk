package com.habitrpg.android.habitica.ui.views;

import android.content.Context;
import com.habitrpg.common.habitica.views.AvatarView;
import qc.q;
import qc.r;

/* compiled from: ComposableAvatarView.kt */
/* loaded from: classes4.dex */
final class ComposableAvatarViewKt$ComposableAvatarView$1 extends r implements pc.l<Context, AvatarView> {
    public static final ComposableAvatarViewKt$ComposableAvatarView$1 INSTANCE = new ComposableAvatarViewKt$ComposableAvatarView$1();

    ComposableAvatarViewKt$ComposableAvatarView$1() {
        super(1);
    }

    @Override // pc.l
    public final AvatarView invoke(Context context) {
        q.i(context, "context");
        return new AvatarView(context);
    }
}
