package com.habitrpg.android.habitica.ui.fragments.social.party;

import ad.k0;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import dc.w;
import kotlin.coroutines.Continuation;

/* compiled from: NoPartyFragmentFragment.kt */
/* loaded from: classes4.dex */
final class NoPartyFragmentFragment$onViewCreated$2 extends qc.r implements pc.l<String, w> {
    final /* synthetic */ NoPartyFragmentFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NoPartyFragmentFragment.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.party.NoPartyFragmentFragment$onViewCreated$2$1", f = "NoPartyFragmentFragment.kt", l = {69, 70}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.party.NoPartyFragmentFragment$onViewCreated$2$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ String $it;
        int label;
        final /* synthetic */ NoPartyFragmentFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NoPartyFragmentFragment noPartyFragmentFragment, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = noPartyFragmentFragment;
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
                        dc.n.b(obj);
                        this.this$0.getParentFragmentManager().g1();
                        MainNavigationController.INSTANCE.navigate(R.id.partyFragment, androidx.core.os.e.a(new dc.l("partyID", this.this$0.getUserViewModel().getPartyID())));
                        return w.f13270a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dc.n.b(obj);
            } else {
                dc.n.b(obj);
                SocialRepository socialRepository = this.this$0.getSocialRepository();
                String str = this.$it;
                this.label = 1;
                if (socialRepository.joinGroup(str, this) == d10) {
                    return d10;
                }
            }
            UserRepository userRepository = this.this$0.getUserRepository();
            this.label = 2;
            if (UserRepository.DefaultImpls.retrieveUser$default(userRepository, false, true, false, this, 4, null) == d10) {
                return d10;
            }
            this.this$0.getParentFragmentManager().g1();
            MainNavigationController.INSTANCE.navigate(R.id.partyFragment, androidx.core.os.e.a(new dc.l("partyID", this.this$0.getUserViewModel().getPartyID())));
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoPartyFragmentFragment$onViewCreated$2(NoPartyFragmentFragment noPartyFragmentFragment) {
        super(1);
        this.this$0 = noPartyFragmentFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(String str) {
        invoke2(str);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        qc.q.i(str, "it");
        ad.i.d(androidx.lifecycle.w.a(this.this$0), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new AnonymousClass1(this.this$0, str, null), 2, null);
    }
}
