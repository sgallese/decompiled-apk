package com.habitrpg.android.habitica.data.local.implementation;

import com.habitrpg.android.habitica.models.tasks.Task;
import dc.w;
import io.realm.o0;
import java.util.Iterator;
import java.util.List;
import pc.l;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealmTaskLocalRepository.kt */
/* loaded from: classes4.dex */
public final class RealmTaskLocalRepository$removeCompletedTodos$1 extends r implements l<o0, w> {
    final /* synthetic */ List<Task> $tasksToDelete;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RealmTaskLocalRepository$removeCompletedTodos$1(List<? extends Task> list) {
        super(1);
        this.$tasksToDelete = list;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(o0 o0Var) {
        invoke2(o0Var);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(o0 o0Var) {
        q.i(o0Var, "it");
        Iterator<Task> it = this.$tasksToDelete.iterator();
        while (it.hasNext()) {
            it.next().deleteFromRealm();
        }
    }
}
