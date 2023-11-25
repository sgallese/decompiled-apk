package com.habitrpg.android.habitica.ui.fragments.inventory.shops;

import ad.k0;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.models.shops.ShopItem;
import com.habitrpg.android.habitica.ui.adapter.inventory.ShopRecyclerAdapter;
import dc.n;
import dc.w;
import dd.g;
import dd.h;
import ic.d;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShopFragment.kt */
@f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$13", f = "ShopFragment.kt", l = {228}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ShopFragment$onViewCreated$13 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ ShopFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopFragment$onViewCreated$13(ShopFragment shopFragment, Continuation<? super ShopFragment$onViewCreated$13> continuation) {
        super(2, continuation);
        this.this$0 = shopFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new ShopFragment$onViewCreated$13(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((ShopFragment$onViewCreated$13) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            final g<List<ShopItem>> inAppRewards = this.this$0.getInventoryRepository().getInAppRewards();
            g<List<? extends String>> gVar = new g<List<? extends String>>() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$13$invokeSuspend$$inlined$map$1

                /* compiled from: Emitters.kt */
                /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$13$invokeSuspend$$inlined$map$1$2  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements h {
                    final /* synthetic */ h $this_unsafeFlow;

                    /* compiled from: Emitters.kt */
                    @f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$13$invokeSuspend$$inlined$map$1$2", f = "ShopFragment.kt", l = {223}, m = "emit")
                    /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$13$invokeSuspend$$inlined$map$1$2$1  reason: invalid class name */
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
                            boolean r0 = r7 instanceof com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$13$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r7
                            com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$13$invokeSuspend$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$13$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$13$invokeSuspend$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$13$invokeSuspend$$inlined$map$1$2$1
                            r0.<init>(r7)
                        L18:
                            java.lang.Object r7 = r0.result
                            java.lang.Object r1 = ic.b.d()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            dc.n.b(r7)
                            goto L66
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
                            r4 = 10
                            int r4 = ec.r.s(r6, r4)
                            r2.<init>(r4)
                            java.util.Iterator r6 = r6.iterator()
                        L49:
                            boolean r4 = r6.hasNext()
                            if (r4 == 0) goto L5d
                            java.lang.Object r4 = r6.next()
                            com.habitrpg.android.habitica.models.shops.ShopItem r4 = (com.habitrpg.android.habitica.models.shops.ShopItem) r4
                            java.lang.String r4 = r4.getKey()
                            r2.add(r4)
                            goto L49
                        L5d:
                            r0.label = r3
                            java.lang.Object r6 = r7.emit(r2, r0)
                            if (r6 != r1) goto L66
                            return r1
                        L66:
                            dc.w r6 = dc.w.f13270a
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$13$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // dd.g
                public Object collect(h<? super List<? extends String>> hVar, Continuation continuation) {
                    Object d11;
                    Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                    d11 = d.d();
                    if (collect == d11) {
                        return collect;
                    }
                    return w.f13270a;
                }
            };
            final ShopFragment shopFragment = this.this$0;
            h<? super List<? extends String>> hVar = new h() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$13.2
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List) obj2, (Continuation<? super w>) continuation);
                }

                public final Object emit(List<String> list, Continuation<? super w> continuation) {
                    ShopRecyclerAdapter adapter = ShopFragment.this.getAdapter();
                    if (adapter != null) {
                        adapter.setPinnedItemKeys(list);
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
