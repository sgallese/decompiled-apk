package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.ui.views.tasks.AssignSheetKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskFormActivity.kt */
/* loaded from: classes4.dex */
public final class TaskFormActivity$showAssignDialog$1 extends qc.r implements pc.q<pc.a<? extends dc.w>, j0.l, Integer, dc.w> {
    final /* synthetic */ TaskFormActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TaskFormActivity.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.activities.TaskFormActivity$showAssignDialog$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends qc.r implements pc.l<String, dc.w> {
        final /* synthetic */ TaskFormActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TaskFormActivity taskFormActivity) {
            super(1);
            this.this$0 = taskFormActivity;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(String str) {
            invoke2(str);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            t0.r rVar;
            t0.r rVar2;
            t0.r rVar3;
            qc.q.i(str, "it");
            rVar = this.this$0.assignedIDs;
            if (rVar.contains(str)) {
                rVar3 = this.this$0.assignedIDs;
                rVar3.remove(str);
                return;
            }
            rVar2 = this.this$0.assignedIDs;
            rVar2.add(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskFormActivity$showAssignDialog$1(TaskFormActivity taskFormActivity) {
        super(3);
        this.this$0 = taskFormActivity;
    }

    @Override // pc.q
    public /* bridge */ /* synthetic */ dc.w invoke(pc.a<? extends dc.w> aVar, j0.l lVar, Integer num) {
        invoke((pc.a<dc.w>) aVar, lVar, num.intValue());
        return dc.w.f13270a;
    }

    public final void invoke(pc.a<dc.w> aVar, j0.l lVar, int i10) {
        t0.r rVar;
        t0.r rVar2;
        qc.q.i(aVar, "onClose");
        if ((i10 & 14) == 0) {
            i10 |= lVar.l(aVar) ? 4 : 2;
        }
        if ((i10 & 91) == 18 && lVar.t()) {
            lVar.z();
            return;
        }
        if (j0.n.K()) {
            j0.n.V(666806789, i10, -1, "com.habitrpg.android.habitica.ui.activities.TaskFormActivity.showAssignDialog.<anonymous> (TaskFormActivity.kt:956)");
        }
        rVar = this.this$0.groupMembers;
        rVar2 = this.this$0.assignedIDs;
        AssignSheetKt.AssignSheet(rVar, rVar2, new AnonymousClass1(this.this$0), aVar, null, lVar, (i10 << 9) & 7168, 16);
        if (j0.n.K()) {
            j0.n.U();
        }
    }
}
