package com.habitrpg.android.habitica.ui.fragments.preferences;

import ad.k0;
import com.google.android.gms.common.Scopes;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.ui.helpers.KeyboardUtil;
import com.habitrpg.android.habitica.ui.views.ValidatingEditText;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
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
public final class AccountPreferenceFragment$showEmailDialog$2$1 extends r implements p<HabiticaAlertDialog, Integer, w> {
    final /* synthetic */ ValidatingEditText $emailEditText;
    final /* synthetic */ ValidatingEditText $passwordEditText;
    final /* synthetic */ AccountPreferenceFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccountPreferenceFragment.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.preferences.AccountPreferenceFragment$showEmailDialog$2$1$1", f = "AccountPreferenceFragment.kt", l = {403}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.preferences.AccountPreferenceFragment$showEmailDialog$2$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ ValidatingEditText $emailEditText;
        final /* synthetic */ ValidatingEditText $passwordEditText;
        int label;
        final /* synthetic */ AccountPreferenceFragment this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AccountPreferenceFragment.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.preferences.AccountPreferenceFragment$showEmailDialog$2$1$1$1", f = "AccountPreferenceFragment.kt", l = {408}, m = "invokeSuspend")
        /* renamed from: com.habitrpg.android.habitica.ui.fragments.preferences.AccountPreferenceFragment$showEmailDialog$2$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C02831 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
            int label;
            final /* synthetic */ AccountPreferenceFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02831(AccountPreferenceFragment accountPreferenceFragment, Continuation<? super C02831> continuation) {
                super(2, continuation);
                this.this$0 = accountPreferenceFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<w> create(Object obj, Continuation<?> continuation) {
                return new C02831(this.this$0, continuation);
            }

            @Override // pc.p
            public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
                return ((C02831) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
                    if (UserRepository.DefaultImpls.retrieveUser$default(userRepository, true, true, false, this, 4, null) == d10) {
                        return d10;
                    }
                }
                return w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AccountPreferenceFragment accountPreferenceFragment, ValidatingEditText validatingEditText, ValidatingEditText validatingEditText2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = accountPreferenceFragment;
            this.$emailEditText = validatingEditText;
            this.$passwordEditText = validatingEditText2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$emailEditText, this.$passwordEditText, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            String str;
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
                String valueOf = String.valueOf(this.$emailEditText.getText());
                ValidatingEditText validatingEditText = this.$passwordEditText;
                if (validatingEditText != null) {
                    str = validatingEditText.getText();
                } else {
                    str = null;
                }
                String valueOf2 = String.valueOf(str);
                this.label = 1;
                if (userRepository.updateEmail(valueOf, valueOf2, this) == d10) {
                    return d10;
                }
            }
            ad.i.d(androidx.lifecycle.w.a(this.this$0), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new C02831(this.this$0, null), 2, null);
            AccountPreferenceFragment accountPreferenceFragment = this.this$0;
            accountPreferenceFragment.configurePreference(accountPreferenceFragment.findPreference(Scopes.EMAIL), String.valueOf(this.$emailEditText.getText()));
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountPreferenceFragment$showEmailDialog$2$1(AccountPreferenceFragment accountPreferenceFragment, ValidatingEditText validatingEditText, ValidatingEditText validatingEditText2) {
        super(2);
        this.this$0 = accountPreferenceFragment;
        this.$emailEditText = validatingEditText;
        this.$passwordEditText = validatingEditText2;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        q.i(habiticaAlertDialog, "dialog");
        KeyboardUtil.Companion.dismissKeyboard(this.this$0.getActivity());
        ValidatingEditText validatingEditText = this.$emailEditText;
        if (validatingEditText != null) {
            ValidatingEditText.showErrorIfNecessary$default(validatingEditText, null, 1, null);
        }
        ValidatingEditText validatingEditText2 = this.$emailEditText;
        boolean z10 = false;
        if (validatingEditText2 != null && validatingEditText2.isValid()) {
            z10 = true;
        }
        if (z10) {
            ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this.this$0), null, new AnonymousClass1(this.this$0, this.$emailEditText, this.$passwordEditText, null), 1, null);
            habiticaAlertDialog.dismiss();
        }
    }
}
