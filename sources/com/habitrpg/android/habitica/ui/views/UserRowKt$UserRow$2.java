package com.habitrpg.android.habitica.ui.views;

import a1.p1;
import com.habitrpg.shared.habitica.models.Avatar;
import dc.w;
import j0.z1;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserRow.kt */
/* loaded from: classes4.dex */
public final class UserRowKt$UserRow$2 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Avatar $avatar;
    final /* synthetic */ p1 $color;
    final /* synthetic */ p<j0.l, Integer, w> $endContent;
    final /* synthetic */ p<j0.l, Integer, w> $extraContent;
    final /* synthetic */ androidx.compose.ui.e $mainContentModifier;
    final /* synthetic */ androidx.compose.ui.e $modifier;
    final /* synthetic */ String $username;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UserRowKt$UserRow$2(String str, Avatar avatar, androidx.compose.ui.e eVar, androidx.compose.ui.e eVar2, p<? super j0.l, ? super Integer, w> pVar, p<? super j0.l, ? super Integer, w> pVar2, p1 p1Var, int i10, int i11) {
        super(2);
        this.$username = str;
        this.$avatar = avatar;
        this.$modifier = eVar;
        this.$mainContentModifier = eVar2;
        this.$extraContent = pVar;
        this.$endContent = pVar2;
        this.$color = p1Var;
        this.$$changed = i10;
        this.$$default = i11;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        UserRowKt.m166UserRowPIknLig(this.$username, this.$avatar, this.$modifier, this.$mainContentModifier, this.$extraContent, this.$endContent, this.$color, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
