package com.habitrpg.android.habitica.ui.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.databinding.ActivitySkillMembersBinding;
import com.habitrpg.android.habitica.ui.adapter.social.PartyMemberRecyclerViewAdapter;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;

/* compiled from: SkillMemberActivity.kt */
/* loaded from: classes4.dex */
public final class SkillMemberActivity extends Hilt_SkillMemberActivity {
    public static final int $stable = 8;
    private ActivitySkillMembersBinding binding;
    public SocialRepository socialRepository;
    public MainUserViewModel userViewModel;
    private PartyMemberRecyclerViewAdapter viewAdapter;

    private final void loadMemberList() {
        ActivitySkillMembersBinding activitySkillMembersBinding = this.binding;
        if (activitySkillMembersBinding == null) {
            qc.q.z("binding");
            activitySkillMembersBinding = null;
        }
        activitySkillMembersBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        PartyMemberRecyclerViewAdapter partyMemberRecyclerViewAdapter = new PartyMemberRecyclerViewAdapter();
        this.viewAdapter = partyMemberRecyclerViewAdapter;
        partyMemberRecyclerViewAdapter.setOnUserClicked(new SkillMemberActivity$loadMemberList$1(this));
        ActivitySkillMembersBinding activitySkillMembersBinding2 = this.binding;
        if (activitySkillMembersBinding2 == null) {
            qc.q.z("binding");
            activitySkillMembersBinding2 = null;
        }
        activitySkillMembersBinding2.recyclerView.setAdapter(this.viewAdapter);
        ad.i.d(androidx.lifecycle.w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new SkillMemberActivity$loadMemberList$2(this, null), 2, null);
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    public View getContentView(Integer num) {
        ActivitySkillMembersBinding inflate = ActivitySkillMembersBinding.inflate(getLayoutInflater());
        qc.q.h(inflate, "inflate(...)");
        this.binding = inflate;
        if (inflate == null) {
            qc.q.z("binding");
            inflate = null;
        }
        LinearLayout root = inflate.getRoot();
        qc.q.h(root, "getRoot(...)");
        return root;
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    protected Integer getLayoutResId() {
        return Integer.valueOf((int) R.layout.activity_skill_members);
    }

    public final SocialRepository getSocialRepository() {
        SocialRepository socialRepository = this.socialRepository;
        if (socialRepository != null) {
            return socialRepository;
        }
        qc.q.z("socialRepository");
        return null;
    }

    public final MainUserViewModel getUserViewModel() {
        MainUserViewModel mainUserViewModel = this.userViewModel;
        if (mainUserViewModel != null) {
            return mainUserViewModel;
        }
        qc.q.z("userViewModel");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.fragment.app.q, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setupToolbar((Toolbar) findViewById(R.id.toolbar));
        loadMemberList();
    }

    public final void setSocialRepository(SocialRepository socialRepository) {
        qc.q.i(socialRepository, "<set-?>");
        this.socialRepository = socialRepository;
    }

    public final void setUserViewModel(MainUserViewModel mainUserViewModel) {
        qc.q.i(mainUserViewModel, "<set-?>");
        this.userViewModel = mainUserViewModel;
    }
}
