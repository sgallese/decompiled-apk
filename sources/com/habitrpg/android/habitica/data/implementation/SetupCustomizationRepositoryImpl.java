package com.habitrpg.android.habitica.data.implementation;

import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.SetupCustomizationRepository;
import com.habitrpg.android.habitica.models.SetupCustomization;
import com.habitrpg.android.habitica.models.user.Hair;
import com.habitrpg.android.habitica.models.user.Preferences;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import ec.t;
import java.util.List;
import qc.q;

/* compiled from: SetupCustomizationRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class SetupCustomizationRepositoryImpl implements SetupCustomizationRepository {
    public static final int $stable = 8;
    private final Context context;

    public SetupCustomizationRepositoryImpl(Context context) {
        q.i(context, "context");
        this.context = context;
    }

    private final List<SetupCustomization> getBangs(String str) {
        List<SetupCustomization> l10;
        SetupCustomization.Companion companion = SetupCustomization.Companion;
        l10 = t.l(companion.createHairBangs("0", Integer.valueOf((int) R.drawable.creator_blank_face)), companion.createHairBangs("1", Integer.valueOf(getResId("creator_hair_bangs_1_" + str))), companion.createHairBangs("2", Integer.valueOf(getResId("creator_hair_bangs_2_" + str))), companion.createHairBangs("3", Integer.valueOf(getResId("creator_hair_bangs_3_" + str))));
        return l10;
    }

    private final List<SetupCustomization> getFlowers() {
        List<SetupCustomization> l10;
        SetupCustomization.Companion companion = SetupCustomization.Companion;
        l10 = t.l(companion.createFlower("0", Integer.valueOf((int) R.drawable.creator_blank_face)), companion.createFlower("1", Integer.valueOf((int) R.drawable.creator_hair_flower_1)), companion.createFlower("2", Integer.valueOf((int) R.drawable.creator_hair_flower_2)), companion.createFlower("3", Integer.valueOf((int) R.drawable.creator_hair_flower_3)), companion.createFlower("4", Integer.valueOf((int) R.drawable.creator_hair_flower_4)), companion.createFlower("5", Integer.valueOf((int) R.drawable.creator_hair_flower_5)), companion.createFlower("6", Integer.valueOf((int) R.drawable.creator_hair_flower_6)));
        return l10;
    }

    private final List<SetupCustomization> getGlasses() {
        List<SetupCustomization> l10;
        SetupCustomization.Companion companion = SetupCustomization.Companion;
        l10 = t.l(companion.createGlasses("", Integer.valueOf((int) R.drawable.creator_blank_face)), companion.createGlasses("eyewear_special_blackTopFrame", Integer.valueOf((int) R.drawable.creator_eyewear_special_blacktopframe)), companion.createGlasses("eyewear_special_blueTopFrame", Integer.valueOf((int) R.drawable.creator_eyewear_special_bluetopframe)), companion.createGlasses("eyewear_special_greenTopFrame", Integer.valueOf((int) R.drawable.creator_eyewear_special_greentopframe)), companion.createGlasses("eyewear_special_pinkTopFrame", Integer.valueOf((int) R.drawable.creator_eyewear_special_pinktopframe)), companion.createGlasses("eyewear_special_redTopFrame", Integer.valueOf((int) R.drawable.creator_eyewear_special_redtopframe)), companion.createGlasses("eyewear_special_yellowTopFrame", Integer.valueOf((int) R.drawable.creator_eyewear_special_yellowtopframe)), companion.createGlasses("eyewear_special_whiteTopFrame", Integer.valueOf((int) R.drawable.creator_eyewear_special_whitetopframe)));
        return l10;
    }

    private final List<SetupCustomization> getHairBases(String str) {
        List<SetupCustomization> l10;
        SetupCustomization.Companion companion = SetupCustomization.Companion;
        l10 = t.l(companion.createHairPonytail("0", Integer.valueOf((int) R.drawable.creator_blank_face)), companion.createHairPonytail("1", Integer.valueOf(getResId("creator_hair_base_1_" + str))), companion.createHairPonytail("3", Integer.valueOf(getResId("creator_hair_base_3_" + str))));
        return l10;
    }

    private final List<SetupCustomization> getHairColors() {
        List<SetupCustomization> l10;
        SetupCustomization.Companion companion = SetupCustomization.Companion;
        l10 = t.l(companion.createHairColor("white", Integer.valueOf((int) R.color.hair_white)), companion.createHairColor("brown", Integer.valueOf((int) R.color.hair_brown)), companion.createHairColor("blond", Integer.valueOf((int) R.color.hair_blond)), companion.createHairColor("red", Integer.valueOf((int) R.color.hair_red)), companion.createHairColor("black", Integer.valueOf((int) R.color.hair_black)));
        return l10;
    }

    private final int getResId(String str) {
        try {
            return this.context.getResources().getIdentifier(str, "drawable", this.context.getPackageName());
        } catch (Exception unused) {
            return -1;
        }
    }

    private final List<SetupCustomization> getShirts(String str) {
        List<SetupCustomization> l10;
        List<SetupCustomization> l11;
        if (q.d(str, "broad")) {
            SetupCustomization.Companion companion = SetupCustomization.Companion;
            l11 = t.l(companion.createShirt("black", R.drawable.creator_broad_shirt_black), companion.createShirt("blue", R.drawable.creator_broad_shirt_blue), companion.createShirt("green", R.drawable.creator_broad_shirt_green), companion.createShirt("pink", R.drawable.creator_broad_shirt_pink), companion.createShirt("white", R.drawable.creator_broad_shirt_white), companion.createShirt("yellow", R.drawable.creator_broad_shirt_yellow));
            return l11;
        }
        SetupCustomization.Companion companion2 = SetupCustomization.Companion;
        l10 = t.l(companion2.createShirt("black", R.drawable.creator_slim_shirt_black), companion2.createShirt("blue", R.drawable.creator_slim_shirt_blue), companion2.createShirt("green", R.drawable.creator_slim_shirt_green), companion2.createShirt("pink", R.drawable.creator_slim_shirt_pink), companion2.createShirt("white", R.drawable.creator_slim_shirt_white), companion2.createShirt("yellow", R.drawable.creator_slim_shirt_yellow));
        return l10;
    }

    private final List<SetupCustomization> getSizes() {
        List<SetupCustomization> l10;
        SetupCustomization.Companion companion = SetupCustomization.Companion;
        String string = this.context.getString(R.string.avatar_size_slim);
        q.h(string, "getString(...)");
        String string2 = this.context.getString(R.string.avatar_size_broad);
        q.h(string2, "getString(...)");
        l10 = t.l(companion.createSize("slim", R.drawable.creator_slim_shirt_black, string), companion.createSize("broad", R.drawable.creator_broad_shirt_black, string2));
        return l10;
    }

    private final List<SetupCustomization> getSkins() {
        List<SetupCustomization> l10;
        SetupCustomization.Companion companion = SetupCustomization.Companion;
        l10 = t.l(companion.createSkin("ddc994", Integer.valueOf((int) R.color.skin_ddc994)), companion.createSkin("f5a76e", Integer.valueOf((int) R.color.skin_f5a76e)), companion.createSkin("ea8349", Integer.valueOf((int) R.color.skin_ea8349)), companion.createSkin("c06534", Integer.valueOf((int) R.color.skin_c06534)), companion.createSkin("98461a", Integer.valueOf((int) R.color.skin_98461a)), companion.createSkin("915533", Integer.valueOf((int) R.color.skin_915533)), companion.createSkin("c3e1dc", Integer.valueOf((int) R.color.skin_c3e1dc)), companion.createSkin("6bd049", Integer.valueOf((int) R.color.skin_6bd049)));
        return l10;
    }

    private final List<SetupCustomization> getWheelchairs() {
        List<SetupCustomization> l10;
        SetupCustomization.Companion companion = SetupCustomization.Companion;
        l10 = t.l(companion.createWheelchair(DevicePublicKeyStringDef.NONE, 0), companion.createWheelchair("black", Integer.valueOf((int) R.drawable.creator_chair_black)), companion.createWheelchair("blue", Integer.valueOf((int) R.drawable.creator_chair_blue)), companion.createWheelchair("green", Integer.valueOf((int) R.drawable.creator_chair_green)), companion.createWheelchair("pink", Integer.valueOf((int) R.drawable.creator_chair_pink)), companion.createWheelchair("red", Integer.valueOf((int) R.drawable.creator_chair_red)), companion.createWheelchair("yellow", Integer.valueOf((int) R.drawable.creator_chair_yellow)));
        return l10;
    }

    @Override // com.habitrpg.android.habitica.data.SetupCustomizationRepository
    public List<SetupCustomization> getCustomizations(String str, User user) {
        q.i(str, TaskFormActivity.TASK_TYPE_KEY);
        q.i(user, "user");
        return getCustomizations(str, null, user);
    }

    @Override // com.habitrpg.android.habitica.data.SetupCustomizationRepository
    public List<SetupCustomization> getCustomizations(String str, String str2, User user) {
        List<SetupCustomization> i10;
        List<SetupCustomization> i11;
        List<SetupCustomization> i12;
        String str3;
        List<SetupCustomization> i13;
        Hair hair;
        String color;
        Hair hair2;
        String color2;
        q.i(str, TaskFormActivity.TASK_TYPE_KEY);
        q.i(user, "user");
        switch (str.hashCode()) {
            case -1289032093:
                if (str.equals("extras")) {
                    if (str2 != null) {
                        int hashCode = str2.hashCode();
                        if (hashCode != -1271629221) {
                            if (hashCode != 108668202) {
                                if (hashCode == 1653341258 && str2.equals("wheelchair")) {
                                    return getWheelchairs();
                                }
                            } else if (str2.equals("glasses")) {
                                return getGlasses();
                            }
                        } else if (str2.equals("flower")) {
                            return getFlowers();
                        }
                    }
                    i11 = t.i();
                    return i11;
                }
                break;
            case 3029410:
                if (str.equals("body")) {
                    if (q.d(str2, "size")) {
                        return getSizes();
                    }
                    if (!q.d(str2, "shirt")) {
                        i12 = t.i();
                        return i12;
                    }
                    Preferences preferences = user.getPreferences();
                    if (preferences == null || (str3 = preferences.getSize()) == null) {
                        str3 = "slim";
                    }
                    return getShirts(str3);
                }
                break;
            case 3194850:
                if (str.equals("hair")) {
                    if (str2 != null) {
                        int hashCode2 = str2.hashCode();
                        String str4 = "";
                        if (hashCode2 != 93503803) {
                            if (hashCode2 != 94842723) {
                                if (hashCode2 == 619427674 && str2.equals("ponytail")) {
                                    Preferences preferences2 = user.getPreferences();
                                    if (preferences2 != null && (hair2 = preferences2.getHair()) != null && (color2 = hair2.getColor()) != null) {
                                        str4 = color2;
                                    }
                                    return getHairBases(str4);
                                }
                            } else if (str2.equals("color")) {
                                return getHairColors();
                            }
                        } else if (str2.equals("bangs")) {
                            Preferences preferences3 = user.getPreferences();
                            if (preferences3 != null && (hair = preferences3.getHair()) != null && (color = hair.getColor()) != null) {
                                str4 = color;
                            }
                            return getBangs(str4);
                        }
                    }
                    i13 = t.i();
                    return i13;
                }
                break;
            case 3532157:
                if (str.equals("skin")) {
                    return getSkins();
                }
                break;
        }
        i10 = t.i();
        return i10;
    }
}
