package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.models.user.Items;
import com.habitrpg.android.habitica.models.user.User;

/* compiled from: BirthdayActivity.kt */
/* loaded from: classes4.dex */
final class BirthdayActivity$onCreate$3 extends qc.r implements pc.l<User, dc.w> {
    final /* synthetic */ BirthdayActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirthdayActivity$onCreate$3(BirthdayActivity birthdayActivity) {
        super(1);
        this.this$0 = birthdayActivity;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(User user) {
        invoke2(user);
        return dc.w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(User user) {
        j0.j1 j1Var;
        Items items;
        j1Var = this.this$0.hasEquipped;
        j1Var.setValue(Boolean.valueOf(qc.q.d((user == null || (items = user.getItems()) == null) ? null : items.getCurrentPet(), "Gryphatrice-Jubilant")));
    }
}
