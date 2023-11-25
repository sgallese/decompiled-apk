package com.habitrpg.android.habitica.models.shops;

import java.util.ArrayList;
import java.util.List;
import qc.q;

/* compiled from: ShopCategory.kt */
/* loaded from: classes4.dex */
public final class ShopCategory {
    public static final int $stable = 8;
    private Boolean purchaseAll;
    private String identifier = "";
    private String text = "";
    private String notes = "";
    private String path = "";
    private String pinType = "";
    private List<ShopItem> items = new ArrayList();

    public final String getIdentifier() {
        return this.identifier;
    }

    public final List<ShopItem> getItems() {
        return this.items;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getPinType() {
        return this.pinType;
    }

    public final Boolean getPurchaseAll() {
        return this.purchaseAll;
    }

    public final String getText() {
        return this.text;
    }

    public final void setIdentifier(String str) {
        q.i(str, "<set-?>");
        this.identifier = str;
    }

    public final void setItems(List<ShopItem> list) {
        q.i(list, "<set-?>");
        this.items = list;
    }

    public final void setNotes(String str) {
        q.i(str, "<set-?>");
        this.notes = str;
    }

    public final void setPath(String str) {
        q.i(str, "<set-?>");
        this.path = str;
    }

    public final void setPinType(String str) {
        q.i(str, "<set-?>");
        this.pinType = str;
    }

    public final void setPurchaseAll(Boolean bool) {
        this.purchaseAll = bool;
    }

    public final void setText(String str) {
        q.i(str, "<set-?>");
        this.text = str;
    }
}
