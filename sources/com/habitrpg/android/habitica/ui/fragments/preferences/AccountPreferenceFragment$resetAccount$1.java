package com.habitrpg.android.habitica.ui.fragments.preferences;

import ad.k0;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaProgressDialog;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AccountPreferenceFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.preferences.AccountPreferenceFragment$resetAccount$1", f = "AccountPreferenceFragment.kt", l = {542}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class AccountPreferenceFragment$resetAccount$1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ HabiticaProgressDialog $dialog;
    int label;
    final /* synthetic */ AccountPreferenceFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountPreferenceFragment$resetAccount$1(AccountPreferenceFragment accountPreferenceFragment, HabiticaProgressDialog habiticaProgressDialog, Continuation<? super AccountPreferenceFragment$resetAccount$1> continuation) {
        super(2, continuation);
        this.this$0 = accountPreferenceFragment;
        this.$dialog = habiticaProgressDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new AccountPreferenceFragment$resetAccount$1(this.this$0, this.$dialog, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((AccountPreferenceFragment$resetAccount$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            UserRepository userRepository = this.this$0.getUserRepository();
            this.label = 1;
            if (userRepository.resetAccount(this) == d10) {
                return d10;
            }
        }
        HabiticaProgressDialog habiticaProgressDialog = this.$dialog;
        if (habiticaProgressDialog != null) {
            habiticaProgressDialog.dismiss();
        }
        return w.f13270a;
    }
}
