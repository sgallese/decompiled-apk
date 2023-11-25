package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.databinding.ActivityArmoireBinding;
import com.habitrpg.android.habitica.models.user.User;

/* compiled from: ArmoireActivity.kt */
/* loaded from: classes4.dex */
final class ArmoireActivity$onCreate$4 extends qc.r implements pc.l<User, dc.w> {
    final /* synthetic */ ArmoireActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArmoireActivity$onCreate$4(ArmoireActivity armoireActivity) {
        super(1);
        this.this$0 = armoireActivity;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(User user) {
        invoke2(user);
        return dc.w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(User user) {
        ActivityArmoireBinding activityArmoireBinding;
        ActivityArmoireBinding activityArmoireBinding2;
        ActivityArmoireBinding activityArmoireBinding3;
        ActivityArmoireBinding activityArmoireBinding4;
        ActivityArmoireBinding activityArmoireBinding5;
        ActivityArmoireBinding activityArmoireBinding6;
        ActivityArmoireBinding activityArmoireBinding7;
        ActivityArmoireBinding activityArmoireBinding8 = null;
        if (user != null && user.isSubscribed()) {
            activityArmoireBinding4 = this.this$0.binding;
            if (activityArmoireBinding4 == null) {
                qc.q.z("binding");
                activityArmoireBinding4 = null;
            }
            if (activityArmoireBinding4.openArmoireSubscriberWrapper.getVisibility() != 4) {
                activityArmoireBinding5 = this.this$0.binding;
                if (activityArmoireBinding5 == null) {
                    qc.q.z("binding");
                    activityArmoireBinding5 = null;
                }
                activityArmoireBinding5.openArmoireSubscriberWrapper.setVisibility(0);
                activityArmoireBinding6 = this.this$0.binding;
                if (activityArmoireBinding6 == null) {
                    qc.q.z("binding");
                    activityArmoireBinding6 = null;
                }
                activityArmoireBinding6.unsubbedWrapper.setVisibility(8);
                activityArmoireBinding7 = this.this$0.binding;
                if (activityArmoireBinding7 == null) {
                    qc.q.z("binding");
                } else {
                    activityArmoireBinding8 = activityArmoireBinding7;
                }
                activityArmoireBinding8.dropRateButton.setVisibility(0);
                return;
            }
        }
        if ((user == null || user.isSubscribed()) ? false : true) {
            activityArmoireBinding = this.this$0.binding;
            if (activityArmoireBinding == null) {
                qc.q.z("binding");
                activityArmoireBinding = null;
            }
            activityArmoireBinding.openArmoireSubscriberWrapper.setVisibility(8);
            activityArmoireBinding2 = this.this$0.binding;
            if (activityArmoireBinding2 == null) {
                qc.q.z("binding");
                activityArmoireBinding2 = null;
            }
            activityArmoireBinding2.unsubbedWrapper.setVisibility(0);
            activityArmoireBinding3 = this.this$0.binding;
            if (activityArmoireBinding3 == null) {
                qc.q.z("binding");
            } else {
                activityArmoireBinding8 = activityArmoireBinding3;
            }
            activityArmoireBinding8.dropRateButton.setVisibility(8);
        }
    }
}
