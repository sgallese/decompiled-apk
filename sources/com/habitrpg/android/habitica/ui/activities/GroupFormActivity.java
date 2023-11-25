package com.habitrpg.android.habitica.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.ActivityGroupFormBinding;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.android.habitica.ui.helpers.AutocompleteAdapter;
import com.habitrpg.android.habitica.ui.helpers.KeyboardUtilKt;
import com.habitrpg.common.habitica.helpers.MarkdownParser;

/* compiled from: GroupFormActivity.kt */
/* loaded from: classes4.dex */
public final class GroupFormActivity extends Hilt_GroupFormActivity {
    public static final int GROUP_FORM_ACTIVITY = 11;
    private AutocompleteAdapter autocompleteAdapter;
    private ActivityGroupFormBinding binding;
    private String groupDescription;
    private String groupID;
    private String groupLeader;
    private String groupName;
    private String groupPrivacy;
    private String groupType;
    private boolean leaderCreateChallenge;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: GroupFormActivity.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(qc.h hVar) {
            this();
        }
    }

    private final void fillForm() {
        ActivityGroupFormBinding activityGroupFormBinding = this.binding;
        ActivityGroupFormBinding activityGroupFormBinding2 = null;
        if (activityGroupFormBinding == null) {
            qc.q.z("binding");
            activityGroupFormBinding = null;
        }
        activityGroupFormBinding.groupNameEditText.setText(this.groupName);
        ActivityGroupFormBinding activityGroupFormBinding3 = this.binding;
        if (activityGroupFormBinding3 == null) {
            qc.q.z("binding");
            activityGroupFormBinding3 = null;
        }
        activityGroupFormBinding3.groupDescriptionEditText.setText(this.groupDescription);
        ActivityGroupFormBinding activityGroupFormBinding4 = this.binding;
        if (activityGroupFormBinding4 == null) {
            qc.q.z("binding");
            activityGroupFormBinding4 = null;
        }
        activityGroupFormBinding4.leaderCreateChallengeSwitch.setChecked(this.leaderCreateChallenge);
        ActivityGroupFormBinding activityGroupFormBinding5 = this.binding;
        if (activityGroupFormBinding5 == null) {
            qc.q.z("binding");
            activityGroupFormBinding5 = null;
        }
        activityGroupFormBinding5.privacyWrapper.setVisibility(8);
        ActivityGroupFormBinding activityGroupFormBinding6 = this.binding;
        if (activityGroupFormBinding6 == null) {
            qc.q.z("binding");
        } else {
            activityGroupFormBinding2 = activityGroupFormBinding6;
        }
        activityGroupFormBinding2.saveButton.setText(getString(R.string.save));
    }

    private final void finishActivitySuccessfuly() {
        boolean z10;
        ActivityGroupFormBinding activityGroupFormBinding = this.binding;
        ActivityGroupFormBinding activityGroupFormBinding2 = null;
        if (activityGroupFormBinding == null) {
            qc.q.z("binding");
            activityGroupFormBinding = null;
        }
        String valueOf = String.valueOf(activityGroupFormBinding.groupNameEditText.getText());
        if (valueOf.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, valueOf);
        bundle.putString("groupType", this.groupType);
        MarkdownParser markdownParser = MarkdownParser.INSTANCE;
        ActivityGroupFormBinding activityGroupFormBinding3 = this.binding;
        if (activityGroupFormBinding3 == null) {
            qc.q.z("binding");
            activityGroupFormBinding3 = null;
        }
        bundle.putString("description", markdownParser.parseCompiled(String.valueOf(activityGroupFormBinding3.groupDescriptionEditText.getText())));
        ActivityGroupFormBinding activityGroupFormBinding4 = this.binding;
        if (activityGroupFormBinding4 == null) {
            qc.q.z("binding");
        } else {
            activityGroupFormBinding2 = activityGroupFormBinding4;
        }
        bundle.putBoolean("leaderOnlyChallenges", activityGroupFormBinding2.leaderCreateChallengeSwitch.isChecked());
        bundle.putString("leader", this.groupLeader);
        intent.putExtras(bundle);
        setResult(-1, intent);
        finish();
        KeyboardUtilKt.dismissKeyboard(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(GroupFormActivity groupFormActivity, View view) {
        qc.q.i(groupFormActivity, "this$0");
        groupFormActivity.finish();
        KeyboardUtilKt.dismissKeyboard(groupFormActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(GroupFormActivity groupFormActivity, View view) {
        qc.q.i(groupFormActivity, "this$0");
        groupFormActivity.finishActivitySuccessfuly();
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    public View getContentView(Integer num) {
        ActivityGroupFormBinding inflate = ActivityGroupFormBinding.inflate(getLayoutInflater());
        qc.q.h(inflate, "inflate(...)");
        this.binding = inflate;
        if (inflate == null) {
            qc.q.z("binding");
            inflate = null;
        }
        FrameLayout root = inflate.getRoot();
        qc.q.h(root, "getRoot(...)");
        return root;
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    protected Integer getLayoutResId() {
        return Integer.valueOf((int) R.layout.activity_group_form);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
        KeyboardUtilKt.dismissKeyboard(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.fragment.app.q, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.groupID = extras.getString("groupID");
            this.groupType = extras.getString("groupType");
            this.groupName = extras.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
            this.groupDescription = extras.getString("description");
            this.groupPrivacy = extras.getString("privacy");
            this.groupLeader = extras.getString("leader");
            this.leaderCreateChallenge = extras.getBoolean("leaderCreateChallenge", false);
        }
        ActivityGroupFormBinding activityGroupFormBinding = null;
        if (qc.q.d(this.groupType, NavigationDrawerFragment.SIDEBAR_PARTY)) {
            ActivityGroupFormBinding activityGroupFormBinding2 = this.binding;
            if (activityGroupFormBinding2 == null) {
                qc.q.z("binding");
                activityGroupFormBinding2 = null;
            }
            activityGroupFormBinding2.privacyWrapper.setVisibility(8);
            ActivityGroupFormBinding activityGroupFormBinding3 = this.binding;
            if (activityGroupFormBinding3 == null) {
                qc.q.z("binding");
                activityGroupFormBinding3 = null;
            }
            activityGroupFormBinding3.privacySeparator.setVisibility(8);
        }
        if (this.groupID != null) {
            fillForm();
        }
        ActivityGroupFormBinding activityGroupFormBinding4 = this.binding;
        if (activityGroupFormBinding4 == null) {
            qc.q.z("binding");
            activityGroupFormBinding4 = null;
        }
        activityGroupFormBinding4.cancelButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupFormActivity.onCreate$lambda$1(GroupFormActivity.this, view);
            }
        });
        ActivityGroupFormBinding activityGroupFormBinding5 = this.binding;
        if (activityGroupFormBinding5 == null) {
            qc.q.z("binding");
        } else {
            activityGroupFormBinding = activityGroupFormBinding5;
        }
        activityGroupFormBinding.saveButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupFormActivity.onCreate$lambda$2(GroupFormActivity.this, view);
            }
        });
    }

    @Override // androidx.appcompat.app.d
    public boolean onSupportNavigateUp() {
        finish();
        KeyboardUtilKt.dismissKeyboard(this);
        return true;
    }
}
