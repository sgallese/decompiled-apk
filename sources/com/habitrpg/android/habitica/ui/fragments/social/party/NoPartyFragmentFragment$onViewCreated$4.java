package com.habitrpg.android.habitica.ui.fragments.social.party;

import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.models.members.Member;
import dc.w;
import kotlin.coroutines.Continuation;

/* compiled from: NoPartyFragmentFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.party.NoPartyFragmentFragment$onViewCreated$4", f = "NoPartyFragmentFragment.kt", l = {87}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NoPartyFragmentFragment$onViewCreated$4 extends kotlin.coroutines.jvm.internal.l implements pc.p<String, Continuation<? super Member>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NoPartyFragmentFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoPartyFragmentFragment$onViewCreated$4(NoPartyFragmentFragment noPartyFragmentFragment, Continuation<? super NoPartyFragmentFragment$onViewCreated$4> continuation) {
        super(2, continuation);
        this.this$0 = noPartyFragmentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        NoPartyFragmentFragment$onViewCreated$4 noPartyFragmentFragment$onViewCreated$4 = new NoPartyFragmentFragment$onViewCreated$4(this.this$0, continuation);
        noPartyFragmentFragment$onViewCreated$4.L$0 = obj;
        return noPartyFragmentFragment$onViewCreated$4;
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
            String str = (String) this.L$0;
            SocialRepository socialRepository = this.this$0.getSocialRepository();
            this.label = 1;
            obj = SocialRepository.DefaultImpls.retrieveMember$default(socialRepository, str, false, this, 2, null);
            if (obj == d10) {
                return d10;
            }
        }
        return obj;
    }

    @Override // pc.p
    public final Object invoke(String str, Continuation<? super Member> continuation) {
        return ((NoPartyFragmentFragment$onViewCreated$4) create(str, continuation)).invokeSuspend(w.f13270a);
    }
}
