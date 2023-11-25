package com.habitrpg.common.habitica.models.notifications;

/* compiled from: AchievementData.kt */
/* loaded from: classes4.dex */
public class AchievementData implements NotificationData {
    private String achievement;
    private final boolean isLastOnboardingAchievement;
    private String message;
    private String modalText;

    public final String getAchievement() {
        return this.achievement;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getModalText() {
        return this.modalText;
    }

    public final boolean isLastOnboardingAchievement() {
        return this.isLastOnboardingAchievement;
    }

    public final void setAchievement(String str) {
        this.achievement = str;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setModalText(String str) {
        this.modalText = str;
    }
}
