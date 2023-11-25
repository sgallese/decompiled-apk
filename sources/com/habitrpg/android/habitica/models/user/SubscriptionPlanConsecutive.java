package com.habitrpg.android.habitica.models.user;

import com.habitrpg.android.habitica.models.BaseObject;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.r7;

/* compiled from: SubscriptionPlanConsecutive.kt */
/* loaded from: classes4.dex */
public class SubscriptionPlanConsecutive extends d1 implements BaseObject, r7 {
    public static final int $stable = 8;
    private int count;
    private int gemCapExtra;
    private int offset;
    private int trinkets;

    public SubscriptionPlanConsecutive() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final int getCount() {
        return realmGet$count();
    }

    public final int getGemCapExtra() {
        return realmGet$gemCapExtra();
    }

    public final int getOffset() {
        return realmGet$offset();
    }

    public final int getTrinkets() {
        return realmGet$trinkets();
    }

    @Override // io.realm.r7
    public int realmGet$count() {
        return this.count;
    }

    @Override // io.realm.r7
    public int realmGet$gemCapExtra() {
        return this.gemCapExtra;
    }

    @Override // io.realm.r7
    public int realmGet$offset() {
        return this.offset;
    }

    @Override // io.realm.r7
    public int realmGet$trinkets() {
        return this.trinkets;
    }

    @Override // io.realm.r7
    public void realmSet$count(int i10) {
        this.count = i10;
    }

    @Override // io.realm.r7
    public void realmSet$gemCapExtra(int i10) {
        this.gemCapExtra = i10;
    }

    @Override // io.realm.r7
    public void realmSet$offset(int i10) {
        this.offset = i10;
    }

    @Override // io.realm.r7
    public void realmSet$trinkets(int i10) {
        this.trinkets = i10;
    }

    public final void setCount(int i10) {
        realmSet$count(i10);
    }

    public final void setGemCapExtra(int i10) {
        realmSet$gemCapExtra(i10);
    }

    public final void setOffset(int i10) {
        realmSet$offset(i10);
    }

    public final void setTrinkets(int i10) {
        realmSet$trinkets(i10);
    }
}
