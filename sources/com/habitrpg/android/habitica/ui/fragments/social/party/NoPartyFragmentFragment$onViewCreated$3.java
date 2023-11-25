package com.habitrpg.android.habitica.ui.fragments.social.party;

import ad.k0;
import android.widget.FrameLayout;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.databinding.FragmentNoPartyBinding;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import dc.w;
import kotlin.coroutines.Continuation;

/* compiled from: NoPartyFragmentFragment.kt */
/* loaded from: classes4.dex */
final class NoPartyFragmentFragment$onViewCreated$3 extends qc.r implements pc.l<String, w> {
    final /* synthetic */ NoPartyFragmentFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NoPartyFragmentFragment.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.party.NoPartyFragmentFragment$onViewCreated$3$1", f = "NoPartyFragmentFragment.kt", l = {81}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.party.NoPartyFragmentFragment$onViewCreated$3$1  reason: invalid class name */
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
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                SocialRepository socialRepository = this.this$0.getSocialRepository();
                String str = this.$it;
                this.label = 1;
                if (socialRepository.rejectGroupInvite(str, this) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoPartyFragmentFragment$onViewCreated$3(NoPartyFragmentFragment noPartyFragmentFragment) {
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
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this.this$0), null, new AnonymousClass1(this.this$0, str, null), 1, null);
        FragmentNoPartyBinding binding = this.this$0.getBinding();
        FrameLayout frameLayout = binding != null ? binding.invitationWrapper : null;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(8);
    }
}
