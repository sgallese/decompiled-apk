package com.habitrpg.android.habitica.ui.fragments.setup;

import dc.w;
import dd.x;
import qc.r;

/* compiled from: WelcomeFragment.kt */
/* loaded from: classes4.dex */
final class WelcomeFragment$onViewCreated$1 extends r implements pc.r<CharSequence, Integer, Integer, Integer, w> {
    final /* synthetic */ WelcomeFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeFragment$onViewCreated$1(WelcomeFragment welcomeFragment) {
        super(4);
        this.this$0 = welcomeFragment;
    }

    @Override // pc.r
    public /* bridge */ /* synthetic */ w invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
        invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
        return w.f13270a;
    }

    public final void invoke(CharSequence charSequence, int i10, int i11, int i12) {
        x xVar;
        xVar = this.this$0.displayNameVerificationEvents;
        xVar.setValue(String.valueOf(charSequence));
    }
}
