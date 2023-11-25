package com.habitrpg.android.habitica.models.social;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.models.BaseObject;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.z4;
import qc.q;

/* compiled from: GroupMembership.kt */
/* loaded from: classes4.dex */
public class GroupMembership extends d1 implements BaseObject, z4 {
    public static final int $stable = 8;
    private String combinedID;
    private String groupID;
    private String userID;

    public GroupMembership(String str, String str2) {
        q.i(str, "userID");
        q.i(str2, "groupID");
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$combinedID("");
        realmSet$userID("");
        realmSet$groupID("");
        setUserID(str);
        setGroupID(str2);
    }

    public final String getCombinedID() {
        return realmGet$combinedID();
    }

    public final String getGroupID() {
        return realmGet$groupID();
    }

    public final String getUserID() {
        return realmGet$userID();
    }

    @Override // io.realm.z4
    public String realmGet$combinedID() {
        return this.combinedID;
    }

    @Override // io.realm.z4
    public String realmGet$groupID() {
        return this.groupID;
    }

    @Override // io.realm.z4
    public String realmGet$userID() {
        return this.userID;
    }

    @Override // io.realm.z4
    public void realmSet$combinedID(String str) {
        this.combinedID = str;
    }

    @Override // io.realm.z4
    public void realmSet$groupID(String str) {
        this.groupID = str;
    }

    @Override // io.realm.z4
    public void realmSet$userID(String str) {
        this.userID = str;
    }

    public final void setCombinedID(String str) {
        q.i(str, "<set-?>");
        realmSet$combinedID(str);
    }

    public final void setGroupID(String str) {
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        realmSet$groupID(str);
        realmSet$combinedID(realmGet$userID() + realmGet$groupID());
    }

    public final void setUserID(String str) {
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        realmSet$userID(str);
        realmSet$combinedID(realmGet$userID() + realmGet$groupID());
    }

    public GroupMembership() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$combinedID("");
        realmSet$userID("");
        realmSet$groupID("");
    }
}
