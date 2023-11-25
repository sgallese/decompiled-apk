package com.habitrpg.android.habitica.ui.fragments.preferences;

import ad.k0;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.models.user.User;
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
public final class AccountPreferenceFragment$showLoginNameDialog$2 extends r implements pc.l<String, w> {
    final /* synthetic */ AccountPreferenceFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccountPreferenceFragment.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.preferences.AccountPreferenceFragment$showLoginNameDialog$2$1", f = "AccountPreferenceFragment.kt", l = {428, 430}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.preferences.AccountPreferenceFragment$showLoginNameDialog$2$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ String $it;
        int label;
        final /* synthetic */ AccountPreferenceFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AccountPreferenceFragment accountPreferenceFragment, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = accountPreferenceFragment;
            this.$it = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$it, continuation);
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
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        n.b(obj);
                        return w.f13270a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
            } else {
                n.b(obj);
                UserRepository userRepository = this.this$0.getUserRepository();
                String str = this.$it;
                if (str == null) {
                    str = "";
                }
                this.label = 1;
                obj = UserRepository.DefaultImpls.updateLoginName$default(userRepository, str, null, this, 2, null);
                if (obj == d10) {
                    return d10;
                }
            }
            User user = (User) obj;
            if (user == null || !q.d(user.getUsername(), this.$it)) {
                UserRepository userRepository2 = this.this$0.getUserRepository();
                this.label = 2;
                if (UserRepository.DefaultImpls.retrieveUser$default(userRepository2, false, true, false, this, 4, null) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountPreferenceFragment$showLoginNameDialog$2(AccountPreferenceFragment accountPreferenceFragment) {
        super(1);
        this.this$0 = accountPreferenceFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(String str) {
        invoke2(str);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this.this$0), null, new AnonymousClass1(this.this$0, str, null), 1, null);
    }
}
