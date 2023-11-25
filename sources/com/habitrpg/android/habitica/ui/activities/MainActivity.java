package com.habitrpg.android.habitica.ui.activities;

import ad.x1;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.d;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.gms.wearable.Wearable;
import com.google.firebase.perf.metrics.Trace;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.databinding.ActivityMainBinding;
import com.habitrpg.android.habitica.extensions.ActivityExtensionKt;
import com.habitrpg.android.habitica.extensions.BaseViewModelExtensionsKt;
import com.habitrpg.android.habitica.extensions.ViewExtKt;
import com.habitrpg.android.habitica.extensions.WindowExtensionsKt;
import com.habitrpg.android.habitica.helpers.Analytics;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.EventCategory;
import com.habitrpg.android.habitica.helpers.HitType;
import com.habitrpg.android.habitica.helpers.NotificationOpenHandler;
import com.habitrpg.android.habitica.helpers.ReviewManager;
import com.habitrpg.android.habitica.helpers.SoundManager;
import com.habitrpg.android.habitica.interactors.CheckClassSelectionUseCase;
import com.habitrpg.android.habitica.interactors.DisplayItemDropUseCase;
import com.habitrpg.android.habitica.interactors.NotifyUserUseCase;
import com.habitrpg.android.habitica.models.TutorialStep;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.models.user.UserQuestStatus;
import com.habitrpg.android.habitica.ui.TutorialView;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.android.habitica.ui.viewmodels.MainActivityViewModel;
import com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel;
import com.habitrpg.android.habitica.ui.views.HabiticaSnackbar;
import com.habitrpg.android.habitica.ui.views.SnackbarActivity;
import com.habitrpg.android.habitica.widget.AvatarStatsWidgetProvider;
import com.habitrpg.android.habitica.widget.DailiesWidgetProvider;
import com.habitrpg.android.habitica.widget.HabitButtonWidgetProvider;
import com.habitrpg.android.habitica.widget.TodoListWidgetProvider;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.extensions.DataBindingUtils;
import com.habitrpg.common.habitica.extensions.IntExtensionsKt;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import com.habitrpg.common.habitica.views.AvatarView;
import com.habitrpg.shared.habitica.models.responses.MaintenanceResponse;
import com.habitrpg.shared.habitica.models.responses.TaskScoringResult;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/* compiled from: MainActivity.kt */
/* loaded from: classes4.dex */
public class MainActivity extends Hilt_MainActivity implements SnackbarActivity {
    public static final int $stable = 8;
    public ApiClient apiClient;
    public AppConfigManager appConfigManager;
    public ActivityMainBinding binding;
    public CheckClassSelectionUseCase checkClassSelectionUseCase;
    private final androidx.activity.result.b<Intent> classSelectionResult;
    public DisplayItemDropUseCase displayItemDropUseCase;
    private NavigationDrawerFragment drawerFragment;
    private androidx.appcompat.app.b drawerToggle;
    private ad.x1 errorJob;
    public InventoryRepository inventoryRepository;
    private long lastDeathDialogDisplay;
    private Long lastNotificationOpen;
    private String launchScreen;
    private Trace launchTrace;
    private final androidx.activity.result.b<String> notificationPermissionLauncher;
    public NotifyUserUseCase notifyUserUseCase;
    private boolean resumeFromActivity;
    public ReviewManager reviewManager;
    private Boolean showBackButton;
    private boolean showBirthdayIcon;
    private AvatarView sideAvatarView;
    public SoundManager soundManager;
    public TaskRepository taskRepository;
    private final dc.f notificationsViewModel$delegate = new androidx.lifecycle.x0(qc.g0.b(NotificationsViewModel.class), new MainActivity$special$$inlined$viewModels$default$2(this), new MainActivity$special$$inlined$viewModels$default$1(this), new MainActivity$special$$inlined$viewModels$default$3(null, this));
    private final dc.f viewModel$delegate = new androidx.lifecycle.x0(qc.g0.b(MainActivityViewModel.class), new MainActivity$special$$inlined$viewModels$default$5(this), new MainActivity$special$$inlined$viewModels$default$4(this), new MainActivity$special$$inlined$viewModels$default$6(null, this));
    private UserQuestStatus userQuestStatus = UserQuestStatus.NO_QUEST;

    /* compiled from: MainActivity.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserQuestStatus.values().length];
            try {
                iArr[UserQuestStatus.QUEST_BOSS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MainActivity() {
        androidx.activity.result.b<String> registerForActivityResult = registerForActivityResult(new f.c(), new androidx.activity.result.a() { // from class: com.habitrpg.android.habitica.ui.activities.m1
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                MainActivity.notificationPermissionLauncher$lambda$0(MainActivity.this, (Boolean) obj);
            }
        });
        qc.q.h(registerForActivityResult, "registerForActivityResult(...)");
        this.notificationPermissionLauncher = registerForActivityResult;
        androidx.activity.result.b<Intent> registerForActivityResult2 = registerForActivityResult(new f.d(), new androidx.activity.result.a() { // from class: com.habitrpg.android.habitica.ui.activities.n1
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                MainActivity.classSelectionResult$lambda$1(MainActivity.this, (ActivityResult) obj);
            }
        });
        qc.q.h(registerForActivityResult2, "registerForActivityResult(...)");
        this.classSelectionResult = registerForActivityResult2;
    }

    private final void checkForReviewPrompt(User user) {
        getReviewManager().requestReview(this, user.getLoginIncentives());
    }

    private final void checkMaintenance() {
        getViewModel().ifNeedsMaintenance(new MainActivity$checkMaintenance$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void classSelectionResult$lambda$1(MainActivity mainActivity, ActivityResult activityResult) {
        qc.q.i(mainActivity, "this$0");
        ad.g.d(androidx.lifecycle.w.a(mainActivity), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new MainActivity$classSelectionResult$1$1(mainActivity, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Intent createMaintenanceIntent(MaintenanceResponse maintenanceResponse, boolean z10) {
        Intent intent = new Intent(this, MaintenanceActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("title", maintenanceResponse.getTitle());
        bundle.putString("imageUrl", maintenanceResponse.getImageUrl());
        bundle.putString("description", maintenanceResponse.getDescription());
        bundle.putBoolean("deprecationNotice", z10);
        intent.putExtras(bundle);
        return intent;
    }

    private final void displayDeathDialogIfNeeded() {
        if (!getViewModel().getUserViewModel().isUserFainted()) {
            return;
        }
        ad.g.d(androidx.lifecycle.w.a(this), ad.a1.c(), null, new MainActivity$displayDeathDialogIfNeeded$1(this, new Date().getTime(), null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notificationPermissionLauncher$lambda$0(MainActivity mainActivity, Boolean bool) {
        qc.q.i(mainActivity, "this$0");
        qc.q.f(bool);
        if (bool.booleanValue()) {
            mainActivity.getViewModel().getPushNotificationManager().addPushDeviceUsingStoredToken();
        } else {
            mainActivity.getViewModel().updateAllowPushNotifications(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$4(MainActivity mainActivity, androidx.navigation.d dVar, androidx.navigation.i iVar, Bundle bundle) {
        qc.q.i(mainActivity, "this$0");
        qc.q.i(dVar, "<anonymous parameter 0>");
        qc.q.i(iVar, "destination");
        mainActivity.updateToolbarTitle(iVar, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$5(MainActivity mainActivity, User user) {
        qc.q.i(mainActivity, "this$0");
        if (mainActivity.getViewModel().getUserViewModel().isUserInParty()) {
            MainNavigationController.navigate$default(MainNavigationController.INSTANCE, R.id.partyFragment, null, 2, null);
        }
    }

    public static /* synthetic */ void retrieveUser$default(MainActivity mainActivity, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            mainActivity.retrieveUser(z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrieveUser");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setUserData(com.habitrpg.android.habitica.models.user.User r11) {
        /*
            r10 = this;
            if (r11 == 0) goto Lfc
            com.habitrpg.android.habitica.models.user.Preferences r0 = r11.getPreferences()
            if (r0 == 0) goto L15
            java.lang.String r1 = r0.getLanguage()
            if (r1 == 0) goto L15
            com.habitrpg.android.habitica.data.ApiClient r2 = r10.getApiClient$Habitica_2311256681_prodRelease()
            r2.setLanguageCode(r1)
        L15:
            r1 = 0
            if (r0 == 0) goto L1d
            java.lang.String r2 = r0.getLanguage()
            goto L1e
        L1d:
            r2 = r1
        L1e:
            com.habitrpg.android.habitica.ui.viewmodels.MainActivityViewModel r3 = r10.getViewModel()
            java.lang.String r3 = r3.getPreferenceLanguage()
            boolean r2 = qc.q.d(r2, r3)
            if (r2 != 0) goto L3b
            com.habitrpg.android.habitica.ui.viewmodels.MainActivityViewModel r2 = r10.getViewModel()
            if (r0 == 0) goto L37
            java.lang.String r3 = r0.getLanguage()
            goto L38
        L37:
            r3 = r1
        L38:
            r2.setPreferenceLanguage(r3)
        L3b:
            if (r0 == 0) goto L4a
            java.lang.String r0 = r0.getSound()
            if (r0 == 0) goto L4a
            com.habitrpg.android.habitica.helpers.SoundManager r2 = r10.getSoundManager$Habitica_2311256681_prodRelease()
            r2.setSoundTheme(r0)
        L4a:
            p9.a r0 = p9.a.f21284a
            com.google.firebase.crashlytics.a r0 = y8.a.a(r0)
            com.habitrpg.android.habitica.models.user.Preferences r2 = r11.getPreferences()
            r3 = 0
            if (r2 == 0) goto L5c
            int r2 = r2.getDayStart()
            goto L5d
        L5c:
            r2 = 0
        L5d:
            java.lang.String r4 = "day_start"
            r0.e(r4, r2)
            com.habitrpg.android.habitica.models.user.Preferences r2 = r11.getPreferences()
            if (r2 == 0) goto L6d
            int r2 = r2.getTimezoneOffset()
            goto L6e
        L6d:
            r2 = 0
        L6e:
            java.lang.String r4 = "timezone_offset"
            r0.e(r4, r2)
            r10.displayDeathDialogIfNeeded()
            com.habitrpg.android.habitica.ui.views.yesterdailies.YesterdailyDialog$Companion r0 = com.habitrpg.android.habitica.ui.views.yesterdailies.YesterdailyDialog.Companion
            java.lang.String r2 = r11.getId()
            com.habitrpg.android.habitica.data.UserRepository r4 = r10.getUserRepository()
            com.habitrpg.android.habitica.data.TaskRepository r5 = r10.getTaskRepository$Habitica_2311256681_prodRelease()
            r0.showDialogIfNeeded(r10, r2, r4, r5)
            com.habitrpg.android.habitica.models.social.UserParty r0 = r11.getParty()
            if (r0 == 0) goto L92
            com.habitrpg.android.habitica.models.inventory.Quest r0 = r0.getQuest()
            goto L93
        L92:
            r0 = r1
        L93:
            r2 = 1
            if (r0 == 0) goto La5
            java.lang.String r0 = r0.getCompleted()
            if (r0 == 0) goto La5
            boolean r0 = yc.m.u(r0)
            r0 = r0 ^ r2
            if (r0 != r2) goto La5
            r0 = 1
            goto La6
        La5:
            r0 = 0
        La6:
            if (r0 == 0) goto Lbd
            androidx.lifecycle.q r4 = androidx.lifecycle.w.a(r10)
            com.habitrpg.common.habitica.helpers.ExceptionHandler$Companion r0 = com.habitrpg.common.habitica.helpers.ExceptionHandler.Companion
            ad.h0 r5 = com.habitrpg.common.habitica.helpers.ExceptionHandler.Companion.coroutine$default(r0, r1, r2, r1)
            r6 = 0
            com.habitrpg.android.habitica.ui.activities.MainActivity$setUserData$3 r7 = new com.habitrpg.android.habitica.ui.activities.MainActivity$setUserData$3
            r7.<init>(r10, r11, r1)
            r8 = 2
            r9 = 0
            ad.g.d(r4, r5, r6, r7, r8, r9)
        Lbd:
            com.habitrpg.android.habitica.models.user.Flags r0 = r11.getFlags()
            if (r0 == 0) goto Lca
            boolean r0 = r0.getWelcomed()
            if (r0 != 0) goto Lca
            goto Lcb
        Lca:
            r2 = 0
        Lcb:
            if (r2 == 0) goto Ld8
            com.habitrpg.android.habitica.ui.viewmodels.MainActivityViewModel r0 = r10.getViewModel()
            java.lang.String r2 = "flags.welcomed"
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r0.updateUser(r2, r4)
        Ld8:
            com.habitrpg.android.habitica.databinding.ActivityMainBinding r0 = r10.getBinding()
            com.habitrpg.android.habitica.databinding.ActivityMainContentBinding r0 = r0.content
            android.widget.TextView r0 = r0.toolbarTitle
            java.lang.CharSequence r0 = r0.getText()
            qc.q.f(r0)
            boolean r0 = yc.m.u(r0)
            if (r0 == 0) goto Lf9
            com.habitrpg.android.habitica.ui.viewmodels.MainActivityViewModel r0 = r10.getViewModel()
            com.habitrpg.android.habitica.ui.activities.MainActivity$setUserData$4 r2 = new com.habitrpg.android.habitica.ui.activities.MainActivity$setUserData$4
            r2.<init>(r10)
            r0.getToolbarTitle(r3, r1, r1, r2)
        Lf9:
            r10.checkForReviewPrompt(r11)
        Lfc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.activities.MainActivity.setUserData(com.habitrpg.android.habitica.models.user.User):void");
    }

    private final void setupBottomnavigationLayoutListener() {
        getBinding().content.bottomNavigation.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.habitrpg.android.habitica.ui.activities.o1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                MainActivity.setupBottomnavigationLayoutListener$lambda$3(MainActivity.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupBottomnavigationLayoutListener$lambda$3(MainActivity mainActivity) {
        qc.q.i(mainActivity, "this$0");
        if (mainActivity.getBinding().content.bottomNavigation.getVisibility() == 0) {
            mainActivity.getSnackbarContainer().setPadding(0, 0, 0, mainActivity.getBinding().content.bottomNavigation.getBarHeight() + IntExtensionsKt.dpToPx(12, (Context) mainActivity));
        } else {
            mainActivity.getSnackbarContainer().setPadding(0, 0, 0, 0);
        }
    }

    private final void setupNotifications() {
        Object systemService;
        if (Build.VERSION.SDK_INT >= 26) {
            u7.c.a();
            NotificationChannel a10 = com.google.android.gms.ads.internal.util.j.a("default", "Habitica Notifications", 3);
            systemService = getSystemService(NotificationManager.class);
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(a10);
            }
        }
    }

    private final void updateToolbarTitle(androidx.navigation.i iVar, Bundle bundle) {
        String str;
        MainActivityViewModel viewModel = getViewModel();
        int n10 = iVar.n();
        CharSequence o10 = iVar.o();
        if (bundle != null) {
            str = bundle.getString(TaskFormActivity.TASK_TYPE_KEY);
        } else {
            str = null;
        }
        viewModel.getToolbarTitle(n10, o10, str, new MainActivity$updateToolbarTitle$1(this));
        NavigationDrawerFragment navigationDrawerFragment = this.drawerFragment;
        if (navigationDrawerFragment != null) {
            NavigationDrawerFragment.setSelection$default(navigationDrawerFragment, Integer.valueOf(iVar.n()), null, false, false, 8, null);
        }
    }

    private final void updateWidget(Class<?> cls) {
        Intent intent = new Intent(this, cls);
        intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
        intent.putExtra("appWidgetIds", AppWidgetManager.getInstance(getApplication()).getAppWidgetIds(new ComponentName(getApplication(), cls)));
        sendBroadcast(intent);
    }

    private final void updateWidgets() {
        updateWidget(AvatarStatsWidgetProvider.class);
        updateWidget(TodoListWidgetProvider.class);
        updateWidget(DailiesWidgetProvider.class);
        updateWidget(HabitButtonWidgetProvider.class);
    }

    public final void displayTaskScoringResponse$Habitica_2311256681_prodRelease(TaskScoringResult taskScoringResult) {
        boolean z10;
        Double valueOf;
        if (getViewModel().getUser().f() != null && taskScoringResult != null) {
            if (WhenMappings.$EnumSwitchMapping$0[this.userQuestStatus.ordinal()] == 1) {
                valueOf = taskScoringResult.getQuestDamage();
            } else {
                valueOf = Double.valueOf(0.0d);
            }
            ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new MainActivity$displayTaskScoringResponse$1(this, taskScoringResult, valueOf, null), 1, null);
        }
        if (this.userQuestStatus == UserQuestStatus.QUEST_COLLECT) {
            z10 = true;
        } else {
            z10 = false;
        }
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new MainActivity$displayTaskScoringResponse$2(this, taskScoringResult, z10, null), 1, null);
    }

    public final void displayTutorialStep(TutorialStep tutorialStep, List<String> list, boolean z10) {
        qc.q.i(tutorialStep, "step");
        qc.q.i(list, "texts");
        TutorialView tutorialView = new TutorialView(this, tutorialStep, getViewModel());
        tutorialView.setTutorialTexts(list);
        tutorialView.setCanBeDeferred(z10);
        RelativeLayout relativeLayout = getBinding().content.overlayFrameLayout;
        qc.q.h(relativeLayout, "overlayFrameLayout");
        for (View view : androidx.core.view.t0.a(relativeLayout)) {
            if (view instanceof TutorialView) {
                getBinding().content.overlayFrameLayout.removeView(view);
            }
        }
        getBinding().content.overlayFrameLayout.addView(tutorialView);
        getViewModel().logTutorialStatus(tutorialStep, false);
    }

    public final ApiClient getApiClient$Habitica_2311256681_prodRelease() {
        ApiClient apiClient = this.apiClient;
        if (apiClient != null) {
            return apiClient;
        }
        qc.q.z("apiClient");
        return null;
    }

    public final AppConfigManager getAppConfigManager$Habitica_2311256681_prodRelease() {
        AppConfigManager appConfigManager = this.appConfigManager;
        if (appConfigManager != null) {
            return appConfigManager;
        }
        qc.q.z("appConfigManager");
        return null;
    }

    public final ActivityMainBinding getBinding() {
        ActivityMainBinding activityMainBinding = this.binding;
        if (activityMainBinding != null) {
            return activityMainBinding;
        }
        qc.q.z("binding");
        return null;
    }

    public final CheckClassSelectionUseCase getCheckClassSelectionUseCase$Habitica_2311256681_prodRelease() {
        CheckClassSelectionUseCase checkClassSelectionUseCase = this.checkClassSelectionUseCase;
        if (checkClassSelectionUseCase != null) {
            return checkClassSelectionUseCase;
        }
        qc.q.z("checkClassSelectionUseCase");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    public View getContentView(Integer num) {
        ActivityMainBinding inflate = ActivityMainBinding.inflate(getLayoutInflater());
        qc.q.h(inflate, "inflate(...)");
        setBinding(inflate);
        DrawerLayout root = getBinding().getRoot();
        qc.q.h(root, "getRoot(...)");
        return root;
    }

    public final DisplayItemDropUseCase getDisplayItemDropUseCase$Habitica_2311256681_prodRelease() {
        DisplayItemDropUseCase displayItemDropUseCase = this.displayItemDropUseCase;
        if (displayItemDropUseCase != null) {
            return displayItemDropUseCase;
        }
        qc.q.z("displayItemDropUseCase");
        return null;
    }

    public final androidx.appcompat.app.b getDrawerToggle() {
        return this.drawerToggle;
    }

    public final InventoryRepository getInventoryRepository$Habitica_2311256681_prodRelease() {
        InventoryRepository inventoryRepository = this.inventoryRepository;
        if (inventoryRepository != null) {
            return inventoryRepository;
        }
        qc.q.z("inventoryRepository");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    protected Integer getLayoutResId() {
        return Integer.valueOf((int) R.layout.activity_main);
    }

    public final NotificationsViewModel getNotificationsViewModel() {
        return (NotificationsViewModel) this.notificationsViewModel$delegate.getValue();
    }

    public final NotifyUserUseCase getNotifyUserUseCase$Habitica_2311256681_prodRelease() {
        NotifyUserUseCase notifyUserUseCase = this.notifyUserUseCase;
        if (notifyUserUseCase != null) {
            return notifyUserUseCase;
        }
        qc.q.z("notifyUserUseCase");
        return null;
    }

    public final ReviewManager getReviewManager() {
        ReviewManager reviewManager = this.reviewManager;
        if (reviewManager != null) {
            return reviewManager;
        }
        qc.q.z("reviewManager");
        return null;
    }

    public final Boolean getShowBackButton() {
        return this.showBackButton;
    }

    public final boolean getShowBirthdayIcon() {
        return this.showBirthdayIcon;
    }

    public final ViewGroup getSnackbarContainer() {
        FrameLayout frameLayout = getBinding().content.snackbarContainer;
        qc.q.h(frameLayout, "snackbarContainer");
        return frameLayout;
    }

    public final SoundManager getSoundManager$Habitica_2311256681_prodRelease() {
        SoundManager soundManager = this.soundManager;
        if (soundManager != null) {
            return soundManager;
        }
        qc.q.z("soundManager");
        return null;
    }

    public final TaskRepository getTaskRepository$Habitica_2311256681_prodRelease() {
        TaskRepository taskRepository = this.taskRepository;
        if (taskRepository != null) {
            return taskRepository;
        }
        qc.q.z("taskRepository");
        return null;
    }

    public final MainActivityViewModel getViewModel() {
        return (MainActivityViewModel) this.viewModel$delegate.getValue();
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    public void hideConnectionProblem() {
        ad.x1 x1Var;
        ad.x1 x1Var2 = this.errorJob;
        boolean z10 = false;
        if (x1Var2 != null && !x1Var2.isCancelled()) {
            z10 = true;
        }
        if (z10 && (x1Var = this.errorJob) != null) {
            x1.a.a(x1Var, null, 1, null);
        }
        ad.g.d(androidx.lifecycle.w.a(this), ad.a1.c(), null, new MainActivity$hideConnectionProblem$1(this, null), 2, null);
    }

    public final boolean isAppBarExpanded() {
        if (getBinding().content.appbar.getHeight() - getBinding().content.appbar.getBottom() == 0) {
            return true;
        }
        return false;
    }

    public final void navigate(int i10) {
        k3.b.a(this, R.id.nav_host_fragment).O(i10);
    }

    public final void observeNotificationPermission() {
        getViewModel().getRequestNotificationPermission().j(this, new MainActivityKt$sam$androidx_lifecycle_Observer$0(new MainActivity$observeNotificationPermission$1(this)));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        NavigationDrawerFragment navigationDrawerFragment = this.drawerFragment;
        boolean z10 = false;
        if (navigationDrawerFragment != null && navigationDrawerFragment.isDrawerOpen()) {
            z10 = true;
        }
        if (z10) {
            NavigationDrawerFragment navigationDrawerFragment2 = this.drawerFragment;
            if (navigationDrawerFragment2 != null) {
                navigationDrawerFragment2.closeDrawer();
                return;
            }
            return;
        }
        try {
            super.onBackPressed();
        } catch (Exception unused) {
        }
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.appcompat.app.d, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        qc.q.i(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        androidx.appcompat.app.b bVar = this.drawerToggle;
        if (bVar != null) {
            bVar.onConfigurationChanged(configuration);
        }
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.fragment.app.q, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        try {
            this.launchTrace = s9.e.c().e("MainActivityLaunch");
        } catch (IllegalStateException e10) {
            ExceptionHandler.Companion.reportError(e10);
        }
        Trace trace = this.launchTrace;
        if (trace != null) {
            trace.start();
        }
        super.onCreate(bundle);
        DataBindingUtils.INSTANCE.setConfigManager(getAppConfigManager$Habitica_2311256681_prodRelease());
        if (!getViewModel().isAuthenticated()) {
            Intent intent = new Intent(this, IntroActivity.class);
            intent.addFlags(335577088);
            startActivity(intent);
            return;
        }
        Wearable.getCapabilityClient((Activity) this).addLocalCapability("provide_auth");
        setupToolbar(getBinding().content.toolbar);
        this.sideAvatarView = new AvatarView(this, true, false, false);
        getViewModel().getUser().j(this, new MainActivityKt$sam$androidx_lifecycle_Observer$0(new MainActivity$onCreate$1(this)));
        NavigationDrawerFragment navigationDrawerFragment = null;
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new MainActivity$onCreate$2(this, null), 1, null);
        final DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        Fragment i02 = getSupportFragmentManager().i0(R.id.navigation_drawer);
        if (i02 instanceof NavigationDrawerFragment) {
            navigationDrawerFragment = (NavigationDrawerFragment) i02;
        }
        this.drawerFragment = navigationDrawerFragment;
        if (navigationDrawerFragment != null) {
            qc.q.f(drawerLayout);
            navigationDrawerFragment.setUp(R.id.navigation_drawer, drawerLayout, getNotificationsViewModel());
        }
        androidx.appcompat.app.b bVar = new androidx.appcompat.app.b(this, drawerLayout) { // from class: com.habitrpg.android.habitica.ui.activities.MainActivity$onCreate$3
        };
        this.drawerToggle = bVar;
        drawerLayout.a(bVar);
        drawerLayout.a(new DrawerLayout.e() { // from class: com.habitrpg.android.habitica.ui.activities.MainActivity$onCreate$5
            private Boolean isOpeningDrawer;

            @Override // androidx.drawerlayout.widget.DrawerLayout.e
            public void onDrawerClosed(View view) {
                qc.q.i(view, "drawerView");
                if (!ContextExtensionsKt.isUsingNightModeResources(MainActivity.this)) {
                    Window window = MainActivity.this.getWindow();
                    qc.q.h(window, "getWindow(...)");
                    WindowExtensionsKt.updateStatusBarColor(window, ContextExtensionsKt.getThemeColor(MainActivity.this, R.attr.headerBackgroundColor), true);
                }
                this.isOpeningDrawer = null;
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout.e
            public void onDrawerOpened(View view) {
                NavigationDrawerFragment navigationDrawerFragment2;
                qc.q.i(view, "drawerView");
                ActivityExtensionKt.hideKeyboard(MainActivity.this);
                if (!ContextExtensionsKt.isUsingNightModeResources(MainActivity.this)) {
                    Window window = MainActivity.this.getWindow();
                    qc.q.h(window, "getWindow(...)");
                    WindowExtensionsKt.updateStatusBarColor(window, ContextExtensionsKt.getThemeColor(MainActivity.this, R.attr.colorPrimaryDark), false);
                }
                this.isOpeningDrawer = null;
                navigationDrawerFragment2 = MainActivity.this.drawerFragment;
                if (navigationDrawerFragment2 != null) {
                    navigationDrawerFragment2.updatePromo();
                }
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout.e
            public void onDrawerSlide(View view, float f10) {
                qc.q.i(view, "drawerView");
                if (!ContextExtensionsKt.isUsingNightModeResources(MainActivity.this)) {
                    if (f10 < 0.5f && this.isOpeningDrawer == null) {
                        Window window = MainActivity.this.getWindow();
                        qc.q.h(window, "getWindow(...)");
                        WindowExtensionsKt.updateStatusBarColor(window, ContextExtensionsKt.getThemeColor(MainActivity.this, R.attr.colorPrimaryDark), false);
                        this.isOpeningDrawer = Boolean.TRUE;
                    } else if (f10 > 0.5f && this.isOpeningDrawer == null) {
                        Window window2 = MainActivity.this.getWindow();
                        qc.q.h(window2, "getWindow(...)");
                        WindowExtensionsKt.updateStatusBarColor(window2, ContextExtensionsKt.getThemeColor(MainActivity.this, R.attr.headerBackgroundColor), true);
                        this.isOpeningDrawer = Boolean.FALSE;
                    }
                }
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout.e
            public void onDrawerStateChanged(int i10) {
            }
        });
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.t(true);
        }
        androidx.appcompat.app.a supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.B(true);
        }
        setupNotifications();
        setupBottomnavigationLayoutListener();
        getBinding().content.headerView.setContent(q0.c.c(-811683422, true, new MainActivity$onCreate$6(this)));
        getViewModel().onCreate();
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.appcompat.app.d, androidx.fragment.app.q, android.app.Activity
    public void onDestroy() {
        getUserRepository().close();
        getInventoryRepository$Habitica_2311256681_prodRelease().close();
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        qc.q.i(keyEvent, "event");
        if (i10 == 82) {
            NavigationDrawerFragment navigationDrawerFragment = this.drawerFragment;
            if (navigationDrawerFragment != null) {
                navigationDrawerFragment.openDrawer();
                return true;
            }
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        qc.q.i(menuItem, "item");
        if (getBinding().getRoot().getParent() instanceof DrawerLayout) {
            androidx.appcompat.app.b bVar = this.drawerToggle;
            boolean z10 = false;
            if (bVar != null && bVar.onOptionsItemSelected(menuItem)) {
                z10 = true;
            }
            if (z10) {
                return true;
            }
        }
        if (menuItem.getItemId() == 16908332) {
            if (!qc.q.d(this.showBackButton, Boolean.TRUE)) {
                NavigationDrawerFragment navigationDrawerFragment = this.drawerFragment;
                if (navigationDrawerFragment == null) {
                    return true;
                }
                navigationDrawerFragment.toggleDrawer();
                return true;
            }
            MainNavigationController.INSTANCE.navigateBack();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.fragment.app.q, android.app.Activity
    protected void onPause() {
        updateWidgets();
        super.onPause();
    }

    @Override // androidx.appcompat.app.d, android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        androidx.appcompat.app.b bVar = this.drawerToggle;
        if (bVar != null) {
            bVar.syncState();
        }
        this.launchScreen = getViewModel().getLaunchScreen();
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.fragment.app.q, android.app.Activity
    protected void onResume() {
        androidx.navigation.i D;
        boolean u10;
        super.onResume();
        getViewModel().onResume();
        Fragment i02 = getSupportFragmentManager().i0(R.id.nav_host_fragment);
        qc.q.g(i02, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        androidx.navigation.d f10 = ((NavHostFragment) i02).f();
        MainNavigationController.INSTANCE.setup(f10);
        f10.r(new d.c() { // from class: com.habitrpg.android.habitica.ui.activities.p1
            @Override // androidx.navigation.d.c
            public final void a(androidx.navigation.d dVar, androidx.navigation.i iVar, Bundle bundle) {
                MainActivity.onResume$lambda$4(MainActivity.this, dVar, iVar, bundle);
            }
        });
        if (Build.VERSION.SDK_INT >= 33) {
            observeNotificationPermission();
        }
        if (qc.q.d(this.launchScreen, "/party")) {
            BaseViewModelExtensionsKt.observeOnce(getViewModel().getUser(), this, new androidx.lifecycle.g0() { // from class: com.habitrpg.android.habitica.ui.activities.q1
                @Override // androidx.lifecycle.g0
                public final void onChanged(Object obj) {
                    MainActivity.onResume$lambda$5(MainActivity.this, (User) obj);
                }
            });
        }
        this.launchScreen = null;
        boolean z10 = false;
        if (!this.resumeFromActivity) {
            retrieveUser$default(this, false, 1, null);
            checkMaintenance();
        }
        this.resumeFromActivity = false;
        if (getIntent().hasExtra("notificationIdentifier") || getIntent().hasExtra("openURL")) {
            Long l10 = this.lastNotificationOpen;
            long longExtra = getIntent().getLongExtra("notificationTimeStamp", 0L);
            if (l10 == null || l10.longValue() != longExtra) {
                this.lastNotificationOpen = Long.valueOf(getIntent().getLongExtra("notificationTimeStamp", 0L));
                String stringExtra = getIntent().getStringExtra("notificationIdentifier");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                if (getIntent().hasExtra("sendAnalytics")) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("identifier", stringExtra);
                    Analytics.sendEvent$default(Analytics.INSTANCE, "open notification", EventCategory.BEHAVIOUR, HitType.EVENT, hashMap, null, 16, null);
                }
                retrieveUser(true);
                NotificationOpenHandler.Companion companion = NotificationOpenHandler.Companion;
                Intent intent = getIntent();
                qc.q.h(intent, "getIntent(...)");
                companion.handleOpenedByNotification(stringExtra, intent);
            }
        }
        Trace trace = this.launchTrace;
        if (trace != null) {
            trace.stop();
        }
        this.launchTrace = null;
        CharSequence text = getBinding().content.toolbarTitle.getText();
        if (text != null) {
            u10 = yc.v.u(text);
            if ((!u10) == true) {
                z10 = true;
            }
        }
        if (!z10 && (D = f10.D()) != null) {
            updateToolbarTitle(D, null);
        }
    }

    @Override // androidx.appcompat.app.d
    public boolean onSupportNavigateUp() {
        ActivityExtensionKt.hideKeyboard(this);
        onBackPressed();
        return true;
    }

    protected final void retrieveUser(boolean z10) {
        getViewModel().retrieveUser(z10);
    }

    public final void setApiClient$Habitica_2311256681_prodRelease(ApiClient apiClient) {
        qc.q.i(apiClient, "<set-?>");
        this.apiClient = apiClient;
    }

    public final void setAppConfigManager$Habitica_2311256681_prodRelease(AppConfigManager appConfigManager) {
        qc.q.i(appConfigManager, "<set-?>");
        this.appConfigManager = appConfigManager;
    }

    public final void setBinding(ActivityMainBinding activityMainBinding) {
        qc.q.i(activityMainBinding, "<set-?>");
        this.binding = activityMainBinding;
    }

    public final void setCheckClassSelectionUseCase$Habitica_2311256681_prodRelease(CheckClassSelectionUseCase checkClassSelectionUseCase) {
        qc.q.i(checkClassSelectionUseCase, "<set-?>");
        this.checkClassSelectionUseCase = checkClassSelectionUseCase;
    }

    public final void setDisplayItemDropUseCase$Habitica_2311256681_prodRelease(DisplayItemDropUseCase displayItemDropUseCase) {
        qc.q.i(displayItemDropUseCase, "<set-?>");
        this.displayItemDropUseCase = displayItemDropUseCase;
    }

    public final void setDrawerToggle(androidx.appcompat.app.b bVar) {
        this.drawerToggle = bVar;
    }

    public final void setInventoryRepository$Habitica_2311256681_prodRelease(InventoryRepository inventoryRepository) {
        qc.q.i(inventoryRepository, "<set-?>");
        this.inventoryRepository = inventoryRepository;
    }

    public final void setNotifyUserUseCase$Habitica_2311256681_prodRelease(NotifyUserUseCase notifyUserUseCase) {
        qc.q.i(notifyUserUseCase, "<set-?>");
        this.notifyUserUseCase = notifyUserUseCase;
    }

    public final void setReviewManager(ReviewManager reviewManager) {
        qc.q.i(reviewManager, "<set-?>");
        this.reviewManager = reviewManager;
    }

    public final void setShowBackButton(Boolean bool) {
        if (qc.q.d(this.showBackButton, bool)) {
            return;
        }
        if (qc.q.d(bool, Boolean.TRUE) && this.showBirthdayIcon) {
            androidx.appcompat.app.b bVar = this.drawerToggle;
            if (bVar != null) {
                bVar.setDrawerIndicatorEnabled(false);
            }
            androidx.appcompat.app.b bVar2 = this.drawerToggle;
            if (bVar2 != null) {
                bVar2.setHomeAsUpIndicator(R.drawable.arrow_back);
            }
        } else if (qc.q.d(bool, Boolean.FALSE) && this.showBirthdayIcon) {
            androidx.appcompat.app.b bVar3 = this.drawerToggle;
            if (bVar3 != null) {
                bVar3.setDrawerIndicatorEnabled(false);
            }
            androidx.appcompat.app.b bVar4 = this.drawerToggle;
            if (bVar4 != null) {
                bVar4.setHomeAsUpIndicator(R.drawable.icon_birthday);
            }
        } else {
            androidx.appcompat.app.b bVar5 = this.drawerToggle;
            if (bVar5 != null) {
                bVar5.setDrawerIndicatorEnabled(!qc.q.d(bool, r0));
            }
        }
        this.showBackButton = bool;
    }

    public final void setShowBirthdayIcon(boolean z10) {
        this.showBirthdayIcon = z10;
    }

    public final void setSoundManager$Habitica_2311256681_prodRelease(SoundManager soundManager) {
        qc.q.i(soundManager, "<set-?>");
        this.soundManager = soundManager;
    }

    public final void setTaskRepository$Habitica_2311256681_prodRelease(TaskRepository taskRepository) {
        qc.q.i(taskRepository, "<set-?>");
        this.taskRepository = taskRepository;
    }

    @Override // android.app.Activity
    public void setTitle(CharSequence charSequence) {
        getBinding().content.toolbarTitle.setText(charSequence);
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    public void showConnectionProblem(int i10, String str, String str2) {
        boolean z10;
        ad.x1 x1Var;
        qc.q.i(str2, "message");
        if (i10 == 1) {
            SnackbarActivity.DefaultImpls.showSnackbar$default(this, null, str, str2, null, null, null, null, HabiticaSnackbar.SnackbarDisplayType.FAILURE, false, 377, null);
        } else if (str != null) {
            super.showConnectionProblem(i10, str, str2);
        } else {
            ad.x1 x1Var2 = this.errorJob;
            if (x1Var2 != null && !x1Var2.isCancelled()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && (x1Var = this.errorJob) != null) {
                x1.a.a(x1Var, null, 1, null);
            }
            getBinding().content.connectionIssueView.setVisibility(0);
            getBinding().content.connectionIssueTextview.setText(str2);
            this.errorJob = ad.g.d(androidx.lifecycle.w.a(this), ad.a1.c(), null, new MainActivity$showConnectionProblem$1(this, null), 2, null);
        }
    }

    @Override // com.habitrpg.android.habitica.ui.views.SnackbarActivity
    public void showSnackbar(Drawable drawable, CharSequence charSequence, CharSequence charSequence2, View view, Drawable drawable2, Integer num, String str, HabiticaSnackbar.SnackbarDisplayType snackbarDisplayType, boolean z10) {
        SnackbarActivity.DefaultImpls.showSnackbar(this, drawable, charSequence, charSequence2, view, drawable2, num, str, snackbarDisplayType, z10);
    }

    @Override // com.habitrpg.android.habitica.ui.views.SnackbarActivity
    public ViewGroup snackbarContainer() {
        return getSnackbarContainer();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        this.resumeFromActivity = true;
        super.startActivity(intent);
    }

    public final void updateToolbarInteractivity(boolean z10) {
        int i10;
        getViewModel().getCanShowTeamPlanHeader().setValue(Boolean.valueOf(z10));
        Drawable background = getBinding().content.toolbarTitle.getBackground();
        if (background != null) {
            if (z10) {
                i10 = 255;
            } else {
                i10 = 0;
            }
            background.setAlpha(i10);
        }
        if (z10) {
            TextView textView = getBinding().content.toolbarTitle;
            qc.q.h(textView, "toolbarTitle");
            ViewExtKt.setScaledPadding(textView, this, 16, 4, 16, 4);
            return;
        }
        TextView textView2 = getBinding().content.toolbarTitle;
        qc.q.h(textView2, "toolbarTitle");
        textView2.setPadding(0, 0, 0, 0);
    }

    @Override // android.app.Activity
    public void setTitle(int i10) {
        getBinding().content.toolbarTitle.setText(getString(i10));
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent, Bundle bundle) {
        this.resumeFromActivity = true;
        super.startActivity(intent, bundle);
    }
}
