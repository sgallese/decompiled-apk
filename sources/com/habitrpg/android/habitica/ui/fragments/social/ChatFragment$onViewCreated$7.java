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

/* compiled from: ChatFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.ChatFragment$onViewCreated$7", f = "ChatFragment.kt", l = {129}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ChatFragment$onViewCreated$7 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ ChatFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatFragment.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.ChatFragment$onViewCreated$7$1", f = "ChatFragment.kt", l = {132}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.ChatFragment$onViewCreated$7$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends l implements p<k0, Continuation<? super w>, Object> {
        int label;
        final /* synthetic */ ChatFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ChatFragment chatFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = chatFragment;
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
                this.this$0.refresh();
                o10 = zc.c.o(30, zc.d.SECONDS);
                this.label = 1;
            } while (u0.b(o10, this) != d10);
            return d10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$onViewCreated$7(ChatFragment chatFragment, Continuation<? super ChatFragment$onViewCreated$7> continuation) {
        super(2, continuation);
        this.this$0 = chatFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new ChatFragment$onViewCreated$7(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((ChatFragment$onViewCreated$7) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            ChatFragment chatFragment = this.this$0;
            p.b bVar = p.b.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(chatFragment, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.b(chatFragment, bVar, anonymousClass1, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
