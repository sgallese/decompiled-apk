package com.habitrpg.android.habitica.ui.fragments.preferences;

import com.habitrpg.android.habitica.models.user.User;
import dc.w;
import qc.r;

/* compiled from: BasePreferencesFragment.kt */
/* loaded from: classes4.dex */
final class BasePreferencesFragment$onCreateView$1 extends r implements pc.l<User, w> {
    final /* synthetic */ BasePreferencesFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePreferencesFragment$onCreateView$1(BasePreferencesFragment basePreferencesFragment) {
        super(1);
        this.this$0 = basePreferencesFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(User user) {
        invoke2(user);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(User user) {
        this.this$0.setUser(user);
    }
}
