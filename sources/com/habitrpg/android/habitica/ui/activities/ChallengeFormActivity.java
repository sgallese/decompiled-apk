package com.habitrpg.android.habitica.ui.activities;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.ChallengeRepository;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.databinding.ActivityCreateChallengeBinding;
import com.habitrpg.android.habitica.extensions.AlertDialogExtensionsKt;
import com.habitrpg.android.habitica.models.social.Challenge;
import com.habitrpg.android.habitica.models.social.Group;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.adapter.social.challenges.ChallengeTasksRecyclerViewAdapter;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaProgressDialog;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.shared.habitica.models.tasks.TaskType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.coroutines.Continuation;

/* compiled from: ChallengeFormActivity.kt */
/* loaded from: classes4.dex */
public final class ChallengeFormActivity extends Hilt_ChallengeFormActivity {
    public static final String CHALLENGE_ID_KEY = "challengeId";
    private Task addDaily;
    private Task addHabit;
    private Task addReward;
    private Task addTodo;
    private ActivityCreateChallengeBinding binding;
    private String challengeId;
    public ChallengeRepository challengeRepository;
    private ChallengeTasksRecyclerViewAdapter challengeTasks;
    private boolean editMode;
    private String groupID;
    private GroupArrayAdapter locationAdapter;
    private final androidx.activity.result.b<Intent> newTaskResult;
    private boolean savingInProgress;
    public SocialRepository socialRepository;
    public TasksViewModel tasksViewModel;
    private User user;
    public MainUserViewModel userViewModel;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final HashMap<String, Task> addedTasks = new HashMap<>();
    private final HashMap<String, Task> updatedTasks = new HashMap<>();
    private final HashMap<String, Task> removedTasks = new HashMap<>();
    private Boolean overrideModernHeader = Boolean.TRUE;

    /* compiled from: ChallengeFormActivity.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(qc.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Task createTask(String str) {
            Task task = new Task();
            task.setId("addtask");
            task.setText(str);
            return task;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ChallengeFormActivity.kt */
    /* loaded from: classes4.dex */
    public static final class GroupArrayAdapter extends ArrayAdapter<Group> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GroupArrayAdapter(Context context) {
            super(context, 17367048);
            qc.q.i(context, "context");
        }

        @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            androidx.appcompat.widget.g gVar;
            qc.q.i(viewGroup, "parent");
            View dropDownView = super.getDropDownView(i10, view, viewGroup);
            String str = null;
            if (dropDownView instanceof androidx.appcompat.widget.g) {
                gVar = (androidx.appcompat.widget.g) dropDownView;
            } else {
                gVar = null;
            }
            if (gVar != null) {
                Group group = (Group) getItem(i10);
                if (group != null) {
                    str = group.getName();
                }
                gVar.setText(str);
            }
            if (gVar == null) {
                return new View(getContext());
            }
            return gVar;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            TextView textView;
            qc.q.i(viewGroup, "parent");
            View view2 = super.getView(i10, view, viewGroup);
            String str = null;
            if (view2 instanceof TextView) {
                textView = (TextView) view2;
            } else {
                textView = null;
            }
            if (textView != null) {
                Group group = (Group) getItem(i10);
                if (group != null) {
                    str = group.getName();
                }
                textView.setText(str);
            }
            if (textView == null) {
                return new View(getContext());
            }
            return textView;
        }
    }

    /* compiled from: ChallengeFormActivity.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TaskType.values().length];
            try {
                iArr[TaskType.HABIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TaskType.DAILY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TaskType.TODO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ChallengeFormActivity() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new f.d(), new androidx.activity.result.a() { // from class: com.habitrpg.android.habitica.ui.activities.t
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                ChallengeFormActivity.newTaskResult$lambda$5(ChallengeFormActivity.this, (ActivityResult) obj);
            }
        });
        qc.q.h(registerForActivityResult, "registerForActivityResult(...)");
        this.newTaskResult = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void addOrUpdateTaskInList(com.habitrpg.android.habitica.models.tasks.Task r6, boolean r7) {
        /*
            r5 = this;
            com.habitrpg.android.habitica.ui.adapter.social.challenges.ChallengeTasksRecyclerViewAdapter r0 = r5.challengeTasks
            java.lang.String r1 = "challengeTasks"
            r2 = 0
            if (r0 != 0) goto Lb
            qc.q.z(r1)
            r0 = r2
        Lb:
            boolean r0 = r0.replaceTask(r6)
            java.lang.String r3 = ""
            if (r0 != 0) goto L81
            com.habitrpg.shared.habitica.models.tasks.TaskType r0 = r6.getType()
            if (r0 != 0) goto L1b
            r0 = -1
            goto L23
        L1b:
            int[] r4 = com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r4[r0]
        L23:
            r4 = 1
            if (r0 == r4) goto L4a
            r4 = 2
            if (r0 == r4) goto L40
            r4 = 3
            if (r0 == r4) goto L36
            com.habitrpg.android.habitica.models.tasks.Task r0 = r5.addReward
            if (r0 != 0) goto L54
            java.lang.String r0 = "addReward"
            qc.q.z(r0)
            goto L53
        L36:
            com.habitrpg.android.habitica.models.tasks.Task r0 = r5.addTodo
            if (r0 != 0) goto L54
            java.lang.String r0 = "addTodo"
            qc.q.z(r0)
            goto L53
        L40:
            com.habitrpg.android.habitica.models.tasks.Task r0 = r5.addDaily
            if (r0 != 0) goto L54
            java.lang.String r0 = "addDaily"
            qc.q.z(r0)
            goto L53
        L4a:
            com.habitrpg.android.habitica.models.tasks.Task r0 = r5.addHabit
            if (r0 != 0) goto L54
            java.lang.String r0 = "addHabit"
            qc.q.z(r0)
        L53:
            r0 = r2
        L54:
            if (r7 != 0) goto L61
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.String r4 = r4.toString()
            r6.setId(r4)
        L61:
            com.habitrpg.android.habitica.ui.adapter.social.challenges.ChallengeTasksRecyclerViewAdapter r4 = r5.challengeTasks
            if (r4 != 0) goto L69
            qc.q.z(r1)
            goto L6a
        L69:
            r2 = r4
        L6a:
            r2.addTaskUnder(r6, r0)
            boolean r0 = r5.editMode
            if (r0 == 0) goto L9e
            if (r7 != 0) goto L9e
            java.util.HashMap<java.lang.String, com.habitrpg.android.habitica.models.tasks.Task> r7 = r5.addedTasks
            java.lang.String r0 = r6.getId()
            if (r0 != 0) goto L7c
            goto L7d
        L7c:
            r3 = r0
        L7d:
            r7.put(r3, r6)
            goto L9e
        L81:
            boolean r7 = r5.editMode
            if (r7 == 0) goto L9e
            java.util.HashMap<java.lang.String, com.habitrpg.android.habitica.models.tasks.Task> r7 = r5.addedTasks
            java.lang.String r0 = r6.getId()
            boolean r7 = r7.containsKey(r0)
            if (r7 != 0) goto L9e
            java.util.HashMap<java.lang.String, com.habitrpg.android.habitica.models.tasks.Task> r7 = r5.updatedTasks
            java.lang.String r0 = r6.getId()
            if (r0 != 0) goto L9a
            goto L9b
        L9a:
            r3 = r0
        L9b:
            r7.put(r3, r6)
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity.addOrUpdateTaskInList(com.habitrpg.android.habitica.models.tasks.Task, boolean):void");
    }

    static /* synthetic */ void addOrUpdateTaskInList$default(ChallengeFormActivity challengeFormActivity, Task task, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        challengeFormActivity.addOrUpdateTaskInList(task, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String checkPrizeAndMinimumForTavern() {
        boolean z10;
        int i10;
        double d10;
        String str;
        ActivityCreateChallengeBinding activityCreateChallengeBinding = this.binding;
        ActivityCreateChallengeBinding activityCreateChallengeBinding2 = null;
        if (activityCreateChallengeBinding == null) {
            qc.q.z("binding");
            activityCreateChallengeBinding = null;
        }
        String obj = activityCreateChallengeBinding.createChallengePrize.getText().toString();
        boolean z11 = true;
        if (obj.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            obj = "0";
        }
        try {
            i10 = Integer.parseInt(obj);
        } catch (NumberFormatException unused) {
            i10 = 0;
        }
        ActivityCreateChallengeBinding activityCreateChallengeBinding3 = this.binding;
        if (activityCreateChallengeBinding3 == null) {
            qc.q.z("binding");
            activityCreateChallengeBinding3 = null;
        }
        int selectedItemPosition = activityCreateChallengeBinding3.challengeLocationSpinner.getSelectedItemPosition();
        User user = this.user;
        if (user != null) {
            d10 = user.getGemCount();
        } else {
            d10 = 0.0d;
        }
        if (selectedItemPosition == 0 && i10 == 0) {
            ActivityCreateChallengeBinding activityCreateChallengeBinding4 = this.binding;
            if (activityCreateChallengeBinding4 == null) {
                qc.q.z("binding");
                activityCreateChallengeBinding4 = null;
            }
            activityCreateChallengeBinding4.createChallengeGemError.setVisibility(0);
            str = getString(R.string.challenge_create_error_tavern_one_gem);
            qc.q.h(str, "getString(...)");
            ActivityCreateChallengeBinding activityCreateChallengeBinding5 = this.binding;
            if (activityCreateChallengeBinding5 == null) {
                qc.q.z("binding");
                activityCreateChallengeBinding5 = null;
            }
            activityCreateChallengeBinding5.createChallengeGemError.setText(str);
        } else if (i10 > d10) {
            ActivityCreateChallengeBinding activityCreateChallengeBinding6 = this.binding;
            if (activityCreateChallengeBinding6 == null) {
                qc.q.z("binding");
                activityCreateChallengeBinding6 = null;
            }
            activityCreateChallengeBinding6.createChallengeGemError.setVisibility(0);
            str = getString(R.string.challenge_create_error_enough_gems);
            qc.q.h(str, "getString(...)");
            ActivityCreateChallengeBinding activityCreateChallengeBinding7 = this.binding;
            if (activityCreateChallengeBinding7 == null) {
                qc.q.z("binding");
                activityCreateChallengeBinding7 = null;
            }
            activityCreateChallengeBinding7.createChallengeGemError.setText(str);
        } else {
            ActivityCreateChallengeBinding activityCreateChallengeBinding8 = this.binding;
            if (activityCreateChallengeBinding8 == null) {
                qc.q.z("binding");
                activityCreateChallengeBinding8 = null;
            }
            activityCreateChallengeBinding8.createChallengeGemError.setVisibility(8);
            str = "";
        }
        ActivityCreateChallengeBinding activityCreateChallengeBinding9 = this.binding;
        if (activityCreateChallengeBinding9 == null) {
            qc.q.z("binding");
        } else {
            activityCreateChallengeBinding2 = activityCreateChallengeBinding9;
        }
        ImageButton imageButton = activityCreateChallengeBinding2.challengeRemoveGemBtn;
        if (i10 == 0) {
            z11 = false;
        }
        imageButton.setEnabled(z11);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object createChallenge(Continuation<? super Challenge> continuation) {
        Challenge challengeData = getChallengeData();
        ChallengeTasksRecyclerViewAdapter challengeTasksRecyclerViewAdapter = this.challengeTasks;
        Task task = null;
        if (challengeTasksRecyclerViewAdapter == null) {
            qc.q.z("challengeTasks");
            challengeTasksRecyclerViewAdapter = null;
        }
        List<Task> taskList = challengeTasksRecyclerViewAdapter.getTaskList();
        Task task2 = this.addHabit;
        if (task2 == null) {
            qc.q.z("addHabit");
            task2 = null;
        }
        taskList.remove(task2);
        Task task3 = this.addDaily;
        if (task3 == null) {
            qc.q.z("addDaily");
            task3 = null;
        }
        taskList.remove(task3);
        Task task4 = this.addTodo;
        if (task4 == null) {
            qc.q.z("addTodo");
            task4 = null;
        }
        taskList.remove(task4);
        Task task5 = this.addReward;
        if (task5 == null) {
            qc.q.z("addReward");
        } else {
            task = task5;
        }
        taskList.remove(task);
        return getChallengeRepository$Habitica_2311256681_prodRelease().createChallenge(challengeData, taskList, continuation);
    }

    private final void fillControls() {
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.u(true);
            supportActionBar.z(R.drawable.ic_close_white_24dp);
            supportActionBar.E("");
            supportActionBar.r(new ColorDrawable(ContextExtensionsKt.getThemeColor(this, R.attr.colorPrimaryOffset)));
            supportActionBar.x(0.0f);
        }
        GroupArrayAdapter groupArrayAdapter = this.locationAdapter;
        ActivityCreateChallengeBinding activityCreateChallengeBinding = null;
        if (groupArrayAdapter == null) {
            qc.q.z("locationAdapter");
            groupArrayAdapter = null;
        }
        groupArrayAdapter.setDropDownViewResource(17367049);
        ad.i.d(androidx.lifecycle.w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new ChallengeFormActivity$fillControls$1(this, null), 2, null);
        ActivityCreateChallengeBinding activityCreateChallengeBinding2 = this.binding;
        if (activityCreateChallengeBinding2 == null) {
            qc.q.z("binding");
            activityCreateChallengeBinding2 = null;
        }
        Spinner spinner = activityCreateChallengeBinding2.challengeLocationSpinner;
        GroupArrayAdapter groupArrayAdapter2 = this.locationAdapter;
        if (groupArrayAdapter2 == null) {
            qc.q.z("locationAdapter");
            groupArrayAdapter2 = null;
        }
        spinner.setAdapter((SpinnerAdapter) groupArrayAdapter2);
        ActivityCreateChallengeBinding activityCreateChallengeBinding3 = this.binding;
        if (activityCreateChallengeBinding3 == null) {
            qc.q.z("binding");
            activityCreateChallengeBinding3 = null;
        }
        activityCreateChallengeBinding3.challengeLocationSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity$fillControls$2
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
                qc.q.i(adapterView, "adapterView");
                ChallengeFormActivity.this.checkPrizeAndMinimumForTavern();
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
                qc.q.i(adapterView, "adapterView");
            }
        });
        ActivityCreateChallengeBinding activityCreateChallengeBinding4 = this.binding;
        if (activityCreateChallengeBinding4 == null) {
            qc.q.z("binding");
            activityCreateChallengeBinding4 = null;
        }
        activityCreateChallengeBinding4.createChallengePrize.setOnKeyListener(new View.OnKeyListener() { // from class: com.habitrpg.android.habitica.ui.activities.q
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                boolean fillControls$lambda$3;
                fillControls$lambda$3 = ChallengeFormActivity.fillControls$lambda$3(ChallengeFormActivity.this, view, i10, keyEvent);
                return fillControls$lambda$3;
            }
        });
        ArrayList arrayList = new ArrayList();
        Task task = this.addHabit;
        if (task == null) {
            qc.q.z("addHabit");
            task = null;
        }
        arrayList.add(task);
        Task task2 = this.addDaily;
        if (task2 == null) {
            qc.q.z("addDaily");
            task2 = null;
        }
        arrayList.add(task2);
        Task task3 = this.addTodo;
        if (task3 == null) {
            qc.q.z("addTodo");
            task3 = null;
        }
        arrayList.add(task3);
        Task task4 = this.addReward;
        if (task4 == null) {
            qc.q.z("addReward");
            task4 = null;
        }
        arrayList.add(task4);
        ChallengeTasksRecyclerViewAdapter challengeTasksRecyclerViewAdapter = this.challengeTasks;
        if (challengeTasksRecyclerViewAdapter == null) {
            qc.q.z("challengeTasks");
            challengeTasksRecyclerViewAdapter = null;
        }
        challengeTasksRecyclerViewAdapter.setTasks(arrayList);
        ChallengeTasksRecyclerViewAdapter challengeTasksRecyclerViewAdapter2 = this.challengeTasks;
        if (challengeTasksRecyclerViewAdapter2 == null) {
            qc.q.z("challengeTasks");
            challengeTasksRecyclerViewAdapter2 = null;
        }
        challengeTasksRecyclerViewAdapter2.setOnAddItem(new ChallengeFormActivity$fillControls$4(this));
        ActivityCreateChallengeBinding activityCreateChallengeBinding5 = this.binding;
        if (activityCreateChallengeBinding5 == null) {
            qc.q.z("binding");
            activityCreateChallengeBinding5 = null;
        }
        activityCreateChallengeBinding5.createChallengeTaskList.addOnItemTouchListener(new RecyclerView.z() { // from class: com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity$fillControls$5
            @Override // androidx.recyclerview.widget.RecyclerView.z, androidx.recyclerview.widget.RecyclerView.t
            public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
                qc.q.i(recyclerView, "rv");
                qc.q.i(motionEvent, "e");
                if (recyclerView.getScrollState() == 1) {
                    return true;
                }
                return false;
            }
        });
        ActivityCreateChallengeBinding activityCreateChallengeBinding6 = this.binding;
        if (activityCreateChallengeBinding6 == null) {
            qc.q.z("binding");
            activityCreateChallengeBinding6 = null;
        }
        RecyclerView recyclerView = activityCreateChallengeBinding6.createChallengeTaskList;
        ChallengeTasksRecyclerViewAdapter challengeTasksRecyclerViewAdapter3 = this.challengeTasks;
        if (challengeTasksRecyclerViewAdapter3 == null) {
            qc.q.z("challengeTasks");
            challengeTasksRecyclerViewAdapter3 = null;
        }
        recyclerView.setAdapter(challengeTasksRecyclerViewAdapter3);
        ActivityCreateChallengeBinding activityCreateChallengeBinding7 = this.binding;
        if (activityCreateChallengeBinding7 == null) {
            qc.q.z("binding");
        } else {
            activityCreateChallengeBinding = activityCreateChallengeBinding7;
        }
        activityCreateChallengeBinding.createChallengeTaskList.setLayoutManager(new LinearLayoutManager(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fillControls$lambda$3(ChallengeFormActivity challengeFormActivity, View view, int i10, KeyEvent keyEvent) {
        qc.q.i(challengeFormActivity, "this$0");
        challengeFormActivity.checkPrizeAndMinimumForTavern();
        return false;
    }

    private final void fillControlsByChallenge() {
        String str = this.challengeId;
        if (str != null) {
            ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new ChallengeFormActivity$fillControlsByChallenge$1$1(this, str, null), 1, null);
            ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new ChallengeFormActivity$fillControlsByChallenge$1$2(this, str, null), 1, null);
        }
    }

    private final Challenge getChallengeData() {
        Challenge challenge = new Challenge();
        ActivityCreateChallengeBinding activityCreateChallengeBinding = this.binding;
        ActivityCreateChallengeBinding activityCreateChallengeBinding2 = null;
        if (activityCreateChallengeBinding == null) {
            qc.q.z("binding");
            activityCreateChallengeBinding = null;
        }
        int selectedItemPosition = activityCreateChallengeBinding.challengeLocationSpinner.getSelectedItemPosition();
        String str = this.challengeId;
        if (str != null) {
            challenge.setId(str);
        }
        String str2 = this.groupID;
        if (str2 != null) {
            challenge.setGroupId(str2);
        } else {
            GroupArrayAdapter groupArrayAdapter = this.locationAdapter;
            if (groupArrayAdapter == null) {
                qc.q.z("locationAdapter");
                groupArrayAdapter = null;
            }
            if (groupArrayAdapter.getCount() > selectedItemPosition && selectedItemPosition >= 0) {
                GroupArrayAdapter groupArrayAdapter2 = this.locationAdapter;
                if (groupArrayAdapter2 == null) {
                    qc.q.z("locationAdapter");
                    groupArrayAdapter2 = null;
                }
                Group group = (Group) groupArrayAdapter2.getItem(selectedItemPosition);
                if (group != null) {
                    challenge.setGroupId(group.getId());
                }
            }
        }
        ActivityCreateChallengeBinding activityCreateChallengeBinding3 = this.binding;
        if (activityCreateChallengeBinding3 == null) {
            qc.q.z("binding");
            activityCreateChallengeBinding3 = null;
        }
        challenge.setName(String.valueOf(activityCreateChallengeBinding3.createChallengeTitle.getText()));
        ActivityCreateChallengeBinding activityCreateChallengeBinding4 = this.binding;
        if (activityCreateChallengeBinding4 == null) {
            qc.q.z("binding");
            activityCreateChallengeBinding4 = null;
        }
        challenge.setDescription(String.valueOf(activityCreateChallengeBinding4.createChallengeDescription.getText()));
        ActivityCreateChallengeBinding activityCreateChallengeBinding5 = this.binding;
        if (activityCreateChallengeBinding5 == null) {
            qc.q.z("binding");
            activityCreateChallengeBinding5 = null;
        }
        challenge.setShortName(String.valueOf(activityCreateChallengeBinding5.createChallengeTag.getText()));
        ActivityCreateChallengeBinding activityCreateChallengeBinding6 = this.binding;
        if (activityCreateChallengeBinding6 == null) {
            qc.q.z("binding");
        } else {
            activityCreateChallengeBinding2 = activityCreateChallengeBinding6;
        }
        challenge.setPrize(Integer.parseInt(activityCreateChallengeBinding2.createChallengePrize.getText().toString()));
        return challenge;
    }

    private final String getEditTextString(EditText editText) {
        return editText.getText().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void newTaskResult$lambda$5(ChallengeFormActivity challengeFormActivity, ActivityResult activityResult) {
        Task task;
        qc.q.i(challengeFormActivity, "this$0");
        if (activityResult.b() == -1) {
            Intent a10 = activityResult.a();
            if (a10 != null) {
                task = (Task) a10.getParcelableExtra(TaskFormActivity.PARCELABLE_TASK);
            } else {
                task = null;
            }
            if (task != null) {
                addOrUpdateTaskInList$default(challengeFormActivity, task, false, 2, null);
            }
        }
    }

    private final void onAddGem() {
        boolean z10;
        ActivityCreateChallengeBinding activityCreateChallengeBinding = this.binding;
        ActivityCreateChallengeBinding activityCreateChallengeBinding2 = null;
        if (activityCreateChallengeBinding == null) {
            qc.q.z("binding");
            activityCreateChallengeBinding = null;
        }
        String obj = activityCreateChallengeBinding.createChallengePrize.getText().toString();
        if (obj.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            obj = "0";
        }
        int parseInt = Integer.parseInt(obj) + 1;
        ActivityCreateChallengeBinding activityCreateChallengeBinding3 = this.binding;
        if (activityCreateChallengeBinding3 == null) {
            qc.q.z("binding");
        } else {
            activityCreateChallengeBinding2 = activityCreateChallengeBinding3;
        }
        activityCreateChallengeBinding2.createChallengePrize.setText(String.valueOf(parseInt));
        checkPrizeAndMinimumForTavern();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(ChallengeFormActivity challengeFormActivity, View view) {
        qc.q.i(challengeFormActivity, "this$0");
        challengeFormActivity.onAddGem();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(ChallengeFormActivity challengeFormActivity, View view) {
        qc.q.i(challengeFormActivity, "this$0");
        challengeFormActivity.onRemoveGem();
    }

    private final void onRemoveGem() {
        boolean z10;
        ActivityCreateChallengeBinding activityCreateChallengeBinding = this.binding;
        ActivityCreateChallengeBinding activityCreateChallengeBinding2 = null;
        if (activityCreateChallengeBinding == null) {
            qc.q.z("binding");
            activityCreateChallengeBinding = null;
        }
        String obj = activityCreateChallengeBinding.createChallengePrize.getText().toString();
        if (obj.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            obj = "0";
        }
        int parseInt = Integer.parseInt(obj) - 1;
        ActivityCreateChallengeBinding activityCreateChallengeBinding3 = this.binding;
        if (activityCreateChallengeBinding3 == null) {
            qc.q.z("binding");
        } else {
            activityCreateChallengeBinding2 = activityCreateChallengeBinding3;
        }
        activityCreateChallengeBinding2.createChallengePrize.setText(String.valueOf(parseInt));
        checkPrizeAndMinimumForTavern();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openNewTaskActivity(TaskType taskType, Task task) {
        String str;
        String str2;
        Bundle bundle = new Bundle();
        if (taskType == null || (str = taskType.getValue()) == null) {
            str = "";
        }
        bundle.putString(TaskFormActivity.TASK_TYPE_KEY, str);
        if (task != null) {
            bundle.putParcelable(TaskFormActivity.PARCELABLE_TASK, task);
        }
        bundle.putBoolean(TaskFormActivity.SET_IGNORE_FLAG, true);
        bundle.putBoolean(TaskFormActivity.IS_CHALLENGE_TASK, true);
        User user = this.user;
        if (user != null) {
            str2 = user.getId();
        } else {
            str2 = null;
        }
        bundle.putString(TaskFormActivity.USER_ID_KEY, str2);
        Intent intent = new Intent(this, TaskFormActivity.class);
        intent.putExtras(bundle);
        this.newTaskResult.a(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateChallenge(Continuation<? super Challenge> continuation) {
        Challenge challengeData = getChallengeData();
        ChallengeTasksRecyclerViewAdapter challengeTasksRecyclerViewAdapter = this.challengeTasks;
        Task task = null;
        if (challengeTasksRecyclerViewAdapter == null) {
            qc.q.z("challengeTasks");
            challengeTasksRecyclerViewAdapter = null;
        }
        List<Task> taskList = challengeTasksRecyclerViewAdapter.getTaskList();
        Task task2 = this.addHabit;
        if (task2 == null) {
            qc.q.z("addHabit");
            task2 = null;
        }
        taskList.remove(task2);
        Task task3 = this.addDaily;
        if (task3 == null) {
            qc.q.z("addDaily");
            task3 = null;
        }
        taskList.remove(task3);
        Task task4 = this.addTodo;
        if (task4 == null) {
            qc.q.z("addTodo");
            task4 = null;
        }
        taskList.remove(task4);
        Task task5 = this.addReward;
        if (task5 == null) {
            qc.q.z("addReward");
        } else {
            task = task5;
        }
        taskList.remove(task);
        return getChallengeRepository$Habitica_2311256681_prodRelease().updateChallenge(challengeData, taskList, new ArrayList(this.addedTasks.values()), new ArrayList(this.updatedTasks.values()), new ArrayList(this.removedTasks.keySet()), continuation);
    }

    private final boolean validateAllFields() {
        boolean z10;
        boolean z11;
        boolean z12;
        String k02;
        ArrayList arrayList = new ArrayList();
        ActivityCreateChallengeBinding activityCreateChallengeBinding = this.binding;
        if (activityCreateChallengeBinding == null) {
            qc.q.z("binding");
            activityCreateChallengeBinding = null;
        }
        TextInputEditText textInputEditText = activityCreateChallengeBinding.createChallengeTitle;
        qc.q.h(textInputEditText, "createChallengeTitle");
        if (getEditTextString(textInputEditText).length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            String string = getString(R.string.challenge_create_error_title);
            qc.q.h(string, "getString(...)");
            ActivityCreateChallengeBinding activityCreateChallengeBinding2 = this.binding;
            if (activityCreateChallengeBinding2 == null) {
                qc.q.z("binding");
                activityCreateChallengeBinding2 = null;
            }
            activityCreateChallengeBinding2.createChallengeTitleInputLayout.setError(string);
            arrayList.add(string);
        } else {
            ActivityCreateChallengeBinding activityCreateChallengeBinding3 = this.binding;
            if (activityCreateChallengeBinding3 == null) {
                qc.q.z("binding");
                activityCreateChallengeBinding3 = null;
            }
            activityCreateChallengeBinding3.createChallengeTitleInputLayout.setErrorEnabled(false);
        }
        ActivityCreateChallengeBinding activityCreateChallengeBinding4 = this.binding;
        if (activityCreateChallengeBinding4 == null) {
            qc.q.z("binding");
            activityCreateChallengeBinding4 = null;
        }
        TextInputEditText textInputEditText2 = activityCreateChallengeBinding4.createChallengeTag;
        qc.q.h(textInputEditText2, "createChallengeTag");
        if (getEditTextString(textInputEditText2).length() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            String string2 = getString(R.string.challenge_create_error_tag);
            qc.q.h(string2, "getString(...)");
            ActivityCreateChallengeBinding activityCreateChallengeBinding5 = this.binding;
            if (activityCreateChallengeBinding5 == null) {
                qc.q.z("binding");
                activityCreateChallengeBinding5 = null;
            }
            activityCreateChallengeBinding5.createChallengeTagInputLayout.setError(string2);
            arrayList.add(string2);
        } else {
            ActivityCreateChallengeBinding activityCreateChallengeBinding6 = this.binding;
            if (activityCreateChallengeBinding6 == null) {
                qc.q.z("binding");
                activityCreateChallengeBinding6 = null;
            }
            activityCreateChallengeBinding6.createChallengeTagInputLayout.setErrorEnabled(false);
        }
        String checkPrizeAndMinimumForTavern = checkPrizeAndMinimumForTavern();
        if (checkPrizeAndMinimumForTavern.length() > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            arrayList.add(checkPrizeAndMinimumForTavern);
        }
        ChallengeTasksRecyclerViewAdapter challengeTasksRecyclerViewAdapter = this.challengeTasks;
        if (challengeTasksRecyclerViewAdapter == null) {
            qc.q.z("challengeTasks");
            challengeTasksRecyclerViewAdapter = null;
        }
        if (challengeTasksRecyclerViewAdapter.getTaskList().size() <= 4) {
            ActivityCreateChallengeBinding activityCreateChallengeBinding7 = this.binding;
            if (activityCreateChallengeBinding7 == null) {
                qc.q.z("binding");
                activityCreateChallengeBinding7 = null;
            }
            activityCreateChallengeBinding7.createChallengeTaskError.setVisibility(0);
            arrayList.add(getString(R.string.challenge_create_error_no_tasks));
        } else {
            ActivityCreateChallengeBinding activityCreateChallengeBinding8 = this.binding;
            if (activityCreateChallengeBinding8 == null) {
                qc.q.z("binding");
                activityCreateChallengeBinding8 = null;
            }
            activityCreateChallengeBinding8.createChallengeTaskError.setVisibility(8);
        }
        if ((!arrayList.isEmpty()) != false) {
            HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(this);
            k02 = ec.b0.k0(arrayList, "\n", null, null, 0, null, null, 62, null);
            habiticaAlertDialog.setMessage(k02);
            AlertDialogExtensionsKt.addCloseButton$default(habiticaAlertDialog, true, null, 2, null);
            habiticaAlertDialog.enqueue();
        }
        if (arrayList.size() == 0) {
            return true;
        }
        return false;
    }

    public final ChallengeRepository getChallengeRepository$Habitica_2311256681_prodRelease() {
        ChallengeRepository challengeRepository = this.challengeRepository;
        if (challengeRepository != null) {
            return challengeRepository;
        }
        qc.q.z("challengeRepository");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    public View getContentView(Integer num) {
        ActivityCreateChallengeBinding inflate = ActivityCreateChallengeBinding.inflate(getLayoutInflater());
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
        return Integer.valueOf((int) R.layout.activity_create_challenge);
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    public Boolean getOverrideModernHeader() {
        return this.overrideModernHeader;
    }

    public final SocialRepository getSocialRepository$Habitica_2311256681_prodRelease() {
        SocialRepository socialRepository = this.socialRepository;
        if (socialRepository != null) {
            return socialRepository;
        }
        qc.q.z("socialRepository");
        return null;
    }

    public final TasksViewModel getTasksViewModel() {
        TasksViewModel tasksViewModel = this.tasksViewModel;
        if (tasksViewModel != null) {
            return tasksViewModel;
        }
        qc.q.z("tasksViewModel");
        return null;
    }

    public final MainUserViewModel getUserViewModel$Habitica_2311256681_prodRelease() {
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
        Companion companion = Companion;
        String string = getResources().getString(R.string.add_habit);
        qc.q.h(string, "getString(...)");
        this.addHabit = companion.createTask(string);
        String string2 = getResources().getString(R.string.add_daily);
        qc.q.h(string2, "getString(...)");
        this.addDaily = companion.createTask(string2);
        String string3 = getResources().getString(R.string.add_todo);
        qc.q.h(string3, "getString(...)");
        this.addTodo = companion.createTask(string3);
        String string4 = getResources().getString(R.string.add_reward);
        qc.q.h(string4, "getString(...)");
        this.addReward = companion.createTask(string4);
        super.onCreate(bundle);
        setupToolbar((Toolbar) findViewById(R.id.toolbar));
        Bundle extras = getIntent().getExtras();
        setTasksViewModel((TasksViewModel) new androidx.lifecycle.y0(this).a(TasksViewModel.class));
        ChallengeTasksRecyclerViewAdapter challengeTasksRecyclerViewAdapter = new ChallengeTasksRecyclerViewAdapter(getTasksViewModel(), 0, this, "", false, true);
        this.challengeTasks = challengeTasksRecyclerViewAdapter;
        challengeTasksRecyclerViewAdapter.setOnTaskOpen(new ChallengeFormActivity$onCreate$2(this));
        this.locationAdapter = new GroupArrayAdapter(this);
        ActivityCreateChallengeBinding activityCreateChallengeBinding = null;
        if (extras != null) {
            this.challengeId = extras.getString(CHALLENGE_ID_KEY, null);
        }
        fillControls();
        if (this.challengeId != null) {
            fillControlsByChallenge();
        }
        getUserViewModel$Habitica_2311256681_prodRelease().getUser().j(this, new ChallengeFormActivity$sam$androidx_lifecycle_Observer$0(new ChallengeFormActivity$onCreate$3(this)));
        ActivityCreateChallengeBinding activityCreateChallengeBinding2 = this.binding;
        if (activityCreateChallengeBinding2 == null) {
            qc.q.z("binding");
            activityCreateChallengeBinding2 = null;
        }
        activityCreateChallengeBinding2.gemIconView.setImageBitmap(HabiticaIconsHelper.imageOfGem());
        ActivityCreateChallengeBinding activityCreateChallengeBinding3 = this.binding;
        if (activityCreateChallengeBinding3 == null) {
            qc.q.z("binding");
            activityCreateChallengeBinding3 = null;
        }
        activityCreateChallengeBinding3.challengeAddGemBtn.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChallengeFormActivity.onCreate$lambda$1(ChallengeFormActivity.this, view);
            }
        });
        ActivityCreateChallengeBinding activityCreateChallengeBinding4 = this.binding;
        if (activityCreateChallengeBinding4 == null) {
            qc.q.z("binding");
        } else {
            activityCreateChallengeBinding = activityCreateChallengeBinding4;
        }
        activityCreateChallengeBinding.challengeRemoveGemBtn.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChallengeFormActivity.onCreate$lambda$2(ChallengeFormActivity.this, view);
            }
        });
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        qc.q.i(menu, "menu");
        MenuInflater menuInflater = getMenuInflater();
        qc.q.h(menuInflater, "getMenuInflater(...)");
        menuInflater.inflate(R.menu.menu_create_challenge, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.appcompat.app.d, androidx.fragment.app.q, android.app.Activity
    public void onDestroy() {
        getSocialRepository$Habitica_2311256681_prodRelease().close();
        getChallengeRepository$Habitica_2311256681_prodRelease().close();
        super.onDestroy();
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        qc.q.i(menuItem, "item");
        if (menuItem.getItemId() == R.id.action_save && !this.savingInProgress && validateAllFields()) {
            this.savingInProgress = true;
            HabiticaProgressDialog show = HabiticaProgressDialog.Companion.show(this, R.string.saving);
            ExceptionHandlerKt.launchCatching(androidx.lifecycle.w.a(this), new ChallengeFormActivity$onOptionsItemSelected$1(show, this), new ChallengeFormActivity$onOptionsItemSelected$2(this, show, null));
        } else if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final void setChallengeRepository$Habitica_2311256681_prodRelease(ChallengeRepository challengeRepository) {
        qc.q.i(challengeRepository, "<set-?>");
        this.challengeRepository = challengeRepository;
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    public void setOverrideModernHeader(Boolean bool) {
        this.overrideModernHeader = bool;
    }

    public final void setSocialRepository$Habitica_2311256681_prodRelease(SocialRepository socialRepository) {
        qc.q.i(socialRepository, "<set-?>");
        this.socialRepository = socialRepository;
    }

    public final void setTasksViewModel(TasksViewModel tasksViewModel) {
        qc.q.i(tasksViewModel, "<set-?>");
        this.tasksViewModel = tasksViewModel;
    }

    public final void setUserViewModel$Habitica_2311256681_prodRelease(MainUserViewModel mainUserViewModel) {
        qc.q.i(mainUserViewModel, "<set-?>");
        this.userViewModel = mainUserViewModel;
    }
}
