package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.databinding.ActivityDeathBinding;
import com.habitrpg.android.habitica.ui.views.ads.AdButton;

/* compiled from: DeathActivity.kt */
/* loaded from: classes4.dex */
final class DeathActivity$onCreate$2 extends qc.r implements pc.l<Boolean, dc.w> {
    final /* synthetic */ DeathActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeathActivity$onCreate$2(DeathActivity deathActivity) {
        super(1);
        this.this$0 = deathActivity;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return dc.w.f13270a;
    }

    public final void invoke(boolean z10) {
        ActivityDeathBinding activityDeathBinding;
        ActivityDeathBinding activityDeathBinding2;
        ActivityDeathBinding activityDeathBinding3;
        ActivityDeathBinding activityDeathBinding4 = null;
        if (z10) {
            activityDeathBinding2 = this.this$0.binding;
            if (activityDeathBinding2 == null) {
                qc.q.z("binding");
                activityDeathBinding2 = null;
            }
            if (activityDeathBinding2.adButton.getState() == AdButton.State.LOADING) {
                activityDeathBinding3 = this.this$0.binding;
                if (activityDeathBinding3 == null) {
                    qc.q.z("binding");
                } else {
                    activityDeathBinding4 = activityDeathBinding3;
                }
                activityDeathBinding4.adButton.setState(AdButton.State.READY);
                return;
            }
        }
        if (z10) {
            return;
        }
        activityDeathBinding = this.this$0.binding;
        if (activityDeathBinding == null) {
            qc.q.z("binding");
        } else {
            activityDeathBinding4 = activityDeathBinding;
        }
        activityDeathBinding4.adButton.setVisibility(4);
    }
}
