package com.habitrpg.android.habitica.ui.fragments.preferences;

import com.habitrpg.android.habitica.R;
import dc.w;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AccountPreferenceFragment.kt */
/* loaded from: classes4.dex */
public final class AccountPreferenceFragment$recoverFromPlayServicesErrorResult$1$1$1 extends r implements pc.l<Boolean, w> {
    final /* synthetic */ AccountPreferenceFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountPreferenceFragment$recoverFromPlayServicesErrorResult$1$1$1(AccountPreferenceFragment accountPreferenceFragment) {
        super(1);
        this.this$0 = accountPreferenceFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return w.f13270a;
    }

    public final void invoke(boolean z10) {
        AccountPreferenceFragment accountPreferenceFragment = this.this$0;
        String string = accountPreferenceFragment.getString(R.string.google);
        q.h(string, "getString(...)");
        accountPreferenceFragment.displayAuthenticationSuccess(string);
    }
}
