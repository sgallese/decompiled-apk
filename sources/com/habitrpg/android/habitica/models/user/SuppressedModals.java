package com.habitrpg.android.habitica.models.user;

import com.habitrpg.android.habitica.models.BaseObject;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.v7;

/* compiled from: SuppressedModals.kt */
/* loaded from: classes4.dex */
public class SuppressedModals extends d1 implements BaseObject, v7 {
    public static final int $stable = 8;
    private Boolean hatchPet;
    private Boolean levelUp;
    private Boolean raisePet;
    private Boolean streak;

    public SuppressedModals() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final Boolean getHatchPet() {
        return realmGet$hatchPet();
    }

    public final Boolean getLevelUp() {
        return realmGet$levelUp();
    }

    public final Boolean getRaisePet() {
        return realmGet$raisePet();
    }

    public final Boolean getStreak() {
        return realmGet$streak();
    }

    @Override // io.realm.v7
    public Boolean realmGet$hatchPet() {
        return this.hatchPet;
    }

    @Override // io.realm.v7
    public Boolean realmGet$levelUp() {
        return this.levelUp;
    }

    @Override // io.realm.v7
    public Boolean realmGet$raisePet() {
        return this.raisePet;
    }

    @Override // io.realm.v7
    public Boolean realmGet$streak() {
        return this.streak;
    }

    @Override // io.realm.v7
    public void realmSet$hatchPet(Boolean bool) {
        this.hatchPet = bool;
    }

    @Override // io.realm.v7
    public void realmSet$levelUp(Boolean bool) {
        this.levelUp = bool;
    }

    @Override // io.realm.v7
    public void realmSet$raisePet(Boolean bool) {
        this.raisePet = bool;
    }

    @Override // io.realm.v7
    public void realmSet$streak(Boolean bool) {
        this.streak = bool;
    }

    public final void setHatchPet(Boolean bool) {
        realmSet$hatchPet(bool);
    }

    public final void setLevelUp(Boolean bool) {
        realmSet$levelUp(bool);
    }

    public final void setRaisePet(Boolean bool) {
        realmSet$raisePet(bool);
    }

    public final void setStreak(Boolean bool) {
        realmSet$streak(bool);
    }
}
