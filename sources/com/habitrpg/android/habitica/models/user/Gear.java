package com.habitrpg.android.habitica.models.user;

import com.habitrpg.android.habitica.models.BaseObject;
import com.habitrpg.android.habitica.models.inventory.Equipment;
import com.habitrpg.shared.habitica.models.AvatarGear;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.l6;
import io.realm.x0;

/* compiled from: Gear.kt */
/* loaded from: classes4.dex */
public class Gear extends d1 implements BaseObject, AvatarGear, l6 {
    public static final int $stable = 8;
    private Outfit costume;
    private Outfit equipped;
    private x0<Equipment> owned;

    public Gear() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final x0<Equipment> getOwned() {
        return realmGet$owned();
    }

    @Override // io.realm.l6
    public Outfit realmGet$costume() {
        return this.costume;
    }

    @Override // io.realm.l6
    public Outfit realmGet$equipped() {
        return this.equipped;
    }

    @Override // io.realm.l6
    public x0 realmGet$owned() {
        return this.owned;
    }

    @Override // io.realm.l6
    public void realmSet$costume(Outfit outfit) {
        this.costume = outfit;
    }

    @Override // io.realm.l6
    public void realmSet$equipped(Outfit outfit) {
        this.equipped = outfit;
    }

    @Override // io.realm.l6
    public void realmSet$owned(x0 x0Var) {
        this.owned = x0Var;
    }

    public void setCostume(Outfit outfit) {
        realmSet$costume(outfit);
    }

    public void setEquipped(Outfit outfit) {
        realmSet$equipped(outfit);
    }

    public final void setOwned(x0<Equipment> x0Var) {
        realmSet$owned(x0Var);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarGear
    public Outfit getCostume() {
        return realmGet$costume();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarGear
    public Outfit getEquipped() {
        return realmGet$equipped();
    }
}
