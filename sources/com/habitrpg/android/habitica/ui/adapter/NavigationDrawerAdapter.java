package com.habitrpg.android.habitica.ui.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.PromoMenuBinding;
import com.habitrpg.android.habitica.extensions.ViewGroupExt;
import com.habitrpg.android.habitica.models.WorldStateEvent;
import com.habitrpg.android.habitica.models.promotions.HabiticaPromotion;
import com.habitrpg.android.habitica.ui.menu.HabiticaDrawerItem;
import com.habitrpg.android.habitica.ui.viewHolders.ComposableViewHolder;
import com.habitrpg.android.habitica.ui.views.promo.PromoMenuView;
import com.habitrpg.android.habitica.ui.views.promo.PromoMenuViewHolder;
import com.habitrpg.android.habitica.ui.views.promo.SubscriptionBuyGemsPromoView;
import com.habitrpg.android.habitica.ui.views.promo.SubscriptionBuyGemsPromoViewHolder;
import com.habitrpg.common.habitica.extensions.IntExtensionsKt;
import dc.w;
import ec.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import pc.l;
import q0.c;
import qc.q;

/* compiled from: NavigationDrawerAdapter.kt */
/* loaded from: classes4.dex */
public final class NavigationDrawerAdapter extends RecyclerView.h<RecyclerView.f0> {
    public static final int $stable = 8;
    private HabiticaPromotion activePromo;
    private int backgroundTintColor;
    private WorldStateEvent currentEvent;
    private l<? super HabiticaDrawerItem, w> itemSelectedEvents;
    private final List<HabiticaDrawerItem> items = new ArrayList();
    private l<? super String, w> promoClosedSubject;
    private Integer selectedItem;
    private int tintColor;

    /* compiled from: NavigationDrawerAdapter.kt */
    /* loaded from: classes4.dex */
    public static final class DrawerItemViewHolder extends RecyclerView.f0 {
        public static final int $stable = 8;
        private final TextView additionalInfoView;
        private final View bubbleView;
        private final TextView pillView;
        private int tintColor;
        private final TextView titleTextView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DrawerItemViewHolder(View view) {
            super(view);
            q.i(view, "itemView");
            this.titleTextView = (TextView) view.findViewById(R.id.titleTextView);
            this.pillView = (TextView) view.findViewById(R.id.pillView);
            this.bubbleView = view.findViewById(R.id.bubble_view);
            this.additionalInfoView = (TextView) view.findViewById(R.id.additionalInfoView);
        }

        public final void bind(HabiticaDrawerItem habiticaDrawerItem, boolean z10) {
            int i10;
            q.i(habiticaDrawerItem, "drawerItem");
            TextView textView = this.titleTextView;
            if (textView != null) {
                textView.setText(habiticaDrawerItem.getText());
            }
            if (z10) {
                View view = this.itemView;
                view.setBackgroundColor(androidx.core.content.a.c(view.getContext(), R.color.content_background_offset));
                this.itemView.getBackground().setAlpha(69);
                TextView textView2 = this.titleTextView;
                if (textView2 != null) {
                    textView2.setTextColor(this.tintColor);
                }
            } else {
                View view2 = this.itemView;
                view2.setBackgroundColor(androidx.core.content.a.c(view2.getContext(), R.color.content_background));
                TextView textView3 = this.titleTextView;
                if (textView3 != null) {
                    textView3.setTextColor(androidx.core.content.a.c(this.itemView.getContext(), R.color.text_primary));
                }
            }
            int i11 = 0;
            if (habiticaDrawerItem.getPillText() != null) {
                TextView textView4 = this.pillView;
                if (textView4 != null) {
                    textView4.setVisibility(0);
                    textView4.setText(habiticaDrawerItem.getPillText());
                    int paddingLeft = textView4.getPaddingLeft();
                    int paddingTop = textView4.getPaddingTop();
                    int paddingRight = textView4.getPaddingRight();
                    int paddingBottom = textView4.getPaddingBottom();
                    Drawable pillBackground = habiticaDrawerItem.getPillBackground();
                    if (pillBackground == null) {
                        pillBackground = androidx.core.content.a.e(this.itemView.getContext(), R.drawable.pill_bg_purple_200);
                    }
                    textView4.setBackground(pillBackground);
                    textView4.setTextColor(androidx.core.content.a.c(this.itemView.getContext(), R.color.white));
                    textView4.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                }
            } else {
                TextView textView5 = this.pillView;
                if (textView5 != null) {
                    textView5.setVisibility(8);
                }
            }
            if (habiticaDrawerItem.getSubtitle() != null) {
                TextView textView6 = this.additionalInfoView;
                if (textView6 != null) {
                    textView6.setText(habiticaDrawerItem.getSubtitle());
                    textView6.setVisibility(0);
                    Integer subtitleTextColor = habiticaDrawerItem.getSubtitleTextColor();
                    if (subtitleTextColor != null) {
                        i10 = subtitleTextColor.intValue();
                    } else {
                        i10 = this.tintColor;
                    }
                    textView6.setTextColor(i10);
                }
            } else {
                TextView textView7 = this.additionalInfoView;
                if (textView7 != null) {
                    textView7.setVisibility(8);
                }
            }
            View view3 = this.bubbleView;
            if (view3 != null) {
                if (!habiticaDrawerItem.getShowBubble()) {
                    i11 = 8;
                }
                view3.setVisibility(i11);
            }
        }

        public final int getTintColor() {
            return this.tintColor;
        }

        public final void setTintColor(int i10) {
            this.tintColor = i10;
        }
    }

    /* compiled from: NavigationDrawerAdapter.kt */
    /* loaded from: classes4.dex */
    public static final class SectionHeaderViewHolder extends RecyclerView.f0 {
        public static final int $stable = 8;
        private int backgroundTintColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SectionHeaderViewHolder(View view) {
            super(view);
            q.i(view, "itemView");
        }

        public final void bind(HabiticaDrawerItem habiticaDrawerItem) {
            TextView textView;
            q.i(habiticaDrawerItem, "drawerItem");
            View view = this.itemView;
            if (view instanceof TextView) {
                textView = (TextView) view;
            } else {
                textView = null;
            }
            if (textView != null) {
                textView.setText(habiticaDrawerItem.getText());
            }
            this.itemView.setBackgroundColor(this.backgroundTintColor);
        }

        public final int getBackgroundTintColor() {
            return this.backgroundTintColor;
        }

        public final void setBackgroundTintColor(int i10) {
            this.backgroundTintColor = i10;
        }
    }

    public NavigationDrawerAdapter(int i10, int i11) {
        this.tintColor = i10;
        this.backgroundTintColor = i11;
    }

    private final HabiticaDrawerItem getItem(int i10) {
        List<HabiticaDrawerItem> list = this.items;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((HabiticaDrawerItem) obj).isVisible()) {
                arrayList.add(obj);
            }
        }
        return (HabiticaDrawerItem) arrayList.get(i10);
    }

    private final int getItemPosition(String str) {
        Iterator<HabiticaDrawerItem> it = this.items.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (!q.d(it.next().getIdentifier(), str)) {
                i10++;
            } else {
                return i10;
            }
        }
        return -1;
    }

    private final int getVisibleItemPosition(String str) {
        List<HabiticaDrawerItem> list = this.items;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((HabiticaDrawerItem) obj).isVisible()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (!q.d(((HabiticaDrawerItem) it.next()).getIdentifier(), str)) {
                i10++;
            } else {
                return i10;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$4(NavigationDrawerAdapter navigationDrawerAdapter, HabiticaDrawerItem habiticaDrawerItem, View view) {
        q.i(navigationDrawerAdapter, "this$0");
        q.i(habiticaDrawerItem, "$drawerItem");
        l<? super HabiticaDrawerItem, w> lVar = navigationDrawerAdapter.itemSelectedEvents;
        if (lVar != null) {
            lVar.invoke(habiticaDrawerItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$6$lambda$5(NavigationDrawerAdapter navigationDrawerAdapter, HabiticaPromotion habiticaPromotion, View view) {
        q.i(navigationDrawerAdapter, "this$0");
        q.i(habiticaPromotion, "$promo");
        l<? super String, w> lVar = navigationDrawerAdapter.promoClosedSubject;
        if (lVar != null) {
            lVar.invoke(habiticaPromotion.getIdentifier());
        }
    }

    public final HabiticaPromotion getActivePromo() {
        return this.activePromo;
    }

    public final int getBackgroundTintColor() {
        return this.backgroundTintColor;
    }

    public final WorldStateEvent getCurrentEvent() {
        return this.currentEvent;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        List<HabiticaDrawerItem> list = this.items;
        int i10 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((HabiticaDrawerItem) it.next()).isVisible() && (i10 = i10 + 1) < 0) {
                    t.q();
                }
            }
        }
        return i10;
    }

    public final l<HabiticaDrawerItem, w> getItemSelectedEvents() {
        return this.itemSelectedEvents;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        if (getItem(i10).isHeader()) {
            return 1;
        }
        Integer itemViewType = getItem(i10).getItemViewType();
        if (itemViewType != null) {
            return itemViewType.intValue();
        }
        return 0;
    }

    public final HabiticaDrawerItem getItemWithIdentifier(String str) {
        Object obj;
        q.i(str, "identifier");
        Iterator<T> it = this.items.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (q.d(((HabiticaDrawerItem) obj).getIdentifier(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (HabiticaDrawerItem) obj;
    }

    public final List<HabiticaDrawerItem> getItems$Habitica_2311256681_prodRelease() {
        return this.items;
    }

    public final l<String, w> getPromoClosedSubject() {
        return this.promoClosedSubject;
    }

    public final Integer getSelectedItem() {
        return this.selectedItem;
    }

    public final int getTintColor() {
        return this.tintColor;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.f0 f0Var, int i10) {
        WorldStateEvent worldStateEvent;
        Date end;
        PromoMenuViewHolder promoMenuViewHolder;
        PromoMenuView promoView;
        PromoMenuBinding binding;
        ImageButton imageButton;
        SectionHeaderViewHolder sectionHeaderViewHolder;
        View view;
        q.i(f0Var, "holder");
        final HabiticaDrawerItem item = getItem(i10);
        boolean z10 = true;
        ComposeView composeView = null;
        DrawerItemViewHolder drawerItemViewHolder = null;
        SectionHeaderViewHolder sectionHeaderViewHolder2 = null;
        PromoMenuViewHolder promoMenuViewHolder2 = null;
        if (getItemViewType(i10) == 0) {
            if (f0Var instanceof DrawerItemViewHolder) {
                drawerItemViewHolder = (DrawerItemViewHolder) f0Var;
            }
            if (drawerItemViewHolder != null) {
                drawerItemViewHolder.setTintColor(this.tintColor);
            }
            if (drawerItemViewHolder != null) {
                int transitionId = item.getTransitionId();
                Integer num = this.selectedItem;
                if (num == null || transitionId != num.intValue()) {
                    z10 = false;
                }
                drawerItemViewHolder.bind(item, z10);
            }
            if (drawerItemViewHolder != null && (view = drawerItemViewHolder.itemView) != null) {
                view.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.adapter.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        NavigationDrawerAdapter.onBindViewHolder$lambda$4(NavigationDrawerAdapter.this, item, view2);
                    }
                });
            }
        } else if (getItemViewType(i10) == 1) {
            boolean z11 = f0Var instanceof SectionHeaderViewHolder;
            if (z11) {
                sectionHeaderViewHolder = (SectionHeaderViewHolder) f0Var;
            } else {
                sectionHeaderViewHolder = null;
            }
            if (sectionHeaderViewHolder != null) {
                sectionHeaderViewHolder.setBackgroundTintColor(this.backgroundTintColor);
            }
            if (z11) {
                sectionHeaderViewHolder2 = (SectionHeaderViewHolder) f0Var;
            }
            if (sectionHeaderViewHolder2 != null) {
                sectionHeaderViewHolder2.bind(item);
            }
        } else if (getItemViewType(i10) == 5) {
            final HabiticaPromotion habiticaPromotion = this.activePromo;
            if (habiticaPromotion != null) {
                boolean z12 = f0Var instanceof PromoMenuViewHolder;
                if (z12) {
                    promoMenuViewHolder = (PromoMenuViewHolder) f0Var;
                } else {
                    promoMenuViewHolder = null;
                }
                if (promoMenuViewHolder != null) {
                    promoMenuViewHolder.bind(habiticaPromotion);
                }
                if (z12) {
                    promoMenuViewHolder2 = (PromoMenuViewHolder) f0Var;
                }
                if (promoMenuViewHolder2 != null && (promoView = promoMenuViewHolder2.getPromoView()) != null && (binding = promoView.getBinding()) != null && (imageButton = binding.closeButton) != null) {
                    imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.adapter.b
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            NavigationDrawerAdapter.onBindViewHolder$lambda$6$lambda$5(NavigationDrawerAdapter.this, habiticaPromotion, view2);
                        }
                    });
                }
            }
        } else if (getItemViewType(i10) == 6 && (worldStateEvent = this.currentEvent) != null && (end = worldStateEvent.getEnd()) != null) {
            View view2 = f0Var.itemView;
            if (view2 instanceof ComposeView) {
                composeView = (ComposeView) view2;
            }
            if (composeView != null) {
                composeView.setContent(c.c(-1685347253, true, new NavigationDrawerAdapter$onBindViewHolder$3$1(end)));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        RecyclerView.f0 subscriptionBuyGemsPromoViewHolder;
        q.i(viewGroup, "parent");
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 5) {
                    if (i10 != 6) {
                        return new DrawerItemViewHolder(ViewGroupExt.inflate$default(viewGroup, R.layout.drawer_main_item, false, 2, null));
                    }
                    Context context = viewGroup.getContext();
                    q.h(context, "getContext(...)");
                    return new ComposableViewHolder(new ComposeView(context, null, 0, 6, null));
                }
                Context context2 = viewGroup.getContext();
                q.h(context2, "getContext(...)");
                PromoMenuView promoMenuView = new PromoMenuView(context2, null, 0, 6, null);
                promoMenuView.setLayoutParams(new ViewGroup.LayoutParams(-1, IntExtensionsKt.dpToPx(148, viewGroup.getContext())));
                subscriptionBuyGemsPromoViewHolder = new PromoMenuViewHolder(promoMenuView);
            } else {
                Context context3 = viewGroup.getContext();
                q.h(context3, "getContext(...)");
                SubscriptionBuyGemsPromoView subscriptionBuyGemsPromoView = new SubscriptionBuyGemsPromoView(context3, null, 0, 6, null);
                subscriptionBuyGemsPromoView.setLayoutParams(new ViewGroup.LayoutParams(-1, IntExtensionsKt.dpToPx(148, viewGroup.getContext())));
                subscriptionBuyGemsPromoViewHolder = new SubscriptionBuyGemsPromoViewHolder(subscriptionBuyGemsPromoView);
            }
            return subscriptionBuyGemsPromoViewHolder;
        }
        return new SectionHeaderViewHolder(ViewGroupExt.inflate$default(viewGroup, R.layout.drawer_main_section_header, false, 2, null));
    }

    public final void setActivePromo(HabiticaPromotion habiticaPromotion) {
        this.activePromo = habiticaPromotion;
    }

    public final void setBackgroundTintColor(int i10) {
        int visibleItemPosition;
        this.backgroundTintColor = i10;
        for (HabiticaDrawerItem habiticaDrawerItem : this.items) {
            if (habiticaDrawerItem.isHeader() && (visibleItemPosition = getVisibleItemPosition(habiticaDrawerItem.getIdentifier())) >= 0) {
                notifyItemChanged(visibleItemPosition);
            }
        }
    }

    public final void setCurrentEvent(WorldStateEvent worldStateEvent) {
        this.currentEvent = worldStateEvent;
    }

    public final void setItemSelectedEvents(l<? super HabiticaDrawerItem, w> lVar) {
        this.itemSelectedEvents = lVar;
    }

    public final void setPromoClosedSubject(l<? super String, w> lVar) {
        this.promoClosedSubject = lVar;
    }

    public final void setSelectedItem(Integer num) {
        this.selectedItem = num;
        notifyDataSetChanged();
    }

    public final void setTintColor(int i10) {
        this.tintColor = i10;
        notifyDataSetChanged();
    }

    public final void updateItem(HabiticaDrawerItem habiticaDrawerItem) {
        q.i(habiticaDrawerItem, "item");
        this.items.set(getItemPosition(habiticaDrawerItem.getIdentifier()), habiticaDrawerItem);
        notifyDataSetChanged();
    }

    public final void updateItems(List<HabiticaDrawerItem> list) {
        q.i(list, "newItems");
        this.items.clear();
        this.items.addAll(list);
        notifyDataSetChanged();
    }
}
