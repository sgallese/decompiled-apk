package com.habitrpg.android.habitica.ui.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import com.habitrpg.android.habitica.ui.views.HabiticaIcons;

/* loaded from: classes4.dex */
public class HabiticaIconsHelper {
    private static float displayDensity = 1.0f;
    private static Bitmap imageOfAlertIcon;
    private static Bitmap imageOfAttributeAllocateButton;
    private static Bitmap imageOfAttributeSparklesLeft;
    private static Bitmap imageOfAttributeSparklesRight;
    private static Bitmap imageOfBuffIcon;
    private static Bitmap imageOfChatCopyIcon;
    private static Bitmap imageOfChatDeleteIcon;
    private static Bitmap imageOfChatReplyIcon;
    private static Bitmap imageOfChatReportIcon;
    private static Bitmap imageOfDamage;
    private static Bitmap imageOfExperience;
    private static Bitmap imageOfExperienceReward;
    private static Bitmap imageOfGem;
    private static Bitmap imageOfGem_36;
    private static Bitmap imageOfGold;
    private static Bitmap imageOfGoldReward;
    private static Bitmap imageOfHealerLightBg;
    private static Bitmap imageOfHeartDarkBg;
    private static Bitmap imageOfHeartLarge;
    private static Bitmap imageOfHeartLightBg;
    private static Bitmap imageOfHourglass;
    private static Bitmap imageOfHourglassLarge;
    private static Bitmap imageOfHourglassShop;
    private static Bitmap imageOfInfoIcon;
    private static Bitmap imageOfItemIndicatorLimited;
    private static Bitmap imageOfMageLightBg;
    private static Bitmap imageOfMagic;
    private static Bitmap imageOfMagicLarge;
    private static Bitmap imageOfParticipantsIcon;
    private static Bitmap imageOfPinItem;
    private static Bitmap imageOfPinnedItem;
    private static Bitmap imageOfRage;
    private static Bitmap imageOfRageStrikeInactive;
    private static Bitmap imageOfRogueLightBg;
    private static Bitmap imageOfStarLarge;
    private static Bitmap imageOfStarMedium;
    private static Bitmap imageOfStarSmall;
    private static Bitmap imageOfTwoHandedIcon;
    private static Bitmap imageOfUnpinItem;
    private static Bitmap imageOfWarriorLightBg;

    public static Bitmap imageOfAlertIcon() {
        Bitmap bitmap = imageOfAlertIcon;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(16);
        imageOfAlertIcon = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfAlertIcon);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawAlertIcon(canvas);
        return imageOfAlertIcon;
    }

    public static Bitmap imageOfAttributeAllocateButton() {
        Bitmap bitmap = imageOfAttributeAllocateButton;
        if (bitmap != null) {
            return bitmap;
        }
        imageOfAttributeAllocateButton = Bitmap.createBitmap(scaleSize(24), scaleSize(15), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfAttributeAllocateButton);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawAttributeAllocateButton(canvas);
        return imageOfAttributeAllocateButton;
    }

    public static Bitmap imageOfAttributeSparklesLeft() {
        Bitmap bitmap = imageOfAttributeSparklesLeft;
        if (bitmap != null) {
            return bitmap;
        }
        imageOfAttributeSparklesLeft = Bitmap.createBitmap(scaleSize(77), scaleSize(24), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfAttributeSparklesLeft);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawAttributeSparklesLeft(canvas);
        return imageOfAttributeSparklesLeft;
    }

    public static Bitmap imageOfAttributeSparklesRight() {
        Bitmap bitmap = imageOfAttributeSparklesRight;
        if (bitmap != null) {
            return bitmap;
        }
        imageOfAttributeSparklesRight = Bitmap.createBitmap(scaleSize(77), scaleSize(24), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfAttributeSparklesRight);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawAttributeSparklesRight(canvas);
        return imageOfAttributeSparklesRight;
    }

    public static Bitmap imageOfBuffIcon() {
        Bitmap bitmap = imageOfBuffIcon;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(15);
        imageOfBuffIcon = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfBuffIcon);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawBuffIcon(canvas);
        return imageOfBuffIcon;
    }

    public static Bitmap imageOfCaret(int i10, boolean z10) {
        int scaleSize = scaleSize(16);
        Bitmap createBitmap = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawCaret(canvas, i10, z10);
        return createBitmap;
    }

    public static Bitmap imageOfChatCopyIcon() {
        Bitmap bitmap = imageOfChatCopyIcon;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(17);
        imageOfChatCopyIcon = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfChatCopyIcon);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawChatCopyIcon(canvas);
        return imageOfChatCopyIcon;
    }

    public static Bitmap imageOfChatDeleteIcon() {
        Bitmap bitmap = imageOfChatDeleteIcon;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(17);
        imageOfChatDeleteIcon = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfChatDeleteIcon);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawChatDeleteIcon(canvas);
        return imageOfChatDeleteIcon;
    }

    public static Bitmap imageOfChatReplyIcon() {
        Bitmap bitmap = imageOfChatReplyIcon;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(17);
        imageOfChatReplyIcon = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfChatReplyIcon);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawChatReplyIcon(canvas);
        return imageOfChatReplyIcon;
    }

    public static Bitmap imageOfChatReportIcon() {
        Bitmap bitmap = imageOfChatReportIcon;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(17);
        imageOfChatReportIcon = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfChatReportIcon);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawChatReportIcon(canvas);
        return imageOfChatReportIcon;
    }

    public static Bitmap imageOfCheckmark(int i10, float f10) {
        Bitmap createBitmap = Bitmap.createBitmap(scaleSize(16), scaleSize(12), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f11 = displayDensity;
        canvas.scale(f11, f11);
        HabiticaIcons.drawCheckmark(canvas, i10, f10);
        return createBitmap;
    }

    public static Bitmap imageOfContributorBadge(float f10, boolean z10) {
        int scaleSize = scaleSize(16);
        Bitmap createBitmap = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f11 = displayDensity;
        canvas.scale(f11, f11);
        HabiticaIcons.drawContributorBadge(canvas, f10, z10);
        return createBitmap;
    }

    public static Bitmap imageOfDamage() {
        Bitmap bitmap = imageOfDamage;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(18);
        imageOfDamage = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfDamage);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawDamage(canvas);
        return imageOfDamage;
    }

    public static Bitmap imageOfExperience() {
        Bitmap bitmap = imageOfExperience;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(18);
        imageOfExperience = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfExperience);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawExperience(canvas);
        return imageOfExperience;
    }

    public static Bitmap imageOfExperienceReward() {
        Bitmap bitmap = imageOfExperienceReward;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(40);
        imageOfExperienceReward = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        float f10 = scaleSize;
        HabiticaIcons.drawExperience(new Canvas(imageOfExperienceReward), new RectF(0.0f, 0.0f, f10, f10), HabiticaIcons.ResizingBehavior.AspectFit);
        return imageOfExperienceReward;
    }

    public static Bitmap imageOfGem() {
        Bitmap bitmap = imageOfGem;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(18);
        imageOfGem = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfGem);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawGem(canvas);
        return imageOfGem;
    }

    public static Bitmap imageOfGem_36() {
        Bitmap bitmap = imageOfGem_36;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(36);
        imageOfGem_36 = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfGem_36);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawGem(canvas);
        return imageOfGem_36;
    }

    public static Bitmap imageOfGold() {
        Bitmap bitmap = imageOfGold;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(18);
        imageOfGold = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfGold);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawGold(canvas);
        return imageOfGold;
    }

    public static Bitmap imageOfGoldReward() {
        Bitmap bitmap = imageOfGoldReward;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(40);
        imageOfGoldReward = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        float f10 = scaleSize;
        HabiticaIcons.drawGold(new Canvas(imageOfGoldReward), new RectF(0.0f, 0.0f, f10, f10), HabiticaIcons.ResizingBehavior.AspectFit);
        return imageOfGoldReward;
    }

    public static Bitmap imageOfGuildCrest(boolean z10, boolean z11, float f10, String str) {
        Bitmap createBitmap = Bitmap.createBitmap(scaleSize(40), scaleSize(38), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f11 = displayDensity;
        canvas.scale(f11, f11);
        HabiticaIcons.drawGuildCrest(canvas, z10, z11, f10, str);
        return createBitmap;
    }

    public static Bitmap imageOfGuildCrestMedium(float f10) {
        Bitmap createBitmap = Bitmap.createBitmap(scaleSize(30), scaleSize(34), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f11 = displayDensity;
        canvas.scale(f11, f11);
        HabiticaIcons.drawGuildCrestMedium(canvas, f10);
        return createBitmap;
    }

    public static Bitmap imageOfGuildCrestSmall(float f10) {
        Bitmap createBitmap = Bitmap.createBitmap(scaleSize(16), scaleSize(16), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f11 = displayDensity;
        canvas.scale(f11, f11);
        HabiticaIcons.drawGuildCrestSmall(canvas, f10);
        return createBitmap;
    }

    public static Bitmap imageOfHealerLightBg() {
        Bitmap bitmap = imageOfHealerLightBg;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(32);
        imageOfHealerLightBg = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfHealerLightBg);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawHealerLightBg(canvas);
        return imageOfHealerLightBg;
    }

    public static Bitmap imageOfHeartDarkBg() {
        Bitmap bitmap = imageOfHeartDarkBg;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(18);
        imageOfHeartDarkBg = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfHeartDarkBg);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawHeart(canvas, true);
        return imageOfHeartDarkBg;
    }

    public static Bitmap imageOfHeartLarge() {
        Bitmap bitmap = imageOfHeartLarge;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(36);
        imageOfHeartLarge = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        float f10 = scaleSize;
        HabiticaIcons.drawHeart(new Canvas(imageOfHeartLarge), new RectF(0.0f, 0.0f, f10, f10), HabiticaIcons.ResizingBehavior.AspectFit, false);
        return imageOfHeartLarge;
    }

    public static Bitmap imageOfHeartLightBg() {
        Bitmap bitmap = imageOfHeartLightBg;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(18);
        imageOfHeartLightBg = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfHeartLightBg);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawHeart(canvas, false);
        return imageOfHeartLightBg;
    }

    public static Bitmap imageOfHourglass() {
        Bitmap bitmap = imageOfHourglass;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(18);
        imageOfHourglass = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfHourglass);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawHourglass(canvas);
        return imageOfHourglass;
    }

    public static Bitmap imageOfHourglassLarge() {
        Bitmap bitmap = imageOfHourglassLarge;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(40);
        imageOfHourglassLarge = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        float f10 = scaleSize;
        HabiticaIcons.drawHourglass(new Canvas(imageOfHourglassLarge), new RectF(0.0f, 0.0f, f10, f10), HabiticaIcons.ResizingBehavior.AspectFit);
        return imageOfHourglassLarge;
    }

    public static Bitmap imageOfHourglassShop() {
        Bitmap bitmap = imageOfHourglassShop;
        if (bitmap != null) {
            return bitmap;
        }
        imageOfHourglassShop = Bitmap.createBitmap(scaleSize(42), scaleSize(53), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfHourglassShop);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawHourglassShop(canvas);
        return imageOfHourglassShop;
    }

    public static Bitmap imageOfInfoIcon(int i10) {
        Bitmap bitmap = imageOfInfoIcon;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(20);
        imageOfInfoIcon = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfInfoIcon);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawInfoIcon(canvas, i10);
        return imageOfInfoIcon;
    }

    public static Bitmap imageOfItemIndicatorLimited() {
        Bitmap bitmap = imageOfItemIndicatorLimited;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(28);
        imageOfItemIndicatorLimited = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfItemIndicatorLimited);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawItemIndicator(canvas, Color.parseColor("#A5A1AD"), Color.parseColor("#C3C0C7"), Color.parseColor("#A5A1AD"), Color.parseColor("#525252"), false, true, false);
        return imageOfItemIndicatorLimited;
    }

    public static Bitmap imageOfItemIndicatorLocked(boolean z10) {
        int i10;
        int i11;
        int scaleSize = scaleSize(28);
        Bitmap createBitmap = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        int parseColor = Color.parseColor("#EDECEE");
        int parseColor2 = Color.parseColor("#525252");
        if (z10) {
            int parseColor3 = Color.parseColor("#6133B4");
            i11 = Color.parseColor("#6133B4");
            i10 = parseColor3;
        } else {
            i10 = parseColor;
            i11 = parseColor2;
        }
        HabiticaIcons.drawItemIndicator(canvas, i10, Color.parseColor("#C3C0C7"), i10, i11, true, false, false);
        return createBitmap;
    }

    public static Bitmap imageOfItemIndicatorLockedDark(boolean z10) {
        int i10;
        int i11;
        int scaleSize = scaleSize(28);
        Bitmap createBitmap = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        int parseColor = Color.parseColor("#EDECEE");
        int parseColor2 = Color.parseColor("#525252");
        if (z10) {
            int parseColor3 = Color.parseColor("#6133B4");
            i11 = Color.parseColor("#6133B4");
            i10 = parseColor3;
        } else {
            i10 = parseColor;
            i11 = parseColor2;
        }
        HabiticaIcons.drawItemIndicator(canvas, i10, Color.parseColor("#C3C0C7"), i10, i11, true, false, true);
        return createBitmap;
    }

    public static Bitmap imageOfItemIndicatorNumber(boolean z10) {
        int i10;
        int i11;
        int scaleSize = scaleSize(28);
        Bitmap createBitmap = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        int parseColor = Color.parseColor("#A5A1AD");
        int parseColor2 = Color.parseColor("#525252");
        if (z10) {
            int parseColor3 = Color.parseColor("#6133B4");
            i11 = Color.parseColor("#6133B4");
            i10 = parseColor3;
        } else {
            i10 = parseColor;
            i11 = parseColor2;
        }
        HabiticaIcons.drawItemIndicator(canvas, i10, Color.parseColor("#C3C0C7"), i11, i10, false, false, false);
        return createBitmap;
    }

    public static Bitmap imageOfItemIndicatorNumberDark(boolean z10) {
        int i10;
        int i11;
        int scaleSize = scaleSize(28);
        Bitmap createBitmap = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        int parseColor = Color.parseColor("#A5A1AD");
        int parseColor2 = Color.parseColor("#525252");
        if (z10) {
            int parseColor3 = Color.parseColor("#6133B4");
            i11 = Color.parseColor("#6133B4");
            i10 = parseColor3;
        } else {
            i10 = parseColor;
            i11 = parseColor2;
        }
        HabiticaIcons.drawItemIndicator(canvas, i10, Color.parseColor("#C3C0C7"), i10, i11, false, false, true);
        return createBitmap;
    }

    public static Bitmap imageOfLocked(int i10) {
        return imageOfLocked(i10, 15, 17);
    }

    public static Bitmap imageOfMageLightBg() {
        Bitmap bitmap = imageOfMageLightBg;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(32);
        imageOfMageLightBg = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfMageLightBg);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawMageLightBg(canvas);
        return imageOfMageLightBg;
    }

    public static Bitmap imageOfMagic() {
        Bitmap bitmap = imageOfMagic;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(18);
        imageOfMagic = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfMagic);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawMagic(canvas);
        return imageOfMagic;
    }

    public static Bitmap imageOfMagicLarge() {
        Bitmap bitmap = imageOfMagicLarge;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(36);
        imageOfMagicLarge = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        float f10 = scaleSize;
        HabiticaIcons.drawMagic(new Canvas(imageOfMagicLarge), new RectF(0.0f, 0.0f, f10, f10), HabiticaIcons.ResizingBehavior.AspectFit);
        return imageOfMagicLarge;
    }

    public static Bitmap imageOfParticipantsIcon() {
        Bitmap bitmap = imageOfParticipantsIcon;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(20);
        imageOfParticipantsIcon = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfParticipantsIcon);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawParticipantsIcon(canvas);
        return imageOfParticipantsIcon;
    }

    public static Bitmap imageOfPinItem() {
        Bitmap bitmap = imageOfPinItem;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(24);
        imageOfPinItem = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfPinItem);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawAddRemovePin(canvas, true);
        return imageOfPinItem;
    }

    public static Bitmap imageOfPinnedItem() {
        Bitmap bitmap = imageOfPinnedItem;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(14);
        imageOfPinnedItem = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfPinnedItem);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawPinnedItem(canvas);
        return imageOfPinnedItem;
    }

    public static Bitmap imageOfRage() {
        Bitmap bitmap = imageOfRage;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(18);
        imageOfRage = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfRage);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawRage(canvas);
        return imageOfRage;
    }

    public static Bitmap imageOfRageStrikeActive(Context context, Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(scaleSize(63), scaleSize(82), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawRageStrikeActive(canvas, context, bitmap);
        return createBitmap;
    }

    public static Bitmap imageOfRageStrikeInactive() {
        Bitmap bitmap = imageOfRageStrikeInactive;
        if (bitmap != null) {
            return bitmap;
        }
        imageOfRageStrikeInactive = Bitmap.createBitmap(scaleSize(63), scaleSize(82), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfRageStrikeInactive);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawRageStrikeInactive(canvas);
        return imageOfRageStrikeInactive;
    }

    public static Bitmap imageOfRogueLightBg() {
        Bitmap bitmap = imageOfRogueLightBg;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(32);
        imageOfRogueLightBg = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfRogueLightBg);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawRogueLightBg(canvas);
        return imageOfRogueLightBg;
    }

    public static Bitmap imageOfStarLarge() {
        Bitmap bitmap = imageOfStarLarge;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(27);
        imageOfStarLarge = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfStarLarge);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawStarLarge(canvas);
        return imageOfStarLarge;
    }

    public static Bitmap imageOfStarMedium() {
        Bitmap bitmap = imageOfStarMedium;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(21);
        imageOfStarMedium = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfStarMedium);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawStarMedium(canvas);
        return imageOfStarMedium;
    }

    public static Bitmap imageOfStarSmall() {
        Bitmap bitmap = imageOfStarSmall;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(9);
        imageOfStarSmall = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfStarSmall);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawStarSmall(canvas);
        return imageOfStarSmall;
    }

    public static Bitmap imageOfStats() {
        Bitmap createBitmap = Bitmap.createBitmap(scaleSize(30), scaleSize(30), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawStats(canvas);
        return createBitmap;
    }

    public static Bitmap imageOfTaskDifficultyStars(int i10, float f10, boolean z10) {
        int scaleSize = scaleSize(36);
        Bitmap createBitmap = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f11 = displayDensity;
        canvas.scale(f11, f11);
        HabiticaIcons.drawTaskDifficultyStars(canvas, i10, f10, z10);
        return createBitmap;
    }

    public static Bitmap imageOfTwoHandedIcon() {
        Bitmap bitmap = imageOfTwoHandedIcon;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(15);
        imageOfTwoHandedIcon = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfTwoHandedIcon);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawTwoHandedIcon(canvas);
        return imageOfTwoHandedIcon;
    }

    public static Bitmap imageOfUnpinItem() {
        Bitmap bitmap = imageOfUnpinItem;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(24);
        imageOfUnpinItem = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfUnpinItem);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawAddRemovePin(canvas, false);
        return imageOfUnpinItem;
    }

    public static Bitmap imageOfWarriorLightBg() {
        Bitmap bitmap = imageOfWarriorLightBg;
        if (bitmap != null) {
            return bitmap;
        }
        int scaleSize = scaleSize(32);
        imageOfWarriorLightBg = Bitmap.createBitmap(scaleSize, scaleSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfWarriorLightBg);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawWarriorLightBg(canvas);
        return imageOfWarriorLightBg;
    }

    public static void init(Context context) {
        displayDensity = context.getResources().getDisplayMetrics().density;
    }

    private static int scaleSize(int i10) {
        return (int) (i10 * displayDensity);
    }

    public static Bitmap imageOfLocked(int i10, int i11, int i12) {
        Bitmap createBitmap = Bitmap.createBitmap(scaleSize(i11), scaleSize(i12), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f10 = displayDensity;
        canvas.scale(f10, f10);
        HabiticaIcons.drawLocked(canvas, new RectF(0.0f, 0.0f, i11, i12), HabiticaIcons.ResizingBehavior.AspectFit, i10);
        return createBitmap;
    }
}
