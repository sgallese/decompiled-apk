package com.habitrpg.android.habitica.ui.activities;

/* compiled from: ArmoireActivity.kt */
/* loaded from: classes4.dex */
final class ArmoireActivity$onCreate$handler$1 extends qc.r implements pc.l<Boolean, dc.w> {
    final /* synthetic */ ArmoireActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArmoireActivity$onCreate$handler$1(ArmoireActivity armoireActivity) {
        super(1);
        this.this$0 = armoireActivity;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return dc.w.f13270a;
    }

    public final void invoke(boolean z10) {
        if (z10) {
            this.this$0.giveUserArmoire();
        }
    }
}
