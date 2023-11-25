package com.habitrpg.android.habitica.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.CustomizationGridItemBinding;
import com.habitrpg.android.habitica.databinding.CustomizationSectionFooterBinding;
import com.habitrpg.android.habitica.databinding.CustomizationSectionHeaderBinding;
import com.habitrpg.android.habitica.models.inventory.Customization;
import com.habitrpg.android.habitica.models.inventory.CustomizationSet;
import com.habitrpg.android.habitica.models.shops.ShopItem;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.android.habitica.ui.views.CurrencyView;
import com.habitrpg.common.habitica.extensions.DataBindingUtilsKt;
import com.habitrpg.common.habitica.extensions.IntExtensionsKt;
import com.habitrpg.common.habitica.views.PixelArtView;
import com.habitrpg.shared.habitica.models.Avatar;
import dc.w;
import ec.b0;
import ec.t;
import java.util.ArrayList;
import java.util.List;
import pc.l;
import qc.q;

/* compiled from: CustomizationRecyclerViewAdapter.kt */
/* loaded from: classes4.dex */
public final class CustomizationRecyclerViewAdapter extends RecyclerView.h<RecyclerView.f0> {
    public static final int $stable = 8;
    private String activeCustomization;
    private Avatar avatar;
    private String customizationType;
    private int gemBalance;
    private String hairColor;
    private l<? super Customization, w> onCustomizationSelected;
    private l<? super ShopItem, w> onShowPurchaseDialog;
    private List<String> ownedCustomizations;
    private List<String> pinnedItemKeys;
    private String userSize;
    private int columnCount = 1;
    private List<? extends Customization> unsortedCustomizations = new ArrayList();
    private List<Object> customizationList = new ArrayList();
    private List<? extends Customization> additionalSetItems = new ArrayList();

    /* compiled from: CustomizationRecyclerViewAdapter.kt */
    /* loaded from: classes4.dex */
    public final class CustomizationViewHolder extends RecyclerView.f0 implements View.OnClickListener {
        private final CustomizationGridItemBinding binding;
        private Customization customization;
        final /* synthetic */ CustomizationRecyclerViewAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomizationViewHolder(CustomizationRecyclerViewAdapter customizationRecyclerViewAdapter, View view) {
            super(view);
            q.i(view, "itemView");
            this.this$0 = customizationRecyclerViewAdapter;
            CustomizationGridItemBinding bind = CustomizationGridItemBinding.bind(view);
            q.h(bind, "bind(...)");
            this.binding = bind;
            view.setOnClickListener(this);
        }

        public final void bind(Customization customization) {
            boolean T;
            double d10;
            boolean K;
            q.i(customization, "customization");
            this.customization = customization;
            String iconName = customization.getIconName(this.this$0.getUserSize(), this.this$0.getHairColor());
            if (iconName != null) {
                PixelArtView pixelArtView = this.binding.imageView;
                q.h(pixelArtView, "imageView");
                DataBindingUtilsKt.loadImage$default(pixelArtView, iconName, null, 2, null);
            } else {
                this.binding.imageView.setBitmap(null);
                this.binding.imageView.setTag(null);
                this.binding.imageView.setImageResource(R.drawable.empty_slot);
            }
            T = b0.T(this.this$0.getOwnedCustomizations(), customization.getId());
            if (customization.isUsable(T)) {
                this.binding.buyButton.setVisibility(8);
            } else {
                boolean z10 = false;
                this.binding.buyButton.setVisibility(0);
                String customizationSet = customization.getCustomizationSet();
                if (customizationSet != null) {
                    K = yc.w.K(customizationSet, "timeTravel", false, 2, null);
                    if (K) {
                        z10 = true;
                    }
                }
                if (z10) {
                    this.binding.priceLabel.setCurrency("hourglasses");
                } else {
                    this.binding.priceLabel.setCurrency(NavigationDrawerFragment.SIDEBAR_GEMS);
                }
                CurrencyView currencyView = this.binding.priceLabel;
                Integer price = customization.getPrice();
                if (price != null) {
                    d10 = price.intValue();
                } else {
                    d10 = 0.0d;
                }
                currencyView.setValue(d10);
            }
            boolean d11 = q.d(customization.getType(), "chair");
            String identifier = customization.getIdentifier();
            if (d11) {
                identifier = "chair_" + identifier;
            }
            if (q.d(this.this$0.getActiveCustomization(), identifier)) {
                this.binding.wrapper.setBackground(androidx.core.content.a.e(this.itemView.getContext(), R.drawable.layout_rounded_bg_window_tint_border));
            } else {
                this.binding.wrapper.setBackground(androidx.core.content.a.e(this.itemView.getContext(), R.drawable.layout_rounded_bg_window));
            }
        }

        public final Customization getCustomization() {
            return this.customization;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
        
            if (r13 == true) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onClick(android.view.View r13) {
            /*
                Method dump skipped, instructions count: 379
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.adapter.CustomizationRecyclerViewAdapter.CustomizationViewHolder.onClick(android.view.View):void");
        }

        public final void setCustomization(Customization customization) {
            this.customization = customization;
        }
    }

    /* compiled from: CustomizationRecyclerViewAdapter.kt */
    /* loaded from: classes4.dex */
    public final class SectionFooterViewHolder extends RecyclerView.f0 implements View.OnClickListener {
        private List<? extends Customization> additionalSetItems;
        private final CustomizationSectionFooterBinding binding;
        private Context context;
        private CustomizationSet set;
        final /* synthetic */ CustomizationRecyclerViewAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SectionFooterViewHolder(CustomizationRecyclerViewAdapter customizationRecyclerViewAdapter, View view) {
            super(view);
            q.i(view, "itemView");
            this.this$0 = customizationRecyclerViewAdapter;
            CustomizationSectionFooterBinding bind = CustomizationSectionFooterBinding.bind(view);
            q.h(bind, "bind(...)");
            this.binding = bind;
            Context context = view.getContext();
            q.h(context, "getContext(...)");
            this.context = context;
            bind.purchaseSetButton.setOnClickListener(this);
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
        
            if (r0 == true) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void bind(com.habitrpg.android.habitica.models.inventory.CustomizationSet r6) {
            /*
                r5 = this;
                java.lang.String r0 = "set"
                qc.q.i(r6, r0)
                r5.set = r6
                boolean r0 = r6.getHasPurchasable()
                if (r0 == 0) goto L40
                java.lang.String r0 = r6.getIdentifier()
                r1 = 0
                if (r0 == 0) goto L20
                r2 = 2
                r3 = 0
                java.lang.String r4 = "timeTravel"
                boolean r0 = yc.m.K(r0, r4, r1, r2, r3)
                r2 = 1
                if (r0 != r2) goto L20
                goto L21
            L20:
                r2 = 0
            L21:
                if (r2 != 0) goto L40
                com.habitrpg.android.habitica.databinding.CustomizationSectionFooterBinding r0 = r5.binding
                android.widget.LinearLayout r0 = r0.purchaseSetButton
                r0.setVisibility(r1)
                com.habitrpg.android.habitica.databinding.CustomizationSectionFooterBinding r0 = r5.binding
                com.habitrpg.android.habitica.ui.views.CurrencyView r0 = r0.setPriceLabel
                int r6 = r6.getPrice()
                double r1 = (double) r6
                r0.setValue(r1)
                com.habitrpg.android.habitica.databinding.CustomizationSectionFooterBinding r6 = r5.binding
                com.habitrpg.android.habitica.ui.views.CurrencyView r6 = r6.setPriceLabel
                java.lang.String r0 = "gems"
                r6.setCurrency(r0)
                goto L49
            L40:
                com.habitrpg.android.habitica.databinding.CustomizationSectionFooterBinding r6 = r5.binding
                android.widget.LinearLayout r6 = r6.purchaseSetButton
                r0 = 8
                r6.setVisibility(r0)
            L49:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.adapter.CustomizationRecyclerViewAdapter.SectionFooterViewHolder.bind(com.habitrpg.android.habitica.models.inventory.CustomizationSet):void");
        }

        public final List<Customization> getAdditionalSetItems() {
            return this.additionalSetItems;
        }

        public final int getButtonWidth() {
            return this.binding.purchaseSetButton.getWidth();
        }

        public final Context getContext() {
            return this.context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CustomizationRecyclerViewAdapter customizationRecyclerViewAdapter;
            l<ShopItem, w> onShowPurchaseDialog;
            q.i(view, "v");
            CustomizationSet customizationSet = this.set;
            if (customizationSet != null && (onShowPurchaseDialog = (customizationRecyclerViewAdapter = this.this$0).getOnShowPurchaseDialog()) != null) {
                onShowPurchaseDialog.invoke(ShopItem.Companion.fromCustomizationSet(customizationSet, this.additionalSetItems, customizationRecyclerViewAdapter.getUserSize(), customizationRecyclerViewAdapter.getHairColor()));
            }
        }

        public final void setAdditionalSetItems(List<? extends Customization> list) {
            this.additionalSetItems = list;
        }

        public final void setButtonWidth(int i10) {
            ViewGroup.LayoutParams layoutParams = this.binding.purchaseSetButton.getLayoutParams();
            layoutParams.width = i10;
            this.binding.purchaseSetButton.setLayoutParams(layoutParams);
        }

        public final void setContext(Context context) {
            q.i(context, "<set-?>");
            this.context = context;
        }
    }

    /* compiled from: CustomizationRecyclerViewAdapter.kt */
    /* loaded from: classes4.dex */
    public final class SectionViewHolder extends RecyclerView.f0 {
        private final CustomizationSectionHeaderBinding binding;
        final /* synthetic */ CustomizationRecyclerViewAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SectionViewHolder(CustomizationRecyclerViewAdapter customizationRecyclerViewAdapter, View view) {
            super(view);
            q.i(view, "itemView");
            this.this$0 = customizationRecyclerViewAdapter;
            CustomizationSectionHeaderBinding bind = CustomizationSectionHeaderBinding.bind(view);
            q.h(bind, "bind(...)");
            this.binding = bind;
        }

        public final void bind(CustomizationSet customizationSet) {
            q.i(customizationSet, "set");
            this.binding.label.setText(customizationSet.getText());
        }
    }

    public CustomizationRecyclerViewAdapter() {
        List<String> i10;
        i10 = t.i();
        this.ownedCustomizations = i10;
        this.pinnedItemKeys = new ArrayList();
    }

    public final String getActiveCustomization() {
        return this.activeCustomization;
    }

    public final List<Customization> getAdditionalSetItems() {
        return this.additionalSetItems;
    }

    public final Avatar getAvatar() {
        return this.avatar;
    }

    public final int getColumnCount() {
        return this.columnCount;
    }

    public final String getCustomizationType() {
        return this.customizationType;
    }

    public final int getGemBalance() {
        return this.gemBalance;
    }

    public final String getHairColor() {
        return this.hairColor;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.customizationList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        if (this.customizationList.size() <= i10) {
            return 0;
        }
        if ((this.customizationList.get(i10) instanceof CustomizationSet) && (i10 == this.customizationList.size() - 1 || (i10 < this.customizationList.size() && (this.customizationList.get(i10 + 1) instanceof CustomizationSet)))) {
            return 1;
        }
        if (this.customizationList.get(i10) instanceof CustomizationSet) {
            return 0;
        }
        return 2;
    }

    public final l<Customization, w> getOnCustomizationSelected() {
        return this.onCustomizationSelected;
    }

    public final l<ShopItem, w> getOnShowPurchaseDialog() {
        return this.onShowPurchaseDialog;
    }

    public final List<String> getOwnedCustomizations() {
        return this.ownedCustomizations;
    }

    public final List<Customization> getUnsortedCustomizations() {
        return this.unsortedCustomizations;
    }

    public final String getUserSize() {
        return this.userSize;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.f0 f0Var, int i10) {
        int i11;
        q.i(f0Var, "holder");
        Object obj = this.customizationList.get(i10);
        if (getItemViewType(i10) == 0) {
            q.g(obj, "null cannot be cast to non-null type com.habitrpg.android.habitica.models.inventory.CustomizationSet");
            ((SectionViewHolder) f0Var).bind((CustomizationSet) obj);
        } else if (getItemViewType(i10) == 1) {
            SectionFooterViewHolder sectionFooterViewHolder = (SectionFooterViewHolder) f0Var;
            q.g(obj, "null cannot be cast to non-null type com.habitrpg.android.habitica.models.inventory.CustomizationSet");
            CustomizationSet customizationSet = (CustomizationSet) obj;
            sectionFooterViewHolder.bind(customizationSet);
            int min = Math.min(this.columnCount, customizationSet.getCustomizations().size());
            sectionFooterViewHolder.setButtonWidth((IntExtensionsKt.dpToPx(76, f0Var.itemView.getContext()) * min) + ((min - 1) * IntExtensionsKt.dpToPx(12, f0Var.itemView.getContext())));
            SectionFooterViewHolder sectionFooterViewHolder2 = (SectionFooterViewHolder) f0Var;
            List<? extends Customization> list = this.additionalSetItems;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                Customization customization = (Customization) obj2;
                boolean z10 = false;
                if (customization.getPurchasable()) {
                    Integer price = customization.getPrice();
                    if (price != null) {
                        i11 = price.intValue();
                    } else {
                        i11 = 0;
                    }
                    if (i11 > 0) {
                        z10 = true;
                    }
                }
                if (z10) {
                    arrayList.add(obj2);
                }
            }
            sectionFooterViewHolder2.setAdditionalSetItems(arrayList);
        } else {
            Object obj3 = this.customizationList.get(i10);
            q.g(obj3, "null cannot be cast to non-null type com.habitrpg.android.habitica.models.inventory.Customization");
            ((CustomizationViewHolder) f0Var).bind((Customization) obj3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        int i11;
        q.i(viewGroup, "parent");
        if (i10 != 0) {
            if (i10 != 1) {
                if (q.d(this.customizationType, "background")) {
                    i11 = R.layout.customization_grid_background_item;
                } else {
                    i11 = R.layout.customization_grid_item;
                }
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i11, viewGroup, false);
                q.f(inflate);
                return new CustomizationViewHolder(this, inflate);
            }
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.customization_section_footer, viewGroup, false);
            q.f(inflate2);
            return new SectionFooterViewHolder(this, inflate2);
        }
        View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.customization_section_header, viewGroup, false);
        q.f(inflate3);
        return new SectionViewHolder(this, inflate3);
    }

    public final void setActiveCustomization(String str) {
        this.activeCustomization = str;
    }

    public final void setAdditionalSetItems(List<? extends Customization> list) {
        q.i(list, "<set-?>");
        this.additionalSetItems = list;
    }

    public final void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }

    public final void setColumnCount(int i10) {
        this.columnCount = i10;
    }

    public final void setCustomizationType(String str) {
        this.customizationType = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x001c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setCustomizations(java.util.List<? extends com.habitrpg.android.habitica.models.inventory.Customization> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "newCustomizationList"
            qc.q.i(r12, r0)
            r11.unsortedCustomizations = r12
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.customizationList = r0
            com.habitrpg.android.habitica.models.inventory.CustomizationSet r0 = new com.habitrpg.android.habitica.models.inventory.CustomizationSet
            r0.<init>()
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.util.Iterator r12 = r12.iterator()
        L1c:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto Lf2
            java.lang.Object r2 = r12.next()
            com.habitrpg.android.habitica.models.inventory.Customization r2 = (com.habitrpg.android.habitica.models.inventory.Customization) r2
            java.util.List<java.lang.String> r3 = r11.ownedCustomizations
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.lang.String r4 = r2.getId()
            boolean r3 = ec.r.T(r3, r4)
            boolean r4 = r2.isUsable(r3)
            java.util.Date r5 = r2.getAvailableFrom()
            r6 = 0
            if (r5 != 0) goto L45
            java.util.Date r5 = r2.getAvailableUntil()
            if (r5 == 0) goto L64
        L45:
            java.util.Date r5 = r2.getAvailableFrom()
            if (r5 == 0) goto L50
            int r5 = r5.compareTo(r1)
            goto L51
        L50:
            r5 = 0
        L51:
            if (r5 > 0) goto L61
            java.util.Date r5 = r2.getAvailableUntil()
            if (r5 == 0) goto L5e
            int r5 = r5.compareTo(r1)
            goto L5f
        L5e:
            r5 = 0
        L5f:
            if (r5 >= 0) goto L64
        L61:
            if (r4 != 0) goto L64
            goto L1c
        L64:
            java.lang.String r5 = r2.getIdentifier()
            r7 = 1
            if (r5 == 0) goto L77
            r8 = 2
            r9 = 0
            java.lang.String r10 = "birthday_bash"
            boolean r5 = yc.m.K(r5, r10, r6, r8, r9)
            if (r5 != r7) goto L77
            r5 = 1
            goto L78
        L77:
            r5 = 0
        L78:
            if (r5 == 0) goto L7d
            if (r3 != 0) goto L7d
            goto L1c
        L7d:
            java.lang.String r3 = r2.getCustomizationSet()
            if (r3 == 0) goto Lcc
            java.lang.String r3 = r2.getCustomizationSet()
            java.lang.String r5 = r0.getIdentifier()
            boolean r3 = qc.q.d(r3, r5)
            if (r3 != 0) goto Lcc
            boolean r3 = r0.getHasPurchasable()
            if (r3 == 0) goto La2
            int r3 = r0.getPrice()
            if (r3 <= 0) goto La2
            java.util.List<java.lang.Object> r3 = r11.customizationList
            r3.add(r0)
        La2:
            com.habitrpg.android.habitica.models.inventory.CustomizationSet r0 = new com.habitrpg.android.habitica.models.inventory.CustomizationSet
            r0.<init>()
            java.lang.String r3 = r2.getCustomizationSet()
            r0.setIdentifier(r3)
            java.lang.String r3 = r2.getCustomizationSetName()
            r0.setText(r3)
            java.lang.Integer r3 = r2.getSetPrice()
            if (r3 == 0) goto Lc0
            int r3 = r3.intValue()
            goto Lc1
        Lc0:
            r3 = 0
        Lc1:
            r0.setPrice(r3)
            r0.setHasPurchasable(r7)
            java.util.List<java.lang.Object> r3 = r11.customizationList
            r3.add(r0)
        Lcc:
            java.util.List<java.lang.Object> r3 = r11.customizationList
            r3.add(r2)
            java.util.List r3 = r0.getCustomizations()
            r3.add(r2)
            if (r4 == 0) goto L1c
            boolean r3 = r0.getHasPurchasable()
            if (r3 == 0) goto L1c
            java.util.List r3 = r0.getOwnedCustomizations()
            r3.add(r2)
            boolean r2 = r0.isSetDeal()
            if (r2 != 0) goto L1c
            r0.setHasPurchasable(r6)
            goto L1c
        Lf2:
            boolean r12 = r0.getHasPurchasable()
            if (r12 == 0) goto Lfd
            java.util.List<java.lang.Object> r12 = r11.customizationList
            r12.add(r0)
        Lfd:
            r11.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.adapter.CustomizationRecyclerViewAdapter.setCustomizations(java.util.List):void");
    }

    public final void setGemBalance(int i10) {
        this.gemBalance = i10;
    }

    public final void setHairColor(String str) {
        this.hairColor = str;
    }

    public final void setOnCustomizationSelected(l<? super Customization, w> lVar) {
        this.onCustomizationSelected = lVar;
    }

    public final void setOnShowPurchaseDialog(l<? super ShopItem, w> lVar) {
        this.onShowPurchaseDialog = lVar;
    }

    public final void setOwnedCustomizations(List<String> list) {
        q.i(list, "<set-?>");
        this.ownedCustomizations = list;
    }

    public final void setPinnedItemKeys(List<String> list) {
        q.i(list, "pinnedItemKeys");
        this.pinnedItemKeys = list;
        if (this.customizationList.size() > 0) {
            notifyDataSetChanged();
        }
    }

    public final void setUnsortedCustomizations(List<? extends Customization> list) {
        q.i(list, "<set-?>");
        this.unsortedCustomizations = list;
    }

    public final void setUserSize(String str) {
        this.userSize = str;
    }
}
