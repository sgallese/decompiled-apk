package com.habitrpg.android.habitica.ui.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.f0;
import androidx.lifecycle.m;
import androidx.lifecycle.n0;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.models.inventory.Egg;
import com.habitrpg.android.habitica.models.inventory.Item;
import com.habitrpg.android.habitica.models.inventory.Mount;
import com.habitrpg.android.habitica.models.user.OwnedItem;
import com.habitrpg.android.habitica.models.user.OwnedMount;
import com.habitrpg.android.habitica.models.user.OwnedPet;
import com.habitrpg.android.habitica.ui.fragments.inventory.stable.StableRecyclerFragment;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import dc.w;
import dd.g;
import dd.h;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import qc.q;

/* compiled from: StableViewModel.kt */
/* loaded from: classes4.dex */
public final class StableViewModel extends BaseViewModel {
    public static final int $stable = 8;
    private final f0<List<Object>> _items;
    private final f0<Map<String, OwnedMount>> _ownedMounts;
    private final f0<Map<String, OwnedPet>> _ownedPets;
    private final LiveData<Map<String, Egg>> eggs;
    private final InventoryRepository inventoryRepository;
    private final String itemType;
    private final LiveData<List<Object>> items;
    private final LiveData<List<Mount>> mounts;
    private final LiveData<Map<String, OwnedItem>> ownedItems;
    private final LiveData<Map<String, OwnedMount>> ownedMounts;
    private final LiveData<Map<String, OwnedPet>> ownedPets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StableViewModel(n0 n0Var, UserRepository userRepository, MainUserViewModel mainUserViewModel, InventoryRepository inventoryRepository) {
        super(userRepository, mainUserViewModel);
        q.i(n0Var, "savedStateHandle");
        q.i(userRepository, "userRepository");
        q.i(mainUserViewModel, "userViewModel");
        q.i(inventoryRepository, "inventoryRepository");
        this.inventoryRepository = inventoryRepository;
        this.itemType = (String) n0Var.f(StableRecyclerFragment.ITEM_TYPE_KEY);
        f0<List<Object>> f0Var = new f0<>();
        this._items = f0Var;
        this.items = f0Var;
        final g<List<Item>> items = inventoryRepository.getItems(Egg.class);
        this.eggs = m.c(new g<Map<String, Egg>>() { // from class: com.habitrpg.android.habitica.ui.viewmodels.StableViewModel$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.ui.viewmodels.StableViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.ui.viewmodels.StableViewModel$special$$inlined$map$1$2", f = "StableViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.ui.viewmodels.StableViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(h hVar) {
                    this.$this_unsafeFlow = hVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof com.habitrpg.android.habitica.ui.viewmodels.StableViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r9
                        com.habitrpg.android.habitica.ui.viewmodels.StableViewModel$special$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.ui.viewmodels.StableViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.ui.viewmodels.StableViewModel$special$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.ui.viewmodels.StableViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r9)
                    L18:
                        java.lang.Object r9 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r9)
                        goto L67
                    L29:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r9)
                        throw r8
                    L31:
                        dc.n.b(r9)
                        dd.h r9 = r7.$this_unsafeFlow
                        java.util.List r8 = (java.util.List) r8
                        java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                        r2.<init>()
                        java.lang.Iterable r8 = (java.lang.Iterable) r8
                        java.util.Iterator r8 = r8.iterator()
                    L43:
                        boolean r4 = r8.hasNext()
                        if (r4 == 0) goto L5e
                        java.lang.Object r4 = r8.next()
                        com.habitrpg.android.habitica.models.inventory.Item r4 = (com.habitrpg.android.habitica.models.inventory.Item) r4
                        java.lang.String r5 = r4.getKey()
                        java.lang.String r6 = "null cannot be cast to non-null type com.habitrpg.android.habitica.models.inventory.Egg"
                        qc.q.g(r4, r6)
                        com.habitrpg.android.habitica.models.inventory.Egg r4 = (com.habitrpg.android.habitica.models.inventory.Egg) r4
                        r2.put(r5, r4)
                        goto L43
                    L5e:
                        r0.label = r3
                        java.lang.Object r8 = r9.emit(r2, r0)
                        if (r8 != r1) goto L67
                        return r1
                    L67:
                        dc.w r8 = dc.w.f13270a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.viewmodels.StableViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super Map<String, Egg>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        }, null, 0L, 3, null);
        this.ownedItems = m.c(inventoryRepository.getOwnedItems(true), null, 0L, 3, null);
        this.mounts = m.c(inventoryRepository.getMounts(), null, 0L, 3, null);
        f0<Map<String, OwnedPet>> f0Var2 = new f0<>();
        this._ownedPets = f0Var2;
        this.ownedPets = f0Var2;
        f0<Map<String, OwnedMount>> f0Var3 = new f0<>();
        this._ownedMounts = f0Var3;
        this.ownedMounts = f0Var3;
        loadItems();
    }

    private final void loadItems() {
        ExceptionHandlerKt.launchCatching$default(w0.a(this), null, new StableViewModel$loadItems$1(this, null), 1, null);
        ExceptionHandlerKt.launchCatching$default(w0.a(this), null, new StableViewModel$loadItems$2(this, null), 1, null);
        ExceptionHandlerKt.launchCatching$default(w0.a(this), null, new StableViewModel$loadItems$3(this, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0157, code lost:
    
        if (r5 > 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0178, code lost:
    
        if (r5.getOwned() == true) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x017a, code lost:
    
        r8 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList<java.lang.Object> mapAnimals(java.util.List<? extends com.habitrpg.android.habitica.models.inventory.Animal> r14, java.util.Map<java.lang.String, ? extends com.habitrpg.android.habitica.models.user.OwnedObject> r15) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.viewmodels.StableViewModel.mapAnimals(java.util.List, java.util.Map):java.util.ArrayList");
    }

    public final LiveData<Map<String, Egg>> getEggs() {
        return this.eggs;
    }

    public final InventoryRepository getInventoryRepository() {
        return this.inventoryRepository;
    }

    public final String getItemType$Habitica_2311256681_prodRelease() {
        return this.itemType;
    }

    public final LiveData<List<Object>> getItems() {
        return this.items;
    }

    public final LiveData<List<Mount>> getMounts() {
        return this.mounts;
    }

    public final LiveData<Map<String, OwnedItem>> getOwnedItems() {
        return this.ownedItems;
    }

    public final LiveData<Map<String, OwnedMount>> getOwnedMounts() {
        return this.ownedMounts;
    }

    public final LiveData<Map<String, OwnedPet>> getOwnedPets() {
        return this.ownedPets;
    }
}
