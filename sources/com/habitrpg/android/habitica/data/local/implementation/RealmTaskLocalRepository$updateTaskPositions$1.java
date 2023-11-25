package com.habitrpg.android.habitica.data.local.implementation;

import com.habitrpg.android.habitica.models.tasks.Task;
import dc.w;
import ec.b0;
import io.realm.g1;
import io.realm.o0;
import java.util.ArrayList;
import java.util.List;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: RealmTaskLocalRepository.kt */
/* loaded from: classes4.dex */
final class RealmTaskLocalRepository$updateTaskPositions$1 extends r implements l<o0, w> {
    final /* synthetic */ List<String> $taskOrder;
    final /* synthetic */ g1<Task> $tasks;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealmTaskLocalRepository$updateTaskPositions$1(g1<Task> g1Var, List<String> list) {
        super(1);
        this.$tasks = g1Var;
        this.$taskOrder = list;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(o0 o0Var) {
        invoke2(o0Var);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(o0 o0Var) {
        int f02;
        boolean T;
        q.i(o0Var, "<anonymous parameter 0>");
        g1<Task> g1Var = this.$tasks;
        q.h(g1Var, "$tasks");
        List<String> list = this.$taskOrder;
        ArrayList<Task> arrayList = new ArrayList();
        for (Task task : g1Var) {
            T = b0.T(list, task.getId());
            if (T) {
                arrayList.add(task);
            }
        }
        List<String> list2 = this.$taskOrder;
        for (Task task2 : arrayList) {
            f02 = b0.f0(list2, task2.getId());
            task2.setPosition(f02);
        }
    }
}
