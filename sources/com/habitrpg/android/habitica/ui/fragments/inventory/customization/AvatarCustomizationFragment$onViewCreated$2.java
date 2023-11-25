package com.habitrpg.android.habitica.ui.fragments.inventory.customization;

import com.habitrpg.android.habitica.models.user.User;
import dc.w;
import qc.r;

/* compiled from: AvatarCustomizationFragment.kt */
/* loaded from: classes4.dex */
final class AvatarCustomizationFragment$onViewCreated$2 extends r implements pc.l<User, w> {
    final /* synthetic */ AvatarCustomizationFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarCustomizationFragment$onViewCreated$2(AvatarCustomizationFragment avatarCustomizationFragment) {
        super(1);
        this.this$0 = avatarCustomizationFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(User user) {
        invoke2(user);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(User user) {
        this.this$0.updateUser(user);
    }
}
