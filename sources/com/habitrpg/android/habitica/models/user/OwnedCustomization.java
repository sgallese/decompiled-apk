package com.habitrpg.android.habitica.models.user;

import io.realm.d1;
import io.realm.internal.o;
import io.realm.x6;

/* compiled from: OwnedCustomization.kt */
/* loaded from: classes4.dex */
public class OwnedCustomization extends d1 implements OwnedObject, x6 {
    public static final int $stable = 8;
    private String category;
    private String key;
    private boolean purchased;
    private String type;
    private String userID;

    public OwnedCustomization() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final String getCategory() {
        return realmGet$category();
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedObject
    public String getKey() {
        return realmGet$key();
    }

    public final boolean getPurchased() {
        return realmGet$purchased();
    }

    public final String getType() {
        return realmGet$type();
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedObject
    public String getUserID() {
        return realmGet$userID();
    }

    @Override // io.realm.x6
    public String realmGet$category() {
        return this.category;
    }

    @Override // io.realm.x6
    public String realmGet$key() {
        return this.key;
    }

    @Override // io.realm.x6
    public boolean realmGet$purchased() {
        return this.purchased;
    }

    @Override // io.realm.x6
    public String realmGet$type() {
        return this.type;
    }

    @Override // io.realm.x6
    public String realmGet$userID() {
        return this.userID;
    }

    @Override // io.realm.x6
    public void realmSet$category(String str) {
        this.category = str;
    }

    @Override // io.realm.x6
    public void realmSet$key(String str) {
        this.key = str;
    }

    @Override // io.realm.x6
    public void realmSet$purchased(boolean z10) {
        this.purchased = z10;
    }

    @Override // io.realm.x6
    public void realmSet$type(String str) {
        this.type = str;
    }

    @Override // io.realm.x6
    public void realmSet$userID(String str) {
        this.userID = str;
    }

    public final void setCategory(String str) {
        realmSet$category(str);
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedObject
    public void setKey(String str) {
        realmSet$key(str);
    }

    public final void setPurchased(boolean z10) {
        realmSet$purchased(z10);
    }

    public final void setType(String str) {
        realmSet$type(str);
    }

    @Override // com.habitrpg.android.habitica.models.user.OwnedObject
    public void setUserID(String str) {
        realmSet$userID(str);
    }
}
