package com.habitrpg.android.habitica.models.responses;

import com.habitrpg.android.habitica.models.user.Buffs;
import com.habitrpg.android.habitica.models.user.Training;
import com.habitrpg.shared.habitica.models.responses.TaskDirectionData;
import ec.t;
import fa.c;
import java.util.List;
import qc.q;

/* compiled from: BulkTaskScoringData.kt */
/* loaded from: classes4.dex */
public final class BulkTaskScoringData {
    public static final int $stable = 8;
    private Buffs buffs;
    @c("con")
    private Integer constitution;
    private Double exp;
    private Double gp;
    @c("class")
    private String habitClass;
    private Double hp;
    @c("int")
    private Integer intelligence;
    private Integer lvl;
    private Double mp;
    @c("per")
    private Integer per;
    private Integer points;
    @c("str")
    private Integer strength;
    private List<TaskDirectionData> tasks;
    private Training training;

    public BulkTaskScoringData() {
        List<TaskDirectionData> i10;
        i10 = t.i();
        this.tasks = i10;
    }

    public final Buffs getBuffs() {
        return this.buffs;
    }

    public final Integer getConstitution() {
        return this.constitution;
    }

    public final Double getExp() {
        return this.exp;
    }

    public final Double getGp() {
        return this.gp;
    }

    public final String getHabitClass() {
        return this.habitClass;
    }

    public final Double getHp() {
        return this.hp;
    }

    public final Integer getIntelligence() {
        return this.intelligence;
    }

    public final Integer getLvl() {
        return this.lvl;
    }

    public final Double getMp() {
        return this.mp;
    }

    public final Integer getPer() {
        return this.per;
    }

    public final Integer getPoints() {
        return this.points;
    }

    public final Integer getStrength() {
        return this.strength;
    }

    public final List<TaskDirectionData> getTasks() {
        return this.tasks;
    }

    public final Training getTraining() {
        return this.training;
    }

    public final void setBuffs(Buffs buffs) {
        this.buffs = buffs;
    }

    public final void setConstitution(Integer num) {
        this.constitution = num;
    }

    public final void setExp(Double d10) {
        this.exp = d10;
    }

    public final void setGp(Double d10) {
        this.gp = d10;
    }

    public final void setHabitClass(String str) {
        this.habitClass = str;
    }

    public final void setHp(Double d10) {
        this.hp = d10;
    }

    public final void setIntelligence(Integer num) {
        this.intelligence = num;
    }

    public final void setLvl(Integer num) {
        this.lvl = num;
    }

    public final void setMp(Double d10) {
        this.mp = d10;
    }

    public final void setPer(Integer num) {
        this.per = num;
    }

    public final void setPoints(Integer num) {
        this.points = num;
    }

    public final void setStrength(Integer num) {
        this.strength = num;
    }

    public final void setTasks(List<TaskDirectionData> list) {
        q.i(list, "<set-?>");
        this.tasks = list;
    }

    public final void setTraining(Training training) {
        this.training = training;
    }
}
