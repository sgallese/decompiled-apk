package com.habitrpg.android.habitica.models.social;

import com.habitrpg.android.habitica.models.user.Authentication;
import com.habitrpg.android.habitica.models.user.Flags;
import com.habitrpg.android.habitica.models.user.Gear;
import com.habitrpg.android.habitica.models.user.Items;
import com.habitrpg.android.habitica.models.user.Outfit;
import com.habitrpg.android.habitica.models.user.Preferences;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.shared.habitica.models.Avatar;
import io.realm.d1;
import io.realm.h5;
import io.realm.internal.o;

/* compiled from: UserStyles.kt */
/* loaded from: classes4.dex */
public class UserStyles extends d1 implements Avatar, h5 {
    public static final int $stable = 8;
    private Authentication authentication;
    private double balance;
    private Flags flags;
    private Items items;
    private Preferences preferences;
    private Stats stats;

    public UserStyles() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public double getBalance() {
        return realmGet$balance();
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public String getCurrentMount() {
        Items items = getItems();
        if (items != null) {
            return items.getCurrentMount();
        }
        return null;
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public String getCurrentPet() {
        Items items = getItems();
        if (items != null) {
            return items.getCurrentPet();
        }
        return null;
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public String getFormattedUsername() {
        return Avatar.DefaultImpls.getFormattedUsername(this);
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public int getGemCount() {
        return 0;
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public boolean getHasClass() {
        return false;
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public int getHourglassCount() {
        return 0;
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar, com.habitrpg.android.habitica.models.Assignable
    public String getId() {
        return null;
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public boolean getSleep() {
        return false;
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public String getUsername() {
        return Avatar.DefaultImpls.getUsername(this);
    }

    @Override // io.realm.h5
    public Authentication realmGet$authentication() {
        return this.authentication;
    }

    @Override // io.realm.h5
    public double realmGet$balance() {
        return this.balance;
    }

    @Override // io.realm.h5
    public Flags realmGet$flags() {
        return this.flags;
    }

    @Override // io.realm.h5
    public Items realmGet$items() {
        return this.items;
    }

    @Override // io.realm.h5
    public Preferences realmGet$preferences() {
        return this.preferences;
    }

    @Override // io.realm.h5
    public Stats realmGet$stats() {
        return this.stats;
    }

    @Override // io.realm.h5
    public void realmSet$authentication(Authentication authentication) {
        this.authentication = authentication;
    }

    @Override // io.realm.h5
    public void realmSet$balance(double d10) {
        this.balance = d10;
    }

    @Override // io.realm.h5
    public void realmSet$flags(Flags flags) {
        this.flags = flags;
    }

    @Override // io.realm.h5
    public void realmSet$items(Items items) {
        this.items = items;
    }

    @Override // io.realm.h5
    public void realmSet$preferences(Preferences preferences) {
        this.preferences = preferences;
    }

    @Override // io.realm.h5
    public void realmSet$stats(Stats stats) {
        this.stats = stats;
    }

    public void setAuthentication(Authentication authentication) {
        realmSet$authentication(authentication);
    }

    public void setBalance(double d10) {
        realmSet$balance(d10);
    }

    public void setFlags(Flags flags) {
        realmSet$flags(flags);
    }

    public void setItems(Items items) {
        realmSet$items(items);
    }

    public void setPreferences(Preferences preferences) {
        realmSet$preferences(preferences);
    }

    public void setStats(Stats stats) {
        realmSet$stats(stats);
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public Authentication getAuthentication() {
        return realmGet$authentication();
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public Outfit getCostume() {
        Gear gear;
        Items items = getItems();
        if (items == null || (gear = items.getGear()) == null) {
            return null;
        }
        return gear.getCostume();
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public Outfit getEquipped() {
        Gear gear;
        Items items = getItems();
        if (items == null || (gear = items.getGear()) == null) {
            return null;
        }
        return gear.getEquipped();
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public Flags getFlags() {
        return realmGet$flags();
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public Items getItems() {
        return realmGet$items();
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public Preferences getPreferences() {
        return realmGet$preferences();
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public Stats getStats() {
        return realmGet$stats();
    }
}
