package com.habitrpg.shared.habitica.models.responses;

/* compiled from: TaskDirectionDataTemp.kt */
/* loaded from: classes4.dex */
public final class TaskDirectionDataTemp {
    private Float crit;
    private TaskDirectionDataDrop drop;
    private TaskDirectionDataQuest quest;

    public final Float getCrit() {
        return this.crit;
    }

    public final TaskDirectionDataDrop getDrop() {
        return this.drop;
    }

    public final TaskDirectionDataQuest getQuest() {
        return this.quest;
    }

    public final void setCrit(Float f10) {
        this.crit = f10;
    }

    public final void setDrop(TaskDirectionDataDrop taskDirectionDataDrop) {
        this.drop = taskDirectionDataDrop;
    }

    public final void setQuest(TaskDirectionDataQuest taskDirectionDataQuest) {
        this.quest = taskDirectionDataQuest;
    }
}
