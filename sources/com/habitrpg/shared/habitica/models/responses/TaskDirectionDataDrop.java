package com.habitrpg.shared.habitica.models.responses;

import android.os.Parcel;
import android.os.Parcelable;
import qc.q;

/* compiled from: TaskDirectionDataTemp.kt */
/* loaded from: classes4.dex */
public final class TaskDirectionDataDrop implements Parcelable {
    public static final Parcelable.Creator<TaskDirectionDataDrop> CREATOR = new Creator();
    private String dialog;
    private String key;
    private String type;
    private int value;

    /* compiled from: TaskDirectionDataTemp.kt */
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<TaskDirectionDataDrop> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TaskDirectionDataDrop createFromParcel(Parcel parcel) {
            q.i(parcel, "parcel");
            return new TaskDirectionDataDrop(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TaskDirectionDataDrop[] newArray(int i10) {
            return new TaskDirectionDataDrop[i10];
        }
    }

    public TaskDirectionDataDrop(int i10, String str, String str2, String str3) {
        this.value = i10;
        this.key = str;
        this.type = str2;
        this.dialog = str3;
    }

    public static /* synthetic */ TaskDirectionDataDrop copy$default(TaskDirectionDataDrop taskDirectionDataDrop, int i10, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = taskDirectionDataDrop.value;
        }
        if ((i11 & 2) != 0) {
            str = taskDirectionDataDrop.key;
        }
        if ((i11 & 4) != 0) {
            str2 = taskDirectionDataDrop.type;
        }
        if ((i11 & 8) != 0) {
            str3 = taskDirectionDataDrop.dialog;
        }
        return taskDirectionDataDrop.copy(i10, str, str2, str3);
    }

    public final int component1() {
        return this.value;
    }

    public final String component2() {
        return this.key;
    }

    public final String component3() {
        return this.type;
    }

    public final String component4() {
        return this.dialog;
    }

    public final TaskDirectionDataDrop copy(int i10, String str, String str2, String str3) {
        return new TaskDirectionDataDrop(i10, str, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaskDirectionDataDrop)) {
            return false;
        }
        TaskDirectionDataDrop taskDirectionDataDrop = (TaskDirectionDataDrop) obj;
        if (this.value == taskDirectionDataDrop.value && q.d(this.key, taskDirectionDataDrop.key) && q.d(this.type, taskDirectionDataDrop.type) && q.d(this.dialog, taskDirectionDataDrop.dialog)) {
            return true;
        }
        return false;
    }

    public final String getDialog() {
        return this.dialog;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getType() {
        return this.type;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i10 = this.value * 31;
        String str = this.key;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (i10 + hashCode) * 31;
        String str2 = this.type;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        String str3 = this.dialog;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return i13 + i11;
    }

    public final void setDialog(String str) {
        this.dialog = str;
    }

    public final void setKey(String str) {
        this.key = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setValue(int i10) {
        this.value = i10;
    }

    public String toString() {
        return "TaskDirectionDataDrop(value=" + this.value + ", key=" + this.key + ", type=" + this.type + ", dialog=" + this.dialog + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        q.i(parcel, "out");
        parcel.writeInt(this.value);
        parcel.writeString(this.key);
        parcel.writeString(this.type);
        parcel.writeString(this.dialog);
    }
}
