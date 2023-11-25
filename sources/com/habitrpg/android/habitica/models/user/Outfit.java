package com.habitrpg.android.habitica.models.user;

import com.habitrpg.android.habitica.models.BaseObject;
import com.habitrpg.shared.habitica.models.AvatarOutfit;
import fa.c;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.v6;
import qc.q;

/* compiled from: Outfit.kt */
/* loaded from: classes4.dex */
public class Outfit extends d1 implements BaseObject, AvatarOutfit, v6 {
    public static final int $stable = 8;
    private String armor;
    private String back;
    private String body;
    @c("eyewear")
    private String eyeWear;
    private String head;
    private String headAccessory;
    private String shield;
    private String weapon;

    public Outfit() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$armor("");
        realmSet$back("");
        realmSet$body("");
        realmSet$head("");
        realmSet$shield("");
        realmSet$weapon("");
        realmSet$eyeWear("");
        realmSet$headAccessory("");
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarOutfit
    public String getArmor() {
        return realmGet$armor();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarOutfit
    public String getBack() {
        return realmGet$back();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarOutfit
    public String getBody() {
        return realmGet$body();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarOutfit
    public String getEyeWear() {
        return realmGet$eyeWear();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarOutfit
    public String getHead() {
        return realmGet$head();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarOutfit
    public String getHeadAccessory() {
        return realmGet$headAccessory();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarOutfit
    public String getShield() {
        return realmGet$shield();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarOutfit
    public String getWeapon() {
        return realmGet$weapon();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarOutfit
    public boolean isAvailable(String str) {
        return AvatarOutfit.DefaultImpls.isAvailable(this, str);
    }

    @Override // io.realm.v6
    public String realmGet$armor() {
        return this.armor;
    }

    @Override // io.realm.v6
    public String realmGet$back() {
        return this.back;
    }

    @Override // io.realm.v6
    public String realmGet$body() {
        return this.body;
    }

    @Override // io.realm.v6
    public String realmGet$eyeWear() {
        return this.eyeWear;
    }

    @Override // io.realm.v6
    public String realmGet$head() {
        return this.head;
    }

    @Override // io.realm.v6
    public String realmGet$headAccessory() {
        return this.headAccessory;
    }

    @Override // io.realm.v6
    public String realmGet$shield() {
        return this.shield;
    }

    @Override // io.realm.v6
    public String realmGet$weapon() {
        return this.weapon;
    }

    @Override // io.realm.v6
    public void realmSet$armor(String str) {
        this.armor = str;
    }

    @Override // io.realm.v6
    public void realmSet$back(String str) {
        this.back = str;
    }

    @Override // io.realm.v6
    public void realmSet$body(String str) {
        this.body = str;
    }

    @Override // io.realm.v6
    public void realmSet$eyeWear(String str) {
        this.eyeWear = str;
    }

    @Override // io.realm.v6
    public void realmSet$head(String str) {
        this.head = str;
    }

    @Override // io.realm.v6
    public void realmSet$headAccessory(String str) {
        this.headAccessory = str;
    }

    @Override // io.realm.v6
    public void realmSet$shield(String str) {
        this.shield = str;
    }

    @Override // io.realm.v6
    public void realmSet$weapon(String str) {
        this.weapon = str;
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarOutfit
    public void setArmor(String str) {
        q.i(str, "<set-?>");
        realmSet$armor(str);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarOutfit
    public void setBack(String str) {
        q.i(str, "<set-?>");
        realmSet$back(str);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarOutfit
    public void setBody(String str) {
        q.i(str, "<set-?>");
        realmSet$body(str);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarOutfit
    public void setEyeWear(String str) {
        q.i(str, "<set-?>");
        realmSet$eyeWear(str);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarOutfit
    public void setHead(String str) {
        q.i(str, "<set-?>");
        realmSet$head(str);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarOutfit
    public void setHeadAccessory(String str) {
        q.i(str, "<set-?>");
        realmSet$headAccessory(str);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarOutfit
    public void setShield(String str) {
        q.i(str, "<set-?>");
        realmSet$shield(str);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarOutfit
    public void setWeapon(String str) {
        q.i(str, "<set-?>");
        realmSet$weapon(str);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarOutfit
    public void updateWith(AvatarOutfit avatarOutfit) {
        AvatarOutfit.DefaultImpls.updateWith(this, avatarOutfit);
    }
}
