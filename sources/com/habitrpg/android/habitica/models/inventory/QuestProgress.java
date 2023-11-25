package com.habitrpg.android.habitica.models.inventory;

import com.habitrpg.android.habitica.models.BaseObject;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.r3;
import io.realm.x0;

/* compiled from: QuestProgress.kt */
/* loaded from: classes4.dex */
public class QuestProgress extends d1 implements BaseObject, r3 {
    public static final int $stable = 8;
    private x0<QuestProgressCollect> collect;
    private int collectedItems;
    private float down;
    private double hp;

    /* renamed from: id  reason: collision with root package name */
    private String f12512id;
    private String key;
    private double rage;
    private float up;

    public QuestProgress() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final x0<QuestProgressCollect> getCollect() {
        return realmGet$collect();
    }

    public final int getCollectedItems() {
        return realmGet$collectedItems();
    }

    public final float getDown() {
        return realmGet$down();
    }

    public final double getHp() {
        return realmGet$hp();
    }

    public final String getId() {
        return realmGet$id();
    }

    public final String getKey() {
        return realmGet$key();
    }

    public final double getRage() {
        return realmGet$rage();
    }

    public final float getUp() {
        return realmGet$up();
    }

    @Override // io.realm.r3
    public x0 realmGet$collect() {
        return this.collect;
    }

    @Override // io.realm.r3
    public int realmGet$collectedItems() {
        return this.collectedItems;
    }

    @Override // io.realm.r3
    public float realmGet$down() {
        return this.down;
    }

    @Override // io.realm.r3
    public double realmGet$hp() {
        return this.hp;
    }

    @Override // io.realm.r3
    public String realmGet$id() {
        return this.f12512id;
    }

    @Override // io.realm.r3
    public String realmGet$key() {
        return this.key;
    }

    @Override // io.realm.r3
    public double realmGet$rage() {
        return this.rage;
    }

    @Override // io.realm.r3
    public float realmGet$up() {
        return this.up;
    }

    @Override // io.realm.r3
    public void realmSet$collect(x0 x0Var) {
        this.collect = x0Var;
    }

    @Override // io.realm.r3
    public void realmSet$collectedItems(int i10) {
        this.collectedItems = i10;
    }

    @Override // io.realm.r3
    public void realmSet$down(float f10) {
        this.down = f10;
    }

    @Override // io.realm.r3
    public void realmSet$hp(double d10) {
        this.hp = d10;
    }

    @Override // io.realm.r3
    public void realmSet$id(String str) {
        this.f12512id = str;
    }

    @Override // io.realm.r3
    public void realmSet$key(String str) {
        this.key = str;
    }

    @Override // io.realm.r3
    public void realmSet$rage(double d10) {
        this.rage = d10;
    }

    @Override // io.realm.r3
    public void realmSet$up(float f10) {
        this.up = f10;
    }

    public final void setCollect(x0<QuestProgressCollect> x0Var) {
        realmSet$collect(x0Var);
    }

    public final void setCollectedItems(int i10) {
        realmSet$collectedItems(i10);
    }

    public final void setDown(float f10) {
        realmSet$down(f10);
    }

    public final void setHp(double d10) {
        realmSet$hp(d10);
    }

    public final void setId(String str) {
        realmSet$id(str);
    }

    public final void setKey(String str) {
        realmSet$key(str);
    }

    public final void setRage(double d10) {
        realmSet$rage(d10);
    }

    public final void setUp(float f10) {
        realmSet$up(f10);
    }
}
