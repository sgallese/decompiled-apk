package com.habitrpg.shared.habitica.models.responses;

/* compiled from: TaskDirectionData.kt */
/* loaded from: classes4.dex */
public final class TaskDirectionData {
    private TaskDirectionDataTemp _tmp;
    private float delta;
    private double exp;
    private double gp;
    private double hp;
    private int lvl;
    private double mp;

    public final float getDelta() {
        return this.delta;
    }

    public final double getExp() {
        return this.exp;
    }

    public final double getGp() {
        return this.gp;
    }

    public final double getHp() {
        return this.hp;
    }

    public final int getLvl() {
        return this.lvl;
    }

    public final double getMp() {
        return this.mp;
    }

    public final TaskDirectionDataTemp get_tmp() {
        return this._tmp;
    }

    public final void setDelta(float f10) {
        this.delta = f10;
    }

    public final void setExp(double d10) {
        this.exp = d10;
    }

    public final void setGp(double d10) {
        this.gp = d10;
    }

    public final void setHp(double d10) {
        this.hp = d10;
    }

    public final void setLvl(int i10) {
        this.lvl = i10;
    }

    public final void setMp(double d10) {
        this.mp = d10;
    }

    public final void set_tmp(TaskDirectionDataTemp taskDirectionDataTemp) {
        this._tmp = taskDirectionDataTemp;
    }
}
