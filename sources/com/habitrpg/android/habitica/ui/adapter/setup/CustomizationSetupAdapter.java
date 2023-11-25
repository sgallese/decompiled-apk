package com.habitrpg.android.habitica.ui.adapter.setup;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.a;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.SetupCustomizationItemBinding;
import com.habitrpg.android.habitica.extensions.DrawableExtendsionsKt;
import com.habitrpg.android.habitica.extensions.ViewGroupExt;
import com.habitrpg.android.habitica.models.SetupCustomization;
import com.habitrpg.android.habitica.models.user.Gear;
import com.habitrpg.android.habitica.models.user.Hair;
import com.habitrpg.android.habitica.models.user.Items;
import com.habitrpg.android.habitica.models.user.Outfit;
import com.habitrpg.android.habitica.models.user.Preferences;
import com.habitrpg.android.habitica.models.user.User;
import dc.w;
import ec.t;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pc.l;
import qc.q;

/* compiled from: CustomizationSetupAdapter.kt */
/* loaded from: classes4.dex */
public final class CustomizationSetupAdapter extends RecyclerView.h<CustomizationViewHolder> {
    private List<SetupCustomization> customizationList;
    private l<? super String, w> onEquipGear;
    private l<? super Map<String, ? extends Object>, w> onUpdateUser;
    private User user;
    private String userSize;

    /* compiled from: CustomizationSetupAdapter.kt */
    /* loaded from: classes4.dex */
    public final class CustomizationViewHolder extends RecyclerView.f0 implements View.OnClickListener {
        private final SetupCustomizationItemBinding binding;
        private SetupCustomization customization;
        final /* synthetic */ CustomizationSetupAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomizationViewHolder(CustomizationSetupAdapter customizationSetupAdapter, View view) {
            super(view);
            q.i(view, "itemView");
            this.this$0 = customizationSetupAdapter;
            SetupCustomizationItemBinding bind = SetupCustomizationItemBinding.bind(view);
            q.h(bind, "bind(...)");
            this.binding = bind;
            view.setOnClickListener(this);
        }

        public final void bind(SetupCustomization setupCustomization) {
            q.i(setupCustomization, "customization");
            this.customization = setupCustomization;
            int i10 = 0;
            if (setupCustomization.getDrawableId() != null) {
                ImageView imageView = this.binding.imageView;
                Integer drawableId = setupCustomization.getDrawableId();
                if (drawableId != null) {
                    i10 = drawableId.intValue();
                }
                imageView.setImageResource(i10);
            } else if (setupCustomization.getColorId() != null) {
                Drawable e10 = a.e(this.itemView.getContext(), R.drawable.setup_customization_circle);
                if (e10 != null) {
                    Context context = this.itemView.getContext();
                    Integer colorId = setupCustomization.getColorId();
                    if (colorId != null) {
                        i10 = colorId.intValue();
                    }
                    DrawableExtendsionsKt.setTintWith(e10, a.c(context, i10), PorterDuff.Mode.MULTIPLY);
                }
                this.binding.imageView.setImageDrawable(e10);
            } else {
                this.binding.imageView.setImageDrawable(null);
            }
            this.binding.textView.setText(setupCustomization.getText());
            if (!q.d("0", setupCustomization.getKey()) && q.d("flower", setupCustomization.getSubcategory())) {
                if (this.this$0.isCustomizationActive(setupCustomization)) {
                    this.binding.imageView.setBackgroundResource(R.drawable.setup_customization_flower_bg_selected);
                } else {
                    this.binding.imageView.setBackgroundResource(R.drawable.setup_customization_flower_bg);
                }
            } else if (this.this$0.isCustomizationActive(setupCustomization)) {
                this.binding.imageView.setBackgroundResource(R.drawable.setup_customization_bg_selected);
                this.binding.textView.setTextColor(a.c(this.itemView.getContext(), R.color.white));
            } else {
                this.binding.imageView.setBackgroundResource(R.drawable.setup_customization_bg);
                this.binding.textView.setTextColor(a.c(this.itemView.getContext(), R.color.white_50_alpha));
            }
        }

        public final SetupCustomization getCustomization() {
            return this.customization;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z10;
            String key;
            l<String, w> onEquipGear;
            Items items;
            Gear gear;
            Outfit equipped;
            q.i(view, "v");
            SetupCustomization setupCustomization = this.customization;
            if (setupCustomization != null) {
                CustomizationSetupAdapter customizationSetupAdapter = this.this$0;
                if (q.d(setupCustomization.getPath(), "glasses")) {
                    if (setupCustomization.getKey().length() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        User user = customizationSetupAdapter.getUser();
                        if (user != null && (items = user.getItems()) != null && (gear = items.getGear()) != null && (equipped = gear.getEquipped()) != null) {
                            key = equipped.getEyeWear();
                        } else {
                            key = null;
                        }
                    } else {
                        key = setupCustomization.getKey();
                    }
                    if (key != null && (onEquipGear = customizationSetupAdapter.getOnEquipGear()) != null) {
                        onEquipGear.invoke(key);
                        return;
                    }
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("preferences." + setupCustomization.getPath(), setupCustomization.getKey());
                l<Map<String, ? extends Object>, w> onUpdateUser = customizationSetupAdapter.getOnUpdateUser();
                if (onUpdateUser != null) {
                    onUpdateUser.invoke(hashMap);
                }
            }
        }

        public final void setCustomization(SetupCustomization setupCustomization) {
            this.customization = setupCustomization;
        }
    }

    public CustomizationSetupAdapter() {
        List<SetupCustomization> i10;
        i10 = t.i();
        this.customizationList = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCustomizationActive(SetupCustomization setupCustomization) {
        Preferences preferences;
        Hair hair;
        String str;
        boolean z10;
        Items items;
        Gear gear;
        Outfit equipped;
        Items items2;
        Gear gear2;
        Outfit equipped2;
        Hair hair2;
        Hair hair3;
        Hair hair4;
        User user = this.user;
        if (user == null || (preferences = user.getPreferences()) == null) {
            return false;
        }
        String category = setupCustomization.getCategory();
        String str2 = null;
        switch (category.hashCode()) {
            case -1289032093:
                if (!category.equals("extras")) {
                    return false;
                }
                String subcategory = setupCustomization.getSubcategory();
                int hashCode = subcategory.hashCode();
                if (hashCode != -1271629221) {
                    if (hashCode != 108668202) {
                        if (hashCode != 1653341258 || !subcategory.equals("wheelchair")) {
                            return false;
                        }
                        if (!q.d("chair_" + setupCustomization.getKey(), preferences.getChair()) && !q.d(setupCustomization.getKey(), preferences.getChair()) && (!q.d(setupCustomization.getKey(), DevicePublicKeyStringDef.NONE) || preferences.getChair() != null)) {
                            return false;
                        }
                    } else if (!subcategory.equals("glasses")) {
                        return false;
                    } else {
                        String key = setupCustomization.getKey();
                        User user2 = this.user;
                        if (user2 != null && (items2 = user2.getItems()) != null && (gear2 = items2.getGear()) != null && (equipped2 = gear2.getEquipped()) != null) {
                            str = equipped2.getEyeWear();
                        } else {
                            str = null;
                        }
                        if (!q.d(key, str)) {
                            User user3 = this.user;
                            if (user3 != null && (items = user3.getItems()) != null && (gear = items.getGear()) != null && (equipped = gear.getEquipped()) != null) {
                                str2 = equipped.getEyeWear();
                            }
                            if (!q.d("eyewear_base_0", str2)) {
                                return false;
                            }
                            if (setupCustomization.getKey().length() == 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z10) {
                                return false;
                            }
                        }
                    }
                } else if (!subcategory.equals("flower") || (hair = preferences.getHair()) == null || Integer.parseInt(setupCustomization.getKey()) != hair.getFlower()) {
                    return false;
                }
                break;
            case 3029410:
                if (!category.equals("body")) {
                    return false;
                }
                String subcategory2 = setupCustomization.getSubcategory();
                if (q.d(subcategory2, "size")) {
                    return q.d(setupCustomization.getKey(), preferences.getSize());
                }
                if (!q.d(subcategory2, "shirt")) {
                    return false;
                }
                return q.d(setupCustomization.getKey(), preferences.getShirt());
            case 3194850:
                if (!category.equals("hair")) {
                    return false;
                }
                String subcategory3 = setupCustomization.getSubcategory();
                switch (subcategory3.hashCode()) {
                    case -1271629221:
                        if (!subcategory3.equals("flower") || (hair2 = preferences.getHair()) == null || Integer.parseInt(setupCustomization.getKey()) != hair2.getFlower()) {
                            return false;
                        }
                        break;
                    case 93503803:
                        if (!subcategory3.equals("bangs") || (hair3 = preferences.getHair()) == null || Integer.parseInt(setupCustomization.getKey()) != hair3.getBangs()) {
                            return false;
                        }
                        break;
                    case 94842723:
                        if (!subcategory3.equals("color")) {
                            return false;
                        }
                        String key2 = setupCustomization.getKey();
                        Hair hair5 = preferences.getHair();
                        if (hair5 != null) {
                            str2 = hair5.getColor();
                        }
                        return q.d(key2, str2);
                    case 619427674:
                        if (!subcategory3.equals("ponytail") || (hair4 = preferences.getHair()) == null || Integer.parseInt(setupCustomization.getKey()) != hair4.getBase()) {
                            return false;
                        }
                        break;
                    default:
                        return false;
                }
            case 3532157:
                if (!category.equals("skin")) {
                    return false;
                }
                return q.d(setupCustomization.getKey(), preferences.getSkin());
            default:
                return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.customizationList.size();
    }

    public final l<String, w> getOnEquipGear() {
        return this.onEquipGear;
    }

    public final l<Map<String, ? extends Object>, w> getOnUpdateUser() {
        return this.onUpdateUser;
    }

    public final User getUser() {
        return this.user;
    }

    public final String getUserSize() {
        return this.userSize;
    }

    public final void setCustomizationList(List<SetupCustomization> list) {
        q.i(list, "newCustomizationList");
        this.customizationList = list;
        notifyDataSetChanged();
    }

    public final void setOnEquipGear(l<? super String, w> lVar) {
        this.onEquipGear = lVar;
    }

    public final void setOnUpdateUser(l<? super Map<String, ? extends Object>, w> lVar) {
        this.onUpdateUser = lVar;
    }

    public final void setUser(User user) {
        this.user = user;
    }

    public final void setUserSize(String str) {
        this.userSize = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(CustomizationViewHolder customizationViewHolder, int i10) {
        q.i(customizationViewHolder, "holder");
        customizationViewHolder.bind(this.customizationList.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public CustomizationViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        q.i(viewGroup, "parent");
        return new CustomizationViewHolder(this, ViewGroupExt.inflate$default(viewGroup, R.layout.setup_customization_item, false, 2, null));
    }
}
