package com.habitrpg.android.habitica.ui.viewmodels;

import ad.k0;
import android.content.SharedPreferences;
import android.content.res.Resources;
import androidx.lifecycle.f0;
import androidx.lifecycle.w0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.TagRepository;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.GroupPlanInfoProvider;
import com.habitrpg.android.habitica.models.TeamPlan;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.models.tasks.TaskGroupPlan;
import com.habitrpg.android.habitica.models.user.Preferences;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.shared.habitica.models.responses.TaskDirection;
import com.habitrpg.shared.habitica.models.responses.TaskScoringResult;
import com.habitrpg.shared.habitica.models.tasks.TaskType;
import dc.f;
import dc.l;
import dc.n;
import dc.q;
import dc.w;
import dd.g;
import dd.h;
import ec.r;
import ic.b;
import io.realm.OrderedRealmCollection;
import io.realm.RealmQuery;
import io.realm.j1;
import io.realm.x0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import pc.p;
import vc.j;

/* compiled from: TasksViewModel.kt */
/* loaded from: classes4.dex */
public final class TasksViewModel extends BaseViewModel implements GroupPlanInfoProvider {
    public static final int $stable = 8;
    private final HashMap<TaskType, String> activeFilters;
    private final AppConfigManager appConfigManager;
    private f0<Boolean> canSwitchOwners;
    private final HashMap<TaskType, f0<q<String, String, List<String>>>> filterSets;
    private boolean initialPreferenceFilterSet;
    private final f ownerID$delegate;
    private List<? extends l<String, ? extends CharSequence>> owners;
    private String searchQuery;
    private final SharedPreferences sharedPreferences;
    private final TagRepository tagRepository;
    private List<String> tags;
    private final TaskRepository taskRepository;
    private Map<String, ? extends TeamPlan> teamPlans;

    /* compiled from: TasksViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel$1", f = "TasksViewModel.kt", l = {64}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ UserRepository $userRepository;
        final /* synthetic */ MainUserViewModel $userViewModel;
        int label;
        final /* synthetic */ TasksViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(UserRepository userRepository, TasksViewModel tasksViewModel, MainUserViewModel mainUserViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$userRepository = userRepository;
            this.this$0 = tasksViewModel;
            this.$userViewModel = mainUserViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$userRepository, this.this$0, this.$userViewModel, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10 = b.d();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                g<List<TeamPlan>> teamPlans = this.$userRepository.getTeamPlans();
                final TasksViewModel tasksViewModel = this.this$0;
                final MainUserViewModel mainUserViewModel = this.$userViewModel;
                h<? super List<TeamPlan>> hVar = new h() { // from class: com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel.1.1
                    @Override // dd.h
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List) obj2, (Continuation<? super w>) continuation);
                    }

                    public final Object emit(List<? extends TeamPlan> list, Continuation<? super w> continuation) {
                        TasksViewModel tasksViewModel2 = TasksViewModel.this;
                        List<? extends TeamPlan> list2 = list;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(j.d(ec.k0.d(r.s(list2, 10)), 16));
                        for (T t10 : list2) {
                            linkedHashMap.put(((TeamPlan) t10).getId(), t10);
                        }
                        tasksViewModel2.setTeamPlans(linkedHashMap);
                        TasksViewModel tasksViewModel3 = TasksViewModel.this;
                        List d11 = r.d(new l(mainUserViewModel.getUserID(), mainUserViewModel.getDisplayName()));
                        ArrayList arrayList = new ArrayList(r.s(list2, 10));
                        for (TeamPlan teamPlan : list2) {
                            arrayList.add(new l(teamPlan.getId(), teamPlan.getSummary()));
                        }
                        tasksViewModel3.owners = r.r0(d11, arrayList);
                        if (TasksViewModel.this.owners.size() > 1 && !qc.q.d(TasksViewModel.this.getCanSwitchOwners().f(), kotlin.coroutines.jvm.internal.b.a(false))) {
                            TasksViewModel.this.getCanSwitchOwners().p(kotlin.coroutines.jvm.internal.b.a(TasksViewModel.this.owners.size() > 1));
                        }
                        return w.f13270a;
                    }
                };
                this.label = 1;
                if (teamPlans.collect(hVar, this) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TasksViewModel(UserRepository userRepository, MainUserViewModel mainUserViewModel, TaskRepository taskRepository, TagRepository tagRepository, AppConfigManager appConfigManager, SharedPreferences sharedPreferences) {
        super(userRepository, mainUserViewModel);
        qc.q.i(userRepository, "userRepository");
        qc.q.i(mainUserViewModel, "userViewModel");
        qc.q.i(taskRepository, "taskRepository");
        qc.q.i(tagRepository, "tagRepository");
        qc.q.i(appConfigManager, "appConfigManager");
        qc.q.i(sharedPreferences, "sharedPreferences");
        this.taskRepository = taskRepository;
        this.tagRepository = tagRepository;
        this.appConfigManager = appConfigManager;
        this.sharedPreferences = sharedPreferences;
        this.owners = r.i();
        this.canSwitchOwners = new f0<>();
        this.ownerID$delegate = dc.g.b(TasksViewModel$ownerID$2.INSTANCE);
        this.teamPlans = ec.k0.h();
        ad.g.d(w0.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new AnonymousClass1(userRepository, this, mainUserViewModel, null), 2, null);
        this.filterSets = ec.k0.j(new l(TaskType.HABIT, new f0()), new l(TaskType.DAILY, new f0()), new l(TaskType.TODO, new f0()));
        this.activeFilters = new HashMap<>();
        this.tags = new ArrayList();
    }

    private final boolean isFiltered(Task task, String str) {
        if (!task.containsAllTagIds(this.tags)) {
            return false;
        }
        if (str != null && !qc.q.d(str, Task.FILTER_ALL)) {
            switch (str.hashCode()) {
                case -1422950650:
                    if (str.equals("active")) {
                        if (task.getType() == TaskType.DAILY) {
                            return task.isDisplayedActive();
                        }
                        if (task.getCompleted()) {
                            return false;
                        }
                    }
                    break;
                case -1402931637:
                    if (str.equals(Task.FILTER_COMPLETED)) {
                        return task.getCompleted();
                    }
                    break;
                case -891980137:
                    if (str.equals(Task.FILTER_STRONG) && task.getValue() < 1.0d) {
                        return false;
                    }
                    break;
                case 3181155:
                    if (str.equals(Task.FILTER_GRAY) && !task.getCompleted() && task.isDisplayedActive()) {
                        return false;
                    }
                    break;
                case 3645304:
                    if (str.equals(Task.FILTER_WEAK) && task.getValue() >= 1.0d) {
                        return false;
                    }
                    break;
                case 95356534:
                    if (str.equals(Task.FILTER_DATED) && task.getDueDate() == null) {
                        return false;
                    }
                    break;
            }
        }
        return true;
    }

    private final boolean isTaskFilterActive(TaskType taskType) {
        if (this.activeFilters.get(taskType) == null) {
            return false;
        }
        if (TaskType.TODO == taskType) {
            if (qc.q.d("active", this.activeFilters.get(taskType))) {
                return false;
            }
        } else if (qc.q.d(Task.FILTER_ALL, this.activeFilters.get(taskType))) {
            return false;
        }
        return true;
    }

    public final void addActiveTag(String str) {
        String str2;
        qc.q.i(str, "tagID");
        if (!this.tags.contains(str)) {
            this.tags.add(str);
        }
        for (Map.Entry<TaskType, f0<q<String, String, List<String>>>> entry : this.filterSets.entrySet()) {
            q<String, String, List<String>> f10 = entry.getValue().f();
            f0<q<String, String, List<String>>> value = entry.getValue();
            String str3 = null;
            if (f10 != null) {
                str2 = f10.d();
            } else {
                str2 = null;
            }
            if (f10 != null) {
                str3 = f10.e();
            }
            value.p(new q<>(str2, str3, this.tags));
        }
    }

    @Override // com.habitrpg.android.habitica.helpers.GroupPlanInfoProvider
    public String assignedTextForTask(Resources resources, List<String> list) {
        Object obj;
        String displayName;
        String quantityString;
        qc.q.i(resources, "resources");
        qc.q.i(list, "assignedUsers");
        if (list.contains(getUserViewModel().getUserID())) {
            if (list.size() == 1) {
                quantityString = resources.getString(R.string.you);
            } else {
                quantityString = resources.getQuantityString(R.plurals.you_x_others, list.size() - 1, Integer.valueOf(list.size() - 1));
            }
            qc.q.f(quantityString);
            return quantityString;
        } else if (list.size() == 1) {
            List<Member> f10 = getUserViewModel().getCurrentTeamPlanMembers().f();
            if (f10 != null) {
                Iterator<T> it = f10.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (qc.q.d(((Member) obj).getId(), r.a0(list))) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                Member member = (Member) obj;
                if (member != null && (displayName = member.getDisplayName()) != null) {
                    return displayName;
                }
            }
            return "";
        } else {
            String quantityString2 = resources.getQuantityString(R.plurals.people, list.size(), Integer.valueOf(list.size()));
            qc.q.f(quantityString2);
            return quantityString2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // com.habitrpg.android.habitica.helpers.GroupPlanInfoProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object canAddTasks(kotlin.coroutines.Continuation<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel$canAddTasks$1
            if (r0 == 0) goto L13
            r0 = r5
            com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel$canAddTasks$1 r0 = (com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel$canAddTasks$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel$canAddTasks$1 r0 = new com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel$canAddTasks$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel r0 = (com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel) r0
            dc.n.b(r5)
            goto L68
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            dc.n.b(r5)
            boolean r5 = r4.isPersonalBoard()
            if (r5 == 0) goto L43
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r5
        L43:
            androidx.lifecycle.f0 r5 = r4.getOwnerID()
            java.lang.Object r5 = r5.f()
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L54
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r5
        L54:
            com.habitrpg.android.habitica.data.UserRepository r2 = r4.getUserRepository()
            dd.g r5 = r2.getTeamPlan(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = dd.i.x(r5, r0)
            if (r5 != r1) goto L67
            return r1
        L67:
            r0 = r4
        L68:
            com.habitrpg.android.habitica.models.social.Group r5 = (com.habitrpg.android.habitica.models.social.Group) r5
            r1 = 0
            if (r5 == 0) goto L7c
            com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel r0 = r0.getUserViewModel()
            java.lang.String r0 = r0.getUserID()
            boolean r5 = r5.hasTaskEditPrivileges(r0)
            if (r5 == 0) goto L7c
            goto L7d
        L7c:
            r3 = 0
        L7d:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel.canAddTasks(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // com.habitrpg.android.habitica.helpers.GroupPlanInfoProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object canEditTask(com.habitrpg.android.habitica.models.tasks.Task r5, kotlin.coroutines.Continuation<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel$canEditTask$1
            if (r0 == 0) goto L13
            r0 = r6
            com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel$canEditTask$1 r0 = (com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel$canEditTask$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel$canEditTask$1 r0 = new com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel$canEditTask$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel r5 = (com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel) r5
            dc.n.b(r6)
            goto L64
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            dc.n.b(r6)
            boolean r6 = r5.isGroupTask()
            if (r6 != 0) goto L43
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r5
        L43:
            com.habitrpg.android.habitica.models.tasks.TaskGroupPlan r5 = r5.getGroup()
            if (r5 == 0) goto L7e
            java.lang.String r5 = r5.getGroupID()
            if (r5 != 0) goto L50
            goto L7e
        L50:
            com.habitrpg.android.habitica.data.UserRepository r6 = r4.getUserRepository()
            dd.g r5 = r6.getTeamPlan(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = dd.i.x(r5, r0)
            if (r6 != r1) goto L63
            return r1
        L63:
            r5 = r4
        L64:
            com.habitrpg.android.habitica.models.social.Group r6 = (com.habitrpg.android.habitica.models.social.Group) r6
            r0 = 0
            if (r6 == 0) goto L78
            com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel r5 = r5.getUserViewModel()
            java.lang.String r5 = r5.getUserID()
            boolean r5 = r6.hasTaskEditPrivileges(r5)
            if (r5 == 0) goto L78
            goto L79
        L78:
            r3 = 0
        L79:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r5
        L7e:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel.canEditTask(com.habitrpg.android.habitica.models.tasks.Task, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.helpers.GroupPlanInfoProvider
    public boolean canScoreTask(Task task) {
        boolean z10;
        x0<String> assignedUsers;
        qc.q.i(task, "task");
        if (!task.isGroupTask() || task.isAssignedToUser(getUserViewModel().getUserID())) {
            return true;
        }
        TaskGroupPlan group = task.getGroup();
        if (group != null && (assignedUsers = group.getAssignedUsers()) != null && !assignedUsers.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return true;
        }
        return false;
    }

    public final RealmQuery<Task> createQuery(OrderedRealmCollection<Task> orderedRealmCollection) {
        RealmQuery<Task> l10;
        boolean z10;
        qc.q.i(orderedRealmCollection, "unfilteredData");
        if (!orderedRealmCollection.isValid()) {
            return null;
        }
        RealmQuery<Task> B = orderedRealmCollection.B();
        if (orderedRealmCollection.size() != 0) {
            boolean z11 = false;
            TaskType type = orderedRealmCollection.get(0).getType();
            String activeFilter = getActiveFilter(type);
            if (this.tags.size() > 0) {
                B = B.v("tags.id", (String[]) this.tags.toArray(new String[0]));
            }
            String str = this.searchQuery;
            if (str != null) {
                if (str.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    z11 = true;
                }
            }
            if (z11) {
                RealmQuery<Task> b10 = B.b();
                String str2 = this.searchQuery;
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                io.realm.f fVar = io.realm.f.INSENSITIVE;
                RealmQuery<Task> H = b10.e("text", str2, fVar).H();
                String str4 = this.searchQuery;
                if (str4 != null) {
                    str3 = str4;
                }
                B = H.e("notes", str3, fVar).j();
            }
            if (activeFilter != null && !qc.q.d(activeFilter, Task.FILTER_ALL)) {
                switch (activeFilter.hashCode()) {
                    case -1422950650:
                        if (activeFilter.equals("active")) {
                            if (TaskType.DAILY == type) {
                                l10 = B.l(Task.FILTER_COMPLETED, Boolean.FALSE).l("isDue", Boolean.TRUE);
                            } else {
                                l10 = B.l(Task.FILTER_COMPLETED, Boolean.FALSE);
                            }
                            B = l10;
                            break;
                        }
                        break;
                    case -1402931637:
                        if (activeFilter.equals(Task.FILTER_COMPLETED)) {
                            l10 = B.l(Task.FILTER_COMPLETED, Boolean.TRUE);
                            B = l10;
                            break;
                        }
                        break;
                    case -891980137:
                        if (activeFilter.equals(Task.FILTER_STRONG)) {
                            l10 = B.t(AppMeasurementSdk.ConditionalUserProperty.VALUE, 1.0d);
                            B = l10;
                            break;
                        }
                        break;
                    case 3181155:
                        if (activeFilter.equals(Task.FILTER_GRAY)) {
                            l10 = B.l(Task.FILTER_COMPLETED, Boolean.TRUE).H().l("isDue", Boolean.FALSE);
                            B = l10;
                            break;
                        }
                        break;
                    case 3645304:
                        if (activeFilter.equals(Task.FILTER_WEAK)) {
                            l10 = B.B(AppMeasurementSdk.ConditionalUserProperty.VALUE, 1.0d);
                            B = l10;
                            break;
                        }
                        break;
                    case 95356534:
                        if (activeFilter.equals(Task.FILTER_DATED)) {
                            l10 = B.z("dueDate").l(Task.FILTER_COMPLETED, Boolean.FALSE).I("dueDate");
                            B = l10;
                            break;
                        }
                        break;
                }
            }
            if (!qc.q.d(activeFilter, Task.FILTER_DATED)) {
                return B.K("position", j1.ASCENDING, "dateCreated", j1.DESCENDING);
            }
            return B;
        }
        return B;
    }

    public final void cycleOwnerIDs() {
        if (this.owners.size() <= 1) {
            return;
        }
        Iterator<? extends l<String, ? extends CharSequence>> it = this.owners.iterator();
        int i10 = 0;
        while (true) {
            if (it.hasNext()) {
                if (qc.q.d(it.next().c(), getOwnerID().f())) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        int i11 = i10 + 1;
        if (i11 < this.owners.size()) {
            getOwnerID().p(this.owners.get(i11).c());
        } else {
            getOwnerID().p(this.owners.get(0).c());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<Task> filter(List<? extends Task> list) {
        String str;
        qc.q.i(list, NavigationDrawerFragment.SIDEBAR_TASKS);
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        if (this.activeFilters.size() > 0) {
            str = this.activeFilters.get(((Task) list.get(0)).getType());
        } else {
            str = null;
        }
        for (Task task : list) {
            if (isFiltered(task, str)) {
                arrayList.add(task);
            }
        }
        return arrayList;
    }

    public final int filterCount(TaskType taskType) {
        return this.tags.size() + (isTaskFilterActive(taskType) ? 1 : 0);
    }

    public final String getActiveFilter(TaskType taskType) {
        if (this.activeFilters.containsKey(taskType)) {
            return this.activeFilters.get(taskType);
        }
        return null;
    }

    public final AppConfigManager getAppConfigManager() {
        return this.appConfigManager;
    }

    public final f0<Boolean> getCanSwitchOwners() {
        return this.canSwitchOwners;
    }

    public final f0<q<String, String, List<String>>> getFilterSet(TaskType taskType) {
        qc.q.i(taskType, TaskFormActivity.TASK_TYPE_KEY);
        return this.filterSets.get(taskType);
    }

    public final boolean getInitialPreferenceFilterSet() {
        return this.initialPreferenceFilterSet;
    }

    public final f0<String> getOwnerID() {
        return (f0) this.ownerID$delegate.getValue();
    }

    public final CharSequence getOwnerTitle() {
        Object obj;
        CharSequence charSequence;
        Iterator<T> it = this.owners.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (qc.q.d(((l) obj).c(), getOwnerID().f())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        l lVar = (l) obj;
        if (lVar == null || (charSequence = (CharSequence) lVar.d()) == null) {
            return "";
        }
        return charSequence;
    }

    public final String getSearchQuery() {
        return this.searchQuery;
    }

    public final SharedPreferences getSharedPreferences() {
        return this.sharedPreferences;
    }

    public final TagRepository getTagRepository() {
        return this.tagRepository;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final TaskRepository getTaskRepository() {
        return this.taskRepository;
    }

    public final Map<String, TeamPlan> getTeamPlans() {
        return this.teamPlans;
    }

    public final boolean isFiltering(TaskType taskType) {
        if (filterCount(taskType) > 0) {
            return true;
        }
        return false;
    }

    public final boolean isPersonalBoard() {
        return qc.q.d(getOwnerID().f(), getUserViewModel().getUserID());
    }

    public final void refreshData$Habitica_2311256681_prodRelease(pc.a<w> aVar) {
        qc.q.i(aVar, "onComplete");
        ad.g.d(w0.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new TasksViewModel$refreshData$1(this, aVar, null), 2, null);
    }

    public final void removeActiveTag(String str) {
        String str2;
        qc.q.i(str, "tagID");
        if (this.tags.contains(str)) {
            this.tags.remove(str);
        }
        for (Map.Entry<TaskType, f0<q<String, String, List<String>>>> entry : this.filterSets.entrySet()) {
            q<String, String, List<String>> f10 = entry.getValue().f();
            f0<q<String, String, List<String>>> value = entry.getValue();
            String str3 = null;
            if (f10 != null) {
                str2 = f10.d();
            } else {
                str2 = null;
            }
            if (f10 != null) {
                str3 = f10.e();
            }
            value.p(new q<>(str2, str3, this.tags));
        }
    }

    public final void scoreTask(Task task, TaskDirection taskDirection, p<? super TaskScoringResult, ? super Integer, w> pVar) {
        qc.q.i(task, "task");
        qc.q.i(taskDirection, "direction");
        qc.q.i(pVar, "onResult");
        ad.g.d(w0.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new TasksViewModel$scoreTask$1(this, task, taskDirection, pVar, null), 2, null);
    }

    public final void setActiveFilter(TaskType taskType, String str) {
        Preferences preferences;
        qc.q.i(taskType, TaskFormActivity.TASK_TYPE_KEY);
        qc.q.i(str, "activeFilter");
        this.activeFilters.put(taskType, str);
        f0<q<String, String, List<String>>> f0Var = this.filterSets.get(taskType);
        if (f0Var != null) {
            f0Var.p(new q<>(this.searchQuery, str, this.tags));
        }
        if (qc.q.d(this.activeFilters.get(TaskType.TODO), Task.FILTER_COMPLETED)) {
            ExceptionHandlerKt.launchCatching$default(w0.a(this), null, new TasksViewModel$setActiveFilter$1(this, null), 1, null);
        }
        if (taskType == TaskType.DAILY) {
            boolean d10 = qc.q.d(str, "active");
            User f10 = getUser().f();
            boolean z10 = false;
            if (f10 != null && (preferences = f10.getPreferences()) != null && d10 == preferences.getDailyDueDefaultView()) {
                z10 = true;
            }
            if (!z10) {
                ExceptionHandlerKt.launchCatching$default(w0.a(this), null, new TasksViewModel$setActiveFilter$2(this, d10, null), 1, null);
            }
        }
    }

    public final void setCanSwitchOwners(f0<Boolean> f0Var) {
        qc.q.i(f0Var, "<set-?>");
        this.canSwitchOwners = f0Var;
    }

    public final void setInitialPreferenceFilterSet(boolean z10) {
        this.initialPreferenceFilterSet = z10;
    }

    public final void setSearchQuery(String str) {
        String str2;
        List<String> i10;
        this.searchQuery = str;
        for (Map.Entry<TaskType, f0<q<String, String, List<String>>>> entry : this.filterSets.entrySet()) {
            q<String, String, List<String>> f10 = entry.getValue().f();
            f0<q<String, String, List<String>>> value = entry.getValue();
            if (f10 != null) {
                str2 = f10.e();
            } else {
                str2 = null;
            }
            if (f10 == null || (i10 = f10.f()) == null) {
                i10 = r.i();
            }
            value.p(new q<>(str, str2, i10));
        }
    }

    public final void setTags(List<String> list) {
        String str;
        qc.q.i(list, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.tags = list;
        for (Map.Entry<TaskType, f0<q<String, String, List<String>>>> entry : this.filterSets.entrySet()) {
            q<String, String, List<String>> f10 = entry.getValue().f();
            f0<q<String, String, List<String>>> value = entry.getValue();
            String str2 = null;
            if (f10 != null) {
                str = f10.d();
            } else {
                str = null;
            }
            if (f10 != null) {
                str2 = f10.e();
            }
            value.p(new q<>(str, str2, this.tags));
        }
    }

    public final void setTeamPlans(Map<String, ? extends TeamPlan> map) {
        qc.q.i(map, "<set-?>");
        this.teamPlans = map;
    }
}
