package com.habitrpg.android.habitica.ui.fragments.social.party;

import ad.k0;
import android.os.Bundle;
import dc.w;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NoPartyFragmentFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.party.NoPartyFragmentFragment$groupFormResult$1$1", f = "NoPartyFragmentFragment.kt", l = {146, 154}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NoPartyFragmentFragment$groupFormResult$1$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ Bundle $bundle;
    Object L$0;
    int label;
    final /* synthetic */ NoPartyFragmentFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoPartyFragmentFragment$groupFormResult$1$1(NoPartyFragmentFragment noPartyFragmentFragment, Bundle bundle, Continuation<? super NoPartyFragmentFragment$groupFormResult$1$1> continuation) {
        super(2, continuation);
        this.this$0 = noPartyFragmentFragment;
        this.$bundle = bundle;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new NoPartyFragmentFragment$groupFormResult$1$1(this.this$0, this.$bundle, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((NoPartyFragmentFragment$groupFormResult$1$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = ic.b.d()
            int r1 = r12.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r0 = r12.L$0
            com.habitrpg.android.habitica.models.social.Group r0 = (com.habitrpg.android.habitica.models.social.Group) r0
            dc.n.b(r13)
            goto L7d
        L16:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1e:
            dc.n.b(r13)
            goto L63
        L22:
            dc.n.b(r13)
            com.habitrpg.android.habitica.ui.fragments.social.party.NoPartyFragmentFragment r13 = r12.this$0
            com.habitrpg.android.habitica.data.SocialRepository r4 = r13.getSocialRepository()
            android.os.Bundle r13 = r12.$bundle
            java.lang.String r1 = "name"
            java.lang.String r5 = r13.getString(r1)
            android.os.Bundle r13 = r12.$bundle
            java.lang.String r1 = "description"
            java.lang.String r6 = r13.getString(r1)
            android.os.Bundle r13 = r12.$bundle
            java.lang.String r1 = "leader"
            java.lang.String r7 = r13.getString(r1)
            java.lang.String r8 = "party"
            android.os.Bundle r13 = r12.$bundle
            java.lang.String r1 = "privacy"
            java.lang.String r9 = r13.getString(r1)
            android.os.Bundle r13 = r12.$bundle
            java.lang.String r1 = "leaderCreateChallenge"
            boolean r13 = r13.getBoolean(r1)
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.b.a(r13)
            r12.label = r3
            r11 = r12
            java.lang.Object r13 = r4.createGroup(r5, r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L63
            return r0
        L63:
            com.habitrpg.android.habitica.models.social.Group r13 = (com.habitrpg.android.habitica.models.social.Group) r13
            com.habitrpg.android.habitica.ui.fragments.social.party.NoPartyFragmentFragment r1 = r12.this$0
            com.habitrpg.android.habitica.data.UserRepository r4 = r1.getUserRepository()
            r5 = 0
            r6 = 1
            r7 = 0
            r9 = 4
            r10 = 0
            r12.L$0 = r13
            r12.label = r2
            r8 = r12
            java.lang.Object r1 = com.habitrpg.android.habitica.data.UserRepository.DefaultImpls.retrieveUser$default(r4, r5, r6, r7, r8, r9, r10)
            if (r1 != r0) goto L7c
            return r0
        L7c:
            r0 = r13
        L7d:
            com.habitrpg.android.habitica.ui.fragments.social.party.NoPartyFragmentFragment r13 = r12.this$0
            boolean r13 = r13.isAdded()
            if (r13 == 0) goto L8e
            com.habitrpg.android.habitica.ui.fragments.social.party.NoPartyFragmentFragment r13 = r12.this$0
            androidx.fragment.app.FragmentManager r13 = r13.getParentFragmentManager()
            r13.g1()
        L8e:
            com.habitrpg.common.habitica.helpers.MainNavigationController r13 = com.habitrpg.common.habitica.helpers.MainNavigationController.INSTANCE
            dc.l[] r1 = new dc.l[r3]
            dc.l r2 = new dc.l
            if (r0 == 0) goto L9b
            java.lang.String r0 = r0.getId()
            goto L9c
        L9b:
            r0 = 0
        L9c:
            java.lang.String r3 = "partyID"
            r2.<init>(r3, r0)
            r0 = 0
            r1[r0] = r2
            android.os.Bundle r0 = androidx.core.os.e.a(r1)
            r1 = 2131297216(0x7f0903c0, float:1.821237E38)
            r13.navigate(r1, r0)
            dc.w r13 = dc.w.f13270a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.social.party.NoPartyFragmentFragment$groupFormResult$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
