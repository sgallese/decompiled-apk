package com.habitrpg.android.habitica.models.inventory;

import com.habitrpg.android.habitica.models.BaseObject;
import io.realm.b3;
import io.realm.d1;
import io.realm.internal.o;

/* compiled from: QuestBoss.kt */
/* loaded from: classes4.dex */
public class QuestBoss extends d1 implements BaseObject, b3 {
    public static final int $stable = 8;
    private int hp;
    private String key;
    private String name;
    private QuestBossRage rage;
    private float str;

    public QuestBoss() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final boolean getHasRage() {
        double d10;
        QuestBossRage realmGet$rage = realmGet$rage();
        if (realmGet$rage != null) {
            d10 = realmGet$rage.getValue();
        } else {
            d10 = 0.0d;
        }
        if (d10 > 0.0d) {
            return true;
        }
        return false;
    }

    public final int getHp() {
        return realmGet$hp();
    }

    public final String getKey() {
        return realmGet$key();
    }

    public final String getName() {
        return realmGet$name();
    }

    public final QuestBossRage getRage() {
        return realmGet$rage();
    }

    public final float getStr() {
        return realmGet$str();
    }

    @Override // io.realm.b3
    public int realmGet$hp() {
        return this.hp;
    }

    @Override // io.realm.b3
    public String realmGet$key() {
        return this.key;
    }

    @Override // io.realm.b3
    public String realmGet$name() {
        return this.name;
    }

    @Override // io.realm.b3
    public QuestBossRage realmGet$rage() {
        return this.rage;
    }

    @Override // io.realm.b3
    public float realmGet$str() {
        return this.str;
    }

    @Override // io.realm.b3
    public void realmSet$hp(int i10) {
        this.hp = i10;
    }

    @Override // io.realm.b3
    public void realmSet$key(String str) {
        this.key = str;
    }

    @Override // io.realm.b3
    public void realmSet$name(String str) {
        this.name = str;
    }

    @Override // io.realm.b3
    public void realmSet$rage(QuestBossRage questBossRage) {
        this.rage = questBossRage;
    }

    @Override // io.realm.b3
    public void realmSet$str(float f10) {
        this.str = f10;
    }

    public final void setHp(int i10) {
        realmSet$hp(i10);
    }

    public final void setKey(String str) {
        realmSet$key(str);
        QuestBossRage realmGet$rage = realmGet$rage();
        if (realmGet$rage != null) {
            realmGet$rage.setKey(realmGet$key());
        }
    }

    public final void setName(String str) {
        realmSet$name(str);
    }

    public final void setRage(QuestBossRage questBossRage) {
        realmSet$rage(questBossRage);
    }

    public final void setStr(float f10) {
        realmSet$str(f10);
    }
}
