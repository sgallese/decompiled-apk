package com.habitrpg.android.habitica.data.local.implementation;

import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.data.local.InventoryLocalRepository;
import com.habitrpg.android.habitica.models.inventory.Egg;
import com.habitrpg.android.habitica.models.inventory.Equipment;
import com.habitrpg.android.habitica.models.inventory.Food;
import com.habitrpg.android.habitica.models.inventory.HatchingPotion;
import com.habitrpg.android.habitica.models.inventory.Item;
import com.habitrpg.android.habitica.models.inventory.Mount;
import com.habitrpg.android.habitica.models.inventory.Pet;
import com.habitrpg.android.habitica.models.inventory.QuestContent;
import com.habitrpg.android.habitica.models.inventory.SpecialItem;
import com.habitrpg.android.habitica.models.shops.ShopItem;
import com.habitrpg.android.habitica.models.user.Items;
import com.habitrpg.android.habitica.models.user.OwnedItem;
import com.habitrpg.android.habitica.models.user.OwnedMount;
import com.habitrpg.android.habitica.models.user.OwnedPet;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import dc.w;
import dd.g;
import dd.h;
import dd.i;
import io.realm.RealmQuery;
import io.realm.d1;
import io.realm.g1;
import io.realm.j1;
import io.realm.o0;
import io.realm.x0;
import java.lang.reflect.GenericDeclaration;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import qc.q;

/* compiled from: RealmInventoryLocalRepository.kt */
/* loaded from: classes4.dex */
public final class RealmInventoryLocalRepository extends RealmContentLocalRepository implements InventoryLocalRepository {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealmInventoryLocalRepository(o0 o0Var) {
        super(o0Var);
        q.i(o0Var, "realm");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object changeOwnedCount(java.lang.String r5, java.lang.String r6, java.lang.String r7, int r8, kotlin.coroutines.Continuation<? super dc.w> r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$changeOwnedCount$1
            if (r0 == 0) goto L13
            r0 = r9
            com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$changeOwnedCount$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$changeOwnedCount$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$changeOwnedCount$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$changeOwnedCount$1
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r8 = r0.I$0
            java.lang.Object r5 = r0.L$0
            com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository r5 = (com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository) r5
            dc.n.b(r9)
            goto L4c
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            dc.n.b(r9)
            dd.g r5 = r4.getOwnedItem(r7, r5, r6, r3)
            r0.L$0 = r4
            r0.I$0 = r8
            r0.label = r3
            java.lang.Object r9 = dd.i.x(r5, r0)
            if (r9 != r1) goto L4b
            return r1
        L4b:
            r5 = r4
        L4c:
            com.habitrpg.android.habitica.models.user.OwnedItem r9 = (com.habitrpg.android.habitica.models.user.OwnedItem) r9
            if (r9 == 0) goto L57
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.b.d(r8)
            r5.changeOwnedCount(r9, r6)
        L57:
            dc.w r5 = dc.w.f13270a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository.changeOwnedCount(java.lang.String, java.lang.String, java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    public void decrementMysteryItemCount(User user) {
        x0<OwnedItem> x0Var;
        Items items;
        if (user == null) {
            return;
        }
        User user2 = (User) getLiveObject((RealmInventoryLocalRepository) user);
        OwnedItem ownedItem = null;
        if (user2 != null && (items = user2.getItems()) != null) {
            x0Var = items.getSpecial();
        } else {
            x0Var = null;
        }
        if (x0Var != null) {
            Iterator<OwnedItem> it = x0Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                OwnedItem next = it.next();
                if (q.d(next.getKey(), "inventory_present")) {
                    ownedItem = next;
                    break;
                }
            }
            ownedItem = ownedItem;
        }
        executeTransaction(new RealmInventoryLocalRepository$decrementMysteryItemCount$1(ownedItem, user2, user));
    }

    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    public void feedPet(String str, String str2, int i10, String str3) {
        Items items;
        x0<OwnedPet> pets;
        OwnedItem ownedItem;
        OwnedPet ownedPet;
        Items items2;
        x0<OwnedItem> food;
        q.i(str, "foodKey");
        q.i(str2, "petKey");
        q.i(str3, "userID");
        User user = (User) getRealm().k1(User.class).n("id", str3).q();
        if (user != null && (items = user.getItems()) != null && (pets = items.getPets()) != null) {
            Iterator<OwnedPet> it = pets.iterator();
            while (true) {
                ownedItem = null;
                if (it.hasNext()) {
                    ownedPet = it.next();
                    if (q.d(ownedPet.getKey(), str2)) {
                        break;
                    }
                } else {
                    ownedPet = null;
                    break;
                }
            }
            OwnedPet ownedPet2 = ownedPet;
            if (ownedPet2 != null && (items2 = user.getItems()) != null && (food = items2.getFood()) != null) {
                Iterator<OwnedItem> it2 = food.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    OwnedItem next = it2.next();
                    if (q.d(next.getKey(), str)) {
                        ownedItem = next;
                        break;
                    }
                }
                OwnedItem ownedItem2 = ownedItem;
                if (ownedItem2 != null) {
                    executeTransaction(new RealmInventoryLocalRepository$feedPet$1(ownedPet2, i10, ownedItem2, str2, user));
                }
            }
        }
    }

    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    public g<Integer> getArmoireRemainingCount() {
        g1 p10 = getRealm().k1(Equipment.class).n("klass", "armoire").b().l("owned", Boolean.FALSE).H().A("owned").j().p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        return new g<Integer>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getArmoireRemainingCount$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getArmoireRemainingCount$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getArmoireRemainingCount$$inlined$map$1$2", f = "RealmInventoryLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getArmoireRemainingCount$$inlined$map$1$2$1  reason: invalid class name */
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
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getArmoireRemainingCount$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getArmoireRemainingCount$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getArmoireRemainingCount$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getArmoireRemainingCount$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getArmoireRemainingCount$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L49
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        io.realm.g1 r5 = (io.realm.g1) r5
                        int r5 = r5.size()
                        java.lang.Integer r5 = kotlin.coroutines.jvm.internal.b.d(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L49
                        return r1
                    L49:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getArmoireRemainingCount$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super Integer> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }

    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    public g<List<Item>> getAvailableLimitedItems() {
        g1 p10 = getRealm().k1(Egg.class).C("event.start", new Date()).s("event.end", new Date()).p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        g<List<Item>> gVar = new g<List<Item>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getAvailableLimitedItems$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getAvailableLimitedItems$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getAvailableLimitedItems$$inlined$map$1$2", f = "RealmInventoryLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getAvailableLimitedItems$$inlined$map$1$2$1  reason: invalid class name */
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
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getAvailableLimitedItems$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getAvailableLimitedItems$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getAvailableLimitedItems$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getAvailableLimitedItems$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getAvailableLimitedItems$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L49
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        io.realm.g1 r5 = (io.realm.g1) r5
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r2.<init>()
                        r2.addAll(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r2, r0)
                        if (r5 != r1) goto L49
                        return r1
                    L49:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getAvailableLimitedItems$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super List<Item>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
        g1 p11 = getRealm().k1(Food.class).C("event.start", new Date()).s("event.end", new Date()).p();
        q.h(p11, "findAll(...)");
        g A = i.A(gVar, ac.c.a(p11), new RealmInventoryLocalRepository$getAvailableLimitedItems$2(null));
        g1 p12 = getRealm().k1(HatchingPotion.class).C("event.start", new Date()).s("event.end", new Date()).p();
        q.h(p12, "findAll(...)");
        g A2 = i.A(A, ac.c.a(p12), new RealmInventoryLocalRepository$getAvailableLimitedItems$3(null));
        g1 p13 = getRealm().k1(QuestContent.class).C("event.start", new Date()).s("event.end", new Date()).p();
        q.h(p13, "findAll(...)");
        return i.A(A2, ac.c.a(p13), new RealmInventoryLocalRepository$getAvailableLimitedItems$4(null));
    }

    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    public g<List<Equipment>> getEquipment(List<String> list) {
        q.i(list, "searchedKeys");
        g1 p10 = getRealm().k1(Equipment.class).v("key", (String[]) list.toArray(new String[0])).p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        return new g<g1<Equipment>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipment$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipment$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipment$$inlined$filter$1$2", f = "RealmInventoryLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipment$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
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
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipment$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipment$$inlined$filter$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipment$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipment$$inlined$filter$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipment$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        r2 = r5
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r2 = r2.isLoaded()
                        if (r2 == 0) goto L48
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipment$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<Equipment>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }

    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    public g<List<Equipment>> getEquipmentType(String str, String str2) {
        q.i(str, TaskFormActivity.TASK_TYPE_KEY);
        q.i(str2, "set");
        g1 p10 = getRealm().k1(Equipment.class).n(TaskFormActivity.TASK_TYPE_KEY, str).n("gearSet", str2).p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        return new g<g1<Equipment>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipmentType$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipmentType$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipmentType$$inlined$filter$1$2", f = "RealmInventoryLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipmentType$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
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
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipmentType$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipmentType$$inlined$filter$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipmentType$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipmentType$$inlined$filter$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipmentType$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        r2 = r5
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r2 = r2.isLoaded()
                        if (r2 == 0) goto L48
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipmentType$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<Equipment>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }

    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    public g<ShopItem> getInAppReward(String str) {
        q.i(str, "key");
        g1 p10 = getRealm().k1(ShopItem.class).n("key", str).p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        final g<g1<ShopItem>> gVar = new g<g1<ShopItem>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getInAppReward$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getInAppReward$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getInAppReward$$inlined$filter$1$2", f = "RealmInventoryLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getInAppReward$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
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
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getInAppReward$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getInAppReward$$inlined$filter$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getInAppReward$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getInAppReward$$inlined$filter$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getInAppReward$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        r2 = r5
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r2 = r2.isLoaded()
                        if (r2 == 0) goto L48
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getInAppReward$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<ShopItem>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
        return i.u(new g<ShopItem>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getInAppReward$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getInAppReward$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getInAppReward$$inlined$map$1$2", f = "RealmInventoryLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getInAppReward$$inlined$map$1$2$1  reason: invalid class name */
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

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getInAppReward$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getInAppReward$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getInAppReward$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getInAppReward$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getInAppReward$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L45
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        io.realm.g1 r5 = (io.realm.g1) r5
                        java.lang.Object r5 = ec.r.c0(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getInAppReward$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super ShopItem> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        });
    }

    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    public g<List<ShopItem>> getInAppRewards() {
        g1 p10 = getRealm().k1(ShopItem.class).p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        return new g<g1<ShopItem>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getInAppRewards$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getInAppRewards$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getInAppRewards$$inlined$filter$1$2", f = "RealmInventoryLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getInAppRewards$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
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
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getInAppRewards$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getInAppRewards$$inlined$filter$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getInAppRewards$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getInAppRewards$$inlined$filter$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getInAppRewards$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        r2 = r5
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r2 = r2.isLoaded()
                        if (r2 == 0) goto L48
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getInAppRewards$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<ShopItem>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }

    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    public g<Item> getItem(String str, String str2) {
        q.i(str, TaskFormActivity.TASK_TYPE_KEY);
        q.i(str2, "key");
        GenericDeclaration genericDeclaration = Egg.class;
        switch (str.hashCode()) {
            case -2008465223:
                if (str.equals("special")) {
                    genericDeclaration = SpecialItem.class;
                    break;
                }
                break;
            case -1623737538:
                if (str.equals("hatchingPotions")) {
                    genericDeclaration = HatchingPotion.class;
                    break;
                }
                break;
            case -948698159:
                if (str.equals("quests")) {
                    genericDeclaration = QuestContent.class;
                    break;
                }
                break;
            case 3111182:
                str.equals("eggs");
                break;
            case 3148894:
                if (str.equals("food")) {
                    genericDeclaration = Food.class;
                    break;
                }
                break;
        }
        g1 p10 = getRealm().k1(genericDeclaration).n("key", str2).p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        final g<g1<? extends d1>> gVar = new g<g1<? extends d1>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItem$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItem$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItem$$inlined$filter$1$2", f = "RealmInventoryLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItem$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
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
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItem$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItem$$inlined$filter$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItem$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItem$$inlined$filter$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItem$$inlined$filter$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r7)
                        goto L54
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        dc.n.b(r7)
                        dd.h r7 = r5.$this_unsafeFlow
                        r2 = r6
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r4 = r2.isLoaded()
                        if (r4 == 0) goto L48
                        boolean r2 = r2.isEmpty()
                        r2 = r2 ^ r3
                        if (r2 == 0) goto L48
                        r2 = 1
                        goto L49
                    L48:
                        r2 = 0
                    L49:
                        if (r2 == 0) goto L54
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L54
                        return r1
                    L54:
                        dc.w r6 = dc.w.f13270a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItem$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<? extends d1>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
        return i.u(new g<Item>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItem$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItem$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItem$$inlined$map$1$2", f = "RealmInventoryLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItem$$inlined$map$1$2$1  reason: invalid class name */
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
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItem$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItem$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItem$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItem$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItem$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L4d
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        io.realm.g1 r5 = (io.realm.g1) r5
                        java.lang.Object r5 = ec.r.c0(r5)
                        boolean r2 = r5 instanceof com.habitrpg.android.habitica.models.inventory.Item
                        if (r2 == 0) goto L43
                        com.habitrpg.android.habitica.models.inventory.Item r5 = (com.habitrpg.android.habitica.models.inventory.Item) r5
                        goto L44
                    L43:
                        r5 = 0
                    L44:
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4d
                        return r1
                    L4d:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItem$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super Item> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        });
    }

    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    public g<List<Item>> getItems(Class<? extends Item> cls) {
        q.i(cls, "itemClass");
        g1 p10 = getRealm().k1(cls).p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        return new g<g1<? extends Item>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItems$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItems$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItems$$inlined$filter$1$2", f = "RealmInventoryLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItems$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
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
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItems$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItems$$inlined$filter$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItems$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItems$$inlined$filter$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItems$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        r2 = r5
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r2 = r2.isLoaded()
                        if (r2 == 0) goto L48
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItems$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<? extends Item>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }

    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    public g<Equipment> getLatestMysteryItem() {
        g1 p10 = getRealm().k1(Equipment.class).d("key", "mystery_2").J("mystery", j1.DESCENDING).p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        final g<g1<Equipment>> gVar = new g<g1<Equipment>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getLatestMysteryItem$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getLatestMysteryItem$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getLatestMysteryItem$$inlined$filter$1$2", f = "RealmInventoryLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getLatestMysteryItem$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
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
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getLatestMysteryItem$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getLatestMysteryItem$$inlined$filter$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getLatestMysteryItem$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getLatestMysteryItem$$inlined$filter$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getLatestMysteryItem$$inlined$filter$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r7)
                        goto L53
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        dc.n.b(r7)
                        dd.h r7 = r5.$this_unsafeFlow
                        r2 = r6
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r4 = r2.isLoaded()
                        if (r4 == 0) goto L47
                        int r2 = r2.size()
                        if (r2 <= 0) goto L47
                        r2 = 1
                        goto L48
                    L47:
                        r2 = 0
                    L48:
                        if (r2 == 0) goto L53
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L53
                        return r1
                    L53:
                        dc.w r6 = dc.w.f13270a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getLatestMysteryItem$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<Equipment>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
        return new g<Equipment>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getLatestMysteryItem$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getLatestMysteryItem$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getLatestMysteryItem$$inlined$map$1$2", f = "RealmInventoryLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getLatestMysteryItem$$inlined$map$1$2$1  reason: invalid class name */
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

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
                    /*
                        r10 = this;
                        boolean r0 = r12 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getLatestMysteryItem$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r12
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getLatestMysteryItem$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getLatestMysteryItem$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getLatestMysteryItem$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getLatestMysteryItem$$inlined$map$1$2$1
                        r0.<init>(r12)
                    L18:
                        java.lang.Object r12 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r12)
                        goto L7b
                    L29:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r12)
                        throw r11
                    L31:
                        dc.n.b(r12)
                        dd.h r12 = r10.$this_unsafeFlow
                        io.realm.g1 r11 = (io.realm.g1) r11
                        java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
                        java.lang.String r4 = "yyyyMM"
                        java.util.Locale r5 = java.util.Locale.US
                        r2.<init>(r4, r5)
                        java.util.Iterator r11 = r11.iterator()
                    L45:
                        boolean r4 = r11.hasNext()
                        if (r4 == 0) goto L7e
                        java.lang.Object r4 = r11.next()
                        r5 = r4
                        com.habitrpg.android.habitica.models.inventory.Equipment r5 = (com.habitrpg.android.habitica.models.inventory.Equipment) r5
                        java.lang.String r5 = r5.getKey()
                        r6 = 0
                        if (r5 == 0) goto L70
                        java.util.Date r7 = new java.util.Date
                        r7.<init>()
                        java.lang.String r7 = r2.format(r7)
                        java.lang.String r8 = "format(...)"
                        qc.q.h(r7, r8)
                        r8 = 2
                        r9 = 0
                        boolean r5 = yc.m.K(r5, r7, r6, r8, r9)
                        if (r5 != r3) goto L70
                        r6 = 1
                    L70:
                        if (r6 == 0) goto L45
                        r0.label = r3
                        java.lang.Object r11 = r12.emit(r4, r0)
                        if (r11 != r1) goto L7b
                        return r1
                    L7b:
                        dc.w r11 = dc.w.f13270a
                        return r11
                    L7e:
                        java.util.NoSuchElementException r11 = new java.util.NoSuchElementException
                        java.lang.String r12 = "Collection contains no element matching the predicate."
                        r11.<init>(r12)
                        throw r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getLatestMysteryItem$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super Equipment> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }

    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    public OwnedItem getLiveObject(OwnedItem ownedItem) {
        q.i(ownedItem, "obj");
        if (isClosed()) {
            return null;
        }
        if (!ownedItem.isManaged()) {
            return ownedItem;
        }
        return (OwnedItem) getRealm().k1(OwnedItem.class).n("key", ownedItem.getKey()).n("itemType", ownedItem.getItemType()).q();
    }

    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    public g<List<Mount>> getMounts() {
        RealmQuery k12 = getRealm().k1(Mount.class);
        j1 j1Var = j1.ASCENDING;
        g1 p10 = k12.K(TaskFormActivity.TASK_TYPE_KEY, j1Var, "animal", j1Var).p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        return new g<g1<Mount>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getMounts$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getMounts$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getMounts$$inlined$filter$1$2", f = "RealmInventoryLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getMounts$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
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
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getMounts$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getMounts$$inlined$filter$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getMounts$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getMounts$$inlined$filter$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getMounts$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        r2 = r5
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r2 = r2.isLoaded()
                        if (r2 == 0) goto L48
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getMounts$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<Mount>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }

    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    public g<List<Equipment>> getOwnedEquipment(String str) {
        q.i(str, TaskFormActivity.TASK_TYPE_KEY);
        g1 p10 = getRealm().k1(Equipment.class).n(TaskFormActivity.TASK_TYPE_KEY, str).l("owned", Boolean.TRUE).p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        return new g<g1<Equipment>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedEquipment$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedEquipment$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedEquipment$$inlined$filter$1$2", f = "RealmInventoryLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedEquipment$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
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
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedEquipment$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedEquipment$$inlined$filter$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedEquipment$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedEquipment$$inlined$filter$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedEquipment$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        r2 = r5
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r2 = r2.isLoaded()
                        if (r2 == 0) goto L48
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedEquipment$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<Equipment>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }

    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    public g<OwnedItem> getOwnedItem(String str, final String str2, final String str3, final boolean z10) {
        q.i(str, "userID");
        q.i(str2, TaskFormActivity.TASK_TYPE_KEY);
        q.i(str3, "key");
        final g u10 = i.u(queryUser(str));
        final g<List<? extends OwnedItem>> gVar = new g<List<? extends OwnedItem>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItem$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItem$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ boolean $includeZero$inlined;
                final /* synthetic */ String $key$inlined;
                final /* synthetic */ h $this_unsafeFlow;
                final /* synthetic */ String $type$inlined;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItem$$inlined$map$1$2", f = "RealmInventoryLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItem$$inlined$map$1$2$1  reason: invalid class name */
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

                public AnonymousClass2(h hVar, String str, boolean z10, String str2) {
                    this.$this_unsafeFlow = hVar;
                    this.$type$inlined = str;
                    this.$includeZero$inlined = z10;
                    this.$key$inlined = str2;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
                    /*
                        Method dump skipped, instructions count: 272
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItem$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super List<? extends OwnedItem>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar, str2, z10, str3), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
        final g<List<? extends OwnedItem>> gVar2 = new g<List<? extends OwnedItem>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItem$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItem$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItem$$inlined$filter$1$2", f = "RealmInventoryLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItem$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
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
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItem$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItem$$inlined$filter$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItem$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItem$$inlined$filter$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItem$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L4b
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        r2 = r5
                        java.util.List r2 = (java.util.List) r2
                        java.util.Collection r2 = (java.util.Collection) r2
                        boolean r2 = r2.isEmpty()
                        r2 = r2 ^ r3
                        if (r2 == 0) goto L4b
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4b
                        return r1
                    L4b:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItem$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super List<? extends OwnedItem>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
        return new g<OwnedItem>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItem$$inlined$map$2

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItem$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItem$$inlined$map$2$2", f = "RealmInventoryLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItem$$inlined$map$2$2$1  reason: invalid class name */
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

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItem$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItem$$inlined$map$2$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItem$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItem$$inlined$map$2$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItem$$inlined$map$2$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L45
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        java.util.List r5 = (java.util.List) r5
                        java.lang.Object r5 = ec.r.a0(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItem$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super OwnedItem> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }

    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    public g<List<OwnedItem>> getOwnedItems(final String str, String str2, final boolean z10) {
        q.i(str, "itemType");
        q.i(str2, "userID");
        final g<User> queryUser = queryUser(str2);
        return new g<List<? extends OwnedItem>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItems$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItems$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ boolean $includeZero$inlined;
                final /* synthetic */ String $itemType$inlined;
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItems$$inlined$map$1$2", f = "RealmInventoryLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItems$$inlined$map$1$2$1  reason: invalid class name */
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

                public AnonymousClass2(h hVar, String str, boolean z10) {
                    this.$this_unsafeFlow = hVar;
                    this.$itemType$inlined = str;
                    this.$includeZero$inlined = z10;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                    /*
                        Method dump skipped, instructions count: 270
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItems$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super List<? extends OwnedItem>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar, str, z10), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }

    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    public g<List<OwnedMount>> getOwnedMounts(String str) {
        q.i(str, "userID");
        final g<User> queryUser = queryUser(str);
        return new g<List<? extends OwnedMount>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedMounts$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedMounts$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedMounts$$inlined$map$1$2", f = "RealmInventoryLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedMounts$$inlined$map$1$2$1  reason: invalid class name */
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
                public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedMounts$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedMounts$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedMounts$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedMounts$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedMounts$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r8)
                        goto L78
                    L29:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L31:
                        dc.n.b(r8)
                        dd.h r8 = r6.$this_unsafeFlow
                        com.habitrpg.android.habitica.models.user.User r7 = (com.habitrpg.android.habitica.models.user.User) r7
                        if (r7 == 0) goto L6b
                        com.habitrpg.android.habitica.models.user.Items r7 = r7.getItems()
                        if (r7 == 0) goto L6b
                        io.realm.x0 r7 = r7.getMounts()
                        if (r7 == 0) goto L6b
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r2.<init>()
                        java.util.Iterator r7 = r7.iterator()
                    L4f:
                        boolean r4 = r7.hasNext()
                        if (r4 == 0) goto L6f
                        java.lang.Object r4 = r7.next()
                        r5 = r4
                        com.habitrpg.android.habitica.models.user.OwnedMount r5 = (com.habitrpg.android.habitica.models.user.OwnedMount) r5
                        boolean r5 = r5.getOwned()
                        if (r5 != r3) goto L64
                        r5 = 1
                        goto L65
                    L64:
                        r5 = 0
                    L65:
                        if (r5 == 0) goto L4f
                        r2.add(r4)
                        goto L4f
                    L6b:
                        java.util.List r2 = ec.r.i()
                    L6f:
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r2, r0)
                        if (r7 != r1) goto L78
                        return r1
                    L78:
                        dc.w r7 = dc.w.f13270a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedMounts$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super List<? extends OwnedMount>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }

    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    public g<List<OwnedPet>> getOwnedPets(String str) {
        q.i(str, "userID");
        g1 p10 = getRealm().k1(User.class).n("id", str).p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        final g<g1<User>> gVar = new g<g1<User>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedPets$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedPets$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedPets$$inlined$filter$1$2", f = "RealmInventoryLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedPets$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
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
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedPets$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedPets$$inlined$filter$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedPets$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedPets$$inlined$filter$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedPets$$inlined$filter$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r7)
                        goto L59
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        dc.n.b(r7)
                        dd.h r7 = r5.$this_unsafeFlow
                        r2 = r6
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r4 = r2.isLoaded()
                        if (r4 == 0) goto L4d
                        boolean r4 = r2.isValid()
                        if (r4 == 0) goto L4d
                        boolean r2 = r2.isEmpty()
                        if (r2 != 0) goto L4d
                        r2 = 1
                        goto L4e
                    L4d:
                        r2 = 0
                    L4e:
                        if (r2 == 0) goto L59
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L59
                        return r1
                    L59:
                        dc.w r6 = dc.w.f13270a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedPets$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<User>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
        return new g<List<? extends OwnedPet>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedPets$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedPets$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedPets$$inlined$map$1$2", f = "RealmInventoryLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedPets$$inlined$map$1$2$1  reason: invalid class name */
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
                public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedPets$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedPets$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedPets$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedPets$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedPets$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r8)
                        goto L7e
                    L29:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L31:
                        dc.n.b(r8)
                        dd.h r8 = r6.$this_unsafeFlow
                        io.realm.g1 r7 = (io.realm.g1) r7
                        java.lang.Object r7 = r7.first()
                        com.habitrpg.android.habitica.models.user.User r7 = (com.habitrpg.android.habitica.models.user.User) r7
                        if (r7 == 0) goto L71
                        com.habitrpg.android.habitica.models.user.Items r7 = r7.getItems()
                        if (r7 == 0) goto L71
                        io.realm.x0 r7 = r7.getPets()
                        if (r7 == 0) goto L71
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r2.<init>()
                        java.util.Iterator r7 = r7.iterator()
                    L55:
                        boolean r4 = r7.hasNext()
                        if (r4 == 0) goto L75
                        java.lang.Object r4 = r7.next()
                        r5 = r4
                        com.habitrpg.android.habitica.models.user.OwnedPet r5 = (com.habitrpg.android.habitica.models.user.OwnedPet) r5
                        int r5 = r5.getTrained()
                        if (r5 <= 0) goto L6a
                        r5 = 1
                        goto L6b
                    L6a:
                        r5 = 0
                    L6b:
                        if (r5 == 0) goto L55
                        r2.add(r4)
                        goto L55
                    L71:
                        java.util.List r2 = ec.r.i()
                    L75:
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r2, r0)
                        if (r7 != r1) goto L7e
                        return r1
                    L7e:
                        dc.w r7 = dc.w.f13270a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedPets$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super List<? extends OwnedPet>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }

    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    public g<List<Pet>> getPets() {
        RealmQuery k12 = getRealm().k1(Pet.class);
        j1 j1Var = j1.ASCENDING;
        g1 p10 = k12.K(TaskFormActivity.TASK_TYPE_KEY, j1Var, "animal", j1Var).p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        return new g<g1<Pet>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getPets$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getPets$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getPets$$inlined$filter$1$2", f = "RealmInventoryLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getPets$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
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
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getPets$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getPets$$inlined$filter$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getPets$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getPets$$inlined$filter$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getPets$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        r2 = r5
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r2 = r2.isLoaded()
                        if (r2 == 0) goto L48
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getPets$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<Pet>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }

    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    public g<List<QuestContent>> getQuestContent(List<String> list) {
        q.i(list, "keys");
        g1 p10 = getRealm().k1(QuestContent.class).v("key", (String[]) list.toArray(new String[0])).p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        return new g<g1<QuestContent>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getQuestContent$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getQuestContent$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getQuestContent$$inlined$filter$1$2", f = "RealmInventoryLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getQuestContent$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
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
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getQuestContent$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getQuestContent$$inlined$filter$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getQuestContent$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getQuestContent$$inlined$filter$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getQuestContent$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        r2 = r5
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r2 = r2.isLoaded()
                        if (r2 == 0) goto L48
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getQuestContent$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<QuestContent>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }

    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    public void hatchPet(String str, String str2, String str3) {
        Items items;
        x0<OwnedItem> eggs;
        OwnedItem ownedItem;
        OwnedItem ownedItem2;
        Items items2;
        x0<OwnedItem> hatchingPotions;
        q.i(str, "eggKey");
        q.i(str2, "potionKey");
        q.i(str3, "userID");
        OwnedPet ownedPet = new OwnedPet();
        ownedPet.setKey(str + "-" + str2);
        ownedPet.setTrained(5);
        User user = (User) getRealm().k1(User.class).n("id", str3).q();
        if (user != null && (items = user.getItems()) != null && (eggs = items.getEggs()) != null) {
            Iterator<OwnedItem> it = eggs.iterator();
            while (true) {
                ownedItem = null;
                if (it.hasNext()) {
                    ownedItem2 = it.next();
                    if (q.d(ownedItem2.getKey(), str)) {
                        break;
                    }
                } else {
                    ownedItem2 = null;
                    break;
                }
            }
            OwnedItem ownedItem3 = ownedItem2;
            if (ownedItem3 != null && (items2 = user.getItems()) != null && (hatchingPotions = items2.getHatchingPotions()) != null) {
                Iterator<OwnedItem> it2 = hatchingPotions.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    OwnedItem next = it2.next();
                    if (q.d(next.getKey(), str2)) {
                        ownedItem = next;
                        break;
                    }
                }
                OwnedItem ownedItem4 = ownedItem;
                if (ownedItem4 != null) {
                    executeTransaction(new RealmInventoryLocalRepository$hatchPet$1(ownedItem3, ownedItem4, user, ownedPet));
                }
            }
        }
    }

    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    public void save(Items items, String str) {
        q.i(items, NavigationDrawerFragment.SIDEBAR_ITEMS);
        q.i(str, "userID");
        User user = (User) getRealm().k1(User.class).n("id", str).q();
        if (user == null) {
            return;
        }
        items.setItemTypes();
        executeTransaction(new RealmInventoryLocalRepository$save$1(user, items));
    }

    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    public void saveInAppRewards(List<? extends ShopItem> list) {
        q.i(list, "onlineItems");
        executeTransaction(new RealmInventoryLocalRepository$saveInAppRewards$1(getRealm().k1(ShopItem.class).p().a(), list, this));
    }

    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    public User soldItem(String str, User user) {
        q.i(str, "userID");
        q.i(user, "updatedUser");
        User user2 = (User) getRealm().k1(User.class).n("id", str).q();
        if (user2 == null) {
            return user;
        }
        executeTransaction(new RealmInventoryLocalRepository$soldItem$1(user, user2));
        return user2;
    }

    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    public void unhatchPet(String str, String str2, String str3) {
        Items items;
        x0<OwnedItem> eggs;
        OwnedItem ownedItem;
        OwnedItem ownedItem2;
        Items items2;
        x0<OwnedItem> hatchingPotions;
        q.i(str, "eggKey");
        q.i(str2, "potionKey");
        q.i(str3, "userID");
        OwnedPet ownedPet = (OwnedPet) getRealm().k1(OwnedPet.class).n("key", str + "-" + str2).q();
        User user = (User) getRealm().k1(User.class).n("id", str3).q();
        if (user != null && (items = user.getItems()) != null && (eggs = items.getEggs()) != null) {
            Iterator<OwnedItem> it = eggs.iterator();
            while (true) {
                ownedItem = null;
                if (it.hasNext()) {
                    ownedItem2 = it.next();
                    if (q.d(ownedItem2.getKey(), str)) {
                        break;
                    }
                } else {
                    ownedItem2 = null;
                    break;
                }
            }
            OwnedItem ownedItem3 = ownedItem2;
            if (ownedItem3 != null && (items2 = user.getItems()) != null && (hatchingPotions = items2.getHatchingPotions()) != null) {
                Iterator<OwnedItem> it2 = hatchingPotions.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    OwnedItem next = it2.next();
                    if (q.d(next.getKey(), str2)) {
                        ownedItem = next;
                        break;
                    }
                }
                OwnedItem ownedItem4 = ownedItem;
                if (ownedItem4 != null) {
                    executeTransaction(new RealmInventoryLocalRepository$unhatchPet$1(ownedItem3, ownedItem4, user, ownedPet));
                }
            }
        }
    }

    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    public void updateOwnedEquipment(User user) {
        q.i(user, "user");
    }

    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    public g<List<Item>> getItems(Class<? extends Item> cls, String[] strArr) {
        q.i(cls, "itemClass");
        q.i(strArr, "keys");
        g1 p10 = getRealm().k1(cls).v("key", strArr).p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        return new g<g1<? extends Item>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItems$$inlined$filter$2

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItems$$inlined$filter$2$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItems$$inlined$filter$2$2", f = "RealmInventoryLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItems$$inlined$filter$2$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
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
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItems$$inlined$filter$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItems$$inlined$filter$2$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItems$$inlined$filter$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItems$$inlined$filter$2$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItems$$inlined$filter$2$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        r2 = r5
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r2 = r2.isLoaded()
                        if (r2 == 0) goto L48
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getItems$$inlined$filter$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<? extends Item>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }

    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    public g<Map<String, OwnedItem>> getOwnedItems(String str, final boolean z10) {
        q.i(str, "userID");
        final g u10 = i.u(queryUser(str));
        return new g<Map<String, ? extends OwnedItem>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItems$$inlined$map$2

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItems$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ boolean $includeZero$inlined;
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItems$$inlined$map$2$2", f = "RealmInventoryLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItems$$inlined$map$2$2$1  reason: invalid class name */
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

                public AnonymousClass2(h hVar, boolean z10) {
                    this.$this_unsafeFlow = hVar;
                    this.$includeZero$inlined = z10;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
                    /*
                        Method dump skipped, instructions count: 380
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedItems$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super Map<String, ? extends OwnedItem>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar, z10), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }

    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    public void changeOwnedCount(OwnedItem ownedItem, Integer num) {
        q.i(ownedItem, "item");
        OwnedItem liveObject = getLiveObject(ownedItem);
        if (liveObject == null || num == null) {
            return;
        }
        executeTransaction(new RealmInventoryLocalRepository$changeOwnedCount$2$1(liveObject, num.intValue()));
    }

    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    public g<List<Mount>> getMounts(String str, String str2, String str3) {
        RealmQuery k12 = getRealm().k1(Mount.class);
        j1 j1Var = j1.ASCENDING;
        RealmQuery K = k12.K(TaskFormActivity.TASK_TYPE_KEY, j1Var, str3 == null ? "color" : "animal", j1Var);
        if (str != null) {
            K = K.n("animal", str);
        }
        if (str2 != null) {
            K = K.n(TaskFormActivity.TASK_TYPE_KEY, str2);
        }
        if (str3 != null) {
            K = K.n("color", str3);
        }
        g1 p10 = K.p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        return new g<g1<Mount>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getMounts$$inlined$filter$2

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getMounts$$inlined$filter$2$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getMounts$$inlined$filter$2$2", f = "RealmInventoryLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getMounts$$inlined$filter$2$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
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
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getMounts$$inlined$filter$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getMounts$$inlined$filter$2$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getMounts$$inlined$filter$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getMounts$$inlined$filter$2$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getMounts$$inlined$filter$2$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        r2 = r5
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r2 = r2.isLoaded()
                        if (r2 == 0) goto L48
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getMounts$$inlined$filter$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<Mount>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }

    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    public g<List<Pet>> getPets(String str, String str2, String str3) {
        RealmQuery k12 = getRealm().k1(Pet.class);
        j1 j1Var = j1.ASCENDING;
        RealmQuery K = k12.K(TaskFormActivity.TASK_TYPE_KEY, j1Var, str3 == null ? "color" : "animal", j1Var);
        if (str != null) {
            K = K.n("animal", str);
        }
        if (str2 != null) {
            K = K.n(TaskFormActivity.TASK_TYPE_KEY, str2);
        }
        if (str3 != null) {
            K = K.n("color", str3);
        }
        g1 p10 = K.p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        return new g<g1<Pet>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getPets$$inlined$filter$2

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getPets$$inlined$filter$2$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getPets$$inlined$filter$2$2", f = "RealmInventoryLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getPets$$inlined$filter$2$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
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
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getPets$$inlined$filter$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getPets$$inlined$filter$2$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getPets$$inlined$filter$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getPets$$inlined$filter$2$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getPets$$inlined$filter$2$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        r2 = r5
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r2 = r2.isLoaded()
                        if (r2 == 0) goto L48
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getPets$$inlined$filter$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<Pet>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }

    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    public g<List<Equipment>> getOwnedEquipment() {
        g1 p10 = getRealm().k1(Equipment.class).l("owned", Boolean.TRUE).p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        return new g<g1<Equipment>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedEquipment$$inlined$filter$2

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedEquipment$$inlined$filter$2$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedEquipment$$inlined$filter$2$2", f = "RealmInventoryLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedEquipment$$inlined$filter$2$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
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
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedEquipment$$inlined$filter$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedEquipment$$inlined$filter$2$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedEquipment$$inlined$filter$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedEquipment$$inlined$filter$2$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedEquipment$$inlined$filter$2$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        r2 = r5
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r2 = r2.isLoaded()
                        if (r2 == 0) goto L48
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getOwnedEquipment$$inlined$filter$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<Equipment>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }

    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    public g<Equipment> getEquipment(String str) {
        q.i(str, "key");
        g1 p10 = getRealm().k1(Equipment.class).n("key", str).p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        final g<g1<Equipment>> gVar = new g<g1<Equipment>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipment$$inlined$filter$2

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipment$$inlined$filter$2$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipment$$inlined$filter$2$2", f = "RealmInventoryLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipment$$inlined$filter$2$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
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
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipment$$inlined$filter$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipment$$inlined$filter$2$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipment$$inlined$filter$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipment$$inlined$filter$2$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipment$$inlined$filter$2$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r7)
                        goto L54
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        dc.n.b(r7)
                        dd.h r7 = r5.$this_unsafeFlow
                        r2 = r6
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r4 = r2.isLoaded()
                        if (r4 == 0) goto L48
                        boolean r2 = r2.isEmpty()
                        r2 = r2 ^ r3
                        if (r2 == 0) goto L48
                        r2 = 1
                        goto L49
                    L48:
                        r2 = 0
                    L49:
                        if (r2 == 0) goto L54
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L54
                        return r1
                    L54:
                        dc.w r6 = dc.w.f13270a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipment$$inlined$filter$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<Equipment>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
        return i.u(new g<Equipment>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipment$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipment$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipment$$inlined$map$1$2", f = "RealmInventoryLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipment$$inlined$map$1$2$1  reason: invalid class name */
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

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipment$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipment$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipment$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipment$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipment$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L45
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        io.realm.g1 r5 = (io.realm.g1) r5
                        java.lang.Object r5 = r5.first()
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getEquipment$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super Equipment> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        });
    }

    @Override // com.habitrpg.android.habitica.data.local.InventoryLocalRepository
    public g<QuestContent> getQuestContent(String str) {
        q.i(str, "key");
        g1 p10 = getRealm().k1(QuestContent.class).n("key", str).p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        final g<g1<QuestContent>> gVar = new g<g1<QuestContent>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getQuestContent$$inlined$filter$2

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getQuestContent$$inlined$filter$2$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getQuestContent$$inlined$filter$2$2", f = "RealmInventoryLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getQuestContent$$inlined$filter$2$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
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
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getQuestContent$$inlined$filter$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getQuestContent$$inlined$filter$2$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getQuestContent$$inlined$filter$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getQuestContent$$inlined$filter$2$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getQuestContent$$inlined$filter$2$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r7)
                        goto L59
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        dc.n.b(r7)
                        dd.h r7 = r5.$this_unsafeFlow
                        r2 = r6
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r4 = r2.isLoaded()
                        if (r4 == 0) goto L4d
                        boolean r4 = r2.isValid()
                        if (r4 == 0) goto L4d
                        boolean r2 = r2.isEmpty()
                        if (r2 != 0) goto L4d
                        r2 = 1
                        goto L4e
                    L4d:
                        r2 = 0
                    L4e:
                        if (r2 == 0) goto L59
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L59
                        return r1
                    L59:
                        dc.w r6 = dc.w.f13270a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getQuestContent$$inlined$filter$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super g1<QuestContent>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
        return new g<QuestContent>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getQuestContent$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getQuestContent$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements h {
                final /* synthetic */ h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getQuestContent$$inlined$map$1$2", f = "RealmInventoryLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getQuestContent$$inlined$map$1$2$1  reason: invalid class name */
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

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getQuestContent$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getQuestContent$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getQuestContent$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getQuestContent$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getQuestContent$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L45
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        io.realm.g1 r5 = (io.realm.g1) r5
                        java.lang.Object r5 = r5.first()
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository$getQuestContent$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(h<? super QuestContent> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }
}
