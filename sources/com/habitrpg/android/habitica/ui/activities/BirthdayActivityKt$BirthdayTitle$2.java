package com.habitrpg.android.habitica.ui.activities;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BirthdayActivity.kt */
/* loaded from: classes4.dex */
public final class BirthdayActivityKt$BirthdayTitle$2 extends qc.r implements pc.p<j0.l, Integer, dc.w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ String $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirthdayActivityKt$BirthdayTitle$2(String str, int i10) {
        super(2);
        this.$text = str;
        this.$$changed = i10;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return dc.w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        BirthdayActivityKt.BirthdayTitle(this.$text, lVar, j0.z1.a(this.$$changed | 1));
    }
}
