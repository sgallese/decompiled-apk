package com.habitrpg.android.habitica.models.user;

import io.realm.d1;
import io.realm.internal.o;
import io.realm.n6;

/* compiled from: GoogleSubscriptionData.kt */
/* loaded from: classes4.dex */
public class GoogleSubscriptionData extends d1 implements n6 {
    public static final int $stable = 8;
    private String orderId;
    private String productId;

    public GoogleSubscriptionData() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final String getOrderId() {
        return realmGet$orderId();
    }

    public final String getProductId() {
        return realmGet$productId();
    }

    @Override // io.realm.n6
    public String realmGet$orderId() {
        return this.orderId;
    }

    @Override // io.realm.n6
    public String realmGet$productId() {
        return this.productId;
    }

    @Override // io.realm.n6
    public void realmSet$orderId(String str) {
        this.orderId = str;
    }

    @Override // io.realm.n6
    public void realmSet$productId(String str) {
        this.productId = str;
    }

    public final void setOrderId(String str) {
        realmSet$orderId(str);
    }

    public final void setProductId(String str) {
        realmSet$productId(str);
    }
}
