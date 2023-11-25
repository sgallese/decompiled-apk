package com.habitrpg.android.habitica.ui.fragments;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.databinding.ActivityMainBinding;
import com.habitrpg.android.habitica.databinding.ActivityMainContentBinding;
import com.habitrpg.android.habitica.helpers.SoundManager;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.android.habitica.ui.helpers.ToolbarColorHelper;
import com.habitrpg.android.habitica.ui.views.navigation.HabiticaBottomNavigationView;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import e4.a;

/* compiled from: BaseMainFragment.kt */
/* loaded from: classes4.dex */
public abstract class BaseMainFragment<VB extends e4.a> extends BaseFragment<VB> {
    public static final int $stable = 8;
    private boolean hidesToolbar;
    private boolean isTitleInteractive;
    private boolean showsBackButton;
    public SoundManager soundManager;
    public UserRepository userRepository;
    private boolean usesBottomNavigation;
    private boolean usesTabLayout;

    private final void disableToolbarScrolling() {
        ViewGroup.LayoutParams layoutParams;
        Toolbar collapsingToolbar = getCollapsingToolbar();
        AppBarLayout.e eVar = null;
        if (collapsingToolbar != null) {
            layoutParams = collapsingToolbar.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof AppBarLayout.e) {
            eVar = (AppBarLayout.e) layoutParams;
        }
        if (eVar != null) {
            eVar.g(0);
        }
    }

    private final void enableToolbarScrolling() {
        ViewGroup.LayoutParams layoutParams;
        Toolbar collapsingToolbar = getCollapsingToolbar();
        AppBarLayout.e eVar = null;
        if (collapsingToolbar != null) {
            layoutParams = collapsingToolbar.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof AppBarLayout.e) {
            eVar = (AppBarLayout.e) layoutParams;
        }
        if (eVar != null) {
            eVar.g(3);
        }
    }

    private final void hideToolbar() {
        ComposeView composeView;
        ActivityMainBinding binding;
        ActivityMainContentBinding activityMainContentBinding;
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null && (binding = mainActivity.getBinding()) != null && (activityMainContentBinding = binding.content) != null) {
            composeView = activityMainContentBinding.headerView;
        } else {
            composeView = null;
        }
        if (composeView != null) {
            composeView.setVisibility(8);
        }
    }

    private final void showToolbar() {
        ComposeView composeView;
        ActivityMainBinding binding;
        ActivityMainContentBinding activityMainContentBinding;
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null && (binding = mainActivity.getBinding()) != null && (activityMainContentBinding = binding.content) != null) {
            composeView = activityMainContentBinding.headerView;
        } else {
            composeView = null;
        }
        if (composeView != null) {
            composeView.setVisibility(0);
        }
    }

    private final void updateTabLayoutVisibility() {
        if (this.usesTabLayout) {
            TabLayout tabLayout = getTabLayout();
            if (tabLayout != null) {
                tabLayout.setVisibility(0);
            }
            TabLayout tabLayout2 = getTabLayout();
            if (tabLayout2 != null) {
                tabLayout2.setTabMode(1);
                return;
            }
            return;
        }
        TabLayout tabLayout3 = getTabLayout();
        if (tabLayout3 != null) {
            tabLayout3.setVisibility(8);
        }
    }

    public final HabiticaBottomNavigationView getBottomNavigation() {
        ActivityMainBinding binding;
        ActivityMainContentBinding activityMainContentBinding;
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null && (binding = mainActivity.getBinding()) != null && (activityMainContentBinding = binding.content) != null) {
            return activityMainContentBinding.bottomNavigation;
        }
        return null;
    }

    public final Toolbar getCollapsingToolbar() {
        ActivityMainBinding binding;
        ActivityMainContentBinding activityMainContentBinding;
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null && (binding = mainActivity.getBinding()) != null && (activityMainContentBinding = binding.content) != null) {
            return activityMainContentBinding.toolbar;
        }
        return null;
    }

    public final boolean getHidesToolbar() {
        return this.hidesToolbar;
    }

    public MainActivity getMainActivity() {
        androidx.fragment.app.q activity = getActivity();
        if (activity instanceof MainActivity) {
            return (MainActivity) activity;
        }
        return null;
    }

    protected final boolean getShowsBackButton() {
        return this.showsBackButton;
    }

    public final SoundManager getSoundManager() {
        SoundManager soundManager = this.soundManager;
        if (soundManager != null) {
            return soundManager;
        }
        qc.q.z("soundManager");
        return null;
    }

    public final TabLayout getTabLayout() {
        ActivityMainBinding binding;
        ActivityMainContentBinding activityMainContentBinding;
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null && (binding = mainActivity.getBinding()) != null && (activityMainContentBinding = binding.content) != null) {
            return activityMainContentBinding.detailTabs;
        }
        return null;
    }

    public final FrameLayout getToolbarAccessoryContainer() {
        ActivityMainBinding binding;
        ActivityMainContentBinding activityMainContentBinding;
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null && (binding = mainActivity.getBinding()) != null && (activityMainContentBinding = binding.content) != null) {
            return activityMainContentBinding.toolbarAccessoryContainer;
        }
        return null;
    }

    public final UserRepository getUserRepository() {
        UserRepository userRepository = this.userRepository;
        if (userRepository != null) {
            return userRepository;
        }
        qc.q.z("userRepository");
        return null;
    }

    public final boolean getUsesBottomNavigation() {
        return this.usesBottomNavigation;
    }

    public final boolean getUsesTabLayout() {
        return this.usesTabLayout;
    }

    public final boolean isTitleInteractive() {
        return this.isTitleInteractive;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        Toolbar toolbar$Habitica_2311256681_prodRelease;
        qc.q.i(menu, "menu");
        qc.q.i(menuInflater, "inflater");
        super.onCreateOptionsMenu(menu, menuInflater);
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null && (toolbar$Habitica_2311256681_prodRelease = mainActivity.getToolbar$Habitica_2311256681_prodRelease()) != null) {
            ToolbarColorHelper.colorizeToolbar$default(ToolbarColorHelper.INSTANCE, toolbar$Habitica_2311256681_prodRelease, getMainActivity(), null, null, 12, null);
        }
        updateToolbarInteractivity();
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        qc.q.i(layoutInflater, "inflater");
        if (this.usesBottomNavigation) {
            HabiticaBottomNavigationView bottomNavigation = getBottomNavigation();
            if (bottomNavigation != null) {
                bottomNavigation.setVisibility(0);
            }
        } else {
            HabiticaBottomNavigationView bottomNavigation2 = getBottomNavigation();
            if (bottomNavigation2 != null) {
                bottomNavigation2.setVisibility(8);
            }
        }
        setHasOptionsMenu(true);
        TabLayout tabLayout = getTabLayout();
        if (tabLayout != null) {
            tabLayout.H();
        }
        updateTabLayoutVisibility();
        updateToolbarInteractivity();
        if (this.hidesToolbar) {
            hideToolbar();
            disableToolbarScrolling();
        } else {
            showToolbar();
            enableToolbarScrolling();
        }
        Context context = getContext();
        if (context != null) {
            FirebaseAnalytics.getInstance(context).a("fragment_view", androidx.core.os.e.a(new dc.l("fragment", getClass().getCanonicalName())));
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getUserRepository().close();
        super.onDestroy();
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        setBinding(null);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        androidx.appcompat.app.a supportActionBar;
        super.onResume();
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            mainActivity.setShowBackButton(Boolean.valueOf(this.showsBackButton));
        }
        MainActivity mainActivity2 = getMainActivity();
        if (mainActivity2 != null && (supportActionBar = mainActivity2.getSupportActionBar()) != null) {
            supportActionBar.t(true);
        }
    }

    public final void setHidesToolbar(boolean z10) {
        this.hidesToolbar = z10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setShowsBackButton(boolean z10) {
        this.showsBackButton = z10;
    }

    public final void setSoundManager(SoundManager soundManager) {
        qc.q.i(soundManager, "<set-?>");
        this.soundManager = soundManager;
    }

    public final void setTitleInteractive(boolean z10) {
        this.isTitleInteractive = z10;
    }

    public final void setUserRepository(UserRepository userRepository) {
        qc.q.i(userRepository, "<set-?>");
        this.userRepository = userRepository;
    }

    public final void setUsesBottomNavigation(boolean z10) {
        this.usesBottomNavigation = z10;
    }

    public final void setUsesTabLayout(boolean z10) {
        this.usesTabLayout = z10;
        updateTabLayoutVisibility();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void tintMenuIcon(MenuItem menuItem) {
        Drawable icon;
        Drawable icon2;
        Context context = getContext();
        if (context != null) {
            int themeColor = ContextExtensionsKt.getThemeColor(context, R.attr.headerTextColor);
            if (menuItem != null && (icon2 = menuItem.getIcon()) != null) {
                icon2.setTint(themeColor);
            }
            if (menuItem != null && (icon = menuItem.getIcon()) != null) {
                icon.setTintMode(PorterDuff.Mode.MULTIPLY);
            }
        }
    }

    public void updateToolbarInteractivity() {
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            mainActivity.updateToolbarInteractivity(this.isTitleInteractive);
        }
    }
}
