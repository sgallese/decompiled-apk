package com.habitrpg.android.habitica.ui.fragments.inventory.items;

import ad.k0;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.models.inventory.Item;
import com.habitrpg.android.habitica.models.user.OwnedItem;
import com.habitrpg.android.habitica.ui.adapter.inventory.ItemRecyclerAdapter;
import dc.n;
import dc.w;
import dd.g;
import dd.h;
import dd.i;
import ec.t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ItemDialogFragment.kt */
@f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment$loadItems$1$1", f = "ItemDialogFragment.kt", l = {315}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ItemDialogFragment$loadItems$1$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ Class<? extends Item> $itemClass;
    final /* synthetic */ String $type;
    int label;
    final /* synthetic */ ItemDialogFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ItemDialogFragment.kt */
    @f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment$loadItems$1$1$1", f = "ItemDialogFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment$loadItems$1$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends l implements p<List<? extends OwnedItem>, Continuation<? super w>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ItemDialogFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ItemDialogFragment itemDialogFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = itemDialogFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            ic.d.d();
            if (this.label == 0) {
                n.b(obj);
                List list = (List) this.L$0;
                if (this.this$0.isFeeding()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        if ((!q.d(((OwnedItem) obj2).getKey(), "Saddle")) != false) {
                            arrayList2.add(obj2);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    arrayList = new ArrayList();
                    for (Object obj3 : arrayList2) {
                        if (hashSet.add(((OwnedItem) obj3).getKey())) {
                            arrayList.add(obj3);
                        }
                    }
                } else {
                    HashSet hashSet2 = new HashSet();
                    arrayList = new ArrayList();
                    for (Object obj4 : list) {
                        if (hashSet2.add(((OwnedItem) obj4).getKey())) {
                            arrayList.add(obj4);
                        }
                    }
                }
                ItemRecyclerAdapter adapter = this.this$0.getAdapter();
                if (adapter != null) {
                    adapter.setData(arrayList);
                }
                return w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // pc.p
        public final Object invoke(List<? extends OwnedItem> list, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(list, continuation)).invokeSuspend(w.f13270a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemDialogFragment$loadItems$1$1(ItemDialogFragment itemDialogFragment, String str, Class<? extends Item> cls, Continuation<? super ItemDialogFragment$loadItems$1$1> continuation) {
        super(2, continuation);
        this.this$0 = itemDialogFragment;
        this.$type = str;
        this.$itemClass = cls;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new ItemDialogFragment$loadItems$1$1(this.this$0, this.$type, this.$itemClass, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((ItemDialogFragment$loadItems$1$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            final g J = i.J(InventoryRepository.DefaultImpls.getOwnedItems$default(this.this$0.getInventoryRepository(), this.$type, false, 2, null), new AnonymousClass1(this.this$0, null));
            final g<List<? extends String>> gVar = new g<List<? extends String>>() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment$loadItems$1$1$invokeSuspend$$inlined$map$1

                /* compiled from: Emitters.kt */
                /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment$loadItems$1$1$invokeSuspend$$inlined$map$1$2  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements h {
                    final /* synthetic */ h $this_unsafeFlow;

                    /* compiled from: Emitters.kt */
                    @f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment$loadItems$1$1$invokeSuspend$$inlined$map$1$2", f = "ItemDialogFragment.kt", l = {223}, m = "emit")
                    /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment$loadItems$1$1$invokeSuspend$$inlined$map$1$2$1  reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
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
                    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                        /*
                            r5 = this;
                            boolean r0 = r7 instanceof com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment$loadItems$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r7
                            com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment$loadItems$1$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment$loadItems$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment$loadItems$1$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment$loadItems$1$1$invokeSuspend$$inlined$map$1$2$1
                            r0.<init>(r7)
                        L18:
                            java.lang.Object r7 = r0.result
                            java.lang.Object r1 = ic.b.d()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            dc.n.b(r7)
                            goto L62
                        L29:
                            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                            r6.<init>(r7)
                            throw r6
                        L31:
                            dc.n.b(r7)
                            dd.h r7 = r5.$this_unsafeFlow
                            java.util.List r6 = (java.util.List) r6
                            java.lang.Iterable r6 = (java.lang.Iterable) r6
                            java.util.ArrayList r2 = new java.util.ArrayList
                            r2.<init>()
                            java.util.Iterator r6 = r6.iterator()
                        L43:
                            boolean r4 = r6.hasNext()
                            if (r4 == 0) goto L59
                            java.lang.Object r4 = r6.next()
                            com.habitrpg.android.habitica.models.user.OwnedItem r4 = (com.habitrpg.android.habitica.models.user.OwnedItem) r4
                            java.lang.String r4 = r4.getKey()
                            if (r4 == 0) goto L43
                            r2.add(r4)
                            goto L43
                        L59:
                            r0.label = r3
                            java.lang.Object r6 = r7.emit(r2, r0)
                            if (r6 != r1) goto L62
                            return r1
                        L62:
                            dc.w r6 = dc.w.f13270a
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment$loadItems$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // dd.g
                public Object collect(h<? super List<? extends String>> hVar, Continuation continuation) {
                    Object d11;
                    Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                    d11 = ic.d.d();
                    if (collect == d11) {
                        return collect;
                    }
                    return w.f13270a;
                }
            };
            final ItemDialogFragment itemDialogFragment = this.this$0;
            final Class<? extends Item> cls = this.$itemClass;
            g<List<? extends Item>> gVar2 = new g<List<? extends Item>>() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment$loadItems$1$1$invokeSuspend$$inlined$map$2

                /* compiled from: Emitters.kt */
                /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment$loadItems$1$1$invokeSuspend$$inlined$map$2$2  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements h {
                    final /* synthetic */ Class $itemClass$inlined;
                    final /* synthetic */ h $this_unsafeFlow;
                    final /* synthetic */ ItemDialogFragment this$0;

                    /* compiled from: Emitters.kt */
                    @f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment$loadItems$1$1$invokeSuspend$$inlined$map$2$2", f = "ItemDialogFragment.kt", l = {224, 223}, m = "emit")
                    /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment$loadItems$1$1$invokeSuspend$$inlined$map$2$2$1  reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
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

                    public AnonymousClass2(h hVar, ItemDialogFragment itemDialogFragment, Class cls) {
                        this.$this_unsafeFlow = hVar;
                        this.this$0 = itemDialogFragment;
                        this.$itemClass$inlined = cls;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
                    /* JADX WARN: Removed duplicated region for block: B:22:0x0073 A[RETURN] */
                    @Override // dd.h
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
                        /*
                            r8 = this;
                            boolean r0 = r10 instanceof com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment$loadItems$1$1$invokeSuspend$$inlined$map$2.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r10
                            com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment$loadItems$1$1$invokeSuspend$$inlined$map$2$2$1 r0 = (com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment$loadItems$1$1$invokeSuspend$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment$loadItems$1$1$invokeSuspend$$inlined$map$2$2$1 r0 = new com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment$loadItems$1$1$invokeSuspend$$inlined$map$2$2$1
                            r0.<init>(r10)
                        L18:
                            java.lang.Object r10 = r0.result
                            java.lang.Object r1 = ic.b.d()
                            int r2 = r0.label
                            r3 = 2
                            r4 = 1
                            if (r2 == 0) goto L3c
                            if (r2 == r4) goto L34
                            if (r2 != r3) goto L2c
                            dc.n.b(r10)
                            goto L74
                        L2c:
                            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                            r9.<init>(r10)
                            throw r9
                        L34:
                            java.lang.Object r9 = r0.L$0
                            dd.h r9 = (dd.h) r9
                            dc.n.b(r10)
                            goto L68
                        L3c:
                            dc.n.b(r10)
                            dd.h r10 = r8.$this_unsafeFlow
                            java.util.List r9 = (java.util.List) r9
                            com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment r2 = r8.this$0
                            com.habitrpg.android.habitica.data.InventoryRepository r2 = r2.getInventoryRepository()
                            java.lang.Class r5 = r8.$itemClass$inlined
                            java.util.Collection r9 = (java.util.Collection) r9
                            r6 = 0
                            java.lang.String[] r6 = new java.lang.String[r6]
                            java.lang.Object[] r9 = r9.toArray(r6)
                            java.lang.String[] r9 = (java.lang.String[]) r9
                            dd.g r9 = r2.getItems(r5, r9)
                            r0.L$0 = r10
                            r0.label = r4
                            java.lang.Object r9 = dd.i.x(r9, r0)
                            if (r9 != r1) goto L65
                            return r1
                        L65:
                            r7 = r10
                            r10 = r9
                            r9 = r7
                        L68:
                            r2 = 0
                            r0.L$0 = r2
                            r0.label = r3
                            java.lang.Object r9 = r9.emit(r10, r0)
                            if (r9 != r1) goto L74
                            return r1
                        L74:
                            dc.w r9 = dc.w.f13270a
                            return r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment$loadItems$1$1$invokeSuspend$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // dd.g
                public Object collect(h<? super List<? extends Item>> hVar, Continuation continuation) {
                    Object d11;
                    Object collect = g.this.collect(new AnonymousClass2(hVar, itemDialogFragment, cls), continuation);
                    d11 = ic.d.d();
                    if (collect == d11) {
                        return collect;
                    }
                    return w.f13270a;
                }
            };
            final ItemDialogFragment itemDialogFragment2 = this.this$0;
            h<? super List<? extends Item>> hVar = new h() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment$loadItems$1$1.4
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List) obj2, (Continuation<? super w>) continuation);
                }

                public final Object emit(List<? extends Item> list, Continuation<? super w> continuation) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (list == null) {
                        list = t.i();
                    }
                    for (Item item : list) {
                        linkedHashMap.put(item.getKey(), item);
                    }
                    ItemRecyclerAdapter adapter = ItemDialogFragment.this.getAdapter();
                    if (adapter != null) {
                        adapter.setItems(linkedHashMap);
                    }
                    return w.f13270a;
                }
            };
            this.label = 1;
            if (gVar2.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
