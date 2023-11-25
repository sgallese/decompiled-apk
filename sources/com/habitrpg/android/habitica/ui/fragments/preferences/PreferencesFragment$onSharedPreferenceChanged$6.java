package com.habitrpg.android.habitica.ui.fragments.preferences;

import ad.k0;
import com.habitrpg.android.habitica.data.UserRepository;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import pc.p;

/* compiled from: PreferencesFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.preferences.PreferencesFragment$onSharedPreferenceChanged$6", f = "PreferencesFragment.kt", l = {345}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PreferencesFragment$onSharedPreferenceChanged$6 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ String $newAudioTheme;
    int label;
    final /* synthetic */ PreferencesFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferencesFragment$onSharedPreferenceChanged$6(PreferencesFragment preferencesFragment, String str, Continuation<? super PreferencesFragment$onSharedPreferenceChanged$6> continuation) {
        super(2, continuation);
        this.this$0 = preferencesFragment;
        this.$newAudioTheme = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new PreferencesFragment$onSharedPreferenceChanged$6(this.this$0, this.$newAudioTheme, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((PreferencesFragment$onSharedPreferenceChanged$6) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            String str = this.$newAudioTheme;
            this.label = 1;
            if (userRepository.updateUser("preferences.sound", str, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
