package com.habitrpg.android.habitica.ui.fragments.preferences;

import ad.k0;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.models.auth.LocalAuthentication;
import com.habitrpg.android.habitica.models.user.Authentication;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import pc.p;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AccountPreferenceFragment.kt */
/* loaded from: classes4.dex */
public final class AccountPreferenceFragment$showConfirmUsernameDialog$1 extends r implements p<HabiticaAlertDialog, Integer, w> {
    final /* synthetic */ AccountPreferenceFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccountPreferenceFragment.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.preferences.AccountPreferenceFragment$showConfirmUsernameDialog$1$1", f = "AccountPreferenceFragment.kt", l = {530}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.preferences.AccountPreferenceFragment$showConfirmUsernameDialog$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
        int label;
        final /* synthetic */ AccountPreferenceFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AccountPreferenceFragment accountPreferenceFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = accountPreferenceFragment;
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
            String str;
            Authentication authentication;
            LocalAuthentication localAuthentication;
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
                User user$Habitica_2311256681_prodRelease = this.this$0.getUser$Habitica_2311256681_prodRelease();
                if (user$Habitica_2311256681_prodRelease == null || (authentication = user$Habitica_2311256681_prodRelease.getAuthentication()) == null || (localAuthentication = authentication.getLocalAuthentication()) == null || (str = localAuthentication.getUsername()) == null) {
                    str = "";
                }
                this.label = 1;
                if (UserRepository.DefaultImpls.updateLoginName$default(userRepository, str, null, this, 2, null) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountPreferenceFragment$showConfirmUsernameDialog$1(AccountPreferenceFragment accountPreferenceFragment) {
        super(2);
        this.this$0 = accountPreferenceFragment;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        q.i(habiticaAlertDialog, "<anonymous parameter 0>");
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this.this$0), null, new AnonymousClass1(this.this$0, null), 1, null);
    }
}
