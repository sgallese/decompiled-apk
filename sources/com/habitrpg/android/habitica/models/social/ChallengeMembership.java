package com.habitrpg.android.habitica.models.social;

import com.habitrpg.android.habitica.models.BaseObject;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.p4;
import qc.q;

/* compiled from: ChallengeMembership.kt */
/* loaded from: classes4.dex */
public class ChallengeMembership extends d1 implements BaseObject, p4 {
    public static final int $stable = 8;
    private String challengeID;
    private String userID;

    public ChallengeMembership(String str, String str2) {
        q.i(str, "userID");
        q.i(str2, "challengeID");
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$userID("");
        realmSet$challengeID("");
        realmSet$userID(str);
        realmSet$challengeID(str2);
    }

    public final String getChallengeID() {
        return realmGet$challengeID();
    }

    public final String getUserID() {
        return realmGet$userID();
    }

    @Override // io.realm.p4
    public String realmGet$challengeID() {
        return this.challengeID;
    }

    @Override // io.realm.p4
    public String realmGet$userID() {
        return this.userID;
    }

    @Override // io.realm.p4
    public void realmSet$challengeID(String str) {
        this.challengeID = str;
    }

    @Override // io.realm.p4
    public void realmSet$userID(String str) {
        this.userID = str;
    }

    public final void setChallengeID(String str) {
        q.i(str, "<set-?>");
        realmSet$challengeID(str);
    }

    public final void setUserID(String str) {
        q.i(str, "<set-?>");
        realmSet$userID(str);
    }

    public ChallengeMembership() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$userID("");
        realmSet$challengeID("");
    }
}
