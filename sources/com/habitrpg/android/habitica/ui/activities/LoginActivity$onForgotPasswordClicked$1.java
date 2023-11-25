package com.habitrpg.android.habitica.ui.activities;

import android.widget.EditText;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoginActivity.kt */
/* loaded from: classes4.dex */
public final class LoginActivity$onForgotPasswordClicked$1 extends qc.r implements pc.p<HabiticaAlertDialog, Integer, dc.w> {
    final /* synthetic */ EditText $input;
    final /* synthetic */ LoginActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoginActivity.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.LoginActivity$onForgotPasswordClicked$1$1", f = "LoginActivity.kt", l = {473}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.activities.LoginActivity$onForgotPasswordClicked$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
        final /* synthetic */ EditText $input;
        int label;
        final /* synthetic */ LoginActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LoginActivity loginActivity, EditText editText, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = loginActivity;
            this.$input = editText;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$input, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                UserRepository userRepository = this.this$0.getUserRepository();
                String obj2 = this.$input.getText().toString();
                this.label = 1;
                if (userRepository.sendPasswordResetEmail(obj2, this) == d10) {
                    return d10;
                }
            }
            this.this$0.showPasswordEmailConfirmation();
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginActivity$onForgotPasswordClicked$1(LoginActivity loginActivity, EditText editText) {
        super(2);
        this.this$0 = loginActivity;
        this.$input = editText;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ dc.w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return dc.w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        qc.q.i(habiticaAlertDialog, "<anonymous parameter 0>");
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this.this$0), null, new AnonymousClass1(this.this$0, this.$input, null), 1, null);
    }
}
