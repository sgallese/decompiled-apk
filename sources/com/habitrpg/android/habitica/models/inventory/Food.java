package com.habitrpg.android.habitica.models.inventory;

import io.realm.d1;
import io.realm.internal.o;
import io.realm.p2;
import qc.q;

/* compiled from: Food.kt */
/* loaded from: classes4.dex */
public class Food extends d1 implements Item, p2 {
    public static final int $stable = 8;
    private String article;
    private Boolean canDrop;
    private ItemEvent event;
    private String key;
    private String notes;
    private String target;
    private String text;
    private int value;

    public Food() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$key("");
        realmSet$text("");
    }

    public final String getArticle() {
        return realmGet$article();
    }

    public final Boolean getCanDrop() {
        return realmGet$canDrop();
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Item
    public ItemEvent getEvent() {
        return realmGet$event();
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Item
    public String getKey() {
        return realmGet$key();
    }

    public final String getNotes() {
        return realmGet$notes();
    }

    public final String getTarget() {
        return realmGet$target();
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Item
    public String getText() {
        return realmGet$text();
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Item
    public String getType() {
        return "food";
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Item
    public int getValue() {
        return realmGet$value();
    }

    @Override // io.realm.p2
    public String realmGet$article() {
        return this.article;
    }

    @Override // io.realm.p2
    public Boolean realmGet$canDrop() {
        return this.canDrop;
    }

    @Override // io.realm.p2
    public ItemEvent realmGet$event() {
        return this.event;
    }

    @Override // io.realm.p2
    public String realmGet$key() {
        return this.key;
    }

    @Override // io.realm.p2
    public String realmGet$notes() {
        return this.notes;
    }

    @Override // io.realm.p2
    public String realmGet$target() {
        return this.target;
    }

    @Override // io.realm.p2
    public String realmGet$text() {
        return this.text;
    }

    @Override // io.realm.p2
    public int realmGet$value() {
        return this.value;
    }

    @Override // io.realm.p2
    public void realmSet$article(String str) {
        this.article = str;
    }

    @Override // io.realm.p2
    public void realmSet$canDrop(Boolean bool) {
        this.canDrop = bool;
    }

    @Override // io.realm.p2
    public void realmSet$event(ItemEvent itemEvent) {
        this.event = itemEvent;
    }

    @Override // io.realm.p2
    public void realmSet$key(String str) {
        this.key = str;
    }

    @Override // io.realm.p2
    public void realmSet$notes(String str) {
        this.notes = str;
    }

    @Override // io.realm.p2
    public void realmSet$target(String str) {
        this.target = str;
    }

    @Override // io.realm.p2
    public void realmSet$text(String str) {
        this.text = str;
    }

    @Override // io.realm.p2
    public void realmSet$value(int i10) {
        this.value = i10;
    }

    public final void setArticle(String str) {
        realmSet$article(str);
    }

    public final void setCanDrop(Boolean bool) {
        realmSet$canDrop(bool);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Item
    public void setEvent(ItemEvent itemEvent) {
        realmSet$event(itemEvent);
    }

    public void setKey(String str) {
        q.i(str, "<set-?>");
        realmSet$key(str);
    }

    public final void setNotes(String str) {
        realmSet$notes(str);
    }

    public final void setTarget(String str) {
        realmSet$target(str);
    }

    public void setText(String str) {
        q.i(str, "<set-?>");
        realmSet$text(str);
    }

    public void setValue(int i10) {
        realmSet$value(i10);
    }
}
