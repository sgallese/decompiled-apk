package com.habitrpg.android.habitica.data.local;

import com.habitrpg.android.habitica.models.inventory.Equipment;
import com.habitrpg.android.habitica.models.inventory.Item;
import com.habitrpg.android.habitica.models.inventory.Mount;
import com.habitrpg.android.habitica.models.inventory.Pet;
import com.habitrpg.android.habitica.models.inventory.QuestContent;
import com.habitrpg.android.habitica.models.shops.ShopItem;
import com.habitrpg.android.habitica.models.user.Items;
import com.habitrpg.android.habitica.models.user.OwnedItem;
import com.habitrpg.android.habitica.models.user.OwnedMount;
import com.habitrpg.android.habitica.models.user.OwnedPet;
import com.habitrpg.android.habitica.models.user.User;
import dc.w;
import dd.g;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* compiled from: InventoryLocalRepository.kt */
/* loaded from: classes4.dex */
public interface InventoryLocalRepository extends ContentLocalRepository {
    Object changeOwnedCount(String str, String str2, String str3, int i10, Continuation<? super w> continuation);

    void changeOwnedCount(OwnedItem ownedItem, Integer num);

    void decrementMysteryItemCount(User user);

    void feedPet(String str, String str2, int i10, String str3);

    g<Integer> getArmoireRemainingCount();

    g<List<Item>> getAvailableLimitedItems();

    g<Equipment> getEquipment(String str);

    g<List<Equipment>> getEquipment(List<String> list);

    g<List<Equipment>> getEquipmentType(String str, String str2);

    g<ShopItem> getInAppReward(String str);

    g<List<ShopItem>> getInAppRewards();

    g<Item> getItem(String str, String str2);

    g<List<Item>> getItems(Class<? extends Item> cls);

    g<List<Item>> getItems(Class<? extends Item> cls, String[] strArr);

    g<Equipment> getLatestMysteryItem();

    OwnedItem getLiveObject(OwnedItem ownedItem);

    g<List<Mount>> getMounts();

    g<List<Mount>> getMounts(String str, String str2, String str3);

    g<List<Equipment>> getOwnedEquipment();

    g<List<Equipment>> getOwnedEquipment(String str);

    g<OwnedItem> getOwnedItem(String str, String str2, String str3, boolean z10);

    g<List<OwnedItem>> getOwnedItems(String str, String str2, boolean z10);

    g<Map<String, OwnedItem>> getOwnedItems(String str, boolean z10);

    g<List<OwnedMount>> getOwnedMounts(String str);

    g<List<OwnedPet>> getOwnedPets(String str);

    g<List<Pet>> getPets();

    g<List<Pet>> getPets(String str, String str2, String str3);

    g<QuestContent> getQuestContent(String str);

    g<List<QuestContent>> getQuestContent(List<String> list);

    void hatchPet(String str, String str2, String str3);

    void save(Items items, String str);

    void saveInAppRewards(List<? extends ShopItem> list);

    User soldItem(String str, User user);

    void unhatchPet(String str, String str2, String str3);

    void updateOwnedEquipment(User user);
}
