package com.habitrpg.android.habitica.ui.fragments.social.party;

import ad.k0;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.models.social.UserParty;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import dc.w;
import kotlin.coroutines.Continuation;

/* compiled from: PartyDetailFragment.kt */
/* loaded from: classes4.dex */
final class PartyDetailFragment$onViewCreated$8 extends qc.r implements pc.l<String, w> {
    final /* synthetic */ PartyDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PartyDetailFragment.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment$onViewCreated$8$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends qc.r implements pc.a<w> {
        final /* synthetic */ PartyDetailFragment this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PartyDetailFragment.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment$onViewCreated$8$1$1", f = "PartyDetailFragment.kt", l = {109}, m = "invokeSuspend")
        /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment$onViewCreated$8$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C02871 extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {
            int label;
            final /* synthetic */ PartyDetailFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02871(PartyDetailFragment partyDetailFragment, Continuation<? super C02871> continuation) {
                super(2, continuation);
                this.this$0 = partyDetailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<w> create(Object obj, Continuation<?> continuation) {
                return new C02871(this.this$0, continuation);
            }

            @Override // pc.p
            public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
                return ((C02871) create(k0Var, continuation)).invokeSuspend(w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                String str;
                UserParty party;
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
                    this.label = 1;
                    obj = UserRepository.DefaultImpls.retrieveUser$default(userRepository, false, false, false, this, 6, null);
                    if (obj == d10) {
                        return d10;
                    }
                }
                User user = (User) obj;
                this.this$0.getParentFragmentManager().g1();
                MainNavigationController mainNavigationController = MainNavigationController.INSTANCE;
                dc.l[] lVarArr = new dc.l[1];
                if (user != null && (party = user.getParty()) != null) {
                    str = party.getId();
                } else {
                    str = null;
                }
                lVarArr[0] = new dc.l("partyID", str);
                mainNavigationController.navigate(R.id.partyFragment, androidx.core.os.e.a(lVarArr));
                return w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PartyDetailFragment partyDetailFragment) {
            super(0);
            this.this$0 = partyDetailFragment;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ad.i.d(androidx.lifecycle.w.a(this.this$0), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new C02871(this.this$0, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartyDetailFragment$onViewCreated$8(PartyDetailFragment partyDetailFragment) {
        super(1);
        this.this$0 = partyDetailFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(String str) {
        invoke2(str);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        qc.q.i(str, "it");
        this.this$0.getViewModel().joinGroup(str, new AnonymousClass1(this.this$0));
    }
}
