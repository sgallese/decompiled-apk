package com.habitrpg.android.habitica.ui.fragments.tasks;

import ad.i;
import ad.x1;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.p0;
import androidx.fragment.app.q;
import androidx.lifecycle.f0;
import androidx.lifecycle.w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.databinding.FragmentRefreshRecyclerviewBinding;
import com.habitrpg.android.habitica.extensions.BaseViewModelExtensionsKt;
import com.habitrpg.android.habitica.extensions.ViewExtKt;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.HapticFeedbackManager;
import com.habitrpg.android.habitica.helpers.NotificationsManager;
import com.habitrpg.android.habitica.helpers.SoundManager;
import com.habitrpg.android.habitica.models.tasks.ChecklistItem;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.models.tasks.TaskGroupPlan;
import com.habitrpg.android.habitica.models.user.Preferences;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import com.habitrpg.android.habitica.ui.adapter.tasks.DailiesRecyclerViewHolder;
import com.habitrpg.android.habitica.ui.adapter.tasks.HabitsRecyclerViewAdapter;
import com.habitrpg.android.habitica.ui.adapter.tasks.RewardsRecyclerViewAdapter;
import com.habitrpg.android.habitica.ui.adapter.tasks.TaskRecyclerViewAdapter;
import com.habitrpg.android.habitica.ui.adapter.tasks.TodosRecyclerViewAdapter;
import com.habitrpg.android.habitica.ui.fragments.tasks.TasksFragment;
import com.habitrpg.android.habitica.ui.helpers.RecyclerViewEmptySupport;
import com.habitrpg.android.habitica.ui.helpers.SafeDefaultItemAnimator;
import com.habitrpg.android.habitica.ui.viewHolders.tasks.BaseTaskViewHolder;
import com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import com.habitrpg.android.habitica.ui.views.HabiticaSnackbar;
import com.habitrpg.common.habitica.helpers.EmptyItem;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.shared.habitica.models.responses.TaskDirection;
import com.habitrpg.shared.habitica.models.responses.TaskScoringResult;
import com.habitrpg.shared.habitica.models.tasks.TaskType;
import dc.j;
import java.util.Date;
import java.util.List;
import qc.d0;
import qc.g0;
import qc.h;

/* compiled from: TaskRecyclerViewFragment.kt */
/* loaded from: classes4.dex */
public class TaskRecyclerViewFragment extends Hilt_TaskRecyclerViewFragment<FragmentRefreshRecyclerviewBinding> implements SwipeRefreshLayout.j {
    private static final String CLASS_TYPE_KEY = "CLASS_TYPE_KEY";
    private FragmentRefreshRecyclerviewBinding binding;
    private boolean canScoreTaks;
    public AppConfigManager configManager;
    public InventoryRepository inventoryRepository;
    private SafeDefaultItemAnimator itemAnimator;
    private m.e itemTouchCallback;
    private RecyclerView.p layoutManager;
    public NotificationsManager notificationsManager;
    private TaskRecyclerViewAdapter recyclerAdapter;
    public SharedPreferences sharedPreferences;
    public SoundManager soundManager;
    private x1 taskFlowJob;
    public TaskRepository taskRepository;
    private TaskType taskType;
    public UserRepository userRepository;
    private final dc.f viewModel$delegate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: TaskRecyclerViewFragment.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {

        /* compiled from: TaskRecyclerViewFragment.kt */
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
                try {
                    iArr[TaskType.REWARD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00d5  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment newInstance(android.content.Context r7, com.habitrpg.shared.habitica.models.tasks.TaskType r8) {
            /*
                r6 = this;
                java.lang.String r0 = "classType"
                qc.q.i(r8, r0)
                com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment r0 = new com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment
                r0.<init>()
                r0.setTaskType$Habitica_2311256681_prodRelease(r8)
                if (r7 == 0) goto Ld2
                com.habitrpg.shared.habitica.models.tasks.TaskType r8 = r0.getTaskType$Habitica_2311256681_prodRelease()
                int[] r1 = com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment.Companion.WhenMappings.$EnumSwitchMapping$0
                int r8 = r8.ordinal()
                r8 = r1[r8]
                r1 = 1
                java.lang.String r2 = "getString(...)"
                if (r8 == r1) goto L92
                r1 = 2
                if (r8 == r1) goto L70
                r1 = 3
                if (r8 == r1) goto L4e
                r1 = 4
                if (r8 == r1) goto L2b
                goto Ld2
            L2b:
                java.lang.String r8 = "rewards"
                r0.setTutorialStepIdentifier(r8)
                r8 = 2131953348(0x7f1306c4, float:1.9543164E38)
                java.lang.String r8 = r7.getString(r8)
                qc.q.h(r8, r2)
                r1 = 2131953349(0x7f1306c5, float:1.9543166E38)
                java.lang.String r7 = r7.getString(r1)
                qc.q.h(r7, r2)
                java.lang.String[] r7 = new java.lang.String[]{r8, r7}
                java.util.List r7 = ec.r.l(r7)
                goto Ld3
            L4e:
                java.lang.String r8 = "todos"
                r0.setTutorialStepIdentifier(r8)
                r8 = 2131953354(0x7f1306ca, float:1.9543177E38)
                java.lang.String r8 = r7.getString(r8)
                qc.q.h(r8, r2)
                r1 = 2131953355(0x7f1306cb, float:1.9543179E38)
                java.lang.String r7 = r7.getString(r1)
                qc.q.h(r7, r2)
                java.lang.String[] r7 = new java.lang.String[]{r8, r7}
                java.util.List r7 = ec.r.l(r7)
                goto Ld3
            L70:
                java.lang.String r8 = "dailies"
                r0.setTutorialStepIdentifier(r8)
                r8 = 2131953338(0x7f1306ba, float:1.9543144E38)
                java.lang.String r8 = r7.getString(r8)
                qc.q.h(r8, r2)
                r1 = 2131953339(0x7f1306bb, float:1.9543146E38)
                java.lang.String r7 = r7.getString(r1)
                qc.q.h(r7, r2)
                java.lang.String[] r7 = new java.lang.String[]{r8, r7}
                java.util.List r7 = ec.r.l(r7)
                goto Ld3
            L92:
                java.lang.String r8 = "habits"
                r0.setTutorialStepIdentifier(r8)
                r8 = 2131953344(0x7f1306c0, float:1.9543156E38)
                java.lang.String r8 = r7.getString(r8)
                qc.q.h(r8, r2)
                r1 = 2131953340(0x7f1306bc, float:1.9543148E38)
                java.lang.String r1 = r7.getString(r1)
                qc.q.h(r1, r2)
                r3 = 2131953341(0x7f1306bd, float:1.954315E38)
                java.lang.String r3 = r7.getString(r3)
                qc.q.h(r3, r2)
                r4 = 2131953342(0x7f1306be, float:1.9543152E38)
                java.lang.String r4 = r7.getString(r4)
                qc.q.h(r4, r2)
                r5 = 2131953343(0x7f1306bf, float:1.9543154E38)
                java.lang.String r7 = r7.getString(r5)
                qc.q.h(r7, r2)
                java.lang.String[] r7 = new java.lang.String[]{r8, r1, r3, r4, r7}
                java.util.List r7 = ec.r.l(r7)
                goto Ld3
            Ld2:
                r7 = 0
            Ld3:
                if (r7 == 0) goto Ldf
                java.util.ArrayList r8 = new java.util.ArrayList
                java.util.Collection r7 = (java.util.Collection) r7
                r8.<init>(r7)
                r0.setTutorialTexts(r8)
            Ldf:
                r7 = 0
                com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment.access$setTutorialCanBeDeferred(r0, r7)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment.Companion.newInstance(android.content.Context, com.habitrpg.shared.habitica.models.tasks.TaskType):com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment");
        }
    }

    /* compiled from: TaskRecyclerViewFragment.kt */
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
            try {
                iArr[TaskType.REWARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TaskRecyclerViewFragment() {
        dc.f a10;
        a10 = dc.h.a(j.NONE, new TaskRecyclerViewFragment$special$$inlined$viewModels$default$1(new TaskRecyclerViewFragment$viewModel$2(this)));
        this.viewModel$delegate = p0.b(this, g0.b(TasksViewModel.class), new TaskRecyclerViewFragment$special$$inlined$viewModels$default$2(a10), new TaskRecyclerViewFragment$special$$inlined$viewModels$default$3(null, a10), new TaskRecyclerViewFragment$special$$inlined$viewModels$default$4(this, a10));
        this.canScoreTaks = true;
        this.itemAnimator = new SafeDefaultItemAnimator();
        this.taskType = TaskType.HABIT;
    }

    private final void allowReordering() {
        m mVar;
        m.e eVar = this.itemTouchCallback;
        RecyclerViewEmptySupport recyclerViewEmptySupport = null;
        if (eVar != null) {
            mVar = new m(eVar);
        } else {
            mVar = null;
        }
        if (mVar != null) {
            FragmentRefreshRecyclerviewBinding binding = getBinding();
            if (binding != null) {
                recyclerViewEmptySupport = binding.recyclerView;
            }
            mVar.d(recyclerViewEmptySupport);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleTaskResult(TaskScoringResult taskScoringResult, int i10) {
        MainActivity mainActivity = null;
        if (this.taskType == TaskType.REWARD) {
            q activity = getActivity();
            if (activity instanceof MainActivity) {
                mainActivity = (MainActivity) activity;
            }
            if (mainActivity != null) {
                HabiticaSnackbar.Companion.showSnackbar(mainActivity.getSnackbarContainer(), null, getString(R.string.notification_purchase_reward), new BitmapDrawable(getResources(), HabiticaIconsHelper.imageOfGold()), Integer.valueOf(androidx.core.content.a.c(mainActivity, R.color.yellow_10)), "-" + i10, HabiticaSnackbar.SnackbarDisplayType.DROP, (r25 & 128) != 0 ? false : false, (r25 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? false : false, (r25 & 512) != 0 ? 0 : 0);
                return;
            }
            return;
        }
        q activity2 = getActivity();
        if (activity2 instanceof MainActivity) {
            mainActivity = (MainActivity) activity2;
        }
        if (mainActivity != null) {
            mainActivity.displayTaskScoringResponse$Habitica_2311256681_prodRelease(taskScoringResult);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openTaskForm(Task task) {
        long j10;
        String str;
        String str2;
        long time = new Date().getTime();
        TasksFragment.Companion companion = TasksFragment.Companion;
        Date lastTaskFormOpen = companion.getLastTaskFormOpen();
        if (lastTaskFormOpen != null) {
            j10 = lastTaskFormOpen.getTime();
        } else {
            j10 = 0;
        }
        if (time - j10 >= 2000 && task.isValid()) {
            Bundle bundle = new Bundle();
            TaskType type = task.getType();
            if (type != null) {
                str = type.getValue();
            } else {
                str = null;
            }
            bundle.putString(TaskFormActivity.TASK_TYPE_KEY, str);
            bundle.putString(TaskFormActivity.TASK_ID_KEY, task.getId());
            TaskGroupPlan group = task.getGroup();
            if (group != null) {
                str2 = group.getGroupID();
            } else {
                str2 = null;
            }
            bundle.putString(TaskFormActivity.GROUP_ID_KEY, str2);
            bundle.putDouble(TaskFormActivity.TASK_VALUE_KEY, task.getValue());
            ExceptionHandlerKt.launchCatching$default(w.a(this), null, new TaskRecyclerViewFragment$openTaskForm$1(this, task, bundle, null), 1, null);
            companion.setLastTaskFormOpen(new Date());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void playSound(TaskDirection taskDirection) {
        String str;
        HapticFeedbackManager.Companion companion = HapticFeedbackManager.Companion;
        View requireView = requireView();
        qc.q.h(requireView, "requireView(...)");
        companion.tap(requireView);
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.taskType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        str = null;
                    } else {
                        str = SoundManager.SoundReward;
                    }
                } else {
                    str = SoundManager.SoundTodo;
                }
            } else {
                str = SoundManager.SoundDaily;
            }
        } else if (taskDirection == TaskDirection.UP) {
            str = SoundManager.SoundPlusHabit;
        } else {
            str = SoundManager.SoundMinusHabit;
        }
        if (str != null) {
            getSoundManager().loadAndPlayAudio(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scoreChecklistItem(Task task, ChecklistItem checklistItem) {
        i.d(w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new TaskRecyclerViewFragment$scoreChecklistItem$1(this, task, checklistItem, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scoreTask(Task task, TaskDirection taskDirection) {
        getViewModel().scoreTask(task, taskDirection, new TaskRecyclerViewFragment$scoreTask$1(this));
    }

    private final void setEmptyLabels() {
        RecyclerViewEmptySupport recyclerViewEmptySupport;
        EmptyItem emptyItem;
        FragmentRefreshRecyclerviewBinding binding = getBinding();
        if (binding != null) {
            recyclerViewEmptySupport = binding.recyclerView;
        } else {
            recyclerViewEmptySupport = null;
        }
        if (recyclerViewEmptySupport != null) {
            if (getViewModel().filterCount(this.taskType) > 0) {
                int i10 = WhenMappings.$EnumSwitchMapping$0[this.taskType.ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                emptyItem = new EmptyItem("", null, null, false, null, 30, null);
                            } else {
                                String string = getString(R.string.empty_title_rewards_filtered);
                                qc.q.h(string, "getString(...)");
                                emptyItem = new EmptyItem(string, null, Integer.valueOf((int) R.drawable.icon_rewards), false, null, 24, null);
                            }
                        } else {
                            String string2 = getString(R.string.empty_title_todos_filtered);
                            qc.q.h(string2, "getString(...)");
                            emptyItem = new EmptyItem(string2, getString(R.string.empty_description_todos_filtered), Integer.valueOf((int) R.drawable.icon_todos), false, null, 24, null);
                        }
                    } else {
                        String string3 = getString(R.string.empty_title_dailies_filtered);
                        qc.q.h(string3, "getString(...)");
                        emptyItem = new EmptyItem(string3, getString(R.string.empty_description_dailies_filtered), Integer.valueOf((int) R.drawable.icon_dailies), false, null, 24, null);
                    }
                } else {
                    String string4 = getString(R.string.empty_title_habits_filtered);
                    qc.q.h(string4, "getString(...)");
                    emptyItem = new EmptyItem(string4, getString(R.string.empty_description_habits_filtered), Integer.valueOf((int) R.drawable.icon_habits), false, null, 24, null);
                }
            } else {
                int i11 = WhenMappings.$EnumSwitchMapping$0[this.taskType.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                emptyItem = new EmptyItem("", null, null, false, null, 30, null);
                            } else {
                                String string5 = getString(R.string.empty_title_rewards);
                                qc.q.h(string5, "getString(...)");
                                emptyItem = new EmptyItem(string5, null, Integer.valueOf((int) R.drawable.icon_rewards), false, null, 24, null);
                            }
                        } else {
                            String string6 = getString(R.string.empty_title_todos);
                            qc.q.h(string6, "getString(...)");
                            emptyItem = new EmptyItem(string6, getString(R.string.empty_description_todos), Integer.valueOf((int) R.drawable.icon_todos), false, null, 24, null);
                        }
                    } else {
                        String string7 = getString(R.string.empty_title_dailies);
                        qc.q.h(string7, "getString(...)");
                        emptyItem = new EmptyItem(string7, getString(R.string.empty_description_dailies), Integer.valueOf((int) R.drawable.icon_dailies), false, null, 24, null);
                    }
                } else {
                    String string8 = getString(R.string.empty_title_habits);
                    qc.q.h(string8, "getString(...)");
                    emptyItem = new EmptyItem(string8, getString(R.string.empty_description_habits), Integer.valueOf((int) R.drawable.icon_habits), false, null, 24, null);
                }
            }
            recyclerViewEmptySupport.setEmptyItem(emptyItem);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.habitrpg.android.habitica.ui.adapter.tasks.TaskRecyclerViewAdapter] */
    private final void setInnerAdapter() {
        RecyclerView.h hVar;
        RecyclerView.h<?> habitsRecyclerViewAdapter;
        ?? r32;
        RecyclerViewEmptySupport recyclerViewEmptySupport;
        TaskRecyclerViewAdapter taskRecyclerViewAdapter;
        RecyclerView.h hVar2;
        RecyclerViewEmptySupport recyclerViewEmptySupport2;
        RecyclerViewEmptySupport recyclerViewEmptySupport3;
        FragmentRefreshRecyclerviewBinding binding = getBinding();
        if (binding != null && (recyclerViewEmptySupport3 = binding.recyclerView) != null) {
            hVar = recyclerViewEmptySupport3.getAdapter();
        } else {
            hVar = null;
        }
        if (hVar != null) {
            FragmentRefreshRecyclerviewBinding binding2 = getBinding();
            if (binding2 != null && (recyclerViewEmptySupport2 = binding2.recyclerView) != null) {
                hVar2 = recyclerViewEmptySupport2.getAdapter();
            } else {
                hVar2 = null;
            }
            if (qc.q.d(hVar2, this.recyclerAdapter)) {
                return;
            }
        }
        TasksViewModel viewModel = getViewModel();
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.taskType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        habitsRecyclerViewAdapter = null;
                    } else {
                        habitsRecyclerViewAdapter = new RewardsRecyclerViewAdapter(null, R.layout.reward_item_card, viewModel);
                    }
                } else {
                    habitsRecyclerViewAdapter = new TodosRecyclerViewAdapter(R.layout.todo_item_card, viewModel);
                }
            } else {
                habitsRecyclerViewAdapter = new DailiesRecyclerViewHolder(R.layout.daily_item_card, viewModel);
            }
        } else {
            habitsRecyclerViewAdapter = new HabitsRecyclerViewAdapter(R.layout.habit_item_card, viewModel);
        }
        if (habitsRecyclerViewAdapter instanceof TaskRecyclerViewAdapter) {
            r32 = habitsRecyclerViewAdapter;
        } else {
            r32 = 0;
        }
        this.recyclerAdapter = r32;
        FragmentRefreshRecyclerviewBinding binding3 = getBinding();
        if (binding3 != null) {
            recyclerViewEmptySupport = binding3.recyclerView;
        } else {
            recyclerViewEmptySupport = null;
        }
        if (recyclerViewEmptySupport != null) {
            recyclerViewEmptySupport.setAdapter(habitsRecyclerViewAdapter);
        }
        f0<dc.q<String, String, List<String>>> filterSet = viewModel.getFilterSet(this.taskType);
        if (filterSet != null) {
            filterSet.j(getViewLifecycleOwner(), new TaskRecyclerViewFragment$sam$androidx_lifecycle_Observer$0(new TaskRecyclerViewFragment$setInnerAdapter$1$1(this)));
        }
        Context context = getContext();
        if (context != null && (taskRecyclerViewAdapter = this.recyclerAdapter) != null) {
            taskRecyclerViewAdapter.setTaskDisplayMode(getConfigManager().taskDisplayMode(context));
        }
        TaskRecyclerViewAdapter taskRecyclerViewAdapter2 = this.recyclerAdapter;
        if (taskRecyclerViewAdapter2 != null) {
            taskRecyclerViewAdapter2.setErrorButtonEvents(new TaskRecyclerViewFragment$setInnerAdapter$3(this));
        }
        TaskRecyclerViewAdapter taskRecyclerViewAdapter3 = this.recyclerAdapter;
        if (taskRecyclerViewAdapter3 != null) {
            taskRecyclerViewAdapter3.setTaskOpenEvents(new TaskRecyclerViewFragment$setInnerAdapter$4(this));
        }
        TaskRecyclerViewAdapter taskRecyclerViewAdapter4 = this.recyclerAdapter;
        if (taskRecyclerViewAdapter4 != null) {
            taskRecyclerViewAdapter4.setTaskScoreEvents(new TaskRecyclerViewFragment$setInnerAdapter$5(this));
        }
        TaskRecyclerViewAdapter taskRecyclerViewAdapter5 = this.recyclerAdapter;
        if (taskRecyclerViewAdapter5 != null) {
            taskRecyclerViewAdapter5.setChecklistItemScoreEvents(new TaskRecyclerViewFragment$setInnerAdapter$6(this));
        }
        TaskRecyclerViewAdapter taskRecyclerViewAdapter6 = this.recyclerAdapter;
        if (taskRecyclerViewAdapter6 != null) {
            taskRecyclerViewAdapter6.setBrokenTaskEvents(new TaskRecyclerViewFragment$setInnerAdapter$7(this));
        }
        TaskRecyclerViewAdapter taskRecyclerViewAdapter7 = this.recyclerAdapter;
        if (taskRecyclerViewAdapter7 != null) {
            taskRecyclerViewAdapter7.setAdventureGuideOpenEvents(TaskRecyclerViewFragment$setInnerAdapter$8.INSTANCE);
        }
        getViewModel().getOwnerID().j(getViewLifecycleOwner(), new TaskRecyclerViewFragment$sam$androidx_lifecycle_Observer$0(new TaskRecyclerViewFragment$setInnerAdapter$9(this)));
        i.d(w.a(this), null, null, new TaskRecyclerViewFragment$setInnerAdapter$10(this, null), 3, null);
    }

    private final void setPreferenceTaskFilters() {
        BaseViewModelExtensionsKt.observeOnce(getViewModel().getUserViewModel().getUser(), this, new androidx.lifecycle.g0() { // from class: com.habitrpg.android.habitica.ui.fragments.tasks.c
            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                TaskRecyclerViewFragment.setPreferenceTaskFilters$lambda$8(TaskRecyclerViewFragment.this, (User) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setPreferenceTaskFilters$lambda$8(TaskRecyclerViewFragment taskRecyclerViewFragment, User user) {
        qc.q.i(taskRecyclerViewFragment, "this$0");
        if (user != null) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[taskRecyclerViewFragment.taskType.ordinal()];
            if (i10 != 2) {
                if (i10 == 3) {
                    taskRecyclerViewFragment.getViewModel().setActiveFilter(TaskType.TODO, "active");
                }
            } else if (!taskRecyclerViewFragment.getViewModel().getInitialPreferenceFilterSet()) {
                boolean z10 = true;
                taskRecyclerViewFragment.getViewModel().setInitialPreferenceFilterSet(true);
                if (user.isValid()) {
                    Preferences preferences = user.getPreferences();
                    if (preferences == null || !preferences.getDailyDueDefaultView()) {
                        z10 = false;
                    }
                    if (z10) {
                        taskRecyclerViewFragment.getViewModel().setActiveFilter(TaskType.DAILY, "active");
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTaskSubscription(String str) {
        boolean z10;
        String[] strArr;
        x1 d10;
        x1 x1Var;
        x1 x1Var2 = this.taskFlowJob;
        if (x1Var2 != null && x1Var2.b()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (x1Var = this.taskFlowJob) != null) {
            x1.a.a(x1Var, null, 1, null);
        }
        if (qc.q.d(str, getViewModel().getUserViewModel().getUserID())) {
            strArr = (String[]) getViewModel().getUserViewModel().getMirrorGroupTasks().toArray(new String[0]);
        } else {
            strArr = new String[0];
        }
        d10 = i.d(w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new TaskRecyclerViewFragment$updateTaskSubscription$1(this, str, strArr, null), 2, null);
        this.taskFlowJob = d10;
    }

    public final boolean getCanScoreTaks$Habitica_2311256681_prodRelease() {
        return this.canScoreTaks;
    }

    public final TaskType getClassName$Habitica_2311256681_prodRelease() {
        return this.taskType;
    }

    public final AppConfigManager getConfigManager() {
        AppConfigManager appConfigManager = this.configManager;
        if (appConfigManager != null) {
            return appConfigManager;
        }
        qc.q.z("configManager");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public String getDisplayedClassName() {
        return this.taskType.getValue() + super.getDisplayedClassName();
    }

    public final InventoryRepository getInventoryRepository() {
        InventoryRepository inventoryRepository = this.inventoryRepository;
        if (inventoryRepository != null) {
            return inventoryRepository;
        }
        qc.q.z("inventoryRepository");
        return null;
    }

    public final SafeDefaultItemAnimator getItemAnimator() {
        return this.itemAnimator;
    }

    protected LinearLayoutManager getLayoutManager(Context context) {
        return new LinearLayoutManager(context);
    }

    public final RecyclerView.p getLayoutManager$Habitica_2311256681_prodRelease() {
        return this.layoutManager;
    }

    public final NotificationsManager getNotificationsManager() {
        NotificationsManager notificationsManager = this.notificationsManager;
        if (notificationsManager != null) {
            return notificationsManager;
        }
        qc.q.z("notificationsManager");
        return null;
    }

    public final TaskRecyclerViewAdapter getRecyclerAdapter() {
        return this.recyclerAdapter;
    }

    public final SharedPreferences getSharedPreferences() {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        qc.q.z("sharedPreferences");
        return null;
    }

    public final SoundManager getSoundManager() {
        SoundManager soundManager = this.soundManager;
        if (soundManager != null) {
            return soundManager;
        }
        qc.q.z("soundManager");
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

    public final TaskType getTaskType$Habitica_2311256681_prodRelease() {
        return this.taskType;
    }

    public final UserRepository getUserRepository() {
        UserRepository userRepository = this.userRepository;
        if (userRepository != null) {
            return userRepository;
        }
        qc.q.z("userRepository");
        return null;
    }

    public final TasksViewModel getViewModel() {
        return (TasksViewModel) this.viewModel$delegate.getValue();
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getUserRepository().close();
        super.onDestroy();
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.itemTouchCallback = null;
    }

    public void onRefresh() {
        SwipeRefreshLayout swipeRefreshLayout;
        FragmentRefreshRecyclerviewBinding binding = getBinding();
        if (binding != null) {
            swipeRefreshLayout = binding.refreshLayout;
        } else {
            swipeRefreshLayout = null;
        }
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(true);
        }
        getViewModel().refreshData$Habitica_2311256681_prodRelease(new TaskRecyclerViewFragment$onRefresh$1(this));
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        TaskRecyclerViewAdapter taskRecyclerViewAdapter;
        super.onResume();
        Context context = getContext();
        if (context != null && (taskRecyclerViewAdapter = this.recyclerAdapter) != null) {
            taskRecyclerViewAdapter.setTaskDisplayMode(getConfigManager().taskDisplayMode(context));
        }
        setInnerAdapter();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        qc.q.i(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putString("CLASS_TYPE_KEY", this.taskType.getValue());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        RecyclerViewEmptySupport recyclerViewEmptySupport;
        RecyclerViewEmptySupport recyclerViewEmptySupport2;
        RecyclerViewEmptySupport recyclerViewEmptySupport3;
        SwipeRefreshLayout swipeRefreshLayout;
        RecyclerViewEmptySupport recyclerViewEmptySupport4;
        qc.q.i(view, "view");
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            TaskType from = TaskType.Companion.from(bundle.getString("CLASS_TYPE_KEY", ""));
            if (from == null) {
                from = TaskType.HABIT;
            }
            this.taskType = from;
        }
        setInnerAdapter();
        TaskRecyclerViewAdapter taskRecyclerViewAdapter = this.recyclerAdapter;
        if (taskRecyclerViewAdapter != null) {
            taskRecyclerViewAdapter.filter();
        }
        this.itemTouchCallback = new m.e() { // from class: com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment$onViewCreated$2
            private final void updateTaskInRepository(String str, RecyclerView.f0 f0Var) {
                int i10;
                int i11;
                int i12;
                List<Task> data;
                Task task;
                List<Task> data2;
                Task task2;
                List<Task> data3;
                if (str != null) {
                    d0 d0Var = new d0();
                    d0Var.f21667f = f0Var.getBindingAdapterPosition();
                    boolean z10 = false;
                    if (TaskRecyclerViewFragment.this.getViewModel().filterCount(TaskRecyclerViewFragment.this.getTaskType$Habitica_2311256681_prodRelease()) > 0) {
                        int i13 = d0Var.f21667f + 1;
                        TaskRecyclerViewAdapter recyclerAdapter = TaskRecyclerViewFragment.this.getRecyclerAdapter();
                        if (recyclerAdapter != null && (data3 = recyclerAdapter.getData()) != null) {
                            i10 = data3.size();
                        } else {
                            i10 = 0;
                        }
                        if (i13 >= i10) {
                            TaskRecyclerViewAdapter recyclerAdapter2 = TaskRecyclerViewFragment.this.getRecyclerAdapter();
                            if (recyclerAdapter2 != null && (data2 = recyclerAdapter2.getData()) != null && (task2 = data2.get(d0Var.f21667f - 1)) != null) {
                                i12 = task2.getPosition();
                            } else {
                                i12 = d0Var.f21667f;
                            }
                        } else {
                            TaskRecyclerViewAdapter recyclerAdapter3 = TaskRecyclerViewFragment.this.getRecyclerAdapter();
                            if (recyclerAdapter3 != null && (data = recyclerAdapter3.getData()) != null && (task = data.get(d0Var.f21667f + 1)) != null) {
                                i11 = task.getPosition();
                            } else {
                                i11 = d0Var.f21667f;
                            }
                            i12 = i11 - 1;
                        }
                        d0Var.f21667f = i12;
                    }
                    TaskRecyclerViewAdapter recyclerAdapter4 = TaskRecyclerViewFragment.this.getRecyclerAdapter();
                    if (recyclerAdapter4 != null && recyclerAdapter4.getShowAdventureGuide()) {
                        z10 = true;
                    }
                    if (z10) {
                        d0Var.f21667f--;
                    }
                    ExceptionHandlerKt.launchCatching$default(w.a(TaskRecyclerViewFragment.this), null, new TaskRecyclerViewFragment$onViewCreated$2$updateTaskInRepository$1(TaskRecyclerViewFragment.this, str, d0Var, null), 1, null);
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:
            
                if (r4 != r5.intValue()) goto L35;
             */
            /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
            /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
            @Override // androidx.recyclerview.widget.m.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void clearView(androidx.recyclerview.widget.RecyclerView r7, androidx.recyclerview.widget.RecyclerView.f0 r8) {
                /*
                    r6 = this;
                    java.lang.String r0 = "recyclerView"
                    qc.q.i(r7, r0)
                    java.lang.String r0 = "viewHolder"
                    qc.q.i(r8, r0)
                    super.clearView(r7, r8)
                    com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment r7 = com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment.this
                    com.habitrpg.android.habitica.databinding.FragmentRefreshRecyclerviewBinding r7 = r7.getBinding()
                    r0 = 0
                    if (r7 == 0) goto L19
                    androidx.swiperefreshlayout.widget.SwipeRefreshLayout r7 = r7.refreshLayout
                    goto L1a
                L19:
                    r7 = r0
                L1a:
                    r1 = 1
                    if (r7 != 0) goto L1e
                    goto L21
                L1e:
                    r7.setEnabled(r1)
                L21:
                    int r7 = r8.getBindingAdapterPosition()
                    r2 = -1
                    if (r7 != r2) goto L29
                    return
                L29:
                    boolean r7 = r8 instanceof com.habitrpg.android.habitica.ui.viewHolders.tasks.BaseTaskViewHolder
                    if (r7 == 0) goto L31
                    r7 = r8
                    com.habitrpg.android.habitica.ui.viewHolders.tasks.BaseTaskViewHolder r7 = (com.habitrpg.android.habitica.ui.viewHolders.tasks.BaseTaskViewHolder) r7
                    goto L32
                L31:
                    r7 = r0
                L32:
                    if (r7 == 0) goto L49
                    com.habitrpg.android.habitica.models.tasks.Task r2 = r7.getTask()
                    if (r2 == 0) goto L49
                    boolean r3 = r2.isValid()
                    if (r3 == 0) goto L41
                    goto L42
                L41:
                    r2 = r0
                L42:
                    if (r2 == 0) goto L49
                    java.lang.String r2 = r2.getId()
                    goto L4a
                L49:
                    r2 = r0
                L4a:
                    r3 = 0
                    if (r7 == 0) goto L5f
                    int r4 = r8.getBindingAdapterPosition()
                    java.lang.Integer r5 = r7.getMovingFromPosition()
                    if (r5 != 0) goto L58
                    goto L5f
                L58:
                    int r5 = r5.intValue()
                    if (r4 != r5) goto L5f
                    goto L60
                L5f:
                    r1 = 0
                L60:
                    if (r1 != 0) goto L6b
                    if (r7 != 0) goto L65
                    goto L68
                L65:
                    r7.setMovingFromPosition(r0)
                L68:
                    r6.updateTaskInRepository(r2, r8)
                L6b:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment$onViewCreated$2.clearView(androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$f0):void");
            }

            @Override // androidx.recyclerview.widget.m.e
            public int getMovementFlags(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
                int i10;
                qc.q.i(recyclerView, "recyclerView");
                qc.q.i(f0Var, "viewHolder");
                TaskRecyclerViewAdapter recyclerAdapter = TaskRecyclerViewFragment.this.getRecyclerAdapter();
                if (recyclerAdapter != null) {
                    i10 = recyclerAdapter.getItemViewType(f0Var.getBindingAdapterPosition());
                } else {
                    i10 = 0;
                }
                if (i10 != 0) {
                    return m.e.makeFlag(0, 0);
                }
                return m.e.makeFlag(2, 3);
            }

            @Override // androidx.recyclerview.widget.m.e
            public boolean isItemViewSwipeEnabled() {
                return false;
            }

            @Override // androidx.recyclerview.widget.m.e
            public boolean isLongPressDragEnabled() {
                return true;
            }

            @Override // androidx.recyclerview.widget.m.e
            public boolean onMove(RecyclerView recyclerView, RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2) {
                qc.q.i(recyclerView, "recyclerView");
                qc.q.i(f0Var, "viewHolder");
                qc.q.i(f0Var2, "target");
                TaskRecyclerViewAdapter recyclerAdapter = TaskRecyclerViewFragment.this.getRecyclerAdapter();
                if (recyclerAdapter != null) {
                    recyclerAdapter.notifyItemMoved(f0Var.getBindingAdapterPosition(), f0Var2.getBindingAdapterPosition());
                    return true;
                }
                return true;
            }

            @Override // androidx.recyclerview.widget.m.e
            public void onSelectedChanged(RecyclerView.f0 f0Var, int i10) {
                BaseTaskViewHolder baseTaskViewHolder;
                super.onSelectedChanged(f0Var, i10);
                if (f0Var != null && f0Var.getBindingAdapterPosition() != -1) {
                    SwipeRefreshLayout swipeRefreshLayout2 = null;
                    if (f0Var instanceof BaseTaskViewHolder) {
                        baseTaskViewHolder = (BaseTaskViewHolder) f0Var;
                    } else {
                        baseTaskViewHolder = null;
                    }
                    if (baseTaskViewHolder != null) {
                        baseTaskViewHolder.setMovingFromPosition(Integer.valueOf(((BaseTaskViewHolder) f0Var).getBindingAdapterPosition()));
                    }
                    FragmentRefreshRecyclerviewBinding binding = TaskRecyclerViewFragment.this.getBinding();
                    if (binding != null) {
                        swipeRefreshLayout2 = binding.refreshLayout;
                    }
                    if (swipeRefreshLayout2 != null) {
                        swipeRefreshLayout2.setEnabled(false);
                    }
                }
            }

            @Override // androidx.recyclerview.widget.m.e
            public void onSwiped(RecyclerView.f0 f0Var, int i10) {
                qc.q.i(f0Var, "viewHolder");
            }
        };
        FragmentRefreshRecyclerviewBinding binding = getBinding();
        if (binding != null && (recyclerViewEmptySupport4 = binding.recyclerView) != null) {
            ViewExtKt.setScaledPadding(recyclerViewEmptySupport4, getContext(), 0, 0, 0, 108);
        }
        this.layoutManager = getLayoutManager(getContext());
        FragmentRefreshRecyclerviewBinding binding2 = getBinding();
        if (binding2 != null) {
            recyclerViewEmptySupport = binding2.recyclerView;
        } else {
            recyclerViewEmptySupport = null;
        }
        if (recyclerViewEmptySupport != null) {
            recyclerViewEmptySupport.setLayoutManager(this.layoutManager);
        }
        allowReordering();
        FragmentRefreshRecyclerviewBinding binding3 = getBinding();
        if (binding3 != null) {
            recyclerViewEmptySupport2 = binding3.recyclerView;
        } else {
            recyclerViewEmptySupport2 = null;
        }
        if (recyclerViewEmptySupport2 != null) {
            recyclerViewEmptySupport2.setItemAnimator(this.itemAnimator);
        }
        FragmentRefreshRecyclerviewBinding binding4 = getBinding();
        if (binding4 != null && (swipeRefreshLayout = binding4.refreshLayout) != null) {
            swipeRefreshLayout.setOnRefreshListener(this);
        }
        setEmptyLabels();
        FragmentRefreshRecyclerviewBinding binding5 = getBinding();
        if (binding5 != null && (recyclerViewEmptySupport3 = binding5.recyclerView) != null) {
            recyclerViewEmptySupport3.addOnScrollListener(new RecyclerView.u() { // from class: com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment$onViewCreated$3
                @Override // androidx.recyclerview.widget.RecyclerView.u
                public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
                    SwipeRefreshLayout swipeRefreshLayout2;
                    boolean z10;
                    qc.q.i(recyclerView, "recyclerView");
                    super.onScrollStateChanged(recyclerView, i10);
                    if (i10 == 0) {
                        FragmentRefreshRecyclerviewBinding binding6 = TaskRecyclerViewFragment.this.getBinding();
                        MainActivity mainActivity = null;
                        if (binding6 != null) {
                            swipeRefreshLayout2 = binding6.refreshLayout;
                        } else {
                            swipeRefreshLayout2 = null;
                        }
                        if (swipeRefreshLayout2 != null) {
                            q activity = TaskRecyclerViewFragment.this.getActivity();
                            if (activity instanceof MainActivity) {
                                mainActivity = (MainActivity) activity;
                            }
                            if (mainActivity != null) {
                                z10 = mainActivity.isAppBarExpanded();
                            } else {
                                z10 = false;
                            }
                            swipeRefreshLayout2.setEnabled(z10);
                        }
                    }
                }
            });
        }
        i.d(w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new TaskRecyclerViewFragment$onViewCreated$4(this, null), 2, null);
        setPreferenceTaskFilters();
    }

    public final void setActiveFilter(String str) {
        qc.q.i(str, "activeFilter");
        getViewModel().setActiveFilter(this.taskType, str);
        TaskRecyclerViewAdapter taskRecyclerViewAdapter = this.recyclerAdapter;
        if (taskRecyclerViewAdapter != null) {
            taskRecyclerViewAdapter.filter();
        }
        setEmptyLabels();
        if (qc.q.d(str, Task.FILTER_COMPLETED)) {
            ExceptionHandlerKt.launchCatching$default(w.a(this), null, new TaskRecyclerViewFragment$setActiveFilter$1(this, null), 1, null);
        }
    }

    public final void setCanScoreTaks$Habitica_2311256681_prodRelease(boolean z10) {
        this.canScoreTaks = z10;
    }

    public final void setConfigManager(AppConfigManager appConfigManager) {
        qc.q.i(appConfigManager, "<set-?>");
        this.configManager = appConfigManager;
    }

    public final void setInventoryRepository(InventoryRepository inventoryRepository) {
        qc.q.i(inventoryRepository, "<set-?>");
        this.inventoryRepository = inventoryRepository;
    }

    public final void setItemAnimator(SafeDefaultItemAnimator safeDefaultItemAnimator) {
        qc.q.i(safeDefaultItemAnimator, "<set-?>");
        this.itemAnimator = safeDefaultItemAnimator;
    }

    public final void setLayoutManager$Habitica_2311256681_prodRelease(RecyclerView.p pVar) {
        this.layoutManager = pVar;
    }

    public final void setNotificationsManager(NotificationsManager notificationsManager) {
        qc.q.i(notificationsManager, "<set-?>");
        this.notificationsManager = notificationsManager;
    }

    public final void setRecyclerAdapter(TaskRecyclerViewAdapter taskRecyclerViewAdapter) {
        this.recyclerAdapter = taskRecyclerViewAdapter;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        qc.q.i(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }

    public final void setSoundManager(SoundManager soundManager) {
        qc.q.i(soundManager, "<set-?>");
        this.soundManager = soundManager;
    }

    public final void setTaskRepository(TaskRepository taskRepository) {
        qc.q.i(taskRepository, "<set-?>");
        this.taskRepository = taskRepository;
    }

    public final void setTaskType$Habitica_2311256681_prodRelease(TaskType taskType) {
        qc.q.i(taskType, "<set-?>");
        this.taskType = taskType;
    }

    public final void setUserRepository(UserRepository userRepository) {
        qc.q.i(userRepository, "<set-?>");
        this.userRepository = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void showBrokenChallengeDialog(Task task) {
        qc.q.i(task, "task");
        Context context = getContext();
        if (context == null || !task.isValid()) {
            return;
        }
        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new TaskRecyclerViewFragment$showBrokenChallengeDialog$1$1(this, task, context, null), 1, null);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentRefreshRecyclerviewBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        qc.q.i(layoutInflater, "inflater");
        FragmentRefreshRecyclerviewBinding inflate = FragmentRefreshRecyclerviewBinding.inflate(layoutInflater, viewGroup, false);
        qc.q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentRefreshRecyclerviewBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentRefreshRecyclerviewBinding fragmentRefreshRecyclerviewBinding) {
        this.binding = fragmentRefreshRecyclerviewBinding;
    }
}
