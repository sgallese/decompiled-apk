package com.habitrpg.android.habitica.ui.fragments.preferences;

import ad.k0;
import com.habitrpg.android.habitica.data.UserRepository;
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
public final class AccountPreferenceFragment$updateUser$1 extends r implements pc.l<String, w> {
    final /* synthetic */ String $path;
    final /* synthetic */ String $value;
    final /* synthetic */ AccountPreferenceFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccountPreferenceFragment.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.preferences.AccountPreferenceFragment$updateUser$1$1", f = "AccountPreferenceFragment.kt", l = {286}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.preferences.AccountPreferenceFragment$updateUser$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ String $it;
        final /* synthetic */ String $path;
        int label;
        final /* synthetic */ AccountPreferenceFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AccountPreferenceFragment accountPreferenceFragment, String str, String str2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = accountPreferenceFragment;
            this.$path = str;
            this.$it = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$path, this.$it, continuation);
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
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                UserRepository userRepository = this.this$0.getUserRepository();
                String str = this.$path;
                String str2 = this.$it;
                if (str2 == null) {
                    str2 = "";
                }
                this.label = 1;
                if (userRepository.updateUser(str, str2, this) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountPreferenceFragment$updateUser$1(String str, AccountPreferenceFragment accountPreferenceFragment, String str2) {
        super(1);
        this.$value = str;
        this.this$0 = accountPreferenceFragment;
        this.$path = str2;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(String str) {
        invoke2(str);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        if (q.d(this.$value, str)) {
            return;
        }
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this.this$0), null, new AnonymousClass1(this.this$0, this.$path, str, null), 1, null);
    }
}
