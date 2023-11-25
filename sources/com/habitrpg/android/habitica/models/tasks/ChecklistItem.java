package com.habitrpg.android.habitica.models.tasks;

import android.os.Parcel;
import android.os.Parcelable;
import com.habitrpg.android.habitica.models.BaseMainObject;
import io.realm.a1;
import io.realm.d1;
import io.realm.i5;
import io.realm.internal.o;
import java.util.UUID;
import qc.h;
import qc.q;

/* compiled from: ChecklistItem.kt */
/* loaded from: classes4.dex */
public class ChecklistItem extends d1 implements BaseMainObject, Parcelable, i5 {
    private boolean completed;

    /* renamed from: id  reason: collision with root package name */
    private String f12523id;
    private int position;
    private String text;
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    /* compiled from: ChecklistItem.kt */
    /* loaded from: classes4.dex */
    public static final class CREATOR implements Parcelable.Creator<ChecklistItem>, a1 {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(h hVar) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ChecklistItem createFromParcel(Parcel parcel) {
            q.i(parcel, "source");
            return new ChecklistItem(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ChecklistItem[] newArray(int i10) {
            return new ChecklistItem[i10];
        }
    }

    public ChecklistItem() {
        this(null, null, false, 7, null);
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ChecklistItem) {
            return q.d(realmGet$id(), ((ChecklistItem) obj).realmGet$id());
        }
        return super.equals(obj);
    }

    public final boolean getCompleted() {
        return realmGet$completed();
    }

    public final String getId() {
        return realmGet$id();
    }

    public final int getPosition() {
        return realmGet$position();
    }

    @Override // com.habitrpg.android.habitica.models.BaseMainObject
    public String getPrimaryIdentifier() {
        return realmGet$id();
    }

    @Override // com.habitrpg.android.habitica.models.BaseMainObject
    public String getPrimaryIdentifierName() {
        return "id";
    }

    @Override // com.habitrpg.android.habitica.models.BaseMainObject
    public Class<ChecklistItem> getRealmClass() {
        return ChecklistItem.class;
    }

    public final String getText() {
        return realmGet$text();
    }

    public int hashCode() {
        String realmGet$id = realmGet$id();
        if (realmGet$id != null) {
            return realmGet$id.hashCode();
        }
        return 0;
    }

    @Override // io.realm.i5
    public boolean realmGet$completed() {
        return this.completed;
    }

    @Override // io.realm.i5
    public String realmGet$id() {
        return this.f12523id;
    }

    @Override // io.realm.i5
    public int realmGet$position() {
        return this.position;
    }

    @Override // io.realm.i5
    public String realmGet$text() {
        return this.text;
    }

    @Override // io.realm.i5
    public void realmSet$completed(boolean z10) {
        this.completed = z10;
    }

    @Override // io.realm.i5
    public void realmSet$id(String str) {
        this.f12523id = str;
    }

    @Override // io.realm.i5
    public void realmSet$position(int i10) {
        this.position = i10;
    }

    @Override // io.realm.i5
    public void realmSet$text(String str) {
        this.text = str;
    }

    public final void setCompleted(boolean z10) {
        realmSet$completed(z10);
    }

    public final void setId(String str) {
        realmSet$id(str);
    }

    public final void setPosition(int i10) {
        realmSet$position(i10);
    }

    public final void setText(String str) {
        realmSet$text(str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        q.i(parcel, "dest");
        parcel.writeString(realmGet$id());
        parcel.writeString(realmGet$text());
        parcel.writeByte(realmGet$completed() ? (byte) 1 : (byte) 0);
        parcel.writeInt(realmGet$position());
    }

    public ChecklistItem(String str) {
        this(str, null, false, 6, null);
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public ChecklistItem(String str, String str2) {
        this(str, str2, false, 4, null);
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public ChecklistItem(String str, String str2, boolean z10) {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$id(UUID.randomUUID().toString());
        realmSet$text(str2);
        boolean z11 = false;
        if (str != null) {
            if (str.length() > 0) {
                z11 = true;
            }
        }
        if (z11) {
            realmSet$id(str);
        } else {
            realmSet$id(UUID.randomUUID().toString());
        }
        realmSet$completed(z10);
    }

    public /* synthetic */ ChecklistItem(String str, String str2, boolean z10, int i10, h hVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? false : z10);
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public ChecklistItem(ChecklistItem checklistItem) {
        q.i(checklistItem, "item");
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$id(UUID.randomUUID().toString());
        realmSet$text(checklistItem.realmGet$text());
        realmSet$id(checklistItem.realmGet$id());
        realmSet$completed(checklistItem.realmGet$completed());
    }

    public ChecklistItem(Parcel parcel) {
        q.i(parcel, "source");
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$id(UUID.randomUUID().toString());
        realmSet$id(parcel.readString());
        realmSet$text(parcel.readString());
        realmSet$completed(parcel.readByte() == 1);
        realmSet$position(parcel.readInt());
    }
}
