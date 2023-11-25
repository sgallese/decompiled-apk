package com.habitrpg.android.habitica.ui.fragments.inventory.items;

import ad.k0;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.models.user.OwnedPet;
import com.habitrpg.android.habitica.ui.adapter.inventory.ItemRecyclerAdapter;
import dc.n;
import dc.w;
import dd.g;
import dd.h;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* compiled from: ItemRecyclerFragment.kt */
@f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemRecyclerFragment$loadItems$1$3", f = "ItemRecyclerFragment.kt", l = {319}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ItemRecyclerFragment$loadItems$1$3 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ ItemRecyclerFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemRecyclerFragment$loadItems$1$3(ItemRecyclerFragment itemRecyclerFragment, Continuation<? super ItemRecyclerFragment$loadItems$1$3> continuation) {
        super(2, continuation);
        this.this$0 = itemRecyclerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new ItemRecyclerFragment$loadItems$1$3(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((ItemRecyclerFragment$loadItems$1$3) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            final g<List<OwnedPet>> ownedPets = this.this$0.getInventoryRepository().getOwnedPets();
            g<Map<String, OwnedPet>> gVar = new g<Map<String, OwnedPet>>() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemRecyclerFragment$loadItems$1$3$invokeSuspend$$inlined$map$1

                /* compiled from: Emitters.kt */
                /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemRecyclerFragment$loadItems$1$3$invokeSuspend$$inlined$map$1$2  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements h {
                    final /* synthetic */ h $this_unsafeFlow;

                    /* compiled from: Emitters.kt */
                    @f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemRecyclerFragment$loadItems$1$3$invokeSuspend$$inlined$map$1$2", f = "ItemRecyclerFragment.kt", l = {223}, m = "emit")
                    /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemRecyclerFragment$loadItems$1$3$invokeSuspend$$inlined$map$1$2$1  reason: invalid class name */
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
                    public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                        /*
                            r6 = this;
                            boolean r0 = r8 instanceof com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemRecyclerFragment$loadItems$1$3$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r8
                            com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemRecyclerFragment$loadItems$1$3$invokeSuspend$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemRecyclerFragment$loadItems$1$3$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemRecyclerFragment$loadItems$1$3$invokeSuspend$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemRecyclerFragment$loadItems$1$3$invokeSuspend$$inlined$map$1$2$1
                            r0.<init>(r8)
                        L18:
                            java.lang.Object r8 = r0.result
                            java.lang.Object r1 = ic.b.d()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            dc.n.b(r8)
                            goto L64
                        L29:
                            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                            r7.<init>(r8)
                            throw r7
                        L31:
                            dc.n.b(r8)
                            dd.h r8 = r6.$this_unsafeFlow
                            java.util.List r7 = (java.util.List) r7
                            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                            r2.<init>()
                            java.lang.Iterable r7 = (java.lang.Iterable) r7
                            java.util.Iterator r7 = r7.iterator()
                        L43:
                            boolean r4 = r7.hasNext()
                            if (r4 == 0) goto L5b
                            java.lang.Object r4 = r7.next()
                            com.habitrpg.android.habitica.models.user.OwnedPet r4 = (com.habitrpg.android.habitica.models.user.OwnedPet) r4
                            java.lang.String r5 = r4.getKey()
                            if (r5 != 0) goto L57
                            java.lang.String r5 = ""
                        L57:
                            r2.put(r5, r4)
                            goto L43
                        L5b:
                            r0.label = r3
                            java.lang.Object r7 = r8.emit(r2, r0)
                            if (r7 != r1) goto L64
                            return r1
                        L64:
                            dc.w r7 = dc.w.f13270a
                            return r7
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemRecyclerFragment$loadItems$1$3$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // dd.g
                public Object collect(h<? super Map<String, OwnedPet>> hVar, Continuation continuation) {
                    Object d11;
                    Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                    d11 = ic.d.d();
                    if (collect == d11) {
                        return collect;
                    }
                    return w.f13270a;
                }
            };
            final ItemRecyclerFragment itemRecyclerFragment = this.this$0;
            h<? super Map<String, OwnedPet>> hVar = new h() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemRecyclerFragment$loadItems$1$3.2
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Map) obj2, (Continuation<? super w>) continuation);
                }

                public final Object emit(Map<String, OwnedPet> map, Continuation<? super w> continuation) {
                    ItemRecyclerAdapter adapter = ItemRecyclerFragment.this.getAdapter();
                    if (adapter != null) {
                        adapter.setOwnedPets(map);
                    }
                    return w.f13270a;
                }
            };
            this.label = 1;
            if (gVar.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
