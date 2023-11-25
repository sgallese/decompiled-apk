package com.habitrpg.android.habitica.models.user;

import io.realm.d1;
import io.realm.d7;
import io.realm.internal.o;

/* compiled from: OwnedPet.kt */
/* loaded from: classes4.dex */
public class OwnedPet extends d1 implements OwnedObject, d7 {
    public static final int $stable = 8;
    private String key;
    private int trained;
    private String userID;

    public OwnedPet() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedObject
    public String getKey() {
        return realmGet$key();
    }

    public final int getTrained() {
        return realmGet$trained();
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedObject
    public String getUserID() {
        return realmGet$userID();
    }

    @Override // io.realm.d7
    public String realmGet$key() {
        return this.key;
    }

    @Override // io.realm.d7
    public int realmGet$trained() {
        return this.trained;
    }

    @Override // io.realm.d7
    public String realmGet$userID() {
        return this.userID;
    }

    @Override // io.realm.d7
    public void realmSet$key(String str) {
        this.key = str;
    }

    @Override // io.realm.d7
    public void realmSet$trained(int i10) {
        this.trained = i10;
    }

    @Override // io.realm.d7
    public void realmSet$userID(String str) {
        this.userID = str;
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedObject
    public void setKey(String str) {
        realmSet$key(str);
    }

    public final void setTrained(int i10) {
        realmSet$trained(i10);
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedObject
    public void setUserID(String str) {
        realmSet$userID(str);
    }
}
