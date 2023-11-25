package com.habitrpg.android.habitica.models.user;

import io.realm.b7;
import io.realm.d1;
import io.realm.internal.o;

/* compiled from: OwnedMount.kt */
/* loaded from: classes4.dex */
public class OwnedMount extends d1 implements OwnedObject, b7 {
    public static final int $stable = 8;
    private String key;
    private boolean owned;
    private String userID;

    public OwnedMount() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedObject
    public String getKey() {
        return realmGet$key();
    }

    public final boolean getOwned() {
        return realmGet$owned();
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedObject
    public String getUserID() {
        return realmGet$userID();
    }

    @Override // io.realm.b7
    public String realmGet$key() {
        return this.key;
    }

    @Override // io.realm.b7
    public boolean realmGet$owned() {
        return this.owned;
    }

    @Override // io.realm.b7
    public String realmGet$userID() {
        return this.userID;
    }

    @Override // io.realm.b7
    public void realmSet$key(String str) {
        this.key = str;
    }

    @Override // io.realm.b7
    public void realmSet$owned(boolean z10) {
        this.owned = z10;
    }

    @Override // io.realm.b7
    public void realmSet$userID(String str) {
        this.userID = str;
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedObject
    public void setKey(String str) {
        realmSet$key(str);
    }

    public final void setOwned(boolean z10) {
        realmSet$owned(z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedObject
    public void setUserID(String str) {
        realmSet$userID(str);
    }
}
