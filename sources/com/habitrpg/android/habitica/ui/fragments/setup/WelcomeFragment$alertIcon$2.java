package com.habitrpg.android.habitica.ui.fragments.setup;

import android.graphics.drawable.BitmapDrawable;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import qc.r;

/* compiled from: WelcomeFragment.kt */
/* loaded from: classes4.dex */
final class WelcomeFragment$alertIcon$2 extends r implements pc.a<BitmapDrawable> {
    final /* synthetic */ WelcomeFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeFragment$alertIcon$2(WelcomeFragment welcomeFragment) {
        super(0);
        this.this$0 = welcomeFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // pc.a
    public final BitmapDrawable invoke() {
        return new BitmapDrawable(this.this$0.getResources(), HabiticaIconsHelper.imageOfAlertIcon());
    }
}
