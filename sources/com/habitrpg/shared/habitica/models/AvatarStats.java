package com.habitrpg.shared.habitica.models;

/* compiled from: AvatarStats.kt */
/* loaded from: classes4.dex */
public interface AvatarStats {

    /* compiled from: AvatarStats.kt */
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static boolean isBuffed(AvatarStats avatarStats) {
            float f10;
            float f11;
            float f12;
            float f13;
            Float per;
            Float f14;
            Float con;
            Float str;
            AvatarBuffs buffs = avatarStats.getBuffs();
            if (buffs != null && (str = buffs.getStr()) != null) {
                f10 = str.floatValue();
            } else {
                f10 = 0.0f;
            }
            if (f10 <= 0.0f) {
                AvatarBuffs buffs2 = avatarStats.getBuffs();
                if (buffs2 != null && (con = buffs2.getCon()) != null) {
                    f11 = con.floatValue();
                } else {
                    f11 = 0.0f;
                }
                if (f11 <= 0.0f) {
                    AvatarBuffs buffs3 = avatarStats.getBuffs();
                    if (buffs3 != null && (f14 = buffs3.get_int()) != null) {
                        f12 = f14.floatValue();
                    } else {
                        f12 = 0.0f;
                    }
                    if (f12 <= 0.0f) {
                        AvatarBuffs buffs4 = avatarStats.getBuffs();
                        if (buffs4 != null && (per = buffs4.getPer()) != null) {
                            f13 = per.floatValue();
                        } else {
                            f13 = 0.0f;
                        }
                        if (f13 <= 0.0f) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }

    AvatarBuffs getBuffs();

    Double getExp();

    Double getGp();

    String getHabitClass();

    Double getHp();

    Integer getLvl();

    Integer getMaxHealth();

    Integer getMaxMP();

    Double getMp();

    Integer getPoints();

    Integer getToNextLevel();

    boolean isBuffed();

    void setExp(Double d10);

    void setGp(Double d10);

    void setHabitClass(String str);

    void setHp(Double d10);

    void setLvl(Integer num);

    void setMaxHealth(Integer num);

    void setMaxMP(Integer num);

    void setMp(Double d10);

    void setPoints(Integer num);

    void setToNextLevel(Integer num);
}
