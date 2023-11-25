package com.habitrpg.android.habitica.ui.fragments.inventory.items;

import ad.k0;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.extensions.AlertDialogExtensionsKt;
import com.habitrpg.android.habitica.models.inventory.Equipment;
import com.habitrpg.android.habitica.models.inventory.Item;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.android.habitica.ui.views.dialogs.OpenedMysteryitemDialog;
import com.habitrpg.common.habitica.extensions.DataBindingUtilsKt;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.common.habitica.views.PixelArtView;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import pc.l;
import pc.p;
import qc.q;
import qc.r;

/* compiled from: ItemRecyclerFragment.kt */
/* loaded from: classes4.dex */
final class ItemRecyclerFragment$setAdapter$5 extends r implements l<Item, w> {
    final /* synthetic */ ItemRecyclerFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ItemRecyclerFragment.kt */
    @f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemRecyclerFragment$setAdapter$5$1", f = "ItemRecyclerFragment.kt", l = {174}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemRecyclerFragment$setAdapter$5$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
        int label;
        final /* synthetic */ ItemRecyclerFragment this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ItemRecyclerFragment.kt */
        /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemRecyclerFragment$setAdapter$5$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C02811 extends r implements p<HabiticaAlertDialog, Integer, w> {
            final /* synthetic */ Equipment $item;
            final /* synthetic */ ItemRecyclerFragment this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: ItemRecyclerFragment.kt */
            @f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemRecyclerFragment$setAdapter$5$1$1$1", f = "ItemRecyclerFragment.kt", l = {185}, m = "invokeSuspend")
            /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemRecyclerFragment$setAdapter$5$1$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C02821 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
                final /* synthetic */ Equipment $item;
                int label;
                final /* synthetic */ ItemRecyclerFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C02821(Equipment equipment, ItemRecyclerFragment itemRecyclerFragment, Continuation<? super C02821> continuation) {
                    super(2, continuation);
                    this.$item = equipment;
                    this.this$0 = itemRecyclerFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<w> create(Object obj, Continuation<?> continuation) {
                    return new C02821(this.$item, this.this$0, continuation);
                }

                @Override // pc.p
                public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
                    return ((C02821) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
                        String key = this.$item.getKey();
                        if (key != null) {
                            InventoryRepository inventoryRepository = this.this$0.getInventoryRepository();
                            this.label = 1;
                            if (inventoryRepository.equip("equipped", key, this) == d10) {
                                return d10;
                            }
                        }
                    }
                    return w.f13270a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02811(ItemRecyclerFragment itemRecyclerFragment, Equipment equipment) {
                super(2);
                this.this$0 = itemRecyclerFragment;
                this.$item = equipment;
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
                invoke(habiticaAlertDialog, num.intValue());
                return w.f13270a;
            }

            public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
                q.i(habiticaAlertDialog, "<anonymous parameter 0>");
                ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this.this$0), null, new C02821(this.$item, this.this$0, null), 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ItemRecyclerFragment itemRecyclerFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = itemRecyclerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            MainActivity mainActivity;
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
                InventoryRepository inventoryRepository = this.this$0.getInventoryRepository();
                User user = this.this$0.getUser();
                this.label = 1;
                obj = inventoryRepository.openMysteryItem(user, this);
                if (obj == d10) {
                    return d10;
                }
            }
            Equipment equipment = (Equipment) obj;
            if (equipment == null) {
                return w.f13270a;
            }
            androidx.fragment.app.q activity = this.this$0.getActivity();
            if (activity instanceof MainActivity) {
                mainActivity = (MainActivity) activity;
            } else {
                mainActivity = null;
            }
            if (mainActivity != null) {
                OpenedMysteryitemDialog openedMysteryitemDialog = new OpenedMysteryitemDialog(mainActivity);
                openedMysteryitemDialog.setCelebratory(true);
                openedMysteryitemDialog.setTitle(R.string.mystery_item_title);
                PixelArtView pixelArtView = openedMysteryitemDialog.getBinding().iconView;
                q.h(pixelArtView, "iconView");
                DataBindingUtilsKt.loadImage$default(pixelArtView, "shop_" + equipment.getKey(), null, 2, null);
                openedMysteryitemDialog.getBinding().titleView.setText(equipment.getText());
                openedMysteryitemDialog.getBinding().descriptionView.setText(equipment.getNotes());
                HabiticaAlertDialog.addButton$default((HabiticaAlertDialog) openedMysteryitemDialog, (int) R.string.equip, true, false, false, (p) new C02811(this.this$0, equipment), 12, (Object) null);
                AlertDialogExtensionsKt.addCloseButton$default(openedMysteryitemDialog, false, null, 3, null);
                openedMysteryitemDialog.enqueue();
            }
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemRecyclerFragment$setAdapter$5(ItemRecyclerFragment itemRecyclerFragment) {
        super(1);
        this.this$0 = itemRecyclerFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Item item) {
        invoke2(item);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Item item) {
        q.i(item, "it");
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this.this$0), null, new AnonymousClass1(this.this$0, null), 1, null);
    }
}
