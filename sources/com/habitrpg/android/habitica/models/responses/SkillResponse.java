package com.habitrpg.android.habitica.models.responses;

import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.models.user.User;

/* compiled from: SkillResponse.kt */
/* loaded from: classes4.dex */
public final class SkillResponse {
    public static final int $stable = 8;
    private float damage;
    private double expDiff;
    private double goldDiff;
    private double hpDiff;
    private Task task;
    private User user;

    public final float getDamage() {
        return this.damage;
    }

    public final double getExpDiff() {
        return this.expDiff;
    }

    public final double getGoldDiff() {
        return this.goldDiff;
    }

    public final double getHpDiff() {
        return this.hpDiff;
    }

    public final Task getTask() {
        return this.task;
    }

    public final User getUser() {
        return this.user;
    }

    public final void setDamage(float f10) {
        this.damage = f10;
    }

    public final void setExpDiff(double d10) {
        this.expDiff = d10;
    }

    public final void setGoldDiff(double d10) {
        this.goldDiff = d10;
    }

    public final void setHpDiff(double d10) {
        this.hpDiff = d10;
    }

    public final void setTask(Task task) {
        this.task = task;
    }

    public final void setUser(User user) {
        this.user = user;
    }
}
