package com.habitrpg.android.habitica.models.inventory;

import io.realm.d1;
import io.realm.internal.o;
import io.realm.r2;
import qc.q;

/* compiled from: HatchingPotion.kt */
/* loaded from: classes4.dex */
public class HatchingPotion extends d1 implements Item, r2 {
    public static final int $stable = 8;
    private ItemEvent event;
    private String key;
    private Boolean limited;
    private String notes;
    private Boolean premium;
    private String text;
    private int value;

    public HatchingPotion() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$key("");
        realmSet$text("");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Item
    public ItemEvent getEvent() {
        return realmGet$event();
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Item
    public String getKey() {
        return realmGet$key();
    }

    public final Boolean getLimited() {
        return realmGet$limited();
    }

    public final String getNotes() {
        return realmGet$notes();
    }

    public final Boolean getPremium() {
        return realmGet$premium();
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Item
    public String getText() {
        return realmGet$text();
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Item
    public String getType() {
        return "hatchingPotions";
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Item
    public int getValue() {
        return realmGet$value();
    }

    @Override // io.realm.r2
    public ItemEvent realmGet$event() {
        return this.event;
    }

    @Override // io.realm.r2
    public String realmGet$key() {
        return this.key;
    }

    @Override // io.realm.r2
    public Boolean realmGet$limited() {
        return this.limited;
    }

    @Override // io.realm.r2
    public String realmGet$notes() {
        return this.notes;
    }

    @Override // io.realm.r2
    public Boolean realmGet$premium() {
        return this.premium;
    }

    @Override // io.realm.r2
    public String realmGet$text() {
        return this.text;
    }

    @Override // io.realm.r2
    public int realmGet$value() {
        return this.value;
    }

    @Override // io.realm.r2
    public void realmSet$event(ItemEvent itemEvent) {
        this.event = itemEvent;
    }

    @Override // io.realm.r2
    public void realmSet$key(String str) {
        this.key = str;
    }

    @Override // io.realm.r2
    public void realmSet$limited(Boolean bool) {
        this.limited = bool;
    }

    @Override // io.realm.r2
    public void realmSet$notes(String str) {
        this.notes = str;
    }

    @Override // io.realm.r2
    public void realmSet$premium(Boolean bool) {
        this.premium = bool;
    }

    @Override // io.realm.r2
    public void realmSet$text(String str) {
        this.text = str;
    }

    @Override // io.realm.r2
    public void realmSet$value(int i10) {
        this.value = i10;
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Item
    public void setEvent(ItemEvent itemEvent) {
        realmSet$event(itemEvent);
    }

    public void setKey(String str) {
        q.i(str, "<set-?>");
        realmSet$key(str);
    }

    public final void setLimited(Boolean bool) {
        realmSet$limited(bool);
    }

    public final void setNotes(String str) {
        realmSet$notes(str);
    }

    public final void setPremium(Boolean bool) {
        realmSet$premium(bool);
    }

    public void setText(String str) {
        q.i(str, "<set-?>");
        realmSet$text(str);
    }

    public void setValue(int i10) {
        realmSet$value(i10);
    }
}
