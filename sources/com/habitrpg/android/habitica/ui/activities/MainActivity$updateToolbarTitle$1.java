package com.habitrpg.android.habitica.ui.activities;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainActivity.kt */
/* loaded from: classes4.dex */
public final class MainActivity$updateToolbarTitle$1 extends qc.r implements pc.l<CharSequence, dc.w> {
    final /* synthetic */ MainActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$updateToolbarTitle$1(MainActivity mainActivity) {
        super(1);
        this.this$0 = mainActivity;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(CharSequence charSequence) {
        invoke2(charSequence);
        return dc.w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CharSequence charSequence) {
        this.this$0.setTitle(charSequence);
    }
}
