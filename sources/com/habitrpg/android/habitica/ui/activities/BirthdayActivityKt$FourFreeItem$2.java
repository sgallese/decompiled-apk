package com.habitrpg.android.habitica.ui.activities;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BirthdayActivity.kt */
/* loaded from: classes4.dex */
public final class BirthdayActivityKt$FourFreeItem$2 extends qc.r implements pc.p<j0.l, Integer, dc.w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ int $day;
    final /* synthetic */ d1.c $image;
    final /* synthetic */ String $imageName;
    final /* synthetic */ androidx.compose.ui.e $modifier;
    final /* synthetic */ String $title;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirthdayActivityKt$FourFreeItem$2(int i10, String str, androidx.compose.ui.e eVar, String str2, d1.c cVar, int i11, int i12) {
        super(2);
        this.$day = i10;
        this.$title = str;
        this.$modifier = eVar;
        this.$imageName = str2;
        this.$image = cVar;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return dc.w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        BirthdayActivityKt.FourFreeItem(this.$day, this.$title, this.$modifier, this.$imageName, this.$image, lVar, j0.z1.a(this.$$changed | 1), this.$$default);
    }
}
