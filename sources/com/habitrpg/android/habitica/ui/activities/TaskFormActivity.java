package com.habitrpg.android.habitica.ui.activities;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.textfield.TextInputLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.ChallengeRepository;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.TagRepository;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.databinding.ActivityTaskFormBinding;
import com.habitrpg.android.habitica.extensions.OnChangeTextWatcher;
import com.habitrpg.android.habitica.helpers.TaskAlarmManager;
import com.habitrpg.android.habitica.helpers.notifications.PushNotificationManager;
import com.habitrpg.android.habitica.models.Tag;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.social.Challenge;
import com.habitrpg.android.habitica.models.tasks.GroupAssignedDetails;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.models.tasks.TaskGroupPlan;
import com.habitrpg.android.habitica.ui.helpers.KeyboardUtilKt;
import com.habitrpg.android.habitica.ui.helpers.ToolbarColorHelper;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.android.habitica.ui.viewmodels.TaskFormViewModel;
import com.habitrpg.android.habitica.ui.views.BottomSheetUtilsKt;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.android.habitica.ui.views.tasks.form.ChecklistContainer;
import com.habitrpg.android.habitica.ui.views.tasks.form.ReminderContainer;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.extensions.IntExtensionsKt;
import com.habitrpg.shared.habitica.models.tasks.TaskType;
import j0.y2;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: TaskFormActivity.kt */
/* loaded from: classes4.dex */
public final class TaskFormActivity extends Hilt_TaskFormActivity {
    public static final String GROUP_ID_KEY = "groupId";
    public static final String IS_CHALLENGE_TASK = "isChallengeTask";
    public static final String PARCELABLE_TASK = "parcelable_task";
    public static final String SELECTED_TAGS_KEY = "selectedTags";
    public static final String SET_IGNORE_FLAG = "ignoreFlag";
    public static final String TASK_ID_KEY = "taskId";
    public static final String TASK_TYPE_KEY = "type";
    public static final String TASK_VALUE_KEY = "taskValue";
    public static final String USER_ID_KEY = "userId";
    private t0.r<String> assignedIDs;
    private ActivityTaskFormBinding binding;
    private boolean canSave;
    private Challenge challenge;
    public ChallengeRepository challengeRepository;
    private String groupID;
    private t0.r<Member> groupMembers;
    private boolean hasPreselectedTags;
    private Task initialTaskInstance;
    private boolean isChallengeTask;
    private boolean isCreating;
    private boolean isDiscardCancelled;
    private boolean isSaving;
    private final androidx.activity.result.b<String> notificationPermissionLauncher;
    private ArrayList<String> preselectedTags;
    public PushNotificationManager pushNotificationManager;
    public SharedPreferences sharedPreferences;
    public SocialRepository socialRepository;
    public TagRepository tagRepository;
    private List<? extends Tag> tags;
    private Task task;
    public TaskAlarmManager taskAlarmManager;
    private t0.t<String, Date> taskCompletedMap;
    public TaskRepository taskRepository;
    private TaskType taskType;
    private int tintColor;
    private boolean userScrolled;
    public MainUserViewModel userViewModel;
    private boolean usesTaskAttributeStats;
    private final dc.f viewModel$delegate = new androidx.lifecycle.x0(qc.g0.b(TaskFormViewModel.class), new TaskFormActivity$special$$inlined$viewModels$default$2(this), new TaskFormActivity$special$$inlined$viewModels$default$1(this), new TaskFormActivity$special$$inlined$viewModels$default$3(null, this));
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: TaskFormActivity.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(qc.h hVar) {
            this();
        }
    }

    /* compiled from: TaskFormActivity.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TaskType.values().length];
            try {
                iArr[TaskType.DAILY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TaskType.TODO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TaskType.REWARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TaskType.HABIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TaskFormActivity() {
        List<? extends Tag> i10;
        androidx.activity.result.b<String> registerForActivityResult = registerForActivityResult(new f.c(), new androidx.activity.result.a() { // from class: com.habitrpg.android.habitica.ui.activities.o2
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                TaskFormActivity.notificationPermissionLauncher$lambda$0(TaskFormActivity.this, (Boolean) obj);
            }
        });
        qc.q.h(registerForActivityResult, "registerForActivityResult(...)");
        this.notificationPermissionLauncher = registerForActivityResult;
        this.isCreating = true;
        this.taskType = TaskType.HABIT;
        i10 = ec.t.i();
        this.tags = i10;
        this.groupMembers = y2.e();
        this.assignedIDs = y2.e();
        this.taskCompletedMap = y2.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkCanSave() {
        boolean u10;
        ActivityTaskFormBinding activityTaskFormBinding = this.binding;
        if (activityTaskFormBinding == null) {
            qc.q.z("binding");
            activityTaskFormBinding = null;
        }
        Editable text = activityTaskFormBinding.textEditText.getText();
        boolean z10 = false;
        if (text != null) {
            u10 = yc.v.u(text);
            if ((!u10) == true) {
                z10 = true;
            }
        }
        setCanSave(z10);
    }

    private final void checkIfShowNotifLayout() {
        ActivityTaskFormBinding activityTaskFormBinding = null;
        if (!getPushNotificationManager().notificationPermissionEnabled() && Build.VERSION.SDK_INT >= 33) {
            ActivityTaskFormBinding activityTaskFormBinding2 = this.binding;
            if (activityTaskFormBinding2 == null) {
                qc.q.z("binding");
                activityTaskFormBinding2 = null;
            }
            activityTaskFormBinding2.notificationsDisabledLayout.setVisibility(0);
            ActivityTaskFormBinding activityTaskFormBinding3 = this.binding;
            if (activityTaskFormBinding3 == null) {
                qc.q.z("binding");
                activityTaskFormBinding3 = null;
            }
            activityTaskFormBinding3.remindersContainer.setShouldShowNotifPermission(true);
            ActivityTaskFormBinding activityTaskFormBinding4 = this.binding;
            if (activityTaskFormBinding4 == null) {
                qc.q.z("binding");
            } else {
                activityTaskFormBinding = activityTaskFormBinding4;
            }
            activityTaskFormBinding.remindersContainer.setShowNotifPermission(new TaskFormActivity$checkIfShowNotifLayout$1(this));
            return;
        }
        ActivityTaskFormBinding activityTaskFormBinding5 = this.binding;
        if (activityTaskFormBinding5 == null) {
            qc.q.z("binding");
            activityTaskFormBinding5 = null;
        }
        activityTaskFormBinding5.remindersContainer.setShouldShowNotifPermission(false);
        ActivityTaskFormBinding activityTaskFormBinding6 = this.binding;
        if (activityTaskFormBinding6 == null) {
            qc.q.z("binding");
        } else {
            activityTaskFormBinding = activityTaskFormBinding6;
        }
        activityTaskFormBinding.notificationsDisabledLayout.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureForm() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        String string = getSharedPreferences().getString("FirstDayOfTheWeek", "-1");
        if (string != null) {
            i10 = Integer.parseInt(string);
        } else {
            i10 = -1;
        }
        TaskType taskType = this.taskType;
        TaskType taskType2 = TaskType.HABIT;
        int i22 = 0;
        if (taskType == taskType2) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        ActivityTaskFormBinding activityTaskFormBinding = this.binding;
        ActivityTaskFormBinding activityTaskFormBinding2 = null;
        if (activityTaskFormBinding == null) {
            qc.q.z("binding");
            activityTaskFormBinding = null;
        }
        activityTaskFormBinding.habitScoringButtons.setVisibility(i11);
        ActivityTaskFormBinding activityTaskFormBinding3 = this.binding;
        if (activityTaskFormBinding3 == null) {
            qc.q.z("binding");
            activityTaskFormBinding3 = null;
        }
        activityTaskFormBinding3.habitResetStreakTitleView.setVisibility(i11);
        ActivityTaskFormBinding activityTaskFormBinding4 = this.binding;
        if (activityTaskFormBinding4 == null) {
            qc.q.z("binding");
            activityTaskFormBinding4 = null;
        }
        activityTaskFormBinding4.habitResetStreakButtons.setVisibility(i11);
        ActivityTaskFormBinding activityTaskFormBinding5 = this.binding;
        if (activityTaskFormBinding5 == null) {
            qc.q.z("binding");
            activityTaskFormBinding5 = null;
        }
        ViewParent parent = activityTaskFormBinding5.habitAdjustNegativeStreakView.getParent();
        qc.q.g(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent).setVisibility(i11);
        TaskType taskType3 = this.taskType;
        TaskType taskType4 = TaskType.DAILY;
        if (taskType3 != taskType4 && taskType3 != taskType2) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        ActivityTaskFormBinding activityTaskFormBinding6 = this.binding;
        if (activityTaskFormBinding6 == null) {
            qc.q.z("binding");
            activityTaskFormBinding6 = null;
        }
        activityTaskFormBinding6.adjustStreakTitleView.setVisibility(i12);
        ActivityTaskFormBinding activityTaskFormBinding7 = this.binding;
        if (activityTaskFormBinding7 == null) {
            qc.q.z("binding");
            activityTaskFormBinding7 = null;
        }
        activityTaskFormBinding7.adjustStreakWrapper.setVisibility(i12);
        if (this.taskType == taskType2) {
            ActivityTaskFormBinding activityTaskFormBinding8 = this.binding;
            if (activityTaskFormBinding8 == null) {
                qc.q.z("binding");
                activityTaskFormBinding8 = null;
            }
            activityTaskFormBinding8.habitAdjustPositiveInputLayout.setHint(getString(R.string.positive_habit_form));
            ActivityTaskFormBinding activityTaskFormBinding9 = this.binding;
            if (activityTaskFormBinding9 == null) {
                qc.q.z("binding");
                activityTaskFormBinding9 = null;
            }
            activityTaskFormBinding9.adjustStreakTitleView.setText(getString(R.string.adjust_counter));
        } else {
            ActivityTaskFormBinding activityTaskFormBinding10 = this.binding;
            if (activityTaskFormBinding10 == null) {
                qc.q.z("binding");
                activityTaskFormBinding10 = null;
            }
            activityTaskFormBinding10.habitAdjustPositiveInputLayout.setHint(getString(R.string.streak));
            ActivityTaskFormBinding activityTaskFormBinding11 = this.binding;
            if (activityTaskFormBinding11 == null) {
                qc.q.z("binding");
                activityTaskFormBinding11 = null;
            }
            activityTaskFormBinding11.adjustStreakTitleView.setText(getString(R.string.adjust_streak));
        }
        TaskType taskType5 = this.taskType;
        if (taskType5 != taskType4 && taskType5 != TaskType.TODO) {
            i13 = 8;
        } else {
            i13 = 0;
        }
        ActivityTaskFormBinding activityTaskFormBinding12 = this.binding;
        if (activityTaskFormBinding12 == null) {
            qc.q.z("binding");
            activityTaskFormBinding12 = null;
        }
        TextView textView = activityTaskFormBinding12.checklistTitleView;
        if (this.isChallengeTask) {
            i14 = 8;
        } else {
            i14 = i13;
        }
        textView.setVisibility(i14);
        ActivityTaskFormBinding activityTaskFormBinding13 = this.binding;
        if (activityTaskFormBinding13 == null) {
            qc.q.z("binding");
            activityTaskFormBinding13 = null;
        }
        ChecklistContainer checklistContainer = activityTaskFormBinding13.checklistContainer;
        if (this.isChallengeTask) {
            i15 = 8;
        } else {
            i15 = i13;
        }
        checklistContainer.setVisibility(i15);
        ActivityTaskFormBinding activityTaskFormBinding14 = this.binding;
        if (activityTaskFormBinding14 == null) {
            qc.q.z("binding");
            activityTaskFormBinding14 = null;
        }
        TextView textView2 = activityTaskFormBinding14.remindersTitleView;
        if (this.isChallengeTask) {
            i16 = 8;
        } else {
            i16 = i13;
        }
        textView2.setVisibility(i16);
        ActivityTaskFormBinding activityTaskFormBinding15 = this.binding;
        if (activityTaskFormBinding15 == null) {
            qc.q.z("binding");
            activityTaskFormBinding15 = null;
        }
        ReminderContainer reminderContainer = activityTaskFormBinding15.remindersContainer;
        if (this.isChallengeTask) {
            i17 = 8;
        } else {
            i17 = i13;
        }
        reminderContainer.setVisibility(i17);
        ActivityTaskFormBinding activityTaskFormBinding16 = this.binding;
        if (activityTaskFormBinding16 == null) {
            qc.q.z("binding");
            activityTaskFormBinding16 = null;
        }
        activityTaskFormBinding16.remindersContainer.setTaskType(this.taskType);
        ActivityTaskFormBinding activityTaskFormBinding17 = this.binding;
        if (activityTaskFormBinding17 == null) {
            qc.q.z("binding");
            activityTaskFormBinding17 = null;
        }
        activityTaskFormBinding17.remindersContainer.setFirstDayOfWeek(Integer.valueOf(i10));
        ActivityTaskFormBinding activityTaskFormBinding18 = this.binding;
        if (activityTaskFormBinding18 == null) {
            qc.q.z("binding");
            activityTaskFormBinding18 = null;
        }
        activityTaskFormBinding18.schedulingTitleView.setVisibility(i13);
        ActivityTaskFormBinding activityTaskFormBinding19 = this.binding;
        if (activityTaskFormBinding19 == null) {
            qc.q.z("binding");
            activityTaskFormBinding19 = null;
        }
        activityTaskFormBinding19.taskSchedulingControls.setVisibility(i13);
        ActivityTaskFormBinding activityTaskFormBinding20 = this.binding;
        if (activityTaskFormBinding20 == null) {
            qc.q.z("binding");
            activityTaskFormBinding20 = null;
        }
        activityTaskFormBinding20.taskSchedulingControls.setTaskType(this.taskType);
        ActivityTaskFormBinding activityTaskFormBinding21 = this.binding;
        if (activityTaskFormBinding21 == null) {
            qc.q.z("binding");
            activityTaskFormBinding21 = null;
        }
        activityTaskFormBinding21.taskSchedulingControls.setFirstDayOfWeek(i10);
        TaskType taskType6 = this.taskType;
        TaskType taskType7 = TaskType.REWARD;
        if (taskType6 == taskType7) {
            i18 = 8;
        } else {
            i18 = 0;
        }
        ActivityTaskFormBinding activityTaskFormBinding22 = this.binding;
        if (activityTaskFormBinding22 == null) {
            qc.q.z("binding");
            activityTaskFormBinding22 = null;
        }
        activityTaskFormBinding22.taskDifficultyTitleView.setVisibility(i18);
        ActivityTaskFormBinding activityTaskFormBinding23 = this.binding;
        if (activityTaskFormBinding23 == null) {
            qc.q.z("binding");
            activityTaskFormBinding23 = null;
        }
        activityTaskFormBinding23.taskDifficultyButtons.setVisibility(i18);
        if (this.taskType == taskType7) {
            i19 = 0;
        } else {
            i19 = 8;
        }
        ActivityTaskFormBinding activityTaskFormBinding24 = this.binding;
        if (activityTaskFormBinding24 == null) {
            qc.q.z("binding");
            activityTaskFormBinding24 = null;
        }
        activityTaskFormBinding24.rewardValueTitleView.setVisibility(i19);
        ActivityTaskFormBinding activityTaskFormBinding25 = this.binding;
        if (activityTaskFormBinding25 == null) {
            qc.q.z("binding");
            activityTaskFormBinding25 = null;
        }
        activityTaskFormBinding25.rewardValue.setVisibility(i19);
        ActivityTaskFormBinding activityTaskFormBinding26 = this.binding;
        if (activityTaskFormBinding26 == null) {
            qc.q.z("binding");
            activityTaskFormBinding26 = null;
        }
        TextView textView3 = activityTaskFormBinding26.tagsTitleView;
        if (this.isChallengeTask) {
            i20 = 8;
        } else {
            i20 = 0;
        }
        textView3.setVisibility(i20);
        ActivityTaskFormBinding activityTaskFormBinding27 = this.binding;
        if (activityTaskFormBinding27 == null) {
            qc.q.z("binding");
            activityTaskFormBinding27 = null;
        }
        LinearLayout linearLayout = activityTaskFormBinding27.tagsWrapper;
        if (this.isChallengeTask) {
            i21 = 8;
        } else {
            i21 = 0;
        }
        linearLayout.setVisibility(i21);
        ActivityTaskFormBinding activityTaskFormBinding28 = this.binding;
        if (activityTaskFormBinding28 == null) {
            qc.q.z("binding");
            activityTaskFormBinding28 = null;
        }
        LinearLayout linearLayout2 = activityTaskFormBinding28.statWrapper;
        if (!this.usesTaskAttributeStats) {
            i22 = 8;
        }
        linearLayout2.setVisibility(i22);
        if (this.isCreating) {
            ActivityTaskFormBinding activityTaskFormBinding29 = this.binding;
            if (activityTaskFormBinding29 == null) {
                qc.q.z("binding");
                activityTaskFormBinding29 = null;
            }
            activityTaskFormBinding29.adjustStreakTitleView.setVisibility(8);
            ActivityTaskFormBinding activityTaskFormBinding30 = this.binding;
            if (activityTaskFormBinding30 == null) {
                qc.q.z("binding");
                activityTaskFormBinding30 = null;
            }
            activityTaskFormBinding30.adjustStreakWrapper.setVisibility(8);
            if (this.groupID != null) {
                ActivityTaskFormBinding activityTaskFormBinding31 = this.binding;
                if (activityTaskFormBinding31 == null) {
                    qc.q.z("binding");
                    activityTaskFormBinding31 = null;
                }
                activityTaskFormBinding31.habitResetStreakTitleView.setVisibility(8);
                ActivityTaskFormBinding activityTaskFormBinding32 = this.binding;
                if (activityTaskFormBinding32 == null) {
                    qc.q.z("binding");
                } else {
                    activityTaskFormBinding2 = activityTaskFormBinding32;
                }
                activityTaskFormBinding2.habitResetStreakButtons.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.habitrpg.android.habitica.models.tasks.Task configureTask(com.habitrpg.android.habitica.models.tasks.Task r9) {
        /*
            Method dump skipped, instructions count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.activities.TaskFormActivity.configureTask(com.habitrpg.android.habitica.models.tasks.Task):com.habitrpg.android.habitica.models.tasks.Task");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createTagViews() {
        boolean u10;
        ActivityTaskFormBinding activityTaskFormBinding = this.binding;
        if (activityTaskFormBinding == null) {
            qc.q.z("binding");
            activityTaskFormBinding = null;
        }
        activityTaskFormBinding.tagsWrapper.removeAllViews();
        int dpToPx = IntExtensionsKt.dpToPx(20, (Context) this);
        for (Tag tag : this.tags) {
            u10 = yc.v.u(tag.getId());
            boolean z10 = false;
            if (u10) {
                TextView textView = new TextView(this);
                textView.setPadding(0, textView.getPaddingTop(), textView.getPaddingRight(), textView.getPaddingBottom());
                textView.setText(tag.getName());
                textView.setTextColor(ContextExtensionsKt.getThemeColor(this, R.attr.textColorTintedPrimary));
                ActivityTaskFormBinding activityTaskFormBinding2 = this.binding;
                if (activityTaskFormBinding2 == null) {
                    qc.q.z("binding");
                    activityTaskFormBinding2 = null;
                }
                activityTaskFormBinding2.tagsWrapper.addView(textView);
            } else {
                CheckBox checkBox = new CheckBox(this);
                checkBox.setPadding(dpToPx, checkBox.getPaddingTop(), checkBox.getPaddingRight(), checkBox.getPaddingBottom());
                checkBox.setText(tag.getName());
                checkBox.setTextColor(ContextExtensionsKt.getThemeColor(this, R.attr.textColorTintedPrimary));
                ArrayList<String> arrayList = this.preselectedTags;
                if (arrayList != null && arrayList.contains(tag.getId())) {
                    z10 = true;
                }
                if (z10) {
                    checkBox.setChecked(true);
                }
                ActivityTaskFormBinding activityTaskFormBinding3 = this.binding;
                if (activityTaskFormBinding3 == null) {
                    qc.q.z("binding");
                    activityTaskFormBinding3 = null;
                }
                activityTaskFormBinding3.tagsWrapper.addView(checkBox);
            }
        }
        setAllTagSelections();
        updateTagViewsColors();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if ((!r0) == true) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void deleteTask() {
        /*
            r11 = this;
            com.habitrpg.android.habitica.models.tasks.Task r0 = r11.task
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L15
            java.lang.String r0 = r0.getChallengeBroken()
            if (r0 == 0) goto L15
            boolean r0 = yc.m.u(r0)
            r0 = r0 ^ r2
            if (r0 != r2) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 == 0) goto L1c
            r11.showBrokenChallengeDialog()
            return
        L1c:
            com.habitrpg.android.habitica.models.tasks.Task r0 = r11.task
            if (r0 == 0) goto L2e
            java.lang.String r0 = r0.getChallengeID()
            if (r0 == 0) goto L2e
            boolean r0 = yc.m.u(r0)
            r0 = r0 ^ r2
            if (r0 != r2) goto L2e
            goto L2f
        L2e:
            r2 = 0
        L2f:
            if (r2 == 0) goto L35
            r11.showChallengeDeleteTask()
            return
        L35:
            com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog r0 = new com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog
            r0.<init>(r11)
            r2 = 2131951734(0x7f130076, float:1.953989E38)
            r0.setTitle(r2)
            r4 = 2131952074(0x7f1301ca, float:1.954058E38)
            r5 = 1
            r6 = 0
            r7 = 0
            com.habitrpg.android.habitica.ui.activities.TaskFormActivity$deleteTask$1 r8 = new com.habitrpg.android.habitica.ui.activities.TaskFormActivity$deleteTask$1
            r8.<init>(r11)
            r9 = 12
            r10 = 0
            r3 = r0
            com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog.addButton$default(r3, r4, r5, r6, r7, r8, r9, r10)
            r2 = 3
            r3 = 0
            com.habitrpg.android.habitica.extensions.AlertDialogExtensionsKt.addCancelButton$default(r0, r1, r3, r2, r3)
            r0.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.activities.TaskFormActivity.deleteTask():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disableEditingForUneditableFieldsInChallengeTask() {
        ActivityTaskFormBinding activityTaskFormBinding = this.binding;
        ActivityTaskFormBinding activityTaskFormBinding2 = null;
        if (activityTaskFormBinding == null) {
            qc.q.z("binding");
            activityTaskFormBinding = null;
        }
        activityTaskFormBinding.textEditText.setEnabled(false);
        ActivityTaskFormBinding activityTaskFormBinding3 = this.binding;
        if (activityTaskFormBinding3 == null) {
            qc.q.z("binding");
            activityTaskFormBinding3 = null;
        }
        activityTaskFormBinding3.taskDifficultyButtons.setEnabled(false);
        ActivityTaskFormBinding activityTaskFormBinding4 = this.binding;
        if (activityTaskFormBinding4 == null) {
            qc.q.z("binding");
            activityTaskFormBinding4 = null;
        }
        activityTaskFormBinding4.taskSchedulingControls.setEnabled(false);
        ActivityTaskFormBinding activityTaskFormBinding5 = this.binding;
        if (activityTaskFormBinding5 == null) {
            qc.q.z("binding");
        } else {
            activityTaskFormBinding2 = activityTaskFormBinding5;
        }
        activityTaskFormBinding2.habitScoringButtons.setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02fb, code lost:
    
        if (r0 == null) goto L171;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void fillForm(com.habitrpg.android.habitica.models.tasks.Task r10) {
        /*
            Method dump skipped, instructions count: 823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.activities.TaskFormActivity.fillForm(com.habitrpg.android.habitica.models.tasks.Task):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TaskFormViewModel getViewModel() {
        return (TaskFormViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notificationPermissionLauncher$lambda$0(TaskFormActivity taskFormActivity, Boolean bool) {
        qc.q.i(taskFormActivity, "this$0");
        qc.q.f(bool);
        if (bool.booleanValue()) {
            taskFormActivity.getPushNotificationManager().addPushDeviceUsingStoredToken();
            return;
        }
        HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(taskFormActivity);
        habiticaAlertDialog.setTitle(R.string.push_notification_system_settings_title);
        habiticaAlertDialog.setMessage(R.string.push_notification_system_settings_description);
        HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.settings, true, false, false, (pc.p) new TaskFormActivity$notificationPermissionLauncher$1$1(taskFormActivity), 8, (Object) null);
        HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.cancel, false, false, false, (pc.p) new TaskFormActivity$notificationPermissionLauncher$1$2(habiticaAlertDialog), 12, (Object) null);
        habiticaAlertDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBackPressed$lambda$6(TaskFormActivity taskFormActivity, DialogInterface dialogInterface) {
        qc.q.i(taskFormActivity, "this$0");
        taskFormActivity.isDiscardCancelled = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(TaskFormActivity taskFormActivity, View view, boolean z10) {
        float f10;
        qc.q.i(taskFormActivity, "this$0");
        ActivityTaskFormBinding activityTaskFormBinding = taskFormActivity.binding;
        if (activityTaskFormBinding == null) {
            qc.q.z("binding");
            activityTaskFormBinding = null;
        }
        TextInputLayout textInputLayout = activityTaskFormBinding.textInputLayout;
        if (z10) {
            f10 = 0.8f;
        } else {
            f10 = 0.6f;
        }
        textInputLayout.setAlpha(f10);
        taskFormActivity.getWindow().setSoftInputMode(5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(TaskFormActivity taskFormActivity, View view, boolean z10) {
        float f10;
        qc.q.i(taskFormActivity, "this$0");
        ActivityTaskFormBinding activityTaskFormBinding = taskFormActivity.binding;
        if (activityTaskFormBinding == null) {
            qc.q.z("binding");
            activityTaskFormBinding = null;
        }
        TextInputLayout textInputLayout = activityTaskFormBinding.notesInputLayout;
        if (z10) {
            f10 = 0.8f;
        } else {
            f10 = 0.6f;
        }
        textInputLayout.setAlpha(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCreate$lambda$3(TaskFormActivity taskFormActivity, View view, MotionEvent motionEvent) {
        boolean z10;
        qc.q.i(taskFormActivity, "this$0");
        ActivityTaskFormBinding activityTaskFormBinding = taskFormActivity.binding;
        if (activityTaskFormBinding == null) {
            qc.q.z("binding");
            activityTaskFormBinding = null;
        }
        if (qc.q.d(view, activityTaskFormBinding.scrollView) && (motionEvent.getAction() == 8 || motionEvent.getAction() == 2)) {
            z10 = true;
        } else {
            z10 = false;
        }
        taskFormActivity.userScrolled = z10;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$4(TaskFormActivity taskFormActivity, NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
        qc.q.i(taskFormActivity, "this$0");
        if (taskFormActivity.userScrolled) {
            KeyboardUtilKt.dismissKeyboard(taskFormActivity);
        }
    }

    private final void saveTask() {
        Map<String, ? extends List<String>> k10;
        List<GroupAssignedDetails> i10;
        String str;
        String assignedUserID;
        List<String> list;
        GroupAssignedDetails groupAssignedDetails;
        List<String> list2;
        io.realm.x0<GroupAssignedDetails> assignedUsersDetail;
        GroupAssignedDetails groupAssignedDetails2;
        String str2;
        if (this.isSaving) {
            return;
        }
        this.isSaving = true;
        Task task = this.task;
        if (task == null) {
            task = new Task();
            task.setType(this.taskType);
            task.setDateCreated(new Date());
        } else if (!task.isValid()) {
            return;
        }
        Task configureTask = configureTask(task);
        final Intent intent = new Intent();
        intent.putExtra(TASK_TYPE_KEY, this.taskType.getValue());
        k10 = ec.n0.k(dc.r.a("assign", new ArrayList()), dc.r.a("unassign", new ArrayList()));
        if (this.groupID != null) {
            TaskGroupPlan group = configureTask.getGroup();
            if (group != null) {
                str2 = group.getGroupID();
            } else {
                str2 = null;
            }
            if (str2 == null) {
                configureTask.setGroup(new TaskGroupPlan());
                TaskGroupPlan group2 = configureTask.getGroup();
                if (group2 != null) {
                    group2.setGroupID(this.groupID);
                }
            }
        }
        if (configureTask.isGroupTask()) {
            Iterator<String> it = this.assignedIDs.iterator();
            while (it.hasNext()) {
                String next = it.next();
                TaskGroupPlan group3 = configureTask.getGroup();
                if (group3 != null && (assignedUsersDetail = group3.getAssignedUsersDetail()) != null) {
                    Iterator<GroupAssignedDetails> it2 = assignedUsersDetail.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            groupAssignedDetails2 = it2.next();
                            if (qc.q.d(groupAssignedDetails2.getAssignedUserID(), next)) {
                                break;
                            }
                        } else {
                            groupAssignedDetails2 = null;
                            break;
                        }
                    }
                    groupAssignedDetails = groupAssignedDetails2;
                } else {
                    groupAssignedDetails = null;
                }
                if (groupAssignedDetails == null && (list2 = k10.get("assign")) != null) {
                    list2.add(next);
                }
            }
            TaskGroupPlan group4 = configureTask.getGroup();
            if (group4 == null || (i10 = group4.getAssignedUsersDetail()) == null) {
                i10 = ec.t.i();
            }
            for (GroupAssignedDetails groupAssignedDetails3 : i10) {
                Iterator<String> it3 = this.assignedIDs.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        str = it3.next();
                        if (qc.q.d(str, groupAssignedDetails3.getAssignedUserID())) {
                            break;
                        }
                    } else {
                        str = null;
                        break;
                    }
                }
                if (str == null && (assignedUserID = groupAssignedDetails3.getAssignedUserID()) != null && (list = k10.get("unassign")) != null) {
                    list.add(assignedUserID);
                }
            }
        }
        if (!this.isChallengeTask) {
            if (this.isCreating) {
                getTaskRepository().createTaskInBackground(configureTask, k10);
            } else {
                getTaskRepository().updateTaskInBackground(configureTask, k10);
            }
            if (configureTask.getType() == TaskType.DAILY || configureTask.getType() == TaskType.TODO) {
                getTaskAlarmManager().scheduleAlarmsForTask(configureTask);
            }
        } else {
            intent.putExtra(PARCELABLE_TASK, configureTask);
        }
        new Handler(getMainLooper()).postDelayed(new Runnable() { // from class: com.habitrpg.android.habitica.ui.activities.i2
            @Override // java.lang.Runnable
            public final void run() {
                TaskFormActivity.saveTask$lambda$28(TaskFormActivity.this, intent);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void saveTask$lambda$28(TaskFormActivity taskFormActivity, Intent intent) {
        qc.q.i(taskFormActivity, "this$0");
        qc.q.i(intent, "$resultIntent");
        taskFormActivity.setResult(-1, intent);
        taskFormActivity.finish();
    }

    private final void setAllTagSelections() {
        CheckBox checkBox;
        boolean z10;
        io.realm.x0<Tag> tags;
        if (this.hasPreselectedTags) {
            int i10 = 0;
            for (Object obj : this.tags) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    ec.t.r();
                }
                Tag tag = (Tag) obj;
                ActivityTaskFormBinding activityTaskFormBinding = this.binding;
                Tag tag2 = null;
                if (activityTaskFormBinding == null) {
                    qc.q.z("binding");
                    activityTaskFormBinding = null;
                }
                View childAt = activityTaskFormBinding.tagsWrapper.getChildAt(i10);
                if (childAt instanceof CheckBox) {
                    checkBox = (CheckBox) childAt;
                } else {
                    checkBox = null;
                }
                if (checkBox != null) {
                    Task task = this.task;
                    if (task != null && (tags = task.getTags()) != null) {
                        Iterator<Tag> it = tags.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Tag next = it.next();
                            if (qc.q.d(next.getId(), tag.getId())) {
                                tag2 = next;
                                break;
                            }
                        }
                        tag2 = tag2;
                    }
                    if (tag2 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    checkBox.setChecked(z10);
                }
                i10 = i11;
            }
            return;
        }
        this.hasPreselectedTags = true;
    }

    private final void setCanSave(boolean z10) {
        if (this.canSave == z10) {
            return;
        }
        this.canSave = z10;
        invalidateOptionsMenu();
    }

    private final void setTintColor(int i10) {
        this.tintColor = i10;
        ActivityTaskFormBinding activityTaskFormBinding = this.binding;
        if (activityTaskFormBinding == null) {
            qc.q.z("binding");
            activityTaskFormBinding = null;
        }
        activityTaskFormBinding.taskSchedulingControls.setTintColor(i10);
        updateTagViewsColors();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showAssignDialog() {
        BottomSheetUtilsKt.showAsBottomSheet(this, q0.c.c(666806789, true, new TaskFormActivity$showAssignDialog$1(this)));
    }

    private final void showBrokenChallengeDialog() {
        Task task = this.task;
        if (task == null || !task.isValid()) {
            return;
        }
        ad.g.d(androidx.lifecycle.w.a(this), ad.a1.c(), null, new TaskFormActivity$showBrokenChallengeDialog$1(this, task, null), 2, null);
    }

    private final void showChallengeDeleteTask() {
        ad.g.d(androidx.lifecycle.w.a(this), ad.a1.c(), null, new TaskFormActivity$showChallengeDeleteTask$1(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sortTagPositions() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (Tag tag : this.tags) {
            if (tag.getChallenge$Habitica_2311256681_prodRelease()) {
                arrayList2.add(tag);
            } else if (tag.getGroup() != null) {
                arrayList3.add(tag);
            } else {
                arrayList4.add(tag);
            }
        }
        Tag tag2 = new Tag();
        String string = getString(R.string.challenge_tags);
        qc.q.h(string, "getString(...)");
        tag2.setName(string);
        Tag tag3 = new Tag();
        String string2 = getString(R.string.group_tags);
        qc.q.h(string2, "getString(...)");
        tag3.setName(string2);
        Tag tag4 = new Tag();
        String string3 = getString(R.string.your_tags);
        qc.q.h(string3, "getString(...)");
        tag4.setName(string3);
        if ((!arrayList2.isEmpty()) != false) {
            arrayList.add(tag2);
            arrayList.addAll(arrayList2);
        }
        if ((!arrayList3.isEmpty()) != false) {
            arrayList.add(tag3);
            arrayList.addAll(arrayList3);
        }
        if ((!arrayList4.isEmpty()) != false) {
            arrayList.add(tag4);
            arrayList.addAll(arrayList4);
        }
        this.tags = arrayList;
    }

    private final void updateTagViewsColors() {
        androidx.appcompat.widget.f fVar;
        ActivityTaskFormBinding activityTaskFormBinding = this.binding;
        if (activityTaskFormBinding == null) {
            qc.q.z("binding");
            activityTaskFormBinding = null;
        }
        LinearLayout linearLayout = activityTaskFormBinding.tagsWrapper;
        qc.q.h(linearLayout, "tagsWrapper");
        for (View view : androidx.core.view.t0.a(linearLayout)) {
            if (view instanceof androidx.appcompat.widget.f) {
                fVar = (androidx.appcompat.widget.f) view;
            } else {
                fVar = null;
            }
            ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{16842912}}, new int[]{ContextExtensionsKt.getThemeColor(this, R.attr.colorTintedBackgroundOffset), this.tintColor});
            if (fVar != null) {
                fVar.setButtonTintList(colorStateList);
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        KeyboardUtilKt.dismissKeyboard(this);
        super.finish();
    }

    public final ChallengeRepository getChallengeRepository() {
        ChallengeRepository challengeRepository = this.challengeRepository;
        if (challengeRepository != null) {
            return challengeRepository;
        }
        qc.q.z("challengeRepository");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    public View getContentView(Integer num) {
        ActivityTaskFormBinding inflate = ActivityTaskFormBinding.inflate(getLayoutInflater());
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
        return Integer.valueOf((int) R.layout.activity_task_form);
    }

    public final PushNotificationManager getPushNotificationManager() {
        PushNotificationManager pushNotificationManager = this.pushNotificationManager;
        if (pushNotificationManager != null) {
            return pushNotificationManager;
        }
        qc.q.z("pushNotificationManager");
        return null;
    }

    public final SharedPreferences getSharedPreferences() {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        qc.q.z("sharedPreferences");
        return null;
    }

    public final SocialRepository getSocialRepository() {
        SocialRepository socialRepository = this.socialRepository;
        if (socialRepository != null) {
            return socialRepository;
        }
        qc.q.z("socialRepository");
        return null;
    }

    public final TagRepository getTagRepository() {
        TagRepository tagRepository = this.tagRepository;
        if (tagRepository != null) {
            return tagRepository;
        }
        qc.q.z("tagRepository");
        return null;
    }

    public final TaskAlarmManager getTaskAlarmManager() {
        TaskAlarmManager taskAlarmManager = this.taskAlarmManager;
        if (taskAlarmManager != null) {
            return taskAlarmManager;
        }
        qc.q.z("taskAlarmManager");
        return null;
    }

    public final TaskRepository getTaskRepository() {
        TaskRepository taskRepository = this.taskRepository;
        if (taskRepository != null) {
            return taskRepository;
        }
        qc.q.z("taskRepository");
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

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    public void loadTheme$Habitica_2311256681_prodRelease(SharedPreferences sharedPreferences, boolean z10) {
        int i10;
        qc.q.i(sharedPreferences, "sharedPreferences");
        super.loadTheme$Habitica_2311256681_prodRelease(sharedPreferences, z10);
        if (qc.q.d(getForcedTheme$Habitica_2311256681_prodRelease(), "taskform")) {
            i10 = R.attr.taskFormTint;
        } else {
            i10 = R.attr.colorAccent;
        }
        getWindow().setStatusBarColor(ContextExtensionsKt.getThemeColor(this, i10));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Task configureTask = configureTask(new Task());
        Task task = this.initialTaskInstance;
        boolean z10 = false;
        if (task != null && task.isBeingEdited(configureTask)) {
            z10 = true;
        }
        if (z10) {
            HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(this);
            habiticaAlertDialog.setTitle(R.string.unsaved_changes);
            habiticaAlertDialog.setMessage(R.string.discard_changes_to_task_message);
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.discard, true, true, false, (pc.p) new TaskFormActivity$onBackPressed$1(this), 8, (Object) null);
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.cancel, false, false, false, (pc.p) new TaskFormActivity$onBackPressed$2(this, habiticaAlertDialog), 12, (Object) null);
            habiticaAlertDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.habitrpg.android.habitica.ui.activities.n2
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    TaskFormActivity.onBackPressed$lambda$6(TaskFormActivity.this, dialogInterface);
                }
            });
            habiticaAlertDialog.show();
            return;
        }
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.fragment.app.q, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        int i10;
        Task task;
        Object parcelable;
        setOverrideModernHeader(Boolean.FALSE);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        String string = extras.getString(TASK_ID_KEY);
        this.groupID = extras.getString(GROUP_ID_KEY);
        if (string == null) {
            str = "taskform";
        } else {
            double d10 = extras.getDouble(TASK_VALUE_KEY);
            if (d10 < -20.0d) {
                str = "maroon";
            } else if (d10 < -10.0d) {
                str = "red";
            } else if (d10 < -1.0d) {
                str = "orange";
            } else if (d10 < 1.0d) {
                str = "yellow";
            } else if (d10 < 5.0d) {
                str = "green";
            } else if (d10 < 10.0d) {
                str = "teal";
            } else {
                str = "blue";
            }
        }
        setForcedTheme$Habitica_2311256681_prodRelease(str);
        super.onCreate(bundle);
        ActivityTaskFormBinding activityTaskFormBinding = this.binding;
        ActivityTaskFormBinding activityTaskFormBinding2 = null;
        if (activityTaskFormBinding == null) {
            qc.q.z("binding");
            activityTaskFormBinding = null;
        }
        setSupportActionBar(activityTaskFormBinding.toolbar);
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.t(true);
        }
        androidx.appcompat.app.a supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.u(true);
        }
        if (qc.q.d(getForcedTheme$Habitica_2311256681_prodRelease(), "taskform") || qc.q.d(getForcedTheme$Habitica_2311256681_prodRelease(), "maroon")) {
            ToolbarColorHelper toolbarColorHelper = ToolbarColorHelper.INSTANCE;
            ActivityTaskFormBinding activityTaskFormBinding3 = this.binding;
            if (activityTaskFormBinding3 == null) {
                qc.q.z("binding");
                activityTaskFormBinding3 = null;
            }
            Toolbar toolbar = activityTaskFormBinding3.toolbar;
            qc.q.h(toolbar, "toolbar");
            ToolbarColorHelper.colorizeToolbar$default(toolbarColorHelper, toolbar, this, Integer.valueOf(androidx.core.content.a.c(this, R.color.white)), null, 8, null);
        }
        int i11 = R.attr.taskFormTint;
        setTintColor(ContextExtensionsKt.getThemeColor(this, R.attr.taskFormTint));
        if (!qc.q.d(getForcedTheme$Habitica_2311256681_prodRelease(), "taskform")) {
            i11 = R.attr.colorAccent;
        }
        int themeColor = ContextExtensionsKt.getThemeColor(this, i11);
        androidx.appcompat.app.a supportActionBar3 = getSupportActionBar();
        if (supportActionBar3 != null) {
            supportActionBar3.r(new ColorDrawable(themeColor));
        }
        ActivityTaskFormBinding activityTaskFormBinding4 = this.binding;
        if (activityTaskFormBinding4 == null) {
            qc.q.z("binding");
            activityTaskFormBinding4 = null;
        }
        activityTaskFormBinding4.upperTextWrapper.setBackgroundColor(themeColor);
        this.isChallengeTask = extras.getBoolean(IS_CHALLENGE_TASK, false);
        TaskType from = TaskType.Companion.from(extras.getString(TASK_TYPE_KEY));
        if (from == null) {
            from = TaskType.HABIT;
        }
        this.taskType = from;
        this.preselectedTags = extras.getStringArrayList(SELECTED_TAGS_KEY);
        ad.g.d(androidx.lifecycle.w.a(this), ad.a1.c(), null, new TaskFormActivity$onCreate$1(this, null), 2, null);
        getUserViewModel().getUser().j(this, new TaskFormActivityKt$sam$androidx_lifecycle_Observer$0(new TaskFormActivity$onCreate$2(this)));
        ActivityTaskFormBinding activityTaskFormBinding5 = this.binding;
        if (activityTaskFormBinding5 == null) {
            qc.q.z("binding");
            activityTaskFormBinding5 = null;
        }
        activityTaskFormBinding5.textEditText.addTextChangedListener(new OnChangeTextWatcher(new TaskFormActivity$onCreate$3(this)));
        ActivityTaskFormBinding activityTaskFormBinding6 = this.binding;
        if (activityTaskFormBinding6 == null) {
            qc.q.z("binding");
            activityTaskFormBinding6 = null;
        }
        activityTaskFormBinding6.textEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.habitrpg.android.habitica.ui.activities.j2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                TaskFormActivity.onCreate$lambda$1(TaskFormActivity.this, view, z10);
            }
        });
        ActivityTaskFormBinding activityTaskFormBinding7 = this.binding;
        if (activityTaskFormBinding7 == null) {
            qc.q.z("binding");
            activityTaskFormBinding7 = null;
        }
        activityTaskFormBinding7.notesEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.habitrpg.android.habitica.ui.activities.k2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                TaskFormActivity.onCreate$lambda$2(TaskFormActivity.this, view, z10);
            }
        });
        ActivityTaskFormBinding activityTaskFormBinding8 = this.binding;
        if (activityTaskFormBinding8 == null) {
            qc.q.z("binding");
            activityTaskFormBinding8 = null;
        }
        activityTaskFormBinding8.scrollView.setOnTouchListener(new View.OnTouchListener() { // from class: com.habitrpg.android.habitica.ui.activities.l2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean onCreate$lambda$3;
                onCreate$lambda$3 = TaskFormActivity.onCreate$lambda$3(TaskFormActivity.this, view, motionEvent);
                return onCreate$lambda$3;
            }
        });
        ActivityTaskFormBinding activityTaskFormBinding9 = this.binding;
        if (activityTaskFormBinding9 == null) {
            qc.q.z("binding");
            activityTaskFormBinding9 = null;
        }
        activityTaskFormBinding9.scrollView.setOnScrollChangeListener(new NestedScrollView.c() { // from class: com.habitrpg.android.habitica.ui.activities.m2
            @Override // androidx.core.widget.NestedScrollView.c
            public final void a(NestedScrollView nestedScrollView, int i12, int i13, int i14, int i15) {
                TaskFormActivity.onCreate$lambda$4(TaskFormActivity.this, nestedScrollView, i12, i13, i14, i15);
            }
        });
        setTitle("");
        if (string != null) {
            this.isCreating = false;
            ad.g.d(androidx.lifecycle.w.a(this), ad.a1.c(), null, new TaskFormActivity$onCreate$8(this, string, null), 2, null);
        } else if (extras.containsKey(PARCELABLE_TASK)) {
            this.isCreating = false;
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = extras.getParcelable(PARCELABLE_TASK, Task.class);
                task = (Task) parcelable;
            } else {
                task = (Task) extras.getParcelable(PARCELABLE_TASK);
            }
            this.task = task;
            if (task != null) {
                fillForm(task);
            }
        } else {
            Object[] objArr = new Object[1];
            int i12 = WhenMappings.$EnumSwitchMapping$0[this.taskType.ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        i10 = R.string.habit;
                    } else {
                        i10 = R.string.reward;
                    }
                } else {
                    i10 = R.string.todo;
                }
            } else {
                i10 = R.string.daily;
            }
            objArr[0] = getString(i10);
            setTitle(getString(R.string.create_task, objArr));
            this.initialTaskInstance = configureTask(new Task());
        }
        if (this.groupID != null) {
            ActivityTaskFormBinding activityTaskFormBinding10 = this.binding;
            if (activityTaskFormBinding10 == null) {
                qc.q.z("binding");
                activityTaskFormBinding10 = null;
            }
            activityTaskFormBinding10.assignView.setContent(q0.c.c(-2004371280, true, new TaskFormActivity$onCreate$10(this)));
            ad.g.d(androidx.lifecycle.w.a(this), ad.a1.c(), null, new TaskFormActivity$onCreate$11(this, null), 2, null);
            ActivityTaskFormBinding activityTaskFormBinding11 = this.binding;
            if (activityTaskFormBinding11 == null) {
                qc.q.z("binding");
                activityTaskFormBinding11 = null;
            }
            TextView textView = activityTaskFormBinding11.tagsTitleView;
            qc.q.h(textView, "tagsTitleView");
            textView.setVisibility(8);
            ActivityTaskFormBinding activityTaskFormBinding12 = this.binding;
            if (activityTaskFormBinding12 == null) {
                qc.q.z("binding");
                activityTaskFormBinding12 = null;
            }
            LinearLayout linearLayout = activityTaskFormBinding12.tagsWrapper;
            qc.q.h(linearLayout, "tagsWrapper");
            linearLayout.setVisibility(8);
        } else {
            ActivityTaskFormBinding activityTaskFormBinding13 = this.binding;
            if (activityTaskFormBinding13 == null) {
                qc.q.z("binding");
                activityTaskFormBinding13 = null;
            }
            activityTaskFormBinding13.assignTitleView.setVisibility(8);
            ActivityTaskFormBinding activityTaskFormBinding14 = this.binding;
            if (activityTaskFormBinding14 == null) {
                qc.q.z("binding");
                activityTaskFormBinding14 = null;
            }
            activityTaskFormBinding14.assignView.setVisibility(8);
        }
        ActivityTaskFormBinding activityTaskFormBinding15 = this.binding;
        if (activityTaskFormBinding15 == null) {
            qc.q.z("binding");
            activityTaskFormBinding15 = null;
        }
        activityTaskFormBinding15.taskDifficultyButtons.setContent(q0.c.c(1088481730, true, new TaskFormActivity$onCreate$12(this)));
        if (this.taskType == TaskType.HABIT) {
            ActivityTaskFormBinding activityTaskFormBinding16 = this.binding;
            if (activityTaskFormBinding16 == null) {
                qc.q.z("binding");
                activityTaskFormBinding16 = null;
            }
            activityTaskFormBinding16.habitScoringButtons.setContent(q0.c.c(-882092081, true, new TaskFormActivity$onCreate$13(this)));
            ActivityTaskFormBinding activityTaskFormBinding17 = this.binding;
            if (activityTaskFormBinding17 == null) {
                qc.q.z("binding");
                activityTaskFormBinding17 = null;
            }
            activityTaskFormBinding17.habitResetStreakButtons.setContent(q0.c.c(-7703624, true, new TaskFormActivity$onCreate$14(this)));
        }
        ActivityTaskFormBinding activityTaskFormBinding18 = this.binding;
        if (activityTaskFormBinding18 == null) {
            qc.q.z("binding");
        } else {
            activityTaskFormBinding2 = activityTaskFormBinding18;
        }
        activityTaskFormBinding2.statsSelector.setContent(q0.c.c(1638062891, true, new TaskFormActivity$onCreate$15(this)));
        configureForm();
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        qc.q.i(menu, "menu");
        if (this.isCreating) {
            getMenuInflater().inflate(R.menu.menu_task_create, menu);
        } else {
            getMenuInflater().inflate(R.menu.menu_task_edit, menu);
        }
        menu.findItem(R.id.action_save).setEnabled(this.canSave);
        if (qc.q.d(getForcedTheme$Habitica_2311256681_prodRelease(), "taskform") || qc.q.d(getForcedTheme$Habitica_2311256681_prodRelease(), "maroon")) {
            Iterator<MenuItem> a10 = androidx.core.view.z.a(menu);
            while (a10.hasNext()) {
                MenuItem next = a10.next();
                SpannableString spannableString = new SpannableString(next.getTitle());
                spannableString.setSpan(new ForegroundColorSpan(-1), 0, spannableString.length(), 0);
                next.setTitle(spannableString);
            }
            return true;
        }
        return true;
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        qc.q.i(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId != R.id.action_delete) {
            if (itemId == R.id.action_save) {
                saveTask();
            }
        } else {
            deleteTask();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.fragment.app.q, android.app.Activity
    public void onResume() {
        checkIfShowNotifLayout();
        super.onResume();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, androidx.fragment.app.q, android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.isCreating) {
            ActivityTaskFormBinding activityTaskFormBinding = this.binding;
            if (activityTaskFormBinding == null) {
                qc.q.z("binding");
                activityTaskFormBinding = null;
            }
            activityTaskFormBinding.textEditText.requestFocus();
        }
    }

    public final void setChallengeRepository(ChallengeRepository challengeRepository) {
        qc.q.i(challengeRepository, "<set-?>");
        this.challengeRepository = challengeRepository;
    }

    public final void setPushNotificationManager(PushNotificationManager pushNotificationManager) {
        qc.q.i(pushNotificationManager, "<set-?>");
        this.pushNotificationManager = pushNotificationManager;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        qc.q.i(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }

    public final void setSocialRepository(SocialRepository socialRepository) {
        qc.q.i(socialRepository, "<set-?>");
        this.socialRepository = socialRepository;
    }

    public final void setTagRepository(TagRepository tagRepository) {
        qc.q.i(tagRepository, "<set-?>");
        this.tagRepository = tagRepository;
    }

    public final void setTaskAlarmManager(TaskAlarmManager taskAlarmManager) {
        qc.q.i(taskAlarmManager, "<set-?>");
        this.taskAlarmManager = taskAlarmManager;
    }

    public final void setTaskRepository(TaskRepository taskRepository) {
        qc.q.i(taskRepository, "<set-?>");
        this.taskRepository = taskRepository;
    }

    public final void setUserViewModel(MainUserViewModel mainUserViewModel) {
        qc.q.i(mainUserViewModel, "<set-?>");
        this.userViewModel = mainUserViewModel;
    }
}
