package com.habitrpg.android.habitica.ui.fragments.tasks;

import ad.k0;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.adapter.tasks.TaskRecyclerViewAdapter;
import dc.n;
import dc.w;
import dd.h;
import dd.i;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskRecyclerViewFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment$onViewCreated$4", f = "TaskRecyclerViewFragment.kt", l = {368}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class TaskRecyclerViewFragment$onViewCreated$4 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ TaskRecyclerViewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TaskRecyclerViewFragment.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment$onViewCreated$4$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends r implements pc.l<User, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // pc.l
        public final Boolean invoke(User user) {
            if (user != null) {
                return Boolean.valueOf(user.getHasCompletedOnboarding());
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TaskRecyclerViewFragment.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment$onViewCreated$4$2", f = "TaskRecyclerViewFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment$onViewCreated$4$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends l implements p<User, Continuation<? super w>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TaskRecyclerViewFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(TaskRecyclerViewFragment taskRecyclerViewFragment, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = taskRecyclerViewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // pc.p
        public final Object invoke(User user, Continuation<? super w> continuation) {
            return ((AnonymousClass2) create(user, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.label == 0) {
                n.b(obj);
                User user = (User) this.L$0;
                TaskRecyclerViewAdapter recyclerAdapter = this.this$0.getRecyclerAdapter();
                if (recyclerAdapter != null) {
                    boolean z10 = false;
                    if (user != null && user.getHasCompletedOnboarding()) {
                        z10 = true;
                    }
                    recyclerAdapter.setShowAdventureGuide(!z10);
                }
                return w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TaskRecyclerViewFragment.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment$onViewCreated$4$3", f = "TaskRecyclerViewFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment$onViewCreated$4$3  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass3 extends l implements p<User, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // pc.p
        public final Object invoke(User user, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass3) create(user, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.label == 0) {
                n.b(obj);
                User user = (User) this.L$0;
                boolean z10 = false;
                if (user != null && user.getHasCompletedOnboarding()) {
                    z10 = true;
                }
                return kotlin.coroutines.jvm.internal.b.a(!z10);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskRecyclerViewFragment$onViewCreated$4(TaskRecyclerViewFragment taskRecyclerViewFragment, Continuation<? super TaskRecyclerViewFragment$onViewCreated$4> continuation) {
        super(2, continuation);
        this.this$0 = taskRecyclerViewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new TaskRecyclerViewFragment$onViewCreated$4(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((TaskRecyclerViewFragment$onViewCreated$4) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            dd.g Q = i.Q(i.J(i.n(this.this$0.getUserRepository().getUser(), AnonymousClass1.INSTANCE), new AnonymousClass2(this.this$0, null)), new AnonymousClass3(null));
            final TaskRecyclerViewFragment taskRecyclerViewFragment = this.this$0;
            h hVar = new h() { // from class: com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment$onViewCreated$4.4
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((User) obj2, (Continuation<? super w>) continuation);
                }

                public final Object emit(User user, Continuation<? super w> continuation) {
                    TaskRecyclerViewAdapter recyclerAdapter = TaskRecyclerViewFragment.this.getRecyclerAdapter();
                    if (recyclerAdapter != null) {
                        recyclerAdapter.setUser(user);
                    }
                    return w.f13270a;
                }
            };
            this.label = 1;
            if (Q.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
