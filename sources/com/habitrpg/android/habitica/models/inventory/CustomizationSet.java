package com.habitrpg.android.habitica.models.inventory;

import java.util.ArrayList;
import java.util.List;
import qc.q;

/* compiled from: CustomizationSet.kt */
/* loaded from: classes4.dex */
public final class CustomizationSet {
    public static final int $stable = 8;
    private boolean hasPurchasable;
    private String identifier;
    private int price;
    private String text;
    private List<Customization> customizations = new ArrayList();
    private List<Customization> ownedCustomizations = new ArrayList();

    public final List<Customization> getCustomizations() {
        return this.customizations;
    }

    public final boolean getHasPurchasable() {
        return this.hasPurchasable;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final List<Customization> getOwnedCustomizations() {
        return this.ownedCustomizations;
    }

    public final int getPrice() {
        return this.price;
    }

    public final String getText() {
        return this.text;
    }

    public final boolean isSetDeal() {
        Integer price;
        int i10 = 0;
        for (Customization customization : this.customizations) {
            if (!this.ownedCustomizations.contains(customization) && (price = customization.getPrice()) != null) {
                i10 += price.intValue();
            }
        }
        if (i10 < this.price) {
            return false;
        }
        return true;
    }

    public final void setCustomizations(List<Customization> list) {
        q.i(list, "<set-?>");
        this.customizations = list;
    }

    public final void setHasPurchasable(boolean z10) {
        this.hasPurchasable = z10;
    }

    public final void setIdentifier(String str) {
        this.identifier = str;
    }

    public final void setOwnedCustomizations(List<Customization> list) {
        q.i(list, "<set-?>");
        this.ownedCustomizations = list;
    }

    public final void setPrice(int i10) {
        this.price = i10;
    }

    public final void setText(String str) {
        this.text = str;
    }
}
