package com.habitrpg.android.habitica.ui.adapter.inventory;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.GearListItemBinding;
import com.habitrpg.android.habitica.models.inventory.Equipment;
import com.habitrpg.android.habitica.ui.adapter.BaseRecyclerViewAdapter;
import com.habitrpg.android.habitica.ui.adapter.inventory.EquipmentRecyclerViewAdapter;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import com.habitrpg.common.habitica.extensions.DataBindingUtilsKt;
import com.habitrpg.common.habitica.views.PixelArtView;
import dc.w;
import pc.l;
import qc.q;

/* compiled from: EquipmentRecyclerViewAdapter.kt */
/* loaded from: classes4.dex */
public final class EquipmentRecyclerViewAdapter extends BaseRecyclerViewAdapter<Equipment, GearViewHolder> {
    public static final int $stable = 8;
    private String equippedGear;
    private Boolean isCostume;
    private l<? super String, w> onEquip;
    private String type;

    /* compiled from: EquipmentRecyclerViewAdapter.kt */
    /* loaded from: classes4.dex */
    public final class GearViewHolder extends RecyclerView.f0 {
        private final GearListItemBinding binding;
        private Context context;
        private Equipment gear;
        final /* synthetic */ EquipmentRecyclerViewAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GearViewHolder(final EquipmentRecyclerViewAdapter equipmentRecyclerViewAdapter, View view) {
            super(view);
            q.i(view, "itemView");
            this.this$0 = equipmentRecyclerViewAdapter;
            GearListItemBinding bind = GearListItemBinding.bind(view);
            q.h(bind, "bind(...)");
            this.binding = bind;
            Context context = view.getContext();
            q.h(context, "getContext(...)");
            this.context = context;
            Context context2 = view.getContext();
            q.h(context2, "getContext(...)");
            this.context = context2;
            bind.twoHandedView.setCompoundDrawablesWithIntrinsicBounds(new BitmapDrawable(this.context.getResources(), HabiticaIconsHelper.imageOfTwoHandedIcon()), (Drawable) null, (Drawable) null, (Drawable) null);
            view.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.adapter.inventory.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    EquipmentRecyclerViewAdapter.GearViewHolder._init_$lambda$0(EquipmentRecyclerViewAdapter.GearViewHolder.this, equipmentRecyclerViewAdapter, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$0(GearViewHolder gearViewHolder, EquipmentRecyclerViewAdapter equipmentRecyclerViewAdapter, View view) {
            String str;
            q.i(gearViewHolder, "this$0");
            q.i(equipmentRecyclerViewAdapter, "this$1");
            Equipment equipment = gearViewHolder.gear;
            if (equipment != null) {
                str = equipment.getKey();
            } else {
                str = null;
            }
            if (str != null) {
                l<String, w> onEquip = equipmentRecyclerViewAdapter.getOnEquip();
                if (onEquip != null) {
                    onEquip.invoke(str);
                }
                if (q.d(str, equipmentRecyclerViewAdapter.getEquippedGear())) {
                    str = equipmentRecyclerViewAdapter.getType() + "_base_0";
                }
                equipmentRecyclerViewAdapter.setEquippedGear(str);
                equipmentRecyclerViewAdapter.notifyDataSetChanged();
            }
        }

        private final void set(TextView textView, TextView textView2, int i10) {
            if (i10 > 0) {
                textView.setVisibility(0);
                textView2.setVisibility(0);
                textView2.setText("+" + i10);
                return;
            }
            textView.setVisibility(8);
            textView2.setVisibility(8);
        }

        public final void bind(Equipment equipment) {
            String str;
            String str2;
            q.i(equipment, "gear");
            this.gear = equipment;
            TextView textView = this.binding.gearText;
            if (equipment != null) {
                str = equipment.getText();
            } else {
                str = null;
            }
            textView.setText(str);
            TextView textView2 = this.binding.gearNotes;
            Equipment equipment2 = this.gear;
            if (equipment2 != null) {
                str2 = equipment2.getNotes();
            } else {
                str2 = null;
            }
            textView2.setText(str2);
            int i10 = 0;
            if (q.d(equipment.getKey(), this.this$0.getEquippedGear())) {
                this.binding.equippedIndicator.setVisibility(0);
                this.binding.gearContainer.setBackgroundColor(androidx.core.content.a.c(this.context, R.color.lightly_tinted_background));
                this.binding.gearIconBackgroundView.setBackground(androidx.core.content.a.e(this.context, R.drawable.layout_rounded_bg_content));
            } else {
                this.binding.equippedIndicator.setVisibility(8);
                this.binding.gearContainer.setBackgroundResource(R.drawable.selection_highlight);
                this.binding.gearIconBackgroundView.setBackground(androidx.core.content.a.e(this.context, R.drawable.layout_rounded_bg_window));
            }
            TextView textView3 = this.binding.twoHandedView;
            if (!equipment.getTwoHanded()) {
                i10 = 8;
            }
            textView3.setVisibility(i10);
            PixelArtView pixelArtView = this.binding.gearImage;
            q.h(pixelArtView, "gearImage");
            DataBindingUtilsKt.loadImage$default(pixelArtView, "shop_" + equipment.getKey(), null, 2, null);
            TextView textView4 = this.binding.strLabel;
            q.h(textView4, "strLabel");
            TextView textView5 = this.binding.strValue;
            q.h(textView5, "strValue");
            set(textView4, textView5, equipment.getStr());
            TextView textView6 = this.binding.conLabel;
            q.h(textView6, "conLabel");
            TextView textView7 = this.binding.conValue;
            q.h(textView7, "conValue");
            set(textView6, textView7, equipment.getCon());
            TextView textView8 = this.binding.intLabel;
            q.h(textView8, "intLabel");
            TextView textView9 = this.binding.intValue;
            q.h(textView9, "intValue");
            set(textView8, textView9, equipment.get_int());
            TextView textView10 = this.binding.perLabel;
            q.h(textView10, "perLabel");
            TextView textView11 = this.binding.perValue;
            q.h(textView11, "perValue");
            set(textView10, textView11, equipment.getPer());
        }

        public final Context getContext() {
            return this.context;
        }

        public final Equipment getGear() {
            return this.gear;
        }

        public final void setContext(Context context) {
            q.i(context, "<set-?>");
            this.context = context;
        }

        public final void setGear(Equipment equipment) {
            this.gear = equipment;
        }
    }

    public final String getEquippedGear() {
        return this.equippedGear;
    }

    public final l<String, w> getOnEquip() {
        return this.onEquip;
    }

    public final String getType() {
        return this.type;
    }

    public final Boolean isCostume() {
        return this.isCostume;
    }

    public final void setCostume(Boolean bool) {
        this.isCostume = bool;
    }

    public final void setEquippedGear(String str) {
        this.equippedGear = str;
    }

    public final void setOnEquip(l<? super String, w> lVar) {
        this.onEquip = lVar;
    }

    public final void setType(String str) {
        this.type = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(GearViewHolder gearViewHolder, int i10) {
        q.i(gearViewHolder, "holder");
        gearViewHolder.bind(getData().get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public GearViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        q.i(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gear_list_item, viewGroup, false);
        q.f(inflate);
        return new GearViewHolder(this, inflate);
    }
}
