package com.habitrpg.common.habitica.models.notifications;

import java.util.List;

/* compiled from: LoginIncentiveData.kt */
/* loaded from: classes4.dex */
public class LoginIncentiveData implements NotificationData {
    private String message;
    private Integer nextRewardAt;
    private List<Reward> reward;
    private List<String> rewardKey;
    private String rewardText;

    public final String getMessage() {
        return this.message;
    }

    public final Integer getNextRewardAt() {
        return this.nextRewardAt;
    }

    public final List<Reward> getReward() {
        return this.reward;
    }

    public final List<String> getRewardKey() {
        return this.rewardKey;
    }

    public final String getRewardText() {
        return this.rewardText;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setNextRewardAt(Integer num) {
        this.nextRewardAt = num;
    }

    public final void setReward(List<Reward> list) {
        this.reward = list;
    }

    public final void setRewardKey(List<String> list) {
        this.rewardKey = list;
    }

    public final void setRewardText(String str) {
        this.rewardText = str;
    }
}
