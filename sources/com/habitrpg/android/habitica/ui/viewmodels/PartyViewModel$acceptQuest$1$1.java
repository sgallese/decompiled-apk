package com.habitrpg.android.habitica.ui.viewmodels;

import ad.k0;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PartyViewModel.kt */
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.PartyViewModel$acceptQuest$1$1", f = "PartyViewModel.kt", l = {53, 54, 55}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class PartyViewModel$acceptQuest$1$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ String $groupID;
    int label;
    final /* synthetic */ PartyViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartyViewModel$acceptQuest$1$1(PartyViewModel partyViewModel, String str, Continuation<? super PartyViewModel$acceptQuest$1$1> continuation) {
        super(2, continuation);
        this.this$0 = partyViewModel;
        this.$groupID = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new PartyViewModel$acceptQuest$1$1(this.this$0, this.$groupID, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((PartyViewModel$acceptQuest$1$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = ic.b.d()
            int r1 = r10.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            dc.n.b(r11)
            goto L60
        L15:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1d:
            dc.n.b(r11)
            goto L4b
        L21:
            dc.n.b(r11)
            goto L3a
        L25:
            dc.n.b(r11)
            com.habitrpg.android.habitica.ui.viewmodels.PartyViewModel r11 = r10.this$0
            com.habitrpg.android.habitica.data.SocialRepository r11 = r11.getSocialRepository()
            java.lang.String r1 = r10.$groupID
            r10.label = r4
            r4 = 0
            java.lang.Object r11 = r11.acceptQuest(r4, r1, r10)
            if (r11 != r0) goto L3a
            return r0
        L3a:
            com.habitrpg.android.habitica.ui.viewmodels.PartyViewModel r11 = r10.this$0
            com.habitrpg.android.habitica.data.SocialRepository r11 = r11.getSocialRepository()
            java.lang.String r1 = r10.$groupID
            r10.label = r3
            java.lang.Object r11 = r11.retrieveGroup(r1, r10)
            if (r11 != r0) goto L4b
            return r0
        L4b:
            com.habitrpg.android.habitica.ui.viewmodels.PartyViewModel r11 = r10.this$0
            com.habitrpg.android.habitica.data.UserRepository r3 = r11.getUserRepository()
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 7
            r9 = 0
            r10.label = r2
            r7 = r10
            java.lang.Object r11 = com.habitrpg.android.habitica.data.UserRepository.DefaultImpls.retrieveUser$default(r3, r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L60
            return r0
        L60:
            dc.w r11 = dc.w.f13270a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.viewmodels.PartyViewModel$acceptQuest$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
