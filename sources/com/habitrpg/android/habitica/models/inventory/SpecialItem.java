package com.habitrpg.android.habitica.models.inventory;

import android.content.Context;
import com.habitrpg.android.habitica.R;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.x3;
import qc.h;
import qc.q;

/* compiled from: SpecialItem.kt */
/* loaded from: classes4.dex */
public class SpecialItem extends d1 implements Item, x3 {
    private ItemEvent event;
    private boolean isMysteryItem;
    private String key;
    private String notes;
    private String target;
    private String text;
    private int value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SpecialItem.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final SpecialItem makeMysteryItem(Context context) {
            q.i(context, "context");
            SpecialItem specialItem = new SpecialItem();
            String string = context.getString(R.string.mystery_item);
            q.h(string, "getString(...)");
            specialItem.setText(string);
            String string2 = context.getString(R.string.myster_item_notes);
            q.h(string2, "getString(...)");
            specialItem.setNotes$Habitica_2311256681_prodRelease(string2);
            specialItem.setKey("inventory_present");
            specialItem.setMysteryItem(true);
            return specialItem;
        }
    }

    public SpecialItem() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$key("");
        realmSet$text("");
        realmSet$notes("");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Item
    public ItemEvent getEvent() {
        return realmGet$event();
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Item
    public String getKey() {
        return realmGet$key();
    }

    public final String getNotes$Habitica_2311256681_prodRelease() {
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
        return "special";
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Item
    public int getValue() {
        return realmGet$value();
    }

    public final boolean isMysteryItem() {
        return realmGet$isMysteryItem();
    }

    @Override // io.realm.x3
    public ItemEvent realmGet$event() {
        return this.event;
    }

    @Override // io.realm.x3
    public boolean realmGet$isMysteryItem() {
        return this.isMysteryItem;
    }

    @Override // io.realm.x3
    public String realmGet$key() {
        return this.key;
    }

    @Override // io.realm.x3
    public String realmGet$notes() {
        return this.notes;
    }

    @Override // io.realm.x3
    public String realmGet$target() {
        return this.target;
    }

    @Override // io.realm.x3
    public String realmGet$text() {
        return this.text;
    }

    @Override // io.realm.x3
    public int realmGet$value() {
        return this.value;
    }

    @Override // io.realm.x3
    public void realmSet$event(ItemEvent itemEvent) {
        this.event = itemEvent;
    }

    @Override // io.realm.x3
    public void realmSet$isMysteryItem(boolean z10) {
        this.isMysteryItem = z10;
    }

    @Override // io.realm.x3
    public void realmSet$key(String str) {
        this.key = str;
    }

    @Override // io.realm.x3
    public void realmSet$notes(String str) {
        this.notes = str;
    }

    @Override // io.realm.x3
    public void realmSet$target(String str) {
        this.target = str;
    }

    @Override // io.realm.x3
    public void realmSet$text(String str) {
        this.text = str;
    }

    @Override // io.realm.x3
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

    public final void setMysteryItem(boolean z10) {
        realmSet$isMysteryItem(z10);
    }

    public final void setNotes$Habitica_2311256681_prodRelease(String str) {
        q.i(str, "<set-?>");
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
