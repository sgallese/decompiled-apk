package com.habitrpg.shared.habitica.models;

import qc.q;
import yc.m;

/* compiled from: AvatarOutfit.kt */
/* loaded from: classes4.dex */
public interface AvatarOutfit {

    /* compiled from: AvatarOutfit.kt */
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static boolean isAvailable(AvatarOutfit avatarOutfit, String str) {
            q.i(str, "outfit");
            if ((!m.u(str)) != false && !m.q(str, "base_0", false, 2, null)) {
                return true;
            }
            return false;
        }

        public static void updateWith(AvatarOutfit avatarOutfit, AvatarOutfit avatarOutfit2) {
            q.i(avatarOutfit2, "newOutfit");
            avatarOutfit.setArmor(avatarOutfit2.getArmor());
            avatarOutfit.setBack(avatarOutfit2.getBack());
            avatarOutfit.setBody(avatarOutfit2.getBody());
            avatarOutfit.setEyeWear(avatarOutfit2.getEyeWear());
            avatarOutfit.setHead(avatarOutfit2.getHead());
            avatarOutfit.setHeadAccessory(avatarOutfit2.getHeadAccessory());
            avatarOutfit.setShield(avatarOutfit2.getShield());
            avatarOutfit.setWeapon(avatarOutfit2.getWeapon());
        }
    }

    String getArmor();

    String getBack();

    String getBody();

    String getEyeWear();

    String getHead();

    String getHeadAccessory();

    String getShield();

    String getWeapon();

    boolean isAvailable(String str);

    void setArmor(String str);

    void setBack(String str);

    void setBody(String str);

    void setEyeWear(String str);

    void setHead(String str);

    void setHeadAccessory(String str);

    void setShield(String str);

    void setWeapon(String str);

    void updateWith(AvatarOutfit avatarOutfit);
}
