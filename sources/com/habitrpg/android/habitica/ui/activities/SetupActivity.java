package com.habitrpg.android.habitica.ui.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.databinding.ActivitySetupBinding;
import com.habitrpg.android.habitica.helpers.Analytics;
import com.habitrpg.android.habitica.helpers.EventCategory;
import com.habitrpg.android.habitica.helpers.HitType;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.fragments.setup.AvatarSetupFragment;
import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;
import com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment;
import com.habitrpg.android.habitica.ui.views.FadingViewPager;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.viewpagerindicator.IconPageIndicator;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* compiled from: SetupActivity.kt */
/* loaded from: classes4.dex */
public final class SetupActivity extends Hilt_SetupActivity implements ViewPager.j {
    public static final int $stable = 8;
    public ApiClient apiClient;
    private AvatarSetupFragment avatarSetupFragment;
    private ActivitySetupBinding binding;
    private boolean completedSetup;
    private boolean createdTasks;
    private boolean hasCompleted;
    public InventoryRepository inventoryRepository;
    public TaskRepository taskRepository;
    private TaskSetupFragment taskSetupFragment;
    private User user;
    private WelcomeFragment welcomeFragment;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SetupActivity.kt */
    /* loaded from: classes4.dex */
    public final class ViewPageAdapter extends androidx.fragment.app.g0 implements pa.a {
        final /* synthetic */ SetupActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewPageAdapter(SetupActivity setupActivity, FragmentManager fragmentManager) {
            super(fragmentManager, 1);
            qc.q.i(fragmentManager, "fm");
            this.this$0 = setupActivity;
        }

        @Override // androidx.viewpager.widget.a, pa.a
        public int getCount() {
            return 3;
        }

        @Override // pa.a
        public int getIconResId(int i10) {
            return R.drawable.indicator_diamond;
        }

        @Override // androidx.fragment.app.g0
        public Fragment getItem(int i10) {
            if (i10 != 1) {
                if (i10 != 2) {
                    WelcomeFragment welcomeFragment = new WelcomeFragment();
                    this.this$0.setWelcomeFragment$Habitica_2311256681_prodRelease(welcomeFragment);
                    WelcomeFragment welcomeFragment$Habitica_2311256681_prodRelease = this.this$0.getWelcomeFragment$Habitica_2311256681_prodRelease();
                    if (welcomeFragment$Habitica_2311256681_prodRelease != null) {
                        welcomeFragment$Habitica_2311256681_prodRelease.setOnNameValid(new SetupActivity$ViewPageAdapter$getItem$1(this.this$0));
                        return welcomeFragment;
                    }
                    return welcomeFragment;
                }
                TaskSetupFragment taskSetupFragment = new TaskSetupFragment();
                taskSetupFragment.setUser(this.this$0.getUser$Habitica_2311256681_prodRelease());
                this.this$0.setTaskSetupFragment$Habitica_2311256681_prodRelease(taskSetupFragment);
                return taskSetupFragment;
            }
            AvatarSetupFragment avatarSetupFragment = new AvatarSetupFragment();
            avatarSetupFragment.setActivity(this.this$0);
            avatarSetupFragment.setUser(this.this$0.getUser$Habitica_2311256681_prodRelease());
            ActivitySetupBinding activitySetupBinding = this.this$0.binding;
            if (activitySetupBinding == null) {
                qc.q.z("binding");
                activitySetupBinding = null;
            }
            avatarSetupFragment.setWidth(activitySetupBinding.viewPager.getWidth());
            this.this$0.setAvatarSetupFragment$Habitica_2311256681_prodRelease(avatarSetupFragment);
            return avatarSetupFragment;
        }

        @Override // androidx.fragment.app.g0, androidx.viewpager.widget.a
        public Object instantiateItem(ViewGroup viewGroup, int i10) {
            qc.q.i(viewGroup, "container");
            Object instantiateItem = super.instantiateItem(viewGroup, i10);
            qc.q.h(instantiateItem, "instantiateItem(...)");
            if (instantiateItem instanceof AvatarSetupFragment) {
                AvatarSetupFragment avatarSetupFragment = (AvatarSetupFragment) instantiateItem;
                this.this$0.setAvatarSetupFragment$Habitica_2311256681_prodRelease(avatarSetupFragment);
                avatarSetupFragment.setActivity(this.this$0);
                avatarSetupFragment.setUser(this.this$0.getUser$Habitica_2311256681_prodRelease());
                ActivitySetupBinding activitySetupBinding = this.this$0.binding;
                if (activitySetupBinding == null) {
                    qc.q.z("binding");
                    activitySetupBinding = null;
                }
                avatarSetupFragment.setWidth(activitySetupBinding.viewPager.getWidth());
            } else if (instantiateItem instanceof TaskSetupFragment) {
                TaskSetupFragment taskSetupFragment = (TaskSetupFragment) instantiateItem;
                this.this$0.setTaskSetupFragment$Habitica_2311256681_prodRelease(taskSetupFragment);
                taskSetupFragment.setUser(this.this$0.getUser$Habitica_2311256681_prodRelease());
            } else if (instantiateItem instanceof WelcomeFragment) {
                WelcomeFragment welcomeFragment = (WelcomeFragment) instantiateItem;
                this.this$0.setWelcomeFragment$Habitica_2311256681_prodRelease(welcomeFragment);
                welcomeFragment.setOnNameValid(new SetupActivity$ViewPageAdapter$instantiateItem$1(this.this$0));
            }
            return instantiateItem;
        }
    }

    private final void confirmNames(String str, String str2) {
        ad.i.d(androidx.lifecycle.w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new SetupActivity$confirmNames$1(this, str, str2, null), 2, null);
    }

    private final boolean isLastPage() {
        int i10;
        ActivitySetupBinding activitySetupBinding = this.binding;
        ActivitySetupBinding activitySetupBinding2 = null;
        if (activitySetupBinding == null) {
            qc.q.z("binding");
            activitySetupBinding = null;
        }
        if (activitySetupBinding.viewPager.getAdapter() == null) {
            return true;
        }
        ActivitySetupBinding activitySetupBinding3 = this.binding;
        if (activitySetupBinding3 == null) {
            qc.q.z("binding");
            activitySetupBinding3 = null;
        }
        int currentItem = activitySetupBinding3.viewPager.getCurrentItem();
        ActivitySetupBinding activitySetupBinding4 = this.binding;
        if (activitySetupBinding4 == null) {
            qc.q.z("binding");
        } else {
            activitySetupBinding2 = activitySetupBinding4;
        }
        androidx.viewpager.widget.a adapter = activitySetupBinding2.viewPager.getAdapter();
        if (adapter != null) {
            i10 = adapter.getCount();
        } else {
            i10 = 0;
        }
        if (currentItem == i10 - 1) {
            return true;
        }
        return false;
    }

    private final void nextClicked() {
        String str;
        InputMethodManager inputMethodManager;
        IBinder iBinder;
        String username;
        List<Task> list;
        SharedPreferences b10 = androidx.preference.k.b(this);
        qc.q.f(b10);
        SharedPreferences.Editor edit = b10.edit();
        edit.putString("FirstDayOfTheWeek", String.valueOf(Calendar.getInstance().getFirstDayOfWeek()));
        edit.apply();
        ActivitySetupBinding activitySetupBinding = null;
        if (isLastPage()) {
            TaskSetupFragment taskSetupFragment = this.taskSetupFragment;
            if (taskSetupFragment == null) {
                return;
            }
            if (this.createdTasks) {
                onUserReceived(this.user);
                return;
            }
            if (taskSetupFragment != null) {
                list = taskSetupFragment.createSampleTasks();
            } else {
                list = null;
            }
            this.completedSetup = true;
            this.createdTasks = true;
            if (list != null) {
                ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new SetupActivity$nextClicked$2$1(this, list, null), 1, null);
            }
        } else {
            ActivitySetupBinding activitySetupBinding2 = this.binding;
            if (activitySetupBinding2 == null) {
                qc.q.z("binding");
                activitySetupBinding2 = null;
            }
            if (activitySetupBinding2.viewPager.getCurrentItem() == 0) {
                WelcomeFragment welcomeFragment = this.welcomeFragment;
                String str2 = "";
                if (welcomeFragment == null || (str = welcomeFragment.getDisplayName()) == null) {
                    str = "";
                }
                WelcomeFragment welcomeFragment2 = this.welcomeFragment;
                if (welcomeFragment2 != null && (username = welcomeFragment2.getUsername()) != null) {
                    str2 = username;
                }
                confirmNames(str, str2);
                Object systemService = getSystemService("input_method");
                if (systemService instanceof InputMethodManager) {
                    inputMethodManager = (InputMethodManager) systemService;
                } else {
                    inputMethodManager = null;
                }
                if (inputMethodManager != null) {
                    View currentFocus = getCurrentFocus();
                    if (currentFocus != null) {
                        iBinder = currentFocus.getWindowToken();
                    } else {
                        iBinder = null;
                    }
                    inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
                }
            }
        }
        ActivitySetupBinding activitySetupBinding3 = this.binding;
        if (activitySetupBinding3 == null) {
            qc.q.z("binding");
            activitySetupBinding3 = null;
        }
        FadingViewPager fadingViewPager = activitySetupBinding3.viewPager;
        ActivitySetupBinding activitySetupBinding4 = this.binding;
        if (activitySetupBinding4 == null) {
            qc.q.z("binding");
        } else {
            activitySetupBinding = activitySetupBinding4;
        }
        fadingViewPager.setCurrentItem(activitySetupBinding.viewPager.getCurrentItem() + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(SetupActivity setupActivity, View view) {
        qc.q.i(setupActivity, "this$0");
        setupActivity.previousClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(SetupActivity setupActivity, View view) {
        qc.q.i(setupActivity, "this$0");
        setupActivity.nextClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUserReceived(User user) {
        ActivitySetupBinding activitySetupBinding = null;
        if (this.completedSetup && !this.hasCompleted) {
            HashMap hashMap = new HashMap();
            hashMap.put("status", Task.FILTER_COMPLETED);
            Analytics.sendEvent$default(Analytics.INSTANCE, "setup", EventCategory.BEHAVIOUR, HitType.EVENT, hashMap, null, 16, null);
            this.hasCompleted = true;
            ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new SetupActivity$onUserReceived$1(this, null), 1, null);
            return;
        }
        this.user = user;
        ActivitySetupBinding activitySetupBinding2 = this.binding;
        if (activitySetupBinding2 == null) {
            qc.q.z("binding");
        } else {
            activitySetupBinding = activitySetupBinding2;
        }
        if (activitySetupBinding.viewPager.getAdapter() == null) {
            setupViewpager();
        }
        AvatarSetupFragment avatarSetupFragment = this.avatarSetupFragment;
        if (avatarSetupFragment != null) {
            avatarSetupFragment.setUser(user);
        }
        TaskSetupFragment taskSetupFragment = this.taskSetupFragment;
        if (taskSetupFragment != null) {
            taskSetupFragment.setUser(user);
        }
    }

    private final void previousClicked() {
        ActivitySetupBinding activitySetupBinding = this.binding;
        ActivitySetupBinding activitySetupBinding2 = null;
        if (activitySetupBinding == null) {
            qc.q.z("binding");
            activitySetupBinding = null;
        }
        FadingViewPager fadingViewPager = activitySetupBinding.viewPager;
        ActivitySetupBinding activitySetupBinding3 = this.binding;
        if (activitySetupBinding3 == null) {
            qc.q.z("binding");
        } else {
            activitySetupBinding2 = activitySetupBinding3;
        }
        fadingViewPager.setCurrentItem(activitySetupBinding2.viewPager.getCurrentItem() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setNextButtonEnabled(boolean z10) {
        ActivitySetupBinding activitySetupBinding = this.binding;
        if (activitySetupBinding == null) {
            qc.q.z("binding");
            activitySetupBinding = null;
        }
        activitySetupBinding.nextButton.setEnabled(z10);
        Drawable b10 = h.a.b(this, R.drawable.forward_arrow_enabled);
        if (z10) {
            ActivitySetupBinding activitySetupBinding2 = this.binding;
            if (activitySetupBinding2 == null) {
                qc.q.z("binding");
                activitySetupBinding2 = null;
            }
            activitySetupBinding2.nextButton.setTextColor(androidx.core.content.a.c(this, R.color.white));
            if (b10 != null) {
                b10.setAlpha(255);
            }
        } else {
            ActivitySetupBinding activitySetupBinding3 = this.binding;
            if (activitySetupBinding3 == null) {
                qc.q.z("binding");
                activitySetupBinding3 = null;
            }
            activitySetupBinding3.nextButton.setTextColor(androidx.core.content.a.c(this, R.color.white_50_alpha));
            if (b10 != null) {
                b10.setAlpha(127);
            }
        }
        ActivitySetupBinding activitySetupBinding4 = this.binding;
        if (activitySetupBinding4 == null) {
            qc.q.z("binding");
            activitySetupBinding4 = null;
        }
        activitySetupBinding4.nextButton.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, b10, (Drawable) null);
    }

    private final void setPreviousButtonEnabled(boolean z10) {
        Drawable b10;
        if (z10) {
            ActivitySetupBinding activitySetupBinding = this.binding;
            if (activitySetupBinding == null) {
                qc.q.z("binding");
                activitySetupBinding = null;
            }
            activitySetupBinding.previousButton.setText(R.string.action_back);
            b10 = h.a.b(this, R.drawable.back_arrow_enabled);
        } else {
            ActivitySetupBinding activitySetupBinding2 = this.binding;
            if (activitySetupBinding2 == null) {
                qc.q.z("binding");
                activitySetupBinding2 = null;
            }
            activitySetupBinding2.previousButton.setText((CharSequence) null);
            b10 = h.a.b(this, R.drawable.back_arrow_disabled);
        }
        ActivitySetupBinding activitySetupBinding3 = this.binding;
        if (activitySetupBinding3 == null) {
            qc.q.z("binding");
            activitySetupBinding3 = null;
        }
        activitySetupBinding3.previousButton.setCompoundDrawablesWithIntrinsicBounds(b10, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    private final void setupViewpager() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        qc.q.h(supportFragmentManager, "getSupportFragmentManager(...)");
        ActivitySetupBinding activitySetupBinding = this.binding;
        ActivitySetupBinding activitySetupBinding2 = null;
        if (activitySetupBinding == null) {
            qc.q.z("binding");
            activitySetupBinding = null;
        }
        activitySetupBinding.viewPager.setAdapter(new ViewPageAdapter(this, supportFragmentManager));
        ActivitySetupBinding activitySetupBinding3 = this.binding;
        if (activitySetupBinding3 == null) {
            qc.q.z("binding");
            activitySetupBinding3 = null;
        }
        activitySetupBinding3.viewPager.addOnPageChangeListener(this);
        ActivitySetupBinding activitySetupBinding4 = this.binding;
        if (activitySetupBinding4 == null) {
            qc.q.z("binding");
            activitySetupBinding4 = null;
        }
        IconPageIndicator iconPageIndicator = activitySetupBinding4.viewPagerIndicator;
        ActivitySetupBinding activitySetupBinding5 = this.binding;
        if (activitySetupBinding5 == null) {
            qc.q.z("binding");
        } else {
            activitySetupBinding2 = activitySetupBinding5;
        }
        iconPageIndicator.setViewPager(activitySetupBinding2.viewPager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(335544320);
        startActivity(intent);
        finish();
    }

    public final ApiClient getApiClient() {
        ApiClient apiClient = this.apiClient;
        if (apiClient != null) {
            return apiClient;
        }
        qc.q.z("apiClient");
        return null;
    }

    public final AvatarSetupFragment getAvatarSetupFragment$Habitica_2311256681_prodRelease() {
        return this.avatarSetupFragment;
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    public View getContentView(Integer num) {
        ActivitySetupBinding inflate = ActivitySetupBinding.inflate(getLayoutInflater());
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

    public final InventoryRepository getInventoryRepository() {
        InventoryRepository inventoryRepository = this.inventoryRepository;
        if (inventoryRepository != null) {
            return inventoryRepository;
        }
        qc.q.z("inventoryRepository");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    protected Integer getLayoutResId() {
        return Integer.valueOf((int) R.layout.activity_setup);
    }

    public final TaskRepository getTaskRepository() {
        TaskRepository taskRepository = this.taskRepository;
        if (taskRepository != null) {
            return taskRepository;
        }
        qc.q.z("taskRepository");
        return null;
    }

    public final TaskSetupFragment getTaskSetupFragment$Habitica_2311256681_prodRelease() {
        return this.taskSetupFragment;
    }

    public final User getUser$Habitica_2311256681_prodRelease() {
        return this.user;
    }

    public final WelcomeFragment getWelcomeFragment$Habitica_2311256681_prodRelease() {
        return this.welcomeFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.fragment.app.q, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        WindowInsetsController insetsController;
        super.onCreate(bundle);
        androidx.lifecycle.q a10 = androidx.lifecycle.w.a(this);
        ExceptionHandler.Companion companion = ExceptionHandler.Companion;
        ActivitySetupBinding activitySetupBinding = null;
        ad.i.d(a10, ExceptionHandler.Companion.coroutine$default(companion, null, 1, null), null, new SetupActivity$onCreate$1(this, null), 2, null);
        ad.i.d(androidx.lifecycle.w.a(this), ExceptionHandler.Companion.coroutine$default(companion, null, 1, null), null, new SetupActivity$onCreate$2(this, null), 2, null);
        HashMap hashMap = new HashMap();
        hashMap.put("status", "displayed");
        Analytics.sendEvent$default(Analytics.INSTANCE, "setup", EventCategory.BEHAVIOUR, HitType.EVENT, hashMap, null, 16, null);
        String language = Locale.getDefault().getLanguage();
        String[] stringArray = getResources().getStringArray(R.array.LanguageValues);
        qc.q.h(stringArray, "getStringArray(...)");
        for (String str : stringArray) {
            if (qc.q.d(str, language)) {
                ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new SetupActivity$onCreate$3(this, language, null), 1, null);
            }
        }
        ActivitySetupBinding activitySetupBinding2 = this.binding;
        if (activitySetupBinding2 == null) {
            qc.q.z("binding");
            activitySetupBinding2 = null;
        }
        activitySetupBinding2.viewPager.setDisableFading(true);
        ActivitySetupBinding activitySetupBinding3 = this.binding;
        if (activitySetupBinding3 == null) {
            qc.q.z("binding");
            activitySetupBinding3 = null;
        }
        activitySetupBinding3.previousButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.e2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SetupActivity.onCreate$lambda$0(SetupActivity.this, view);
            }
        });
        ActivitySetupBinding activitySetupBinding4 = this.binding;
        if (activitySetupBinding4 == null) {
            qc.q.z("binding");
        } else {
            activitySetupBinding = activitySetupBinding4;
        }
        activitySetupBinding.nextButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.f2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SetupActivity.onCreate$lambda$1(SetupActivity.this, view);
            }
        });
        if (ContextExtensionsKt.isUsingNightModeResources(this)) {
            getWindow().setStatusBarColor(androidx.core.content.a.c(this, R.color.black_20_alpha));
            if (Build.VERSION.SDK_INT >= 30) {
                insetsController = getWindow().getInsetsController();
                if (insetsController != null) {
                    insetsController.setSystemBarsAppearance(0, 8);
                    return;
                }
                return;
            }
            getWindow().getDecorView().setSystemUiVisibility(8192);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.appcompat.app.d, androidx.fragment.app.q, android.app.Activity
    public void onDestroy() {
        getUserRepository().close();
        super.onDestroy();
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void onPageSelected(int i10) {
        ActivitySetupBinding activitySetupBinding = null;
        if (i10 == 0) {
            setPreviousButtonEnabled(false);
            ActivitySetupBinding activitySetupBinding2 = this.binding;
            if (activitySetupBinding2 == null) {
                qc.q.z("binding");
            } else {
                activitySetupBinding = activitySetupBinding2;
            }
            activitySetupBinding.nextButton.setText(getString(R.string.next_button));
        } else if (isLastPage()) {
            setPreviousButtonEnabled(true);
            ActivitySetupBinding activitySetupBinding3 = this.binding;
            if (activitySetupBinding3 == null) {
                qc.q.z("binding");
            } else {
                activitySetupBinding = activitySetupBinding3;
            }
            activitySetupBinding.nextButton.setText(getString(R.string.finish));
        } else {
            setPreviousButtonEnabled(true);
            ActivitySetupBinding activitySetupBinding4 = this.binding;
            if (activitySetupBinding4 == null) {
                qc.q.z("binding");
            } else {
                activitySetupBinding = activitySetupBinding4;
            }
            activitySetupBinding.nextButton.setText(getString(R.string.next_button));
        }
    }

    public final void setApiClient(ApiClient apiClient) {
        qc.q.i(apiClient, "<set-?>");
        this.apiClient = apiClient;
    }

    public final void setAvatarSetupFragment$Habitica_2311256681_prodRelease(AvatarSetupFragment avatarSetupFragment) {
        this.avatarSetupFragment = avatarSetupFragment;
    }

    public final void setInventoryRepository(InventoryRepository inventoryRepository) {
        qc.q.i(inventoryRepository, "<set-?>");
        this.inventoryRepository = inventoryRepository;
    }

    public final void setTaskRepository(TaskRepository taskRepository) {
        qc.q.i(taskRepository, "<set-?>");
        this.taskRepository = taskRepository;
    }

    public final void setTaskSetupFragment$Habitica_2311256681_prodRelease(TaskSetupFragment taskSetupFragment) {
        this.taskSetupFragment = taskSetupFragment;
    }

    public final void setUser$Habitica_2311256681_prodRelease(User user) {
        this.user = user;
    }

    public final void setWelcomeFragment$Habitica_2311256681_prodRelease(WelcomeFragment welcomeFragment) {
        this.welcomeFragment = welcomeFragment;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void onPageScrollStateChanged(int i10) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void onPageScrolled(int i10, float f10, int i11) {
    }
}
