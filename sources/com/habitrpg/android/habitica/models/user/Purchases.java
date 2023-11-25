package com.habitrpg.android.habitica.models.user;

import com.habitrpg.android.habitica.models.BaseObject;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.l7;
import io.realm.x0;

/* compiled from: Purchases.kt */
/* loaded from: classes4.dex */
public class Purchases extends d1 implements BaseObject, l7 {
    public static final int $stable = 8;
    public x0<OwnedCustomization> customizations;
    private SubscriptionPlan plan;
    private User user;

    public Purchases() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final SubscriptionPlan getPlan() {
        return realmGet$plan();
    }

    public final User getUser() {
        return realmGet$user();
    }

    @Override // io.realm.l7
    public x0 realmGet$customizations() {
        return this.customizations;
    }

    @Override // io.realm.l7
    public SubscriptionPlan realmGet$plan() {
        return this.plan;
    }

    @Override // io.realm.l7
    public User realmGet$user() {
        return this.user;
    }

    @Override // io.realm.l7
    public void realmSet$customizations(x0 x0Var) {
        this.customizations = x0Var;
    }

    @Override // io.realm.l7
    public void realmSet$plan(SubscriptionPlan subscriptionPlan) {
        this.plan = subscriptionPlan;
    }

    @Override // io.realm.l7
    public void realmSet$user(User user) {
        this.user = user;
    }

    public final void setPlan(SubscriptionPlan subscriptionPlan) {
        realmSet$plan(subscriptionPlan);
    }

    public final void setUser(User user) {
        realmSet$user(user);
    }
}
