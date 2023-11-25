package com.habitrpg.common.habitica.models;

/* compiled from: PurchaseValidationRequest.kt */
/* loaded from: classes4.dex */
public final class PurchaseValidationRequest {
    private IAPGift gift;
    private String sku;
    private Transaction transaction;

    public final IAPGift getGift() {
        return this.gift;
    }

    public final String getSku() {
        return this.sku;
    }

    public final Transaction getTransaction() {
        return this.transaction;
    }

    public final void setGift(IAPGift iAPGift) {
        this.gift = iAPGift;
    }

    public final void setSku(String str) {
        this.sku = str;
    }

    public final void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
}
