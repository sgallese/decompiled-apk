package com.habitrpg.android.habitica.ui.fragments.setup;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.FragmentSetupTasksBinding;
import com.habitrpg.android.habitica.models.tasks.Days;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.SpeechBubbleView;
import com.habitrpg.android.habitica.ui.activities.SetupActivity;
import com.habitrpg.android.habitica.ui.adapter.setup.TaskSetupAdapter;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import com.habitrpg.common.habitica.views.AvatarView;
import com.habitrpg.shared.habitica.models.tasks.Frequency;
import com.habitrpg.shared.habitica.models.tasks.TaskType;
import ec.b0;
import ec.t;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import qc.h;
import qc.q;

/* compiled from: TaskSetupFragment.kt */
/* loaded from: classes4.dex */
public final class TaskSetupFragment extends Hilt_TaskSetupFragment<FragmentSetupTasksBinding> {
    public static final String TYPE_CHORES = "chores";
    public static final String TYPE_CREATIVITY = "creativity";
    public static final String TYPE_EXERCISE = "exercise";
    public static final String TYPE_HEALTH = "healthWellness";
    public static final String TYPE_OTHER = "other";
    public static final String TYPE_SCHOOL = "school";
    public static final String TYPE_TEAMS = "teams";
    public static final String TYPE_WORK = "work";
    private SetupActivity activity;
    private TaskSetupAdapter adapter = new TaskSetupAdapter();
    private FragmentSetupTasksBinding binding;
    private List<? extends List<String>> taskGroups;
    private List<? extends List<? extends Object>> tasks;
    private User user;
    private int width;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: TaskSetupFragment.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public TaskSetupFragment() {
        List<? extends List<String>> i10;
        List<? extends List<? extends Object>> i11;
        i10 = t.i();
        this.taskGroups = i10;
        i11 = t.i();
        this.tasks = i11;
    }

    private final Task makeTaskObject(TaskType taskType, String str, Boolean bool, Boolean bool2, String str2) {
        TaskType taskType2;
        Task task = new Task();
        task.setId(UUID.randomUUID().toString());
        if (str == null) {
            str = "";
        }
        task.setText(str);
        task.setNotes(str2);
        task.setPriority(1.0f);
        if (taskType == null) {
            taskType2 = TaskType.HABIT;
        } else {
            taskType2 = taskType;
        }
        task.setType(taskType2);
        task.setFrequency(Frequency.DAILY);
        if (taskType == TaskType.HABIT) {
            task.setUp(bool);
            task.setDown(bool2);
        }
        if (taskType == TaskType.DAILY) {
            task.setFrequency(Frequency.WEEKLY);
            task.setStartDate(new Date());
            task.setEveryX(1);
            Days days = new Days();
            days.setM(true);
            days.setT(true);
            days.setW(true);
            days.setTh(true);
            days.setF(true);
            days.setS(true);
            days.setSu(true);
            task.setRepeat(days);
        }
        return task;
    }

    static /* synthetic */ Task makeTaskObject$default(TaskSetupFragment taskSetupFragment, TaskType taskType, String str, Boolean bool, Boolean bool2, String str2, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            str2 = null;
        }
        return taskSetupFragment.makeTaskObject(taskType, str, bool, bool2, str2);
    }

    private final void setTasks() {
        List l10;
        List l11;
        List l12;
        List l13;
        List l14;
        List l15;
        List l16;
        List l17;
        List<? extends List<String>> l18;
        List l19;
        List l20;
        List l21;
        List l22;
        List l23;
        List l24;
        List l25;
        List l26;
        List l27;
        List l28;
        List l29;
        List l30;
        List l31;
        List l32;
        List l33;
        List l34;
        List l35;
        List l36;
        List l37;
        List l38;
        List l39;
        List<? extends List<? extends Object>> l40;
        l10 = t.l(getString(R.string.setup_group_work), TYPE_WORK);
        l11 = t.l(getString(R.string.setup_group_exercise), TYPE_EXERCISE);
        l12 = t.l(getString(R.string.setup_group_health), TYPE_HEALTH);
        l13 = t.l(getString(R.string.setup_group_school), TYPE_SCHOOL);
        l14 = t.l(getString(R.string.setup_group_teams), TYPE_TEAMS);
        l15 = t.l(getString(R.string.setup_group_chores), TYPE_CHORES);
        l16 = t.l(getString(R.string.setup_group_creativity), TYPE_CREATIVITY);
        l17 = t.l(getString(R.string.setuP_group_other), TYPE_OTHER);
        l18 = t.l(l10, l11, l12, l13, l14, l15, l16, l17);
        this.taskGroups = l18;
        TaskType taskType = TaskType.HABIT;
        String string = getString(R.string.setup_task_work_1);
        q.h(string, "getString(...)");
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        l19 = t.l(TYPE_WORK, taskType, string, bool, bool2);
        TaskType taskType2 = TaskType.DAILY;
        String string2 = getString(R.string.setup_task_work_2);
        q.h(string2, "getString(...)");
        l20 = t.l(TYPE_WORK, taskType2, string2);
        TaskType taskType3 = TaskType.TODO;
        String string3 = getString(R.string.setup_task_work_3);
        q.h(string3, "getString(...)");
        l21 = t.l(TYPE_WORK, taskType3, string3);
        String string4 = getString(R.string.setup_task_exercise_1);
        q.h(string4, "getString(...)");
        l22 = t.l(TYPE_EXERCISE, taskType, string4, bool, bool2);
        String string5 = getString(R.string.setup_task_exercise_2);
        q.h(string5, "getString(...)");
        l23 = t.l(TYPE_EXERCISE, taskType2, string5);
        String string6 = getString(R.string.setup_task_exercise_3);
        q.h(string6, "getString(...)");
        l24 = t.l(TYPE_EXERCISE, taskType3, string6);
        String string7 = getString(R.string.setup_task_healthWellness_1);
        q.h(string7, "getString(...)");
        l25 = t.l(TYPE_HEALTH, taskType, string7, bool, bool);
        String string8 = getString(R.string.setup_task_healthWellness_2);
        q.h(string8, "getString(...)");
        l26 = t.l(TYPE_HEALTH, taskType2, string8);
        String string9 = getString(R.string.setup_task_healthWellness_3);
        q.h(string9, "getString(...)");
        l27 = t.l(TYPE_HEALTH, taskType3, string9);
        String string10 = getString(R.string.setup_task_school_1);
        q.h(string10, "getString(...)");
        l28 = t.l(TYPE_SCHOOL, taskType, string10, bool, bool);
        String string11 = getString(R.string.setup_task_school_2);
        q.h(string11, "getString(...)");
        l29 = t.l(TYPE_SCHOOL, taskType2, string11);
        String string12 = getString(R.string.setup_task_school_3);
        q.h(string12, "getString(...)");
        l30 = t.l(TYPE_SCHOOL, taskType3, string12);
        String string13 = getString(R.string.setup_task_teams_1);
        q.h(string13, "getString(...)");
        l31 = t.l(TYPE_TEAMS, taskType, string13, bool, bool2);
        String string14 = getString(R.string.setup_task_teams_2);
        q.h(string14, "getString(...)");
        l32 = t.l(TYPE_TEAMS, taskType2, string14);
        String string15 = getString(R.string.setup_task_teams_3);
        q.h(string15, "getString(...)");
        l33 = t.l(TYPE_TEAMS, taskType3, string15);
        String string16 = getString(R.string.setup_task_chores_1);
        q.h(string16, "getString(...)");
        l34 = t.l(TYPE_CHORES, taskType, string16, bool, bool2);
        String string17 = getString(R.string.setup_task_chores_2);
        q.h(string17, "getString(...)");
        l35 = t.l(TYPE_CHORES, taskType2, string17);
        String string18 = getString(R.string.setup_task_chores_3);
        q.h(string18, "getString(...)");
        l36 = t.l(TYPE_CHORES, taskType3, string18);
        String string19 = getString(R.string.setup_task_creativity_1);
        q.h(string19, "getString(...)");
        l37 = t.l(TYPE_CREATIVITY, taskType, string19, bool, bool2);
        String string20 = getString(R.string.setup_task_creativity_2);
        q.h(string20, "getString(...)");
        l38 = t.l(TYPE_CREATIVITY, taskType2, string20);
        String string21 = getString(R.string.setup_task_creativity_3);
        q.h(string21, "getString(...)");
        l39 = t.l(TYPE_CREATIVITY, taskType3, string21);
        l40 = t.l(l19, l20, l21, l22, l23, l24, l25, l26, l27, l28, l29, l30, l31, l32, l33, l34, l35, l36, l37, l38, l39);
        this.tasks = l40;
    }

    private final void updateAvatar() {
        FragmentSetupTasksBinding binding;
        AvatarView avatarView;
        User user = this.user;
        if (user != null && (binding = getBinding()) != null && (avatarView = binding.avatarView) != null) {
            q.f(avatarView);
            AvatarView.setAvatar$default(avatarView, user, null, 2, null);
        }
    }

    public final List<Task> createSampleTasks() {
        String str;
        boolean T;
        TaskType taskType;
        String str2;
        Task makeTaskObject$default;
        TaskType taskType2;
        String str3;
        Boolean bool;
        Boolean bool2;
        ArrayList arrayList = new ArrayList();
        Iterator<Boolean> it = this.adapter.getCheckedList().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            if (it.next().booleanValue()) {
                arrayList.add(this.taskGroups.get(i10).get(1));
            }
            i10 = i11;
        }
        ArrayList arrayList2 = new ArrayList();
        for (List<? extends Object> list : this.tasks) {
            Object obj = list.get(0);
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            T = b0.T(arrayList, str);
            if (T) {
                if (list.size() == 5) {
                    Object obj2 = list.get(1);
                    if (obj2 instanceof TaskType) {
                        taskType2 = (TaskType) obj2;
                    } else {
                        taskType2 = null;
                    }
                    Object obj3 = list.get(2);
                    if (obj3 instanceof String) {
                        str3 = (String) obj3;
                    } else {
                        str3 = null;
                    }
                    Object obj4 = list.get(3);
                    if (obj4 instanceof Boolean) {
                        bool = (Boolean) obj4;
                    } else {
                        bool = null;
                    }
                    Object obj5 = list.get(4);
                    if (obj5 instanceof Boolean) {
                        bool2 = (Boolean) obj5;
                    } else {
                        bool2 = null;
                    }
                    makeTaskObject$default = makeTaskObject$default(this, taskType2, str3, bool, bool2, null, 16, null);
                } else {
                    Object obj6 = list.get(1);
                    if (obj6 instanceof TaskType) {
                        taskType = (TaskType) obj6;
                    } else {
                        taskType = null;
                    }
                    Object obj7 = list.get(2);
                    if (obj7 instanceof String) {
                        str2 = (String) obj7;
                    } else {
                        str2 = null;
                    }
                    makeTaskObject$default = makeTaskObject$default(this, taskType, str2, null, null, null, 16, null);
                }
                arrayList2.add(makeTaskObject$default);
            }
        }
        TaskType taskType3 = TaskType.HABIT;
        String string = getString(R.string.setup_task_habit_1);
        Boolean bool3 = Boolean.TRUE;
        Boolean bool4 = Boolean.FALSE;
        arrayList2.add(makeTaskObject(taskType3, string, bool3, bool4, getString(R.string.setup_task_habit_1_notes)));
        arrayList2.add(makeTaskObject(taskType3, getString(R.string.setup_task_habit_2), bool4, bool3, getString(R.string.setup_task_habit_2_notes)));
        arrayList2.add(makeTaskObject(TaskType.REWARD, getString(R.string.setup_task_reward), null, null, getString(R.string.setup_task_reward_notes)));
        arrayList2.add(makeTaskObject(TaskType.TODO, getString(R.string.setup_task_join_habitica), null, null, getString(R.string.setup_task_join_habitica_notes)));
        return arrayList2;
    }

    @Override // androidx.fragment.app.Fragment
    public final SetupActivity getActivity() {
        return this.activity;
    }

    public final TaskSetupAdapter getAdapter$Habitica_2311256681_prodRelease() {
        return this.adapter;
    }

    public final int getWidth() {
        return this.width;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        FragmentSetupTasksBinding binding;
        SpeechBubbleView speechBubbleView;
        String str;
        super.onResume();
        if (getContext() != null && (binding = getBinding()) != null && (speechBubbleView = binding.speechBubble) != null) {
            Context context = getContext();
            if (context == null || (str = context.getString(R.string.task_setup_description)) == null) {
                str = "";
            }
            speechBubbleView.animateText(str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        RecyclerView recyclerView;
        ImageView imageView;
        q.i(view, "view");
        super.onViewCreated(view, bundle);
        setTasks();
        TaskSetupAdapter taskSetupAdapter = new TaskSetupAdapter();
        this.adapter = taskSetupAdapter;
        taskSetupAdapter.setTaskList(this.taskGroups);
        FragmentSetupTasksBinding binding = getBinding();
        RecyclerView recyclerView2 = null;
        if (binding != null) {
            recyclerView = binding.recyclerView;
        } else {
            recyclerView = null;
        }
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new GridLayoutManager(this.activity, 2));
        }
        FragmentSetupTasksBinding binding2 = getBinding();
        if (binding2 != null) {
            recyclerView2 = binding2.recyclerView;
        }
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.adapter);
        }
        if (this.user != null) {
            updateAvatar();
        }
        FragmentSetupTasksBinding binding3 = getBinding();
        if (binding3 != null && (imageView = binding3.heartIcon) != null) {
            imageView.setImageDrawable(new BitmapDrawable(getResources(), HabiticaIconsHelper.imageOfHeartLightBg()));
        }
    }

    public final void setActivity(SetupActivity setupActivity) {
        this.activity = setupActivity;
    }

    public final void setAdapter$Habitica_2311256681_prodRelease(TaskSetupAdapter taskSetupAdapter) {
        q.i(taskSetupAdapter, "<set-?>");
        this.adapter = taskSetupAdapter;
    }

    public final void setUser(User user) {
        AvatarView avatarView;
        this.user = user;
        FragmentSetupTasksBinding binding = getBinding();
        if (binding != null) {
            avatarView = binding.avatarView;
        } else {
            avatarView = null;
        }
        if (avatarView != null) {
            updateAvatar();
        }
    }

    public final void setWidth(int i10) {
        this.width = i10;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentSetupTasksBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q.i(layoutInflater, "inflater");
        FragmentSetupTasksBinding inflate = FragmentSetupTasksBinding.inflate(layoutInflater, viewGroup, false);
        q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentSetupTasksBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentSetupTasksBinding fragmentSetupTasksBinding) {
        this.binding = fragmentSetupTasksBinding;
    }
}
