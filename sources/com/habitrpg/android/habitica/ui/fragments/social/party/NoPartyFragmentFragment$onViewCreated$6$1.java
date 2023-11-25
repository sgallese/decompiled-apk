package com.habitrpg.android.habitica.ui.fragments.social.party;

import ad.k0;
import com.habitrpg.android.habitica.data.UserRepository;
import dc.w;
import java.util.Date;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NoPartyFragmentFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.party.NoPartyFragmentFragment$onViewCreated$6$1", f = "NoPartyFragmentFragment.kt", l = {106}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NoPartyFragmentFragment$onViewCreated$6$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ NoPartyFragmentFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoPartyFragmentFragment$onViewCreated$6$1(NoPartyFragmentFragment noPartyFragmentFragment, Continuation<? super NoPartyFragmentFragment$onViewCreated$6$1> continuation) {
        super(2, continuation);
        this.this$0 = noPartyFragmentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new NoPartyFragmentFragment$onViewCreated$6$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((NoPartyFragmentFragment$onViewCreated$6$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            Date date = new Date();
            this.label = 1;
            if (userRepository.updateUser("party.seeking", date, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
