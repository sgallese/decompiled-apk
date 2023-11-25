package com.habitrpg.android.habitica.ui.activities;

import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.ActivityAdventureGuideBinding;
import com.habitrpg.android.habitica.databinding.AdventureGuideItemBinding;
import com.habitrpg.android.habitica.helpers.Analytics;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.models.user.UserAchievement;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.common.habitica.extensions.DataBindingUtilsKt;
import com.habitrpg.common.habitica.extensions.StringExtensionsKt;
import com.habitrpg.common.habitica.views.PixelArtView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: AdventureGuideActivity.kt */
/* loaded from: classes4.dex */
public final class AdventureGuideActivity extends Hilt_AdventureGuideActivity {
    public static final int $stable = 8;
    private Map<String, String> achievementDescriptions;
    private Map<String, String> achievementTitles;
    private ActivityAdventureGuideBinding binding;
    public MainUserViewModel userViewModel;

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateUser(User user) {
        int i10;
        String str;
        List<UserAchievement> onboardingAchievements = user.getOnboardingAchievements();
        List<UserAchievement> list = onboardingAchievements;
        if ((list instanceof Collection) && list.isEmpty()) {
            i10 = 0;
        } else {
            Iterator<T> it = list.iterator();
            i10 = 0;
            while (it.hasNext()) {
                if (((UserAchievement) it.next()).getEarned() && (i10 = i10 + 1) < 0) {
                    ec.t.q();
                }
            }
        }
        ActivityAdventureGuideBinding activityAdventureGuideBinding = this.binding;
        if (activityAdventureGuideBinding == null) {
            qc.q.z("binding");
            activityAdventureGuideBinding = null;
        }
        activityAdventureGuideBinding.progressBar.setMax(onboardingAchievements.size());
        ActivityAdventureGuideBinding activityAdventureGuideBinding2 = this.binding;
        if (activityAdventureGuideBinding2 == null) {
            qc.q.z("binding");
            activityAdventureGuideBinding2 = null;
        }
        activityAdventureGuideBinding2.progressBar.setProgress(i10);
        if (Build.VERSION.SDK_INT > 22) {
            ActivityAdventureGuideBinding activityAdventureGuideBinding3 = this.binding;
            if (activityAdventureGuideBinding3 == null) {
                qc.q.z("binding");
                activityAdventureGuideBinding3 = null;
            }
            activityAdventureGuideBinding3.progressBar.setProgressBackgroundTintMode(PorterDuff.Mode.SRC_OVER);
        }
        if (i10 > 0) {
            ActivityAdventureGuideBinding activityAdventureGuideBinding4 = this.binding;
            if (activityAdventureGuideBinding4 == null) {
                qc.q.z("binding");
                activityAdventureGuideBinding4 = null;
            }
            activityAdventureGuideBinding4.progressTextview.setText(getString(R.string.percent_completed, Integer.valueOf((int) ((i10 / onboardingAchievements.size()) * 100))));
        }
        ActivityAdventureGuideBinding activityAdventureGuideBinding5 = this.binding;
        if (activityAdventureGuideBinding5 == null) {
            qc.q.z("binding");
            activityAdventureGuideBinding5 = null;
        }
        activityAdventureGuideBinding5.achievementContainer.removeAllViews();
        for (UserAchievement userAchievement : onboardingAchievements) {
            LayoutInflater layoutInflater = getLayoutInflater();
            ActivityAdventureGuideBinding activityAdventureGuideBinding6 = this.binding;
            if (activityAdventureGuideBinding6 == null) {
                qc.q.z("binding");
                activityAdventureGuideBinding6 = null;
            }
            AdventureGuideItemBinding inflate = AdventureGuideItemBinding.inflate(layoutInflater, activityAdventureGuideBinding6.achievementContainer, true);
            qc.q.h(inflate, "inflate(...)");
            TextView textView = inflate.titleView;
            Map<String, String> map = this.achievementTitles;
            if (map == null) {
                qc.q.z("achievementTitles");
                map = null;
            }
            textView.setText(map.get(userAchievement.getKey()));
            TextView textView2 = inflate.descriptionView;
            Map<String, String> map2 = this.achievementDescriptions;
            if (map2 == null) {
                qc.q.z("achievementDescriptions");
                map2 = null;
            }
            textView2.setText(map2.get(userAchievement.getKey()));
            if (userAchievement.getEarned()) {
                str = "achievement-" + userAchievement.getKey() + "2x";
            } else {
                str = "achievement-unearned2x";
            }
            PixelArtView pixelArtView = inflate.iconView;
            qc.q.h(pixelArtView, "iconView");
            DataBindingUtilsKt.loadImage$default(pixelArtView, str, null, 2, null);
            if (userAchievement.getEarned()) {
                TextView textView3 = inflate.titleView;
                textView3.setPaintFlags(textView3.getPaintFlags() | 16);
                inflate.titleView.setTextColor(androidx.core.content.a.c(this, R.color.text_ternary));
                inflate.descriptionView.setTextColor(androidx.core.content.a.c(this, R.color.text_ternary));
            } else {
                inflate.titleView.setTextColor(androidx.core.content.a.c(this, R.color.text_primary));
                inflate.descriptionView.setTextColor(androidx.core.content.a.c(this, R.color.text_primary));
                inflate.iconView.setAlpha(0.5f);
            }
        }
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    public View getContentView(Integer num) {
        ActivityAdventureGuideBinding inflate = ActivityAdventureGuideBinding.inflate(getLayoutInflater());
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
        return Integer.valueOf((int) R.layout.activity_main);
    }

    public final MainUserViewModel getUserViewModel() {
        MainUserViewModel mainUserViewModel = this.userViewModel;
        if (mainUserViewModel != null) {
            return mainUserViewModel;
        }
        qc.q.z("userViewModel");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.fragment.app.q, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        Map<String, String> k10;
        Map<String, String> k11;
        super.onCreate(bundle);
        ActivityAdventureGuideBinding activityAdventureGuideBinding = this.binding;
        ActivityAdventureGuideBinding activityAdventureGuideBinding2 = null;
        if (activityAdventureGuideBinding == null) {
            qc.q.z("binding");
            activityAdventureGuideBinding = null;
        }
        setupToolbar(activityAdventureGuideBinding.toolbar);
        k10 = ec.n0.k(new dc.l("createdTask", getString(R.string.create_task_title)), new dc.l("completedTask", getString(R.string.complete_task_title)), new dc.l("hatchedPet", getString(R.string.hatch_pet_title)), new dc.l("fedPet", getString(R.string.feedPet_title)), new dc.l("purchasedEquipment", getString(R.string.purchase_equipment_title)));
        this.achievementTitles = k10;
        k11 = ec.n0.k(new dc.l("createdTask", getString(R.string.create_task_description)), new dc.l("completedTask", getString(R.string.complete_task_description)), new dc.l("hatchedPet", getString(R.string.hatch_pet_description)), new dc.l("fedPet", getString(R.string.feedPet_description)), new dc.l("purchasedEquipment", getString(R.string.purchase_equipment_description)));
        this.achievementDescriptions = k11;
        String string = getString(R.string.adventure_guide_description_new);
        qc.q.h(string, "getString(...)");
        ActivityAdventureGuideBinding activityAdventureGuideBinding3 = this.binding;
        if (activityAdventureGuideBinding3 == null) {
            qc.q.z("binding");
        } else {
            activityAdventureGuideBinding2 = activityAdventureGuideBinding3;
        }
        activityAdventureGuideBinding2.descriptionView.setText(StringExtensionsKt.fromHtml(string), TextView.BufferType.SPANNABLE);
        Analytics.INSTANCE.sendNavigationEvent("adventure guide screen");
        getUserViewModel().getUser().j(this, new AdventureGuideActivity$sam$androidx_lifecycle_Observer$0(new AdventureGuideActivity$onCreate$1(this)));
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        qc.q.i(menuItem, "item");
        if (menuItem.getItemId() == 16908332) {
            androidx.core.app.k.e(this);
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final void setUserViewModel(MainUserViewModel mainUserViewModel) {
        qc.q.i(mainUserViewModel, "<set-?>");
        this.userViewModel = mainUserViewModel;
    }
}
