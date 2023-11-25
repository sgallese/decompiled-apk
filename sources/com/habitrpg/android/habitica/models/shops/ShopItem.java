package com.habitrpg.android.habitica.models.shops;

import android.content.Context;
import android.content.res.Resources;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.models.BaseObject;
import com.habitrpg.android.habitica.models.inventory.Customization;
import com.habitrpg.android.habitica.models.inventory.CustomizationSet;
import com.habitrpg.android.habitica.models.inventory.ItemEvent;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import ec.b0;
import ec.t;
import fa.c;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.l4;
import io.realm.x0;
import java.util.List;
import java.util.ListIterator;
import qc.h;
import qc.q;
import yc.j;
import yc.w;
import yc.y;

/* compiled from: ShopItem.kt */
/* loaded from: classes4.dex */
public class ShopItem extends d1 implements BaseObject, l4 {
    private static final String GEM_FOR_GOLD = "gem";
    private String categoryIdentifier;
    private String currency;
    private ItemEvent event;
    @c("klass")
    private String habitClass;
    @c("class")
    private String imageName;
    private boolean isLimited;
    private String isSuggested;
    private String key;
    @c("lvl")
    private Integer level;
    private Integer limitedNumberLeft;
    private boolean locked;
    private String notes;
    private String path;
    private String pinType;
    private String previous;
    private String purchaseType;
    private x0<String> setImageNames;
    private String text;
    private ShopItemUnlockCondition unlockCondition;
    private String unlockPath;
    private int value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ShopItem.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final ShopItem fromCustomization(Customization customization, String str, String str2) {
            int i10;
            q.i(customization, "customization");
            ShopItem shopItem = new ShopItem();
            String identifier = customization.getIdentifier();
            if (identifier == null) {
                identifier = "";
            }
            shopItem.setKey(identifier);
            shopItem.setText(customization.getText());
            shopItem.setCurrency(NavigationDrawerFragment.SIDEBAR_GEMS);
            shopItem.setNotes(customization.getNotes());
            Integer price = customization.getPrice();
            if (price != null) {
                i10 = price.intValue();
            } else {
                i10 = 0;
            }
            shopItem.setValue(i10);
            shopItem.setPath(customization.getPath());
            shopItem.setUnlockPath(customization.getUnlockPath());
            shopItem.setPinType(customization.getType());
            if (q.d(customization.getType(), "background")) {
                shopItem.setPurchaseType("background");
                shopItem.setImageName(customization.getImageName(str, str2));
            } else {
                shopItem.setPurchaseType("customization");
                shopItem.setImageName(customization.getIconName(str, str2));
            }
            return shopItem;
        }

        public final ShopItem fromCustomizationSet(CustomizationSet customizationSet, List<? extends Customization> list, String str, String str2) {
            boolean z10;
            Object c02;
            String str3;
            q.i(customizationSet, "set");
            ShopItem shopItem = new ShopItem();
            String str4 = "";
            String str5 = "";
            for (Customization customization : customizationSet.getCustomizations()) {
                str5 = str5 + "," + customization.getUnlockPath();
                shopItem.getSetImageNames().add(customization.getIconName(str, str2));
            }
            if (list == null) {
                list = t.i();
            }
            for (Customization customization2 : list) {
                str5 = str5 + "," + customization2.getUnlockPath();
                shopItem.getSetImageNames().add(customization2.getIconName(str, str2));
            }
            if (str5.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                shopItem.setUnlockPath(str5);
            } else {
                String substring = str5.substring(1);
                q.h(substring, "this as java.lang.String).substring(startIndex)");
                shopItem.setUnlockPath(substring);
            }
            shopItem.setText(customizationSet.getText());
            String identifier = customizationSet.getIdentifier();
            if (identifier != null) {
                str4 = identifier;
            }
            shopItem.setKey(str4);
            shopItem.setCurrency(NavigationDrawerFragment.SIDEBAR_GEMS);
            shopItem.setValue(customizationSet.getPrice());
            shopItem.setPurchaseType("customizationSet");
            c02 = b0.c0(customizationSet.getCustomizations());
            Customization customization3 = (Customization) c02;
            if (customization3 != null) {
                str3 = customization3.getType();
            } else {
                str3 = null;
            }
            if (q.d(str3, "background")) {
                shopItem.setNotes("Get all three Backgrounds in this bundle.");
            }
            return shopItem;
        }

        public final ShopItem makeFortifyItem(Resources resources) {
            String str;
            String string;
            ShopItem shopItem = new ShopItem();
            shopItem.setKey("fortify");
            String str2 = "";
            if (resources == null || (str = resources.getString(R.string.fortify_shop)) == null) {
                str = "";
            }
            shopItem.setText(str);
            if (resources != null && (string = resources.getString(R.string.fortify_shop_description)) != null) {
                str2 = string;
            }
            shopItem.setNotes(str2);
            shopItem.setImageName("inventory_special_fortify");
            shopItem.setValue(4);
            shopItem.setCurrency(NavigationDrawerFragment.SIDEBAR_GEMS);
            shopItem.setPinType("fortify");
            shopItem.setPath("special.fortify");
            shopItem.setPurchaseType("fortify");
            return shopItem;
        }

        public final ShopItem makeGemItem(Resources resources) {
            String str;
            String string;
            ShopItem shopItem = new ShopItem();
            shopItem.setKey(ShopItem.GEM_FOR_GOLD);
            String str2 = "";
            if (resources == null || (str = resources.getString(R.string.gem_shop)) == null) {
                str = "";
            }
            shopItem.setText(str);
            if (resources != null && (string = resources.getString(R.string.gem_for_gold_description)) != null) {
                str2 = string;
            }
            shopItem.setNotes(str2);
            shopItem.setImageName("gem_shop");
            shopItem.setValue(20);
            shopItem.setCurrency("gold");
            shopItem.setPurchaseType(NavigationDrawerFragment.SIDEBAR_GEMS);
            shopItem.setPinType(ShopItem.GEM_FOR_GOLD);
            shopItem.setPath("special.gems");
            return shopItem;
        }
    }

    public ShopItem() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$key("");
        realmSet$text("");
        realmSet$notes("");
        realmSet$purchaseType("");
        realmSet$categoryIdentifier("");
        realmSet$setImageNames(new x0());
    }

    public final boolean canAfford(User user, int i10) {
        int i11;
        double d10;
        Stats stats;
        Double gp;
        int i12;
        String realmGet$currency = realmGet$currency();
        if (realmGet$currency == null) {
            return true;
        }
        int hashCode = realmGet$currency.hashCode();
        if (hashCode != 3169028) {
            if (hashCode != 3178592) {
                if (hashCode != 1959233222 || !realmGet$currency.equals("hourglasses")) {
                    return true;
                }
                int realmGet$value = realmGet$value() * i10;
                if (user != null) {
                    i12 = user.getHourglassCount();
                } else {
                    i12 = 0;
                }
                if (realmGet$value <= i12) {
                    return true;
                }
            } else if (!realmGet$currency.equals("gold")) {
                return true;
            } else {
                double realmGet$value2 = realmGet$value() * i10;
                if (user != null && (stats = user.getStats()) != null && (gp = stats.getGp()) != null) {
                    d10 = gp.doubleValue();
                } else {
                    d10 = 0.0d;
                }
                if (realmGet$value2 <= d10) {
                    return true;
                }
            }
        } else if (!realmGet$currency.equals(NavigationDrawerFragment.SIDEBAR_GEMS)) {
            return true;
        } else {
            int realmGet$value3 = realmGet$value() * i10;
            if (user != null) {
                i11 = user.getGemCount();
            } else {
                i11 = 0;
            }
            if (realmGet$value3 <= i11) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        ShopItem shopItem;
        if (obj != null && ShopItem.class.isAssignableFrom(obj.getClass())) {
            String str = null;
            if (obj instanceof ShopItem) {
                shopItem = (ShopItem) obj;
            } else {
                shopItem = null;
            }
            String realmGet$key = realmGet$key();
            if (shopItem != null) {
                str = shopItem.realmGet$key();
            }
            return q.d(realmGet$key, str);
        }
        return super.equals(obj);
    }

    public final boolean getCanPurchaseBulk() {
        if (!q.d("eggs", realmGet$purchaseType()) && !q.d("hatchingPotions", realmGet$purchaseType()) && !q.d("food", realmGet$purchaseType()) && !q.d(NavigationDrawerFragment.SIDEBAR_GEMS, realmGet$purchaseType())) {
            return false;
        }
        return true;
    }

    public final String getCategoryIdentifier() {
        return realmGet$categoryIdentifier();
    }

    public final String getCurrency() {
        return realmGet$currency();
    }

    public final ItemEvent getEvent() {
        return realmGet$event();
    }

    public final String getHabitClass() {
        return realmGet$habitClass();
    }

    public final String getImageName() {
        boolean K;
        List i10;
        boolean z10;
        if (realmGet$imageName() != null) {
            String realmGet$imageName = realmGet$imageName();
            q.f(realmGet$imageName);
            K = w.K(realmGet$imageName, " ", false, 2, null);
            if (K) {
                String realmGet$imageName2 = realmGet$imageName();
                q.f(realmGet$imageName2);
                List<String> i11 = new j(" ").i(realmGet$imageName2, 0);
                if (!i11.isEmpty()) {
                    ListIterator<String> listIterator = i11.listIterator(i11.size());
                    while (listIterator.hasPrevious()) {
                        if (listIterator.previous().length() == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            i10 = b0.y0(i11, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                i10 = t.i();
                return ((String[]) i10.toArray(new String[0]))[1];
            }
            return realmGet$imageName();
        }
        return "shop_" + realmGet$key();
    }

    public final String getKey() {
        return realmGet$key();
    }

    public final Integer getLevel() {
        return realmGet$level();
    }

    public final Integer getLimitedNumberLeft() {
        return realmGet$limitedNumberLeft();
    }

    public final boolean getLocked() {
        return realmGet$locked();
    }

    public final String getNotes() {
        return realmGet$notes();
    }

    public final String getPath() {
        return realmGet$path();
    }

    public final String getPinType() {
        return realmGet$pinType();
    }

    public final String getPrevious() {
        return realmGet$previous();
    }

    public final String getPurchaseType() {
        return realmGet$purchaseType();
    }

    public final x0<String> getSetImageNames() {
        return realmGet$setImageNames();
    }

    public final String getText() {
        return realmGet$text();
    }

    public final ShopItemUnlockCondition getUnlockCondition() {
        return realmGet$unlockCondition();
    }

    public final String getUnlockPath() {
        return realmGet$unlockPath();
    }

    public final int getValue() {
        return realmGet$value();
    }

    public int hashCode() {
        return realmGet$key().hashCode();
    }

    public final boolean isLimited() {
        return realmGet$isLimited();
    }

    public final String isSuggested() {
        return realmGet$isSuggested();
    }

    public final boolean isTypeAnimal() {
        if (!q.d("pets", realmGet$purchaseType()) && !q.d("mounts", realmGet$purchaseType())) {
            return false;
        }
        return true;
    }

    public final boolean isTypeGear() {
        return q.d("gear", realmGet$purchaseType());
    }

    public final boolean isTypeItem() {
        if (!q.d("eggs", realmGet$purchaseType()) && !q.d("hatchingPotions", realmGet$purchaseType()) && !q.d("food", realmGet$purchaseType()) && !q.d("armoire", realmGet$purchaseType()) && !q.d("potion", realmGet$purchaseType()) && !q.d("debuffPotion", realmGet$purchaseType()) && !q.d("fortify", realmGet$purchaseType())) {
            return false;
        }
        return true;
    }

    public final boolean isTypeQuest() {
        return q.d("quests", realmGet$purchaseType());
    }

    public final String lockedReason(Context context) {
        char Y0;
        int i10;
        q.i(context, "context");
        if (realmGet$unlockCondition() != null) {
            ShopItemUnlockCondition realmGet$unlockCondition = realmGet$unlockCondition();
            if (realmGet$unlockCondition == null) {
                return null;
            }
            return realmGet$unlockCondition.readableUnlockCondition(context);
        } else if (realmGet$previous() != null) {
            try {
                Y0 = y.Y0(realmGet$key());
                return context.getString(R.string.unlock_previous, Integer.valueOf(Character.getNumericValue(Y0) - 1));
            } catch (NumberFormatException unused) {
                return null;
            }
        } else if (realmGet$level() == null) {
            return null;
        } else {
            Object[] objArr = new Object[1];
            Integer realmGet$level = realmGet$level();
            if (realmGet$level != null) {
                i10 = realmGet$level.intValue();
            } else {
                i10 = 0;
            }
            objArr[0] = Integer.valueOf(i10);
            return context.getString(R.string.unlock_level, objArr);
        }
    }

    @Override // io.realm.l4
    public String realmGet$categoryIdentifier() {
        return this.categoryIdentifier;
    }

    @Override // io.realm.l4
    public String realmGet$currency() {
        return this.currency;
    }

    @Override // io.realm.l4
    public ItemEvent realmGet$event() {
        return this.event;
    }

    @Override // io.realm.l4
    public String realmGet$habitClass() {
        return this.habitClass;
    }

    @Override // io.realm.l4
    public String realmGet$imageName() {
        return this.imageName;
    }

    @Override // io.realm.l4
    public boolean realmGet$isLimited() {
        return this.isLimited;
    }

    @Override // io.realm.l4
    public String realmGet$isSuggested() {
        return this.isSuggested;
    }

    @Override // io.realm.l4
    public String realmGet$key() {
        return this.key;
    }

    @Override // io.realm.l4
    public Integer realmGet$level() {
        return this.level;
    }

    @Override // io.realm.l4
    public Integer realmGet$limitedNumberLeft() {
        return this.limitedNumberLeft;
    }

    @Override // io.realm.l4
    public boolean realmGet$locked() {
        return this.locked;
    }

    @Override // io.realm.l4
    public String realmGet$notes() {
        return this.notes;
    }

    @Override // io.realm.l4
    public String realmGet$path() {
        return this.path;
    }

    @Override // io.realm.l4
    public String realmGet$pinType() {
        return this.pinType;
    }

    @Override // io.realm.l4
    public String realmGet$previous() {
        return this.previous;
    }

    @Override // io.realm.l4
    public String realmGet$purchaseType() {
        return this.purchaseType;
    }

    @Override // io.realm.l4
    public x0 realmGet$setImageNames() {
        return this.setImageNames;
    }

    @Override // io.realm.l4
    public String realmGet$text() {
        return this.text;
    }

    @Override // io.realm.l4
    public ShopItemUnlockCondition realmGet$unlockCondition() {
        return this.unlockCondition;
    }

    @Override // io.realm.l4
    public String realmGet$unlockPath() {
        return this.unlockPath;
    }

    @Override // io.realm.l4
    public int realmGet$value() {
        return this.value;
    }

    @Override // io.realm.l4
    public void realmSet$categoryIdentifier(String str) {
        this.categoryIdentifier = str;
    }

    @Override // io.realm.l4
    public void realmSet$currency(String str) {
        this.currency = str;
    }

    @Override // io.realm.l4
    public void realmSet$event(ItemEvent itemEvent) {
        this.event = itemEvent;
    }

    @Override // io.realm.l4
    public void realmSet$habitClass(String str) {
        this.habitClass = str;
    }

    @Override // io.realm.l4
    public void realmSet$imageName(String str) {
        this.imageName = str;
    }

    @Override // io.realm.l4
    public void realmSet$isLimited(boolean z10) {
        this.isLimited = z10;
    }

    @Override // io.realm.l4
    public void realmSet$isSuggested(String str) {
        this.isSuggested = str;
    }

    @Override // io.realm.l4
    public void realmSet$key(String str) {
        this.key = str;
    }

    @Override // io.realm.l4
    public void realmSet$level(Integer num) {
        this.level = num;
    }

    @Override // io.realm.l4
    public void realmSet$limitedNumberLeft(Integer num) {
        this.limitedNumberLeft = num;
    }

    @Override // io.realm.l4
    public void realmSet$locked(boolean z10) {
        this.locked = z10;
    }

    @Override // io.realm.l4
    public void realmSet$notes(String str) {
        this.notes = str;
    }

    @Override // io.realm.l4
    public void realmSet$path(String str) {
        this.path = str;
    }

    @Override // io.realm.l4
    public void realmSet$pinType(String str) {
        this.pinType = str;
    }

    @Override // io.realm.l4
    public void realmSet$previous(String str) {
        this.previous = str;
    }

    @Override // io.realm.l4
    public void realmSet$purchaseType(String str) {
        this.purchaseType = str;
    }

    @Override // io.realm.l4
    public void realmSet$setImageNames(x0 x0Var) {
        this.setImageNames = x0Var;
    }

    @Override // io.realm.l4
    public void realmSet$text(String str) {
        this.text = str;
    }

    @Override // io.realm.l4
    public void realmSet$unlockCondition(ShopItemUnlockCondition shopItemUnlockCondition) {
        this.unlockCondition = shopItemUnlockCondition;
    }

    @Override // io.realm.l4
    public void realmSet$unlockPath(String str) {
        this.unlockPath = str;
    }

    @Override // io.realm.l4
    public void realmSet$value(int i10) {
        this.value = i10;
    }

    public final void setCategoryIdentifier(String str) {
        q.i(str, "<set-?>");
        realmSet$categoryIdentifier(str);
    }

    public final void setCurrency(String str) {
        realmSet$currency(str);
    }

    public final void setEvent(ItemEvent itemEvent) {
        realmSet$event(itemEvent);
    }

    public final void setHabitClass(String str) {
        realmSet$habitClass(str);
    }

    public final void setImageName(String str) {
        realmSet$imageName(str);
    }

    public final void setKey(String str) {
        q.i(str, "<set-?>");
        realmSet$key(str);
    }

    public final void setLevel(Integer num) {
        realmSet$level(num);
    }

    public final void setLimited(boolean z10) {
        realmSet$isLimited(z10);
    }

    public final void setLimitedNumberLeft(Integer num) {
        realmSet$limitedNumberLeft(num);
    }

    public final void setLocked(boolean z10) {
        realmSet$locked(z10);
    }

    public final void setNotes(String str) {
        realmSet$notes(str);
    }

    public final void setPath(String str) {
        realmSet$path(str);
    }

    public final void setPinType(String str) {
        realmSet$pinType(str);
    }

    public final void setPrevious(String str) {
        realmSet$previous(str);
    }

    public final void setPurchaseType(String str) {
        q.i(str, "<set-?>");
        realmSet$purchaseType(str);
    }

    public final void setSetImageNames(x0<String> x0Var) {
        q.i(x0Var, "<set-?>");
        realmSet$setImageNames(x0Var);
    }

    public final void setSuggested(String str) {
        realmSet$isSuggested(str);
    }

    public final void setText(String str) {
        realmSet$text(str);
    }

    public final void setUnlockCondition(ShopItemUnlockCondition shopItemUnlockCondition) {
        realmSet$unlockCondition(shopItemUnlockCondition);
    }

    public final void setUnlockPath(String str) {
        realmSet$unlockPath(str);
    }

    public final void setValue(int i10) {
        realmSet$value(i10);
    }

    public final String shortLockedReason(Context context) {
        char Y0;
        int i10;
        q.i(context, "context");
        if (realmGet$unlockCondition() != null) {
            ShopItemUnlockCondition realmGet$unlockCondition = realmGet$unlockCondition();
            if (realmGet$unlockCondition == null) {
                return null;
            }
            return realmGet$unlockCondition.shortReadableUnlockCondition(context);
        } else if (realmGet$previous() != null) {
            try {
                Y0 = y.Y0(realmGet$key());
                return context.getString(R.string.unlock_previous_short, Integer.valueOf(Character.getNumericValue(Y0) - 1));
            } catch (NumberFormatException unused) {
                return null;
            }
        } else if (realmGet$level() == null) {
            return null;
        } else {
            Object[] objArr = new Object[1];
            Integer realmGet$level = realmGet$level();
            if (realmGet$level != null) {
                i10 = realmGet$level.intValue();
            } else {
                i10 = 0;
            }
            objArr[0] = Integer.valueOf(i10);
            return context.getString(R.string.level_unabbreviated, objArr);
        }
    }
}
