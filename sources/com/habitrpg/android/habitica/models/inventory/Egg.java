package com.habitrpg.android.habitica.models.inventory;

import io.realm.d1;
import io.realm.internal.o;
import io.realm.l2;
import qc.q;

/* compiled from: Egg.kt */
/* loaded from: classes4.dex */
public class Egg extends d1 implements Item, l2 {
    public static final int $stable = 8;
    private String adjective;
    private ItemEvent event;
    private String key;
    private String mountText;
    private String notes;
    private String text;
    private int value;

    public Egg() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$key("");
        realmSet$text("");
    }

    public final String getAdjective() {
        return realmGet$adjective();
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Item
    public ItemEvent getEvent() {
        return realmGet$event();
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Item
    public String getKey() {
        return realmGet$key();
    }

    public final String getMountText() {
        return realmGet$mountText();
    }

    public final String getNotes() {
        return realmGet$notes();
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Item
    public String getText() {
        return realmGet$text();
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Item
    public String getType() {
        return "eggs";
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Item
    public int getValue() {
        return realmGet$value();
    }

    @Override // io.realm.l2
    public String realmGet$adjective() {
        return this.adjective;
    }

    @Override // io.realm.l2
    public ItemEvent realmGet$event() {
        return this.event;
    }

    @Override // io.realm.l2
    public String realmGet$key() {
        return this.key;
    }

    @Override // io.realm.l2
    public String realmGet$mountText() {
        return this.mountText;
    }

    @Override // io.realm.l2
    public String realmGet$notes() {
        return this.notes;
    }

    @Override // io.realm.l2
    public String realmGet$text() {
        return this.text;
    }

    @Override // io.realm.l2
    public int realmGet$value() {
        return this.value;
    }

    @Override // io.realm.l2
    public void realmSet$adjective(String str) {
        this.adjective = str;
    }

    @Override // io.realm.l2
    public void realmSet$event(ItemEvent itemEvent) {
        this.event = itemEvent;
    }

    @Override // io.realm.l2
    public void realmSet$key(String str) {
        this.key = str;
    }

    @Override // io.realm.l2
    public void realmSet$mountText(String str) {
        this.mountText = str;
    }

    @Override // io.realm.l2
    public void realmSet$notes(String str) {
        this.notes = str;
    }

    @Override // io.realm.l2
    public void realmSet$text(String str) {
        this.text = str;
    }

    @Override // io.realm.l2
    public void realmSet$value(int i10) {
        this.value = i10;
    }

    public final void setAdjective(String str) {
        realmSet$adjective(str);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Item
    public void setEvent(ItemEvent itemEvent) {
        realmSet$event(itemEvent);
    }

    public void setKey(String str) {
        q.i(str, "<set-?>");
        realmSet$key(str);
    }

    public final void setMountText(String str) {
        realmSet$mountText(str);
    }

    public final void setNotes(String str) {
        realmSet$notes(str);
    }

    public void setText(String str) {
        q.i(str, "<set-?>");
        realmSet$text(str);
    }

    public void setValue(int i10) {
        realmSet$value(i10);
    }
}
