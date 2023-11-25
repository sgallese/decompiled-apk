package com.habitrpg.android.habitica.ui.views;

import com.habitrpg.common.habitica.views.AvatarView;
import com.habitrpg.shared.habitica.models.Avatar;
import dc.w;
import qc.q;
import qc.r;

/* compiled from: ComposableAvatarView.kt */
/* loaded from: classes4.dex */
final class ComposableAvatarViewKt$ComposableAvatarView$2 extends r implements pc.l<AvatarView, w> {
    final /* synthetic */ Avatar $avatar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableAvatarViewKt$ComposableAvatarView$2(Avatar avatar) {
        super(1);
        this.$avatar = avatar;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(AvatarView avatarView) {
        invoke2(avatarView);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(AvatarView avatarView) {
        q.i(avatarView, "view");
        Avatar avatar = this.$avatar;
        if (avatar != null) {
            AvatarView.setAvatar$default(avatarView, avatar, null, 2, null);
        }
    }
}
