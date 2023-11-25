package com.habitrpg.android.habitica.ui.activities;

/* compiled from: TaskFormActivity.kt */
/* loaded from: classes4.dex */
final class TaskFormActivity$onCreate$3 extends qc.r implements pc.r<CharSequence, Integer, Integer, Integer, dc.w> {
    final /* synthetic */ TaskFormActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskFormActivity$onCreate$3(TaskFormActivity taskFormActivity) {
        super(4);
        this.this$0 = taskFormActivity;
    }

    @Override // pc.r
    public /* bridge */ /* synthetic */ dc.w invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
        invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
        return dc.w.f13270a;
    }

    public final void invoke(CharSequence charSequence, int i10, int i11, int i12) {
        this.this$0.checkCanSave();
    }
}
