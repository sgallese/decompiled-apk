package com.habitrpg.android.habitica.ui.viewmodels;

import ad.k0;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GroupViewModel.kt */
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$leaveGroup$2", f = "GroupViewModel.kt", l = {188, 189}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class GroupViewModel$leaveGroup$2 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ pc.a<w> $function;
    final /* synthetic */ boolean $keepChallenges;
    int label;
    final /* synthetic */ GroupViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupViewModel$leaveGroup$2(GroupViewModel groupViewModel, boolean z10, pc.a<w> aVar, Continuation<? super GroupViewModel$leaveGroup$2> continuation) {
        super(2, continuation);
        this.this$0 = groupViewModel;
        this.$keepChallenges = z10;
        this.$function = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new GroupViewModel$leaveGroup$2(this.this$0, this.$keepChallenges, this.$function, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((GroupViewModel$leaveGroup$2) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            dc.n.b(r11)
            goto L51
        L12:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1a:
            dc.n.b(r11)
            goto L3c
        L1e:
            dc.n.b(r11)
            com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel r11 = r10.this$0
            com.habitrpg.android.habitica.data.SocialRepository r11 = r11.getSocialRepository()
            com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel r1 = r10.this$0
            java.lang.String r1 = r1.getGroupID()
            if (r1 != 0) goto L31
            java.lang.String r1 = ""
        L31:
            boolean r4 = r10.$keepChallenges
            r10.label = r3
            java.lang.Object r11 = r11.leaveGroup(r1, r4, r10)
            if (r11 != r0) goto L3c
            return r0
        L3c:
            com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel r11 = r10.this$0
            com.habitrpg.android.habitica.data.UserRepository r3 = r11.getUserRepository()
            r4 = 0
            r5 = 1
            r6 = 0
            r8 = 4
            r9 = 0
            r10.label = r2
            r7 = r10
            java.lang.Object r11 = com.habitrpg.android.habitica.data.UserRepository.DefaultImpls.retrieveUser$default(r3, r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L51
            return r0
        L51:
            pc.a<dc.w> r11 = r10.$function
            if (r11 == 0) goto L58
            r11.invoke()
        L58:
            dc.w r11 = dc.w.f13270a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$leaveGroup$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
