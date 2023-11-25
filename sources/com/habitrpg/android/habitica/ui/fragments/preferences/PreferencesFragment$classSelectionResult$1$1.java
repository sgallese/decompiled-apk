package com.habitrpg.android.habitica.ui.fragments.preferences;

import ad.k0;
import com.habitrpg.android.habitica.data.UserRepository;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PreferencesFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.preferences.PreferencesFragment$classSelectionResult$1$1", f = "PreferencesFragment.kt", l = {81}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class PreferencesFragment$classSelectionResult$1$1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ PreferencesFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferencesFragment$classSelectionResult$1$1(PreferencesFragment preferencesFragment, Continuation<? super PreferencesFragment$classSelectionResult$1$1> continuation) {
        super(2, continuation);
        this.this$0 = preferencesFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new PreferencesFragment$classSelectionResult$1$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((PreferencesFragment$classSelectionResult$1$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
