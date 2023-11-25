package com.habitrpg.android.habitica.ui.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: ActivityNavArgsLazy.kt */
/* loaded from: classes4.dex */
public final class ClassSelectionActivity$onCreate$$inlined$navArgs$1 extends qc.r implements pc.a<Bundle> {
    final /* synthetic */ Activity $this_navArgs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassSelectionActivity$onCreate$$inlined$navArgs$1(Activity activity) {
        super(0);
        this.$this_navArgs = activity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // pc.a
    public final Bundle invoke() {
        Bundle bundle;
        Intent intent = this.$this_navArgs.getIntent();
        if (intent != null) {
            Activity activity = this.$this_navArgs;
            bundle = intent.getExtras();
            if (bundle == null) {
                throw new IllegalStateException("Activity " + activity + " has null extras in " + intent);
            }
        } else {
            bundle = null;
        }
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException("Activity " + this.$this_navArgs + " has a null Intent");
    }
}
