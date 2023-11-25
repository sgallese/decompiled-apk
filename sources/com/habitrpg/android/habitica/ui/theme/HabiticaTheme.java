package com.habitrpg.android.habitica.ui.theme;

import a1.r1;
import android.content.Context;
import androidx.compose.ui.platform.j0;
import androidx.core.content.a;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import f0.g2;
import f0.h1;
import f0.s0;
import j0.l;
import j0.n;

/* compiled from: HabiticaTheme.kt */
/* loaded from: classes4.dex */
public final class HabiticaTheme {
    public static final int $stable = 0;
    public static final HabiticaTheme INSTANCE = new HabiticaTheme();

    private HabiticaTheme() {
    }

    public final HabiticaColors getColors(l lVar, int i10) {
        lVar.e(812991047);
        if (n.K()) {
            n.V(812991047, i10, -1, "com.habitrpg.android.habitica.ui.theme.HabiticaTheme.<get-colors> (HabiticaTheme.kt:132)");
        }
        Context context = (Context) lVar.C(j0.g());
        HabiticaColors habiticaColors = new HabiticaColors(r1.b(ContextExtensionsKt.getThemeColor(context, R.attr.colorWindowBackground)), r1.b(ContextExtensionsKt.getThemeColor(context, R.attr.colorContentBackground)), r1.b(ContextExtensionsKt.getThemeColor(context, R.attr.colorContentBackgroundOffset)), r1.b(ContextExtensionsKt.getThemeColor(context, R.attr.colorOffsetBackground)), r1.b(ContextExtensionsKt.getThemeColor(context, R.attr.textColorPrimary)), r1.b(ContextExtensionsKt.getThemeColor(context, R.attr.textColorSecondary)), r1.b(a.c(context, R.color.text_ternary)), r1.b(a.c(context, R.color.text_quad)), r1.b(a.c(context, R.color.text_dimmed)), r1.b(ContextExtensionsKt.getThemeColor(context, R.attr.tintedUiMain)), r1.b(ContextExtensionsKt.getThemeColor(context, R.attr.tintedUiSub)), r1.b(ContextExtensionsKt.getThemeColor(context, R.attr.tintedUiDetails)), r1.b(ContextExtensionsKt.getThemeColor(context, R.attr.colorContentBackground)), r1.b(a.c(context, R.color.background_red)), r1.b(a.c(context, R.color.text_red)), r1.b(a.c(context, R.color.background_green)), r1.b(a.c(context, R.color.text_green)), null);
        if (n.K()) {
            n.U();
        }
        lVar.N();
        return habiticaColors;
    }

    public final h1 getShapes(l lVar, int i10) {
        lVar.e(-675390126);
        if (n.K()) {
            n.V(-675390126, i10, -1, "com.habitrpg.android.habitica.ui.theme.HabiticaTheme.<get-shapes> (HabiticaTheme.kt:128)");
        }
        h1 b10 = s0.f15068a.b(lVar, s0.f15069b);
        if (n.K()) {
            n.U();
        }
        lVar.N();
        return b10;
    }

    public final g2 getTypography(l lVar, int i10) {
        lVar.e(-1463103019);
        if (n.K()) {
            n.V(-1463103019, i10, -1, "com.habitrpg.android.habitica.ui.theme.HabiticaTheme.<get-typography> (HabiticaTheme.kt:124)");
        }
        g2 c10 = s0.f15068a.c(lVar, s0.f15069b);
        if (n.K()) {
            n.U();
        }
        lVar.N();
        return c10;
    }
}
