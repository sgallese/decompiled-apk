package com.habitrpg.android.habitica.models.shops;

import android.content.Context;
import com.habitrpg.android.habitica.R;
import java.util.ArrayList;
import java.util.List;
import qc.h;
import qc.q;

/* compiled from: Shop.kt */
/* loaded from: classes4.dex */
public final class Shop {
    public static final String MARKET = "market";
    public static final String QUEST_SHOP = "questShop";
    public static final String SEASONAL_SHOP = "seasonalShop";
    public static final String TIME_TRAVELERS_SHOP = "timeTravelersShop";
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private String identifier = "";
    private String text = "";
    private String notes = "";
    private String imageName = "";
    private List<ShopCategory> categories = new ArrayList();

    /* compiled from: Shop.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public final List<ShopCategory> getCategories() {
        return this.categories;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getImageName() {
        return this.imageName;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final String getNpcName(Context context) {
        q.i(context, "context");
        String string = context.getString(getNpcNameResource());
        q.h(string, "getString(...)");
        return string;
    }

    public final int getNpcNameResource() {
        String str = this.identifier;
        switch (str.hashCode()) {
            case -1782896904:
                if (!str.equals("questShop")) {
                    return R.string.market_owner;
                }
                return R.string.questShop_owner;
            case -1081306052:
                str.equals("market");
                return R.string.market_owner;
            case -825703836:
                if (!str.equals("seasonalShop")) {
                    return R.string.market_owner;
                }
                return R.string.seasonalShop_owner;
            case 523073365:
                if (!str.equals("timeTravelersShop")) {
                    return R.string.market_owner;
                }
                return R.string.timetravelers_owner;
            default:
                return R.string.market_owner;
        }
    }

    public final String getText() {
        return this.text;
    }

    public final void setCategories(List<ShopCategory> list) {
        q.i(list, "<set-?>");
        this.categories = list;
    }

    public final void setIdentifier(String str) {
        q.i(str, "<set-?>");
        this.identifier = str;
    }

    public final void setImageName(String str) {
        q.i(str, "<set-?>");
        this.imageName = str;
    }

    public final void setNotes(String str) {
        q.i(str, "<set-?>");
        this.notes = str;
    }

    public final void setText(String str) {
        q.i(str, "<set-?>");
        this.text = str;
    }
}
