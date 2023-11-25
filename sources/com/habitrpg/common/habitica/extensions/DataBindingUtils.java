package com.habitrpg.common.habitica.extensions;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.LinearLayout;
import androidx.core.content.res.h;
import b5.h;
import com.habitrpg.android.habitica.extensions.DrawableExtendsionsKt;
import com.habitrpg.common.habitica.R;
import com.habitrpg.common.habitica.helpers.AppConfigManager;
import d5.b;
import dc.w;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import pc.l;
import qc.q;
import yc.v;

/* compiled from: DataBindingUtils.kt */
/* loaded from: classes4.dex */
public final class DataBindingUtils {
    public static final String BASE_IMAGE_URL = "https://habitica-assets.s3.amazonaws.com/mobileApp/images/";
    private static final Map<String, String> FILEFORMAT_MAP;
    private static final Map<String, String> FILENAME_MAP;
    private static AppConfigManager configManager;
    private static Date lastSubstitutionCheck;
    public static final DataBindingUtils INSTANCE = new DataBindingUtils();
    private static Map<String, String> spriteSubstitutions = new HashMap();

    /* compiled from: DataBindingUtils.kt */
    /* loaded from: classes4.dex */
    public static final class LayoutWeightAnimation extends Animation {
        private float initializeWeight;
        private LinearLayout.LayoutParams layoutParams;
        private float targetWeight;
        private View view;

        public LayoutWeightAnimation(View view, float f10) {
            q.i(view, "view");
            this.view = view;
            this.targetWeight = f10;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            q.g(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            this.layoutParams = layoutParams2;
            this.initializeWeight = layoutParams2.weight;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float f10, Transformation transformation) {
            q.i(transformation, "t");
            LinearLayout.LayoutParams layoutParams = this.layoutParams;
            float f11 = this.initializeWeight;
            layoutParams.weight = f11 + ((this.targetWeight - f11) * f10);
            this.view.requestLayout();
        }

        public final float getTargetWeight$common_prodRelease() {
            return this.targetWeight;
        }

        public final View getView$common_prodRelease() {
            return this.view;
        }

        public final void setTargetWeight$common_prodRelease(float f10) {
            this.targetWeight = f10;
        }

        public final void setView$common_prodRelease(View view) {
            q.i(view, "<set-?>");
            this.view = view;
        }

        @Override // android.view.animation.Animation
        public boolean willChangeBounds() {
            return true;
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("head_special_1", "gif");
        linkedHashMap.put("broad_armor_special_1", "gif");
        linkedHashMap.put("slim_armor_special_1", "gif");
        linkedHashMap.put("head_special_0", "gif");
        linkedHashMap.put("slim_armor_special_0", "gif");
        linkedHashMap.put("broad_armor_special_0", "gif");
        linkedHashMap.put("weapon_special_critical", "gif");
        linkedHashMap.put("weapon_special_0", "gif");
        linkedHashMap.put("shield_special_0", "gif");
        linkedHashMap.put("Pet-Wolf-Cerberus", "gif");
        linkedHashMap.put("stable_Pet-Wolf-Cerberus", "gif");
        linkedHashMap.put("armor_special_ks2019", "gif");
        linkedHashMap.put("slim_armor_special_ks2019", "gif");
        linkedHashMap.put("broad_armor_special_ks2019", "gif");
        linkedHashMap.put("eyewear_special_ks2019", "gif");
        linkedHashMap.put("head_special_ks2019", "gif");
        linkedHashMap.put("shield_special_ks2019", "gif");
        linkedHashMap.put("weapon_special_ks2019", "gif");
        linkedHashMap.put("Pet-Gryphon-Gryphatrice", "gif");
        linkedHashMap.put("stable_Pet-Gryphon-Gryphatrice", "gif");
        linkedHashMap.put("Mount_Head_Gryphon-Gryphatrice", "gif");
        linkedHashMap.put("Mount_Body_Gryphon-Gryphatrice", "gif");
        linkedHashMap.put("background_clocktower", "gif");
        linkedHashMap.put("background_airship", "gif");
        linkedHashMap.put("background_steamworks", "gif");
        linkedHashMap.put("Pet_HatchingPotion_Veggie", "gif");
        linkedHashMap.put("Pet_HatchingPotion_Dessert", "gif");
        linkedHashMap.put("Pet-HatchingPotion-Dessert", "gif");
        linkedHashMap.put("quest_windup", "gif");
        linkedHashMap.put("Pet-HatchingPotion_Windup", "gif");
        linkedHashMap.put("Pet_HatchingPotion_Windup", "gif");
        linkedHashMap.put("quest_solarSystem", "gif");
        linkedHashMap.put("quest_virtualpet", "gif");
        linkedHashMap.put("Pet_HatchingPotion_VirtualPet", "gif");
        linkedHashMap.put("Pet-Gryphatrice-Jubilant", "gif");
        linkedHashMap.put("stable_Pet-Gryphatrice-Jubilant", "gif");
        linkedHashMap.put("back_special_heroicAureole", "gif");
        FILEFORMAT_MAP = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("head_special_1", "ContributorOnly-Equip-CrystalHelmet");
        linkedHashMap2.put("armor_special_1", "ContributorOnly-Equip-CrystalArmor");
        linkedHashMap2.put("head_special_0", "BackerOnly-Equip-ShadeHelmet");
        linkedHashMap2.put("armor_special_0", "BackerOnly-Equip-ShadeArmor");
        linkedHashMap2.put("shield_special_0", "BackerOnly-Shield-TormentedSkull");
        linkedHashMap2.put("weapon_special_0", "BackerOnly-Weapon-DarkSoulsBlade");
        linkedHashMap2.put("weapon_special_critical", "weapon_special_critical");
        linkedHashMap2.put("Pet-Wolf-Cerberus", "BackerOnly-Pet-CerberusPup");
        FILENAME_MAP = linkedHashMap2;
    }

    private DataBindingUtils() {
    }

    public static /* synthetic */ String getFullFilename$default(DataBindingUtils dataBindingUtils, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return dataBindingUtils.getFullFilename(str, str2);
    }

    private final Map<String, String> getSpriteSubstitutions() {
        long j10;
        Map<String, Map<String, String>> map;
        Map<String, String> map2;
        long time = new Date().getTime();
        Date date = lastSubstitutionCheck;
        if (date != null) {
            j10 = date.getTime();
        } else {
            j10 = 0;
        }
        if (time - j10 > 180000) {
            AppConfigManager appConfigManager = configManager;
            Map<String, String> map3 = null;
            if (appConfigManager != null) {
                map = appConfigManager.spriteSubstitutions();
            } else {
                map = null;
            }
            if (map == null || (map2 = map.get("generic")) == null) {
                if (map != null) {
                    map3 = map.get("pets");
                }
                if (map3 == null) {
                    map2 = new HashMap<>();
                } else {
                    map2 = map3;
                }
            }
            spriteSubstitutions = map2;
            lastSubstitutionCheck = new Date();
        }
        return spriteSubstitutions;
    }

    public static /* synthetic */ void loadImage$default(DataBindingUtils dataBindingUtils, Context context, String str, String str2, l lVar, pc.a aVar, int i10, Object obj) {
        DataBindingUtils$loadImage$1 dataBindingUtils$loadImage$1 = aVar;
        if ((i10 & 16) != 0) {
            dataBindingUtils$loadImage$1 = DataBindingUtils$loadImage$1.INSTANCE;
        }
        dataBindingUtils.loadImage(context, str, str2, lVar, dataBindingUtils$loadImage$1);
    }

    public final boolean existsAsImage(String str) {
        if (str == null || q.d(str, "shop_")) {
            return false;
        }
        return true;
    }

    public final AppConfigManager getConfigManager() {
        return configManager;
    }

    public final String getFullFilename(String str, String str2) {
        boolean F;
        String str3;
        String str4;
        q.i(str, "imageName");
        if (getSpriteSubstitutions().containsKey(str)) {
            str3 = getSpriteSubstitutions().get(str);
        } else {
            Map<String, String> map = FILENAME_MAP;
            if (!map.containsKey(str)) {
                F = v.F(str, "handleless", false, 2, null);
                if (F) {
                    str3 = "chair_" + str;
                } else {
                    str3 = str;
                }
            } else {
                str3 = map.get(str);
            }
        }
        if (str2 == null) {
            Map<String, String> map2 = FILEFORMAT_MAP;
            if (map2.containsKey(str)) {
                str4 = "." + ((Object) map2.get(str));
                return str3 + str4;
            }
        }
        if (str2 == null) {
            str2 = "png";
        }
        str4 = "." + str2;
        return str3 + str4;
    }

    public final void loadImage(Context context, String str, l<? super Drawable, w> lVar) {
        q.i(context, "context");
        q.i(str, "imageName");
        q.i(lVar, "imageResult");
        loadImage$default(this, context, str, null, lVar, null, 16, null);
    }

    public final void setConfigManager(AppConfigManager appConfigManager) {
        configManager = appConfigManager;
    }

    public final void setRoundedBackground(View view, int i10) {
        q.i(view, "view");
        Drawable e10 = h.e(view.getResources(), R.drawable.layout_rounded_bg, null);
        if (e10 != null) {
            DrawableExtendsionsKt.setTintWith(e10, i10, PorterDuff.Mode.MULTIPLY);
        }
        view.setBackground(e10);
    }

    public final void loadImage(Context context, String str, String str2, final l<? super Drawable, w> lVar, final pc.a<w> aVar) {
        q.i(context, "context");
        q.i(str, "imageName");
        q.i(lVar, "imageResult");
        q.i(aVar, "imageError");
        q4.a.a(context).c(new h.a(context).c(BASE_IMAGE_URL + getFullFilename(str, str2)).n(new b() { // from class: com.habitrpg.common.habitica.extensions.DataBindingUtils$loadImage$$inlined$target$1
            @Override // d5.b
            public void onError(Drawable drawable) {
                pc.a.this.invoke();
            }

            @Override // d5.b
            public void onSuccess(Drawable drawable) {
                lVar.invoke(drawable);
            }

            @Override // d5.b
            public void onStart(Drawable drawable) {
            }
        }).b());
    }
}
