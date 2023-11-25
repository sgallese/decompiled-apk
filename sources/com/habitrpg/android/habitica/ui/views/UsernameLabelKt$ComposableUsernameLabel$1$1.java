package com.habitrpg.android.habitica.ui.views;

import a1.l0;
import a1.r1;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.ui.platform.j0;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.models.PlayerTier;
import dc.w;
import f0.f2;
import j0.n;
import pc.p;
import qc.q;
import qc.r;
import t.u;

/* compiled from: UsernameLabel.kt */
/* loaded from: classes4.dex */
final class UsernameLabelKt$ComposableUsernameLabel$1$1 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $isNPC;
    final /* synthetic */ int $tier;
    final /* synthetic */ String $username;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsernameLabelKt$ComposableUsernameLabel$1$1(String str, boolean z10, int i10, int i11) {
        super(2);
        this.$username = str;
        this.$isNPC = z10;
        this.$tier = i10;
        this.$$dirty = i11;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        long b10;
        if ((i10 & 11) == 2 && lVar.t()) {
            lVar.z();
            return;
        }
        if (n.K()) {
            n.V(-1431638915, i10, -1, "com.habitrpg.android.habitica.ui.views.ComposableUsernameLabel.<anonymous>.<anonymous> (UsernameLabel.kt:100)");
        }
        String str = this.$username;
        if (this.$isNPC) {
            lVar.e(-1571348426);
            b10 = s1.c.a(R.color.contributor_npc, lVar, 6);
        } else {
            lVar.e(-1571348377);
            b10 = r1.b(PlayerTier.Companion.getColorForTier((Context) lVar.C(j0.g()), this.$tier));
        }
        lVar.N();
        f2.b(str, null, b10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, this.$$dirty & 14, 0, 131066);
        int i11 = this.$tier;
        if (i11 > 0) {
            Bitmap imageOfContributorBadge = HabiticaIconsHelper.imageOfContributorBadge(i11, this.$isNPC);
            q.h(imageOfContributorBadge, "imageOfContributorBadge(...)");
            u.b(l0.c(imageOfContributorBadge), null, null, null, null, 0.0f, null, 0, lVar, 56, 252);
        }
        if (n.K()) {
            n.U();
        }
    }
}
