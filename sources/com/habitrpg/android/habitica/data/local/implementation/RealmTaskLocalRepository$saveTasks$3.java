package com.habitrpg.android.habitica.data.local.implementation;

import com.habitrpg.android.habitica.models.tasks.Task;
import dc.w;
import io.realm.o0;
import java.util.List;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: RealmTaskLocalRepository.kt */
/* loaded from: classes4.dex */
final class RealmTaskLocalRepository$saveTasks$3 extends r implements l<o0, w> {
    final /* synthetic */ List<Task> $sortedTasks;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealmTaskLocalRepository$saveTasks$3(List<Task> list) {
        super(1);
        this.$sortedTasks = list;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(o0 o0Var) {
        invoke2(o0Var);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(o0 o0Var) {
        q.i(o0Var, "realm1");
        o0Var.h1(this.$sortedTasks);
    }
}
