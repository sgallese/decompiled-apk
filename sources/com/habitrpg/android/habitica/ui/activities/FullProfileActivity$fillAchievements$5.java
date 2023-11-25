package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.models.Achievement;

/* compiled from: FullProfileActivity.kt */
/* loaded from: classes4.dex */
final class FullProfileActivity$fillAchievements$5 extends qc.r implements pc.p<Achievement, Achievement, Integer> {
    public static final FullProfileActivity$fillAchievements$5 INSTANCE = new FullProfileActivity$fillAchievements$5();

    FullProfileActivity$fillAchievements$5() {
        super(2);
    }

    @Override // pc.p
    public final Integer invoke(Achievement achievement, Achievement achievement2) {
        return Integer.valueOf(Double.compare(achievement.getIndex(), achievement2.getIndex()));
    }
}
