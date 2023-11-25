package com.habitrpg.android.habitica.data.local.implementation;

import com.habitrpg.android.habitica.models.social.InboxConversation;
import dc.w;
import io.realm.o0;
import java.util.ArrayList;
import java.util.Iterator;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: RealmSocialLocalRepository.kt */
/* loaded from: classes4.dex */
final class RealmSocialLocalRepository$saveInboxConversations$2 extends r implements l<o0, w> {
    final /* synthetic */ ArrayList<InboxConversation> $conversationsToRemove;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealmSocialLocalRepository$saveInboxConversations$2(ArrayList<InboxConversation> arrayList) {
        super(1);
        this.$conversationsToRemove = arrayList;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(o0 o0Var) {
        invoke2(o0Var);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(o0 o0Var) {
        q.i(o0Var, "it");
        Iterator<T> it = this.$conversationsToRemove.iterator();
        while (it.hasNext()) {
            ((InboxConversation) it.next()).deleteFromRealm();
        }
    }
}
