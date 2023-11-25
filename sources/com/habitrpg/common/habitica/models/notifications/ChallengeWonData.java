package com.habitrpg.common.habitica.models.notifications;

/* compiled from: ChallengeWonData.kt */
/* loaded from: classes4.dex */
public class ChallengeWonData implements NotificationData {
    private String name;
    private Integer prize;

    public final String getName() {
        return this.name;
    }

    public final Integer getPrize() {
        return this.prize;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setPrize(Integer num) {
        this.prize = num;
    }
}
