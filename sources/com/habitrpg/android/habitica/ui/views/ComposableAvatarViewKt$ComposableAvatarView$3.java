package com.habitrpg.android.habitica.ui.views;

import com.habitrpg.shared.habitica.models.Avatar;
import dc.w;
import j0.z1;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ComposableAvatarView.kt */
/* loaded from: classes4.dex */
public final class ComposableAvatarViewKt$ComposableAvatarView$3 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Avatar $avatar;
    final /* synthetic */ androidx.compose.ui.e $modifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableAvatarViewKt$ComposableAvatarView$3(Avatar avatar, androidx.compose.ui.e eVar, int i10, int i11) {
        super(2);
        this.$avatar = avatar;
        this.$modifier = eVar;
        this.$$changed = i10;
        this.$$default = i11;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        ComposableAvatarViewKt.ComposableAvatarView(this.$avatar, this.$modifier, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
