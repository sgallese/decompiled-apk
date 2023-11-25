package com.habitrpg.shared.habitica.models.responses;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import qc.h;
import qc.q;
import s.t;

/* compiled from: TaskScoringResult.kt */
/* loaded from: classes4.dex */
public final class TaskScoringResult implements Parcelable {
    public static final Parcelable.Creator<TaskScoringResult> CREATOR = new Creator();
    private TaskDirectionDataDrop drop;
    private double experienceDelta;
    private double goldDelta;
    private boolean hasDied;
    private boolean hasLeveledUp;
    private double healthDelta;
    private int level;
    private double manaDelta;
    private Double questDamage;
    private Integer questItemsFound;

    /* compiled from: TaskScoringResult.kt */
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<TaskScoringResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TaskScoringResult createFromParcel(Parcel parcel) {
            q.i(parcel, "parcel");
            return new TaskScoringResult(parcel.readInt() != 0, parcel.readInt() == 0 ? null : TaskDirectionDataDrop.CREATOR.createFromParcel(parcel), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TaskScoringResult[] newArray(int i10) {
            return new TaskScoringResult[i10];
        }
    }

    public TaskScoringResult() {
        this(false, null, 0.0d, 0.0d, 0.0d, 0.0d, false, 0, null, null, 1023, null);
    }

    public static /* synthetic */ TaskScoringResult copy$default(TaskScoringResult taskScoringResult, boolean z10, TaskDirectionDataDrop taskDirectionDataDrop, double d10, double d11, double d12, double d13, boolean z11, int i10, Double d14, Integer num, int i11, Object obj) {
        boolean z12;
        TaskDirectionDataDrop taskDirectionDataDrop2;
        double d15;
        double d16;
        double d17;
        double d18;
        boolean z13;
        int i12;
        Double d19;
        Integer num2;
        if ((i11 & 1) != 0) {
            z12 = taskScoringResult.hasDied;
        } else {
            z12 = z10;
        }
        if ((i11 & 2) != 0) {
            taskDirectionDataDrop2 = taskScoringResult.drop;
        } else {
            taskDirectionDataDrop2 = taskDirectionDataDrop;
        }
        if ((i11 & 4) != 0) {
            d15 = taskScoringResult.experienceDelta;
        } else {
            d15 = d10;
        }
        if ((i11 & 8) != 0) {
            d16 = taskScoringResult.healthDelta;
        } else {
            d16 = d11;
        }
        if ((i11 & 16) != 0) {
            d17 = taskScoringResult.goldDelta;
        } else {
            d17 = d12;
        }
        if ((i11 & 32) != 0) {
            d18 = taskScoringResult.manaDelta;
        } else {
            d18 = d13;
        }
        if ((i11 & 64) != 0) {
            z13 = taskScoringResult.hasLeveledUp;
        } else {
            z13 = z11;
        }
        if ((i11 & 128) != 0) {
            i12 = taskScoringResult.level;
        } else {
            i12 = i10;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
            d19 = taskScoringResult.questDamage;
        } else {
            d19 = d14;
        }
        if ((i11 & 512) != 0) {
            num2 = taskScoringResult.questItemsFound;
        } else {
            num2 = num;
        }
        return taskScoringResult.copy(z12, taskDirectionDataDrop2, d15, d16, d17, d18, z13, i12, d19, num2);
    }

    public final boolean component1() {
        return this.hasDied;
    }

    public final Integer component10() {
        return this.questItemsFound;
    }

    public final TaskDirectionDataDrop component2() {
        return this.drop;
    }

    public final double component3() {
        return this.experienceDelta;
    }

    public final double component4() {
        return this.healthDelta;
    }

    public final double component5() {
        return this.goldDelta;
    }

    public final double component6() {
        return this.manaDelta;
    }

    public final boolean component7() {
        return this.hasLeveledUp;
    }

    public final int component8() {
        return this.level;
    }

    public final Double component9() {
        return this.questDamage;
    }

    public final TaskScoringResult copy(boolean z10, TaskDirectionDataDrop taskDirectionDataDrop, double d10, double d11, double d12, double d13, boolean z11, int i10, Double d14, Integer num) {
        return new TaskScoringResult(z10, taskDirectionDataDrop, d10, d11, d12, d13, z11, i10, d14, num);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaskScoringResult)) {
            return false;
        }
        TaskScoringResult taskScoringResult = (TaskScoringResult) obj;
        if (this.hasDied == taskScoringResult.hasDied && q.d(this.drop, taskScoringResult.drop) && Double.compare(this.experienceDelta, taskScoringResult.experienceDelta) == 0 && Double.compare(this.healthDelta, taskScoringResult.healthDelta) == 0 && Double.compare(this.goldDelta, taskScoringResult.goldDelta) == 0 && Double.compare(this.manaDelta, taskScoringResult.manaDelta) == 0 && this.hasLeveledUp == taskScoringResult.hasLeveledUp && this.level == taskScoringResult.level && q.d(this.questDamage, taskScoringResult.questDamage) && q.d(this.questItemsFound, taskScoringResult.questItemsFound)) {
            return true;
        }
        return false;
    }

    public final TaskDirectionDataDrop getDrop() {
        return this.drop;
    }

    public final double getExperienceDelta() {
        return this.experienceDelta;
    }

    public final double getGoldDelta() {
        return this.goldDelta;
    }

    public final boolean getHasDied() {
        return this.hasDied;
    }

    public final boolean getHasLeveledUp() {
        return this.hasLeveledUp;
    }

    public final double getHealthDelta() {
        return this.healthDelta;
    }

    public final int getLevel() {
        return this.level;
    }

    public final double getManaDelta() {
        return this.manaDelta;
    }

    public final Double getQuestDamage() {
        return this.questDamage;
    }

    public final Integer getQuestItemsFound() {
        return this.questItemsFound;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        boolean z10 = this.hasDied;
        int i10 = 1;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i11 = r02 * 31;
        TaskDirectionDataDrop taskDirectionDataDrop = this.drop;
        int i12 = 0;
        if (taskDirectionDataDrop == null) {
            hashCode = 0;
        } else {
            hashCode = taskDirectionDataDrop.hashCode();
        }
        int a10 = (((((((((i11 + hashCode) * 31) + t.a(this.experienceDelta)) * 31) + t.a(this.healthDelta)) * 31) + t.a(this.goldDelta)) * 31) + t.a(this.manaDelta)) * 31;
        boolean z11 = this.hasLeveledUp;
        if (!z11) {
            i10 = z11 ? 1 : 0;
        }
        int i13 = (((a10 + i10) * 31) + this.level) * 31;
        Double d10 = this.questDamage;
        if (d10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d10.hashCode();
        }
        int i14 = (i13 + hashCode2) * 31;
        Integer num = this.questItemsFound;
        if (num != null) {
            i12 = num.hashCode();
        }
        return i14 + i12;
    }

    public final void setDrop(TaskDirectionDataDrop taskDirectionDataDrop) {
        this.drop = taskDirectionDataDrop;
    }

    public final void setExperienceDelta(double d10) {
        this.experienceDelta = d10;
    }

    public final void setGoldDelta(double d10) {
        this.goldDelta = d10;
    }

    public final void setHasDied(boolean z10) {
        this.hasDied = z10;
    }

    public final void setHasLeveledUp(boolean z10) {
        this.hasLeveledUp = z10;
    }

    public final void setHealthDelta(double d10) {
        this.healthDelta = d10;
    }

    public final void setLevel(int i10) {
        this.level = i10;
    }

    public final void setManaDelta(double d10) {
        this.manaDelta = d10;
    }

    public final void setQuestDamage(Double d10) {
        this.questDamage = d10;
    }

    public final void setQuestItemsFound(Integer num) {
        this.questItemsFound = num;
    }

    public String toString() {
        return "TaskScoringResult(hasDied=" + this.hasDied + ", drop=" + this.drop + ", experienceDelta=" + this.experienceDelta + ", healthDelta=" + this.healthDelta + ", goldDelta=" + this.goldDelta + ", manaDelta=" + this.manaDelta + ", hasLeveledUp=" + this.hasLeveledUp + ", level=" + this.level + ", questDamage=" + this.questDamage + ", questItemsFound=" + this.questItemsFound + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        q.i(parcel, "out");
        parcel.writeInt(this.hasDied ? 1 : 0);
        TaskDirectionDataDrop taskDirectionDataDrop = this.drop;
        if (taskDirectionDataDrop == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            taskDirectionDataDrop.writeToParcel(parcel, i10);
        }
        parcel.writeDouble(this.experienceDelta);
        parcel.writeDouble(this.healthDelta);
        parcel.writeDouble(this.goldDelta);
        parcel.writeDouble(this.manaDelta);
        parcel.writeInt(this.hasLeveledUp ? 1 : 0);
        parcel.writeInt(this.level);
        Double d10 = this.questDamage;
        if (d10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d10.doubleValue());
        }
        Integer num = this.questItemsFound;
        if (num == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(num.intValue());
    }

    public TaskScoringResult(boolean z10, TaskDirectionDataDrop taskDirectionDataDrop, double d10, double d11, double d12, double d13, boolean z11, int i10, Double d14, Integer num) {
        this.hasDied = z10;
        this.drop = taskDirectionDataDrop;
        this.experienceDelta = d10;
        this.healthDelta = d11;
        this.goldDelta = d12;
        this.manaDelta = d13;
        this.hasLeveledUp = z11;
        this.level = i10;
        this.questDamage = d14;
        this.questItemsFound = num;
    }

    public /* synthetic */ TaskScoringResult(boolean z10, TaskDirectionDataDrop taskDirectionDataDrop, double d10, double d11, double d12, double d13, boolean z11, int i10, Double d14, Integer num, int i11, h hVar) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? null : taskDirectionDataDrop, (i11 & 4) != 0 ? 0.0d : d10, (i11 & 8) != 0 ? 0.0d : d11, (i11 & 16) != 0 ? 0.0d : d12, (i11 & 32) == 0 ? d13 : 0.0d, (i11 & 64) != 0 ? false : z11, (i11 & 128) == 0 ? i10 : 0, (i11 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : d14, (i11 & 512) == 0 ? num : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TaskScoringResult(com.habitrpg.shared.habitica.models.responses.TaskDirectionData r24, com.habitrpg.shared.habitica.models.AvatarStats r25) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.shared.habitica.models.responses.TaskScoringResult.<init>(com.habitrpg.shared.habitica.models.responses.TaskDirectionData, com.habitrpg.shared.habitica.models.AvatarStats):void");
    }
}
