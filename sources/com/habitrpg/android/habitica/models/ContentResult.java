package com.habitrpg.android.habitica.models;

import com.habitrpg.android.habitica.models.inventory.Customization;
import com.habitrpg.android.habitica.models.inventory.Egg;
import com.habitrpg.android.habitica.models.inventory.Equipment;
import com.habitrpg.android.habitica.models.inventory.Food;
import com.habitrpg.android.habitica.models.inventory.HatchingPotion;
import com.habitrpg.android.habitica.models.inventory.Mount;
import com.habitrpg.android.habitica.models.inventory.Pet;
import com.habitrpg.android.habitica.models.inventory.QuestContent;
import com.habitrpg.android.habitica.models.inventory.SpecialItem;
import io.realm.x0;
import qc.q;

/* compiled from: ContentResult.kt */
/* loaded from: classes4.dex */
public final class ContentResult {
    public static final int $stable = 8;
    private Equipment armoire;
    private ContentGear gear;
    private Equipment potion;
    private x0<QuestContent> quests = new x0<>();
    private x0<Egg> eggs = new x0<>();
    private x0<Food> food = new x0<>();
    private x0<HatchingPotion> hatchingPotions = new x0<>();
    private x0<Pet> pets = new x0<>();
    private x0<Mount> mounts = new x0<>();
    private x0<Skill> spells = new x0<>();
    private x0<Customization> appearances = new x0<>();
    private x0<Customization> backgrounds = new x0<>();
    private x0<FAQArticle> faq = new x0<>();
    private x0<SpecialItem> special = new x0<>();

    public final x0<Customization> getAppearances() {
        return this.appearances;
    }

    public final Equipment getArmoire() {
        return this.armoire;
    }

    public final x0<Customization> getBackgrounds() {
        return this.backgrounds;
    }

    public final x0<Egg> getEggs() {
        return this.eggs;
    }

    public final x0<FAQArticle> getFaq() {
        return this.faq;
    }

    public final x0<Food> getFood() {
        return this.food;
    }

    public final ContentGear getGear() {
        return this.gear;
    }

    public final x0<HatchingPotion> getHatchingPotions() {
        return this.hatchingPotions;
    }

    public final x0<Mount> getMounts() {
        return this.mounts;
    }

    public final x0<Pet> getPets() {
        return this.pets;
    }

    public final Equipment getPotion() {
        return this.potion;
    }

    public final x0<QuestContent> getQuests() {
        return this.quests;
    }

    public final x0<SpecialItem> getSpecial() {
        return this.special;
    }

    public final x0<Skill> getSpells() {
        return this.spells;
    }

    public final void setAppearances(x0<Customization> x0Var) {
        q.i(x0Var, "<set-?>");
        this.appearances = x0Var;
    }

    public final void setArmoire(Equipment equipment) {
        this.armoire = equipment;
    }

    public final void setBackgrounds(x0<Customization> x0Var) {
        q.i(x0Var, "<set-?>");
        this.backgrounds = x0Var;
    }

    public final void setEggs(x0<Egg> x0Var) {
        q.i(x0Var, "<set-?>");
        this.eggs = x0Var;
    }

    public final void setFaq(x0<FAQArticle> x0Var) {
        q.i(x0Var, "<set-?>");
        this.faq = x0Var;
    }

    public final void setFood(x0<Food> x0Var) {
        q.i(x0Var, "<set-?>");
        this.food = x0Var;
    }

    public final void setGear(ContentGear contentGear) {
        this.gear = contentGear;
    }

    public final void setHatchingPotions(x0<HatchingPotion> x0Var) {
        q.i(x0Var, "<set-?>");
        this.hatchingPotions = x0Var;
    }

    public final void setMounts(x0<Mount> x0Var) {
        q.i(x0Var, "<set-?>");
        this.mounts = x0Var;
    }

    public final void setPets(x0<Pet> x0Var) {
        q.i(x0Var, "<set-?>");
        this.pets = x0Var;
    }

    public final void setPotion(Equipment equipment) {
        this.potion = equipment;
    }

    public final void setQuests(x0<QuestContent> x0Var) {
        q.i(x0Var, "<set-?>");
        this.quests = x0Var;
    }

    public final void setSpecial(x0<SpecialItem> x0Var) {
        q.i(x0Var, "<set-?>");
        this.special = x0Var;
    }

    public final void setSpells(x0<Skill> x0Var) {
        q.i(x0Var, "<set-?>");
        this.spells = x0Var;
    }
}
