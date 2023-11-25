package com.habitrpg.android.habitica.models.inventory;

import com.habitrpg.android.habitica.models.BaseObject;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.z2;

/* compiled from: QuestBossRage.kt */
/* loaded from: classes4.dex */
public class QuestBossRage extends d1 implements BaseObject, z2 {
    public static final int $stable = 8;
    private String description;
    private String key;
    private String market;
    private String stables;
    private String title;
    private double value;

    public QuestBossRage() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final String getDescription() {
        return realmGet$description();
    }

    public final String getKey() {
        return realmGet$key();
    }

    public final String getMarket() {
        return realmGet$market();
    }

    public final String getStables() {
        return realmGet$stables();
    }

    public final String getTitle() {
        return realmGet$title();
    }

    public final double getValue() {
        return realmGet$value();
    }

    @Override // io.realm.z2
    public String realmGet$description() {
        return this.description;
    }

    @Override // io.realm.z2
    public String realmGet$key() {
        return this.key;
    }

    @Override // io.realm.z2
    public String realmGet$market() {
        return this.market;
    }

    @Override // io.realm.z2
    public String realmGet$stables() {
        return this.stables;
    }

    @Override // io.realm.z2
    public String realmGet$title() {
        return this.title;
    }

    @Override // io.realm.z2
    public double realmGet$value() {
        return this.value;
    }

    @Override // io.realm.z2
    public void realmSet$description(String str) {
        this.description = str;
    }

    @Override // io.realm.z2
    public void realmSet$key(String str) {
        this.key = str;
    }

    @Override // io.realm.z2
    public void realmSet$market(String str) {
        this.market = str;
    }

    @Override // io.realm.z2
    public void realmSet$stables(String str) {
        this.stables = str;
    }

    @Override // io.realm.z2
    public void realmSet$title(String str) {
        this.title = str;
    }

    @Override // io.realm.z2
    public void realmSet$value(double d10) {
        this.value = d10;
    }

    public final void setDescription(String str) {
        realmSet$description(str);
    }

    public final void setKey(String str) {
        realmSet$key(str);
    }

    public final void setMarket(String str) {
        realmSet$market(str);
    }

    public final void setStables(String str) {
        realmSet$stables(str);
    }

    public final void setTitle(String str) {
        realmSet$title(str);
    }

    public final void setValue(double d10) {
        realmSet$value(d10);
    }
}
