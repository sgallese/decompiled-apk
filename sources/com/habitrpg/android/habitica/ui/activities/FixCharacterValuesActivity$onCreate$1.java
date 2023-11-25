package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.models.user.User;

/* compiled from: FixCharacterValuesActivity.kt */
/* loaded from: classes4.dex */
final class FixCharacterValuesActivity$onCreate$1 extends qc.r implements pc.l<User, dc.w> {
    final /* synthetic */ FixCharacterValuesActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixCharacterValuesActivity$onCreate$1(FixCharacterValuesActivity fixCharacterValuesActivity) {
        super(1);
        this.this$0 = fixCharacterValuesActivity;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(User user) {
        invoke2(user);
        return dc.w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(User user) {
        this.this$0.setUser(user);
    }
}
