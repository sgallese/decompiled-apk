package com.habitrpg.android.habitica.models.inventory;

import com.habitrpg.android.habitica.models.BaseObject;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.l3;
import io.realm.x0;
import java.util.Iterator;

/* compiled from: QuestDrops.kt */
/* loaded from: classes4.dex */
public class QuestDrops extends d1 implements BaseObject, l3 {
    public static final int $stable = 8;
    private int exp;
    private int gp;
    private x0<QuestDropItem> items;
    private String key;
    private String unlock;

    public QuestDrops() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final int getExp() {
        return realmGet$exp();
    }

    public final int getGp() {
        return realmGet$gp();
    }

    public final x0<QuestDropItem> getItems() {
        return realmGet$items();
    }

    public final String getKey() {
        return realmGet$key();
    }

    public final String getUnlock() {
        return realmGet$unlock();
    }

    @Override // io.realm.l3
    public int realmGet$exp() {
        return this.exp;
    }

    @Override // io.realm.l3
    public int realmGet$gp() {
        return this.gp;
    }

    @Override // io.realm.l3
    public x0 realmGet$items() {
        return this.items;
    }

    @Override // io.realm.l3
    public String realmGet$key() {
        return this.key;
    }

    @Override // io.realm.l3
    public String realmGet$unlock() {
        return this.unlock;
    }

    @Override // io.realm.l3
    public void realmSet$exp(int i10) {
        this.exp = i10;
    }

    @Override // io.realm.l3
    public void realmSet$gp(int i10) {
        this.gp = i10;
    }

    @Override // io.realm.l3
    public void realmSet$items(x0 x0Var) {
        this.items = x0Var;
    }

    @Override // io.realm.l3
    public void realmSet$key(String str) {
        this.key = str;
    }

    @Override // io.realm.l3
    public void realmSet$unlock(String str) {
        this.unlock = str;
    }

    public final void setExp(int i10) {
        realmSet$exp(i10);
    }

    public final void setGp(int i10) {
        realmSet$gp(i10);
    }

    public final void setItems(x0<QuestDropItem> x0Var) {
        realmSet$items(x0Var);
        x0 realmGet$items = realmGet$items();
        if (realmGet$items != null) {
            Iterator<E> it = realmGet$items.iterator();
            while (it.hasNext()) {
                ((QuestDropItem) it.next()).setQuestKey(realmGet$key());
            }
        }
    }

    public final void setKey(String str) {
        realmSet$key(str);
        x0 realmGet$items = realmGet$items();
        if (realmGet$items != null) {
            Iterator<E> it = realmGet$items.iterator();
            while (it.hasNext()) {
                ((QuestDropItem) it.next()).setQuestKey(realmGet$key());
            }
        }
    }

    public final void setUnlock(String str) {
        realmSet$unlock(str);
    }
}
