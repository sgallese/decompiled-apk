package com.habitrpg.android.habitica.data.local.implementation;

import com.habitrpg.android.habitica.models.Tag;
import dc.w;
import io.realm.o0;
import java.util.Iterator;
import java.util.List;
import pc.l;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealmUserLocalRepository.kt */
/* loaded from: classes4.dex */
public final class RealmUserLocalRepository$removeOldTags$1 extends r implements l<o0, w> {
    final /* synthetic */ List<Tag> $tagsToDelete;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RealmUserLocalRepository$removeOldTags$1(List<? extends Tag> list) {
        super(1);
        this.$tagsToDelete = list;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(o0 o0Var) {
        invoke2(o0Var);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(o0 o0Var) {
        q.i(o0Var, "it");
        Iterator<Tag> it = this.$tagsToDelete.iterator();
        while (it.hasNext()) {
            it.next().deleteFromRealm();
        }
    }
}
