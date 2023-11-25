package com.habitrpg.android.habitica.ui.activities;

/* compiled from: SetupActivity.kt */
/* loaded from: classes4.dex */
final class SetupActivity$ViewPageAdapter$instantiateItem$1 extends qc.r implements pc.l<Boolean, dc.w> {
    final /* synthetic */ SetupActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetupActivity$ViewPageAdapter$instantiateItem$1(SetupActivity setupActivity) {
        super(1);
        this.this$0 = setupActivity;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(Boolean bool) {
        invoke2(bool);
        return dc.w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean bool) {
        this.this$0.setNextButtonEnabled(qc.q.d(bool, Boolean.TRUE));
    }
}
