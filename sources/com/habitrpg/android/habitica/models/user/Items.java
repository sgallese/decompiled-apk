package com.habitrpg.android.habitica.models.user;

import com.habitrpg.android.habitica.models.BaseObject;
import com.habitrpg.shared.habitica.models.AvatarItems;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.t6;
import io.realm.x0;
import java.util.Date;
import java.util.Iterator;
import qc.q;

/* compiled from: Items.kt */
/* loaded from: classes4.dex */
public class Items extends d1 implements BaseObject, AvatarItems, t6 {
    public static final int $stable = 8;
    private String currentMount;
    private String currentPet;
    private x0<OwnedItem> eggs;
    private x0<OwnedItem> food;
    private Gear gear;
    private x0<OwnedItem> hatchingPotions;
    private int lastDropCount;
    private Date lastDropDate;
    private x0<OwnedMount> mounts;
    private x0<OwnedPet> pets;
    private x0<OwnedItem> quests;
    private x0<OwnedItem> special;

    public Items(String str, String str2, int i10, Date date) {
        q.i(str, "currentMount");
        q.i(str2, "currentPet");
        q.i(date, "lastDropDate");
        if (this instanceof o) {
            ((o) this).a();
        }
        setCurrentMount(str);
        setCurrentPet(str2);
        realmSet$lastDropCount(i10);
        realmSet$lastDropDate(date);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarItems
    public String getCurrentMount() {
        return realmGet$currentMount();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarItems
    public String getCurrentPet() {
        return realmGet$currentPet();
    }

    public final x0<OwnedItem> getEggs() {
        return realmGet$eggs();
    }

    public final x0<OwnedItem> getFood() {
        return realmGet$food();
    }

    public final boolean getHasTransformationItems() {
        boolean z10;
        x0<OwnedItem> realmGet$special = realmGet$special();
        if (realmGet$special == null || realmGet$special.isEmpty()) {
            return false;
        }
        for (OwnedItem ownedItem : realmGet$special) {
            if ((q.d(ownedItem.getKey(), "seafoam") && ownedItem.getNumberOwned() > 0) || ((q.d(ownedItem.getKey(), "shinySeed") && ownedItem.getNumberOwned() > 0) || ((q.d(ownedItem.getKey(), "snowball") && ownedItem.getNumberOwned() > 0) || (q.d(ownedItem.getKey(), "spookySparkles") && ownedItem.getNumberOwned() > 0)))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final x0<OwnedItem> getHatchingPotions() {
        return realmGet$hatchingPotions();
    }

    public final int getLastDropCount() {
        return realmGet$lastDropCount();
    }

    public final Date getLastDropDate() {
        return realmGet$lastDropDate();
    }

    public final x0<OwnedMount> getMounts() {
        return realmGet$mounts();
    }

    public final x0<OwnedPet> getPets() {
        return realmGet$pets();
    }

    public final x0<OwnedItem> getQuests() {
        return realmGet$quests();
    }

    public final x0<OwnedItem> getSpecial() {
        return realmGet$special();
    }

    @Override // io.realm.t6
    public String realmGet$currentMount() {
        return this.currentMount;
    }

    @Override // io.realm.t6
    public String realmGet$currentPet() {
        return this.currentPet;
    }

    @Override // io.realm.t6
    public x0 realmGet$eggs() {
        return this.eggs;
    }

    @Override // io.realm.t6
    public x0 realmGet$food() {
        return this.food;
    }

    @Override // io.realm.t6
    public Gear realmGet$gear() {
        return this.gear;
    }

    @Override // io.realm.t6
    public x0 realmGet$hatchingPotions() {
        return this.hatchingPotions;
    }

    @Override // io.realm.t6
    public int realmGet$lastDropCount() {
        return this.lastDropCount;
    }

    @Override // io.realm.t6
    public Date realmGet$lastDropDate() {
        return this.lastDropDate;
    }

    @Override // io.realm.t6
    public x0 realmGet$mounts() {
        return this.mounts;
    }

    @Override // io.realm.t6
    public x0 realmGet$pets() {
        return this.pets;
    }

    @Override // io.realm.t6
    public x0 realmGet$quests() {
        return this.quests;
    }

    @Override // io.realm.t6
    public x0 realmGet$special() {
        return this.special;
    }

    @Override // io.realm.t6
    public void realmSet$currentMount(String str) {
        this.currentMount = str;
    }

    @Override // io.realm.t6
    public void realmSet$currentPet(String str) {
        this.currentPet = str;
    }

    @Override // io.realm.t6
    public void realmSet$eggs(x0 x0Var) {
        this.eggs = x0Var;
    }

    @Override // io.realm.t6
    public void realmSet$food(x0 x0Var) {
        this.food = x0Var;
    }

    @Override // io.realm.t6
    public void realmSet$gear(Gear gear) {
        this.gear = gear;
    }

    @Override // io.realm.t6
    public void realmSet$hatchingPotions(x0 x0Var) {
        this.hatchingPotions = x0Var;
    }

    @Override // io.realm.t6
    public void realmSet$lastDropCount(int i10) {
        this.lastDropCount = i10;
    }

    @Override // io.realm.t6
    public void realmSet$lastDropDate(Date date) {
        this.lastDropDate = date;
    }

    @Override // io.realm.t6
    public void realmSet$mounts(x0 x0Var) {
        this.mounts = x0Var;
    }

    @Override // io.realm.t6
    public void realmSet$pets(x0 x0Var) {
        this.pets = x0Var;
    }

    @Override // io.realm.t6
    public void realmSet$quests(x0 x0Var) {
        this.quests = x0Var;
    }

    @Override // io.realm.t6
    public void realmSet$special(x0 x0Var) {
        this.special = x0Var;
    }

    public void setCurrentMount(String str) {
        realmSet$currentMount(str);
    }

    public void setCurrentPet(String str) {
        realmSet$currentPet(str);
    }

    public final void setEggs(x0<OwnedItem> x0Var) {
        realmSet$eggs(x0Var);
        x0 realmGet$eggs = realmGet$eggs();
        if (realmGet$eggs != null) {
            Iterator<E> it = realmGet$eggs.iterator();
            while (it.hasNext()) {
                ((OwnedItem) it.next()).setItemType("eggs");
            }
        }
    }

    public final void setFood(x0<OwnedItem> x0Var) {
        realmSet$food(x0Var);
        x0 realmGet$food = realmGet$food();
        if (realmGet$food != null) {
            Iterator<E> it = realmGet$food.iterator();
            while (it.hasNext()) {
                ((OwnedItem) it.next()).setItemType("food");
            }
        }
    }

    public void setGear(Gear gear) {
        realmSet$gear(gear);
    }

    public final void setHatchingPotions(x0<OwnedItem> x0Var) {
        realmSet$hatchingPotions(x0Var);
        x0 realmGet$hatchingPotions = realmGet$hatchingPotions();
        if (realmGet$hatchingPotions != null) {
            Iterator<E> it = realmGet$hatchingPotions.iterator();
            while (it.hasNext()) {
                ((OwnedItem) it.next()).setItemType("hatchingPotions");
            }
        }
    }

    public final void setItemTypes() {
        x0 realmGet$hatchingPotions = realmGet$hatchingPotions();
        if (realmGet$hatchingPotions != null) {
            Iterator<E> it = realmGet$hatchingPotions.iterator();
            while (it.hasNext()) {
                ((OwnedItem) it.next()).setItemType("hatchingPotions");
            }
        }
        x0 realmGet$eggs = realmGet$eggs();
        if (realmGet$eggs != null) {
            Iterator<E> it2 = realmGet$eggs.iterator();
            while (it2.hasNext()) {
                ((OwnedItem) it2.next()).setItemType("eggs");
            }
        }
        x0 realmGet$food = realmGet$food();
        if (realmGet$food != null) {
            Iterator<E> it3 = realmGet$food.iterator();
            while (it3.hasNext()) {
                ((OwnedItem) it3.next()).setItemType("food");
            }
        }
        x0 realmGet$quests = realmGet$quests();
        if (realmGet$quests != null) {
            Iterator<E> it4 = realmGet$quests.iterator();
            while (it4.hasNext()) {
                ((OwnedItem) it4.next()).setItemType("quests");
            }
        }
        x0 realmGet$special = realmGet$special();
        if (realmGet$special != null) {
            Iterator<E> it5 = realmGet$special.iterator();
            while (it5.hasNext()) {
                ((OwnedItem) it5.next()).setItemType("special");
            }
        }
    }

    public final void setLastDropCount(int i10) {
        realmSet$lastDropCount(i10);
    }

    public final void setLastDropDate(Date date) {
        realmSet$lastDropDate(date);
    }

    public final void setMounts(x0<OwnedMount> x0Var) {
        realmSet$mounts(x0Var);
    }

    public final void setPets(x0<OwnedPet> x0Var) {
        realmSet$pets(x0Var);
    }

    public final void setQuests(x0<OwnedItem> x0Var) {
        realmSet$quests(x0Var);
        x0 realmGet$quests = realmGet$quests();
        if (realmGet$quests != null) {
            Iterator<E> it = realmGet$quests.iterator();
            while (it.hasNext()) {
                ((OwnedItem) it.next()).setItemType("quests");
            }
        }
    }

    public final void setSpecial(x0<OwnedItem> x0Var) {
        realmSet$special(x0Var);
        x0 realmGet$special = realmGet$special();
        if (realmGet$special != null) {
            Iterator<E> it = realmGet$special.iterator();
            while (it.hasNext()) {
                ((OwnedItem) it.next()).setItemType("special");
            }
        }
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarItems
    public Gear getGear() {
        return realmGet$gear();
    }

    public Items() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }
}
