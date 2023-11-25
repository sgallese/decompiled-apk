package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.local.InventoryLocalRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.models.inventory.Equipment;
import com.habitrpg.android.habitica.models.inventory.Item;
import com.habitrpg.android.habitica.models.inventory.Mount;
import com.habitrpg.android.habitica.models.inventory.Pet;
import com.habitrpg.android.habitica.models.inventory.QuestContent;
import com.habitrpg.android.habitica.models.shops.Shop;
import com.habitrpg.android.habitica.models.shops.ShopItem;
import com.habitrpg.android.habitica.models.user.Items;
import com.habitrpg.android.habitica.models.user.OwnedItem;
import com.habitrpg.android.habitica.models.user.OwnedMount;
import com.habitrpg.android.habitica.models.user.OwnedPet;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.modules.AuthenticationHandler;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import dc.w;
import dd.g;
import dd.i;
import ic.d;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import qc.q;

/* compiled from: InventoryRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class InventoryRepositoryImpl extends BaseRepositoryImpl<InventoryLocalRepository> implements InventoryRepository {
    public static final int $stable = 8;
    private AppConfigManager appConfigManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InventoryRepositoryImpl(InventoryLocalRepository inventoryLocalRepository, ApiClient apiClient, AuthenticationHandler authenticationHandler, AppConfigManager appConfigManager) {
        super(inventoryLocalRepository, apiClient, authenticationHandler);
        q.i(inventoryLocalRepository, "localRepository");
        q.i(apiClient, "apiClient");
        q.i(authenticationHandler, "authenticationHandler");
        q.i(appConfigManager, "appConfigManager");
        this.appConfigManager = appConfigManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object buyItem(com.habitrpg.android.habitica.models.user.User r6, java.lang.String r7, double r8, int r10, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.responses.BuyResponse> r11) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl.buyItem(com.habitrpg.android.habitica.models.user.User, java.lang.String, double, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    public Object changeOwnedCount(String str, String str2, int i10, Continuation<? super w> continuation) {
        Object d10;
        Object changeOwnedCount = getLocalRepository().changeOwnedCount(str, str2, getCurrentUserID(), i10, continuation);
        d10 = d.d();
        if (changeOwnedCount == d10) {
            return changeOwnedCount;
        }
        return w.f13270a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object equip(java.lang.String r7, java.lang.String r8, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.user.Items> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$equip$1
            if (r0 == 0) goto L13
            r0 = r9
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$equip$1 r0 = (com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$equip$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$equip$1 r0 = new com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$equip$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.L$1
            com.habitrpg.android.habitica.models.user.User r7 = (com.habitrpg.android.habitica.models.user.User) r7
            java.lang.Object r8 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl r8 = (com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl) r8
            dc.n.b(r9)
            goto L6f
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            dc.n.b(r9)
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r9 = r6.getLocalRepository()
            com.habitrpg.android.habitica.data.local.InventoryLocalRepository r9 = (com.habitrpg.android.habitica.data.local.InventoryLocalRepository) r9
            java.lang.String r2 = r6.getCurrentUserID()
            com.habitrpg.android.habitica.models.user.User r9 = r9.getLiveUser(r2)
            if (r9 == 0) goto L5a
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r2 = r6.getLocalRepository()
            com.habitrpg.android.habitica.data.local.InventoryLocalRepository r2 = (com.habitrpg.android.habitica.data.local.InventoryLocalRepository) r2
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$equip$2 r4 = new com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$equip$2
            r4.<init>(r7, r8)
            r2.modify(r9, r4)
        L5a:
            com.habitrpg.android.habitica.data.ApiClient r2 = r6.getApiClient()
            r0.L$0 = r6
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r7 = r2.equipItem(r7, r8, r0)
            if (r7 != r1) goto L6b
            return r1
        L6b:
            r8 = r6
            r5 = r9
            r9 = r7
            r7 = r5
        L6f:
            com.habitrpg.android.habitica.models.user.Items r9 = (com.habitrpg.android.habitica.models.user.Items) r9
            r0 = 0
            if (r9 != 0) goto L75
            return r0
        L75:
            if (r7 != 0) goto L78
            return r0
        L78:
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r8 = r8.getLocalRepository()
            com.habitrpg.android.habitica.data.local.InventoryLocalRepository r8 = (com.habitrpg.android.habitica.data.local.InventoryLocalRepository) r8
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$equip$3 r0 = new com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$equip$3
            r0.<init>(r9)
            r8.modify(r7, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl.equip(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    public Object equipGear(String str, boolean z10, Continuation<? super Items> continuation) {
        String str2;
        if (z10) {
            str2 = "costume";
        } else {
            str2 = "equipped";
        }
        return equip(str2, str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object feedPet(com.habitrpg.android.habitica.models.inventory.Pet r6, com.habitrpg.android.habitica.models.inventory.Food r7, kotlin.coroutines.Continuation<? super com.habitrpg.shared.habitica.models.responses.FeedResponse> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$feedPet$1
            if (r0 == 0) goto L13
            r0 = r8
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$feedPet$1 r0 = (com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$feedPet$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$feedPet$1 r0 = new com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$feedPet$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r6 = r0.L$2
            r7 = r6
            com.habitrpg.android.habitica.models.inventory.Food r7 = (com.habitrpg.android.habitica.models.inventory.Food) r7
            java.lang.Object r6 = r0.L$1
            com.habitrpg.android.habitica.models.inventory.Pet r6 = (com.habitrpg.android.habitica.models.inventory.Pet) r6
            java.lang.Object r0 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl r0 = (com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl) r0
            dc.n.b(r8)
            goto L5d
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            dc.n.b(r8)
            com.habitrpg.android.habitica.data.ApiClient r8 = r5.getApiClient()
            java.lang.String r2 = r6.getKey()
            java.lang.String r4 = r7.getKey()
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r8 = r8.feedPet(r2, r4, r0)
            if (r8 != r1) goto L5c
            return r1
        L5c:
            r0 = r5
        L5d:
            com.habitrpg.shared.habitica.models.responses.FeedResponse r8 = (com.habitrpg.shared.habitica.models.responses.FeedResponse) r8
            if (r8 != 0) goto L63
            r6 = 0
            return r6
        L63:
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r1 = r0.getLocalRepository()
            com.habitrpg.android.habitica.data.local.InventoryLocalRepository r1 = (com.habitrpg.android.habitica.data.local.InventoryLocalRepository) r1
            java.lang.String r7 = r7.getKey()
            java.lang.String r6 = r6.getKey()
            java.lang.Integer r2 = r8.getValue()
            if (r2 == 0) goto L7c
            int r2 = r2.intValue()
            goto L7d
        L7c:
            r2 = 0
        L7d:
            java.lang.String r0 = r0.getCurrentUserID()
            r1.feedPet(r7, r6, r2, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl.feedPet(com.habitrpg.android.habitica.models.inventory.Pet, com.habitrpg.android.habitica.models.inventory.Food, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final AppConfigManager getAppConfigManager() {
        return this.appConfigManager;
    }

    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    public g<Integer> getArmoireRemainingCount() {
        return getLocalRepository().getArmoireRemainingCount();
    }

    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    public g<List<Item>> getAvailableLimitedItems() {
        return getLocalRepository().getAvailableLimitedItems();
    }

    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    public g<List<Equipment>> getEquipment(List<String> list) {
        q.i(list, "searchedKeys");
        return getLocalRepository().getEquipment(list);
    }

    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    public g<List<Equipment>> getEquipmentType(String str, String str2) {
        q.i(str, TaskFormActivity.TASK_TYPE_KEY);
        q.i(str2, "set");
        return getLocalRepository().getEquipmentType(str, str2);
    }

    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    public g<ShopItem> getInAppReward(String str) {
        q.i(str, "key");
        return getLocalRepository().getInAppReward(str);
    }

    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    public g<List<ShopItem>> getInAppRewards() {
        return getLocalRepository().getInAppRewards();
    }

    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    public g<Item> getItem(String str, String str2) {
        q.i(str, TaskFormActivity.TASK_TYPE_KEY);
        q.i(str2, "key");
        return getLocalRepository().getItem(str, str2);
    }

    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    public g<List<Item>> getItems(Class<? extends Item> cls, String[] strArr) {
        q.i(cls, "itemClass");
        q.i(strArr, "keys");
        return getLocalRepository().getItems(cls, strArr);
    }

    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    public g<Equipment> getLatestMysteryItem() {
        return getLocalRepository().getLatestMysteryItem();
    }

    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    public g<List<Mount>> getMounts() {
        return getLocalRepository().getMounts();
    }

    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    public g<List<Equipment>> getOwnedEquipment(String str) {
        q.i(str, TaskFormActivity.TASK_TYPE_KEY);
        return getLocalRepository().getOwnedEquipment(str);
    }

    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    public g<List<OwnedItem>> getOwnedItems(String str, boolean z10) {
        q.i(str, "itemType");
        return i.R(getAuthenticationHandler().getUserIDFlow(), new InventoryRepositoryImpl$getOwnedItems$$inlined$flatMapLatest$1(null, this, str, z10));
    }

    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    public g<List<OwnedMount>> getOwnedMounts() {
        return i.R(getAuthenticationHandler().getUserIDFlow(), new InventoryRepositoryImpl$getOwnedMounts$$inlined$flatMapLatest$1(null, this));
    }

    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    public g<List<OwnedPet>> getOwnedPets() {
        return i.R(getAuthenticationHandler().getUserIDFlow(), new InventoryRepositoryImpl$getOwnedPets$$inlined$flatMapLatest$1(null, this));
    }

    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    public g<List<Pet>> getPets() {
        return getLocalRepository().getPets();
    }

    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    public g<List<QuestContent>> getQuestContent(List<String> list) {
        q.i(list, "keys");
        return getLocalRepository().getQuestContent(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object hatchPet(com.habitrpg.android.habitica.models.inventory.Egg r7, com.habitrpg.android.habitica.models.inventory.HatchingPotion r8, pc.a<dc.w> r9, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.user.Items> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$hatchPet$1
            if (r0 == 0) goto L13
            r0 = r10
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$hatchPet$1 r0 = (com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$hatchPet$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$hatchPet$1 r0 = new com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$hatchPet$1
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.L$1
            r9 = r7
            pc.a r9 = (pc.a) r9
            java.lang.Object r7 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl r7 = (com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl) r7
            dc.n.b(r10)
            goto L77
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            dc.n.b(r10)
            com.habitrpg.android.habitica.helpers.AppConfigManager r10 = r6.appConfigManager
            boolean r10 = r10.enableLocalChanges()
            if (r10 == 0) goto L5d
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r10 = r6.getLocalRepository()
            com.habitrpg.android.habitica.data.local.InventoryLocalRepository r10 = (com.habitrpg.android.habitica.data.local.InventoryLocalRepository) r10
            java.lang.String r2 = r7.getKey()
            java.lang.String r4 = r8.getKey()
            java.lang.String r5 = r6.getCurrentUserID()
            r10.hatchPet(r2, r4, r5)
            r9.invoke()
        L5d:
            com.habitrpg.android.habitica.data.ApiClient r10 = r6.getApiClient()
            java.lang.String r7 = r7.getKey()
            java.lang.String r8 = r8.getKey()
            r0.L$0 = r6
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r10 = r10.hatchPet(r7, r8, r0)
            if (r10 != r1) goto L76
            return r1
        L76:
            r7 = r6
        L77:
            com.habitrpg.android.habitica.models.user.Items r10 = (com.habitrpg.android.habitica.models.user.Items) r10
            if (r10 != 0) goto L7d
            r7 = 0
            return r7
        L7d:
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r8 = r7.getLocalRepository()
            com.habitrpg.android.habitica.data.local.InventoryLocalRepository r8 = (com.habitrpg.android.habitica.data.local.InventoryLocalRepository) r8
            java.lang.String r0 = r7.getCurrentUserID()
            r8.save(r10, r0)
            com.habitrpg.android.habitica.helpers.AppConfigManager r7 = r7.appConfigManager
            boolean r7 = r7.enableLocalChanges()
            if (r7 != 0) goto L95
            r9.invoke()
        L95:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl.hatchPet(com.habitrpg.android.habitica.models.inventory.Egg, com.habitrpg.android.habitica.models.inventory.HatchingPotion, pc.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object inviteToQuest(com.habitrpg.android.habitica.models.inventory.QuestContent r9, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.inventory.Quest> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$inviteToQuest$1
            if (r0 == 0) goto L13
            r0 = r10
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$inviteToQuest$1 r0 = (com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$inviteToQuest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$inviteToQuest$1 r0 = new com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$inviteToQuest$1
            r0.<init>(r8, r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.result
            java.lang.Object r0 = ic.b.d()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L45
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r9 = r6.L$0
            com.habitrpg.android.habitica.models.inventory.Quest r9 = (com.habitrpg.android.habitica.models.inventory.Quest) r9
            dc.n.b(r10)
            goto L87
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            java.lang.Object r9 = r6.L$1
            com.habitrpg.android.habitica.models.inventory.QuestContent r9 = (com.habitrpg.android.habitica.models.inventory.QuestContent) r9
            java.lang.Object r1 = r6.L$0
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl r1 = (com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl) r1
            dc.n.b(r10)
            goto L60
        L45:
            dc.n.b(r10)
            com.habitrpg.android.habitica.data.ApiClient r10 = r8.getApiClient()
            java.lang.String r1 = r9.getKey()
            r6.L$0 = r8
            r6.L$1 = r9
            r6.label = r3
            java.lang.String r3 = "party"
            java.lang.Object r10 = r10.inviteToQuest(r3, r1, r6)
            if (r10 != r0) goto L5f
            return r0
        L5f:
            r1 = r8
        L60:
            com.habitrpg.android.habitica.models.inventory.Quest r10 = (com.habitrpg.android.habitica.models.inventory.Quest) r10
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r3 = r1.getLocalRepository()
            com.habitrpg.android.habitica.data.local.InventoryLocalRepository r3 = (com.habitrpg.android.habitica.data.local.InventoryLocalRepository) r3
            java.lang.String r4 = "quests"
            java.lang.String r9 = r9.getKey()
            java.lang.String r5 = r1.getCurrentUserID()
            r7 = -1
            r6.L$0 = r10
            r1 = 0
            r6.L$1 = r1
            r6.label = r2
            r1 = r3
            r2 = r4
            r3 = r9
            r4 = r5
            r5 = r7
            java.lang.Object r9 = r1.changeOwnedCount(r2, r3, r4, r5, r6)
            if (r9 != r0) goto L86
            return r0
        L86:
            r9 = r10
        L87:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl.inviteToQuest(com.habitrpg.android.habitica.models.inventory.QuestContent, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object openMysteryItem(com.habitrpg.android.habitica.models.user.User r6, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.inventory.Equipment> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$openMysteryItem$1
            if (r0 == 0) goto L13
            r0 = r7
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$openMysteryItem$1 r0 = (com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$openMysteryItem$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$openMysteryItem$1 r0 = new com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$openMysteryItem$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.L$1
            com.habitrpg.android.habitica.models.user.User r6 = (com.habitrpg.android.habitica.models.user.User) r6
            java.lang.Object r0 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl r0 = (com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl) r0
            dc.n.b(r7)
            goto L81
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.lang.Object r6 = r0.L$1
            com.habitrpg.android.habitica.models.user.User r6 = (com.habitrpg.android.habitica.models.user.User) r6
            java.lang.Object r2 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl r2 = (com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl) r2
            dc.n.b(r7)
            goto L5d
        L48:
            dc.n.b(r7)
            com.habitrpg.android.habitica.data.ApiClient r7 = r5.getApiClient()
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r7.openMysteryItem(r0)
            if (r7 != r1) goto L5c
            return r1
        L5c:
            r2 = r5
        L5d:
            com.habitrpg.android.habitica.models.inventory.Equipment r7 = (com.habitrpg.android.habitica.models.inventory.Equipment) r7
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r4 = r2.getLocalRepository()
            com.habitrpg.android.habitica.data.local.InventoryLocalRepository r4 = (com.habitrpg.android.habitica.data.local.InventoryLocalRepository) r4
            if (r7 == 0) goto L6d
            java.lang.String r7 = r7.getKey()
            if (r7 != 0) goto L6f
        L6d:
            java.lang.String r7 = ""
        L6f:
            dd.g r7 = r4.getEquipment(r7)
            r0.L$0 = r2
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = dd.i.x(r7, r0)
            if (r7 != r1) goto L80
            return r1
        L80:
            r0 = r2
        L81:
            com.habitrpg.android.habitica.models.inventory.Equipment r7 = (com.habitrpg.android.habitica.models.inventory.Equipment) r7
            if (r7 != 0) goto L87
            r6 = 0
            return r6
        L87:
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r1 = r0.getLocalRepository()
            com.habitrpg.android.habitica.data.local.InventoryLocalRepository r1 = (com.habitrpg.android.habitica.data.local.InventoryLocalRepository) r1
            com.habitrpg.android.habitica.models.BaseObject r1 = r1.getLiveObject(r7)
            com.habitrpg.android.habitica.models.inventory.Equipment r1 = (com.habitrpg.android.habitica.models.inventory.Equipment) r1
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r2 = r0.getLocalRepository()
            com.habitrpg.android.habitica.data.local.InventoryLocalRepository r2 = (com.habitrpg.android.habitica.data.local.InventoryLocalRepository) r2
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$openMysteryItem$2 r3 = new com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$openMysteryItem$2
            r3.<init>(r1)
            r2.executeTransaction(r3)
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r0 = r0.getLocalRepository()
            com.habitrpg.android.habitica.data.local.InventoryLocalRepository r0 = (com.habitrpg.android.habitica.data.local.InventoryLocalRepository) r0
            r0.decrementMysteryItemCount(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl.openMysteryItem(com.habitrpg.android.habitica.models.user.User, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    public Object purchaseHourglassItem(String str, String str2, Continuation<? super Void> continuation) {
        return getApiClient().purchaseHourglassItem(str, str2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object purchaseItem(java.lang.String r5, java.lang.String r6, int r7, kotlin.coroutines.Continuation<? super java.lang.Void> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$purchaseItem$1
            if (r0 == 0) goto L13
            r0 = r8
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$purchaseItem$1 r0 = (com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$purchaseItem$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$purchaseItem$1 r0 = new com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$purchaseItem$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            int r7 = r0.I$0
            java.lang.Object r5 = r0.L$1
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl r5 = (com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl) r5
            dc.n.b(r8)
            goto L53
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            dc.n.b(r8)
            com.habitrpg.android.habitica.data.ApiClient r8 = r4.getApiClient()
            r0.L$0 = r4
            r0.L$1 = r6
            r0.I$0 = r7
            r0.label = r3
            java.lang.Object r8 = r8.purchaseItem(r5, r6, r7, r0)
            if (r8 != r1) goto L52
            return r1
        L52:
            r5 = r4
        L53:
            java.lang.Void r8 = (java.lang.Void) r8
            java.lang.String r0 = "gem"
            boolean r6 = qc.q.d(r6, r0)
            if (r6 == 0) goto L79
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r6 = r5.getLocalRepository()
            com.habitrpg.android.habitica.data.local.InventoryLocalRepository r6 = (com.habitrpg.android.habitica.data.local.InventoryLocalRepository) r6
            java.lang.String r0 = r5.getCurrentUserID()
            com.habitrpg.android.habitica.models.user.User r6 = r6.getLiveUser(r0)
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r5 = r5.getLocalRepository()
            com.habitrpg.android.habitica.data.local.InventoryLocalRepository r5 = (com.habitrpg.android.habitica.data.local.InventoryLocalRepository) r5
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$purchaseItem$2 r0 = new com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$purchaseItem$2
            r0.<init>(r6, r7)
            r5.executeTransaction(r0)
        L79:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl.purchaseItem(java.lang.String, java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    public Object purchaseMysterySet(String str, Continuation<? super Void> continuation) {
        return getApiClient().purchaseMysterySet(str, continuation);
    }

    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    public Object purchaseQuest(String str, Continuation<? super Void> continuation) {
        return getApiClient().purchaseQuest(str, continuation);
    }

    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    public Object purchaseSpecialSpell(String str, Continuation<? super Void> continuation) {
        return getApiClient().purchaseSpecialSpell(str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object retrieveInAppRewards(kotlin.coroutines.Continuation<? super java.util.List<? extends com.habitrpg.android.habitica.models.shops.ShopItem>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$retrieveInAppRewards$1
            if (r0 == 0) goto L13
            r0 = r5
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$retrieveInAppRewards$1 r0 = (com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$retrieveInAppRewards$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$retrieveInAppRewards$1 r0 = new com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$retrieveInAppRewards$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl r0 = (com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl) r0
            dc.n.b(r5)
            goto L48
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            dc.n.b(r5)
            com.habitrpg.android.habitica.data.ApiClient r5 = r4.getApiClient()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.retrieveInAppRewards(r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L55
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r0 = r0.getLocalRepository()
            com.habitrpg.android.habitica.data.local.InventoryLocalRepository r0 = (com.habitrpg.android.habitica.data.local.InventoryLocalRepository) r0
            r0.saveInAppRewards(r5)
        L55:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl.retrieveInAppRewards(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    public Object retrieveMarketGear(Continuation<? super Shop> continuation) {
        return getApiClient().retrieveMarketGear(continuation);
    }

    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    public Object retrieveShopInventory(String str, Continuation<? super Shop> continuation) {
        return getApiClient().retrieveShopIventory(str, continuation);
    }

    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    public void saveEquipment(Equipment equipment) {
        q.i(equipment, NavigationDrawerFragment.SIDEBAR_EQUIPMENT);
        getLocalRepository().save((InventoryLocalRepository) equipment);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object sellItem(java.lang.String r6, java.lang.String r7, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.user.User> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$sellItem$1
            if (r0 == 0) goto L13
            r0 = r8
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$sellItem$1 r0 = (com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$sellItem$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$sellItem$1 r0 = new com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$sellItem$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            dc.n.b(r8)
            goto L6a
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl r6 = (com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl) r6
            dc.n.b(r8)
            goto L59
        L3c:
            dc.n.b(r8)
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r8 = r5.getLocalRepository()
            com.habitrpg.android.habitica.data.local.InventoryLocalRepository r8 = (com.habitrpg.android.habitica.data.local.InventoryLocalRepository) r8
            java.lang.String r2 = r5.getCurrentUserID()
            dd.g r6 = r8.getOwnedItem(r2, r6, r7, r4)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r8 = dd.i.x(r6, r0)
            if (r8 != r1) goto L58
            return r1
        L58:
            r6 = r5
        L59:
            com.habitrpg.android.habitica.models.user.OwnedItem r8 = (com.habitrpg.android.habitica.models.user.OwnedItem) r8
            r7 = 0
            if (r8 != 0) goto L5f
            return r7
        L5f:
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = r6.sellItem(r8, r0)
            if (r8 != r1) goto L6a
            return r1
        L6a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl.sellItem(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void setAppConfigManager(AppConfigManager appConfigManager) {
        q.i(appConfigManager, "<set-?>");
        this.appConfigManager = appConfigManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072 A[PHI: r8
      0x0072: PHI (r8v6 java.lang.Object) = (r8v5 java.lang.Object), (r8v1 java.lang.Object) binds: [B:30:0x006f, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object togglePinnedItem(com.habitrpg.android.habitica.models.shops.ShopItem r7, kotlin.coroutines.Continuation<? super java.util.List<? extends com.habitrpg.android.habitica.models.shops.ShopItem>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$togglePinnedItem$1
            if (r0 == 0) goto L13
            r0 = r8
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$togglePinnedItem$1 r0 = (com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$togglePinnedItem$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$togglePinnedItem$1 r0 = new com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$togglePinnedItem$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            dc.n.b(r8)
            goto L72
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl r7 = (com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl) r7
            dc.n.b(r8)
            goto L66
        L3c:
            dc.n.b(r8)
            boolean r8 = r7.isValid()
            if (r8 == 0) goto L65
            com.habitrpg.android.habitica.data.ApiClient r8 = r6.getApiClient()
            java.lang.String r2 = r7.getPinType()
            java.lang.String r5 = ""
            if (r2 != 0) goto L52
            r2 = r5
        L52:
            java.lang.String r7 = r7.getPath()
            if (r7 != 0) goto L59
            goto L5a
        L59:
            r5 = r7
        L5a:
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r8.togglePinnedItem(r2, r5, r0)
            if (r7 != r1) goto L65
            return r1
        L65:
            r7 = r6
        L66:
            r8 = 0
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r8 = r7.retrieveInAppRewards(r0)
            if (r8 != r1) goto L72
            return r1
        L72:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl.togglePinnedItem(com.habitrpg.android.habitica.models.shops.ShopItem, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    public void updateOwnedEquipment(User user) {
        q.i(user, "user");
        getLocalRepository().updateOwnedEquipment(user);
    }

    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    public g<Equipment> getEquipment(String str) {
        q.i(str, "key");
        return getLocalRepository().getEquipment(str);
    }

    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    public g<List<Item>> getItems(Class<? extends Item> cls) {
        q.i(cls, "itemClass");
        return getLocalRepository().getItems(cls);
    }

    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    public g<List<Mount>> getMounts(String str, String str2, String str3) {
        return getLocalRepository().getMounts(str, str2, str3);
    }

    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    public g<List<Equipment>> getOwnedEquipment() {
        return getLocalRepository().getOwnedEquipment();
    }

    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    public g<List<Pet>> getPets(String str, String str2, String str3) {
        return getLocalRepository().getPets(str, str2, str3);
    }

    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    public g<QuestContent> getQuestContent(String str) {
        q.i(str, "key");
        return getLocalRepository().getQuestContent(str);
    }

    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    public g<Map<String, OwnedItem>> getOwnedItems(boolean z10) {
        return i.R(getAuthenticationHandler().getUserIDFlow(), new InventoryRepositoryImpl$getOwnedItems$$inlined$flatMapLatest$2(null, this, z10));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    @Override // com.habitrpg.android.habitica.data.InventoryRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object sellItem(com.habitrpg.android.habitica.models.user.OwnedItem r8, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.user.User> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$sellItem$2
            if (r0 == 0) goto L13
            r0 = r9
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$sellItem$2 r0 = (com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$sellItem$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$sellItem$2 r0 = new com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$sellItem$2
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            dc.n.b(r9)
            goto L7f
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            java.lang.Object r8 = r0.L$1
            com.habitrpg.android.habitica.models.user.OwnedItem r8 = (com.habitrpg.android.habitica.models.user.OwnedItem) r8
            java.lang.Object r2 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl r2 = (com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl) r2
            dc.n.b(r9)
            goto L6c
        L40:
            dc.n.b(r9)
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r9 = r7.getLocalRepository()
            com.habitrpg.android.habitica.data.local.InventoryLocalRepository r9 = (com.habitrpg.android.habitica.data.local.InventoryLocalRepository) r9
            java.lang.String r2 = r8.getItemType()
            java.lang.String r5 = ""
            if (r2 != 0) goto L52
            r2 = r5
        L52:
            java.lang.String r6 = r8.getKey()
            if (r6 != 0) goto L59
            goto L5a
        L59:
            r5 = r6
        L5a:
            dd.g r9 = r9.getItem(r2, r5)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r9 = dd.i.x(r9, r0)
            if (r9 != r1) goto L6b
            return r1
        L6b:
            r2 = r7
        L6c:
            com.habitrpg.android.habitica.models.inventory.Item r9 = (com.habitrpg.android.habitica.models.inventory.Item) r9
            r4 = 0
            if (r9 != 0) goto L72
            return r4
        L72:
            r0.L$0 = r4
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r9 = r2.sellItem(r9, r8, r0)
            if (r9 != r1) goto L7f
            return r1
        L7f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl.sellItem(com.habitrpg.android.habitica.models.user.OwnedItem, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sellItem(com.habitrpg.android.habitica.models.inventory.Item r5, com.habitrpg.android.habitica.models.user.OwnedItem r6, kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.user.User> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$sellItem$3
            if (r0 == 0) goto L13
            r0 = r7
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$sellItem$3 r0 = (com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$sellItem$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$sellItem$3 r0 = new com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$sellItem$3
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl r5 = (com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl) r5
            dc.n.b(r7)
            goto L5e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            dc.n.b(r7)
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r7 = r4.getLocalRepository()
            com.habitrpg.android.habitica.data.local.InventoryLocalRepository r7 = (com.habitrpg.android.habitica.data.local.InventoryLocalRepository) r7
            com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$sellItem$4 r2 = new com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$sellItem$4
            r2.<init>(r4, r6)
            r7.executeTransaction(r2)
            com.habitrpg.android.habitica.data.ApiClient r6 = r4.getApiClient()
            java.lang.String r7 = r5.getType()
            java.lang.String r5 = r5.getKey()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r7 = r6.sellItem(r7, r5, r0)
            if (r7 != r1) goto L5d
            return r1
        L5d:
            r5 = r4
        L5e:
            com.habitrpg.android.habitica.models.user.User r7 = (com.habitrpg.android.habitica.models.user.User) r7
            if (r7 != 0) goto L64
            r5 = 0
            return r5
        L64:
            com.habitrpg.android.habitica.data.local.BaseLocalRepository r6 = r5.getLocalRepository()
            com.habitrpg.android.habitica.data.local.InventoryLocalRepository r6 = (com.habitrpg.android.habitica.data.local.InventoryLocalRepository) r6
            java.lang.String r5 = r5.getCurrentUserID()
            com.habitrpg.android.habitica.models.user.User r5 = r6.soldItem(r5, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl.sellItem(com.habitrpg.android.habitica.models.inventory.Item, com.habitrpg.android.habitica.models.user.OwnedItem, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
