package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.models.user.Preferences;
import com.habitrpg.android.habitica.models.user.User;

/* compiled from: ClassSelectionActivity.kt */
/* loaded from: classes4.dex */
final class ClassSelectionActivity$onCreate$1 extends qc.r implements pc.l<User, dc.w> {
    final /* synthetic */ ClassSelectionActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassSelectionActivity$onCreate$1(ClassSelectionActivity classSelectionActivity) {
        super(1);
        this.this$0 = classSelectionActivity;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(User user) {
        invoke2(user);
        return dc.w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(User user) {
        Preferences preferences;
        if (user == null || (preferences = user.getPreferences()) == null) {
            return;
        }
        ClassSelectionActivity classSelectionActivity = this.this$0;
        Preferences preferences2 = (Preferences) classSelectionActivity.getUserRepository().getUnmanagedCopy((UserRepository) preferences);
        preferences2.setCostume(false);
        classSelectionActivity.setAvatarViews(preferences2);
    }
}
