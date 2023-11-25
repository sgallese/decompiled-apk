package com.habitrpg.android.habitica.ui.fragments.preferences;

import ad.k0;
import android.content.Context;
import com.habitrpg.android.habitica.HabiticaBaseApplication;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaProgressDialog;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import pc.p;
import qc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AccountPreferenceFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.preferences.AccountPreferenceFragment$deleteAccount$2", f = "AccountPreferenceFragment.kt", l = {503}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class AccountPreferenceFragment$deleteAccount$2 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ HabiticaProgressDialog $dialog;
    final /* synthetic */ String $password;
    int label;
    final /* synthetic */ AccountPreferenceFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountPreferenceFragment$deleteAccount$2(AccountPreferenceFragment accountPreferenceFragment, String str, HabiticaProgressDialog habiticaProgressDialog, Continuation<? super AccountPreferenceFragment$deleteAccount$2> continuation) {
        super(2, continuation);
        this.this$0 = accountPreferenceFragment;
        this.$password = str;
        this.$dialog = habiticaProgressDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new AccountPreferenceFragment$deleteAccount$2(this.this$0, this.$password, this.$dialog, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((AccountPreferenceFragment$deleteAccount$2) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        HabiticaAccountDialog habiticaAccountDialog;
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
            String str = this.$password;
            this.label = 1;
            if (userRepository.deleteAccount(str, this) == d10) {
                return d10;
            }
        }
        HabiticaProgressDialog habiticaProgressDialog = this.$dialog;
        if (habiticaProgressDialog != null) {
            habiticaProgressDialog.dismiss();
        }
        habiticaAccountDialog = this.this$0.accountDialog;
        if (habiticaAccountDialog == null) {
            q.z("accountDialog");
            habiticaAccountDialog = null;
        }
        habiticaAccountDialog.dismiss();
        Context context = this.this$0.getContext();
        if (context != null) {
            HabiticaBaseApplication.Companion.logout(context);
        }
        androidx.fragment.app.q activity = this.this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return w.f13270a;
    }
}
