package com.habitrpg.android.habitica.data.local.implementation;

import com.habitrpg.android.habitica.models.tasks.Task;
import dc.w;
import io.realm.o0;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: RealmTaskLocalRepository.kt */
/* loaded from: classes4.dex */
final class RealmTaskLocalRepository$swapTaskPosition$1 extends r implements l<o0, w> {
    final /* synthetic */ int $firstPosition;
    final /* synthetic */ Task $firstTask;
    final /* synthetic */ int $secondPosition;
    final /* synthetic */ Task $secondTask;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealmTaskLocalRepository$swapTaskPosition$1(Task task, int i10, Task task2, int i11) {
        super(1);
        this.$firstTask = task;
        this.$secondPosition = i10;
        this.$secondTask = task2;
        this.$firstPosition = i11;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(o0 o0Var) {
        invoke2(o0Var);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(o0 o0Var) {
        q.i(o0Var, "it");
        this.$firstTask.setPosition(this.$secondPosition);
        this.$secondTask.setPosition(this.$firstPosition);
    }
}
