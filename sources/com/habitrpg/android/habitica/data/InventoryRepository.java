package com.habitrpg.android.habitica.data;

import com.habitrpg.android.habitica.models.inventory.Egg;
import com.habitrpg.android.habitica.models.inventory.Equipment;
import com.habitrpg.android.habitica.models.inventory.Food;
import com.habitrpg.android.habitica.models.inventory.HatchingPotion;
import com.habitrpg.android.habitica.models.inventory.Item;
import com.habitrpg.android.habitica.models.inventory.Mount;
import com.habitrpg.android.habitica.models.inventory.Pet;
import com.habitrpg.android.habitica.models.inventory.Quest;
import com.habitrpg.android.habitica.models.inventory.QuestContent;
import com.habitrpg.android.habitica.models.responses.BuyResponse;
import com.habitrpg.android.habitica.models.shops.Shop;
import com.habitrpg.android.habitica.models.shops.ShopItem;
import com.habitrpg.android.habitica.models.user.Items;
import com.habitrpg.android.habitica.models.user.OwnedItem;
import com.habitrpg.android.habitica.models.user.OwnedMount;
import com.habitrpg.android.habitica.models.user.OwnedPet;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.shared.habitica.models.responses.FeedResponse;
import dc.w;
import dd.g;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import pc.a;

/* compiled from: InventoryRepository.kt */
/* loaded from: classes4.dex */
public interface InventoryRepository extends BaseRepository {

    /* compiled from: InventoryRepository.kt */
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ g getOwnedItems$default(InventoryRepository inventoryRepository, String str, boolean z10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    z10 = false;
                }
                return inventoryRepository.getOwnedItems(str, z10);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOwnedItems");
        }

        public static /* synthetic */ g getOwnedItems$default(InventoryRepository inventoryRepository, boolean z10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    z10 = false;
                }
                return inventoryRepository.getOwnedItems(z10);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOwnedItems");
        }
    }

    Object buyItem(User user, String str, double d10, int i10, Continuation<? super BuyResponse> continuation);

    Object changeOwnedCount(String str, String str2, int i10, Continuation<? super w> continuation);

    Object equip(String str, String str2, Continuation<? super Items> continuation);

    Object equipGear(String str, boolean z10, Continuation<? super Items> continuation);

    Object feedPet(Pet pet, Food food, Continuation<? super FeedResponse> continuation);

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

    g<List<Mount>> getMounts();

    g<List<Mount>> getMounts(String str, String str2, String str3);

    g<List<Equipment>> getOwnedEquipment();

    g<List<Equipment>> getOwnedEquipment(String str);

    g<List<OwnedItem>> getOwnedItems(String str, boolean z10);

    g<Map<String, OwnedItem>> getOwnedItems(boolean z10);

    g<List<OwnedMount>> getOwnedMounts();

    g<List<OwnedPet>> getOwnedPets();

    g<List<Pet>> getPets();

    g<List<Pet>> getPets(String str, String str2, String str3);

    g<QuestContent> getQuestContent(String str);

    g<List<QuestContent>> getQuestContent(List<String> list);

    Object hatchPet(Egg egg, HatchingPotion hatchingPotion, a<w> aVar, Continuation<? super Items> continuation);

    Object inviteToQuest(QuestContent questContent, Continuation<? super Quest> continuation);

    Object openMysteryItem(User user, Continuation<? super Equipment> continuation);

    Object purchaseHourglassItem(String str, String str2, Continuation<? super Void> continuation);

    Object purchaseItem(String str, String str2, int i10, Continuation<? super Void> continuation);

    Object purchaseMysterySet(String str, Continuation<? super Void> continuation);

    Object purchaseQuest(String str, Continuation<? super Void> continuation);

    Object purchaseSpecialSpell(String str, Continuation<? super Void> continuation);

    Object retrieveInAppRewards(Continuation<? super List<? extends ShopItem>> continuation);

    Object retrieveMarketGear(Continuation<? super Shop> continuation);

    Object retrieveShopInventory(String str, Continuation<? super Shop> continuation);

    void saveEquipment(Equipment equipment);

    Object sellItem(OwnedItem ownedItem, Continuation<? super User> continuation);

    Object sellItem(String str, String str2, Continuation<? super User> continuation);

    Object togglePinnedItem(ShopItem shopItem, Continuation<? super List<? extends ShopItem>> continuation);

    void updateOwnedEquipment(User user);
}
