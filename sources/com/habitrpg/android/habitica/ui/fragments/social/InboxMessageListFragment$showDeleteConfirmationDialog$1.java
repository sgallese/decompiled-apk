package com.habitrpg.android.habitica.ui.fragments.social;

import ad.k0;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.models.social.ChatMessage;
import com.habitrpg.android.habitica.ui.viewmodels.InboxViewModel;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InboxMessageListFragment.kt */
/* loaded from: classes4.dex */
public final class InboxMessageListFragment$showDeleteConfirmationDialog$1 extends r implements p<HabiticaAlertDialog, Integer, w> {
    final /* synthetic */ ChatMessage $chatMessage;
    final /* synthetic */ InboxMessageListFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InboxMessageListFragment.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.InboxMessageListFragment$showDeleteConfirmationDialog$1$1", f = "InboxMessageListFragment.kt", l = {227}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.InboxMessageListFragment$showDeleteConfirmationDialog$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ ChatMessage $chatMessage;
        int label;
        final /* synthetic */ InboxMessageListFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InboxMessageListFragment inboxMessageListFragment, ChatMessage chatMessage, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = inboxMessageListFragment;
            this.$chatMessage = chatMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$chatMessage, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            InboxViewModel viewModel;
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
                SocialRepository socialRepository = this.this$0.getSocialRepository();
                ChatMessage chatMessage = this.$chatMessage;
                this.label = 1;
                if (socialRepository.deleteMessage(chatMessage, this) == d10) {
                    return d10;
                }
            }
            viewModel = this.this$0.getViewModel();
            viewModel.invalidateDataSource();
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxMessageListFragment$showDeleteConfirmationDialog$1(InboxMessageListFragment inboxMessageListFragment, ChatMessage chatMessage) {
        super(2);
        this.this$0 = inboxMessageListFragment;
        this.$chatMessage = chatMessage;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        q.i(habiticaAlertDialog, "<anonymous parameter 0>");
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this.this$0), null, new AnonymousClass1(this.this$0, this.$chatMessage, null), 1, null);
    }
}
