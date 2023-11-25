package com.habitrpg.android.habitica.ui.fragments.skills;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.databinding.FragmentRecyclerviewBinding;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.ui.adapter.SkillTasksRecyclerViewAdapter;
import com.habitrpg.android.habitica.ui.helpers.RecyclerViewEmptySupport;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.shared.habitica.models.tasks.TaskType;
import dc.w;
import dd.g;
import dd.h;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import pc.l;
import qc.q;

/* compiled from: SkillTasksRecyclerViewFragment.kt */
/* loaded from: classes4.dex */
public final class SkillTasksRecyclerViewFragment extends Hilt_SkillTasksRecyclerViewFragment<FragmentRecyclerviewBinding> {
    public static final int $stable = 8;
    private SkillTasksRecyclerViewAdapter adapter = new SkillTasksRecyclerViewAdapter();
    private FragmentRecyclerviewBinding binding;
    private LinearLayoutManager layoutManager;
    private l<? super Task, w> onTaskSelection;
    public TaskRepository taskRepository;
    private TaskType taskType;
    public MainUserViewModel userViewModel;

    public final SkillTasksRecyclerViewAdapter getAdapter() {
        return this.adapter;
    }

    public final LinearLayoutManager getLayoutManager$Habitica_2311256681_prodRelease() {
        return this.layoutManager;
    }

    public final l<Task, w> getOnTaskSelection() {
        return this.onTaskSelection;
    }

    public final TaskRepository getTaskRepository() {
        TaskRepository taskRepository = this.taskRepository;
        if (taskRepository != null) {
            return taskRepository;
        }
        q.z("taskRepository");
        return null;
    }

    public final TaskType getTaskType() {
        return this.taskType;
    }

    public final MainUserViewModel getUserViewModel() {
        MainUserViewModel mainUserViewModel = this.userViewModel;
        if (mainUserViewModel != null) {
            return mainUserViewModel;
        }
        q.z("userViewModel");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        RecyclerViewEmptySupport recyclerViewEmptySupport;
        g<List<? extends Task>> gVar;
        q.i(view, "view");
        super.onViewCreated(view, bundle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        FragmentRecyclerviewBinding binding = getBinding();
        RecyclerViewEmptySupport recyclerViewEmptySupport2 = null;
        if (binding != null) {
            recyclerViewEmptySupport = binding.recyclerView;
        } else {
            recyclerViewEmptySupport = null;
        }
        if (recyclerViewEmptySupport != null) {
            recyclerViewEmptySupport.setLayoutManager(linearLayoutManager);
        }
        SkillTasksRecyclerViewAdapter skillTasksRecyclerViewAdapter = new SkillTasksRecyclerViewAdapter();
        this.adapter = skillTasksRecyclerViewAdapter;
        skillTasksRecyclerViewAdapter.setOnTaskSelection(new SkillTasksRecyclerViewFragment$onViewCreated$1(this));
        FragmentRecyclerviewBinding binding2 = getBinding();
        if (binding2 != null) {
            recyclerViewEmptySupport2 = binding2.recyclerView;
        }
        if (recyclerViewEmptySupport2 != null) {
            recyclerViewEmptySupport2.setAdapter(this.adapter);
        }
        String[] strArr = (String[]) getUserViewModel().getMirrorGroupTasks().toArray(new String[0]);
        TaskRepository taskRepository = getTaskRepository();
        TaskType taskType = this.taskType;
        if (taskType == null) {
            taskType = TaskType.HABIT;
        }
        final g<List<Task>> tasks = taskRepository.getTasks(taskType, getUserViewModel().getUserID(), strArr);
        final g<List<? extends Task>> gVar2 = new g<List<? extends Task>>() { // from class: com.habitrpg.android.habitica.ui.fragments.skills.SkillTasksRecyclerViewFragment$onViewCreated$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.ui.fragments.skills.SkillTasksRecyclerViewFragment$onViewCreated$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.ui.fragments.skills.SkillTasksRecyclerViewFragment$onViewCreated$$inlined$map$1$2", f = "SkillTasksRecyclerViewFragment.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.ui.fragments.skills.SkillTasksRecyclerViewFragment$onViewCreated$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(h hVar) {
                    this.$this_unsafeFlow = hVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
                    /*
                        r8 = this;
                        boolean r0 = r10 instanceof com.habitrpg.android.habitica.ui.fragments.skills.SkillTasksRecyclerViewFragment$onViewCreated$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r10
                        com.habitrpg.android.habitica.ui.fragments.skills.SkillTasksRecyclerViewFragment$onViewCreated$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.ui.fragments.skills.SkillTasksRecyclerViewFragment$onViewCreated$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.ui.fragments.skills.SkillTasksRecyclerViewFragment$onViewCreated$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.ui.fragments.skills.SkillTasksRecyclerViewFragment$onViewCreated$$inlined$map$1$2$1
                        r0.<init>(r10)
                    L18:
                        java.lang.Object r10 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r10)
                        goto L7f
                    L29:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r10)
                        throw r9
                    L31:
                        dc.n.b(r10)
                        dd.h r10 = r8.$this_unsafeFlow
                        java.util.List r9 = (java.util.List) r9
                        java.lang.Iterable r9 = (java.lang.Iterable) r9
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r2.<init>()
                        java.util.Iterator r9 = r9.iterator()
                    L43:
                        boolean r4 = r9.hasNext()
                        if (r4 == 0) goto L76
                        java.lang.Object r4 = r9.next()
                        r5 = r4
                        com.habitrpg.android.habitica.models.tasks.Task r5 = (com.habitrpg.android.habitica.models.tasks.Task) r5
                        java.lang.String r6 = r5.getChallengeID()
                        r7 = 0
                        if (r6 != 0) goto L70
                        com.habitrpg.android.habitica.models.tasks.TaskGroupPlan r5 = r5.getGroup()
                        if (r5 == 0) goto L6c
                        java.lang.String r5 = r5.getGroupID()
                        if (r5 == 0) goto L6c
                        boolean r5 = yc.m.u(r5)
                        r5 = r5 ^ r3
                        if (r5 != r3) goto L6c
                        r5 = 1
                        goto L6d
                    L6c:
                        r5 = 0
                    L6d:
                        if (r5 != 0) goto L70
                        r7 = 1
                    L70:
                        if (r7 == 0) goto L43
                        r2.add(r4)
                        goto L43
                    L76:
                        r0.label = r3
                        java.lang.Object r9 = r10.emit(r2, r0)
                        if (r9 != r1) goto L7f
                        return r1
                    L7f:
                        dc.w r9 = dc.w.f13270a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.skills.SkillTasksRecyclerViewFragment$onViewCreated$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super List<? extends Task>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
        if (this.taskType == TaskType.TODO) {
            gVar = new g<List<? extends Task>>() { // from class: com.habitrpg.android.habitica.ui.fragments.skills.SkillTasksRecyclerViewFragment$onViewCreated$$inlined$map$2

                /* compiled from: Emitters.kt */
                /* renamed from: com.habitrpg.android.habitica.ui.fragments.skills.SkillTasksRecyclerViewFragment$onViewCreated$$inlined$map$2$2  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements h {
                    final /* synthetic */ h $this_unsafeFlow;

                    /* compiled from: Emitters.kt */
                    @f(c = "com.habitrpg.android.habitica.ui.fragments.skills.SkillTasksRecyclerViewFragment$onViewCreated$$inlined$map$2$2", f = "SkillTasksRecyclerViewFragment.kt", l = {223}, m = "emit")
                    /* renamed from: com.habitrpg.android.habitica.ui.fragments.skills.SkillTasksRecyclerViewFragment$onViewCreated$$inlined$map$2$2$1  reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass1 extends d {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= RecyclerView.UNDEFINED_DURATION;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(h hVar) {
                        this.$this_unsafeFlow = hVar;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                    @Override // dd.h
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                        /*
                            r6 = this;
                            boolean r0 = r8 instanceof com.habitrpg.android.habitica.ui.fragments.skills.SkillTasksRecyclerViewFragment$onViewCreated$$inlined$map$2.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r8
                            com.habitrpg.android.habitica.ui.fragments.skills.SkillTasksRecyclerViewFragment$onViewCreated$$inlined$map$2$2$1 r0 = (com.habitrpg.android.habitica.ui.fragments.skills.SkillTasksRecyclerViewFragment$onViewCreated$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.habitrpg.android.habitica.ui.fragments.skills.SkillTasksRecyclerViewFragment$onViewCreated$$inlined$map$2$2$1 r0 = new com.habitrpg.android.habitica.ui.fragments.skills.SkillTasksRecyclerViewFragment$onViewCreated$$inlined$map$2$2$1
                            r0.<init>(r8)
                        L18:
                            java.lang.Object r8 = r0.result
                            java.lang.Object r1 = ic.b.d()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            dc.n.b(r8)
                            goto L64
                        L29:
                            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                            r7.<init>(r8)
                            throw r7
                        L31:
                            dc.n.b(r8)
                            dd.h r8 = r6.$this_unsafeFlow
                            java.util.List r7 = (java.util.List) r7
                            java.lang.Iterable r7 = (java.lang.Iterable) r7
                            java.util.ArrayList r2 = new java.util.ArrayList
                            r2.<init>()
                            java.util.Iterator r7 = r7.iterator()
                        L43:
                            boolean r4 = r7.hasNext()
                            if (r4 == 0) goto L5b
                            java.lang.Object r4 = r7.next()
                            r5 = r4
                            com.habitrpg.android.habitica.models.tasks.Task r5 = (com.habitrpg.android.habitica.models.tasks.Task) r5
                            boolean r5 = r5.getCompleted()
                            r5 = r5 ^ r3
                            if (r5 == 0) goto L43
                            r2.add(r4)
                            goto L43
                        L5b:
                            r0.label = r3
                            java.lang.Object r7 = r8.emit(r2, r0)
                            if (r7 != r1) goto L64
                            return r1
                        L64:
                            dc.w r7 = dc.w.f13270a
                            return r7
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.skills.SkillTasksRecyclerViewFragment$onViewCreated$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // dd.g
                public Object collect(h<? super List<? extends Task>> hVar, Continuation continuation) {
                    Object d10;
                    Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                    d10 = ic.d.d();
                    if (collect == d10) {
                        return collect;
                    }
                    return w.f13270a;
                }
            };
        } else {
            gVar = gVar2;
        }
        m.c(gVar, null, 0L, 3, null).j(getViewLifecycleOwner(), new SkillTasksRecyclerViewFragment$sam$androidx_lifecycle_Observer$0(new SkillTasksRecyclerViewFragment$onViewCreated$3(this)));
    }

    public final void setAdapter(SkillTasksRecyclerViewAdapter skillTasksRecyclerViewAdapter) {
        q.i(skillTasksRecyclerViewAdapter, "<set-?>");
        this.adapter = skillTasksRecyclerViewAdapter;
    }

    public final void setLayoutManager$Habitica_2311256681_prodRelease(LinearLayoutManager linearLayoutManager) {
        this.layoutManager = linearLayoutManager;
    }

    public final void setOnTaskSelection(l<? super Task, w> lVar) {
        this.onTaskSelection = lVar;
    }

    public final void setTaskRepository(TaskRepository taskRepository) {
        q.i(taskRepository, "<set-?>");
        this.taskRepository = taskRepository;
    }

    public final void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public final void setUserViewModel(MainUserViewModel mainUserViewModel) {
        q.i(mainUserViewModel, "<set-?>");
        this.userViewModel = mainUserViewModel;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentRecyclerviewBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q.i(layoutInflater, "inflater");
        FragmentRecyclerviewBinding inflate = FragmentRecyclerviewBinding.inflate(layoutInflater, viewGroup, false);
        q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentRecyclerviewBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentRecyclerviewBinding fragmentRecyclerviewBinding) {
        this.binding = fragmentRecyclerviewBinding;
    }
}
