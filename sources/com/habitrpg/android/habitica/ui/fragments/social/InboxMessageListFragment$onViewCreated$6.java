package com.habitrpg.android.habitica.ui.fragments.social;

import ad.k0;
import ad.u0;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.p;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.q;

/* compiled from: InboxMessageListFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.InboxMessageListFragment$onViewCreated$6", f = "InboxMessageListFragment.kt", l = {118}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class InboxMessageListFragment$onViewCreated$6 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ InboxMessageListFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InboxMessageListFragment.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.InboxMessageListFragment$onViewCreated$6$1", f = "InboxMessageListFragment.kt", l = {121}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.InboxMessageListFragment$onViewCreated$6$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends l implements p<k0, Continuation<? super w>, Object> {
        int label;
        final /* synthetic */ InboxMessageListFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InboxMessageListFragment inboxMessageListFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = inboxMessageListFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            long o10;
            d10 = ic.d.d();
            int i10 = this.label;
            if (i10 != 0 && i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
            do {
                this.this$0.refreshConversation();
                o10 = zc.c.o(30, zc.d.SECONDS);
                this.label = 1;
            } while (u0.b(o10, this) != d10);
            return d10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxMessageListFragment$onViewCreated$6(InboxMessageListFragment inboxMessageListFragment, Continuation<? super InboxMessageListFragment$onViewCreated$6> continuation) {
        super(2, continuation);
        this.this$0 = inboxMessageListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new InboxMessageListFragment$onViewCreated$6(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((InboxMessageListFragment$onViewCreated$6) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            androidx.lifecycle.p lifecycle = this.this$0.getLifecycle();
            q.h(lifecycle, "<get-lifecycle>(...)");
            p.b bVar = p.b.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.a(lifecycle, bVar, anonymousClass1, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
