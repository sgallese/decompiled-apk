package com.habitrpg.android.habitica.ui.fragments.social.party;

import ad.k0;
import com.habitrpg.android.habitica.models.social.Group;
import dc.w;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PartyDetailFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment$updateParty$1", f = "PartyDetailFragment.kt", l = {179, 181}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class PartyDetailFragment$updateParty$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ Group $party;
    int label;
    final /* synthetic */ PartyDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartyDetailFragment$updateParty$1(PartyDetailFragment partyDetailFragment, Group group, Continuation<? super PartyDetailFragment$updateParty$1> continuation) {
        super(2, continuation);
        this.this$0 = partyDetailFragment;
        this.$party = group;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new PartyDetailFragment$updateParty$1(this.this$0, this.$party, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((PartyDetailFragment$updateParty$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = ic.b.d()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            dc.n.b(r6)
            goto L4f
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            dc.n.b(r6)
            goto L2c
        L1e:
            dc.n.b(r6)
            r5.label = r3
            r3 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r6 = ad.u0.a(r3, r5)
            if (r6 != r0) goto L2c
            return r0
        L2c:
            com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment r6 = r5.this$0
            com.habitrpg.android.habitica.data.InventoryRepository r6 = r6.getInventoryRepository()
            com.habitrpg.android.habitica.models.social.Group r1 = r5.$party
            com.habitrpg.android.habitica.models.inventory.Quest r1 = r1.getQuest()
            if (r1 == 0) goto L40
            java.lang.String r1 = r1.getKey()
            if (r1 != 0) goto L42
        L40:
            java.lang.String r1 = ""
        L42:
            dd.g r6 = r6.getQuestContent(r1)
            r5.label = r2
            java.lang.Object r6 = dd.i.x(r6, r5)
            if (r6 != r0) goto L4f
            return r0
        L4f:
            com.habitrpg.android.habitica.models.inventory.QuestContent r6 = (com.habitrpg.android.habitica.models.inventory.QuestContent) r6
            if (r6 == 0) goto L58
            com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment r0 = r5.this$0
            com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment.access$updateQuestContent(r0, r6)
        L58:
            dc.w r6 = dc.w.f13270a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment$updateParty$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
