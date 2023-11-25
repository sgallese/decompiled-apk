package com.habitrpg.android.habitica.ui.theme;

import a1.p1;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.models.tasks.Task;
import j0.l;
import j0.n;
import qc.h;
import s1.c;

/* compiled from: HabiticaTheme.kt */
/* loaded from: classes4.dex */
public final class HabiticaColors {
    public static final int $stable = 0;
    private final long contentBackground;
    private final long contentBackgroundOffset;
    private final long errorBackground;
    private final long errorColor;
    private final long offsetBackground;
    private final long pixelArtBackground;
    private final long successBackground;
    private final long successColor;
    private final long textDimmed;
    private final long textPrimary;
    private final long textQuad;
    private final long textSecondary;
    private final long textTertiary;
    private final long tintedUiDetails;
    private final long tintedUiMain;
    private final long tintedUiSub;
    private final long windowBackground;

    public /* synthetic */ HabiticaColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, h hVar) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26);
    }

    /* renamed from: basicButtonColor-WaAFU9c  reason: not valid java name */
    public final long m122basicButtonColorWaAFU9c(l lVar, int i10) {
        lVar.e(775948700);
        if (n.K()) {
            n.V(775948700, i10, -1, "com.habitrpg.android.habitica.ui.theme.HabiticaColors.basicButtonColor (HabiticaTheme.kt:216)");
        }
        long a10 = c.a(R.color.gray700_gray10, lVar, 6);
        if (n.K()) {
            n.U();
        }
        lVar.N();
        return a10;
    }

    /* renamed from: basicTextColor-WaAFU9c  reason: not valid java name */
    public final long m123basicTextColorWaAFU9c(l lVar, int i10) {
        lVar.e(2012164311);
        if (n.K()) {
            n.V(2012164311, i10, -1, "com.habitrpg.android.habitica.ui.theme.HabiticaColors.basicTextColor (HabiticaTheme.kt:211)");
        }
        long a10 = c.a(R.color.gray200_gray400, lVar, 6);
        if (n.K()) {
            n.U();
        }
        lVar.N();
        return a10;
    }

    /* renamed from: contentBackgroundFor-XeAY9LY  reason: not valid java name */
    public final long m124contentBackgroundForXeAY9LY(Task task, l lVar, int i10) {
        int lightestTaskColor;
        Integer num;
        long j10;
        lVar.e(1117362850);
        if (n.K()) {
            n.V(1117362850, i10, -1, "com.habitrpg.android.habitica.ui.theme.HabiticaColors.contentBackgroundFor (HabiticaTheme.kt:197)");
        }
        p1 p1Var = null;
        if (t.n.a(lVar, 0)) {
            if (task != null) {
                lightestTaskColor = task.getDarkestTaskColor();
                num = Integer.valueOf(lightestTaskColor);
            }
            num = null;
        } else {
            if (task != null) {
                lightestTaskColor = task.getLightestTaskColor();
                num = Integer.valueOf(lightestTaskColor);
            }
            num = null;
        }
        if (num != null) {
            p1Var = p1.g(c.a(num.intValue(), lVar, 0));
        }
        if (p1Var != null) {
            j10 = p1Var.y();
        } else {
            j10 = this.windowBackground;
        }
        if (n.K()) {
            n.U();
        }
        lVar.N();
        return j10;
    }

    /* renamed from: getContentBackground-0d7_KjU  reason: not valid java name */
    public final long m125getContentBackground0d7_KjU() {
        return this.contentBackground;
    }

    /* renamed from: getContentBackgroundOffset-0d7_KjU  reason: not valid java name */
    public final long m126getContentBackgroundOffset0d7_KjU() {
        return this.contentBackgroundOffset;
    }

    /* renamed from: getErrorBackground-0d7_KjU  reason: not valid java name */
    public final long m127getErrorBackground0d7_KjU() {
        return this.errorBackground;
    }

    /* renamed from: getErrorColor-0d7_KjU  reason: not valid java name */
    public final long m128getErrorColor0d7_KjU() {
        return this.errorColor;
    }

    /* renamed from: getOffsetBackground-0d7_KjU  reason: not valid java name */
    public final long m129getOffsetBackground0d7_KjU() {
        return this.offsetBackground;
    }

    /* renamed from: getPixelArtBackground-0d7_KjU  reason: not valid java name */
    public final long m130getPixelArtBackground0d7_KjU() {
        return this.pixelArtBackground;
    }

    /* renamed from: getSuccessBackground-0d7_KjU  reason: not valid java name */
    public final long m131getSuccessBackground0d7_KjU() {
        return this.successBackground;
    }

    /* renamed from: getSuccessColor-0d7_KjU  reason: not valid java name */
    public final long m132getSuccessColor0d7_KjU() {
        return this.successColor;
    }

    /* renamed from: getTextDimmed-0d7_KjU  reason: not valid java name */
    public final long m133getTextDimmed0d7_KjU() {
        return this.textDimmed;
    }

    /* renamed from: getTextPrimary-0d7_KjU  reason: not valid java name */
    public final long m134getTextPrimary0d7_KjU() {
        return this.textPrimary;
    }

    /* renamed from: getTextQuad-0d7_KjU  reason: not valid java name */
    public final long m135getTextQuad0d7_KjU() {
        return this.textQuad;
    }

    /* renamed from: getTextSecondary-0d7_KjU  reason: not valid java name */
    public final long m136getTextSecondary0d7_KjU() {
        return this.textSecondary;
    }

    /* renamed from: getTextTertiary-0d7_KjU  reason: not valid java name */
    public final long m137getTextTertiary0d7_KjU() {
        return this.textTertiary;
    }

    /* renamed from: getTintedUiDetails-0d7_KjU  reason: not valid java name */
    public final long m138getTintedUiDetails0d7_KjU() {
        return this.tintedUiDetails;
    }

    /* renamed from: getTintedUiMain-0d7_KjU  reason: not valid java name */
    public final long m139getTintedUiMain0d7_KjU() {
        return this.tintedUiMain;
    }

    /* renamed from: getTintedUiSub-0d7_KjU  reason: not valid java name */
    public final long m140getTintedUiSub0d7_KjU() {
        return this.tintedUiSub;
    }

    /* renamed from: getWindowBackground-0d7_KjU  reason: not valid java name */
    public final long m141getWindowBackground0d7_KjU() {
        return this.windowBackground;
    }

    /* renamed from: pixelArtBackground-XeAY9LY  reason: not valid java name */
    public final long m142pixelArtBackgroundXeAY9LY(boolean z10, l lVar, int i10) {
        int i11;
        long a10;
        int i12;
        lVar.e(-1447219938);
        if (n.K()) {
            n.V(-1447219938, i10, -1, "com.habitrpg.android.habitica.ui.theme.HabiticaColors.pixelArtBackground (HabiticaTheme.kt:202)");
        }
        if (t.n.a(lVar, 0)) {
            lVar.e(-1003384931);
            if (z10) {
                i12 = R.color.gray_200;
            } else {
                i12 = R.color.gray_5;
            }
            a10 = c.a(i12, lVar, 0);
            lVar.N();
        } else {
            lVar.e(-1003384837);
            if (z10) {
                i11 = R.color.content_background;
            } else {
                i11 = R.color.content_background_offset;
            }
            a10 = c.a(i11, lVar, 0);
            lVar.N();
        }
        if (n.K()) {
            n.U();
        }
        lVar.N();
        return a10;
    }

    /* renamed from: primaryBackgroundFor-XeAY9LY  reason: not valid java name */
    public final long m143primaryBackgroundForXeAY9LY(Task task, l lVar, int i10) {
        int lightTaskColor;
        int i11;
        lVar.e(1031234667);
        if (n.K()) {
            n.V(1031234667, i10, -1, "com.habitrpg.android.habitica.ui.theme.HabiticaColors.primaryBackgroundFor (HabiticaTheme.kt:187)");
        }
        Integer num = null;
        if (t.n.a(lVar, 0)) {
            if (task != null) {
                lightTaskColor = task.getMediumTaskColor();
                num = Integer.valueOf(lightTaskColor);
            }
        } else if (task != null) {
            lightTaskColor = task.getLightTaskColor();
            num = Integer.valueOf(lightTaskColor);
        }
        if (num != null) {
            i11 = num.intValue();
        } else {
            i11 = R.color.brand_400;
        }
        long a10 = c.a(i11, lVar, 0);
        if (n.K()) {
            n.U();
        }
        lVar.N();
        return a10;
    }

    /* renamed from: textPrimaryFor-XeAY9LY  reason: not valid java name */
    public final long m144textPrimaryForXeAY9LY(Task task, l lVar, int i10) {
        int extraDarkTaskColor;
        int i11;
        lVar.e(122997424);
        if (n.K()) {
            n.V(122997424, i10, -1, "com.habitrpg.android.habitica.ui.theme.HabiticaColors.textPrimaryFor (HabiticaTheme.kt:177)");
        }
        Integer num = null;
        if (t.n.a(lVar, 0)) {
            if (task != null) {
                extraDarkTaskColor = task.getExtraExtraLightTaskColor();
                num = Integer.valueOf(extraDarkTaskColor);
            }
        } else if (task != null) {
            extraDarkTaskColor = task.getExtraDarkTaskColor();
            num = Integer.valueOf(extraDarkTaskColor);
        }
        if (num != null) {
            i11 = num.intValue();
        } else {
            i11 = R.color.text_primary;
        }
        long a10 = c.a(i11, lVar, 0);
        if (n.K()) {
            n.U();
        }
        lVar.N();
        return a10;
    }

    /* renamed from: textSecondaryFor-XeAY9LY  reason: not valid java name */
    public final long m145textSecondaryForXeAY9LY(Task task, l lVar, int i10) {
        int lowSaturationTaskColor;
        int i11;
        lVar.e(-558542878);
        if (n.K()) {
            n.V(-558542878, i10, -1, "com.habitrpg.android.habitica.ui.theme.HabiticaColors.textSecondaryFor (HabiticaTheme.kt:182)");
        }
        Integer num = null;
        if (t.n.a(lVar, 0)) {
            if (task != null) {
                lowSaturationTaskColor = task.getExtraLightTaskColor();
                num = Integer.valueOf(lowSaturationTaskColor);
            }
        } else if (task != null) {
            lowSaturationTaskColor = task.getLowSaturationTaskColor();
            num = Integer.valueOf(lowSaturationTaskColor);
        }
        if (num != null) {
            i11 = num.intValue();
        } else {
            i11 = R.color.brand_sub_text;
        }
        long a10 = c.a(i11, lVar, 0);
        if (n.K()) {
            n.U();
        }
        lVar.N();
        return a10;
    }

    /* renamed from: windowBackgroundFor-XeAY9LY  reason: not valid java name */
    public final long m146windowBackgroundForXeAY9LY(Task task, l lVar, int i10) {
        int extraExtraLightTaskColor;
        Integer num;
        long j10;
        lVar.e(-1465127115);
        if (n.K()) {
            n.V(-1465127115, i10, -1, "com.habitrpg.android.habitica.ui.theme.HabiticaColors.windowBackgroundFor (HabiticaTheme.kt:192)");
        }
        p1 p1Var = null;
        if (t.n.a(lVar, 0)) {
            if (task != null) {
                extraExtraLightTaskColor = task.getExtraExtraDarkTaskColor();
                num = Integer.valueOf(extraExtraLightTaskColor);
            }
            num = null;
        } else {
            if (task != null) {
                extraExtraLightTaskColor = task.getExtraExtraLightTaskColor();
                num = Integer.valueOf(extraExtraLightTaskColor);
            }
            num = null;
        }
        if (num != null) {
            p1Var = p1.g(c.a(num.intValue(), lVar, 0));
        }
        if (p1Var != null) {
            j10 = p1Var.y();
        } else {
            j10 = this.windowBackground;
        }
        if (n.K()) {
            n.U();
        }
        lVar.N();
        return j10;
    }

    private HabiticaColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26) {
        this.windowBackground = j10;
        this.contentBackground = j11;
        this.contentBackgroundOffset = j12;
        this.offsetBackground = j13;
        this.textPrimary = j14;
        this.textSecondary = j15;
        this.textTertiary = j16;
        this.textQuad = j17;
        this.textDimmed = j18;
        this.tintedUiMain = j19;
        this.tintedUiSub = j20;
        this.tintedUiDetails = j21;
        this.pixelArtBackground = j22;
        this.errorBackground = j23;
        this.errorColor = j24;
        this.successBackground = j25;
        this.successColor = j26;
    }
}
