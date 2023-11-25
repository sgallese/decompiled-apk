package com.habitrpg.android.habitica.ui.fragments.inventory.shops;

import ad.k0;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.models.inventory.Quest;
import com.habitrpg.android.habitica.models.social.Group;
import com.habitrpg.android.habitica.ui.adapter.inventory.ShopRecyclerAdapter;
import dc.n;
import dc.w;
import dd.g;
import dd.h;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShopFragment.kt */
@f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$10", f = "ShopFragment.kt", l = {214}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ShopFragment$onViewCreated$10 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ ShopFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopFragment$onViewCreated$10(ShopFragment shopFragment, Continuation<? super ShopFragment$onViewCreated$10> continuation) {
        super(2, continuation);
        this.this$0 = shopFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new ShopFragment$onViewCreated$10(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((ShopFragment$onViewCreated$10) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            final g<Group> group = this.this$0.getSocialRepository().getGroup(Group.TAVERN_ID);
            final g<Group> gVar = new g<Group>() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$10$invokeSuspend$$inlined$filter$1

                /* compiled from: Emitters.kt */
                /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$10$invokeSuspend$$inlined$filter$1$2  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements h {
                    final /* synthetic */ h $this_unsafeFlow;

                    /* compiled from: Emitters.kt */
                    @f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$10$invokeSuspend$$inlined$filter$1$2", f = "ShopFragment.kt", l = {223}, m = "emit")
                    /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$10$invokeSuspend$$inlined$filter$1$2$1  reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
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
                            boolean r0 = r7 instanceof com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$10$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r7
                            com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$10$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$10$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$10$invokeSuspend$$inlined$filter$1$2$1 r0 = new com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$10$invokeSuspend$$inlined$filter$1$2$1
                            r0.<init>(r7)
                        L18:
                            java.lang.Object r7 = r0.result
                            java.lang.Object r1 = ic.b.d()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            dc.n.b(r7)
                            goto L4e
                        L29:
                            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                            r6.<init>(r7)
                            throw r6
                        L31:
                            dc.n.b(r7)
                            dd.h r7 = r5.$this_unsafeFlow
                            r2 = r6
                            com.habitrpg.android.habitica.models.social.Group r2 = (com.habitrpg.android.habitica.models.social.Group) r2
                            r4 = 0
                            if (r2 == 0) goto L43
                            boolean r2 = r2.getHasActiveQuest()
                            if (r2 != r3) goto L43
                            r4 = 1
                        L43:
                            if (r4 == 0) goto L4e
                            r0.label = r3
                            java.lang.Object r6 = r7.emit(r6, r0)
                            if (r6 != r1) goto L4e
                            return r1
                        L4e:
                            dc.w r6 = dc.w.f13270a
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$10$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // dd.g
                public Object collect(h<? super Group> hVar, Continuation continuation) {
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
            final g<Group> gVar2 = new g<Group>() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$10$invokeSuspend$$inlined$filter$2

                /* compiled from: Emitters.kt */
                /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$10$invokeSuspend$$inlined$filter$2$2  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements h {
                    final /* synthetic */ h $this_unsafeFlow;
                    final /* synthetic */ ShopFragment this$0;

                    /* compiled from: Emitters.kt */
                    @f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$10$invokeSuspend$$inlined$filter$2$2", f = "ShopFragment.kt", l = {223}, m = "emit")
                    /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$10$invokeSuspend$$inlined$filter$2$2$1  reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
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

                    public AnonymousClass2(h hVar, ShopFragment shopFragment) {
                        this.$this_unsafeFlow = hVar;
                        this.this$0 = shopFragment;
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
                            boolean r0 = r9 instanceof com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$10$invokeSuspend$$inlined$filter$2.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r9
                            com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$10$invokeSuspend$$inlined$filter$2$2$1 r0 = (com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$10$invokeSuspend$$inlined$filter$2.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$10$invokeSuspend$$inlined$filter$2$2$1 r0 = new com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$10$invokeSuspend$$inlined$filter$2$2$1
                            r0.<init>(r9)
                        L18:
                            java.lang.Object r9 = r0.result
                            java.lang.Object r1 = ic.b.d()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            dc.n.b(r9)
                            goto L7b
                        L29:
                            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                            r8.<init>(r9)
                            throw r8
                        L31:
                            dc.n.b(r9)
                            dd.h r9 = r7.$this_unsafeFlow
                            r2 = r8
                            com.habitrpg.android.habitica.models.social.Group r2 = (com.habitrpg.android.habitica.models.social.Group) r2
                            r4 = 0
                            if (r2 == 0) goto L70
                            com.habitrpg.android.habitica.models.inventory.Quest r2 = r2.getQuest()
                            if (r2 == 0) goto L70
                            io.realm.x0 r2 = r2.getRageStrikes()
                            if (r2 == 0) goto L70
                            boolean r5 = r2.isEmpty()
                            if (r5 == 0) goto L4f
                            goto L70
                        L4f:
                            java.util.Iterator r2 = r2.iterator()
                        L53:
                            boolean r5 = r2.hasNext()
                            if (r5 == 0) goto L70
                            java.lang.Object r5 = r2.next()
                            com.habitrpg.android.habitica.models.inventory.QuestRageStrike r5 = (com.habitrpg.android.habitica.models.inventory.QuestRageStrike) r5
                            java.lang.String r5 = r5.getKey()
                            com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment r6 = r7.this$0
                            java.lang.String r6 = r6.getShopIdentifier()
                            boolean r5 = qc.q.d(r5, r6)
                            if (r5 == 0) goto L53
                            r4 = 1
                        L70:
                            if (r4 == 0) goto L7b
                            r0.label = r3
                            java.lang.Object r8 = r9.emit(r8, r0)
                            if (r8 != r1) goto L7b
                            return r1
                        L7b:
                            dc.w r8 = dc.w.f13270a
                            return r8
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$10$invokeSuspend$$inlined$filter$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // dd.g
                public Object collect(h<? super Group> hVar, Continuation continuation) {
                    Object d11;
                    Object collect = g.this.collect(new AnonymousClass2(hVar, shopFragment), continuation);
                    d11 = d.d();
                    if (collect == d11) {
                        return collect;
                    }
                    return w.f13270a;
                }
            };
            final ShopFragment shopFragment2 = this.this$0;
            g<Group> gVar3 = new g<Group>() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$10$invokeSuspend$$inlined$filter$3

                /* compiled from: Emitters.kt */
                /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$10$invokeSuspend$$inlined$filter$3$2  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements h {
                    final /* synthetic */ h $this_unsafeFlow;
                    final /* synthetic */ ShopFragment this$0;

                    /* compiled from: Emitters.kt */
                    @f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$10$invokeSuspend$$inlined$filter$3$2", f = "ShopFragment.kt", l = {223}, m = "emit")
                    /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$10$invokeSuspend$$inlined$filter$3$2$1  reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
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

                    public AnonymousClass2(h hVar, ShopFragment shopFragment) {
                        this.$this_unsafeFlow = hVar;
                        this.this$0 = shopFragment;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                    @Override // dd.h
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
                        /*
                            r9 = this;
                            boolean r0 = r11 instanceof com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$10$invokeSuspend$$inlined$filter$3.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r11
                            com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$10$invokeSuspend$$inlined$filter$3$2$1 r0 = (com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$10$invokeSuspend$$inlined$filter$3.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$10$invokeSuspend$$inlined$filter$3$2$1 r0 = new com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$10$invokeSuspend$$inlined$filter$3$2$1
                            r0.<init>(r11)
                        L18:
                            java.lang.Object r11 = r0.result
                            java.lang.Object r1 = ic.b.d()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            dc.n.b(r11)
                            goto L8c
                        L29:
                            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                            r10.<init>(r11)
                            throw r10
                        L31:
                            dc.n.b(r11)
                            dd.h r11 = r9.$this_unsafeFlow
                            r2 = r10
                            com.habitrpg.android.habitica.models.social.Group r2 = (com.habitrpg.android.habitica.models.social.Group) r2
                            r4 = 0
                            if (r2 == 0) goto L81
                            com.habitrpg.android.habitica.models.inventory.Quest r2 = r2.getQuest()
                            if (r2 == 0) goto L81
                            io.realm.x0 r2 = r2.getRageStrikes()
                            if (r2 == 0) goto L81
                            java.util.ArrayList r5 = new java.util.ArrayList
                            r5.<init>()
                            java.util.Iterator r2 = r2.iterator()
                        L51:
                            boolean r6 = r2.hasNext()
                            if (r6 == 0) goto L72
                            java.lang.Object r6 = r2.next()
                            r7 = r6
                            com.habitrpg.android.habitica.models.inventory.QuestRageStrike r7 = (com.habitrpg.android.habitica.models.inventory.QuestRageStrike) r7
                            java.lang.String r7 = r7.getKey()
                            com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment r8 = r9.this$0
                            java.lang.String r8 = r8.getShopIdentifier()
                            boolean r7 = qc.q.d(r7, r8)
                            if (r7 == 0) goto L51
                            r5.add(r6)
                            goto L51
                        L72:
                            java.lang.Object r2 = r5.get(r4)
                            com.habitrpg.android.habitica.models.inventory.QuestRageStrike r2 = (com.habitrpg.android.habitica.models.inventory.QuestRageStrike) r2
                            if (r2 == 0) goto L81
                            boolean r2 = r2.getWasHit()
                            if (r2 != r3) goto L81
                            r4 = 1
                        L81:
                            if (r4 == 0) goto L8c
                            r0.label = r3
                            java.lang.Object r10 = r11.emit(r10, r0)
                            if (r10 != r1) goto L8c
                            return r1
                        L8c:
                            dc.w r10 = dc.w.f13270a
                            return r10
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$10$invokeSuspend$$inlined$filter$3.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // dd.g
                public Object collect(h<? super Group> hVar, Continuation continuation) {
                    Object d11;
                    Object collect = g.this.collect(new AnonymousClass2(hVar, shopFragment2), continuation);
                    d11 = d.d();
                    if (collect == d11) {
                        return collect;
                    }
                    return w.f13270a;
                }
            };
            final ShopFragment shopFragment3 = this.this$0;
            h<? super Group> hVar = new h() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$10.4
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Group) obj2, (Continuation<? super w>) continuation);
                }

                public final Object emit(Group group2, Continuation<? super w> continuation) {
                    Quest quest;
                    ShopRecyclerAdapter adapter = ShopFragment.this.getAdapter();
                    if (adapter != null) {
                        adapter.setShopSpriteSuffix("_" + ((group2 == null || (quest = group2.getQuest()) == null) ? null : quest.getKey()));
                    }
                    return w.f13270a;
                }
            };
            this.label = 1;
            if (gVar3.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
