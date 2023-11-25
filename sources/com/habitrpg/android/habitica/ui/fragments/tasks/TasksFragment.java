package com.habitrpg.android.habitica.ui.fragments.tasks;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.p0;
import androidx.lifecycle.p;
import androidx.lifecycle.w;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.TagRepository;
import com.habitrpg.android.habitica.databinding.ActivityMainBinding;
import com.habitrpg.android.habitica.databinding.ActivityMainContentBinding;
import com.habitrpg.android.habitica.databinding.FragmentRefreshRecyclerviewBinding;
import com.habitrpg.android.habitica.databinding.FragmentViewpagerBinding;
import com.habitrpg.android.habitica.extensions.DrawableExtendsionsKt;
import com.habitrpg.android.habitica.helpers.Analytics;
import com.habitrpg.android.habitica.helpers.EventCategory;
import com.habitrpg.android.habitica.helpers.HitType;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import com.habitrpg.android.habitica.ui.helpers.RecyclerViewEmptySupport;
import com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel;
import com.habitrpg.android.habitica.ui.views.navigation.HabiticaBottomNavigationView;
import com.habitrpg.android.habitica.ui.views.navigation.HabiticaBottomNavigationViewListener;
import com.habitrpg.android.habitica.ui.views.tasks.TaskFilterDialog;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import com.habitrpg.shared.habitica.models.tasks.TaskType;
import dc.j;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import qc.g0;
import qc.h;
import qc.q;
import yc.v;

/* compiled from: TasksFragment.kt */
/* loaded from: classes4.dex */
public final class TasksFragment extends Hilt_TasksFragment<FragmentViewpagerBinding> implements SearchView.m, HabiticaBottomNavigationViewListener {
    private static Date lastTaskFormOpen;
    private FragmentViewpagerBinding binding;
    private MenuItem filterMenuItem;
    private MenuItem refreshItem;
    public TagRepository tagRepository;
    private final androidx.activity.result.b<Intent> taskCreateResult;
    private Map<Integer, TaskRecyclerViewFragment> viewFragmentsDictionary;
    private final dc.f viewModel$delegate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: TasksFragment.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final Date getLastTaskFormOpen() {
            return TasksFragment.lastTaskFormOpen;
        }

        public final void setLastTaskFormOpen(Date date) {
            TasksFragment.lastTaskFormOpen = date;
        }
    }

    /* compiled from: TasksFragment.kt */
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

    public TasksFragment() {
        dc.f a10;
        a10 = dc.h.a(j.NONE, new TasksFragment$special$$inlined$viewModels$default$2(new TasksFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel$delegate = p0.b(this, g0.b(TasksViewModel.class), new TasksFragment$special$$inlined$viewModels$default$3(a10), new TasksFragment$special$$inlined$viewModels$default$4(null, a10), new TasksFragment$special$$inlined$viewModels$default$5(this, a10));
        this.viewFragmentsDictionary = new WeakHashMap();
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new f.d(), new androidx.activity.result.a() { // from class: com.habitrpg.android.habitica.ui.fragments.tasks.f
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                TasksFragment.taskCreateResult$lambda$6(TasksFragment.this, (ActivityResult) obj);
            }
        });
        q.h(registerForActivityResult, "registerForActivityResult(...)");
        this.taskCreateResult = registerForActivityResult;
    }

    private final TaskRecyclerViewFragment getActiveFragment() {
        TaskRecyclerViewFragment taskRecyclerViewFragment;
        Integer num;
        ViewPager2 viewPager2;
        Integer num2;
        ViewPager2 viewPager22;
        Map<Integer, TaskRecyclerViewFragment> map = this.viewFragmentsDictionary;
        TaskRecyclerViewFragment taskRecyclerViewFragment2 = null;
        if (map != null) {
            FragmentViewpagerBinding binding = getBinding();
            if (binding != null && (viewPager22 = binding.viewPager) != null) {
                num2 = Integer.valueOf(viewPager22.getCurrentItem());
            } else {
                num2 = null;
            }
            taskRecyclerViewFragment = map.get(num2);
        } else {
            taskRecyclerViewFragment = null;
        }
        if (taskRecyclerViewFragment == null && isAdded()) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            FragmentViewpagerBinding binding2 = getBinding();
            if (binding2 != null && (viewPager2 = binding2.viewPager) != null) {
                num = Integer.valueOf(viewPager2.getCurrentItem());
            } else {
                num = null;
            }
            Fragment j02 = childFragmentManager.j0("android:switcher:2131297731:" + num);
            if (j02 instanceof TaskRecyclerViewFragment) {
                taskRecyclerViewFragment2 = (TaskRecyclerViewFragment) j02;
            }
            return taskRecyclerViewFragment2;
        }
        return taskRecyclerViewFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int indexForTaskType(TaskType taskType) {
        int i10;
        TaskRecyclerViewFragment taskRecyclerViewFragment;
        if (taskType != null) {
            Map<Integer, TaskRecyclerViewFragment> map = this.viewFragmentsDictionary;
            if (map != null) {
                i10 = map.size();
            } else {
                i10 = 0;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                Map<Integer, TaskRecyclerViewFragment> map2 = this.viewFragmentsDictionary;
                if (map2 != null) {
                    taskRecyclerViewFragment = map2.get(Integer.valueOf(i11));
                } else {
                    taskRecyclerViewFragment = null;
                }
                if (taskRecyclerViewFragment != null && taskType == taskRecyclerViewFragment.getClassName$Habitica_2311256681_prodRelease()) {
                    return i11;
                }
            }
            return -1;
        }
        return -1;
    }

    private final void loadTaskLists() {
        ViewPager2 viewPager2;
        ViewPager2 viewPager22;
        final FragmentManager childFragmentManager = getChildFragmentManager();
        q.h(childFragmentManager, "getChildFragmentManager(...)");
        FragmentViewpagerBinding binding = getBinding();
        if (binding != null) {
            viewPager2 = binding.viewPager;
        } else {
            viewPager2 = null;
        }
        if (viewPager2 != null) {
            final p lifecycle = getLifecycle();
            viewPager2.setAdapter(new FragmentStateAdapter(childFragmentManager, lifecycle) { // from class: com.habitrpg.android.habitica.ui.fragments.tasks.TasksFragment$loadTaskLists$1
                @Override // androidx.viewpager2.adapter.FragmentStateAdapter
                public Fragment createFragment(int i10) {
                    TaskRecyclerViewFragment newInstance;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 != 3) {
                                newInstance = TaskRecyclerViewFragment.Companion.newInstance(this.getContext(), TaskType.TODO);
                            } else {
                                newInstance = RewardsRecyclerviewFragment.Companion.newInstance(this.getContext(), TaskType.REWARD, true);
                            }
                        } else {
                            newInstance = TaskRecyclerViewFragment.Companion.newInstance(this.getContext(), TaskType.DAILY);
                        }
                    } else {
                        newInstance = TaskRecyclerViewFragment.Companion.newInstance(this.getContext(), TaskType.HABIT);
                    }
                    Map<Integer, TaskRecyclerViewFragment> viewFragmentsDictionary$Habitica_2311256681_prodRelease = this.getViewFragmentsDictionary$Habitica_2311256681_prodRelease();
                    if (viewFragmentsDictionary$Habitica_2311256681_prodRelease != null) {
                        viewFragmentsDictionary$Habitica_2311256681_prodRelease.put(Integer.valueOf(i10), newInstance);
                    }
                    return newInstance;
                }

                @Override // androidx.recyclerview.widget.RecyclerView.h
                public int getItemCount() {
                    return 4;
                }
            });
        }
        FragmentViewpagerBinding binding2 = getBinding();
        if (binding2 != null && (viewPager22 = binding2.viewPager) != null) {
            viewPager22.g(new ViewPager2.i() { // from class: com.habitrpg.android.habitica.ui.fragments.tasks.TasksFragment$loadTaskLists$2
                @Override // androidx.viewpager2.widget.ViewPager2.i
                public void onPageSelected(int i10) {
                    super.onPageSelected(i10);
                    HabiticaBottomNavigationView bottomNavigation = TasksFragment.this.getBottomNavigation();
                    if (bottomNavigation != null) {
                        bottomNavigation.setSelectedPosition(i10);
                    }
                    TasksFragment.this.updateFilterIcon();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$1(TasksFragment tasksFragment, View view) {
        q.i(tasksFragment, "this$0");
        tasksFragment.getViewModel$Habitica_2311256681_prodRelease().cycleOwnerIDs();
    }

    private final void onTaskCreatedResult(int i10, Intent intent) {
        String str;
        FragmentRefreshRecyclerviewBinding binding;
        RecyclerViewEmptySupport recyclerViewEmptySupport;
        if (i10 == -1) {
            TaskRecyclerViewFragment taskRecyclerViewFragment = null;
            if (intent != null) {
                str = intent.getStringExtra(TaskFormActivity.TASK_TYPE_KEY);
            } else {
                str = null;
            }
            if (str != null) {
                TaskType from = TaskType.Companion.from(str);
                switchToTaskTab(from);
                int indexForTaskType = indexForTaskType(from);
                if (indexForTaskType != -1) {
                    Map<Integer, TaskRecyclerViewFragment> map = this.viewFragmentsDictionary;
                    if (map != null) {
                        taskRecyclerViewFragment = map.get(Integer.valueOf(indexForTaskType));
                    }
                    if (taskRecyclerViewFragment != null && (binding = taskRecyclerViewFragment.getBinding()) != null && (recyclerViewEmptySupport = binding.recyclerView) != null) {
                        recyclerViewEmptySupport.scrollToPosition(0);
                    }
                }
            }
            if (!DateUtils.isToday(getViewModel$Habitica_2311256681_prodRelease().getSharedPreferences().getLong("last_creation_reporting", 0L))) {
                Analytics.sendEvent$default(Analytics.INSTANCE, "task created", EventCategory.BEHAVIOUR, HitType.EVENT, null, null, 24, null);
                SharedPreferences.Editor edit = getViewModel$Habitica_2311256681_prodRelease().getSharedPreferences().edit();
                edit.putLong("last_creation_reporting", new Date().getTime());
                edit.apply();
            }
        }
    }

    private final void openNewTaskActivity(TaskType taskType) {
        long j10;
        Integer num;
        Object obj;
        ViewPager2 viewPager2;
        long time = new Date().getTime();
        Date date = lastTaskFormOpen;
        if (date != null) {
            j10 = date.getTime();
        } else {
            j10 = 0;
        }
        if (time - j10 < 2000) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("created task type", taskType);
        FragmentViewpagerBinding binding = getBinding();
        if (binding != null && (viewPager2 = binding.viewPager) != null) {
            num = Integer.valueOf(viewPager2.getCurrentItem());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            obj = TaskType.HABIT;
        } else if (num != null && num.intValue() == 1) {
            obj = TaskType.DAILY;
        } else if (num != null && num.intValue() == 2) {
            obj = TaskType.TODO;
        } else if (num != null && num.intValue() == 3) {
            obj = TaskType.REWARD;
        } else {
            obj = "";
        }
        hashMap.put("viewed task type", obj);
        Analytics.sendEvent$default(Analytics.INSTANCE, "open create task form", EventCategory.BEHAVIOUR, HitType.EVENT, hashMap, null, 16, null);
        Bundle bundle = new Bundle();
        bundle.putString(TaskFormActivity.TASK_TYPE_KEY, taskType.getValue());
        if (!getViewModel$Habitica_2311256681_prodRelease().isPersonalBoard()) {
            bundle.putString(TaskFormActivity.GROUP_ID_KEY, getViewModel$Habitica_2311256681_prodRelease().getOwnerID().f());
        }
        bundle.putStringArrayList(TaskFormActivity.SELECTED_TAGS_KEY, new ArrayList<>(getViewModel$Habitica_2311256681_prodRelease().getTags()));
        Intent intent = new Intent(getMainActivity(), TaskFormActivity.class);
        intent.putExtras(bundle);
        intent.setFlags(131072);
        if (isAdded()) {
            lastTaskFormOpen = new Date();
            this.taskCreateResult.a(intent);
        }
    }

    private final void showFilterDialog() {
        TaskType activeTaskType;
        ActivityMainBinding binding;
        ActivityMainContentBinding activityMainContentBinding;
        Context context = getContext();
        if (context != null) {
            TaskFilterDialog taskFilterDialog = new TaskFilterDialog(context, getTagRepository(), getViewModel$Habitica_2311256681_prodRelease().isPersonalBoard());
            taskFilterDialog.setViewModel(getViewModel$Habitica_2311256681_prodRelease());
            HabiticaBottomNavigationView bottomNavigation = getBottomNavigation();
            TaskType taskType = null;
            if (bottomNavigation == null) {
                MainActivity mainActivity = getMainActivity();
                if (mainActivity != null && (binding = mainActivity.getBinding()) != null && (activityMainContentBinding = binding.content) != null) {
                    bottomNavigation = activityMainContentBinding.bottomNavigation;
                } else {
                    bottomNavigation = null;
                }
            }
            if (bottomNavigation != null && (activeTaskType = bottomNavigation.getActiveTaskType()) != null) {
                taskType = activeTaskType;
            } else {
                TaskRecyclerViewFragment activeFragment = getActiveFragment();
                if (activeFragment != null) {
                    taskType = activeFragment.getTaskType$Habitica_2311256681_prodRelease();
                }
            }
            taskFilterDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.habitrpg.android.habitica.ui.fragments.tasks.d
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    TasksFragment.showFilterDialog$lambda$3$lambda$2(TasksFragment.this, dialogInterface);
                }
            });
            if (taskType != null) {
                taskFilterDialog.setTaskType(taskType);
            }
            taskFilterDialog.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showFilterDialog$lambda$3$lambda$2(TasksFragment tasksFragment, DialogInterface dialogInterface) {
        q.i(tasksFragment, "this$0");
        tasksFragment.updateFilterIcon();
    }

    private final void switchToTaskTab(TaskType taskType) {
        ViewPager2 viewPager2;
        int indexForTaskType = indexForTaskType(taskType);
        FragmentViewpagerBinding binding = getBinding();
        ViewPager2 viewPager22 = null;
        if (binding != null) {
            viewPager2 = binding.viewPager;
        } else {
            viewPager2 = null;
        }
        if (viewPager2 != null && indexForTaskType != -1) {
            FragmentViewpagerBinding binding2 = getBinding();
            if (binding2 != null) {
                viewPager22 = binding2.viewPager;
            }
            if (viewPager22 != null) {
                viewPager22.setCurrentItem(indexForTaskType);
            }
            updateBottomBarBadges();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void taskCreateResult$lambda$6(TasksFragment tasksFragment, ActivityResult activityResult) {
        q.i(tasksFragment, "this$0");
        tasksFragment.onTaskCreatedResult(activityResult.b(), activityResult.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBoardDisplay() {
        boolean u10;
        u10 = v.u(getViewModel$Habitica_2311256681_prodRelease().getOwnerTitle());
        if ((!u10) != false) {
            MainActivity mainActivity = getMainActivity();
            if (mainActivity != null) {
                mainActivity.setTitle(getViewModel$Habitica_2311256681_prodRelease().getOwnerTitle());
            }
            MainNavigationController.INSTANCE.updateLabel(R.id.tasksFragment, getViewModel$Habitica_2311256681_prodRelease().getOwnerTitle().toString());
        }
        getViewModel$Habitica_2311256681_prodRelease().getUserViewModel().getCurrentTeamPlan().e(getViewModel$Habitica_2311256681_prodRelease().getTeamPlans().get(getViewModel$Habitica_2311256681_prodRelease().getOwnerID().f()));
        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new TasksFragment$updateBoardDisplay$1(this, null), 1, null);
    }

    private final void updateBottomBarBadges() {
        if (getBottomNavigation() == null) {
            return;
        }
        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new TasksFragment$updateBottomBarBadges$1(this, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateFilterIcon() {
        TaskType taskType;
        boolean z10;
        TasksViewModel viewModel$Habitica_2311256681_prodRelease = getViewModel$Habitica_2311256681_prodRelease();
        TaskRecyclerViewFragment activeFragment = getActiveFragment();
        TaskType taskType2 = null;
        if (activeFragment != null) {
            taskType = activeFragment.getTaskType$Habitica_2311256681_prodRelease();
        } else {
            taskType = null;
        }
        int filterCount = viewModel$Habitica_2311256681_prodRelease.filterCount(taskType);
        MenuItem menuItem = this.filterMenuItem;
        if (menuItem != null) {
            TaskRecyclerViewFragment activeFragment2 = getActiveFragment();
            if (activeFragment2 != null) {
                taskType2 = activeFragment2.getTaskType$Habitica_2311256681_prodRelease();
            }
            if (taskType2 != TaskType.REWARD) {
                z10 = true;
            } else {
                z10 = false;
            }
            menuItem.setVisible(z10);
        }
        if (filterCount == 0) {
            MenuItem menuItem2 = this.filterMenuItem;
            if (menuItem2 != null) {
                menuItem2.setIcon(R.drawable.ic_action_filter_list);
            }
            Context context = getContext();
            if (context != null) {
                Drawable e10 = androidx.core.content.a.e(context, R.drawable.ic_action_filter_list);
                if (e10 != null) {
                    DrawableExtendsionsKt.setTintWith(e10, ContextExtensionsKt.getThemeColor(context, R.attr.headerTextColor), PorterDuff.Mode.MULTIPLY);
                }
                MenuItem menuItem3 = this.filterMenuItem;
                if (menuItem3 != null) {
                    menuItem3.setIcon(e10);
                    return;
                }
                return;
            }
            return;
        }
        Context context2 = getContext();
        if (context2 != null) {
            Drawable e11 = androidx.core.content.a.e(context2, R.drawable.ic_filters_active);
            if (e11 != null) {
                DrawableExtendsionsKt.setTintWith(e11, ContextExtensionsKt.getThemeColor(context2, R.attr.textColorPrimaryDark), PorterDuff.Mode.MULTIPLY);
            }
            MenuItem menuItem4 = this.filterMenuItem;
            if (menuItem4 != null) {
                menuItem4.setIcon(e11);
            }
        }
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public boolean addToBackStack() {
        return false;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public String getDisplayedClassName() {
        return null;
    }

    public final TagRepository getTagRepository() {
        TagRepository tagRepository = this.tagRepository;
        if (tagRepository != null) {
            return tagRepository;
        }
        q.z("tagRepository");
        return null;
    }

    public final Map<Integer, TaskRecyclerViewFragment> getViewFragmentsDictionary$Habitica_2311256681_prodRelease() {
        return this.viewFragmentsDictionary;
    }

    public final TasksViewModel getViewModel$Habitica_2311256681_prodRelease() {
        return (TasksViewModel) this.viewModel$delegate.getValue();
    }

    @Override // com.habitrpg.android.habitica.ui.views.navigation.HabiticaBottomNavigationViewListener
    public void onAdd(TaskType taskType) {
        q.i(taskType, "taskType");
        openNewTaskActivity(taskType);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        SearchView searchView;
        q.i(menu, "menu");
        q.i(menuInflater, "inflater");
        super.onCreateOptionsMenu(menu, menuInflater);
        if (getViewModel$Habitica_2311256681_prodRelease().isPersonalBoard()) {
            menuInflater.inflate(R.menu.menu_main_activity, menu);
        } else {
            menuInflater.inflate(R.menu.menu_team_board, menu);
        }
        this.filterMenuItem = menu.findItem(R.id.action_filter);
        updateFilterIcon();
        MenuItem findItem = menu.findItem(R.id.action_search);
        tintMenuIcon(findItem);
        View actionView = findItem.getActionView();
        if (actionView instanceof SearchView) {
            searchView = (SearchView) actionView;
        } else {
            searchView = null;
        }
        if (searchView != null) {
            searchView.setOnQueryTextListener(this);
        }
        if (searchView != null) {
            searchView.setIconifiedByDefault(false);
        }
        findItem.setOnActionExpandListener(new MenuItem.OnActionExpandListener() { // from class: com.habitrpg.android.habitica.ui.fragments.tasks.TasksFragment$onCreateOptionsMenu$1
            @Override // android.view.MenuItem.OnActionExpandListener
            public boolean onMenuItemActionCollapse(MenuItem menuItem) {
                MenuItem menuItem2;
                q.i(menuItem, "item");
                menuItem2 = TasksFragment.this.filterMenuItem;
                if (menuItem2 != null) {
                    menuItem2.setShowAsAction(2);
                    return true;
                }
                return true;
            }

            @Override // android.view.MenuItem.OnActionExpandListener
            public boolean onMenuItemActionExpand(MenuItem menuItem) {
                MenuItem menuItem2;
                q.i(menuItem, "item");
                menuItem2 = TasksFragment.this.filterMenuItem;
                if (menuItem2 != null) {
                    menuItem2.setShowAsAction(0);
                    return true;
                }
                return true;
            }
        });
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        q.i(layoutInflater, "inflater");
        setUsesTabLayout(false);
        setUsesBottomNavigation(true);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        q.i(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId != R.id.action_filter) {
            if (itemId != R.id.action_reload) {
                return super.onOptionsItemSelected(menuItem);
            }
            this.refreshItem = menuItem;
            getViewModel$Habitica_2311256681_prodRelease().refreshData$Habitica_2311256681_prodRelease(TasksFragment$onOptionsItemSelected$1.INSTANCE);
            return true;
        }
        showFilterDialog();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        HabiticaBottomNavigationViewListener habiticaBottomNavigationViewListener;
        HabiticaBottomNavigationView bottomNavigation;
        HabiticaBottomNavigationView bottomNavigation2 = getBottomNavigation();
        if (bottomNavigation2 != null) {
            habiticaBottomNavigationViewListener = bottomNavigation2.getListener();
        } else {
            habiticaBottomNavigationViewListener = null;
        }
        if (q.d(habiticaBottomNavigationViewListener, this) && (bottomNavigation = getBottomNavigation()) != null) {
            bottomNavigation.setListener(null);
        }
        super.onPause();
    }

    @Override // androidx.appcompat.widget.SearchView.m
    public boolean onQueryTextChange(String str) {
        getViewModel$Habitica_2311256681_prodRelease().setSearchQuery(str);
        return true;
    }

    @Override // androidx.appcompat.widget.SearchView.m
    public boolean onQueryTextSubmit(String str) {
        return true;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        ViewPager2 viewPager2;
        ActivityMainBinding binding;
        ActivityMainContentBinding activityMainContentBinding;
        TextView textView;
        int i10;
        ViewPager2 viewPager22;
        Integer num;
        TaskType taskType;
        ViewPager2 viewPager23;
        super.onResume();
        HabiticaBottomNavigationView bottomNavigation = getBottomNavigation();
        if (bottomNavigation != null) {
            FragmentViewpagerBinding binding2 = getBinding();
            if (binding2 != null && (viewPager23 = binding2.viewPager) != null) {
                num = Integer.valueOf(viewPager23.getCurrentItem());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                taskType = TaskType.HABIT;
            } else if (num != null && num.intValue() == 1) {
                taskType = TaskType.DAILY;
            } else if (num != null && num.intValue() == 2) {
                taskType = TaskType.TODO;
            } else if (num != null && num.intValue() == 3) {
                taskType = TaskType.REWARD;
            } else {
                taskType = TaskType.HABIT;
            }
            bottomNavigation.setActiveTaskType(taskType);
        }
        FragmentViewpagerBinding binding3 = getBinding();
        if (binding3 != null) {
            viewPager2 = binding3.viewPager;
        } else {
            viewPager2 = null;
        }
        if (viewPager2 != null) {
            FragmentViewpagerBinding binding4 = getBinding();
            if (binding4 != null && (viewPager22 = binding4.viewPager) != null) {
                i10 = viewPager22.getCurrentItem();
            } else {
                i10 = 0;
            }
            viewPager2.setCurrentItem(i10);
        }
        HabiticaBottomNavigationView bottomNavigation2 = getBottomNavigation();
        if (bottomNavigation2 != null) {
            bottomNavigation2.setListener(this);
        }
        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new TasksFragment$onResume$1(this, null), 1, null);
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null && (binding = mainActivity.getBinding()) != null && (activityMainContentBinding = binding.content) != null && (textView = activityMainContentBinding.toolbarTitle) != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.tasks.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TasksFragment.onResume$lambda$1(TasksFragment.this, view);
                }
            });
        }
    }

    @Override // com.habitrpg.android.habitica.ui.views.navigation.HabiticaBottomNavigationViewListener
    public void onTabSelected(TaskType taskType, boolean z10) {
        ViewPager2 viewPager2;
        q.i(taskType, "taskType");
        int i10 = WhenMappings.$EnumSwitchMapping$0[taskType.ordinal()];
        int i11 = 0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        i11 = 3;
                    }
                } else {
                    i11 = 2;
                }
            } else {
                i11 = 1;
            }
        }
        FragmentViewpagerBinding binding = getBinding();
        if (binding != null && (viewPager2 = binding.viewPager) != null) {
            viewPager2.j(i11, z10);
        }
        updateBottomBarBadges();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009d, code lost:
    
        if ((!r5) == true) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.tasks.TasksFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void setTagRepository(TagRepository tagRepository) {
        q.i(tagRepository, "<set-?>");
        this.tagRepository = tagRepository;
    }

    public final void setViewFragmentsDictionary$Habitica_2311256681_prodRelease(Map<Integer, TaskRecyclerViewFragment> map) {
        this.viewFragmentsDictionary = map;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentViewpagerBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q.i(layoutInflater, "inflater");
        FragmentViewpagerBinding inflate = FragmentViewpagerBinding.inflate(layoutInflater, viewGroup, false);
        q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentViewpagerBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentViewpagerBinding fragmentViewpagerBinding) {
        this.binding = fragmentViewpagerBinding;
    }
}
