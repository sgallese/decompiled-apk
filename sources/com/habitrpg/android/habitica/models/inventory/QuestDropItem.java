package com.habitrpg.android.habitica.models.inventory;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.models.BaseObject;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.j3;
import qc.q;

/* compiled from: QuestDropItem.kt */
/* loaded from: classes4.dex */
public class QuestDropItem extends d1 implements BaseObject, j3 {
    public static final int $stable = 8;
    private String combinedKey;
    private int count;
    private String key;
    private boolean onlyOwner;
    private String questKey;
    private String text;
    private String type;

    public QuestDropItem() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$key("");
    }

    public final String getCombinedKey() {
        return realmGet$combinedKey();
    }

    public final int getCount() {
        return realmGet$count();
    }

    public final String getImageName() {
        String realmGet$type = realmGet$type();
        if (realmGet$type != null) {
            switch (realmGet$type.hashCode()) {
                case -1623737538:
                    if (realmGet$type.equals("hatchingPotions")) {
                        return "Pet_HatchingPotion_" + realmGet$key();
                    }
                    break;
                case -948698159:
                    if (realmGet$type.equals("quests")) {
                        return "inventory_quest_scroll_" + realmGet$key();
                    }
                    break;
                case 3111182:
                    if (realmGet$type.equals("eggs")) {
                        return "Pet_Egg_" + realmGet$key();
                    }
                    break;
                case 3148894:
                    if (realmGet$type.equals("food")) {
                        return "Pet_Food_" + realmGet$key();
                    }
                    break;
            }
        }
        return "shop_" + realmGet$key();
    }

    public final String getKey() {
        return realmGet$key();
    }

    public final boolean getOnlyOwner() {
        return realmGet$onlyOwner();
    }

    public final String getQuestKey() {
        return realmGet$questKey();
    }

    public final String getText() {
        return realmGet$text();
    }

    public final String getType() {
        return realmGet$type();
    }

    @Override // io.realm.j3
    public String realmGet$combinedKey() {
        return this.combinedKey;
    }

    @Override // io.realm.j3
    public int realmGet$count() {
        return this.count;
    }

    @Override // io.realm.j3
    public String realmGet$key() {
        return this.key;
    }

    @Override // io.realm.j3
    public boolean realmGet$onlyOwner() {
        return this.onlyOwner;
    }

    @Override // io.realm.j3
    public String realmGet$questKey() {
        return this.questKey;
    }

    @Override // io.realm.j3
    public String realmGet$text() {
        return this.text;
    }

    @Override // io.realm.j3
    public String realmGet$type() {
        return this.type;
    }

    @Override // io.realm.j3
    public void realmSet$combinedKey(String str) {
        this.combinedKey = str;
    }

    @Override // io.realm.j3
    public void realmSet$count(int i10) {
        this.count = i10;
    }

    @Override // io.realm.j3
    public void realmSet$key(String str) {
        this.key = str;
    }

    @Override // io.realm.j3
    public void realmSet$onlyOwner(boolean z10) {
        this.onlyOwner = z10;
    }

    @Override // io.realm.j3
    public void realmSet$questKey(String str) {
        this.questKey = str;
    }

    @Override // io.realm.j3
    public void realmSet$text(String str) {
        this.text = str;
    }

    @Override // io.realm.j3
    public void realmSet$type(String str) {
        this.type = str;
    }

    public final void setCombinedKey(String str) {
        realmSet$combinedKey(str);
    }

    public final void setCount(int i10) {
        realmSet$count(i10);
    }

    public final void setKey(String str) {
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        realmSet$key(str);
        realmSet$combinedKey(realmGet$questKey() + str);
    }

    public final void setOnlyOwner(boolean z10) {
        realmSet$onlyOwner(z10);
    }

    public final void setQuestKey(String str) {
        realmSet$questKey(str);
        realmSet$combinedKey(str + realmGet$key());
    }

    public final void setText(String str) {
        realmSet$text(str);
    }

    public final void setType(String str) {
        realmSet$type(str);
    }
}
