package com.habitrpg.android.habitica.ui.views;

import a2.c0;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.j0;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.models.TeamPlan;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.theme.HabiticaThemeKt;
import com.habitrpg.shared.habitica.models.Avatar;
import com.habitrpg.shared.habitica.models.AvatarStats;
import f0.f2;
import j0.g2;
import j0.n;
import j2.t;
import qc.q;

/* compiled from: AppHeaderView.kt */
/* loaded from: classes4.dex */
public final class AppHeaderViewKt {
    /* JADX WARN: Removed duplicated region for block: B:179:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0879  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0894  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x08bc  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0996  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x09a0  */
    /* JADX WARN: Removed duplicated region for block: B:252:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AppHeaderView(com.habitrpg.shared.habitica.models.Avatar r47, androidx.compose.ui.e r48, boolean r49, com.habitrpg.android.habitica.models.TeamPlan r50, java.util.List<? extends com.habitrpg.android.habitica.models.members.Member> r51, pc.a<dc.w> r52, pc.a<dc.w> r53, pc.a<dc.w> r54, j0.l r55, int r56, int r57) {
        /*
            Method dump skipped, instructions count: 2492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.AppHeaderViewKt.AppHeaderView(com.habitrpg.shared.habitica.models.Avatar, androidx.compose.ui.e, boolean, com.habitrpg.android.habitica.models.TeamPlan, java.util.List, pc.a, pc.a, pc.a, j0.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Preview(dc.l<? extends User, ? extends TeamPlan> lVar, j0.l lVar2, int i10) {
        int i11;
        int i12;
        j0.l q10 = lVar2.q(-247110283);
        if ((i10 & 14) == 0) {
            if (q10.Q(lVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && q10.t()) {
            q10.z();
        } else {
            if (n.K()) {
                n.V(-247110283, i11, -1, "com.habitrpg.android.habitica.ui.views.Preview (AppHeaderView.kt:394)");
            }
            HabiticaThemeKt.HabiticaTheme(q0.c.b(q10, -1595650486, true, new AppHeaderViewKt$Preview$1(lVar)), q10, 6);
            if (n.K()) {
                n.U();
            }
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new AppHeaderViewKt$Preview$2(lVar, i10));
        }
    }

    public static final void UserLevelText(Avatar avatar, j0.l lVar, int i10) {
        int i11;
        String b10;
        Integer lvl;
        int i12;
        String str;
        Integer lvl2;
        q.i(avatar, "user");
        j0.l q10 = lVar.q(-1052510218);
        if (n.K()) {
            n.V(-1052510218, i10, -1, "com.habitrpg.android.habitica.ui.views.UserLevelText (AppHeaderView.kt:69)");
        }
        if (avatar.getHasClass()) {
            q10.e(914092891);
            Object[] objArr = new Object[2];
            AvatarStats stats = avatar.getStats();
            if (stats != null && (lvl2 = stats.getLvl()) != null) {
                i12 = lvl2.intValue();
            } else {
                i12 = 0;
            }
            objArr[0] = Integer.valueOf(i12);
            Resources resources = ((Context) q10.C(j0.g())).getResources();
            q.h(resources, "getResources(...)");
            AvatarStats stats2 = avatar.getStats();
            if (stats2 != null) {
                str = stats2.getHabitClass();
            } else {
                str = null;
            }
            objArr[1] = getTranslatedClassName(resources, str);
            b10 = s1.h.b(R.string.user_level_with_class, objArr, q10, 70);
            q10.N();
        } else {
            q10.e(914093158);
            Object[] objArr2 = new Object[1];
            AvatarStats stats3 = avatar.getStats();
            if (stats3 != null && (lvl = stats3.getLvl()) != null) {
                i11 = lvl.intValue();
            } else {
                i11 = 0;
            }
            objArr2[0] = Integer.valueOf(i11);
            b10 = s1.h.b(R.string.user_level, objArr2, q10, 70);
            q10.N();
        }
        f2.b(b10, null, s1.c.a(R.color.text_primary, q10, 6), t.g(12), null, c0.f239m.f(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, q10, 199680, 0, 131026);
        if (n.K()) {
            n.U();
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new AppHeaderViewKt$UserLevelText$1(avatar, i10));
        }
    }

    public static final String getTranslatedClassName(Resources resources, String str) {
        q.i(resources, "resources");
        if (str != null) {
            switch (str.hashCode()) {
                case -1221263211:
                    if (str.equals(Stats.HEALER)) {
                        String string = resources.getString(R.string.healer);
                        q.h(string, "getString(...)");
                        return string;
                    }
                    break;
                case -787397269:
                    if (str.equals(Stats.MAGE)) {
                        String string2 = resources.getString(R.string.mage);
                        q.h(string2, "getString(...)");
                        return string2;
                    }
                    break;
                case 108690906:
                    if (str.equals(Stats.ROGUE)) {
                        String string3 = resources.getString(R.string.rogue);
                        q.h(string3, "getString(...)");
                        return string3;
                    }
                    break;
                case 1124565314:
                    if (str.equals(Stats.WARRIOR)) {
                        String string4 = resources.getString(R.string.warrior);
                        q.h(string4, "getString(...)");
                        return string4;
                    }
                    break;
            }
        }
        String string5 = resources.getString(R.string.warrior);
        q.h(string5, "getString(...)");
        return string5;
    }
}
