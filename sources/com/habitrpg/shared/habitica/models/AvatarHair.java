package com.habitrpg.shared.habitica.models;

/* compiled from: AvatarHair.kt */
/* loaded from: classes4.dex */
public interface AvatarHair {

    /* compiled from: AvatarHair.kt */
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static boolean isAvailable(AvatarHair avatarHair, int i10) {
            if (i10 > 0) {
                return true;
            }
            return false;
        }
    }

    int getBangs();

    int getBase();

    int getBeard();

    String getColor();

    int getFlower();

    int getMustache();

    boolean isAvailable(int i10);

    void setBangs(int i10);

    void setBase(int i10);

    void setBeard(int i10);

    void setColor(String str);

    void setFlower(int i10);

    void setMustache(int i10);
}
