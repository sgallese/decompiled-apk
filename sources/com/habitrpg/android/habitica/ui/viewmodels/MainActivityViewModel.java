package com.habitrpg.android.habitica.ui.viewmodels;

import ad.g;
import android.content.SharedPreferences;
import androidx.lifecycle.f0;
import androidx.lifecycle.w0;
import com.habitrpg.android.habitica.api.MaintenanceApiService;
import com.habitrpg.android.habitica.data.ContentRepository;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.Analytics;
import com.habitrpg.android.habitica.helpers.EventCategory;
import com.habitrpg.android.habitica.helpers.HitType;
import com.habitrpg.android.habitica.helpers.TaskAlarmManager;
import com.habitrpg.android.habitica.helpers.notifications.PushNotificationManager;
import com.habitrpg.android.habitica.models.TutorialStep;
import com.habitrpg.android.habitica.ui.TutorialView;
import com.habitrpg.common.habitica.api.HostConfig;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.shared.habitica.models.responses.MaintenanceResponse;
import dc.w;
import j0.j1;
import j0.y2;
import java.util.Date;
import java.util.HashMap;
import pc.l;
import qc.q;

/* compiled from: MainActivityViewModel.kt */
/* loaded from: classes4.dex */
public final class MainActivityViewModel extends BaseViewModel implements TutorialView.OnTutorialReaction {
    public static final int $stable = 8;
    private final j1<Boolean> canShowTeamPlanHeader;
    private final ContentRepository contentRepository;
    private final HostConfig hostConfig;
    private final InventoryRepository inventoryRepository;
    private final MaintenanceApiService maintenanceService;
    private final PushNotificationManager pushNotificationManager;
    private f0<Boolean> requestNotificationPermission;
    private final SharedPreferences sharedPreferences;
    private final TaskAlarmManager taskAlarmManager;
    private final TaskRepository taskRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivityViewModel(UserRepository userRepository, MainUserViewModel mainUserViewModel, HostConfig hostConfig, PushNotificationManager pushNotificationManager, SharedPreferences sharedPreferences, ContentRepository contentRepository, TaskRepository taskRepository, InventoryRepository inventoryRepository, TaskAlarmManager taskAlarmManager, MaintenanceApiService maintenanceApiService) {
        super(userRepository, mainUserViewModel);
        q.i(userRepository, "userRepository");
        q.i(mainUserViewModel, "userViewModel");
        q.i(hostConfig, "hostConfig");
        q.i(pushNotificationManager, "pushNotificationManager");
        q.i(sharedPreferences, "sharedPreferences");
        q.i(contentRepository, "contentRepository");
        q.i(taskRepository, "taskRepository");
        q.i(inventoryRepository, "inventoryRepository");
        q.i(taskAlarmManager, "taskAlarmManager");
        q.i(maintenanceApiService, "maintenanceService");
        this.hostConfig = hostConfig;
        this.pushNotificationManager = pushNotificationManager;
        this.sharedPreferences = sharedPreferences;
        this.contentRepository = contentRepository;
        this.taskRepository = taskRepository;
        this.inventoryRepository = inventoryRepository;
        this.taskAlarmManager = taskAlarmManager;
        this.maintenanceService = maintenanceApiService;
        Boolean bool = Boolean.FALSE;
        this.requestNotificationPermission = new f0<>(bool);
        this.canShowTeamPlanHeader = y2.i(bool, null, 2, null);
    }

    public static /* synthetic */ void retrieveUser$default(MainActivityViewModel mainActivityViewModel, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        mainActivityViewModel.retrieveUser(z10);
    }

    public final j1<Boolean> getCanShowTeamPlanHeader() {
        return this.canShowTeamPlanHeader;
    }

    public final ContentRepository getContentRepository() {
        return this.contentRepository;
    }

    public final HostConfig getHostConfig() {
        return this.hostConfig;
    }

    public final InventoryRepository getInventoryRepository() {
        return this.inventoryRepository;
    }

    public final String getLaunchScreen() {
        return this.sharedPreferences.getString("launch_screen", "");
    }

    public final MaintenanceApiService getMaintenanceService() {
        return this.maintenanceService;
    }

    public final String getPreferenceLanguage() {
        return this.sharedPreferences.getString("language", "en");
    }

    public final PushNotificationManager getPushNotificationManager() {
        return this.pushNotificationManager;
    }

    public final f0<Boolean> getRequestNotificationPermission() {
        return this.requestNotificationPermission;
    }

    public final SharedPreferences getSharedPreferences() {
        return this.sharedPreferences;
    }

    public final TaskAlarmManager getTaskAlarmManager() {
        return this.taskAlarmManager;
    }

    public final TaskRepository getTaskRepository() {
        return this.taskRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        if (r11 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getToolbarTitle(int r10, java.lang.CharSequence r11, java.lang.String r12, pc.l<? super java.lang.CharSequence, dc.w> r13) {
        /*
            r9 = this;
            java.lang.String r0 = "onSuccess"
            qc.q.i(r13, r0)
            r0 = 2131297085(0x7f09033d, float:1.8212105E38)
            r1 = 0
            r2 = 1
            if (r10 == r0) goto L60
            r0 = 2131297237(0x7f0903d5, float:1.8212413E38)
            if (r10 == r0) goto L60
            r12 = 2131297276(0x7f0903fc, float:1.8212492E38)
            java.lang.String r0 = ""
            if (r10 != r12) goto L1a
        L18:
            r11 = r0
            goto L5c
        L1a:
            r10 = 0
            if (r11 == 0) goto L26
            int r12 = r11.length()
            if (r12 != 0) goto L24
            goto L26
        L24:
            r12 = 0
            goto L27
        L26:
            r12 = 1
        L27:
            if (r12 == 0) goto L59
            androidx.lifecycle.LiveData r12 = r9.getUser()
            java.lang.Object r12 = r12.f()
            com.habitrpg.android.habitica.models.user.User r12 = (com.habitrpg.android.habitica.models.user.User) r12
            if (r12 == 0) goto L3c
            boolean r12 = r12.isValid()
            if (r12 != r2) goto L3c
            goto L3d
        L3c:
            r2 = 0
        L3d:
            if (r2 == 0) goto L59
            androidx.lifecycle.LiveData r10 = r9.getUser()
            java.lang.Object r10 = r10.f()
            com.habitrpg.android.habitica.models.user.User r10 = (com.habitrpg.android.habitica.models.user.User) r10
            if (r10 == 0) goto L57
            com.habitrpg.android.habitica.models.user.Profile r10 = r10.getProfile()
            if (r10 == 0) goto L57
            java.lang.String r10 = r10.getName()
            r11 = r10
            goto L5c
        L57:
            r11 = r1
            goto L5c
        L59:
            if (r11 != 0) goto L5c
            goto L18
        L5c:
            r13.invoke(r11)
            goto L72
        L60:
            ad.k0 r11 = androidx.lifecycle.w0.a(r9)
            com.habitrpg.android.habitica.ui.viewmodels.MainActivityViewModel$getToolbarTitle$1 r0 = new com.habitrpg.android.habitica.ui.viewmodels.MainActivityViewModel$getToolbarTitle$1
            r8 = 0
            r3 = r0
            r4 = r9
            r5 = r12
            r6 = r13
            r7 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            com.habitrpg.common.habitica.helpers.ExceptionHandlerKt.launchCatching$default(r11, r1, r0, r2, r1)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.viewmodels.MainActivityViewModel.getToolbarTitle(int, java.lang.CharSequence, java.lang.String, pc.l):void");
    }

    public final void ifNeedsMaintenance(l<? super MaintenanceResponse, w> lVar) {
        q.i(lVar, "onResult");
        ExceptionHandlerKt.launchCatching$default(w0.a(this), null, new MainActivityViewModel$ifNeedsMaintenance$1(this, lVar, null), 1, null);
    }

    public final boolean isAuthenticated() {
        return this.hostConfig.hasAuthentication();
    }

    public final void logTutorialStatus(TutorialStep tutorialStep, boolean z10) {
        q.i(tutorialStep, "step");
        HashMap hashMap = new HashMap();
        hashMap.put("eventLabel", tutorialStep.getIdentifier() + "-android");
        String identifier = tutorialStep.getIdentifier();
        if (identifier == null) {
            identifier = "";
        }
        hashMap.put("eventValue", identifier);
        hashMap.put("complete", Boolean.valueOf(z10));
        Analytics.sendEvent$default(Analytics.INSTANCE, "tutorial", EventCategory.BEHAVIOUR, HitType.EVENT, hashMap, null, 16, null);
    }

    @Override // com.habitrpg.android.habitica.ui.viewmodels.BaseViewModel, androidx.lifecycle.v0
    protected void onCleared() {
        this.taskRepository.close();
        this.inventoryRepository.close();
        this.contentRepository.close();
        super.onCleared();
    }

    public final void onCreate() {
        try {
            g.d(w0.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new MainActivityViewModel$onCreate$1(this, null), 2, null);
        } catch (Exception e10) {
            Analytics.INSTANCE.logException(e10);
        }
    }

    public final void onResume() {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putLong("lastAppLaunch", new Date().getTime());
        edit.putBoolean("preventDailyReminder", false);
        edit.apply();
    }

    @Override // com.habitrpg.android.habitica.ui.TutorialView.OnTutorialReaction
    public void onTutorialCompleted(TutorialStep tutorialStep) {
        q.i(tutorialStep, "step");
        updateUser("flags.tutorial." + tutorialStep.getTutorialGroup() + "." + tutorialStep.getIdentifier(), Boolean.TRUE);
        logTutorialStatus(tutorialStep, true);
    }

    @Override // com.habitrpg.android.habitica.ui.TutorialView.OnTutorialReaction
    public void onTutorialDeferred(TutorialStep tutorialStep) {
        q.i(tutorialStep, "step");
        this.taskRepository.modify(tutorialStep, MainActivityViewModel$onTutorialDeferred$1.INSTANCE);
    }

    public final void retrieveUser(boolean z10) {
        if (this.hostConfig.hasAuthentication()) {
            g.d(w0.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new MainActivityViewModel$retrieveUser$1(this, z10, null), 2, null);
            ExceptionHandlerKt.launchCatching$default(w0.a(this), null, new MainActivityViewModel$retrieveUser$2(this, null), 1, null);
        }
    }

    public final void setPreferenceLanguage(String str) {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putString("language", str);
        edit.apply();
    }

    public final void setRequestNotificationPermission(f0<Boolean> f0Var) {
        q.i(f0Var, "<set-?>");
        this.requestNotificationPermission = f0Var;
    }

    public final void updateAllowPushNotifications(boolean z10) {
        this.sharedPreferences.getBoolean("usePushNotifications", true);
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putBoolean("usePushNotifications", z10);
        edit.apply();
    }
}
