package com.habitrpg.android.habitica.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.e;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.databinding.ActivitySkillTasksBinding;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.ui.fragments.skills.SkillTasksRecyclerViewFragment;
import com.habitrpg.shared.habitica.models.tasks.TaskType;

/* compiled from: SkillTasksActivity.kt */
/* loaded from: classes4.dex */
public final class SkillTasksActivity extends Hilt_SkillTasksActivity {
    public static final int $stable = 8;
    private ActivitySkillTasksBinding binding;
    public TaskRepository taskRepository;
    private SparseArray<SkillTasksRecyclerViewFragment> viewFragmentsDictionary = new SparseArray<>();

    private final void loadTaskLists() {
        final FragmentManager supportFragmentManager = getSupportFragmentManager();
        final androidx.lifecycle.p lifecycle = getLifecycle();
        FragmentStateAdapter fragmentStateAdapter = new FragmentStateAdapter(supportFragmentManager, lifecycle) { // from class: com.habitrpg.android.habitica.ui.activities.SkillTasksActivity$loadTaskLists$statePagerAdapter$1
            @Override // androidx.viewpager2.adapter.FragmentStateAdapter
            public Fragment createFragment(int i10) {
                TaskType taskType;
                SkillTasksRecyclerViewFragment skillTasksRecyclerViewFragment = new SkillTasksRecyclerViewFragment();
                if (i10 != 0) {
                    if (i10 != 1) {
                        taskType = TaskType.TODO;
                    } else {
                        taskType = TaskType.DAILY;
                    }
                } else {
                    taskType = TaskType.HABIT;
                }
                skillTasksRecyclerViewFragment.setTaskType(taskType);
                skillTasksRecyclerViewFragment.setOnTaskSelection(new SkillTasksActivity$loadTaskLists$statePagerAdapter$1$createFragment$1(SkillTasksActivity.this));
                SkillTasksActivity.this.getViewFragmentsDictionary$Habitica_2311256681_prodRelease().put(i10, skillTasksRecyclerViewFragment);
                return skillTasksRecyclerViewFragment;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.h
            public int getItemCount() {
                return 3;
            }
        };
        ActivitySkillTasksBinding activitySkillTasksBinding = this.binding;
        ActivitySkillTasksBinding activitySkillTasksBinding2 = null;
        if (activitySkillTasksBinding == null) {
            qc.q.z("binding");
            activitySkillTasksBinding = null;
        }
        activitySkillTasksBinding.viewPager.setAdapter(fragmentStateAdapter);
        ActivitySkillTasksBinding activitySkillTasksBinding3 = this.binding;
        if (activitySkillTasksBinding3 == null) {
            qc.q.z("binding");
            activitySkillTasksBinding3 = null;
        }
        TabLayout tabLayout = activitySkillTasksBinding3.tabLayout;
        ActivitySkillTasksBinding activitySkillTasksBinding4 = this.binding;
        if (activitySkillTasksBinding4 == null) {
            qc.q.z("binding");
        } else {
            activitySkillTasksBinding2 = activitySkillTasksBinding4;
        }
        new com.google.android.material.tabs.e(tabLayout, activitySkillTasksBinding2.viewPager, new e.b() { // from class: com.habitrpg.android.habitica.ui.activities.g2
            @Override // com.google.android.material.tabs.e.b
            public final void a(TabLayout.g gVar, int i10) {
                SkillTasksActivity.loadTaskLists$lambda$0(SkillTasksActivity.this, gVar, i10);
            }
        }).a();
        fragmentStateAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadTaskLists$lambda$0(SkillTasksActivity skillTasksActivity, TabLayout.g gVar, int i10) {
        String string;
        qc.q.i(skillTasksActivity, "this$0");
        qc.q.i(gVar, "tab");
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    string = "";
                } else {
                    string = skillTasksActivity.getString(R.string.todos);
                }
            } else {
                string = skillTasksActivity.getString(R.string.dailies);
            }
        } else {
            string = skillTasksActivity.getString(R.string.habits);
        }
        gVar.s(string);
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    public View getContentView(Integer num) {
        ActivitySkillTasksBinding inflate = ActivitySkillTasksBinding.inflate(getLayoutInflater());
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
        return Integer.valueOf((int) R.layout.activity_skill_tasks);
    }

    public final TaskRepository getTaskRepository() {
        TaskRepository taskRepository = this.taskRepository;
        if (taskRepository != null) {
            return taskRepository;
        }
        qc.q.z("taskRepository");
        return null;
    }

    public final SparseArray<SkillTasksRecyclerViewFragment> getViewFragmentsDictionary$Habitica_2311256681_prodRelease() {
        return this.viewFragmentsDictionary;
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.fragment.app.q, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setupToolbar((Toolbar) findViewById(R.id.toolbar));
        loadTaskLists();
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        qc.q.i(menuItem, "item");
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final void setTaskRepository(TaskRepository taskRepository) {
        qc.q.i(taskRepository, "<set-?>");
        this.taskRepository = taskRepository;
    }

    public final void setViewFragmentsDictionary$Habitica_2311256681_prodRelease(SparseArray<SkillTasksRecyclerViewFragment> sparseArray) {
        qc.q.i(sparseArray, "<set-?>");
        this.viewFragmentsDictionary = sparseArray;
    }

    public final void taskSelected(Task task) {
        qc.q.i(task, "task");
        Intent intent = new Intent();
        intent.putExtra("taskID", task.getId());
        setResult(-1, intent);
        finish();
    }
}
