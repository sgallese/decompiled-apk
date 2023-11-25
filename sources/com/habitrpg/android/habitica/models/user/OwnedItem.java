package com.habitrpg.android.habitica.models.user;

import com.habitrpg.android.habitica.models.BaseMainObject;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.z6;

/* compiled from: OwnedItem.kt */
/* loaded from: classes4.dex */
public class OwnedItem extends d1 implements BaseMainObject, OwnedObject, z6 {
    public static final int $stable = 8;
    private String itemType;
    private String key;
    private int numberOwned;
    private String userID;

    public OwnedItem() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final String getItemType() {
        return realmGet$itemType();
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedObject
    public String getKey() {
        return realmGet$key();
    }

    public final int getNumberOwned() {
        return realmGet$numberOwned();
    }

    @Override // com.habitrpg.android.habitica.models.BaseMainObject
    public String getPrimaryIdentifier() {
        return getKey();
    }

    @Override // com.habitrpg.android.habitica.models.BaseMainObject
    public String getPrimaryIdentifierName() {
        return "combinedKey";
    }

    @Override // com.habitrpg.android.habitica.models.BaseMainObject
    public Class<OwnedItem> getRealmClass() {
        return OwnedItem.class;
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedObject
    public String getUserID() {
        return realmGet$userID();
    }

    @Override // io.realm.z6
    public String realmGet$itemType() {
        return this.itemType;
    }

    @Override // io.realm.z6
    public String realmGet$key() {
        return this.key;
    }

    @Override // io.realm.z6
    public int realmGet$numberOwned() {
        return this.numberOwned;
    }

    @Override // io.realm.z6
    public String realmGet$userID() {
        return this.userID;
    }

    @Override // io.realm.z6
    public void realmSet$itemType(String str) {
        this.itemType = str;
    }

    @Override // io.realm.z6
    public void realmSet$key(String str) {
        this.key = str;
    }

    @Override // io.realm.z6
    public void realmSet$numberOwned(int i10) {
        this.numberOwned = i10;
    }

    @Override // io.realm.z6
    public void realmSet$userID(String str) {
        this.userID = str;
    }

    public final void setItemType(String str) {
        realmSet$itemType(str);
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedObject
    public void setKey(String str) {
        realmSet$key(str);
    }

    public final void setNumberOwned(int i10) {
        realmSet$numberOwned(i10);
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedObject
    public void setUserID(String str) {
        realmSet$userID(str);
    }
}
