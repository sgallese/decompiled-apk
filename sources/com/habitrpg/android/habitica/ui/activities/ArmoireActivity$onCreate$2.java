package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.databinding.ActivityArmoireBinding;
import com.habitrpg.android.habitica.ui.views.ads.AdButton;

/* compiled from: ArmoireActivity.kt */
/* loaded from: classes4.dex */
final class ArmoireActivity$onCreate$2 extends qc.r implements pc.l<Boolean, dc.w> {
    final /* synthetic */ ArmoireActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArmoireActivity$onCreate$2(ArmoireActivity armoireActivity) {
        super(1);
        this.this$0 = armoireActivity;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return dc.w.f13270a;
    }

    public final void invoke(boolean z10) {
        ActivityArmoireBinding activityArmoireBinding;
        ActivityArmoireBinding activityArmoireBinding2;
        ActivityArmoireBinding activityArmoireBinding3;
        ActivityArmoireBinding activityArmoireBinding4 = null;
        if (z10) {
            activityArmoireBinding2 = this.this$0.binding;
            if (activityArmoireBinding2 == null) {
                qc.q.z("binding");
                activityArmoireBinding2 = null;
            }
            if (activityArmoireBinding2.adButton.getState() == AdButton.State.LOADING) {
                activityArmoireBinding3 = this.this$0.binding;
                if (activityArmoireBinding3 == null) {
                    qc.q.z("binding");
                } else {
                    activityArmoireBinding4 = activityArmoireBinding3;
                }
                activityArmoireBinding4.adButton.setState(AdButton.State.READY);
                return;
            }
        }
        if (z10) {
            return;
        }
        activityArmoireBinding = this.this$0.binding;
        if (activityArmoireBinding == null) {
            qc.q.z("binding");
        } else {
            activityArmoireBinding4 = activityArmoireBinding;
        }
        activityArmoireBinding4.adButton.setVisibility(4);
    }
}
