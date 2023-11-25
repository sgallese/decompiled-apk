package com.habitrpg.android.habitica.models.inventory;

import io.realm.d1;
import io.realm.internal.o;
import io.realm.x2;
import java.util.List;
import qc.q;
import yc.v;
import yc.w;

/* compiled from: Pet.kt */
/* loaded from: classes4.dex */
public class Pet extends d1 implements Animal, x2 {
    public static final int $stable = 8;
    private String animal;
    private String color;
    private String key;
    private int numberOwned;
    private boolean premium;
    private String text;
    private int totalNumber;
    private String type;

    public Pet() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$key("");
        realmSet$animal("");
        realmSet$color("");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Animal
    public String getAnimal() {
        boolean u10;
        List x02;
        String realmGet$animal = realmGet$animal();
        u10 = v.u(realmGet$animal);
        if (u10) {
            x02 = w.x0(getKey(), new String[]{"-"}, false, 0, 6, null);
            return ((String[]) x02.toArray(new String[0]))[0];
        }
        return realmGet$animal;
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Animal
    public String getColor() {
        boolean u10;
        List x02;
        String realmGet$color = realmGet$color();
        u10 = v.u(realmGet$color);
        if (u10) {
            x02 = w.x0(getKey(), new String[]{"-"}, false, 0, 6, null);
            return ((String[]) x02.toArray(new String[0]))[1];
        }
        return realmGet$color;
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Animal
    public String getKey() {
        return realmGet$key();
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Animal
    public int getNumberOwned() {
        return this.numberOwned;
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Animal
    public boolean getPremium() {
        return realmGet$premium();
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Animal
    public String getText() {
        return realmGet$text();
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Animal
    public int getTotalNumber() {
        return this.totalNumber;
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Animal
    public String getType() {
        return realmGet$type();
    }

    @Override // io.realm.x2
    public String realmGet$animal() {
        return this.animal;
    }

    @Override // io.realm.x2
    public String realmGet$color() {
        return this.color;
    }

    @Override // io.realm.x2
    public String realmGet$key() {
        return this.key;
    }

    @Override // io.realm.x2
    public boolean realmGet$premium() {
        return this.premium;
    }

    @Override // io.realm.x2
    public String realmGet$text() {
        return this.text;
    }

    @Override // io.realm.x2
    public String realmGet$type() {
        return this.type;
    }

    @Override // io.realm.x2
    public void realmSet$animal(String str) {
        this.animal = str;
    }

    @Override // io.realm.x2
    public void realmSet$color(String str) {
        this.color = str;
    }

    @Override // io.realm.x2
    public void realmSet$key(String str) {
        this.key = str;
    }

    @Override // io.realm.x2
    public void realmSet$premium(boolean z10) {
        this.premium = z10;
    }

    @Override // io.realm.x2
    public void realmSet$text(String str) {
        this.text = str;
    }

    @Override // io.realm.x2
    public void realmSet$type(String str) {
        this.type = str;
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Animal
    public void setAnimal(String str) {
        q.i(str, "<set-?>");
        realmSet$animal(str);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Animal
    public void setColor(String str) {
        q.i(str, "<set-?>");
        realmSet$color(str);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Animal
    public void setKey(String str) {
        q.i(str, "<set-?>");
        realmSet$key(str);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Animal
    public void setNumberOwned(int i10) {
        this.numberOwned = i10;
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Animal
    public void setPremium(boolean z10) {
        realmSet$premium(z10);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Animal
    public void setText(String str) {
        realmSet$text(str);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Animal
    public void setTotalNumber(int i10) {
        this.totalNumber = i10;
    }

    @Override // com.habitrpg.android.habitica.models.inventory.Animal
    public void setType(String str) {
        realmSet$type(str);
    }
}
