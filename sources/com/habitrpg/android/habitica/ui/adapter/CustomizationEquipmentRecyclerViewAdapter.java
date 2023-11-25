package com.habitrpg.android.habitica.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.CustomizationGridItemBinding;
import com.habitrpg.android.habitica.databinding.DialogPurchaseCustomizationBinding;
import com.habitrpg.android.habitica.models.inventory.CustomizationSet;
import com.habitrpg.android.habitica.models.inventory.Equipment;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.common.habitica.extensions.DataBindingUtilsKt;
import com.habitrpg.common.habitica.views.PixelArtView;
import dc.w;
import ec.b0;
import java.util.ArrayList;
import java.util.List;
import pc.l;
import pc.p;
import qc.q;

/* compiled from: CustomizationEquipmentRecyclerViewAdapter.kt */
/* loaded from: classes4.dex */
public final class CustomizationEquipmentRecyclerViewAdapter extends RecyclerView.h<RecyclerView.f0> {
    public static final int $stable = 8;
    private String activeEquipment;
    private List<Equipment> equipmentList = new ArrayList();
    private Integer gemBalance;
    private l<? super Equipment, w> onSelect;
    private l<? super Equipment, w> onUnlock;

    /* compiled from: CustomizationEquipmentRecyclerViewAdapter.kt */
    /* loaded from: classes4.dex */
    public final class EquipmentViewHolder extends RecyclerView.f0 implements View.OnClickListener {
        private final CustomizationGridItemBinding binding;
        private Equipment equipment;
        final /* synthetic */ CustomizationEquipmentRecyclerViewAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EquipmentViewHolder(CustomizationEquipmentRecyclerViewAdapter customizationEquipmentRecyclerViewAdapter, View view) {
            super(view);
            q.i(view, "itemView");
            this.this$0 = customizationEquipmentRecyclerViewAdapter;
            CustomizationGridItemBinding bind = CustomizationGridItemBinding.bind(view);
            q.h(bind, "bind(...)");
            this.binding = bind;
            view.setOnClickListener(this);
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00d7, code lost:
        
            if ((!r10) == true) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00db, code lost:
        
            if (r1 == false) goto L44;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
        /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void bind(com.habitrpg.android.habitica.models.inventory.Equipment r10) {
            /*
                Method dump skipped, instructions count: 264
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.adapter.CustomizationEquipmentRecyclerViewAdapter.EquipmentViewHolder.bind(com.habitrpg.android.habitica.models.inventory.Equipment):void");
        }

        public final Equipment getEquipment() {
            return this.equipment;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            Double d10;
            boolean z10;
            Equipment equipment;
            l<Equipment, w> onSelect;
            double d11;
            String str2;
            q.i(view, "v");
            Equipment equipment2 = this.equipment;
            String str3 = null;
            ImageView imageView = null;
            if (equipment2 != null) {
                str = equipment2.getGearSet();
            } else {
                str = null;
            }
            if (q.d(str, "animal")) {
                d10 = Double.valueOf(2.0d);
            } else {
                Equipment equipment3 = this.equipment;
                if (equipment3 != null) {
                    d10 = Double.valueOf(equipment3.getValue());
                } else {
                    d10 = null;
                }
            }
            Equipment equipment4 = this.equipment;
            if (equipment4 != null) {
                z10 = q.d(equipment4.getOwned(), Boolean.TRUE);
            } else {
                z10 = false;
            }
            if (!z10) {
                if (d10 != null) {
                    d11 = d10.doubleValue();
                } else {
                    d11 = 0.0d;
                }
                if (d11 > 0.0d) {
                    LinearLayout linearLayout = new LinearLayout(this.itemView.getContext());
                    DialogPurchaseCustomizationBinding.inflate(LayoutInflater.from(this.itemView.getContext()), linearLayout);
                    PixelArtView pixelArtView = (PixelArtView) linearLayout.findViewById(R.id.imageView);
                    q.f(pixelArtView);
                    Equipment equipment5 = this.equipment;
                    if (equipment5 != null) {
                        str2 = equipment5.getKey();
                    } else {
                        str2 = null;
                    }
                    DataBindingUtilsKt.loadImage$default(pixelArtView, "shop_" + str2, null, 2, null);
                    TextView textView = (TextView) linearLayout.findViewById(R.id.priceLabel);
                    if (textView != null) {
                        textView.setText(String.valueOf(d10));
                    }
                    View findViewById = linearLayout.findViewById(R.id.gem_icon);
                    if (findViewById instanceof ImageView) {
                        imageView = (ImageView) findViewById;
                    }
                    if (imageView != null) {
                        imageView.setImageBitmap(HabiticaIconsHelper.imageOfGem());
                    }
                    Context context = this.itemView.getContext();
                    q.h(context, "getContext(...)");
                    HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(context);
                    HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.purchase_button, true, false, false, (p) new CustomizationEquipmentRecyclerViewAdapter$EquipmentViewHolder$onClick$1(this.this$0, this, d10), 12, (Object) null);
                    habiticaAlertDialog.setTitle(R.string.purchase_customization);
                    habiticaAlertDialog.setAdditionalContentView(linearLayout);
                    HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.reward_dialog_dismiss, false, false, false, (p) null, 28, (Object) null);
                    habiticaAlertDialog.show();
                    return;
                }
            }
            Equipment equipment6 = this.equipment;
            if (equipment6 != null) {
                str3 = equipment6.getKey();
            }
            if (!q.d(str3, this.this$0.getActiveEquipment()) && (equipment = this.equipment) != null && (onSelect = this.this$0.getOnSelect()) != null) {
                onSelect.invoke(equipment);
            }
        }

        public final void setEquipment(Equipment equipment) {
            this.equipment = equipment;
        }
    }

    public final String getActiveEquipment() {
        return this.activeEquipment;
    }

    public final List<Equipment> getEquipmentList() {
        return this.equipmentList;
    }

    public final Integer getGemBalance() {
        return this.gemBalance;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.equipmentList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        if (this.equipmentList.size() <= i10) {
            return 0;
        }
        return !q.d(this.equipmentList.get(i10).getClass(), CustomizationSet.class) ? 1 : 0;
    }

    public final l<Equipment, w> getOnSelect() {
        return this.onSelect;
    }

    public final l<Equipment, w> getOnUnlock() {
        return this.onUnlock;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.f0 f0Var, int i10) {
        q.i(f0Var, "holder");
        ((EquipmentViewHolder) f0Var).bind(this.equipmentList.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        q.i(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.customization_grid_item, viewGroup, false);
        q.f(inflate);
        return new EquipmentViewHolder(this, inflate);
    }

    public final void setActiveEquipment(String str) {
        this.activeEquipment = str;
        notifyDataSetChanged();
    }

    public final void setEquipment(List<? extends Equipment> list) {
        List<Equipment> F0;
        q.i(list, "newEquipmentList");
        F0 = b0.F0(list);
        setEquipmentList(F0);
        this.equipmentList.add(0, new Equipment());
        notifyDataSetChanged();
    }

    public final void setEquipmentList(List<Equipment> list) {
        q.i(list, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.equipmentList = list;
        notifyDataSetChanged();
    }

    public final void setGemBalance(Integer num) {
        this.gemBalance = num;
    }

    public final void setOnSelect(l<? super Equipment, w> lVar) {
        this.onSelect = lVar;
    }

    public final void setOnUnlock(l<? super Equipment, w> lVar) {
        this.onUnlock = lVar;
    }
}
