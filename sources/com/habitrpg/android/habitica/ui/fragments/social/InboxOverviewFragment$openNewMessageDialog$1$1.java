package com.habitrpg.android.habitica.ui.fragments.social;

import ad.k0;
import android.text.Editable;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.databinding.DialogChooseMessageRecipientBinding;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InboxOverviewFragment.kt */
/* loaded from: classes4.dex */
public final class InboxOverviewFragment$openNewMessageDialog$1$1 extends r implements p<HabiticaAlertDialog, Integer, w> {
    final /* synthetic */ HabiticaAlertDialog $alert;
    final /* synthetic */ DialogChooseMessageRecipientBinding $binding;
    final /* synthetic */ InboxOverviewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InboxOverviewFragment.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.InboxOverviewFragment$openNewMessageDialog$1$1$1", f = "InboxOverviewFragment.kt", l = {128}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.InboxOverviewFragment$openNewMessageDialog$1$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ HabiticaAlertDialog $alert;
        final /* synthetic */ DialogChooseMessageRecipientBinding $binding;
        final /* synthetic */ String $username;
        int label;
        final /* synthetic */ InboxOverviewFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InboxOverviewFragment inboxOverviewFragment, String str, HabiticaAlertDialog habiticaAlertDialog, DialogChooseMessageRecipientBinding dialogChooseMessageRecipientBinding, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = inboxOverviewFragment;
            this.$username = str;
            this.$alert = habiticaAlertDialog;
            this.$binding = dialogChooseMessageRecipientBinding;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$username, this.$alert, this.$binding, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.label;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    n.b(obj);
                    SocialRepository socialRepository = this.this$0.getSocialRepository();
                    String str = this.$username;
                    this.label = 1;
                    obj = socialRepository.retrieveMember(str, false, this);
                    if (obj == d10) {
                        return d10;
                    }
                }
                if (((Member) obj) != null) {
                    this.$alert.dismiss();
                    this.this$0.openInboxMessages("", this.$username);
                    this.$binding.progressCircular.setVisibility(8);
                }
                return w.f13270a;
            } finally {
                this.$binding.errorTextView.setVisibility(0);
                this.$binding.progressCircular.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxOverviewFragment$openNewMessageDialog$1$1(DialogChooseMessageRecipientBinding dialogChooseMessageRecipientBinding, InboxOverviewFragment inboxOverviewFragment, HabiticaAlertDialog habiticaAlertDialog) {
        super(2);
        this.$binding = dialogChooseMessageRecipientBinding;
        this.this$0 = inboxOverviewFragment;
        this.$alert = habiticaAlertDialog;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        String str;
        q.i(habiticaAlertDialog, "<anonymous parameter 0>");
        this.$binding.errorTextView.setVisibility(8);
        this.$binding.progressCircular.setVisibility(0);
        Editable text = this.$binding.uuidEditText.getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        ad.i.d(androidx.lifecycle.w.a(this.this$0), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new AnonymousClass1(this.this$0, str, this.$alert, this.$binding, null), 2, null);
    }
}
