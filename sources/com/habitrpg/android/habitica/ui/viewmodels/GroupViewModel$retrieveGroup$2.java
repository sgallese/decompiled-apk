package com.habitrpg.android.habitica.ui.viewmodels;

import ad.k0;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GroupViewModel.kt */
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$retrieveGroup$2", f = "GroupViewModel.kt", l = {130, 132, 135}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class GroupViewModel$retrieveGroup$2 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ pc.a<w> $function;
    Object L$0;
    int label;
    final /* synthetic */ GroupViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupViewModel$retrieveGroup$2(GroupViewModel groupViewModel, pc.a<w> aVar, Continuation<? super GroupViewModel$retrieveGroup$2> continuation) {
        super(2, continuation);
        this.this$0 = groupViewModel;
        this.$function = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new GroupViewModel$retrieveGroup$2(this.this$0, this.$function, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((GroupViewModel$retrieveGroup$2) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = ic.b.d()
            int r1 = r7.label
            r2 = 3
            r3 = 2
            java.lang.String r4 = ""
            r5 = 1
            if (r1 == 0) goto L2c
            if (r1 == r5) goto L28
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            dc.n.b(r8)
            goto L92
        L18:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L20:
            java.lang.Object r1 = r7.L$0
            com.habitrpg.android.habitica.models.social.Group r1 = (com.habitrpg.android.habitica.models.social.Group) r1
            dc.n.b(r8)
            goto L6e
        L28:
            dc.n.b(r8)
            goto L47
        L2c:
            dc.n.b(r8)
            com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel r8 = r7.this$0
            com.habitrpg.android.habitica.data.SocialRepository r8 = r8.getSocialRepository()
            com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel r1 = r7.this$0
            java.lang.String r1 = r1.getGroupID()
            if (r1 != 0) goto L3e
            r1 = r4
        L3e:
            r7.label = r5
            java.lang.Object r8 = r8.retrieveGroup(r1, r7)
            if (r8 != r0) goto L47
            return r0
        L47:
            r1 = r8
            com.habitrpg.android.habitica.models.social.Group r1 = (com.habitrpg.android.habitica.models.social.Group) r1
            com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel r8 = r7.this$0
            com.habitrpg.android.habitica.ui.viewmodels.GroupViewType r8 = r8.getGroupViewType()
            com.habitrpg.android.habitica.ui.viewmodels.GroupViewType r6 = com.habitrpg.android.habitica.ui.viewmodels.GroupViewType.PARTY
            if (r8 != r6) goto Lae
            com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel r8 = r7.this$0
            com.habitrpg.android.habitica.data.SocialRepository r8 = r8.getSocialRepository()
            if (r1 == 0) goto L62
            java.lang.String r6 = r1.getId()
            if (r6 != 0) goto L63
        L62:
            r6 = r4
        L63:
            r7.L$0 = r1
            r7.label = r3
            java.lang.Object r8 = r8.retrievePartyMembers(r6, r5, r7)
            if (r8 != r0) goto L6e
            return r0
        L6e:
            com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel r8 = r7.this$0
            boolean r8 = r8.isLeader()
            if (r8 == 0) goto Lae
            com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel r8 = r7.this$0
            com.habitrpg.android.habitica.data.SocialRepository r8 = r8.getSocialRepository()
            if (r1 == 0) goto L86
            java.lang.String r1 = r1.getId()
            if (r1 != 0) goto L85
            goto L86
        L85:
            r4 = r1
        L86:
            r1 = 0
            r7.L$0 = r1
            r7.label = r2
            java.lang.Object r8 = r8.retrievegroupInvites(r4, r5, r7)
            if (r8 != r0) goto L92
            return r0
        L92:
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L9a
            java.util.List r8 = ec.r.i()
        L9a:
            com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel r0 = r7.this$0
            t0.r r0 = r0.getPendingInvites()
            r0.clear()
            com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel r0 = r7.this$0
            t0.r r0 = r0.getPendingInvites()
            java.util.Collection r8 = (java.util.Collection) r8
            r0.addAll(r8)
        Lae:
            pc.a<dc.w> r8 = r7.$function
            if (r8 == 0) goto Lb5
            r8.invoke()
        Lb5:
            dc.w r8 = dc.w.f13270a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$retrieveGroup$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
