package com.habitrpg.android.habitica.ui.fragments.preferences;

import ad.k0;
import com.habitrpg.android.habitica.data.UserRepository;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import pc.p;

/* compiled from: PreferencesFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.preferences.PreferencesFragment$onSharedPreferenceChanged$7", f = "PreferencesFragment.kt", l = {381}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PreferencesFragment$onSharedPreferenceChanged$7 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ boolean $isDisabled;
    int label;
    final /* synthetic */ PreferencesFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferencesFragment$onSharedPreferenceChanged$7(PreferencesFragment preferencesFragment, boolean z10, Continuation<? super PreferencesFragment$onSharedPreferenceChanged$7> continuation) {
        super(2, continuation);
        this.this$0 = preferencesFragment;
        this.$isDisabled = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new PreferencesFragment$onSharedPreferenceChanged$7(this.this$0, this.$isDisabled, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((PreferencesFragment$onSharedPreferenceChanged$7) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            Boolean a10 = kotlin.coroutines.jvm.internal.b.a(this.$isDisabled);
            this.label = 1;
            if (userRepository.updateUser("inbox.optOut", a10, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
