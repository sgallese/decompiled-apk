package com.habitrpg.android.habitica.ui.views;

import dc.w;
import j0.z1;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UsernameLabel.kt */
/* loaded from: classes4.dex */
public final class UsernameLabelKt$ComposableUsernameLabel$2 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $isNPC;
    final /* synthetic */ androidx.compose.ui.e $modifier;
    final /* synthetic */ int $tier;
    final /* synthetic */ String $username;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsernameLabelKt$ComposableUsernameLabel$2(String str, int i10, androidx.compose.ui.e eVar, boolean z10, int i11, int i12) {
        super(2);
        this.$username = str;
        this.$tier = i10;
        this.$modifier = eVar;
        this.$isNPC = z10;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        UsernameLabelKt.ComposableUsernameLabel(this.$username, this.$tier, this.$modifier, this.$isNPC, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
