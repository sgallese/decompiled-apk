package com.habitrpg.android.habitica.models.inventory;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.habitrpg.android.habitica.models.BaseObject;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.j2;
import java.util.Date;
import qc.q;
import yc.v;

/* compiled from: Customization.kt */
/* loaded from: classes4.dex */
public class Customization extends d1 implements BaseObject, j2 {
    public static final int $stable = 8;
    private Date availableFrom;
    private Date availableUntil;
    private String category;
    private String customizationSet;
    private String customizationSetName;

    /* renamed from: id  reason: collision with root package name */
    private String f12510id;
    private String identifier;
    private boolean isBuyable;
    private String notes;
    private Integer price;
    private Integer setPrice;
    private String text;
    private String type;

    public Customization() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    private final void updateID() {
        realmSet$id(realmGet$identifier() + "_" + realmGet$type() + "_" + realmGet$category());
    }

    public final Date getAvailableFrom() {
        return realmGet$availableFrom();
    }

    public final Date getAvailableUntil() {
        return realmGet$availableUntil();
    }

    public final String getCategory() {
        return realmGet$category();
    }

    public final String getCustomizationSet() {
        return realmGet$customizationSet();
    }

    public final String getCustomizationSetName() {
        return realmGet$customizationSetName();
    }

    public final String getIconName(String str, String str2) {
        String imageName = getImageName(str, str2);
        if (imageName == null) {
            return null;
        }
        return "icon_" + imageName;
    }

    public final String getId() {
        return realmGet$id();
    }

    public final String getIdentifier() {
        return realmGet$identifier();
    }

    public final String getImageName(String str, String str2) {
        String realmGet$type;
        boolean u10;
        String realmGet$identifier = realmGet$identifier();
        boolean z10 = false;
        if (realmGet$identifier != null) {
            u10 = v.u(realmGet$identifier);
            if ((!u10) == true) {
                z10 = true;
            }
        }
        if (!z10 || q.d(realmGet$identifier(), DevicePublicKeyStringDef.NONE) || q.d(realmGet$identifier(), "0") || (realmGet$type = realmGet$type()) == null) {
            return null;
        }
        switch (realmGet$type.hashCode()) {
            case -1332194002:
                if (!realmGet$type.equals("background")) {
                    return null;
                }
                return "background_" + realmGet$identifier();
            case 3194850:
                if (!realmGet$type.equals("hair")) {
                    return null;
                }
                String realmGet$category = realmGet$category();
                if (q.d(realmGet$category, "color")) {
                    return "hair_bangs_1_" + realmGet$identifier();
                } else if (q.d(realmGet$category, "flower")) {
                    return "hair_flower_" + realmGet$identifier();
                } else {
                    return "hair_" + realmGet$category() + "_" + realmGet$identifier() + "_" + str2;
                }
            case 3532157:
                if (!realmGet$type.equals("skin")) {
                    return null;
                }
                return "skin_" + realmGet$identifier();
            case 94623429:
                if (!realmGet$type.equals("chair")) {
                    return null;
                }
                return "chair_" + realmGet$identifier();
            case 109407734:
                if (!realmGet$type.equals("shirt")) {
                    return null;
                }
                return str + "_shirt_" + realmGet$identifier();
            default:
                return null;
        }
    }

    public final String getNotes() {
        return realmGet$notes();
    }

    public final String getPath() {
        String realmGet$type;
        String str;
        if (q.d(realmGet$type(), "background")) {
            realmGet$type = "backgrounds.backgrounds";
        } else {
            realmGet$type = realmGet$type();
        }
        if (realmGet$customizationSet() != null) {
            if (q.d(realmGet$type(), "background")) {
                String realmGet$customizationSet = realmGet$customizationSet();
                String str2 = null;
                if (realmGet$customizationSet != null) {
                    str = realmGet$customizationSet.substring(5, 7);
                    q.h(str, "this as java.lang.String…ing(startIndex, endIndex)");
                } else {
                    str = null;
                }
                String realmGet$customizationSet2 = realmGet$customizationSet();
                if (realmGet$customizationSet2 != null) {
                    str2 = realmGet$customizationSet2.substring(0, 4);
                    q.h(str2, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                realmGet$type = realmGet$type + str + str2;
            } else {
                realmGet$type = realmGet$type + "." + realmGet$customizationSet();
            }
        } else if (realmGet$category() != null) {
            realmGet$type = realmGet$type + "." + realmGet$category();
        }
        return realmGet$type + "." + realmGet$identifier();
    }

    public final Integer getPrice() {
        return realmGet$price();
    }

    public final boolean getPurchasable() {
        Date date = new Date();
        if (realmGet$availableFrom() != null) {
            Date realmGet$availableFrom = realmGet$availableFrom();
            q.f(realmGet$availableFrom);
            if (!realmGet$availableFrom.before(date)) {
                return false;
            }
        }
        if (realmGet$availableUntil() != null) {
            Date realmGet$availableUntil = realmGet$availableUntil();
            q.f(realmGet$availableUntil);
            if (!realmGet$availableUntil.after(date)) {
                return false;
            }
        }
        return true;
    }

    public final Integer getSetPrice() {
        return realmGet$setPrice();
    }

    public final String getText() {
        return realmGet$text();
    }

    public final String getType() {
        return realmGet$type();
    }

    public final String getUnlockPath() {
        String realmGet$type = realmGet$type();
        if (realmGet$category() != null) {
            realmGet$type = realmGet$type + "." + realmGet$category();
        }
        return realmGet$type + "." + realmGet$identifier();
    }

    public final boolean isBuyable() {
        return realmGet$isBuyable();
    }

    public final boolean isUsable(boolean z10) {
        Integer realmGet$price;
        if (realmGet$price() != null && (((realmGet$price = realmGet$price()) == null || realmGet$price.intValue() != 0) && !z10)) {
            return false;
        }
        return true;
    }

    @Override // io.realm.j2
    public Date realmGet$availableFrom() {
        return this.availableFrom;
    }

    @Override // io.realm.j2
    public Date realmGet$availableUntil() {
        return this.availableUntil;
    }

    @Override // io.realm.j2
    public String realmGet$category() {
        return this.category;
    }

    @Override // io.realm.j2
    public String realmGet$customizationSet() {
        return this.customizationSet;
    }

    @Override // io.realm.j2
    public String realmGet$customizationSetName() {
        return this.customizationSetName;
    }

    @Override // io.realm.j2
    public String realmGet$id() {
        return this.f12510id;
    }

    @Override // io.realm.j2
    public String realmGet$identifier() {
        return this.identifier;
    }

    @Override // io.realm.j2
    public boolean realmGet$isBuyable() {
        return this.isBuyable;
    }

    @Override // io.realm.j2
    public String realmGet$notes() {
        return this.notes;
    }

    @Override // io.realm.j2
    public Integer realmGet$price() {
        return this.price;
    }

    @Override // io.realm.j2
    public Integer realmGet$setPrice() {
        return this.setPrice;
    }

    @Override // io.realm.j2
    public String realmGet$text() {
        return this.text;
    }

    @Override // io.realm.j2
    public String realmGet$type() {
        return this.type;
    }

    @Override // io.realm.j2
    public void realmSet$availableFrom(Date date) {
        this.availableFrom = date;
    }

    @Override // io.realm.j2
    public void realmSet$availableUntil(Date date) {
        this.availableUntil = date;
    }

    @Override // io.realm.j2
    public void realmSet$category(String str) {
        this.category = str;
    }

    @Override // io.realm.j2
    public void realmSet$customizationSet(String str) {
        this.customizationSet = str;
    }

    @Override // io.realm.j2
    public void realmSet$customizationSetName(String str) {
        this.customizationSetName = str;
    }

    @Override // io.realm.j2
    public void realmSet$id(String str) {
        this.f12510id = str;
    }

    @Override // io.realm.j2
    public void realmSet$identifier(String str) {
        this.identifier = str;
    }

    @Override // io.realm.j2
    public void realmSet$isBuyable(boolean z10) {
        this.isBuyable = z10;
    }

    @Override // io.realm.j2
    public void realmSet$notes(String str) {
        this.notes = str;
    }

    @Override // io.realm.j2
    public void realmSet$price(Integer num) {
        this.price = num;
    }

    @Override // io.realm.j2
    public void realmSet$setPrice(Integer num) {
        this.setPrice = num;
    }

    @Override // io.realm.j2
    public void realmSet$text(String str) {
        this.text = str;
    }

    @Override // io.realm.j2
    public void realmSet$type(String str) {
        this.type = str;
    }

    public final void setAvailableFrom(Date date) {
        realmSet$availableFrom(date);
    }

    public final void setAvailableUntil(Date date) {
        realmSet$availableUntil(date);
    }

    public final void setBuyable(boolean z10) {
        realmSet$isBuyable(z10);
    }

    public final void setCategory(String str) {
        realmSet$category(str);
        updateID();
    }

    public final void setCustomizationSet(String str) {
        realmSet$customizationSet(str);
    }

    public final void setCustomizationSetName(String str) {
        realmSet$customizationSetName(str);
    }

    public final void setId(String str) {
        realmSet$id(str);
    }

    public final void setIdentifier(String str) {
        realmSet$identifier(str);
        updateID();
    }

    public final void setNotes(String str) {
        realmSet$notes(str);
    }

    public final void setPrice(Integer num) {
        realmSet$price(num);
    }

    public final void setSetPrice(Integer num) {
        realmSet$setPrice(num);
    }

    public final void setText(String str) {
        realmSet$text(str);
    }

    public final void setType(String str) {
        realmSet$type(str);
        updateID();
    }
}
