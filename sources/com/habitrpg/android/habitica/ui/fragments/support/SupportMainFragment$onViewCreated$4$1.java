package com.habitrpg.android.habitica.ui.fragments.support;

import ad.k0;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.android.habitica.ui.views.HabiticaSnackbar;
import com.habitrpg.android.habitica.ui.views.SnackbarActivity;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SupportMainFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.support.SupportMainFragment$onViewCreated$4$1", f = "SupportMainFragment.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class SupportMainFragment$onViewCreated$4$1 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ SupportMainFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportMainFragment$onViewCreated$4$1(SupportMainFragment supportMainFragment, Continuation<? super SupportMainFragment$onViewCreated$4$1> continuation) {
        super(2, continuation);
        this.this$0 = supportMainFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new SupportMainFragment$onViewCreated$4$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((SupportMainFragment$onViewCreated$4$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            if (userRepository.resetTutorial(this) == d10) {
                return d10;
            }
        }
        MainActivity mainActivity = this.this$0.getMainActivity();
        if (mainActivity != null) {
            SnackbarActivity.DefaultImpls.showSnackbar$default(mainActivity, null, null, this.this$0.getString(R.string.tutorial_reset_confirmation), null, null, null, null, HabiticaSnackbar.SnackbarDisplayType.SUCCESS, false, 376, null);
        }
        return w.f13270a;
    }
}
